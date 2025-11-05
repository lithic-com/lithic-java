// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListParamsTest {

    @Test
    fun create() {
        EventListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .addEventType(EventListParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED)
            .pageSize(1L)
            .startingAfter("starting_after")
            .withContent(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .addEventType(EventListParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED)
                .pageSize(1L)
                .startingAfter("starting_after")
                .withContent(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("begin", "2019-12-27T18:11:19.117Z")
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("ending_before", "ending_before")
                    .put("event_types", listOf("account_holder_document.updated").joinToString(","))
                    .put("page_size", "1")
                    .put("starting_after", "starting_after")
                    .put("with_content", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
