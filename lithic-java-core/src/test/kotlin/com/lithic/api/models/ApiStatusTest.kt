package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.ApiStatus

class ApiStatusTest {

    @Test
    fun createApiStatus() {
      val apiStatus = ApiStatus.builder()
          .message("string")
          .build()
      assertThat(apiStatus).isNotNull
      assertThat(apiStatus.message()).contains("string")
    }
}
