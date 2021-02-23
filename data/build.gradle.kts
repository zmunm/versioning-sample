plugins {
    `android-library`
    `kotlin-android`
    detekt
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
    implementation("com.squareup.retrofit2:retrofit:2.8.0")
}
