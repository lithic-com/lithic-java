// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Event representing a lifecycle change to a hold */
class HoldEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val amount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val detailedResults: JsonField<List<DetailedResults>>,
    private val memo: JsonField<String>,
    private val result: JsonField<TransactionResult>,
    private val settlingTransactionToken: JsonField<String>,
    private val type: JsonField<HoldEventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detailed_results")
        @ExcludeMissing
        detailedResults: JsonField<List<DetailedResults>> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<TransactionResult> = JsonMissing.of(),
        @JsonProperty("settling_transaction_token")
        @ExcludeMissing
        settlingTransactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<HoldEventType> = JsonMissing.of(),
    ) : this(
        token,
        amount,
        created,
        detailedResults,
        memo,
        result,
        settlingTransactionToken,
        type,
        mutableMapOf(),
    )

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Amount in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun detailedResults(): List<DetailedResults> = detailedResults.getRequired("detailed_results")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = memo.getOptional("memo")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): TransactionResult = result.getRequired("result")

    /**
     * Transaction token of the payment that settled this hold (only populated for HOLD_SETTLED
     * events)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settlingTransactionToken(): Optional<String> =
        settlingTransactionToken.getOptional("settling_transaction_token")

    /**
     * Type of hold lifecycle event
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): HoldEventType = type.getRequired("type")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [detailedResults].
     *
     * Unlike [detailedResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detailed_results")
    @ExcludeMissing
    fun _detailedResults(): JsonField<List<DetailedResults>> = detailedResults

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

    /**
     * Returns the raw JSON value of [settlingTransactionToken].
     *
     * Unlike [settlingTransactionToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("settling_transaction_token")
    @ExcludeMissing
    fun _settlingTransactionToken(): JsonField<String> = settlingTransactionToken

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<HoldEventType> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HoldEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .amount()
         * .created()
         * .detailedResults()
         * .memo()
         * .result()
         * .settlingTransactionToken()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HoldEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var detailedResults: JsonField<MutableList<DetailedResults>>? = null
        private var memo: JsonField<String>? = null
        private var result: JsonField<TransactionResult>? = null
        private var settlingTransactionToken: JsonField<String>? = null
        private var type: JsonField<HoldEventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(holdEvent: HoldEvent) = apply {
            token = holdEvent.token
            amount = holdEvent.amount
            created = holdEvent.created
            detailedResults = holdEvent.detailedResults.map { it.toMutableList() }
            memo = holdEvent.memo
            result = holdEvent.result
            settlingTransactionToken = holdEvent.settlingTransactionToken
            type = holdEvent.type
            additionalProperties = holdEvent.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Amount in cents */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun detailedResults(detailedResults: List<DetailedResults>) =
            detailedResults(JsonField.of(detailedResults))

        /**
         * Sets [Builder.detailedResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detailedResults] with a well-typed
         * `List<DetailedResults>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun detailedResults(detailedResults: JsonField<List<DetailedResults>>) = apply {
            this.detailedResults = detailedResults.map { it.toMutableList() }
        }

        /**
         * Adds a single [DetailedResults] to [detailedResults].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDetailedResult(detailedResult: DetailedResults) = apply {
            detailedResults =
                (detailedResults ?: JsonField.of(mutableListOf())).also {
                    checkKnown("detailedResults", it).add(detailedResult)
                }
        }

        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /** Alias for calling [Builder.memo] with `memo.orElse(null)`. */
        fun memo(memo: Optional<String>) = memo(memo.getOrNull())

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        fun result(result: TransactionResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [TransactionResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

        /**
         * Transaction token of the payment that settled this hold (only populated for HOLD_SETTLED
         * events)
         */
        fun settlingTransactionToken(settlingTransactionToken: String?) =
            settlingTransactionToken(JsonField.ofNullable(settlingTransactionToken))

        /**
         * Alias for calling [Builder.settlingTransactionToken] with
         * `settlingTransactionToken.orElse(null)`.
         */
        fun settlingTransactionToken(settlingTransactionToken: Optional<String>) =
            settlingTransactionToken(settlingTransactionToken.getOrNull())

        /**
         * Sets [Builder.settlingTransactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlingTransactionToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun settlingTransactionToken(settlingTransactionToken: JsonField<String>) = apply {
            this.settlingTransactionToken = settlingTransactionToken
        }

        /** Type of hold lifecycle event */
        fun type(type: HoldEventType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [HoldEventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<HoldEventType>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [HoldEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .amount()
         * .created()
         * .detailedResults()
         * .memo()
         * .result()
         * .settlingTransactionToken()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HoldEvent =
            HoldEvent(
                checkRequired("token", token),
                checkRequired("amount", amount),
                checkRequired("created", created),
                checkRequired("detailedResults", detailedResults).map { it.toImmutable() },
                checkRequired("memo", memo),
                checkRequired("result", result),
                checkRequired("settlingTransactionToken", settlingTransactionToken),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HoldEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        amount()
        created()
        detailedResults().forEach { it.validate() }
        memo()
        result().validate()
        settlingTransactionToken()
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (detailedResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (memo.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (settlingTransactionToken.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class DetailedResults @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            @JvmStatic fun of(value: String) = DetailedResults(JsonField.of(value))
        }

        /** An enum containing [DetailedResults]'s known values. */
        enum class Known {
            APPROVED,
            INSUFFICIENT_FUNDS,
        }

        /**
         * An enum containing [DetailedResults]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DetailedResults] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            INSUFFICIENT_FUNDS,
            /**
             * An enum member indicating that [DetailedResults] was instantiated with an unknown
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
                APPROVED -> Value.APPROVED
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
                APPROVED -> Known.APPROVED
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown DetailedResults: $value")
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

        fun validate(): DetailedResults = apply {
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

            return other is DetailedResults && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TransactionResult @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
        }

        /** An enum containing [TransactionResult]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
        }

        /**
         * An enum containing [TransactionResult]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            /**
             * An enum member indicating that [TransactionResult] was instantiated with an unknown
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
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
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
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
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

        fun validate(): TransactionResult = apply {
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

            return other is TransactionResult && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of hold lifecycle event */
    class HoldEventType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val HOLD_INITIATED = of("HOLD_INITIATED")

            @JvmField val HOLD_VOIDED = of("HOLD_VOIDED")

            @JvmField val HOLD_EXPIRED = of("HOLD_EXPIRED")

            @JvmField val HOLD_SETTLED = of("HOLD_SETTLED")

            @JvmStatic fun of(value: String) = HoldEventType(JsonField.of(value))
        }

        /** An enum containing [HoldEventType]'s known values. */
        enum class Known {
            HOLD_INITIATED,
            HOLD_VOIDED,
            HOLD_EXPIRED,
            HOLD_SETTLED,
        }

        /**
         * An enum containing [HoldEventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HoldEventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HOLD_INITIATED,
            HOLD_VOIDED,
            HOLD_EXPIRED,
            HOLD_SETTLED,
            /**
             * An enum member indicating that [HoldEventType] was instantiated with an unknown
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
                HOLD_INITIATED -> Value.HOLD_INITIATED
                HOLD_VOIDED -> Value.HOLD_VOIDED
                HOLD_EXPIRED -> Value.HOLD_EXPIRED
                HOLD_SETTLED -> Value.HOLD_SETTLED
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
                HOLD_INITIATED -> Known.HOLD_INITIATED
                HOLD_VOIDED -> Known.HOLD_VOIDED
                HOLD_EXPIRED -> Known.HOLD_EXPIRED
                HOLD_SETTLED -> Known.HOLD_SETTLED
                else -> throw LithicInvalidDataException("Unknown HoldEventType: $value")
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

        fun validate(): HoldEventType = apply {
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

            return other is HoldEventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HoldEvent &&
            token == other.token &&
            amount == other.amount &&
            created == other.created &&
            detailedResults == other.detailedResults &&
            memo == other.memo &&
            result == other.result &&
            settlingTransactionToken == other.settlingTransactionToken &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            amount,
            created,
            detailedResults,
            memo,
            result,
            settlingTransactionToken,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HoldEvent{token=$token, amount=$amount, created=$created, detailedResults=$detailedResults, memo=$memo, result=$result, settlingTransactionToken=$settlingTransactionToken, type=$type, additionalProperties=$additionalProperties}"
}
