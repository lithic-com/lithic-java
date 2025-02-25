// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/** Get the balances for a program, business, or a given end-user account */
class BalanceListParams
private constructor(
    private val accountToken: String?,
    private val balanceDate: OffsetDateTime?,
    private val businessAccountToken: String?,
    private val financialAccountType: FinancialAccountType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** List balances for all financial accounts of a given account_token. */
    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    /** UTC date and time of the balances to retrieve. Defaults to latest available balances */
    fun balanceDate(): Optional<OffsetDateTime> = Optional.ofNullable(balanceDate)

    /** List balances for all financial accounts of a given business_account_token. */
    fun businessAccountToken(): Optional<String> = Optional.ofNullable(businessAccountToken)

    /** List balances for a given Financial Account type. */
    fun financialAccountType(): Optional<FinancialAccountType> =
        Optional.ofNullable(financialAccountType)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountToken?.let { queryParams.put("account_token", listOf(it.toString())) }
        this.balanceDate?.let {
            queryParams.put(
                "balance_date",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.businessAccountToken?.let {
            queryParams.put("business_account_token", listOf(it.toString()))
        }
        this.financialAccountType?.let {
            queryParams.put("financial_account_type", listOf(it.toString()))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): BalanceListParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var accountToken: String? = null
        private var balanceDate: OffsetDateTime? = null
        private var businessAccountToken: String? = null
        private var financialAccountType: FinancialAccountType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceListParams: BalanceListParams) = apply {
            accountToken = balanceListParams.accountToken
            balanceDate = balanceListParams.balanceDate
            businessAccountToken = balanceListParams.businessAccountToken
            financialAccountType = balanceListParams.financialAccountType
            additionalHeaders = balanceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceListParams.additionalQueryParams.toBuilder()
        }

        /** List balances for all financial accounts of a given account_token. */
        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** List balances for all financial accounts of a given account_token. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.orElse(null))

        /** UTC date and time of the balances to retrieve. Defaults to latest available balances */
        fun balanceDate(balanceDate: OffsetDateTime?) = apply { this.balanceDate = balanceDate }

        /** UTC date and time of the balances to retrieve. Defaults to latest available balances */
        fun balanceDate(balanceDate: Optional<OffsetDateTime>) =
            balanceDate(balanceDate.orElse(null))

        /** List balances for all financial accounts of a given business_account_token. */
        fun businessAccountToken(businessAccountToken: String?) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /** List balances for all financial accounts of a given business_account_token. */
        fun businessAccountToken(businessAccountToken: Optional<String>) =
            businessAccountToken(businessAccountToken.orElse(null))

        /** List balances for a given Financial Account type. */
        fun financialAccountType(financialAccountType: FinancialAccountType?) = apply {
            this.financialAccountType = financialAccountType
        }

        /** List balances for a given Financial Account type. */
        fun financialAccountType(financialAccountType: Optional<FinancialAccountType>) =
            financialAccountType(financialAccountType.orElse(null))

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

        fun build(): BalanceListParams =
            BalanceListParams(
                accountToken,
                balanceDate,
                businessAccountToken,
                financialAccountType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** List balances for a given Financial Account type. */
    class FinancialAccountType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ISSUING = of("ISSUING")

            @JvmField val OPERATING = of("OPERATING")

            @JvmField val RESERVE = of("RESERVE")

            @JvmStatic fun of(value: String) = FinancialAccountType(JsonField.of(value))
        }

        /** An enum containing [FinancialAccountType]'s known values. */
        enum class Known {
            ISSUING,
            OPERATING,
            RESERVE,
        }

        /**
         * An enum containing [FinancialAccountType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FinancialAccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ISSUING,
            OPERATING,
            RESERVE,
            /**
             * An enum member indicating that [FinancialAccountType] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ISSUING -> Value.ISSUING
                OPERATING -> Value.OPERATING
                RESERVE -> Value.RESERVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ISSUING -> Known.ISSUING
                OPERATING -> Known.OPERATING
                RESERVE -> Known.RESERVE
                else -> throw LithicInvalidDataException("Unknown FinancialAccountType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceListParams && accountToken == other.accountToken && balanceDate == other.balanceDate && businessAccountToken == other.businessAccountToken && financialAccountType == other.financialAccountType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountToken, balanceDate, businessAccountToken, financialAccountType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceListParams{accountToken=$accountToken, balanceDate=$balanceDate, businessAccountToken=$businessAccountToken, financialAccountType=$financialAccountType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
