plugins {
    id("lithic.kotlin")
    id("lithic.publish")
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:2.14.1")
    api("com.fasterxml.jackson.core:jackson-databind:2.14.1")
    api("com.google.guava:guava:33.0.0-jre")

    implementation("com.fasterxml.jackson.core:jackson-annotations:2.14.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.1")
    implementation("org.apache.httpcomponents.core5:httpcore5:5.2.4")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.3.1")

    testImplementation(kotlin("test"))
    testImplementation(project(":lithic-java-client-okhttp"))
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.assertj:assertj-guava:3.25.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.12")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.1")
}
