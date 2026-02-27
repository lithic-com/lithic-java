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

class DigitalWalletTokenizationApprovalRequestWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val customerTokenizationDecision: JsonField<CustomerTokenizationDecision>,
    private val digitalWalletTokenMetadata: JsonField<TokenMetadata>,
    private val eventType: JsonField<EventType>,
    private val issuerDecision: JsonField<IssuerDecision>,
    private val tokenizationChannel: JsonField<TokenizationChannel>,
    private val tokenizationToken: JsonField<String>,
    private val walletDecisioningInfo: JsonField<WalletDecisioningInfo>,
    private val device: JsonField<Device>,
    private val ruleResults: JsonField<List<TokenizationRuleResult>>,
    private val tokenizationDeclineReasons: JsonField<List<TokenizationDeclineReason>>,
    private val tokenizationSource: JsonField<TokenizationSource>,
    private val tokenizationTfaReasons: JsonField<List<TokenizationTfaReason>>,
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
        @JsonProperty("customer_tokenization_decision")
        @ExcludeMissing
        customerTokenizationDecision: JsonField<CustomerTokenizationDecision> = JsonMissing.of(),
        @JsonProperty("digital_wallet_token_metadata")
        @ExcludeMissing
        digitalWalletTokenMetadata: JsonField<TokenMetadata> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("issuer_decision")
        @ExcludeMissing
        issuerDecision: JsonField<IssuerDecision> = JsonMissing.of(),
        @JsonProperty("tokenization_channel")
        @ExcludeMissing
        tokenizationChannel: JsonField<TokenizationChannel> = JsonMissing.of(),
        @JsonProperty("tokenization_token")
        @ExcludeMissing
        tokenizationToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wallet_decisioning_info")
        @ExcludeMissing
        walletDecisioningInfo: JsonField<WalletDecisioningInfo> = JsonMissing.of(),
        @JsonProperty("device") @ExcludeMissing device: JsonField<Device> = JsonMissing.of(),
        @JsonProperty("rule_results")
        @ExcludeMissing
        ruleResults: JsonField<List<TokenizationRuleResult>> = JsonMissing.of(),
        @JsonProperty("tokenization_decline_reasons")
        @ExcludeMissing
        tokenizationDeclineReasons: JsonField<List<TokenizationDeclineReason>> = JsonMissing.of(),
        @JsonProperty("tokenization_source")
        @ExcludeMissing
        tokenizationSource: JsonField<TokenizationSource> = JsonMissing.of(),
        @JsonProperty("tokenization_tfa_reasons")
        @ExcludeMissing
        tokenizationTfaReasons: JsonField<List<TokenizationTfaReason>> = JsonMissing.of(),
    ) : this(
        accountToken,
        cardToken,
        created,
        customerTokenizationDecision,
        digitalWalletTokenMetadata,
        eventType,
        issuerDecision,
        tokenizationChannel,
        tokenizationToken,
        walletDecisioningInfo,
        device,
        ruleResults,
        tokenizationDeclineReasons,
        tokenizationSource,
        tokenizationTfaReasons,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the user tokenizing a card
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Unique identifier for the card being tokenized
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Indicate when the request was received from Mastercard or Visa
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Contains the metadata for the customer tokenization decision.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerTokenizationDecision(): Optional<CustomerTokenizationDecision> =
        customerTokenizationDecision.getOptional("customer_tokenization_decision")

    /**
     * Contains the metadata for the digital wallet being tokenized.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun digitalWalletTokenMetadata(): TokenMetadata =
        digitalWalletTokenMetadata.getRequired("digital_wallet_token_metadata")

    /**
     * The name of this event
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Whether Lithic decisioned on the token, and if so, what the decision was.
     * APPROVED/VERIFICATION_REQUIRED/DENIED.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun issuerDecision(): IssuerDecision = issuerDecision.getRequired("issuer_decision")

    /**
     * The channel through which the tokenization was made.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizationChannel(): TokenizationChannel =
        tokenizationChannel.getRequired("tokenization_channel")

    /**
     * Unique identifier for the digital wallet token attempt
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizationToken(): String = tokenizationToken.getRequired("tokenization_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun walletDecisioningInfo(): WalletDecisioningInfo =
        walletDecisioningInfo.getRequired("wallet_decisioning_info")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun device(): Optional<Device> = device.getOptional("device")

    /**
     * Results from rules that were evaluated for this tokenization
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ruleResults(): Optional<List<TokenizationRuleResult>> =
        ruleResults.getOptional("rule_results")

    /**
     * List of reasons why the tokenization was declined
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenizationDeclineReasons(): Optional<List<TokenizationDeclineReason>> =
        tokenizationDeclineReasons.getOptional("tokenization_decline_reasons")

    /**
     * The source of the tokenization.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenizationSource(): Optional<TokenizationSource> =
        tokenizationSource.getOptional("tokenization_source")

    /**
     * List of reasons why two-factor authentication was required
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenizationTfaReasons(): Optional<List<TokenizationTfaReason>> =
        tokenizationTfaReasons.getOptional("tokenization_tfa_reasons")

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
     * Returns the raw JSON value of [customerTokenizationDecision].
     *
     * Unlike [customerTokenizationDecision], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customer_tokenization_decision")
    @ExcludeMissing
    fun _customerTokenizationDecision(): JsonField<CustomerTokenizationDecision> =
        customerTokenizationDecision

    /**
     * Returns the raw JSON value of [digitalWalletTokenMetadata].
     *
     * Unlike [digitalWalletTokenMetadata], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("digital_wallet_token_metadata")
    @ExcludeMissing
    fun _digitalWalletTokenMetadata(): JsonField<TokenMetadata> = digitalWalletTokenMetadata

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [issuerDecision].
     *
     * Unlike [issuerDecision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issuer_decision")
    @ExcludeMissing
    fun _issuerDecision(): JsonField<IssuerDecision> = issuerDecision

    /**
     * Returns the raw JSON value of [tokenizationChannel].
     *
     * Unlike [tokenizationChannel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tokenization_channel")
    @ExcludeMissing
    fun _tokenizationChannel(): JsonField<TokenizationChannel> = tokenizationChannel

    /**
     * Returns the raw JSON value of [tokenizationToken].
     *
     * Unlike [tokenizationToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tokenization_token")
    @ExcludeMissing
    fun _tokenizationToken(): JsonField<String> = tokenizationToken

    /**
     * Returns the raw JSON value of [walletDecisioningInfo].
     *
     * Unlike [walletDecisioningInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("wallet_decisioning_info")
    @ExcludeMissing
    fun _walletDecisioningInfo(): JsonField<WalletDecisioningInfo> = walletDecisioningInfo

    /**
     * Returns the raw JSON value of [device].
     *
     * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device") @ExcludeMissing fun _device(): JsonField<Device> = device

    /**
     * Returns the raw JSON value of [ruleResults].
     *
     * Unlike [ruleResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rule_results")
    @ExcludeMissing
    fun _ruleResults(): JsonField<List<TokenizationRuleResult>> = ruleResults

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
     * Returns the raw JSON value of [tokenizationSource].
     *
     * Unlike [tokenizationSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tokenization_source")
    @ExcludeMissing
    fun _tokenizationSource(): JsonField<TokenizationSource> = tokenizationSource

    /**
     * Returns the raw JSON value of [tokenizationTfaReasons].
     *
     * Unlike [tokenizationTfaReasons], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("tokenization_tfa_reasons")
    @ExcludeMissing
    fun _tokenizationTfaReasons(): JsonField<List<TokenizationTfaReason>> = tokenizationTfaReasons

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
         * [DigitalWalletTokenizationApprovalRequestWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .cardToken()
         * .created()
         * .customerTokenizationDecision()
         * .digitalWalletTokenMetadata()
         * .eventType()
         * .issuerDecision()
         * .tokenizationChannel()
         * .tokenizationToken()
         * .walletDecisioningInfo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalWalletTokenizationApprovalRequestWebhookEvent]. */
    class Builder internal constructor() {

        private var accountToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var customerTokenizationDecision: JsonField<CustomerTokenizationDecision>? = null
        private var digitalWalletTokenMetadata: JsonField<TokenMetadata>? = null
        private var eventType: JsonField<EventType>? = null
        private var issuerDecision: JsonField<IssuerDecision>? = null
        private var tokenizationChannel: JsonField<TokenizationChannel>? = null
        private var tokenizationToken: JsonField<String>? = null
        private var walletDecisioningInfo: JsonField<WalletDecisioningInfo>? = null
        private var device: JsonField<Device> = JsonMissing.of()
        private var ruleResults: JsonField<MutableList<TokenizationRuleResult>>? = null
        private var tokenizationDeclineReasons: JsonField<MutableList<TokenizationDeclineReason>>? =
            null
        private var tokenizationSource: JsonField<TokenizationSource> = JsonMissing.of()
        private var tokenizationTfaReasons: JsonField<MutableList<TokenizationTfaReason>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            digitalWalletTokenizationApprovalRequestWebhookEvent:
                DigitalWalletTokenizationApprovalRequestWebhookEvent
        ) = apply {
            accountToken = digitalWalletTokenizationApprovalRequestWebhookEvent.accountToken
            cardToken = digitalWalletTokenizationApprovalRequestWebhookEvent.cardToken
            created = digitalWalletTokenizationApprovalRequestWebhookEvent.created
            customerTokenizationDecision =
                digitalWalletTokenizationApprovalRequestWebhookEvent.customerTokenizationDecision
            digitalWalletTokenMetadata =
                digitalWalletTokenizationApprovalRequestWebhookEvent.digitalWalletTokenMetadata
            eventType = digitalWalletTokenizationApprovalRequestWebhookEvent.eventType
            issuerDecision = digitalWalletTokenizationApprovalRequestWebhookEvent.issuerDecision
            tokenizationChannel =
                digitalWalletTokenizationApprovalRequestWebhookEvent.tokenizationChannel
            tokenizationToken =
                digitalWalletTokenizationApprovalRequestWebhookEvent.tokenizationToken
            walletDecisioningInfo =
                digitalWalletTokenizationApprovalRequestWebhookEvent.walletDecisioningInfo
            device = digitalWalletTokenizationApprovalRequestWebhookEvent.device
            ruleResults =
                digitalWalletTokenizationApprovalRequestWebhookEvent.ruleResults.map {
                    it.toMutableList()
                }
            tokenizationDeclineReasons =
                digitalWalletTokenizationApprovalRequestWebhookEvent.tokenizationDeclineReasons
                    .map { it.toMutableList() }
            tokenizationSource =
                digitalWalletTokenizationApprovalRequestWebhookEvent.tokenizationSource
            tokenizationTfaReasons =
                digitalWalletTokenizationApprovalRequestWebhookEvent.tokenizationTfaReasons.map {
                    it.toMutableList()
                }
            additionalProperties =
                digitalWalletTokenizationApprovalRequestWebhookEvent.additionalProperties
                    .toMutableMap()
        }

        /** Unique identifier for the user tokenizing a card */
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

        /** Unique identifier for the card being tokenized */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Indicate when the request was received from Mastercard or Visa */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Contains the metadata for the customer tokenization decision. */
        fun customerTokenizationDecision(
            customerTokenizationDecision: CustomerTokenizationDecision?
        ) = customerTokenizationDecision(JsonField.ofNullable(customerTokenizationDecision))

        /**
         * Alias for calling [Builder.customerTokenizationDecision] with
         * `customerTokenizationDecision.orElse(null)`.
         */
        fun customerTokenizationDecision(
            customerTokenizationDecision: Optional<CustomerTokenizationDecision>
        ) = customerTokenizationDecision(customerTokenizationDecision.getOrNull())

        /**
         * Sets [Builder.customerTokenizationDecision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerTokenizationDecision] with a well-typed
         * [CustomerTokenizationDecision] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customerTokenizationDecision(
            customerTokenizationDecision: JsonField<CustomerTokenizationDecision>
        ) = apply { this.customerTokenizationDecision = customerTokenizationDecision }

        /** Contains the metadata for the digital wallet being tokenized. */
        fun digitalWalletTokenMetadata(digitalWalletTokenMetadata: TokenMetadata) =
            digitalWalletTokenMetadata(JsonField.of(digitalWalletTokenMetadata))

        /**
         * Sets [Builder.digitalWalletTokenMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalWalletTokenMetadata] with a well-typed
         * [TokenMetadata] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun digitalWalletTokenMetadata(digitalWalletTokenMetadata: JsonField<TokenMetadata>) =
            apply {
                this.digitalWalletTokenMetadata = digitalWalletTokenMetadata
            }

        /** The name of this event */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /**
         * Whether Lithic decisioned on the token, and if so, what the decision was.
         * APPROVED/VERIFICATION_REQUIRED/DENIED.
         */
        fun issuerDecision(issuerDecision: IssuerDecision) =
            issuerDecision(JsonField.of(issuerDecision))

        /**
         * Sets [Builder.issuerDecision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuerDecision] with a well-typed [IssuerDecision] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuerDecision(issuerDecision: JsonField<IssuerDecision>) = apply {
            this.issuerDecision = issuerDecision
        }

        /** The channel through which the tokenization was made. */
        fun tokenizationChannel(tokenizationChannel: TokenizationChannel) =
            tokenizationChannel(JsonField.of(tokenizationChannel))

        /**
         * Sets [Builder.tokenizationChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationChannel] with a well-typed
         * [TokenizationChannel] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tokenizationChannel(tokenizationChannel: JsonField<TokenizationChannel>) = apply {
            this.tokenizationChannel = tokenizationChannel
        }

        /** Unique identifier for the digital wallet token attempt */
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

        fun walletDecisioningInfo(walletDecisioningInfo: WalletDecisioningInfo) =
            walletDecisioningInfo(JsonField.of(walletDecisioningInfo))

        /**
         * Sets [Builder.walletDecisioningInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.walletDecisioningInfo] with a well-typed
         * [WalletDecisioningInfo] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun walletDecisioningInfo(walletDecisioningInfo: JsonField<WalletDecisioningInfo>) = apply {
            this.walletDecisioningInfo = walletDecisioningInfo
        }

        fun device(device: Device) = device(JsonField.of(device))

        /**
         * Sets [Builder.device] to an arbitrary JSON value.
         *
         * You should usually call [Builder.device] with a well-typed [Device] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun device(device: JsonField<Device>) = apply { this.device = device }

        /** Results from rules that were evaluated for this tokenization */
        fun ruleResults(ruleResults: List<TokenizationRuleResult>) =
            ruleResults(JsonField.of(ruleResults))

        /**
         * Sets [Builder.ruleResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleResults] with a well-typed
         * `List<TokenizationRuleResult>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
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

        /** List of reasons why the tokenization was declined */
        fun tokenizationDeclineReasons(
            tokenizationDeclineReasons: List<TokenizationDeclineReason>
        ) = tokenizationDeclineReasons(JsonField.of(tokenizationDeclineReasons))

        /**
         * Sets [Builder.tokenizationDeclineReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationDeclineReasons] with a well-typed
         * `List<TokenizationDeclineReason>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun tokenizationDeclineReasons(
            tokenizationDeclineReasons: JsonField<List<TokenizationDeclineReason>>
        ) = apply {
            this.tokenizationDeclineReasons = tokenizationDeclineReasons.map { it.toMutableList() }
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
                        checkKnown("tokenizationDeclineReasons", it).add(tokenizationDeclineReason)
                    }
            }

        /** The source of the tokenization. */
        fun tokenizationSource(tokenizationSource: TokenizationSource) =
            tokenizationSource(JsonField.of(tokenizationSource))

        /**
         * Sets [Builder.tokenizationSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationSource] with a well-typed
         * [TokenizationSource] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tokenizationSource(tokenizationSource: JsonField<TokenizationSource>) = apply {
            this.tokenizationSource = tokenizationSource
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
        fun tokenizationTfaReasons(tokenizationTfaReasons: JsonField<List<TokenizationTfaReason>>) =
            apply {
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
         * Returns an immutable instance of [DigitalWalletTokenizationApprovalRequestWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountToken()
         * .cardToken()
         * .created()
         * .customerTokenizationDecision()
         * .digitalWalletTokenMetadata()
         * .eventType()
         * .issuerDecision()
         * .tokenizationChannel()
         * .tokenizationToken()
         * .walletDecisioningInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalWalletTokenizationApprovalRequestWebhookEvent =
            DigitalWalletTokenizationApprovalRequestWebhookEvent(
                checkRequired("accountToken", accountToken),
                checkRequired("cardToken", cardToken),
                checkRequired("created", created),
                checkRequired("customerTokenizationDecision", customerTokenizationDecision),
                checkRequired("digitalWalletTokenMetadata", digitalWalletTokenMetadata),
                checkRequired("eventType", eventType),
                checkRequired("issuerDecision", issuerDecision),
                checkRequired("tokenizationChannel", tokenizationChannel),
                checkRequired("tokenizationToken", tokenizationToken),
                checkRequired("walletDecisioningInfo", walletDecisioningInfo),
                device,
                (ruleResults ?: JsonMissing.of()).map { it.toImmutable() },
                (tokenizationDeclineReasons ?: JsonMissing.of()).map { it.toImmutable() },
                tokenizationSource,
                (tokenizationTfaReasons ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DigitalWalletTokenizationApprovalRequestWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accountToken()
        cardToken()
        created()
        customerTokenizationDecision().ifPresent { it.validate() }
        digitalWalletTokenMetadata().validate()
        eventType().validate()
        issuerDecision().validate()
        tokenizationChannel().validate()
        tokenizationToken()
        walletDecisioningInfo().validate()
        device().ifPresent { it.validate() }
        ruleResults().ifPresent { it.forEach { it.validate() } }
        tokenizationDeclineReasons().ifPresent { it.forEach { it.validate() } }
        tokenizationSource().ifPresent { it.validate() }
        tokenizationTfaReasons().ifPresent { it.forEach { it.validate() } }
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
            (customerTokenizationDecision.asKnown().getOrNull()?.validity() ?: 0) +
            (digitalWalletTokenMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (issuerDecision.asKnown().getOrNull()?.validity() ?: 0) +
            (tokenizationChannel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tokenizationToken.asKnown().isPresent) 1 else 0) +
            (walletDecisioningInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (device.asKnown().getOrNull()?.validity() ?: 0) +
            (ruleResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (tokenizationDeclineReasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (tokenizationSource.asKnown().getOrNull()?.validity() ?: 0) +
            (tokenizationTfaReasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Contains the metadata for the customer tokenization decision. */
    class CustomerTokenizationDecision
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val outcome: JsonField<Outcome>,
        private val responderUrl: JsonField<String>,
        private val latency: JsonField<String>,
        private val responseCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
            @JsonProperty("responder_url")
            @ExcludeMissing
            responderUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latency") @ExcludeMissing latency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_code")
            @ExcludeMissing
            responseCode: JsonField<String> = JsonMissing.of(),
        ) : this(outcome, responderUrl, latency, responseCode, mutableMapOf())

        /**
         * The outcome of the customer's decision
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outcome(): Outcome = outcome.getRequired("outcome")

        /**
         * The customer's subscribed URL
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun responderUrl(): String = responderUrl.getRequired("responder_url")

        /**
         * Time in ms it took for the customer's URL to respond
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latency(): Optional<String> = latency.getOptional("latency")

        /**
         * The response code that the customer provided
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseCode(): Optional<String> = responseCode.getOptional("response_code")

        /**
         * Returns the raw JSON value of [outcome].
         *
         * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

        /**
         * Returns the raw JSON value of [responderUrl].
         *
         * Unlike [responderUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("responder_url")
        @ExcludeMissing
        fun _responderUrl(): JsonField<String> = responderUrl

        /**
         * Returns the raw JSON value of [latency].
         *
         * Unlike [latency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latency") @ExcludeMissing fun _latency(): JsonField<String> = latency

        /**
         * Returns the raw JSON value of [responseCode].
         *
         * Unlike [responseCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_code")
        @ExcludeMissing
        fun _responseCode(): JsonField<String> = responseCode

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
             * [CustomerTokenizationDecision].
             *
             * The following fields are required:
             * ```java
             * .outcome()
             * .responderUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerTokenizationDecision]. */
        class Builder internal constructor() {

            private var outcome: JsonField<Outcome>? = null
            private var responderUrl: JsonField<String>? = null
            private var latency: JsonField<String> = JsonMissing.of()
            private var responseCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerTokenizationDecision: CustomerTokenizationDecision) = apply {
                outcome = customerTokenizationDecision.outcome
                responderUrl = customerTokenizationDecision.responderUrl
                latency = customerTokenizationDecision.latency
                responseCode = customerTokenizationDecision.responseCode
                additionalProperties =
                    customerTokenizationDecision.additionalProperties.toMutableMap()
            }

            /** The outcome of the customer's decision */
            fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

            /**
             * Sets [Builder.outcome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

            /** The customer's subscribed URL */
            fun responderUrl(responderUrl: String) = responderUrl(JsonField.of(responderUrl))

            /**
             * Sets [Builder.responderUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responderUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responderUrl(responderUrl: JsonField<String>) = apply {
                this.responderUrl = responderUrl
            }

            /** Time in ms it took for the customer's URL to respond */
            fun latency(latency: String) = latency(JsonField.of(latency))

            /**
             * Sets [Builder.latency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latency(latency: JsonField<String>) = apply { this.latency = latency }

            /** The response code that the customer provided */
            fun responseCode(responseCode: String) = responseCode(JsonField.of(responseCode))

            /**
             * Sets [Builder.responseCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseCode(responseCode: JsonField<String>) = apply {
                this.responseCode = responseCode
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
             * Returns an immutable instance of [CustomerTokenizationDecision].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .outcome()
             * .responderUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerTokenizationDecision =
                CustomerTokenizationDecision(
                    checkRequired("outcome", outcome),
                    checkRequired("responderUrl", responderUrl),
                    latency,
                    responseCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CustomerTokenizationDecision = apply {
            if (validated) {
                return@apply
            }

            outcome().validate()
            responderUrl()
            latency()
            responseCode()
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
            (outcome.asKnown().getOrNull()?.validity() ?: 0) +
                (if (responderUrl.asKnown().isPresent) 1 else 0) +
                (if (latency.asKnown().isPresent) 1 else 0) +
                (if (responseCode.asKnown().isPresent) 1 else 0)

        /** The outcome of the customer's decision */
        class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val ERROR = of("ERROR")

                @JvmField val INVALID_RESPONSE = of("INVALID_RESPONSE")

                @JvmField
                val REQUIRE_ADDITIONAL_AUTHENTICATION = of("REQUIRE_ADDITIONAL_AUTHENTICATION")

                @JvmField val TIMEOUT = of("TIMEOUT")

                @JvmStatic fun of(value: String) = Outcome(JsonField.of(value))
            }

            /** An enum containing [Outcome]'s known values. */
            enum class Known {
                APPROVED,
                DECLINED,
                ERROR,
                INVALID_RESPONSE,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TIMEOUT,
            }

            /**
             * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Outcome] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                DECLINED,
                ERROR,
                INVALID_RESPONSE,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TIMEOUT,
                /**
                 * An enum member indicating that [Outcome] was instantiated with an unknown value.
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
                    APPROVED -> Value.APPROVED
                    DECLINED -> Value.DECLINED
                    ERROR -> Value.ERROR
                    INVALID_RESPONSE -> Value.INVALID_RESPONSE
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Value.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TIMEOUT -> Value.TIMEOUT
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
                    APPROVED -> Known.APPROVED
                    DECLINED -> Known.DECLINED
                    ERROR -> Known.ERROR
                    INVALID_RESPONSE -> Known.INVALID_RESPONSE
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Known.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TIMEOUT -> Known.TIMEOUT
                    else -> throw LithicInvalidDataException("Unknown Outcome: $value")
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

            fun validate(): Outcome = apply {
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

                return other is Outcome && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerTokenizationDecision &&
                outcome == other.outcome &&
                responderUrl == other.responderUrl &&
                latency == other.latency &&
                responseCode == other.responseCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(outcome, responderUrl, latency, responseCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerTokenizationDecision{outcome=$outcome, responderUrl=$responderUrl, latency=$latency, responseCode=$responseCode, additionalProperties=$additionalProperties}"
    }

    /** The name of this event */
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
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                of("digital_wallet.tokenization_approval_request")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
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
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
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
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
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
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
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

    /**
     * Whether Lithic decisioned on the token, and if so, what the decision was.
     * APPROVED/VERIFICATION_REQUIRED/DENIED.
     */
    class IssuerDecision @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DENIED = of("DENIED")

            @JvmField val VERIFICATION_REQUIRED = of("VERIFICATION_REQUIRED")

            @JvmStatic fun of(value: String) = IssuerDecision(JsonField.of(value))
        }

        /** An enum containing [IssuerDecision]'s known values. */
        enum class Known {
            APPROVED,
            DENIED,
            VERIFICATION_REQUIRED,
        }

        /**
         * An enum containing [IssuerDecision]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IssuerDecision] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DENIED,
            VERIFICATION_REQUIRED,
            /**
             * An enum member indicating that [IssuerDecision] was instantiated with an unknown
             * value.
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
                APPROVED -> Value.APPROVED
                DENIED -> Value.DENIED
                VERIFICATION_REQUIRED -> Value.VERIFICATION_REQUIRED
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
                APPROVED -> Known.APPROVED
                DENIED -> Known.DENIED
                VERIFICATION_REQUIRED -> Known.VERIFICATION_REQUIRED
                else -> throw LithicInvalidDataException("Unknown IssuerDecision: $value")
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

        fun validate(): IssuerDecision = apply {
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

            return other is IssuerDecision && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The channel through which the tokenization was made. */
    class TokenizationChannel
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

            @JvmField val DIGITAL_WALLET = of("DIGITAL_WALLET")

            @JvmField val MERCHANT = of("MERCHANT")

            @JvmStatic fun of(value: String) = TokenizationChannel(JsonField.of(value))
        }

        /** An enum containing [TokenizationChannel]'s known values. */
        enum class Known {
            DIGITAL_WALLET,
            MERCHANT,
        }

        /**
         * An enum containing [TokenizationChannel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenizationChannel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DIGITAL_WALLET,
            MERCHANT,
            /**
             * An enum member indicating that [TokenizationChannel] was instantiated with an unknown
             * value.
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
                DIGITAL_WALLET -> Value.DIGITAL_WALLET
                MERCHANT -> Value.MERCHANT
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
                DIGITAL_WALLET -> Known.DIGITAL_WALLET
                MERCHANT -> Known.MERCHANT
                else -> throw LithicInvalidDataException("Unknown TokenizationChannel: $value")
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

        fun validate(): TokenizationChannel = apply {
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

            return other is TokenizationChannel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The source of the tokenization. */
    class TokenizationSource
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

            @JvmField val ACCOUNT_ON_FILE = of("ACCOUNT_ON_FILE")

            @JvmField val CONTACTLESS_TAP = of("CONTACTLESS_TAP")

            @JvmField val MANUAL_PROVISION = of("MANUAL_PROVISION")

            @JvmField val PUSH_PROVISION = of("PUSH_PROVISION")

            @JvmField val TOKEN = of("TOKEN")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = TokenizationSource(JsonField.of(value))
        }

        /** An enum containing [TokenizationSource]'s known values. */
        enum class Known {
            ACCOUNT_ON_FILE,
            CONTACTLESS_TAP,
            MANUAL_PROVISION,
            PUSH_PROVISION,
            TOKEN,
            UNKNOWN,
        }

        /**
         * An enum containing [TokenizationSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenizationSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_ON_FILE,
            CONTACTLESS_TAP,
            MANUAL_PROVISION,
            PUSH_PROVISION,
            TOKEN,
            UNKNOWN,
            /**
             * An enum member indicating that [TokenizationSource] was instantiated with an unknown
             * value.
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
                ACCOUNT_ON_FILE -> Value.ACCOUNT_ON_FILE
                CONTACTLESS_TAP -> Value.CONTACTLESS_TAP
                MANUAL_PROVISION -> Value.MANUAL_PROVISION
                PUSH_PROVISION -> Value.PUSH_PROVISION
                TOKEN -> Value.TOKEN
                UNKNOWN -> Value.UNKNOWN
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
                ACCOUNT_ON_FILE -> Known.ACCOUNT_ON_FILE
                CONTACTLESS_TAP -> Known.CONTACTLESS_TAP
                MANUAL_PROVISION -> Known.MANUAL_PROVISION
                PUSH_PROVISION -> Known.PUSH_PROVISION
                TOKEN -> Known.TOKEN
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown TokenizationSource: $value")
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

        fun validate(): TokenizationSource = apply {
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

            return other is TokenizationSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalWalletTokenizationApprovalRequestWebhookEvent &&
            accountToken == other.accountToken &&
            cardToken == other.cardToken &&
            created == other.created &&
            customerTokenizationDecision == other.customerTokenizationDecision &&
            digitalWalletTokenMetadata == other.digitalWalletTokenMetadata &&
            eventType == other.eventType &&
            issuerDecision == other.issuerDecision &&
            tokenizationChannel == other.tokenizationChannel &&
            tokenizationToken == other.tokenizationToken &&
            walletDecisioningInfo == other.walletDecisioningInfo &&
            device == other.device &&
            ruleResults == other.ruleResults &&
            tokenizationDeclineReasons == other.tokenizationDeclineReasons &&
            tokenizationSource == other.tokenizationSource &&
            tokenizationTfaReasons == other.tokenizationTfaReasons &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountToken,
            cardToken,
            created,
            customerTokenizationDecision,
            digitalWalletTokenMetadata,
            eventType,
            issuerDecision,
            tokenizationChannel,
            tokenizationToken,
            walletDecisioningInfo,
            device,
            ruleResults,
            tokenizationDeclineReasons,
            tokenizationSource,
            tokenizationTfaReasons,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalWalletTokenizationApprovalRequestWebhookEvent{accountToken=$accountToken, cardToken=$cardToken, created=$created, customerTokenizationDecision=$customerTokenizationDecision, digitalWalletTokenMetadata=$digitalWalletTokenMetadata, eventType=$eventType, issuerDecision=$issuerDecision, tokenizationChannel=$tokenizationChannel, tokenizationToken=$tokenizationToken, walletDecisioningInfo=$walletDecisioningInfo, device=$device, ruleResults=$ruleResults, tokenizationDeclineReasons=$tokenizationDeclineReasons, tokenizationSource=$tokenizationSource, tokenizationTfaReasons=$tokenizationTfaReasons, additionalProperties=$additionalProperties}"
}
