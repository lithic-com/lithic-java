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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Configuration for loan tapes */
class LoanTapeConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val financialAccountToken: JsonField<String>,
    private val instanceToken: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val creditProductToken: JsonField<String>,
    private val loanTapeRebuildConfiguration: JsonField<LoanTapeRebuildConfiguration>,
    private val tierScheduleChangedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instance_token")
        @ExcludeMissing
        instanceToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        creditProductToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loan_tape_rebuild_configuration")
        @ExcludeMissing
        loanTapeRebuildConfiguration: JsonField<LoanTapeRebuildConfiguration> = JsonMissing.of(),
        @JsonProperty("tier_schedule_changed_at")
        @ExcludeMissing
        tierScheduleChangedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        createdAt,
        financialAccountToken,
        instanceToken,
        updatedAt,
        creditProductToken,
        loanTapeRebuildConfiguration,
        tierScheduleChangedAt,
        mutableMapOf(),
    )

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instanceToken(): String = instanceToken.getRequired("instance_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditProductToken(): Optional<String> =
        creditProductToken.getOptional("credit_product_token")

    /**
     * Configuration for building loan tapes
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loanTapeRebuildConfiguration(): Optional<LoanTapeRebuildConfiguration> =
        loanTapeRebuildConfiguration.getOptional("loan_tape_rebuild_configuration")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tierScheduleChangedAt(): Optional<OffsetDateTime> =
        tierScheduleChangedAt.getOptional("tier_schedule_changed_at")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /**
     * Returns the raw JSON value of [instanceToken].
     *
     * Unlike [instanceToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instance_token")
    @ExcludeMissing
    fun _instanceToken(): JsonField<String> = instanceToken

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [creditProductToken].
     *
     * Unlike [creditProductToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    /**
     * Returns the raw JSON value of [loanTapeRebuildConfiguration].
     *
     * Unlike [loanTapeRebuildConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("loan_tape_rebuild_configuration")
    @ExcludeMissing
    fun _loanTapeRebuildConfiguration(): JsonField<LoanTapeRebuildConfiguration> =
        loanTapeRebuildConfiguration

    /**
     * Returns the raw JSON value of [tierScheduleChangedAt].
     *
     * Unlike [tierScheduleChangedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tier_schedule_changed_at")
    @ExcludeMissing
    fun _tierScheduleChangedAt(): JsonField<OffsetDateTime> = tierScheduleChangedAt

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
         * Returns a mutable builder for constructing an instance of [LoanTapeConfiguration].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .financialAccountToken()
         * .instanceToken()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LoanTapeConfiguration]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var instanceToken: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var loanTapeRebuildConfiguration: JsonField<LoanTapeRebuildConfiguration> =
            JsonMissing.of()
        private var tierScheduleChangedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(loanTapeConfiguration: LoanTapeConfiguration) = apply {
            createdAt = loanTapeConfiguration.createdAt
            financialAccountToken = loanTapeConfiguration.financialAccountToken
            instanceToken = loanTapeConfiguration.instanceToken
            updatedAt = loanTapeConfiguration.updatedAt
            creditProductToken = loanTapeConfiguration.creditProductToken
            loanTapeRebuildConfiguration = loanTapeConfiguration.loanTapeRebuildConfiguration
            tierScheduleChangedAt = loanTapeConfiguration.tierScheduleChangedAt
            additionalProperties = loanTapeConfiguration.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun instanceToken(instanceToken: String) = instanceToken(JsonField.of(instanceToken))

        /**
         * Sets [Builder.instanceToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instanceToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instanceToken(instanceToken: JsonField<String>) = apply {
            this.instanceToken = instanceToken
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /**
         * Sets [Builder.creditProductToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditProductToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Configuration for building loan tapes */
        fun loanTapeRebuildConfiguration(
            loanTapeRebuildConfiguration: LoanTapeRebuildConfiguration
        ) = loanTapeRebuildConfiguration(JsonField.of(loanTapeRebuildConfiguration))

        /**
         * Sets [Builder.loanTapeRebuildConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loanTapeRebuildConfiguration] with a well-typed
         * [LoanTapeRebuildConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun loanTapeRebuildConfiguration(
            loanTapeRebuildConfiguration: JsonField<LoanTapeRebuildConfiguration>
        ) = apply { this.loanTapeRebuildConfiguration = loanTapeRebuildConfiguration }

        fun tierScheduleChangedAt(tierScheduleChangedAt: OffsetDateTime) =
            tierScheduleChangedAt(JsonField.of(tierScheduleChangedAt))

        /**
         * Sets [Builder.tierScheduleChangedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tierScheduleChangedAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tierScheduleChangedAt(tierScheduleChangedAt: JsonField<OffsetDateTime>) = apply {
            this.tierScheduleChangedAt = tierScheduleChangedAt
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
         * Returns an immutable instance of [LoanTapeConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .financialAccountToken()
         * .instanceToken()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LoanTapeConfiguration =
            LoanTapeConfiguration(
                checkRequired("createdAt", createdAt),
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("instanceToken", instanceToken),
                checkRequired("updatedAt", updatedAt),
                creditProductToken,
                loanTapeRebuildConfiguration,
                tierScheduleChangedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LoanTapeConfiguration = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        financialAccountToken()
        instanceToken()
        updatedAt()
        creditProductToken()
        loanTapeRebuildConfiguration().ifPresent { it.validate() }
        tierScheduleChangedAt()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (if (instanceToken.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (creditProductToken.asKnown().isPresent) 1 else 0) +
            (loanTapeRebuildConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tierScheduleChangedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LoanTapeConfiguration &&
            createdAt == other.createdAt &&
            financialAccountToken == other.financialAccountToken &&
            instanceToken == other.instanceToken &&
            updatedAt == other.updatedAt &&
            creditProductToken == other.creditProductToken &&
            loanTapeRebuildConfiguration == other.loanTapeRebuildConfiguration &&
            tierScheduleChangedAt == other.tierScheduleChangedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            financialAccountToken,
            instanceToken,
            updatedAt,
            creditProductToken,
            loanTapeRebuildConfiguration,
            tierScheduleChangedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LoanTapeConfiguration{createdAt=$createdAt, financialAccountToken=$financialAccountToken, instanceToken=$instanceToken, updatedAt=$updatedAt, creditProductToken=$creditProductToken, loanTapeRebuildConfiguration=$loanTapeRebuildConfiguration, tierScheduleChangedAt=$tierScheduleChangedAt, additionalProperties=$additionalProperties}"
}
