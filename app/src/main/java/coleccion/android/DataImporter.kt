package coleccion.android

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import coleccion.android.AllDatas.csvHighScores
import coleccion.android.AllDatas.escapeCsvCell
import coleccion.android.AllDatas.highScores
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.io.InputStreamReader

class DataImporter : AppCompatActivity() {

    val csvHighScores = File("/data/data/coleccion.android/files/coleccionHighScores.csv")

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
                    if (line.isBlank()) {
                        return@forEachLine
                    }

                    // Split the line by commas - adjust logic if your CSV format differs
                    val tokens = line.split(",")

                    // Example CSV row: "Alice,1200,5:30"
                    if (tokens.size >= 5) {
                        val dAndTime = tokens[0].trim()
                        val scoreString = tokens[1].trim()
                        val gDuration = tokens[2].trim()
                        val bgStrins = tokens[3].trim()
                        val gtStrins = tokens[4].trim()

                        // TODO: Convert strings to proper types, e.g., score to Int
                        // val scoreInt = score.toIntOrNull() ?: 0

                        // Then store or process the data in your app...
                        // e.g., save to database, update UI, etc.

                        try {
                            if (csvHighScores.createNewFile()) {
                                println("Files created ")

                                val csvHS = BufferedWriter(FileWriter(csvHighScores, true))
                                csvHS.write(
                                dAndTime + "," + scoreString + "," +
                                    gDuration + "," + bgStrins + "," + gtStrins
                                )
                                csvHS.newLine()
                                csvHS.close()

                            } else {
                                println("Files already exist.")
                            }
                        } catch (e: IOException) {
                            println("An error occurred.")
                            e.printStackTrace()
                        }
                    }
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
            // Show error, e.g. Toast:
            // Toast.makeText(this, "Failed to read CSV file", Toast.LENGTH_SHORT).show()
        }
    }

    private fun replaceInternalCsvWithDownloaded(csvUri: Uri, internalFileName: String = "coleccionHighScores.csv") {
        // 1) Delete the old file if it exists
        val internalFile = File(filesDir, internalFileName)
        if (internalFile.exists()) {
            val deleted = internalFile.delete()
            if (!deleted) {
                println("No file deletion for you!")
            }
        }

        // 2) Open the downloaded file (from Downloads or elsewhere) and copy it into internal storage
        try {
            contentResolver.openInputStream(csvUri)?.use { inputStream ->
                // Create a new file or overwrite in internal storage
                File(filesDir, internalFileName).outputStream().use { outputStream ->
                    inputStream.copyTo(outputStream)
                }
            }
            // Now you have replaced the old internal CSV with the new one from downloads
        } catch (e: IOException) {
            e.printStackTrace()
            // Handle read/write errors
        }
    }

}
