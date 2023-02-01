package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AuthRuleRemoveResponse

class AuthRuleRemoveResponseTest {

    @Test
    fun createAuthRuleRemoveResponse() {
      val authRuleRemoveResponse = AuthRuleRemoveResponse.builder()
          .accountTokens(listOf("string"))
          .cardTokens(listOf("string"))
          .previousAuthRuleTokens(listOf("string"))
          .programLevel(true)
          .build()
      assertThat(authRuleRemoveResponse).isNotNull
      assertThat(authRuleRemoveResponse.accountTokens().get()).containsExactly("string")
      assertThat(authRuleRemoveResponse.cardTokens().get()).containsExactly("string")
      assertThat(authRuleRemoveResponse.previousAuthRuleTokens().get()).containsExactly("string")
      assertThat(authRuleRemoveResponse.programLevel()).contains(true)
    }
}
