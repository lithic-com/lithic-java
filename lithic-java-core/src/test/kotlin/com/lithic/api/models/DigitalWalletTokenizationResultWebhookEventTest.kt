// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenizationResultWebhookEventTest {

    @Test
    fun create() {
        val digitalWalletTokenizationResultWebhookEvent =
            DigitalWalletTokenizationResultWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    DigitalWalletTokenizationResultWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_RESULT
                )
                .tokenizationResultDetails(
                    DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails.builder()
                        .issuerDecision("issuer_decision")
                        .addTokenizationDeclineReason(
                            DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails
                                .TokenizationDeclineReason
                                .ACCOUNT_SCORE_1
                        )
                        .addTokenizationDeclineReason(
                            DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails
                                .TokenizationDeclineReason
                                .DEVICE_SCORE_1
                        )
                        .customerDecision("customer_decision")
                        .addRuleResult(
                            TokenizationRuleResult.builder()
                                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .explanation("explanation")
                                .name("name")
                                .result(TokenizationRuleResult.Result.APPROVED)
                                .build()
                        )
                        .tokenActivatedDateTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .addTokenizationTfaReason(TokenizationTfaReason.WALLET_RECOMMENDED_TFA)
                        .walletDecision("APPROVED")
                        .build()
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        assertThat(digitalWalletTokenizationResultWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(digitalWalletTokenizationResultWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(digitalWalletTokenizationResultWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(digitalWalletTokenizationResultWebhookEvent.eventType())
            .isEqualTo(
                DigitalWalletTokenizationResultWebhookEvent.EventType
                    .DIGITAL_WALLET_TOKENIZATION_RESULT
            )
        assertThat(digitalWalletTokenizationResultWebhookEvent.tokenizationResultDetails())
            .isEqualTo(
                DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails.builder()
                    .issuerDecision("issuer_decision")
                    .addTokenizationDeclineReason(
                        DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails
                            .TokenizationDeclineReason
                            .ACCOUNT_SCORE_1
                    )
                    .addTokenizationDeclineReason(
                        DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails
                            .TokenizationDeclineReason
                            .DEVICE_SCORE_1
                    )
                    .customerDecision("customer_decision")
                    .addRuleResult(
                        TokenizationRuleResult.builder()
                            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .explanation("explanation")
                            .name("name")
                            .result(TokenizationRuleResult.Result.APPROVED)
                            .build()
                    )
                    .tokenActivatedDateTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .addTokenizationTfaReason(TokenizationTfaReason.WALLET_RECOMMENDED_TFA)
                    .walletDecision("APPROVED")
                    .build()
            )
        assertThat(digitalWalletTokenizationResultWebhookEvent.tokenizationToken())
            .isEqualTo("00000000-0000-0000-0000-000000000003")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenizationResultWebhookEvent =
            DigitalWalletTokenizationResultWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    DigitalWalletTokenizationResultWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_RESULT
                )
                .tokenizationResultDetails(
                    DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails.builder()
                        .issuerDecision("issuer_decision")
                        .addTokenizationDeclineReason(
                            DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails
                                .TokenizationDeclineReason
                                .ACCOUNT_SCORE_1
                        )
                        .addTokenizationDeclineReason(
                            DigitalWalletTokenizationResultWebhookEvent.TokenizationResultDetails
                                .TokenizationDeclineReason
                                .DEVICE_SCORE_1
                        )
                        .customerDecision("customer_decision")
                        .addRuleResult(
                            TokenizationRuleResult.builder()
                                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .explanation("explanation")
                                .name("name")
                                .result(TokenizationRuleResult.Result.APPROVED)
                                .build()
                        )
                        .tokenActivatedDateTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .addTokenizationTfaReason(TokenizationTfaReason.WALLET_RECOMMENDED_TFA)
                        .walletDecision("APPROVED")
                        .build()
                )
                .tokenizationToken("00000000-0000-0000-0000-000000000003")
                .build()

        val roundtrippedDigitalWalletTokenizationResultWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenizationResultWebhookEvent),
                jacksonTypeRef<DigitalWalletTokenizationResultWebhookEvent>(),
            )

        assertThat(roundtrippedDigitalWalletTokenizationResultWebhookEvent)
            .isEqualTo(digitalWalletTokenizationResultWebhookEvent)
    }
}
