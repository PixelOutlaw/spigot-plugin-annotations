plugins {
    kotlin("jvm")
    kotlin("kapt")
}

dependencies {
    compileOnly(Libs.spigot_api)
    compileOnly(Libs.incap)
    implementation(Libs.kotlin_stdlib_jdk8)
    implementation(project(":plugin-yml-annotations"))
    implementation(Libs.auto_service_annotations)

    kapt(Libs.auto_service)
    kapt(Libs.incap_processor)
}
