plugins {
    kotlin("jvm") version "2.2.0"
    // Plugin for Dokka - KDoc generating tool
    id("org.jetbrains.dokka") version "2.0.0"
}

group = "ie.setu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:2.0.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}