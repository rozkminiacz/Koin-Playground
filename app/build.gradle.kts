plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "me.rozkmin.koinplayground"
        minSdkVersion(21)
        targetSdkVersion(28)
        buildToolsVersion("28.0.3")
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes.invoke {
        "release" {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementationAll(libraries.ArchitectureComponents.all)
    kapt(libraries.ArchitectureComponents.kapt)
//
    implementationAll(libraries.DI.all)
//
    testImplementationAll(libraries.UnitTests.all)
//
    implementationAll(libraries.Rx.all)
    implementationAll(libraries.Network.all)
//
    implementationAll(libraries.Images.all)
    kapt(libraries.Images.kapt)
//
    implementationAll(libraries.Maps.all)
    implementationAll(libraries.Utils.all)
//
//    androidTestImplementation(libraries.InstrumentationTest.all)
//    androidTestUtil(libraries.InstrumentationTest.orchestrator)
}