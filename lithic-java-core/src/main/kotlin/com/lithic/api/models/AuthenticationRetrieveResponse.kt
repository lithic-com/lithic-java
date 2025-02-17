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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AuthenticationRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_type")
    @ExcludeMissing
    private val accountType: JsonField<AccountType> = JsonMissing.of(),
    @JsonProperty("authentication_result")
    @ExcludeMissing
    private val authenticationResult: JsonField<AuthenticationResult> = JsonMissing.of(),
    @JsonProperty("card_expiry_check")
    @ExcludeMissing
    private val cardExpiryCheck: JsonField<CardExpiryCheck> = JsonMissing.of(),
    @JsonProperty("card_token")
    @ExcludeMissing
    private val cardToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cardholder")
    @ExcludeMissing
    private val cardholder: JsonField<Cardholder> = JsonMissing.of(),
    @JsonProperty("channel")
    @ExcludeMissing
    private val channel: JsonField<Channel> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("merchant")
    @ExcludeMissing
    private val merchant: JsonField<Merchant> = JsonMissing.of(),
    @JsonProperty("message_category")
    @ExcludeMissing
    private val messageCategory: JsonField<MessageCategory> = JsonMissing.of(),
    @JsonProperty("three_ds_requestor_challenge_indicator")
    @ExcludeMissing
    private val threeDSRequestorChallengeIndicator: JsonField<ThreeDSRequestorChallengeIndicator> =
        JsonMissing.of(),
    @JsonProperty("additional_data")
    @ExcludeMissing
    private val additionalData: JsonField<AdditionalData> = JsonMissing.of(),
    @JsonProperty("app") @ExcludeMissing private val app: JsonField<App> = JsonMissing.of(),
    @JsonProperty("authentication_request_type")
    @ExcludeMissing
    private val authenticationRequestType: JsonField<AuthenticationRequestType> = JsonMissing.of(),
    @JsonProperty("browser")
    @ExcludeMissing
    private val browser: JsonField<Browser> = JsonMissing.of(),
    @JsonProperty("challenge_metadata")
    @ExcludeMissing
    private val challengeMetadata: JsonField<ChallengeMetadata> = JsonMissing.of(),
    @JsonProperty("challenge_orchestrated_by")
    @ExcludeMissing
    private val challengeOrchestratedBy: JsonField<ChallengeOrchestratedBy> = JsonMissing.of(),
    @JsonProperty("decision_made_by")
    @ExcludeMissing
    private val decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of(),
    @JsonProperty("three_ri_request_type")
    @ExcludeMissing
    private val threeRiRequestType: JsonField<ThreeRiRequestType> = JsonMissing.of(),
    @JsonProperty("transaction")
    @ExcludeMissing
    private val transaction: JsonField<Transaction> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the 3DS authentication. */
    fun token(): String = token.getRequired("token")

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     */
    fun accountType(): Optional<AccountType> =
        Optional.ofNullable(accountType.getNullable("account_type"))

    /** Indicates the outcome of the 3DS authentication process. */
    fun authenticationResult(): AuthenticationResult =
        authenticationResult.getRequired("authentication_result")

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     */
    fun cardExpiryCheck(): CardExpiryCheck = cardExpiryCheck.getRequired("card_expiry_check")

    /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /** Object containing data about the cardholder provided during the transaction. */
    fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

    /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
    fun channel(): Channel = channel.getRequired("channel")

    /** Date and time when the authentication was created in Lithic's system. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Object containing data about the merchant involved in the e-commerce transaction. */
    fun merchant(): Merchant = merchant.getRequired("merchant")

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     */
    fun messageCategory(): MessageCategory = messageCategory.getRequired("message_category")

    /**
     * Indicates whether a challenge is requested for this transaction
     * - `NO_PREFERENCE` - No Preference
     * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
     * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
     * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
     * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk analysis
     *   is already performed)
     * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
     * - `OTHER` - Other indicators not captured by above. These are rarely used
     */
    fun threeDSRequestorChallengeIndicator(): ThreeDSRequestorChallengeIndicator =
        threeDSRequestorChallengeIndicator.getRequired("three_ds_requestor_challenge_indicator")

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     */
    fun additionalData(): Optional<AdditionalData> =
        Optional.ofNullable(additionalData.getNullable("additional_data"))

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     */
    fun app(): Optional<App> = Optional.ofNullable(app.getNullable("app"))

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * threeDSRequestorAuthenticationInd.
     */
    fun authenticationRequestType(): Optional<AuthenticationRequestType> =
        Optional.ofNullable(authenticationRequestType.getNullable("authentication_request_type"))

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     */
    fun browser(): Optional<Browser> = Optional.ofNullable(browser.getNullable("browser"))

    /** Metadata about the challenge method and delivery. */
    fun challengeMetadata(): Optional<ChallengeMetadata> =
        Optional.ofNullable(challengeMetadata.getNullable("challenge_metadata"))

    /** Entity that orchestrates the challenge. */
    fun challengeOrchestratedBy(): Optional<ChallengeOrchestratedBy> =
        Optional.ofNullable(challengeOrchestratedBy.getNullable("challenge_orchestrated_by"))

    /** Entity that made the authentication decision. */
    fun decisionMadeBy(): Optional<DecisionMadeBy> =
        Optional.ofNullable(decisionMadeBy.getNullable("decision_made_by"))

    /**
     * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place at
     * the initiation of the merchant rather than the cardholder. The most common example of this is
     * where a merchant is authenticating before billing for a recurring transaction such as a pay
     * TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
     */
    fun threeRiRequestType(): Optional<ThreeRiRequestType> =
        Optional.ofNullable(threeRiRequestType.getNullable("three_ri_request_type"))

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     */
    fun transaction(): Optional<Transaction> =
        Optional.ofNullable(transaction.getNullable("transaction"))

    /** Globally unique identifier for the 3DS authentication. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     */
    @JsonProperty("account_type")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /** Indicates the outcome of the 3DS authentication process. */
    @JsonProperty("authentication_result")
    @ExcludeMissing
    fun _authenticationResult(): JsonField<AuthenticationResult> = authenticationResult

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     */
    @JsonProperty("card_expiry_check")
    @ExcludeMissing
    fun _cardExpiryCheck(): JsonField<CardExpiryCheck> = cardExpiryCheck

    /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /** Object containing data about the cardholder provided during the transaction. */
    @JsonProperty("cardholder")
    @ExcludeMissing
    fun _cardholder(): JsonField<Cardholder> = cardholder

    /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

    /** Date and time when the authentication was created in Lithic's system. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Object containing data about the merchant involved in the e-commerce transaction. */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     */
    @JsonProperty("message_category")
    @ExcludeMissing
    fun _messageCategory(): JsonField<MessageCategory> = messageCategory

    /**
     * Indicates whether a challenge is requested for this transaction
     * - `NO_PREFERENCE` - No Preference
     * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
     * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
     * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
     * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk analysis
     *   is already performed)
     * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
     * - `OTHER` - Other indicators not captured by above. These are rarely used
     */
    @JsonProperty("three_ds_requestor_challenge_indicator")
    @ExcludeMissing
    fun _threeDSRequestorChallengeIndicator(): JsonField<ThreeDSRequestorChallengeIndicator> =
        threeDSRequestorChallengeIndicator

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     */
    @JsonProperty("additional_data")
    @ExcludeMissing
    fun _additionalData(): JsonField<AdditionalData> = additionalData

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     */
    @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<App> = app

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * threeDSRequestorAuthenticationInd.
     */
    @JsonProperty("authentication_request_type")
    @ExcludeMissing
    fun _authenticationRequestType(): JsonField<AuthenticationRequestType> =
        authenticationRequestType

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     */
    @JsonProperty("browser") @ExcludeMissing fun _browser(): JsonField<Browser> = browser

    /** Metadata about the challenge method and delivery. */
    @JsonProperty("challenge_metadata")
    @ExcludeMissing
    fun _challengeMetadata(): JsonField<ChallengeMetadata> = challengeMetadata

    /** Entity that orchestrates the challenge. */
    @JsonProperty("challenge_orchestrated_by")
    @ExcludeMissing
    fun _challengeOrchestratedBy(): JsonField<ChallengeOrchestratedBy> = challengeOrchestratedBy

    /** Entity that made the authentication decision. */
    @JsonProperty("decision_made_by")
    @ExcludeMissing
    fun _decisionMadeBy(): JsonField<DecisionMadeBy> = decisionMadeBy

    /**
     * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place at
     * the initiation of the merchant rather than the cardholder. The most common example of this is
     * where a merchant is authenticating before billing for a recurring transaction such as a pay
     * TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
     */
    @JsonProperty("three_ri_request_type")
    @ExcludeMissing
    fun _threeRiRequestType(): JsonField<ThreeRiRequestType> = threeRiRequestType

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     */
    @JsonProperty("transaction")
    @ExcludeMissing
    fun _transaction(): JsonField<Transaction> = transaction

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthenticationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        accountType()
        authenticationResult()
        cardExpiryCheck()
        cardToken()
        cardholder().validate()
        channel()
        created()
        merchant().validate()
        messageCategory()
        threeDSRequestorChallengeIndicator()
        additionalData().ifPresent { it.validate() }
        app().ifPresent { it.validate() }
        authenticationRequestType()
        browser().ifPresent { it.validate() }
        challengeMetadata().ifPresent { it.validate() }
        challengeOrchestratedBy()
        decisionMadeBy()
        threeRiRequestType()
        transaction().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthenticationRetrieveResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountType: JsonField<AccountType>? = null
        private var authenticationResult: JsonField<AuthenticationResult>? = null
        private var cardExpiryCheck: JsonField<CardExpiryCheck>? = null
        private var cardToken: JsonField<String>? = null
        private var cardholder: JsonField<Cardholder>? = null
        private var channel: JsonField<Channel>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var merchant: JsonField<Merchant>? = null
        private var messageCategory: JsonField<MessageCategory>? = null
        private var threeDSRequestorChallengeIndicator:
            JsonField<ThreeDSRequestorChallengeIndicator>? =
            null
        private var additionalData: JsonField<AdditionalData> = JsonMissing.of()
        private var app: JsonField<App> = JsonMissing.of()
        private var authenticationRequestType: JsonField<AuthenticationRequestType> =
            JsonMissing.of()
        private var browser: JsonField<Browser> = JsonMissing.of()
        private var challengeMetadata: JsonField<ChallengeMetadata> = JsonMissing.of()
        private var challengeOrchestratedBy: JsonField<ChallengeOrchestratedBy> = JsonMissing.of()
        private var decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of()
        private var threeRiRequestType: JsonField<ThreeRiRequestType> = JsonMissing.of()
        private var transaction: JsonField<Transaction> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authenticationRetrieveResponse: AuthenticationRetrieveResponse) = apply {
            token = authenticationRetrieveResponse.token
            accountType = authenticationRetrieveResponse.accountType
            authenticationResult = authenticationRetrieveResponse.authenticationResult
            cardExpiryCheck = authenticationRetrieveResponse.cardExpiryCheck
            cardToken = authenticationRetrieveResponse.cardToken
            cardholder = authenticationRetrieveResponse.cardholder
            channel = authenticationRetrieveResponse.channel
            created = authenticationRetrieveResponse.created
            merchant = authenticationRetrieveResponse.merchant
            messageCategory = authenticationRetrieveResponse.messageCategory
            threeDSRequestorChallengeIndicator =
                authenticationRetrieveResponse.threeDSRequestorChallengeIndicator
            additionalData = authenticationRetrieveResponse.additionalData
            app = authenticationRetrieveResponse.app
            authenticationRequestType = authenticationRetrieveResponse.authenticationRequestType
            browser = authenticationRetrieveResponse.browser
            challengeMetadata = authenticationRetrieveResponse.challengeMetadata
            challengeOrchestratedBy = authenticationRetrieveResponse.challengeOrchestratedBy
            decisionMadeBy = authenticationRetrieveResponse.decisionMadeBy
            threeRiRequestType = authenticationRetrieveResponse.threeRiRequestType
            transaction = authenticationRetrieveResponse.transaction
            additionalProperties =
                authenticationRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the 3DS authentication. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the 3DS authentication. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
         * `acctType`.
         */
        fun accountType(accountType: AccountType?) = accountType(JsonField.ofNullable(accountType))

        /**
         * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
         * `acctType`.
         */
        fun accountType(accountType: Optional<AccountType>) = accountType(accountType.orElse(null))

        /**
         * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
         * `acctType`.
         */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        /** Indicates the outcome of the 3DS authentication process. */
        fun authenticationResult(authenticationResult: AuthenticationResult) =
            authenticationResult(JsonField.of(authenticationResult))

        /** Indicates the outcome of the 3DS authentication process. */
        fun authenticationResult(authenticationResult: JsonField<AuthenticationResult>) = apply {
            this.authenticationResult = authenticationResult
        }

        /**
         * Indicates whether the expiration date provided by the cardholder during checkout matches
         * Lithic's record of the card's expiration date.
         */
        fun cardExpiryCheck(cardExpiryCheck: CardExpiryCheck) =
            cardExpiryCheck(JsonField.of(cardExpiryCheck))

        /**
         * Indicates whether the expiration date provided by the cardholder during checkout matches
         * Lithic's record of the card's expiration date.
         */
        fun cardExpiryCheck(cardExpiryCheck: JsonField<CardExpiryCheck>) = apply {
            this.cardExpiryCheck = cardExpiryCheck
        }

        /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Object containing data about the cardholder provided during the transaction. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /** Object containing data about the cardholder provided during the transaction. */
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { this.cardholder = cardholder }

        /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
        fun channel(channel: Channel) = channel(JsonField.of(channel))

        /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
        fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

        /** Date and time when the authentication was created in Lithic's system. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the authentication was created in Lithic's system. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Object containing data about the merchant involved in the e-commerce transaction. */
        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        /** Object containing data about the merchant involved in the e-commerce transaction. */
        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /**
         * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For
         * NON_PAYMENT_AUTHENTICATION, additional_data and transaction fields are not populated.
         */
        fun messageCategory(messageCategory: MessageCategory) =
            messageCategory(JsonField.of(messageCategory))

        /**
         * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For
         * NON_PAYMENT_AUTHENTICATION, additional_data and transaction fields are not populated.
         */
        fun messageCategory(messageCategory: JsonField<MessageCategory>) = apply {
            this.messageCategory = messageCategory
        }

        /**
         * Indicates whether a challenge is requested for this transaction
         * - `NO_PREFERENCE` - No Preference
         * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
         * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
         * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
         * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk
         *   analysis is already performed)
         * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
         * - `OTHER` - Other indicators not captured by above. These are rarely used
         */
        fun threeDSRequestorChallengeIndicator(
            threeDSRequestorChallengeIndicator: ThreeDSRequestorChallengeIndicator
        ) = threeDSRequestorChallengeIndicator(JsonField.of(threeDSRequestorChallengeIndicator))

        /**
         * Indicates whether a challenge is requested for this transaction
         * - `NO_PREFERENCE` - No Preference
         * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
         * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
         * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
         * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk
         *   analysis is already performed)
         * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
         * - `OTHER` - Other indicators not captured by above. These are rarely used
         */
        fun threeDSRequestorChallengeIndicator(
            threeDSRequestorChallengeIndicator: JsonField<ThreeDSRequestorChallengeIndicator>
        ) = apply { this.threeDSRequestorChallengeIndicator = threeDSRequestorChallengeIndicator }

        /**
         * Object containing additional data about the 3DS request that is beyond the EMV 3DS
         * standard spec (e.g., specific fields that only certain card networks send but are not
         * required across all 3DS requests).
         */
        fun additionalData(additionalData: AdditionalData?) =
            additionalData(JsonField.ofNullable(additionalData))

        /**
         * Object containing additional data about the 3DS request that is beyond the EMV 3DS
         * standard spec (e.g., specific fields that only certain card networks send but are not
         * required across all 3DS requests).
         */
        fun additionalData(additionalData: Optional<AdditionalData>) =
            additionalData(additionalData.orElse(null))

        /**
         * Object containing additional data about the 3DS request that is beyond the EMV 3DS
         * standard spec (e.g., specific fields that only certain card networks send but are not
         * required across all 3DS requests).
         */
        fun additionalData(additionalData: JsonField<AdditionalData>) = apply {
            this.additionalData = additionalData
        }

        /**
         * Object containing data about the app used in the e-commerce transaction. Present if the
         * channel is 'APP_BASED'.
         */
        fun app(app: App) = app(JsonField.of(app))

        /**
         * Object containing data about the app used in the e-commerce transaction. Present if the
         * channel is 'APP_BASED'.
         */
        fun app(app: JsonField<App>) = apply { this.app = app }

        /**
         * Type of authentication request - i.e., the type of transaction or interaction is causing
         * the merchant to request an authentication. Maps to EMV 3DS field
         * threeDSRequestorAuthenticationInd.
         */
        fun authenticationRequestType(authenticationRequestType: AuthenticationRequestType?) =
            authenticationRequestType(JsonField.ofNullable(authenticationRequestType))

        /**
         * Type of authentication request - i.e., the type of transaction or interaction is causing
         * the merchant to request an authentication. Maps to EMV 3DS field
         * threeDSRequestorAuthenticationInd.
         */
        fun authenticationRequestType(
            authenticationRequestType: Optional<AuthenticationRequestType>
        ) = authenticationRequestType(authenticationRequestType.orElse(null))

        /**
         * Type of authentication request - i.e., the type of transaction or interaction is causing
         * the merchant to request an authentication. Maps to EMV 3DS field
         * threeDSRequestorAuthenticationInd.
         */
        fun authenticationRequestType(
            authenticationRequestType: JsonField<AuthenticationRequestType>
        ) = apply { this.authenticationRequestType = authenticationRequestType }

        /**
         * Object containing data about the browser used in the e-commerce transaction. Present if
         * the channel is 'BROWSER'.
         */
        fun browser(browser: Browser) = browser(JsonField.of(browser))

        /**
         * Object containing data about the browser used in the e-commerce transaction. Present if
         * the channel is 'BROWSER'.
         */
        fun browser(browser: JsonField<Browser>) = apply { this.browser = browser }

        /** Metadata about the challenge method and delivery. */
        fun challengeMetadata(challengeMetadata: ChallengeMetadata?) =
            challengeMetadata(JsonField.ofNullable(challengeMetadata))

        /** Metadata about the challenge method and delivery. */
        fun challengeMetadata(challengeMetadata: Optional<ChallengeMetadata>) =
            challengeMetadata(challengeMetadata.orElse(null))

        /** Metadata about the challenge method and delivery. */
        fun challengeMetadata(challengeMetadata: JsonField<ChallengeMetadata>) = apply {
            this.challengeMetadata = challengeMetadata
        }

        /** Entity that orchestrates the challenge. */
        fun challengeOrchestratedBy(challengeOrchestratedBy: ChallengeOrchestratedBy?) =
            challengeOrchestratedBy(JsonField.ofNullable(challengeOrchestratedBy))

        /** Entity that orchestrates the challenge. */
        fun challengeOrchestratedBy(challengeOrchestratedBy: Optional<ChallengeOrchestratedBy>) =
            challengeOrchestratedBy(challengeOrchestratedBy.orElse(null))

        /** Entity that orchestrates the challenge. */
        fun challengeOrchestratedBy(challengeOrchestratedBy: JsonField<ChallengeOrchestratedBy>) =
            apply {
                this.challengeOrchestratedBy = challengeOrchestratedBy
            }

        /** Entity that made the authentication decision. */
        fun decisionMadeBy(decisionMadeBy: DecisionMadeBy?) =
            decisionMadeBy(JsonField.ofNullable(decisionMadeBy))

        /** Entity that made the authentication decision. */
        fun decisionMadeBy(decisionMadeBy: Optional<DecisionMadeBy>) =
            decisionMadeBy(decisionMadeBy.orElse(null))

        /** Entity that made the authentication decision. */
        fun decisionMadeBy(decisionMadeBy: JsonField<DecisionMadeBy>) = apply {
            this.decisionMadeBy = decisionMadeBy
        }

        /**
         * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place
         * at the initiation of the merchant rather than the cardholder. The most common example of
         * this is where a merchant is authenticating before billing for a recurring transaction
         * such as a pay TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
         */
        fun threeRiRequestType(threeRiRequestType: ThreeRiRequestType?) =
            threeRiRequestType(JsonField.ofNullable(threeRiRequestType))

        /**
         * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place
         * at the initiation of the merchant rather than the cardholder. The most common example of
         * this is where a merchant is authenticating before billing for a recurring transaction
         * such as a pay TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
         */
        fun threeRiRequestType(threeRiRequestType: Optional<ThreeRiRequestType>) =
            threeRiRequestType(threeRiRequestType.orElse(null))

        /**
         * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place
         * at the initiation of the merchant rather than the cardholder. The most common example of
         * this is where a merchant is authenticating before billing for a recurring transaction
         * such as a pay TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
         */
        fun threeRiRequestType(threeRiRequestType: JsonField<ThreeRiRequestType>) = apply {
            this.threeRiRequestType = threeRiRequestType
        }

        /**
         * Object containing data about the e-commerce transaction for which the merchant is
         * requesting authentication.
         */
        fun transaction(transaction: Transaction?) = transaction(JsonField.ofNullable(transaction))

        /**
         * Object containing data about the e-commerce transaction for which the merchant is
         * requesting authentication.
         */
        fun transaction(transaction: Optional<Transaction>) = transaction(transaction.orElse(null))

        /**
         * Object containing data about the e-commerce transaction for which the merchant is
         * requesting authentication.
         */
        fun transaction(transaction: JsonField<Transaction>) = apply {
            this.transaction = transaction
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

        fun build(): AuthenticationRetrieveResponse =
            AuthenticationRetrieveResponse(
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
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     */
    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CREDIT = of("CREDIT")

            @JvmField val DEBIT = of("DEBIT")

            @JvmField val NOT_APPLICABLE = of("NOT_APPLICABLE")

            @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
            NOT_APPLICABLE,
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            NOT_APPLICABLE,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                NOT_APPLICABLE -> Value.NOT_APPLICABLE
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Indicates the outcome of the 3DS authentication process. */
    class AuthenticationResult
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

            @JvmField val DECLINE = of("DECLINE")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmField val PENDING_CHALLENGE = of("PENDING_CHALLENGE")

            @JvmField val PENDING_DECISION = of("PENDING_DECISION")

            @JvmStatic fun of(value: String) = AuthenticationResult(JsonField.of(value))
        }

        /** An enum containing [AuthenticationResult]'s known values. */
        enum class Known {
            DECLINE,
            SUCCESS,
            PENDING_CHALLENGE,
            PENDING_DECISION,
        }

        /**
         * An enum containing [AuthenticationResult]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DECLINE,
            SUCCESS,
            PENDING_CHALLENGE,
            PENDING_DECISION,
            /**
             * An enum member indicating that [AuthenticationResult] was instantiated with an
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
                DECLINE -> Value.DECLINE
                SUCCESS -> Value.SUCCESS
                PENDING_CHALLENGE -> Value.PENDING_CHALLENGE
                PENDING_DECISION -> Value.PENDING_DECISION
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
                DECLINE -> Known.DECLINE
                SUCCESS -> Known.SUCCESS
                PENDING_CHALLENGE -> Known.PENDING_CHALLENGE
                PENDING_DECISION -> Known.PENDING_DECISION
                else -> throw LithicInvalidDataException("Unknown AuthenticationResult: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationResult && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     */
    class CardExpiryCheck @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MATCH = of("MATCH")

            @JvmField val MISMATCH = of("MISMATCH")

            @JvmField val NOT_PRESENT = of("NOT_PRESENT")

            @JvmStatic fun of(value: String) = CardExpiryCheck(JsonField.of(value))
        }

        /** An enum containing [CardExpiryCheck]'s known values. */
        enum class Known {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
        }

        /**
         * An enum containing [CardExpiryCheck]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CardExpiryCheck] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
            /**
             * An enum member indicating that [CardExpiryCheck] was instantiated with an unknown
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
                MATCH -> Value.MATCH
                MISMATCH -> Value.MISMATCH
                NOT_PRESENT -> Value.NOT_PRESENT
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
                MATCH -> Known.MATCH
                MISMATCH -> Known.MISMATCH
                NOT_PRESENT -> Known.NOT_PRESENT
                else -> throw LithicInvalidDataException("Unknown CardExpiryCheck: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardExpiryCheck && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Object containing data about the cardholder provided during the transaction. */
    @NoAutoDetect
    class Cardholder
    @JsonCreator
    private constructor(
        @JsonProperty("address_match")
        @ExcludeMissing
        private val addressMatch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        private val billingAddress: JsonField<ThreeDSAddress> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_home")
        @ExcludeMissing
        private val phoneNumberHome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_mobile")
        @ExcludeMissing
        private val phoneNumberMobile: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_work")
        @ExcludeMissing
        private val phoneNumberWork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        private val shippingAddress: JsonField<ThreeDSAddress> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Indicates whether the shipping address and billing address provided by the cardholder are
         * the same. This value - and assessment of whether the addresses match - is provided
         * directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS field
         * addrMatch.
         */
        fun addressMatch(): Optional<Boolean> =
            Optional.ofNullable(addressMatch.getNullable("address_match"))

        /** Object containing data on the billing address provided during the transaction. */
        fun billingAddress(): Optional<ThreeDSAddress> =
            Optional.ofNullable(billingAddress.getNullable("billing_address"))

        /**
         * Email address that is either provided by the cardholder or is on file with the merchant
         * in a 3RI request. Maps to EMV 3DS field email.
         */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
         * homePhone.subscriber.
         */
        fun phoneNumberHome(): Optional<String> =
            Optional.ofNullable(phoneNumberHome.getNullable("phone_number_home"))

        /**
         * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
         * mobilePhone.cc and mobilePhone.subscriber.
         */
        fun phoneNumberMobile(): Optional<String> =
            Optional.ofNullable(phoneNumberMobile.getNullable("phone_number_mobile"))

        /**
         * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
         * workPhone.subscriber.
         */
        fun phoneNumberWork(): Optional<String> =
            Optional.ofNullable(phoneNumberWork.getNullable("phone_number_work"))

        /** Object containing data on the shipping address provided during the transaction. */
        fun shippingAddress(): Optional<ThreeDSAddress> =
            Optional.ofNullable(shippingAddress.getNullable("shipping_address"))

        /**
         * Indicates whether the shipping address and billing address provided by the cardholder are
         * the same. This value - and assessment of whether the addresses match - is provided
         * directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS field
         * addrMatch.
         */
        @JsonProperty("address_match")
        @ExcludeMissing
        fun _addressMatch(): JsonField<Boolean> = addressMatch

        /** Object containing data on the billing address provided during the transaction. */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<ThreeDSAddress> = billingAddress

        /**
         * Email address that is either provided by the cardholder or is on file with the merchant
         * in a 3RI request. Maps to EMV 3DS field email.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
         * homePhone.subscriber.
         */
        @JsonProperty("phone_number_home")
        @ExcludeMissing
        fun _phoneNumberHome(): JsonField<String> = phoneNumberHome

        /**
         * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
         * mobilePhone.cc and mobilePhone.subscriber.
         */
        @JsonProperty("phone_number_mobile")
        @ExcludeMissing
        fun _phoneNumberMobile(): JsonField<String> = phoneNumberMobile

        /**
         * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
         * workPhone.subscriber.
         */
        @JsonProperty("phone_number_work")
        @ExcludeMissing
        fun _phoneNumberWork(): JsonField<String> = phoneNumberWork

        /** Object containing data on the shipping address provided during the transaction. */
        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<ThreeDSAddress> = shippingAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Cardholder = apply {
            if (validated) {
                return@apply
            }

            addressMatch()
            billingAddress().ifPresent { it.validate() }
            email()
            name()
            phoneNumberHome()
            phoneNumberMobile()
            phoneNumberWork()
            shippingAddress().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cardholder]. */
        class Builder internal constructor() {

            private var addressMatch: JsonField<Boolean> = JsonMissing.of()
            private var billingAddress: JsonField<ThreeDSAddress> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var phoneNumberHome: JsonField<String> = JsonMissing.of()
            private var phoneNumberMobile: JsonField<String> = JsonMissing.of()
            private var phoneNumberWork: JsonField<String> = JsonMissing.of()
            private var shippingAddress: JsonField<ThreeDSAddress> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholder: Cardholder) = apply {
                addressMatch = cardholder.addressMatch
                billingAddress = cardholder.billingAddress
                email = cardholder.email
                name = cardholder.name
                phoneNumberHome = cardholder.phoneNumberHome
                phoneNumberMobile = cardholder.phoneNumberMobile
                phoneNumberWork = cardholder.phoneNumberWork
                shippingAddress = cardholder.shippingAddress
                additionalProperties = cardholder.additionalProperties.toMutableMap()
            }

            /**
             * Indicates whether the shipping address and billing address provided by the cardholder
             * are the same. This value - and assessment of whether the addresses match - is
             * provided directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS
             * field addrMatch.
             */
            fun addressMatch(addressMatch: Boolean?) =
                addressMatch(JsonField.ofNullable(addressMatch))

            /**
             * Indicates whether the shipping address and billing address provided by the cardholder
             * are the same. This value - and assessment of whether the addresses match - is
             * provided directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS
             * field addrMatch.
             */
            fun addressMatch(addressMatch: Boolean) = addressMatch(addressMatch as Boolean?)

            /**
             * Indicates whether the shipping address and billing address provided by the cardholder
             * are the same. This value - and assessment of whether the addresses match - is
             * provided directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS
             * field addrMatch.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun addressMatch(addressMatch: Optional<Boolean>) =
                addressMatch(addressMatch.orElse(null) as Boolean?)

            /**
             * Indicates whether the shipping address and billing address provided by the cardholder
             * are the same. This value - and assessment of whether the addresses match - is
             * provided directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS
             * field addrMatch.
             */
            fun addressMatch(addressMatch: JsonField<Boolean>) = apply {
                this.addressMatch = addressMatch
            }

            /** Object containing data on the billing address provided during the transaction. */
            fun billingAddress(billingAddress: ThreeDSAddress) =
                billingAddress(JsonField.of(billingAddress))

            /** Object containing data on the billing address provided during the transaction. */
            fun billingAddress(billingAddress: JsonField<ThreeDSAddress>) = apply {
                this.billingAddress = billingAddress
            }

            /**
             * Email address that is either provided by the cardholder or is on file with the
             * merchant in a 3RI request. Maps to EMV 3DS field email.
             */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Email address that is either provided by the cardholder or is on file with the
             * merchant in a 3RI request. Maps to EMV 3DS field email.
             */
            fun email(email: Optional<String>) = email(email.orElse(null))

            /**
             * Email address that is either provided by the cardholder or is on file with the
             * merchant in a 3RI request. Maps to EMV 3DS field email.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
             * homePhone.subscriber.
             */
            fun phoneNumberHome(phoneNumberHome: String?) =
                phoneNumberHome(JsonField.ofNullable(phoneNumberHome))

            /**
             * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
             * homePhone.subscriber.
             */
            fun phoneNumberHome(phoneNumberHome: Optional<String>) =
                phoneNumberHome(phoneNumberHome.orElse(null))

            /**
             * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
             * homePhone.subscriber.
             */
            fun phoneNumberHome(phoneNumberHome: JsonField<String>) = apply {
                this.phoneNumberHome = phoneNumberHome
            }

            /**
             * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
             * mobilePhone.cc and mobilePhone.subscriber.
             */
            fun phoneNumberMobile(phoneNumberMobile: String?) =
                phoneNumberMobile(JsonField.ofNullable(phoneNumberMobile))

            /**
             * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
             * mobilePhone.cc and mobilePhone.subscriber.
             */
            fun phoneNumberMobile(phoneNumberMobile: Optional<String>) =
                phoneNumberMobile(phoneNumberMobile.orElse(null))

            /**
             * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
             * mobilePhone.cc and mobilePhone.subscriber.
             */
            fun phoneNumberMobile(phoneNumberMobile: JsonField<String>) = apply {
                this.phoneNumberMobile = phoneNumberMobile
            }

            /**
             * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
             * workPhone.subscriber.
             */
            fun phoneNumberWork(phoneNumberWork: String?) =
                phoneNumberWork(JsonField.ofNullable(phoneNumberWork))

            /**
             * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
             * workPhone.subscriber.
             */
            fun phoneNumberWork(phoneNumberWork: Optional<String>) =
                phoneNumberWork(phoneNumberWork.orElse(null))

            /**
             * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
             * workPhone.subscriber.
             */
            fun phoneNumberWork(phoneNumberWork: JsonField<String>) = apply {
                this.phoneNumberWork = phoneNumberWork
            }

            /** Object containing data on the shipping address provided during the transaction. */
            fun shippingAddress(shippingAddress: ThreeDSAddress) =
                shippingAddress(JsonField.of(shippingAddress))

            /** Object containing data on the shipping address provided during the transaction. */
            fun shippingAddress(shippingAddress: JsonField<ThreeDSAddress>) = apply {
                this.shippingAddress = shippingAddress
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

            fun build(): Cardholder =
                Cardholder(
                    addressMatch,
                    billingAddress,
                    email,
                    name,
                    phoneNumberHome,
                    phoneNumberMobile,
                    phoneNumberWork,
                    shippingAddress,
                    additionalProperties.toImmutable(),
                )
        }

        /** Object containing data on the billing address provided during the transaction. */
        @NoAutoDetect
        class ThreeDSAddress
        @JsonCreator
        private constructor(
            @JsonProperty("address1")
            @ExcludeMissing
            private val address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address2")
            @ExcludeMissing
            private val address2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address3")
            @ExcludeMissing
            private val address3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country")
            @ExcludeMissing
            private val country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** First line of the street address provided by the cardholder. */
            fun address1(): Optional<String> = Optional.ofNullable(address1.getNullable("address1"))

            /** Second line of the street address provided by the cardholder. */
            fun address2(): Optional<String> = Optional.ofNullable(address2.getNullable("address2"))

            /** Third line of the street address provided by the cardholder. */
            fun address3(): Optional<String> = Optional.ofNullable(address3.getNullable("address3"))

            /** City of the address provided by the cardholder. */
            fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

            /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
            fun postalCode(): Optional<String> =
                Optional.ofNullable(postalCode.getNullable("postal_code"))

            /** First line of the street address provided by the cardholder. */
            @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

            /** Second line of the street address provided by the cardholder. */
            @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

            /** Third line of the street address provided by the cardholder. */
            @JsonProperty("address3") @ExcludeMissing fun _address3(): JsonField<String> = address3

            /** City of the address provided by the cardholder. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ThreeDSAddress = apply {
                if (validated) {
                    return@apply
                }

                address1()
                address2()
                address3()
                city()
                country()
                postalCode()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ThreeDSAddress]. */
            class Builder internal constructor() {

                private var address1: JsonField<String> = JsonMissing.of()
                private var address2: JsonField<String> = JsonMissing.of()
                private var address3: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(threeDSAddress: ThreeDSAddress) = apply {
                    address1 = threeDSAddress.address1
                    address2 = threeDSAddress.address2
                    address3 = threeDSAddress.address3
                    city = threeDSAddress.city
                    country = threeDSAddress.country
                    postalCode = threeDSAddress.postalCode
                    additionalProperties = threeDSAddress.additionalProperties.toMutableMap()
                }

                /** First line of the street address provided by the cardholder. */
                fun address1(address1: String?) = address1(JsonField.ofNullable(address1))

                /** First line of the street address provided by the cardholder. */
                fun address1(address1: Optional<String>) = address1(address1.orElse(null))

                /** First line of the street address provided by the cardholder. */
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Second line of the street address provided by the cardholder. */
                fun address2(address2: String?) = address2(JsonField.ofNullable(address2))

                /** Second line of the street address provided by the cardholder. */
                fun address2(address2: Optional<String>) = address2(address2.orElse(null))

                /** Second line of the street address provided by the cardholder. */
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                /** Third line of the street address provided by the cardholder. */
                fun address3(address3: String?) = address3(JsonField.ofNullable(address3))

                /** Third line of the street address provided by the cardholder. */
                fun address3(address3: Optional<String>) = address3(address3.orElse(null))

                /** Third line of the street address provided by the cardholder. */
                fun address3(address3: JsonField<String>) = apply { this.address3 = address3 }

                /** City of the address provided by the cardholder. */
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /** City of the address provided by the cardholder. */
                fun city(city: Optional<String>) = city(city.orElse(null))

                /** City of the address provided by the cardholder. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format
                 * (e.g. USA)
                 */
                fun country(country: String?) = country(JsonField.ofNullable(country))

                /**
                 * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format
                 * (e.g. USA)
                 */
                fun country(country: Optional<String>) = country(country.orElse(null))

                /**
                 * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format
                 * (e.g. USA)
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
                fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

                /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ThreeDSAddress =
                    ThreeDSAddress(
                        address1,
                        address2,
                        address3,
                        city,
                        country,
                        postalCode,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ThreeDSAddress && address1 == other.address1 && address2 == other.address2 && address3 == other.address3 && city == other.city && country == other.country && postalCode == other.postalCode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address1, address2, address3, city, country, postalCode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThreeDSAddress{address1=$address1, address2=$address2, address3=$address3, city=$city, country=$country, postalCode=$postalCode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Cardholder && addressMatch == other.addressMatch && billingAddress == other.billingAddress && email == other.email && name == other.name && phoneNumberHome == other.phoneNumberHome && phoneNumberMobile == other.phoneNumberMobile && phoneNumberWork == other.phoneNumberWork && shippingAddress == other.shippingAddress && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addressMatch, billingAddress, email, name, phoneNumberHome, phoneNumberMobile, phoneNumberWork, shippingAddress, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cardholder{addressMatch=$addressMatch, billingAddress=$billingAddress, email=$email, name=$name, phoneNumberHome=$phoneNumberHome, phoneNumberMobile=$phoneNumberMobile, phoneNumberWork=$phoneNumberWork, shippingAddress=$shippingAddress, additionalProperties=$additionalProperties}"
    }

    /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
    class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APP_BASED = of("APP_BASED")

            @JvmField val BROWSER = of("BROWSER")

            @JvmField val THREE_DS_REQUESTOR_INITIATED = of("THREE_DS_REQUESTOR_INITIATED")

            @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
        }

        /** An enum containing [Channel]'s known values. */
        enum class Known {
            APP_BASED,
            BROWSER,
            THREE_DS_REQUESTOR_INITIATED,
        }

        /**
         * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP_BASED,
            BROWSER,
            THREE_DS_REQUESTOR_INITIATED,
            /** An enum member indicating that [Channel] was instantiated with an unknown value. */
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
                APP_BASED -> Value.APP_BASED
                BROWSER -> Value.BROWSER
                THREE_DS_REQUESTOR_INITIATED -> Value.THREE_DS_REQUESTOR_INITIATED
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
                APP_BASED -> Known.APP_BASED
                BROWSER -> Known.BROWSER
                THREE_DS_REQUESTOR_INITIATED -> Known.THREE_DS_REQUESTOR_INITIATED
                else -> throw LithicInvalidDataException("Unknown Channel: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Channel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Object containing data about the merchant involved in the e-commerce transaction. */
    @NoAutoDetect
    class Merchant
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcc") @ExcludeMissing private val mcc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("risk_indicator")
        @ExcludeMissing
        private val riskIndicator: JsonField<RiskIndicator> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
         * acquirerMerchantId.
         */
        fun id(): String = id.getRequired("id")

        /**
         * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
         * merchantCountryCode.
         */
        fun country(): String = country.getRequired("country")

        /**
         * Merchant category code assigned to the merchant that describes its business activity
         * type. Maps to EMV 3DS field mcc.
         */
        fun mcc(): String = mcc.getRequired("mcc")

        /** Name of the merchant. Maps to EMV 3DS field merchantName. */
        fun name(): String = name.getRequired("name")

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         */
        fun riskIndicator(): RiskIndicator = riskIndicator.getRequired("risk_indicator")

        /**
         * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
         * acquirerMerchantId.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
         * merchantCountryCode.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Merchant category code assigned to the merchant that describes its business activity
         * type. Maps to EMV 3DS field mcc.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /** Name of the merchant. Maps to EMV 3DS field merchantName. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         */
        @JsonProperty("risk_indicator")
        @ExcludeMissing
        fun _riskIndicator(): JsonField<RiskIndicator> = riskIndicator

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Merchant = apply {
            if (validated) {
                return@apply
            }

            id()
            country()
            mcc()
            name()
            riskIndicator().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Merchant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var mcc: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var riskIndicator: JsonField<RiskIndicator>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(merchant: Merchant) = apply {
                id = merchant.id
                country = merchant.country
                mcc = merchant.mcc
                name = merchant.name
                riskIndicator = merchant.riskIndicator
                additionalProperties = merchant.additionalProperties.toMutableMap()
            }

            /**
             * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
             * acquirerMerchantId.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
             * acquirerMerchantId.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
             * merchantCountryCode.
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
             * merchantCountryCode.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Merchant category code assigned to the merchant that describes its business activity
             * type. Maps to EMV 3DS field mcc.
             */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Merchant category code assigned to the merchant that describes its business activity
             * type. Maps to EMV 3DS field mcc.
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Name of the merchant. Maps to EMV 3DS field merchantName. */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the merchant. Maps to EMV 3DS field merchantName. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Object containing additional data indicating additional risk factors related to the
             * e-commerce transaction.
             */
            fun riskIndicator(riskIndicator: RiskIndicator) =
                riskIndicator(JsonField.of(riskIndicator))

            /**
             * Object containing additional data indicating additional risk factors related to the
             * e-commerce transaction.
             */
            fun riskIndicator(riskIndicator: JsonField<RiskIndicator>) = apply {
                this.riskIndicator = riskIndicator
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

            fun build(): Merchant =
                Merchant(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("mcc", mcc),
                    checkRequired("name", name),
                    checkRequired("riskIndicator", riskIndicator),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         */
        @NoAutoDetect
        class RiskIndicator
        @JsonCreator
        private constructor(
            @JsonProperty("delivery_email_address")
            @ExcludeMissing
            private val deliveryEmailAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivery_time_frame")
            @ExcludeMissing
            private val deliveryTimeFrame: JsonField<DeliveryTimeFrame> = JsonMissing.of(),
            @JsonProperty("gift_card_amount")
            @ExcludeMissing
            private val giftCardAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("gift_card_count")
            @ExcludeMissing
            private val giftCardCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("gift_card_currency")
            @ExcludeMissing
            private val giftCardCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order_availability")
            @ExcludeMissing
            private val orderAvailability: JsonField<OrderAvailability> = JsonMissing.of(),
            @JsonProperty("pre_order_available_date")
            @ExcludeMissing
            private val preOrderAvailableDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("reorder_items")
            @ExcludeMissing
            private val reorderItems: JsonField<ReorderItems> = JsonMissing.of(),
            @JsonProperty("shipping_method")
            @ExcludeMissing
            private val shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * In transactions with electronic delivery, email address to which merchandise is
             * delivered. Maps to EMV 3DS field deliveryEmailAddress.
             */
            fun deliveryEmailAddress(): Optional<String> =
                Optional.ofNullable(deliveryEmailAddress.getNullable("delivery_email_address"))

            /**
             * The delivery time frame for the merchandise. Maps to EMV 3DS field deliveryTimeframe.
             */
            fun deliveryTimeFrame(): Optional<DeliveryTimeFrame> =
                Optional.ofNullable(deliveryTimeFrame.getNullable("delivery_time_frame"))

            /**
             * In prepaid or gift card purchase transactions, purchase amount total in major units
             * (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field giftCardAmount.
             */
            fun giftCardAmount(): Optional<Long> =
                Optional.ofNullable(giftCardAmount.getNullable("gift_card_amount"))

            /**
             * In prepaid or gift card purchase transactions, count of individual prepaid or gift
             * cards/codes purchased. Maps to EMV 3DS field giftCardCount.
             */
            fun giftCardCount(): Optional<Long> =
                Optional.ofNullable(giftCardCount.getNullable("gift_card_count"))

            /**
             * In prepaid or gift card purchase transactions, currency code of the gift card. Maps
             * to EMV 3DS field giftCardCurr.
             */
            fun giftCardCurrency(): Optional<String> =
                Optional.ofNullable(giftCardCurrency.getNullable("gift_card_currency"))

            /**
             * Indicates whether the purchase is for merchandise that is available now or at a
             * future date. Maps to EMV 3DS field preOrderPurchaseInd.
             */
            fun orderAvailability(): Optional<OrderAvailability> =
                Optional.ofNullable(orderAvailability.getNullable("order_availability"))

            /**
             * In pre-order purchase transactions, the expected date that the merchandise will be
             * available. Maps to EMV 3DS field preOrderDate.
             */
            fun preOrderAvailableDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(preOrderAvailableDate.getNullable("pre_order_available_date"))

            /**
             * Indicates whether the cardholder is reordering previously purchased merchandise. Maps
             * to EMV 3DS field reorderItemsInd.
             */
            fun reorderItems(): Optional<ReorderItems> =
                Optional.ofNullable(reorderItems.getNullable("reorder_items"))

            /**
             * Shipping method that the cardholder chose for the transaction. If purchase includes
             * one or more item, this indicator is used for the physical goods; if the purchase only
             * includes digital goods, this indicator is used to describe the most expensive item
             * purchased. Maps to EMV 3DS field shipIndicator.
             */
            fun shippingMethod(): Optional<ShippingMethod> =
                Optional.ofNullable(shippingMethod.getNullable("shipping_method"))

            /**
             * In transactions with electronic delivery, email address to which merchandise is
             * delivered. Maps to EMV 3DS field deliveryEmailAddress.
             */
            @JsonProperty("delivery_email_address")
            @ExcludeMissing
            fun _deliveryEmailAddress(): JsonField<String> = deliveryEmailAddress

            /**
             * The delivery time frame for the merchandise. Maps to EMV 3DS field deliveryTimeframe.
             */
            @JsonProperty("delivery_time_frame")
            @ExcludeMissing
            fun _deliveryTimeFrame(): JsonField<DeliveryTimeFrame> = deliveryTimeFrame

            /**
             * In prepaid or gift card purchase transactions, purchase amount total in major units
             * (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field giftCardAmount.
             */
            @JsonProperty("gift_card_amount")
            @ExcludeMissing
            fun _giftCardAmount(): JsonField<Long> = giftCardAmount

            /**
             * In prepaid or gift card purchase transactions, count of individual prepaid or gift
             * cards/codes purchased. Maps to EMV 3DS field giftCardCount.
             */
            @JsonProperty("gift_card_count")
            @ExcludeMissing
            fun _giftCardCount(): JsonField<Long> = giftCardCount

            /**
             * In prepaid or gift card purchase transactions, currency code of the gift card. Maps
             * to EMV 3DS field giftCardCurr.
             */
            @JsonProperty("gift_card_currency")
            @ExcludeMissing
            fun _giftCardCurrency(): JsonField<String> = giftCardCurrency

            /**
             * Indicates whether the purchase is for merchandise that is available now or at a
             * future date. Maps to EMV 3DS field preOrderPurchaseInd.
             */
            @JsonProperty("order_availability")
            @ExcludeMissing
            fun _orderAvailability(): JsonField<OrderAvailability> = orderAvailability

            /**
             * In pre-order purchase transactions, the expected date that the merchandise will be
             * available. Maps to EMV 3DS field preOrderDate.
             */
            @JsonProperty("pre_order_available_date")
            @ExcludeMissing
            fun _preOrderAvailableDate(): JsonField<OffsetDateTime> = preOrderAvailableDate

            /**
             * Indicates whether the cardholder is reordering previously purchased merchandise. Maps
             * to EMV 3DS field reorderItemsInd.
             */
            @JsonProperty("reorder_items")
            @ExcludeMissing
            fun _reorderItems(): JsonField<ReorderItems> = reorderItems

            /**
             * Shipping method that the cardholder chose for the transaction. If purchase includes
             * one or more item, this indicator is used for the physical goods; if the purchase only
             * includes digital goods, this indicator is used to describe the most expensive item
             * purchased. Maps to EMV 3DS field shipIndicator.
             */
            @JsonProperty("shipping_method")
            @ExcludeMissing
            fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RiskIndicator = apply {
                if (validated) {
                    return@apply
                }

                deliveryEmailAddress()
                deliveryTimeFrame()
                giftCardAmount()
                giftCardCount()
                giftCardCurrency()
                orderAvailability()
                preOrderAvailableDate()
                reorderItems()
                shippingMethod()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RiskIndicator]. */
            class Builder internal constructor() {

                private var deliveryEmailAddress: JsonField<String> = JsonMissing.of()
                private var deliveryTimeFrame: JsonField<DeliveryTimeFrame> = JsonMissing.of()
                private var giftCardAmount: JsonField<Long> = JsonMissing.of()
                private var giftCardCount: JsonField<Long> = JsonMissing.of()
                private var giftCardCurrency: JsonField<String> = JsonMissing.of()
                private var orderAvailability: JsonField<OrderAvailability> = JsonMissing.of()
                private var preOrderAvailableDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var reorderItems: JsonField<ReorderItems> = JsonMissing.of()
                private var shippingMethod: JsonField<ShippingMethod> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(riskIndicator: RiskIndicator) = apply {
                    deliveryEmailAddress = riskIndicator.deliveryEmailAddress
                    deliveryTimeFrame = riskIndicator.deliveryTimeFrame
                    giftCardAmount = riskIndicator.giftCardAmount
                    giftCardCount = riskIndicator.giftCardCount
                    giftCardCurrency = riskIndicator.giftCardCurrency
                    orderAvailability = riskIndicator.orderAvailability
                    preOrderAvailableDate = riskIndicator.preOrderAvailableDate
                    reorderItems = riskIndicator.reorderItems
                    shippingMethod = riskIndicator.shippingMethod
                    additionalProperties = riskIndicator.additionalProperties.toMutableMap()
                }

                /**
                 * In transactions with electronic delivery, email address to which merchandise is
                 * delivered. Maps to EMV 3DS field deliveryEmailAddress.
                 */
                fun deliveryEmailAddress(deliveryEmailAddress: String?) =
                    deliveryEmailAddress(JsonField.ofNullable(deliveryEmailAddress))

                /**
                 * In transactions with electronic delivery, email address to which merchandise is
                 * delivered. Maps to EMV 3DS field deliveryEmailAddress.
                 */
                fun deliveryEmailAddress(deliveryEmailAddress: Optional<String>) =
                    deliveryEmailAddress(deliveryEmailAddress.orElse(null))

                /**
                 * In transactions with electronic delivery, email address to which merchandise is
                 * delivered. Maps to EMV 3DS field deliveryEmailAddress.
                 */
                fun deliveryEmailAddress(deliveryEmailAddress: JsonField<String>) = apply {
                    this.deliveryEmailAddress = deliveryEmailAddress
                }

                /**
                 * The delivery time frame for the merchandise. Maps to EMV 3DS field
                 * deliveryTimeframe.
                 */
                fun deliveryTimeFrame(deliveryTimeFrame: DeliveryTimeFrame?) =
                    deliveryTimeFrame(JsonField.ofNullable(deliveryTimeFrame))

                /**
                 * The delivery time frame for the merchandise. Maps to EMV 3DS field
                 * deliveryTimeframe.
                 */
                fun deliveryTimeFrame(deliveryTimeFrame: Optional<DeliveryTimeFrame>) =
                    deliveryTimeFrame(deliveryTimeFrame.orElse(null))

                /**
                 * The delivery time frame for the merchandise. Maps to EMV 3DS field
                 * deliveryTimeframe.
                 */
                fun deliveryTimeFrame(deliveryTimeFrame: JsonField<DeliveryTimeFrame>) = apply {
                    this.deliveryTimeFrame = deliveryTimeFrame
                }

                /**
                 * In prepaid or gift card purchase transactions, purchase amount total in major
                 * units (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field
                 * giftCardAmount.
                 */
                fun giftCardAmount(giftCardAmount: Long?) =
                    giftCardAmount(JsonField.ofNullable(giftCardAmount))

                /**
                 * In prepaid or gift card purchase transactions, purchase amount total in major
                 * units (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field
                 * giftCardAmount.
                 */
                fun giftCardAmount(giftCardAmount: Long) = giftCardAmount(giftCardAmount as Long?)

                /**
                 * In prepaid or gift card purchase transactions, purchase amount total in major
                 * units (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field
                 * giftCardAmount.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun giftCardAmount(giftCardAmount: Optional<Long>) =
                    giftCardAmount(giftCardAmount.orElse(null) as Long?)

                /**
                 * In prepaid or gift card purchase transactions, purchase amount total in major
                 * units (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field
                 * giftCardAmount.
                 */
                fun giftCardAmount(giftCardAmount: JsonField<Long>) = apply {
                    this.giftCardAmount = giftCardAmount
                }

                /**
                 * In prepaid or gift card purchase transactions, count of individual prepaid or
                 * gift cards/codes purchased. Maps to EMV 3DS field giftCardCount.
                 */
                fun giftCardCount(giftCardCount: Long?) =
                    giftCardCount(JsonField.ofNullable(giftCardCount))

                /**
                 * In prepaid or gift card purchase transactions, count of individual prepaid or
                 * gift cards/codes purchased. Maps to EMV 3DS field giftCardCount.
                 */
                fun giftCardCount(giftCardCount: Long) = giftCardCount(giftCardCount as Long?)

                /**
                 * In prepaid or gift card purchase transactions, count of individual prepaid or
                 * gift cards/codes purchased. Maps to EMV 3DS field giftCardCount.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun giftCardCount(giftCardCount: Optional<Long>) =
                    giftCardCount(giftCardCount.orElse(null) as Long?)

                /**
                 * In prepaid or gift card purchase transactions, count of individual prepaid or
                 * gift cards/codes purchased. Maps to EMV 3DS field giftCardCount.
                 */
                fun giftCardCount(giftCardCount: JsonField<Long>) = apply {
                    this.giftCardCount = giftCardCount
                }

                /**
                 * In prepaid or gift card purchase transactions, currency code of the gift card.
                 * Maps to EMV 3DS field giftCardCurr.
                 */
                fun giftCardCurrency(giftCardCurrency: String?) =
                    giftCardCurrency(JsonField.ofNullable(giftCardCurrency))

                /**
                 * In prepaid or gift card purchase transactions, currency code of the gift card.
                 * Maps to EMV 3DS field giftCardCurr.
                 */
                fun giftCardCurrency(giftCardCurrency: Optional<String>) =
                    giftCardCurrency(giftCardCurrency.orElse(null))

                /**
                 * In prepaid or gift card purchase transactions, currency code of the gift card.
                 * Maps to EMV 3DS field giftCardCurr.
                 */
                fun giftCardCurrency(giftCardCurrency: JsonField<String>) = apply {
                    this.giftCardCurrency = giftCardCurrency
                }

                /**
                 * Indicates whether the purchase is for merchandise that is available now or at a
                 * future date. Maps to EMV 3DS field preOrderPurchaseInd.
                 */
                fun orderAvailability(orderAvailability: OrderAvailability?) =
                    orderAvailability(JsonField.ofNullable(orderAvailability))

                /**
                 * Indicates whether the purchase is for merchandise that is available now or at a
                 * future date. Maps to EMV 3DS field preOrderPurchaseInd.
                 */
                fun orderAvailability(orderAvailability: Optional<OrderAvailability>) =
                    orderAvailability(orderAvailability.orElse(null))

                /**
                 * Indicates whether the purchase is for merchandise that is available now or at a
                 * future date. Maps to EMV 3DS field preOrderPurchaseInd.
                 */
                fun orderAvailability(orderAvailability: JsonField<OrderAvailability>) = apply {
                    this.orderAvailability = orderAvailability
                }

                /**
                 * In pre-order purchase transactions, the expected date that the merchandise will
                 * be available. Maps to EMV 3DS field preOrderDate.
                 */
                fun preOrderAvailableDate(preOrderAvailableDate: OffsetDateTime?) =
                    preOrderAvailableDate(JsonField.ofNullable(preOrderAvailableDate))

                /**
                 * In pre-order purchase transactions, the expected date that the merchandise will
                 * be available. Maps to EMV 3DS field preOrderDate.
                 */
                fun preOrderAvailableDate(preOrderAvailableDate: Optional<OffsetDateTime>) =
                    preOrderAvailableDate(preOrderAvailableDate.orElse(null))

                /**
                 * In pre-order purchase transactions, the expected date that the merchandise will
                 * be available. Maps to EMV 3DS field preOrderDate.
                 */
                fun preOrderAvailableDate(preOrderAvailableDate: JsonField<OffsetDateTime>) =
                    apply {
                        this.preOrderAvailableDate = preOrderAvailableDate
                    }

                /**
                 * Indicates whether the cardholder is reordering previously purchased merchandise.
                 * Maps to EMV 3DS field reorderItemsInd.
                 */
                fun reorderItems(reorderItems: ReorderItems?) =
                    reorderItems(JsonField.ofNullable(reorderItems))

                /**
                 * Indicates whether the cardholder is reordering previously purchased merchandise.
                 * Maps to EMV 3DS field reorderItemsInd.
                 */
                fun reorderItems(reorderItems: Optional<ReorderItems>) =
                    reorderItems(reorderItems.orElse(null))

                /**
                 * Indicates whether the cardholder is reordering previously purchased merchandise.
                 * Maps to EMV 3DS field reorderItemsInd.
                 */
                fun reorderItems(reorderItems: JsonField<ReorderItems>) = apply {
                    this.reorderItems = reorderItems
                }

                /**
                 * Shipping method that the cardholder chose for the transaction. If purchase
                 * includes one or more item, this indicator is used for the physical goods; if the
                 * purchase only includes digital goods, this indicator is used to describe the most
                 * expensive item purchased. Maps to EMV 3DS field shipIndicator.
                 */
                fun shippingMethod(shippingMethod: ShippingMethod?) =
                    shippingMethod(JsonField.ofNullable(shippingMethod))

                /**
                 * Shipping method that the cardholder chose for the transaction. If purchase
                 * includes one or more item, this indicator is used for the physical goods; if the
                 * purchase only includes digital goods, this indicator is used to describe the most
                 * expensive item purchased. Maps to EMV 3DS field shipIndicator.
                 */
                fun shippingMethod(shippingMethod: Optional<ShippingMethod>) =
                    shippingMethod(shippingMethod.orElse(null))

                /**
                 * Shipping method that the cardholder chose for the transaction. If purchase
                 * includes one or more item, this indicator is used for the physical goods; if the
                 * purchase only includes digital goods, this indicator is used to describe the most
                 * expensive item purchased. Maps to EMV 3DS field shipIndicator.
                 */
                fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                    this.shippingMethod = shippingMethod
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): RiskIndicator =
                    RiskIndicator(
                        deliveryEmailAddress,
                        deliveryTimeFrame,
                        giftCardAmount,
                        giftCardCount,
                        giftCardCurrency,
                        orderAvailability,
                        preOrderAvailableDate,
                        reorderItems,
                        shippingMethod,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The delivery time frame for the merchandise. Maps to EMV 3DS field deliveryTimeframe.
             */
            class DeliveryTimeFrame
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ELECTRONIC_DELIVERY = of("ELECTRONIC_DELIVERY")

                    @JvmField val OVERNIGHT_SHIPPING = of("OVERNIGHT_SHIPPING")

                    @JvmField val SAME_DAY_SHIPPING = of("SAME_DAY_SHIPPING")

                    @JvmField val TWO_DAY_OR_MORE_SHIPPING = of("TWO_DAY_OR_MORE_SHIPPING")

                    @JvmStatic fun of(value: String) = DeliveryTimeFrame(JsonField.of(value))
                }

                /** An enum containing [DeliveryTimeFrame]'s known values. */
                enum class Known {
                    ELECTRONIC_DELIVERY,
                    OVERNIGHT_SHIPPING,
                    SAME_DAY_SHIPPING,
                    TWO_DAY_OR_MORE_SHIPPING,
                }

                /**
                 * An enum containing [DeliveryTimeFrame]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DeliveryTimeFrame] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ELECTRONIC_DELIVERY,
                    OVERNIGHT_SHIPPING,
                    SAME_DAY_SHIPPING,
                    TWO_DAY_OR_MORE_SHIPPING,
                    /**
                     * An enum member indicating that [DeliveryTimeFrame] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ELECTRONIC_DELIVERY -> Value.ELECTRONIC_DELIVERY
                        OVERNIGHT_SHIPPING -> Value.OVERNIGHT_SHIPPING
                        SAME_DAY_SHIPPING -> Value.SAME_DAY_SHIPPING
                        TWO_DAY_OR_MORE_SHIPPING -> Value.TWO_DAY_OR_MORE_SHIPPING
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ELECTRONIC_DELIVERY -> Known.ELECTRONIC_DELIVERY
                        OVERNIGHT_SHIPPING -> Known.OVERNIGHT_SHIPPING
                        SAME_DAY_SHIPPING -> Known.SAME_DAY_SHIPPING
                        TWO_DAY_OR_MORE_SHIPPING -> Known.TWO_DAY_OR_MORE_SHIPPING
                        else ->
                            throw LithicInvalidDataException("Unknown DeliveryTimeFrame: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DeliveryTimeFrame && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Indicates whether the purchase is for merchandise that is available now or at a
             * future date. Maps to EMV 3DS field preOrderPurchaseInd.
             */
            class OrderAvailability
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FUTURE_AVAILABILITY = of("FUTURE_AVAILABILITY")

                    @JvmField val MERCHANDISE_AVAILABLE = of("MERCHANDISE_AVAILABLE")

                    @JvmStatic fun of(value: String) = OrderAvailability(JsonField.of(value))
                }

                /** An enum containing [OrderAvailability]'s known values. */
                enum class Known {
                    FUTURE_AVAILABILITY,
                    MERCHANDISE_AVAILABLE,
                }

                /**
                 * An enum containing [OrderAvailability]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [OrderAvailability] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FUTURE_AVAILABILITY,
                    MERCHANDISE_AVAILABLE,
                    /**
                     * An enum member indicating that [OrderAvailability] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FUTURE_AVAILABILITY -> Value.FUTURE_AVAILABILITY
                        MERCHANDISE_AVAILABLE -> Value.MERCHANDISE_AVAILABLE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FUTURE_AVAILABILITY -> Known.FUTURE_AVAILABILITY
                        MERCHANDISE_AVAILABLE -> Known.MERCHANDISE_AVAILABLE
                        else ->
                            throw LithicInvalidDataException("Unknown OrderAvailability: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OrderAvailability && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Indicates whether the cardholder is reordering previously purchased merchandise. Maps
             * to EMV 3DS field reorderItemsInd.
             */
            class ReorderItems
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FIRST_TIME_ORDERED = of("FIRST_TIME_ORDERED")

                    @JvmField val REORDERED = of("REORDERED")

                    @JvmStatic fun of(value: String) = ReorderItems(JsonField.of(value))
                }

                /** An enum containing [ReorderItems]'s known values. */
                enum class Known {
                    FIRST_TIME_ORDERED,
                    REORDERED,
                }

                /**
                 * An enum containing [ReorderItems]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ReorderItems] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIRST_TIME_ORDERED,
                    REORDERED,
                    /**
                     * An enum member indicating that [ReorderItems] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FIRST_TIME_ORDERED -> Value.FIRST_TIME_ORDERED
                        REORDERED -> Value.REORDERED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FIRST_TIME_ORDERED -> Known.FIRST_TIME_ORDERED
                        REORDERED -> Known.REORDERED
                        else -> throw LithicInvalidDataException("Unknown ReorderItems: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ReorderItems && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Shipping method that the cardholder chose for the transaction. If purchase includes
             * one or more item, this indicator is used for the physical goods; if the purchase only
             * includes digital goods, this indicator is used to describe the most expensive item
             * purchased. Maps to EMV 3DS field shipIndicator.
             */
            class ShippingMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DIGITAL_GOODS = of("DIGITAL_GOODS")

                    @JvmField val LOCKER_DELIVERY = of("LOCKER_DELIVERY")

                    @JvmField val OTHER = of("OTHER")

                    @JvmField val PICK_UP_AND_GO_DELIVERY = of("PICK_UP_AND_GO_DELIVERY")

                    @JvmField val SHIP_TO_BILLING_ADDRESS = of("SHIP_TO_BILLING_ADDRESS")

                    @JvmField val SHIP_TO_NON_BILLING_ADDRESS = of("SHIP_TO_NON_BILLING_ADDRESS")

                    @JvmField
                    val SHIP_TO_OTHER_VERIFIED_ADDRESS = of("SHIP_TO_OTHER_VERIFIED_ADDRESS")

                    @JvmField val SHIP_TO_STORE = of("SHIP_TO_STORE")

                    @JvmField val TRAVEL_AND_EVENT_TICKETS = of("TRAVEL_AND_EVENT_TICKETS")

                    @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
                }

                /** An enum containing [ShippingMethod]'s known values. */
                enum class Known {
                    DIGITAL_GOODS,
                    LOCKER_DELIVERY,
                    OTHER,
                    PICK_UP_AND_GO_DELIVERY,
                    SHIP_TO_BILLING_ADDRESS,
                    SHIP_TO_NON_BILLING_ADDRESS,
                    SHIP_TO_OTHER_VERIFIED_ADDRESS,
                    SHIP_TO_STORE,
                    TRAVEL_AND_EVENT_TICKETS,
                }

                /**
                 * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ShippingMethod] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DIGITAL_GOODS,
                    LOCKER_DELIVERY,
                    OTHER,
                    PICK_UP_AND_GO_DELIVERY,
                    SHIP_TO_BILLING_ADDRESS,
                    SHIP_TO_NON_BILLING_ADDRESS,
                    SHIP_TO_OTHER_VERIFIED_ADDRESS,
                    SHIP_TO_STORE,
                    TRAVEL_AND_EVENT_TICKETS,
                    /**
                     * An enum member indicating that [ShippingMethod] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DIGITAL_GOODS -> Value.DIGITAL_GOODS
                        LOCKER_DELIVERY -> Value.LOCKER_DELIVERY
                        OTHER -> Value.OTHER
                        PICK_UP_AND_GO_DELIVERY -> Value.PICK_UP_AND_GO_DELIVERY
                        SHIP_TO_BILLING_ADDRESS -> Value.SHIP_TO_BILLING_ADDRESS
                        SHIP_TO_NON_BILLING_ADDRESS -> Value.SHIP_TO_NON_BILLING_ADDRESS
                        SHIP_TO_OTHER_VERIFIED_ADDRESS -> Value.SHIP_TO_OTHER_VERIFIED_ADDRESS
                        SHIP_TO_STORE -> Value.SHIP_TO_STORE
                        TRAVEL_AND_EVENT_TICKETS -> Value.TRAVEL_AND_EVENT_TICKETS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DIGITAL_GOODS -> Known.DIGITAL_GOODS
                        LOCKER_DELIVERY -> Known.LOCKER_DELIVERY
                        OTHER -> Known.OTHER
                        PICK_UP_AND_GO_DELIVERY -> Known.PICK_UP_AND_GO_DELIVERY
                        SHIP_TO_BILLING_ADDRESS -> Known.SHIP_TO_BILLING_ADDRESS
                        SHIP_TO_NON_BILLING_ADDRESS -> Known.SHIP_TO_NON_BILLING_ADDRESS
                        SHIP_TO_OTHER_VERIFIED_ADDRESS -> Known.SHIP_TO_OTHER_VERIFIED_ADDRESS
                        SHIP_TO_STORE -> Known.SHIP_TO_STORE
                        TRAVEL_AND_EVENT_TICKETS -> Known.TRAVEL_AND_EVENT_TICKETS
                        else -> throw LithicInvalidDataException("Unknown ShippingMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ShippingMethod && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RiskIndicator && deliveryEmailAddress == other.deliveryEmailAddress && deliveryTimeFrame == other.deliveryTimeFrame && giftCardAmount == other.giftCardAmount && giftCardCount == other.giftCardCount && giftCardCurrency == other.giftCardCurrency && orderAvailability == other.orderAvailability && preOrderAvailableDate == other.preOrderAvailableDate && reorderItems == other.reorderItems && shippingMethod == other.shippingMethod && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(deliveryEmailAddress, deliveryTimeFrame, giftCardAmount, giftCardCount, giftCardCurrency, orderAvailability, preOrderAvailableDate, reorderItems, shippingMethod, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RiskIndicator{deliveryEmailAddress=$deliveryEmailAddress, deliveryTimeFrame=$deliveryTimeFrame, giftCardAmount=$giftCardAmount, giftCardCount=$giftCardCount, giftCardCurrency=$giftCardCurrency, orderAvailability=$orderAvailability, preOrderAvailableDate=$preOrderAvailableDate, reorderItems=$reorderItems, shippingMethod=$shippingMethod, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && id == other.id && country == other.country && mcc == other.mcc && name == other.name && riskIndicator == other.riskIndicator && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, country, mcc, name, riskIndicator, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Merchant{id=$id, country=$country, mcc=$mcc, name=$name, riskIndicator=$riskIndicator, additionalProperties=$additionalProperties}"
    }

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     */
    class MessageCategory @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NON_PAYMENT_AUTHENTICATION = of("NON_PAYMENT_AUTHENTICATION")

            @JvmField val PAYMENT_AUTHENTICATION = of("PAYMENT_AUTHENTICATION")

            @JvmStatic fun of(value: String) = MessageCategory(JsonField.of(value))
        }

        /** An enum containing [MessageCategory]'s known values. */
        enum class Known {
            NON_PAYMENT_AUTHENTICATION,
            PAYMENT_AUTHENTICATION,
        }

        /**
         * An enum containing [MessageCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MessageCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NON_PAYMENT_AUTHENTICATION,
            PAYMENT_AUTHENTICATION,
            /**
             * An enum member indicating that [MessageCategory] was instantiated with an unknown
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
                NON_PAYMENT_AUTHENTICATION -> Value.NON_PAYMENT_AUTHENTICATION
                PAYMENT_AUTHENTICATION -> Value.PAYMENT_AUTHENTICATION
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
                NON_PAYMENT_AUTHENTICATION -> Known.NON_PAYMENT_AUTHENTICATION
                PAYMENT_AUTHENTICATION -> Known.PAYMENT_AUTHENTICATION
                else -> throw LithicInvalidDataException("Unknown MessageCategory: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MessageCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates whether a challenge is requested for this transaction
     * - `NO_PREFERENCE` - No Preference
     * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
     * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
     * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
     * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk analysis
     *   is already performed)
     * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
     * - `OTHER` - Other indicators not captured by above. These are rarely used
     */
    class ThreeDSRequestorChallengeIndicator
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

            @JvmField val NO_PREFERENCE = of("NO_PREFERENCE")

            @JvmField val NO_CHALLENGE_REQUESTED = of("NO_CHALLENGE_REQUESTED")

            @JvmField val CHALLENGE_PREFERENCE = of("CHALLENGE_PREFERENCE")

            @JvmField val CHALLENGE_MANDATE = of("CHALLENGE_MANDATE")

            @JvmField
            val NO_CHALLENGE_RISK_ALREADY_ASSESSED = of("NO_CHALLENGE_RISK_ALREADY_ASSESSED")

            @JvmField val DATA_SHARE_ONLY = of("DATA_SHARE_ONLY")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic
            fun of(value: String) = ThreeDSRequestorChallengeIndicator(JsonField.of(value))
        }

        /** An enum containing [ThreeDSRequestorChallengeIndicator]'s known values. */
        enum class Known {
            NO_PREFERENCE,
            NO_CHALLENGE_REQUESTED,
            CHALLENGE_PREFERENCE,
            CHALLENGE_MANDATE,
            NO_CHALLENGE_RISK_ALREADY_ASSESSED,
            DATA_SHARE_ONLY,
            OTHER,
        }

        /**
         * An enum containing [ThreeDSRequestorChallengeIndicator]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ThreeDSRequestorChallengeIndicator] can contain an unknown value in a
         * couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NO_PREFERENCE,
            NO_CHALLENGE_REQUESTED,
            CHALLENGE_PREFERENCE,
            CHALLENGE_MANDATE,
            NO_CHALLENGE_RISK_ALREADY_ASSESSED,
            DATA_SHARE_ONLY,
            OTHER,
            /**
             * An enum member indicating that [ThreeDSRequestorChallengeIndicator] was instantiated
             * with an unknown value.
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
                NO_PREFERENCE -> Value.NO_PREFERENCE
                NO_CHALLENGE_REQUESTED -> Value.NO_CHALLENGE_REQUESTED
                CHALLENGE_PREFERENCE -> Value.CHALLENGE_PREFERENCE
                CHALLENGE_MANDATE -> Value.CHALLENGE_MANDATE
                NO_CHALLENGE_RISK_ALREADY_ASSESSED -> Value.NO_CHALLENGE_RISK_ALREADY_ASSESSED
                DATA_SHARE_ONLY -> Value.DATA_SHARE_ONLY
                OTHER -> Value.OTHER
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
                NO_PREFERENCE -> Known.NO_PREFERENCE
                NO_CHALLENGE_REQUESTED -> Known.NO_CHALLENGE_REQUESTED
                CHALLENGE_PREFERENCE -> Known.CHALLENGE_PREFERENCE
                CHALLENGE_MANDATE -> Known.CHALLENGE_MANDATE
                NO_CHALLENGE_RISK_ALREADY_ASSESSED -> Known.NO_CHALLENGE_RISK_ALREADY_ASSESSED
                DATA_SHARE_ONLY -> Known.DATA_SHARE_ONLY
                OTHER -> Known.OTHER
                else ->
                    throw LithicInvalidDataException(
                        "Unknown ThreeDSRequestorChallengeIndicator: $value"
                    )
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThreeDSRequestorChallengeIndicator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     */
    @NoAutoDetect
    class AdditionalData
    @JsonCreator
    private constructor(
        @JsonProperty("network_decision")
        @ExcludeMissing
        private val networkDecision: JsonField<NetworkDecision> = JsonMissing.of(),
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        private val networkRiskScore: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Mastercard only: Indicates whether the network would have considered the authentication
         * request to be low risk or not.
         */
        fun networkDecision(): Optional<NetworkDecision> =
            Optional.ofNullable(networkDecision.getNullable("network_decision"))

        /**
         * Mastercard only: Assessment by the network of the authentication risk level, with a
         * higher value indicating a higher amount of risk.
         */
        fun networkRiskScore(): Optional<Long> =
            Optional.ofNullable(networkRiskScore.getNullable("network_risk_score"))

        /**
         * Mastercard only: Indicates whether the network would have considered the authentication
         * request to be low risk or not.
         */
        @JsonProperty("network_decision")
        @ExcludeMissing
        fun _networkDecision(): JsonField<NetworkDecision> = networkDecision

        /**
         * Mastercard only: Assessment by the network of the authentication risk level, with a
         * higher value indicating a higher amount of risk.
         */
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        fun _networkRiskScore(): JsonField<Long> = networkRiskScore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AdditionalData = apply {
            if (validated) {
                return@apply
            }

            networkDecision()
            networkRiskScore()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AdditionalData]. */
        class Builder internal constructor() {

            private var networkDecision: JsonField<NetworkDecision> = JsonMissing.of()
            private var networkRiskScore: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(additionalData: AdditionalData) = apply {
                networkDecision = additionalData.networkDecision
                networkRiskScore = additionalData.networkRiskScore
                additionalProperties = additionalData.additionalProperties.toMutableMap()
            }

            /**
             * Mastercard only: Indicates whether the network would have considered the
             * authentication request to be low risk or not.
             */
            fun networkDecision(networkDecision: NetworkDecision?) =
                networkDecision(JsonField.ofNullable(networkDecision))

            /**
             * Mastercard only: Indicates whether the network would have considered the
             * authentication request to be low risk or not.
             */
            fun networkDecision(networkDecision: Optional<NetworkDecision>) =
                networkDecision(networkDecision.orElse(null))

            /**
             * Mastercard only: Indicates whether the network would have considered the
             * authentication request to be low risk or not.
             */
            fun networkDecision(networkDecision: JsonField<NetworkDecision>) = apply {
                this.networkDecision = networkDecision
            }

            /**
             * Mastercard only: Assessment by the network of the authentication risk level, with a
             * higher value indicating a higher amount of risk.
             */
            fun networkRiskScore(networkRiskScore: Long?) =
                networkRiskScore(JsonField.ofNullable(networkRiskScore))

            /**
             * Mastercard only: Assessment by the network of the authentication risk level, with a
             * higher value indicating a higher amount of risk.
             */
            fun networkRiskScore(networkRiskScore: Long) =
                networkRiskScore(networkRiskScore as Long?)

            /**
             * Mastercard only: Assessment by the network of the authentication risk level, with a
             * higher value indicating a higher amount of risk.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun networkRiskScore(networkRiskScore: Optional<Long>) =
                networkRiskScore(networkRiskScore.orElse(null) as Long?)

            /**
             * Mastercard only: Assessment by the network of the authentication risk level, with a
             * higher value indicating a higher amount of risk.
             */
            fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                this.networkRiskScore = networkRiskScore
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

            fun build(): AdditionalData =
                AdditionalData(
                    networkDecision,
                    networkRiskScore,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Mastercard only: Indicates whether the network would have considered the authentication
         * request to be low risk or not.
         */
        class NetworkDecision
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

                @JvmField val LOW_RISK = of("LOW_RISK")

                @JvmField val NOT_LOW_RISK = of("NOT_LOW_RISK")

                @JvmStatic fun of(value: String) = NetworkDecision(JsonField.of(value))
            }

            /** An enum containing [NetworkDecision]'s known values. */
            enum class Known {
                LOW_RISK,
                NOT_LOW_RISK,
            }

            /**
             * An enum containing [NetworkDecision]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [NetworkDecision] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOW_RISK,
                NOT_LOW_RISK,
                /**
                 * An enum member indicating that [NetworkDecision] was instantiated with an unknown
                 * value.
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
                    LOW_RISK -> Value.LOW_RISK
                    NOT_LOW_RISK -> Value.NOT_LOW_RISK
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
                    LOW_RISK -> Known.LOW_RISK
                    NOT_LOW_RISK -> Known.NOT_LOW_RISK
                    else -> throw LithicInvalidDataException("Unknown NetworkDecision: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NetworkDecision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AdditionalData && networkDecision == other.networkDecision && networkRiskScore == other.networkRiskScore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(networkDecision, networkRiskScore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AdditionalData{networkDecision=$networkDecision, networkRiskScore=$networkRiskScore, additionalProperties=$additionalProperties}"
    }

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     */
    @NoAutoDetect
    class App
    @JsonCreator
    private constructor(
        @JsonProperty("device_info")
        @ExcludeMissing
        private val deviceInfo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip") @ExcludeMissing private val ip: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Device information gathered from the cardholder's device - JSON name/value pairs that is
         * Base64url encoded. Maps to EMV 3DS field deviceInfo.
         */
        fun deviceInfo(): Optional<String> =
            Optional.ofNullable(deviceInfo.getNullable("device_info"))

        /**
         * External IP address used by the app generating the 3DS authentication request. Maps to
         * EMV 3DS field appIp.
         */
        fun ip(): Optional<String> = Optional.ofNullable(ip.getNullable("ip"))

        /**
         * Device information gathered from the cardholder's device - JSON name/value pairs that is
         * Base64url encoded. Maps to EMV 3DS field deviceInfo.
         */
        @JsonProperty("device_info")
        @ExcludeMissing
        fun _deviceInfo(): JsonField<String> = deviceInfo

        /**
         * External IP address used by the app generating the 3DS authentication request. Maps to
         * EMV 3DS field appIp.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): App = apply {
            if (validated) {
                return@apply
            }

            deviceInfo()
            ip()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [App]. */
        class Builder internal constructor() {

            private var deviceInfo: JsonField<String> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(app: App) = apply {
                deviceInfo = app.deviceInfo
                ip = app.ip
                additionalProperties = app.additionalProperties.toMutableMap()
            }

            /**
             * Device information gathered from the cardholder's device - JSON name/value pairs that
             * is Base64url encoded. Maps to EMV 3DS field deviceInfo.
             */
            fun deviceInfo(deviceInfo: String?) = deviceInfo(JsonField.ofNullable(deviceInfo))

            /**
             * Device information gathered from the cardholder's device - JSON name/value pairs that
             * is Base64url encoded. Maps to EMV 3DS field deviceInfo.
             */
            fun deviceInfo(deviceInfo: Optional<String>) = deviceInfo(deviceInfo.orElse(null))

            /**
             * Device information gathered from the cardholder's device - JSON name/value pairs that
             * is Base64url encoded. Maps to EMV 3DS field deviceInfo.
             */
            fun deviceInfo(deviceInfo: JsonField<String>) = apply { this.deviceInfo = deviceInfo }

            /**
             * External IP address used by the app generating the 3DS authentication request. Maps
             * to EMV 3DS field appIp.
             */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /**
             * External IP address used by the app generating the 3DS authentication request. Maps
             * to EMV 3DS field appIp.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

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

            fun build(): App = App(deviceInfo, ip, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is App && deviceInfo == other.deviceInfo && ip == other.ip && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(deviceInfo, ip, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "App{deviceInfo=$deviceInfo, ip=$ip, additionalProperties=$additionalProperties}"
    }

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * threeDSRequestorAuthenticationInd.
     */
    class AuthenticationRequestType
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

            @JvmField val ADD_CARD = of("ADD_CARD")

            @JvmField val BILLING_AGREEMENT = of("BILLING_AGREEMENT")

            @JvmField val DELAYED_SHIPMENT = of("DELAYED_SHIPMENT")

            @JvmField
            val EMV_TOKEN_CARDHOLDER_VERIFICATION = of("EMV_TOKEN_CARDHOLDER_VERIFICATION")

            @JvmField val INSTALLMENT_TRANSACTION = of("INSTALLMENT_TRANSACTION")

            @JvmField val MAINTAIN_CARD = of("MAINTAIN_CARD")

            @JvmField val PAYMENT_TRANSACTION = of("PAYMENT_TRANSACTION")

            @JvmField val RECURRING_TRANSACTION = of("RECURRING_TRANSACTION")

            @JvmField val SPLIT_PAYMENT = of("SPLIT_PAYMENT")

            @JvmField val SPLIT_SHIPMENT = of("SPLIT_SHIPMENT")

            @JvmStatic fun of(value: String) = AuthenticationRequestType(JsonField.of(value))
        }

        /** An enum containing [AuthenticationRequestType]'s known values. */
        enum class Known {
            ADD_CARD,
            BILLING_AGREEMENT,
            DELAYED_SHIPMENT,
            EMV_TOKEN_CARDHOLDER_VERIFICATION,
            INSTALLMENT_TRANSACTION,
            MAINTAIN_CARD,
            PAYMENT_TRANSACTION,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
        }

        /**
         * An enum containing [AuthenticationRequestType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationRequestType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADD_CARD,
            BILLING_AGREEMENT,
            DELAYED_SHIPMENT,
            EMV_TOKEN_CARDHOLDER_VERIFICATION,
            INSTALLMENT_TRANSACTION,
            MAINTAIN_CARD,
            PAYMENT_TRANSACTION,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
            /**
             * An enum member indicating that [AuthenticationRequestType] was instantiated with an
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
                ADD_CARD -> Value.ADD_CARD
                BILLING_AGREEMENT -> Value.BILLING_AGREEMENT
                DELAYED_SHIPMENT -> Value.DELAYED_SHIPMENT
                EMV_TOKEN_CARDHOLDER_VERIFICATION -> Value.EMV_TOKEN_CARDHOLDER_VERIFICATION
                INSTALLMENT_TRANSACTION -> Value.INSTALLMENT_TRANSACTION
                MAINTAIN_CARD -> Value.MAINTAIN_CARD
                PAYMENT_TRANSACTION -> Value.PAYMENT_TRANSACTION
                RECURRING_TRANSACTION -> Value.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Value.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Value.SPLIT_SHIPMENT
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
                ADD_CARD -> Known.ADD_CARD
                BILLING_AGREEMENT -> Known.BILLING_AGREEMENT
                DELAYED_SHIPMENT -> Known.DELAYED_SHIPMENT
                EMV_TOKEN_CARDHOLDER_VERIFICATION -> Known.EMV_TOKEN_CARDHOLDER_VERIFICATION
                INSTALLMENT_TRANSACTION -> Known.INSTALLMENT_TRANSACTION
                MAINTAIN_CARD -> Known.MAINTAIN_CARD
                PAYMENT_TRANSACTION -> Known.PAYMENT_TRANSACTION
                RECURRING_TRANSACTION -> Known.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Known.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Known.SPLIT_SHIPMENT
                else ->
                    throw LithicInvalidDataException("Unknown AuthenticationRequestType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationRequestType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     */
    @NoAutoDetect
    class Browser
    @JsonCreator
    private constructor(
        @JsonProperty("ip") @ExcludeMissing private val ip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("java_enabled")
        @ExcludeMissing
        private val javaEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("javascript_enabled")
        @ExcludeMissing
        private val javascriptEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("language")
        @ExcludeMissing
        private val language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("time_zone")
        @ExcludeMissing
        private val timeZone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_agent")
        @ExcludeMissing
        private val userAgent: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
         * merchant or digital wallet). Maps to EMV 3DS field browserIP.
         */
        fun ip(): Optional<String> = Optional.ofNullable(ip.getNullable("ip"))

        /**
         * Indicates whether the cardholder's browser has the ability to execute Java. Maps to EMV
         * 3DS field browserJavaEnabled.
         */
        fun javaEnabled(): Optional<Boolean> =
            Optional.ofNullable(javaEnabled.getNullable("java_enabled"))

        /**
         * Indicates whether the cardholder's browser has the ability to execute JavaScript. Maps to
         * EMV 3DS field browserJavascriptEnabled.
         */
        fun javascriptEnabled(): Optional<Boolean> =
            Optional.ofNullable(javascriptEnabled.getNullable("javascript_enabled"))

        /**
         * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
         * browserLanguage.
         */
        fun language(): Optional<String> = Optional.ofNullable(language.getNullable("language"))

        /**
         * Time zone of the cardholder's browser offset in minutes between UTC and the cardholder
         * browser's local time. The offset is positive if the local time is behind UTC and negative
         * if it is ahead. Maps to EMV 3DS field browserTz.
         */
        fun timeZone(): Optional<String> = Optional.ofNullable(timeZone.getNullable("time_zone"))

        /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
        fun userAgent(): Optional<String> = Optional.ofNullable(userAgent.getNullable("user_agent"))

        /**
         * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
         * merchant or digital wallet). Maps to EMV 3DS field browserIP.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        /**
         * Indicates whether the cardholder's browser has the ability to execute Java. Maps to EMV
         * 3DS field browserJavaEnabled.
         */
        @JsonProperty("java_enabled")
        @ExcludeMissing
        fun _javaEnabled(): JsonField<Boolean> = javaEnabled

        /**
         * Indicates whether the cardholder's browser has the ability to execute JavaScript. Maps to
         * EMV 3DS field browserJavascriptEnabled.
         */
        @JsonProperty("javascript_enabled")
        @ExcludeMissing
        fun _javascriptEnabled(): JsonField<Boolean> = javascriptEnabled

        /**
         * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
         * browserLanguage.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Time zone of the cardholder's browser offset in minutes between UTC and the cardholder
         * browser's local time. The offset is positive if the local time is behind UTC and negative
         * if it is ahead. Maps to EMV 3DS field browserTz.
         */
        @JsonProperty("time_zone") @ExcludeMissing fun _timeZone(): JsonField<String> = timeZone

        /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
        @JsonProperty("user_agent") @ExcludeMissing fun _userAgent(): JsonField<String> = userAgent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Browser = apply {
            if (validated) {
                return@apply
            }

            ip()
            javaEnabled()
            javascriptEnabled()
            language()
            timeZone()
            userAgent()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Browser]. */
        class Builder internal constructor() {

            private var ip: JsonField<String> = JsonMissing.of()
            private var javaEnabled: JsonField<Boolean> = JsonMissing.of()
            private var javascriptEnabled: JsonField<Boolean> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var timeZone: JsonField<String> = JsonMissing.of()
            private var userAgent: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(browser: Browser) = apply {
                ip = browser.ip
                javaEnabled = browser.javaEnabled
                javascriptEnabled = browser.javascriptEnabled
                language = browser.language
                timeZone = browser.timeZone
                userAgent = browser.userAgent
                additionalProperties = browser.additionalProperties.toMutableMap()
            }

            /**
             * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
             * merchant or digital wallet). Maps to EMV 3DS field browserIP.
             */
            fun ip(ip: String?) = ip(JsonField.ofNullable(ip))

            /**
             * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
             * merchant or digital wallet). Maps to EMV 3DS field browserIP.
             */
            fun ip(ip: Optional<String>) = ip(ip.orElse(null))

            /**
             * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
             * merchant or digital wallet). Maps to EMV 3DS field browserIP.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            /**
             * Indicates whether the cardholder's browser has the ability to execute Java. Maps to
             * EMV 3DS field browserJavaEnabled.
             */
            fun javaEnabled(javaEnabled: Boolean?) = javaEnabled(JsonField.ofNullable(javaEnabled))

            /**
             * Indicates whether the cardholder's browser has the ability to execute Java. Maps to
             * EMV 3DS field browserJavaEnabled.
             */
            fun javaEnabled(javaEnabled: Boolean) = javaEnabled(javaEnabled as Boolean?)

            /**
             * Indicates whether the cardholder's browser has the ability to execute Java. Maps to
             * EMV 3DS field browserJavaEnabled.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun javaEnabled(javaEnabled: Optional<Boolean>) =
                javaEnabled(javaEnabled.orElse(null) as Boolean?)

            /**
             * Indicates whether the cardholder's browser has the ability to execute Java. Maps to
             * EMV 3DS field browserJavaEnabled.
             */
            fun javaEnabled(javaEnabled: JsonField<Boolean>) = apply {
                this.javaEnabled = javaEnabled
            }

            /**
             * Indicates whether the cardholder's browser has the ability to execute JavaScript.
             * Maps to EMV 3DS field browserJavascriptEnabled.
             */
            fun javascriptEnabled(javascriptEnabled: Boolean?) =
                javascriptEnabled(JsonField.ofNullable(javascriptEnabled))

            /**
             * Indicates whether the cardholder's browser has the ability to execute JavaScript.
             * Maps to EMV 3DS field browserJavascriptEnabled.
             */
            fun javascriptEnabled(javascriptEnabled: Boolean) =
                javascriptEnabled(javascriptEnabled as Boolean?)

            /**
             * Indicates whether the cardholder's browser has the ability to execute JavaScript.
             * Maps to EMV 3DS field browserJavascriptEnabled.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun javascriptEnabled(javascriptEnabled: Optional<Boolean>) =
                javascriptEnabled(javascriptEnabled.orElse(null) as Boolean?)

            /**
             * Indicates whether the cardholder's browser has the ability to execute JavaScript.
             * Maps to EMV 3DS field browserJavascriptEnabled.
             */
            fun javascriptEnabled(javascriptEnabled: JsonField<Boolean>) = apply {
                this.javascriptEnabled = javascriptEnabled
            }

            /**
             * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
             * browserLanguage.
             */
            fun language(language: String?) = language(JsonField.ofNullable(language))

            /**
             * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
             * browserLanguage.
             */
            fun language(language: Optional<String>) = language(language.orElse(null))

            /**
             * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
             * browserLanguage.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /**
             * Time zone of the cardholder's browser offset in minutes between UTC and the
             * cardholder browser's local time. The offset is positive if the local time is behind
             * UTC and negative if it is ahead. Maps to EMV 3DS field browserTz.
             */
            fun timeZone(timeZone: String?) = timeZone(JsonField.ofNullable(timeZone))

            /**
             * Time zone of the cardholder's browser offset in minutes between UTC and the
             * cardholder browser's local time. The offset is positive if the local time is behind
             * UTC and negative if it is ahead. Maps to EMV 3DS field browserTz.
             */
            fun timeZone(timeZone: Optional<String>) = timeZone(timeZone.orElse(null))

            /**
             * Time zone of the cardholder's browser offset in minutes between UTC and the
             * cardholder browser's local time. The offset is positive if the local time is behind
             * UTC and negative if it is ahead. Maps to EMV 3DS field browserTz.
             */
            fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

            /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
            fun userAgent(userAgent: String?) = userAgent(JsonField.ofNullable(userAgent))

            /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
            fun userAgent(userAgent: Optional<String>) = userAgent(userAgent.orElse(null))

            /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
            fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

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

            fun build(): Browser =
                Browser(
                    ip,
                    javaEnabled,
                    javascriptEnabled,
                    language,
                    timeZone,
                    userAgent,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Browser && ip == other.ip && javaEnabled == other.javaEnabled && javascriptEnabled == other.javascriptEnabled && language == other.language && timeZone == other.timeZone && userAgent == other.userAgent && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ip, javaEnabled, javascriptEnabled, language, timeZone, userAgent, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Browser{ip=$ip, javaEnabled=$javaEnabled, javascriptEnabled=$javascriptEnabled, language=$language, timeZone=$timeZone, userAgent=$userAgent, additionalProperties=$additionalProperties}"
    }

    /** Metadata about the challenge method and delivery. */
    @NoAutoDetect
    class ChallengeMetadata
    @JsonCreator
    private constructor(
        @JsonProperty("method_type")
        @ExcludeMissing
        private val methodType: JsonField<MethodType> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        private val phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of challenge method used for authentication. */
        fun methodType(): MethodType = methodType.getRequired("method_type")

        /** The phone number used for delivering the OTP. Relevant only for SMS_OTP method. */
        fun phoneNumber(): Optional<String> =
            Optional.ofNullable(phoneNumber.getNullable("phone_number"))

        /** The type of challenge method used for authentication. */
        @JsonProperty("method_type")
        @ExcludeMissing
        fun _methodType(): JsonField<MethodType> = methodType

        /** The phone number used for delivering the OTP. Relevant only for SMS_OTP method. */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ChallengeMetadata = apply {
            if (validated) {
                return@apply
            }

            methodType()
            phoneNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ChallengeMetadata]. */
        class Builder internal constructor() {

            private var methodType: JsonField<MethodType>? = null
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(challengeMetadata: ChallengeMetadata) = apply {
                methodType = challengeMetadata.methodType
                phoneNumber = challengeMetadata.phoneNumber
                additionalProperties = challengeMetadata.additionalProperties.toMutableMap()
            }

            /** The type of challenge method used for authentication. */
            fun methodType(methodType: MethodType) = methodType(JsonField.of(methodType))

            /** The type of challenge method used for authentication. */
            fun methodType(methodType: JsonField<MethodType>) = apply {
                this.methodType = methodType
            }

            /** The phone number used for delivering the OTP. Relevant only for SMS_OTP method. */
            fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

            /** The phone number used for delivering the OTP. Relevant only for SMS_OTP method. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.orElse(null))

            /** The phone number used for delivering the OTP. Relevant only for SMS_OTP method. */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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

            fun build(): ChallengeMetadata =
                ChallengeMetadata(
                    checkRequired("methodType", methodType),
                    phoneNumber,
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of challenge method used for authentication. */
        class MethodType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val SMS_OTP = of("SMS_OTP")

                @JvmField val OUT_OF_BAND = of("OUT_OF_BAND")

                @JvmStatic fun of(value: String) = MethodType(JsonField.of(value))
            }

            /** An enum containing [MethodType]'s known values. */
            enum class Known {
                SMS_OTP,
                OUT_OF_BAND,
            }

            /**
             * An enum containing [MethodType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [MethodType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SMS_OTP,
                OUT_OF_BAND,
                /**
                 * An enum member indicating that [MethodType] was instantiated with an unknown
                 * value.
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
                    SMS_OTP -> Value.SMS_OTP
                    OUT_OF_BAND -> Value.OUT_OF_BAND
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
                    SMS_OTP -> Known.SMS_OTP
                    OUT_OF_BAND -> Known.OUT_OF_BAND
                    else -> throw LithicInvalidDataException("Unknown MethodType: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MethodType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChallengeMetadata && methodType == other.methodType && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(methodType, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChallengeMetadata{methodType=$methodType, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** Entity that orchestrates the challenge. */
    class ChallengeOrchestratedBy
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

            @JvmField val LITHIC = of("LITHIC")

            @JvmField val CUSTOMER = of("CUSTOMER")

            @JvmField val NO_CHALLENGE = of("NO_CHALLENGE")

            @JvmStatic fun of(value: String) = ChallengeOrchestratedBy(JsonField.of(value))
        }

        /** An enum containing [ChallengeOrchestratedBy]'s known values. */
        enum class Known {
            LITHIC,
            CUSTOMER,
            NO_CHALLENGE,
        }

        /**
         * An enum containing [ChallengeOrchestratedBy]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ChallengeOrchestratedBy] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LITHIC,
            CUSTOMER,
            NO_CHALLENGE,
            /**
             * An enum member indicating that [ChallengeOrchestratedBy] was instantiated with an
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
                LITHIC -> Value.LITHIC
                CUSTOMER -> Value.CUSTOMER
                NO_CHALLENGE -> Value.NO_CHALLENGE
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
                LITHIC -> Known.LITHIC
                CUSTOMER -> Known.CUSTOMER
                NO_CHALLENGE -> Known.NO_CHALLENGE
                else -> throw LithicInvalidDataException("Unknown ChallengeOrchestratedBy: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChallengeOrchestratedBy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Entity that made the authentication decision. */
    class DecisionMadeBy @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CUSTOMER_ENDPOINT = of("CUSTOMER_ENDPOINT")

            @JvmField val LITHIC_DEFAULT = of("LITHIC_DEFAULT")

            @JvmField val LITHIC_RULES = of("LITHIC_RULES")

            @JvmField val NETWORK = of("NETWORK")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = DecisionMadeBy(JsonField.of(value))
        }

        /** An enum containing [DecisionMadeBy]'s known values. */
        enum class Known {
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
        }

        /**
         * An enum containing [DecisionMadeBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DecisionMadeBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
            /**
             * An enum member indicating that [DecisionMadeBy] was instantiated with an unknown
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
                CUSTOMER_ENDPOINT -> Value.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Value.LITHIC_DEFAULT
                LITHIC_RULES -> Value.LITHIC_RULES
                NETWORK -> Value.NETWORK
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
                CUSTOMER_ENDPOINT -> Known.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Known.LITHIC_DEFAULT
                LITHIC_RULES -> Known.LITHIC_RULES
                NETWORK -> Known.NETWORK
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown DecisionMadeBy: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DecisionMadeBy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place at
     * the initiation of the merchant rather than the cardholder. The most common example of this is
     * where a merchant is authenticating before billing for a recurring transaction such as a pay
     * TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
     */
    class ThreeRiRequestType
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

            @JvmField val ACCOUNT_VERIFICATION = of("ACCOUNT_VERIFICATION")

            @JvmField val ADD_CARD = of("ADD_CARD")

            @JvmField val BILLING_AGREEMENT = of("BILLING_AGREEMENT")

            @JvmField val CARD_SECURITY_CODE_STATUS_CHECK = of("CARD_SECURITY_CODE_STATUS_CHECK")

            @JvmField val DELAYED_SHIPMENT = of("DELAYED_SHIPMENT")

            @JvmField val DEVICE_BINDING_STATUS_CHECK = of("DEVICE_BINDING_STATUS_CHECK")

            @JvmField val INSTALLMENT_TRANSACTION = of("INSTALLMENT_TRANSACTION")

            @JvmField val MAIL_ORDER = of("MAIL_ORDER")

            @JvmField val MAINTAIN_CARD_INFO = of("MAINTAIN_CARD_INFO")

            @JvmField val OTHER_PAYMENT = of("OTHER_PAYMENT")

            @JvmField val RECURRING_TRANSACTION = of("RECURRING_TRANSACTION")

            @JvmField val SPLIT_PAYMENT = of("SPLIT_PAYMENT")

            @JvmField val SPLIT_SHIPMENT = of("SPLIT_SHIPMENT")

            @JvmField val TELEPHONE_ORDER = of("TELEPHONE_ORDER")

            @JvmField val TOP_UP = of("TOP_UP")

            @JvmField val TRUST_LIST_STATUS_CHECK = of("TRUST_LIST_STATUS_CHECK")

            @JvmStatic fun of(value: String) = ThreeRiRequestType(JsonField.of(value))
        }

        /** An enum containing [ThreeRiRequestType]'s known values. */
        enum class Known {
            ACCOUNT_VERIFICATION,
            ADD_CARD,
            BILLING_AGREEMENT,
            CARD_SECURITY_CODE_STATUS_CHECK,
            DELAYED_SHIPMENT,
            DEVICE_BINDING_STATUS_CHECK,
            INSTALLMENT_TRANSACTION,
            MAIL_ORDER,
            MAINTAIN_CARD_INFO,
            OTHER_PAYMENT,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
            TELEPHONE_ORDER,
            TOP_UP,
            TRUST_LIST_STATUS_CHECK,
        }

        /**
         * An enum containing [ThreeRiRequestType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ThreeRiRequestType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_VERIFICATION,
            ADD_CARD,
            BILLING_AGREEMENT,
            CARD_SECURITY_CODE_STATUS_CHECK,
            DELAYED_SHIPMENT,
            DEVICE_BINDING_STATUS_CHECK,
            INSTALLMENT_TRANSACTION,
            MAIL_ORDER,
            MAINTAIN_CARD_INFO,
            OTHER_PAYMENT,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
            TELEPHONE_ORDER,
            TOP_UP,
            TRUST_LIST_STATUS_CHECK,
            /**
             * An enum member indicating that [ThreeRiRequestType] was instantiated with an unknown
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
                ACCOUNT_VERIFICATION -> Value.ACCOUNT_VERIFICATION
                ADD_CARD -> Value.ADD_CARD
                BILLING_AGREEMENT -> Value.BILLING_AGREEMENT
                CARD_SECURITY_CODE_STATUS_CHECK -> Value.CARD_SECURITY_CODE_STATUS_CHECK
                DELAYED_SHIPMENT -> Value.DELAYED_SHIPMENT
                DEVICE_BINDING_STATUS_CHECK -> Value.DEVICE_BINDING_STATUS_CHECK
                INSTALLMENT_TRANSACTION -> Value.INSTALLMENT_TRANSACTION
                MAIL_ORDER -> Value.MAIL_ORDER
                MAINTAIN_CARD_INFO -> Value.MAINTAIN_CARD_INFO
                OTHER_PAYMENT -> Value.OTHER_PAYMENT
                RECURRING_TRANSACTION -> Value.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Value.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Value.SPLIT_SHIPMENT
                TELEPHONE_ORDER -> Value.TELEPHONE_ORDER
                TOP_UP -> Value.TOP_UP
                TRUST_LIST_STATUS_CHECK -> Value.TRUST_LIST_STATUS_CHECK
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
                ACCOUNT_VERIFICATION -> Known.ACCOUNT_VERIFICATION
                ADD_CARD -> Known.ADD_CARD
                BILLING_AGREEMENT -> Known.BILLING_AGREEMENT
                CARD_SECURITY_CODE_STATUS_CHECK -> Known.CARD_SECURITY_CODE_STATUS_CHECK
                DELAYED_SHIPMENT -> Known.DELAYED_SHIPMENT
                DEVICE_BINDING_STATUS_CHECK -> Known.DEVICE_BINDING_STATUS_CHECK
                INSTALLMENT_TRANSACTION -> Known.INSTALLMENT_TRANSACTION
                MAIL_ORDER -> Known.MAIL_ORDER
                MAINTAIN_CARD_INFO -> Known.MAINTAIN_CARD_INFO
                OTHER_PAYMENT -> Known.OTHER_PAYMENT
                RECURRING_TRANSACTION -> Known.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Known.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Known.SPLIT_SHIPMENT
                TELEPHONE_ORDER -> Known.TELEPHONE_ORDER
                TOP_UP -> Known.TOP_UP
                TRUST_LIST_STATUS_CHECK -> Known.TRUST_LIST_STATUS_CHECK
                else -> throw LithicInvalidDataException("Unknown ThreeRiRequestType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThreeRiRequestType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     */
    @NoAutoDetect
    class Transaction
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        private val currencyExponent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("date_time")
        @ExcludeMissing
        private val dateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount of the purchase in minor units of currency with all punctuation removed. Maps to
         * EMV 3DS field purchaseAmount.
         */
        fun amount(): Double = amount.getRequired("amount")

        /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
         * field purchaseExponent.
         */
        fun currencyExponent(): Double = currencyExponent.getRequired("currency_exponent")

        /**
         * Date and time when the authentication was generated by the merchant/acquirer's 3DS
         * server. Maps to EMV 3DS field purchaseDate.
         */
        fun dateTime(): OffsetDateTime = dateTime.getRequired("date_time")

        /**
         * Type of the transaction for which a 3DS authentication request is occurring. Maps to EMV
         * 3DS field transType.
         */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Amount of the purchase in minor units of currency with all punctuation removed. Maps to
         * EMV 3DS field purchaseAmount.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
         * field purchaseExponent.
         */
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        fun _currencyExponent(): JsonField<Double> = currencyExponent

        /**
         * Date and time when the authentication was generated by the merchant/acquirer's 3DS
         * server. Maps to EMV 3DS field purchaseDate.
         */
        @JsonProperty("date_time")
        @ExcludeMissing
        fun _dateTime(): JsonField<OffsetDateTime> = dateTime

        /**
         * Type of the transaction for which a 3DS authentication request is occurring. Maps to EMV
         * 3DS field transType.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Transaction = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency()
            currencyExponent()
            dateTime()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transaction]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var currency: JsonField<String>? = null
            private var currencyExponent: JsonField<Double>? = null
            private var dateTime: JsonField<OffsetDateTime>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transaction: Transaction) = apply {
                amount = transaction.amount
                currency = transaction.currency
                currencyExponent = transaction.currencyExponent
                dateTime = transaction.dateTime
                type = transaction.type
                additionalProperties = transaction.additionalProperties.toMutableMap()
            }

            /**
             * Amount of the purchase in minor units of currency with all punctuation removed. Maps
             * to EMV 3DS field purchaseAmount.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Amount of the purchase in minor units of currency with all punctuation removed. Maps
             * to EMV 3DS field purchaseAmount.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
             * field purchaseExponent.
             */
            fun currencyExponent(currencyExponent: Double) =
                currencyExponent(JsonField.of(currencyExponent))

            /**
             * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
             * field purchaseExponent.
             */
            fun currencyExponent(currencyExponent: JsonField<Double>) = apply {
                this.currencyExponent = currencyExponent
            }

            /**
             * Date and time when the authentication was generated by the merchant/acquirer's 3DS
             * server. Maps to EMV 3DS field purchaseDate.
             */
            fun dateTime(dateTime: OffsetDateTime) = dateTime(JsonField.of(dateTime))

            /**
             * Date and time when the authentication was generated by the merchant/acquirer's 3DS
             * server. Maps to EMV 3DS field purchaseDate.
             */
            fun dateTime(dateTime: JsonField<OffsetDateTime>) = apply { this.dateTime = dateTime }

            /**
             * Type of the transaction for which a 3DS authentication request is occurring. Maps to
             * EMV 3DS field transType.
             */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /**
             * Type of the transaction for which a 3DS authentication request is occurring. Maps to
             * EMV 3DS field transType.
             */
            fun type(type: Optional<Type>) = type(type.orElse(null))

            /**
             * Type of the transaction for which a 3DS authentication request is occurring. Maps to
             * EMV 3DS field transType.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): Transaction =
                Transaction(
                    checkRequired("amount", amount),
                    checkRequired("currency", currency),
                    checkRequired("currencyExponent", currencyExponent),
                    checkRequired("dateTime", dateTime),
                    checkRequired("type", type),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Type of the transaction for which a 3DS authentication request is occurring. Maps to EMV
         * 3DS field transType.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACCOUNT_FUNDING = of("ACCOUNT_FUNDING")

                @JvmField val CHECK_ACCEPTANCE = of("CHECK_ACCEPTANCE")

                @JvmField val GOODS_SERVICE_PURCHASE = of("GOODS_SERVICE_PURCHASE")

                @JvmField val PREPAID_ACTIVATION_AND_LOAD = of("PREPAID_ACTIVATION_AND_LOAD")

                @JvmField val QUASI_CASH_TRANSACTION = of("QUASI_CASH_TRANSACTION")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACCOUNT_FUNDING,
                CHECK_ACCEPTANCE,
                GOODS_SERVICE_PURCHASE,
                PREPAID_ACTIVATION_AND_LOAD,
                QUASI_CASH_TRANSACTION,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_FUNDING,
                CHECK_ACCEPTANCE,
                GOODS_SERVICE_PURCHASE,
                PREPAID_ACTIVATION_AND_LOAD,
                QUASI_CASH_TRANSACTION,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                    CHECK_ACCEPTANCE -> Value.CHECK_ACCEPTANCE
                    GOODS_SERVICE_PURCHASE -> Value.GOODS_SERVICE_PURCHASE
                    PREPAID_ACTIVATION_AND_LOAD -> Value.PREPAID_ACTIVATION_AND_LOAD
                    QUASI_CASH_TRANSACTION -> Value.QUASI_CASH_TRANSACTION
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
                    ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                    CHECK_ACCEPTANCE -> Known.CHECK_ACCEPTANCE
                    GOODS_SERVICE_PURCHASE -> Known.GOODS_SERVICE_PURCHASE
                    PREPAID_ACTIVATION_AND_LOAD -> Known.PREPAID_ACTIVATION_AND_LOAD
                    QUASI_CASH_TRANSACTION -> Known.QUASI_CASH_TRANSACTION
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transaction && amount == other.amount && currency == other.currency && currencyExponent == other.currencyExponent && dateTime == other.dateTime && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, currency, currencyExponent, dateTime, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transaction{amount=$amount, currency=$currency, currencyExponent=$currencyExponent, dateTime=$dateTime, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthenticationRetrieveResponse && token == other.token && accountType == other.accountType && authenticationResult == other.authenticationResult && cardExpiryCheck == other.cardExpiryCheck && cardToken == other.cardToken && cardholder == other.cardholder && channel == other.channel && created == other.created && merchant == other.merchant && messageCategory == other.messageCategory && threeDSRequestorChallengeIndicator == other.threeDSRequestorChallengeIndicator && additionalData == other.additionalData && app == other.app && authenticationRequestType == other.authenticationRequestType && browser == other.browser && challengeMetadata == other.challengeMetadata && challengeOrchestratedBy == other.challengeOrchestratedBy && decisionMadeBy == other.decisionMadeBy && threeRiRequestType == other.threeRiRequestType && transaction == other.transaction && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountType, authenticationResult, cardExpiryCheck, cardToken, cardholder, channel, created, merchant, messageCategory, threeDSRequestorChallengeIndicator, additionalData, app, authenticationRequestType, browser, challengeMetadata, challengeOrchestratedBy, decisionMadeBy, threeRiRequestType, transaction, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthenticationRetrieveResponse{token=$token, accountType=$accountType, authenticationResult=$authenticationResult, cardExpiryCheck=$cardExpiryCheck, cardToken=$cardToken, cardholder=$cardholder, channel=$channel, created=$created, merchant=$merchant, messageCategory=$messageCategory, threeDSRequestorChallengeIndicator=$threeDSRequestorChallengeIndicator, additionalData=$additionalData, app=$app, authenticationRequestType=$authenticationRequestType, browser=$browser, challengeMetadata=$challengeMetadata, challengeOrchestratedBy=$challengeOrchestratedBy, decisionMadeBy=$decisionMadeBy, threeRiRequestType=$threeRiRequestType, transaction=$transaction, additionalProperties=$additionalProperties}"
}
