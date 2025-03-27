// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialaccounts.statements

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.financialaccounts.statements.lineitems.LineItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LineItemServiceTest {

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val lineItemService = client.financialAccounts().statements().lineItems()

        val page =
            lineItemService.list(
                LineItemListParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .statementToken("statement_token")
                    .build()
            )

        page.response().validate()
    }
}
