package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.Dispute

class DisputeTest {

    @Test
    fun createDispute() {
      val dispute = Dispute.builder()
          .amount(123L)
          .arbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerNote("string")
          .networkClaimIds(listOf("string"))
          .primaryClaimId("string")
          .networkFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .networkReasonCode("string")
          .prearbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .reason(Dispute.Reason.ATM_CASH_MISDISPENSE)
          .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .resolutionAmount(123L)
          .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .resolutionNote("string")
          .resolutionReason(Dispute.ResolutionReason.CASE_LOST)
          .status(Dispute.Status.NEW)
          .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(dispute).isNotNull
      assertThat(dispute.amount()).isEqualTo(123L)
      assertThat(dispute.arbitrationDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(dispute.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(dispute.customerFiledDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(dispute.customerNote()).isEqualTo("string")
      assertThat(dispute.networkClaimIds()).containsExactly("string")
      assertThat(dispute.primaryClaimId()).isEqualTo("string")
      assertThat(dispute.networkFiledDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(dispute.networkReasonCode()).isEqualTo("string")
      assertThat(dispute.prearbitrationDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(dispute.reason()).isEqualTo(Dispute.Reason.ATM_CASH_MISDISPENSE)
      assertThat(dispute.representmentDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(dispute.resolutionAmount()).isEqualTo(123L)
      assertThat(dispute.resolutionDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(dispute.resolutionNote()).isEqualTo("string")
      assertThat(dispute.resolutionReason()).isEqualTo(Dispute.ResolutionReason.CASE_LOST)
      assertThat(dispute.status()).isEqualTo(Dispute.Status.NEW)
      assertThat(dispute.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(dispute.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
