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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Configuration for building loan tapes */
class LoanTapeRebuildConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rebuildNeeded: JsonField<Boolean>,
    private val lastRebuild: JsonField<LocalDate>,
    private val rebuildFrom: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rebuild_needed")
        @ExcludeMissing
        rebuildNeeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_rebuild")
        @ExcludeMissing
        lastRebuild: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("rebuild_from")
        @ExcludeMissing
        rebuildFrom: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(rebuildNeeded, lastRebuild, rebuildFrom, mutableMapOf())

    /**
     * Whether the account's loan tapes need to be rebuilt or not
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rebuildNeeded(): Boolean = rebuildNeeded.getRequired("rebuild_needed")

    /**
     * The date for which the account's loan tapes were last rebuilt
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRebuild(): Optional<LocalDate> = lastRebuild.getOptional("last_rebuild")

    /**
     * Date from which to start rebuilding from if the account requires a rebuild
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rebuildFrom(): Optional<LocalDate> = rebuildFrom.getOptional("rebuild_from")

    /**
     * Returns the raw JSON value of [rebuildNeeded].
     *
     * Unlike [rebuildNeeded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rebuild_needed")
    @ExcludeMissing
    fun _rebuildNeeded(): JsonField<Boolean> = rebuildNeeded

    /**
     * Returns the raw JSON value of [lastRebuild].
     *
     * Unlike [lastRebuild], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_rebuild")
    @ExcludeMissing
    fun _lastRebuild(): JsonField<LocalDate> = lastRebuild

    /**
     * Returns the raw JSON value of [rebuildFrom].
     *
     * Unlike [rebuildFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rebuild_from")
    @ExcludeMissing
    fun _rebuildFrom(): JsonField<LocalDate> = rebuildFrom

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
         * Returns a mutable builder for constructing an instance of [LoanTapeRebuildConfiguration].
         *
         * The following fields are required:
         * ```java
         * .rebuildNeeded()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LoanTapeRebuildConfiguration]. */
    class Builder internal constructor() {

        private var rebuildNeeded: JsonField<Boolean>? = null
        private var lastRebuild: JsonField<LocalDate> = JsonMissing.of()
        private var rebuildFrom: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(loanTapeRebuildConfiguration: LoanTapeRebuildConfiguration) = apply {
            rebuildNeeded = loanTapeRebuildConfiguration.rebuildNeeded
            lastRebuild = loanTapeRebuildConfiguration.lastRebuild
            rebuildFrom = loanTapeRebuildConfiguration.rebuildFrom
            additionalProperties = loanTapeRebuildConfiguration.additionalProperties.toMutableMap()
        }

        /** Whether the account's loan tapes need to be rebuilt or not */
        fun rebuildNeeded(rebuildNeeded: Boolean) = rebuildNeeded(JsonField.of(rebuildNeeded))

        /**
         * Sets [Builder.rebuildNeeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rebuildNeeded] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rebuildNeeded(rebuildNeeded: JsonField<Boolean>) = apply {
            this.rebuildNeeded = rebuildNeeded
        }

        /** The date for which the account's loan tapes were last rebuilt */
        fun lastRebuild(lastRebuild: LocalDate) = lastRebuild(JsonField.of(lastRebuild))

        /**
         * Sets [Builder.lastRebuild] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRebuild] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastRebuild(lastRebuild: JsonField<LocalDate>) = apply {
            this.lastRebuild = lastRebuild
        }

        /** Date from which to start rebuilding from if the account requires a rebuild */
        fun rebuildFrom(rebuildFrom: LocalDate) = rebuildFrom(JsonField.of(rebuildFrom))

        /**
         * Sets [Builder.rebuildFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rebuildFrom] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rebuildFrom(rebuildFrom: JsonField<LocalDate>) = apply {
            this.rebuildFrom = rebuildFrom
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
         * Returns an immutable instance of [LoanTapeRebuildConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .rebuildNeeded()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LoanTapeRebuildConfiguration =
            LoanTapeRebuildConfiguration(
                checkRequired("rebuildNeeded", rebuildNeeded),
                lastRebuild,
                rebuildFrom,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LoanTapeRebuildConfiguration = apply {
        if (validated) {
            return@apply
        }

        rebuildNeeded()
        lastRebuild()
        rebuildFrom()
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
        (if (rebuildNeeded.asKnown().isPresent) 1 else 0) +
            (if (lastRebuild.asKnown().isPresent) 1 else 0) +
            (if (rebuildFrom.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LoanTapeRebuildConfiguration &&
            rebuildNeeded == other.rebuildNeeded &&
            lastRebuild == other.lastRebuild &&
            rebuildFrom == other.rebuildFrom &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(rebuildNeeded, lastRebuild, rebuildFrom, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LoanTapeRebuildConfiguration{rebuildNeeded=$rebuildNeeded, lastRebuild=$lastRebuild, rebuildFrom=$rebuildFrom, additionalProperties=$additionalProperties}"
}
