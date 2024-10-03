// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    fun accountTypes(): Optional<List<AccountType>> = Optional.ofNullable(accountTypes)

    fun countries(): Optional<List<String>> = Optional.ofNullable(countries)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun ownerTypes(): Optional<List<OwnerType>> = Optional.ofNullable(ownerTypes)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun states(): Optional<List<AccountState>> = Optional.ofNullable(states)

    fun verificationStates(): Optional<List<VerificationState>> =
        Optional.ofNullable(verificationStates)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.accountToken?.let { params.put("account_token", listOf(it.toString())) }
        this.accountTypes?.let {
            params.put("account_types", listOf(it.joinToString(separator = ",")))
        }
        this.countries?.let { params.put("countries", listOf(it.joinToString(separator = ","))) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.ownerTypes?.let { params.put("owner_types", listOf(it.joinToString(separator = ","))) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.states?.let { params.put("states", listOf(it.joinToString(separator = ","))) }
        this.verificationStates?.let {
            params.put("verification_states", listOf(it.joinToString(separator = ",")))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountListParams && this.accountToken == other.accountToken && this.accountTypes == other.accountTypes && this.countries == other.countries && this.endingBefore == other.endingBefore && this.ownerTypes == other.ownerTypes && this.pageSize == other.pageSize && this.startingAfter == other.startingAfter && this.states == other.states && this.verificationStates == other.verificationStates && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountToken, accountTypes, countries, endingBefore, ownerTypes, pageSize, startingAfter, states, verificationStates, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "ExternalBankAccountListParams{accountToken=$accountToken, accountTypes=$accountTypes, countries=$countries, endingBefore=$endingBefore, ownerTypes=$ownerTypes, pageSize=$pageSize, startingAfter=$startingAfter, states=$states, verificationStates=$verificationStates, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var accountTypes: MutableList<AccountType> = mutableListOf()
        private var countries: MutableList<String> = mutableListOf()
        private var endingBefore: String? = null
        private var ownerTypes: MutableList<OwnerType> = mutableListOf()
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var states: MutableList<AccountState> = mutableListOf()
        private var verificationStates: MutableList<VerificationState> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountListParams: ExternalBankAccountListParams) = apply {
            this.accountToken = externalBankAccountListParams.accountToken
            this.accountTypes(externalBankAccountListParams.accountTypes ?: listOf())
            this.countries(externalBankAccountListParams.countries ?: listOf())
            this.endingBefore = externalBankAccountListParams.endingBefore
            this.ownerTypes(externalBankAccountListParams.ownerTypes ?: listOf())
            this.pageSize = externalBankAccountListParams.pageSize
            this.startingAfter = externalBankAccountListParams.startingAfter
            this.states(externalBankAccountListParams.states ?: listOf())
            this.verificationStates(externalBankAccountListParams.verificationStates ?: listOf())
            additionalQueryParams(externalBankAccountListParams.additionalQueryParams)
            additionalHeaders(externalBankAccountListParams.additionalHeaders)
        }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        fun accountTypes(accountTypes: List<AccountType>) = apply {
            this.accountTypes.clear()
            this.accountTypes.addAll(accountTypes)
        }

        fun addAccountType(accountType: AccountType) = apply { this.accountTypes.add(accountType) }

        fun countries(countries: List<String>) = apply {
            this.countries.clear()
            this.countries.addAll(countries)
        }

        fun addCountry(country: String) = apply { this.countries.add(country) }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        fun ownerTypes(ownerTypes: List<OwnerType>) = apply {
            this.ownerTypes.clear()
            this.ownerTypes.addAll(ownerTypes)
        }

        fun addOwnerType(ownerType: OwnerType) = apply { this.ownerTypes.add(ownerType) }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        fun states(states: List<AccountState>) = apply {
            this.states.clear()
            this.states.addAll(states)
        }

        fun addState(state: AccountState) = apply { this.states.add(state) }

        fun verificationStates(verificationStates: List<VerificationState>) = apply {
            this.verificationStates.clear()
            this.verificationStates.addAll(verificationStates)
        }

        fun addVerificationState(verificationState: VerificationState) = apply {
            this.verificationStates.add(verificationState)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): ExternalBankAccountListParams =
            ExternalBankAccountListParams(
                accountToken,
                if (accountTypes.size == 0) null else accountTypes.toUnmodifiable(),
                if (countries.size == 0) null else countries.toUnmodifiable(),
                endingBefore,
                if (ownerTypes.size == 0) null else ownerTypes.toUnmodifiable(),
                pageSize,
                startingAfter,
                if (states.size == 0) null else states.toUnmodifiable(),
                if (verificationStates.size == 0) null else verificationStates.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class AccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECKING = AccountType(JsonField.of("CHECKING"))

            @JvmField val SAVINGS = AccountType(JsonField.of("SAVINGS"))

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
    }

    class AccountState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountState && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ENABLED = AccountState(JsonField.of("ENABLED"))

            @JvmField val CLOSED = AccountState(JsonField.of("CLOSED"))

            @JvmField val PAUSED = AccountState(JsonField.of("PAUSED"))

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
    }

    class VerificationState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationState && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = VerificationState(JsonField.of("PENDING"))

            @JvmField val ENABLED = VerificationState(JsonField.of("ENABLED"))

            @JvmField
            val FAILED_VERIFICATION = VerificationState(JsonField.of("FAILED_VERIFICATION"))

            @JvmField val INSUFFICIENT_FUNDS = VerificationState(JsonField.of("INSUFFICIENT_FUNDS"))

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
    }
}
