// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeListPageResponseTest {

    @Test
    fun create() {
        val disputeListPageResponse =
            DisputeListPageResponse.builder()
                .addData(
                    Dispute.builder()
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
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(disputeListPageResponse.data())
            .containsExactly(
                Dispute.builder()
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
                    .build()
            )
        assertThat(disputeListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeListPageResponse =
            DisputeListPageResponse.builder()
                .addData(
                    Dispute.builder()
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
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedDisputeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeListPageResponse),
                jacksonTypeRef<DisputeListPageResponse>(),
            )

        assertThat(roundtrippedDisputeListPageResponse).isEqualTo(disputeListPageResponse)
    }
}
