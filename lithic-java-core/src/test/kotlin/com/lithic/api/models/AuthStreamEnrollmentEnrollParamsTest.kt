package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.google.common.collect.ArrayListMultimap
import com.lithic.api.models.*
import com.lithic.api.models.AuthStreamEnrollmentEnrollParams.AuthStreamEnrollmentEnrollBody

class AuthStreamEnrollmentEnrollParamsTest {

    @Test
    fun createAuthStreamEnrollmentEnrollParams() {
      AuthStreamEnrollmentEnrollParams.builder()
          .webhookUrl("https://example.com")
          .build()
    }

    @Test
    fun toBody() {
      val params = AuthStreamEnrollmentEnrollParams.builder()
          .webhookUrl("https://example.com")
          .build()
      val body = params.toBody()
      assertThat(body).isNotNull
      assertThat(body.webhookUrl()).isEqualTo("https://example.com")
    }

    @Test
    fun toBodyWithoutOptionalFields() {
      val params = AuthStreamEnrollmentEnrollParams.builder().build()
      val body = params.toBody()
      assertThat(body).isNotNull
    }
}
