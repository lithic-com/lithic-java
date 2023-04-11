package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*
import com.lithic.api.models.AuthRuleApplyParams.AuthRuleApplyBody

class AuthRuleApplyParamsTest {

    @Test
    fun createAuthRuleApplyParams() {
      AuthRuleApplyParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .cardTokens(listOf("string"))
          .accountTokens(listOf("string"))
          .programLevel(true)
          .build()
    }

    @Test
    fun getBody() {
      val params = AuthRuleApplyParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
      val params = AuthRuleApplyParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = AuthRuleApplyParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "authRuleToken"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
