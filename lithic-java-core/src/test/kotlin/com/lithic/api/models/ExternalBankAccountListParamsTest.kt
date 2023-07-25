package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountListParamsTest {

    @Test
    fun createExternalBankAccountListParams() {
        ExternalBankAccountListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ownerTypes(listOf(OwnerType.INDIVIDUAL))
            .accountTypes(listOf(ExternalBankAccountListParams.AccountType.CHECKING))
            .states(listOf(ExternalBankAccountListParams.AccountState.ENABLED))
            .verificationStates(listOf(ExternalBankAccountListParams.VerificationState.PENDING))
            .countries(listOf("string"))
            .pageSize(123L)
            .startingAfter("string")
            .endingBefore("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExternalBankAccountListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ownerTypes(listOf(OwnerType.INDIVIDUAL))
                .accountTypes(listOf(ExternalBankAccountListParams.AccountType.CHECKING))
                .states(listOf(ExternalBankAccountListParams.AccountState.ENABLED))
                .verificationStates(listOf(ExternalBankAccountListParams.VerificationState.PENDING))
                .countries(listOf("string"))
                .pageSize(123L)
                .startingAfter("string")
                .endingBefore("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("owner_types", listOf(OwnerType.INDIVIDUAL.toString()))
        expected.put(
            "account_types",
            listOf(ExternalBankAccountListParams.AccountType.CHECKING.toString())
        )
        expected.put(
            "states",
            listOf(ExternalBankAccountListParams.AccountState.ENABLED.toString())
        )
        expected.put(
            "verification_states",
            listOf(ExternalBankAccountListParams.VerificationState.PENDING.toString())
        )
        expected.put("countries", listOf("string"))
        expected.put("page_size", listOf("123"))
        expected.put("starting_after", listOf("string"))
        expected.put("ending_before", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ExternalBankAccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
