// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEventTest {

    @Test
    fun create() {
        val digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
            DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                        .ActivationMethod
                        .builder()
                        .type(
                            DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                                .ActivationMethod
                                .Type
                                .TEXT_TO_CARDHOLDER_NUMBER
                        )
                        .value("+15555555555")
                        .build()
                )
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        assertThat(
                digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.accountToken()
            )
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(
                digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                    .activationMethod()
            )
            .isEqualTo(
                DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                    .ActivationMethod
                    .builder()
                    .type(
                        DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                            .ActivationMethod
                            .Type
                            .TEXT_TO_CARDHOLDER_NUMBER
                    )
                    .value("+15555555555")
                    .build()
            )
        assertThat(digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.eventType())
            .isEqualTo(
                DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.EventType
                    .DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
            )
        assertThat(
                digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                    .tokenizationToken()
            )
            .isEqualTo("00000000-0000-0000-0000-000000000003")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
            DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                        .ActivationMethod
                        .builder()
                        .type(
                            DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                                .ActivationMethod
                                .Type
                                .TEXT_TO_CARDHOLDER_NUMBER
                        )
                        .value("+15555555555")
                        .build()
                )
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        val roundtrippedDigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                ),
                jacksonTypeRef<
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                >(),
            )

        assertThat(roundtrippedDigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent)
            .isEqualTo(digitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent)
    }
}
