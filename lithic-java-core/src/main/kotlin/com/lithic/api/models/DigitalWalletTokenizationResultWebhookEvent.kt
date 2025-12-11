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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DigitalWalletTokenizationResultWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val tokenizationResultDetails: JsonField<TokenizationResultDetails>,
    private val tokenizationToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("tokenization_result_details")
        @ExcludeMissing
        tokenizationResultDetails: JsonField<TokenizationResultDetails> = JsonMissing.of(),
        @JsonProperty("tokenization_token")
        @ExcludeMissing
        tokenizationToken: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountToken,
        cardToken,
        created,
        eventType,
        tokenizationResultDetails,
        tokenizationToken,
        mutableMapOf(),
    )

    /**
     * Account token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Card token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Created date
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * The result of the tokenization request.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizationResultDetails(): TokenizationResultDetails =
        tokenizationResultDetails.getRequired("tokenization_result_details")

    /**
     * Tokenization token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizationToken(): String = tokenizationToken.getRequired("tokenization_token")

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [tokenizationResultDetails].
     *
     * Unlike [tokenizationResultDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("tokenization_result_details")
    @ExcludeMissing
    fun _tokenizationResultDetails(): JsonField<TokenizationResultDetails> =
        tokenizationResultDetails

    /**
     * Returns the raw JSON value of [tokenizationToken].
     *
     * Unlike [tokenizationToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tokenization_token")
    @ExcludeMissing
    fun _tokenizationToken(): JsonField<String> = tokenizationToken

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
         * [DigitalWalletTokenizationResultWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .cardToken()
         * .created()
         * .eventType()
         * .tokenizationResultDetails()
         * .tokenizationToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalWalletTokenizationResultWebhookEvent]. */
    class Builder internal constructor() {

        private var accountToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var eventType: JsonField<EventType>? = null
        private var tokenizationResultDetails: JsonField<TokenizationResultDetails>? = null
        private var tokenizationToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            digitalWalletTokenizationResultWebhookEvent: DigitalWalletTokenizationResultWebhookEvent
        ) = apply {
            accountToken = digitalWalletTokenizationResultWebhookEvent.accountToken
            cardToken = digitalWalletTokenizationResultWebhookEvent.cardToken
            created = digitalWalletTokenizationResultWebhookEvent.created
            eventType = digitalWalletTokenizationResultWebhookEvent.eventType
            tokenizationResultDetails =
                digitalWalletTokenizationResultWebhookEvent.tokenizationResultDetails
            tokenizationToken = digitalWalletTokenizationResultWebhookEvent.tokenizationToken
            additionalProperties =
                digitalWalletTokenizationResultWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Account token */
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

        /** Card token */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Created date */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /** The result of the tokenization request. */
        fun tokenizationResultDetails(tokenizationResultDetails: TokenizationResultDetails) =
            tokenizationResultDetails(JsonField.of(tokenizationResultDetails))

        /**
         * Sets [Builder.tokenizationResultDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationResultDetails] with a well-typed
         * [TokenizationResultDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun tokenizationResultDetails(
            tokenizationResultDetails: JsonField<TokenizationResultDetails>
        ) = apply { this.tokenizationResultDetails = tokenizationResultDetails }

        /** Tokenization token */
        fun tokenizationToken(tokenizationToken: String) =
            tokenizationToken(JsonField.of(tokenizationToken))

        /**
         * Sets [Builder.tokenizationToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenizationToken(tokenizationToken: JsonField<String>) = apply {
            this.tokenizationToken = tokenizationToken
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
         * Returns an immutable instance of [DigitalWalletTokenizationResultWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .cardToken()
         * .created()
         * .eventType()
         * .tokenizationResultDetails()
         * .tokenizationToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalWalletTokenizationResultWebhookEvent =
            DigitalWalletTokenizationResultWebhookEvent(
                checkRequired("accountToken", accountToken),
                checkRequired("cardToken", cardToken),
                checkRequired("created", created),
                checkRequired("eventType", eventType),
                checkRequired("tokenizationResultDetails", tokenizationResultDetails),
                checkRequired("tokenizationToken", tokenizationToken),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DigitalWalletTokenizationResultWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accountToken()
        cardToken()
        created()
        eventType().validate()
        tokenizationResultDetails().validate()
        tokenizationToken()
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
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (tokenizationResultDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tokenizationToken.asKnown().isPresent) 1 else 0)

    /** The type of event that occurred. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_RESULT = of("digital_wallet.tokenization_result")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            DIGITAL_WALLET_TOKENIZATION_RESULT
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
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
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The result of the tokenization request. */
    class TokenizationResultDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val issuerDecision: JsonField<String>,
        private val tokenizationDeclineReasons: JsonField<List<TokenizationDeclineReason>>,
        private val customerDecision: JsonField<String>,
        private val ruleResults: JsonField<List<TokenizationRuleResult>>,
        private val tokenActivatedDateTime: JsonField<OffsetDateTime>,
        private val tokenizationTfaReasons: JsonField<List<TokenizationTfaReason>>,
        private val walletDecision: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("issuer_decision")
            @ExcludeMissing
            issuerDecision: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tokenization_decline_reasons")
            @ExcludeMissing
            tokenizationDeclineReasons: JsonField<List<TokenizationDeclineReason>> =
                JsonMissing.of(),
            @JsonProperty("customer_decision")
            @ExcludeMissing
            customerDecision: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rule_results")
            @ExcludeMissing
            ruleResults: JsonField<List<TokenizationRuleResult>> = JsonMissing.of(),
            @JsonProperty("token_activated_date_time")
            @ExcludeMissing
            tokenActivatedDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tokenization_tfa_reasons")
            @ExcludeMissing
            tokenizationTfaReasons: JsonField<List<TokenizationTfaReason>> = JsonMissing.of(),
            @JsonProperty("wallet_decision")
            @ExcludeMissing
            walletDecision: JsonField<String> = JsonMissing.of(),
        ) : this(
            issuerDecision,
            tokenizationDeclineReasons,
            customerDecision,
            ruleResults,
            tokenActivatedDateTime,
            tokenizationTfaReasons,
            walletDecision,
            mutableMapOf(),
        )

        /**
         * Lithic's tokenization decision.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun issuerDecision(): String = issuerDecision.getRequired("issuer_decision")

        /**
         * List of reasons why the tokenization was declined
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokenizationDeclineReasons(): List<TokenizationDeclineReason> =
            tokenizationDeclineReasons.getRequired("tokenization_decline_reasons")

        /**
         * The customer's tokenization decision if applicable.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerDecision(): Optional<String> = customerDecision.getOptional("customer_decision")

        /**
         * Results from rules that were evaluated for this tokenization
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ruleResults(): Optional<List<TokenizationRuleResult>> =
            ruleResults.getOptional("rule_results")

        /**
         * An RFC 3339 timestamp indicating when the tokenization succeeded.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenActivatedDateTime(): Optional<OffsetDateTime> =
            tokenActivatedDateTime.getOptional("token_activated_date_time")

        /**
         * List of reasons why two-factor authentication was required
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenizationTfaReasons(): Optional<List<TokenizationTfaReason>> =
            tokenizationTfaReasons.getOptional("tokenization_tfa_reasons")

        /**
         * The wallet's recommended decision.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun walletDecision(): Optional<String> = walletDecision.getOptional("wallet_decision")

        /**
         * Returns the raw JSON value of [issuerDecision].
         *
         * Unlike [issuerDecision], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("issuer_decision")
        @ExcludeMissing
        fun _issuerDecision(): JsonField<String> = issuerDecision

        /**
         * Returns the raw JSON value of [tokenizationDeclineReasons].
         *
         * Unlike [tokenizationDeclineReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tokenization_decline_reasons")
        @ExcludeMissing
        fun _tokenizationDeclineReasons(): JsonField<List<TokenizationDeclineReason>> =
            tokenizationDeclineReasons

        /**
         * Returns the raw JSON value of [customerDecision].
         *
         * Unlike [customerDecision], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_decision")
        @ExcludeMissing
        fun _customerDecision(): JsonField<String> = customerDecision

        /**
         * Returns the raw JSON value of [ruleResults].
         *
         * Unlike [ruleResults], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_results")
        @ExcludeMissing
        fun _ruleResults(): JsonField<List<TokenizationRuleResult>> = ruleResults

        /**
         * Returns the raw JSON value of [tokenActivatedDateTime].
         *
         * Unlike [tokenActivatedDateTime], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("token_activated_date_time")
        @ExcludeMissing
        fun _tokenActivatedDateTime(): JsonField<OffsetDateTime> = tokenActivatedDateTime

        /**
         * Returns the raw JSON value of [tokenizationTfaReasons].
         *
         * Unlike [tokenizationTfaReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tokenization_tfa_reasons")
        @ExcludeMissing
        fun _tokenizationTfaReasons(): JsonField<List<TokenizationTfaReason>> =
            tokenizationTfaReasons

        /**
         * Returns the raw JSON value of [walletDecision].
         *
         * Unlike [walletDecision], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wallet_decision")
        @ExcludeMissing
        fun _walletDecision(): JsonField<String> = walletDecision

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
             * [TokenizationResultDetails].
             *
             * The following fields are required:
             * ```java
             * .issuerDecision()
             * .tokenizationDeclineReasons()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TokenizationResultDetails]. */
        class Builder internal constructor() {

            private var issuerDecision: JsonField<String>? = null
            private var tokenizationDeclineReasons:
                JsonField<MutableList<TokenizationDeclineReason>>? =
                null
            private var customerDecision: JsonField<String> = JsonMissing.of()
            private var ruleResults: JsonField<MutableList<TokenizationRuleResult>>? = null
            private var tokenActivatedDateTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tokenizationTfaReasons: JsonField<MutableList<TokenizationTfaReason>>? =
                null
            private var walletDecision: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenizationResultDetails: TokenizationResultDetails) = apply {
                issuerDecision = tokenizationResultDetails.issuerDecision
                tokenizationDeclineReasons =
                    tokenizationResultDetails.tokenizationDeclineReasons.map { it.toMutableList() }
                customerDecision = tokenizationResultDetails.customerDecision
                ruleResults = tokenizationResultDetails.ruleResults.map { it.toMutableList() }
                tokenActivatedDateTime = tokenizationResultDetails.tokenActivatedDateTime
                tokenizationTfaReasons =
                    tokenizationResultDetails.tokenizationTfaReasons.map { it.toMutableList() }
                walletDecision = tokenizationResultDetails.walletDecision
                additionalProperties = tokenizationResultDetails.additionalProperties.toMutableMap()
            }

            /** Lithic's tokenization decision. */
            fun issuerDecision(issuerDecision: String) =
                issuerDecision(JsonField.of(issuerDecision))

            /**
             * Sets [Builder.issuerDecision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuerDecision] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuerDecision(issuerDecision: JsonField<String>) = apply {
                this.issuerDecision = issuerDecision
            }

            /** List of reasons why the tokenization was declined */
            fun tokenizationDeclineReasons(
                tokenizationDeclineReasons: List<TokenizationDeclineReason>
            ) = tokenizationDeclineReasons(JsonField.of(tokenizationDeclineReasons))

            /**
             * Sets [Builder.tokenizationDeclineReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenizationDeclineReasons] with a well-typed
             * `List<TokenizationDeclineReason>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun tokenizationDeclineReasons(
                tokenizationDeclineReasons: JsonField<List<TokenizationDeclineReason>>
            ) = apply {
                this.tokenizationDeclineReasons =
                    tokenizationDeclineReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [TokenizationDeclineReason] to [tokenizationDeclineReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTokenizationDeclineReason(tokenizationDeclineReason: TokenizationDeclineReason) =
                apply {
                    tokenizationDeclineReasons =
                        (tokenizationDeclineReasons ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tokenizationDeclineReasons", it)
                                .add(tokenizationDeclineReason)
                        }
                }

            /** The customer's tokenization decision if applicable. */
            fun customerDecision(customerDecision: String?) =
                customerDecision(JsonField.ofNullable(customerDecision))

            /**
             * Alias for calling [Builder.customerDecision] with `customerDecision.orElse(null)`.
             */
            fun customerDecision(customerDecision: Optional<String>) =
                customerDecision(customerDecision.getOrNull())

            /**
             * Sets [Builder.customerDecision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerDecision] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerDecision(customerDecision: JsonField<String>) = apply {
                this.customerDecision = customerDecision
            }

            /** Results from rules that were evaluated for this tokenization */
            fun ruleResults(ruleResults: List<TokenizationRuleResult>) =
                ruleResults(JsonField.of(ruleResults))

            /**
             * Sets [Builder.ruleResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleResults] with a well-typed
             * `List<TokenizationRuleResult>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun ruleResults(ruleResults: JsonField<List<TokenizationRuleResult>>) = apply {
                this.ruleResults = ruleResults.map { it.toMutableList() }
            }

            /**
             * Adds a single [TokenizationRuleResult] to [ruleResults].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRuleResult(ruleResult: TokenizationRuleResult) = apply {
                ruleResults =
                    (ruleResults ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ruleResults", it).add(ruleResult)
                    }
            }

            /** An RFC 3339 timestamp indicating when the tokenization succeeded. */
            fun tokenActivatedDateTime(tokenActivatedDateTime: OffsetDateTime?) =
                tokenActivatedDateTime(JsonField.ofNullable(tokenActivatedDateTime))

            /**
             * Alias for calling [Builder.tokenActivatedDateTime] with
             * `tokenActivatedDateTime.orElse(null)`.
             */
            fun tokenActivatedDateTime(tokenActivatedDateTime: Optional<OffsetDateTime>) =
                tokenActivatedDateTime(tokenActivatedDateTime.getOrNull())

            /**
             * Sets [Builder.tokenActivatedDateTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenActivatedDateTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun tokenActivatedDateTime(tokenActivatedDateTime: JsonField<OffsetDateTime>) = apply {
                this.tokenActivatedDateTime = tokenActivatedDateTime
            }

            /** List of reasons why two-factor authentication was required */
            fun tokenizationTfaReasons(tokenizationTfaReasons: List<TokenizationTfaReason>) =
                tokenizationTfaReasons(JsonField.of(tokenizationTfaReasons))

            /**
             * Sets [Builder.tokenizationTfaReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenizationTfaReasons] with a well-typed
             * `List<TokenizationTfaReason>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun tokenizationTfaReasons(
                tokenizationTfaReasons: JsonField<List<TokenizationTfaReason>>
            ) = apply {
                this.tokenizationTfaReasons = tokenizationTfaReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [TokenizationTfaReason] to [tokenizationTfaReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTokenizationTfaReason(tokenizationTfaReason: TokenizationTfaReason) = apply {
                tokenizationTfaReasons =
                    (tokenizationTfaReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tokenizationTfaReasons", it).add(tokenizationTfaReason)
                    }
            }

            /** The wallet's recommended decision. */
            fun walletDecision(walletDecision: String?) =
                walletDecision(JsonField.ofNullable(walletDecision))

            /** Alias for calling [Builder.walletDecision] with `walletDecision.orElse(null)`. */
            fun walletDecision(walletDecision: Optional<String>) =
                walletDecision(walletDecision.getOrNull())

            /**
             * Sets [Builder.walletDecision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.walletDecision] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun walletDecision(walletDecision: JsonField<String>) = apply {
                this.walletDecision = walletDecision
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
             * Returns an immutable instance of [TokenizationResultDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .issuerDecision()
             * .tokenizationDeclineReasons()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TokenizationResultDetails =
                TokenizationResultDetails(
                    checkRequired("issuerDecision", issuerDecision),
                    checkRequired("tokenizationDeclineReasons", tokenizationDeclineReasons).map {
                        it.toImmutable()
                    },
                    customerDecision,
                    (ruleResults ?: JsonMissing.of()).map { it.toImmutable() },
                    tokenActivatedDateTime,
                    (tokenizationTfaReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    walletDecision,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TokenizationResultDetails = apply {
            if (validated) {
                return@apply
            }

            issuerDecision()
            tokenizationDeclineReasons().forEach { it.validate() }
            customerDecision()
            ruleResults().ifPresent { it.forEach { it.validate() } }
            tokenActivatedDateTime()
            tokenizationTfaReasons().ifPresent { it.forEach { it.validate() } }
            walletDecision()
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
            (if (issuerDecision.asKnown().isPresent) 1 else 0) +
                (tokenizationDeclineReasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (customerDecision.asKnown().isPresent) 1 else 0) +
                (ruleResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (tokenActivatedDateTime.asKnown().isPresent) 1 else 0) +
                (tokenizationTfaReasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (walletDecision.asKnown().isPresent) 1 else 0)

        class TokenizationDeclineReason
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCOUNT_SCORE_1 = of("ACCOUNT_SCORE_1")

                @JvmField
                val ALL_WALLET_DECLINE_REASONS_PRESENT = of("ALL_WALLET_DECLINE_REASONS_PRESENT")

                @JvmField val CARD_EXPIRY_MONTH_MISMATCH = of("CARD_EXPIRY_MONTH_MISMATCH")

                @JvmField val CARD_EXPIRY_YEAR_MISMATCH = of("CARD_EXPIRY_YEAR_MISMATCH")

                @JvmField val CARD_INVALID_STATE = of("CARD_INVALID_STATE")

                @JvmField val CUSTOMER_RED_PATH = of("CUSTOMER_RED_PATH")

                @JvmField val CVC_MISMATCH = of("CVC_MISMATCH")

                @JvmField val DEVICE_SCORE_1 = of("DEVICE_SCORE_1")

                @JvmField val GENERIC_DECLINE = of("GENERIC_DECLINE")

                @JvmField val INVALID_CUSTOMER_RESPONSE = of("INVALID_CUSTOMER_RESPONSE")

                @JvmField val NETWORK_FAILURE = of("NETWORK_FAILURE")

                @JvmField
                val WALLET_RECOMMENDED_DECISION_RED = of("WALLET_RECOMMENDED_DECISION_RED")

                @JvmStatic fun of(value: String) = TokenizationDeclineReason(JsonField.of(value))
            }

            /** An enum containing [TokenizationDeclineReason]'s known values. */
            enum class Known {
                ACCOUNT_SCORE_1,
                ALL_WALLET_DECLINE_REASONS_PRESENT,
                CARD_EXPIRY_MONTH_MISMATCH,
                CARD_EXPIRY_YEAR_MISMATCH,
                CARD_INVALID_STATE,
                CUSTOMER_RED_PATH,
                CVC_MISMATCH,
                DEVICE_SCORE_1,
                GENERIC_DECLINE,
                INVALID_CUSTOMER_RESPONSE,
                NETWORK_FAILURE,
                WALLET_RECOMMENDED_DECISION_RED,
            }

            /**
             * An enum containing [TokenizationDeclineReason]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [TokenizationDeclineReason] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_SCORE_1,
                ALL_WALLET_DECLINE_REASONS_PRESENT,
                CARD_EXPIRY_MONTH_MISMATCH,
                CARD_EXPIRY_YEAR_MISMATCH,
                CARD_INVALID_STATE,
                CUSTOMER_RED_PATH,
                CVC_MISMATCH,
                DEVICE_SCORE_1,
                GENERIC_DECLINE,
                INVALID_CUSTOMER_RESPONSE,
                NETWORK_FAILURE,
                WALLET_RECOMMENDED_DECISION_RED,
                /**
                 * An enum member indicating that [TokenizationDeclineReason] was instantiated with
                 * an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_SCORE_1 -> Value.ACCOUNT_SCORE_1
                    ALL_WALLET_DECLINE_REASONS_PRESENT -> Value.ALL_WALLET_DECLINE_REASONS_PRESENT
                    CARD_EXPIRY_MONTH_MISMATCH -> Value.CARD_EXPIRY_MONTH_MISMATCH
                    CARD_EXPIRY_YEAR_MISMATCH -> Value.CARD_EXPIRY_YEAR_MISMATCH
                    CARD_INVALID_STATE -> Value.CARD_INVALID_STATE
                    CUSTOMER_RED_PATH -> Value.CUSTOMER_RED_PATH
                    CVC_MISMATCH -> Value.CVC_MISMATCH
                    DEVICE_SCORE_1 -> Value.DEVICE_SCORE_1
                    GENERIC_DECLINE -> Value.GENERIC_DECLINE
                    INVALID_CUSTOMER_RESPONSE -> Value.INVALID_CUSTOMER_RESPONSE
                    NETWORK_FAILURE -> Value.NETWORK_FAILURE
                    WALLET_RECOMMENDED_DECISION_RED -> Value.WALLET_RECOMMENDED_DECISION_RED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_SCORE_1 -> Known.ACCOUNT_SCORE_1
                    ALL_WALLET_DECLINE_REASONS_PRESENT -> Known.ALL_WALLET_DECLINE_REASONS_PRESENT
                    CARD_EXPIRY_MONTH_MISMATCH -> Known.CARD_EXPIRY_MONTH_MISMATCH
                    CARD_EXPIRY_YEAR_MISMATCH -> Known.CARD_EXPIRY_YEAR_MISMATCH
                    CARD_INVALID_STATE -> Known.CARD_INVALID_STATE
                    CUSTOMER_RED_PATH -> Known.CUSTOMER_RED_PATH
                    CVC_MISMATCH -> Known.CVC_MISMATCH
                    DEVICE_SCORE_1 -> Known.DEVICE_SCORE_1
                    GENERIC_DECLINE -> Known.GENERIC_DECLINE
                    INVALID_CUSTOMER_RESPONSE -> Known.INVALID_CUSTOMER_RESPONSE
                    NETWORK_FAILURE -> Known.NETWORK_FAILURE
                    WALLET_RECOMMENDED_DECISION_RED -> Known.WALLET_RECOMMENDED_DECISION_RED
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown TokenizationDeclineReason: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): TokenizationDeclineReason = apply {
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

                return other is TokenizationDeclineReason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenizationResultDetails &&
                issuerDecision == other.issuerDecision &&
                tokenizationDeclineReasons == other.tokenizationDeclineReasons &&
                customerDecision == other.customerDecision &&
                ruleResults == other.ruleResults &&
                tokenActivatedDateTime == other.tokenActivatedDateTime &&
                tokenizationTfaReasons == other.tokenizationTfaReasons &&
                walletDecision == other.walletDecision &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                issuerDecision,
                tokenizationDeclineReasons,
                customerDecision,
                ruleResults,
                tokenActivatedDateTime,
                tokenizationTfaReasons,
                walletDecision,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationResultDetails{issuerDecision=$issuerDecision, tokenizationDeclineReasons=$tokenizationDeclineReasons, customerDecision=$customerDecision, ruleResults=$ruleResults, tokenActivatedDateTime=$tokenActivatedDateTime, tokenizationTfaReasons=$tokenizationTfaReasons, walletDecision=$walletDecision, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalWalletTokenizationResultWebhookEvent &&
            accountToken == other.accountToken &&
            cardToken == other.cardToken &&
            created == other.created &&
            eventType == other.eventType &&
            tokenizationResultDetails == other.tokenizationResultDetails &&
            tokenizationToken == other.tokenizationToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountToken,
            cardToken,
            created,
            eventType,
            tokenizationResultDetails,
            tokenizationToken,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalWalletTokenizationResultWebhookEvent{accountToken=$accountToken, cardToken=$cardToken, created=$created, eventType=$eventType, tokenizationResultDetails=$tokenizationResultDetails, tokenizationToken=$tokenizationToken, additionalProperties=$additionalProperties}"
}
