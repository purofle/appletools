plugins {
    kotlin("jvm") apply false
    kotlin("multiplatform") apply false
    id("org.jetbrains.compose") apply false
}

group = "tech.archlinux"
version = "1.0-SNAPSHOT"

allprojects {
    group = "tech.archlinux"
    version = "1.0-SNAPSHOT"

    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}

repositories {
    mavenCentral()
}
