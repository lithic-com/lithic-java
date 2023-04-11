package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
        val params =
            AuthRuleRemoveParams.builder()
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
