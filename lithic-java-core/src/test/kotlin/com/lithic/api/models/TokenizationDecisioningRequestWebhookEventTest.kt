// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationDecisioningRequestWebhookEventTest {

    @Test
    fun create() {
        val tokenizationDecisioningRequestWebhookEvent =
            TokenizationDecisioningRequestWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2023-09-18T12:34:56Z"))
                .eventType(
                    TokenizationDecisioningRequestWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                )
                .issuerDecision(TokenizationDecisioningRequestWebhookEvent.IssuerDecision.APPROVED)
                .tokenizationChannel(
                    TokenizationDecisioningRequestWebhookEvent.TokenizationChannel.DIGITAL_WALLET
                )
                .tokenizationToken("tok_1234567890abcdef")
                .walletDecisioningInfo(
                    WalletDecisioningInfo.builder()
                        .accountScore("100")
                        .deviceScore("100")
                        .recommendedDecision("Decision1")
                        .addRecommendationReason("Reason1")
                        .build()
                )
                .device(
                    Device.builder()
                        .imei("123456789012345")
                        .ipAddress("1.1.1.1")
                        .location("37.3860517/-122.0838511")
                        .build()
                )
                .digitalWalletTokenMetadata(
                    DigitalWalletTokenMetadata.builder()
                        .paymentAccountInfo(
                            DigitalWalletTokenMetadata.PaymentAccountInfo.builder()
                                .accountHolderData(
                                    DigitalWalletTokenMetadata.PaymentAccountInfo.AccountHolderData
                                        .builder()
                                        .phoneNumber("+15555555555")
                                        .build()
                                )
                                .panUniqueReference("pan_unique_ref_1234567890123456789012345678")
                                .paymentAccountReference("ref_1234567890123456789012")
                                .tokenUniqueReference(
                                    "token_unique_ref_1234567890123456789012345678"
                                )
                                .build()
                        )
                        .status("Pending")
                        .paymentAppInstanceId("app_instance_123456789012345678901234567890")
                        .tokenRequestorId("12345678901")
                        .tokenRequestorName(DigitalWalletTokenMetadata.TokenRequestorName.APPLE_PAY)
                        .build()
                )
                .tokenizationSource(
                    TokenizationDecisioningRequestWebhookEvent.TokenizationSource.PUSH_PROVISION
                )
                .build()

        assertThat(tokenizationDecisioningRequestWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000002")
        assertThat(tokenizationDecisioningRequestWebhookEvent.cardToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(tokenizationDecisioningRequestWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2023-09-18T12:34:56Z"))
        assertThat(tokenizationDecisioningRequestWebhookEvent.eventType())
            .isEqualTo(
                TokenizationDecisioningRequestWebhookEvent.EventType
                    .DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
            )
        assertThat(tokenizationDecisioningRequestWebhookEvent.issuerDecision())
            .isEqualTo(TokenizationDecisioningRequestWebhookEvent.IssuerDecision.APPROVED)
        assertThat(tokenizationDecisioningRequestWebhookEvent.tokenizationChannel())
            .isEqualTo(
                TokenizationDecisioningRequestWebhookEvent.TokenizationChannel.DIGITAL_WALLET
            )
        assertThat(tokenizationDecisioningRequestWebhookEvent.tokenizationToken())
            .isEqualTo("tok_1234567890abcdef")
        assertThat(tokenizationDecisioningRequestWebhookEvent.walletDecisioningInfo())
            .isEqualTo(
                WalletDecisioningInfo.builder()
                    .accountScore("100")
                    .deviceScore("100")
                    .recommendedDecision("Decision1")
                    .addRecommendationReason("Reason1")
                    .build()
            )
        assertThat(tokenizationDecisioningRequestWebhookEvent.device())
            .contains(
                Device.builder()
                    .imei("123456789012345")
                    .ipAddress("1.1.1.1")
                    .location("37.3860517/-122.0838511")
                    .build()
            )
        assertThat(tokenizationDecisioningRequestWebhookEvent.digitalWalletTokenMetadata())
            .contains(
                DigitalWalletTokenMetadata.builder()
                    .paymentAccountInfo(
                        DigitalWalletTokenMetadata.PaymentAccountInfo.builder()
                            .accountHolderData(
                                DigitalWalletTokenMetadata.PaymentAccountInfo.AccountHolderData
                                    .builder()
                                    .phoneNumber("+15555555555")
                                    .build()
                            )
                            .panUniqueReference("pan_unique_ref_1234567890123456789012345678")
                            .paymentAccountReference("ref_1234567890123456789012")
                            .tokenUniqueReference("token_unique_ref_1234567890123456789012345678")
                            .build()
                    )
                    .status("Pending")
                    .paymentAppInstanceId("app_instance_123456789012345678901234567890")
                    .tokenRequestorId("12345678901")
                    .tokenRequestorName(DigitalWalletTokenMetadata.TokenRequestorName.APPLE_PAY)
                    .build()
            )
        assertThat(tokenizationDecisioningRequestWebhookEvent.tokenizationSource())
            .contains(TokenizationDecisioningRequestWebhookEvent.TokenizationSource.PUSH_PROVISION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationDecisioningRequestWebhookEvent =
            TokenizationDecisioningRequestWebhookEvent.builder()
                .accountToken("00000000-0000-0000-0000-000000000002")
                .cardToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2023-09-18T12:34:56Z"))
                .eventType(
                    TokenizationDecisioningRequestWebhookEvent.EventType
                        .DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                )
                .issuerDecision(TokenizationDecisioningRequestWebhookEvent.IssuerDecision.APPROVED)
                .tokenizationChannel(
                    TokenizationDecisioningRequestWebhookEvent.TokenizationChannel.DIGITAL_WALLET
                )
                .tokenizationToken("tok_1234567890abcdef")
                .walletDecisioningInfo(
                    WalletDecisioningInfo.builder()
                        .accountScore("100")
                        .deviceScore("100")
                        .recommendedDecision("Decision1")
                        .addRecommendationReason("Reason1")
                        .build()
                )
                .device(
                    Device.builder()
                        .imei("123456789012345")
                        .ipAddress("1.1.1.1")
                        .location("37.3860517/-122.0838511")
                        .build()
                )
                .digitalWalletTokenMetadata(
                    DigitalWalletTokenMetadata.builder()
                        .paymentAccountInfo(
                            DigitalWalletTokenMetadata.PaymentAccountInfo.builder()
                                .accountHolderData(
                                    DigitalWalletTokenMetadata.PaymentAccountInfo.AccountHolderData
                                        .builder()
                                        .phoneNumber("+15555555555")
                                        .build()
                                )
                                .panUniqueReference("pan_unique_ref_1234567890123456789012345678")
                                .paymentAccountReference("ref_1234567890123456789012")
                                .tokenUniqueReference(
                                    "token_unique_ref_1234567890123456789012345678"
                                )
                                .build()
                        )
                        .status("Pending")
                        .paymentAppInstanceId("app_instance_123456789012345678901234567890")
                        .tokenRequestorId("12345678901")
                        .tokenRequestorName(DigitalWalletTokenMetadata.TokenRequestorName.APPLE_PAY)
                        .build()
                )
                .tokenizationSource(
                    TokenizationDecisioningRequestWebhookEvent.TokenizationSource.PUSH_PROVISION
                )
                .build()

        val roundtrippedTokenizationDecisioningRequestWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationDecisioningRequestWebhookEvent),
                jacksonTypeRef<TokenizationDecisioningRequestWebhookEvent>(),
            )

        assertThat(roundtrippedTokenizationDecisioningRequestWebhookEvent)
            .isEqualTo(tokenizationDecisioningRequestWebhookEvent)
    }
}
