// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleV2UpdateParamsTest {

    @Test
    fun create() {
        AuthRuleV2UpdateParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                AuthRuleV2UpdateParams.Body.AccountLevelRule.builder()
                    .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .state(AuthRuleV2UpdateParams.Body.AccountLevelRule.State.INACTIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AuthRuleV2UpdateParams.Body.AccountLevelRule.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .state(AuthRuleV2UpdateParams.Body.AccountLevelRule.State.INACTIVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                AuthRuleV2UpdateParams.Body.ofAccountLevelRule(
                    AuthRuleV2UpdateParams.Body.AccountLevelRule.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .state(AuthRuleV2UpdateParams.Body.AccountLevelRule.State.INACTIVE)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AuthRuleV2UpdateParams.Body.AccountLevelRule.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                AuthRuleV2UpdateParams.Body.ofAccountLevelRule(
                    AuthRuleV2UpdateParams.Body.AccountLevelRule.builder().build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AuthRuleV2UpdateParams.Body.AccountLevelRule.builder().build())
                .build()
        assertThat(params).isNotNull
        // path param "authRuleToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
