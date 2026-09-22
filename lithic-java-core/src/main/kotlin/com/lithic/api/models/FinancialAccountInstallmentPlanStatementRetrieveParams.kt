// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a specific statement snapshot for a given installment plan. */
class FinancialAccountInstallmentPlanStatementRetrieveParams
private constructor(
    private val financialAccountToken: String,
    private val installmentPlanToken: String,
    private val statementToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Globally unique identifier for financial account. */
    fun financialAccountToken(): String = financialAccountToken

    /** Globally unique identifier for installment plan. */
    fun installmentPlanToken(): String = installmentPlanToken

    /** Globally unique identifier for statement. */
    fun statementToken(): Optional<String> = Optional.ofNullable(statementToken)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInstallmentPlanStatementRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * .installmentPlanToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountInstallmentPlanStatementRetrieveParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var installmentPlanToken: String? = null
        private var statementToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            financialAccountInstallmentPlanStatementRetrieveParams:
                FinancialAccountInstallmentPlanStatementRetrieveParams
        ) = apply {
            financialAccountToken =
                financialAccountInstallmentPlanStatementRetrieveParams.financialAccountToken
            installmentPlanToken =
                financialAccountInstallmentPlanStatementRetrieveParams.installmentPlanToken
            statementToken = financialAccountInstallmentPlanStatementRetrieveParams.statementToken
            additionalHeaders =
                financialAccountInstallmentPlanStatementRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountInstallmentPlanStatementRetrieveParams.additionalQueryParams
                    .toBuilder()
        }

        /** Globally unique identifier for financial account. */
        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Globally unique identifier for installment plan. */
        fun installmentPlanToken(installmentPlanToken: String) = apply {
            this.installmentPlanToken = installmentPlanToken
        }

        /** Globally unique identifier for statement. */
        fun statementToken(statementToken: String?) = apply { this.statementToken = statementToken }

        /** Alias for calling [Builder.statementToken] with `statementToken.orElse(null)`. */
        fun statementToken(statementToken: Optional<String>) =
            statementToken(statementToken.getOrNull())

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
         * Returns an immutable instance of
         * [FinancialAccountInstallmentPlanStatementRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * .installmentPlanToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountInstallmentPlanStatementRetrieveParams =
            FinancialAccountInstallmentPlanStatementRetrieveParams(
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("installmentPlanToken", installmentPlanToken),
                statementToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken
            1 -> installmentPlanToken
            2 -> statementToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInstallmentPlanStatementRetrieveParams &&
            financialAccountToken == other.financialAccountToken &&
            installmentPlanToken == other.installmentPlanToken &&
            statementToken == other.statementToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            financialAccountToken,
            installmentPlanToken,
            statementToken,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FinancialAccountInstallmentPlanStatementRetrieveParams{financialAccountToken=$financialAccountToken, installmentPlanToken=$installmentPlanToken, statementToken=$statementToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
