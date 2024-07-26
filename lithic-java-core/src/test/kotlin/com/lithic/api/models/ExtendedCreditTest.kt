// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExtendedCreditTest {

    @Test
    fun createExtendedCredit() {
        val extendedCredit = ExtendedCredit.builder().creditExtended(123L).build()
        assertThat(extendedCredit).isNotNull
        assertThat(extendedCredit.creditExtended()).isEqualTo(123L)
    }
}
