// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseCard
import com.lithic.api.models.MonitoringCase
import com.lithic.api.models.TransactionMonitoringCaseListActivityPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListActivityParams
import com.lithic.api.models.TransactionMonitoringCaseListPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListParams
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveCardsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveParams
import com.lithic.api.models.TransactionMonitoringCaseUpdateParams
import com.lithic.api.services.async.transactionMonitoring.cases.CommentServiceAsync
import com.lithic.api.services.async.transactionMonitoring.cases.FileServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CaseServiceAsync

    fun comments(): CommentServiceAsync

    fun files(): FileServiceAsync

    /** Retrieves a single transaction monitoring case. */
    fun retrieve(caseToken: String): CompletableFuture<MonitoringCase> =
        retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveParams =
            TransactionMonitoringCaseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitoringCase> =
        retrieve(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveParams =
            TransactionMonitoringCaseRetrieveParams.none(),
    ): CompletableFuture<MonitoringCase> = retrieve(caseToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionMonitoringCaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitoringCase>

    /** @see retrieve */
    fun retrieve(
        params: TransactionMonitoringCaseRetrieveParams
    ): CompletableFuture<MonitoringCase> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        caseToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MonitoringCase> =
        retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none(), requestOptions)

    /** Updates a transaction monitoring case. */
    fun update(caseToken: String): CompletableFuture<MonitoringCase> =
        update(caseToken, TransactionMonitoringCaseUpdateParams.none())

    /** @see update */
    fun update(
        caseToken: String,
        params: TransactionMonitoringCaseUpdateParams =
            TransactionMonitoringCaseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitoringCase> =
        update(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see update */
    fun update(
        caseToken: String,
        params: TransactionMonitoringCaseUpdateParams = TransactionMonitoringCaseUpdateParams.none(),
    ): CompletableFuture<MonitoringCase> = update(caseToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TransactionMonitoringCaseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitoringCase>

    /** @see update */
    fun update(params: TransactionMonitoringCaseUpdateParams): CompletableFuture<MonitoringCase> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        caseToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MonitoringCase> =
        update(caseToken, TransactionMonitoringCaseUpdateParams.none(), requestOptions)

    /** Lists transaction monitoring cases, optionally filtered. */
    fun list(): CompletableFuture<TransactionMonitoringCaseListPageAsync> =
        list(TransactionMonitoringCaseListParams.none())

    /** @see list */
    fun list(
        params: TransactionMonitoringCaseListParams = TransactionMonitoringCaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringCaseListPageAsync>

    /** @see list */
    fun list(
        params: TransactionMonitoringCaseListParams = TransactionMonitoringCaseListParams.none()
    ): CompletableFuture<TransactionMonitoringCaseListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<TransactionMonitoringCaseListPageAsync> =
        list(TransactionMonitoringCaseListParams.none(), requestOptions)

    /** Lists the activity feed for a case. */
    fun listActivity(
        caseToken: String
    ): CompletableFuture<TransactionMonitoringCaseListActivityPageAsync> =
        listActivity(caseToken, TransactionMonitoringCaseListActivityParams.none())

    /** @see listActivity */
    fun listActivity(
        caseToken: String,
        params: TransactionMonitoringCaseListActivityParams =
            TransactionMonitoringCaseListActivityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringCaseListActivityPageAsync> =
        listActivity(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see listActivity */
    fun listActivity(
        caseToken: String,
        params: TransactionMonitoringCaseListActivityParams =
            TransactionMonitoringCaseListActivityParams.none(),
    ): CompletableFuture<TransactionMonitoringCaseListActivityPageAsync> =
        listActivity(caseToken, params, RequestOptions.none())

    /** @see listActivity */
    fun listActivity(
        params: TransactionMonitoringCaseListActivityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringCaseListActivityPageAsync>

    /** @see listActivity */
    fun listActivity(
        params: TransactionMonitoringCaseListActivityParams
    ): CompletableFuture<TransactionMonitoringCaseListActivityPageAsync> =
        listActivity(params, RequestOptions.none())

    /** @see listActivity */
    fun listActivity(
        caseToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionMonitoringCaseListActivityPageAsync> =
        listActivity(caseToken, TransactionMonitoringCaseListActivityParams.none(), requestOptions)

    /** Lists the transactions associated with a case. */
    fun listTransactions(
        caseToken: String
    ): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync> =
        listTransactions(caseToken, TransactionMonitoringCaseListTransactionsParams.none())

    /** @see listTransactions */
    fun listTransactions(
        caseToken: String,
        params: TransactionMonitoringCaseListTransactionsParams =
            TransactionMonitoringCaseListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync> =
        listTransactions(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        caseToken: String,
        params: TransactionMonitoringCaseListTransactionsParams =
            TransactionMonitoringCaseListTransactionsParams.none(),
    ): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync> =
        listTransactions(caseToken, params, RequestOptions.none())

    /** @see listTransactions */
    fun listTransactions(
        params: TransactionMonitoringCaseListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync>

    /** @see listTransactions */
    fun listTransactions(
        params: TransactionMonitoringCaseListTransactionsParams
    ): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync> =
        listTransactions(params, RequestOptions.none())

    /** @see listTransactions */
    fun listTransactions(
        caseToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync> =
        listTransactions(
            caseToken,
            TransactionMonitoringCaseListTransactionsParams.none(),
            requestOptions,
        )

    /** Lists the cards involved in a case, with per-card transaction counts. */
    fun retrieveCards(caseToken: String): CompletableFuture<List<CaseCard>> =
        retrieveCards(caseToken, TransactionMonitoringCaseRetrieveCardsParams.none())

    /** @see retrieveCards */
    fun retrieveCards(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveCardsParams =
            TransactionMonitoringCaseRetrieveCardsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CaseCard>> =
        retrieveCards(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see retrieveCards */
    fun retrieveCards(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveCardsParams =
            TransactionMonitoringCaseRetrieveCardsParams.none(),
    ): CompletableFuture<List<CaseCard>> = retrieveCards(caseToken, params, RequestOptions.none())

    /** @see retrieveCards */
    fun retrieveCards(
        params: TransactionMonitoringCaseRetrieveCardsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CaseCard>>

    /** @see retrieveCards */
    fun retrieveCards(
        params: TransactionMonitoringCaseRetrieveCardsParams
    ): CompletableFuture<List<CaseCard>> = retrieveCards(params, RequestOptions.none())

    /** @see retrieveCards */
    fun retrieveCards(
        caseToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CaseCard>> =
        retrieveCards(
            caseToken,
            TransactionMonitoringCaseRetrieveCardsParams.none(),
            requestOptions,
        )

    /** A view of [CaseServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CaseServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/cases/{case_token}`, but
         * is otherwise the same as [CaseServiceAsync.retrieve].
         */
        fun retrieve(caseToken: String): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveParams =
                TransactionMonitoringCaseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            retrieve(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveParams =
                TransactionMonitoringCaseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            retrieve(caseToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionMonitoringCaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitoringCase>>

        /** @see retrieve */
        fun retrieve(
            params: TransactionMonitoringCaseRetrieveParams
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            caseToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/transaction_monitoring/cases/{case_token}`,
         * but is otherwise the same as [CaseServiceAsync.update].
         */
        fun update(caseToken: String): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            update(caseToken, TransactionMonitoringCaseUpdateParams.none())

        /** @see update */
        fun update(
            caseToken: String,
            params: TransactionMonitoringCaseUpdateParams =
                TransactionMonitoringCaseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            update(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see update */
        fun update(
            caseToken: String,
            params: TransactionMonitoringCaseUpdateParams =
                TransactionMonitoringCaseUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            update(caseToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TransactionMonitoringCaseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitoringCase>>

        /** @see update */
        fun update(
            params: TransactionMonitoringCaseUpdateParams
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            caseToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> =
            update(caseToken, TransactionMonitoringCaseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/cases`, but is otherwise
         * the same as [CaseServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListPageAsync>> =
            list(TransactionMonitoringCaseListParams.none())

        /** @see list */
        fun list(
            params: TransactionMonitoringCaseListParams =
                TransactionMonitoringCaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListPageAsync>>

        /** @see list */
        fun list(
            params: TransactionMonitoringCaseListParams = TransactionMonitoringCaseListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListPageAsync>> =
            list(TransactionMonitoringCaseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/activity`, but is otherwise the same as
         * [CaseServiceAsync.listActivity].
         */
        fun listActivity(
            caseToken: String
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>> =
            listActivity(caseToken, TransactionMonitoringCaseListActivityParams.none())

        /** @see listActivity */
        fun listActivity(
            caseToken: String,
            params: TransactionMonitoringCaseListActivityParams =
                TransactionMonitoringCaseListActivityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>> =
            listActivity(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see listActivity */
        fun listActivity(
            caseToken: String,
            params: TransactionMonitoringCaseListActivityParams =
                TransactionMonitoringCaseListActivityParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>> =
            listActivity(caseToken, params, RequestOptions.none())

        /** @see listActivity */
        fun listActivity(
            params: TransactionMonitoringCaseListActivityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>>

        /** @see listActivity */
        fun listActivity(
            params: TransactionMonitoringCaseListActivityParams
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>> =
            listActivity(params, RequestOptions.none())

        /** @see listActivity */
        fun listActivity(
            caseToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>> =
            listActivity(
                caseToken,
                TransactionMonitoringCaseListActivityParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/transactions`, but is otherwise the same as
         * [CaseServiceAsync.listTransactions].
         */
        fun listTransactions(
            caseToken: String
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>> =
            listTransactions(caseToken, TransactionMonitoringCaseListTransactionsParams.none())

        /** @see listTransactions */
        fun listTransactions(
            caseToken: String,
            params: TransactionMonitoringCaseListTransactionsParams =
                TransactionMonitoringCaseListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>> =
            listTransactions(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see listTransactions */
        fun listTransactions(
            caseToken: String,
            params: TransactionMonitoringCaseListTransactionsParams =
                TransactionMonitoringCaseListTransactionsParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>> =
            listTransactions(caseToken, params, RequestOptions.none())

        /** @see listTransactions */
        fun listTransactions(
            params: TransactionMonitoringCaseListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>>

        /** @see listTransactions */
        fun listTransactions(
            params: TransactionMonitoringCaseListTransactionsParams
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>> =
            listTransactions(params, RequestOptions.none())

        /** @see listTransactions */
        fun listTransactions(
            caseToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>> =
            listTransactions(
                caseToken,
                TransactionMonitoringCaseListTransactionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/cards`, but is otherwise the same as
         * [CaseServiceAsync.retrieveCards].
         */
        fun retrieveCards(caseToken: String): CompletableFuture<HttpResponseFor<List<CaseCard>>> =
            retrieveCards(caseToken, TransactionMonitoringCaseRetrieveCardsParams.none())

        /** @see retrieveCards */
        fun retrieveCards(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveCardsParams =
                TransactionMonitoringCaseRetrieveCardsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CaseCard>>> =
            retrieveCards(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see retrieveCards */
        fun retrieveCards(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveCardsParams =
                TransactionMonitoringCaseRetrieveCardsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<CaseCard>>> =
            retrieveCards(caseToken, params, RequestOptions.none())

        /** @see retrieveCards */
        fun retrieveCards(
            params: TransactionMonitoringCaseRetrieveCardsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CaseCard>>>

        /** @see retrieveCards */
        fun retrieveCards(
            params: TransactionMonitoringCaseRetrieveCardsParams
        ): CompletableFuture<HttpResponseFor<List<CaseCard>>> =
            retrieveCards(params, RequestOptions.none())

        /** @see retrieveCards */
        fun retrieveCards(
            caseToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CaseCard>>> =
            retrieveCards(
                caseToken,
                TransactionMonitoringCaseRetrieveCardsParams.none(),
                requestOptions,
            )
    }
}
