plugins {
    alias(libs.plugins.android.application)
    id("org.sonarqube") version "5.1.0.4882"

}

android {
    namespace = "com.example.u2a3"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.u2a3"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.play.services.maps)
    implementation(libs.play.services.location)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}

sonarqube {
    properties {
        property("sonar.projectKey", "jomyandres")
        property("sonar.projectName", "jomyandres")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.token", "sqp_44263e53a645bd5e8f76d2d35d802af6a522ab06")
    }
}

