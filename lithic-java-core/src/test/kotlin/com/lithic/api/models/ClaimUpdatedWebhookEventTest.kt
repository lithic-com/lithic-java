// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClaimUpdatedWebhookEventTest {

    @Test
    fun create() {
        val claimUpdatedWebhookEvent =
            ClaimUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDisputedTransaction(
                    ClaimUpdatedWebhookEvent.DisputedTransaction.builder()
                        .addEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .eventType(ClaimUpdatedWebhookEvent.EventType.CLAIM_UPDATED)
                .addOutstandingRequirement(
                    ClaimUpdatedWebhookEvent.OutstandingRequirement.QUESTIONNAIRE
                )
                .reason(ClaimUpdatedWebhookEvent.Reason.CARD_NOT_PRESENT)
                .status(ClaimUpdatedWebhookEvent.Status.INITIALIZING)
                .submitted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(claimUpdatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimUpdatedWebhookEvent.accountHolderToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimUpdatedWebhookEvent.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimUpdatedWebhookEvent.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(claimUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimUpdatedWebhookEvent.disputedTransactions())
            .containsExactly(
                ClaimUpdatedWebhookEvent.DisputedTransaction.builder()
                    .addEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(claimUpdatedWebhookEvent.eventType())
            .isEqualTo(ClaimUpdatedWebhookEvent.EventType.CLAIM_UPDATED)
        assertThat(claimUpdatedWebhookEvent.outstandingRequirements())
            .containsExactly(ClaimUpdatedWebhookEvent.OutstandingRequirement.QUESTIONNAIRE)
        assertThat(claimUpdatedWebhookEvent.reason())
            .isEqualTo(ClaimUpdatedWebhookEvent.Reason.CARD_NOT_PRESENT)
        assertThat(claimUpdatedWebhookEvent.status())
            .isEqualTo(ClaimUpdatedWebhookEvent.Status.INITIALIZING)
        assertThat(claimUpdatedWebhookEvent.submitted())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(claimUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val claimUpdatedWebhookEvent =
            ClaimUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDisputedTransaction(
                    ClaimUpdatedWebhookEvent.DisputedTransaction.builder()
                        .addEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .eventType(ClaimUpdatedWebhookEvent.EventType.CLAIM_UPDATED)
                .addOutstandingRequirement(
                    ClaimUpdatedWebhookEvent.OutstandingRequirement.QUESTIONNAIRE
                )
                .reason(ClaimUpdatedWebhookEvent.Reason.CARD_NOT_PRESENT)
                .status(ClaimUpdatedWebhookEvent.Status.INITIALIZING)
                .submitted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedClaimUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(claimUpdatedWebhookEvent),
                jacksonTypeRef<ClaimUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedClaimUpdatedWebhookEvent).isEqualTo(claimUpdatedWebhookEvent)
    }
}
