// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringQueueListParamsTest {

    @Test
    fun create() {
        TransactionMonitoringQueueListParams.builder()
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransactionMonitoringQueueListParams.builder()
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "1")
                    .put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionMonitoringQueueListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
