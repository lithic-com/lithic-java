// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FinancialAccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccountFuture =
            financialAccountServiceAsync.create(
                FinancialAccountCreateParams.builder()
                    .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nickname("nickname")
                    .type(FinancialAccountCreateParams.Type.OPERATING)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isForBenefitOf(true)
                    .build()
            )

        val financialAccount = financialAccountFuture.get()
        financialAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccountFuture =
            financialAccountServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val financialAccount = financialAccountFuture.get()
        financialAccount.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccountFuture =
            financialAccountServiceAsync.update(
                FinancialAccountUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nickname("nickname")
                    .build()
            )

        val financialAccount = financialAccountFuture.get()
        financialAccount.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val pageFuture = financialAccountServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun updateStatus() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccountFuture =
            financialAccountServiceAsync.updateStatus(
                FinancialAccountUpdateStatusParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.OPEN)
                    .substatus(
                        FinancialAccountUpdateStatusParams.UpdateFinancialAccountSubstatus
                            .CHARGED_OFF_FRAUD
                    )
                    .build()
            )

        val financialAccount = financialAccountFuture.get()
        financialAccount.validate()
    }
}
