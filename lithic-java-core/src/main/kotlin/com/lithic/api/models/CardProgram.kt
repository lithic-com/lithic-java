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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardProgram
private constructor(
    private val token: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val panRangeEnd: JsonField<String>,
    private val panRangeStart: JsonField<String>,
    private val accountLevelManagementEnabled: JsonField<Boolean>,
    private val cardholderCurrency: JsonField<String>,
    private val settlementCurrencies: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pan_range_end")
        @ExcludeMissing
        panRangeEnd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pan_range_start")
        @ExcludeMissing
        panRangeStart: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_level_management_enabled")
        @ExcludeMissing
        accountLevelManagementEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cardholder_currency")
        @ExcludeMissing
        cardholderCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement_currencies")
        @ExcludeMissing
        settlementCurrencies: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        token,
        created,
        name,
        panRangeEnd,
        panRangeStart,
        accountLevelManagementEnabled,
        cardholderCurrency,
        settlementCurrencies,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Timestamp of when the card program was created.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The name of the card program.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The first digits of the card number that this card program ends with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun panRangeEnd(): String = panRangeEnd.getRequired("pan_range_end")

    /**
     * The first digits of the card number that this card program starts with.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun panRangeStart(): String = panRangeStart.getRequired("pan_range_start")

    /**
     * Whether the card program is participating in Account Level Management. Currently applicable
     * to Visa card programs only.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountLevelManagementEnabled(): Optional<Boolean> =
        accountLevelManagementEnabled.getOptional("account_level_management_enabled")

    /**
     * 3-character alphabetic ISO 4217 code for the currency of the cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderCurrency(): Optional<String> =
        cardholderCurrency.getOptional("cardholder_currency")

    /**
     * List of 3-character alphabetic ISO 4217 codes for the currencies that the card program
     * supports for settlement.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settlementCurrencies(): Optional<List<String>> =
        settlementCurrencies.getOptional("settlement_currencies")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [panRangeEnd].
     *
     * Unlike [panRangeEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pan_range_end")
    @ExcludeMissing
    fun _panRangeEnd(): JsonField<String> = panRangeEnd

    /**
     * Returns the raw JSON value of [panRangeStart].
     *
     * Unlike [panRangeStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pan_range_start")
    @ExcludeMissing
    fun _panRangeStart(): JsonField<String> = panRangeStart

    /**
     * Returns the raw JSON value of [accountLevelManagementEnabled].
     *
     * Unlike [accountLevelManagementEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("account_level_management_enabled")
    @ExcludeMissing
    fun _accountLevelManagementEnabled(): JsonField<Boolean> = accountLevelManagementEnabled

    /**
     * Returns the raw JSON value of [cardholderCurrency].
     *
     * Unlike [cardholderCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    fun _cardholderCurrency(): JsonField<String> = cardholderCurrency

    /**
     * Returns the raw JSON value of [settlementCurrencies].
     *
     * Unlike [settlementCurrencies], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_currencies")
    @ExcludeMissing
    fun _settlementCurrencies(): JsonField<List<String>> = settlementCurrencies

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
         * Returns a mutable builder for constructing an instance of [CardProgram].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .name()
         * .panRangeEnd()
         * .panRangeStart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardProgram]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var panRangeEnd: JsonField<String>? = null
        private var panRangeStart: JsonField<String>? = null
        private var accountLevelManagementEnabled: JsonField<Boolean> = JsonMissing.of()
        private var cardholderCurrency: JsonField<String> = JsonMissing.of()
        private var settlementCurrencies: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProgram: CardProgram) = apply {
            token = cardProgram.token
            created = cardProgram.created
            name = cardProgram.name
            panRangeEnd = cardProgram.panRangeEnd
            panRangeStart = cardProgram.panRangeStart
            accountLevelManagementEnabled = cardProgram.accountLevelManagementEnabled
            cardholderCurrency = cardProgram.cardholderCurrency
            settlementCurrencies = cardProgram.settlementCurrencies.map { it.toMutableList() }
            additionalProperties = cardProgram.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Timestamp of when the card program was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The name of the card program. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The first digits of the card number that this card program ends with. */
        fun panRangeEnd(panRangeEnd: String) = panRangeEnd(JsonField.of(panRangeEnd))

        /**
         * Sets [Builder.panRangeEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.panRangeEnd] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun panRangeEnd(panRangeEnd: JsonField<String>) = apply { this.panRangeEnd = panRangeEnd }

        /** The first digits of the card number that this card program starts with. */
        fun panRangeStart(panRangeStart: String) = panRangeStart(JsonField.of(panRangeStart))

        /**
         * Sets [Builder.panRangeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.panRangeStart] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun panRangeStart(panRangeStart: JsonField<String>) = apply {
            this.panRangeStart = panRangeStart
        }

        /**
         * Whether the card program is participating in Account Level Management. Currently
         * applicable to Visa card programs only.
         */
        fun accountLevelManagementEnabled(accountLevelManagementEnabled: Boolean) =
            accountLevelManagementEnabled(JsonField.of(accountLevelManagementEnabled))

        /**
         * Sets [Builder.accountLevelManagementEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountLevelManagementEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun accountLevelManagementEnabled(accountLevelManagementEnabled: JsonField<Boolean>) =
            apply {
                this.accountLevelManagementEnabled = accountLevelManagementEnabled
            }

        /** 3-character alphabetic ISO 4217 code for the currency of the cardholder. */
        fun cardholderCurrency(cardholderCurrency: String) =
            cardholderCurrency(JsonField.of(cardholderCurrency))

        /**
         * Sets [Builder.cardholderCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderCurrency(cardholderCurrency: JsonField<String>) = apply {
            this.cardholderCurrency = cardholderCurrency
        }

        /**
         * List of 3-character alphabetic ISO 4217 codes for the currencies that the card program
         * supports for settlement.
         */
        fun settlementCurrencies(settlementCurrencies: List<String>) =
            settlementCurrencies(JsonField.of(settlementCurrencies))

        /**
         * Sets [Builder.settlementCurrencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementCurrencies] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun settlementCurrencies(settlementCurrencies: JsonField<List<String>>) = apply {
            this.settlementCurrencies = settlementCurrencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [settlementCurrencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSettlementCurrency(settlementCurrency: String) = apply {
            settlementCurrencies =
                (settlementCurrencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("settlementCurrencies", it).add(settlementCurrency)
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
         * Returns an immutable instance of [CardProgram].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .name()
         * .panRangeEnd()
         * .panRangeStart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardProgram =
            CardProgram(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("name", name),
                checkRequired("panRangeEnd", panRangeEnd),
                checkRequired("panRangeStart", panRangeStart),
                accountLevelManagementEnabled,
                cardholderCurrency,
                (settlementCurrencies ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardProgram = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        name()
        panRangeEnd()
        panRangeStart()
        accountLevelManagementEnabled()
        cardholderCurrency()
        settlementCurrencies()
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
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (panRangeEnd.asKnown().isPresent) 1 else 0) +
            (if (panRangeStart.asKnown().isPresent) 1 else 0) +
            (if (accountLevelManagementEnabled.asKnown().isPresent) 1 else 0) +
            (if (cardholderCurrency.asKnown().isPresent) 1 else 0) +
            (settlementCurrencies.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgram && token == other.token && created == other.created && name == other.name && panRangeEnd == other.panRangeEnd && panRangeStart == other.panRangeStart && accountLevelManagementEnabled == other.accountLevelManagementEnabled && cardholderCurrency == other.cardholderCurrency && settlementCurrencies == other.settlementCurrencies && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, name, panRangeEnd, panRangeStart, accountLevelManagementEnabled, cardholderCurrency, settlementCurrencies, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardProgram{token=$token, created=$created, name=$name, panRangeEnd=$panRangeEnd, panRangeStart=$panRangeStart, accountLevelManagementEnabled=$accountLevelManagementEnabled, cardholderCurrency=$cardholderCurrency, settlementCurrencies=$settlementCurrencies, additionalProperties=$additionalProperties}"
}
