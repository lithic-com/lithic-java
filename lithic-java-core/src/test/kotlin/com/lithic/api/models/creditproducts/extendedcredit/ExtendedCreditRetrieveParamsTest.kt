// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.creditproducts.extendedcredit

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtendedCreditRetrieveParamsTest {

    @Test
    fun create() {
        ExtendedCreditRetrieveParams.builder().creditProductToken("credit_product_token").build()
    }

    @Test
    fun pathParams() {
        val params =
            ExtendedCreditRetrieveParams.builder()
                .creditProductToken("credit_product_token")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("credit_product_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
