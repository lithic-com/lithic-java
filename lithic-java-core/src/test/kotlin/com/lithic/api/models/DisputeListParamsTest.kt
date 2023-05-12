package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeListParamsTest {

    @Test
    fun createDisputeListParams() {
        DisputeListParams.builder()
            .transactionTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .status(DisputeListParams.Status.NEW)
            .pageSize(123L)
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingAfter("string")
            .endingBefore("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DisputeListParams.builder()
                .transactionTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .status(DisputeListParams.Status.NEW)
                .pageSize(123L)
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingAfter("string")
                .endingBefore("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("transaction_tokens", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("status", listOf(DisputeListParams.Status.NEW.toString()))
        expected.put("page_size", listOf("123"))
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("starting_after", listOf("string"))
        expected.put("ending_before", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DisputeListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
