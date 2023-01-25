plugins {
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
}

allprojects {
    group = "com.lithic.api"
    version = "0.0.1"
}

nexusPublishing {
    repositories {
        sonatype {
            username.set(System.getenv("SONATYPE_USERNAME"))
            password.set(System.getenv("SONATYPE_PASSWORD"))
        }
    }
}
