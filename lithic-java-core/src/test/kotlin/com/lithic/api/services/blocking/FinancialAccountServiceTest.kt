// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.FinancialAccountListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FinancialAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()
        val financialAccount =
            financialAccountService.create(
                FinancialAccountCreateParams.builder()
                    .nickname("nickname")
                    .type(FinancialAccountCreateParams.Type.OPERATING)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isForBenefitOf(true)
                    .build()
            )
        println(financialAccount)
        financialAccount.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()
        val financialAccount =
            financialAccountService.retrieve(
                FinancialAccountRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(financialAccount)
        financialAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()
        val financialAccount =
            financialAccountService.update(
                FinancialAccountUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nickname("nickname")
                    .build()
            )
        println(financialAccount)
        financialAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()
        val financialAccountsResponse =
            financialAccountService.list(FinancialAccountListParams.builder().build())
        println(financialAccountsResponse)
        financialAccountsResponse.data().forEach { it.validate() }
    }

    @Test
    fun callChargeOff() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()
        val financialAccountCreditConfig =
            financialAccountService.chargeOff(
                FinancialAccountChargeOffParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
                    .build()
            )
        println(financialAccountCreditConfig)
        financialAccountCreditConfig.validate()
    }
}
