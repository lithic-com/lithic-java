package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class TransactionListParamsTest {

    @Test
    fun createTransactionListParams() {
      TransactionListParams.builder()
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .result(TransactionListParams.Result.APPROVED)
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .page(123L)
          .pageSize(123L)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = TransactionListParams.builder()
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .result(TransactionListParams.Result.APPROVED)
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .page(123L)
          .pageSize(123L)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      expected.put("card_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      expected.put("result", listOf(TransactionListParams.Result.APPROVED.toString()))
      expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("page", listOf("123"))
      expected.put("page_size", listOf("123"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = TransactionListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
