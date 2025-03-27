// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.accountholders

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderListParamsTest {

    @Test
    fun create() {
        AccountHolderListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .email("email")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .externalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .firstName("first_name")
            .lastName("last_name")
            .legalBusinessName("legal_business_name")
            .limit(0L)
            .phoneNumber("phone_number")
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun queryParams() {
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
                .limit(0L)
                .phoneNumber("phone_number")
                .startingAfter("starting_after")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("begin", "2019-12-27T18:11:19.117Z")
                    .put("email", "email")
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("ending_before", "ending_before")
                    .put("external_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("first_name", "first_name")
                    .put("last_name", "last_name")
                    .put("legal_business_name", "legal_business_name")
                    .put("limit", "0")
                    .put("phone_number", "phone_number")
                    .put("starting_after", "starting_after")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountHolderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
