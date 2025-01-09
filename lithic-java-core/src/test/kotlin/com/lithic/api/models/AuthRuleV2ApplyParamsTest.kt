// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleV2ApplyParamsTest {

    @Test
    fun createAuthRuleV2ApplyParams() {
        AuthRuleV2ApplyParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .forApplyAuthRuleRequestAccountTokens(
                AuthRuleV2ApplyParams.ApplyAuthRuleRequestAccountTokens.builder()
                    .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AuthRuleV2ApplyParams.builder()
                .forApplyAuthRuleRequestAccountTokens(
                    AuthRuleV2ApplyParams.ApplyAuthRuleRequestAccountTokens.builder()
                        .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .build()
                )
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "authRuleToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
