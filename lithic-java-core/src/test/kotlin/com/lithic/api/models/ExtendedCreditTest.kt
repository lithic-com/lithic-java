// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtendedCreditTest {

    @Test
    fun create() {
        val extendedCredit = ExtendedCredit.builder().creditExtended(0L).build()

        assertThat(extendedCredit.creditExtended()).isEqualTo(0L)
    }
}
