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
                .accountTokens(listOf("3fa85f64-5717-4562-b3fc-2c963f66afa6"))
                .allowedCountries(listOf("MEX"))
                .allowedMcc(listOf("3000"))
                .blockedCountries(listOf("CAN", "USA"))
                .blockedMcc(listOf("5811", "5812"))
                .cardTokens(listOf("3fa85f64-5717-4562-b3fc-2c963f66afa6"))
                .programLevel(false)
                .build()
        assertThat(authRule).isNotNull
        assertThat(authRule.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.state()).isEqualTo(AuthRule.State.ACTIVE)
        assertThat(authRule.accountTokens().get())
            .containsExactly("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(authRule.allowedCountries().get()).containsExactly("MEX")
        assertThat(authRule.allowedMcc().get()).containsExactly("3000")
        assertThat(authRule.blockedCountries().get()).containsExactly("CAN", "USA")
        assertThat(authRule.blockedMcc().get()).containsExactly("5811", "5812")
        assertThat(authRule.cardTokens().get())
            .containsExactly("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(authRule.programLevel()).contains(false)
    }
}
