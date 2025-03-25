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

class AccountSpendLimits
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
    fun spendLimit(): Optional<SpendLimit> =
        Optional.ofNullable(spendLimit.getNullable("spend_limit"))

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendVelocity(): Optional<SpendVelocity> =
        Optional.ofNullable(spendVelocity.getNullable("spend_velocity"))

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
         * Returns a mutable builder for constructing an instance of [AccountSpendLimits].
         *
         * The following fields are required:
         * ```java
         * .availableSpendLimit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountSpendLimits]. */
    class Builder internal constructor() {

        private var availableSpendLimit: JsonField<AvailableSpendLimit>? = null
        private var spendLimit: JsonField<SpendLimit> = JsonMissing.of()
        private var spendVelocity: JsonField<SpendVelocity> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountSpendLimits: AccountSpendLimits) = apply {
            availableSpendLimit = accountSpendLimits.availableSpendLimit
            spendLimit = accountSpendLimits.spendLimit
            spendVelocity = accountSpendLimits.spendVelocity
            additionalProperties = accountSpendLimits.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AccountSpendLimits].
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
        fun build(): AccountSpendLimits =
            AccountSpendLimits(
                checkRequired("availableSpendLimit", availableSpendLimit),
                spendLimit,
                spendVelocity,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountSpendLimits = apply {
        if (validated) {
            return@apply
        }

        availableSpendLimit().validate()
        spendLimit().ifPresent { it.validate() }
        spendVelocity().ifPresent { it.validate() }
        validated = true
    }

    class AvailableSpendLimit
    private constructor(
        private val daily: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("daily") @ExcludeMissing daily: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lifetime") @ExcludeMissing lifetime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly") @ExcludeMissing monthly: JsonField<Long> = JsonMissing.of(),
        ) : this(daily, lifetime, monthly, mutableMapOf())

        /**
         * The available spend limit (in cents) relative to the daily limit configured on the
         * Account (e.g. 100000 would be a $1,000 limit).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun daily(): Optional<Long> = Optional.ofNullable(daily.getNullable("daily"))

        /**
         * The available spend limit (in cents) relative to the lifetime limit configured on the
         * Account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lifetime(): Optional<Long> = Optional.ofNullable(lifetime.getNullable("lifetime"))

        /**
         * The available spend limit (in cents) relative to the monthly limit configured on the
         * Account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /**
         * Returns the raw JSON value of [daily].
         *
         * Unlike [daily], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("daily") @ExcludeMissing fun _daily(): JsonField<Long> = daily

        /**
         * Returns the raw JSON value of [lifetime].
         *
         * Unlike [lifetime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime(): JsonField<Long> = lifetime

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

            private var daily: JsonField<Long> = JsonMissing.of()
            private var lifetime: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(availableSpendLimit: AvailableSpendLimit) = apply {
                daily = availableSpendLimit.daily
                lifetime = availableSpendLimit.lifetime
                monthly = availableSpendLimit.monthly
                additionalProperties = availableSpendLimit.additionalProperties.toMutableMap()
            }

            /**
             * The available spend limit (in cents) relative to the daily limit configured on the
             * Account (e.g. 100000 would be a $1,000 limit).
             */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /**
             * Sets [Builder.daily] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daily] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /**
             * The available spend limit (in cents) relative to the lifetime limit configured on the
             * Account.
             */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * Sets [Builder.lifetime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /**
             * The available spend limit (in cents) relative to the monthly limit configured on the
             * Account.
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
                AvailableSpendLimit(daily, lifetime, monthly, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AvailableSpendLimit = apply {
            if (validated) {
                return@apply
            }

            daily()
            lifetime()
            monthly()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AvailableSpendLimit && daily == other.daily && lifetime == other.lifetime && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(daily, lifetime, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableSpendLimit{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    class SpendLimit
    private constructor(
        private val daily: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("daily") @ExcludeMissing daily: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lifetime") @ExcludeMissing lifetime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly") @ExcludeMissing monthly: JsonField<Long> = JsonMissing.of(),
        ) : this(daily, lifetime, monthly, mutableMapOf())

        /**
         * The configured daily spend limit (in cents) on the Account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun daily(): Optional<Long> = Optional.ofNullable(daily.getNullable("daily"))

        /**
         * The configured lifetime spend limit (in cents) on the Account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lifetime(): Optional<Long> = Optional.ofNullable(lifetime.getNullable("lifetime"))

        /**
         * The configured monthly spend limit (in cents) on the Account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /**
         * Returns the raw JSON value of [daily].
         *
         * Unlike [daily], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("daily") @ExcludeMissing fun _daily(): JsonField<Long> = daily

        /**
         * Returns the raw JSON value of [lifetime].
         *
         * Unlike [lifetime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime(): JsonField<Long> = lifetime

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

            private var daily: JsonField<Long> = JsonMissing.of()
            private var lifetime: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendLimit: SpendLimit) = apply {
                daily = spendLimit.daily
                lifetime = spendLimit.lifetime
                monthly = spendLimit.monthly
                additionalProperties = spendLimit.additionalProperties.toMutableMap()
            }

            /** The configured daily spend limit (in cents) on the Account. */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /**
             * Sets [Builder.daily] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daily] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /** The configured lifetime spend limit (in cents) on the Account. */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * Sets [Builder.lifetime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /** The configured monthly spend limit (in cents) on the Account. */
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
                SpendLimit(daily, lifetime, monthly, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SpendLimit = apply {
            if (validated) {
                return@apply
            }

            daily()
            lifetime()
            monthly()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpendLimit && daily == other.daily && lifetime == other.lifetime && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(daily, lifetime, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendLimit{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    class SpendVelocity
    private constructor(
        private val daily: JsonField<Long>,
        private val lifetime: JsonField<Long>,
        private val monthly: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("daily") @ExcludeMissing daily: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lifetime") @ExcludeMissing lifetime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthly") @ExcludeMissing monthly: JsonField<Long> = JsonMissing.of(),
        ) : this(daily, lifetime, monthly, mutableMapOf())

        /**
         * Current daily spend velocity (in cents) on the Account. Present if daily spend limit is
         * set.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun daily(): Optional<Long> = Optional.ofNullable(daily.getNullable("daily"))

        /**
         * Current lifetime spend velocity (in cents) on the Account. Present if lifetime spend
         * limit is set.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lifetime(): Optional<Long> = Optional.ofNullable(lifetime.getNullable("lifetime"))

        /**
         * Current monthly spend velocity (in cents) on the Account. Present if monthly spend limit
         * is set.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthly(): Optional<Long> = Optional.ofNullable(monthly.getNullable("monthly"))

        /**
         * Returns the raw JSON value of [daily].
         *
         * Unlike [daily], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("daily") @ExcludeMissing fun _daily(): JsonField<Long> = daily

        /**
         * Returns the raw JSON value of [lifetime].
         *
         * Unlike [lifetime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime(): JsonField<Long> = lifetime

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

            private var daily: JsonField<Long> = JsonMissing.of()
            private var lifetime: JsonField<Long> = JsonMissing.of()
            private var monthly: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendVelocity: SpendVelocity) = apply {
                daily = spendVelocity.daily
                lifetime = spendVelocity.lifetime
                monthly = spendVelocity.monthly
                additionalProperties = spendVelocity.additionalProperties.toMutableMap()
            }

            /**
             * Current daily spend velocity (in cents) on the Account. Present if daily spend limit
             * is set.
             */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /**
             * Sets [Builder.daily] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daily] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /**
             * Current lifetime spend velocity (in cents) on the Account. Present if lifetime spend
             * limit is set.
             */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * Sets [Builder.lifetime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /**
             * Current monthly spend velocity (in cents) on the Account. Present if monthly spend
             * limit is set.
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
                SpendVelocity(daily, lifetime, monthly, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SpendVelocity = apply {
            if (validated) {
                return@apply
            }

            daily()
            lifetime()
            monthly()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpendVelocity && daily == other.daily && lifetime == other.lifetime && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(daily, lifetime, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendVelocity{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountSpendLimits && availableSpendLimit == other.availableSpendLimit && spendLimit == other.spendLimit && spendVelocity == other.spendVelocity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableSpendLimit, spendLimit, spendVelocity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountSpendLimits{availableSpendLimit=$availableSpendLimit, spendLimit=$spendLimit, spendVelocity=$spendVelocity, additionalProperties=$additionalProperties}"
}
