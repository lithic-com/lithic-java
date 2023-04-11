package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*
import com.lithic.api.models.AuthRuleRemoveParams.AuthRuleRemoveBody

class AuthRuleRemoveParamsTest {

    @Test
    fun createAuthRuleRemoveParams() {
      AuthRuleRemoveParams.builder()
          .cardTokens(listOf("string"))
          .accountTokens(listOf("string"))
          .programLevel(true)
          .build()
    }

    @Test
    fun getBody() {
      val params = AuthRuleRemoveParams.builder()
          .cardTokens(listOf("string"))
          .accountTokens(listOf("string"))
          .programLevel(true)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardTokens()).isEqualTo(listOf("string"))
      assertThat(body.accountTokens()).isEqualTo(listOf("string"))
      assertThat(body.programLevel()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AuthRuleRemoveParams.builder().build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }
}
