// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.fraud.TransactionServiceAsync
import com.lithic.api.services.async.fraud.TransactionServiceAsyncImpl
import java.util.function.Consumer

class FraudServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FraudServiceAsync {

    private val withRawResponse: FraudServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): FraudServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FraudServiceAsync =
        FraudServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transactions(): TransactionServiceAsync = transactions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FraudServiceAsync.WithRawResponse {

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FraudServiceAsync.WithRawResponse =
            FraudServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions
    }
}
