// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProductCreditDetailResponseTest {

    @Test
    fun createCardProductCreditDetailResponse() {
        val cardProductCreditDetailResponse =
            CardProductCreditDetailResponse.builder().creditExtended(123L).creditLimit(123L).build()
        assertThat(cardProductCreditDetailResponse).isNotNull
        assertThat(cardProductCreditDetailResponse.creditExtended()).isEqualTo(123L)
        assertThat(cardProductCreditDetailResponse.creditLimit()).isEqualTo(123L)
    }
}
