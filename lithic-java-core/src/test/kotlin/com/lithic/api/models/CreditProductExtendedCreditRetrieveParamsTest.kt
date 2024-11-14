// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditProductExtendedCreditRetrieveParamsTest {

    @Test
    fun createCreditProductExtendedCreditRetrieveParams() {
        CreditProductExtendedCreditRetrieveParams.builder()
            .creditProductToken("credit_product_token")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CreditProductExtendedCreditRetrieveParams.builder()
                .creditProductToken("credit_product_token")
                .build()
        assertThat(params).isNotNull
        // path param "creditProductToken"
        assertThat(params.getPathParam(0)).isEqualTo("credit_product_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
