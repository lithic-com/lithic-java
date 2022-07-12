package com.lithic.api.services

import com.lithic.api.client.okhttp.LithicClient
import com.lithic.api.models.*
import com.lithic.api.models.TransactionListParams
import org.junit.jupiter.api.Test

class TransactionServiceTest {
    @Test
    fun callRetrieve() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val transaction =
            transactionService.retrieve(
                TransactionRetrieveParams.builder()
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(transaction)
        transaction.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val response = transactionService.list(TransactionListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callSimulateAuthorization() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val transactionSimulateAuthorizationResponse =
            transactionService.simulateAuthorization(
                TransactionSimulateAuthorizationParams.builder()
                    .amount(123L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
                    .merchantCurrency("GBP")
                    .merchantAmount(123L)
                    .partialApprovalCapable(true)
                    .build()
            )
        println(transactionSimulateAuthorizationResponse)
        transactionSimulateAuthorizationResponse.validate()
    }

    @Test
    fun callSimulateClearing() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val transactionSimulateClearingResponse =
            transactionService.simulateClearing(
                TransactionSimulateClearingParams.builder()
                    .amount(123L)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(transactionSimulateClearingResponse)
        transactionSimulateClearingResponse.validate()
    }

    @Test
    fun callSimulateCreditAuthorization() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val transactionSimulateCreditAuthorizationResponse =
            transactionService.simulateCreditAuthorization(
                TransactionSimulateCreditAuthorizationParams.builder()
                    .amount(123L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .build()
            )
        println(transactionSimulateCreditAuthorizationResponse)
        transactionSimulateCreditAuthorizationResponse.validate()
    }

    @Test
    fun callSimulateReturn() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val transactionSimulateReturnResponse =
            transactionService.simulateReturn(
                TransactionSimulateReturnParams.builder()
                    .amount(123L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .build()
            )
        println(transactionSimulateReturnResponse)
        transactionSimulateReturnResponse.validate()
    }

    @Test
    fun callSimulateReturnReversal() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val transactionSimulateReturnReversalResponse =
            transactionService.simulateReturnReversal(
                TransactionSimulateReturnReversalParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(transactionSimulateReturnReversalResponse)
        transactionSimulateReturnReversalResponse.validate()
    }

    @Test
    fun callSimulateVoid() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val transactionService = client.transactions
        val transactionSimulateVoidResponse =
            transactionService.simulateVoid(
                TransactionSimulateVoidParams.builder()
                    .amount(123L)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
                    .build()
            )
        println(transactionSimulateVoidResponse)
        transactionSimulateVoidResponse.validate()
    }
}
