// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.authrules.v2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2ApplyParamsTest {

    @Test
    fun create() {
        V2ApplyParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                V2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                    .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            V2ApplyParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    V2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V2ApplyParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    V2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                V2ApplyParams.Body.ofApplyAuthRuleRequestAccountTokens(
                    V2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }
}
