// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClaimCreatedWebhookEventTest {

    @Test
    fun create() {
        val claimCreatedWebhookEvent =
            ClaimCreatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDisputedTransaction(
                    ClaimCreatedWebhookEvent.DisputedTransaction.builder()
                        .addEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .eventType(ClaimCreatedWebhookEvent.EventType.CLAIM_CREATED)
                .addOutstandingRequirement(
                    ClaimCreatedWebhookEvent.OutstandingRequirement.QUESTIONNAIRE
                )
                .reason(ClaimCreatedWebhookEvent.Reason.CARD_NOT_PRESENT)
                .status(ClaimCreatedWebhookEvent.Status.INITIALIZING)
                .submitted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(claimCreatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimCreatedWebhookEvent.accountHolderToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimCreatedWebhookEvent.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimCreatedWebhookEvent.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimCreatedWebhookEvent.disputedTransactions())
            .containsExactly(
                ClaimCreatedWebhookEvent.DisputedTransaction.builder()
                    .addEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(claimCreatedWebhookEvent.eventType())
            .isEqualTo(ClaimCreatedWebhookEvent.EventType.CLAIM_CREATED)
        assertThat(claimCreatedWebhookEvent.outstandingRequirements())
            .containsExactly(ClaimCreatedWebhookEvent.OutstandingRequirement.QUESTIONNAIRE)
        assertThat(claimCreatedWebhookEvent.reason())
            .isEqualTo(ClaimCreatedWebhookEvent.Reason.CARD_NOT_PRESENT)
        assertThat(claimCreatedWebhookEvent.status())
            .isEqualTo(ClaimCreatedWebhookEvent.Status.INITIALIZING)
        assertThat(claimCreatedWebhookEvent.submitted())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val claimCreatedWebhookEvent =
            ClaimCreatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDisputedTransaction(
                    ClaimCreatedWebhookEvent.DisputedTransaction.builder()
                        .addEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .eventType(ClaimCreatedWebhookEvent.EventType.CLAIM_CREATED)
                .addOutstandingRequirement(
                    ClaimCreatedWebhookEvent.OutstandingRequirement.QUESTIONNAIRE
                )
                .reason(ClaimCreatedWebhookEvent.Reason.CARD_NOT_PRESENT)
                .status(ClaimCreatedWebhookEvent.Status.INITIALIZING)
                .submitted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedClaimCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(claimCreatedWebhookEvent),
                jacksonTypeRef<ClaimCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedClaimCreatedWebhookEvent).isEqualTo(claimCreatedWebhookEvent)
    }
}
