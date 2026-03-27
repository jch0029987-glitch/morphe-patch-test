pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        // Corrected syntax for these blocks
        maven {
            url = uri("https://maven.pkg.github.com/MorpheApp/registry")
        }
        maven {
            url = uri("https://jitpack.io")
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/MorpheApp/registry")
        }
        maven {
            url = uri("https://jitpack.io")
        }
    }
}

rootProject.name = "PatchTest"
include(":app")
