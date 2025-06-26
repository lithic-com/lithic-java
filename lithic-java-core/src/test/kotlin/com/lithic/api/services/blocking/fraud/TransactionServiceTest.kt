// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.fraud

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.FraudTransactionReportParams
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
        val transactionService = client.fraud().transactions()

        val transaction = transactionService.retrieve("00000000-0000-0000-0000-000000000000")

        transaction.validate()
    }

    @Test
    fun report() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionService = client.fraud().transactions()

        val response =
            transactionService.report(
                FraudTransactionReportParams.builder()
                    .transactionToken("00000000-0000-0000-0000-000000000000")
                    .fraudStatus(FraudTransactionReportParams.FraudStatus.SUSPECTED_FRAUD)
                    .comment("comment")
                    .fraudType(FraudTransactionReportParams.FraudType.FIRST_PARTY_FRAUD)
                    .build()
            )

        response.validate()
    }
}
