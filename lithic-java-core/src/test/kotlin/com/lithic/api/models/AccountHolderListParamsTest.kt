// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderListParamsTest {

    @Test
    fun createAccountHolderListParams() {
        AccountHolderListParams.builder()
            .endingBefore("string")
            .externalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(123L)
            .startingAfter("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountHolderListParams.builder()
                .endingBefore("string")
                .externalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(123L)
                .startingAfter("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("string"))
        expected.put("external_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("limit", listOf("123"))
        expected.put("starting_after", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountHolderListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
