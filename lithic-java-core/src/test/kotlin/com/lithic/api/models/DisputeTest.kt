// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeTest {

    @Test
    fun createDispute() {
        val dispute =
            Dispute.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .arbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("string")
                .networkClaimIds(listOf("string"))
                .networkFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .networkReasonCode("string")
                .prearbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .primaryClaimId("string")
                .reason(Dispute.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionAmount(123L)
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("string")
                .resolutionReason(Dispute.ResolutionReason.CASE_LOST)
                .status(Dispute.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(dispute).isNotNull
        assertThat(dispute.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dispute.amount()).isEqualTo(123L)
        assertThat(dispute.arbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.customerFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.customerNote()).contains("string")
        assertThat(dispute.networkClaimIds().get()).containsExactly("string")
        assertThat(dispute.networkFiledDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.networkReasonCode()).contains("string")
        assertThat(dispute.prearbitrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.primaryClaimId()).contains("string")
        assertThat(dispute.reason()).isEqualTo(Dispute.Reason.ATM_CASH_MISDISPENSE)
        assertThat(dispute.representmentDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.resolutionAmount()).contains(123L)
        assertThat(dispute.resolutionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.resolutionNote()).contains("string")
        assertThat(dispute.resolutionReason()).contains(Dispute.ResolutionReason.CASE_LOST)
        assertThat(dispute.status()).isEqualTo(Dispute.Status.ARBITRATION)
        assertThat(dispute.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
