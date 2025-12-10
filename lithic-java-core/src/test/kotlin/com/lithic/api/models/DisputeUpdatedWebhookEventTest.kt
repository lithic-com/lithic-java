// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeUpdatedWebhookEventTest {

    @Test
    fun create() {
        val disputeUpdatedWebhookEvent =
            DisputeUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .arbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("customer_note")
                .addNetworkClaimId("string")
                .networkFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .networkReasonCode("network_reason_code")
                .prearbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .primaryClaimId("primary_claim_id")
                .reason(Dispute.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(Dispute.ResolutionReason.CASE_LOST)
                .status(Dispute.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(DisputeUpdatedWebhookEvent.EventType.DISPUTE_UPDATED)
                .build()

        assertThat(disputeUpdatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeUpdatedWebhookEvent.amount()).isEqualTo(0L)
        assertThat(disputeUpdatedWebhookEvent.arbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeUpdatedWebhookEvent.customerFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeUpdatedWebhookEvent.customerNote()).contains("customer_note")
        assertThat(disputeUpdatedWebhookEvent.networkClaimIds().getOrNull())
            .containsExactly("string")
        assertThat(disputeUpdatedWebhookEvent.networkFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeUpdatedWebhookEvent.networkReasonCode()).contains("network_reason_code")
        assertThat(disputeUpdatedWebhookEvent.prearbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeUpdatedWebhookEvent.primaryClaimId()).contains("primary_claim_id")
        assertThat(disputeUpdatedWebhookEvent.reason())
            .isEqualTo(Dispute.Reason.ATM_CASH_MISDISPENSE)
        assertThat(disputeUpdatedWebhookEvent.representmentDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeUpdatedWebhookEvent.resolutionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeUpdatedWebhookEvent.resolutionNote()).contains("resolution_note")
        assertThat(disputeUpdatedWebhookEvent.resolutionReason())
            .contains(Dispute.ResolutionReason.CASE_LOST)
        assertThat(disputeUpdatedWebhookEvent.status()).isEqualTo(Dispute.Status.ARBITRATION)
        assertThat(disputeUpdatedWebhookEvent.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeUpdatedWebhookEvent.eventType())
            .isEqualTo(DisputeUpdatedWebhookEvent.EventType.DISPUTE_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeUpdatedWebhookEvent =
            DisputeUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .arbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("customer_note")
                .addNetworkClaimId("string")
                .networkFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .networkReasonCode("network_reason_code")
                .prearbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .primaryClaimId("primary_claim_id")
                .reason(Dispute.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(Dispute.ResolutionReason.CASE_LOST)
                .status(Dispute.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(DisputeUpdatedWebhookEvent.EventType.DISPUTE_UPDATED)
                .build()

        val roundtrippedDisputeUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeUpdatedWebhookEvent),
                jacksonTypeRef<DisputeUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeUpdatedWebhookEvent).isEqualTo(disputeUpdatedWebhookEvent)
    }
}
