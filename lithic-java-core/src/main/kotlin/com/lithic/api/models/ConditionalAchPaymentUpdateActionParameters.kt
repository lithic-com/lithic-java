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
import kotlin.jvm.optionals.getOrNull

class ConditionalAchPaymentUpdateActionParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<AchPaymentUpdateAction>,
    private val conditions: JsonField<List<Condition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action")
        @ExcludeMissing
        action: JsonField<AchPaymentUpdateAction> = JsonMissing.of(),
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
    fun action(): AchPaymentUpdateAction = action.getRequired("action")

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
    fun _action(): JsonField<AchPaymentUpdateAction> = action

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
         * [ConditionalAchPaymentUpdateActionParameters].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .conditions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConditionalAchPaymentUpdateActionParameters]. */
    class Builder internal constructor() {

        private var action: JsonField<AchPaymentUpdateAction>? = null
        private var conditions: JsonField<MutableList<Condition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conditionalAchPaymentUpdateActionParameters: ConditionalAchPaymentUpdateActionParameters
        ) = apply {
            action = conditionalAchPaymentUpdateActionParameters.action
            conditions =
                conditionalAchPaymentUpdateActionParameters.conditions.map { it.toMutableList() }
            additionalProperties =
                conditionalAchPaymentUpdateActionParameters.additionalProperties.toMutableMap()
        }

        /** The action to take if the conditions are met. */
        fun action(action: AchPaymentUpdateAction) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [AchPaymentUpdateAction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun action(action: JsonField<AchPaymentUpdateAction>) = apply { this.action = action }

        /** Alias for calling [action] with `AchPaymentUpdateAction.ofTag(tag)`. */
        fun action(tag: AchPaymentUpdateAction.TagAction) =
            action(AchPaymentUpdateAction.ofTag(tag))

        /** Alias for calling [action] with `AchPaymentUpdateAction.ofCreateCase(createCase)`. */
        fun action(createCase: AchPaymentUpdateAction.CreateCaseAction) =
            action(AchPaymentUpdateAction.ofCreateCase(createCase))

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
         * Returns an immutable instance of [ConditionalAchPaymentUpdateActionParameters].
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
        fun build(): ConditionalAchPaymentUpdateActionParameters =
            ConditionalAchPaymentUpdateActionParameters(
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
    fun validate(): ConditionalAchPaymentUpdateActionParameters = apply {
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
        ) : this(attribute, operation, value, mutableMapOf())

        /**
         * The attribute to target.
         *
         * The following attributes may be targeted:
         * * `TRANSACTION_AMOUNT`: The total amount of the ACH payment in minor units (cents),
         *   calculated as the sum of the settled and pending amounts. Use an integer value.
         * * `SEC_CODE`: Standard Entry Class code indicating the type of ACH transaction. Valid
         *   values include PPD (Prearranged Payment and Deposit Entry), CCD (Corporate Credit or
         *   Debit Entry), WEB (Internet-Initiated/Mobile Entry), TEL (Telephone-Initiated Entry),
         *   and others.
         * * `RETURN_REASON_CODE`: NACHA return reason code associated with the payment (for
         *   example, `R01`).
         * * `ACCOUNT_AGE`: The age of the account in seconds at the time of the payment. Use an
         *   integer value. For programs where Lithic does not manage or retain account holder data,
         *   this attribute does not evaluate.
         * * `EXTERNAL_BANK_ACCOUNT_AGE`: The age of the external bank account in seconds at the
         *   time of the payment. Use an integer value.
         * * `EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD`: The method used to verify the external
         *   bank account. Valid values are `MANUAL`, `MICRO_DEPOSIT`, `PRENOTE`,
         *   `EXTERNALLY_VERIFIED`, or `UNVERIFIED`.
         * * `EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE`: The verification state of the external bank
         *   account. Valid values are `PENDING`, `ENABLED`, `FAILED_VERIFICATION`, or
         *   `INSUFFICIENT_FUNDS`.
         * * `EXTERNAL_BANK_ACCOUNT_OWNER_TYPE`: The owner type of the external bank account. Valid
         *   values are `INDIVIDUAL` or `BUSINESS`.
         * * `ACH_EVENT_TYPE`: The type of ACH payment event being evaluated. Valid values include
         *   `ACH_ORIGINATION_INITIATED`, `ACH_ORIGINATION_REVIEWED`, `ACH_ORIGINATION_CANCELLED`,
         *   `ACH_ORIGINATION_PROCESSED`, `ACH_ORIGINATION_SETTLED`, `ACH_ORIGINATION_RELEASED`,
         *   `ACH_ORIGINATION_REJECTED`, `ACH_RECEIPT_PROCESSED`, `ACH_RECEIPT_SETTLED`,
         *   `ACH_RECEIPT_RELEASED`, `ACH_RECEIPT_RELEASED_EARLY`, `ACH_RETURN_INITIATED`,
         *   `ACH_RETURN_PROCESSED`, `ACH_RETURN_SETTLED`, and `ACH_RETURN_REJECTED`.
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
             * * `TRANSACTION_AMOUNT`: The total amount of the ACH payment in minor units (cents),
             *   calculated as the sum of the settled and pending amounts. Use an integer value.
             * * `SEC_CODE`: Standard Entry Class code indicating the type of ACH transaction. Valid
             *   values include PPD (Prearranged Payment and Deposit Entry), CCD (Corporate Credit
             *   or Debit Entry), WEB (Internet-Initiated/Mobile Entry), TEL (Telephone-Initiated
             *   Entry), and others.
             * * `RETURN_REASON_CODE`: NACHA return reason code associated with the payment (for
             *   example, `R01`).
             * * `ACCOUNT_AGE`: The age of the account in seconds at the time of the payment. Use an
             *   integer value. For programs where Lithic does not manage or retain account holder
             *   data, this attribute does not evaluate.
             * * `EXTERNAL_BANK_ACCOUNT_AGE`: The age of the external bank account in seconds at the
             *   time of the payment. Use an integer value.
             * * `EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD`: The method used to verify the external
             *   bank account. Valid values are `MANUAL`, `MICRO_DEPOSIT`, `PRENOTE`,
             *   `EXTERNALLY_VERIFIED`, or `UNVERIFIED`.
             * * `EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE`: The verification state of the external
             *   bank account. Valid values are `PENDING`, `ENABLED`, `FAILED_VERIFICATION`, or
             *   `INSUFFICIENT_FUNDS`.
             * * `EXTERNAL_BANK_ACCOUNT_OWNER_TYPE`: The owner type of the external bank account.
             *   Valid values are `INDIVIDUAL` or `BUSINESS`.
             * * `ACH_EVENT_TYPE`: The type of ACH payment event being evaluated. Valid values
             *   include `ACH_ORIGINATION_INITIATED`, `ACH_ORIGINATION_REVIEWED`,
             *   `ACH_ORIGINATION_CANCELLED`, `ACH_ORIGINATION_PROCESSED`,
             *   `ACH_ORIGINATION_SETTLED`, `ACH_ORIGINATION_RELEASED`, `ACH_ORIGINATION_REJECTED`,
             *   `ACH_RECEIPT_PROCESSED`, `ACH_RECEIPT_SETTLED`, `ACH_RECEIPT_RELEASED`,
             *   `ACH_RECEIPT_RELEASED_EARLY`, `ACH_RETURN_INITIATED`, `ACH_RETURN_PROCESSED`,
             *   `ACH_RETURN_SETTLED`, and `ACH_RETURN_REJECTED`.
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
         * * `TRANSACTION_AMOUNT`: The total amount of the ACH payment in minor units (cents),
         *   calculated as the sum of the settled and pending amounts. Use an integer value.
         * * `SEC_CODE`: Standard Entry Class code indicating the type of ACH transaction. Valid
         *   values include PPD (Prearranged Payment and Deposit Entry), CCD (Corporate Credit or
         *   Debit Entry), WEB (Internet-Initiated/Mobile Entry), TEL (Telephone-Initiated Entry),
         *   and others.
         * * `RETURN_REASON_CODE`: NACHA return reason code associated with the payment (for
         *   example, `R01`).
         * * `ACCOUNT_AGE`: The age of the account in seconds at the time of the payment. Use an
         *   integer value. For programs where Lithic does not manage or retain account holder data,
         *   this attribute does not evaluate.
         * * `EXTERNAL_BANK_ACCOUNT_AGE`: The age of the external bank account in seconds at the
         *   time of the payment. Use an integer value.
         * * `EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD`: The method used to verify the external
         *   bank account. Valid values are `MANUAL`, `MICRO_DEPOSIT`, `PRENOTE`,
         *   `EXTERNALLY_VERIFIED`, or `UNVERIFIED`.
         * * `EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE`: The verification state of the external bank
         *   account. Valid values are `PENDING`, `ENABLED`, `FAILED_VERIFICATION`, or
         *   `INSUFFICIENT_FUNDS`.
         * * `EXTERNAL_BANK_ACCOUNT_OWNER_TYPE`: The owner type of the external bank account. Valid
         *   values are `INDIVIDUAL` or `BUSINESS`.
         * * `ACH_EVENT_TYPE`: The type of ACH payment event being evaluated. Valid values include
         *   `ACH_ORIGINATION_INITIATED`, `ACH_ORIGINATION_REVIEWED`, `ACH_ORIGINATION_CANCELLED`,
         *   `ACH_ORIGINATION_PROCESSED`, `ACH_ORIGINATION_SETTLED`, `ACH_ORIGINATION_RELEASED`,
         *   `ACH_ORIGINATION_REJECTED`, `ACH_RECEIPT_PROCESSED`, `ACH_RECEIPT_SETTLED`,
         *   `ACH_RECEIPT_RELEASED`, `ACH_RECEIPT_RELEASED_EARLY`, `ACH_RETURN_INITIATED`,
         *   `ACH_RETURN_PROCESSED`, `ACH_RETURN_SETTLED`, and `ACH_RETURN_REJECTED`.
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

                @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                @JvmField val SEC_CODE = of("SEC_CODE")

                @JvmField val RETURN_REASON_CODE = of("RETURN_REASON_CODE")

                @JvmField val ACCOUNT_AGE = of("ACCOUNT_AGE")

                @JvmField val EXTERNAL_BANK_ACCOUNT_AGE = of("EXTERNAL_BANK_ACCOUNT_AGE")

                @JvmField
                val EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD =
                    of("EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD")

                @JvmField
                val EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE =
                    of("EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE")

                @JvmField
                val EXTERNAL_BANK_ACCOUNT_OWNER_TYPE = of("EXTERNAL_BANK_ACCOUNT_OWNER_TYPE")

                @JvmField val ACH_EVENT_TYPE = of("ACH_EVENT_TYPE")

                @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
            }

            /** An enum containing [Attribute]'s known values. */
            enum class Known {
                TRANSACTION_AMOUNT,
                SEC_CODE,
                RETURN_REASON_CODE,
                ACCOUNT_AGE,
                EXTERNAL_BANK_ACCOUNT_AGE,
                EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD,
                EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE,
                EXTERNAL_BANK_ACCOUNT_OWNER_TYPE,
                ACH_EVENT_TYPE,
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
                TRANSACTION_AMOUNT,
                SEC_CODE,
                RETURN_REASON_CODE,
                ACCOUNT_AGE,
                EXTERNAL_BANK_ACCOUNT_AGE,
                EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD,
                EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE,
                EXTERNAL_BANK_ACCOUNT_OWNER_TYPE,
                ACH_EVENT_TYPE,
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
                    TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                    SEC_CODE -> Value.SEC_CODE
                    RETURN_REASON_CODE -> Value.RETURN_REASON_CODE
                    ACCOUNT_AGE -> Value.ACCOUNT_AGE
                    EXTERNAL_BANK_ACCOUNT_AGE -> Value.EXTERNAL_BANK_ACCOUNT_AGE
                    EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD ->
                        Value.EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD
                    EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE ->
                        Value.EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE
                    EXTERNAL_BANK_ACCOUNT_OWNER_TYPE -> Value.EXTERNAL_BANK_ACCOUNT_OWNER_TYPE
                    ACH_EVENT_TYPE -> Value.ACH_EVENT_TYPE
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
                    TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                    SEC_CODE -> Known.SEC_CODE
                    RETURN_REASON_CODE -> Known.RETURN_REASON_CODE
                    ACCOUNT_AGE -> Known.ACCOUNT_AGE
                    EXTERNAL_BANK_ACCOUNT_AGE -> Known.EXTERNAL_BANK_ACCOUNT_AGE
                    EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD ->
                        Known.EXTERNAL_BANK_ACCOUNT_VERIFICATION_METHOD
                    EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE ->
                        Known.EXTERNAL_BANK_ACCOUNT_VERIFICATION_STATE
                    EXTERNAL_BANK_ACCOUNT_OWNER_TYPE -> Known.EXTERNAL_BANK_ACCOUNT_OWNER_TYPE
                    ACH_EVENT_TYPE -> Known.ACH_EVENT_TYPE
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

        return other is ConditionalAchPaymentUpdateActionParameters &&
            action == other.action &&
            conditions == other.conditions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(action, conditions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionalAchPaymentUpdateActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
}
