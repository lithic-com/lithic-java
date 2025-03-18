// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveSecretResponseTest {

    @Test
    fun create() {
        val subscriptionRetrieveSecretResponse =
            SubscriptionRetrieveSecretResponse.builder().secret("secret").build()

        assertThat(subscriptionRetrieveSecretResponse.secret()).contains("secret")
    }
}
