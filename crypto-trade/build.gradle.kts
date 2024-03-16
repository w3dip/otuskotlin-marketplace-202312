group = "ru.otus.otuskotlin.crypto.trade"
version = "1.0.0"

repositories {
    mavenCentral()
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version

    repositories {
        mavenCentral()
    }
}

tasks {
    create("build") {
        group = "build"
        dependsOn(project(":app").getTasksByName("build", false))
    }
    create("check") {
        group = "verification"
        subprojects.forEach { proj ->
            println("PROJ $proj")
            proj.getTasksByName("check", false).also {
                this@create.dependsOn(it)
            }
        }
    }
}
