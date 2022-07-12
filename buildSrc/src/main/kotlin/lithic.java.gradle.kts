import com.diffplug.gradle.spotless.SpotlessExtension
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import java.util.Locale

plugins {
    `java-library`
    id("com.diffplug.spotless")
}

repositories {
    mavenCentral()
}

configure<JavaPluginExtension> {
    withJavadocJar()
    withSourcesJar()
}

configure<SpotlessExtension> {
    java {
        importOrder()
        removeUnusedImports()
        palantirJavaFormat()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Werror")
}

task<Exec>("checkTestServer") {
    if (System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("windows")) {
        commandLine("powershell", "-nologo", "..\\gradle\\check-test-server.ps1")
    } else {
        commandLine("bash", "../gradle/check-test-server")
    }
}

tasks.test {
    dependsOn("checkTestServer")

    useJUnitPlatform()

    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
    }
}
