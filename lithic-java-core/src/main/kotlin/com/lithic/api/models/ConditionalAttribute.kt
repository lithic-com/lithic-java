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
 *   unless the issuer is paying the acquirer fee on behalf of the cardholder.
 * * `RISK_SCORE`: Network-provided score assessing risk level associated with a given
 *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and 999
 *   representing the highest risk. For Visa transactions, where the raw score has a range of 0-99,
 *   Lithic will normalize the score by multiplying the raw score by 10x.
 * * `CARD_TRANSACTION_COUNT_15M`: The number of transactions on the card in the trailing 15 minutes
 *   before the authorization.
 * * `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing hour up and
 *   until the authorization.
 * * `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24 hours
 *   up and until the authorization.
 * * `CARD_STATE`: The current state of the card associated with the transaction. Valid values are
 *   `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
 * * `PIN_ENTERED`: Indicates whether a PIN was entered during the transaction. Valid values are
 *   `TRUE`, `FALSE`.
 * * `PIN_STATUS`: The current state of card's PIN. Valid values are `NOT_SET`, `OK`, `BLOCKED`.
 * * `WALLET_TYPE`: For transactions using a digital wallet token, indicates the source of the
 *   token. Valid values are `APPLE_PAY`, `GOOGLE_PAY`, `SAMSUNG_PAY`, `MASTERPASS`, `MERCHANT`,
 *   `OTHER`, `NONE`.
 * * `ADDRESS_MATCH`: Lithic's evaluation result comparing transaction's address data with the
 *   cardholder KYC data if it exists. Valid values are `MATCH`, `MATCH_ADDRESS_ONLY`,
 *   `MATCH_ZIP_ONLY`,`MISMATCH`,`NOT_PRESENT`.
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

        @JvmField val RISK_SCORE = of("RISK_SCORE")

        @JvmField val CARD_TRANSACTION_COUNT_15_M = of("CARD_TRANSACTION_COUNT_15M")

        @JvmField val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

        @JvmField val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

        @JvmField val CARD_STATE = of("CARD_STATE")

        @JvmField val PIN_ENTERED = of("PIN_ENTERED")

        @JvmField val PIN_STATUS = of("PIN_STATUS")

        @JvmField val WALLET_TYPE = of("WALLET_TYPE")

        @JvmField val ADDRESS_MATCH = of("ADDRESS_MATCH")

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
        RISK_SCORE,
        CARD_TRANSACTION_COUNT_15_M,
        CARD_TRANSACTION_COUNT_1_H,
        CARD_TRANSACTION_COUNT_24_H,
        CARD_STATE,
        PIN_ENTERED,
        PIN_STATUS,
        WALLET_TYPE,
        ADDRESS_MATCH,
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
        RISK_SCORE,
        CARD_TRANSACTION_COUNT_15_M,
        CARD_TRANSACTION_COUNT_1_H,
        CARD_TRANSACTION_COUNT_24_H,
        CARD_STATE,
        PIN_ENTERED,
        PIN_STATUS,
        WALLET_TYPE,
        ADDRESS_MATCH,
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
            RISK_SCORE -> Value.RISK_SCORE
            CARD_TRANSACTION_COUNT_15_M -> Value.CARD_TRANSACTION_COUNT_15_M
            CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
            CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
            CARD_STATE -> Value.CARD_STATE
            PIN_ENTERED -> Value.PIN_ENTERED
            PIN_STATUS -> Value.PIN_STATUS
            WALLET_TYPE -> Value.WALLET_TYPE
            ADDRESS_MATCH -> Value.ADDRESS_MATCH
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
            RISK_SCORE -> Known.RISK_SCORE
            CARD_TRANSACTION_COUNT_15_M -> Known.CARD_TRANSACTION_COUNT_15_M
            CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
            CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
            CARD_STATE -> Known.CARD_STATE
            PIN_ENTERED -> Known.PIN_ENTERED
            PIN_STATUS -> Known.PIN_STATUS
            WALLET_TYPE -> Known.WALLET_TYPE
            ADDRESS_MATCH -> Known.ADDRESS_MATCH
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
