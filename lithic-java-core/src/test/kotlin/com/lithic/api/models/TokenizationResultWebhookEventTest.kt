// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationResultWebhookEventTest {

    @Test
    fun create() {
        val tokenizationResultWebhookEvent =
            TokenizationResultWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(TokenizationResultWebhookEvent.EventType.TOKENIZATION_RESULT)
                .tokenizationResultDetails(
                    TokenizationResultWebhookEvent.TokenizationResultDetails.builder()
                        .issuerDecision("issuer_decision")
                        .addTokenizationDeclineReason(
                            TokenizationResultWebhookEvent.TokenizationResultDetails
                                .TokenizationDeclineReason
                                .ACCOUNT_SCORE_1
                        )
                        .addTokenizationDeclineReason(
                            TokenizationResultWebhookEvent.TokenizationResultDetails
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

        assertThat(tokenizationResultWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(tokenizationResultWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(tokenizationResultWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
        assertThat(tokenizationResultWebhookEvent.eventType())
            .isEqualTo(TokenizationResultWebhookEvent.EventType.TOKENIZATION_RESULT)
        assertThat(tokenizationResultWebhookEvent.tokenizationResultDetails())
            .isEqualTo(
                TokenizationResultWebhookEvent.TokenizationResultDetails.builder()
                    .issuerDecision("issuer_decision")
                    .addTokenizationDeclineReason(
                        TokenizationResultWebhookEvent.TokenizationResultDetails
                            .TokenizationDeclineReason
                            .ACCOUNT_SCORE_1
                    )
                    .addTokenizationDeclineReason(
                        TokenizationResultWebhookEvent.TokenizationResultDetails
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
        assertThat(tokenizationResultWebhookEvent.tokenizationToken())
            .isEqualTo("00000000-0000-0000-0000-000000000003")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationResultWebhookEvent =
            TokenizationResultWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .eventType(TokenizationResultWebhookEvent.EventType.TOKENIZATION_RESULT)
                .tokenizationResultDetails(
                    TokenizationResultWebhookEvent.TokenizationResultDetails.builder()
                        .issuerDecision("issuer_decision")
                        .addTokenizationDeclineReason(
                            TokenizationResultWebhookEvent.TokenizationResultDetails
                                .TokenizationDeclineReason
                                .ACCOUNT_SCORE_1
                        )
                        .addTokenizationDeclineReason(
                            TokenizationResultWebhookEvent.TokenizationResultDetails
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

        val roundtrippedTokenizationResultWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationResultWebhookEvent),
                jacksonTypeRef<TokenizationResultWebhookEvent>(),
            )

        assertThat(roundtrippedTokenizationResultWebhookEvent)
            .isEqualTo(tokenizationResultWebhookEvent)
    }
}
