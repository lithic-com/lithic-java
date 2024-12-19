plugins {
    id("application")
    id("lithic.java")
}

dependencies {
    implementation(project(":lithic-java"))
}

application {
    mainClass.set("com.lithic.example.Main")
}
