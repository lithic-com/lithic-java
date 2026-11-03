// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationCreatePaymentCredentialsParamsTest {

    @Test
    fun create() {
        TokenizationCreatePaymentCredentialsParams.builder()
            .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .device(
                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsDevice.builder()
                    .applicationName("Example app")
                    .brand("Example brand")
                    .ipAddress("192.0.2.1")
                    .type("Mobile")
                    .build()
            )
            .mandate(
                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate.builder()
                    .amount(1250L)
                    .expiresAt(OffsetDateTime.parse("2026-10-29T15:00:00Z"))
                    .frequency(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                            .Frequency
                            .ONE_TIME
                    )
                    .merchant(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                            .Merchant
                            .builder()
                            .name("Example merchant")
                            .url("https://merchant.example")
                            .build()
                    )
                    .build()
            )
            .type(
                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsType.HUMAN_IN_THE_LOOP
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenizationCreatePaymentCredentialsParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .device(
                    TokenizationCreatePaymentCredentialsParams.PaymentCredentialsDevice.builder()
                        .applicationName("Example app")
                        .brand("Example brand")
                        .ipAddress("192.0.2.1")
                        .type("Mobile")
                        .build()
                )
                .mandate(
                    TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate.builder()
                        .amount(1250L)
                        .expiresAt(OffsetDateTime.parse("2026-10-29T15:00:00Z"))
                        .frequency(
                            TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                .Frequency
                                .ONE_TIME
                        )
                        .merchant(
                            TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                .Merchant
                                .builder()
                                .name("Example merchant")
                                .url("https://merchant.example")
                                .build()
                        )
                        .build()
                )
                .type(
                    TokenizationCreatePaymentCredentialsParams.PaymentCredentialsType
                        .HUMAN_IN_THE_LOOP
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenizationCreatePaymentCredentialsParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .device(
                    TokenizationCreatePaymentCredentialsParams.PaymentCredentialsDevice.builder()
                        .applicationName("Example app")
                        .brand("Example brand")
                        .ipAddress("192.0.2.1")
                        .type("Mobile")
                        .build()
                )
                .mandate(
                    TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate.builder()
                        .amount(1250L)
                        .expiresAt(OffsetDateTime.parse("2026-10-29T15:00:00Z"))
                        .frequency(
                            TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                .Frequency
                                .ONE_TIME
                        )
                        .merchant(
                            TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                .Merchant
                                .builder()
                                .name("Example merchant")
                                .url("https://merchant.example")
                                .build()
                        )
                        .build()
                )
                .type(
                    TokenizationCreatePaymentCredentialsParams.PaymentCredentialsType
                        .HUMAN_IN_THE_LOOP
                )
                .build()

        val body = params._body()

        assertThat(body.device())
            .isEqualTo(
                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsDevice.builder()
                    .applicationName("Example app")
                    .brand("Example brand")
                    .ipAddress("192.0.2.1")
                    .type("Mobile")
                    .build()
            )
        assertThat(body.mandate())
            .isEqualTo(
                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate.builder()
                    .amount(1250L)
                    .expiresAt(OffsetDateTime.parse("2026-10-29T15:00:00Z"))
                    .frequency(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                            .Frequency
                            .ONE_TIME
                    )
                    .merchant(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                            .Merchant
                            .builder()
                            .name("Example merchant")
                            .url("https://merchant.example")
                            .build()
                    )
                    .build()
            )
        assertThat(body.type())
            .isEqualTo(
                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsType.HUMAN_IN_THE_LOOP
            )
    }
}
