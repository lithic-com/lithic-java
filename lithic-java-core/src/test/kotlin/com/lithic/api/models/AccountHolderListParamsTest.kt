// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderListParamsTest {

    @Test
    fun createAccountHolderListParams() {
        AccountHolderListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .email("email")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .externalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .firstName("first_name")
            .lastName("last_name")
            .legalBusinessName("legal_business_name")
            .limit(123L)
            .phoneNumber("phone_number")
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountHolderListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .externalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .firstName("first_name")
                .lastName("last_name")
                .legalBusinessName("legal_business_name")
                .limit(123L)
                .phoneNumber("phone_number")
                .startingAfter("starting_after")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("email", listOf("email"))
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("external_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("first_name", listOf("first_name"))
        expected.put("last_name", listOf("last_name"))
        expected.put("legal_business_name", listOf("legal_business_name"))
        expected.put("limit", listOf("123"))
        expected.put("phone_number", listOf("phone_number"))
        expected.put("starting_after", listOf("starting_after"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountHolderListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
