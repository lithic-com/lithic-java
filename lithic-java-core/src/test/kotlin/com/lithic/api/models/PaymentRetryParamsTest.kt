// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetryParamsTest {

    @Test
    fun create() {
        PaymentRetryParams.builder()
            .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .method(PaymentRetryParams.Method.ACH_SAME_DAY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentRetryParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PaymentRetryParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(PaymentRetryParams.Method.ACH_SAME_DAY)
                .build()

        val body = params._body()

        assertThat(body.method()).contains(PaymentRetryParams.Method.ACH_SAME_DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentRetryParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
