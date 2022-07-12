package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleTest {
    @Test
    fun createAuthRule() {
        val authRule =
            AuthRule.builder()
                .allowedMcc(listOf("string"))
                .blockedMcc(listOf("string"))
                .allowedCountries(listOf("string"))
                .blockedCountries(listOf("string"))
                .avsType(AuthRule.AvsType.ZIP_ONLY)
                .accountTokens(listOf("string"))
                .cardTokens(listOf("string"))
                .programLevel(true)
                .build()
        assertThat(authRule).isNotNull
        assertThat(authRule.allowedMcc().get()).containsExactly("string")
        assertThat(authRule.blockedMcc().get()).containsExactly("string")
        assertThat(authRule.allowedCountries().get()).containsExactly("string")
        assertThat(authRule.blockedCountries().get()).containsExactly("string")
        assertThat(authRule.avsType()).contains(AuthRule.AvsType.ZIP_ONLY)
        assertThat(authRule.accountTokens().get()).containsExactly("string")
        assertThat(authRule.cardTokens().get()).containsExactly("string")
        assertThat(authRule.programLevel()).contains(true)
    }
}
