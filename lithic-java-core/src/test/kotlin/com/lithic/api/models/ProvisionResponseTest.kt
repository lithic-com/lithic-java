// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProvisionResponseTest {

    @Test
    fun create() {
        val provisionResponse =
            ProvisionResponse.builder()
                .activationData("activationData")
                .encryptedData("encryptedData")
                .ephemeralPublicKey("ephemeralPublicKey")
                .build()

        assertThat(provisionResponse.activationData()).contains("activationData")
        assertThat(provisionResponse.encryptedData()).contains("encryptedData")
        assertThat(provisionResponse.ephemeralPublicKey()).contains("ephemeralPublicKey")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val provisionResponse =
            ProvisionResponse.builder()
                .activationData("activationData")
                .encryptedData("encryptedData")
                .ephemeralPublicKey("ephemeralPublicKey")
                .build()

        val roundtrippedProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(provisionResponse),
                jacksonTypeRef<ProvisionResponse>(),
            )

        assertThat(roundtrippedProvisionResponse).isEqualTo(provisionResponse)
    }
}
