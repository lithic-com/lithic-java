// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all the external bank accounts for the provided search criteria. */
class ExternalBankAccountListParams
private constructor(
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
) : Params {

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExternalBankAccountListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalBankAccountListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBankAccountListParams]. */
    class Builder internal constructor() {

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

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

        fun accountTypes(accountTypes: List<AccountType>?) = apply {
            this.accountTypes = accountTypes?.toMutableList()
        }

        /** Alias for calling [Builder.accountTypes] with `accountTypes.orElse(null)`. */
        fun accountTypes(accountTypes: Optional<List<AccountType>>) =
            accountTypes(accountTypes.getOrNull())

        /**
         * Adds a single [AccountType] to [accountTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountType(accountType: AccountType) = apply {
            accountTypes = (accountTypes ?: mutableListOf()).apply { add(accountType) }
        }

        fun countries(countries: List<String>?) = apply {
            this.countries = countries?.toMutableList()
        }

        /** Alias for calling [Builder.countries] with `countries.orElse(null)`. */
        fun countries(countries: Optional<List<String>>) = countries(countries.getOrNull())

        /**
         * Adds a single [String] to [countries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCountry(country: String) = apply {
            countries = (countries ?: mutableListOf()).apply { add(country) }
        }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        fun ownerTypes(ownerTypes: List<OwnerType>?) = apply {
            this.ownerTypes = ownerTypes?.toMutableList()
        }

        /** Alias for calling [Builder.ownerTypes] with `ownerTypes.orElse(null)`. */
        fun ownerTypes(ownerTypes: Optional<List<OwnerType>>) = ownerTypes(ownerTypes.getOrNull())

        /**
         * Adds a single [OwnerType] to [ownerTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOwnerType(ownerType: OwnerType) = apply {
            ownerTypes = (ownerTypes ?: mutableListOf()).apply { add(ownerType) }
        }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

        fun states(states: List<AccountState>?) = apply { this.states = states?.toMutableList() }

        /** Alias for calling [Builder.states] with `states.orElse(null)`. */
        fun states(states: Optional<List<AccountState>>) = states(states.getOrNull())

        /**
         * Adds a single [AccountState] to [states].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addState(state: AccountState) = apply {
            states = (states ?: mutableListOf()).apply { add(state) }
        }

        fun verificationStates(verificationStates: List<VerificationState>?) = apply {
            this.verificationStates = verificationStates?.toMutableList()
        }

        /**
         * Alias for calling [Builder.verificationStates] with `verificationStates.orElse(null)`.
         */
        fun verificationStates(verificationStates: Optional<List<VerificationState>>) =
            verificationStates(verificationStates.getOrNull())

        /**
         * Adds a single [VerificationState] to [verificationStates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * Returns an immutable instance of [ExternalBankAccountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountToken?.let { put("account_token", it) }
                accountTypes?.let { put("account_types", it.joinToString(",") { it.toString() }) }
                countries?.let { put("countries", it.joinToString(",")) }
                endingBefore?.let { put("ending_before", it) }
                ownerTypes?.let { put("owner_types", it.joinToString(",") { it.toString() }) }
                pageSize?.let { put("page_size", it.toString()) }
                startingAfter?.let { put("starting_after", it) }
                states?.let { put("states", it.joinToString(",") { it.toString() }) }
                verificationStates?.let {
                    put("verification_states", it.joinToString(",") { it.toString() })
                }
                putAll(additionalQueryParams)
            }
            .build()

    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CHECKING = of("CHECKING")

            @JvmField val SAVINGS = of("SAVINGS")

            @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            CHECKING,
            SAVINGS,
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECKING,
            SAVINGS,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
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

        private var validated: Boolean = false

        fun validate(): AccountType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AccountState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = AccountState(JsonField.of(value))
        }

        /** An enum containing [AccountState]'s known values. */
        enum class Known {
            ENABLED,
            CLOSED,
            PAUSED,
        }

        /**
         * An enum containing [AccountState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            CLOSED,
            PAUSED,
            /**
             * An enum member indicating that [AccountState] was instantiated with an unknown value.
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
                ENABLED -> Value.ENABLED
                CLOSED -> Value.CLOSED
                PAUSED -> Value.PAUSED
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
                ENABLED -> Known.ENABLED
                CLOSED -> Known.CLOSED
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown AccountState: $value")
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

        private var validated: Boolean = false

        fun validate(): AccountState = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class VerificationState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val FAILED_VERIFICATION = of("FAILED_VERIFICATION")

            @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            @JvmStatic fun of(value: String) = VerificationState(JsonField.of(value))
        }

        /** An enum containing [VerificationState]'s known values. */
        enum class Known {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
        }

        /**
         * An enum containing [VerificationState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            /**
             * An enum member indicating that [VerificationState] was instantiated with an unknown
             * value.
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
                PENDING -> Value.PENDING
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
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
                PENDING -> Known.PENDING
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
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

        private var validated: Boolean = false

        fun validate(): VerificationState = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
