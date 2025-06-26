// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateParamsTest {

    @Test
    fun create() {
        CardCreateParams.builder()
            .type(CardCreateParams.Type.VIRTUAL)
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cardProgramToken("00000000-0000-0000-1000-000000000000")
            .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
            .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
            .expMonth("06")
            .expYear("2027")
            .memo("New Card")
            .pin("pin")
            .productId("1")
            .replacementAccountToken("00000000-0000-0000-2000-000000000000")
            .replacementFor("00000000-0000-0000-1000-000000000000")
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
            .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
            .spendLimit(1000L)
            .spendLimitDuration(SpendLimitDuration.TRANSACTION)
            .state(CardCreateParams.State.OPEN)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.VIRTUAL)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("pin")
                .productId("1")
                .replacementAccountToken("00000000-0000-0000-2000-000000000000")
                .replacementFor("00000000-0000-0000-1000-000000000000")
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
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(1000L)
                .spendLimitDuration(SpendLimitDuration.TRANSACTION)
                .state(CardCreateParams.State.OPEN)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CardCreateParams.Type.VIRTUAL)
        assertThat(body.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.cardProgramToken()).contains("00000000-0000-0000-1000-000000000000")
        assertThat(body.carrier()).contains(Carrier.builder().qrCodeUrl("qr_code_url").build())
        assertThat(body.digitalCardArtToken()).contains("00000000-0000-0000-1000-000000000000")
        assertThat(body.expMonth()).contains("06")
        assertThat(body.expYear()).contains("2027")
        assertThat(body.memo()).contains("New Card")
        assertThat(body.pin()).contains("pin")
        assertThat(body.productId()).contains("1")
        assertThat(body.replacementAccountToken()).contains("00000000-0000-0000-2000-000000000000")
        assertThat(body.replacementFor()).contains("00000000-0000-0000-1000-000000000000")
        assertThat(body.shippingAddress())
            .contains(
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
        assertThat(body.shippingMethod()).contains(CardCreateParams.ShippingMethod._2_DAY)
        assertThat(body.spendLimit()).contains(1000L)
        assertThat(body.spendLimitDuration()).contains(SpendLimitDuration.TRANSACTION)
        assertThat(body.state()).contains(CardCreateParams.State.OPEN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardCreateParams.builder().type(CardCreateParams.Type.VIRTUAL).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CardCreateParams.Type.VIRTUAL)
    }
}
