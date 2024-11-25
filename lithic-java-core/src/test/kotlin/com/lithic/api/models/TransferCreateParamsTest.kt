// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransferCreateParamsTest {

    @Test
    fun createTransferCreateParams() {
        TransferCreateParams.builder()
            .amount(0L)
            .from("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .to("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransferCreateParams.builder()
                .amount(0L)
                .from("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .to("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.from()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.to()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).isEqualTo("memo")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransferCreateParams.builder()
                .amount(0L)
                .from("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .to("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.from()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.to()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
