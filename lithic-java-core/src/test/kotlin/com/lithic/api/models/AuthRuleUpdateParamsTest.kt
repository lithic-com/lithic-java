package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.google.common.collect.ArrayListMultimap
import com.lithic.api.models.*
import com.lithic.api.models.AuthRuleUpdateParams.AuthRuleUpdateBody

class AuthRuleUpdateParamsTest {

    @Test
    fun createAuthRuleUpdateParams() {
      AuthRuleUpdateParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .allowedMcc(listOf("string"))
          .blockedMcc(listOf("string"))
          .allowedCountries(listOf("string"))
          .blockedCountries(listOf("string"))
          .avsType(AuthRuleUpdateParams.AvsType.ZIP_ONLY)
          .build()
    }

    @Test
    fun toBody() {
      val params = AuthRuleUpdateParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .allowedMcc(listOf("string"))
          .blockedMcc(listOf("string"))
          .allowedCountries(listOf("string"))
          .blockedCountries(listOf("string"))
          .avsType(AuthRuleUpdateParams.AvsType.ZIP_ONLY)
          .build()
      val body = params.toBody()
      assertThat(body).isNotNull
      assertThat(body.allowedMcc()).isEqualTo(listOf("string"))
      assertThat(body.blockedMcc()).isEqualTo(listOf("string"))
      assertThat(body.allowedCountries()).isEqualTo(listOf("string"))
      assertThat(body.blockedCountries()).isEqualTo(listOf("string"))
      assertThat(body.avsType()).isEqualTo(AuthRuleUpdateParams.AvsType.ZIP_ONLY)
    }

    @Test
    fun toBodyWithoutOptionalFields() {
      val params = AuthRuleUpdateParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.toBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = AuthRuleUpdateParams.builder()
          .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "authRuleToken"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
