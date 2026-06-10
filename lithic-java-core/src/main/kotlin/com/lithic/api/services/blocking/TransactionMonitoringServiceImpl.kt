// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.transactionMonitoring.CaseService
import com.lithic.api.services.blocking.transactionMonitoring.CaseServiceImpl
import com.lithic.api.services.blocking.transactionMonitoring.QueueService
import com.lithic.api.services.blocking.transactionMonitoring.QueueServiceImpl
import java.util.function.Consumer

class TransactionMonitoringServiceImpl
internal constructor(private val clientOptions: ClientOptions) : TransactionMonitoringService {

    private val withRawResponse: TransactionMonitoringService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cases: CaseService by lazy { CaseServiceImpl(clientOptions) }

    private val queues: QueueService by lazy { QueueServiceImpl(clientOptions) }

    override fun withRawResponse(): TransactionMonitoringService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TransactionMonitoringService =
        TransactionMonitoringServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cases(): CaseService = cases

    override fun queues(): QueueService = queues

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionMonitoringService.WithRawResponse {

        private val cases: CaseService.WithRawResponse by lazy {
            CaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val queues: QueueService.WithRawResponse by lazy {
            QueueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionMonitoringService.WithRawResponse =
            TransactionMonitoringServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun cases(): CaseService.WithRawResponse = cases

        override fun queues(): QueueService.WithRawResponse = queues
    }
}
