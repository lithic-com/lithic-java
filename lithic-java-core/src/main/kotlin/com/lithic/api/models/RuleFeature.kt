// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A feature made available to the rule. The `name` field is the variable name used in the rule
 * function signature. The `type` field determines which data the feature provides to the rule at
 * evaluation time.
 * - `AUTHORIZATION`: The authorization request being evaluated. Only available for AUTHORIZATION
 *   event stream rules.
 * - `AUTHENTICATION`: The 3DS authentication request being evaluated. Only available for
 *   THREE_DS_AUTHENTICATION event stream rules.
 * - `TOKENIZATION`: The tokenization request being evaluated. Only available for TOKENIZATION event
 *   stream rules.
 * - `ACH_RECEIPT`: The ACH receipt being evaluated. Only available for ACH_CREDIT_RECEIPT and
 *   ACH_DEBIT_RECEIPT event stream rules.
 * - `CARD_TRANSACTION`: The card transaction being evaluated. Only available for
 *   CARD_TRANSACTION_UPDATE event stream rules.
 * - `ACH_PAYMENT`: The ACH payment being evaluated. Only available for ACH_PAYMENT_UPDATE event
 *   stream rules.
 * - `EXTERNAL_BANK_ACCOUNT`: The external bank account tied to the ACH payment being evaluated.
 *   Only available for ACH_PAYMENT_UPDATE event stream rules.
 * - `CARD`: The card associated with the event. Available for AUTHORIZATION,
 *   THREE_DS_AUTHENTICATION, and CARD_TRANSACTION_UPDATE event stream rules.
 * - `ACCOUNT_HOLDER`: The account holder associated with the event. Available for AUTHORIZATION,
 *   THREE_DS_AUTHENTICATION, CARD_TRANSACTION_UPDATE, and ACH_PAYMENT_UPDATE event stream rules.
 * - `IP_METADATA`: IP address metadata for the request. Available for THREE_DS_AUTHENTICATION event
 *   stream rules.
 * - `SPEND_VELOCITY`: Spend velocity data for the card or account. Requires `scope`, `period`, and
 *   optionally `filters` to configure the velocity calculation. Available for AUTHORIZATION and
 *   CARD_TRANSACTION_UPDATE event stream rules.
 * - `PAYMENT_VELOCITY`: ACH payment velocity data, aggregated over the given scope. Requires
 *   `scope`, `period`, and optionally `filters` to configure the velocity calculation. Available
 *   for ACH_PAYMENT_UPDATE event stream rules.
 * - `CONSECUTIVE_DECLINES`: The number of consecutive declined transactions since the last approval
 *   for the card or account. Requires `scope`. Available for AUTHORIZATION and
 *   CARD_TRANSACTION_UPDATE event stream rules.
 * - `ACH_PAYMENT_HISTORY`: Windowed settled-amount statistics derived from the financial account's
 *   ACH payment history. Requires `scope`. Available for ACH_PAYMENT_UPDATE event stream rules.
 * - `TRANSACTION_HISTORY_SIGNALS`: Behavioral feature state derived from the entity's transaction
 *   history. Requires `scope` to specify whether to load card, account, or business account
 *   history. Available for AUTHORIZATION and CARD_TRANSACTION_UPDATE event stream rules.
 */
@JsonDeserialize(using = RuleFeature.Deserializer::class)
@JsonSerialize(using = RuleFeature.Serializer::class)
class RuleFeature
private constructor(
    private val authorization: AuthorizationFeature? = null,
    private val authentication: AuthenticationFeature? = null,
    private val tokenization: TokenizationFeature? = null,
    private val achReceipt: AchReceiptFeature? = null,
    private val cardTransaction: CardTransactionFeature? = null,
    private val achPayment: AchPaymentFeature? = null,
    private val externalBankAccount: ExternalBankAccountFeature? = null,
    private val card: CardFeature? = null,
    private val accountHolder: AccountHolderFeature? = null,
    private val ipMetadata: IpMetadataFeature? = null,
    private val spendVelocity: SpendVelocityFeature? = null,
    private val paymentVelocity: PaymentVelocityFeature? = null,
    private val transactionHistorySignals: TransactionHistorySignalsFeature? = null,
    private val consecutiveDeclines: ConsecutiveDeclinesFeature? = null,
    private val achPaymentHistory: AchPaymentHistoryFeature? = null,
    private val _json: JsonValue? = null,
) {

    fun authorization(): Optional<AuthorizationFeature> = Optional.ofNullable(authorization)

    fun authentication(): Optional<AuthenticationFeature> = Optional.ofNullable(authentication)

    fun tokenization(): Optional<TokenizationFeature> = Optional.ofNullable(tokenization)

    fun achReceipt(): Optional<AchReceiptFeature> = Optional.ofNullable(achReceipt)

    fun cardTransaction(): Optional<CardTransactionFeature> = Optional.ofNullable(cardTransaction)

    fun achPayment(): Optional<AchPaymentFeature> = Optional.ofNullable(achPayment)

    fun externalBankAccount(): Optional<ExternalBankAccountFeature> =
        Optional.ofNullable(externalBankAccount)

    fun card(): Optional<CardFeature> = Optional.ofNullable(card)

    fun accountHolder(): Optional<AccountHolderFeature> = Optional.ofNullable(accountHolder)

    fun ipMetadata(): Optional<IpMetadataFeature> = Optional.ofNullable(ipMetadata)

    fun spendVelocity(): Optional<SpendVelocityFeature> = Optional.ofNullable(spendVelocity)

    fun paymentVelocity(): Optional<PaymentVelocityFeature> = Optional.ofNullable(paymentVelocity)

    fun transactionHistorySignals(): Optional<TransactionHistorySignalsFeature> =
        Optional.ofNullable(transactionHistorySignals)

    fun consecutiveDeclines(): Optional<ConsecutiveDeclinesFeature> =
        Optional.ofNullable(consecutiveDeclines)

    fun achPaymentHistory(): Optional<AchPaymentHistoryFeature> =
        Optional.ofNullable(achPaymentHistory)

    fun isAuthorization(): Boolean = authorization != null

    fun isAuthentication(): Boolean = authentication != null

    fun isTokenization(): Boolean = tokenization != null

    fun isAchReceipt(): Boolean = achReceipt != null

    fun isCardTransaction(): Boolean = cardTransaction != null

    fun isAchPayment(): Boolean = achPayment != null

    fun isExternalBankAccount(): Boolean = externalBankAccount != null

    fun isCard(): Boolean = card != null

    fun isAccountHolder(): Boolean = accountHolder != null

    fun isIpMetadata(): Boolean = ipMetadata != null

    fun isSpendVelocity(): Boolean = spendVelocity != null

    fun isPaymentVelocity(): Boolean = paymentVelocity != null

    fun isTransactionHistorySignals(): Boolean = transactionHistorySignals != null

    fun isConsecutiveDeclines(): Boolean = consecutiveDeclines != null

    fun isAchPaymentHistory(): Boolean = achPaymentHistory != null

    fun asAuthorization(): AuthorizationFeature = authorization.getOrThrow("authorization")

    fun asAuthentication(): AuthenticationFeature = authentication.getOrThrow("authentication")

    fun asTokenization(): TokenizationFeature = tokenization.getOrThrow("tokenization")

    fun asAchReceipt(): AchReceiptFeature = achReceipt.getOrThrow("achReceipt")

    fun asCardTransaction(): CardTransactionFeature = cardTransaction.getOrThrow("cardTransaction")

    fun asAchPayment(): AchPaymentFeature = achPayment.getOrThrow("achPayment")

    fun asExternalBankAccount(): ExternalBankAccountFeature =
        externalBankAccount.getOrThrow("externalBankAccount")

    fun asCard(): CardFeature = card.getOrThrow("card")

    fun asAccountHolder(): AccountHolderFeature = accountHolder.getOrThrow("accountHolder")

    fun asIpMetadata(): IpMetadataFeature = ipMetadata.getOrThrow("ipMetadata")

    fun asSpendVelocity(): SpendVelocityFeature = spendVelocity.getOrThrow("spendVelocity")

    fun asPaymentVelocity(): PaymentVelocityFeature = paymentVelocity.getOrThrow("paymentVelocity")

    fun asTransactionHistorySignals(): TransactionHistorySignalsFeature =
        transactionHistorySignals.getOrThrow("transactionHistorySignals")

    fun asConsecutiveDeclines(): ConsecutiveDeclinesFeature =
        consecutiveDeclines.getOrThrow("consecutiveDeclines")

    fun asAchPaymentHistory(): AchPaymentHistoryFeature =
        achPaymentHistory.getOrThrow("achPaymentHistory")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.lithic.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = ruleFeature.accept(new RuleFeature.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitAuthorization(AuthorizationFeature authorization) {
     *         return Optional.of(authorization.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws LithicInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            authorization != null -> visitor.visitAuthorization(authorization)
            authentication != null -> visitor.visitAuthentication(authentication)
            tokenization != null -> visitor.visitTokenization(tokenization)
            achReceipt != null -> visitor.visitAchReceipt(achReceipt)
            cardTransaction != null -> visitor.visitCardTransaction(cardTransaction)
            achPayment != null -> visitor.visitAchPayment(achPayment)
            externalBankAccount != null -> visitor.visitExternalBankAccount(externalBankAccount)
            card != null -> visitor.visitCard(card)
            accountHolder != null -> visitor.visitAccountHolder(accountHolder)
            ipMetadata != null -> visitor.visitIpMetadata(ipMetadata)
            spendVelocity != null -> visitor.visitSpendVelocity(spendVelocity)
            paymentVelocity != null -> visitor.visitPaymentVelocity(paymentVelocity)
            transactionHistorySignals != null ->
                visitor.visitTransactionHistorySignals(transactionHistorySignals)
            consecutiveDeclines != null -> visitor.visitConsecutiveDeclines(consecutiveDeclines)
            achPaymentHistory != null -> visitor.visitAchPaymentHistory(achPaymentHistory)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): RuleFeature = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAuthorization(authorization: AuthorizationFeature) {
                    authorization.validate()
                }

                override fun visitAuthentication(authentication: AuthenticationFeature) {
                    authentication.validate()
                }

                override fun visitTokenization(tokenization: TokenizationFeature) {
                    tokenization.validate()
                }

                override fun visitAchReceipt(achReceipt: AchReceiptFeature) {
                    achReceipt.validate()
                }

                override fun visitCardTransaction(cardTransaction: CardTransactionFeature) {
                    cardTransaction.validate()
                }

                override fun visitAchPayment(achPayment: AchPaymentFeature) {
                    achPayment.validate()
                }

                override fun visitExternalBankAccount(
                    externalBankAccount: ExternalBankAccountFeature
                ) {
                    externalBankAccount.validate()
                }

                override fun visitCard(card: CardFeature) {
                    card.validate()
                }

                override fun visitAccountHolder(accountHolder: AccountHolderFeature) {
                    accountHolder.validate()
                }

                override fun visitIpMetadata(ipMetadata: IpMetadataFeature) {
                    ipMetadata.validate()
                }

                override fun visitSpendVelocity(spendVelocity: SpendVelocityFeature) {
                    spendVelocity.validate()
                }

                override fun visitPaymentVelocity(paymentVelocity: PaymentVelocityFeature) {
                    paymentVelocity.validate()
                }

                override fun visitTransactionHistorySignals(
                    transactionHistorySignals: TransactionHistorySignalsFeature
                ) {
                    transactionHistorySignals.validate()
                }

                override fun visitConsecutiveDeclines(
                    consecutiveDeclines: ConsecutiveDeclinesFeature
                ) {
                    consecutiveDeclines.validate()
                }

                override fun visitAchPaymentHistory(achPaymentHistory: AchPaymentHistoryFeature) {
                    achPaymentHistory.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitAuthorization(authorization: AuthorizationFeature) =
                    authorization.validity()

                override fun visitAuthentication(authentication: AuthenticationFeature) =
                    authentication.validity()

                override fun visitTokenization(tokenization: TokenizationFeature) =
                    tokenization.validity()

                override fun visitAchReceipt(achReceipt: AchReceiptFeature) = achReceipt.validity()

                override fun visitCardTransaction(cardTransaction: CardTransactionFeature) =
                    cardTransaction.validity()

                override fun visitAchPayment(achPayment: AchPaymentFeature) = achPayment.validity()

                override fun visitExternalBankAccount(
                    externalBankAccount: ExternalBankAccountFeature
                ) = externalBankAccount.validity()

                override fun visitCard(card: CardFeature) = card.validity()

                override fun visitAccountHolder(accountHolder: AccountHolderFeature) =
                    accountHolder.validity()

                override fun visitIpMetadata(ipMetadata: IpMetadataFeature) = ipMetadata.validity()

                override fun visitSpendVelocity(spendVelocity: SpendVelocityFeature) =
                    spendVelocity.validity()

                override fun visitPaymentVelocity(paymentVelocity: PaymentVelocityFeature) =
                    paymentVelocity.validity()

                override fun visitTransactionHistorySignals(
                    transactionHistorySignals: TransactionHistorySignalsFeature
                ) = transactionHistorySignals.validity()

                override fun visitConsecutiveDeclines(
                    consecutiveDeclines: ConsecutiveDeclinesFeature
                ) = consecutiveDeclines.validity()

                override fun visitAchPaymentHistory(achPaymentHistory: AchPaymentHistoryFeature) =
                    achPaymentHistory.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleFeature &&
            authorization == other.authorization &&
            authentication == other.authentication &&
            tokenization == other.tokenization &&
            achReceipt == other.achReceipt &&
            cardTransaction == other.cardTransaction &&
            achPayment == other.achPayment &&
            externalBankAccount == other.externalBankAccount &&
            card == other.card &&
            accountHolder == other.accountHolder &&
            ipMetadata == other.ipMetadata &&
            spendVelocity == other.spendVelocity &&
            paymentVelocity == other.paymentVelocity &&
            transactionHistorySignals == other.transactionHistorySignals &&
            consecutiveDeclines == other.consecutiveDeclines &&
            achPaymentHistory == other.achPaymentHistory
    }

    override fun hashCode(): Int =
        Objects.hash(
            authorization,
            authentication,
            tokenization,
            achReceipt,
            cardTransaction,
            achPayment,
            externalBankAccount,
            card,
            accountHolder,
            ipMetadata,
            spendVelocity,
            paymentVelocity,
            transactionHistorySignals,
            consecutiveDeclines,
            achPaymentHistory,
        )

    override fun toString(): String =
        when {
            authorization != null -> "RuleFeature{authorization=$authorization}"
            authentication != null -> "RuleFeature{authentication=$authentication}"
            tokenization != null -> "RuleFeature{tokenization=$tokenization}"
            achReceipt != null -> "RuleFeature{achReceipt=$achReceipt}"
            cardTransaction != null -> "RuleFeature{cardTransaction=$cardTransaction}"
            achPayment != null -> "RuleFeature{achPayment=$achPayment}"
            externalBankAccount != null -> "RuleFeature{externalBankAccount=$externalBankAccount}"
            card != null -> "RuleFeature{card=$card}"
            accountHolder != null -> "RuleFeature{accountHolder=$accountHolder}"
            ipMetadata != null -> "RuleFeature{ipMetadata=$ipMetadata}"
            spendVelocity != null -> "RuleFeature{spendVelocity=$spendVelocity}"
            paymentVelocity != null -> "RuleFeature{paymentVelocity=$paymentVelocity}"
            transactionHistorySignals != null ->
                "RuleFeature{transactionHistorySignals=$transactionHistorySignals}"
            consecutiveDeclines != null -> "RuleFeature{consecutiveDeclines=$consecutiveDeclines}"
            achPaymentHistory != null -> "RuleFeature{achPaymentHistory=$achPaymentHistory}"
            _json != null -> "RuleFeature{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid RuleFeature")
        }

    companion object {

        @JvmStatic
        fun ofAuthorization(authorization: AuthorizationFeature) =
            RuleFeature(authorization = authorization)

        @JvmStatic
        fun ofAuthentication(authentication: AuthenticationFeature) =
            RuleFeature(authentication = authentication)

        @JvmStatic
        fun ofTokenization(tokenization: TokenizationFeature) =
            RuleFeature(tokenization = tokenization)

        @JvmStatic
        fun ofAchReceipt(achReceipt: AchReceiptFeature) = RuleFeature(achReceipt = achReceipt)

        @JvmStatic
        fun ofCardTransaction(cardTransaction: CardTransactionFeature) =
            RuleFeature(cardTransaction = cardTransaction)

        @JvmStatic
        fun ofAchPayment(achPayment: AchPaymentFeature) = RuleFeature(achPayment = achPayment)

        @JvmStatic
        fun ofExternalBankAccount(externalBankAccount: ExternalBankAccountFeature) =
            RuleFeature(externalBankAccount = externalBankAccount)

        @JvmStatic fun ofCard(card: CardFeature) = RuleFeature(card = card)

        @JvmStatic
        fun ofAccountHolder(accountHolder: AccountHolderFeature) =
            RuleFeature(accountHolder = accountHolder)

        @JvmStatic
        fun ofIpMetadata(ipMetadata: IpMetadataFeature) = RuleFeature(ipMetadata = ipMetadata)

        @JvmStatic
        fun ofSpendVelocity(spendVelocity: SpendVelocityFeature) =
            RuleFeature(spendVelocity = spendVelocity)

        @JvmStatic
        fun ofPaymentVelocity(paymentVelocity: PaymentVelocityFeature) =
            RuleFeature(paymentVelocity = paymentVelocity)

        @JvmStatic
        fun ofTransactionHistorySignals(
            transactionHistorySignals: TransactionHistorySignalsFeature
        ) = RuleFeature(transactionHistorySignals = transactionHistorySignals)

        @JvmStatic
        fun ofConsecutiveDeclines(consecutiveDeclines: ConsecutiveDeclinesFeature) =
            RuleFeature(consecutiveDeclines = consecutiveDeclines)

        @JvmStatic
        fun ofAchPaymentHistory(achPaymentHistory: AchPaymentHistoryFeature) =
            RuleFeature(achPaymentHistory = achPaymentHistory)
    }

    /**
     * An interface that defines how to map each variant of [RuleFeature] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitAuthorization(authorization: AuthorizationFeature): T

        fun visitAuthentication(authentication: AuthenticationFeature): T

        fun visitTokenization(tokenization: TokenizationFeature): T

        fun visitAchReceipt(achReceipt: AchReceiptFeature): T

        fun visitCardTransaction(cardTransaction: CardTransactionFeature): T

        fun visitAchPayment(achPayment: AchPaymentFeature): T

        fun visitExternalBankAccount(externalBankAccount: ExternalBankAccountFeature): T

        fun visitCard(card: CardFeature): T

        fun visitAccountHolder(accountHolder: AccountHolderFeature): T

        fun visitIpMetadata(ipMetadata: IpMetadataFeature): T

        fun visitSpendVelocity(spendVelocity: SpendVelocityFeature): T

        fun visitPaymentVelocity(paymentVelocity: PaymentVelocityFeature): T

        fun visitTransactionHistorySignals(
            transactionHistorySignals: TransactionHistorySignalsFeature
        ): T

        fun visitConsecutiveDeclines(consecutiveDeclines: ConsecutiveDeclinesFeature): T

        fun visitAchPaymentHistory(achPaymentHistory: AchPaymentHistoryFeature): T

        /**
         * Maps an unknown variant of [RuleFeature] to a value of type [T].
         *
         * An instance of [RuleFeature] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException("Unknown RuleFeature: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<RuleFeature>(RuleFeature::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): RuleFeature {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AuthorizationFeature>())?.let {
                            RuleFeature(authorization = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AuthenticationFeature>())?.let {
                            RuleFeature(authentication = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TokenizationFeature>())?.let {
                            RuleFeature(tokenization = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AchReceiptFeature>())?.let {
                            RuleFeature(achReceipt = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardTransactionFeature>())?.let {
                            RuleFeature(cardTransaction = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AchPaymentFeature>())?.let {
                            RuleFeature(achPayment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ExternalBankAccountFeature>())?.let {
                            RuleFeature(externalBankAccount = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardFeature>())?.let {
                            RuleFeature(card = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AccountHolderFeature>())?.let {
                            RuleFeature(accountHolder = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IpMetadataFeature>())?.let {
                            RuleFeature(ipMetadata = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SpendVelocityFeature>())?.let {
                            RuleFeature(spendVelocity = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentVelocityFeature>())?.let {
                            RuleFeature(paymentVelocity = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TransactionHistorySignalsFeature>())
                            ?.let { RuleFeature(transactionHistorySignals = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<ConsecutiveDeclinesFeature>())?.let {
                            RuleFeature(consecutiveDeclines = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AchPaymentHistoryFeature>())?.let {
                            RuleFeature(achPaymentHistory = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> RuleFeature(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<RuleFeature>(RuleFeature::class) {

        override fun serialize(
            value: RuleFeature,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.authorization != null -> generator.writeObject(value.authorization)
                value.authentication != null -> generator.writeObject(value.authentication)
                value.tokenization != null -> generator.writeObject(value.tokenization)
                value.achReceipt != null -> generator.writeObject(value.achReceipt)
                value.cardTransaction != null -> generator.writeObject(value.cardTransaction)
                value.achPayment != null -> generator.writeObject(value.achPayment)
                value.externalBankAccount != null ->
                    generator.writeObject(value.externalBankAccount)
                value.card != null -> generator.writeObject(value.card)
                value.accountHolder != null -> generator.writeObject(value.accountHolder)
                value.ipMetadata != null -> generator.writeObject(value.ipMetadata)
                value.spendVelocity != null -> generator.writeObject(value.spendVelocity)
                value.paymentVelocity != null -> generator.writeObject(value.paymentVelocity)
                value.transactionHistorySignals != null ->
                    generator.writeObject(value.transactionHistorySignals)
                value.consecutiveDeclines != null ->
                    generator.writeObject(value.consecutiveDeclines)
                value.achPaymentHistory != null -> generator.writeObject(value.achPaymentHistory)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid RuleFeature")
            }
        }
    }

    class AuthorizationFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [AuthorizationFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthorizationFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authorizationFeature: AuthorizationFeature) = apply {
                type = authorizationFeature.type
                name = authorizationFeature.name
                additionalProperties = authorizationFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [AuthorizationFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AuthorizationFeature =
                AuthorizationFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AuthorizationFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val AUTHORIZATION = of("AUTHORIZATION")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AUTHORIZATION
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
                AUTHORIZATION,
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
                    AUTHORIZATION -> Value.AUTHORIZATION
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
                    AUTHORIZATION -> Known.AUTHORIZATION
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthorizationFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthorizationFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class AuthenticationFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [AuthenticationFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthenticationFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authenticationFeature: AuthenticationFeature) = apply {
                type = authenticationFeature.type
                name = authenticationFeature.name
                additionalProperties = authenticationFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [AuthenticationFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AuthenticationFeature =
                AuthenticationFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AuthenticationFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val AUTHENTICATION = of("AUTHENTICATION")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AUTHENTICATION
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
                AUTHENTICATION,
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
                    AUTHENTICATION -> Value.AUTHENTICATION
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
                    AUTHENTICATION -> Known.AUTHENTICATION
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthenticationFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthenticationFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class TokenizationFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [TokenizationFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TokenizationFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenizationFeature: TokenizationFeature) = apply {
                type = tokenizationFeature.type
                name = tokenizationFeature.name
                additionalProperties = tokenizationFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [TokenizationFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TokenizationFeature =
                TokenizationFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TokenizationFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val TOKENIZATION = of("TOKENIZATION")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TOKENIZATION
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
                TOKENIZATION,
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
                    TOKENIZATION -> Value.TOKENIZATION
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
                    TOKENIZATION -> Known.TOKENIZATION
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenizationFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class AchReceiptFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [AchReceiptFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AchReceiptFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achReceiptFeature: AchReceiptFeature) = apply {
                type = achReceiptFeature.type
                name = achReceiptFeature.name
                additionalProperties = achReceiptFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [AchReceiptFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AchReceiptFeature =
                AchReceiptFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AchReceiptFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val ACH_RECEIPT = of("ACH_RECEIPT")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACH_RECEIPT
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
                ACH_RECEIPT,
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
                    ACH_RECEIPT -> Value.ACH_RECEIPT
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
                    ACH_RECEIPT -> Known.ACH_RECEIPT
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AchReceiptFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AchReceiptFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class CardTransactionFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [CardTransactionFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardTransactionFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardTransactionFeature: CardTransactionFeature) = apply {
                type = cardTransactionFeature.type
                name = cardTransactionFeature.name
                additionalProperties = cardTransactionFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [CardTransactionFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardTransactionFeature =
                CardTransactionFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CardTransactionFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val CARD_TRANSACTION = of("CARD_TRANSACTION")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CARD_TRANSACTION
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
                CARD_TRANSACTION,
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
                    CARD_TRANSACTION -> Value.CARD_TRANSACTION
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
                    CARD_TRANSACTION -> Known.CARD_TRANSACTION
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardTransactionFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardTransactionFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class AchPaymentFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [AchPaymentFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AchPaymentFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achPaymentFeature: AchPaymentFeature) = apply {
                type = achPaymentFeature.type
                name = achPaymentFeature.name
                additionalProperties = achPaymentFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [AchPaymentFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AchPaymentFeature =
                AchPaymentFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AchPaymentFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val ACH_PAYMENT = of("ACH_PAYMENT")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACH_PAYMENT
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
                ACH_PAYMENT,
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
                    ACH_PAYMENT -> Value.ACH_PAYMENT
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
                    ACH_PAYMENT -> Known.ACH_PAYMENT
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AchPaymentFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AchPaymentFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class ExternalBankAccountFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * [ExternalBankAccountFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalBankAccountFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalBankAccountFeature: ExternalBankAccountFeature) = apply {
                type = externalBankAccountFeature.type
                name = externalBankAccountFeature.name
                additionalProperties =
                    externalBankAccountFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [ExternalBankAccountFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExternalBankAccountFeature =
                ExternalBankAccountFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ExternalBankAccountFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val EXTERNAL_BANK_ACCOUNT = of("EXTERNAL_BANK_ACCOUNT")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                EXTERNAL_BANK_ACCOUNT
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
                EXTERNAL_BANK_ACCOUNT,
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
                    EXTERNAL_BANK_ACCOUNT -> Value.EXTERNAL_BANK_ACCOUNT
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
                    EXTERNAL_BANK_ACCOUNT -> Known.EXTERNAL_BANK_ACCOUNT
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalBankAccountFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalBankAccountFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class CardFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [CardFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardFeature: CardFeature) = apply {
                type = cardFeature.type
                name = cardFeature.name
                additionalProperties = cardFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [CardFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardFeature =
                CardFeature(checkRequired("type", type), name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CardFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val CARD = of("CARD")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CARD
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
                CARD,
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
                    CARD -> Value.CARD
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
                    CARD -> Known.CARD
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class AccountHolderFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [AccountHolderFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountHolderFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderFeature: AccountHolderFeature) = apply {
                type = accountHolderFeature.type
                name = accountHolderFeature.name
                additionalProperties = accountHolderFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [AccountHolderFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountHolderFeature =
                AccountHolderFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AccountHolderFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val ACCOUNT_HOLDER = of("ACCOUNT_HOLDER")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACCOUNT_HOLDER
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
                ACCOUNT_HOLDER,
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
                    ACCOUNT_HOLDER -> Value.ACCOUNT_HOLDER
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
                    ACCOUNT_HOLDER -> Known.ACCOUNT_HOLDER
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolderFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class IpMetadataFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(type, name, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [IpMetadataFeature].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IpMetadataFeature]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ipMetadataFeature: IpMetadataFeature) = apply {
                type = ipMetadataFeature.type
                name = ipMetadataFeature.name
                additionalProperties = ipMetadataFeature.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [IpMetadataFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): IpMetadataFeature =
                IpMetadataFeature(
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IpMetadataFeature = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

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

                @JvmField val IP_METADATA = of("IP_METADATA")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                IP_METADATA
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
                IP_METADATA,
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
                    IP_METADATA -> Value.IP_METADATA
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
                    IP_METADATA -> Known.IP_METADATA
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IpMetadataFeature &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IpMetadataFeature{type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class SpendVelocityFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val period: JsonField<VelocityLimitPeriod>,
        private val scope: JsonField<VelocityScope>,
        private val type: JsonField<Type>,
        private val filters: JsonField<VelocityLimitFilters>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("period")
            @ExcludeMissing
            period: JsonField<VelocityLimitPeriod> = JsonMissing.of(),
            @JsonProperty("scope")
            @ExcludeMissing
            scope: JsonField<VelocityScope> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<VelocityLimitFilters> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(period, scope, type, filters, name, mutableMapOf())

        /**
         * Velocity over the current day since 00:00 / 12 AM in Eastern Time
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun period(): VelocityLimitPeriod = period.getRequired("period")

        /**
         * The scope the velocity is calculated for
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): VelocityScope = scope.getRequired("scope")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filters(): Optional<VelocityLimitFilters> = filters.getOptional("filters")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [period].
         *
         * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period")
        @ExcludeMissing
        fun _period(): JsonField<VelocityLimitPeriod> = period

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<VelocityScope> = scope

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<VelocityLimitFilters> = filters

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [SpendVelocityFeature].
             *
             * The following fields are required:
             * ```java
             * .period()
             * .scope()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpendVelocityFeature]. */
        class Builder internal constructor() {

            private var period: JsonField<VelocityLimitPeriod>? = null
            private var scope: JsonField<VelocityScope>? = null
            private var type: JsonField<Type>? = null
            private var filters: JsonField<VelocityLimitFilters> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spendVelocityFeature: SpendVelocityFeature) = apply {
                period = spendVelocityFeature.period
                scope = spendVelocityFeature.scope
                type = spendVelocityFeature.type
                filters = spendVelocityFeature.filters
                name = spendVelocityFeature.name
                additionalProperties = spendVelocityFeature.additionalProperties.toMutableMap()
            }

            /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
            fun period(period: VelocityLimitPeriod) = period(JsonField.of(period))

            /**
             * Sets [Builder.period] to an arbitrary JSON value.
             *
             * You should usually call [Builder.period] with a well-typed [VelocityLimitPeriod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun period(period: JsonField<VelocityLimitPeriod>) = apply { this.period = period }

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject)`.
             */
            fun period(trailingWindowObject: VelocityLimitPeriod.TrailingWindowObject) =
                period(VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay)`.
             */
            fun period(fixedWindowDay: VelocityLimitPeriod.FixedWindowDay) =
                period(VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek)`.
             */
            fun period(fixedWindowWeek: VelocityLimitPeriod.FixedWindowWeek) =
                period(VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth)`.
             */
            fun period(fixedWindowMonth: VelocityLimitPeriod.FixedWindowMonth) =
                period(VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear)`.
             */
            fun period(fixedWindowYear: VelocityLimitPeriod.FixedWindowYear) =
                period(VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear))

            /** The scope the velocity is calculated for */
            fun scope(scope: VelocityScope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [VelocityScope] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scope(scope: JsonField<VelocityScope>) = apply { this.scope = scope }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun filters(filters: VelocityLimitFilters) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed [VelocityLimitFilters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun filters(filters: JsonField<VelocityLimitFilters>) = apply { this.filters = filters }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [SpendVelocityFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .period()
             * .scope()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SpendVelocityFeature =
                SpendVelocityFeature(
                    checkRequired("period", period),
                    checkRequired("scope", scope),
                    checkRequired("type", type),
                    filters,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SpendVelocityFeature = apply {
            if (validated) {
                return@apply
            }

            period().validate()
            scope().validate()
            type().validate()
            filters().ifPresent { it.validate() }
            name()
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
            (period.asKnown().getOrNull()?.validity() ?: 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (filters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The scope the velocity is calculated for */
        class VelocityScope @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CARD = of("CARD")

                @JvmField val ACCOUNT = of("ACCOUNT")

                @JvmStatic fun of(value: String) = VelocityScope(JsonField.of(value))
            }

            /** An enum containing [VelocityScope]'s known values. */
            enum class Known {
                CARD,
                ACCOUNT,
            }

            /**
             * An enum containing [VelocityScope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [VelocityScope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                ACCOUNT,
                /**
                 * An enum member indicating that [VelocityScope] was instantiated with an unknown
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
                    CARD -> Value.CARD
                    ACCOUNT -> Value.ACCOUNT
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
                    CARD -> Known.CARD
                    ACCOUNT -> Known.ACCOUNT
                    else -> throw LithicInvalidDataException("Unknown VelocityScope: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): VelocityScope = apply {
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

                return other is VelocityScope && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                @JvmField val SPEND_VELOCITY = of("SPEND_VELOCITY")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SPEND_VELOCITY
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
                SPEND_VELOCITY,
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
                    SPEND_VELOCITY -> Value.SPEND_VELOCITY
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
                    SPEND_VELOCITY -> Known.SPEND_VELOCITY
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpendVelocityFeature &&
                period == other.period &&
                scope == other.scope &&
                type == other.type &&
                filters == other.filters &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(period, scope, type, filters, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendVelocityFeature{period=$period, scope=$scope, type=$type, filters=$filters, name=$name, additionalProperties=$additionalProperties}"
    }

    class PaymentVelocityFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val period: JsonField<VelocityLimitPeriod>,
        private val scope: JsonField<Scope>,
        private val type: JsonField<Type>,
        private val filters: JsonField<PaymentVelocityFilters>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("period")
            @ExcludeMissing
            period: JsonField<VelocityLimitPeriod> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<PaymentVelocityFilters> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(period, scope, type, filters, name, mutableMapOf())

        /**
         * Velocity over the current day since 00:00 / 12 AM in Eastern Time
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun period(): VelocityLimitPeriod = period.getRequired("period")

        /**
         * The scope over which the ACH payment velocity is aggregated.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): Scope = scope.getRequired("scope")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Optional filters applied when aggregating ACH payment velocity. Payments not matching the
         * provided filters are excluded from the calculated velocity.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filters(): Optional<PaymentVelocityFilters> = filters.getOptional("filters")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [period].
         *
         * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period")
        @ExcludeMissing
        fun _period(): JsonField<VelocityLimitPeriod> = period

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<PaymentVelocityFilters> = filters

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [PaymentVelocityFeature].
             *
             * The following fields are required:
             * ```java
             * .period()
             * .scope()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentVelocityFeature]. */
        class Builder internal constructor() {

            private var period: JsonField<VelocityLimitPeriod>? = null
            private var scope: JsonField<Scope>? = null
            private var type: JsonField<Type>? = null
            private var filters: JsonField<PaymentVelocityFilters> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentVelocityFeature: PaymentVelocityFeature) = apply {
                period = paymentVelocityFeature.period
                scope = paymentVelocityFeature.scope
                type = paymentVelocityFeature.type
                filters = paymentVelocityFeature.filters
                name = paymentVelocityFeature.name
                additionalProperties = paymentVelocityFeature.additionalProperties.toMutableMap()
            }

            /** Velocity over the current day since 00:00 / 12 AM in Eastern Time */
            fun period(period: VelocityLimitPeriod) = period(JsonField.of(period))

            /**
             * Sets [Builder.period] to an arbitrary JSON value.
             *
             * You should usually call [Builder.period] with a well-typed [VelocityLimitPeriod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun period(period: JsonField<VelocityLimitPeriod>) = apply { this.period = period }

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject)`.
             */
            fun period(trailingWindowObject: VelocityLimitPeriod.TrailingWindowObject) =
                period(VelocityLimitPeriod.ofTrailingWindowObject(trailingWindowObject))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay)`.
             */
            fun period(fixedWindowDay: VelocityLimitPeriod.FixedWindowDay) =
                period(VelocityLimitPeriod.ofFixedWindowDay(fixedWindowDay))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek)`.
             */
            fun period(fixedWindowWeek: VelocityLimitPeriod.FixedWindowWeek) =
                period(VelocityLimitPeriod.ofFixedWindowWeek(fixedWindowWeek))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth)`.
             */
            fun period(fixedWindowMonth: VelocityLimitPeriod.FixedWindowMonth) =
                period(VelocityLimitPeriod.ofFixedWindowMonth(fixedWindowMonth))

            /**
             * Alias for calling [period] with
             * `VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear)`.
             */
            fun period(fixedWindowYear: VelocityLimitPeriod.FixedWindowYear) =
                period(VelocityLimitPeriod.ofFixedWindowYear(fixedWindowYear))

            /** The scope over which the ACH payment velocity is aggregated. */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Optional filters applied when aggregating ACH payment velocity. Payments not matching
             * the provided filters are excluded from the calculated velocity.
             */
            fun filters(filters: PaymentVelocityFilters) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed [PaymentVelocityFilters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun filters(filters: JsonField<PaymentVelocityFilters>) = apply {
                this.filters = filters
            }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [PaymentVelocityFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .period()
             * .scope()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentVelocityFeature =
                PaymentVelocityFeature(
                    checkRequired("period", period),
                    checkRequired("scope", scope),
                    checkRequired("type", type),
                    filters,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PaymentVelocityFeature = apply {
            if (validated) {
                return@apply
            }

            period().validate()
            scope().validate()
            type().validate()
            filters().ifPresent { it.validate() }
            name()
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
            (period.asKnown().getOrNull()?.validity() ?: 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (filters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The scope over which the ACH payment velocity is aggregated. */
        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val FINANCIAL_ACCOUNT = of("FINANCIAL_ACCOUNT")

                @JvmField val GLOBAL = of("GLOBAL")

                @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
            }

            /** An enum containing [Scope]'s known values. */
            enum class Known {
                FINANCIAL_ACCOUNT,
                GLOBAL,
            }

            /**
             * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Scope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FINANCIAL_ACCOUNT,
                GLOBAL,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
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
                    FINANCIAL_ACCOUNT -> Value.FINANCIAL_ACCOUNT
                    GLOBAL -> Value.GLOBAL
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
                    FINANCIAL_ACCOUNT -> Known.FINANCIAL_ACCOUNT
                    GLOBAL -> Known.GLOBAL
                    else -> throw LithicInvalidDataException("Unknown Scope: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Scope = apply {
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

                return other is Scope && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                @JvmField val PAYMENT_VELOCITY = of("PAYMENT_VELOCITY")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PAYMENT_VELOCITY
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
                PAYMENT_VELOCITY,
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
                    PAYMENT_VELOCITY -> Value.PAYMENT_VELOCITY
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
                    PAYMENT_VELOCITY -> Known.PAYMENT_VELOCITY
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Optional filters applied when aggregating ACH payment velocity. Payments not matching the
         * provided filters are excluded from the calculated velocity.
         */
        class PaymentVelocityFilters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val excludeTags: JsonField<ExcludeTags>,
            private val includePaymentTypes: JsonField<List<IncludePaymentType>>,
            private val includePolarities: JsonField<List<IncludePolarity>>,
            private val includeStatuses: JsonField<List<IncludeStatus>>,
            private val includeTags: JsonField<IncludeTags>,
            private val result: JsonField<Result>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("exclude_tags")
                @ExcludeMissing
                excludeTags: JsonField<ExcludeTags> = JsonMissing.of(),
                @JsonProperty("include_payment_types")
                @ExcludeMissing
                includePaymentTypes: JsonField<List<IncludePaymentType>> = JsonMissing.of(),
                @JsonProperty("include_polarities")
                @ExcludeMissing
                includePolarities: JsonField<List<IncludePolarity>> = JsonMissing.of(),
                @JsonProperty("include_statuses")
                @ExcludeMissing
                includeStatuses: JsonField<List<IncludeStatus>> = JsonMissing.of(),
                @JsonProperty("include_tags")
                @ExcludeMissing
                includeTags: JsonField<IncludeTags> = JsonMissing.of(),
                @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            ) : this(
                excludeTags,
                includePaymentTypes,
                includePolarities,
                includeStatuses,
                includeTags,
                result,
                mutableMapOf(),
            )

            /**
             * Exclude payments matching any of the provided tag key-value pairs.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludeTags(): Optional<ExcludeTags> = excludeTags.getOptional("exclude_tags")

            /**
             * Payment types to include in the velocity calculation.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includePaymentTypes(): Optional<List<IncludePaymentType>> =
                includePaymentTypes.getOptional("include_payment_types")

            /**
             * Payment polarities to include in the velocity calculation.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includePolarities(): Optional<List<IncludePolarity>> =
                includePolarities.getOptional("include_polarities")

            /**
             * Payment statuses to include in the velocity calculation.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includeStatuses(): Optional<List<IncludeStatus>> =
                includeStatuses.getOptional("include_statuses")

            /**
             * Only include payments matching all of the provided tag key-value pairs.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun includeTags(): Optional<IncludeTags> = includeTags.getOptional("include_tags")

            /**
             * Only include payments with the given result.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun result(): Optional<Result> = result.getOptional("result")

            /**
             * Returns the raw JSON value of [excludeTags].
             *
             * Unlike [excludeTags], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("exclude_tags")
            @ExcludeMissing
            fun _excludeTags(): JsonField<ExcludeTags> = excludeTags

            /**
             * Returns the raw JSON value of [includePaymentTypes].
             *
             * Unlike [includePaymentTypes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_payment_types")
            @ExcludeMissing
            fun _includePaymentTypes(): JsonField<List<IncludePaymentType>> = includePaymentTypes

            /**
             * Returns the raw JSON value of [includePolarities].
             *
             * Unlike [includePolarities], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_polarities")
            @ExcludeMissing
            fun _includePolarities(): JsonField<List<IncludePolarity>> = includePolarities

            /**
             * Returns the raw JSON value of [includeStatuses].
             *
             * Unlike [includeStatuses], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_statuses")
            @ExcludeMissing
            fun _includeStatuses(): JsonField<List<IncludeStatus>> = includeStatuses

            /**
             * Returns the raw JSON value of [includeTags].
             *
             * Unlike [includeTags], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("include_tags")
            @ExcludeMissing
            fun _includeTags(): JsonField<IncludeTags> = includeTags

            /**
             * Returns the raw JSON value of [result].
             *
             * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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
                 * [PaymentVelocityFilters].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PaymentVelocityFilters]. */
            class Builder internal constructor() {

                private var excludeTags: JsonField<ExcludeTags> = JsonMissing.of()
                private var includePaymentTypes: JsonField<MutableList<IncludePaymentType>>? = null
                private var includePolarities: JsonField<MutableList<IncludePolarity>>? = null
                private var includeStatuses: JsonField<MutableList<IncludeStatus>>? = null
                private var includeTags: JsonField<IncludeTags> = JsonMissing.of()
                private var result: JsonField<Result> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentVelocityFilters: PaymentVelocityFilters) = apply {
                    excludeTags = paymentVelocityFilters.excludeTags
                    includePaymentTypes =
                        paymentVelocityFilters.includePaymentTypes.map { it.toMutableList() }
                    includePolarities =
                        paymentVelocityFilters.includePolarities.map { it.toMutableList() }
                    includeStatuses =
                        paymentVelocityFilters.includeStatuses.map { it.toMutableList() }
                    includeTags = paymentVelocityFilters.includeTags
                    result = paymentVelocityFilters.result
                    additionalProperties =
                        paymentVelocityFilters.additionalProperties.toMutableMap()
                }

                /** Exclude payments matching any of the provided tag key-value pairs. */
                fun excludeTags(excludeTags: ExcludeTags?) =
                    excludeTags(JsonField.ofNullable(excludeTags))

                /** Alias for calling [Builder.excludeTags] with `excludeTags.orElse(null)`. */
                fun excludeTags(excludeTags: Optional<ExcludeTags>) =
                    excludeTags(excludeTags.getOrNull())

                /**
                 * Sets [Builder.excludeTags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludeTags] with a well-typed [ExcludeTags]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun excludeTags(excludeTags: JsonField<ExcludeTags>) = apply {
                    this.excludeTags = excludeTags
                }

                /** Payment types to include in the velocity calculation. */
                fun includePaymentTypes(includePaymentTypes: List<IncludePaymentType>?) =
                    includePaymentTypes(JsonField.ofNullable(includePaymentTypes))

                /**
                 * Alias for calling [Builder.includePaymentTypes] with
                 * `includePaymentTypes.orElse(null)`.
                 */
                fun includePaymentTypes(includePaymentTypes: Optional<List<IncludePaymentType>>) =
                    includePaymentTypes(includePaymentTypes.getOrNull())

                /**
                 * Sets [Builder.includePaymentTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includePaymentTypes] with a well-typed
                 * `List<IncludePaymentType>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun includePaymentTypes(includePaymentTypes: JsonField<List<IncludePaymentType>>) =
                    apply {
                        this.includePaymentTypes = includePaymentTypes.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [IncludePaymentType] to [includePaymentTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIncludePaymentType(includePaymentType: IncludePaymentType) = apply {
                    includePaymentTypes =
                        (includePaymentTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("includePaymentTypes", it).add(includePaymentType)
                        }
                }

                /** Payment polarities to include in the velocity calculation. */
                fun includePolarities(includePolarities: List<IncludePolarity>?) =
                    includePolarities(JsonField.ofNullable(includePolarities))

                /**
                 * Alias for calling [Builder.includePolarities] with
                 * `includePolarities.orElse(null)`.
                 */
                fun includePolarities(includePolarities: Optional<List<IncludePolarity>>) =
                    includePolarities(includePolarities.getOrNull())

                /**
                 * Sets [Builder.includePolarities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includePolarities] with a well-typed
                 * `List<IncludePolarity>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun includePolarities(includePolarities: JsonField<List<IncludePolarity>>) = apply {
                    this.includePolarities = includePolarities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [IncludePolarity] to [includePolarities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIncludePolarity(includePolarity: IncludePolarity) = apply {
                    includePolarities =
                        (includePolarities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("includePolarities", it).add(includePolarity)
                        }
                }

                /** Payment statuses to include in the velocity calculation. */
                fun includeStatuses(includeStatuses: List<IncludeStatus>?) =
                    includeStatuses(JsonField.ofNullable(includeStatuses))

                /**
                 * Alias for calling [Builder.includeStatuses] with `includeStatuses.orElse(null)`.
                 */
                fun includeStatuses(includeStatuses: Optional<List<IncludeStatus>>) =
                    includeStatuses(includeStatuses.getOrNull())

                /**
                 * Sets [Builder.includeStatuses] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeStatuses] with a well-typed
                 * `List<IncludeStatus>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun includeStatuses(includeStatuses: JsonField<List<IncludeStatus>>) = apply {
                    this.includeStatuses = includeStatuses.map { it.toMutableList() }
                }

                /**
                 * Adds a single [IncludeStatus] to [includeStatuses].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIncludeStatus(includeStatus: IncludeStatus) = apply {
                    includeStatuses =
                        (includeStatuses ?: JsonField.of(mutableListOf())).also {
                            checkKnown("includeStatuses", it).add(includeStatus)
                        }
                }

                /** Only include payments matching all of the provided tag key-value pairs. */
                fun includeTags(includeTags: IncludeTags?) =
                    includeTags(JsonField.ofNullable(includeTags))

                /** Alias for calling [Builder.includeTags] with `includeTags.orElse(null)`. */
                fun includeTags(includeTags: Optional<IncludeTags>) =
                    includeTags(includeTags.getOrNull())

                /**
                 * Sets [Builder.includeTags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeTags] with a well-typed [IncludeTags]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun includeTags(includeTags: JsonField<IncludeTags>) = apply {
                    this.includeTags = includeTags
                }

                /** Only include payments with the given result. */
                fun result(result: Result) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed [Result] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun result(result: JsonField<Result>) = apply { this.result = result }

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

                /**
                 * Returns an immutable instance of [PaymentVelocityFilters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PaymentVelocityFilters =
                    PaymentVelocityFilters(
                        excludeTags,
                        (includePaymentTypes ?: JsonMissing.of()).map { it.toImmutable() },
                        (includePolarities ?: JsonMissing.of()).map { it.toImmutable() },
                        (includeStatuses ?: JsonMissing.of()).map { it.toImmutable() },
                        includeTags,
                        result,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PaymentVelocityFilters = apply {
                if (validated) {
                    return@apply
                }

                excludeTags().ifPresent { it.validate() }
                includePaymentTypes().ifPresent { it.forEach { it.validate() } }
                includePolarities().ifPresent { it.forEach { it.validate() } }
                includeStatuses().ifPresent { it.forEach { it.validate() } }
                includeTags().ifPresent { it.validate() }
                result().ifPresent { it.validate() }
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
                (excludeTags.asKnown().getOrNull()?.validity() ?: 0) +
                    (includePaymentTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (includePolarities.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (includeStatuses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (includeTags.asKnown().getOrNull()?.validity() ?: 0) +
                    (result.asKnown().getOrNull()?.validity() ?: 0)

            /** Exclude payments matching any of the provided tag key-value pairs. */
            class ExcludeTags
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ExcludeTags]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ExcludeTags]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(excludeTags: ExcludeTags) = apply {
                        additionalProperties = excludeTags.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [ExcludeTags].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ExcludeTags = ExcludeTags(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ExcludeTags = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ExcludeTags &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ExcludeTags{additionalProperties=$additionalProperties}"
            }

            class IncludePaymentType
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

                    @JvmField val ORIGINATION = of("ORIGINATION")

                    @JvmField val RECEIPT = of("RECEIPT")

                    @JvmStatic fun of(value: String) = IncludePaymentType(JsonField.of(value))
                }

                /** An enum containing [IncludePaymentType]'s known values. */
                enum class Known {
                    ORIGINATION,
                    RECEIPT,
                }

                /**
                 * An enum containing [IncludePaymentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [IncludePaymentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ORIGINATION,
                    RECEIPT,
                    /**
                     * An enum member indicating that [IncludePaymentType] was instantiated with an
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
                        ORIGINATION -> Value.ORIGINATION
                        RECEIPT -> Value.RECEIPT
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
                        ORIGINATION -> Known.ORIGINATION
                        RECEIPT -> Known.RECEIPT
                        else ->
                            throw LithicInvalidDataException("Unknown IncludePaymentType: $value")
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): IncludePaymentType = apply {
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

                    return other is IncludePaymentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class IncludePolarity
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

                    @JvmField val CREDIT = of("CREDIT")

                    @JvmField val DEBIT = of("DEBIT")

                    @JvmStatic fun of(value: String) = IncludePolarity(JsonField.of(value))
                }

                /** An enum containing [IncludePolarity]'s known values. */
                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                /**
                 * An enum containing [IncludePolarity]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [IncludePolarity] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT,
                    DEBIT,
                    /**
                     * An enum member indicating that [IncludePolarity] was instantiated with an
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
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
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
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else -> throw LithicInvalidDataException("Unknown IncludePolarity: $value")
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): IncludePolarity = apply {
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

                    return other is IncludePolarity && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class IncludeStatus
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

                    @JvmField val PENDING = of("PENDING")

                    @JvmField val SETTLED = of("SETTLED")

                    @JvmField val DECLINED = of("DECLINED")

                    @JvmField val REVERSED = of("REVERSED")

                    @JvmField val CANCELED = of("CANCELED")

                    @JvmField val RETURNED = of("RETURNED")

                    @JvmStatic fun of(value: String) = IncludeStatus(JsonField.of(value))
                }

                /** An enum containing [IncludeStatus]'s known values. */
                enum class Known {
                    PENDING,
                    SETTLED,
                    DECLINED,
                    REVERSED,
                    CANCELED,
                    RETURNED,
                }

                /**
                 * An enum containing [IncludeStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [IncludeStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PENDING,
                    SETTLED,
                    DECLINED,
                    REVERSED,
                    CANCELED,
                    RETURNED,
                    /**
                     * An enum member indicating that [IncludeStatus] was instantiated with an
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
                        PENDING -> Value.PENDING
                        SETTLED -> Value.SETTLED
                        DECLINED -> Value.DECLINED
                        REVERSED -> Value.REVERSED
                        CANCELED -> Value.CANCELED
                        RETURNED -> Value.RETURNED
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
                        PENDING -> Known.PENDING
                        SETTLED -> Known.SETTLED
                        DECLINED -> Known.DECLINED
                        REVERSED -> Known.REVERSED
                        CANCELED -> Known.CANCELED
                        RETURNED -> Known.RETURNED
                        else -> throw LithicInvalidDataException("Unknown IncludeStatus: $value")
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): IncludeStatus = apply {
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

                    return other is IncludeStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Only include payments matching all of the provided tag key-value pairs. */
            class IncludeTags
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [IncludeTags]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [IncludeTags]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(includeTags: IncludeTags) = apply {
                        additionalProperties = includeTags.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [IncludeTags].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): IncludeTags = IncludeTags(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): IncludeTags = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is IncludeTags &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "IncludeTags{additionalProperties=$additionalProperties}"
            }

            /** Only include payments with the given result. */
            class Result @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val APPROVED = of("APPROVED")

                    @JvmField val DECLINED = of("DECLINED")

                    @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                }

                /** An enum containing [Result]'s known values. */
                enum class Known {
                    APPROVED,
                    DECLINED,
                }

                /**
                 * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Result] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPROVED,
                    DECLINED,
                    /**
                     * An enum member indicating that [Result] was instantiated with an unknown
                     * value.
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
                        APPROVED -> Value.APPROVED
                        DECLINED -> Value.DECLINED
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
                        APPROVED -> Known.APPROVED
                        DECLINED -> Known.DECLINED
                        else -> throw LithicInvalidDataException("Unknown Result: $value")
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LithicInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Result = apply {
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

                    return other is Result && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentVelocityFilters &&
                    excludeTags == other.excludeTags &&
                    includePaymentTypes == other.includePaymentTypes &&
                    includePolarities == other.includePolarities &&
                    includeStatuses == other.includeStatuses &&
                    includeTags == other.includeTags &&
                    result == other.result &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    excludeTags,
                    includePaymentTypes,
                    includePolarities,
                    includeStatuses,
                    includeTags,
                    result,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentVelocityFilters{excludeTags=$excludeTags, includePaymentTypes=$includePaymentTypes, includePolarities=$includePolarities, includeStatuses=$includeStatuses, includeTags=$includeTags, result=$result, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentVelocityFeature &&
                period == other.period &&
                scope == other.scope &&
                type == other.type &&
                filters == other.filters &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(period, scope, type, filters, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentVelocityFeature{period=$period, scope=$scope, type=$type, filters=$filters, name=$name, additionalProperties=$additionalProperties}"
    }

    class TransactionHistorySignalsFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scope: JsonField<Scope>,
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(scope, type, name, mutableMapOf())

        /**
         * The entity scope to load transaction history signals for.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): Scope = scope.getRequired("scope")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * [TransactionHistorySignalsFeature].
             *
             * The following fields are required:
             * ```java
             * .scope()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionHistorySignalsFeature]. */
        class Builder internal constructor() {

            private var scope: JsonField<Scope>? = null
            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionHistorySignalsFeature: TransactionHistorySignalsFeature) =
                apply {
                    scope = transactionHistorySignalsFeature.scope
                    type = transactionHistorySignalsFeature.type
                    name = transactionHistorySignalsFeature.name
                    additionalProperties =
                        transactionHistorySignalsFeature.additionalProperties.toMutableMap()
                }

            /** The entity scope to load transaction history signals for. */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [TransactionHistorySignalsFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .scope()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransactionHistorySignalsFeature =
                TransactionHistorySignalsFeature(
                    checkRequired("scope", scope),
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TransactionHistorySignalsFeature = apply {
            if (validated) {
                return@apply
            }

            scope().validate()
            type().validate()
            name()
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
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The entity scope to load transaction history signals for. */
        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CARD = of("CARD")

                @JvmField val ACCOUNT = of("ACCOUNT")

                @JvmField val BUSINESS_ACCOUNT = of("BUSINESS_ACCOUNT")

                @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
            }

            /** An enum containing [Scope]'s known values. */
            enum class Known {
                CARD,
                ACCOUNT,
                BUSINESS_ACCOUNT,
            }

            /**
             * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Scope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                ACCOUNT,
                BUSINESS_ACCOUNT,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
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
                    CARD -> Value.CARD
                    ACCOUNT -> Value.ACCOUNT
                    BUSINESS_ACCOUNT -> Value.BUSINESS_ACCOUNT
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
                    CARD -> Known.CARD
                    ACCOUNT -> Known.ACCOUNT
                    BUSINESS_ACCOUNT -> Known.BUSINESS_ACCOUNT
                    else -> throw LithicInvalidDataException("Unknown Scope: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Scope = apply {
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

                return other is Scope && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                @JvmField val TRANSACTION_HISTORY_SIGNALS = of("TRANSACTION_HISTORY_SIGNALS")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TRANSACTION_HISTORY_SIGNALS
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
                TRANSACTION_HISTORY_SIGNALS,
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
                    TRANSACTION_HISTORY_SIGNALS -> Value.TRANSACTION_HISTORY_SIGNALS
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
                    TRANSACTION_HISTORY_SIGNALS -> Known.TRANSACTION_HISTORY_SIGNALS
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionHistorySignalsFeature &&
                scope == other.scope &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(scope, type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionHistorySignalsFeature{scope=$scope, type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class ConsecutiveDeclinesFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scope: JsonField<Scope>,
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(scope, type, name, mutableMapOf())

        /**
         * The entity scope to count consecutive declines for.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): Scope = scope.getRequired("scope")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * [ConsecutiveDeclinesFeature].
             *
             * The following fields are required:
             * ```java
             * .scope()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConsecutiveDeclinesFeature]. */
        class Builder internal constructor() {

            private var scope: JsonField<Scope>? = null
            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(consecutiveDeclinesFeature: ConsecutiveDeclinesFeature) = apply {
                scope = consecutiveDeclinesFeature.scope
                type = consecutiveDeclinesFeature.type
                name = consecutiveDeclinesFeature.name
                additionalProperties =
                    consecutiveDeclinesFeature.additionalProperties.toMutableMap()
            }

            /** The entity scope to count consecutive declines for. */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [ConsecutiveDeclinesFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .scope()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConsecutiveDeclinesFeature =
                ConsecutiveDeclinesFeature(
                    checkRequired("scope", scope),
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ConsecutiveDeclinesFeature = apply {
            if (validated) {
                return@apply
            }

            scope().validate()
            type().validate()
            name()
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
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The entity scope to count consecutive declines for. */
        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CARD = of("CARD")

                @JvmField val ACCOUNT = of("ACCOUNT")

                @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
            }

            /** An enum containing [Scope]'s known values. */
            enum class Known {
                CARD,
                ACCOUNT,
            }

            /**
             * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Scope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                ACCOUNT,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
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
                    CARD -> Value.CARD
                    ACCOUNT -> Value.ACCOUNT
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
                    CARD -> Known.CARD
                    ACCOUNT -> Known.ACCOUNT
                    else -> throw LithicInvalidDataException("Unknown Scope: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Scope = apply {
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

                return other is Scope && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                @JvmField val CONSECUTIVE_DECLINES = of("CONSECUTIVE_DECLINES")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CONSECUTIVE_DECLINES
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
                CONSECUTIVE_DECLINES,
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
                    CONSECUTIVE_DECLINES -> Value.CONSECUTIVE_DECLINES
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
                    CONSECUTIVE_DECLINES -> Known.CONSECUTIVE_DECLINES
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConsecutiveDeclinesFeature &&
                scope == other.scope &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(scope, type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConsecutiveDeclinesFeature{scope=$scope, type=$type, name=$name, additionalProperties=$additionalProperties}"
    }

    class AchPaymentHistoryFeature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scope: JsonField<Scope>,
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(scope, type, name, mutableMapOf())

        /**
         * The entity scope to load ACH payment history for.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): Scope = scope.getRequired("scope")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The variable name for this feature in the rule function signature
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [AchPaymentHistoryFeature].
             *
             * The following fields are required:
             * ```java
             * .scope()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AchPaymentHistoryFeature]. */
        class Builder internal constructor() {

            private var scope: JsonField<Scope>? = null
            private var type: JsonField<Type>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achPaymentHistoryFeature: AchPaymentHistoryFeature) = apply {
                scope = achPaymentHistoryFeature.scope
                type = achPaymentHistoryFeature.type
                name = achPaymentHistoryFeature.name
                additionalProperties = achPaymentHistoryFeature.additionalProperties.toMutableMap()
            }

            /** The entity scope to load ACH payment history for. */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The variable name for this feature in the rule function signature */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [AchPaymentHistoryFeature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .scope()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AchPaymentHistoryFeature =
                AchPaymentHistoryFeature(
                    checkRequired("scope", scope),
                    checkRequired("type", type),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AchPaymentHistoryFeature = apply {
            if (validated) {
                return@apply
            }

            scope().validate()
            type().validate()
            name()
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
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The entity scope to load ACH payment history for. */
        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val FINANCIAL_ACCOUNT = of("FINANCIAL_ACCOUNT")

                @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
            }

            /** An enum containing [Scope]'s known values. */
            enum class Known {
                FINANCIAL_ACCOUNT
            }

            /**
             * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Scope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FINANCIAL_ACCOUNT,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
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
                    FINANCIAL_ACCOUNT -> Value.FINANCIAL_ACCOUNT
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
                    FINANCIAL_ACCOUNT -> Known.FINANCIAL_ACCOUNT
                    else -> throw LithicInvalidDataException("Unknown Scope: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Scope = apply {
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

                return other is Scope && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                @JvmField val ACH_PAYMENT_HISTORY = of("ACH_PAYMENT_HISTORY")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACH_PAYMENT_HISTORY
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
                ACH_PAYMENT_HISTORY,
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
                    ACH_PAYMENT_HISTORY -> Value.ACH_PAYMENT_HISTORY
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
                    ACH_PAYMENT_HISTORY -> Known.ACH_PAYMENT_HISTORY
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AchPaymentHistoryFeature &&
                scope == other.scope &&
                type == other.type &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(scope, type, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AchPaymentHistoryFeature{scope=$scope, type=$type, name=$name, additionalProperties=$additionalProperties}"
    }
}
