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

class ConditionalCardTransactionUpdateActionParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<CardTransactionUpdateAction>,
    private val conditions: JsonField<List<Condition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action")
        @ExcludeMissing
        action: JsonField<CardTransactionUpdateAction> = JsonMissing.of(),
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
    fun action(): CardTransactionUpdateAction = action.getRequired("action")

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
    @JsonProperty("action")
    @ExcludeMissing
    fun _action(): JsonField<CardTransactionUpdateAction> = action

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
         * [ConditionalCardTransactionUpdateActionParameters].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .conditions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConditionalCardTransactionUpdateActionParameters]. */
    class Builder internal constructor() {

        private var action: JsonField<CardTransactionUpdateAction>? = null
        private var conditions: JsonField<MutableList<Condition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conditionalCardTransactionUpdateActionParameters:
                ConditionalCardTransactionUpdateActionParameters
        ) = apply {
            action = conditionalCardTransactionUpdateActionParameters.action
            conditions =
                conditionalCardTransactionUpdateActionParameters.conditions.map {
                    it.toMutableList()
                }
            additionalProperties =
                conditionalCardTransactionUpdateActionParameters.additionalProperties.toMutableMap()
        }

        /** The action to take if the conditions are met. */
        fun action(action: CardTransactionUpdateAction) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [CardTransactionUpdateAction]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun action(action: JsonField<CardTransactionUpdateAction>) = apply { this.action = action }

        /** Alias for calling [action] with `CardTransactionUpdateAction.ofTag(tag)`. */
        fun action(tag: CardTransactionUpdateAction.TagAction) =
            action(CardTransactionUpdateAction.ofTag(tag))

        /**
         * Alias for calling [action] with `CardTransactionUpdateAction.ofCreateCase(createCase)`.
         */
        fun action(createCase: CardTransactionUpdateAction.CreateCaseAction) =
            action(CardTransactionUpdateAction.ofCreateCase(createCase))

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
         * Returns an immutable instance of [ConditionalCardTransactionUpdateActionParameters].
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
        fun build(): ConditionalCardTransactionUpdateActionParameters =
            ConditionalCardTransactionUpdateActionParameters(
                checkRequired("action", action),
                checkRequired("conditions", conditions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ConditionalCardTransactionUpdateActionParameters = apply {
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

    class Condition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attribute: JsonField<Attribute>,
        private val operation: JsonField<ConditionalOperation>,
        private val value: JsonField<ConditionalValue>,
        private val parameters: JsonField<Parameters>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attribute")
            @ExcludeMissing
            attribute: JsonField<Attribute> = JsonMissing.of(),
            @JsonProperty("operation")
            @ExcludeMissing
            operation: JsonField<ConditionalOperation> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            value: JsonField<ConditionalValue> = JsonMissing.of(),
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of(),
        ) : this(attribute, operation, value, parameters, mutableMapOf())

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
         * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
         *   field in the settlement/cardholder billing currency. This is the amount the issuer
         *   should authorize against unless the issuer is paying the acquirer fee on behalf of the
         *   cardholder. Use an integer value.
         * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x. Use
         *   an integer value.
         * * `TRANSACTION_STATUS`: The status of the transaction. Valid values are `PENDING`,
         *   `VOIDED`, `SETTLING`, `SETTLED`, `BOUNCED`, `RETURNED`, `DECLINED`, `EXPIRED`.
         * * `LAST_EVENT_TYPE`: The type of the most recent event on the transaction. Valid values
         *   are `AUTHORIZATION`, `AUTHORIZATION_ADVICE`, `AUTHORIZATION_EXPIRY`,
         *   `AUTHORIZATION_REVERSAL`, `BALANCE_INQUIRY`, `CLEARING`, `CORRECTION_CREDIT`,
         *   `CORRECTION_DEBIT`, `CREDIT_AUTHORIZATION`, `CREDIT_AUTHORIZATION_ADVICE`,
         *   `FINANCIAL_AUTHORIZATION`, `FINANCIAL_CREDIT_AUTHORIZATION`, `RETURN`,
         *   `RETURN_REVERSAL`.
         * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies
         *   to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
         *   `TOKEN_AUTHENTICATED`.
         * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
         *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
         *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
         *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, or `CREDENTIAL_ON_FILE`.
         * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of
         *   the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`,
         *   `MERCHANT`, `OTHER`, `NONE`.
         * * `CARD_AGE`: The age of the card in seconds at the time of the transaction. Use an
         *   integer value.
         * * `ACCOUNT_AGE`: The age of the account in seconds at the time of the transaction. Use an
         *   integer value. For programs where Lithic does not manage or retain account holder data,
         *   this attribute does not evaluate.
         * * `SPEND_VELOCITY_COUNT`: The number of transactions matching the specified filters
         *   within the given period. Requires `parameters` with `scope`, `period`, and optional
         *   `filters`. Use an integer value.
         * * `SPEND_VELOCITY_AMOUNT`: The total spend amount (in cents) of transactions matching the
         *   specified filters within the given period. Requires `parameters` with `scope`,
         *   `period`, and optional `filters`. Use an integer value.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attribute(): Attribute = attribute.getRequired("attribute")

        /**
         * The operation to apply to the attribute
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operation(): ConditionalOperation = operation.getRequired("operation")

        /**
         * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): ConditionalValue = value.getRequired("value")

        /**
         * Additional parameters for spend velocity attributes. Required when `attribute` is
         * `SPEND_VELOCITY_COUNT` or `SPEND_VELOCITY_AMOUNT`. Not used for other attributes.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

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
        fun _operation(): JsonField<ConditionalOperation> = operation

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<ConditionalValue> = value

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

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
             * Returns a mutable builder for constructing an instance of [Condition].
             *
             * The following fields are required:
             * ```java
             * .attribute()
             * .operation()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Condition]. */
        class Builder internal constructor() {

            private var attribute: JsonField<Attribute>? = null
            private var operation: JsonField<ConditionalOperation>? = null
            private var value: JsonField<ConditionalValue>? = null
            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(condition: Condition) = apply {
                attribute = condition.attribute
                operation = condition.operation
                value = condition.value
                parameters = condition.parameters
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
             * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
             *   field in the settlement/cardholder billing currency. This is the amount the issuer
             *   should authorize against unless the issuer is paying the acquirer fee on behalf of
             *   the cardholder. Use an integer value.
             * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
             *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk
             *   and 999 representing the highest risk. For Visa transactions, where the raw score
             *   has a range of 0-99, Lithic will normalize the score by multiplying the raw score
             *   by 10x. Use an integer value.
             * * `TRANSACTION_STATUS`: The status of the transaction. Valid values are `PENDING`,
             *   `VOIDED`, `SETTLING`, `SETTLED`, `BOUNCED`, `RETURNED`, `DECLINED`, `EXPIRED`.
             * * `LAST_EVENT_TYPE`: The type of the most recent event on the transaction. Valid
             *   values are `AUTHORIZATION`, `AUTHORIZATION_ADVICE`, `AUTHORIZATION_EXPIRY`,
             *   `AUTHORIZATION_REVERSAL`, `BALANCE_INQUIRY`, `CLEARING`, `CORRECTION_CREDIT`,
             *   `CORRECTION_DEBIT`, `CREDIT_AUTHORIZATION`, `CREDIT_AUTHORIZATION_ADVICE`,
             *   `FINANCIAL_AUTHORIZATION`, `FINANCIAL_CREDIT_AUTHORIZATION`, `RETURN`,
             *   `RETURN_REVERSAL`.
             * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer
             *   applies to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
             *   `TOKEN_AUTHENTICATED`.
             * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN)
             *   was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
             *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
             *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, or
             *   `CREDENTIAL_ON_FILE`.
             * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source
             *   of the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`,
             *   `MASTERPASS`, `MERCHANT`, `OTHER`, `NONE`.
             * * `CARD_AGE`: The age of the card in seconds at the time of the transaction. Use an
             *   integer value.
             * * `ACCOUNT_AGE`: The age of the account in seconds at the time of the transaction.
             *   Use an integer value. For programs where Lithic does not manage or retain account
             *   holder data, this attribute does not evaluate.
             * * `SPEND_VELOCITY_COUNT`: The number of transactions matching the specified filters
             *   within the given period. Requires `parameters` with `scope`, `period`, and optional
             *   `filters`. Use an integer value.
             * * `SPEND_VELOCITY_AMOUNT`: The total spend amount (in cents) of transactions matching
             *   the specified filters within the given period. Requires `parameters` with `scope`,
             *   `period`, and optional `filters`. Use an integer value.
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
            fun operation(operation: ConditionalOperation) = operation(JsonField.of(operation))

            /**
             * Sets [Builder.operation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operation] with a well-typed [ConditionalOperation]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun operation(operation: JsonField<ConditionalOperation>) = apply {
                this.operation = operation
            }

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun value(value: ConditionalValue) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [ConditionalValue] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<ConditionalValue>) = apply { this.value = value }

            /** Alias for calling [value] with `ConditionalValue.ofRegex(regex)`. */
            fun value(regex: String) = value(ConditionalValue.ofRegex(regex))

            /** Alias for calling [value] with `ConditionalValue.ofInteger(integer)`. */
            fun value(integer: Long) = value(ConditionalValue.ofInteger(integer))

            /** Alias for calling [value] with `ConditionalValue.ofNumber(number)`. */
            fun value(number: Double) = value(ConditionalValue.ofNumber(number))

            /** Alias for calling [value] with `ConditionalValue.ofListOfStrings(listOfStrings)`. */
            fun valueOfListOfStrings(listOfStrings: List<String>) =
                value(ConditionalValue.ofListOfStrings(listOfStrings))

            /** Alias for calling [value] with `ConditionalValue.ofTimestamp(timestamp)`. */
            fun value(timestamp: OffsetDateTime) = value(ConditionalValue.ofTimestamp(timestamp))

            /**
             * Additional parameters for spend velocity attributes. Required when `attribute` is
             * `SPEND_VELOCITY_COUNT` or `SPEND_VELOCITY_AMOUNT`. Not used for other attributes.
             */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
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
             * Returns an immutable instance of [Condition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .attribute()
             * .operation()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Condition =
                Condition(
                    checkRequired("attribute", attribute),
                    checkRequired("operation", operation),
                    checkRequired("value", value),
                    parameters,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            attribute().validate()
            operation().validate()
            value().validate()
            parameters().ifPresent { it.validate() }
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
                (value.asKnown().getOrNull()?.validity() ?: 0) +
                (parameters.asKnown().getOrNull()?.validity() ?: 0)

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
         * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
         *   field in the settlement/cardholder billing currency. This is the amount the issuer
         *   should authorize against unless the issuer is paying the acquirer fee on behalf of the
         *   cardholder. Use an integer value.
         * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x. Use
         *   an integer value.
         * * `TRANSACTION_STATUS`: The status of the transaction. Valid values are `PENDING`,
         *   `VOIDED`, `SETTLING`, `SETTLED`, `BOUNCED`, `RETURNED`, `DECLINED`, `EXPIRED`.
         * * `LAST_EVENT_TYPE`: The type of the most recent event on the transaction. Valid values
         *   are `AUTHORIZATION`, `AUTHORIZATION_ADVICE`, `AUTHORIZATION_EXPIRY`,
         *   `AUTHORIZATION_REVERSAL`, `BALANCE_INQUIRY`, `CLEARING`, `CORRECTION_CREDIT`,
         *   `CORRECTION_DEBIT`, `CREDIT_AUTHORIZATION`, `CREDIT_AUTHORIZATION_ADVICE`,
         *   `FINANCIAL_AUTHORIZATION`, `FINANCIAL_CREDIT_AUTHORIZATION`, `RETURN`,
         *   `RETURN_REVERSAL`.
         * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies
         *   to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
         *   `TOKEN_AUTHENTICATED`.
         * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
         *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
         *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
         *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, or `CREDENTIAL_ON_FILE`.
         * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of
         *   the token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`,
         *   `MERCHANT`, `OTHER`, `NONE`.
         * * `CARD_AGE`: The age of the card in seconds at the time of the transaction. Use an
         *   integer value.
         * * `ACCOUNT_AGE`: The age of the account in seconds at the time of the transaction. Use an
         *   integer value. For programs where Lithic does not manage or retain account holder data,
         *   this attribute does not evaluate.
         * * `SPEND_VELOCITY_COUNT`: The number of transactions matching the specified filters
         *   within the given period. Requires `parameters` with `scope`, `period`, and optional
         *   `filters`. Use an integer value.
         * * `SPEND_VELOCITY_AMOUNT`: The total spend amount (in cents) of transactions matching the
         *   specified filters within the given period. Requires `parameters` with `scope`,
         *   `period`, and optional `filters`. Use an integer value.
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

                @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                @JvmField val RISK_SCORE = of("RISK_SCORE")

                @JvmField val TRANSACTION_STATUS = of("TRANSACTION_STATUS")

                @JvmField val LAST_EVENT_TYPE = of("LAST_EVENT_TYPE")

                @JvmField val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                @JvmField val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                @JvmField val WALLET_TYPE = of("WALLET_TYPE")

                @JvmField val CARD_AGE = of("CARD_AGE")

                @JvmField val ACCOUNT_AGE = of("ACCOUNT_AGE")

                @JvmField val SPEND_VELOCITY_COUNT = of("SPEND_VELOCITY_COUNT")

                @JvmField val SPEND_VELOCITY_AMOUNT = of("SPEND_VELOCITY_AMOUNT")

                @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
            }

            /** An enum containing [Attribute]'s known values. */
            enum class Known {
                MCC,
                COUNTRY,
                CURRENCY,
                MERCHANT_ID,
                DESCRIPTOR,
                TRANSACTION_AMOUNT,
                RISK_SCORE,
                TRANSACTION_STATUS,
                LAST_EVENT_TYPE,
                LIABILITY_SHIFT,
                PAN_ENTRY_MODE,
                WALLET_TYPE,
                CARD_AGE,
                ACCOUNT_AGE,
                SPEND_VELOCITY_COUNT,
                SPEND_VELOCITY_AMOUNT,
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
                TRANSACTION_AMOUNT,
                RISK_SCORE,
                TRANSACTION_STATUS,
                LAST_EVENT_TYPE,
                LIABILITY_SHIFT,
                PAN_ENTRY_MODE,
                WALLET_TYPE,
                CARD_AGE,
                ACCOUNT_AGE,
                SPEND_VELOCITY_COUNT,
                SPEND_VELOCITY_AMOUNT,
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
                    TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                    RISK_SCORE -> Value.RISK_SCORE
                    TRANSACTION_STATUS -> Value.TRANSACTION_STATUS
                    LAST_EVENT_TYPE -> Value.LAST_EVENT_TYPE
                    LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                    PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                    WALLET_TYPE -> Value.WALLET_TYPE
                    CARD_AGE -> Value.CARD_AGE
                    ACCOUNT_AGE -> Value.ACCOUNT_AGE
                    SPEND_VELOCITY_COUNT -> Value.SPEND_VELOCITY_COUNT
                    SPEND_VELOCITY_AMOUNT -> Value.SPEND_VELOCITY_AMOUNT
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
                    TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                    RISK_SCORE -> Known.RISK_SCORE
                    TRANSACTION_STATUS -> Known.TRANSACTION_STATUS
                    LAST_EVENT_TYPE -> Known.LAST_EVENT_TYPE
                    LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                    PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                    WALLET_TYPE -> Known.WALLET_TYPE
                    CARD_AGE -> Known.CARD_AGE
                    ACCOUNT_AGE -> Known.ACCOUNT_AGE
                    SPEND_VELOCITY_COUNT -> Known.SPEND_VELOCITY_COUNT
                    SPEND_VELOCITY_AMOUNT -> Known.SPEND_VELOCITY_AMOUNT
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        /**
         * Additional parameters for spend velocity attributes. Required when `attribute` is
         * `SPEND_VELOCITY_COUNT` or `SPEND_VELOCITY_AMOUNT`. Not used for other attributes.
         */
        class Parameters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val filters: JsonField<SpendVelocityFilters>,
            private val period: JsonField<VelocityLimitPeriod>,
            private val scope: JsonField<Scope>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<SpendVelocityFilters> = JsonMissing.of(),
                @JsonProperty("period")
                @ExcludeMissing
                period: JsonField<VelocityLimitPeriod> = JsonMissing.of(),
                @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            ) : this(filters, period, scope, mutableMapOf())

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun filters(): Optional<SpendVelocityFilters> = filters.getOptional("filters")

            /**
             * The time period over which to calculate the spend velocity.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun period(): Optional<VelocityLimitPeriod> = period.getOptional("period")

            /**
             * The entity scope to evaluate the attribute against.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun scope(): Optional<Scope> = scope.getOptional("scope")

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<SpendVelocityFilters> = filters

            /**
             * Returns the raw JSON value of [period].
             *
             * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("period")
            @ExcludeMissing
            fun _period(): JsonField<VelocityLimitPeriod> = period

            /**
             * Returns the raw JSON value of [scope].
             *
             * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

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

                /** Returns a mutable builder for constructing an instance of [Parameters]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Parameters]. */
            class Builder internal constructor() {

                private var filters: JsonField<SpendVelocityFilters> = JsonMissing.of()
                private var period: JsonField<VelocityLimitPeriod> = JsonMissing.of()
                private var scope: JsonField<Scope> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parameters: Parameters) = apply {
                    filters = parameters.filters
                    period = parameters.period
                    scope = parameters.scope
                    additionalProperties = parameters.additionalProperties.toMutableMap()
                }

                fun filters(filters: SpendVelocityFilters) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed
                 * [SpendVelocityFilters] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun filters(filters: JsonField<SpendVelocityFilters>) = apply {
                    this.filters = filters
                }

                /** The time period over which to calculate the spend velocity. */
                fun period(period: VelocityLimitPeriod) = period(JsonField.of(period))

                /**
                 * Sets [Builder.period] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.period] with a well-typed [VelocityLimitPeriod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun period(period: JsonField<VelocityLimitPeriod>) = apply { this.period = period }

                /**
                 * Alias for calling [period] with
                 * `VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject)`.
                 */
                fun period(trailingWindowObject: VelocityLimitPeriod.TrailingWindowObject) =
                    period(VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject))

                /**
                 * Alias for calling [period] with
                 * `VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay)`.
                 */
                fun period(fixedWindowDay: VelocityLimitPeriod.FixedWindowDay) =
                    period(VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay))

                /**
                 * Alias for calling [period] with
                 * `VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek)`.
                 */
                fun period(fixedWindowWeek: VelocityLimitPeriod.FixedWindowWeek) =
                    period(VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek))

                /**
                 * Alias for calling [period] with
                 * `VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth)`.
                 */
                fun period(fixedWindowMonth: VelocityLimitPeriod.FixedWindowMonth) =
                    period(VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth))

                /**
                 * Alias for calling [period] with
                 * `VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear)`.
                 */
                fun period(fixedWindowYear: VelocityLimitPeriod.FixedWindowYear) =
                    period(VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear))

                /** The entity scope to evaluate the attribute against. */
                fun scope(scope: Scope) = scope(JsonField.of(scope))

                /**
                 * Sets [Builder.scope] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scope] with a well-typed [Scope] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Parameters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Parameters =
                    Parameters(filters, period, scope, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                filters().ifPresent { it.validate() }
                period().ifPresent { it.validate() }
                scope().ifPresent { it.validate() }
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
                (filters.asKnown().getOrNull()?.validity() ?: 0) +
                    (period.asKnown().getOrNull()?.validity() ?: 0) +
                    (scope.asKnown().getOrNull()?.validity() ?: 0)

            /** The entity scope to evaluate the attribute against. */
            class Scope @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CARD = of("CARD")

                    @JvmField val ACCOUNT = of("ACCOUNT")

                    @JvmField val GLOBAL = of("GLOBAL")

                    @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
                }

                /** An enum containing [Scope]'s known values. */
                enum class Known {
                    CARD,
                    ACCOUNT,
                    GLOBAL,
                }

                /**
                 * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Scope] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CARD,
                    ACCOUNT,
                    GLOBAL,
                    /**
                     * An enum member indicating that [Scope] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CARD -> Value.CARD
                        ACCOUNT -> Value.ACCOUNT
                        GLOBAL -> Value.GLOBAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CARD -> Known.CARD
                        ACCOUNT -> Known.ACCOUNT
                        GLOBAL -> Known.GLOBAL
                        else -> throw LithicInvalidDataException("Unknown Scope: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Scope = apply {
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

                    return other is Scope && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parameters &&
                    filters == other.filters &&
                    period == other.period &&
                    scope == other.scope &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(filters, period, scope, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parameters{filters=$filters, period=$period, scope=$scope, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Condition &&
                attribute == other.attribute &&
                operation == other.operation &&
                value == other.value &&
                parameters == other.parameters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(attribute, operation, value, parameters, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Condition{attribute=$attribute, operation=$operation, value=$value, parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConditionalCardTransactionUpdateActionParameters &&
            action == other.action &&
            conditions == other.conditions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(action, conditions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionalCardTransactionUpdateActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
}
