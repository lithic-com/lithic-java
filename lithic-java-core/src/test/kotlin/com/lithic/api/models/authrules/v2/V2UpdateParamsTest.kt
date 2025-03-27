// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.authrules.v2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2UpdateParamsTest {

    @Test
    fun create() {
        V2UpdateParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                V2UpdateParams.Body.AccountLevelRule.builder()
                    .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .state(V2UpdateParams.Body.AccountLevelRule.State.INACTIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            V2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(V2UpdateParams.Body.AccountLevelRule.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    V2UpdateParams.Body.AccountLevelRule.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .state(V2UpdateParams.Body.AccountLevelRule.State.INACTIVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                V2UpdateParams.Body.ofAccountLevelRule(
                    V2UpdateParams.Body.AccountLevelRule.builder()
                        .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .state(V2UpdateParams.Body.AccountLevelRule.State.INACTIVE)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(V2UpdateParams.Body.AccountLevelRule.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                V2UpdateParams.Body.ofAccountLevelRule(
                    V2UpdateParams.Body.AccountLevelRule.builder().build()
                )
            )
    }
}
