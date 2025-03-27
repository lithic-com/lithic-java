// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.financialaccounts.FinancialAccountChargeOffParams
import com.lithic.api.models.financialaccounts.FinancialAccountCreateParams
import com.lithic.api.models.financialaccounts.FinancialAccountRetrieveParams
import com.lithic.api.models.financialaccounts.FinancialAccountUpdateParams
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
            financialAccountServiceAsync.retrieve(
                FinancialAccountRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

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
    fun chargeOff() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccountCreditConfigFuture =
            financialAccountServiceAsync.chargeOff(
                FinancialAccountChargeOffParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
                    .build()
            )

        val financialAccountCreditConfig = financialAccountCreditConfigFuture.get()
        financialAccountCreditConfig.validate()
    }
}
