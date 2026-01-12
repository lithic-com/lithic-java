import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

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
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
