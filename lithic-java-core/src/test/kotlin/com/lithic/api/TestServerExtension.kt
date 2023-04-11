package com.lithic.api

import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext
import java.lang.RuntimeException
import java.net.URL

class TestServerExtension: BeforeAllCallback {

    override fun beforeAll(context: ExtensionContext?) {
        try {
            URL(BASE_URL).openConnection().connect()
        } catch (e: Exception) {
            throw RuntimeException(
                """
                The test suite will not run without a mock Prism server running against your OpenAPI spec.

                To fix:

                1. Install Prism (requires Node 16+):

                  With npm:
                    $ npm install -g @stoplight/prism-cli

                  With yarn:
                    $ yarn global add @stoplight/prism-cli

                2. Run the mock server

                  To run the server, pass in the path of your OpenAPI spec to the prism command:
                    $ prism mock path/to/your.openapi.yml
                """.trimIndent(),
                e
            )
        }
    }

    companion object {

        val BASE_URL = System.getenv("API_BASE_URL") ?: "http://localhost:4010"
    }
}
