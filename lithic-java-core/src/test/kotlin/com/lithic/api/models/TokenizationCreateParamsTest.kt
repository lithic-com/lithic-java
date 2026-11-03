// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationCreateParamsTest {

    @Test
    fun create() {
        TokenizationCreateParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .agentToken("20f418a7-27c2-486c-aeee-3ad2beb87c91")
            .type(TokenizationCreateParams.Type.AGENT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenizationCreateParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .agentToken("20f418a7-27c2-486c-aeee-3ad2beb87c91")
                .type(TokenizationCreateParams.Type.AGENT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenizationCreateParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .agentToken("20f418a7-27c2-486c-aeee-3ad2beb87c91")
                .type(TokenizationCreateParams.Type.AGENT)
                .build()

        val body = params._body()

        assertThat(body.agentToken()).isEqualTo("20f418a7-27c2-486c-aeee-3ad2beb87c91")
        assertThat(body.type()).isEqualTo(TokenizationCreateParams.Type.AGENT)
    }
}
