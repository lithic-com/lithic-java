// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Queue
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueDeleteParams
import com.lithic.api.models.TransactionMonitoringQueueListPageAsync
import com.lithic.api.models.TransactionMonitoringQueueListParams
import com.lithic.api.models.TransactionMonitoringQueueRetrieveParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync

    /** Creates a new queue for grouping transaction monitoring cases. */
    fun create(params: TransactionMonitoringQueueCreateParams): CompletableFuture<Queue> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransactionMonitoringQueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Queue>

    /** Retrieves a single transaction monitoring queue. */
    fun retrieve(queueToken: String): CompletableFuture<Queue> =
        retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueToken: String,
        params: TransactionMonitoringQueueRetrieveParams =
            TransactionMonitoringQueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Queue> =
        retrieve(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueToken: String,
        params: TransactionMonitoringQueueRetrieveParams =
            TransactionMonitoringQueueRetrieveParams.none(),
    ): CompletableFuture<Queue> = retrieve(queueToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionMonitoringQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Queue>

    /** @see retrieve */
    fun retrieve(params: TransactionMonitoringQueueRetrieveParams): CompletableFuture<Queue> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(queueToken: String, requestOptions: RequestOptions): CompletableFuture<Queue> =
        retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none(), requestOptions)

    /** Updates a transaction monitoring queue. */
    fun update(queueToken: String): CompletableFuture<Queue> =
        update(queueToken, TransactionMonitoringQueueUpdateParams.none())

    /** @see update */
    fun update(
        queueToken: String,
        params: TransactionMonitoringQueueUpdateParams =
            TransactionMonitoringQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Queue> =
        update(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see update */
    fun update(
        queueToken: String,
        params: TransactionMonitoringQueueUpdateParams =
            TransactionMonitoringQueueUpdateParams.none(),
    ): CompletableFuture<Queue> = update(queueToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TransactionMonitoringQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Queue>

    /** @see update */
    fun update(params: TransactionMonitoringQueueUpdateParams): CompletableFuture<Queue> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(queueToken: String, requestOptions: RequestOptions): CompletableFuture<Queue> =
        update(queueToken, TransactionMonitoringQueueUpdateParams.none(), requestOptions)

    /** Lists transaction monitoring queues. */
    fun list(): CompletableFuture<TransactionMonitoringQueueListPageAsync> =
        list(TransactionMonitoringQueueListParams.none())

    /** @see list */
    fun list(
        params: TransactionMonitoringQueueListParams = TransactionMonitoringQueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringQueueListPageAsync>

    /** @see list */
    fun list(
        params: TransactionMonitoringQueueListParams = TransactionMonitoringQueueListParams.none()
    ): CompletableFuture<TransactionMonitoringQueueListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<TransactionMonitoringQueueListPageAsync> =
        list(TransactionMonitoringQueueListParams.none(), requestOptions)

    /** Deletes a transaction monitoring queue. */
    fun delete(queueToken: String): CompletableFuture<Void?> =
        delete(queueToken, TransactionMonitoringQueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueToken: String,
        params: TransactionMonitoringQueueDeleteParams =
            TransactionMonitoringQueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueToken: String,
        params: TransactionMonitoringQueueDeleteParams =
            TransactionMonitoringQueueDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(queueToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransactionMonitoringQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TransactionMonitoringQueueDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(queueToken: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(queueToken, TransactionMonitoringQueueDeleteParams.none(), requestOptions)

    /** A view of [QueueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transaction_monitoring/queues`, but is
         * otherwise the same as [QueueServiceAsync.create].
         */
        fun create(
            params: TransactionMonitoringQueueCreateParams
        ): CompletableFuture<HttpResponseFor<Queue>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TransactionMonitoringQueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Queue>>

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueServiceAsync.retrieve].
         */
        fun retrieve(queueToken: String): CompletableFuture<HttpResponseFor<Queue>> =
            retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            queueToken: String,
            params: TransactionMonitoringQueueRetrieveParams =
                TransactionMonitoringQueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Queue>> =
            retrieve(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            queueToken: String,
            params: TransactionMonitoringQueueRetrieveParams =
                TransactionMonitoringQueueRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Queue>> =
            retrieve(queueToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionMonitoringQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Queue>>

        /** @see retrieve */
        fun retrieve(
            params: TransactionMonitoringQueueRetrieveParams
        ): CompletableFuture<HttpResponseFor<Queue>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            queueToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Queue>> =
            retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueServiceAsync.update].
         */
        fun update(queueToken: String): CompletableFuture<HttpResponseFor<Queue>> =
            update(queueToken, TransactionMonitoringQueueUpdateParams.none())

        /** @see update */
        fun update(
            queueToken: String,
            params: TransactionMonitoringQueueUpdateParams =
                TransactionMonitoringQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Queue>> =
            update(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see update */
        fun update(
            queueToken: String,
            params: TransactionMonitoringQueueUpdateParams =
                TransactionMonitoringQueueUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Queue>> =
            update(queueToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TransactionMonitoringQueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Queue>>

        /** @see update */
        fun update(
            params: TransactionMonitoringQueueUpdateParams
        ): CompletableFuture<HttpResponseFor<Queue>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            queueToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Queue>> =
            update(queueToken, TransactionMonitoringQueueUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/queues`, but is otherwise
         * the same as [QueueServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransactionMonitoringQueueListPageAsync>> =
            list(TransactionMonitoringQueueListParams.none())

        /** @see list */
        fun list(
            params: TransactionMonitoringQueueListParams =
                TransactionMonitoringQueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringQueueListPageAsync>>

        /** @see list */
        fun list(
            params: TransactionMonitoringQueueListParams =
                TransactionMonitoringQueueListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringQueueListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringQueueListPageAsync>> =
            list(TransactionMonitoringQueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueServiceAsync.delete].
         */
        fun delete(queueToken: String): CompletableFuture<HttpResponse> =
            delete(queueToken, TransactionMonitoringQueueDeleteParams.none())

        /** @see delete */
        fun delete(
            queueToken: String,
            params: TransactionMonitoringQueueDeleteParams =
                TransactionMonitoringQueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see delete */
        fun delete(
            queueToken: String,
            params: TransactionMonitoringQueueDeleteParams =
                TransactionMonitoringQueueDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(queueToken, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TransactionMonitoringQueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(
            params: TransactionMonitoringQueueDeleteParams
        ): CompletableFuture<HttpResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            queueToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(queueToken, TransactionMonitoringQueueDeleteParams.none(), requestOptions)
    }
}
