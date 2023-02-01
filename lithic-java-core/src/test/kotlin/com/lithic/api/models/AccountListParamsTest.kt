package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.google.common.collect.ArrayListMultimap
import com.lithic.api.models.*

class AccountListParamsTest {

    @Test
    fun createAccountListParams() {
      AccountListParams.builder()
          .begin("2019-12-27T18:11:19.117Z")
          .end("2019-12-27T18:11:19.117Z")
          .page(123L)
          .pageSize(123L)
          .build()
    }

    @Test
    fun toQueryParams() {
      val params = AccountListParams.builder()
          .begin("2019-12-27T18:11:19.117Z")
          .end("2019-12-27T18:11:19.117Z")
          .page(123L)
          .pageSize(123L)
          .build()
      val expected = ArrayListMultimap.create<String, String>()
      expected.put("begin", "2019-12-27T18:11:19.117Z")
      expected.put("end", "2019-12-27T18:11:19.117Z")
      expected.put("page", "123")
      expected.put("page_size", "123")
      assertThat(params.toQueryParams()).isEqualTo(expected)
    }

    @Test
    fun toQueryParamsWithoutOptionalFields() {
      val params = AccountListParams.builder().build()
      val expected = ArrayListMultimap.create<String, String>()
      assertThat(params.toQueryParams()).isEqualTo(expected)
    }
}
