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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Parameters for defining a TypeScript code rule */
class TypescriptCodeParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<String>,
    private val features: JsonField<List<RuleFeature>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("features")
        @ExcludeMissing
        features: JsonField<List<RuleFeature>> = JsonMissing.of(),
    ) : this(code, features, mutableMapOf())

    /**
     * The TypeScript source code of the rule. Must define a `rule()` function that accepts the
     * declared features as positional arguments (in the same order as the `features` array) and
     * returns an array of actions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * Features available to the TypeScript code at evaluation time
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun features(): List<RuleFeature> = features.getRequired("features")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("features")
    @ExcludeMissing
    fun _features(): JsonField<List<RuleFeature>> = features

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
         * Returns a mutable builder for constructing an instance of [TypescriptCodeParameters].
         *
         * The following fields are required:
         * ```java
         * .code()
         * .features()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TypescriptCodeParameters]. */
    class Builder internal constructor() {

        private var code: JsonField<String>? = null
        private var features: JsonField<MutableList<RuleFeature>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(typescriptCodeParameters: TypescriptCodeParameters) = apply {
            code = typescriptCodeParameters.code
            features = typescriptCodeParameters.features.map { it.toMutableList() }
            additionalProperties = typescriptCodeParameters.additionalProperties.toMutableMap()
        }

        /**
         * The TypeScript source code of the rule. Must define a `rule()` function that accepts the
         * declared features as positional arguments (in the same order as the `features` array) and
         * returns an array of actions.
         */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Features available to the TypeScript code at evaluation time */
        fun features(features: List<RuleFeature>) = features(JsonField.of(features))

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed `List<RuleFeature>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun features(features: JsonField<List<RuleFeature>>) = apply {
            this.features = features.map { it.toMutableList() }
        }

        /**
         * Adds a single [RuleFeature] to [features].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeature(feature: RuleFeature) = apply {
            features =
                (features ?: JsonField.of(mutableListOf())).also {
                    checkKnown("features", it).add(feature)
                }
        }

        /** Alias for calling [addFeature] with `RuleFeature.ofAuthorization(authorization)`. */
        fun addFeature(authorization: RuleFeature.AuthorizationFeature) =
            addFeature(RuleFeature.ofAuthorization(authorization))

        /** Alias for calling [addFeature] with `RuleFeature.ofAuthentication(authentication)`. */
        fun addFeature(authentication: RuleFeature.AuthenticationFeature) =
            addFeature(RuleFeature.ofAuthentication(authentication))

        /** Alias for calling [addFeature] with `RuleFeature.ofTokenization(tokenization)`. */
        fun addFeature(tokenization: RuleFeature.TokenizationFeature) =
            addFeature(RuleFeature.ofTokenization(tokenization))

        /** Alias for calling [addFeature] with `RuleFeature.ofAchReceipt(achReceipt)`. */
        fun addFeature(achReceipt: RuleFeature.AchReceiptFeature) =
            addFeature(RuleFeature.ofAchReceipt(achReceipt))

        /** Alias for calling [addFeature] with `RuleFeature.ofCard(card)`. */
        fun addFeature(card: RuleFeature.CardFeature) = addFeature(RuleFeature.ofCard(card))

        /** Alias for calling [addFeature] with `RuleFeature.ofAccountHolder(accountHolder)`. */
        fun addFeature(accountHolder: RuleFeature.AccountHolderFeature) =
            addFeature(RuleFeature.ofAccountHolder(accountHolder))

        /** Alias for calling [addFeature] with `RuleFeature.ofIpMetadata(ipMetadata)`. */
        fun addFeature(ipMetadata: RuleFeature.IpMetadataFeature) =
            addFeature(RuleFeature.ofIpMetadata(ipMetadata))

        /** Alias for calling [addFeature] with `RuleFeature.ofSpendVelocity(spendVelocity)`. */
        fun addFeature(spendVelocity: RuleFeature.SpendVelocityFeature) =
            addFeature(RuleFeature.ofSpendVelocity(spendVelocity))

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
         * Returns an immutable instance of [TypescriptCodeParameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .code()
         * .features()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TypescriptCodeParameters =
            TypescriptCodeParameters(
                checkRequired("code", code),
                checkRequired("features", features).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TypescriptCodeParameters = apply {
        if (validated) {
            return@apply
        }

        code()
        features().forEach { it.validate() }
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
        (if (code.asKnown().isPresent) 1 else 0) +
            (features.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TypescriptCodeParameters &&
            code == other.code &&
            features == other.features &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, features, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TypescriptCodeParameters{code=$code, features=$features, additionalProperties=$additionalProperties}"
}
