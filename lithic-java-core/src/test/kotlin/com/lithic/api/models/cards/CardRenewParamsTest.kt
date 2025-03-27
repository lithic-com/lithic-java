// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.cards

import com.lithic.api.models.Carrier
import com.lithic.api.models.ShippingAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRenewParamsTest {

    @Test
    fun create() {
        CardRenewParams.builder()
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
            .expMonth("06")
            .expYear("2027")
            .productId("100")
            .shippingMethod(CardRenewParams.ShippingMethod._2_DAY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardRenewParams.builder()
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
            CardRenewParams.builder()
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
                .expMonth("06")
                .expYear("2027")
                .productId("100")
                .shippingMethod(CardRenewParams.ShippingMethod._2_DAY)
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
        assertThat(body.expMonth()).contains("06")
        assertThat(body.expYear()).contains("2027")
        assertThat(body.productId()).contains("100")
        assertThat(body.shippingMethod()).contains(CardRenewParams.ShippingMethod._2_DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardRenewParams.builder()
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
