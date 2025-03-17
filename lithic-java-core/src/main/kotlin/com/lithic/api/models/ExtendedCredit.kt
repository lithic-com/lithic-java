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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@NoAutoDetect
class ExtendedCredit
@JsonCreator
private constructor(
    @JsonProperty("credit_extended")
    @ExcludeMissing
    private val creditExtended: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditExtended(): Long = creditExtended.getRequired("credit_extended")

    /**
     * Returns the raw JSON value of [creditExtended].
     *
     * Unlike [creditExtended], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_extended")
    @ExcludeMissing
    fun _creditExtended(): JsonField<Long> = creditExtended

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExtendedCredit = apply {
        if (validated) {
            return@apply
        }

        creditExtended()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExtendedCredit].
         *
         * The following fields are required:
         * ```java
         * .creditExtended()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtendedCredit]. */
    class Builder internal constructor() {

        private var creditExtended: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extendedCredit: ExtendedCredit) = apply {
            creditExtended = extendedCredit.creditExtended
            additionalProperties = extendedCredit.additionalProperties.toMutableMap()
        }

        fun creditExtended(creditExtended: Long) = creditExtended(JsonField.of(creditExtended))

        /**
         * Sets [Builder.creditExtended] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditExtended] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditExtended(creditExtended: JsonField<Long>) = apply {
            this.creditExtended = creditExtended
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
         * Returns an immutable instance of [ExtendedCredit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .creditExtended()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtendedCredit =
            ExtendedCredit(
                checkRequired("creditExtended", creditExtended),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExtendedCredit && creditExtended == other.creditExtended && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(creditExtended, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtendedCredit{creditExtended=$creditExtended, additionalProperties=$additionalProperties}"
}
