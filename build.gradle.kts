subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}

tasks {
    create("check") {
        group = "verification"
        dependsOn(gradle.includedBuild("crypto-trade").task(":check"))
    }
}