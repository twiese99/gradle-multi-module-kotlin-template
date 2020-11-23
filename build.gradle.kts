buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
}

plugins {
    kotlin("jvm") version "1.4.20" apply false
    kotlin("kapt") version "1.4.20" apply false
}

subprojects {

    group = "de.twiese99"
    version = "0.1.0.0-SNAPSHOT"

    repositories {
        mavenLocal()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }

}
