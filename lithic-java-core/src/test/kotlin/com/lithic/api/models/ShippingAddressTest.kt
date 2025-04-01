// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShippingAddressTest {

    @Test
    fun create() {
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
                .phoneNumber("+15555555555")
                .build()

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
        assertThat(shippingAddress.phoneNumber()).contains("+15555555555")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                .phoneNumber("+15555555555")
                .build()

        val roundtrippedShippingAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shippingAddress),
                jacksonTypeRef<ShippingAddress>(),
            )

        assertThat(roundtrippedShippingAddress).isEqualTo(shippingAddress)
    }
}
