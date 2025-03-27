// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.financialaccounts

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("business_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("type", "ISSUING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FinancialAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
