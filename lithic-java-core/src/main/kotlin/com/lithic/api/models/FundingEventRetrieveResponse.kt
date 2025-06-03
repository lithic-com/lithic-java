// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class FundingEventRetrieveResponse
private constructor(
    private val token: JsonField<String>,
    private val collectionResourceType: JsonField<CollectionResourceType>,
    private val collectionTokens: JsonField<List<String>>,
    private val created: JsonField<OffsetDateTime>,
    private val highWatermark: JsonField<OffsetDateTime>,
    private val networkSettlementSummary: JsonField<List<FundingEventSettlement>>,
    private val previousHighWatermark: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collection_resource_type")
        @ExcludeMissing
        collectionResourceType: JsonField<CollectionResourceType> = JsonMissing.of(),
        @JsonProperty("collection_tokens")
        @ExcludeMissing
        collectionTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("high_watermark")
        @ExcludeMissing
        highWatermark: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("network_settlement_summary")
        @ExcludeMissing
        networkSettlementSummary: JsonField<List<FundingEventSettlement>> = JsonMissing.of(),
        @JsonProperty("previous_high_watermark")
        @ExcludeMissing
        previousHighWatermark: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        collectionResourceType,
        collectionTokens,
        created,
        highWatermark,
        networkSettlementSummary,
        previousHighWatermark,
        updated,
        mutableMapOf(),
    )

    /**
     * Unique token ID
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Collection resource type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionResourceType(): CollectionResourceType =
        collectionResourceType.getRequired("collection_resource_type")

    /**
     * IDs of collections, further information can be gathered from the appropriate collection API
     * based on collection_resource_type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionTokens(): List<String> = collectionTokens.getRequired("collection_tokens")

    /**
     * Time of the creation
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Time of the high watermark
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun highWatermark(): OffsetDateTime = highWatermark.getRequired("high_watermark")

    /**
     * Network settlement summary breakdown by network settlement date
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun networkSettlementSummary(): List<FundingEventSettlement> =
        networkSettlementSummary.getRequired("network_settlement_summary")

    /**
     * Time of the previous high watermark
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previousHighWatermark(): OffsetDateTime =
        previousHighWatermark.getRequired("previous_high_watermark")

    /**
     * Time of the update
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [collectionResourceType].
     *
     * Unlike [collectionResourceType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("collection_resource_type")
    @ExcludeMissing
    fun _collectionResourceType(): JsonField<CollectionResourceType> = collectionResourceType

    /**
     * Returns the raw JSON value of [collectionTokens].
     *
     * Unlike [collectionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collection_tokens")
    @ExcludeMissing
    fun _collectionTokens(): JsonField<List<String>> = collectionTokens

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [highWatermark].
     *
     * Unlike [highWatermark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("high_watermark")
    @ExcludeMissing
    fun _highWatermark(): JsonField<OffsetDateTime> = highWatermark

    /**
     * Returns the raw JSON value of [networkSettlementSummary].
     *
     * Unlike [networkSettlementSummary], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("network_settlement_summary")
    @ExcludeMissing
    fun _networkSettlementSummary(): JsonField<List<FundingEventSettlement>> =
        networkSettlementSummary

    /**
     * Returns the raw JSON value of [previousHighWatermark].
     *
     * Unlike [previousHighWatermark], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_high_watermark")
    @ExcludeMissing
    fun _previousHighWatermark(): JsonField<OffsetDateTime> = previousHighWatermark

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
         * Returns a mutable builder for constructing an instance of [FundingEventRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .collectionResourceType()
         * .collectionTokens()
         * .created()
         * .highWatermark()
         * .networkSettlementSummary()
         * .previousHighWatermark()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FundingEventRetrieveResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var collectionResourceType: JsonField<CollectionResourceType>? = null
        private var collectionTokens: JsonField<MutableList<String>>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var highWatermark: JsonField<OffsetDateTime>? = null
        private var networkSettlementSummary: JsonField<MutableList<FundingEventSettlement>>? = null
        private var previousHighWatermark: JsonField<OffsetDateTime>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fundingEventRetrieveResponse: FundingEventRetrieveResponse) = apply {
            token = fundingEventRetrieveResponse.token
            collectionResourceType = fundingEventRetrieveResponse.collectionResourceType
            collectionTokens =
                fundingEventRetrieveResponse.collectionTokens.map { it.toMutableList() }
            created = fundingEventRetrieveResponse.created
            highWatermark = fundingEventRetrieveResponse.highWatermark
            networkSettlementSummary =
                fundingEventRetrieveResponse.networkSettlementSummary.map { it.toMutableList() }
            previousHighWatermark = fundingEventRetrieveResponse.previousHighWatermark
            updated = fundingEventRetrieveResponse.updated
            additionalProperties = fundingEventRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Unique token ID */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Collection resource type */
        fun collectionResourceType(collectionResourceType: CollectionResourceType) =
            collectionResourceType(JsonField.of(collectionResourceType))

        /**
         * Sets [Builder.collectionResourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionResourceType] with a well-typed
         * [CollectionResourceType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun collectionResourceType(collectionResourceType: JsonField<CollectionResourceType>) =
            apply {
                this.collectionResourceType = collectionResourceType
            }

        /**
         * IDs of collections, further information can be gathered from the appropriate collection
         * API based on collection_resource_type
         */
        fun collectionTokens(collectionTokens: List<String>) =
            collectionTokens(JsonField.of(collectionTokens))

        /**
         * Sets [Builder.collectionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectionTokens(collectionTokens: JsonField<List<String>>) = apply {
            this.collectionTokens = collectionTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [collectionTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCollectionToken(collectionToken: String) = apply {
            collectionTokens =
                (collectionTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("collectionTokens", it).add(collectionToken)
                }
        }

        /** Time of the creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Time of the high watermark */
        fun highWatermark(highWatermark: OffsetDateTime) =
            highWatermark(JsonField.of(highWatermark))

        /**
         * Sets [Builder.highWatermark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highWatermark] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun highWatermark(highWatermark: JsonField<OffsetDateTime>) = apply {
            this.highWatermark = highWatermark
        }

        /** Network settlement summary breakdown by network settlement date */
        fun networkSettlementSummary(networkSettlementSummary: List<FundingEventSettlement>) =
            networkSettlementSummary(JsonField.of(networkSettlementSummary))

        /**
         * Sets [Builder.networkSettlementSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkSettlementSummary] with a well-typed
         * `List<FundingEventSettlement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun networkSettlementSummary(
            networkSettlementSummary: JsonField<List<FundingEventSettlement>>
        ) = apply {
            this.networkSettlementSummary = networkSettlementSummary.map { it.toMutableList() }
        }

        /**
         * Adds a single [FundingEventSettlement] to [Builder.networkSettlementSummary].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNetworkSettlementSummary(networkSettlementSummary: FundingEventSettlement) = apply {
            this.networkSettlementSummary =
                (this.networkSettlementSummary ?: JsonField.of(mutableListOf())).also {
                    checkKnown("networkSettlementSummary", it).add(networkSettlementSummary)
                }
        }

        /** Time of the previous high watermark */
        fun previousHighWatermark(previousHighWatermark: OffsetDateTime) =
            previousHighWatermark(JsonField.of(previousHighWatermark))

        /**
         * Sets [Builder.previousHighWatermark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousHighWatermark] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun previousHighWatermark(previousHighWatermark: JsonField<OffsetDateTime>) = apply {
            this.previousHighWatermark = previousHighWatermark
        }

        /** Time of the update */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [FundingEventRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .collectionResourceType()
         * .collectionTokens()
         * .created()
         * .highWatermark()
         * .networkSettlementSummary()
         * .previousHighWatermark()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FundingEventRetrieveResponse =
            FundingEventRetrieveResponse(
                checkRequired("token", token),
                checkRequired("collectionResourceType", collectionResourceType),
                checkRequired("collectionTokens", collectionTokens).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("highWatermark", highWatermark),
                checkRequired("networkSettlementSummary", networkSettlementSummary).map {
                    it.toImmutable()
                },
                checkRequired("previousHighWatermark", previousHighWatermark),
                checkRequired("updated", updated),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FundingEventRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        collectionResourceType().validate()
        collectionTokens()
        created()
        highWatermark()
        networkSettlementSummary().forEach { it.validate() }
        previousHighWatermark()
        updated()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (collectionResourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (collectionTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (highWatermark.asKnown().isPresent) 1 else 0) +
            (networkSettlementSummary.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (previousHighWatermark.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    /** Collection resource type */
    class CollectionResourceType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BOOK_TRANSFER = of("BOOK_TRANSFER")

            @JvmField val PAYMENT = of("PAYMENT")

            @JvmStatic fun of(value: String) = CollectionResourceType(JsonField.of(value))
        }

        /** An enum containing [CollectionResourceType]'s known values. */
        enum class Known {
            BOOK_TRANSFER,
            PAYMENT,
        }

        /**
         * An enum containing [CollectionResourceType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CollectionResourceType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOOK_TRANSFER,
            PAYMENT,
            /**
             * An enum member indicating that [CollectionResourceType] was instantiated with an
             * unknown value.
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
                BOOK_TRANSFER -> Value.BOOK_TRANSFER
                PAYMENT -> Value.PAYMENT
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
                BOOK_TRANSFER -> Known.BOOK_TRANSFER
                PAYMENT -> Known.PAYMENT
                else -> throw LithicInvalidDataException("Unknown CollectionResourceType: $value")
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

        fun validate(): CollectionResourceType = apply {
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

            return /* spotless:off */ other is CollectionResourceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class FundingEventSettlement
    private constructor(
        private val networkSettlementDate: JsonField<LocalDate>,
        private val settledGrossAmount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("network_settlement_date")
            @ExcludeMissing
            networkSettlementDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("settled_gross_amount")
            @ExcludeMissing
            settledGrossAmount: JsonField<Long> = JsonMissing.of(),
        ) : this(networkSettlementDate, settledGrossAmount, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun networkSettlementDate(): LocalDate =
            networkSettlementDate.getRequired("network_settlement_date")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settledGrossAmount(): Long = settledGrossAmount.getRequired("settled_gross_amount")

        /**
         * Returns the raw JSON value of [networkSettlementDate].
         *
         * Unlike [networkSettlementDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("network_settlement_date")
        @ExcludeMissing
        fun _networkSettlementDate(): JsonField<LocalDate> = networkSettlementDate

        /**
         * Returns the raw JSON value of [settledGrossAmount].
         *
         * Unlike [settledGrossAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("settled_gross_amount")
        @ExcludeMissing
        fun _settledGrossAmount(): JsonField<Long> = settledGrossAmount

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
             * Returns a mutable builder for constructing an instance of [FundingEventSettlement].
             *
             * The following fields are required:
             * ```java
             * .networkSettlementDate()
             * .settledGrossAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FundingEventSettlement]. */
        class Builder internal constructor() {

            private var networkSettlementDate: JsonField<LocalDate>? = null
            private var settledGrossAmount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingEventSettlement: FundingEventSettlement) = apply {
                networkSettlementDate = fundingEventSettlement.networkSettlementDate
                settledGrossAmount = fundingEventSettlement.settledGrossAmount
                additionalProperties = fundingEventSettlement.additionalProperties.toMutableMap()
            }

            fun networkSettlementDate(networkSettlementDate: LocalDate) =
                networkSettlementDate(JsonField.of(networkSettlementDate))

            /**
             * Sets [Builder.networkSettlementDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkSettlementDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun networkSettlementDate(networkSettlementDate: JsonField<LocalDate>) = apply {
                this.networkSettlementDate = networkSettlementDate
            }

            fun settledGrossAmount(settledGrossAmount: Long) =
                settledGrossAmount(JsonField.of(settledGrossAmount))

            /**
             * Sets [Builder.settledGrossAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledGrossAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settledGrossAmount(settledGrossAmount: JsonField<Long>) = apply {
                this.settledGrossAmount = settledGrossAmount
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
             * Returns an immutable instance of [FundingEventSettlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .networkSettlementDate()
             * .settledGrossAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FundingEventSettlement =
                FundingEventSettlement(
                    checkRequired("networkSettlementDate", networkSettlementDate),
                    checkRequired("settledGrossAmount", settledGrossAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FundingEventSettlement = apply {
            if (validated) {
                return@apply
            }

            networkSettlementDate()
            settledGrossAmount()
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
            (if (networkSettlementDate.asKnown().isPresent) 1 else 0) +
                (if (settledGrossAmount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FundingEventSettlement && networkSettlementDate == other.networkSettlementDate && settledGrossAmount == other.settledGrossAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(networkSettlementDate, settledGrossAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FundingEventSettlement{networkSettlementDate=$networkSettlementDate, settledGrossAmount=$settledGrossAmount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FundingEventRetrieveResponse && token == other.token && collectionResourceType == other.collectionResourceType && collectionTokens == other.collectionTokens && created == other.created && highWatermark == other.highWatermark && networkSettlementSummary == other.networkSettlementSummary && previousHighWatermark == other.previousHighWatermark && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, collectionResourceType, collectionTokens, created, highWatermark, networkSettlementSummary, previousHighWatermark, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FundingEventRetrieveResponse{token=$token, collectionResourceType=$collectionResourceType, collectionTokens=$collectionTokens, created=$created, highWatermark=$highWatermark, networkSettlementSummary=$networkSettlementSummary, previousHighWatermark=$previousHighWatermark, updated=$updated, additionalProperties=$additionalProperties}"
}
