// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthStreamEnrollmentServiceAsyncTest {

    @Test
    fun retrieveSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authStreamEnrollmentServiceAsync = client.authStreamEnrollment()

        val authStreamSecretFuture = authStreamEnrollmentServiceAsync.retrieveSecret()

        val authStreamSecret = authStreamSecretFuture.get()
        authStreamSecret.validate()
    }

    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val authStreamEnrollmentServiceAsync = client.authStreamEnrollment()

        val future = authStreamEnrollmentServiceAsync.rotateSecret()

        val response = future.get()
    }
}
