// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionRetrieveSecretResponseTest {

    @Test
    fun createSubscriptionRetrieveSecretResponse() {
        val subscriptionRetrieveSecretResponse =
            SubscriptionRetrieveSecretResponse.builder().secret("string").build()
        assertThat(subscriptionRetrieveSecretResponse).isNotNull
        assertThat(subscriptionRetrieveSecretResponse.secret()).contains("string")
    }
}
