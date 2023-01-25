import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get

plugins {
    `maven-publish`
}

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Lithic Developer API")
                description.set("The Lithic Developer API is designed to provide a predictable programmatic\ninterface for accessing your Lithic account through an API and transaction\nwebhooks. Note that your API key is a secret and should be treated as such.\nDon't share it with anyone, including us. We will never ask you for it.")
                url.set("https://docs.lithic.com")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Lithic")
                        email.set("sdk-feedback@lithic.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/lithic-com/lithic-java.git")
                    developerConnection.set("scm:git:git://github.com/lithic-com/lithic-java.git")
                    url.set("https://github.com/lithic-com/lithic-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

tasks.publish {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
