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
import kotlin.jvm.optionals.getOrNull

class FinancialAccountCreditConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountToken: JsonField<String>,
    private val autoCollectionConfiguration: JsonField<AutoCollectionConfigurationResponse>,
    private val creditLimit: JsonField<Long>,
    private val creditProductToken: JsonField<String>,
    private val externalBankAccountToken: JsonField<String>,
    private val tier: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auto_collection_configuration")
        @ExcludeMissing
        autoCollectionConfiguration: JsonField<AutoCollectionConfigurationResponse> =
            JsonMissing.of(),
        @JsonProperty("credit_limit")
        @ExcludeMissing
        creditLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        creditProductToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        externalBankAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountToken,
        autoCollectionConfiguration,
        creditLimit,
        creditProductToken,
        externalBankAccountToken,
        tier,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoCollectionConfiguration(): AutoCollectionConfigurationResponse =
        autoCollectionConfiguration.getRequired("auto_collection_configuration")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditLimit(): Optional<Long> = creditLimit.getOptional("credit_limit")

    /**
     * Globally unique identifier for the credit product
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditProductToken(): Optional<String> =
        creditProductToken.getOptional("credit_product_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalBankAccountToken(): Optional<String> =
        externalBankAccountToken.getOptional("external_bank_account_token")

    /**
     * Tier assigned to the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier(): Optional<String> = tier.getOptional("tier")

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [autoCollectionConfiguration].
     *
     * Unlike [autoCollectionConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("auto_collection_configuration")
    @ExcludeMissing
    fun _autoCollectionConfiguration(): JsonField<AutoCollectionConfigurationResponse> =
        autoCollectionConfiguration

    /**
     * Returns the raw JSON value of [creditLimit].
     *
     * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

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
     * Returns the raw JSON value of [externalBankAccountToken].
     *
     * Unlike [externalBankAccountToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken(): JsonField<String> = externalBankAccountToken

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

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
         * Returns a mutable builder for constructing an instance of [FinancialAccountCreditConfig].
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .autoCollectionConfiguration()
         * .creditLimit()
         * .creditProductToken()
         * .externalBankAccountToken()
         * .tier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountCreditConfig]. */
    class Builder internal constructor() {

        private var accountToken: JsonField<String>? = null
        private var autoCollectionConfiguration: JsonField<AutoCollectionConfigurationResponse>? =
            null
        private var creditLimit: JsonField<Long>? = null
        private var creditProductToken: JsonField<String>? = null
        private var externalBankAccountToken: JsonField<String>? = null
        private var tier: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccountCreditConfig: FinancialAccountCreditConfig) = apply {
            accountToken = financialAccountCreditConfig.accountToken
            autoCollectionConfiguration = financialAccountCreditConfig.autoCollectionConfiguration
            creditLimit = financialAccountCreditConfig.creditLimit
            creditProductToken = financialAccountCreditConfig.creditProductToken
            externalBankAccountToken = financialAccountCreditConfig.externalBankAccountToken
            tier = financialAccountCreditConfig.tier
            additionalProperties = financialAccountCreditConfig.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        fun autoCollectionConfiguration(
            autoCollectionConfiguration: AutoCollectionConfigurationResponse
        ) = autoCollectionConfiguration(JsonField.of(autoCollectionConfiguration))

        /**
         * Sets [Builder.autoCollectionConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollectionConfiguration] with a well-typed
         * [AutoCollectionConfigurationResponse] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun autoCollectionConfiguration(
            autoCollectionConfiguration: JsonField<AutoCollectionConfigurationResponse>
        ) = apply { this.autoCollectionConfiguration = autoCollectionConfiguration }

        fun creditLimit(creditLimit: Long?) = creditLimit(JsonField.ofNullable(creditLimit))

        /**
         * Alias for [Builder.creditLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun creditLimit(creditLimit: Long) = creditLimit(creditLimit as Long?)

        /** Alias for calling [Builder.creditLimit] with `creditLimit.orElse(null)`. */
        fun creditLimit(creditLimit: Optional<Long>) = creditLimit(creditLimit.getOrNull())

        /**
         * Sets [Builder.creditLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: String?) =
            creditProductToken(JsonField.ofNullable(creditProductToken))

        /**
         * Alias for calling [Builder.creditProductToken] with `creditProductToken.orElse(null)`.
         */
        fun creditProductToken(creditProductToken: Optional<String>) =
            creditProductToken(creditProductToken.getOrNull())

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

        fun externalBankAccountToken(externalBankAccountToken: String?) =
            externalBankAccountToken(JsonField.ofNullable(externalBankAccountToken))

        /**
         * Alias for calling [Builder.externalBankAccountToken] with
         * `externalBankAccountToken.orElse(null)`.
         */
        fun externalBankAccountToken(externalBankAccountToken: Optional<String>) =
            externalBankAccountToken(externalBankAccountToken.getOrNull())

        /**
         * Sets [Builder.externalBankAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalBankAccountToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Tier assigned to the financial account */
        fun tier(tier: String?) = tier(JsonField.ofNullable(tier))

        /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
        fun tier(tier: Optional<String>) = tier(tier.getOrNull())

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

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
         * Returns an immutable instance of [FinancialAccountCreditConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .autoCollectionConfiguration()
         * .creditLimit()
         * .creditProductToken()
         * .externalBankAccountToken()
         * .tier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountCreditConfig =
            FinancialAccountCreditConfig(
                checkRequired("accountToken", accountToken),
                checkRequired("autoCollectionConfiguration", autoCollectionConfiguration),
                checkRequired("creditLimit", creditLimit),
                checkRequired("creditProductToken", creditProductToken),
                checkRequired("externalBankAccountToken", externalBankAccountToken),
                checkRequired("tier", tier),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FinancialAccountCreditConfig = apply {
        if (validated) {
            return@apply
        }

        accountToken()
        autoCollectionConfiguration().validate()
        creditLimit()
        creditProductToken()
        externalBankAccountToken()
        tier()
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
        (if (accountToken.asKnown().isPresent) 1 else 0) +
            (autoCollectionConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (creditLimit.asKnown().isPresent) 1 else 0) +
            (if (creditProductToken.asKnown().isPresent) 1 else 0) +
            (if (externalBankAccountToken.asKnown().isPresent) 1 else 0) +
            (if (tier.asKnown().isPresent) 1 else 0)

    class AutoCollectionConfigurationResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val autoCollectionEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auto_collection_enabled")
            @ExcludeMissing
            autoCollectionEnabled: JsonField<Boolean> = JsonMissing.of()
        ) : this(autoCollectionEnabled, mutableMapOf())

        /**
         * If auto collection is enabled for this account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun autoCollectionEnabled(): Boolean =
            autoCollectionEnabled.getRequired("auto_collection_enabled")

        /**
         * Returns the raw JSON value of [autoCollectionEnabled].
         *
         * Unlike [autoCollectionEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_collection_enabled")
        @ExcludeMissing
        fun _autoCollectionEnabled(): JsonField<Boolean> = autoCollectionEnabled

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
             * Returns a mutable builder for constructing an instance of
             * [AutoCollectionConfigurationResponse].
             *
             * The following fields are required:
             * ```java
             * .autoCollectionEnabled()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AutoCollectionConfigurationResponse]. */
        class Builder internal constructor() {

            private var autoCollectionEnabled: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                autoCollectionConfigurationResponse: AutoCollectionConfigurationResponse
            ) = apply {
                autoCollectionEnabled = autoCollectionConfigurationResponse.autoCollectionEnabled
                additionalProperties =
                    autoCollectionConfigurationResponse.additionalProperties.toMutableMap()
            }

            /** If auto collection is enabled for this account */
            fun autoCollectionEnabled(autoCollectionEnabled: Boolean) =
                autoCollectionEnabled(JsonField.of(autoCollectionEnabled))

            /**
             * Sets [Builder.autoCollectionEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoCollectionEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoCollectionEnabled(autoCollectionEnabled: JsonField<Boolean>) = apply {
                this.autoCollectionEnabled = autoCollectionEnabled
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
             * Returns an immutable instance of [AutoCollectionConfigurationResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .autoCollectionEnabled()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AutoCollectionConfigurationResponse =
                AutoCollectionConfigurationResponse(
                    checkRequired("autoCollectionEnabled", autoCollectionEnabled),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AutoCollectionConfigurationResponse = apply {
            if (validated) {
                return@apply
            }

            autoCollectionEnabled()
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
        internal fun validity(): Int = (if (autoCollectionEnabled.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AutoCollectionConfigurationResponse &&
                autoCollectionEnabled == other.autoCollectionEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(autoCollectionEnabled, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AutoCollectionConfigurationResponse{autoCollectionEnabled=$autoCollectionEnabled, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountCreditConfig &&
            accountToken == other.accountToken &&
            autoCollectionConfiguration == other.autoCollectionConfiguration &&
            creditLimit == other.creditLimit &&
            creditProductToken == other.creditProductToken &&
            externalBankAccountToken == other.externalBankAccountToken &&
            tier == other.tier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountToken,
            autoCollectionConfiguration,
            creditLimit,
            creditProductToken,
            externalBankAccountToken,
            tier,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccountCreditConfig{accountToken=$accountToken, autoCollectionConfiguration=$autoCollectionConfiguration, creditLimit=$creditLimit, creditProductToken=$creditProductToken, externalBankAccountToken=$externalBankAccountToken, tier=$tier, additionalProperties=$additionalProperties}"
}
