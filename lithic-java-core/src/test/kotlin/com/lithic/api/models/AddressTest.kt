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
                .country("USA")
                .postalCode("68022")
                .state("NE")
                .address2("string")
                .build()
        assertThat(address).isNotNull
        assertThat(address.address1()).isEqualTo("123 Old Forest Way")
        assertThat(address.address2()).contains("string")
        assertThat(address.city()).isEqualTo("Omaha")
        assertThat(address.country()).isEqualTo("USA")
        assertThat(address.postalCode()).isEqualTo("68022")
        assertThat(address.state()).isEqualTo("NE")
    }
}
