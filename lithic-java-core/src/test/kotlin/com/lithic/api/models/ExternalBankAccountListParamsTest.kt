// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountListParamsTest {

    @Test
    fun create() {
        ExternalBankAccountListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAccountType(ExternalBankAccountListParams.AccountType.CHECKING)
            .addCountry("string")
            .endingBefore("ending_before")
            .addOwnerType(OwnerType.INDIVIDUAL)
            .pageSize(1L)
            .startingAfter("starting_after")
            .addState(ExternalBankAccountListParams.AccountState.ENABLED)
            .addVerificationState(ExternalBankAccountListParams.VerificationState.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalBankAccountListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountType(ExternalBankAccountListParams.AccountType.CHECKING)
                .addCountry("string")
                .endingBefore("ending_before")
                .addOwnerType(OwnerType.INDIVIDUAL)
                .pageSize(1L)
                .startingAfter("starting_after")
                .addState(ExternalBankAccountListParams.AccountState.ENABLED)
                .addVerificationState(ExternalBankAccountListParams.VerificationState.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("account_types", listOf("CHECKING").joinToString(","))
                    .put("countries", listOf("string").joinToString(","))
                    .put("ending_before", "ending_before")
                    .put("owner_types", listOf("INDIVIDUAL").joinToString(","))
                    .put("page_size", "1")
                    .put("starting_after", "starting_after")
                    .put("states", listOf("ENABLED").joinToString(","))
                    .put("verification_states", listOf("PENDING").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalBankAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
