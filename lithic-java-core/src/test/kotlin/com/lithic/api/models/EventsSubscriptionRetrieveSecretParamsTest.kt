package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class EventsSubscriptionRetrieveSecretParamsTest {

    @Test
    fun createEventsSubscriptionRetrieveSecretParams() {
      EventsSubscriptionRetrieveSecretParams.builder()
          .eventSubscriptionToken("string")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = EventsSubscriptionRetrieveSecretParams.builder()
          .eventSubscriptionToken("string")
          .build()
      assertThat(params).isNotNull
      // path param "eventSubscriptionToken"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
