// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts.statements

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.financialaccounts.statements.lineitems.LineItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LineItemServiceAsyncTest {

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val lineItemServiceAsync = client.financialAccounts().statements().lineItems()

        val pageFuture =
            lineItemServiceAsync.list(
                LineItemListParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .statementToken("statement_token")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
