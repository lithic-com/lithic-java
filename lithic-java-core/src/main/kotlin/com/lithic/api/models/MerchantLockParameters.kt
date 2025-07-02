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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MerchantLockParameters
private constructor(
    private val merchants: JsonField<List<Merchant>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("merchants")
        @ExcludeMissing
        merchants: JsonField<List<Merchant>> = JsonMissing.of()
    ) : this(merchants, mutableMapOf())

    /**
     * A list of merchant locks defining specific merchants or groups of merchants (based on
     * descriptors or IDs) that the lock applies to.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchants(): List<Merchant> = merchants.getRequired("merchants")

    /**
     * Returns the raw JSON value of [merchants].
     *
     * Unlike [merchants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchants")
    @ExcludeMissing
    fun _merchants(): JsonField<List<Merchant>> = merchants

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
         * Returns a mutable builder for constructing an instance of [MerchantLockParameters].
         *
         * The following fields are required:
         * ```java
         * .merchants()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MerchantLockParameters]. */
    class Builder internal constructor() {

        private var merchants: JsonField<MutableList<Merchant>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(merchantLockParameters: MerchantLockParameters) = apply {
            merchants = merchantLockParameters.merchants.map { it.toMutableList() }
            additionalProperties = merchantLockParameters.additionalProperties.toMutableMap()
        }

        /**
         * A list of merchant locks defining specific merchants or groups of merchants (based on
         * descriptors or IDs) that the lock applies to.
         */
        fun merchants(merchants: List<Merchant>) = merchants(JsonField.of(merchants))

        /**
         * Sets [Builder.merchants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchants] with a well-typed `List<Merchant>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchants(merchants: JsonField<List<Merchant>>) = apply {
            this.merchants = merchants.map { it.toMutableList() }
        }

        /**
         * Adds a single [Merchant] to [merchants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMerchant(merchant: Merchant) = apply {
            merchants =
                (merchants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("merchants", it).add(merchant)
                }
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
         * Returns an immutable instance of [MerchantLockParameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .merchants()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MerchantLockParameters =
            MerchantLockParameters(
                checkRequired("merchants", merchants).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MerchantLockParameters = apply {
        if (validated) {
            return@apply
        }

        merchants().forEach { it.validate() }
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
        (merchants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Represents a specific merchant lock based on their ID or descriptor. Each merchant object
     * allows transaction rules to work at a granular level and requires at least one of merchant_id
     * or descriptor.
     */
    class Merchant
    private constructor(
        private val comment: JsonField<String>,
        private val descriptor: JsonField<String>,
        private val merchantId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("descriptor")
            @ExcludeMissing
            descriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_id")
            @ExcludeMissing
            merchantId: JsonField<String> = JsonMissing.of(),
        ) : this(comment, descriptor, merchantId, mutableMapOf())

        /**
         * A comment or explanation about the merchant, used internally for rule management
         * purposes.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun comment(): Optional<String> = comment.getOptional("comment")

        /**
         * Short description of the merchant, often used to provide more human-readable context
         * about the transaction merchant. This is typically the name or label shown on transaction
         * summaries.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

        /**
         * Unique alphanumeric identifier for the payment card acceptor (merchant). This attribute
         * specifies the merchant entity that will be locked or referenced for authorization rules.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun merchantId(): Optional<String> = merchantId.getOptional("merchant_id")

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

        /**
         * Returns the raw JSON value of [descriptor].
         *
         * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /**
         * Returns the raw JSON value of [merchantId].
         *
         * Unlike [merchantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("merchant_id")
        @ExcludeMissing
        fun _merchantId(): JsonField<String> = merchantId

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

            /** Returns a mutable builder for constructing an instance of [Merchant]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Merchant]. */
        class Builder internal constructor() {

            private var comment: JsonField<String> = JsonMissing.of()
            private var descriptor: JsonField<String> = JsonMissing.of()
            private var merchantId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(merchant: Merchant) = apply {
                comment = merchant.comment
                descriptor = merchant.descriptor
                merchantId = merchant.merchantId
                additionalProperties = merchant.additionalProperties.toMutableMap()
            }

            /**
             * A comment or explanation about the merchant, used internally for rule management
             * purposes.
             */
            fun comment(comment: String) = comment(JsonField.of(comment))

            /**
             * Sets [Builder.comment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comment] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comment(comment: JsonField<String>) = apply { this.comment = comment }

            /**
             * Short description of the merchant, often used to provide more human-readable context
             * about the transaction merchant. This is typically the name or label shown on
             * transaction summaries.
             */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /**
             * Sets [Builder.descriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.descriptor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /**
             * Unique alphanumeric identifier for the payment card acceptor (merchant). This
             * attribute specifies the merchant entity that will be locked or referenced for
             * authorization rules.
             */
            fun merchantId(merchantId: String) = merchantId(JsonField.of(merchantId))

            /**
             * Sets [Builder.merchantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantId(merchantId: JsonField<String>) = apply { this.merchantId = merchantId }

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
             * Returns an immutable instance of [Merchant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Merchant =
                Merchant(comment, descriptor, merchantId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Merchant = apply {
            if (validated) {
                return@apply
            }

            comment()
            descriptor()
            merchantId()
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
            (if (comment.asKnown().isPresent) 1 else 0) +
                (if (descriptor.asKnown().isPresent) 1 else 0) +
                (if (merchantId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && comment == other.comment && descriptor == other.descriptor && merchantId == other.merchantId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(comment, descriptor, merchantId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Merchant{comment=$comment, descriptor=$descriptor, merchantId=$merchantId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MerchantLockParameters && merchants == other.merchants && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(merchants, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MerchantLockParameters{merchants=$merchants, additionalProperties=$additionalProperties}"
}
