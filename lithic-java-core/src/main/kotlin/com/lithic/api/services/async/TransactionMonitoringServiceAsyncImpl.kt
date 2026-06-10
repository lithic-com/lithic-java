// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.transactionMonitoring.CaseServiceAsync
import com.lithic.api.services.async.transactionMonitoring.CaseServiceAsyncImpl
import com.lithic.api.services.async.transactionMonitoring.QueueServiceAsync
import com.lithic.api.services.async.transactionMonitoring.QueueServiceAsyncImpl
import java.util.function.Consumer

class TransactionMonitoringServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TransactionMonitoringServiceAsync {

    private val withRawResponse: TransactionMonitoringServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cases: CaseServiceAsync by lazy { CaseServiceAsyncImpl(clientOptions) }

    private val queues: QueueServiceAsync by lazy { QueueServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TransactionMonitoringServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TransactionMonitoringServiceAsync =
        TransactionMonitoringServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun cases(): CaseServiceAsync = cases

    override fun queues(): QueueServiceAsync = queues

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionMonitoringServiceAsync.WithRawResponse {

        private val cases: CaseServiceAsync.WithRawResponse by lazy {
            CaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val queues: QueueServiceAsync.WithRawResponse by lazy {
            QueueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionMonitoringServiceAsync.WithRawResponse =
            TransactionMonitoringServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun cases(): CaseServiceAsync.WithRawResponse = cases

        override fun queues(): QueueServiceAsync.WithRawResponse = queues
    }
}
