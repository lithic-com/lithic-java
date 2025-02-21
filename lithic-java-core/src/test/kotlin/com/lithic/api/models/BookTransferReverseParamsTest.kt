// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookTransferReverseParamsTest {

    @Test
    fun create() {
        BookTransferReverseParams.builder()
            .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .build()
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

    @Test
    fun getPathParam() {
        val params =
            BookTransferReverseParams.builder()
                .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "bookTransferToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
