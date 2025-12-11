// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEventTest {

    @Test
    fun create() {
        val digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent =
            DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                        .ActivationMethod
                        .builder()
                        .type(
                            DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                                .ActivationMethod
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
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        assertThat(digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(
                digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.activationMethod()
            )
            .isEqualTo(
                DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.ActivationMethod
                    .builder()
                    .type(
                        DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                            .ActivationMethod
                            .Type
                            .TEXT_TO_CARDHOLDER_NUMBER
                    )
                    .value("+15555555555")
                    .build()
            )
        assertThat(
                digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                    .authenticationCode()
            )
            .isEqualTo("123456")
        assertThat(digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.eventType())
            .isEqualTo(
                DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.EventType
                    .DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
            )
        assertThat(
                digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.tokenizationToken()
            )
            .isEqualTo("00000000-0000-0000-0000-000000000003")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent =
            DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .activationMethod(
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                        .ActivationMethod
                        .builder()
                        .type(
                            DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                                .ActivationMethod
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
                    DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        val roundtrippedDigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                ),
                jacksonTypeRef<DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent>(),
            )

        assertThat(roundtrippedDigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent)
            .isEqualTo(digitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent)
    }
}
