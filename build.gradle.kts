buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
}

plugins {
    kotlin("jvm") version "1.4.21-2" apply false
    kotlin("kapt") version "1.4.21-2" apply false
}

subprojects {

    group = "de.twiese99"
    version = "1.4.20.1"

    repositories {
        mavenLocal()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }

}
