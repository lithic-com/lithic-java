// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookTransferServiceTest {

    @Test
    fun callCreate() {
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
                    .category(BookTransferCreateParams.Category.ADJUSTMENT)
                    .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .subtype("subtype")
                    .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )
        println(bookTransferResponse)
        bookTransferResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferService = client.bookTransfers()
        val bookTransferResponse =
            bookTransferService.retrieve(
                BookTransferRetrieveParams.builder()
                    .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(bookTransferResponse)
        bookTransferResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferService = client.bookTransfers()
        val response = bookTransferService.list(BookTransferListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callReverse() {
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
        println(bookTransferResponse)
        bookTransferResponse.validate()
    }
}
