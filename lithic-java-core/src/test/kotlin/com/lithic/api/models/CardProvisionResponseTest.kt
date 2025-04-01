// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardProvisionResponseTest {

    @Test
    fun create() {
        val cardProvisionResponse =
            CardProvisionResponse.builder().provisioningPayload("provisioning_payload").build()

        assertThat(cardProvisionResponse.provisioningPayload()).contains("provisioning_payload")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardProvisionResponse =
            CardProvisionResponse.builder().provisioningPayload("provisioning_payload").build()

        val roundtrippedCardProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardProvisionResponse),
                jacksonTypeRef<CardProvisionResponse>(),
            )

        assertThat(roundtrippedCardProvisionResponse).isEqualTo(cardProvisionResponse)
    }
}
