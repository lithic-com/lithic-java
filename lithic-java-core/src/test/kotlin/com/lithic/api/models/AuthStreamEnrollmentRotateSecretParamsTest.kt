package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class AuthStreamEnrollmentRotateSecretParamsTest {

    @Test
    fun createAuthStreamEnrollmentRotateSecretParams() {
      AuthStreamEnrollmentRotateSecretParams.builder().build()
    }
}
