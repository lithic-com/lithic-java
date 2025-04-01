// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarrierTest {

    @Test
    fun create() {
        val carrier = Carrier.builder().qrCodeUrl("qr_code_url").build()

        assertThat(carrier.qrCodeUrl()).contains("qr_code_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val carrier = Carrier.builder().qrCodeUrl("qr_code_url").build()

        val roundtrippedCarrier =
            jsonMapper.readValue(jsonMapper.writeValueAsString(carrier), jacksonTypeRef<Carrier>())

        assertThat(roundtrippedCarrier).isEqualTo(carrier)
    }
}
