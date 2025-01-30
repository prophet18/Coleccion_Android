package coleccion.android

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class DataImporter : AppCompatActivity() {

    // 1) Register an Activity Result Launcher for opening documents
    private val openDocumentLauncher =
        registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
            // This callback is invoked after the user picks a file (or cancels)
            if (uri != null) {
                importCsvFromUri(uri)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Example button or menu that triggers the file picker
        // E.g., importButton.setOnClickListener { openFilePicker() }
        openFilePicker()
    }

    // 2) Launch the file picker allowing only text/csv or any text file
    private fun openFilePicker() {
        openDocumentLauncher.launch(arrayOf("text/csv", "text/plain"))
    }

    // 3) Import the CSV once we have the file URI
    private fun importCsvFromUri(uri: Uri) {
        try {
            contentResolver.openInputStream(uri)?.use { inputStream ->
                val reader = BufferedReader(InputStreamReader(inputStream))
                // Example: read line by line
                reader.forEachLine { line ->
                    // Skip empty lines or header
                    if (line.isBlank() || line.startsWith("Player Name")) {
                        return@forEachLine
                    }

                    // Split the line by commas - adjust logic if your CSV format differs
                    val tokens = line.split(",")

                    // Example CSV row: "Alice,1200,5:30"
                    if (tokens.size >= 3) {
                        val playerName = tokens[0].trim()
                        val score = tokens[1].trim()
                        val gameTime = tokens[2].trim()

                        // TODO: Convert strings to proper types, e.g., score to Int
                        // val scoreInt = score.toIntOrNull() ?: 0

                        // Then store or process the data in your app...
                        // e.g., save to database, update UI, etc.
                    }
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
            // Show error, e.g. Toast:
            // Toast.makeText(this, "Failed to read CSV file", Toast.LENGTH_SHORT).show()
        }
    }
}
