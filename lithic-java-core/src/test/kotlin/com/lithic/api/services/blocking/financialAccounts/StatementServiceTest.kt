// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StatementServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val statementService = client.financialAccounts().statements()
        val statement =
            statementService.retrieve(
                FinancialAccountStatementRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .statementToken("statement_token")
                    .build()
            )
        println(statement)
        statement.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val statementService = client.financialAccounts().statements()
        val statements =
            statementService.list(
                FinancialAccountStatementListParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(statements)
        statements.data().forEach { it.validate() }
    }
}
