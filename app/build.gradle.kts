
plugins {
    id("com.android.application")
    
}

android {
    namespace = "com.example.irsyadjava"
    compileSdk = 33
    
    defaultConfig {
        applicationId = "com.example.irsyadjava"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

dependencies {


    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.9.0")
    
    
    implementation("com.github.hasanelfalakiy:lib-hisab-irsyadulmurid:5.0.6")
    implementation("com.github.hasanelfalakiy:lib-konversi:4.0.1")
}
