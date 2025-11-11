// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConditionalAuthorizationActionParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<Action>,
    private val conditions: JsonField<List<Condition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<List<Condition>> = JsonMissing.of(),
    ) : this(action, conditions, mutableMapOf())

    /**
     * The action to take if the conditions are met.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Action = action.getRequired("action")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conditions(): List<Condition> = conditions.getRequired("conditions")

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<List<Condition>> = conditions

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
         * Returns a mutable builder for constructing an instance of
         * [ConditionalAuthorizationActionParameters].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .conditions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConditionalAuthorizationActionParameters]. */
    class Builder internal constructor() {

        private var action: JsonField<Action>? = null
        private var conditions: JsonField<MutableList<Condition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conditionalAuthorizationActionParameters: ConditionalAuthorizationActionParameters
        ) = apply {
            action = conditionalAuthorizationActionParameters.action
            conditions =
                conditionalAuthorizationActionParameters.conditions.map { it.toMutableList() }
            additionalProperties =
                conditionalAuthorizationActionParameters.additionalProperties.toMutableMap()
        }

        /** The action to take if the conditions are met. */
        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed `List<Condition>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditions(conditions: JsonField<List<Condition>>) = apply {
            this.conditions = conditions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Condition] to [conditions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCondition(condition: Condition) = apply {
            conditions =
                (conditions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("conditions", it).add(condition)
                }
        }

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
         * Returns an immutable instance of [ConditionalAuthorizationActionParameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .action()
         * .conditions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConditionalAuthorizationActionParameters =
            ConditionalAuthorizationActionParameters(
                checkRequired("action", action),
                checkRequired("conditions", conditions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConditionalAuthorizationActionParameters = apply {
        if (validated) {
            return@apply
        }

        action().validate()
        conditions().forEach { it.validate() }
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
        (action.asKnown().getOrNull()?.validity() ?: 0) +
            (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The action to take if the conditions are met. */
    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DECLINE = of("DECLINE")

            @JvmField val CHALLENGE = of("CHALLENGE")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            DECLINE,
            CHALLENGE,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DECLINE,
            CHALLENGE,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
                DECLINE -> Value.DECLINE
                CHALLENGE -> Value.CHALLENGE
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
                DECLINE -> Known.DECLINE
                CHALLENGE -> Known.CHALLENGE
                else -> throw LithicInvalidDataException("Unknown Action: $value")
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

        fun validate(): Action = apply {
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

            return other is Action && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Condition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attribute: JsonField<Attribute>,
        private val operation: JsonField<Operation>,
        private val value: JsonField<Value>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attribute")
            @ExcludeMissing
            attribute: JsonField<Attribute> = JsonMissing.of(),
            @JsonProperty("operation")
            @ExcludeMissing
            operation: JsonField<Operation> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
        ) : this(attribute, operation, value, mutableMapOf())

        /**
         * The attribute to target.
         *
         * The following attributes may be targeted:
         * * `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business
         *   by the types of goods or services it provides.
         * * `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
         *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         * * `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of the
         *   transaction.
         * * `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
         * * `DESCRIPTOR`: Short description of card acceptor.
         * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies
         *   to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
         *   `TOKEN_AUTHENTICATED`.
         * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
         *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
         *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
         *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
         *   `ECOMMERCE`.
         * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
         *   field in the settlement/cardholder billing currency. This is the amount the issuer
         *   should authorize against unless the issuer is paying the acquirer fee on behalf of the
         *   cardholder.
         * * `CASH_AMOUNT`: The cash amount of the transaction in minor units (cents). This
         *   represents the amount of cash being withdrawn or advanced.
         * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x.
         * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the trailing 15
         *   minutes before the authorization.
         * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing
         *   hour up and until the authorization.
         * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
         *   hours up and until the authorization.
         * * `CARD_STATE`: The current state of the card associated with the transaction. Valid
         *   values are `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
         * * `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction. Valid values
         *   are `TRUE`, `FALSE`.
         * * `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`, `OK`,
         *   `BLOCKED`.
         * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of
         *   the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`,
         *   `MERCHANT`, `OTHER`, `NONE`.
         * * `TRANSACTION_INITIATOR`: The entity that initiated the transaction indicates the source
         *   of the token. Valid values are `CARDHOLDER`, `MERCHANT`, `UNKNOWN`.
         * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data with
         *   the cardholder KYC data if it exists. Valid values are `MATCH`, `MATCH_ADDRESS_ONLY`,
         *   `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attribute(): Optional<Attribute> = attribute.getOptional("attribute")

        /**
         * The operation to apply to the attribute
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun operation(): Optional<Operation> = operation.getOptional("operation")

        /**
         * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): Optional<Value> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [attribute].
         *
         * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attribute")
        @ExcludeMissing
        fun _attribute(): JsonField<Attribute> = attribute

        /**
         * Returns the raw JSON value of [operation].
         *
         * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operation")
        @ExcludeMissing
        fun _operation(): JsonField<Operation> = operation

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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

            /** Returns a mutable builder for constructing an instance of [Condition]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Condition]. */
        class Builder internal constructor() {

            private var attribute: JsonField<Attribute> = JsonMissing.of()
            private var operation: JsonField<Operation> = JsonMissing.of()
            private var value: JsonField<Value> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(condition: Condition) = apply {
                attribute = condition.attribute
                operation = condition.operation
                value = condition.value
                additionalProperties = condition.additionalProperties.toMutableMap()
            }

            /**
             * The attribute to target.
             *
             * The following attributes may be targeted:
             * * `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a
             *   business by the types of goods or services it provides.
             * * `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO
             *   3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands
             *   Antilles.
             * * `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of the
             *   transaction.
             * * `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
             *   (merchant).
             * * `DESCRIPTOR`: Short description of card acceptor.
             * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer
             *   applies to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
             *   `TOKEN_AUTHENTICATED`.
             * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN)
             *   was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
             *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
             *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`,
             *   or `ECOMMERCE`.
             * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
             *   field in the settlement/cardholder billing currency. This is the amount the issuer
             *   should authorize against unless the issuer is paying the acquirer fee on behalf of
             *   the cardholder.
             * * `CASH_AMOUNT`: The cash amount of the transaction in minor units (cents). This
             *   represents the amount of cash being withdrawn or advanced.
             * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
             *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk
             *   and 999 representing the highest risk. For Visa transactions, where the raw score
             *   has a range of 0-99, Lithic will normalize the score by multiplying the raw score
             *   by 10x.
             * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the
             *   trailing 15 minutes before the authorization.
             * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing
             *   hour up and until the authorization.
             * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
             *   trailing 24 hours up and until the authorization.
             * * `CARD_STATE`: The current state of the card associated with the transaction. Valid
             *   values are `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
             * * `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction. Valid
             *   values are `TRUE`, `FALSE`.
             * * `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`, `OK`,
             *   `BLOCKED`.
             * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source
             *   of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`,
             *   `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
             * * `TRANSACTION_INITIATOR`: The entity that initiated the transaction indicates the
             *   source of the token. Valid values are `CARDHOLDER`, `MERCHANT`, `UNKNOWN`.
             * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data
             *   with the cardholder KYC data if it exists. Valid values are `MATCH`,
             *   `MATCH_ADDRESS_ONLY`, `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
             */
            fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

            /**
             * Sets [Builder.attribute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attribute] with a well-typed [Attribute] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attribute(attribute: JsonField<Attribute>) = apply { this.attribute = attribute }

            /** The operation to apply to the attribute */
            fun operation(operation: Operation) = operation(JsonField.of(operation))

            /**
             * Sets [Builder.operation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operation] with a well-typed [Operation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun value(value: Value) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Value] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Value>) = apply { this.value = value }

            /** Alias for calling [value] with `Value.ofRegex(regex)`. */
            fun value(regex: String) = value(Value.ofRegex(regex))

            /** Alias for calling [value] with `Value.ofNumber(number)`. */
            fun value(number: Long) = value(Value.ofNumber(number))

            /** Alias for calling [value] with `Value.ofListOfStrings(listOfStrings)`. */
            fun valueOfListOfStrings(listOfStrings: List<String>) =
                value(Value.ofListOfStrings(listOfStrings))

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
             * Returns an immutable instance of [Condition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Condition =
                Condition(attribute, operation, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            attribute().ifPresent { it.validate() }
            operation().ifPresent { it.validate() }
            value().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (attribute.asKnown().getOrNull()?.validity() ?: 0) +
                (operation.asKnown().getOrNull()?.validity() ?: 0) +
                (value.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The attribute to target.
         *
         * The following attributes may be targeted:
         * * `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business
         *   by the types of goods or services it provides.
         * * `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
         *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         * * `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of the
         *   transaction.
         * * `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
         * * `DESCRIPTOR`: Short description of card acceptor.
         * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies
         *   to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
         *   `TOKEN_AUTHENTICATED`.
         * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
         *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
         *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
         *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
         *   `ECOMMERCE`.
         * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
         *   field in the settlement/cardholder billing currency. This is the amount the issuer
         *   should authorize against unless the issuer is paying the acquirer fee on behalf of the
         *   cardholder.
         * * `CASH_AMOUNT`: The cash amount of the transaction in minor units (cents). This
         *   represents the amount of cash being withdrawn or advanced.
         * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x.
         * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the trailing 15
         *   minutes before the authorization.
         * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing
         *   hour up and until the authorization.
         * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
         *   hours up and until the authorization.
         * * `CARD_STATE`: The current state of the card associated with the transaction. Valid
         *   values are `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
         * * `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction. Valid values
         *   are `TRUE`, `FALSE`.
         * * `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`, `OK`,
         *   `BLOCKED`.
         * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of
         *   the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`,
         *   `MERCHANT`, `OTHER`, `NONE`.
         * * `TRANSACTION_INITIATOR`: The entity that initiated the transaction indicates the source
         *   of the token. Valid values are `CARDHOLDER`, `MERCHANT`, `UNKNOWN`.
         * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data with
         *   the cardholder KYC data if it exists. Valid values are `MATCH`, `MATCH_ADDRESS_ONLY`,
         *   `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
         */
        class Attribute @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MCC = of("MCC")

                @JvmField val COUNTRY = of("COUNTRY")

                @JvmField val CURRENCY = of("CURRENCY")

                @JvmField val MERCHANT_ID = of("MERCHANT_ID")

                @JvmField val DESCRIPTOR = of("DESCRIPTOR")

                @JvmField val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                @JvmField val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                @JvmField val CASH_AMOUNT = of("CASH_AMOUNT")

                @JvmField val RISK_SCORE = of("RISK_SCORE")

                @JvmField val CARD_TRANSACTION_COUNT_15_M = of("CARD_TRANSACTION_COUNT_15M")

                @JvmField val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

                @JvmField val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

                @JvmField val CARD_STATE = of("CARD_STATE")

                @JvmField val PIN_ENTERED = of("PIN_ENTERED")

                @JvmField val PIN_STATUS = of("PIN_STATUS")

                @JvmField val WALLET_TYPE = of("WALLET_TYPE")

                @JvmField val TRANSACTION_INITIATOR = of("TRANSACTION_INITIATOR")

                @JvmField val ADDRESS_MATCH = of("ADDRESS_MATCH")

                @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
            }

            /** An enum containing [Attribute]'s known values. */
            enum class Known {
                MCC,
                COUNTRY,
                CURRENCY,
                MERCHANT_ID,
                DESCRIPTOR,
                LIABILITY_SHIFT,
                PAN_ENTRY_MODE,
                TRANSACTION_AMOUNT,
                CASH_AMOUNT,
                RISK_SCORE,
                CARD_TRANSACTION_COUNT_15_M,
                CARD_TRANSACTION_COUNT_1_H,
                CARD_TRANSACTION_COUNT_24_H,
                CARD_STATE,
                PIN_ENTERED,
                PIN_STATUS,
                WALLET_TYPE,
                TRANSACTION_INITIATOR,
                ADDRESS_MATCH,
            }

            /**
             * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Attribute] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MCC,
                COUNTRY,
                CURRENCY,
                MERCHANT_ID,
                DESCRIPTOR,
                LIABILITY_SHIFT,
                PAN_ENTRY_MODE,
                TRANSACTION_AMOUNT,
                CASH_AMOUNT,
                RISK_SCORE,
                CARD_TRANSACTION_COUNT_15_M,
                CARD_TRANSACTION_COUNT_1_H,
                CARD_TRANSACTION_COUNT_24_H,
                CARD_STATE,
                PIN_ENTERED,
                PIN_STATUS,
                WALLET_TYPE,
                TRANSACTION_INITIATOR,
                ADDRESS_MATCH,
                /**
                 * An enum member indicating that [Attribute] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MCC -> Value.MCC
                    COUNTRY -> Value.COUNTRY
                    CURRENCY -> Value.CURRENCY
                    MERCHANT_ID -> Value.MERCHANT_ID
                    DESCRIPTOR -> Value.DESCRIPTOR
                    LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                    PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                    TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                    CASH_AMOUNT -> Value.CASH_AMOUNT
                    RISK_SCORE -> Value.RISK_SCORE
                    CARD_TRANSACTION_COUNT_15_M -> Value.CARD_TRANSACTION_COUNT_15_M
                    CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
                    CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
                    CARD_STATE -> Value.CARD_STATE
                    PIN_ENTERED -> Value.PIN_ENTERED
                    PIN_STATUS -> Value.PIN_STATUS
                    WALLET_TYPE -> Value.WALLET_TYPE
                    TRANSACTION_INITIATOR -> Value.TRANSACTION_INITIATOR
                    ADDRESS_MATCH -> Value.ADDRESS_MATCH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MCC -> Known.MCC
                    COUNTRY -> Known.COUNTRY
                    CURRENCY -> Known.CURRENCY
                    MERCHANT_ID -> Known.MERCHANT_ID
                    DESCRIPTOR -> Known.DESCRIPTOR
                    LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                    PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                    TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                    CASH_AMOUNT -> Known.CASH_AMOUNT
                    RISK_SCORE -> Known.RISK_SCORE
                    CARD_TRANSACTION_COUNT_15_M -> Known.CARD_TRANSACTION_COUNT_15_M
                    CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
                    CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
                    CARD_STATE -> Known.CARD_STATE
                    PIN_ENTERED -> Known.PIN_ENTERED
                    PIN_STATUS -> Known.PIN_STATUS
                    WALLET_TYPE -> Known.WALLET_TYPE
                    TRANSACTION_INITIATOR -> Known.TRANSACTION_INITIATOR
                    ADDRESS_MATCH -> Known.ADDRESS_MATCH
                    else -> throw LithicInvalidDataException("Unknown Attribute: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Attribute = apply {
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

                return other is Attribute && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The operation to apply to the attribute */
        class Operation @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IS_ONE_OF = of("IS_ONE_OF")

                @JvmField val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

                @JvmField val MATCHES = of("MATCHES")

                @JvmField val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

                @JvmField val IS_EQUAL_TO = of("IS_EQUAL_TO")

                @JvmField val IS_NOT_EQUAL_TO = of("IS_NOT_EQUAL_TO")

                @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

                @JvmField val IS_GREATER_THAN_OR_EQUAL_TO = of("IS_GREATER_THAN_OR_EQUAL_TO")

                @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

                @JvmField val IS_LESS_THAN_OR_EQUAL_TO = of("IS_LESS_THAN_OR_EQUAL_TO")

                @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
            }

            /** An enum containing [Operation]'s known values. */
            enum class Known {
                IS_ONE_OF,
                IS_NOT_ONE_OF,
                MATCHES,
                DOES_NOT_MATCH,
                IS_EQUAL_TO,
                IS_NOT_EQUAL_TO,
                IS_GREATER_THAN,
                IS_GREATER_THAN_OR_EQUAL_TO,
                IS_LESS_THAN,
                IS_LESS_THAN_OR_EQUAL_TO,
            }

            /**
             * An enum containing [Operation]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operation] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IS_ONE_OF,
                IS_NOT_ONE_OF,
                MATCHES,
                DOES_NOT_MATCH,
                IS_EQUAL_TO,
                IS_NOT_EQUAL_TO,
                IS_GREATER_THAN,
                IS_GREATER_THAN_OR_EQUAL_TO,
                IS_LESS_THAN,
                IS_LESS_THAN_OR_EQUAL_TO,
                /**
                 * An enum member indicating that [Operation] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IS_ONE_OF -> Value.IS_ONE_OF
                    IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                    MATCHES -> Value.MATCHES
                    DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                    IS_EQUAL_TO -> Value.IS_EQUAL_TO
                    IS_NOT_EQUAL_TO -> Value.IS_NOT_EQUAL_TO
                    IS_GREATER_THAN -> Value.IS_GREATER_THAN
                    IS_GREATER_THAN_OR_EQUAL_TO -> Value.IS_GREATER_THAN_OR_EQUAL_TO
                    IS_LESS_THAN -> Value.IS_LESS_THAN
                    IS_LESS_THAN_OR_EQUAL_TO -> Value.IS_LESS_THAN_OR_EQUAL_TO
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IS_ONE_OF -> Known.IS_ONE_OF
                    IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                    MATCHES -> Known.MATCHES
                    DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                    IS_EQUAL_TO -> Known.IS_EQUAL_TO
                    IS_NOT_EQUAL_TO -> Known.IS_NOT_EQUAL_TO
                    IS_GREATER_THAN -> Known.IS_GREATER_THAN
                    IS_GREATER_THAN_OR_EQUAL_TO -> Known.IS_GREATER_THAN_OR_EQUAL_TO
                    IS_LESS_THAN -> Known.IS_LESS_THAN
                    IS_LESS_THAN_OR_EQUAL_TO -> Known.IS_LESS_THAN_OR_EQUAL_TO
                    else -> throw LithicInvalidDataException("Unknown Operation: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Operation = apply {
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

                return other is Operation && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        @JsonDeserialize(using = Value.Deserializer::class)
        @JsonSerialize(using = Value.Serializer::class)
        class Value
        private constructor(
            private val regex: String? = null,
            private val number: Long? = null,
            private val listOfStrings: List<String>? = null,
            private val _json: JsonValue? = null,
        ) {

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun regex(): Optional<String> = Optional.ofNullable(regex)

            /**
             * A number, to be used with `IS_GREATER_THAN`, `IS_GREATER_THAN_OR_EQUAL_TO`,
             * `IS_LESS_THAN`, `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
             */
            fun number(): Optional<Long> = Optional.ofNullable(number)

            /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
            fun listOfStrings(): Optional<List<String>> = Optional.ofNullable(listOfStrings)

            fun isRegex(): Boolean = regex != null

            fun isNumber(): Boolean = number != null

            fun isListOfStrings(): Boolean = listOfStrings != null

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun asRegex(): String = regex.getOrThrow("regex")

            /**
             * A number, to be used with `IS_GREATER_THAN`, `IS_GREATER_THAN_OR_EQUAL_TO`,
             * `IS_LESS_THAN`, `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
             */
            fun asNumber(): Long = number.getOrThrow("number")

            /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
            fun asListOfStrings(): List<String> = listOfStrings.getOrThrow("listOfStrings")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    regex != null -> visitor.visitRegex(regex)
                    number != null -> visitor.visitNumber(number)
                    listOfStrings != null -> visitor.visitListOfStrings(listOfStrings)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Value = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitRegex(regex: String) {}

                        override fun visitNumber(number: Long) {}

                        override fun visitListOfStrings(listOfStrings: List<String>) {}
                    }
                )
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
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitRegex(regex: String) = 1

                        override fun visitNumber(number: Long) = 1

                        override fun visitListOfStrings(listOfStrings: List<String>) =
                            listOfStrings.size

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Value &&
                    regex == other.regex &&
                    number == other.number &&
                    listOfStrings == other.listOfStrings
            }

            override fun hashCode(): Int = Objects.hash(regex, number, listOfStrings)

            override fun toString(): String =
                when {
                    regex != null -> "Value{regex=$regex}"
                    number != null -> "Value{number=$number}"
                    listOfStrings != null -> "Value{listOfStrings=$listOfStrings}"
                    _json != null -> "Value{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Value")
                }

            companion object {

                /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                @JvmStatic fun ofRegex(regex: String) = Value(regex = regex)

                /**
                 * A number, to be used with `IS_GREATER_THAN`, `IS_GREATER_THAN_OR_EQUAL_TO`,
                 * `IS_LESS_THAN`, `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                 */
                @JvmStatic fun ofNumber(number: Long) = Value(number = number)

                /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                @JvmStatic
                fun ofListOfStrings(listOfStrings: List<String>) =
                    Value(listOfStrings = listOfStrings.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [Value] to a value of type [T].
             */
            interface Visitor<out T> {

                /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                fun visitRegex(regex: String): T

                /**
                 * A number, to be used with `IS_GREATER_THAN`, `IS_GREATER_THAN_OR_EQUAL_TO`,
                 * `IS_LESS_THAN`, `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
                 */
                fun visitNumber(number: Long): T

                /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                fun visitListOfStrings(listOfStrings: List<String>): T

                /**
                 * Maps an unknown variant of [Value] to a value of type [T].
                 *
                 * An instance of [Value] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LithicInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Value: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Value {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Value(regex = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    Value(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    Value(listOfStrings = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Value(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Value>(Value::class) {

                override fun serialize(
                    value: Value,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.regex != null -> generator.writeObject(value.regex)
                        value.number != null -> generator.writeObject(value.number)
                        value.listOfStrings != null -> generator.writeObject(value.listOfStrings)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Value")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Condition &&
                attribute == other.attribute &&
                operation == other.operation &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(attribute, operation, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConditionalAuthorizationActionParameters &&
            action == other.action &&
            conditions == other.conditions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(action, conditions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionalAuthorizationActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
}
