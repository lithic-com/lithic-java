// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2UpdateParamsTest {

    @Test
    fun create() {
        AuthRuleV2UpdateParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                AuthRuleV2UpdateParams.Body.UnionMember0.builder()
                    .name("name")
                    .state(AuthRuleV2UpdateParams.Body.UnionMember0.State.INACTIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AuthRuleV2UpdateParams.Body.UnionMember0.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AuthRuleV2UpdateParams.Body.UnionMember0.builder()
                        .name("name")
                        .state(AuthRuleV2UpdateParams.Body.UnionMember0.State.INACTIVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2UpdateParams.Body.ofUnionMember0(
                    AuthRuleV2UpdateParams.Body.UnionMember0.builder()
                        .name("name")
                        .state(AuthRuleV2UpdateParams.Body.UnionMember0.State.INACTIVE)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AuthRuleV2UpdateParams.Body.UnionMember0.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRuleV2UpdateParams.Body.ofUnionMember0(
                    AuthRuleV2UpdateParams.Body.UnionMember0.builder().build()
                )
            )
    }
}
