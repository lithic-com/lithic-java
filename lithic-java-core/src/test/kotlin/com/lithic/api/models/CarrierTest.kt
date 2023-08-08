package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarrierTest {

    @Test
    fun createCarrier() {
        val carrier = Carrier.builder().qrCodeUrl("string").build()
        assertThat(carrier).isNotNull
        assertThat(carrier.qrCodeUrl()).contains("string")
    }
}
