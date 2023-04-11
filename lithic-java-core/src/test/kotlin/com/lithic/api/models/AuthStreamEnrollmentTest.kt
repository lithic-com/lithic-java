package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AuthStreamEnrollment

class AuthStreamEnrollmentTest {

    @Test
    fun createAuthStreamEnrollment() {
      val authStreamEnrollment = AuthStreamEnrollment.builder()
          .enrolled(true)
          .build()
      assertThat(authStreamEnrollment).isNotNull
      assertThat(authStreamEnrollment.enrolled()).contains(true)
    }
}
