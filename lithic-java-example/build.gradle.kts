plugins {
    id("lithic.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lithic-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :lithic-java-example:run` to run `Main`
    // Use `./gradlew :lithic-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.lithic.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
