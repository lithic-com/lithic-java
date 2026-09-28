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

class AuthRuleCondition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attribute: JsonField<ConditionalAttribute>,
    private val operation: JsonField<ConditionalOperation>,
    private val value: JsonField<ConditionalValue>,
    private val parameters: JsonField<Parameters>,
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
     *   against unless the issuer is paying the acquirer fee on behalf of the cardholder. Use an
     *   integer value.
     * * `CASH_AMOUNT`: The cash amount of the transaction in minor units (cents). This represents
     *   the amount of cash being withdrawn or advanced. Use an integer value.
     * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
     *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and 999
     *   representing the highest risk. For Visa transactions, where the raw score has a range of
     *   0-99, Lithic will normalize the score by multiplying the raw score by 10x. Use an integer
     *   value.
     * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the trailing 15
     *   minutes before the authorization. Use an integer value.
     * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing hour up
     *   and until the authorization. Use an integer value.
     * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
     *   hours up and until the authorization. Use an integer value.
     * * `CARD_DECLINE_COUNT_15M`: The number of declined transactions on the card in the trailing
     *   15 minutes before the authorization. Use an integer value.
     * * `CARD_DECLINE_COUNT_1H`: The number of declined transactions on the card in the trailing
     *   hour up and until the authorization. Use an integer value.
     * * `CARD_DECLINE_COUNT_24H`: The number of declined transactions on the card in the trailing
     *   24 hours up and until the authorization. Use an integer value.
     * * `CARD_STATE`: The current state of the card associated with the transaction. Valid values
     *   are `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
     * * `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction. Valid values are
     *   `TRUE`, `FALSE`.
     * * `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`, `OK`, `BLOCKED`.
     * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of the
     *   token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`,
     *   `OTHER`, `NONE`.
     * * `TRANSACTION_INITIATOR`: The entity that initiated the transaction indicates the source of
     *   the token. Valid values are `CARDHOLDER`, `MERCHANT`, `UNKNOWN`.
     * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data with the
     *   cardholder KYC data if it exists. Valid values are `MATCH`, `MATCH_ADDRESS_ONLY`,
     *   `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
     * * `SERVICE_LOCATION_STATE`: The state/province code (ISO 3166-2) where the cardholder
     *   received the service, e.g. "NY". When a service location is present in the network data,
     *   the service location state is used. Otherwise, falls back to the card acceptor state.
     * * `SERVICE_LOCATION_POSTAL_CODE`: The postal code where the cardholder received the service,
     *   e.g. "10001". When a service location is present in the network data, the service location
     *   postal code is used. Otherwise, falls back to the card acceptor postal code.
     * * `CARD_AGE`: The age of the card in seconds at the time of the authorization. Use an integer
     *   value.
     * * `IS_DOMESTIC`: Whether the merchant's country matches the card program's issuing country.
     *   Valid values are `TRUE`, `FALSE`. For programs with no issuing country configured, this
     *   attribute does not evaluate.
     * * `ACCOUNT_AGE`: The age of the account holder's account in seconds at the time of the
     *   authorization. Use an integer value. For programs where Lithic does not manage or retain
     *   account holder data, this attribute does not evaluate.
     * * `AMOUNT_Z_SCORE`: The z-score of the transaction amount relative to the entity's
     *   transaction history. Null if fewer than 30 approved transactions in the specified window.
     *   Requires `parameters.scope` and `parameters.interval`. Use a decimal value.
     * * `AVG_TRANSACTION_AMOUNT`: The average approved transaction amount for the entity over the
     *   specified window, in cents. Requires `parameters.scope` and `parameters.interval`. Use a
     *   decimal value.
     * * `STDEV_TRANSACTION_AMOUNT`: The standard deviation of approved transaction amounts for the
     *   entity over the specified window, in cents. Null if fewer than 30 approved transactions in
     *   the specified window. Requires `parameters.scope` and `parameters.interval`. Use a decimal
     *   value.
     * * `IS_NEW_COUNTRY`: Whether the transaction's merchant country has not been seen in the
     *   entity's transaction history. Valid values are `TRUE`, `FALSE`. Requires
     *   `parameters.scope`.
     * * `IS_NEW_MCC`: Whether the transaction's MCC has not been seen in the entity's transaction
     *   history. Valid values are `TRUE`, `FALSE`. Requires `parameters.scope`.
     * * `IS_FIRST_TRANSACTION`: Whether this is the first transaction for the entity. Valid values
     *   are `TRUE`, `FALSE`. Requires `parameters.scope`.
     * * `CONSECUTIVE_DECLINES`: The number of consecutive declined transactions for the entity over
     *   the last 30 days (rolling). Requires `parameters.scope`. Not supported for
     *   `BUSINESS_ACCOUNT` scope. Use an integer value.
     * * `TIME_SINCE_LAST_TRANSACTION`: The number of days since the last approved transaction for
     *   the entity, rounded to the nearest whole day. Requires `parameters.scope`. Use an integer
     *   value.
     * * `DISTINCT_COUNTRY_COUNT`: The number of distinct merchant countries seen in the entity's
     *   transaction history. Requires `parameters.scope`. Use an integer value.
     * * `IS_NEW_MERCHANT`: Whether the card acceptor ID has not been seen in the card's approved
     *   transaction history (capped at the 1000 most recently seen merchants). Valid values are
     *   `TRUE`, `FALSE`. Card-scoped only; no `parameters` required.
     * * `THREE_DS_SUCCESS_RATE`: The 3DS authentication success rate for the card, as a percentage
     *   from 0.0 to 100.0. Card-scoped only; no `parameters` required. Use a decimal value.
     * * `TRAVEL_SPEED`: The estimated speed of travel derived from the distance between the postal
     *   code centers of the last card-present transaction and the current transaction, divided by
     *   the elapsed time. Null if there is no prior card-present transaction, if either postal code
     *   cannot be geocoded, or if elapsed time is zero. Requires `parameters.unit` set to `MPH` or
     *   `KPH`. Use a decimal value.
     * * `DISTANCE_FROM_LAST_TRANSACTION`: The estimated distance between the postal code centers of
     *   the last card-present transaction and the current transaction. Null if there is no prior
     *   card-present transaction or if either postal code cannot be geocoded. Requires
     *   `parameters.unit` set to `MILES` or `KILOMETERS`. Use a decimal value.
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
     * Additional parameters for certain attributes. Required when `attribute` is one of
     * `AMOUNT_Z_SCORE`, `AVG_TRANSACTION_AMOUNT`, `STDEV_TRANSACTION_AMOUNT`, `IS_NEW_COUNTRY`,
     * `IS_NEW_MCC`, `IS_FIRST_TRANSACTION`, `CONSECUTIVE_DECLINES`, `TIME_SINCE_LAST_TRANSACTION`,
     * or `DISTINCT_COUNTRY_COUNT` (require `scope`); or `TRAVEL_SPEED` or
     * `DISTANCE_FROM_LAST_TRANSACTION` (require `unit`). Not used for other attributes.
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
        private var parameters: JsonField<Parameters> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleCondition: AuthRuleCondition) = apply {
            attribute = authRuleCondition.attribute
            operation = authRuleCondition.operation
            value = authRuleCondition.value
            parameters = authRuleCondition.parameters
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
         *   cardholder. Use an integer value.
         * * `CASH_AMOUNT`: The cash amount of the transaction in minor units (cents). This
         *   represents the amount of cash being withdrawn or advanced. Use an integer value.
         * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x. Use
         *   an integer value.
         * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the trailing 15
         *   minutes before the authorization. Use an integer value.
         * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing
         *   hour up and until the authorization. Use an integer value.
         * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
         *   hours up and until the authorization. Use an integer value.
         * * `CARD_DECLINE_COUNT_15M`: The number of declined transactions on the card in the
         *   trailing 15 minutes before the authorization. Use an integer value.
         * * `CARD_DECLINE_COUNT_1H`: The number of declined transactions on the card in the
         *   trailing hour up and until the authorization. Use an integer value.
         * * `CARD_DECLINE_COUNT_24H`: The number of declined transactions on the card in the
         *   trailing 24 hours up and until the authorization. Use an integer value.
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
         * * `SERVICE_LOCATION_STATE`: The state/province code (ISO 3166-2) where the cardholder
         *   received the service, e.g. "NY". When a service location is present in the network
         *   data, the service location state is used. Otherwise, falls back to the card acceptor
         *   state.
         * * `SERVICE_LOCATION_POSTAL_CODE`: The postal code where the cardholder received the
         *   service, e.g. "10001". When a service location is present in the network data, the
         *   service location postal code is used. Otherwise, falls back to the card acceptor postal
         *   code.
         * * `CARD_AGE`: The age of the card in seconds at the time of the authorization. Use an
         *   integer value.
         * * `IS_DOMESTIC`: Whether the merchant's country matches the card program's issuing
         *   country. Valid values are `TRUE`, `FALSE`. For programs with no issuing country
         *   configured, this attribute does not evaluate.
         * * `ACCOUNT_AGE`: The age of the account holder's account in seconds at the time of the
         *   authorization. Use an integer value. For programs where Lithic does not manage or
         *   retain account holder data, this attribute does not evaluate.
         * * `AMOUNT_Z_SCORE`: The z-score of the transaction amount relative to the entity's
         *   transaction history. Null if fewer than 30 approved transactions in the specified
         *   window. Requires `parameters.scope` and `parameters.interval`. Use a decimal value.
         * * `AVG_TRANSACTION_AMOUNT`: The average approved transaction amount for the entity over
         *   the specified window, in cents. Requires `parameters.scope` and `parameters.interval`.
         *   Use a decimal value.
         * * `STDEV_TRANSACTION_AMOUNT`: The standard deviation of approved transaction amounts for
         *   the entity over the specified window, in cents. Null if fewer than 30 approved
         *   transactions in the specified window. Requires `parameters.scope` and
         *   `parameters.interval`. Use a decimal value.
         * * `IS_NEW_COUNTRY`: Whether the transaction's merchant country has not been seen in the
         *   entity's transaction history. Valid values are `TRUE`, `FALSE`. Requires
         *   `parameters.scope`.
         * * `IS_NEW_MCC`: Whether the transaction's MCC has not been seen in the entity's
         *   transaction history. Valid values are `TRUE`, `FALSE`. Requires `parameters.scope`.
         * * `IS_FIRST_TRANSACTION`: Whether this is the first transaction for the entity. Valid
         *   values are `TRUE`, `FALSE`. Requires `parameters.scope`.
         * * `CONSECUTIVE_DECLINES`: The number of consecutive declined transactions for the entity
         *   over the last 30 days (rolling). Requires `parameters.scope`. Not supported for
         *   `BUSINESS_ACCOUNT` scope. Use an integer value.
         * * `TIME_SINCE_LAST_TRANSACTION`: The number of days since the last approved transaction
         *   for the entity, rounded to the nearest whole day. Requires `parameters.scope`. Use an
         *   integer value.
         * * `DISTINCT_COUNTRY_COUNT`: The number of distinct merchant countries seen in the
         *   entity's transaction history. Requires `parameters.scope`. Use an integer value.
         * * `IS_NEW_MERCHANT`: Whether the card acceptor ID has not been seen in the card's
         *   approved transaction history (capped at the 1000 most recently seen merchants). Valid
         *   values are `TRUE`, `FALSE`. Card-scoped only; no `parameters` required.
         * * `THREE_DS_SUCCESS_RATE`: The 3DS authentication success rate for the card, as a
         *   percentage from 0.0 to 100.0. Card-scoped only; no `parameters` required. Use a decimal
         *   value.
         * * `TRAVEL_SPEED`: The estimated speed of travel derived from the distance between the
         *   postal code centers of the last card-present transaction and the current transaction,
         *   divided by the elapsed time. Null if there is no prior card-present transaction, if
         *   either postal code cannot be geocoded, or if elapsed time is zero. Requires
         *   `parameters.unit` set to `MPH` or `KPH`. Use a decimal value.
         * * `DISTANCE_FROM_LAST_TRANSACTION`: The estimated distance between the postal code
         *   centers of the last card-present transaction and the current transaction. Null if there
         *   is no prior card-present transaction or if either postal code cannot be geocoded.
         *   Requires `parameters.unit` set to `MILES` or `KILOMETERS`. Use a decimal value.
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
         * Additional parameters for certain attributes. Required when `attribute` is one of
         * `AMOUNT_Z_SCORE`, `AVG_TRANSACTION_AMOUNT`, `STDEV_TRANSACTION_AMOUNT`, `IS_NEW_COUNTRY`,
         * `IS_NEW_MCC`, `IS_FIRST_TRANSACTION`, `CONSECUTIVE_DECLINES`,
         * `TIME_SINCE_LAST_TRANSACTION`, or `DISTINCT_COUNTRY_COUNT` (require `scope`); or
         * `TRAVEL_SPEED` or `DISTANCE_FROM_LAST_TRANSACTION` (require `unit`). Not used for other
         * attributes.
         */
        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

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
                parameters,
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
    fun validate(): AuthRuleCondition = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
     * Additional parameters for certain attributes. Required when `attribute` is one of
     * `AMOUNT_Z_SCORE`, `AVG_TRANSACTION_AMOUNT`, `STDEV_TRANSACTION_AMOUNT`, `IS_NEW_COUNTRY`,
     * `IS_NEW_MCC`, `IS_FIRST_TRANSACTION`, `CONSECUTIVE_DECLINES`, `TIME_SINCE_LAST_TRANSACTION`,
     * or `DISTINCT_COUNTRY_COUNT` (require `scope`); or `TRAVEL_SPEED` or
     * `DISTANCE_FROM_LAST_TRANSACTION` (require `unit`). Not used for other attributes.
     */
    class Parameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val interval: JsonField<Interval>,
        private val scope: JsonField<Scope>,
        private val unit: JsonField<Unit>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("interval")
            @ExcludeMissing
            interval: JsonField<Interval> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
        ) : this(interval, scope, unit, mutableMapOf())

        /**
         * The time window for statistical attributes (`AMOUNT_Z_SCORE`, `AVG_TRANSACTION_AMOUNT`,
         * `STDEV_TRANSACTION_AMOUNT`). Use `LIFETIME` for all-time history or a specific window
         * (`7D`, `30D`, `90D`).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interval(): Optional<Interval> = interval.getOptional("interval")

        /**
         * The entity scope to evaluate the attribute against.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scope(): Optional<Scope> = scope.getOptional("scope")

        /**
         * The unit for impossible travel attributes. Required when `attribute` is `TRAVEL_SPEED` or
         * `DISTANCE_FROM_LAST_TRANSACTION`.
         *
         * For `TRAVEL_SPEED`: `MPH` (miles per hour) or `KPH` (kilometers per hour).
         *
         * For `DISTANCE_FROM_LAST_TRANSACTION`: `MILES` or `KILOMETERS`.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<Unit> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [interval].
         *
         * Unlike [interval], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<Interval> = interval

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

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

            private var interval: JsonField<Interval> = JsonMissing.of()
            private var scope: JsonField<Scope> = JsonMissing.of()
            private var unit: JsonField<Unit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameters: Parameters) = apply {
                interval = parameters.interval
                scope = parameters.scope
                unit = parameters.unit
                additionalProperties = parameters.additionalProperties.toMutableMap()
            }

            /**
             * The time window for statistical attributes (`AMOUNT_Z_SCORE`,
             * `AVG_TRANSACTION_AMOUNT`, `STDEV_TRANSACTION_AMOUNT`). Use `LIFETIME` for all-time
             * history or a specific window (`7D`, `30D`, `90D`).
             */
            fun interval(interval: Interval) = interval(JsonField.of(interval))

            /**
             * Sets [Builder.interval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interval] with a well-typed [Interval] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interval(interval: JsonField<Interval>) = apply { this.interval = interval }

            /** The entity scope to evaluate the attribute against. */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            /**
             * The unit for impossible travel attributes. Required when `attribute` is
             * `TRAVEL_SPEED` or `DISTANCE_FROM_LAST_TRANSACTION`.
             *
             * For `TRAVEL_SPEED`: `MPH` (miles per hour) or `KPH` (kilometers per hour).
             *
             * For `DISTANCE_FROM_LAST_TRANSACTION`: `MILES` or `KILOMETERS`.
             */
            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [Parameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameters =
                Parameters(interval, scope, unit, additionalProperties.toMutableMap())
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
        fun validate(): Parameters = apply {
            if (validated) {
                return@apply
            }

            interval().ifPresent { it.validate() }
            scope().ifPresent { it.validate() }
            unit().ifPresent { it.validate() }
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
            (interval.asKnown().getOrNull()?.validity() ?: 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (unit.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The time window for statistical attributes (`AMOUNT_Z_SCORE`, `AVG_TRANSACTION_AMOUNT`,
         * `STDEV_TRANSACTION_AMOUNT`). Use `LIFETIME` for all-time history or a specific window
         * (`7D`, `30D`, `90D`).
         */
        class Interval @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val LIFETIME = of("LIFETIME")

                @JvmField val _7_D = of("7D")

                @JvmField val _30_D = of("30D")

                @JvmField val _90_D = of("90D")

                @JvmStatic fun of(value: String) = Interval(JsonField.of(value))
            }

            /** An enum containing [Interval]'s known values. */
            enum class Known {
                LIFETIME,
                _7_D,
                _30_D,
                _90_D,
            }

            /**
             * An enum containing [Interval]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Interval] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LIFETIME,
                _7_D,
                _30_D,
                _90_D,
                /**
                 * An enum member indicating that [Interval] was instantiated with an unknown value.
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
                    LIFETIME -> Value.LIFETIME
                    _7_D -> Value._7_D
                    _30_D -> Value._30_D
                    _90_D -> Value._90_D
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
                    LIFETIME -> Known.LIFETIME
                    _7_D -> Known._7_D
                    _30_D -> Known._30_D
                    _90_D -> Known._90_D
                    else -> throw LithicInvalidDataException("Unknown Interval: $value")
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
            fun validate(): Interval = apply {
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

                return other is Interval && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The entity scope to evaluate the attribute against. */
        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CARD = of("CARD")

                @JvmField val ACCOUNT = of("ACCOUNT")

                @JvmField val BUSINESS_ACCOUNT = of("BUSINESS_ACCOUNT")

                @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
            }

            /** An enum containing [Scope]'s known values. */
            enum class Known {
                CARD,
                ACCOUNT,
                BUSINESS_ACCOUNT,
            }

            /**
             * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Scope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                ACCOUNT,
                BUSINESS_ACCOUNT,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
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
                    CARD -> Value.CARD
                    ACCOUNT -> Value.ACCOUNT
                    BUSINESS_ACCOUNT -> Value.BUSINESS_ACCOUNT
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
                    CARD -> Known.CARD
                    ACCOUNT -> Known.ACCOUNT
                    BUSINESS_ACCOUNT -> Known.BUSINESS_ACCOUNT
                    else -> throw LithicInvalidDataException("Unknown Scope: $value")
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

        /**
         * The unit for impossible travel attributes. Required when `attribute` is `TRAVEL_SPEED` or
         * `DISTANCE_FROM_LAST_TRANSACTION`.
         *
         * For `TRAVEL_SPEED`: `MPH` (miles per hour) or `KPH` (kilometers per hour).
         *
         * For `DISTANCE_FROM_LAST_TRANSACTION`: `MILES` or `KILOMETERS`.
         */
        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val MPH = of("MPH")

                @JvmField val KPH = of("KPH")

                @JvmField val MILES = of("MILES")

                @JvmField val KILOMETERS = of("KILOMETERS")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                MPH,
                KPH,
                MILES,
                KILOMETERS,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MPH,
                KPH,
                MILES,
                KILOMETERS,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
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
                    MPH -> Value.MPH
                    KPH -> Value.KPH
                    MILES -> Value.MILES
                    KILOMETERS -> Value.KILOMETERS
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
                    MPH -> Known.MPH
                    KPH -> Known.KPH
                    MILES -> Known.MILES
                    KILOMETERS -> Known.KILOMETERS
                    else -> throw LithicInvalidDataException("Unknown Unit: $value")
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
            fun validate(): Unit = apply {
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

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameters &&
                interval == other.interval &&
                scope == other.scope &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(interval, scope, unit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Parameters{interval=$interval, scope=$scope, unit=$unit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleCondition &&
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
        "AuthRuleCondition{attribute=$attribute, operation=$operation, value=$value, parameters=$parameters, additionalProperties=$additionalProperties}"
}
