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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AuthRuleCondition
@JsonCreator
private constructor(
    @JsonProperty("attribute")
    @ExcludeMissing
    private val attribute: JsonField<ConditionalAttribute> = JsonMissing.of(),
    @JsonProperty("operation")
    @ExcludeMissing
    private val operation: JsonField<Operation> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Value> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The attribute to target.
     *
     * The following attributes may be targeted:
     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business by
     *   the types of goods or services it provides.
     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
     *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of the transaction.
     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
     * - `DESCRIPTOR`: Short description of card acceptor.
     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies to
     *   the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
     *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
     *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`,
     *   `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee field in
     *   the settlement/cardholder billing currency. This is the amount the issuer should authorize
     *   against unless the issuer is paying the acquirer fee on behalf of the cardholder.
     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a given
     *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and 999
     *   representing the highest risk. For Visa transactions, where the raw score has a range of
     *   0-99, Lithic will normalize the score by multiplying the raw score by 10x.
     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing hour up
     *   and until the authorization.
     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
     *   hours up and until the authorization.
     */
    fun attribute(): Optional<ConditionalAttribute> =
        Optional.ofNullable(attribute.getNullable("attribute"))

    /** The operation to apply to the attribute */
    fun operation(): Optional<Operation> = Optional.ofNullable(operation.getNullable("operation"))

    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
    fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

    /**
     * The attribute to target.
     *
     * The following attributes may be targeted:
     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business by
     *   the types of goods or services it provides.
     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
     *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of the transaction.
     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
     * - `DESCRIPTOR`: Short description of card acceptor.
     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies to
     *   the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
     *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
     *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`,
     *   `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee field in
     *   the settlement/cardholder billing currency. This is the amount the issuer should authorize
     *   against unless the issuer is paying the acquirer fee on behalf of the cardholder.
     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a given
     *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and 999
     *   representing the highest risk. For Visa transactions, where the raw score has a range of
     *   0-99, Lithic will normalize the score by multiplying the raw score by 10x.
     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing hour up
     *   and until the authorization.
     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
     *   hours up and until the authorization.
     */
    @JsonProperty("attribute")
    @ExcludeMissing
    fun _attribute(): JsonField<ConditionalAttribute> = attribute

    /** The operation to apply to the attribute */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<Operation> = operation

    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthRuleCondition = apply {
        if (validated) {
            return@apply
        }

        attribute()
        operation()
        value().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleCondition]. */
    class Builder internal constructor() {

        private var attribute: JsonField<ConditionalAttribute> = JsonMissing.of()
        private var operation: JsonField<Operation> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
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
         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business
         *   by the types of goods or services it provides.
         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
         *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of the
         *   transaction.
         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
         * - `DESCRIPTOR`: Short description of card acceptor.
         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies
         *   to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
         *   `TOKEN_AUTHENTICATED`.
         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
         *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
         *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
         *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
         *   `ECOMMERCE`.
         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
         *   field in the settlement/cardholder billing currency. This is the amount the issuer
         *   should authorize against unless the issuer is paying the acquirer fee on behalf of the
         *   cardholder.
         * - `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x.
         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing
         *   hour up and until the authorization.
         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
         *   hours up and until the authorization.
         */
        fun attribute(attribute: ConditionalAttribute) = attribute(JsonField.of(attribute))

        /**
         * The attribute to target.
         *
         * The following attributes may be targeted:
         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business
         *   by the types of goods or services it provides.
         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
         *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of the
         *   transaction.
         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
         * - `DESCRIPTOR`: Short description of card acceptor.
         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies
         *   to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
         *   `TOKEN_AUTHENTICATED`.
         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
         *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
         *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
         *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
         *   `ECOMMERCE`.
         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
         *   field in the settlement/cardholder billing currency. This is the amount the issuer
         *   should authorize against unless the issuer is paying the acquirer fee on behalf of the
         *   cardholder.
         * - `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x.
         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing
         *   hour up and until the authorization.
         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
         *   hours up and until the authorization.
         */
        fun attribute(attribute: JsonField<ConditionalAttribute>) = apply {
            this.attribute = attribute
        }

        /** The operation to apply to the attribute */
        fun operation(operation: Operation) = operation(JsonField.of(operation))

        /** The operation to apply to the attribute */
        fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun value(value: Value) = value(JsonField.of(value))

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun value(value: JsonField<Value>) = apply { this.value = value }

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun value(string: String) = value(Value.ofString(string))

        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
        fun value(integer: Long) = value(Value.ofInteger(integer))

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        fun valueOfStrings(strings: List<String>) = value(Value.ofStrings(strings))

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

        fun build(): AuthRuleCondition =
            AuthRuleCondition(
                attribute,
                operation,
                value,
                additionalProperties.toImmutable(),
            )
    }

    /** The operation to apply to the attribute */
    class Operation
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val IS_ONE_OF = of("IS_ONE_OF")

            @JvmField val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

            @JvmField val MATCHES = of("MATCHES")

            @JvmField val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

            @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

            @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

            @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
        }

        /** An enum containing [Operation]'s known values. */
        enum class Known {
            IS_ONE_OF,
            IS_NOT_ONE_OF,
            MATCHES,
            DOES_NOT_MATCH,
            IS_GREATER_THAN,
            IS_LESS_THAN,
        }

        /**
         * An enum containing [Operation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IS_ONE_OF,
            IS_NOT_ONE_OF,
            MATCHES,
            DOES_NOT_MATCH,
            IS_GREATER_THAN,
            IS_LESS_THAN,
            /**
             * An enum member indicating that [Operation] was instantiated with an unknown value.
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
                IS_ONE_OF -> Value.IS_ONE_OF
                IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                MATCHES -> Value.MATCHES
                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                IS_LESS_THAN -> Value.IS_LESS_THAN
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
                IS_ONE_OF -> Known.IS_ONE_OF
                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                MATCHES -> Known.MATCHES
                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                IS_LESS_THAN -> Known.IS_LESS_THAN
                else -> throw LithicInvalidDataException("Unknown Operation: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor(
        private val string: String? = null,
        private val integer: Long? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun string(): Optional<String> = Optional.ofNullable(string)

        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isInteger(): Boolean = integer != null

        fun isStrings(): Boolean = strings != null

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun asString(): String = string.getOrThrow("string")

        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
        fun asInteger(): Long = integer.getOrThrow("integer")

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                integer != null -> visitor.visitInteger(integer)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitInteger(integer: Long) {}

                    override fun visitStrings(strings: List<String>) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Value && string == other.string && integer == other.integer && strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, integer, strings) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Value{string=$string}"
                integer != null -> "Value{integer=$integer}"
                strings != null -> "Value{strings=$strings}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            @JvmStatic fun ofString(string: String) = Value(string = string)

            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
            @JvmStatic fun ofInteger(integer: Long) = Value(integer = integer)

            /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
            @JvmStatic fun ofStrings(strings: List<String>) = Value(strings = strings)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
        interface Visitor<out T> {

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun visitString(string: String): T

            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
            fun visitInteger(integer: Long): T

            /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
            fun visitStrings(strings: List<String>): T

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

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Value(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                    return Value(integer = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Value(strings = it, _json = json)
                }

                return Value(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.integer != null -> generator.writeObject(value.integer)
                    value.strings != null -> generator.writeObject(value.strings)
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

        return /* spotless:off */ other is AuthRuleCondition && attribute == other.attribute && operation == other.operation && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(attribute, operation, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRuleCondition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
}
