package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*
import com.lithic.api.models.TransactionSimulateCreditAuthorizationParams.TransactionSimulateCreditAuthorizationBody

class TransactionSimulateCreditAuthorizationParamsTest {

    @Test
    fun createTransactionSimulateCreditAuthorizationParams() {
      TransactionSimulateCreditAuthorizationParams.builder()
          .amount(123L)
          .descriptor("COFFEE SHOP")
          .pan("4111111289144142")
          .merchantAcceptorId("XRKGDPOWEWQRRWU")
          .mcc("5812")
          .build()
    }

    @Test
    fun getBody() {
      val params = TransactionSimulateCreditAuthorizationParams.builder()
          .amount(123L)
          .descriptor("COFFEE SHOP")
          .pan("4111111289144142")
          .merchantAcceptorId("XRKGDPOWEWQRRWU")
          .mcc("5812")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
      assertThat(body.pan()).isEqualTo("4111111289144142")
      assertThat(body.merchantAcceptorId()).isEqualTo("XRKGDPOWEWQRRWU")
      assertThat(body.mcc()).isEqualTo("5812")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = TransactionSimulateCreditAuthorizationParams.builder()
          .amount(123L)
          .descriptor("COFFEE SHOP")
          .pan("4111111289144142")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
      assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
