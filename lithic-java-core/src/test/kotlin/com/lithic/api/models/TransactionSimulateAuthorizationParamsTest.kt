package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*
import com.lithic.api.models.TransactionSimulateAuthorizationParams.TransactionSimulateAuthorizationBody

class TransactionSimulateAuthorizationParamsTest {

    @Test
    fun createTransactionSimulateAuthorizationParams() {
      TransactionSimulateAuthorizationParams.builder()
          .amount(123L)
          .descriptor("COFFEE SHOP")
          .pan("4111111289144142")
          .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
          .merchantAcceptorId("OODKZAPJVN4YS7O")
          .merchantCurrency("GBP")
          .merchantAmount(123L)
          .mcc("5812")
          .partialApprovalCapable(true)
          .build()
    }

    @Test
    fun getBody() {
      val params = TransactionSimulateAuthorizationParams.builder()
          .amount(123L)
          .descriptor("COFFEE SHOP")
          .pan("4111111289144142")
          .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
          .merchantAcceptorId("OODKZAPJVN4YS7O")
          .merchantCurrency("GBP")
          .merchantAmount(123L)
          .mcc("5812")
          .partialApprovalCapable(true)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
      assertThat(body.pan()).isEqualTo("4111111289144142")
      assertThat(body.status()).isEqualTo(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
      assertThat(body.merchantAcceptorId()).isEqualTo("OODKZAPJVN4YS7O")
      assertThat(body.merchantCurrency()).isEqualTo("GBP")
      assertThat(body.merchantAmount()).isEqualTo(123L)
      assertThat(body.mcc()).isEqualTo("5812")
      assertThat(body.partialApprovalCapable()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = TransactionSimulateAuthorizationParams.builder()
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
