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
            CardProvisionResponse.builder().provisioningPayload("string").build()

        assertThat(cardProvisionResponse.provisioningPayload())
            .contains(CardProvisionResponse.ProvisioningPayload.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardProvisionResponse =
            CardProvisionResponse.builder().provisioningPayload("string").build()

        val roundtrippedCardProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardProvisionResponse),
                jacksonTypeRef<CardProvisionResponse>(),
            )

        assertThat(roundtrippedCardProvisionResponse).isEqualTo(cardProvisionResponse)
    }
}
