// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AuthRuleCondition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attribute: JsonField<ConditionalAttribute>,
    private val operation: JsonField<ConditionalOperation>,
    private val value: JsonField<ConditionalValue>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attribute")
        @ExcludeMissing
        attribute: JsonField<ConditionalAttribute> = JsonMissing.of(),
        @JsonProperty("operation")
        @ExcludeMissing
        operation: JsonField<ConditionalOperation> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<ConditionalValue> = JsonMissing.of(),
    ) : this(attribute, operation, value, mutableMapOf())

    /**
     * The attribute to target.
     *
     * The following attributes may be targeted:
     * * `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business by
     *   the types of goods or services it provides.
     * * `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
     *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
     * * `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of the
     *   transaction.
     * * `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
     * * `DESCRIPTOR`: Short description of card acceptor.
     * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies to
     *   the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
     * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
     *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
     *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`,
     *   `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
     * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee field in
     *   the settlement/cardholder billing currency. This is the amount the issuer should authorize
     *   against unless the issuer is paying the acquirer fee on behalf of the cardholder.
     * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
     *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and 999
     *   representing the highest risk. For Visa transactions, where the raw score has a range of
     *   0-99, Lithic will normalize the score by multiplying the raw score by 10x.
     * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the trailing 15
     *   minutes before the authorization.
     * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing hour up
     *   and until the authorization.
     * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
     *   hours up and until the authorization.
     * * `CARD_STATE`: The current state of the card associated with the transaction. Valid values
     *   are `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
     * * `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction. Valid values are
     *   `TRUE`, `FALSE`.
     * * `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`, `OK`, `BLOCKED`.
     * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of the
     *   token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`,
     *   `OTHER`, `NONE`.
     * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data with the
     *   cardholder KYC data if it exists. Valid values are `MATCH`, `MATCH_ADDRESS_ONLY`,
     *   `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attribute(): ConditionalAttribute = attribute.getRequired("attribute")

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
    fun _attribute(): JsonField<ConditionalAttribute> = attribute

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
         * Returns a mutable builder for constructing an instance of [AuthRuleCondition].
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

    /** A builder for [AuthRuleCondition]. */
    class Builder internal constructor() {

        private var attribute: JsonField<ConditionalAttribute>? = null
        private var operation: JsonField<ConditionalOperation>? = null
        private var value: JsonField<ConditionalValue>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleCondition: AuthRuleCondition) = apply {
            attribute = authRuleCondition.attribute
            operation = authRuleCondition.operation
            value = authRuleCondition.value
            additionalProperties = authRuleCondition.additionalProperties.toMutableMap()
        }

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
         * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data with
         *   the cardholder KYC data if it exists. Valid values are `MATCH`, `MATCH_ADDRESS_ONLY`,
         *   `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
         */
        fun attribute(attribute: ConditionalAttribute) = attribute(JsonField.of(attribute))

        /**
         * Sets [Builder.attribute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attribute] with a well-typed [ConditionalAttribute]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attribute(attribute: JsonField<ConditionalAttribute>) = apply {
            this.attribute = attribute
        }

        /** The operation to apply to the attribute */
        fun operation(operation: ConditionalOperation) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [ConditionalOperation]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /** Alias for calling [value] with `ConditionalValue.ofNumber(number)`. */
        fun value(number: Long) = value(ConditionalValue.ofNumber(number))

        /** Alias for calling [value] with `ConditionalValue.ofListOfStrings(listOfStrings)`. */
        fun valueOfListOfStrings(listOfStrings: List<String>) =
            value(ConditionalValue.ofListOfStrings(listOfStrings))

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
         * Returns an immutable instance of [AuthRuleCondition].
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
        fun build(): AuthRuleCondition =
            AuthRuleCondition(
                checkRequired("attribute", attribute),
                checkRequired("operation", operation),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthRuleCondition = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (attribute.asKnown().getOrNull()?.validity() ?: 0) +
            (operation.asKnown().getOrNull()?.validity() ?: 0) +
            (value.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleCondition &&
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
        "AuthRuleCondition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
}
