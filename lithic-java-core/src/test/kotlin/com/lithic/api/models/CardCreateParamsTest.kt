package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardCreateParamsTest {

    @Test
    fun createCardCreateParams() {
        CardCreateParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cardProgramToken("00000000-0000-0000-1000-000000000000")
            .expMonth("06")
            .expYear("2027")
            .fundingToken("ecbd1d58-0299-48b3-84da-6ed7f5bf9ec1")
            .memo("New Card")
            .spendLimit(123L)
            .spendLimitDuration(CardCreateParams.SpendLimitDuration.ANNUALLY)
            .state(CardCreateParams.State.OPEN)
            .type(CardCreateParams.Type.VIRTUAL)
            .pin("string")
            .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
            .productId("1")
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
            .shippingMethod(CardCreateParams.ShippingMethod.STANDARD)
            .build()
    }

    @Test
    fun toBody() {
        val params =
            CardCreateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .fundingToken("ecbd1d58-0299-48b3-84da-6ed7f5bf9ec1")
                .memo("New Card")
                .spendLimit(123L)
                .spendLimitDuration(CardCreateParams.SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .type(CardCreateParams.Type.VIRTUAL)
                .pin("string")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .productId("1")
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
                .shippingMethod(CardCreateParams.ShippingMethod.STANDARD)
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.cardProgramToken()).isEqualTo("00000000-0000-0000-1000-000000000000")
        assertThat(body.expMonth()).isEqualTo("06")
        assertThat(body.expYear()).isEqualTo("2027")
        assertThat(body.fundingToken()).isEqualTo("ecbd1d58-0299-48b3-84da-6ed7f5bf9ec1")
        assertThat(body.memo()).isEqualTo("New Card")
        assertThat(body.spendLimit()).isEqualTo(123L)
        assertThat(body.spendLimitDuration())
            .isEqualTo(CardCreateParams.SpendLimitDuration.ANNUALLY)
        assertThat(body.state()).isEqualTo(CardCreateParams.State.OPEN)
        assertThat(body.type()).isEqualTo(CardCreateParams.Type.VIRTUAL)
        assertThat(body.pin()).isEqualTo("string")
        assertThat(body.digitalCardArtToken()).isEqualTo("00000000-0000-0000-1000-000000000000")
        assertThat(body.productId()).isEqualTo("1")
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
        assertThat(body.shippingMethod()).isEqualTo(CardCreateParams.ShippingMethod.STANDARD)
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params = CardCreateParams.builder().type(CardCreateParams.Type.VIRTUAL).build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(CardCreateParams.Type.VIRTUAL)
    }
}
