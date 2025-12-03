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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class TokenInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val walletType: JsonField<WalletType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("wallet_type")
        @ExcludeMissing
        walletType: JsonField<WalletType> = JsonMissing.of()
    ) : this(walletType, mutableMapOf())

    /**
     * The wallet_type field will indicate the source of the token. Possible token sources include
     * digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and “other” sources
     * like in-flight commerce. Masterpass is not currently supported and is included for future
     * use.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun walletType(): WalletType = walletType.getRequired("wallet_type")

    /**
     * Returns the raw JSON value of [walletType].
     *
     * Unlike [walletType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wallet_type")
    @ExcludeMissing
    fun _walletType(): JsonField<WalletType> = walletType

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
         * Returns a mutable builder for constructing an instance of [TokenInfo].
         *
         * The following fields are required:
         * ```java
         * .walletType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenInfo]. */
    class Builder internal constructor() {

        private var walletType: JsonField<WalletType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenInfo: TokenInfo) = apply {
            walletType = tokenInfo.walletType
            additionalProperties = tokenInfo.additionalProperties.toMutableMap()
        }

        /**
         * The wallet_type field will indicate the source of the token. Possible token sources
         * include digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and
         * “other” sources like in-flight commerce. Masterpass is not currently supported and is
         * included for future use.
         */
        fun walletType(walletType: WalletType) = walletType(JsonField.of(walletType))

        /**
         * Sets [Builder.walletType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.walletType] with a well-typed [WalletType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun walletType(walletType: JsonField<WalletType>) = apply { this.walletType = walletType }

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
         * Returns an immutable instance of [TokenInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .walletType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenInfo =
            TokenInfo(checkRequired("walletType", walletType), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TokenInfo = apply {
        if (validated) {
            return@apply
        }

        walletType().validate()
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
    @JvmSynthetic internal fun validity(): Int = (walletType.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The wallet_type field will indicate the source of the token. Possible token sources include
     * digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and “other” sources
     * like in-flight commerce. Masterpass is not currently supported and is included for future
     * use.
     */
    class WalletType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APPLE_PAY = of("APPLE_PAY")

            @JvmField val GOOGLE_PAY = of("GOOGLE_PAY")

            @JvmField val MASTERPASS = of("MASTERPASS")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmField val OTHER = of("OTHER")

            @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

            @JvmStatic fun of(value: String) = WalletType(JsonField.of(value))
        }

        /** An enum containing [WalletType]'s known values. */
        enum class Known {
            APPLE_PAY,
            GOOGLE_PAY,
            MASTERPASS,
            MERCHANT,
            OTHER,
            SAMSUNG_PAY,
        }

        /**
         * An enum containing [WalletType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WalletType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPLE_PAY,
            GOOGLE_PAY,
            MASTERPASS,
            MERCHANT,
            OTHER,
            SAMSUNG_PAY,
            /**
             * An enum member indicating that [WalletType] was instantiated with an unknown value.
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
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE_PAY -> Value.GOOGLE_PAY
                MASTERPASS -> Value.MASTERPASS
                MERCHANT -> Value.MERCHANT
                OTHER -> Value.OTHER
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
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
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE_PAY -> Known.GOOGLE_PAY
                MASTERPASS -> Known.MASTERPASS
                MERCHANT -> Known.MERCHANT
                OTHER -> Known.OTHER
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                else -> throw LithicInvalidDataException("Unknown WalletType: $value")
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

        fun validate(): WalletType = apply {
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

            return other is WalletType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenInfo &&
            walletType == other.walletType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(walletType, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenInfo{walletType=$walletType, additionalProperties=$additionalProperties}"
}
