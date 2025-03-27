// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeListParams
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LoanTapeServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val loanTapeServiceAsync = client.financialAccounts().loanTapes()

        val loanTapeFuture =
            loanTapeServiceAsync.retrieve(
                LoanTapeRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .loanTapeToken("loan_tape_token")
                    .build()
            )

        val loanTape = loanTapeFuture.get()
        loanTape.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val loanTapeServiceAsync = client.financialAccounts().loanTapes()

        val pageFuture =
            loanTapeServiceAsync.list(
                LoanTapeListParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
