// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardProvisionResponseTest {

    @Test
    fun create() {
        val cardProvisionResponse =
            CardProvisionResponse.builder().provisioningPayload("provisioning_payload").build()

        assertThat(cardProvisionResponse.provisioningPayload()).contains("provisioning_payload")
    }
}
