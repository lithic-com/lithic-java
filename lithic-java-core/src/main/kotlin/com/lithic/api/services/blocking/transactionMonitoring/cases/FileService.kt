// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring.cases

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseFile
import com.lithic.api.models.TransactionMonitoringCaseFileCreateParams
import com.lithic.api.models.TransactionMonitoringCaseFileDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseFileListPage
import com.lithic.api.models.TransactionMonitoringCaseFileListParams
import com.lithic.api.models.TransactionMonitoringCaseFileRetrieveParams
import java.util.function.Consumer

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /** Creates a file record and returns a presigned URL for uploading the file to the case. */
    fun create(caseToken: String, params: TransactionMonitoringCaseFileCreateParams): CaseFile =
        create(caseToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        caseToken: String,
        params: TransactionMonitoringCaseFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile = create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see create */
    fun create(params: TransactionMonitoringCaseFileCreateParams): CaseFile =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransactionMonitoringCaseFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile

    /**
     * Retrieves a single file attached to a case, including a presigned download URL when the file
     * is ready.
     */
    fun retrieve(fileToken: String, params: TransactionMonitoringCaseFileRetrieveParams): CaseFile =
        retrieve(fileToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        fileToken: String,
        params: TransactionMonitoringCaseFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile = retrieve(params.toBuilder().fileToken(fileToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TransactionMonitoringCaseFileRetrieveParams): CaseFile =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionMonitoringCaseFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile

    /** Lists the files attached to a case. */
    fun list(caseToken: String): TransactionMonitoringCaseFileListPage =
        list(caseToken, TransactionMonitoringCaseFileListParams.none())

    /** @see list */
    fun list(
        caseToken: String,
        params: TransactionMonitoringCaseFileListParams =
            TransactionMonitoringCaseFileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseFileListPage =
        list(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see list */
    fun list(
        caseToken: String,
        params: TransactionMonitoringCaseFileListParams =
            TransactionMonitoringCaseFileListParams.none(),
    ): TransactionMonitoringCaseFileListPage = list(caseToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TransactionMonitoringCaseFileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseFileListPage

    /** @see list */
    fun list(
        params: TransactionMonitoringCaseFileListParams
    ): TransactionMonitoringCaseFileListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        caseToken: String,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseFileListPage =
        list(caseToken, TransactionMonitoringCaseFileListParams.none(), requestOptions)

    /** Deletes a file from a case. */
    fun delete(fileToken: String, params: TransactionMonitoringCaseFileDeleteParams) =
        delete(fileToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        fileToken: String,
        params: TransactionMonitoringCaseFileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileToken(fileToken).build(), requestOptions)

    /** @see delete */
    fun delete(params: TransactionMonitoringCaseFileDeleteParams) =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransactionMonitoringCaseFileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/transaction_monitoring/cases/{case_token}/files`, but is otherwise the same as
         * [FileService.create].
         */
        @MustBeClosed
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseFileCreateParams,
        ): HttpResponseFor<CaseFile> = create(caseToken, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            caseToken: String,
            params: TransactionMonitoringCaseFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile> =
            create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TransactionMonitoringCaseFileCreateParams): HttpResponseFor<CaseFile> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TransactionMonitoringCaseFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile>

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/files/{file_token}`, but is otherwise the
         * same as [FileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            fileToken: String,
            params: TransactionMonitoringCaseFileRetrieveParams,
        ): HttpResponseFor<CaseFile> = retrieve(fileToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fileToken: String,
            params: TransactionMonitoringCaseFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile> =
            retrieve(params.toBuilder().fileToken(fileToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionMonitoringCaseFileRetrieveParams
        ): HttpResponseFor<CaseFile> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionMonitoringCaseFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile>

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed
        fun list(caseToken: String): HttpResponseFor<TransactionMonitoringCaseFileListPage> =
            list(caseToken, TransactionMonitoringCaseFileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            caseToken: String,
            params: TransactionMonitoringCaseFileListParams =
                TransactionMonitoringCaseFileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseFileListPage> =
            list(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            caseToken: String,
            params: TransactionMonitoringCaseFileListParams =
                TransactionMonitoringCaseFileListParams.none(),
        ): HttpResponseFor<TransactionMonitoringCaseFileListPage> =
            list(caseToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionMonitoringCaseFileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseFileListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionMonitoringCaseFileListParams
        ): HttpResponseFor<TransactionMonitoringCaseFileListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseFileListPage> =
            list(caseToken, TransactionMonitoringCaseFileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/transaction_monitoring/cases/{case_token}/files/{file_token}`, but is otherwise the
         * same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(
            fileToken: String,
            params: TransactionMonitoringCaseFileDeleteParams,
        ): HttpResponse = delete(fileToken, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileToken: String,
            params: TransactionMonitoringCaseFileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileToken(fileToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TransactionMonitoringCaseFileDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TransactionMonitoringCaseFileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
