// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountListParamsTest {

    @Test
    fun createAccountListParams() {
        AccountListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .pageSize(100L)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .pageSize(100L)
                .startingAfter("starting_after")
                .build()
        val expected = QueryParams.builder()
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("end", "2019-12-27T18:11:19.117Z")
        expected.put("ending_before", "ending_before")
        expected.put("page_size", "100")
        expected.put("starting_after", "starting_after")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
