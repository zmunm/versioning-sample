plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
}

dependencies {
    implementation("com.android.tools.build:gradle:3.6.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.20")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.10.0")
    implementation("com.github.ben-manes:gradle-versions-plugin:0.35.0")
}
