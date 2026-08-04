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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SpendVelocityFilters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val excludeCountries: JsonField<List<String>>,
    private val excludeMccs: JsonField<List<String>>,
    private val includeCountries: JsonField<List<String>>,
    private val includeMccs: JsonField<List<String>>,
    private val includePanEntryModes: JsonField<List<VelocityLimitFilters.IncludePanEntryMode>>,
    private val excludeTags: JsonField<ExcludeTags>,
    private val includeTags: JsonField<IncludeTags>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("exclude_countries")
        @ExcludeMissing
        excludeCountries: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("exclude_mccs")
        @ExcludeMissing
        excludeMccs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("include_countries")
        @ExcludeMissing
        includeCountries: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("include_mccs")
        @ExcludeMissing
        includeMccs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("include_pan_entry_modes")
        @ExcludeMissing
        includePanEntryModes: JsonField<List<VelocityLimitFilters.IncludePanEntryMode>> =
            JsonMissing.of(),
        @JsonProperty("exclude_tags")
        @ExcludeMissing
        excludeTags: JsonField<ExcludeTags> = JsonMissing.of(),
        @JsonProperty("include_tags")
        @ExcludeMissing
        includeTags: JsonField<IncludeTags> = JsonMissing.of(),
    ) : this(
        excludeCountries,
        excludeMccs,
        includeCountries,
        includeMccs,
        includePanEntryModes,
        excludeTags,
        includeTags,
        mutableMapOf(),
    )

    fun toVelocityLimitFilters(): VelocityLimitFilters =
        VelocityLimitFilters.builder()
            .excludeCountries(excludeCountries)
            .excludeMccs(excludeMccs)
            .includeCountries(includeCountries)
            .includeMccs(includeMccs)
            .includePanEntryModes(includePanEntryModes)
            .build()

    /**
     * ISO-3166-1 alpha-3 Country Codes to exclude from the velocity calculation. Transactions
     * matching any of the provided will be excluded from the calculated velocity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeCountries(): Optional<List<String>> =
        excludeCountries.getOptional("exclude_countries")

    /**
     * Merchant Category Codes to exclude from the velocity calculation. Transactions matching this
     * MCC will be excluded from the calculated velocity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeMccs(): Optional<List<String>> = excludeMccs.getOptional("exclude_mccs")

    /**
     * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions not
     * matching any of the provided will not be included in the calculated velocity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeCountries(): Optional<List<String>> =
        includeCountries.getOptional("include_countries")

    /**
     * Merchant Category Codes to include in the velocity calculation. Transactions not matching
     * this MCC will not be included in the calculated velocity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeMccs(): Optional<List<String>> = includeMccs.getOptional("include_mccs")

    /**
     * PAN entry modes to include in the velocity calculation. Transactions not matching any of the
     * provided will not be included in the calculated velocity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includePanEntryModes(): Optional<List<VelocityLimitFilters.IncludePanEntryMode>> =
        includePanEntryModes.getOptional("include_pan_entry_modes")

    /**
     * Tag key-value pairs to exclude from the velocity calculation. Transactions matching all
     * specified tag key-value pairs will be excluded from the calculated velocity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeTags(): Optional<ExcludeTags> = excludeTags.getOptional("exclude_tags")

    /**
     * Tag key-value pairs to include in the velocity calculation. Only transactions matching all
     * specified tag key-value pairs will be included in the calculated velocity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeTags(): Optional<IncludeTags> = includeTags.getOptional("include_tags")

    /**
     * Returns the raw JSON value of [excludeCountries].
     *
     * Unlike [excludeCountries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("exclude_countries")
    @ExcludeMissing
    fun _excludeCountries(): JsonField<List<String>> = excludeCountries

    /**
     * Returns the raw JSON value of [excludeMccs].
     *
     * Unlike [excludeMccs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exclude_mccs")
    @ExcludeMissing
    fun _excludeMccs(): JsonField<List<String>> = excludeMccs

    /**
     * Returns the raw JSON value of [includeCountries].
     *
     * Unlike [includeCountries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_countries")
    @ExcludeMissing
    fun _includeCountries(): JsonField<List<String>> = includeCountries

    /**
     * Returns the raw JSON value of [includeMccs].
     *
     * Unlike [includeMccs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("include_mccs")
    @ExcludeMissing
    fun _includeMccs(): JsonField<List<String>> = includeMccs

    /**
     * Returns the raw JSON value of [includePanEntryModes].
     *
     * Unlike [includePanEntryModes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_pan_entry_modes")
    @ExcludeMissing
    fun _includePanEntryModes(): JsonField<List<VelocityLimitFilters.IncludePanEntryMode>> =
        includePanEntryModes

    /**
     * Returns the raw JSON value of [excludeTags].
     *
     * Unlike [excludeTags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exclude_tags")
    @ExcludeMissing
    fun _excludeTags(): JsonField<ExcludeTags> = excludeTags

    /**
     * Returns the raw JSON value of [includeTags].
     *
     * Unlike [includeTags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("include_tags")
    @ExcludeMissing
    fun _includeTags(): JsonField<IncludeTags> = includeTags

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

        /** Returns a mutable builder for constructing an instance of [SpendVelocityFilters]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendVelocityFilters]. */
    class Builder internal constructor() {

        private var excludeCountries: JsonField<MutableList<String>>? = null
        private var excludeMccs: JsonField<MutableList<String>>? = null
        private var includeCountries: JsonField<MutableList<String>>? = null
        private var includeMccs: JsonField<MutableList<String>>? = null
        private var includePanEntryModes:
            JsonField<MutableList<VelocityLimitFilters.IncludePanEntryMode>>? =
            null
        private var excludeTags: JsonField<ExcludeTags> = JsonMissing.of()
        private var includeTags: JsonField<IncludeTags> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spendVelocityFilters: SpendVelocityFilters) = apply {
            excludeCountries = spendVelocityFilters.excludeCountries.map { it.toMutableList() }
            excludeMccs = spendVelocityFilters.excludeMccs.map { it.toMutableList() }
            includeCountries = spendVelocityFilters.includeCountries.map { it.toMutableList() }
            includeMccs = spendVelocityFilters.includeMccs.map { it.toMutableList() }
            includePanEntryModes =
                spendVelocityFilters.includePanEntryModes.map { it.toMutableList() }
            excludeTags = spendVelocityFilters.excludeTags
            includeTags = spendVelocityFilters.includeTags
            additionalProperties = spendVelocityFilters.additionalProperties.toMutableMap()
        }

        /**
         * ISO-3166-1 alpha-3 Country Codes to exclude from the velocity calculation. Transactions
         * matching any of the provided will be excluded from the calculated velocity.
         */
        fun excludeCountries(excludeCountries: List<String>?) =
            excludeCountries(JsonField.ofNullable(excludeCountries))

        /** Alias for calling [Builder.excludeCountries] with `excludeCountries.orElse(null)`. */
        fun excludeCountries(excludeCountries: Optional<List<String>>) =
            excludeCountries(excludeCountries.getOrNull())

        /**
         * Sets [Builder.excludeCountries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeCountries] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeCountries(excludeCountries: JsonField<List<String>>) = apply {
            this.excludeCountries = excludeCountries.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludeCountries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludeCountry(excludeCountry: String) = apply {
            excludeCountries =
                (excludeCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludeCountries", it).add(excludeCountry)
                }
        }

        /**
         * Merchant Category Codes to exclude from the velocity calculation. Transactions matching
         * this MCC will be excluded from the calculated velocity.
         */
        fun excludeMccs(excludeMccs: List<String>?) = excludeMccs(JsonField.ofNullable(excludeMccs))

        /** Alias for calling [Builder.excludeMccs] with `excludeMccs.orElse(null)`. */
        fun excludeMccs(excludeMccs: Optional<List<String>>) = excludeMccs(excludeMccs.getOrNull())

        /**
         * Sets [Builder.excludeMccs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeMccs] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeMccs(excludeMccs: JsonField<List<String>>) = apply {
            this.excludeMccs = excludeMccs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludeMccs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludeMcc(excludeMcc: String) = apply {
            excludeMccs =
                (excludeMccs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludeMccs", it).add(excludeMcc)
                }
        }

        /**
         * ISO-3166-1 alpha-3 Country Codes to include in the velocity calculation. Transactions not
         * matching any of the provided will not be included in the calculated velocity.
         */
        fun includeCountries(includeCountries: List<String>?) =
            includeCountries(JsonField.ofNullable(includeCountries))

        /** Alias for calling [Builder.includeCountries] with `includeCountries.orElse(null)`. */
        fun includeCountries(includeCountries: Optional<List<String>>) =
            includeCountries(includeCountries.getOrNull())

        /**
         * Sets [Builder.includeCountries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeCountries] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeCountries(includeCountries: JsonField<List<String>>) = apply {
            this.includeCountries = includeCountries.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [includeCountries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludeCountry(includeCountry: String) = apply {
            includeCountries =
                (includeCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("includeCountries", it).add(includeCountry)
                }
        }

        /**
         * Merchant Category Codes to include in the velocity calculation. Transactions not matching
         * this MCC will not be included in the calculated velocity.
         */
        fun includeMccs(includeMccs: List<String>?) = includeMccs(JsonField.ofNullable(includeMccs))

        /** Alias for calling [Builder.includeMccs] with `includeMccs.orElse(null)`. */
        fun includeMccs(includeMccs: Optional<List<String>>) = includeMccs(includeMccs.getOrNull())

        /**
         * Sets [Builder.includeMccs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeMccs] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeMccs(includeMccs: JsonField<List<String>>) = apply {
            this.includeMccs = includeMccs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [includeMccs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludeMcc(includeMcc: String) = apply {
            includeMccs =
                (includeMccs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("includeMccs", it).add(includeMcc)
                }
        }

        /**
         * PAN entry modes to include in the velocity calculation. Transactions not matching any of
         * the provided will not be included in the calculated velocity.
         */
        fun includePanEntryModes(
            includePanEntryModes: List<VelocityLimitFilters.IncludePanEntryMode>?
        ) = includePanEntryModes(JsonField.ofNullable(includePanEntryModes))

        /**
         * Alias for calling [Builder.includePanEntryModes] with
         * `includePanEntryModes.orElse(null)`.
         */
        fun includePanEntryModes(
            includePanEntryModes: Optional<List<VelocityLimitFilters.IncludePanEntryMode>>
        ) = includePanEntryModes(includePanEntryModes.getOrNull())

        /**
         * Sets [Builder.includePanEntryModes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includePanEntryModes] with a well-typed
         * `List<VelocityLimitFilters.IncludePanEntryMode>` value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun includePanEntryModes(
            includePanEntryModes: JsonField<List<VelocityLimitFilters.IncludePanEntryMode>>
        ) = apply { this.includePanEntryModes = includePanEntryModes.map { it.toMutableList() } }

        /**
         * Adds a single [VelocityLimitFilters.IncludePanEntryMode] to [includePanEntryModes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludePanEntryMode(includePanEntryMode: VelocityLimitFilters.IncludePanEntryMode) =
            apply {
                includePanEntryModes =
                    (includePanEntryModes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("includePanEntryModes", it).add(includePanEntryMode)
                    }
            }

        /**
         * Tag key-value pairs to exclude from the velocity calculation. Transactions matching all
         * specified tag key-value pairs will be excluded from the calculated velocity.
         */
        fun excludeTags(excludeTags: ExcludeTags?) = excludeTags(JsonField.ofNullable(excludeTags))

        /** Alias for calling [Builder.excludeTags] with `excludeTags.orElse(null)`. */
        fun excludeTags(excludeTags: Optional<ExcludeTags>) = excludeTags(excludeTags.getOrNull())

        /**
         * Sets [Builder.excludeTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeTags] with a well-typed [ExcludeTags] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeTags(excludeTags: JsonField<ExcludeTags>) = apply {
            this.excludeTags = excludeTags
        }

        /**
         * Tag key-value pairs to include in the velocity calculation. Only transactions matching
         * all specified tag key-value pairs will be included in the calculated velocity.
         */
        fun includeTags(includeTags: IncludeTags?) = includeTags(JsonField.ofNullable(includeTags))

        /** Alias for calling [Builder.includeTags] with `includeTags.orElse(null)`. */
        fun includeTags(includeTags: Optional<IncludeTags>) = includeTags(includeTags.getOrNull())

        /**
         * Sets [Builder.includeTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeTags] with a well-typed [IncludeTags] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeTags(includeTags: JsonField<IncludeTags>) = apply {
            this.includeTags = includeTags
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
         * Returns an immutable instance of [SpendVelocityFilters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SpendVelocityFilters =
            SpendVelocityFilters(
                (excludeCountries ?: JsonMissing.of()).map { it.toImmutable() },
                (excludeMccs ?: JsonMissing.of()).map { it.toImmutable() },
                (includeCountries ?: JsonMissing.of()).map { it.toImmutable() },
                (includeMccs ?: JsonMissing.of()).map { it.toImmutable() },
                (includePanEntryModes ?: JsonMissing.of()).map { it.toImmutable() },
                excludeTags,
                includeTags,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SpendVelocityFilters = apply {
        if (validated) {
            return@apply
        }

        excludeCountries()
        excludeMccs()
        includeCountries()
        includeMccs()
        includePanEntryModes().ifPresent { it.forEach { it.validate() } }
        excludeTags().ifPresent { it.validate() }
        includeTags().ifPresent { it.validate() }
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
        (excludeCountries.asKnown().getOrNull()?.size ?: 0) +
            (excludeMccs.asKnown().getOrNull()?.size ?: 0) +
            (includeCountries.asKnown().getOrNull()?.size ?: 0) +
            (includeMccs.asKnown().getOrNull()?.size ?: 0) +
            (includePanEntryModes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (excludeTags.asKnown().getOrNull()?.validity() ?: 0) +
            (includeTags.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Tag key-value pairs to exclude from the velocity calculation. Transactions matching all
     * specified tag key-value pairs will be excluded from the calculated velocity.
     */
    class ExcludeTags
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ExcludeTags]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExcludeTags]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(excludeTags: ExcludeTags) = apply {
                additionalProperties = excludeTags.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExcludeTags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExcludeTags = ExcludeTags(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ExcludeTags = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExcludeTags && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExcludeTags{additionalProperties=$additionalProperties}"
    }

    /**
     * Tag key-value pairs to include in the velocity calculation. Only transactions matching all
     * specified tag key-value pairs will be included in the calculated velocity.
     */
    class IncludeTags
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [IncludeTags]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IncludeTags]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(includeTags: IncludeTags) = apply {
                additionalProperties = includeTags.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [IncludeTags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IncludeTags = IncludeTags(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IncludeTags = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IncludeTags && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "IncludeTags{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendVelocityFilters &&
            excludeCountries == other.excludeCountries &&
            excludeMccs == other.excludeMccs &&
            includeCountries == other.includeCountries &&
            includeMccs == other.includeMccs &&
            includePanEntryModes == other.includePanEntryModes &&
            excludeTags == other.excludeTags &&
            includeTags == other.includeTags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            excludeCountries,
            excludeMccs,
            includeCountries,
            includeMccs,
            includePanEntryModes,
            excludeTags,
            includeTags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendVelocityFilters{excludeCountries=$excludeCountries, excludeMccs=$excludeMccs, includeCountries=$includeCountries, includeMccs=$includeMccs, includePanEntryModes=$includePanEntryModes, excludeTags=$excludeTags, includeTags=$includeTags, additionalProperties=$additionalProperties}"
}
