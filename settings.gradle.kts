pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        // This is the missing piece!
        maven("https://maven.morphe.app/releases")
        name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/MorpheApp/registry")

maven("https://jitpack.io")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Also add it here for the actual code libraries
        maven("https://maven.pkg.github.com/MorpheApp/registry")
        maven("https://jitpack.io")

    }
}

rootProject.name = "PatchTest"
include(":app")
