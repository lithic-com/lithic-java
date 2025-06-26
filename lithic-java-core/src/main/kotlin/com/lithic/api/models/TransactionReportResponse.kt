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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TransactionReportResponse
private constructor(
    private val fraudStatus: JsonField<FraudStatus>,
    private val transactionToken: JsonField<String>,
    private val comment: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val fraudType: JsonField<FraudType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fraud_status")
        @ExcludeMissing
        fraudStatus: JsonField<FraudStatus> = JsonMissing.of(),
        @JsonProperty("transaction_token")
        @ExcludeMissing
        transactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fraud_type")
        @ExcludeMissing
        fraudType: JsonField<FraudType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        fraudStatus,
        transactionToken,
        comment,
        createdAt,
        fraudType,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The fraud status of the transaction, string (enum) supporting the following values:
     * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t been
     *   confirmed.
     * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may immediately
     *   be moved into this state, or be graduated into this state from the `SUSPECTED_FRAUD` state.
     * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A transaction
     *   may immediately be moved into this state, or be graduated into this state from the
     *   `SUSPECTED_FRAUD` state.
     * - `NO_REPORTED_FRAUD`: Indicates that no fraud report exists for the transaction. It is the
     *   default state for transactions that have not been analyzed or associated with any known
     *   fraudulent activity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fraudStatus(): FraudStatus = fraudStatus.getRequired("fraud_status")

    /**
     * The universally unique identifier (UUID) associated with the transaction being reported.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /**
     * Provides additional context or details about the fraud report.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * Timestamp representing when the fraud report was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Specifies the type or category of fraud that the transaction is suspected or confirmed to
     * involve, string (enum) supporting the following values:
     * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or cardholder
     *   intentionally misuses financial services for personal gain. This includes actions such as
     *   disputing legitimate transactions to obtain a refund, abusing return policies, or
     *   defaulting on credit obligations without intent to repay.
     * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains unauthorized
     *   access to an existing account, modifies account settings, and carries out fraudulent
     *   transactions.
     * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to card
     *   details without taking over the account, such as through physical card theft, cloning, or
     *   online data breaches.
     * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
     *   information, such as Social Security numbers or addresses, to open accounts, apply for
     *   loans, or conduct financial transactions in someone's name.
     * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates or
     *   coerces a legitimate cardholder into unauthorized transactions, often through social
     *   engineering tactics.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fraudType(): Optional<FraudType> = fraudType.getOptional("fraud_type")

    /**
     * Timestamp representing the last update to the fraud report.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [fraudStatus].
     *
     * Unlike [fraudStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fraud_status")
    @ExcludeMissing
    fun _fraudStatus(): JsonField<FraudStatus> = fraudStatus

    /**
     * Returns the raw JSON value of [transactionToken].
     *
     * Unlike [transactionToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [fraudType].
     *
     * Unlike [fraudType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fraud_type") @ExcludeMissing fun _fraudType(): JsonField<FraudType> = fraudType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [TransactionReportResponse].
         *
         * The following fields are required:
         * ```java
         * .fraudStatus()
         * .transactionToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionReportResponse]. */
    class Builder internal constructor() {

        private var fraudStatus: JsonField<FraudStatus>? = null
        private var transactionToken: JsonField<String>? = null
        private var comment: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fraudType: JsonField<FraudType> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionReportResponse: TransactionReportResponse) = apply {
            fraudStatus = transactionReportResponse.fraudStatus
            transactionToken = transactionReportResponse.transactionToken
            comment = transactionReportResponse.comment
            createdAt = transactionReportResponse.createdAt
            fraudType = transactionReportResponse.fraudType
            updatedAt = transactionReportResponse.updatedAt
            additionalProperties = transactionReportResponse.additionalProperties.toMutableMap()
        }

        /**
         * The fraud status of the transaction, string (enum) supporting the following values:
         * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t been
         *   confirmed.
         * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may
         *   immediately be moved into this state, or be graduated into this state from the
         *   `SUSPECTED_FRAUD` state.
         * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A
         *   transaction may immediately be moved into this state, or be graduated into this state
         *   from the `SUSPECTED_FRAUD` state.
         * - `NO_REPORTED_FRAUD`: Indicates that no fraud report exists for the transaction. It is
         *   the default state for transactions that have not been analyzed or associated with any
         *   known fraudulent activity.
         */
        fun fraudStatus(fraudStatus: FraudStatus) = fraudStatus(JsonField.of(fraudStatus))

        /**
         * Sets [Builder.fraudStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fraudStatus] with a well-typed [FraudStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fraudStatus(fraudStatus: JsonField<FraudStatus>) = apply {
            this.fraudStatus = fraudStatus
        }

        /**
         * The universally unique identifier (UUID) associated with the transaction being reported.
         */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /**
         * Sets [Builder.transactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
        }

        /** Provides additional context or details about the fraud report. */
        fun comment(comment: String) = comment(JsonField.of(comment))

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /** Timestamp representing when the fraud report was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Specifies the type or category of fraud that the transaction is suspected or confirmed to
         * involve, string (enum) supporting the following values:
         * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or cardholder
         *   intentionally misuses financial services for personal gain. This includes actions such
         *   as disputing legitimate transactions to obtain a refund, abusing return policies, or
         *   defaulting on credit obligations without intent to repay.
         * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains unauthorized
         *   access to an existing account, modifies account settings, and carries out fraudulent
         *   transactions.
         * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to card
         *   details without taking over the account, such as through physical card theft, cloning,
         *   or online data breaches.
         * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
         *   information, such as Social Security numbers or addresses, to open accounts, apply for
         *   loans, or conduct financial transactions in someone's name.
         * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates or
         *   coerces a legitimate cardholder into unauthorized transactions, often through social
         *   engineering tactics.
         */
        fun fraudType(fraudType: FraudType) = fraudType(JsonField.of(fraudType))

        /**
         * Sets [Builder.fraudType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fraudType] with a well-typed [FraudType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fraudType(fraudType: JsonField<FraudType>) = apply { this.fraudType = fraudType }

        /** Timestamp representing the last update to the fraud report. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TransactionReportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fraudStatus()
         * .transactionToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionReportResponse =
            TransactionReportResponse(
                checkRequired("fraudStatus", fraudStatus),
                checkRequired("transactionToken", transactionToken),
                comment,
                createdAt,
                fraudType,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TransactionReportResponse = apply {
        if (validated) {
            return@apply
        }

        fraudStatus().validate()
        transactionToken()
        comment()
        createdAt()
        fraudType().ifPresent { it.validate() }
        updatedAt()
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
        (fraudStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionToken.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (fraudType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * The fraud status of the transaction, string (enum) supporting the following values:
     * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t been
     *   confirmed.
     * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may immediately
     *   be moved into this state, or be graduated into this state from the `SUSPECTED_FRAUD` state.
     * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A transaction
     *   may immediately be moved into this state, or be graduated into this state from the
     *   `SUSPECTED_FRAUD` state.
     * - `NO_REPORTED_FRAUD`: Indicates that no fraud report exists for the transaction. It is the
     *   default state for transactions that have not been analyzed or associated with any known
     *   fraudulent activity.
     */
    class FraudStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SUSPECTED_FRAUD = of("SUSPECTED_FRAUD")

            @JvmField val FRAUDULENT = of("FRAUDULENT")

            @JvmField val NOT_FRAUDULENT = of("NOT_FRAUDULENT")

            @JvmField val NO_REPORTED_FRAUD = of("NO_REPORTED_FRAUD")

            @JvmStatic fun of(value: String) = FraudStatus(JsonField.of(value))
        }

        /** An enum containing [FraudStatus]'s known values. */
        enum class Known {
            SUSPECTED_FRAUD,
            FRAUDULENT,
            NOT_FRAUDULENT,
            NO_REPORTED_FRAUD,
        }

        /**
         * An enum containing [FraudStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FraudStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUSPECTED_FRAUD,
            FRAUDULENT,
            NOT_FRAUDULENT,
            NO_REPORTED_FRAUD,
            /**
             * An enum member indicating that [FraudStatus] was instantiated with an unknown value.
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
                SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                FRAUDULENT -> Value.FRAUDULENT
                NOT_FRAUDULENT -> Value.NOT_FRAUDULENT
                NO_REPORTED_FRAUD -> Value.NO_REPORTED_FRAUD
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
                SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                FRAUDULENT -> Known.FRAUDULENT
                NOT_FRAUDULENT -> Known.NOT_FRAUDULENT
                NO_REPORTED_FRAUD -> Known.NO_REPORTED_FRAUD
                else -> throw LithicInvalidDataException("Unknown FraudStatus: $value")
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

        fun validate(): FraudStatus = apply {
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

            return /* spotless:off */ other is FraudStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the type or category of fraud that the transaction is suspected or confirmed to
     * involve, string (enum) supporting the following values:
     * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or cardholder
     *   intentionally misuses financial services for personal gain. This includes actions such as
     *   disputing legitimate transactions to obtain a refund, abusing return policies, or
     *   defaulting on credit obligations without intent to repay.
     * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains unauthorized
     *   access to an existing account, modifies account settings, and carries out fraudulent
     *   transactions.
     * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to card
     *   details without taking over the account, such as through physical card theft, cloning, or
     *   online data breaches.
     * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
     *   information, such as Social Security numbers or addresses, to open accounts, apply for
     *   loans, or conduct financial transactions in someone's name.
     * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates or
     *   coerces a legitimate cardholder into unauthorized transactions, often through social
     *   engineering tactics.
     */
    class FraudType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FIRST_PARTY_FRAUD = of("FIRST_PARTY_FRAUD")

            @JvmField val ACCOUNT_TAKEOVER = of("ACCOUNT_TAKEOVER")

            @JvmField val CARD_COMPROMISED = of("CARD_COMPROMISED")

            @JvmField val IDENTITY_THEFT = of("IDENTITY_THEFT")

            @JvmField val CARDHOLDER_MANIPULATION = of("CARDHOLDER_MANIPULATION")

            @JvmStatic fun of(value: String) = FraudType(JsonField.of(value))
        }

        /** An enum containing [FraudType]'s known values. */
        enum class Known {
            FIRST_PARTY_FRAUD,
            ACCOUNT_TAKEOVER,
            CARD_COMPROMISED,
            IDENTITY_THEFT,
            CARDHOLDER_MANIPULATION,
        }

        /**
         * An enum containing [FraudType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FraudType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIRST_PARTY_FRAUD,
            ACCOUNT_TAKEOVER,
            CARD_COMPROMISED,
            IDENTITY_THEFT,
            CARDHOLDER_MANIPULATION,
            /**
             * An enum member indicating that [FraudType] was instantiated with an unknown value.
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
                FIRST_PARTY_FRAUD -> Value.FIRST_PARTY_FRAUD
                ACCOUNT_TAKEOVER -> Value.ACCOUNT_TAKEOVER
                CARD_COMPROMISED -> Value.CARD_COMPROMISED
                IDENTITY_THEFT -> Value.IDENTITY_THEFT
                CARDHOLDER_MANIPULATION -> Value.CARDHOLDER_MANIPULATION
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
                FIRST_PARTY_FRAUD -> Known.FIRST_PARTY_FRAUD
                ACCOUNT_TAKEOVER -> Known.ACCOUNT_TAKEOVER
                CARD_COMPROMISED -> Known.CARD_COMPROMISED
                IDENTITY_THEFT -> Known.IDENTITY_THEFT
                CARDHOLDER_MANIPULATION -> Known.CARDHOLDER_MANIPULATION
                else -> throw LithicInvalidDataException("Unknown FraudType: $value")
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

        fun validate(): FraudType = apply {
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

            return /* spotless:off */ other is FraudType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionReportResponse && fraudStatus == other.fraudStatus && transactionToken == other.transactionToken && comment == other.comment && createdAt == other.createdAt && fraudType == other.fraudType && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(fraudStatus, transactionToken, comment, createdAt, fraudType, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionReportResponse{fraudStatus=$fraudStatus, transactionToken=$transactionToken, comment=$comment, createdAt=$createdAt, fraudType=$fraudType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
