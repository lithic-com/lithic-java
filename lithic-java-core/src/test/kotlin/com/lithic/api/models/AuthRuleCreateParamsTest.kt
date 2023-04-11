package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleCreateParamsTest {

    @Test
    fun createAuthRuleCreateParams() {
        AuthRuleCreateParams.builder()
            .allowedMcc(listOf("string"))
            .blockedMcc(listOf("string"))
            .allowedCountries(listOf("string"))
            .blockedCountries(listOf("string"))
            .avsType(AuthRuleCreateParams.AvsType.ZIP_ONLY)
            .accountTokens(listOf("string"))
            .cardTokens(listOf("string"))
            .programLevel(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AuthRuleCreateParams.builder()
                .allowedMcc(listOf("string"))
                .blockedMcc(listOf("string"))
                .allowedCountries(listOf("string"))
                .blockedCountries(listOf("string"))
                .avsType(AuthRuleCreateParams.AvsType.ZIP_ONLY)
                .accountTokens(listOf("string"))
                .cardTokens(listOf("string"))
                .programLevel(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.allowedMcc()).isEqualTo(listOf("string"))
        assertThat(body.blockedMcc()).isEqualTo(listOf("string"))
        assertThat(body.allowedCountries()).isEqualTo(listOf("string"))
        assertThat(body.blockedCountries()).isEqualTo(listOf("string"))
        assertThat(body.avsType()).isEqualTo(AuthRuleCreateParams.AvsType.ZIP_ONLY)
        assertThat(body.accountTokens()).isEqualTo(listOf("string"))
        assertThat(body.cardTokens()).isEqualTo(listOf("string"))
        assertThat(body.programLevel()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AuthRuleCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
