// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountListParamsTest {

    @Test
    fun create() {
        FinancialAccountListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(FinancialAccountListParams.Type.ISSUING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FinancialAccountListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(FinancialAccountListParams.Type.ISSUING)
                .build()
        val expected = QueryParams.builder()
        expected.put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("business_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("type", FinancialAccountListParams.Type.ISSUING.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FinancialAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
