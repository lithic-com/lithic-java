// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleRemoveResponseTest {

    @Test
    fun createAuthRuleRemoveResponse() {
        val authRuleRemoveResponse =
            AuthRuleRemoveResponse.builder()
                .accountTokens(listOf("string"))
                .cardTokens(listOf("string"))
                .programLevel(true)
                .build()
        assertThat(authRuleRemoveResponse).isNotNull
        assertThat(authRuleRemoveResponse.accountTokens().get()).containsExactly("string")
        assertThat(authRuleRemoveResponse.cardTokens().get()).containsExactly("string")
        assertThat(authRuleRemoveResponse.programLevel()).contains(true)
    }
}
