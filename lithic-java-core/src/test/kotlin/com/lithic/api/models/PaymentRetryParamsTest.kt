// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentRetryParamsTest {

    @Test
    fun create() {
        PaymentRetryParams.builder().paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentRetryParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "paymentToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
