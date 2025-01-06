// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

class ExternalBankAccountListParams
constructor(
    private val accountToken: String?,
    private val accountTypes: List<AccountType>?,
    private val countries: List<String>?,
    private val endingBefore: String?,
    private val ownerTypes: List<OwnerType>?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val states: List<AccountState>?,
    private val verificationStates: List<VerificationState>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun accountTypes(): Optional<List<AccountType>> = Optional.ofNullable(accountTypes)

    fun countries(): Optional<List<String>> = Optional.ofNullable(countries)

    /**
     * A cursor representing an item's token before which a page of results should end. Used to
     * retrieve the previous page of results before this item.
     */
    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun ownerTypes(): Optional<List<OwnerType>> = Optional.ofNullable(ownerTypes)

    /** Page size (for pagination). */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun states(): Optional<List<AccountState>> = Optional.ofNullable(states)

    fun verificationStates(): Optional<List<VerificationState>> =
        Optional.ofNullable(verificationStates)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountToken?.let { queryParams.put("account_token", listOf(it.toString())) }
        this.accountTypes?.let {
            queryParams.put("account_types", listOf(it.joinToString(separator = ",")))
        }
        this.countries?.let {
            queryParams.put("countries", listOf(it.joinToString(separator = ",")))
        }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.ownerTypes?.let {
            queryParams.put("owner_types", listOf(it.joinToString(separator = ",")))
        }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.states?.let { queryParams.put("states", listOf(it.joinToString(separator = ","))) }
        this.verificationStates?.let {
            queryParams.put("verification_states", listOf(it.joinToString(separator = ",")))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var accountTypes: MutableList<AccountType>? = null
        private var countries: MutableList<String>? = null
        private var endingBefore: String? = null
        private var ownerTypes: MutableList<OwnerType>? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var states: MutableList<AccountState>? = null
        private var verificationStates: MutableList<VerificationState>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalBankAccountListParams: ExternalBankAccountListParams) = apply {
            accountToken = externalBankAccountListParams.accountToken
            accountTypes = externalBankAccountListParams.accountTypes?.toMutableList()
            countries = externalBankAccountListParams.countries?.toMutableList()
            endingBefore = externalBankAccountListParams.endingBefore
            ownerTypes = externalBankAccountListParams.ownerTypes?.toMutableList()
            pageSize = externalBankAccountListParams.pageSize
            startingAfter = externalBankAccountListParams.startingAfter
            states = externalBankAccountListParams.states?.toMutableList()
            verificationStates = externalBankAccountListParams.verificationStates?.toMutableList()
            additionalHeaders = externalBankAccountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalBankAccountListParams.additionalQueryParams.toBuilder()
        }

        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.orElse(null))

        fun accountTypes(accountTypes: List<AccountType>?) = apply {
            this.accountTypes = accountTypes?.toMutableList()
        }

        fun accountTypes(accountTypes: Optional<List<AccountType>>) =
            accountTypes(accountTypes.orElse(null))

        fun addAccountType(accountType: AccountType) = apply {
            accountTypes = (accountTypes ?: mutableListOf()).apply { add(accountType) }
        }

        fun countries(countries: List<String>?) = apply {
            this.countries = countries?.toMutableList()
        }

        fun countries(countries: Optional<List<String>>) = countries(countries.orElse(null))

        fun addCountry(country: String) = apply {
            countries = (countries ?: mutableListOf()).apply { add(country) }
        }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.orElse(null))

        fun ownerTypes(ownerTypes: List<OwnerType>?) = apply {
            this.ownerTypes = ownerTypes?.toMutableList()
        }

        fun ownerTypes(ownerTypes: Optional<List<OwnerType>>) = ownerTypes(ownerTypes.orElse(null))

        fun addOwnerType(ownerType: OwnerType) = apply {
            ownerTypes = (ownerTypes ?: mutableListOf()).apply { add(ownerType) }
        }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Page size (for pagination). */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.orElse(null) as Long?)

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.orElse(null))

        fun states(states: List<AccountState>?) = apply { this.states = states?.toMutableList() }

        fun states(states: Optional<List<AccountState>>) = states(states.orElse(null))

        fun addState(state: AccountState) = apply {
            states = (states ?: mutableListOf()).apply { add(state) }
        }

        fun verificationStates(verificationStates: List<VerificationState>?) = apply {
            this.verificationStates = verificationStates?.toMutableList()
        }

        fun verificationStates(verificationStates: Optional<List<VerificationState>>) =
            verificationStates(verificationStates.orElse(null))

        fun addVerificationState(verificationState: VerificationState) = apply {
            verificationStates =
                (verificationStates ?: mutableListOf()).apply { add(verificationState) }
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

        fun build(): ExternalBankAccountListParams =
            ExternalBankAccountListParams(
                accountToken,
                accountTypes?.toImmutable(),
                countries?.toImmutable(),
                endingBefore,
                ownerTypes?.toImmutable(),
                pageSize,
                startingAfter,
                states?.toImmutable(),
                verificationStates?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class AccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CHECKING = of("CHECKING")

            @JvmField val SAVINGS = of("SAVINGS")

            @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AccountState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = AccountState(JsonField.of(value))
        }

        enum class Known {
            ENABLED,
            CLOSED,
            PAUSED,
        }

        enum class Value {
            ENABLED,
            CLOSED,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENABLED -> Value.ENABLED
                CLOSED -> Value.CLOSED
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENABLED -> Known.ENABLED
                CLOSED -> Known.CLOSED
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown AccountState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class VerificationState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("PENDING")

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val FAILED_VERIFICATION = of("FAILED_VERIFICATION")

            @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            @JvmStatic fun of(value: String) = VerificationState(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
        }

        enum class Value {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountListParams && accountToken == other.accountToken && accountTypes == other.accountTypes && countries == other.countries && endingBefore == other.endingBefore && ownerTypes == other.ownerTypes && pageSize == other.pageSize && startingAfter == other.startingAfter && states == other.states && verificationStates == other.verificationStates && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountToken, accountTypes, countries, endingBefore, ownerTypes, pageSize, startingAfter, states, verificationStates, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountListParams{accountToken=$accountToken, accountTypes=$accountTypes, countries=$countries, endingBefore=$endingBefore, ownerTypes=$ownerTypes, pageSize=$pageSize, startingAfter=$startingAfter, states=$states, verificationStates=$verificationStates, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
