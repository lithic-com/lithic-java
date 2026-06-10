// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseActivityEntry
import com.lithic.api.models.TransactionMonitoringCaseCommentCreateParams
import com.lithic.api.models.TransactionMonitoringCaseCommentDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseCommentUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync

    /** Adds a comment to a case. */
    fun create(
        caseToken: String,
        params: TransactionMonitoringCaseCommentCreateParams,
    ): CompletableFuture<CaseActivityEntry> = create(caseToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        caseToken: String,
        params: TransactionMonitoringCaseCommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseActivityEntry> =
        create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see create */
    fun create(
        params: TransactionMonitoringCaseCommentCreateParams
    ): CompletableFuture<CaseActivityEntry> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransactionMonitoringCaseCommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseActivityEntry>

    /** Edits an existing comment on a case. */
    fun update(
        commentToken: String,
        params: TransactionMonitoringCaseCommentUpdateParams,
    ): CompletableFuture<CaseActivityEntry> = update(commentToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        commentToken: String,
        params: TransactionMonitoringCaseCommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseActivityEntry> =
        update(params.toBuilder().commentToken(commentToken).build(), requestOptions)

    /** @see update */
    fun update(
        params: TransactionMonitoringCaseCommentUpdateParams
    ): CompletableFuture<CaseActivityEntry> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TransactionMonitoringCaseCommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseActivityEntry>

    /** Deletes a comment from a case. */
    fun delete(
        commentToken: String,
        params: TransactionMonitoringCaseCommentDeleteParams,
    ): CompletableFuture<Void?> = delete(commentToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commentToken: String,
        params: TransactionMonitoringCaseCommentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().commentToken(commentToken).build(), requestOptions)

    /** @see delete */
    fun delete(params: TransactionMonitoringCaseCommentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransactionMonitoringCaseCommentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CommentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/transaction_monitoring/cases/{case_token}/comments`, but is otherwise the same as
         * [CommentServiceAsync.create].
         */
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseCommentCreateParams,
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> =
            create(caseToken, params, RequestOptions.none())

        /** @see create */
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseCommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> =
            create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see create */
        fun create(
            params: TransactionMonitoringCaseCommentCreateParams
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TransactionMonitoringCaseCommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}`, but is otherwise
         * the same as [CommentServiceAsync.update].
         */
        fun update(
            commentToken: String,
            params: TransactionMonitoringCaseCommentUpdateParams,
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> =
            update(commentToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            commentToken: String,
            params: TransactionMonitoringCaseCommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> =
            update(params.toBuilder().commentToken(commentToken).build(), requestOptions)

        /** @see update */
        fun update(
            params: TransactionMonitoringCaseCommentUpdateParams
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TransactionMonitoringCaseCommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}`, but is otherwise
         * the same as [CommentServiceAsync.delete].
         */
        fun delete(
            commentToken: String,
            params: TransactionMonitoringCaseCommentDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(commentToken, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            commentToken: String,
            params: TransactionMonitoringCaseCommentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().commentToken(commentToken).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: TransactionMonitoringCaseCommentDeleteParams
        ): CompletableFuture<HttpResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TransactionMonitoringCaseCommentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
