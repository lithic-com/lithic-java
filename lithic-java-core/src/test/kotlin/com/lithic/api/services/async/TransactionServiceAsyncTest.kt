// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TransactionRetrieveParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.TransactionSimulateAuthorizationParams
import com.lithic.api.models.TransactionSimulateClearingParams
import com.lithic.api.models.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.TransactionSimulateReturnParams
import com.lithic.api.models.TransactionSimulateReturnReversalParams
import com.lithic.api.models.TransactionSimulateVoidParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture =
            transactionServiceAsync.retrieve(
                TransactionRetrieveParams.builder()
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val pageFuture = transactionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun simulateAuthorization() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.simulateAuthorization(
                TransactionSimulateAuthorizationParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .mcc("5812")
                    .merchantAcceptorId("OODKZAPJVN4YS7O")
                    .merchantAmount(0L)
                    .merchantCurrency("GBP")
                    .partialApprovalCapable(true)
                    .pin("1234")
                    .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun simulateAuthorizationAdvice() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.simulateAuthorizationAdvice(
                TransactionSimulateAuthorizationAdviceParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(3831L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun simulateClearing() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.simulateClearing(
                TransactionSimulateClearingParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun simulateCreditAuthorization() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.simulateCreditAuthorization(
                TransactionSimulateCreditAuthorizationParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .mcc("5812")
                    .merchantAcceptorId("XRKGDPOWEWQRRWU")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun simulateReturn() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.simulateReturn(
                TransactionSimulateReturnParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun simulateReturnReversal() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.simulateReturnReversal(
                TransactionSimulateReturnReversalParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun simulateVoid() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.simulateVoid(
                TransactionSimulateVoidParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(100L)
                    .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
