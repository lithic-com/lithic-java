// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShippingAddressTest {

    @Test
    fun createShippingAddress() {
        val shippingAddress =
            ShippingAddress.builder()
                .address1("5 Broad Street")
                .city("NEW YORK")
                .country("USA")
                .firstName("Michael")
                .lastName("Bluth")
                .postalCode("10001-1809")
                .state("NY")
                .address2("Unit 25A")
                .email("johnny@appleseed.com")
                .line2Text("The Bluth Company")
                .phoneNumber("+12124007676")
                .build()
        assertThat(shippingAddress).isNotNull
        assertThat(shippingAddress.address1()).isEqualTo("5 Broad Street")
        assertThat(shippingAddress.city()).isEqualTo("NEW YORK")
        assertThat(shippingAddress.country()).isEqualTo("USA")
        assertThat(shippingAddress.firstName()).isEqualTo("Michael")
        assertThat(shippingAddress.lastName()).isEqualTo("Bluth")
        assertThat(shippingAddress.postalCode()).isEqualTo("10001-1809")
        assertThat(shippingAddress.state()).isEqualTo("NY")
        assertThat(shippingAddress.address2()).contains("Unit 25A")
        assertThat(shippingAddress.email()).contains("johnny@appleseed.com")
        assertThat(shippingAddress.line2Text()).contains("The Bluth Company")
        assertThat(shippingAddress.phoneNumber()).contains("+12124007676")
    }
}
