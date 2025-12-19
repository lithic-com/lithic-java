// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferRetryParams
import com.lithic.api.models.BookTransferReverseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BookTransferServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferService = client.bookTransfers()

        val bookTransferResponse =
            bookTransferService.create(
                BookTransferCreateParams.builder()
                    .amount(1L)
                    .category(BookTransferCreateParams.BookTransferCategory.ADJUSTMENT)
                    .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .subtype("subtype")
                    .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(BookTransferCreateParams.BookTransferType.ATM_BALANCE_INQUIRY)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .externalId("external_id")
                    .memo("memo")
                    .onClosedAccount(BookTransferCreateParams.OnClosedAccount.FAIL)
                    .build()
            )

        bookTransferResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferService = client.bookTransfers()

        val bookTransferResponse =
            bookTransferService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        bookTransferResponse.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferService = client.bookTransfers()

        val page = bookTransferService.list()

        page.response().validate()
    }

    @Test
    fun retry() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferService = client.bookTransfers()

        val bookTransferResponse =
            bookTransferService.retry(
                BookTransferRetryParams.builder()
                    .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .retryToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        bookTransferResponse.validate()
    }

    @Test
    fun reverse() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferService = client.bookTransfers()

        val bookTransferResponse =
            bookTransferService.reverse(
                BookTransferReverseParams.builder()
                    .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        bookTransferResponse.validate()
    }
}
