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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardSpendLimits
private constructor(
    private val availableSpendLimit: JsonField<AvailableSpendLimit>,
    private val spendLimit: JsonField<SpendLimit>,
    private val spendVelocity: JsonField<SpendVelocity>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available_spend_limit")
        @ExcludeMissing
        availableSpendLimit: JsonField<AvailableSpendLimit> = JsonMissing.of(),
        @JsonProperty("spend_limit")
        @ExcludeMissing
        spendLimit: JsonField<SpendLimit> = JsonMissing.of(),
        @JsonProperty("spend_velocity")
        @ExcludeMissing
        spendVelocity: JsonField<SpendVelocity> = JsonMissing.of(),
    ) : this(availableSpendLimit, spendLimit, spendVelocity, mutableMapOf())

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableSpendLimit(): AvailableSpendLimit =
        availableSpendLimit.getRequired("available_spend_limit")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendLimit(): Optional<SpendLimit> = spendLimit.getOptional("spend_limit")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendVelocity(): Optional<SpendVelocity> = spendVelocity.getOptional("spend_velocity")

    /**
     * Returns the raw JSON value of [availableSpendLimit].
     *
     * Unlike [availableSpendLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_spend_limit")
    @ExcludeMissing
    fun _availableSpendLimit(): JsonField<AvailableSpendLimit> = availableSpendLimit

    /**
     * Returns the raw JSON value of [spendLimit].
     *
     * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_limit")
    @ExcludeMissing
    fun _spendLimit(): JsonField<SpendLimit> = spendLimit

    /**
     * Returns the raw JSON value of [spendVelocity].
     *
     * Unlike [spendVelocity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_velocity")
    @ExcludeMissing
    fun _spendVelocity(): JsonField<SpendVelocity> = spendVelocity

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
         * Returns a mutable builder for constructing an instance of [CardSpendLimits].
         *
         * The following fields are required:
         * ```java
         * .availableSpendLimit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardSpendLimits]. */
    class Builder internal constructor() {

        private var availableSpendLimit: JsonField<AvailableSpendLimit>? = null
        private var spendLimit: JsonField<SpendLimit> = JsonMissing.of()
        private var spendVelocity: JsonField<SpendVelocity> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardSpendLimits: CardSpendLimits) = apply {
            availableSpendLimit = cardSpendLimits.availableSpendLimit
            spendLimit = cardSpendLimits.spendLimit
            spendVelocity = cardSpendLimits.spendVelocity
            additionalProperties = cardSpendLimits.additionalProperties.toMutableMap()
        }

        fun availableSpendLimit(availableSpendLimit: AvailableSpendLimit) =
            availableSpendLimit(JsonField.of(availableSpendLimit))

        /**
         * Sets [Builder.availableSpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableSpendLimit] with a well-typed
         * [AvailableSpendLimit] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun availableSpendLimit(availableSpendLimit: JsonField<AvailableSpendLimit>) = apply {
            this.availableSpendLimit = availableSpendLimit
        }

        fun spendLimit(spendLimit: SpendLimit) = spendLimit(JsonField.of(spendLimit))

        /**
         * Sets [Builder.spendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimit] with a well-typed [SpendLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spendLimit(spendLimit: JsonField<SpendLimit>) = apply { this.spendLimit = spendLimit }

        fun spendVelocity(spendVelocity: SpendVelocity) = spendVelocity(JsonField.of(spendVelocity))

        /**
         * Sets [Builder.spendVelocity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendVelocity] with a well-typed [SpendVelocity] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spendVelocity(spendVelocity: JsonField<SpendVelocity>) = apply {
            this.spendVelocity = spendVelocity
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
         * Returns an immutable instance of [CardSpendLimits].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .availableSpendLimit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardSpendLimits =
            CardSpendLimits(
                checkRequired("availableSpendLimit", availableSpendLimit),
                spendLimit,
                spendVelocity,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardSpendLimits = apply {
        if (validated) {
            return@apply
        }

        availableSpendLimit().validate()
        spendLimit().ifPresent { it.validate() }
        spendVelocity().ifPresent { it.validate() }
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
        (availableSpendLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (spendLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (spendVelocity.asKnown().getOrNull()?.validity() ?: 0)

    class AvailableSpendLimit
    private constructor(
        private val annually: JsonField<Long>,
        private val forever: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("annually") @ExcludeMissing annually: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("forever") @ExcludeMissing forever: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly") @ExcludeMissing monthly: JsonField<Long> = JsonMissing.of(),
        ) : this(annually, forever, monthly, mutableMapOf())

        /**
         * The available spend limit (in cents) relative to the annual limit configured on the Card
         * (e.g. 100000 would be a $1,000 limit).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun annually(): Optional<Long> = annually.getOptional("annually")

        /**
         * The available spend limit (in cents) relative to the forever limit configured on the
         * Card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forever(): Optional<Long> = forever.getOptional("forever")

        /**
         * The available spend limit (in cents) relative to the monthly limit configured on the
         * Card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthly(): Optional<Long> = monthly.getOptional("monthly")

        /**
         * Returns the raw JSON value of [annually].
         *
         * Unlike [annually], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("annually") @ExcludeMissing fun _annually(): JsonField<Long> = annually

        /**
         * Returns the raw JSON value of [forever].
         *
         * Unlike [forever], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("forever") @ExcludeMissing fun _forever(): JsonField<Long> = forever

        /**
         * Returns the raw JSON value of [monthly].
         *
         * Unlike [monthly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

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

            /** Returns a mutable builder for constructing an instance of [AvailableSpendLimit]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AvailableSpendLimit]. */
        class Builder internal constructor() {

            private var annually: JsonField<Long> = JsonMissing.of()
            private var forever: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(availableSpendLimit: AvailableSpendLimit) = apply {
                annually = availableSpendLimit.annually
                forever = availableSpendLimit.forever
                monthly = availableSpendLimit.monthly
                additionalProperties = availableSpendLimit.additionalProperties.toMutableMap()
            }

            /**
             * The available spend limit (in cents) relative to the annual limit configured on the
             * Card (e.g. 100000 would be a $1,000 limit).
             */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /**
             * Sets [Builder.annually] to an arbitrary JSON value.
             *
             * You should usually call [Builder.annually] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /**
             * The available spend limit (in cents) relative to the forever limit configured on the
             * Card.
             */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /**
             * Sets [Builder.forever] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forever] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /**
             * The available spend limit (in cents) relative to the monthly limit configured on the
             * Card.
             */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * Sets [Builder.monthly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthly] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

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
             * Returns an immutable instance of [AvailableSpendLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AvailableSpendLimit =
                AvailableSpendLimit(annually, forever, monthly, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AvailableSpendLimit = apply {
            if (validated) {
                return@apply
            }

            annually()
            forever()
            monthly()
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
            (if (annually.asKnown().isPresent) 1 else 0) +
                (if (forever.asKnown().isPresent) 1 else 0) +
                (if (monthly.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AvailableSpendLimit &&
                annually == other.annually &&
                forever == other.forever &&
                monthly == other.monthly &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(annually, forever, monthly, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableSpendLimit{annually=$annually, forever=$forever, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    class SpendLimit
    private constructor(
        private val annually: JsonField<Long>,
        private val forever: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("annually") @ExcludeMissing annually: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("forever") @ExcludeMissing forever: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly") @ExcludeMissing monthly: JsonField<Long> = JsonMissing.of(),
        ) : this(annually, forever, monthly, mutableMapOf())

        /**
         * The configured annual spend limit (in cents) on the Card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun annually(): Optional<Long> = annually.getOptional("annually")

        /**
         * The configured forever spend limit (in cents) on the Card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forever(): Optional<Long> = forever.getOptional("forever")

        /**
         * The configured monthly spend limit (in cents) on the Card.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthly(): Optional<Long> = monthly.getOptional("monthly")

        /**
         * Returns the raw JSON value of [annually].
         *
         * Unlike [annually], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("annually") @ExcludeMissing fun _annually(): JsonField<Long> = annually

        /**
         * Returns the raw JSON value of [forever].
         *
         * Unlike [forever], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("forever") @ExcludeMissing fun _forever(): JsonField<Long> = forever

        /**
         * Returns the raw JSON value of [monthly].
         *
         * Unlike [monthly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

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

            /** Returns a mutable builder for constructing an instance of [SpendLimit]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpendLimit]. */
        class Builder internal constructor() {

            private var annually: JsonField<Long> = JsonMissing.of()
            private var forever: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendLimit: SpendLimit) = apply {
                annually = spendLimit.annually
                forever = spendLimit.forever
                monthly = spendLimit.monthly
                additionalProperties = spendLimit.additionalProperties.toMutableMap()
            }

            /** The configured annual spend limit (in cents) on the Card. */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /**
             * Sets [Builder.annually] to an arbitrary JSON value.
             *
             * You should usually call [Builder.annually] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /** The configured forever spend limit (in cents) on the Card. */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /**
             * Sets [Builder.forever] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forever] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /** The configured monthly spend limit (in cents) on the Card. */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * Sets [Builder.monthly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthly] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

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
             * Returns an immutable instance of [SpendLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SpendLimit =
                SpendLimit(annually, forever, monthly, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SpendLimit = apply {
            if (validated) {
                return@apply
            }

            annually()
            forever()
            monthly()
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
            (if (annually.asKnown().isPresent) 1 else 0) +
                (if (forever.asKnown().isPresent) 1 else 0) +
                (if (monthly.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendLimit &&
                annually == other.annually &&
                forever == other.forever &&
                monthly == other.monthly &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(annually, forever, monthly, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendLimit{annually=$annually, forever=$forever, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    class SpendVelocity
    private constructor(
        private val annually: JsonField<Long>,
        private val forever: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("annually") @ExcludeMissing annually: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("forever") @ExcludeMissing forever: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly") @ExcludeMissing monthly: JsonField<Long> = JsonMissing.of(),
        ) : this(annually, forever, monthly, mutableMapOf())

        /**
         * Current annual spend velocity (in cents) on the Card. Present if annual spend limit is
         * set.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun annually(): Optional<Long> = annually.getOptional("annually")

        /**
         * Current forever spend velocity (in cents) on the Card. Present if forever spend limit is
         * set.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forever(): Optional<Long> = forever.getOptional("forever")

        /**
         * Current monthly spend velocity (in cents) on the Card. Present if monthly spend limit is
         * set.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthly(): Optional<Long> = monthly.getOptional("monthly")

        /**
         * Returns the raw JSON value of [annually].
         *
         * Unlike [annually], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("annually") @ExcludeMissing fun _annually(): JsonField<Long> = annually

        /**
         * Returns the raw JSON value of [forever].
         *
         * Unlike [forever], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("forever") @ExcludeMissing fun _forever(): JsonField<Long> = forever

        /**
         * Returns the raw JSON value of [monthly].
         *
         * Unlike [monthly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

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

            /** Returns a mutable builder for constructing an instance of [SpendVelocity]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpendVelocity]. */
        class Builder internal constructor() {

            private var annually: JsonField<Long> = JsonMissing.of()
            private var forever: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendVelocity: SpendVelocity) = apply {
                annually = spendVelocity.annually
                forever = spendVelocity.forever
                monthly = spendVelocity.monthly
                additionalProperties = spendVelocity.additionalProperties.toMutableMap()
            }

            /**
             * Current annual spend velocity (in cents) on the Card. Present if annual spend limit
             * is set.
             */
            fun annually(annually: Long) = annually(JsonField.of(annually))

            /**
             * Sets [Builder.annually] to an arbitrary JSON value.
             *
             * You should usually call [Builder.annually] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun annually(annually: JsonField<Long>) = apply { this.annually = annually }

            /**
             * Current forever spend velocity (in cents) on the Card. Present if forever spend limit
             * is set.
             */
            fun forever(forever: Long) = forever(JsonField.of(forever))

            /**
             * Sets [Builder.forever] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forever] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forever(forever: JsonField<Long>) = apply { this.forever = forever }

            /**
             * Current monthly spend velocity (in cents) on the Card. Present if monthly spend limit
             * is set.
             */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * Sets [Builder.monthly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthly] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

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
             * Returns an immutable instance of [SpendVelocity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SpendVelocity =
                SpendVelocity(annually, forever, monthly, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SpendVelocity = apply {
            if (validated) {
                return@apply
            }

            annually()
            forever()
            monthly()
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
            (if (annually.asKnown().isPresent) 1 else 0) +
                (if (forever.asKnown().isPresent) 1 else 0) +
                (if (monthly.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendVelocity &&
                annually == other.annually &&
                forever == other.forever &&
                monthly == other.monthly &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(annually, forever, monthly, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendVelocity{annually=$annually, forever=$forever, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardSpendLimits &&
            availableSpendLimit == other.availableSpendLimit &&
            spendLimit == other.spendLimit &&
            spendVelocity == other.spendVelocity &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(availableSpendLimit, spendLimit, spendVelocity, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardSpendLimits{availableSpendLimit=$availableSpendLimit, spendLimit=$spendLimit, spendVelocity=$spendVelocity, additionalProperties=$additionalProperties}"
}
