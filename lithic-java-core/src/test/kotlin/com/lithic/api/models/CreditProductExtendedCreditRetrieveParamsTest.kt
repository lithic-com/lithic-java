// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditProductExtendedCreditRetrieveParamsTest {

    @Test
    fun create() {
        CreditProductExtendedCreditRetrieveParams.builder()
            .creditProductToken("credit_product_token")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CreditProductExtendedCreditRetrieveParams.builder()
                .creditProductToken("credit_product_token")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("credit_product_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
