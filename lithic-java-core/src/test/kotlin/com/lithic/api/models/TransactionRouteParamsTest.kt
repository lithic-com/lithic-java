// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionRouteParamsTest {

    @Test
    fun create() {
        TransactionRouteParams.builder()
            .transactionToken("00000000-0000-0000-0000-000000000000")
            .financialAccountToken("00000000-0000-0000-0000-000000000000")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TransactionRouteParams.builder()
                .transactionToken("00000000-0000-0000-0000-000000000000")
                .financialAccountToken("00000000-0000-0000-0000-000000000000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TransactionRouteParams.builder()
                .transactionToken("00000000-0000-0000-0000-000000000000")
                .financialAccountToken("00000000-0000-0000-0000-000000000000")
                .build()

        val body = params._body()

        assertThat(body.financialAccountToken()).isEqualTo("00000000-0000-0000-0000-000000000000")
    }
}
