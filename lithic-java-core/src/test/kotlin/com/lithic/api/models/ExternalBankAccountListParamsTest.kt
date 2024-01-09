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
            .endingBefore("string")
            .ownerTypes(listOf(OwnerType.BUSINESS))
            .pageSize(123L)
            .startingAfter("string")
            .states(listOf(ExternalBankAccountListParams.AccountState.CLOSED))
            .verificationStates(listOf(ExternalBankAccountListParams.VerificationState.ENABLED))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExternalBankAccountListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountTypes(listOf(ExternalBankAccountListParams.AccountType.CHECKING))
                .countries(listOf("string"))
                .endingBefore("string")
                .ownerTypes(listOf(OwnerType.BUSINESS))
                .pageSize(123L)
                .startingAfter("string")
                .states(listOf(ExternalBankAccountListParams.AccountState.CLOSED))
                .verificationStates(listOf(ExternalBankAccountListParams.VerificationState.ENABLED))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put(
            "account_types",
            listOf(ExternalBankAccountListParams.AccountType.CHECKING.toString())
        )
        expected.put("countries", listOf("string"))
        expected.put("ending_before", listOf("string"))
        expected.put("owner_types", listOf(OwnerType.BUSINESS.toString()))
        expected.put("page_size", listOf("123"))
        expected.put("starting_after", listOf("string"))
        expected.put("states", listOf(ExternalBankAccountListParams.AccountState.CLOSED.toString()))
        expected.put(
            "verification_states",
            listOf(ExternalBankAccountListParams.VerificationState.ENABLED.toString())
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
