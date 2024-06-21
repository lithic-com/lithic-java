// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookTransferReverseParamsTest {

    @Test
    fun createBookTransferReverseParams() {
        BookTransferReverseParams.builder()
            .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BookTransferReverseParams.builder()
                .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.memo()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            BookTransferReverseParams.builder()
                .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
