// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTransferReverseParamsTest {

    @Test
    fun create() {
        BookTransferReverseParams.builder()
            .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BookTransferReverseParams.builder()
                .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BookTransferReverseParams.builder()
                .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.memo()).contains("memo")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BookTransferReverseParams.builder()
                .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
