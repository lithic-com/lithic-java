// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring.cases

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseActivityEntry
import com.lithic.api.models.TransactionMonitoringCaseCommentCreateParams
import com.lithic.api.models.TransactionMonitoringCaseCommentDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseCommentUpdateParams
import java.util.function.Consumer

interface CommentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService

    /** Adds a comment to a case. */
    fun create(
        caseToken: String,
        params: TransactionMonitoringCaseCommentCreateParams,
    ): CaseActivityEntry = create(caseToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        caseToken: String,
        params: TransactionMonitoringCaseCommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseActivityEntry = create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see create */
    fun create(params: TransactionMonitoringCaseCommentCreateParams): CaseActivityEntry =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransactionMonitoringCaseCommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseActivityEntry

    /** Edits an existing comment on a case. */
    fun update(
        commentToken: String,
        params: TransactionMonitoringCaseCommentUpdateParams,
    ): CaseActivityEntry = update(commentToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        commentToken: String,
        params: TransactionMonitoringCaseCommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseActivityEntry =
        update(params.toBuilder().commentToken(commentToken).build(), requestOptions)

    /** @see update */
    fun update(params: TransactionMonitoringCaseCommentUpdateParams): CaseActivityEntry =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TransactionMonitoringCaseCommentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseActivityEntry

    /** Deletes a comment from a case. */
    fun delete(commentToken: String, params: TransactionMonitoringCaseCommentDeleteParams) =
        delete(commentToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commentToken: String,
        params: TransactionMonitoringCaseCommentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().commentToken(commentToken).build(), requestOptions)

    /** @see delete */
    fun delete(params: TransactionMonitoringCaseCommentDeleteParams) =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransactionMonitoringCaseCommentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [CommentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/transaction_monitoring/cases/{case_token}/comments`, but is otherwise the same as
         * [CommentService.create].
         */
        @MustBeClosed
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseCommentCreateParams,
        ): HttpResponseFor<CaseActivityEntry> = create(caseToken, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseCommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseActivityEntry> =
            create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: TransactionMonitoringCaseCommentCreateParams
        ): HttpResponseFor<CaseActivityEntry> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TransactionMonitoringCaseCommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseActivityEntry>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}`, but is otherwise
         * the same as [CommentService.update].
         */
        @MustBeClosed
        fun update(
            commentToken: String,
            params: TransactionMonitoringCaseCommentUpdateParams,
        ): HttpResponseFor<CaseActivityEntry> = update(commentToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            commentToken: String,
            params: TransactionMonitoringCaseCommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseActivityEntry> =
            update(params.toBuilder().commentToken(commentToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: TransactionMonitoringCaseCommentUpdateParams
        ): HttpResponseFor<CaseActivityEntry> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TransactionMonitoringCaseCommentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseActivityEntry>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}`, but is otherwise
         * the same as [CommentService.delete].
         */
        @MustBeClosed
        fun delete(
            commentToken: String,
            params: TransactionMonitoringCaseCommentDeleteParams,
        ): HttpResponse = delete(commentToken, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentToken: String,
            params: TransactionMonitoringCaseCommentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().commentToken(commentToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TransactionMonitoringCaseCommentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TransactionMonitoringCaseCommentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
