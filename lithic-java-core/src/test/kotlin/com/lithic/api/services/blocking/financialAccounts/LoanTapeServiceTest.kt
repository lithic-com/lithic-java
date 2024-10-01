// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LoanTapeServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val loanTapeService = client.financialAccounts().loanTapes()
        val loanTape =
            loanTapeService.retrieve(
                FinancialAccountLoanTapeRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .loanTapeToken("loan_tape_token")
                    .build()
            )
        println(loanTape)
        loanTape.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val loanTapeService = client.financialAccounts().loanTapes()
        val loanTapesResponse =
            loanTapeService.list(
                FinancialAccountLoanTapeListParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(loanTapesResponse)
        loanTapesResponse.data().forEach { it.validate() }
    }
}
