// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenizationUpdatedWebhookEventTest {

    @Test
    fun create() {
        val digitalWalletTokenizationUpdatedWebhookEvent =
            DigitalWalletTokenizationUpdatedWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    DigitalWalletTokenizationUpdatedWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_UPDATED
                )
                .tokenization(
                    Tokenization.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dpan("dpan")
                        .status(Tokenization.Status.ACTIVE)
                        .tokenRequestorName(Tokenization.TokenRequestorName.AMAZON_ONE)
                        .tokenUniqueReference("token_unique_reference")
                        .tokenizationChannel(Tokenization.TokenizationChannel.DIGITAL_WALLET)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deviceId("device_id")
                        .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addEvent(
                            Tokenization.TokenizationEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(
                                    Tokenization.TokenizationEvent.TokenizationEventOutcome.APPROVED
                                )
                                .addRuleResult(
                                    TokenizationRuleResult.builder()
                                        .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .explanation("explanation")
                                        .name("name")
                                        .result(TokenizationRuleResult.Result.APPROVED)
                                        .build()
                                )
                                .addTokenizationDeclineReason(
                                    TokenizationDeclineReason.ACCOUNT_SCORE_1
                                )
                                .addTokenizationTfaReason(
                                    TokenizationTfaReason.WALLET_RECOMMENDED_TFA
                                )
                                .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                                .build()
                        )
                        .paymentAccountReferenceId("payment_account_reference_id")
                        .build()
                )
                .build()

        assertThat(digitalWalletTokenizationUpdatedWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(digitalWalletTokenizationUpdatedWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(digitalWalletTokenizationUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(digitalWalletTokenizationUpdatedWebhookEvent.eventType())
            .isEqualTo(
                DigitalWalletTokenizationUpdatedWebhookEvent.EventType
                    .DIGITAL_WALLET_TOKENIZATION_UPDATED
            )
        assertThat(digitalWalletTokenizationUpdatedWebhookEvent.tokenization())
            .isEqualTo(
                Tokenization.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dpan("dpan")
                    .status(Tokenization.Status.ACTIVE)
                    .tokenRequestorName(Tokenization.TokenRequestorName.AMAZON_ONE)
                    .tokenUniqueReference("token_unique_reference")
                    .tokenizationChannel(Tokenization.TokenizationChannel.DIGITAL_WALLET)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deviceId("device_id")
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEvent(
                        Tokenization.TokenizationEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(
                                Tokenization.TokenizationEvent.TokenizationEventOutcome.APPROVED
                            )
                            .addRuleResult(
                                TokenizationRuleResult.builder()
                                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .explanation("explanation")
                                    .name("name")
                                    .result(TokenizationRuleResult.Result.APPROVED)
                                    .build()
                            )
                            .addTokenizationDeclineReason(TokenizationDeclineReason.ACCOUNT_SCORE_1)
                            .addTokenizationTfaReason(TokenizationTfaReason.WALLET_RECOMMENDED_TFA)
                            .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                            .build()
                    )
                    .paymentAccountReferenceId("payment_account_reference_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenizationUpdatedWebhookEvent =
            DigitalWalletTokenizationUpdatedWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(
                    DigitalWalletTokenizationUpdatedWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_UPDATED
                )
                .tokenization(
                    Tokenization.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dpan("dpan")
                        .status(Tokenization.Status.ACTIVE)
                        .tokenRequestorName(Tokenization.TokenRequestorName.AMAZON_ONE)
                        .tokenUniqueReference("token_unique_reference")
                        .tokenizationChannel(Tokenization.TokenizationChannel.DIGITAL_WALLET)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deviceId("device_id")
                        .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addEvent(
                            Tokenization.TokenizationEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(
                                    Tokenization.TokenizationEvent.TokenizationEventOutcome.APPROVED
                                )
                                .addRuleResult(
                                    TokenizationRuleResult.builder()
                                        .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .explanation("explanation")
                                        .name("name")
                                        .result(TokenizationRuleResult.Result.APPROVED)
                                        .build()
                                )
                                .addTokenizationDeclineReason(
                                    TokenizationDeclineReason.ACCOUNT_SCORE_1
                                )
                                .addTokenizationTfaReason(
                                    TokenizationTfaReason.WALLET_RECOMMENDED_TFA
                                )
                                .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                                .build()
                        )
                        .paymentAccountReferenceId("payment_account_reference_id")
                        .build()
                )
                .build()

        val roundtrippedDigitalWalletTokenizationUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenizationUpdatedWebhookEvent),
                jacksonTypeRef<DigitalWalletTokenizationUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedDigitalWalletTokenizationUpdatedWebhookEvent)
            .isEqualTo(digitalWalletTokenizationUpdatedWebhookEvent)
    }
}
