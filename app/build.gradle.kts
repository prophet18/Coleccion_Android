/*
    Gradle Build file for app.
 */

// import java.io.FileInputStream
// import java.util.Properties

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "coleccion.android"
    compileSdk = 34

    defaultConfig {
        applicationId = "coleccion.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 2
        versionName = "1.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    /*
    signingConfigs {
        create("release") {
            val props = Properties().apply {
                load(FileInputStream(rootProject.file("gradle.properties")))
            }
            keyAlias = props["MYAPP_KEY_ALIAS"] as String
            keyPassword = props["MYAPP_KEY_PASSWORD"] as String
            storeFile = file(props["MYAPP_KEYSTORE_FILE"] as String)
            storePassword = props["MYAPP_KEYSTORE_PASSWORD"] as String
        }
    }
    */

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
    //        signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
    implementation("androidx.activity:activity-compose:1.9.1")
    implementation(platform("androidx.compose:compose-bom:2024.06.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity-ktx:1.9.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.06.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("io.coil-kt:coil:2.6.0")
    implementation("io.coil-kt:coil-gif:2.6.0")

    implementation("com.opencsv:opencsv:5.9")
    implementation("org.apache.commons:commons-csv:1.11.0")

}
