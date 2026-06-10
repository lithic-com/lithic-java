// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.transactionMonitoring.CaseServiceAsync
import com.lithic.api.services.async.transactionMonitoring.QueueServiceAsync
import java.util.function.Consumer

interface TransactionMonitoringServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionMonitoringServiceAsync

    fun cases(): CaseServiceAsync

    fun queues(): QueueServiceAsync

    /**
     * A view of [TransactionMonitoringServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionMonitoringServiceAsync.WithRawResponse

        fun cases(): CaseServiceAsync.WithRawResponse

        fun queues(): QueueServiceAsync.WithRawResponse
    }
}
