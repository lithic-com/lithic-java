// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationCreatePaymentCredentialsResponseTest {

    @Test
    fun create() {
        val tokenizationCreatePaymentCredentialsResponse =
            TokenizationCreatePaymentCredentialsResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .agentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .credentials(
                    TokenizationCreatePaymentCredentialsResponse.PaymentCredentials.builder()
                        .cvv("cvv")
                        .expirationMonth("12")
                        .expirationYear("2027")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("x")
                        .build()
                )
                .mandate(
                    TokenizationCreatePaymentCredentialsResponse.PaymentCredentialsMandateResponse
                        .builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(1250L)
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .frequency(
                            TokenizationCreatePaymentCredentialsResponse
                                .PaymentCredentialsMandateResponse
                                .Frequency
                                .ONE_TIME
                        )
                        .merchant(
                            TokenizationCreatePaymentCredentialsResponse
                                .PaymentCredentialsMandateResponse
                                .Merchant
                                .builder()
                                .name("name")
                                .url("url")
                                .build()
                        )
                        .status(
                            TokenizationCreatePaymentCredentialsResponse
                                .PaymentCredentialsMandateResponse
                                .Status
                                .PENDING
                        )
                        .build()
                )
                .status(TokenizationCreatePaymentCredentialsResponse.Status.ACTIVE)
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(
                    TokenizationCreatePaymentCredentialsResponse.PaymentCredentialsType.AUTONOMOUS
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(tokenizationCreatePaymentCredentialsResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenizationCreatePaymentCredentialsResponse.agentToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenizationCreatePaymentCredentialsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenizationCreatePaymentCredentialsResponse.credentials())
            .isEqualTo(
                TokenizationCreatePaymentCredentialsResponse.PaymentCredentials.builder()
                    .cvv("cvv")
                    .expirationMonth("12")
                    .expirationYear("2027")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value("x")
                    .build()
            )
        assertThat(tokenizationCreatePaymentCredentialsResponse.mandate())
            .isEqualTo(
                TokenizationCreatePaymentCredentialsResponse.PaymentCredentialsMandateResponse
                    .builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(1250L)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .frequency(
                        TokenizationCreatePaymentCredentialsResponse
                            .PaymentCredentialsMandateResponse
                            .Frequency
                            .ONE_TIME
                    )
                    .merchant(
                        TokenizationCreatePaymentCredentialsResponse
                            .PaymentCredentialsMandateResponse
                            .Merchant
                            .builder()
                            .name("name")
                            .url("url")
                            .build()
                    )
                    .status(
                        TokenizationCreatePaymentCredentialsResponse
                            .PaymentCredentialsMandateResponse
                            .Status
                            .PENDING
                    )
                    .build()
            )
        assertThat(tokenizationCreatePaymentCredentialsResponse.status())
            .isEqualTo(TokenizationCreatePaymentCredentialsResponse.Status.ACTIVE)
        assertThat(tokenizationCreatePaymentCredentialsResponse.tokenizationToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenizationCreatePaymentCredentialsResponse.type())
            .isEqualTo(
                TokenizationCreatePaymentCredentialsResponse.PaymentCredentialsType.AUTONOMOUS
            )
        assertThat(tokenizationCreatePaymentCredentialsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationCreatePaymentCredentialsResponse =
            TokenizationCreatePaymentCredentialsResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .agentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .credentials(
                    TokenizationCreatePaymentCredentialsResponse.PaymentCredentials.builder()
                        .cvv("cvv")
                        .expirationMonth("12")
                        .expirationYear("2027")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("x")
                        .build()
                )
                .mandate(
                    TokenizationCreatePaymentCredentialsResponse.PaymentCredentialsMandateResponse
                        .builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(1250L)
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .frequency(
                            TokenizationCreatePaymentCredentialsResponse
                                .PaymentCredentialsMandateResponse
                                .Frequency
                                .ONE_TIME
                        )
                        .merchant(
                            TokenizationCreatePaymentCredentialsResponse
                                .PaymentCredentialsMandateResponse
                                .Merchant
                                .builder()
                                .name("name")
                                .url("url")
                                .build()
                        )
                        .status(
                            TokenizationCreatePaymentCredentialsResponse
                                .PaymentCredentialsMandateResponse
                                .Status
                                .PENDING
                        )
                        .build()
                )
                .status(TokenizationCreatePaymentCredentialsResponse.Status.ACTIVE)
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(
                    TokenizationCreatePaymentCredentialsResponse.PaymentCredentialsType.AUTONOMOUS
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTokenizationCreatePaymentCredentialsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationCreatePaymentCredentialsResponse),
                jacksonTypeRef<TokenizationCreatePaymentCredentialsResponse>(),
            )

        assertThat(roundtrippedTokenizationCreatePaymentCredentialsResponse)
            .isEqualTo(tokenizationCreatePaymentCredentialsResponse)
    }
}
