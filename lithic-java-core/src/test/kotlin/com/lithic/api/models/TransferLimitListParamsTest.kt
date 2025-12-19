// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferLimitListParamsTest {

    @Test
    fun create() {
        TransferLimitListParams.builder().date(LocalDate.parse("2019-12-27")).build()
    }

    @Test
    fun queryParams() {
        val params = TransferLimitListParams.builder().date(LocalDate.parse("2019-12-27")).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("date", "2019-12-27").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransferLimitListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
