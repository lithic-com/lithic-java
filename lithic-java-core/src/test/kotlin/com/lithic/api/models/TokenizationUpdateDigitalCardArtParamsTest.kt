// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationUpdateDigitalCardArtParamsTest {

    @Test
    fun create() {
        TokenizationUpdateDigitalCardArtParams.builder()
            .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .digitalCardArtToken("5e9483eb-8103-4e16-9794-2106111b2eca")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenizationUpdateDigitalCardArtParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenizationUpdateDigitalCardArtParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .digitalCardArtToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .build()

        val body = params._body()

        assertThat(body.digitalCardArtToken()).contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenizationUpdateDigitalCardArtParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
