// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve the status of account holder document uploads, or retrieve the upload URLs to process
 * your image uploads.
 *
 * Note that this is not equivalent to checking the status of the KYC evaluation overall (a document
 * may be successfully uploaded but not be sufficient for KYC to pass).
 *
 * In the event your upload URLs have expired, calling this endpoint will refresh them. Similarly,
 * in the event a previous account holder document upload has failed, you can use this endpoint to
 * get a new upload URL for the failed image upload.
 *
 * When a new document upload is generated for a failed attempt, the response will show an
 * additional entry in the `required_document_uploads` list in a `PENDING` state for the
 * corresponding `image_type`.
 */
class AccountHolderListDocumentsParams
private constructor(
    private val accountHolderToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountHolderToken(): Optional<String> = Optional.ofNullable(accountHolderToken)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountHolderListDocumentsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountHolderListDocumentsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderListDocumentsParams]. */
    class Builder internal constructor() {

        private var accountHolderToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountHolderListDocumentsParams: AccountHolderListDocumentsParams) =
            apply {
                accountHolderToken = accountHolderListDocumentsParams.accountHolderToken
                additionalHeaders = accountHolderListDocumentsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    accountHolderListDocumentsParams.additionalQueryParams.toBuilder()
            }

        fun accountHolderToken(accountHolderToken: String?) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /**
         * Alias for calling [Builder.accountHolderToken] with `accountHolderToken.orElse(null)`.
         */
        fun accountHolderToken(accountHolderToken: Optional<String>) =
            accountHolderToken(accountHolderToken.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AccountHolderListDocumentsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountHolderListDocumentsParams =
            AccountHolderListDocumentsParams(
                accountHolderToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountHolderToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderListDocumentsParams &&
            accountHolderToken == other.accountHolderToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountHolderToken, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountHolderListDocumentsParams{accountHolderToken=$accountHolderToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
