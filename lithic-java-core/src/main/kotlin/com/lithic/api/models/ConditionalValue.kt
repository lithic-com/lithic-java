// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.JsonValue
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
@JsonDeserialize(using = ConditionalValue.Deserializer::class)
@JsonSerialize(using = ConditionalValue.Serializer::class)
class ConditionalValue
private constructor(
    private val regex: String? = null,
    private val number: Long? = null,
    private val listOfStrings: List<String>? = null,
    private val timestamp: OffsetDateTime? = null,
    private val _json: JsonValue? = null,
) {

    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
    fun regex(): Optional<String> = Optional.ofNullable(regex)

    /**
     * A number, to be used with `IS_GREATER_THAN`, `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
     * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
     */
    fun number(): Optional<Long> = Optional.ofNullable(number)

    /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
    fun listOfStrings(): Optional<List<String>> = Optional.ofNullable(listOfStrings)

    /** A timestamp, to be used with `IS_AFTER` or `IS_BEFORE` */
    fun timestamp(): Optional<OffsetDateTime> = Optional.ofNullable(timestamp)

    fun isRegex(): Boolean = regex != null

    fun isNumber(): Boolean = number != null

    fun isListOfStrings(): Boolean = listOfStrings != null

    fun isTimestamp(): Boolean = timestamp != null

    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
    fun asRegex(): String = regex.getOrThrow("regex")

    /**
     * A number, to be used with `IS_GREATER_THAN`, `IS_GREATER_THAN_OR_EQUAL_TO`, `IS_LESS_THAN`,
     * `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
     */
    fun asNumber(): Long = number.getOrThrow("number")

    /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
    fun asListOfStrings(): List<String> = listOfStrings.getOrThrow("listOfStrings")

    /** A timestamp, to be used with `IS_AFTER` or `IS_BEFORE` */
    fun asTimestamp(): OffsetDateTime = timestamp.getOrThrow("timestamp")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            regex != null -> visitor.visitRegex(regex)
            number != null -> visitor.visitNumber(number)
            listOfStrings != null -> visitor.visitListOfStrings(listOfStrings)
            timestamp != null -> visitor.visitTimestamp(timestamp)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ConditionalValue = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitRegex(regex: String) {}

                override fun visitNumber(number: Long) {}

                override fun visitListOfStrings(listOfStrings: List<String>) {}

                override fun visitTimestamp(timestamp: OffsetDateTime) {}
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitRegex(regex: String) = 1

                override fun visitNumber(number: Long) = 1

                override fun visitListOfStrings(listOfStrings: List<String>) = listOfStrings.size

                override fun visitTimestamp(timestamp: OffsetDateTime) = 1

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConditionalValue &&
            regex == other.regex &&
            number == other.number &&
            listOfStrings == other.listOfStrings &&
            timestamp == other.timestamp
    }

    override fun hashCode(): Int = Objects.hash(regex, number, listOfStrings, timestamp)

    override fun toString(): String =
        when {
            regex != null -> "ConditionalValue{regex=$regex}"
            number != null -> "ConditionalValue{number=$number}"
            listOfStrings != null -> "ConditionalValue{listOfStrings=$listOfStrings}"
            timestamp != null -> "ConditionalValue{timestamp=$timestamp}"
            _json != null -> "ConditionalValue{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ConditionalValue")
        }

    companion object {

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        @JvmStatic fun ofRegex(regex: String) = ConditionalValue(regex = regex)

        /**
         * A number, to be used with `IS_GREATER_THAN`, `IS_GREATER_THAN_OR_EQUAL_TO`,
         * `IS_LESS_THAN`, `IS_LESS_THAN_OR_EQUAL_TO`, `IS_EQUAL_TO`, or `IS_NOT_EQUAL_TO`
         */
        @JvmStatic fun ofNumber(number: Long) = ConditionalValue(number = number)

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        @JvmStatic
        fun ofListOfStrings(listOfStrings: List<String>) =
            ConditionalValue(listOfStrings = listOfStrings.toImmutable())

        /** A timestamp, to be used with `IS_AFTER` or `IS_BEFORE` */
        @JvmStatic
        fun ofTimestamp(timestamp: OffsetDateTime) = ConditionalValue(timestamp = timestamp)
    }

    /**
     * An interface that defines how to map each variant of [ConditionalValue] to a value of type
     * [T].
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

        /** A timestamp, to be used with `IS_AFTER` or `IS_BEFORE` */
        fun visitTimestamp(timestamp: OffsetDateTime): T

        /**
         * Maps an unknown variant of [ConditionalValue] to a value of type [T].
         *
         * An instance of [ConditionalValue] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException("Unknown ConditionalValue: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ConditionalValue>(ConditionalValue::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ConditionalValue {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            ConditionalValue(regex = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                            ConditionalValue(number = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                            ConditionalValue(listOfStrings = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                            ConditionalValue(timestamp = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ConditionalValue(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ConditionalValue>(ConditionalValue::class) {

        override fun serialize(
            value: ConditionalValue,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.regex != null -> generator.writeObject(value.regex)
                value.number != null -> generator.writeObject(value.number)
                value.listOfStrings != null -> generator.writeObject(value.listOfStrings)
                value.timestamp != null -> generator.writeObject(value.timestamp)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ConditionalValue")
            }
        }
    }
}
