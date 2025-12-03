// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/** Reason code for why a tokenization was declined */
class TokenizationDeclineReason
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ACCOUNT_SCORE_1 = of("ACCOUNT_SCORE_1")

        @JvmField val DEVICE_SCORE_1 = of("DEVICE_SCORE_1")

        @JvmField val ALL_WALLET_DECLINE_REASONS_PRESENT = of("ALL_WALLET_DECLINE_REASONS_PRESENT")

        @JvmField val WALLET_RECOMMENDED_DECISION_RED = of("WALLET_RECOMMENDED_DECISION_RED")

        @JvmField val CVC_MISMATCH = of("CVC_MISMATCH")

        @JvmField val CARD_EXPIRY_MONTH_MISMATCH = of("CARD_EXPIRY_MONTH_MISMATCH")

        @JvmField val CARD_EXPIRY_YEAR_MISMATCH = of("CARD_EXPIRY_YEAR_MISMATCH")

        @JvmField val CARD_INVALID_STATE = of("CARD_INVALID_STATE")

        @JvmField val CUSTOMER_RED_PATH = of("CUSTOMER_RED_PATH")

        @JvmField val INVALID_CUSTOMER_RESPONSE = of("INVALID_CUSTOMER_RESPONSE")

        @JvmField val NETWORK_FAILURE = of("NETWORK_FAILURE")

        @JvmField val GENERIC_DECLINE = of("GENERIC_DECLINE")

        @JvmField val DIGITAL_CARD_ART_REQUIRED = of("DIGITAL_CARD_ART_REQUIRED")

        @JvmStatic fun of(value: String) = TokenizationDeclineReason(JsonField.of(value))
    }

    /** An enum containing [TokenizationDeclineReason]'s known values. */
    enum class Known {
        ACCOUNT_SCORE_1,
        DEVICE_SCORE_1,
        ALL_WALLET_DECLINE_REASONS_PRESENT,
        WALLET_RECOMMENDED_DECISION_RED,
        CVC_MISMATCH,
        CARD_EXPIRY_MONTH_MISMATCH,
        CARD_EXPIRY_YEAR_MISMATCH,
        CARD_INVALID_STATE,
        CUSTOMER_RED_PATH,
        INVALID_CUSTOMER_RESPONSE,
        NETWORK_FAILURE,
        GENERIC_DECLINE,
        DIGITAL_CARD_ART_REQUIRED,
    }

    /**
     * An enum containing [TokenizationDeclineReason]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [TokenizationDeclineReason] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ACCOUNT_SCORE_1,
        DEVICE_SCORE_1,
        ALL_WALLET_DECLINE_REASONS_PRESENT,
        WALLET_RECOMMENDED_DECISION_RED,
        CVC_MISMATCH,
        CARD_EXPIRY_MONTH_MISMATCH,
        CARD_EXPIRY_YEAR_MISMATCH,
        CARD_INVALID_STATE,
        CUSTOMER_RED_PATH,
        INVALID_CUSTOMER_RESPONSE,
        NETWORK_FAILURE,
        GENERIC_DECLINE,
        DIGITAL_CARD_ART_REQUIRED,
        /**
         * An enum member indicating that [TokenizationDeclineReason] was instantiated with an
         * unknown value.
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
            ACCOUNT_SCORE_1 -> Value.ACCOUNT_SCORE_1
            DEVICE_SCORE_1 -> Value.DEVICE_SCORE_1
            ALL_WALLET_DECLINE_REASONS_PRESENT -> Value.ALL_WALLET_DECLINE_REASONS_PRESENT
            WALLET_RECOMMENDED_DECISION_RED -> Value.WALLET_RECOMMENDED_DECISION_RED
            CVC_MISMATCH -> Value.CVC_MISMATCH
            CARD_EXPIRY_MONTH_MISMATCH -> Value.CARD_EXPIRY_MONTH_MISMATCH
            CARD_EXPIRY_YEAR_MISMATCH -> Value.CARD_EXPIRY_YEAR_MISMATCH
            CARD_INVALID_STATE -> Value.CARD_INVALID_STATE
            CUSTOMER_RED_PATH -> Value.CUSTOMER_RED_PATH
            INVALID_CUSTOMER_RESPONSE -> Value.INVALID_CUSTOMER_RESPONSE
            NETWORK_FAILURE -> Value.NETWORK_FAILURE
            GENERIC_DECLINE -> Value.GENERIC_DECLINE
            DIGITAL_CARD_ART_REQUIRED -> Value.DIGITAL_CARD_ART_REQUIRED
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
            ACCOUNT_SCORE_1 -> Known.ACCOUNT_SCORE_1
            DEVICE_SCORE_1 -> Known.DEVICE_SCORE_1
            ALL_WALLET_DECLINE_REASONS_PRESENT -> Known.ALL_WALLET_DECLINE_REASONS_PRESENT
            WALLET_RECOMMENDED_DECISION_RED -> Known.WALLET_RECOMMENDED_DECISION_RED
            CVC_MISMATCH -> Known.CVC_MISMATCH
            CARD_EXPIRY_MONTH_MISMATCH -> Known.CARD_EXPIRY_MONTH_MISMATCH
            CARD_EXPIRY_YEAR_MISMATCH -> Known.CARD_EXPIRY_YEAR_MISMATCH
            CARD_INVALID_STATE -> Known.CARD_INVALID_STATE
            CUSTOMER_RED_PATH -> Known.CUSTOMER_RED_PATH
            INVALID_CUSTOMER_RESPONSE -> Known.INVALID_CUSTOMER_RESPONSE
            NETWORK_FAILURE -> Known.NETWORK_FAILURE
            GENERIC_DECLINE -> Known.GENERIC_DECLINE
            DIGITAL_CARD_ART_REQUIRED -> Known.DIGITAL_CARD_ART_REQUIRED
            else -> throw LithicInvalidDataException("Unknown TokenizationDeclineReason: $value")
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

    fun validate(): TokenizationDeclineReason = apply {
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

        return other is TokenizationDeclineReason && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
