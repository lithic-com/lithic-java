// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProgramListParamsTest {

    @Test
    fun createCardProgramListParams() {
        CardProgramListParams.builder()
            .endingBefore("ending_before")
            .pageSize(100L)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardProgramListParams.builder()
                .endingBefore("ending_before")
                .pageSize(100L)
                .startingAfter("starting_after")
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "ending_before")
        expected.put("page_size", "100")
        expected.put("starting_after", "starting_after")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardProgramListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
