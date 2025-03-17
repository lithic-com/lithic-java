// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2ApplyParamsTest {

    @Test
    fun create() {
        AuthRuleV2ApplyParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                AuthRuleV2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                    .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2ApplyParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AuthRuleV2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2ApplyParams.Body.ofApplyAuthRuleRequestAccountTokens(
                    AuthRuleV2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2ApplyParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AuthRuleV2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2ApplyParams.Body.ofApplyAuthRuleRequestAccountTokens(
                    AuthRuleV2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            AuthRuleV2ApplyParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AuthRuleV2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "authRuleToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
