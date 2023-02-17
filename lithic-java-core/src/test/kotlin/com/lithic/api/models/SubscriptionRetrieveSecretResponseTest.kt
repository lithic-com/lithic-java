package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionRetrieveSecretResponseTest {

    @Test
    fun createSubscriptionRetrieveSecretResponse() {
        val subscriptionRetrieveSecretResponse =
            SubscriptionRetrieveSecretResponse.builder().key("string").build()
        assertThat(subscriptionRetrieveSecretResponse).isNotNull
        assertThat(subscriptionRetrieveSecretResponse.key()).contains("string")
    }
}
