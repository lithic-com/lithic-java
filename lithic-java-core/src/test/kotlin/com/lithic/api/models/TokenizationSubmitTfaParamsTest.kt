// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationSubmitTfaParamsTest {

    @Test
    fun create() {
        TokenizationSubmitTfaParams.builder()
            .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .value("01929")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenizationSubmitTfaParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .value("01929")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenizationSubmitTfaParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .value("01929")
                .build()

        val body = params._body()

        assertThat(body.value()).isEqualTo("01929")
    }
}
