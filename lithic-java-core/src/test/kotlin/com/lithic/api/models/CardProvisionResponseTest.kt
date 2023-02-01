package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProvisionResponseTest {

    @Test
    fun createCardProvisionResponse() {
        val cardProvisionResponse =
            CardProvisionResponse.builder().provisioningPayload("string").build()
        assertThat(cardProvisionResponse).isNotNull
        assertThat(cardProvisionResponse.provisioningPayload()).contains("string")
    }
}
