// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.fraud.TransactionService
import com.lithic.api.services.blocking.fraud.TransactionServiceImpl
import java.util.function.Consumer

class FraudServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FraudService {

    private val withRawResponse: FraudService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    override fun withRawResponse(): FraudService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FraudService =
        FraudServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transactions(): TransactionService = transactions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FraudService.WithRawResponse {

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FraudService.WithRawResponse =
            FraudServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun transactions(): TransactionService.WithRawResponse = transactions
    }
}
