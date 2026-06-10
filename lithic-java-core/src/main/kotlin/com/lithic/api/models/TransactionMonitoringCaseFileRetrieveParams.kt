// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a single file attached to a case, including a presigned download URL when the file is
 * ready.
 */
class TransactionMonitoringCaseFileRetrieveParams
private constructor(
    private val caseToken: String,
    private val fileToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun caseToken(): String = caseToken

    fun fileToken(): Optional<String> = Optional.ofNullable(fileToken)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseFileRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .caseToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionMonitoringCaseFileRetrieveParams]. */
    class Builder internal constructor() {

        private var caseToken: String? = null
        private var fileToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseFileRetrieveParams: TransactionMonitoringCaseFileRetrieveParams
        ) = apply {
            caseToken = transactionMonitoringCaseFileRetrieveParams.caseToken
            fileToken = transactionMonitoringCaseFileRetrieveParams.fileToken
            additionalHeaders =
                transactionMonitoringCaseFileRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transactionMonitoringCaseFileRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun caseToken(caseToken: String) = apply { this.caseToken = caseToken }

        fun fileToken(fileToken: String?) = apply { this.fileToken = fileToken }

        /** Alias for calling [Builder.fileToken] with `fileToken.orElse(null)`. */
        fun fileToken(fileToken: Optional<String>) = fileToken(fileToken.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseFileRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .caseToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionMonitoringCaseFileRetrieveParams =
            TransactionMonitoringCaseFileRetrieveParams(
                checkRequired("caseToken", caseToken),
                fileToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> caseToken
            1 -> fileToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseFileRetrieveParams &&
            caseToken == other.caseToken &&
            fileToken == other.fileToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(caseToken, fileToken, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionMonitoringCaseFileRetrieveParams{caseToken=$caseToken, fileToken=$fileToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
