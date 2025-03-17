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
        val expected = QueryParams.builder()
        expected.put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("account_types", ExternalBankAccountListParams.AccountType.CHECKING.toString())
        expected.put("countries", "string")
        expected.put("ending_before", "ending_before")
        expected.put("owner_types", OwnerType.INDIVIDUAL.toString())
        expected.put("page_size", "1")
        expected.put("starting_after", "starting_after")
        expected.put("states", ExternalBankAccountListParams.AccountState.ENABLED.toString())
        expected.put(
            "verification_states",
            ExternalBankAccountListParams.VerificationState.PENDING.toString(),
        )
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalBankAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
