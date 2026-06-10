// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.transactionMonitoring.CaseService
import com.lithic.api.services.blocking.transactionMonitoring.QueueService
import java.util.function.Consumer

interface TransactionMonitoringService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionMonitoringService

    fun cases(): CaseService

    fun queues(): QueueService

    /**
     * A view of [TransactionMonitoringService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionMonitoringService.WithRawResponse

        fun cases(): CaseService.WithRawResponse

        fun queues(): QueueService.WithRawResponse
    }
}
