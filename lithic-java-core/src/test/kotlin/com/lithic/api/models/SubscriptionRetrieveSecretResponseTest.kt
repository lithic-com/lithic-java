// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveSecretResponseTest {

    @Test
    fun create() {
        val subscriptionRetrieveSecretResponse =
            SubscriptionRetrieveSecretResponse.builder().secret("secret").build()

        assertThat(subscriptionRetrieveSecretResponse.secret()).contains("secret")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionRetrieveSecretResponse =
            SubscriptionRetrieveSecretResponse.builder().secret("secret").build()

        val roundtrippedSubscriptionRetrieveSecretResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionRetrieveSecretResponse),
                jacksonTypeRef<SubscriptionRetrieveSecretResponse>(),
            )

        assertThat(roundtrippedSubscriptionRetrieveSecretResponse)
            .isEqualTo(subscriptionRetrieveSecretResponse)
    }
}
