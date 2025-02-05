// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleV2BacktestCreateParamsTest {

    @Test
    fun create() {
        AuthRuleV2BacktestCreateParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthRuleV2BacktestCreateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.end()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.start()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthRuleV2BacktestCreateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AuthRuleV2BacktestCreateParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "authRuleToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
