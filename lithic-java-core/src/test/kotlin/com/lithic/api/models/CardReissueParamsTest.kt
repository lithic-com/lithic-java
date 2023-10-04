// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardReissueParamsTest {

    @Test
    fun createCardReissueParams() {
        CardReissueParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .carrier(Carrier.builder().qrCodeUrl("string").build())
            .productId("string")
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
                    .phoneNumber("+12124007676")
                    .build()
            )
            .shippingMethod(CardReissueParams.ShippingMethod.STANDARD)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardReissueParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .productId("string")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardReissueParams.ShippingMethod.STANDARD)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.carrier()).isEqualTo(Carrier.builder().qrCodeUrl("string").build())
        assertThat(body.productId()).isEqualTo("string")
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
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(body.shippingMethod()).isEqualTo(CardReissueParams.ShippingMethod.STANDARD)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CardReissueParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.getBody()
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
