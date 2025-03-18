// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeTest {

    @Test
    fun create() {
        val dispute =
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
                .resolutionAmount(0L)
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(Dispute.ResolutionReason.CASE_LOST)
                .status(Dispute.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(dispute.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dispute.amount()).isEqualTo(0L)
        assertThat(dispute.arbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.customerFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.customerNote()).contains("customer_note")
        assertThat(dispute.networkClaimIds().getOrNull()).containsExactly("string")
        assertThat(dispute.networkFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.networkReasonCode()).contains("network_reason_code")
        assertThat(dispute.prearbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.primaryClaimId()).contains("primary_claim_id")
        assertThat(dispute.reason()).isEqualTo(Dispute.Reason.ATM_CASH_MISDISPENSE)
        assertThat(dispute.representmentDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.resolutionAmount()).contains(0L)
        assertThat(dispute.resolutionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.resolutionNote()).contains("resolution_note")
        assertThat(dispute.resolutionReason()).contains(Dispute.ResolutionReason.CASE_LOST)
        assertThat(dispute.status()).isEqualTo(Dispute.Status.ARBITRATION)
        assertThat(dispute.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
