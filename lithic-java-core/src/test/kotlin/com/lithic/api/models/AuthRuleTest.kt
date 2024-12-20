// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleTest {

    @Test
    fun createAuthRule() {
        val authRule =
            AuthRule.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .state(AuthRule.State.ACTIVE)
                .accountTokens(listOf("string"))
                .allowedCountries(listOf("string"))
                .allowedMcc(listOf("string"))
                .blockedCountries(listOf("string"))
                .blockedMcc(listOf("string"))
                .cardTokens(listOf("string"))
                .programLevel(false)
                .build()
        assertThat(authRule).isNotNull
        assertThat(authRule.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.state()).isEqualTo(AuthRule.State.ACTIVE)
        assertThat(authRule.accountTokens().get()).containsExactly("string")
        assertThat(authRule.allowedCountries().get()).containsExactly("string")
        assertThat(authRule.allowedMcc().get()).containsExactly("string")
        assertThat(authRule.blockedCountries().get()).containsExactly("string")
        assertThat(authRule.blockedMcc().get()).containsExactly("string")
        assertThat(authRule.cardTokens().get()).containsExactly("string")
        assertThat(authRule.programLevel()).contains(false)
    }
}
