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

class WalletDecisioningInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountScore: JsonField<String>,
    private val deviceScore: JsonField<String>,
    private val recommendedDecision: JsonField<String>,
    private val recommendationReasons: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_score")
        @ExcludeMissing
        accountScore: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_score")
        @ExcludeMissing
        deviceScore: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recommended_decision")
        @ExcludeMissing
        recommendedDecision: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recommendation_reasons")
        @ExcludeMissing
        recommendationReasons: JsonField<List<String>> = JsonMissing.of(),
    ) : this(accountScore, deviceScore, recommendedDecision, recommendationReasons, mutableMapOf())

    /**
     * Score given to the account by the Wallet Provider
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountScore(): Optional<String> = accountScore.getOptional("account_score")

    /**
     * Score given to the device by the Wallet Provider
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deviceScore(): Optional<String> = deviceScore.getOptional("device_score")

    /**
     * The decision recommended by the Wallet Provider
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recommendedDecision(): Optional<String> =
        recommendedDecision.getOptional("recommended_decision")

    /**
     * Reasons provided to the Wallet Provider on how the recommended decision was reached
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recommendationReasons(): Optional<List<String>> =
        recommendationReasons.getOptional("recommendation_reasons")

    /**
     * Returns the raw JSON value of [accountScore].
     *
     * Unlike [accountScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_score")
    @ExcludeMissing
    fun _accountScore(): JsonField<String> = accountScore

    /**
     * Returns the raw JSON value of [deviceScore].
     *
     * Unlike [deviceScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_score")
    @ExcludeMissing
    fun _deviceScore(): JsonField<String> = deviceScore

    /**
     * Returns the raw JSON value of [recommendedDecision].
     *
     * Unlike [recommendedDecision], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recommended_decision")
    @ExcludeMissing
    fun _recommendedDecision(): JsonField<String> = recommendedDecision

    /**
     * Returns the raw JSON value of [recommendationReasons].
     *
     * Unlike [recommendationReasons], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recommendation_reasons")
    @ExcludeMissing
    fun _recommendationReasons(): JsonField<List<String>> = recommendationReasons

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
         * Returns a mutable builder for constructing an instance of [WalletDecisioningInfo].
         *
         * The following fields are required:
         * ```java
         * .accountScore()
         * .deviceScore()
         * .recommendedDecision()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WalletDecisioningInfo]. */
    class Builder internal constructor() {

        private var accountScore: JsonField<String>? = null
        private var deviceScore: JsonField<String>? = null
        private var recommendedDecision: JsonField<String>? = null
        private var recommendationReasons: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(walletDecisioningInfo: WalletDecisioningInfo) = apply {
            accountScore = walletDecisioningInfo.accountScore
            deviceScore = walletDecisioningInfo.deviceScore
            recommendedDecision = walletDecisioningInfo.recommendedDecision
            recommendationReasons =
                walletDecisioningInfo.recommendationReasons.map { it.toMutableList() }
            additionalProperties = walletDecisioningInfo.additionalProperties.toMutableMap()
        }

        /** Score given to the account by the Wallet Provider */
        fun accountScore(accountScore: String?) = accountScore(JsonField.ofNullable(accountScore))

        /** Alias for calling [Builder.accountScore] with `accountScore.orElse(null)`. */
        fun accountScore(accountScore: Optional<String>) = accountScore(accountScore.getOrNull())

        /**
         * Sets [Builder.accountScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountScore] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountScore(accountScore: JsonField<String>) = apply {
            this.accountScore = accountScore
        }

        /** Score given to the device by the Wallet Provider */
        fun deviceScore(deviceScore: String?) = deviceScore(JsonField.ofNullable(deviceScore))

        /** Alias for calling [Builder.deviceScore] with `deviceScore.orElse(null)`. */
        fun deviceScore(deviceScore: Optional<String>) = deviceScore(deviceScore.getOrNull())

        /**
         * Sets [Builder.deviceScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceScore] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deviceScore(deviceScore: JsonField<String>) = apply { this.deviceScore = deviceScore }

        /** The decision recommended by the Wallet Provider */
        fun recommendedDecision(recommendedDecision: String?) =
            recommendedDecision(JsonField.ofNullable(recommendedDecision))

        /**
         * Alias for calling [Builder.recommendedDecision] with `recommendedDecision.orElse(null)`.
         */
        fun recommendedDecision(recommendedDecision: Optional<String>) =
            recommendedDecision(recommendedDecision.getOrNull())

        /**
         * Sets [Builder.recommendedDecision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recommendedDecision] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recommendedDecision(recommendedDecision: JsonField<String>) = apply {
            this.recommendedDecision = recommendedDecision
        }

        /** Reasons provided to the Wallet Provider on how the recommended decision was reached */
        fun recommendationReasons(recommendationReasons: List<String>?) =
            recommendationReasons(JsonField.ofNullable(recommendationReasons))

        /**
         * Alias for calling [Builder.recommendationReasons] with
         * `recommendationReasons.orElse(null)`.
         */
        fun recommendationReasons(recommendationReasons: Optional<List<String>>) =
            recommendationReasons(recommendationReasons.getOrNull())

        /**
         * Sets [Builder.recommendationReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recommendationReasons] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recommendationReasons(recommendationReasons: JsonField<List<String>>) = apply {
            this.recommendationReasons = recommendationReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [recommendationReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecommendationReason(recommendationReason: String) = apply {
            recommendationReasons =
                (recommendationReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recommendationReasons", it).add(recommendationReason)
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
         * Returns an immutable instance of [WalletDecisioningInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountScore()
         * .deviceScore()
         * .recommendedDecision()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WalletDecisioningInfo =
            WalletDecisioningInfo(
                checkRequired("accountScore", accountScore),
                checkRequired("deviceScore", deviceScore),
                checkRequired("recommendedDecision", recommendedDecision),
                (recommendationReasons ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WalletDecisioningInfo = apply {
        if (validated) {
            return@apply
        }

        accountScore()
        deviceScore()
        recommendedDecision()
        recommendationReasons()
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
        (if (accountScore.asKnown().isPresent) 1 else 0) +
            (if (deviceScore.asKnown().isPresent) 1 else 0) +
            (if (recommendedDecision.asKnown().isPresent) 1 else 0) +
            (recommendationReasons.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WalletDecisioningInfo &&
            accountScore == other.accountScore &&
            deviceScore == other.deviceScore &&
            recommendedDecision == other.recommendedDecision &&
            recommendationReasons == other.recommendationReasons &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountScore,
            deviceScore,
            recommendedDecision,
            recommendationReasons,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WalletDecisioningInfo{accountScore=$accountScore, deviceScore=$deviceScore, recommendedDecision=$recommendedDecision, recommendationReasons=$recommendationReasons, additionalProperties=$additionalProperties}"
}
