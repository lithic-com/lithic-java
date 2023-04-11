package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class EventsSubscriptionRecoverParamsTest {

    @Test
    fun createEventsSubscriptionRecoverParams() {
      EventsSubscriptionRecoverParams.builder()
          .eventSubscriptionToken("string")
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = EventsSubscriptionRecoverParams.builder()
          .eventSubscriptionToken("string")
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = EventsSubscriptionRecoverParams.builder()
          .eventSubscriptionToken("string")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = EventsSubscriptionRecoverParams.builder()
          .eventSubscriptionToken("string")
          .build()
      assertThat(params).isNotNull
      // path param "eventSubscriptionToken"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
