package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class CardEmbedParamsTest {

    @Test
    fun createCardEmbedParams() {
      CardEmbedParams.builder()
          .embedRequest("string")
          .hmac("string")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = CardEmbedParams.builder()
          .embedRequest("string")
          .hmac("string")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("embed_request", listOf("string"))
      expected.put("hmac", listOf("string"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = CardEmbedParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
