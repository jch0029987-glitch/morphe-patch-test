plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
 id("app.morphe.patches") version "1.2.0"    

}

android {
    namespace = "com.jeremy.patchtest"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jeremy.patchtest"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

morphe {
    // The name of your patch as seen in the Manager
    name.set("PatchTest")
    
    // A brief description of what the patch does
    description.set("My first custom Morphe patch built in jStudio")
    
    // Versioning for your patch
    version.set("1.0.0")
    
    // The author name (your GitHub handle)
    author.set("jch0029987-glitch")
}

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
compileOnly("app.morphe.patcher:patcher-api:1.3.2")
}
