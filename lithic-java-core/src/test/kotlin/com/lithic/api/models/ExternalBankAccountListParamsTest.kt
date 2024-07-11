// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountListParamsTest {

    @Test
    fun createExternalBankAccountListParams() {
        ExternalBankAccountListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountTypes(listOf(ExternalBankAccountListParams.AccountType.CHECKING))
            .countries(listOf("string"))
            .endingBefore("ending_before")
            .ownerTypes(listOf(OwnerType.INDIVIDUAL))
            .pageSize(100L)
            .startingAfter("starting_after")
            .states(listOf(ExternalBankAccountListParams.AccountState.ENABLED))
            .verificationStates(listOf(ExternalBankAccountListParams.VerificationState.PENDING))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExternalBankAccountListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountTypes(listOf(ExternalBankAccountListParams.AccountType.CHECKING))
                .countries(listOf("string"))
                .endingBefore("ending_before")
                .ownerTypes(listOf(OwnerType.INDIVIDUAL))
                .pageSize(100L)
                .startingAfter("starting_after")
                .states(listOf(ExternalBankAccountListParams.AccountState.ENABLED))
                .verificationStates(listOf(ExternalBankAccountListParams.VerificationState.PENDING))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put(
            "account_types",
            listOf(ExternalBankAccountListParams.AccountType.CHECKING.toString())
        )
        expected.put("countries", listOf("string"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("owner_types", listOf(OwnerType.INDIVIDUAL.toString()))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("starting_after"))
        expected.put(
            "states",
            listOf(ExternalBankAccountListParams.AccountState.ENABLED.toString())
        )
        expected.put(
            "verification_states",
            listOf(ExternalBankAccountListParams.VerificationState.PENDING.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ExternalBankAccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
