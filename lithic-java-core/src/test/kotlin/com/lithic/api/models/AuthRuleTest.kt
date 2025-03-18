// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleTest {

    @Test
    fun create() {
        val authRule =
            AuthRule.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .state(AuthRule.State.ACTIVE)
                .addAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addAllowedCountry("MEX")
                .addAllowedMcc("3000")
                .addBlockedCountry("CAN")
                .addBlockedCountry("USA")
                .addBlockedMcc("5811")
                .addBlockedMcc("5812")
                .addCardToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .programLevel(false)
                .build()

        assertThat(authRule.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authRule.state()).isEqualTo(AuthRule.State.ACTIVE)
        assertThat(authRule.accountTokens().getOrNull())
            .containsExactly("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(authRule.allowedCountries().getOrNull()).containsExactly("MEX")
        assertThat(authRule.allowedMcc().getOrNull()).containsExactly("3000")
        assertThat(authRule.blockedCountries().getOrNull()).containsExactly("CAN", "USA")
        assertThat(authRule.blockedMcc().getOrNull()).containsExactly("5811", "5812")
        assertThat(authRule.cardTokens().getOrNull())
            .containsExactly("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(authRule.programLevel()).contains(false)
    }
}
