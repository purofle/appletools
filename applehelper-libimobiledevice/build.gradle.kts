plugins {
    kotlin("multiplatform")
    java
}

kotlin {
    jvm {
        jvmToolchain(20)
        withJava()
    }
    sourceSets {
        val jvmMain by getting
    }
}

tasks.register<Copy>("copyLib") {
    val libs = listOf("libimobiledevice-1.0.so")
    libs.forEach { lib ->
        sourceSets.getByName("main").output.classesDirs.files.forEach {
            from("/usr/lib/${lib}")
            into(it)
        }
    }
}

tasks.named("compileJava") {
    dependsOn("copyLib")
}

tasks.withType(JavaCompile::class) {
    this.options.compilerArgs.add("--enable-preview")
}