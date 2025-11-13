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

class CategoryBalances
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fees: JsonField<Long>,
    private val interest: JsonField<Long>,
    private val principal: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fees") @ExcludeMissing fees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interest") @ExcludeMissing interest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("principal") @ExcludeMissing principal: JsonField<Long> = JsonMissing.of(),
    ) : this(fees, interest, principal, mutableMapOf())

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fees(): Long = fees.getRequired("fees")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interest(): Long = interest.getRequired("interest")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun principal(): Long = principal.getRequired("principal")

    /**
     * Returns the raw JSON value of [fees].
     *
     * Unlike [fees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Long> = fees

    /**
     * Returns the raw JSON value of [interest].
     *
     * Unlike [interest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest") @ExcludeMissing fun _interest(): JsonField<Long> = interest

    /**
     * Returns the raw JSON value of [principal].
     *
     * Unlike [principal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("principal") @ExcludeMissing fun _principal(): JsonField<Long> = principal

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
         * Returns a mutable builder for constructing an instance of [CategoryBalances].
         *
         * The following fields are required:
         * ```java
         * .fees()
         * .interest()
         * .principal()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CategoryBalances]. */
    class Builder internal constructor() {

        private var fees: JsonField<Long>? = null
        private var interest: JsonField<Long>? = null
        private var principal: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(categoryBalances: CategoryBalances) = apply {
            fees = categoryBalances.fees
            interest = categoryBalances.interest
            principal = categoryBalances.principal
            additionalProperties = categoryBalances.additionalProperties.toMutableMap()
        }

        fun fees(fees: Long) = fees(JsonField.of(fees))

        /**
         * Sets [Builder.fees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fees] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

        fun interest(interest: Long) = interest(JsonField.of(interest))

        /**
         * Sets [Builder.interest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interest] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

        fun principal(principal: Long) = principal(JsonField.of(principal))

        /**
         * Sets [Builder.principal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.principal] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun principal(principal: JsonField<Long>) = apply { this.principal = principal }

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
         * Returns an immutable instance of [CategoryBalances].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fees()
         * .interest()
         * .principal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CategoryBalances =
            CategoryBalances(
                checkRequired("fees", fees),
                checkRequired("interest", interest),
                checkRequired("principal", principal),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CategoryBalances = apply {
        if (validated) {
            return@apply
        }

        fees()
        interest()
        principal()
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
        (if (fees.asKnown().isPresent) 1 else 0) +
            (if (interest.asKnown().isPresent) 1 else 0) +
            (if (principal.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryBalances &&
            fees == other.fees &&
            interest == other.interest &&
            principal == other.principal &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fees, interest, principal, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CategoryBalances{fees=$fees, interest=$interest, principal=$principal, additionalProperties=$additionalProperties}"
}
