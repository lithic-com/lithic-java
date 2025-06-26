// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.fraud

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.FraudTransactionReportParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.fraud().transactions()

        val transactionFuture =
            transactionServiceAsync.retrieve("00000000-0000-0000-0000-000000000000")

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Test
    fun report() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.fraud().transactions()

        val responseFuture =
            transactionServiceAsync.report(
                FraudTransactionReportParams.builder()
                    .transactionToken("00000000-0000-0000-0000-000000000000")
                    .fraudStatus(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
                    .comment("comment")
                    .fraudType(FraudTransactionReportParams.FraudType.FIRST_PARTY_FRAUD)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
