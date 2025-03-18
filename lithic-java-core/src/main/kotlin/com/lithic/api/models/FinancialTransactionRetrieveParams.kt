// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects

/** Get the financial transaction for the provided token. */
class FinancialTransactionRetrieveParams
private constructor(
    private val financialAccountToken: String,
    private val financialTransactionToken: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun financialAccountToken(): String = financialAccountToken

    fun financialTransactionToken(): String = financialTransactionToken

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken
            1 -> financialTransactionToken
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialTransactionRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * .financialTransactionToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialTransactionRetrieveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var financialTransactionToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(financialTransactionRetrieveParams: FinancialTransactionRetrieveParams) =
            apply {
                financialAccountToken = financialTransactionRetrieveParams.financialAccountToken
                financialTransactionToken =
                    financialTransactionRetrieveParams.financialTransactionToken
                additionalHeaders = financialTransactionRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    financialTransactionRetrieveParams.additionalQueryParams.toBuilder()
            }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun financialTransactionToken(financialTransactionToken: String) = apply {
            this.financialTransactionToken = financialTransactionToken
        }

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
         * Returns an immutable instance of [FinancialTransactionRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * .financialTransactionToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialTransactionRetrieveParams =
            FinancialTransactionRetrieveParams(
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("financialTransactionToken", financialTransactionToken),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialTransactionRetrieveParams && financialAccountToken == other.financialAccountToken && financialTransactionToken == other.financialTransactionToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialAccountToken, financialTransactionToken, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FinancialTransactionRetrieveParams{financialAccountToken=$financialAccountToken, financialTransactionToken=$financialTransactionToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
