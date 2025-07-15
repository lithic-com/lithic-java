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
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.getOrThrow
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum value is
 * 10 seconds, and the maximum value is 2678400 seconds (31 days).
 */
@JsonDeserialize(using = VelocityLimitParamsPeriodWindow.Deserializer::class)
@JsonSerialize(using = VelocityLimitParamsPeriodWindow.Serializer::class)
class VelocityLimitParamsPeriodWindow
private constructor(
    private val trailing: Long? = null,
    private val fixed: FixedWindow? = null,
    private val trailingWindowObject: TrailingWindowObject? = null,
    private val fixedWindowDay: FixedWindowDay? = null,
    private val fixedWindowWeek: FixedWindowWeek? = null,
    private val fixedWindowMonth: FixedWindowMonth? = null,
    private val fixedWindowYear: FixedWindowYear? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
     * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
     */
    fun trailing(): Optional<Long> = Optional.ofNullable(trailing)

    /**
     * The window of time to calculate Spend Velocity over.
     * - `DAY`: Velocity over the current day since midnight Eastern Time.
     * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern Time.
     * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month in
     *   Eastern Time.
     * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in Eastern Time.
     */
    fun fixed(): Optional<FixedWindow> = Optional.ofNullable(fixed)

    fun trailingWindowObject(): Optional<TrailingWindowObject> =
        Optional.ofNullable(trailingWindowObject)

    /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
    fun fixedWindowDay(): Optional<FixedWindowDay> = Optional.ofNullable(fixedWindowDay)

    /**
     * Velocity over the current week since 00:00 / 12 AM in Eastern Time on specified `day_of_week`
     */
    fun fixedWindowWeek(): Optional<FixedWindowWeek> = Optional.ofNullable(fixedWindowWeek)

    /**
     * Velocity over the current month since 00:00 / 12 AM in Eastern Time on specified
     * `day_of_month`.
     */
    fun fixedWindowMonth(): Optional<FixedWindowMonth> = Optional.ofNullable(fixedWindowMonth)

    /**
     * Velocity over the current year since 00:00 / 12 AM in Eastern Time on specified `month` and
     * `day_of_month`. This validates the month and day of the year to start from is a real date. In
     * the event that February 29th is selected, in non-leap years, the window will start from
     * February 28th.
     */
    fun fixedWindowYear(): Optional<FixedWindowYear> = Optional.ofNullable(fixedWindowYear)

    fun isTrailing(): Boolean = trailing != null

    fun isFixed(): Boolean = fixed != null

    fun isTrailingWindowObject(): Boolean = trailingWindowObject != null

    fun isFixedWindowDay(): Boolean = fixedWindowDay != null

    fun isFixedWindowWeek(): Boolean = fixedWindowWeek != null

    fun isFixedWindowMonth(): Boolean = fixedWindowMonth != null

    fun isFixedWindowYear(): Boolean = fixedWindowYear != null

    /**
     * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
     * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
     */
    fun asTrailing(): Long = trailing.getOrThrow("trailing")

    /**
     * The window of time to calculate Spend Velocity over.
     * - `DAY`: Velocity over the current day since midnight Eastern Time.
     * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern Time.
     * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month in
     *   Eastern Time.
     * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in Eastern Time.
     */
    fun asFixed(): FixedWindow = fixed.getOrThrow("fixed")

    fun asTrailingWindowObject(): TrailingWindowObject =
        trailingWindowObject.getOrThrow("trailingWindowObject")

    /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
    fun asFixedWindowDay(): FixedWindowDay = fixedWindowDay.getOrThrow("fixedWindowDay")

    /**
     * Velocity over the current week since 00:00 / 12 AM in Eastern Time on specified `day_of_week`
     */
    fun asFixedWindowWeek(): FixedWindowWeek = fixedWindowWeek.getOrThrow("fixedWindowWeek")

    /**
     * Velocity over the current month since 00:00 / 12 AM in Eastern Time on specified
     * `day_of_month`.
     */
    fun asFixedWindowMonth(): FixedWindowMonth = fixedWindowMonth.getOrThrow("fixedWindowMonth")

    /**
     * Velocity over the current year since 00:00 / 12 AM in Eastern Time on specified `month` and
     * `day_of_month`. This validates the month and day of the year to start from is a real date. In
     * the event that February 29th is selected, in non-leap years, the window will start from
     * February 28th.
     */
    fun asFixedWindowYear(): FixedWindowYear = fixedWindowYear.getOrThrow("fixedWindowYear")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            trailing != null -> visitor.visitTrailing(trailing)
            fixed != null -> visitor.visitFixed(fixed)
            trailingWindowObject != null -> visitor.visitTrailingWindowObject(trailingWindowObject)
            fixedWindowDay != null -> visitor.visitFixedWindowDay(fixedWindowDay)
            fixedWindowWeek != null -> visitor.visitFixedWindowWeek(fixedWindowWeek)
            fixedWindowMonth != null -> visitor.visitFixedWindowMonth(fixedWindowMonth)
            fixedWindowYear != null -> visitor.visitFixedWindowYear(fixedWindowYear)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): VelocityLimitParamsPeriodWindow = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitTrailing(trailing: Long) {}

                override fun visitFixed(fixed: FixedWindow) {
                    fixed.validate()
                }

                override fun visitTrailingWindowObject(trailingWindowObject: TrailingWindowObject) {
                    trailingWindowObject.validate()
                }

                override fun visitFixedWindowDay(fixedWindowDay: FixedWindowDay) {
                    fixedWindowDay.validate()
                }

                override fun visitFixedWindowWeek(fixedWindowWeek: FixedWindowWeek) {
                    fixedWindowWeek.validate()
                }

                override fun visitFixedWindowMonth(fixedWindowMonth: FixedWindowMonth) {
                    fixedWindowMonth.validate()
                }

                override fun visitFixedWindowYear(fixedWindowYear: FixedWindowYear) {
                    fixedWindowYear.validate()
                }
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
                override fun visitTrailing(trailing: Long) = 1

                override fun visitFixed(fixed: FixedWindow) = fixed.validity()

                override fun visitTrailingWindowObject(trailingWindowObject: TrailingWindowObject) =
                    trailingWindowObject.validity()

                override fun visitFixedWindowDay(fixedWindowDay: FixedWindowDay) =
                    fixedWindowDay.validity()

                override fun visitFixedWindowWeek(fixedWindowWeek: FixedWindowWeek) =
                    fixedWindowWeek.validity()

                override fun visitFixedWindowMonth(fixedWindowMonth: FixedWindowMonth) =
                    fixedWindowMonth.validity()

                override fun visitFixedWindowYear(fixedWindowYear: FixedWindowYear) =
                    fixedWindowYear.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VelocityLimitParamsPeriodWindow && trailing == other.trailing && fixed == other.fixed && trailingWindowObject == other.trailingWindowObject && fixedWindowDay == other.fixedWindowDay && fixedWindowWeek == other.fixedWindowWeek && fixedWindowMonth == other.fixedWindowMonth && fixedWindowYear == other.fixedWindowYear /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(trailing, fixed, trailingWindowObject, fixedWindowDay, fixedWindowWeek, fixedWindowMonth, fixedWindowYear) /* spotless:on */

    override fun toString(): String =
        when {
            trailing != null -> "VelocityLimitParamsPeriodWindow{trailing=$trailing}"
            fixed != null -> "VelocityLimitParamsPeriodWindow{fixed=$fixed}"
            trailingWindowObject != null ->
                "VelocityLimitParamsPeriodWindow{trailingWindowObject=$trailingWindowObject}"
            fixedWindowDay != null ->
                "VelocityLimitParamsPeriodWindow{fixedWindowDay=$fixedWindowDay}"
            fixedWindowWeek != null ->
                "VelocityLimitParamsPeriodWindow{fixedWindowWeek=$fixedWindowWeek}"
            fixedWindowMonth != null ->
                "VelocityLimitParamsPeriodWindow{fixedWindowMonth=$fixedWindowMonth}"
            fixedWindowYear != null ->
                "VelocityLimitParamsPeriodWindow{fixedWindowYear=$fixedWindowYear}"
            _json != null -> "VelocityLimitParamsPeriodWindow{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid VelocityLimitParamsPeriodWindow")
        }

    companion object {

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        @JvmStatic
        fun ofTrailing(trailing: Long) = VelocityLimitParamsPeriodWindow(trailing = trailing)

        /**
         * The window of time to calculate Spend Velocity over.
         * - `DAY`: Velocity over the current day since midnight Eastern Time.
         * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in Eastern
         *   Time.
         */
        @JvmStatic fun ofFixed(fixed: FixedWindow) = VelocityLimitParamsPeriodWindow(fixed = fixed)

        @JvmStatic
        fun ofTrailingWindowObject(trailingWindowObject: TrailingWindowObject) =
            VelocityLimitParamsPeriodWindow(trailingWindowObject = trailingWindowObject)

        /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
        @JvmStatic
        fun ofFixedWindowDay(fixedWindowDay: FixedWindowDay) =
            VelocityLimitParamsPeriodWindow(fixedWindowDay = fixedWindowDay)

        /**
         * Velocity over the current week since 00:00 / 12 AM in Eastern Time on specified
         * `day_of_week`
         */
        @JvmStatic
        fun ofFixedWindowWeek(fixedWindowWeek: FixedWindowWeek) =
            VelocityLimitParamsPeriodWindow(fixedWindowWeek = fixedWindowWeek)

        /**
         * Velocity over the current month since 00:00 / 12 AM in Eastern Time on specified
         * `day_of_month`.
         */
        @JvmStatic
        fun ofFixedWindowMonth(fixedWindowMonth: FixedWindowMonth) =
            VelocityLimitParamsPeriodWindow(fixedWindowMonth = fixedWindowMonth)

        /**
         * Velocity over the current year since 00:00 / 12 AM in Eastern Time on specified `month`
         * and `day_of_month`. This validates the month and day of the year to start from is a real
         * date. In the event that February 29th is selected, in non-leap years, the window will
         * start from February 28th.
         */
        @JvmStatic
        fun ofFixedWindowYear(fixedWindowYear: FixedWindowYear) =
            VelocityLimitParamsPeriodWindow(fixedWindowYear = fixedWindowYear)
    }

    /**
     * An interface that defines how to map each variant of [VelocityLimitParamsPeriodWindow] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         */
        fun visitTrailing(trailing: Long): T

        /**
         * The window of time to calculate Spend Velocity over.
         * - `DAY`: Velocity over the current day since midnight Eastern Time.
         * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern Time.
         * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month
         *   in Eastern Time.
         * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in Eastern
         *   Time.
         */
        fun visitFixed(fixed: FixedWindow): T

        fun visitTrailingWindowObject(trailingWindowObject: TrailingWindowObject): T

        /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
        fun visitFixedWindowDay(fixedWindowDay: FixedWindowDay): T

        /**
         * Velocity over the current week since 00:00 / 12 AM in Eastern Time on specified
         * `day_of_week`
         */
        fun visitFixedWindowWeek(fixedWindowWeek: FixedWindowWeek): T

        /**
         * Velocity over the current month since 00:00 / 12 AM in Eastern Time on specified
         * `day_of_month`.
         */
        fun visitFixedWindowMonth(fixedWindowMonth: FixedWindowMonth): T

        /**
         * Velocity over the current year since 00:00 / 12 AM in Eastern Time on specified `month`
         * and `day_of_month`. This validates the month and day of the year to start from is a real
         * date. In the event that February 29th is selected, in non-leap years, the window will
         * start from February 28th.
         */
        fun visitFixedWindowYear(fixedWindowYear: FixedWindowYear): T

        /**
         * Maps an unknown variant of [VelocityLimitParamsPeriodWindow] to a value of type [T].
         *
         * An instance of [VelocityLimitParamsPeriodWindow] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException("Unknown VelocityLimitParamsPeriodWindow: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<VelocityLimitParamsPeriodWindow>(VelocityLimitParamsPeriodWindow::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): VelocityLimitParamsPeriodWindow {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<FixedWindow>())?.let {
                            VelocityLimitParamsPeriodWindow(fixed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TrailingWindowObject>())?.let {
                            VelocityLimitParamsPeriodWindow(trailingWindowObject = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FixedWindowDay>())?.let {
                            VelocityLimitParamsPeriodWindow(fixedWindowDay = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FixedWindowWeek>())?.let {
                            VelocityLimitParamsPeriodWindow(fixedWindowWeek = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FixedWindowMonth>())?.let {
                            VelocityLimitParamsPeriodWindow(fixedWindowMonth = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FixedWindowYear>())?.let {
                            VelocityLimitParamsPeriodWindow(fixedWindowYear = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                            VelocityLimitParamsPeriodWindow(trailing = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from array).
                0 -> VelocityLimitParamsPeriodWindow(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<VelocityLimitParamsPeriodWindow>(VelocityLimitParamsPeriodWindow::class) {

        override fun serialize(
            value: VelocityLimitParamsPeriodWindow,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.trailing != null -> generator.writeObject(value.trailing)
                value.fixed != null -> generator.writeObject(value.fixed)
                value.trailingWindowObject != null ->
                    generator.writeObject(value.trailingWindowObject)
                value.fixedWindowDay != null -> generator.writeObject(value.fixedWindowDay)
                value.fixedWindowWeek != null -> generator.writeObject(value.fixedWindowWeek)
                value.fixedWindowMonth != null -> generator.writeObject(value.fixedWindowMonth)
                value.fixedWindowYear != null -> generator.writeObject(value.fixedWindowYear)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid VelocityLimitParamsPeriodWindow")
            }
        }
    }

    /**
     * The window of time to calculate Spend Velocity over.
     * - `DAY`: Velocity over the current day since midnight Eastern Time.
     * - `WEEK`: Velocity over the current week since 00:00 / 12 AM on Monday in Eastern Time.
     * - `MONTH`: Velocity over the current month since 00:00 / 12 AM on the first of the month in
     *   Eastern Time.
     * - `YEAR`: Velocity over the current year since 00:00 / 12 AM on January 1st in Eastern Time.
     */
    class FixedWindow @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val DAY = of("DAY")

            @JvmField val WEEK = of("WEEK")

            @JvmField val MONTH = of("MONTH")

            @JvmField val YEAR = of("YEAR")

            @JvmStatic fun of(value: String) = FixedWindow(JsonField.of(value))
        }

        /** An enum containing [FixedWindow]'s known values. */
        enum class Known {
            DAY,
            WEEK,
            MONTH,
            YEAR,
        }

        /**
         * An enum containing [FixedWindow]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FixedWindow] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAY,
            WEEK,
            MONTH,
            YEAR,
            /**
             * An enum member indicating that [FixedWindow] was instantiated with an unknown value.
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
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MONTH -> Value.MONTH
                YEAR -> Value.YEAR
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
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MONTH -> Known.MONTH
                YEAR -> Known.YEAR
                else -> throw LithicInvalidDataException("Unknown FixedWindow: $value")
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

        fun validate(): FixedWindow = apply {
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

            return /* spotless:off */ other is FixedWindow && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TrailingWindowObject
    private constructor(
        private val duration: JsonField<Long>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(duration, type, mutableMapOf())

        /**
         * The size of the trailing window to calculate Spend Velocity over in seconds. The minimum
         * value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [TrailingWindowObject]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrailingWindowObject]. */
        class Builder internal constructor() {

            private var duration: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trailingWindowObject: TrailingWindowObject) = apply {
                duration = trailingWindowObject.duration
                type = trailingWindowObject.type
                additionalProperties = trailingWindowObject.additionalProperties.toMutableMap()
            }

            /**
             * The size of the trailing window to calculate Spend Velocity over in seconds. The
             * minimum value is 10 seconds, and the maximum value is 2678400 seconds (31 days).
             */
            fun duration(duration: Long) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [TrailingWindowObject].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TrailingWindowObject =
                TrailingWindowObject(duration, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): TrailingWindowObject = apply {
            if (validated) {
                return@apply
            }

            duration()
            type().ifPresent { it.validate() }
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
            (if (duration.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CUSTOM = of("CUSTOM")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CUSTOM
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CUSTOM,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    CUSTOM -> Value.CUSTOM
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
                    CUSTOM -> Known.CUSTOM
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrailingWindowObject && duration == other.duration && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(duration, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrailingWindowObject{duration=$duration, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
    class FixedWindowDay
    private constructor(
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of()
        ) : this(type, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [FixedWindowDay]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FixedWindowDay]. */
        class Builder internal constructor() {

            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fixedWindowDay: FixedWindowDay) = apply {
                type = fixedWindowDay.type
                additionalProperties = fixedWindowDay.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [FixedWindowDay].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FixedWindowDay = FixedWindowDay(type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): FixedWindowDay = apply {
            if (validated) {
                return@apply
            }

            type().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DAY = of("DAY")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DAY
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAY,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    DAY -> Value.DAY
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
                    DAY -> Known.DAY
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedWindowDay && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedWindowDay{type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Velocity over the current week since 00:00 / 12 AM in Eastern Time on specified `day_of_week`
     */
    class FixedWindowWeek
    private constructor(
        private val dayOfWeek: JsonField<Long>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("day_of_week")
            @ExcludeMissing
            dayOfWeek: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(dayOfWeek, type, mutableMapOf())

        /**
         * The day of the week to start the week from. Following ISO-8601, 1 is Monday and 7 is
         * Sunday. Defaults to Monday if not specified.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dayOfWeek(): Optional<Long> = dayOfWeek.getOptional("day_of_week")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [dayOfWeek].
         *
         * Unlike [dayOfWeek], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day_of_week") @ExcludeMissing fun _dayOfWeek(): JsonField<Long> = dayOfWeek

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [FixedWindowWeek]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FixedWindowWeek]. */
        class Builder internal constructor() {

            private var dayOfWeek: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fixedWindowWeek: FixedWindowWeek) = apply {
                dayOfWeek = fixedWindowWeek.dayOfWeek
                type = fixedWindowWeek.type
                additionalProperties = fixedWindowWeek.additionalProperties.toMutableMap()
            }

            /**
             * The day of the week to start the week from. Following ISO-8601, 1 is Monday and 7 is
             * Sunday. Defaults to Monday if not specified.
             */
            fun dayOfWeek(dayOfWeek: Long) = dayOfWeek(JsonField.of(dayOfWeek))

            /**
             * Sets [Builder.dayOfWeek] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dayOfWeek] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dayOfWeek(dayOfWeek: JsonField<Long>) = apply { this.dayOfWeek = dayOfWeek }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [FixedWindowWeek].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FixedWindowWeek =
                FixedWindowWeek(dayOfWeek, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): FixedWindowWeek = apply {
            if (validated) {
                return@apply
            }

            dayOfWeek()
            type().ifPresent { it.validate() }
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
            (if (dayOfWeek.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val WEEK = of("WEEK")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                WEEK
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WEEK,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    WEEK -> Value.WEEK
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
                    WEEK -> Known.WEEK
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedWindowWeek && dayOfWeek == other.dayOfWeek && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dayOfWeek, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedWindowWeek{dayOfWeek=$dayOfWeek, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Velocity over the current month since 00:00 / 12 AM in Eastern Time on specified
     * `day_of_month`.
     */
    class FixedWindowMonth
    private constructor(
        private val dayOfMonth: JsonField<Long>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("day_of_month")
            @ExcludeMissing
            dayOfMonth: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(dayOfMonth, type, mutableMapOf())

        /**
         * The day of the month to start from. Accepts values from 1 to 31, and will reset at the
         * end of the month if the day exceeds the number of days in the month. Defaults to the 1st
         * of the month if not specified.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dayOfMonth(): Optional<Long> = dayOfMonth.getOptional("day_of_month")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [dayOfMonth].
         *
         * Unlike [dayOfMonth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day_of_month")
        @ExcludeMissing
        fun _dayOfMonth(): JsonField<Long> = dayOfMonth

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [FixedWindowMonth]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FixedWindowMonth]. */
        class Builder internal constructor() {

            private var dayOfMonth: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fixedWindowMonth: FixedWindowMonth) = apply {
                dayOfMonth = fixedWindowMonth.dayOfMonth
                type = fixedWindowMonth.type
                additionalProperties = fixedWindowMonth.additionalProperties.toMutableMap()
            }

            /**
             * The day of the month to start from. Accepts values from 1 to 31, and will reset at
             * the end of the month if the day exceeds the number of days in the month. Defaults to
             * the 1st of the month if not specified.
             */
            fun dayOfMonth(dayOfMonth: Long) = dayOfMonth(JsonField.of(dayOfMonth))

            /**
             * Sets [Builder.dayOfMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dayOfMonth] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dayOfMonth(dayOfMonth: JsonField<Long>) = apply { this.dayOfMonth = dayOfMonth }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [FixedWindowMonth].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FixedWindowMonth =
                FixedWindowMonth(dayOfMonth, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): FixedWindowMonth = apply {
            if (validated) {
                return@apply
            }

            dayOfMonth()
            type().ifPresent { it.validate() }
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
            (if (dayOfMonth.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val MONTH = of("MONTH")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                MONTH
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTH,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    MONTH -> Value.MONTH
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
                    MONTH -> Known.MONTH
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedWindowMonth && dayOfMonth == other.dayOfMonth && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dayOfMonth, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedWindowMonth{dayOfMonth=$dayOfMonth, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Velocity over the current year since 00:00 / 12 AM in Eastern Time on specified `month` and
     * `day_of_month`. This validates the month and day of the year to start from is a real date. In
     * the event that February 29th is selected, in non-leap years, the window will start from
     * February 28th.
     */
    class FixedWindowYear
    private constructor(
        private val dayOfMonth: JsonField<Long>,
        private val month: JsonField<Long>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("day_of_month")
            @ExcludeMissing
            dayOfMonth: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("month") @ExcludeMissing month: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(dayOfMonth, month, type, mutableMapOf())

        /**
         * The day of the month to start from. Defaults to the 1st of the month if not specified.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dayOfMonth(): Optional<Long> = dayOfMonth.getOptional("day_of_month")

        /**
         * The month to start from. 1 is January and 12 is December. Defaults to January if not
         * specified.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun month(): Optional<Long> = month.getOptional("month")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [dayOfMonth].
         *
         * Unlike [dayOfMonth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day_of_month")
        @ExcludeMissing
        fun _dayOfMonth(): JsonField<Long> = dayOfMonth

        /**
         * Returns the raw JSON value of [month].
         *
         * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [FixedWindowYear]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FixedWindowYear]. */
        class Builder internal constructor() {

            private var dayOfMonth: JsonField<Long> = JsonMissing.of()
            private var month: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fixedWindowYear: FixedWindowYear) = apply {
                dayOfMonth = fixedWindowYear.dayOfMonth
                month = fixedWindowYear.month
                type = fixedWindowYear.type
                additionalProperties = fixedWindowYear.additionalProperties.toMutableMap()
            }

            /**
             * The day of the month to start from. Defaults to the 1st of the month if not
             * specified.
             */
            fun dayOfMonth(dayOfMonth: Long) = dayOfMonth(JsonField.of(dayOfMonth))

            /**
             * Sets [Builder.dayOfMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dayOfMonth] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dayOfMonth(dayOfMonth: JsonField<Long>) = apply { this.dayOfMonth = dayOfMonth }

            /**
             * The month to start from. 1 is January and 12 is December. Defaults to January if not
             * specified.
             */
            fun month(month: Long) = month(JsonField.of(month))

            /**
             * Sets [Builder.month] to an arbitrary JSON value.
             *
             * You should usually call [Builder.month] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [FixedWindowYear].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FixedWindowYear =
                FixedWindowYear(dayOfMonth, month, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): FixedWindowYear = apply {
            if (validated) {
                return@apply
            }

            dayOfMonth()
            month()
            type().ifPresent { it.validate() }
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
            (if (dayOfMonth.asKnown().isPresent) 1 else 0) +
                (if (month.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val YEAR = of("YEAR")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                YEAR
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                YEAR,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    YEAR -> Value.YEAR
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
                    YEAR -> Known.YEAR
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedWindowYear && dayOfMonth == other.dayOfMonth && month == other.month && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dayOfMonth, month, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedWindowYear{dayOfMonth=$dayOfMonth, month=$month, type=$type, additionalProperties=$additionalProperties}"
    }
}
