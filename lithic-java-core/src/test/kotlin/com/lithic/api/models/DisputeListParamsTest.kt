// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeListParamsTest {

    @Test
    fun createDisputeListParams() {
        DisputeListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .pageSize(100L)
            .startingAfter("starting_after")
            .status(DisputeListParams.Status.ARBITRATION)
            .transactionTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DisputeListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .pageSize(100L)
                .startingAfter("starting_after")
                .status(DisputeListParams.Status.ARBITRATION)
                .transactionTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("starting_after"))
        expected.put("status", listOf(DisputeListParams.Status.ARBITRATION.toString()))
        expected.put("transaction_tokens", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DisputeListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
