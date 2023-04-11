package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class EventRetrieveParamsTest {

    @Test
    fun createEventRetrieveParams() {
      EventRetrieveParams.builder()
          .eventToken("string")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = EventRetrieveParams.builder()
          .eventToken("string")
          .build()
      assertThat(params).isNotNull
      // path param "eventToken"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
