// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardConvertPhysicalParamsTest {

    @Test
    fun create() {
        CardConvertPhysicalParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .shippingAddress(
                ShippingAddress.builder()
                    .address1("5 Broad Street")
                    .city("NEW YORK")
                    .country("USA")
                    .firstName("Janet")
                    .lastName("Yellen")
                    .postalCode("10001")
                    .state("NY")
                    .address2("Unit 5A")
                    .email("johnny@appleseed.com")
                    .line2Text("The Bluth Company")
                    .phoneNumber("+15555555555")
                    .build()
            )
            .carrier(Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build())
            .productId("100")
            .shippingMethod(CardConvertPhysicalParams.ShippingMethod.STANDARD)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardConvertPhysicalParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shippingAddress(
                    ShippingAddress.builder()
                        .address1("5 Broad Street")
                        .city("NEW YORK")
                        .country("USA")
                        .firstName("Janet")
                        .lastName("Yellen")
                        .postalCode("10001")
                        .state("NY")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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
                        .firstName("Janet")
                        .lastName("Yellen")
                        .postalCode("10001")
                        .state("NY")
                        .address2("Unit 5A")
                        .email("johnny@appleseed.com")
                        .line2Text("The Bluth Company")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .carrier(Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build())
                .productId("100")
                .shippingMethod(CardConvertPhysicalParams.ShippingMethod.STANDARD)
                .build()

        val body = params._body()

        assertThat(body.shippingAddress())
            .isEqualTo(
                ShippingAddress.builder()
                    .address1("5 Broad Street")
                    .city("NEW YORK")
                    .country("USA")
                    .firstName("Janet")
                    .lastName("Yellen")
                    .postalCode("10001")
                    .state("NY")
                    .address2("Unit 5A")
                    .email("johnny@appleseed.com")
                    .line2Text("The Bluth Company")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(body.carrier())
            .contains(Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build())
        assertThat(body.productId()).contains("100")
        assertThat(body.shippingMethod())
            .contains(CardConvertPhysicalParams.ShippingMethod.STANDARD)
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
                        .firstName("Janet")
                        .lastName("Yellen")
                        .postalCode("10001")
                        .state("NY")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.shippingAddress())
            .isEqualTo(
                ShippingAddress.builder()
                    .address1("5 Broad Street")
                    .city("NEW YORK")
                    .country("USA")
                    .firstName("Janet")
                    .lastName("Yellen")
                    .postalCode("10001")
                    .state("NY")
                    .build()
            )
    }
}
