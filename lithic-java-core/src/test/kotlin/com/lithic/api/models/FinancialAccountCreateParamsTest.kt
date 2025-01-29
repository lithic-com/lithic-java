// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountCreateParamsTest {

    @Test
    fun createFinancialAccountCreateParams() {
        FinancialAccountCreateParams.builder()
            .nickname("nickname")
            .type(FinancialAccountCreateParams.Type.OPERATING)
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .isForBenefitOf(true)
            .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            FinancialAccountCreateParams.builder()
                .nickname("nickname")
                .type(FinancialAccountCreateParams.Type.OPERATING)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isForBenefitOf(true)
                .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.nickname()).isEqualTo("nickname")
        assertThat(body.type()).isEqualTo(FinancialAccountCreateParams.Type.OPERATING)
        assertThat(body.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.isForBenefitOf()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FinancialAccountCreateParams.builder()
                .nickname("nickname")
                .type(FinancialAccountCreateParams.Type.OPERATING)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.nickname()).isEqualTo("nickname")
        assertThat(body.type()).isEqualTo(FinancialAccountCreateParams.Type.OPERATING)
    }
}
