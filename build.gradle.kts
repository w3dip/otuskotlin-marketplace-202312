plugins {
    kotlin("jvm") apply false
}

group = "com.otus.otuskotlin.marketplace"
version = "1.0.0"

repositories {
    mavenCentral()
}

subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}