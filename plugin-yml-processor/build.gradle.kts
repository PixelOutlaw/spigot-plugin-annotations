plugins {
    kotlin("jvm")
    kotlin("kapt")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:_")
    compileOnly("net.ltgt.gradle.incap:incap:_")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:_")
    implementation(project(":plugin-yml-annotations"))
    implementation("com.google.auto.service:auto-service-annotations:_")

    kapt("com.google.auto.service:auto-service:_")
    kapt("net.ltgt.gradle.incap:incap-processor:_")
}
