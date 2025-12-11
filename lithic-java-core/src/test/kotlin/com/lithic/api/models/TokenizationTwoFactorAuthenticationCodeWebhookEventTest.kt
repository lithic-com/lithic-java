// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationTwoFactorAuthenticationCodeWebhookEventTest {

    @Test
    fun create() {
        val tokenizationTwoFactorAuthenticationCodeWebhookEvent =
            TokenizationTwoFactorAuthenticationCodeWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    TokenizationTwoFactorAuthenticationCodeWebhookEvent.ActivationMethod.builder()
                        .type(
                            TokenizationTwoFactorAuthenticationCodeWebhookEvent.ActivationMethod
                                .Type
                                .TEXT_TO_CARDHOLDER_NUMBER
                        )
                        .value("+15555555555")
                        .build()
                )
                .authenticationCode("123456")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    TokenizationTwoFactorAuthenticationCodeWebhookEvent.EventType
                        .TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        assertThat(tokenizationTwoFactorAuthenticationCodeWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(tokenizationTwoFactorAuthenticationCodeWebhookEvent.activationMethod())
            .isEqualTo(
                TokenizationTwoFactorAuthenticationCodeWebhookEvent.ActivationMethod.builder()
                    .type(
                        TokenizationTwoFactorAuthenticationCodeWebhookEvent.ActivationMethod.Type
                            .TEXT_TO_CARDHOLDER_NUMBER
                    )
                    .value("+15555555555")
                    .build()
            )
        assertThat(tokenizationTwoFactorAuthenticationCodeWebhookEvent.authenticationCode())
            .isEqualTo("123456")
        assertThat(tokenizationTwoFactorAuthenticationCodeWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(tokenizationTwoFactorAuthenticationCodeWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(tokenizationTwoFactorAuthenticationCodeWebhookEvent.eventType())
            .isEqualTo(
                TokenizationTwoFactorAuthenticationCodeWebhookEvent.EventType
                    .TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
            )
        assertThat(tokenizationTwoFactorAuthenticationCodeWebhookEvent.tokenizationToken())
            .isEqualTo("00000000-0000-0000-0000-000000000003")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationTwoFactorAuthenticationCodeWebhookEvent =
            TokenizationTwoFactorAuthenticationCodeWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    TokenizationTwoFactorAuthenticationCodeWebhookEvent.ActivationMethod.builder()
                        .type(
                            TokenizationTwoFactorAuthenticationCodeWebhookEvent.ActivationMethod
                                .Type
                                .TEXT_TO_CARDHOLDER_NUMBER
                        )
                        .value("+15555555555")
                        .build()
                )
                .authenticationCode("123456")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    TokenizationTwoFactorAuthenticationCodeWebhookEvent.EventType
                        .TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        val roundtrippedTokenizationTwoFactorAuthenticationCodeWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationTwoFactorAuthenticationCodeWebhookEvent),
                jacksonTypeRef<TokenizationTwoFactorAuthenticationCodeWebhookEvent>(),
            )

        assertThat(roundtrippedTokenizationTwoFactorAuthenticationCodeWebhookEvent)
            .isEqualTo(tokenizationTwoFactorAuthenticationCodeWebhookEvent)
    }
}
