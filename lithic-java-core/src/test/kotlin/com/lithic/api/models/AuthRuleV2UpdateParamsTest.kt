// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleV2UpdateParamsTest {

    @Test
    fun create() {
        AuthRuleV2UpdateParams.builder()
            .forAccountLevelRule(
                AuthRuleV2UpdateParams.AccountLevelRule.builder()
                    .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .name("name")
                    .state(AuthRuleV2UpdateParams.AccountLevelRule.State.INACTIVE)
                    .build()
            )
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .forAccountLevelRule(AuthRuleV2UpdateParams.AccountLevelRule.builder().build())
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "authRuleToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
