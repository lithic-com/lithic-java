// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
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
        val expected = QueryParams.builder()
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("email", "email")
        expected.put("end", "2019-12-27T18:11:19.117Z")
        expected.put("ending_before", "ending_before")
        expected.put("external_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("first_name", "first_name")
        expected.put("last_name", "last_name")
        expected.put("legal_business_name", "legal_business_name")
        expected.put("limit", "123")
        expected.put("phone_number", "phone_number")
        expected.put("starting_after", "starting_after")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountHolderListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
