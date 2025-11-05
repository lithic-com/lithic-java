// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeDeleteResponseTest {

    @Test
    fun create() {
        val disputeDeleteResponse =
            DisputeDeleteResponse.builder()
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
                .reason(DisputeDeleteResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeDeleteResponse.ResolutionReason.CASE_LOST)
                .status(DisputeDeleteResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(disputeDeleteResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeDeleteResponse.amount()).isEqualTo(0L)
        assertThat(disputeDeleteResponse.arbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.customerFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.customerNote()).contains("customer_note")
        assertThat(disputeDeleteResponse.networkClaimIds().getOrNull()).containsExactly("string")
        assertThat(disputeDeleteResponse.networkFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.networkReasonCode()).contains("network_reason_code")
        assertThat(disputeDeleteResponse.prearbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.primaryClaimId()).contains("primary_claim_id")
        assertThat(disputeDeleteResponse.reason())
            .isEqualTo(DisputeDeleteResponse.Reason.ATM_CASH_MISDISPENSE)
        assertThat(disputeDeleteResponse.representmentDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.resolutionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.resolutionNote()).contains("resolution_note")
        assertThat(disputeDeleteResponse.resolutionReason())
            .contains(DisputeDeleteResponse.ResolutionReason.CASE_LOST)
        assertThat(disputeDeleteResponse.status())
            .isEqualTo(DisputeDeleteResponse.Status.ARBITRATION)
        assertThat(disputeDeleteResponse.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeDeleteResponse =
            DisputeDeleteResponse.builder()
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
                .reason(DisputeDeleteResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeDeleteResponse.ResolutionReason.CASE_LOST)
                .status(DisputeDeleteResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDisputeDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeDeleteResponse),
                jacksonTypeRef<DisputeDeleteResponse>(),
            )

        assertThat(roundtrippedDisputeDeleteResponse).isEqualTo(disputeDeleteResponse)
    }
}
