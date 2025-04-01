// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtendedCreditTest {

    @Test
    fun create() {
        val extendedCredit = ExtendedCredit.builder().creditExtended(0L).build()

        assertThat(extendedCredit.creditExtended()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extendedCredit = ExtendedCredit.builder().creditExtended(0L).build()

        val roundtrippedExtendedCredit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extendedCredit),
                jacksonTypeRef<ExtendedCredit>(),
            )

        assertThat(roundtrippedExtendedCredit).isEqualTo(extendedCredit)
    }
}
