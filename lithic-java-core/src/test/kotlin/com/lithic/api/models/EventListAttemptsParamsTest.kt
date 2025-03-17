// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListAttemptsParamsTest {

    @Test
    fun create() {
        EventListAttemptsParams.builder()
            .eventToken("event_token")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .pageSize(1L)
            .startingAfter("starting_after")
            .status(EventListAttemptsParams.Status.FAILED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventListAttemptsParams.builder()
                .eventToken("event_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .pageSize(1L)
                .startingAfter("starting_after")
                .status(EventListAttemptsParams.Status.FAILED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("begin", "2019-12-27T18:11:19.117Z")
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("ending_before", "ending_before")
                    .put("page_size", "1")
                    .put("starting_after", "starting_after")
                    .put("status", "FAILED")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventListAttemptsParams.builder().eventToken("event_token").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = EventListAttemptsParams.builder().eventToken("event_token").build()
        assertThat(params).isNotNull
        // path param "eventToken"
        assertThat(params.getPathParam(0)).isEqualTo("event_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
