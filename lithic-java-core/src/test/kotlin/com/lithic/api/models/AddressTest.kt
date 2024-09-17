// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressTest {

    @Test
    fun createAddress() {
        val address =
            Address.builder()
                .address1("123 Old Forest Way")
                .city("Omaha")
                .country("CAN")
                .postalCode("M5V 1S8")
                .state("ON")
                .address2("address2")
                .build()
        assertThat(address).isNotNull
        assertThat(address.address1()).isEqualTo("123 Old Forest Way")
        assertThat(address.city()).isEqualTo("Omaha")
        assertThat(address.country()).isEqualTo("CAN")
        assertThat(address.postalCode()).isEqualTo("M5V 1S8")
        assertThat(address.state()).isEqualTo("ON")
        assertThat(address.address2()).contains("address2")
    }
}
