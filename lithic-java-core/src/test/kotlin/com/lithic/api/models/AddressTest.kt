// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .address1("123 Old Forest Way")
                .city("Omaha")
                .country("USA")
                .address2("address2")
                .postalCode("68022")
                .state("NE")
                .build()

        assertThat(address.address1()).isEqualTo("123 Old Forest Way")
        assertThat(address.city()).isEqualTo("Omaha")
        assertThat(address.country()).isEqualTo("USA")
        assertThat(address.address2()).contains("address2")
        assertThat(address.postalCode()).contains("68022")
        assertThat(address.state()).contains("NE")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .address1("123 Old Forest Way")
                .city("Omaha")
                .country("USA")
                .address2("address2")
                .postalCode("68022")
                .state("NE")
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
