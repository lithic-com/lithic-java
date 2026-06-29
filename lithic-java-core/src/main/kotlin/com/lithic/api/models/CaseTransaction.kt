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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A single transaction associated with a case. The `category` field identifies whether this is a
 * card transaction or a payment transaction.
 */
@JsonDeserialize(using = CaseTransaction.Deserializer::class)
@JsonSerialize(using = CaseTransaction.Serializer::class)
class CaseTransaction
private constructor(
    private val card: CardCaseTransaction? = null,
    private val payment: PaymentCaseTransaction? = null,
    private val _json: JsonValue? = null,
) {

    /** A card transaction associated with a case */
    fun card(): Optional<CardCaseTransaction> = Optional.ofNullable(card)

    /** A payment (ACH) transaction associated with a case */
    fun payment(): Optional<PaymentCaseTransaction> = Optional.ofNullable(payment)

    fun isCard(): Boolean = card != null

    fun isPayment(): Boolean = payment != null

    /** A card transaction associated with a case */
    fun asCard(): CardCaseTransaction = card.getOrThrow("card")

    /** A payment (ACH) transaction associated with a case */
    fun asPayment(): PaymentCaseTransaction = payment.getOrThrow("payment")

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
     * Optional<String> result = caseTransaction.accept(new CaseTransaction.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitCard(CardCaseTransaction card) {
     *         return Optional.of(card.toString());
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
            card != null -> visitor.visitCard(card)
            payment != null -> visitor.visitPayment(payment)
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
    fun validate(): CaseTransaction = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitCard(card: CardCaseTransaction) {
                    card.validate()
                }

                override fun visitPayment(payment: PaymentCaseTransaction) {
                    payment.validate()
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
                override fun visitCard(card: CardCaseTransaction) = card.validity()

                override fun visitPayment(payment: PaymentCaseTransaction) = payment.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CaseTransaction && card == other.card && payment == other.payment
    }

    override fun hashCode(): Int = Objects.hash(card, payment)

    override fun toString(): String =
        when {
            card != null -> "CaseTransaction{card=$card}"
            payment != null -> "CaseTransaction{payment=$payment}"
            _json != null -> "CaseTransaction{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CaseTransaction")
        }

    companion object {

        /** A card transaction associated with a case */
        @JvmStatic fun ofCard(card: CardCaseTransaction) = CaseTransaction(card = card)

        /** A payment (ACH) transaction associated with a case */
        @JvmStatic
        fun ofPayment(payment: PaymentCaseTransaction) = CaseTransaction(payment = payment)
    }

    /**
     * An interface that defines how to map each variant of [CaseTransaction] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** A card transaction associated with a case */
        fun visitCard(card: CardCaseTransaction): T

        /** A payment (ACH) transaction associated with a case */
        fun visitPayment(payment: PaymentCaseTransaction): T

        /**
         * Maps an unknown variant of [CaseTransaction] to a value of type [T].
         *
         * An instance of [CaseTransaction] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException("Unknown CaseTransaction: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<CaseTransaction>(CaseTransaction::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CaseTransaction {
            val json = JsonValue.fromJsonNode(node)
            val category = json.asObject().getOrNull()?.get("category")?.asString()?.getOrNull()

            when (category) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<CardCaseTransaction>())?.let {
                            CaseTransaction(card = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentCaseTransaction>())?.let {
                            CaseTransaction(payment = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CaseTransaction(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<CaseTransaction>(CaseTransaction::class) {

        override fun serialize(
            value: CaseTransaction,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.card != null -> generator.writeObject(value.card)
                value.payment != null -> generator.writeObject(value.payment)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CaseTransaction")
            }
        }
    }

    /** A card transaction associated with a case */
    class CardCaseTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val accountToken: JsonField<String>,
        private val addedAt: JsonField<OffsetDateTime>,
        private val cardToken: JsonField<String>,
        private val category: JsonField<Category>,
        private val transactionCreatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_token")
            @ExcludeMissing
            accountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("added_at")
            @ExcludeMissing
            addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("card_token")
            @ExcludeMissing
            cardToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("transaction_created_at")
            @ExcludeMissing
            transactionCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            token,
            accountToken,
            addedAt,
            cardToken,
            category,
            transactionCreatedAt,
            mutableMapOf(),
        )

        /**
         * Globally unique identifier for the card transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Token of the account the transaction belongs to
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountToken(): String = accountToken.getRequired("account_token")

        /**
         * Date and time at which the transaction was added to the case
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addedAt(): OffsetDateTime = addedAt.getRequired("added_at")

        /**
         * Token of the card the transaction was made on
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardToken(): String = cardToken.getRequired("card_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Date and time at which the transaction was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionCreatedAt(): OffsetDateTime =
            transactionCreatedAt.getRequired("transaction_created_at")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [accountToken].
         *
         * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        /**
         * Returns the raw JSON value of [addedAt].
         *
         * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("added_at")
        @ExcludeMissing
        fun _addedAt(): JsonField<OffsetDateTime> = addedAt

        /**
         * Returns the raw JSON value of [cardToken].
         *
         * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [transactionCreatedAt].
         *
         * Unlike [transactionCreatedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transaction_created_at")
        @ExcludeMissing
        fun _transactionCreatedAt(): JsonField<OffsetDateTime> = transactionCreatedAt

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
             * Returns a mutable builder for constructing an instance of [CardCaseTransaction].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .accountToken()
             * .addedAt()
             * .cardToken()
             * .category()
             * .transactionCreatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardCaseTransaction]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var accountToken: JsonField<String>? = null
            private var addedAt: JsonField<OffsetDateTime>? = null
            private var cardToken: JsonField<String>? = null
            private var category: JsonField<Category>? = null
            private var transactionCreatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardCaseTransaction: CardCaseTransaction) = apply {
                token = cardCaseTransaction.token
                accountToken = cardCaseTransaction.accountToken
                addedAt = cardCaseTransaction.addedAt
                cardToken = cardCaseTransaction.cardToken
                category = cardCaseTransaction.category
                transactionCreatedAt = cardCaseTransaction.transactionCreatedAt
                additionalProperties = cardCaseTransaction.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the card transaction */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Token of the account the transaction belongs to */
            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            /**
             * Sets [Builder.accountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            /** Date and time at which the transaction was added to the case */
            fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

            /**
             * Sets [Builder.addedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

            /** Token of the card the transaction was made on */
            fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

            /**
             * Sets [Builder.cardToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Date and time at which the transaction was created */
            fun transactionCreatedAt(transactionCreatedAt: OffsetDateTime) =
                transactionCreatedAt(JsonField.of(transactionCreatedAt))

            /**
             * Sets [Builder.transactionCreatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionCreatedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transactionCreatedAt(transactionCreatedAt: JsonField<OffsetDateTime>) = apply {
                this.transactionCreatedAt = transactionCreatedAt
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
             * Returns an immutable instance of [CardCaseTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .accountToken()
             * .addedAt()
             * .cardToken()
             * .category()
             * .transactionCreatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardCaseTransaction =
                CardCaseTransaction(
                    checkRequired("token", token),
                    checkRequired("accountToken", accountToken),
                    checkRequired("addedAt", addedAt),
                    checkRequired("cardToken", cardToken),
                    checkRequired("category", category),
                    checkRequired("transactionCreatedAt", transactionCreatedAt),
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
        fun validate(): CardCaseTransaction = apply {
            if (validated) {
                return@apply
            }

            token()
            accountToken()
            addedAt()
            cardToken()
            category().validate()
            transactionCreatedAt()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (accountToken.asKnown().isPresent) 1 else 0) +
                (if (addedAt.asKnown().isPresent) 1 else 0) +
                (if (cardToken.asKnown().isPresent) 1 else 0) +
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transactionCreatedAt.asKnown().isPresent) 1 else 0)

        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                CARD
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    else -> throw LithicInvalidDataException("Unknown Category: $value")
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
            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardCaseTransaction &&
                token == other.token &&
                accountToken == other.accountToken &&
                addedAt == other.addedAt &&
                cardToken == other.cardToken &&
                category == other.category &&
                transactionCreatedAt == other.transactionCreatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                accountToken,
                addedAt,
                cardToken,
                category,
                transactionCreatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardCaseTransaction{token=$token, accountToken=$accountToken, addedAt=$addedAt, cardToken=$cardToken, category=$category, transactionCreatedAt=$transactionCreatedAt, additionalProperties=$additionalProperties}"
    }

    /** A payment (ACH) transaction associated with a case */
    class PaymentCaseTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val addedAt: JsonField<OffsetDateTime>,
        private val category: JsonField<Category>,
        private val financialAccountToken: JsonField<String>,
        private val transactionCreatedAt: JsonField<OffsetDateTime>,
        private val accountToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("added_at")
            @ExcludeMissing
            addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            financialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_created_at")
            @ExcludeMissing
            transactionCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("account_token")
            @ExcludeMissing
            accountToken: JsonField<String> = JsonMissing.of(),
        ) : this(
            token,
            addedAt,
            category,
            financialAccountToken,
            transactionCreatedAt,
            accountToken,
            mutableMapOf(),
        )

        /**
         * Globally unique identifier for the payment transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Date and time at which the transaction was added to the case
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addedAt(): OffsetDateTime = addedAt.getRequired("added_at")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Token of the financial account the payment belongs to
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /**
         * Date and time at which the transaction was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionCreatedAt(): OffsetDateTime =
            transactionCreatedAt.getRequired("transaction_created_at")

        /**
         * Token of the account the payment belongs to, if applicable
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [addedAt].
         *
         * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("added_at")
        @ExcludeMissing
        fun _addedAt(): JsonField<OffsetDateTime> = addedAt

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [financialAccountToken].
         *
         * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        /**
         * Returns the raw JSON value of [transactionCreatedAt].
         *
         * Unlike [transactionCreatedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transaction_created_at")
        @ExcludeMissing
        fun _transactionCreatedAt(): JsonField<OffsetDateTime> = transactionCreatedAt

        /**
         * Returns the raw JSON value of [accountToken].
         *
         * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

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
             * Returns a mutable builder for constructing an instance of [PaymentCaseTransaction].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .addedAt()
             * .category()
             * .financialAccountToken()
             * .transactionCreatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentCaseTransaction]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var addedAt: JsonField<OffsetDateTime>? = null
            private var category: JsonField<Category>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var transactionCreatedAt: JsonField<OffsetDateTime>? = null
            private var accountToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentCaseTransaction: PaymentCaseTransaction) = apply {
                token = paymentCaseTransaction.token
                addedAt = paymentCaseTransaction.addedAt
                category = paymentCaseTransaction.category
                financialAccountToken = paymentCaseTransaction.financialAccountToken
                transactionCreatedAt = paymentCaseTransaction.transactionCreatedAt
                accountToken = paymentCaseTransaction.accountToken
                additionalProperties = paymentCaseTransaction.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the payment transaction */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Date and time at which the transaction was added to the case */
            fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

            /**
             * Sets [Builder.addedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Token of the financial account the payment belongs to */
            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /**
             * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            /** Date and time at which the transaction was created */
            fun transactionCreatedAt(transactionCreatedAt: OffsetDateTime) =
                transactionCreatedAt(JsonField.of(transactionCreatedAt))

            /**
             * Sets [Builder.transactionCreatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionCreatedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transactionCreatedAt(transactionCreatedAt: JsonField<OffsetDateTime>) = apply {
                this.transactionCreatedAt = transactionCreatedAt
            }

            /** Token of the account the payment belongs to, if applicable */
            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            /**
             * Sets [Builder.accountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
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
             * Returns an immutable instance of [PaymentCaseTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .addedAt()
             * .category()
             * .financialAccountToken()
             * .transactionCreatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentCaseTransaction =
                PaymentCaseTransaction(
                    checkRequired("token", token),
                    checkRequired("addedAt", addedAt),
                    checkRequired("category", category),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("transactionCreatedAt", transactionCreatedAt),
                    accountToken,
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
        fun validate(): PaymentCaseTransaction = apply {
            if (validated) {
                return@apply
            }

            token()
            addedAt()
            category().validate()
            financialAccountToken()
            transactionCreatedAt()
            accountToken()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (addedAt.asKnown().isPresent) 1 else 0) +
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
                (if (transactionCreatedAt.asKnown().isPresent) 1 else 0) +
                (if (accountToken.asKnown().isPresent) 1 else 0)

        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val PAYMENT = of("PAYMENT")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                PAYMENT
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAYMENT,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    PAYMENT -> Value.PAYMENT
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
                    PAYMENT -> Known.PAYMENT
                    else -> throw LithicInvalidDataException("Unknown Category: $value")
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
            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCaseTransaction &&
                token == other.token &&
                addedAt == other.addedAt &&
                category == other.category &&
                financialAccountToken == other.financialAccountToken &&
                transactionCreatedAt == other.transactionCreatedAt &&
                accountToken == other.accountToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                addedAt,
                category,
                financialAccountToken,
                transactionCreatedAt,
                accountToken,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentCaseTransaction{token=$token, addedAt=$addedAt, category=$category, financialAccountToken=$financialAccountToken, transactionCreatedAt=$transactionCreatedAt, accountToken=$accountToken, additionalProperties=$additionalProperties}"
    }
}
