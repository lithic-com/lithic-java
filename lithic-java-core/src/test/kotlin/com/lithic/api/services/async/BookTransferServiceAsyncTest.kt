// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.booktransfers.BookTransferCreateParams
import com.lithic.api.models.booktransfers.BookTransferRetrieveParams
import com.lithic.api.models.booktransfers.BookTransferReverseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BookTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val bookTransferResponseFuture =
            bookTransferServiceAsync.create(
                BookTransferCreateParams.builder()
                    .amount(1L)
                    .category(BookTransferCreateParams.Category.ADJUSTMENT)
                    .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .subtype("subtype")
                    .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        val bookTransferResponse = bookTransferResponseFuture.get()
        bookTransferResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val bookTransferResponseFuture =
            bookTransferServiceAsync.retrieve(
                BookTransferRetrieveParams.builder()
                    .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val bookTransferResponse = bookTransferResponseFuture.get()
        bookTransferResponse.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val pageFuture = bookTransferServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun reverse() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val bookTransferResponseFuture =
            bookTransferServiceAsync.reverse(
                BookTransferReverseParams.builder()
                    .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        val bookTransferResponse = bookTransferResponseFuture.get()
        bookTransferResponse.validate()
    }
}
