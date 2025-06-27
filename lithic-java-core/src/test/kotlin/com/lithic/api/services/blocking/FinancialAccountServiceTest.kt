// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountRegisterAccountNumberParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FinancialAccountServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()

        val financialAccount =
            financialAccountService.create(
                FinancialAccountCreateParams.builder()
                    .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nickname("nickname")
                    .type(FinancialAccountCreateParams.Type.OPERATING)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isForBenefitOf(true)
                    .build()
            )

        financialAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()

        val financialAccount =
            financialAccountService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        financialAccount.validate()
    }

    @Test
    fun update() {
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

        financialAccount.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()

        val page = financialAccountService.list()

        page.response().validate()
    }

    @Test
    fun registerAccountNumber() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()

        financialAccountService.registerAccountNumber(
            FinancialAccountRegisterAccountNumberParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .build()
        )
    }

    @Test
    fun updateStatus() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountService = client.financialAccounts()

        val financialAccount =
            financialAccountService.updateStatus(
                FinancialAccountUpdateStatusParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.OPEN)
                    .substatus(
                        FinancialAccountUpdateStatusParams.UpdateFinancialAccountSubstatus
                            .CHARGED_OFF_FRAUD
                    )
                    .build()
            )

        financialAccount.validate()
    }
}
