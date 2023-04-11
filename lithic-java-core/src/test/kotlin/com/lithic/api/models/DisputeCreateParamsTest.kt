package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*
import com.lithic.api.models.DisputeCreateParams.DisputeCreateBody

class DisputeCreateParamsTest {

    @Test
    fun createDisputeCreateParams() {
      DisputeCreateParams.builder()
          .amount(123L)
          .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
          .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .customerNote("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = DisputeCreateParams.builder()
          .amount(123L)
          .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
          .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .customerNote("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.customerFiledDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
      assertThat(body.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.customerNote()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = DisputeCreateParams.builder()
          .amount(123L)
          .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
          .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.reason()).isEqualTo(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
      assertThat(body.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
