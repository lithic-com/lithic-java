// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Queue
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueDeleteParams
import com.lithic.api.models.TransactionMonitoringQueueListPage
import com.lithic.api.models.TransactionMonitoringQueueListParams
import com.lithic.api.models.TransactionMonitoringQueueRetrieveParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams
import java.util.function.Consumer

interface QueueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService

    /** Creates a new queue for grouping transaction monitoring cases. */
    fun create(params: TransactionMonitoringQueueCreateParams): Queue =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransactionMonitoringQueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue

    /** Retrieves a single transaction monitoring queue. */
    fun retrieve(queueToken: String): Queue =
        retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueToken: String,
        params: TransactionMonitoringQueueRetrieveParams =
            TransactionMonitoringQueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue = retrieve(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueToken: String,
        params: TransactionMonitoringQueueRetrieveParams =
            TransactionMonitoringQueueRetrieveParams.none(),
    ): Queue = retrieve(queueToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionMonitoringQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue

    /** @see retrieve */
    fun retrieve(params: TransactionMonitoringQueueRetrieveParams): Queue =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(queueToken: String, requestOptions: RequestOptions): Queue =
        retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none(), requestOptions)

    /** Updates a transaction monitoring queue. */
    fun update(queueToken: String): Queue =
        update(queueToken, TransactionMonitoringQueueUpdateParams.none())

    /** @see update */
    fun update(
        queueToken: String,
        params: TransactionMonitoringQueueUpdateParams =
            TransactionMonitoringQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue = update(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see update */
    fun update(
        queueToken: String,
        params: TransactionMonitoringQueueUpdateParams =
            TransactionMonitoringQueueUpdateParams.none(),
    ): Queue = update(queueToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TransactionMonitoringQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue

    /** @see update */
    fun update(params: TransactionMonitoringQueueUpdateParams): Queue =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(queueToken: String, requestOptions: RequestOptions): Queue =
        update(queueToken, TransactionMonitoringQueueUpdateParams.none(), requestOptions)

    /** Lists transaction monitoring queues. */
    fun list(): TransactionMonitoringQueueListPage =
        list(TransactionMonitoringQueueListParams.none())

    /** @see list */
    fun list(
        params: TransactionMonitoringQueueListParams = TransactionMonitoringQueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringQueueListPage

    /** @see list */
    fun list(
        params: TransactionMonitoringQueueListParams = TransactionMonitoringQueueListParams.none()
    ): TransactionMonitoringQueueListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TransactionMonitoringQueueListPage =
        list(TransactionMonitoringQueueListParams.none(), requestOptions)

    /** Deletes a transaction monitoring queue. */
    fun delete(queueToken: String) =
        delete(queueToken, TransactionMonitoringQueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueToken: String,
        params: TransactionMonitoringQueueDeleteParams =
            TransactionMonitoringQueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueToken: String,
        params: TransactionMonitoringQueueDeleteParams =
            TransactionMonitoringQueueDeleteParams.none(),
    ) = delete(queueToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransactionMonitoringQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: TransactionMonitoringQueueDeleteParams) =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(queueToken: String, requestOptions: RequestOptions) =
        delete(queueToken, TransactionMonitoringQueueDeleteParams.none(), requestOptions)

    /** A view of [QueueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transaction_monitoring/queues`, but is
         * otherwise the same as [QueueService.create].
         */
        @MustBeClosed
        fun create(params: TransactionMonitoringQueueCreateParams): HttpResponseFor<Queue> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TransactionMonitoringQueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue>

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(queueToken: String): HttpResponseFor<Queue> =
            retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueToken: String,
            params: TransactionMonitoringQueueRetrieveParams =
                TransactionMonitoringQueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue> =
            retrieve(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueToken: String,
            params: TransactionMonitoringQueueRetrieveParams =
                TransactionMonitoringQueueRetrieveParams.none(),
        ): HttpResponseFor<Queue> = retrieve(queueToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionMonitoringQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TransactionMonitoringQueueRetrieveParams): HttpResponseFor<Queue> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(queueToken: String, requestOptions: RequestOptions): HttpResponseFor<Queue> =
            retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueService.update].
         */
        @MustBeClosed
        fun update(queueToken: String): HttpResponseFor<Queue> =
            update(queueToken, TransactionMonitoringQueueUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueToken: String,
            params: TransactionMonitoringQueueUpdateParams =
                TransactionMonitoringQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue> =
            update(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            queueToken: String,
            params: TransactionMonitoringQueueUpdateParams =
                TransactionMonitoringQueueUpdateParams.none(),
        ): HttpResponseFor<Queue> = update(queueToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TransactionMonitoringQueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue>

        /** @see update */
        @MustBeClosed
        fun update(params: TransactionMonitoringQueueUpdateParams): HttpResponseFor<Queue> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(queueToken: String, requestOptions: RequestOptions): HttpResponseFor<Queue> =
            update(queueToken, TransactionMonitoringQueueUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/queues`, but is otherwise
         * the same as [QueueService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransactionMonitoringQueueListPage> =
            list(TransactionMonitoringQueueListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionMonitoringQueueListParams =
                TransactionMonitoringQueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringQueueListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionMonitoringQueueListParams =
                TransactionMonitoringQueueListParams.none()
        ): HttpResponseFor<TransactionMonitoringQueueListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionMonitoringQueueListPage> =
            list(TransactionMonitoringQueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueService.delete].
         */
        @MustBeClosed
        fun delete(queueToken: String): HttpResponse =
            delete(queueToken, TransactionMonitoringQueueDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueToken: String,
            params: TransactionMonitoringQueueDeleteParams =
                TransactionMonitoringQueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueToken: String,
            params: TransactionMonitoringQueueDeleteParams =
                TransactionMonitoringQueueDeleteParams.none(),
        ): HttpResponse = delete(queueToken, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TransactionMonitoringQueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TransactionMonitoringQueueDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(queueToken: String, requestOptions: RequestOptions): HttpResponse =
            delete(queueToken, TransactionMonitoringQueueDeleteParams.none(), requestOptions)
    }
}
