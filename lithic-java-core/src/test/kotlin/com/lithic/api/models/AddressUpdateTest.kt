// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressUpdateTest {

    @Test
    fun create() {
        val addressUpdate =
            AddressUpdate.builder()
                .address1("123 Old Forest Way")
                .address2("address2")
                .city("Omaha")
                .country("USA")
                .postalCode("68022")
                .state("NE")
                .build()

        assertThat(addressUpdate.address1()).contains("123 Old Forest Way")
        assertThat(addressUpdate.address2()).contains("address2")
        assertThat(addressUpdate.city()).contains("Omaha")
        assertThat(addressUpdate.country()).contains("USA")
        assertThat(addressUpdate.postalCode()).contains("68022")
        assertThat(addressUpdate.state()).contains("NE")
    }
}
