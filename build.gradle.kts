buildscript {

    val android_plugin_version by extra("3.2.1")
    val kotlin_version by extra("1.3.11")
    val realm_version by extra("5.4.1")

    repositories {
        jcenter()
        maven("https://maven.fabric.io/public")
        maven("https://maven.google.com")
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:$android_plugin_version")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath("io.realm:realm-gradle-plugin:$realm_version")
        classpath("io.fabric.tools:gradle:1.27.0")
        classpath("com.google.gms:google-services:4.2.0")
        classpath("org.ajoberstar:grgit:1.9.3")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.3.2.0")
        classpath("com.github.gfx.ribbonizer:ribbonizer-plugin:2.1.0")
        classpath("com.vanniktech:gradle-android-junit-jacoco-plugin:0.13.0")
        classpath("com.google.android.gms:oss-licenses-plugin:0.9.4")


        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://maven.google.com")

        maven("https://jitpack.io")
        maven("http://dl.bintray.com/jetbrains/spek")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
        maven("https://maven.fabric.io/public")
        maven("https://dl.bintray.com/rozkminiacz/Directions-Android-SDK")
    }
}




tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}