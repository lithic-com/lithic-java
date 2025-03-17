// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
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
internal class TransactionServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val transaction =
            transactionService.retrieve(
                TransactionRetrieveParams.builder()
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        transaction.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val page = transactionService.list()

        page.response().validate()
    }

    @Test
    fun simulateAuthorization() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val response =
            transactionService.simulateAuthorization(
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

        response.validate()
    }

    @Test
    fun simulateAuthorizationAdvice() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val response =
            transactionService.simulateAuthorizationAdvice(
                TransactionSimulateAuthorizationAdviceParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(3831L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateClearing() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val response =
            transactionService.simulateClearing(
                TransactionSimulateClearingParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateCreditAuthorization() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val response =
            transactionService.simulateCreditAuthorization(
                TransactionSimulateCreditAuthorizationParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .mcc("5812")
                    .merchantAcceptorId("XRKGDPOWEWQRRWU")
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateReturn() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val response =
            transactionService.simulateReturn(
                TransactionSimulateReturnParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateReturnReversal() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val response =
            transactionService.simulateReturnReversal(
                TransactionSimulateReturnReversalParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateVoid() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.transactions()

        val response =
            transactionService.simulateVoid(
                TransactionSimulateVoidParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(100L)
                    .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
                    .build()
            )

        response.validate()
    }
}
