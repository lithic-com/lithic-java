// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.Headers
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountCreateParamsTest {

    @Test
    fun create() {
        FinancialAccountCreateParams.builder()
            .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .nickname("nickname")
            .type(FinancialAccountCreateParams.Type.OPERATING)
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .isForBenefitOf(true)
            .build()
    }

    @Test
    fun headers() {
        val params =
            FinancialAccountCreateParams.builder()
                .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .nickname("nickname")
                .type(FinancialAccountCreateParams.Type.OPERATING)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isForBenefitOf(true)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            FinancialAccountCreateParams.builder()
                .nickname("nickname")
                .type(FinancialAccountCreateParams.Type.OPERATING)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            FinancialAccountCreateParams.builder()
                .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .nickname("nickname")
                .type(FinancialAccountCreateParams.Type.OPERATING)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isForBenefitOf(true)
                .build()

        val body = params._body()

        assertNotNull(body)
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

        assertNotNull(body)
        assertThat(body.nickname()).isEqualTo("nickname")
        assertThat(body.type()).isEqualTo(FinancialAccountCreateParams.Type.OPERATING)
    }
}
