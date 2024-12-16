// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleV2UpdateParamsTest {

    @Test
    fun createAuthRuleV2UpdateParams() {
        AuthRuleV2UpdateParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .state(AuthRuleV2UpdateParams.State.INACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .state(AuthRuleV2UpdateParams.State.INACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.state()).isEqualTo(AuthRuleV2UpdateParams.State.INACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AuthRuleV2UpdateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "authRuleToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
