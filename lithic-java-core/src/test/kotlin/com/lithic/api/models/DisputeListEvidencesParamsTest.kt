package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class DisputeListEvidencesParamsTest {

    @Test
    fun createDisputeListEvidencesParams() {
      DisputeListEvidencesParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .pageSize(123L)
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .startingAfter("string")
          .endingBefore("string")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = DisputeListEvidencesParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .pageSize(123L)
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .startingAfter("string")
          .endingBefore("string")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("page_size", listOf("123"))
      expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("starting_after", listOf("string"))
      expected.put("ending_before", listOf("string"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = DisputeListEvidencesParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = DisputeListEvidencesParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "disputeToken"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
