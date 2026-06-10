// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseFile
import com.lithic.api.models.TransactionMonitoringCaseFileCreateParams
import com.lithic.api.models.TransactionMonitoringCaseFileDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseFileListPageAsync
import com.lithic.api.models.TransactionMonitoringCaseFileListParams
import com.lithic.api.models.TransactionMonitoringCaseFileRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /** Creates a file record and returns a presigned URL for uploading the file to the case. */
    fun create(
        caseToken: String,
        params: TransactionMonitoringCaseFileCreateParams,
    ): CompletableFuture<CaseFile> = create(caseToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        caseToken: String,
        params: TransactionMonitoringCaseFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseFile> =
        create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see create */
    fun create(params: TransactionMonitoringCaseFileCreateParams): CompletableFuture<CaseFile> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransactionMonitoringCaseFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseFile>

    /**
     * Retrieves a single file attached to a case, including a presigned download URL when the file
     * is ready.
     */
    fun retrieve(
        fileToken: String,
        params: TransactionMonitoringCaseFileRetrieveParams,
    ): CompletableFuture<CaseFile> = retrieve(fileToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        fileToken: String,
        params: TransactionMonitoringCaseFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseFile> =
        retrieve(params.toBuilder().fileToken(fileToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TransactionMonitoringCaseFileRetrieveParams): CompletableFuture<CaseFile> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionMonitoringCaseFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseFile>

    /** Lists the files attached to a case. */
    fun list(caseToken: String): CompletableFuture<TransactionMonitoringCaseFileListPageAsync> =
        list(caseToken, TransactionMonitoringCaseFileListParams.none())

    /** @see list */
    fun list(
        caseToken: String,
        params: TransactionMonitoringCaseFileListParams =
            TransactionMonitoringCaseFileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringCaseFileListPageAsync> =
        list(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see list */
    fun list(
        caseToken: String,
        params: TransactionMonitoringCaseFileListParams =
            TransactionMonitoringCaseFileListParams.none(),
    ): CompletableFuture<TransactionMonitoringCaseFileListPageAsync> =
        list(caseToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TransactionMonitoringCaseFileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionMonitoringCaseFileListPageAsync>

    /** @see list */
    fun list(
        params: TransactionMonitoringCaseFileListParams
    ): CompletableFuture<TransactionMonitoringCaseFileListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        caseToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionMonitoringCaseFileListPageAsync> =
        list(caseToken, TransactionMonitoringCaseFileListParams.none(), requestOptions)

    /** Deletes a file from a case. */
    fun delete(
        fileToken: String,
        params: TransactionMonitoringCaseFileDeleteParams,
    ): CompletableFuture<Void?> = delete(fileToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        fileToken: String,
        params: TransactionMonitoringCaseFileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().fileToken(fileToken).build(), requestOptions)

    /** @see delete */
    fun delete(params: TransactionMonitoringCaseFileDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransactionMonitoringCaseFileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/transaction_monitoring/cases/{case_token}/files`, but is otherwise the same as
         * [FileServiceAsync.create].
         */
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseFileCreateParams,
        ): CompletableFuture<HttpResponseFor<CaseFile>> =
            create(caseToken, params, RequestOptions.none())

        /** @see create */
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseFile>> =
            create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see create */
        fun create(
            params: TransactionMonitoringCaseFileCreateParams
        ): CompletableFuture<HttpResponseFor<CaseFile>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TransactionMonitoringCaseFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseFile>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/files/{file_token}`, but is otherwise the
         * same as [FileServiceAsync.retrieve].
         */
        fun retrieve(
            fileToken: String,
            params: TransactionMonitoringCaseFileRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CaseFile>> =
            retrieve(fileToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            fileToken: String,
            params: TransactionMonitoringCaseFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseFile>> =
            retrieve(params.toBuilder().fileToken(fileToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TransactionMonitoringCaseFileRetrieveParams
        ): CompletableFuture<HttpResponseFor<CaseFile>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionMonitoringCaseFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseFile>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        fun list(
            caseToken: String
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseFileListPageAsync>> =
            list(caseToken, TransactionMonitoringCaseFileListParams.none())

        /** @see list */
        fun list(
            caseToken: String,
            params: TransactionMonitoringCaseFileListParams =
                TransactionMonitoringCaseFileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseFileListPageAsync>> =
            list(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see list */
        fun list(
            caseToken: String,
            params: TransactionMonitoringCaseFileListParams =
                TransactionMonitoringCaseFileListParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseFileListPageAsync>> =
            list(caseToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TransactionMonitoringCaseFileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseFileListPageAsync>>

        /** @see list */
        fun list(
            params: TransactionMonitoringCaseFileListParams
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseFileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            caseToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseFileListPageAsync>> =
            list(caseToken, TransactionMonitoringCaseFileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/transaction_monitoring/cases/{case_token}/files/{file_token}`, but is otherwise the
         * same as [FileServiceAsync.delete].
         */
        fun delete(
            fileToken: String,
            params: TransactionMonitoringCaseFileDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(fileToken, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileToken: String,
            params: TransactionMonitoringCaseFileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().fileToken(fileToken).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: TransactionMonitoringCaseFileDeleteParams
        ): CompletableFuture<HttpResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TransactionMonitoringCaseFileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
