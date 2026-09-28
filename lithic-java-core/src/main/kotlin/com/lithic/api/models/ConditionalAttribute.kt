// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/**
 * The attribute to target.
 *
 * The following attributes may be targeted:
 * * `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business by the
 *   types of goods or services it provides.
 * * `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3
 *   country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
 * * `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of the transaction.
 * * `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
 * * `DESCRIPTOR`: Short description of card acceptor.
 * * `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies to the
 *   transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
 * * `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
 *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`,
 *   `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
 *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
 * * `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee field in the
 *   settlement/cardholder billing currency. This is the amount the issuer should authorize against
 *   unless the issuer is paying the acquirer fee on behalf of the cardholder. Use an integer value.
 * * `CASH_AMOUNT`: The cash amount of the transaction in minor units (cents). This represents the
 *   amount of cash being withdrawn or advanced. Use an integer value.
 * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
 *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and 999
 *   representing the highest risk. For Visa transactions, where the raw score has a range of 0-99,
 *   Lithic will normalize the score by multiplying the raw score by 10x. Use an integer value.
 * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the trailing 15 minutes
 *   before the authorization. Use an integer value.
 * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing hour up and
 *   until the authorization. Use an integer value.
 * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24 hours
 *   up and until the authorization. Use an integer value.
 * * `CARD_DECLINE_COUNT_15M`: The number of declined transactions on the card in the trailing 15
 *   minutes before the authorization. Use an integer value.
 * * `CARD_DECLINE_COUNT_1H`: The number of declined transactions on the card in the trailing hour
 *   up and until the authorization. Use an integer value.
 * * `CARD_DECLINE_COUNT_24H`: The number of declined transactions on the card in the trailing 24
 *   hours up and until the authorization. Use an integer value.
 * * `CARD_STATE`: The current state of the card associated with the transaction. Valid values are
 *   `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
 * * `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction. Valid values are
 *   `TRUE`, `FALSE`.
 * * `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`, `OK`, `BLOCKED`.
 * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of the
 *   token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`,
 *   `OTHER`, `NONE`.
 * * `TRANSACTION_INITIATOR`: The entity that initiated the transaction indicates the source of the
 *   token. Valid values are `CARDHOLDER`, `MERCHANT`, `UNKNOWN`.
 * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data with the
 *   cardholder KYC data if it exists. Valid values are `MATCH`, `MATCH_ADDRESS_ONLY`,
 *   `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
 * * `SERVICE_LOCATION_STATE`: The state/province code (ISO 3166-2) where the cardholder received
 *   the service, e.g. "NY". When a service location is present in the network data, the service
 *   location state is used. Otherwise, falls back to the card acceptor state.
 * * `SERVICE_LOCATION_POSTAL_CODE`: The postal code where the cardholder received the service, e.g.
 *   "10001". When a service location is present in the network data, the service location postal
 *   code is used. Otherwise, falls back to the card acceptor postal code.
 * * `CARD_AGE`: The age of the card in seconds at the time of the authorization. Use an integer
 *   value.
 * * `IS_DOMESTIC`: Whether the merchant's country matches the card program's issuing country. Valid
 *   values are `TRUE`, `FALSE`. For programs with no issuing country configured, this attribute
 *   does not evaluate.
 * * `ACCOUNT_AGE`: The age of the account holder's account in seconds at the time of the
 *   authorization. Use an integer value. For programs where Lithic does not manage or retain
 *   account holder data, this attribute does not evaluate.
 * * `AMOUNT_Z_SCORE`: The z-score of the transaction amount relative to the entity's transaction
 *   history. Null if fewer than 30 approved transactions in the specified window. Requires
 *   `parameters.scope` and `parameters.interval`. Use a decimal value.
 * * `AVG_TRANSACTION_AMOUNT`: The average approved transaction amount for the entity over the
 *   specified window, in cents. Requires `parameters.scope` and `parameters.interval`. Use a
 *   decimal value.
 * * `STDEV_TRANSACTION_AMOUNT`: The standard deviation of approved transaction amounts for the
 *   entity over the specified window, in cents. Null if fewer than 30 approved transactions in the
 *   specified window. Requires `parameters.scope` and `parameters.interval`. Use a decimal value.
 * * `IS_NEW_COUNTRY`: Whether the transaction's merchant country has not been seen in the entity's
 *   transaction history. Valid values are `TRUE`, `FALSE`. Requires `parameters.scope`.
 * * `IS_NEW_MCC`: Whether the transaction's MCC has not been seen in the entity's transaction
 *   history. Valid values are `TRUE`, `FALSE`. Requires `parameters.scope`.
 * * `IS_FIRST_TRANSACTION`: Whether this is the first transaction for the entity. Valid values are
 *   `TRUE`, `FALSE`. Requires `parameters.scope`.
 * * `CONSECUTIVE_DECLINES`: The number of consecutive declined transactions for the entity over the
 *   last 30 days (rolling). Requires `parameters.scope`. Not supported for `BUSINESS_ACCOUNT`
 *   scope. Use an integer value.
 * * `TIME_SINCE_LAST_TRANSACTION`: The number of days since the last approved transaction for the
 *   entity, rounded to the nearest whole day. Requires `parameters.scope`. Use an integer value.
 * * `DISTINCT_COUNTRY_COUNT`: The number of distinct merchant countries seen in the entity's
 *   transaction history. Requires `parameters.scope`. Use an integer value.
 * * `IS_NEW_MERCHANT`: Whether the card acceptor ID has not been seen in the card's approved
 *   transaction history (capped at the 1000 most recently seen merchants). Valid values are `TRUE`,
 *   `FALSE`. Card-scoped only; no `parameters` required.
 * * `THREE_DS_SUCCESS_RATE`: The 3DS authentication success rate for the card, as a percentage from
 *   0.0 to 100.0. Card-scoped only; no `parameters` required. Use a decimal value.
 * * `TRAVEL_SPEED`: The estimated speed of travel derived from the distance between the postal code
 *   centers of the last card-present transaction and the current transaction, divided by the
 *   elapsed time. Null if there is no prior card-present transaction, if either postal code cannot
 *   be geocoded, or if elapsed time is zero. Requires `parameters.unit` set to `MPH` or `KPH`. Use
 *   a decimal value.
 * * `DISTANCE_FROM_LAST_TRANSACTION`: The estimated distance between the postal code centers of the
 *   last card-present transaction and the current transaction. Null if there is no prior
 *   card-present transaction or if either postal code cannot be geocoded. Requires
 *   `parameters.unit` set to `MILES` or `KILOMETERS`. Use a decimal value.
 */
class ConditionalAttribute @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
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

        @JvmField val CARD_DECLINE_COUNT_15_M = of("CARD_DECLINE_COUNT_15M")

        @JvmField val CARD_DECLINE_COUNT_1_H = of("CARD_DECLINE_COUNT_1H")

        @JvmField val CARD_DECLINE_COUNT_24_H = of("CARD_DECLINE_COUNT_24H")

        @JvmField val CARD_STATE = of("CARD_STATE")

        @JvmField val PIN_ENTERED = of("PIN_ENTERED")

        @JvmField val PIN_STATUS = of("PIN_STATUS")

        @JvmField val WALLET_TYPE = of("WALLET_TYPE")

        @JvmField val TRANSACTION_INITIATOR = of("TRANSACTION_INITIATOR")

        @JvmField val ADDRESS_MATCH = of("ADDRESS_MATCH")

        @JvmField val SERVICE_LOCATION_STATE = of("SERVICE_LOCATION_STATE")

        @JvmField val SERVICE_LOCATION_POSTAL_CODE = of("SERVICE_LOCATION_POSTAL_CODE")

        @JvmField val CARD_AGE = of("CARD_AGE")

        @JvmField val IS_DOMESTIC = of("IS_DOMESTIC")

        @JvmField val ACCOUNT_AGE = of("ACCOUNT_AGE")

        @JvmField val AMOUNT_Z_SCORE = of("AMOUNT_Z_SCORE")

        @JvmField val AVG_TRANSACTION_AMOUNT = of("AVG_TRANSACTION_AMOUNT")

        @JvmField val STDEV_TRANSACTION_AMOUNT = of("STDEV_TRANSACTION_AMOUNT")

        @JvmField val IS_NEW_COUNTRY = of("IS_NEW_COUNTRY")

        @JvmField val IS_NEW_MCC = of("IS_NEW_MCC")

        @JvmField val IS_FIRST_TRANSACTION = of("IS_FIRST_TRANSACTION")

        @JvmField val CONSECUTIVE_DECLINES = of("CONSECUTIVE_DECLINES")

        @JvmField val TIME_SINCE_LAST_TRANSACTION = of("TIME_SINCE_LAST_TRANSACTION")

        @JvmField val DISTINCT_COUNTRY_COUNT = of("DISTINCT_COUNTRY_COUNT")

        @JvmField val IS_NEW_MERCHANT = of("IS_NEW_MERCHANT")

        @JvmField val THREE_DS_SUCCESS_RATE = of("THREE_DS_SUCCESS_RATE")

        @JvmField val TRAVEL_SPEED = of("TRAVEL_SPEED")

        @JvmField val DISTANCE_FROM_LAST_TRANSACTION = of("DISTANCE_FROM_LAST_TRANSACTION")

        @JvmStatic fun of(value: String) = ConditionalAttribute(JsonField.of(value))
    }

    /** An enum containing [ConditionalAttribute]'s known values. */
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
        CARD_DECLINE_COUNT_15_M,
        CARD_DECLINE_COUNT_1_H,
        CARD_DECLINE_COUNT_24_H,
        CARD_STATE,
        PIN_ENTERED,
        PIN_STATUS,
        WALLET_TYPE,
        TRANSACTION_INITIATOR,
        ADDRESS_MATCH,
        SERVICE_LOCATION_STATE,
        SERVICE_LOCATION_POSTAL_CODE,
        CARD_AGE,
        IS_DOMESTIC,
        ACCOUNT_AGE,
        AMOUNT_Z_SCORE,
        AVG_TRANSACTION_AMOUNT,
        STDEV_TRANSACTION_AMOUNT,
        IS_NEW_COUNTRY,
        IS_NEW_MCC,
        IS_FIRST_TRANSACTION,
        CONSECUTIVE_DECLINES,
        TIME_SINCE_LAST_TRANSACTION,
        DISTINCT_COUNTRY_COUNT,
        IS_NEW_MERCHANT,
        THREE_DS_SUCCESS_RATE,
        TRAVEL_SPEED,
        DISTANCE_FROM_LAST_TRANSACTION,
    }

    /**
     * An enum containing [ConditionalAttribute]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ConditionalAttribute] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
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
        CARD_DECLINE_COUNT_15_M,
        CARD_DECLINE_COUNT_1_H,
        CARD_DECLINE_COUNT_24_H,
        CARD_STATE,
        PIN_ENTERED,
        PIN_STATUS,
        WALLET_TYPE,
        TRANSACTION_INITIATOR,
        ADDRESS_MATCH,
        SERVICE_LOCATION_STATE,
        SERVICE_LOCATION_POSTAL_CODE,
        CARD_AGE,
        IS_DOMESTIC,
        ACCOUNT_AGE,
        AMOUNT_Z_SCORE,
        AVG_TRANSACTION_AMOUNT,
        STDEV_TRANSACTION_AMOUNT,
        IS_NEW_COUNTRY,
        IS_NEW_MCC,
        IS_FIRST_TRANSACTION,
        CONSECUTIVE_DECLINES,
        TIME_SINCE_LAST_TRANSACTION,
        DISTINCT_COUNTRY_COUNT,
        IS_NEW_MERCHANT,
        THREE_DS_SUCCESS_RATE,
        TRAVEL_SPEED,
        DISTANCE_FROM_LAST_TRANSACTION,
        /**
         * An enum member indicating that [ConditionalAttribute] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
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
            CARD_DECLINE_COUNT_15_M -> Value.CARD_DECLINE_COUNT_15_M
            CARD_DECLINE_COUNT_1_H -> Value.CARD_DECLINE_COUNT_1_H
            CARD_DECLINE_COUNT_24_H -> Value.CARD_DECLINE_COUNT_24_H
            CARD_STATE -> Value.CARD_STATE
            PIN_ENTERED -> Value.PIN_ENTERED
            PIN_STATUS -> Value.PIN_STATUS
            WALLET_TYPE -> Value.WALLET_TYPE
            TRANSACTION_INITIATOR -> Value.TRANSACTION_INITIATOR
            ADDRESS_MATCH -> Value.ADDRESS_MATCH
            SERVICE_LOCATION_STATE -> Value.SERVICE_LOCATION_STATE
            SERVICE_LOCATION_POSTAL_CODE -> Value.SERVICE_LOCATION_POSTAL_CODE
            CARD_AGE -> Value.CARD_AGE
            IS_DOMESTIC -> Value.IS_DOMESTIC
            ACCOUNT_AGE -> Value.ACCOUNT_AGE
            AMOUNT_Z_SCORE -> Value.AMOUNT_Z_SCORE
            AVG_TRANSACTION_AMOUNT -> Value.AVG_TRANSACTION_AMOUNT
            STDEV_TRANSACTION_AMOUNT -> Value.STDEV_TRANSACTION_AMOUNT
            IS_NEW_COUNTRY -> Value.IS_NEW_COUNTRY
            IS_NEW_MCC -> Value.IS_NEW_MCC
            IS_FIRST_TRANSACTION -> Value.IS_FIRST_TRANSACTION
            CONSECUTIVE_DECLINES -> Value.CONSECUTIVE_DECLINES
            TIME_SINCE_LAST_TRANSACTION -> Value.TIME_SINCE_LAST_TRANSACTION
            DISTINCT_COUNTRY_COUNT -> Value.DISTINCT_COUNTRY_COUNT
            IS_NEW_MERCHANT -> Value.IS_NEW_MERCHANT
            THREE_DS_SUCCESS_RATE -> Value.THREE_DS_SUCCESS_RATE
            TRAVEL_SPEED -> Value.TRAVEL_SPEED
            DISTANCE_FROM_LAST_TRANSACTION -> Value.DISTANCE_FROM_LAST_TRANSACTION
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LithicInvalidDataException if this class instance's value is a not a known member.
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
            CARD_DECLINE_COUNT_15_M -> Known.CARD_DECLINE_COUNT_15_M
            CARD_DECLINE_COUNT_1_H -> Known.CARD_DECLINE_COUNT_1_H
            CARD_DECLINE_COUNT_24_H -> Known.CARD_DECLINE_COUNT_24_H
            CARD_STATE -> Known.CARD_STATE
            PIN_ENTERED -> Known.PIN_ENTERED
            PIN_STATUS -> Known.PIN_STATUS
            WALLET_TYPE -> Known.WALLET_TYPE
            TRANSACTION_INITIATOR -> Known.TRANSACTION_INITIATOR
            ADDRESS_MATCH -> Known.ADDRESS_MATCH
            SERVICE_LOCATION_STATE -> Known.SERVICE_LOCATION_STATE
            SERVICE_LOCATION_POSTAL_CODE -> Known.SERVICE_LOCATION_POSTAL_CODE
            CARD_AGE -> Known.CARD_AGE
            IS_DOMESTIC -> Known.IS_DOMESTIC
            ACCOUNT_AGE -> Known.ACCOUNT_AGE
            AMOUNT_Z_SCORE -> Known.AMOUNT_Z_SCORE
            AVG_TRANSACTION_AMOUNT -> Known.AVG_TRANSACTION_AMOUNT
            STDEV_TRANSACTION_AMOUNT -> Known.STDEV_TRANSACTION_AMOUNT
            IS_NEW_COUNTRY -> Known.IS_NEW_COUNTRY
            IS_NEW_MCC -> Known.IS_NEW_MCC
            IS_FIRST_TRANSACTION -> Known.IS_FIRST_TRANSACTION
            CONSECUTIVE_DECLINES -> Known.CONSECUTIVE_DECLINES
            TIME_SINCE_LAST_TRANSACTION -> Known.TIME_SINCE_LAST_TRANSACTION
            DISTINCT_COUNTRY_COUNT -> Known.DISTINCT_COUNTRY_COUNT
            IS_NEW_MERCHANT -> Known.IS_NEW_MERCHANT
            THREE_DS_SUCCESS_RATE -> Known.THREE_DS_SUCCESS_RATE
            TRAVEL_SPEED -> Known.TRAVEL_SPEED
            DISTANCE_FROM_LAST_TRANSACTION -> Known.DISTANCE_FROM_LAST_TRANSACTION
            else -> throw LithicInvalidDataException("Unknown ConditionalAttribute: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LithicInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ConditionalAttribute = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConditionalAttribute && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
