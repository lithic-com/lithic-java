// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditProductExtendedCreditRetrieveParamsTest {

    @Test
    fun createCreditProductExtendedCreditRetrieveParams() {
        CreditProductExtendedCreditRetrieveParams.builder()
            .creditProductId("credit_product_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CreditProductExtendedCreditRetrieveParams.builder()
                .creditProductId("credit_product_id")
                .build()
        assertThat(params).isNotNull
        // path param "creditProductId"
        assertThat(params.getPathParam(0)).isEqualTo("credit_product_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
