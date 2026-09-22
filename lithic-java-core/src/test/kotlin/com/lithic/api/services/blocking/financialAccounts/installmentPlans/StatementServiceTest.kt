// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts.installmentPlans

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatementServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val statementService = client.financialAccounts().installmentPlans().statements()

        val installmentPlanStatement =
            statementService.retrieve(
                FinancialAccountInstallmentPlanStatementRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .installmentPlanToken("installment_plan_token")
                    .statementToken("statement_token")
                    .build()
            )

        installmentPlanStatement.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val statementService = client.financialAccounts().installmentPlans().statements()

        val page =
            statementService.list(
                FinancialAccountInstallmentPlanStatementListParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .installmentPlanToken("installment_plan_token")
                    .build()
            )

        page.response().validate()
    }
}
