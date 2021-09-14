plugins {
    application
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.serialization")
}

group = "dev.gressier"
version = "0.1.0-SNAPSHOT"

application {
    mainClass.set("dev.gressier.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(Ktor.server.core)
    implementation(Ktor.server.netty)
    implementation(Ktor.features.serialization)
    implementation("ch.qos.logback:logback-classic:_")

    testImplementation("io.ktor:ktor-server-tests:_")
    testImplementation(Kotlin.test)
}

tasks.wrapper {
    gradleVersion = "${project.extra["version.gradle"]}"
}