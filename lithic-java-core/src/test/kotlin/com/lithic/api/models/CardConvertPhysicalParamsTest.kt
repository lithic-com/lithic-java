// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardConvertPhysicalParamsTest {

    @Test
    fun create() {
        CardConvertPhysicalParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .shippingAddress(
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
            )
            .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
            .productId("product_id")
            .shippingMethod(CardConvertPhysicalParams.ShippingMethod._2_DAY)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardConvertPhysicalParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shippingAddress(
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
                )
                .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
                .productId("product_id")
                .shippingMethod(CardConvertPhysicalParams.ShippingMethod._2_DAY)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.shippingAddress())
            .isEqualTo(
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
            )
        assertThat(body.carrier()).contains(Carrier.builder().qrCodeUrl("qr_code_url").build())
        assertThat(body.productId()).contains("product_id")
        assertThat(body.shippingMethod()).contains(CardConvertPhysicalParams.ShippingMethod._2_DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardConvertPhysicalParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shippingAddress(
                    ShippingAddress.builder()
                        .address1("5 Broad Street")
                        .city("NEW YORK")
                        .country("USA")
                        .firstName("Michael")
                        .lastName("Bluth")
                        .postalCode("10001-1809")
                        .state("NY")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.shippingAddress())
            .isEqualTo(
                ShippingAddress.builder()
                    .address1("5 Broad Street")
                    .city("NEW YORK")
                    .country("USA")
                    .firstName("Michael")
                    .lastName("Bluth")
                    .postalCode("10001-1809")
                    .state("NY")
                    .build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            CardConvertPhysicalParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shippingAddress(
                    ShippingAddress.builder()
                        .address1("5 Broad Street")
                        .city("NEW YORK")
                        .country("USA")
                        .firstName("Michael")
                        .lastName("Bluth")
                        .postalCode("10001-1809")
                        .state("NY")
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "cardToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
