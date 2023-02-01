package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardReissueParamsTest {

    @Test
    fun createCardReissueParams() {
        CardReissueParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .shippingAddress(
                ShippingAddress.builder()
                    .firstName("Michael")
                    .lastName("Bluth")
                    .line2Text("The Bluth Company")
                    .address1("5 Broad Street")
                    .address2("Unit 25A")
                    .city("NEW YORK")
                    .state("NY")
                    .postalCode("10001-1809")
                    .country("USA")
                    .email("johnny@appleseed.com")
                    .phoneNumber("+12124007676")
                    .build()
            )
            .shippingMethod(CardReissueParams.ShippingMethod.STANDARD)
            .productId("string")
            .build()
    }

    @Test
    fun toBody() {
        val params =
            CardReissueParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shippingAddress(
                    ShippingAddress.builder()
                        .firstName("Michael")
                        .lastName("Bluth")
                        .line2Text("The Bluth Company")
                        .address1("5 Broad Street")
                        .address2("Unit 25A")
                        .city("NEW YORK")
                        .state("NY")
                        .postalCode("10001-1809")
                        .country("USA")
                        .email("johnny@appleseed.com")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardReissueParams.ShippingMethod.STANDARD)
                .productId("string")
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.shippingAddress())
            .isEqualTo(
                ShippingAddress.builder()
                    .firstName("Michael")
                    .lastName("Bluth")
                    .line2Text("The Bluth Company")
                    .address1("5 Broad Street")
                    .address2("Unit 25A")
                    .city("NEW YORK")
                    .state("NY")
                    .postalCode("10001-1809")
                    .country("USA")
                    .email("johnny@appleseed.com")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(body.shippingMethod()).isEqualTo(CardReissueParams.ShippingMethod.STANDARD)
        assertThat(body.productId()).isEqualTo("string")
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            CardReissueParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.toBody()
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
