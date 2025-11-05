// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeRetrieveResponseTest {

    @Test
    fun create() {
        val disputeRetrieveResponse =
            DisputeRetrieveResponse.builder()
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
                .reason(DisputeRetrieveResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeRetrieveResponse.ResolutionReason.CASE_LOST)
                .status(DisputeRetrieveResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(disputeRetrieveResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeRetrieveResponse.amount()).isEqualTo(0L)
        assertThat(disputeRetrieveResponse.arbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.customerFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.customerNote()).contains("customer_note")
        assertThat(disputeRetrieveResponse.networkClaimIds().getOrNull()).containsExactly("string")
        assertThat(disputeRetrieveResponse.networkFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.networkReasonCode()).contains("network_reason_code")
        assertThat(disputeRetrieveResponse.prearbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.primaryClaimId()).contains("primary_claim_id")
        assertThat(disputeRetrieveResponse.reason())
            .isEqualTo(DisputeRetrieveResponse.Reason.ATM_CASH_MISDISPENSE)
        assertThat(disputeRetrieveResponse.representmentDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.resolutionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.resolutionNote()).contains("resolution_note")
        assertThat(disputeRetrieveResponse.resolutionReason())
            .contains(DisputeRetrieveResponse.ResolutionReason.CASE_LOST)
        assertThat(disputeRetrieveResponse.status())
            .isEqualTo(DisputeRetrieveResponse.Status.ARBITRATION)
        assertThat(disputeRetrieveResponse.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeRetrieveResponse =
            DisputeRetrieveResponse.builder()
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
                .reason(DisputeRetrieveResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeRetrieveResponse.ResolutionReason.CASE_LOST)
                .status(DisputeRetrieveResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDisputeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeRetrieveResponse),
                jacksonTypeRef<DisputeRetrieveResponse>(),
            )

        assertThat(roundtrippedDisputeRetrieveResponse).isEqualTo(disputeRetrieveResponse)
    }
}
