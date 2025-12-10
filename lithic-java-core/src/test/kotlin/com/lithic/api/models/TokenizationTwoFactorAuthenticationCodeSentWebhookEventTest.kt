// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationTwoFactorAuthenticationCodeSentWebhookEventTest {

    @Test
    fun create() {
        val tokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
            TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.ActivationMethod
                        .builder()
                        .type(
                            TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.ActivationMethod
                                .Type
                                .TEXT_TO_CARDHOLDER_NUMBER
                        )
                        .value("+15555555555")
                        .build()
                )
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.EventType
                        .TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        assertThat(tokenizationTwoFactorAuthenticationCodeSentWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(tokenizationTwoFactorAuthenticationCodeSentWebhookEvent.activationMethod())
            .isEqualTo(
                TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.ActivationMethod.builder()
                    .type(
                        TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.ActivationMethod
                            .Type
                            .TEXT_TO_CARDHOLDER_NUMBER
                    )
                    .value("+15555555555")
                    .build()
            )
        assertThat(tokenizationTwoFactorAuthenticationCodeSentWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(tokenizationTwoFactorAuthenticationCodeSentWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(tokenizationTwoFactorAuthenticationCodeSentWebhookEvent.eventType())
            .isEqualTo(
                TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.EventType
                    .TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
            )
        assertThat(tokenizationTwoFactorAuthenticationCodeSentWebhookEvent.tokenizationToken())
            .isEqualTo("00000000-0000-0000-0000-000000000003")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
            TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.ActivationMethod
                        .builder()
                        .type(
                            TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.ActivationMethod
                                .Type
                                .TEXT_TO_CARDHOLDER_NUMBER
                        )
                        .value("+15555555555")
                        .build()
                )
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    TokenizationTwoFactorAuthenticationCodeSentWebhookEvent.EventType
                        .TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        val roundtrippedTokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    tokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                ),
                jacksonTypeRef<TokenizationTwoFactorAuthenticationCodeSentWebhookEvent>(),
            )

        assertThat(roundtrippedTokenizationTwoFactorAuthenticationCodeSentWebhookEvent)
            .isEqualTo(tokenizationTwoFactorAuthenticationCodeSentWebhookEvent)
    }
}
