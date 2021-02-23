plugins {
    id("com.android.application")
    `kotlin-android`
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(30)
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(":domain")
    implementation(":data")

    implementation("androidx.appcompat:appcompat:1.1.0")
}