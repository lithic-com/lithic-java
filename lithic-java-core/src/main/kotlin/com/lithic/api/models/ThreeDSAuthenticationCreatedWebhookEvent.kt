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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a 3DS authentication */
class ThreeDSAuthenticationCreatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountType: JsonField<ThreeDSAuthentication.AccountType>,
    private val authenticationResult: JsonField<ThreeDSAuthentication.AuthenticationResult>,
    private val cardExpiryCheck: JsonField<ThreeDSAuthentication.CardExpiryCheck>,
    private val cardToken: JsonField<String>,
    private val cardholder: JsonField<ThreeDSAuthentication.Cardholder>,
    private val channel: JsonField<ThreeDSAuthentication.Channel>,
    private val created: JsonField<OffsetDateTime>,
    private val merchant: JsonField<ThreeDSAuthentication.Merchant>,
    private val messageCategory: JsonField<ThreeDSAuthentication.MessageCategory>,
    private val threeDSRequestorChallengeIndicator:
        JsonField<ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator>,
    private val additionalData: JsonField<ThreeDSAuthentication.AdditionalData>,
    private val app: JsonField<ThreeDSAuthentication.App>,
    private val authenticationRequestType:
        JsonField<ThreeDSAuthentication.AuthenticationRequestType>,
    private val browser: JsonField<ThreeDSAuthentication.Browser>,
    private val challengeMetadata: JsonField<ThreeDSAuthentication.ChallengeMetadata>,
    private val challengeOrchestratedBy: JsonField<ThreeDSAuthentication.ChallengeOrchestratedBy>,
    private val decisionMadeBy: JsonField<ThreeDSAuthentication.DecisionMadeBy>,
    private val threeRiRequestType: JsonField<ThreeDSAuthentication.ThreeRiRequestType>,
    private val transaction: JsonField<ThreeDSAuthentication.Transaction>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        accountType: JsonField<ThreeDSAuthentication.AccountType> = JsonMissing.of(),
        @JsonProperty("authentication_result")
        @ExcludeMissing
        authenticationResult: JsonField<ThreeDSAuthentication.AuthenticationResult> =
            JsonMissing.of(),
        @JsonProperty("card_expiry_check")
        @ExcludeMissing
        cardExpiryCheck: JsonField<ThreeDSAuthentication.CardExpiryCheck> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder")
        @ExcludeMissing
        cardholder: JsonField<ThreeDSAuthentication.Cardholder> = JsonMissing.of(),
        @JsonProperty("channel")
        @ExcludeMissing
        channel: JsonField<ThreeDSAuthentication.Channel> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("merchant")
        @ExcludeMissing
        merchant: JsonField<ThreeDSAuthentication.Merchant> = JsonMissing.of(),
        @JsonProperty("message_category")
        @ExcludeMissing
        messageCategory: JsonField<ThreeDSAuthentication.MessageCategory> = JsonMissing.of(),
        @JsonProperty("three_ds_requestor_challenge_indicator")
        @ExcludeMissing
        threeDSRequestorChallengeIndicator:
            JsonField<ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator> =
            JsonMissing.of(),
        @JsonProperty("additional_data")
        @ExcludeMissing
        additionalData: JsonField<ThreeDSAuthentication.AdditionalData> = JsonMissing.of(),
        @JsonProperty("app")
        @ExcludeMissing
        app: JsonField<ThreeDSAuthentication.App> = JsonMissing.of(),
        @JsonProperty("authentication_request_type")
        @ExcludeMissing
        authenticationRequestType: JsonField<ThreeDSAuthentication.AuthenticationRequestType> =
            JsonMissing.of(),
        @JsonProperty("browser")
        @ExcludeMissing
        browser: JsonField<ThreeDSAuthentication.Browser> = JsonMissing.of(),
        @JsonProperty("challenge_metadata")
        @ExcludeMissing
        challengeMetadata: JsonField<ThreeDSAuthentication.ChallengeMetadata> = JsonMissing.of(),
        @JsonProperty("challenge_orchestrated_by")
        @ExcludeMissing
        challengeOrchestratedBy: JsonField<ThreeDSAuthentication.ChallengeOrchestratedBy> =
            JsonMissing.of(),
        @JsonProperty("decision_made_by")
        @ExcludeMissing
        decisionMadeBy: JsonField<ThreeDSAuthentication.DecisionMadeBy> = JsonMissing.of(),
        @JsonProperty("three_ri_request_type")
        @ExcludeMissing
        threeRiRequestType: JsonField<ThreeDSAuthentication.ThreeRiRequestType> = JsonMissing.of(),
        @JsonProperty("transaction")
        @ExcludeMissing
        transaction: JsonField<ThreeDSAuthentication.Transaction> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        accountType,
        authenticationResult,
        cardExpiryCheck,
        cardToken,
        cardholder,
        channel,
        created,
        merchant,
        messageCategory,
        threeDSRequestorChallengeIndicator,
        additionalData,
        app,
        authenticationRequestType,
        browser,
        challengeMetadata,
        challengeOrchestratedBy,
        decisionMadeBy,
        threeRiRequestType,
        transaction,
        eventType,
        mutableMapOf(),
    )

    fun toThreeDSAuthentication(): ThreeDSAuthentication =
        ThreeDSAuthentication.builder()
            .token(token)
            .accountType(accountType)
            .authenticationResult(authenticationResult)
            .cardExpiryCheck(cardExpiryCheck)
            .cardToken(cardToken)
            .cardholder(cardholder)
            .channel(channel)
            .created(created)
            .merchant(merchant)
            .messageCategory(messageCategory)
            .threeDSRequestorChallengeIndicator(threeDSRequestorChallengeIndicator)
            .additionalData(additionalData)
            .app(app)
            .authenticationRequestType(authenticationRequestType)
            .browser(browser)
            .challengeMetadata(challengeMetadata)
            .challengeOrchestratedBy(challengeOrchestratedBy)
            .decisionMadeBy(decisionMadeBy)
            .threeRiRequestType(threeRiRequestType)
            .transaction(transaction)
            .build()

    /**
     * Globally unique identifier for the 3DS authentication. Permitted values: 36-digit version 4
     * UUID (including hyphens).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountType(): Optional<ThreeDSAuthentication.AccountType> =
        accountType.getOptional("account_type")

    /**
     * Indicates the outcome of the 3DS authentication process.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationResult(): ThreeDSAuthentication.AuthenticationResult =
        authenticationResult.getRequired("authentication_result")

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardExpiryCheck(): ThreeDSAuthentication.CardExpiryCheck =
        cardExpiryCheck.getRequired("card_expiry_check")

    /**
     * Globally unique identifier for the card on which the 3DS authentication has occurred.
     * Permitted values: 36-digit version 4 UUID (including hyphens).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Object containing data about the cardholder provided during the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholder(): ThreeDSAuthentication.Cardholder = cardholder.getRequired("cardholder")

    /**
     * Channel in which the authentication occurs. Maps to EMV 3DS field `deviceChannel`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): ThreeDSAuthentication.Channel = channel.getRequired("channel")

    /**
     * Date and time when the authentication was created in Lithic's system. Permitted values: Date
     * string in the ISO 8601 format yyyy-MM-dd'T'hh:mm:ssZ.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Object containing data about the merchant involved in the e-commerce transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): ThreeDSAuthentication.Merchant = merchant.getRequired("merchant")

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageCategory(): ThreeDSAuthentication.MessageCategory =
        messageCategory.getRequired("message_category")

    /**
     * Indicates whether a challenge is requested for this transaction
     * * `NO_PREFERENCE` - No Preference
     * * `NO_CHALLENGE_REQUESTED` - No Challenge Requested
     * * `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
     * * `CHALLENGE_MANDATE` - Challenge requested (Mandate)
     * * `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk analysis
     *   is already performed)
     * * `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
     * * `OTHER` - Other indicators not captured by above. These are rarely used
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun threeDSRequestorChallengeIndicator():
        ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator =
        threeDSRequestorChallengeIndicator.getRequired("three_ds_requestor_challenge_indicator")

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalData(): Optional<ThreeDSAuthentication.AdditionalData> =
        additionalData.getOptional("additional_data")

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun app(): Optional<ThreeDSAuthentication.App> = app.getOptional("app")

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * `threeDSRequestorAuthenticationInd`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authenticationRequestType(): Optional<ThreeDSAuthentication.AuthenticationRequestType> =
        authenticationRequestType.getOptional("authentication_request_type")

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun browser(): Optional<ThreeDSAuthentication.Browser> = browser.getOptional("browser")

    /**
     * Metadata about the challenge method and delivery. Only present when a challenge is triggered.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun challengeMetadata(): Optional<ThreeDSAuthentication.ChallengeMetadata> =
        challengeMetadata.getOptional("challenge_metadata")

    /**
     * Entity that orchestrates the challenge. This won't be set for authentications for which a
     * decision has not yet been made (e.g. in-flight customer decisioning request).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun challengeOrchestratedBy(): Optional<ThreeDSAuthentication.ChallengeOrchestratedBy> =
        challengeOrchestratedBy.getOptional("challenge_orchestrated_by")

    /**
     * Entity that made the authentication decision. This won't be set for authentications for which
     * a decision has not yet been made (e.g. in-flight customer decisioning request).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decisionMadeBy(): Optional<ThreeDSAuthentication.DecisionMadeBy> =
        decisionMadeBy.getOptional("decision_made_by")

    /**
     * Type of 3DS Requestor Initiated (3RI) request — i.e., a 3DS authentication that takes place
     * at the initiation of the merchant rather than the cardholder. The most common example of this
     * is where a merchant is authenticating before billing for a recurring transaction such as a
     * pay TV subscription or a utility bill. Maps to EMV 3DS field `threeRIInd`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeRiRequestType(): Optional<ThreeDSAuthentication.ThreeRiRequestType> =
        threeRiRequestType.getOptional("three_ri_request_type")

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transaction(): Optional<ThreeDSAuthentication.Transaction> =
        transaction.getOptional("transaction")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_type")
    @ExcludeMissing
    fun _accountType(): JsonField<ThreeDSAuthentication.AccountType> = accountType

    /**
     * Returns the raw JSON value of [authenticationResult].
     *
     * Unlike [authenticationResult], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_result")
    @ExcludeMissing
    fun _authenticationResult(): JsonField<ThreeDSAuthentication.AuthenticationResult> =
        authenticationResult

    /**
     * Returns the raw JSON value of [cardExpiryCheck].
     *
     * Unlike [cardExpiryCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_expiry_check")
    @ExcludeMissing
    fun _cardExpiryCheck(): JsonField<ThreeDSAuthentication.CardExpiryCheck> = cardExpiryCheck

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [cardholder].
     *
     * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardholder")
    @ExcludeMissing
    fun _cardholder(): JsonField<ThreeDSAuthentication.Cardholder> = cardholder

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel")
    @ExcludeMissing
    fun _channel(): JsonField<ThreeDSAuthentication.Channel> = channel

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant")
    @ExcludeMissing
    fun _merchant(): JsonField<ThreeDSAuthentication.Merchant> = merchant

    /**
     * Returns the raw JSON value of [messageCategory].
     *
     * Unlike [messageCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_category")
    @ExcludeMissing
    fun _messageCategory(): JsonField<ThreeDSAuthentication.MessageCategory> = messageCategory

    /**
     * Returns the raw JSON value of [threeDSRequestorChallengeIndicator].
     *
     * Unlike [threeDSRequestorChallengeIndicator], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("three_ds_requestor_challenge_indicator")
    @ExcludeMissing
    fun _threeDSRequestorChallengeIndicator():
        JsonField<ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator> =
        threeDSRequestorChallengeIndicator

    /**
     * Returns the raw JSON value of [additionalData].
     *
     * Unlike [additionalData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("additional_data")
    @ExcludeMissing
    fun _additionalData(): JsonField<ThreeDSAuthentication.AdditionalData> = additionalData

    /**
     * Returns the raw JSON value of [app].
     *
     * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<ThreeDSAuthentication.App> = app

    /**
     * Returns the raw JSON value of [authenticationRequestType].
     *
     * Unlike [authenticationRequestType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("authentication_request_type")
    @ExcludeMissing
    fun _authenticationRequestType(): JsonField<ThreeDSAuthentication.AuthenticationRequestType> =
        authenticationRequestType

    /**
     * Returns the raw JSON value of [browser].
     *
     * Unlike [browser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("browser")
    @ExcludeMissing
    fun _browser(): JsonField<ThreeDSAuthentication.Browser> = browser

    /**
     * Returns the raw JSON value of [challengeMetadata].
     *
     * Unlike [challengeMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("challenge_metadata")
    @ExcludeMissing
    fun _challengeMetadata(): JsonField<ThreeDSAuthentication.ChallengeMetadata> = challengeMetadata

    /**
     * Returns the raw JSON value of [challengeOrchestratedBy].
     *
     * Unlike [challengeOrchestratedBy], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("challenge_orchestrated_by")
    @ExcludeMissing
    fun _challengeOrchestratedBy(): JsonField<ThreeDSAuthentication.ChallengeOrchestratedBy> =
        challengeOrchestratedBy

    /**
     * Returns the raw JSON value of [decisionMadeBy].
     *
     * Unlike [decisionMadeBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decision_made_by")
    @ExcludeMissing
    fun _decisionMadeBy(): JsonField<ThreeDSAuthentication.DecisionMadeBy> = decisionMadeBy

    /**
     * Returns the raw JSON value of [threeRiRequestType].
     *
     * Unlike [threeRiRequestType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_ri_request_type")
    @ExcludeMissing
    fun _threeRiRequestType(): JsonField<ThreeDSAuthentication.ThreeRiRequestType> =
        threeRiRequestType

    /**
     * Returns the raw JSON value of [transaction].
     *
     * Unlike [transaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction")
    @ExcludeMissing
    fun _transaction(): JsonField<ThreeDSAuthentication.Transaction> = transaction

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * [ThreeDSAuthenticationCreatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountType()
         * .authenticationResult()
         * .cardExpiryCheck()
         * .cardToken()
         * .cardholder()
         * .channel()
         * .created()
         * .merchant()
         * .messageCategory()
         * .threeDSRequestorChallengeIndicator()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreeDSAuthenticationCreatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountType: JsonField<ThreeDSAuthentication.AccountType>? = null
        private var authenticationResult: JsonField<ThreeDSAuthentication.AuthenticationResult>? =
            null
        private var cardExpiryCheck: JsonField<ThreeDSAuthentication.CardExpiryCheck>? = null
        private var cardToken: JsonField<String>? = null
        private var cardholder: JsonField<ThreeDSAuthentication.Cardholder>? = null
        private var channel: JsonField<ThreeDSAuthentication.Channel>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var merchant: JsonField<ThreeDSAuthentication.Merchant>? = null
        private var messageCategory: JsonField<ThreeDSAuthentication.MessageCategory>? = null
        private var threeDSRequestorChallengeIndicator:
            JsonField<ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator>? =
            null
        private var additionalData: JsonField<ThreeDSAuthentication.AdditionalData> =
            JsonMissing.of()
        private var app: JsonField<ThreeDSAuthentication.App> = JsonMissing.of()
        private var authenticationRequestType:
            JsonField<ThreeDSAuthentication.AuthenticationRequestType> =
            JsonMissing.of()
        private var browser: JsonField<ThreeDSAuthentication.Browser> = JsonMissing.of()
        private var challengeMetadata: JsonField<ThreeDSAuthentication.ChallengeMetadata> =
            JsonMissing.of()
        private var challengeOrchestratedBy:
            JsonField<ThreeDSAuthentication.ChallengeOrchestratedBy> =
            JsonMissing.of()
        private var decisionMadeBy: JsonField<ThreeDSAuthentication.DecisionMadeBy> =
            JsonMissing.of()
        private var threeRiRequestType: JsonField<ThreeDSAuthentication.ThreeRiRequestType> =
            JsonMissing.of()
        private var transaction: JsonField<ThreeDSAuthentication.Transaction> = JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            threeDSAuthenticationCreatedWebhookEvent: ThreeDSAuthenticationCreatedWebhookEvent
        ) = apply {
            token = threeDSAuthenticationCreatedWebhookEvent.token
            accountType = threeDSAuthenticationCreatedWebhookEvent.accountType
            authenticationResult = threeDSAuthenticationCreatedWebhookEvent.authenticationResult
            cardExpiryCheck = threeDSAuthenticationCreatedWebhookEvent.cardExpiryCheck
            cardToken = threeDSAuthenticationCreatedWebhookEvent.cardToken
            cardholder = threeDSAuthenticationCreatedWebhookEvent.cardholder
            channel = threeDSAuthenticationCreatedWebhookEvent.channel
            created = threeDSAuthenticationCreatedWebhookEvent.created
            merchant = threeDSAuthenticationCreatedWebhookEvent.merchant
            messageCategory = threeDSAuthenticationCreatedWebhookEvent.messageCategory
            threeDSRequestorChallengeIndicator =
                threeDSAuthenticationCreatedWebhookEvent.threeDSRequestorChallengeIndicator
            additionalData = threeDSAuthenticationCreatedWebhookEvent.additionalData
            app = threeDSAuthenticationCreatedWebhookEvent.app
            authenticationRequestType =
                threeDSAuthenticationCreatedWebhookEvent.authenticationRequestType
            browser = threeDSAuthenticationCreatedWebhookEvent.browser
            challengeMetadata = threeDSAuthenticationCreatedWebhookEvent.challengeMetadata
            challengeOrchestratedBy =
                threeDSAuthenticationCreatedWebhookEvent.challengeOrchestratedBy
            decisionMadeBy = threeDSAuthenticationCreatedWebhookEvent.decisionMadeBy
            threeRiRequestType = threeDSAuthenticationCreatedWebhookEvent.threeRiRequestType
            transaction = threeDSAuthenticationCreatedWebhookEvent.transaction
            eventType = threeDSAuthenticationCreatedWebhookEvent.eventType
            additionalProperties =
                threeDSAuthenticationCreatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /**
         * Globally unique identifier for the 3DS authentication. Permitted values: 36-digit version
         * 4 UUID (including hyphens).
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
         * `acctType`.
         */
        fun accountType(accountType: ThreeDSAuthentication.AccountType?) =
            accountType(JsonField.ofNullable(accountType))

        /** Alias for calling [Builder.accountType] with `accountType.orElse(null)`. */
        fun accountType(accountType: Optional<ThreeDSAuthentication.AccountType>) =
            accountType(accountType.getOrNull())

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed
         * [ThreeDSAuthentication.AccountType] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun accountType(accountType: JsonField<ThreeDSAuthentication.AccountType>) = apply {
            this.accountType = accountType
        }

        /** Indicates the outcome of the 3DS authentication process. */
        fun authenticationResult(authenticationResult: ThreeDSAuthentication.AuthenticationResult) =
            authenticationResult(JsonField.of(authenticationResult))

        /**
         * Sets [Builder.authenticationResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationResult] with a well-typed
         * [ThreeDSAuthentication.AuthenticationResult] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun authenticationResult(
            authenticationResult: JsonField<ThreeDSAuthentication.AuthenticationResult>
        ) = apply { this.authenticationResult = authenticationResult }

        /**
         * Indicates whether the expiration date provided by the cardholder during checkout matches
         * Lithic's record of the card's expiration date.
         */
        fun cardExpiryCheck(cardExpiryCheck: ThreeDSAuthentication.CardExpiryCheck) =
            cardExpiryCheck(JsonField.of(cardExpiryCheck))

        /**
         * Sets [Builder.cardExpiryCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardExpiryCheck] with a well-typed
         * [ThreeDSAuthentication.CardExpiryCheck] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun cardExpiryCheck(cardExpiryCheck: JsonField<ThreeDSAuthentication.CardExpiryCheck>) =
            apply {
                this.cardExpiryCheck = cardExpiryCheck
            }

        /**
         * Globally unique identifier for the card on which the 3DS authentication has occurred.
         * Permitted values: 36-digit version 4 UUID (including hyphens).
         */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Object containing data about the cardholder provided during the transaction. */
        fun cardholder(cardholder: ThreeDSAuthentication.Cardholder) =
            cardholder(JsonField.of(cardholder))

        /**
         * Sets [Builder.cardholder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholder] with a well-typed
         * [ThreeDSAuthentication.Cardholder] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun cardholder(cardholder: JsonField<ThreeDSAuthentication.Cardholder>) = apply {
            this.cardholder = cardholder
        }

        /** Channel in which the authentication occurs. Maps to EMV 3DS field `deviceChannel`. */
        fun channel(channel: ThreeDSAuthentication.Channel) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed
         * [ThreeDSAuthentication.Channel] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<ThreeDSAuthentication.Channel>) = apply {
            this.channel = channel
        }

        /**
         * Date and time when the authentication was created in Lithic's system. Permitted values:
         * Date string in the ISO 8601 format yyyy-MM-dd'T'hh:mm:ssZ.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Object containing data about the merchant involved in the e-commerce transaction. */
        fun merchant(merchant: ThreeDSAuthentication.Merchant) = merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed
         * [ThreeDSAuthentication.Merchant] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun merchant(merchant: JsonField<ThreeDSAuthentication.Merchant>) = apply {
            this.merchant = merchant
        }

        /**
         * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For
         * NON_PAYMENT_AUTHENTICATION, additional_data and transaction fields are not populated.
         */
        fun messageCategory(messageCategory: ThreeDSAuthentication.MessageCategory) =
            messageCategory(JsonField.of(messageCategory))

        /**
         * Sets [Builder.messageCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageCategory] with a well-typed
         * [ThreeDSAuthentication.MessageCategory] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun messageCategory(messageCategory: JsonField<ThreeDSAuthentication.MessageCategory>) =
            apply {
                this.messageCategory = messageCategory
            }

        /**
         * Indicates whether a challenge is requested for this transaction
         * * `NO_PREFERENCE` - No Preference
         * * `NO_CHALLENGE_REQUESTED` - No Challenge Requested
         * * `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
         * * `CHALLENGE_MANDATE` - Challenge requested (Mandate)
         * * `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk
         *   analysis is already performed)
         * * `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
         * * `OTHER` - Other indicators not captured by above. These are rarely used
         */
        fun threeDSRequestorChallengeIndicator(
            threeDSRequestorChallengeIndicator:
                ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator
        ) = threeDSRequestorChallengeIndicator(JsonField.of(threeDSRequestorChallengeIndicator))

        /**
         * Sets [Builder.threeDSRequestorChallengeIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeDSRequestorChallengeIndicator] with a well-typed
         * [ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threeDSRequestorChallengeIndicator(
            threeDSRequestorChallengeIndicator:
                JsonField<ThreeDSAuthentication.ThreeDSRequestorChallengeIndicator>
        ) = apply { this.threeDSRequestorChallengeIndicator = threeDSRequestorChallengeIndicator }

        /**
         * Object containing additional data about the 3DS request that is beyond the EMV 3DS
         * standard spec (e.g., specific fields that only certain card networks send but are not
         * required across all 3DS requests).
         */
        fun additionalData(additionalData: ThreeDSAuthentication.AdditionalData?) =
            additionalData(JsonField.ofNullable(additionalData))

        /** Alias for calling [Builder.additionalData] with `additionalData.orElse(null)`. */
        fun additionalData(additionalData: Optional<ThreeDSAuthentication.AdditionalData>) =
            additionalData(additionalData.getOrNull())

        /**
         * Sets [Builder.additionalData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalData] with a well-typed
         * [ThreeDSAuthentication.AdditionalData] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun additionalData(additionalData: JsonField<ThreeDSAuthentication.AdditionalData>) =
            apply {
                this.additionalData = additionalData
            }

        /**
         * Object containing data about the app used in the e-commerce transaction. Present if the
         * channel is 'APP_BASED'.
         */
        fun app(app: ThreeDSAuthentication.App?) = app(JsonField.ofNullable(app))

        /** Alias for calling [Builder.app] with `app.orElse(null)`. */
        fun app(app: Optional<ThreeDSAuthentication.App>) = app(app.getOrNull())

        /**
         * Sets [Builder.app] to an arbitrary JSON value.
         *
         * You should usually call [Builder.app] with a well-typed [ThreeDSAuthentication.App] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun app(app: JsonField<ThreeDSAuthentication.App>) = apply { this.app = app }

        /**
         * Type of authentication request - i.e., the type of transaction or interaction is causing
         * the merchant to request an authentication. Maps to EMV 3DS field
         * `threeDSRequestorAuthenticationInd`.
         */
        fun authenticationRequestType(
            authenticationRequestType: ThreeDSAuthentication.AuthenticationRequestType?
        ) = authenticationRequestType(JsonField.ofNullable(authenticationRequestType))

        /**
         * Alias for calling [Builder.authenticationRequestType] with
         * `authenticationRequestType.orElse(null)`.
         */
        fun authenticationRequestType(
            authenticationRequestType: Optional<ThreeDSAuthentication.AuthenticationRequestType>
        ) = authenticationRequestType(authenticationRequestType.getOrNull())

        /**
         * Sets [Builder.authenticationRequestType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationRequestType] with a well-typed
         * [ThreeDSAuthentication.AuthenticationRequestType] value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun authenticationRequestType(
            authenticationRequestType: JsonField<ThreeDSAuthentication.AuthenticationRequestType>
        ) = apply { this.authenticationRequestType = authenticationRequestType }

        /**
         * Object containing data about the browser used in the e-commerce transaction. Present if
         * the channel is 'BROWSER'.
         */
        fun browser(browser: ThreeDSAuthentication.Browser?) =
            browser(JsonField.ofNullable(browser))

        /** Alias for calling [Builder.browser] with `browser.orElse(null)`. */
        fun browser(browser: Optional<ThreeDSAuthentication.Browser>) = browser(browser.getOrNull())

        /**
         * Sets [Builder.browser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browser] with a well-typed
         * [ThreeDSAuthentication.Browser] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun browser(browser: JsonField<ThreeDSAuthentication.Browser>) = apply {
            this.browser = browser
        }

        /**
         * Metadata about the challenge method and delivery. Only present when a challenge is
         * triggered.
         */
        fun challengeMetadata(challengeMetadata: ThreeDSAuthentication.ChallengeMetadata?) =
            challengeMetadata(JsonField.ofNullable(challengeMetadata))

        /** Alias for calling [Builder.challengeMetadata] with `challengeMetadata.orElse(null)`. */
        fun challengeMetadata(
            challengeMetadata: Optional<ThreeDSAuthentication.ChallengeMetadata>
        ) = challengeMetadata(challengeMetadata.getOrNull())

        /**
         * Sets [Builder.challengeMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challengeMetadata] with a well-typed
         * [ThreeDSAuthentication.ChallengeMetadata] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun challengeMetadata(
            challengeMetadata: JsonField<ThreeDSAuthentication.ChallengeMetadata>
        ) = apply { this.challengeMetadata = challengeMetadata }

        /**
         * Entity that orchestrates the challenge. This won't be set for authentications for which a
         * decision has not yet been made (e.g. in-flight customer decisioning request).
         */
        fun challengeOrchestratedBy(
            challengeOrchestratedBy: ThreeDSAuthentication.ChallengeOrchestratedBy?
        ) = challengeOrchestratedBy(JsonField.ofNullable(challengeOrchestratedBy))

        /**
         * Alias for calling [Builder.challengeOrchestratedBy] with
         * `challengeOrchestratedBy.orElse(null)`.
         */
        fun challengeOrchestratedBy(
            challengeOrchestratedBy: Optional<ThreeDSAuthentication.ChallengeOrchestratedBy>
        ) = challengeOrchestratedBy(challengeOrchestratedBy.getOrNull())

        /**
         * Sets [Builder.challengeOrchestratedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challengeOrchestratedBy] with a well-typed
         * [ThreeDSAuthentication.ChallengeOrchestratedBy] value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun challengeOrchestratedBy(
            challengeOrchestratedBy: JsonField<ThreeDSAuthentication.ChallengeOrchestratedBy>
        ) = apply { this.challengeOrchestratedBy = challengeOrchestratedBy }

        /**
         * Entity that made the authentication decision. This won't be set for authentications for
         * which a decision has not yet been made (e.g. in-flight customer decisioning request).
         */
        fun decisionMadeBy(decisionMadeBy: ThreeDSAuthentication.DecisionMadeBy?) =
            decisionMadeBy(JsonField.ofNullable(decisionMadeBy))

        /** Alias for calling [Builder.decisionMadeBy] with `decisionMadeBy.orElse(null)`. */
        fun decisionMadeBy(decisionMadeBy: Optional<ThreeDSAuthentication.DecisionMadeBy>) =
            decisionMadeBy(decisionMadeBy.getOrNull())

        /**
         * Sets [Builder.decisionMadeBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decisionMadeBy] with a well-typed
         * [ThreeDSAuthentication.DecisionMadeBy] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun decisionMadeBy(decisionMadeBy: JsonField<ThreeDSAuthentication.DecisionMadeBy>) =
            apply {
                this.decisionMadeBy = decisionMadeBy
            }

        /**
         * Type of 3DS Requestor Initiated (3RI) request — i.e., a 3DS authentication that takes
         * place at the initiation of the merchant rather than the cardholder. The most common
         * example of this is where a merchant is authenticating before billing for a recurring
         * transaction such as a pay TV subscription or a utility bill. Maps to EMV 3DS field
         * `threeRIInd`.
         */
        fun threeRiRequestType(threeRiRequestType: ThreeDSAuthentication.ThreeRiRequestType?) =
            threeRiRequestType(JsonField.ofNullable(threeRiRequestType))

        /**
         * Alias for calling [Builder.threeRiRequestType] with `threeRiRequestType.orElse(null)`.
         */
        fun threeRiRequestType(
            threeRiRequestType: Optional<ThreeDSAuthentication.ThreeRiRequestType>
        ) = threeRiRequestType(threeRiRequestType.getOrNull())

        /**
         * Sets [Builder.threeRiRequestType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeRiRequestType] with a well-typed
         * [ThreeDSAuthentication.ThreeRiRequestType] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun threeRiRequestType(
            threeRiRequestType: JsonField<ThreeDSAuthentication.ThreeRiRequestType>
        ) = apply { this.threeRiRequestType = threeRiRequestType }

        /**
         * Object containing data about the e-commerce transaction for which the merchant is
         * requesting authentication.
         */
        fun transaction(transaction: ThreeDSAuthentication.Transaction?) =
            transaction(JsonField.ofNullable(transaction))

        /** Alias for calling [Builder.transaction] with `transaction.orElse(null)`. */
        fun transaction(transaction: Optional<ThreeDSAuthentication.Transaction>) =
            transaction(transaction.getOrNull())

        /**
         * Sets [Builder.transaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transaction] with a well-typed
         * [ThreeDSAuthentication.Transaction] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun transaction(transaction: JsonField<ThreeDSAuthentication.Transaction>) = apply {
            this.transaction = transaction
        }

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
         * Returns an immutable instance of [ThreeDSAuthenticationCreatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountType()
         * .authenticationResult()
         * .cardExpiryCheck()
         * .cardToken()
         * .cardholder()
         * .channel()
         * .created()
         * .merchant()
         * .messageCategory()
         * .threeDSRequestorChallengeIndicator()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreeDSAuthenticationCreatedWebhookEvent =
            ThreeDSAuthenticationCreatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("accountType", accountType),
                checkRequired("authenticationResult", authenticationResult),
                checkRequired("cardExpiryCheck", cardExpiryCheck),
                checkRequired("cardToken", cardToken),
                checkRequired("cardholder", cardholder),
                checkRequired("channel", channel),
                checkRequired("created", created),
                checkRequired("merchant", merchant),
                checkRequired("messageCategory", messageCategory),
                checkRequired(
                    "threeDSRequestorChallengeIndicator",
                    threeDSRequestorChallengeIndicator,
                ),
                additionalData,
                app,
                authenticationRequestType,
                browser,
                challengeMetadata,
                challengeOrchestratedBy,
                decisionMadeBy,
                threeRiRequestType,
                transaction,
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ThreeDSAuthenticationCreatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        accountType().ifPresent { it.validate() }
        authenticationResult().validate()
        cardExpiryCheck().validate()
        cardToken()
        cardholder().validate()
        channel().validate()
        created()
        merchant().validate()
        messageCategory().validate()
        threeDSRequestorChallengeIndicator().validate()
        additionalData().ifPresent { it.validate() }
        app().ifPresent { it.validate() }
        authenticationRequestType().ifPresent { it.validate() }
        browser().ifPresent { it.validate() }
        challengeMetadata().ifPresent { it.validate() }
        challengeOrchestratedBy().ifPresent { it.validate() }
        decisionMadeBy().ifPresent { it.validate() }
        threeRiRequestType().ifPresent { it.validate() }
        transaction().ifPresent { it.validate() }
        eventType().validate()
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
            (accountType.asKnown().getOrNull()?.validity() ?: 0) +
            (authenticationResult.asKnown().getOrNull()?.validity() ?: 0) +
            (cardExpiryCheck.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
            (channel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (merchant.asKnown().getOrNull()?.validity() ?: 0) +
            (messageCategory.asKnown().getOrNull()?.validity() ?: 0) +
            (threeDSRequestorChallengeIndicator.asKnown().getOrNull()?.validity() ?: 0) +
            (additionalData.asKnown().getOrNull()?.validity() ?: 0) +
            (app.asKnown().getOrNull()?.validity() ?: 0) +
            (authenticationRequestType.asKnown().getOrNull()?.validity() ?: 0) +
            (browser.asKnown().getOrNull()?.validity() ?: 0) +
            (challengeMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (challengeOrchestratedBy.asKnown().getOrNull()?.validity() ?: 0) +
            (decisionMadeBy.asKnown().getOrNull()?.validity() ?: 0) +
            (threeRiRequestType.asKnown().getOrNull()?.validity() ?: 0) +
            (transaction.asKnown().getOrNull()?.validity() ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val THREE_DS_AUTHENTICATION_CREATED = of("three_ds_authentication.created")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            THREE_DS_AUTHENTICATION_CREATED
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
            THREE_DS_AUTHENTICATION_CREATED,
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
                THREE_DS_AUTHENTICATION_CREATED -> Value.THREE_DS_AUTHENTICATION_CREATED
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
                THREE_DS_AUTHENTICATION_CREATED -> Known.THREE_DS_AUTHENTICATION_CREATED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreeDSAuthenticationCreatedWebhookEvent &&
            token == other.token &&
            accountType == other.accountType &&
            authenticationResult == other.authenticationResult &&
            cardExpiryCheck == other.cardExpiryCheck &&
            cardToken == other.cardToken &&
            cardholder == other.cardholder &&
            channel == other.channel &&
            created == other.created &&
            merchant == other.merchant &&
            messageCategory == other.messageCategory &&
            threeDSRequestorChallengeIndicator == other.threeDSRequestorChallengeIndicator &&
            additionalData == other.additionalData &&
            app == other.app &&
            authenticationRequestType == other.authenticationRequestType &&
            browser == other.browser &&
            challengeMetadata == other.challengeMetadata &&
            challengeOrchestratedBy == other.challengeOrchestratedBy &&
            decisionMadeBy == other.decisionMadeBy &&
            threeRiRequestType == other.threeRiRequestType &&
            transaction == other.transaction &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountType,
            authenticationResult,
            cardExpiryCheck,
            cardToken,
            cardholder,
            channel,
            created,
            merchant,
            messageCategory,
            threeDSRequestorChallengeIndicator,
            additionalData,
            app,
            authenticationRequestType,
            browser,
            challengeMetadata,
            challengeOrchestratedBy,
            decisionMadeBy,
            threeRiRequestType,
            transaction,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThreeDSAuthenticationCreatedWebhookEvent{token=$token, accountType=$accountType, authenticationResult=$authenticationResult, cardExpiryCheck=$cardExpiryCheck, cardToken=$cardToken, cardholder=$cardholder, channel=$channel, created=$created, merchant=$merchant, messageCategory=$messageCategory, threeDSRequestorChallengeIndicator=$threeDSRequestorChallengeIndicator, additionalData=$additionalData, app=$app, authenticationRequestType=$authenticationRequestType, browser=$browser, challengeMetadata=$challengeMetadata, challengeOrchestratedBy=$challengeOrchestratedBy, decisionMadeBy=$decisionMadeBy, threeRiRequestType=$threeRiRequestType, transaction=$transaction, eventType=$eventType, additionalProperties=$additionalProperties}"
}
