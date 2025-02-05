// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountUpdateParamsTest {

    @Test
    fun create() {
        FinancialAccountUpdateParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .nickname("nickname")
            .build()
    }

    @Test
    fun body() {
        val params =
            FinancialAccountUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .nickname("nickname")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.nickname()).contains("nickname")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FinancialAccountUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountUpdateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
