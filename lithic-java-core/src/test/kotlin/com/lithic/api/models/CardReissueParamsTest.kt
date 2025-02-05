// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardReissueParamsTest {

    @Test
    fun create() {
        CardReissueParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .carrier(Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build())
            .productId("100")
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
            .shippingMethod(CardReissueParams.ShippingMethod._2_DAY)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardReissueParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .carrier(Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build())
                .productId("100")
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
                .shippingMethod(CardReissueParams.ShippingMethod._2_DAY)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.carrier())
            .contains(Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build())
        assertThat(body.productId()).contains("100")
        assertThat(body.shippingAddress())
            .contains(
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
        assertThat(body.shippingMethod()).contains(CardReissueParams.ShippingMethod._2_DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardReissueParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            CardReissueParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "cardToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
