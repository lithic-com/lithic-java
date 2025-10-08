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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response containing multiple transaction types */
@JsonDeserialize(using = AccountActivityRetrieveTransactionResponse.Deserializer::class)
@JsonSerialize(using = AccountActivityRetrieveTransactionResponse.Serializer::class)
class AccountActivityRetrieveTransactionResponse
private constructor(
    private val financialTransaction: FinancialTransaction? = null,
    private val bookTransferTransaction: BookTransferTransaction? = null,
    private val cardTransaction: CardTransaction? = null,
    private val paymentTransaction: PaymentTransaction? = null,
    private val externalPayment: ExternalPayment? = null,
    private val managementOperationTransaction: ManagementOperationTransaction? = null,
    private val _json: JsonValue? = null,
) {

    /** Financial transaction with inheritance from unified base transaction */
    fun financialTransaction(): Optional<FinancialTransaction> =
        Optional.ofNullable(financialTransaction)

    /** Book transfer transaction */
    fun bookTransferTransaction(): Optional<BookTransferTransaction> =
        Optional.ofNullable(bookTransferTransaction)

    /** Base class for all transaction types in the ledger service */
    fun cardTransaction(): Optional<CardTransaction> = Optional.ofNullable(cardTransaction)

    /** Payment transaction */
    fun paymentTransaction(): Optional<PaymentTransaction> = Optional.ofNullable(paymentTransaction)

    fun externalPayment(): Optional<ExternalPayment> = Optional.ofNullable(externalPayment)

    fun managementOperationTransaction(): Optional<ManagementOperationTransaction> =
        Optional.ofNullable(managementOperationTransaction)

    fun isFinancialTransaction(): Boolean = financialTransaction != null

    fun isBookTransferTransaction(): Boolean = bookTransferTransaction != null

    fun isCardTransaction(): Boolean = cardTransaction != null

    fun isPaymentTransaction(): Boolean = paymentTransaction != null

    fun isExternalPayment(): Boolean = externalPayment != null

    fun isManagementOperationTransaction(): Boolean = managementOperationTransaction != null

    /** Financial transaction with inheritance from unified base transaction */
    fun asFinancialTransaction(): FinancialTransaction =
        financialTransaction.getOrThrow("financialTransaction")

    /** Book transfer transaction */
    fun asBookTransferTransaction(): BookTransferTransaction =
        bookTransferTransaction.getOrThrow("bookTransferTransaction")

    /** Base class for all transaction types in the ledger service */
    fun asCardTransaction(): CardTransaction = cardTransaction.getOrThrow("cardTransaction")

    /** Payment transaction */
    fun asPaymentTransaction(): PaymentTransaction =
        paymentTransaction.getOrThrow("paymentTransaction")

    fun asExternalPayment(): ExternalPayment = externalPayment.getOrThrow("externalPayment")

    fun asManagementOperationTransaction(): ManagementOperationTransaction =
        managementOperationTransaction.getOrThrow("managementOperationTransaction")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            financialTransaction != null -> visitor.visitFinancialTransaction(financialTransaction)
            bookTransferTransaction != null ->
                visitor.visitBookTransferTransaction(bookTransferTransaction)
            cardTransaction != null -> visitor.visitCardTransaction(cardTransaction)
            paymentTransaction != null -> visitor.visitPaymentTransaction(paymentTransaction)
            externalPayment != null -> visitor.visitExternalPayment(externalPayment)
            managementOperationTransaction != null ->
                visitor.visitManagementOperationTransaction(managementOperationTransaction)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): AccountActivityRetrieveTransactionResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitFinancialTransaction(financialTransaction: FinancialTransaction) {
                    financialTransaction.validate()
                }

                override fun visitBookTransferTransaction(
                    bookTransferTransaction: BookTransferTransaction
                ) {
                    bookTransferTransaction.validate()
                }

                override fun visitCardTransaction(cardTransaction: CardTransaction) {
                    cardTransaction.validate()
                }

                override fun visitPaymentTransaction(paymentTransaction: PaymentTransaction) {
                    paymentTransaction.validate()
                }

                override fun visitExternalPayment(externalPayment: ExternalPayment) {
                    externalPayment.validate()
                }

                override fun visitManagementOperationTransaction(
                    managementOperationTransaction: ManagementOperationTransaction
                ) {
                    managementOperationTransaction.validate()
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
                override fun visitFinancialTransaction(financialTransaction: FinancialTransaction) =
                    financialTransaction.validity()

                override fun visitBookTransferTransaction(
                    bookTransferTransaction: BookTransferTransaction
                ) = bookTransferTransaction.validity()

                override fun visitCardTransaction(cardTransaction: CardTransaction) =
                    cardTransaction.validity()

                override fun visitPaymentTransaction(paymentTransaction: PaymentTransaction) =
                    paymentTransaction.validity()

                override fun visitExternalPayment(externalPayment: ExternalPayment) =
                    externalPayment.validity()

                override fun visitManagementOperationTransaction(
                    managementOperationTransaction: ManagementOperationTransaction
                ) = managementOperationTransaction.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountActivityRetrieveTransactionResponse &&
            financialTransaction == other.financialTransaction &&
            bookTransferTransaction == other.bookTransferTransaction &&
            cardTransaction == other.cardTransaction &&
            paymentTransaction == other.paymentTransaction &&
            externalPayment == other.externalPayment &&
            managementOperationTransaction == other.managementOperationTransaction
    }

    override fun hashCode(): Int =
        Objects.hash(
            financialTransaction,
            bookTransferTransaction,
            cardTransaction,
            paymentTransaction,
            externalPayment,
            managementOperationTransaction,
        )

    override fun toString(): String =
        when {
            financialTransaction != null ->
                "AccountActivityRetrieveTransactionResponse{financialTransaction=$financialTransaction}"
            bookTransferTransaction != null ->
                "AccountActivityRetrieveTransactionResponse{bookTransferTransaction=$bookTransferTransaction}"
            cardTransaction != null ->
                "AccountActivityRetrieveTransactionResponse{cardTransaction=$cardTransaction}"
            paymentTransaction != null ->
                "AccountActivityRetrieveTransactionResponse{paymentTransaction=$paymentTransaction}"
            externalPayment != null ->
                "AccountActivityRetrieveTransactionResponse{externalPayment=$externalPayment}"
            managementOperationTransaction != null ->
                "AccountActivityRetrieveTransactionResponse{managementOperationTransaction=$managementOperationTransaction}"
            _json != null -> "AccountActivityRetrieveTransactionResponse{_unknown=$_json}"
            else ->
                throw IllegalStateException("Invalid AccountActivityRetrieveTransactionResponse")
        }

    companion object {

        /** Financial transaction with inheritance from unified base transaction */
        @JvmStatic
        fun ofFinancialTransaction(financialTransaction: FinancialTransaction) =
            AccountActivityRetrieveTransactionResponse(financialTransaction = financialTransaction)

        /** Book transfer transaction */
        @JvmStatic
        fun ofBookTransferTransaction(bookTransferTransaction: BookTransferTransaction) =
            AccountActivityRetrieveTransactionResponse(
                bookTransferTransaction = bookTransferTransaction
            )

        /** Base class for all transaction types in the ledger service */
        @JvmStatic
        fun ofCardTransaction(cardTransaction: CardTransaction) =
            AccountActivityRetrieveTransactionResponse(cardTransaction = cardTransaction)

        /** Payment transaction */
        @JvmStatic
        fun ofPaymentTransaction(paymentTransaction: PaymentTransaction) =
            AccountActivityRetrieveTransactionResponse(paymentTransaction = paymentTransaction)

        @JvmStatic
        fun ofExternalPayment(externalPayment: ExternalPayment) =
            AccountActivityRetrieveTransactionResponse(externalPayment = externalPayment)

        @JvmStatic
        fun ofManagementOperationTransaction(
            managementOperationTransaction: ManagementOperationTransaction
        ) =
            AccountActivityRetrieveTransactionResponse(
                managementOperationTransaction = managementOperationTransaction
            )
    }

    /**
     * An interface that defines how to map each variant of
     * [AccountActivityRetrieveTransactionResponse] to a value of type [T].
     */
    interface Visitor<out T> {

        /** Financial transaction with inheritance from unified base transaction */
        fun visitFinancialTransaction(financialTransaction: FinancialTransaction): T

        /** Book transfer transaction */
        fun visitBookTransferTransaction(bookTransferTransaction: BookTransferTransaction): T

        /** Base class for all transaction types in the ledger service */
        fun visitCardTransaction(cardTransaction: CardTransaction): T

        /** Payment transaction */
        fun visitPaymentTransaction(paymentTransaction: PaymentTransaction): T

        fun visitExternalPayment(externalPayment: ExternalPayment): T

        fun visitManagementOperationTransaction(
            managementOperationTransaction: ManagementOperationTransaction
        ): T

        /**
         * Maps an unknown variant of [AccountActivityRetrieveTransactionResponse] to a value of
         * type [T].
         *
         * An instance of [AccountActivityRetrieveTransactionResponse] can contain an unknown
         * variant if it was deserialized from data that doesn't match any known variant. For
         * example, if the SDK is on an older version than the API, then the API may respond with
         * new variants that the SDK is unaware of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException(
                "Unknown AccountActivityRetrieveTransactionResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<AccountActivityRetrieveTransactionResponse>(
            AccountActivityRetrieveTransactionResponse::class
        ) {

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): AccountActivityRetrieveTransactionResponse {
            val json = JsonValue.fromJsonNode(node)
            val family = json.asObject().getOrNull()?.get("family")?.asString()?.getOrNull()

            when (family) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<FinancialTransaction>())?.let {
                            AccountActivityRetrieveTransactionResponse(
                                financialTransaction = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<BookTransferTransaction>())?.let {
                            AccountActivityRetrieveTransactionResponse(
                                bookTransferTransaction = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<CardTransaction>())?.let {
                            AccountActivityRetrieveTransactionResponse(
                                cardTransaction = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentTransaction>())?.let {
                            AccountActivityRetrieveTransactionResponse(
                                paymentTransaction = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<ExternalPayment>())?.let {
                            AccountActivityRetrieveTransactionResponse(
                                externalPayment = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<ManagementOperationTransaction>())
                            ?.let {
                                AccountActivityRetrieveTransactionResponse(
                                    managementOperationTransaction = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> AccountActivityRetrieveTransactionResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<AccountActivityRetrieveTransactionResponse>(
            AccountActivityRetrieveTransactionResponse::class
        ) {

        override fun serialize(
            value: AccountActivityRetrieveTransactionResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.financialTransaction != null ->
                    generator.writeObject(value.financialTransaction)
                value.bookTransferTransaction != null ->
                    generator.writeObject(value.bookTransferTransaction)
                value.cardTransaction != null -> generator.writeObject(value.cardTransaction)
                value.paymentTransaction != null -> generator.writeObject(value.paymentTransaction)
                value.externalPayment != null -> generator.writeObject(value.externalPayment)
                value.managementOperationTransaction != null ->
                    generator.writeObject(value.managementOperationTransaction)
                value._json != null -> generator.writeObject(value._json)
                else ->
                    throw IllegalStateException(
                        "Invalid AccountActivityRetrieveTransactionResponse"
                    )
            }
        }
    }

    /** Financial transaction with inheritance from unified base transaction */
    class FinancialTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val category: JsonField<TransactionCategory>,
        private val created: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val descriptor: JsonField<String>,
        private val events: JsonField<List<FinancialEvent>>,
        private val family: JsonField<TransactionFamilyTypes>,
        private val financialAccountToken: JsonField<String>,
        private val pendingAmount: JsonField<Long>,
        private val result: JsonField<TransactionResult>,
        private val settledAmount: JsonField<Long>,
        private val status: JsonField<TransactionStatus>,
        private val updated: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<TransactionCategory> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("descriptor")
            @ExcludeMissing
            descriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<FinancialEvent>> = JsonMissing.of(),
            @JsonProperty("family")
            @ExcludeMissing
            family: JsonField<TransactionFamilyTypes> = JsonMissing.of(),
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            financialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pending_amount")
            @ExcludeMissing
            pendingAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<TransactionResult> = JsonMissing.of(),
            @JsonProperty("settled_amount")
            @ExcludeMissing
            settledAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<TransactionStatus> = JsonMissing.of(),
            @JsonProperty("updated")
            @ExcludeMissing
            updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            token,
            category,
            created,
            currency,
            descriptor,
            events,
            family,
            financialAccountToken,
            pendingAmount,
            result,
            settledAmount,
            status,
            updated,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Transaction category
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): TransactionCategory = category.getRequired("category")

        /**
         * ISO 8601 timestamp of when the transaction was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * Currency of the transaction, represented in ISO 4217 format
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Transaction descriptor
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun descriptor(): String = descriptor.getRequired("descriptor")

        /**
         * List of transaction events
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun events(): List<FinancialEvent> = events.getRequired("events")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun family(): TransactionFamilyTypes = family.getRequired("family")

        /**
         * Financial account token associated with the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /**
         * Pending amount in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

        /**
         * Transaction result
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): TransactionResult = result.getRequired("result")

        /**
         * Settled amount in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

        /**
         * The status of the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): TransactionStatus = status.getRequired("status")

        /**
         * ISO 8601 timestamp of when the transaction was last updated
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<TransactionCategory> = category

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [descriptor].
         *
         * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events")
        @ExcludeMissing
        fun _events(): JsonField<List<FinancialEvent>> = events

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family")
        @ExcludeMissing
        fun _family(): JsonField<TransactionFamilyTypes> = family

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
         * Returns the raw JSON value of [pendingAmount].
         *
         * Unlike [pendingAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun _pendingAmount(): JsonField<Long> = pendingAmount

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

        /**
         * Returns the raw JSON value of [settledAmount].
         *
         * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun _settledAmount(): JsonField<Long> = settledAmount

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TransactionStatus> = status

        /**
         * Returns the raw JSON value of [updated].
         *
         * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
             * Returns a mutable builder for constructing an instance of [FinancialTransaction].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .category()
             * .created()
             * .currency()
             * .descriptor()
             * .events()
             * .family()
             * .financialAccountToken()
             * .pendingAmount()
             * .result()
             * .settledAmount()
             * .status()
             * .updated()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FinancialTransaction]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var category: JsonField<TransactionCategory>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<String>? = null
            private var descriptor: JsonField<String>? = null
            private var events: JsonField<MutableList<FinancialEvent>>? = null
            private var family: JsonField<TransactionFamilyTypes>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var pendingAmount: JsonField<Long>? = null
            private var result: JsonField<TransactionResult>? = null
            private var settledAmount: JsonField<Long>? = null
            private var status: JsonField<TransactionStatus>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(financialTransaction: FinancialTransaction) = apply {
                token = financialTransaction.token
                category = financialTransaction.category
                created = financialTransaction.created
                currency = financialTransaction.currency
                descriptor = financialTransaction.descriptor
                events = financialTransaction.events.map { it.toMutableList() }
                family = financialTransaction.family
                financialAccountToken = financialTransaction.financialAccountToken
                pendingAmount = financialTransaction.pendingAmount
                result = financialTransaction.result
                settledAmount = financialTransaction.settledAmount
                status = financialTransaction.status
                updated = financialTransaction.updated
                additionalProperties = financialTransaction.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the transaction */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Transaction category */
            fun category(category: TransactionCategory) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [TransactionCategory]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun category(category: JsonField<TransactionCategory>) = apply {
                this.category = category
            }

            /** ISO 8601 timestamp of when the transaction was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Currency of the transaction, represented in ISO 4217 format */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Transaction descriptor */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /**
             * Sets [Builder.descriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.descriptor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /** List of transaction events */
            fun events(events: List<FinancialEvent>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<FinancialEvent>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun events(events: JsonField<List<FinancialEvent>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [FinancialEvent] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: FinancialEvent) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            fun family(family: TransactionFamilyTypes) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [TransactionFamilyTypes]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun family(family: JsonField<TransactionFamilyTypes>) = apply { this.family = family }

            /** Financial account token associated with the transaction */
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

            /** Pending amount in cents */
            fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

            /**
             * Sets [Builder.pendingAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
                this.pendingAmount = pendingAmount
            }

            /** Transaction result */
            fun result(result: TransactionResult) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [TransactionResult] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

            /** Settled amount in cents */
            fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

            /**
             * Sets [Builder.settledAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settledAmount(settledAmount: JsonField<Long>) = apply {
                this.settledAmount = settledAmount
            }

            /** The status of the transaction */
            fun status(status: TransactionStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [TransactionStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<TransactionStatus>) = apply { this.status = status }

            /** ISO 8601 timestamp of when the transaction was last updated */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /**
             * Sets [Builder.updated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
             * Returns an immutable instance of [FinancialTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .category()
             * .created()
             * .currency()
             * .descriptor()
             * .events()
             * .family()
             * .financialAccountToken()
             * .pendingAmount()
             * .result()
             * .settledAmount()
             * .status()
             * .updated()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FinancialTransaction =
                FinancialTransaction(
                    checkRequired("token", token),
                    checkRequired("category", category),
                    checkRequired("created", created),
                    checkRequired("currency", currency),
                    checkRequired("descriptor", descriptor),
                    checkRequired("events", events).map { it.toImmutable() },
                    checkRequired("family", family),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("pendingAmount", pendingAmount),
                    checkRequired("result", result),
                    checkRequired("settledAmount", settledAmount),
                    checkRequired("status", status),
                    checkRequired("updated", updated),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FinancialTransaction = apply {
            if (validated) {
                return@apply
            }

            token()
            category().validate()
            created()
            currency()
            descriptor()
            events().forEach { it.validate() }
            family().validate()
            financialAccountToken()
            pendingAmount()
            result().validate()
            settledAmount()
            status().validate()
            updated()
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (descriptor.asKnown().isPresent) 1 else 0) +
                (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (family.asKnown().getOrNull()?.validity() ?: 0) +
                (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
                (if (pendingAmount.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (settledAmount.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updated.asKnown().isPresent) 1 else 0)

        /** Transaction category */
        class TransactionCategory
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

                @JvmField val ACH = of("ACH")

                @JvmField val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

                @JvmField val FEE = of("FEE")

                @JvmField val REWARD = of("REWARD")

                @JvmField val ADJUSTMENT = of("ADJUSTMENT")

                @JvmField val DERECOGNITION = of("DERECOGNITION")

                @JvmField val DISPUTE = of("DISPUTE")

                @JvmField val CARD = of("CARD")

                @JvmField val EXTERNAL_ACH = of("EXTERNAL_ACH")

                @JvmField val EXTERNAL_CHECK = of("EXTERNAL_CHECK")

                @JvmField val EXTERNAL_TRANSFER = of("EXTERNAL_TRANSFER")

                @JvmField val EXTERNAL_WIRE = of("EXTERNAL_WIRE")

                @JvmField val MANAGEMENT_ADJUSTMENT = of("MANAGEMENT_ADJUSTMENT")

                @JvmField val MANAGEMENT_DISPUTE = of("MANAGEMENT_DISPUTE")

                @JvmField val MANAGEMENT_FEE = of("MANAGEMENT_FEE")

                @JvmField val MANAGEMENT_REWARD = of("MANAGEMENT_REWARD")

                @JvmField val MANAGEMENT_DISBURSEMENT = of("MANAGEMENT_DISBURSEMENT")

                @JvmField val PROGRAM_FUNDING = of("PROGRAM_FUNDING")

                @JvmStatic fun of(value: String) = TransactionCategory(JsonField.of(value))
            }

            /** An enum containing [TransactionCategory]'s known values. */
            enum class Known {
                ACH,
                BALANCE_OR_FUNDING,
                FEE,
                REWARD,
                ADJUSTMENT,
                DERECOGNITION,
                DISPUTE,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
                MANAGEMENT_DISBURSEMENT,
                PROGRAM_FUNDING,
            }

            /**
             * An enum containing [TransactionCategory]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionCategory] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH,
                BALANCE_OR_FUNDING,
                FEE,
                REWARD,
                ADJUSTMENT,
                DERECOGNITION,
                DISPUTE,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
                MANAGEMENT_DISBURSEMENT,
                PROGRAM_FUNDING,
                /**
                 * An enum member indicating that [TransactionCategory] was instantiated with an
                 * unknown value.
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
                    ACH -> Value.ACH
                    BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                    FEE -> Value.FEE
                    REWARD -> Value.REWARD
                    ADJUSTMENT -> Value.ADJUSTMENT
                    DERECOGNITION -> Value.DERECOGNITION
                    DISPUTE -> Value.DISPUTE
                    CARD -> Value.CARD
                    EXTERNAL_ACH -> Value.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                    MANAGEMENT_DISBURSEMENT -> Value.MANAGEMENT_DISBURSEMENT
                    PROGRAM_FUNDING -> Value.PROGRAM_FUNDING
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
                    ACH -> Known.ACH
                    BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                    FEE -> Known.FEE
                    REWARD -> Known.REWARD
                    ADJUSTMENT -> Known.ADJUSTMENT
                    DERECOGNITION -> Known.DERECOGNITION
                    DISPUTE -> Known.DISPUTE
                    CARD -> Known.CARD
                    EXTERNAL_ACH -> Known.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                    MANAGEMENT_DISBURSEMENT -> Known.MANAGEMENT_DISBURSEMENT
                    PROGRAM_FUNDING -> Known.PROGRAM_FUNDING
                    else -> throw LithicInvalidDataException("Unknown TransactionCategory: $value")
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

            fun validate(): TransactionCategory = apply {
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

                return other is TransactionCategory && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Financial Event */
        class FinancialEvent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val token: JsonField<String>,
            private val amount: JsonField<Long>,
            private val created: JsonField<OffsetDateTime>,
            private val result: JsonField<Result>,
            private val type: JsonField<FinancialEventType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("created")
                @ExcludeMissing
                created: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("result")
                @ExcludeMissing
                result: JsonField<Result> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<FinancialEventType> = JsonMissing.of(),
            ) : this(token, amount, created, result, type, mutableMapOf())

            /**
             * Globally unique identifier.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun token(): Optional<String> = token.getOptional("token")

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Long> = amount.getOptional("amount")

            /**
             * Date and time when the financial event occurred. UTC time zone.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun created(): Optional<OffsetDateTime> = created.getOptional("created")

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun result(): Optional<Result> = result.getOptional("result")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<FinancialEventType> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [created].
             *
             * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("created")
            @ExcludeMissing
            fun _created(): JsonField<OffsetDateTime> = created

            /**
             * Returns the raw JSON value of [result].
             *
             * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FinancialEventType> = type

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

                /** Returns a mutable builder for constructing an instance of [FinancialEvent]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FinancialEvent]. */
            class Builder internal constructor() {

                private var token: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var created: JsonField<OffsetDateTime> = JsonMissing.of()
                private var result: JsonField<Result> = JsonMissing.of()
                private var type: JsonField<FinancialEventType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(financialEvent: FinancialEvent) = apply {
                    token = financialEvent.token
                    amount = financialEvent.amount
                    created = financialEvent.created
                    result = financialEvent.result
                    type = financialEvent.type
                    additionalProperties = financialEvent.additionalProperties.toMutableMap()
                }

                /** Globally unique identifier. */
                fun token(token: String) = token(JsonField.of(token))

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                /**
                 * Amount of the financial event that has been settled in the currency's smallest
                 * unit (e.g., cents).
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** Date and time when the financial event occurred. UTC time zone. */
                fun created(created: OffsetDateTime) = created(JsonField.of(created))

                /**
                 * Sets [Builder.created] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.created] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

                /**
                 * APPROVED financial events were successful while DECLINED financial events were
                 * declined by user, Lithic, or the network.
                 */
                fun result(result: Result) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed [Result] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun result(result: JsonField<Result>) = apply { this.result = result }

                fun type(type: FinancialEventType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [FinancialEventType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun type(type: JsonField<FinancialEventType>) = apply { this.type = type }

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
                 * Returns an immutable instance of [FinancialEvent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FinancialEvent =
                    FinancialEvent(
                        token,
                        amount,
                        created,
                        result,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FinancialEvent = apply {
                if (validated) {
                    return@apply
                }

                token()
                amount()
                created()
                result().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (created.asKnown().isPresent) 1 else 0) +
                    (result.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
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

            class FinancialEventType
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

                    @JvmField val ACH_ORIGINATION_CANCELLED = of("ACH_ORIGINATION_CANCELLED")

                    @JvmField val ACH_ORIGINATION_INITIATED = of("ACH_ORIGINATION_INITIATED")

                    @JvmField val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

                    @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                    @JvmField val ACH_ORIGINATION_REJECTED = of("ACH_ORIGINATION_REJECTED")

                    @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                    @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                    @JvmField val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                    @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                    @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                    @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

                    @JvmField val ACH_RETURN_REJECTED = of("ACH_RETURN_REJECTED")

                    @JvmField val ACH_RETURN_SETTLED = of("ACH_RETURN_SETTLED")

                    @JvmField val AUTHORIZATION = of("AUTHORIZATION")

                    @JvmField val AUTHORIZATION_ADVICE = of("AUTHORIZATION_ADVICE")

                    @JvmField val AUTHORIZATION_EXPIRY = of("AUTHORIZATION_EXPIRY")

                    @JvmField val AUTHORIZATION_REVERSAL = of("AUTHORIZATION_REVERSAL")

                    @JvmField val BALANCE_INQUIRY = of("BALANCE_INQUIRY")

                    @JvmField val BILLING_ERROR = of("BILLING_ERROR")

                    @JvmField val BILLING_ERROR_REVERSAL = of("BILLING_ERROR_REVERSAL")

                    @JvmField val CARD_TO_CARD = of("CARD_TO_CARD")

                    @JvmField val CASH_BACK = of("CASH_BACK")

                    @JvmField val CASH_BACK_REVERSAL = of("CASH_BACK_REVERSAL")

                    @JvmField val CLEARING = of("CLEARING")

                    @JvmField val COLLECTION = of("COLLECTION")

                    @JvmField val CORRECTION_CREDIT = of("CORRECTION_CREDIT")

                    @JvmField val CORRECTION_DEBIT = of("CORRECTION_DEBIT")

                    @JvmField val CREDIT_AUTHORIZATION = of("CREDIT_AUTHORIZATION")

                    @JvmField val CREDIT_AUTHORIZATION_ADVICE = of("CREDIT_AUTHORIZATION_ADVICE")

                    @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

                    @JvmField val CURRENCY_CONVERSION_REVERSAL = of("CURRENCY_CONVERSION_REVERSAL")

                    @JvmField val DISPUTE_WON = of("DISPUTE_WON")

                    @JvmField val EXTERNAL_ACH_CANCELED = of("EXTERNAL_ACH_CANCELED")

                    @JvmField val EXTERNAL_ACH_INITIATED = of("EXTERNAL_ACH_INITIATED")

                    @JvmField val EXTERNAL_ACH_RELEASED = of("EXTERNAL_ACH_RELEASED")

                    @JvmField val EXTERNAL_ACH_REVERSED = of("EXTERNAL_ACH_REVERSED")

                    @JvmField val EXTERNAL_ACH_SETTLED = of("EXTERNAL_ACH_SETTLED")

                    @JvmField val EXTERNAL_CHECK_CANCELED = of("EXTERNAL_CHECK_CANCELED")

                    @JvmField val EXTERNAL_CHECK_INITIATED = of("EXTERNAL_CHECK_INITIATED")

                    @JvmField val EXTERNAL_CHECK_RELEASED = of("EXTERNAL_CHECK_RELEASED")

                    @JvmField val EXTERNAL_CHECK_REVERSED = of("EXTERNAL_CHECK_REVERSED")

                    @JvmField val EXTERNAL_CHECK_SETTLED = of("EXTERNAL_CHECK_SETTLED")

                    @JvmField val EXTERNAL_TRANSFER_CANCELED = of("EXTERNAL_TRANSFER_CANCELED")

                    @JvmField val EXTERNAL_TRANSFER_INITIATED = of("EXTERNAL_TRANSFER_INITIATED")

                    @JvmField val EXTERNAL_TRANSFER_RELEASED = of("EXTERNAL_TRANSFER_RELEASED")

                    @JvmField val EXTERNAL_TRANSFER_REVERSED = of("EXTERNAL_TRANSFER_REVERSED")

                    @JvmField val EXTERNAL_TRANSFER_SETTLED = of("EXTERNAL_TRANSFER_SETTLED")

                    @JvmField val EXTERNAL_WIRE_CANCELED = of("EXTERNAL_WIRE_CANCELED")

                    @JvmField val EXTERNAL_WIRE_INITIATED = of("EXTERNAL_WIRE_INITIATED")

                    @JvmField val EXTERNAL_WIRE_RELEASED = of("EXTERNAL_WIRE_RELEASED")

                    @JvmField val EXTERNAL_WIRE_REVERSED = of("EXTERNAL_WIRE_REVERSED")

                    @JvmField val EXTERNAL_WIRE_SETTLED = of("EXTERNAL_WIRE_SETTLED")

                    @JvmField val FINANCIAL_AUTHORIZATION = of("FINANCIAL_AUTHORIZATION")

                    @JvmField
                    val FINANCIAL_CREDIT_AUTHORIZATION = of("FINANCIAL_CREDIT_AUTHORIZATION")

                    @JvmField val INTEREST = of("INTEREST")

                    @JvmField val INTEREST_REVERSAL = of("INTEREST_REVERSAL")

                    @JvmField val INTERNAL_ADJUSTMENT = of("INTERNAL_ADJUSTMENT")

                    @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

                    @JvmField val LATE_PAYMENT_REVERSAL = of("LATE_PAYMENT_REVERSAL")

                    @JvmField val LOSS_WRITE_OFF = of("LOSS_WRITE_OFF")

                    @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

                    @JvmField val PROVISIONAL_CREDIT_REVERSAL = of("PROVISIONAL_CREDIT_REVERSAL")

                    @JvmField val SERVICE = of("SERVICE")

                    @JvmField val RETURN = of("RETURN")

                    @JvmField val RETURN_REVERSAL = of("RETURN_REVERSAL")

                    @JvmField val TRANSFER = of("TRANSFER")

                    @JvmField val TRANSFER_INSUFFICIENT_FUNDS = of("TRANSFER_INSUFFICIENT_FUNDS")

                    @JvmField val RETURNED_PAYMENT = of("RETURNED_PAYMENT")

                    @JvmField val RETURNED_PAYMENT_REVERSAL = of("RETURNED_PAYMENT_REVERSAL")

                    @JvmField val LITHIC_NETWORK_PAYMENT = of("LITHIC_NETWORK_PAYMENT")

                    @JvmStatic fun of(value: String) = FinancialEventType(JsonField.of(value))
                }

                /** An enum containing [FinancialEventType]'s known values. */
                enum class Known {
                    ACH_ORIGINATION_CANCELLED,
                    ACH_ORIGINATION_INITIATED,
                    ACH_ORIGINATION_PROCESSED,
                    ACH_ORIGINATION_RELEASED,
                    ACH_ORIGINATION_REJECTED,
                    ACH_ORIGINATION_REVIEWED,
                    ACH_ORIGINATION_SETTLED,
                    ACH_RECEIPT_PROCESSED,
                    ACH_RECEIPT_SETTLED,
                    ACH_RETURN_INITIATED,
                    ACH_RETURN_PROCESSED,
                    ACH_RETURN_REJECTED,
                    ACH_RETURN_SETTLED,
                    AUTHORIZATION,
                    AUTHORIZATION_ADVICE,
                    AUTHORIZATION_EXPIRY,
                    AUTHORIZATION_REVERSAL,
                    BALANCE_INQUIRY,
                    BILLING_ERROR,
                    BILLING_ERROR_REVERSAL,
                    CARD_TO_CARD,
                    CASH_BACK,
                    CASH_BACK_REVERSAL,
                    CLEARING,
                    COLLECTION,
                    CORRECTION_CREDIT,
                    CORRECTION_DEBIT,
                    CREDIT_AUTHORIZATION,
                    CREDIT_AUTHORIZATION_ADVICE,
                    CURRENCY_CONVERSION,
                    CURRENCY_CONVERSION_REVERSAL,
                    DISPUTE_WON,
                    EXTERNAL_ACH_CANCELED,
                    EXTERNAL_ACH_INITIATED,
                    EXTERNAL_ACH_RELEASED,
                    EXTERNAL_ACH_REVERSED,
                    EXTERNAL_ACH_SETTLED,
                    EXTERNAL_CHECK_CANCELED,
                    EXTERNAL_CHECK_INITIATED,
                    EXTERNAL_CHECK_RELEASED,
                    EXTERNAL_CHECK_REVERSED,
                    EXTERNAL_CHECK_SETTLED,
                    EXTERNAL_TRANSFER_CANCELED,
                    EXTERNAL_TRANSFER_INITIATED,
                    EXTERNAL_TRANSFER_RELEASED,
                    EXTERNAL_TRANSFER_REVERSED,
                    EXTERNAL_TRANSFER_SETTLED,
                    EXTERNAL_WIRE_CANCELED,
                    EXTERNAL_WIRE_INITIATED,
                    EXTERNAL_WIRE_RELEASED,
                    EXTERNAL_WIRE_REVERSED,
                    EXTERNAL_WIRE_SETTLED,
                    FINANCIAL_AUTHORIZATION,
                    FINANCIAL_CREDIT_AUTHORIZATION,
                    INTEREST,
                    INTEREST_REVERSAL,
                    INTERNAL_ADJUSTMENT,
                    LATE_PAYMENT,
                    LATE_PAYMENT_REVERSAL,
                    LOSS_WRITE_OFF,
                    PROVISIONAL_CREDIT,
                    PROVISIONAL_CREDIT_REVERSAL,
                    SERVICE,
                    RETURN,
                    RETURN_REVERSAL,
                    TRANSFER,
                    TRANSFER_INSUFFICIENT_FUNDS,
                    RETURNED_PAYMENT,
                    RETURNED_PAYMENT_REVERSAL,
                    LITHIC_NETWORK_PAYMENT,
                }

                /**
                 * An enum containing [FinancialEventType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [FinancialEventType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH_ORIGINATION_CANCELLED,
                    ACH_ORIGINATION_INITIATED,
                    ACH_ORIGINATION_PROCESSED,
                    ACH_ORIGINATION_RELEASED,
                    ACH_ORIGINATION_REJECTED,
                    ACH_ORIGINATION_REVIEWED,
                    ACH_ORIGINATION_SETTLED,
                    ACH_RECEIPT_PROCESSED,
                    ACH_RECEIPT_SETTLED,
                    ACH_RETURN_INITIATED,
                    ACH_RETURN_PROCESSED,
                    ACH_RETURN_REJECTED,
                    ACH_RETURN_SETTLED,
                    AUTHORIZATION,
                    AUTHORIZATION_ADVICE,
                    AUTHORIZATION_EXPIRY,
                    AUTHORIZATION_REVERSAL,
                    BALANCE_INQUIRY,
                    BILLING_ERROR,
                    BILLING_ERROR_REVERSAL,
                    CARD_TO_CARD,
                    CASH_BACK,
                    CASH_BACK_REVERSAL,
                    CLEARING,
                    COLLECTION,
                    CORRECTION_CREDIT,
                    CORRECTION_DEBIT,
                    CREDIT_AUTHORIZATION,
                    CREDIT_AUTHORIZATION_ADVICE,
                    CURRENCY_CONVERSION,
                    CURRENCY_CONVERSION_REVERSAL,
                    DISPUTE_WON,
                    EXTERNAL_ACH_CANCELED,
                    EXTERNAL_ACH_INITIATED,
                    EXTERNAL_ACH_RELEASED,
                    EXTERNAL_ACH_REVERSED,
                    EXTERNAL_ACH_SETTLED,
                    EXTERNAL_CHECK_CANCELED,
                    EXTERNAL_CHECK_INITIATED,
                    EXTERNAL_CHECK_RELEASED,
                    EXTERNAL_CHECK_REVERSED,
                    EXTERNAL_CHECK_SETTLED,
                    EXTERNAL_TRANSFER_CANCELED,
                    EXTERNAL_TRANSFER_INITIATED,
                    EXTERNAL_TRANSFER_RELEASED,
                    EXTERNAL_TRANSFER_REVERSED,
                    EXTERNAL_TRANSFER_SETTLED,
                    EXTERNAL_WIRE_CANCELED,
                    EXTERNAL_WIRE_INITIATED,
                    EXTERNAL_WIRE_RELEASED,
                    EXTERNAL_WIRE_REVERSED,
                    EXTERNAL_WIRE_SETTLED,
                    FINANCIAL_AUTHORIZATION,
                    FINANCIAL_CREDIT_AUTHORIZATION,
                    INTEREST,
                    INTEREST_REVERSAL,
                    INTERNAL_ADJUSTMENT,
                    LATE_PAYMENT,
                    LATE_PAYMENT_REVERSAL,
                    LOSS_WRITE_OFF,
                    PROVISIONAL_CREDIT,
                    PROVISIONAL_CREDIT_REVERSAL,
                    SERVICE,
                    RETURN,
                    RETURN_REVERSAL,
                    TRANSFER,
                    TRANSFER_INSUFFICIENT_FUNDS,
                    RETURNED_PAYMENT,
                    RETURNED_PAYMENT_REVERSAL,
                    LITHIC_NETWORK_PAYMENT,
                    /**
                     * An enum member indicating that [FinancialEventType] was instantiated with an
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
                        ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                        ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                        ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                        ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                        ACH_ORIGINATION_REJECTED -> Value.ACH_ORIGINATION_REJECTED
                        ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                        ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                        ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                        ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                        ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                        ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                        ACH_RETURN_REJECTED -> Value.ACH_RETURN_REJECTED
                        ACH_RETURN_SETTLED -> Value.ACH_RETURN_SETTLED
                        AUTHORIZATION -> Value.AUTHORIZATION
                        AUTHORIZATION_ADVICE -> Value.AUTHORIZATION_ADVICE
                        AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                        AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                        BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                        BILLING_ERROR -> Value.BILLING_ERROR
                        BILLING_ERROR_REVERSAL -> Value.BILLING_ERROR_REVERSAL
                        CARD_TO_CARD -> Value.CARD_TO_CARD
                        CASH_BACK -> Value.CASH_BACK
                        CASH_BACK_REVERSAL -> Value.CASH_BACK_REVERSAL
                        CLEARING -> Value.CLEARING
                        COLLECTION -> Value.COLLECTION
                        CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
                        CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                        CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                        CREDIT_AUTHORIZATION_ADVICE -> Value.CREDIT_AUTHORIZATION_ADVICE
                        CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                        CURRENCY_CONVERSION_REVERSAL -> Value.CURRENCY_CONVERSION_REVERSAL
                        DISPUTE_WON -> Value.DISPUTE_WON
                        EXTERNAL_ACH_CANCELED -> Value.EXTERNAL_ACH_CANCELED
                        EXTERNAL_ACH_INITIATED -> Value.EXTERNAL_ACH_INITIATED
                        EXTERNAL_ACH_RELEASED -> Value.EXTERNAL_ACH_RELEASED
                        EXTERNAL_ACH_REVERSED -> Value.EXTERNAL_ACH_REVERSED
                        EXTERNAL_ACH_SETTLED -> Value.EXTERNAL_ACH_SETTLED
                        EXTERNAL_CHECK_CANCELED -> Value.EXTERNAL_CHECK_CANCELED
                        EXTERNAL_CHECK_INITIATED -> Value.EXTERNAL_CHECK_INITIATED
                        EXTERNAL_CHECK_RELEASED -> Value.EXTERNAL_CHECK_RELEASED
                        EXTERNAL_CHECK_REVERSED -> Value.EXTERNAL_CHECK_REVERSED
                        EXTERNAL_CHECK_SETTLED -> Value.EXTERNAL_CHECK_SETTLED
                        EXTERNAL_TRANSFER_CANCELED -> Value.EXTERNAL_TRANSFER_CANCELED
                        EXTERNAL_TRANSFER_INITIATED -> Value.EXTERNAL_TRANSFER_INITIATED
                        EXTERNAL_TRANSFER_RELEASED -> Value.EXTERNAL_TRANSFER_RELEASED
                        EXTERNAL_TRANSFER_REVERSED -> Value.EXTERNAL_TRANSFER_REVERSED
                        EXTERNAL_TRANSFER_SETTLED -> Value.EXTERNAL_TRANSFER_SETTLED
                        EXTERNAL_WIRE_CANCELED -> Value.EXTERNAL_WIRE_CANCELED
                        EXTERNAL_WIRE_INITIATED -> Value.EXTERNAL_WIRE_INITIATED
                        EXTERNAL_WIRE_RELEASED -> Value.EXTERNAL_WIRE_RELEASED
                        EXTERNAL_WIRE_REVERSED -> Value.EXTERNAL_WIRE_REVERSED
                        EXTERNAL_WIRE_SETTLED -> Value.EXTERNAL_WIRE_SETTLED
                        FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                        FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                        INTEREST -> Value.INTEREST
                        INTEREST_REVERSAL -> Value.INTEREST_REVERSAL
                        INTERNAL_ADJUSTMENT -> Value.INTERNAL_ADJUSTMENT
                        LATE_PAYMENT -> Value.LATE_PAYMENT
                        LATE_PAYMENT_REVERSAL -> Value.LATE_PAYMENT_REVERSAL
                        LOSS_WRITE_OFF -> Value.LOSS_WRITE_OFF
                        PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                        PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                        SERVICE -> Value.SERVICE
                        RETURN -> Value.RETURN
                        RETURN_REVERSAL -> Value.RETURN_REVERSAL
                        TRANSFER -> Value.TRANSFER
                        TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                        RETURNED_PAYMENT -> Value.RETURNED_PAYMENT
                        RETURNED_PAYMENT_REVERSAL -> Value.RETURNED_PAYMENT_REVERSAL
                        LITHIC_NETWORK_PAYMENT -> Value.LITHIC_NETWORK_PAYMENT
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
                        ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                        ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                        ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                        ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                        ACH_ORIGINATION_REJECTED -> Known.ACH_ORIGINATION_REJECTED
                        ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                        ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                        ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                        ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                        ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                        ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                        ACH_RETURN_REJECTED -> Known.ACH_RETURN_REJECTED
                        ACH_RETURN_SETTLED -> Known.ACH_RETURN_SETTLED
                        AUTHORIZATION -> Known.AUTHORIZATION
                        AUTHORIZATION_ADVICE -> Known.AUTHORIZATION_ADVICE
                        AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                        AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                        BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                        BILLING_ERROR -> Known.BILLING_ERROR
                        BILLING_ERROR_REVERSAL -> Known.BILLING_ERROR_REVERSAL
                        CARD_TO_CARD -> Known.CARD_TO_CARD
                        CASH_BACK -> Known.CASH_BACK
                        CASH_BACK_REVERSAL -> Known.CASH_BACK_REVERSAL
                        CLEARING -> Known.CLEARING
                        COLLECTION -> Known.COLLECTION
                        CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
                        CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                        CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                        CREDIT_AUTHORIZATION_ADVICE -> Known.CREDIT_AUTHORIZATION_ADVICE
                        CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                        CURRENCY_CONVERSION_REVERSAL -> Known.CURRENCY_CONVERSION_REVERSAL
                        DISPUTE_WON -> Known.DISPUTE_WON
                        EXTERNAL_ACH_CANCELED -> Known.EXTERNAL_ACH_CANCELED
                        EXTERNAL_ACH_INITIATED -> Known.EXTERNAL_ACH_INITIATED
                        EXTERNAL_ACH_RELEASED -> Known.EXTERNAL_ACH_RELEASED
                        EXTERNAL_ACH_REVERSED -> Known.EXTERNAL_ACH_REVERSED
                        EXTERNAL_ACH_SETTLED -> Known.EXTERNAL_ACH_SETTLED
                        EXTERNAL_CHECK_CANCELED -> Known.EXTERNAL_CHECK_CANCELED
                        EXTERNAL_CHECK_INITIATED -> Known.EXTERNAL_CHECK_INITIATED
                        EXTERNAL_CHECK_RELEASED -> Known.EXTERNAL_CHECK_RELEASED
                        EXTERNAL_CHECK_REVERSED -> Known.EXTERNAL_CHECK_REVERSED
                        EXTERNAL_CHECK_SETTLED -> Known.EXTERNAL_CHECK_SETTLED
                        EXTERNAL_TRANSFER_CANCELED -> Known.EXTERNAL_TRANSFER_CANCELED
                        EXTERNAL_TRANSFER_INITIATED -> Known.EXTERNAL_TRANSFER_INITIATED
                        EXTERNAL_TRANSFER_RELEASED -> Known.EXTERNAL_TRANSFER_RELEASED
                        EXTERNAL_TRANSFER_REVERSED -> Known.EXTERNAL_TRANSFER_REVERSED
                        EXTERNAL_TRANSFER_SETTLED -> Known.EXTERNAL_TRANSFER_SETTLED
                        EXTERNAL_WIRE_CANCELED -> Known.EXTERNAL_WIRE_CANCELED
                        EXTERNAL_WIRE_INITIATED -> Known.EXTERNAL_WIRE_INITIATED
                        EXTERNAL_WIRE_RELEASED -> Known.EXTERNAL_WIRE_RELEASED
                        EXTERNAL_WIRE_REVERSED -> Known.EXTERNAL_WIRE_REVERSED
                        EXTERNAL_WIRE_SETTLED -> Known.EXTERNAL_WIRE_SETTLED
                        FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                        FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                        INTEREST -> Known.INTEREST
                        INTEREST_REVERSAL -> Known.INTEREST_REVERSAL
                        INTERNAL_ADJUSTMENT -> Known.INTERNAL_ADJUSTMENT
                        LATE_PAYMENT -> Known.LATE_PAYMENT
                        LATE_PAYMENT_REVERSAL -> Known.LATE_PAYMENT_REVERSAL
                        LOSS_WRITE_OFF -> Known.LOSS_WRITE_OFF
                        PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                        PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                        SERVICE -> Known.SERVICE
                        RETURN -> Known.RETURN
                        RETURN_REVERSAL -> Known.RETURN_REVERSAL
                        TRANSFER -> Known.TRANSFER
                        TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                        RETURNED_PAYMENT -> Known.RETURNED_PAYMENT
                        RETURNED_PAYMENT_REVERSAL -> Known.RETURNED_PAYMENT_REVERSAL
                        LITHIC_NETWORK_PAYMENT -> Known.LITHIC_NETWORK_PAYMENT
                        else ->
                            throw LithicInvalidDataException("Unknown FinancialEventType: $value")
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

                fun validate(): FinancialEventType = apply {
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

                    return other is FinancialEventType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FinancialEvent &&
                    token == other.token &&
                    amount == other.amount &&
                    created == other.created &&
                    result == other.result &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(token, amount, created, result, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FinancialEvent{token=$token, amount=$amount, created=$created, result=$result, type=$type, additionalProperties=$additionalProperties}"
        }

        class TransactionFamilyTypes
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

                @JvmField val CARD = of("CARD")

                @JvmField val PAYMENT = of("PAYMENT")

                @JvmField val TRANSFER = of("TRANSFER")

                @JvmField val INTERNAL = of("INTERNAL")

                @JvmField val EXTERNAL_PAYMENT = of("EXTERNAL_PAYMENT")

                @JvmField val MANAGEMENT_OPERATION = of("MANAGEMENT_OPERATION")

                @JvmStatic fun of(value: String) = TransactionFamilyTypes(JsonField.of(value))
            }

            /** An enum containing [TransactionFamilyTypes]'s known values. */
            enum class Known {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
            }

            /**
             * An enum containing [TransactionFamilyTypes]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionFamilyTypes] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
                /**
                 * An enum member indicating that [TransactionFamilyTypes] was instantiated with an
                 * unknown value.
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
                    PAYMENT -> Value.PAYMENT
                    TRANSFER -> Value.TRANSFER
                    INTERNAL -> Value.INTERNAL
                    EXTERNAL_PAYMENT -> Value.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Value.MANAGEMENT_OPERATION
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
                    PAYMENT -> Known.PAYMENT
                    TRANSFER -> Known.TRANSFER
                    INTERNAL -> Known.INTERNAL
                    EXTERNAL_PAYMENT -> Known.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Known.MANAGEMENT_OPERATION
                    else ->
                        throw LithicInvalidDataException("Unknown TransactionFamilyTypes: $value")
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

            fun validate(): TransactionFamilyTypes = apply {
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

                return other is TransactionFamilyTypes && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Transaction result */
        class TransactionResult
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

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
            }

            /** An enum containing [TransactionResult]'s known values. */
            enum class Known {
                APPROVED,
                DECLINED,
            }

            /**
             * An enum containing [TransactionResult]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionResult] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                DECLINED,
                /**
                 * An enum member indicating that [TransactionResult] was instantiated with an
                 * unknown value.
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
                    else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
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

            fun validate(): TransactionResult = apply {
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

                return other is TransactionResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of the transaction */
        class TransactionStatus
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

                @JvmField val PENDING = of("PENDING")

                @JvmField val SETTLED = of("SETTLED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val REVERSED = of("REVERSED")

                @JvmField val CANCELED = of("CANCELED")

                @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
            }

            /** An enum containing [TransactionStatus]'s known values. */
            enum class Known {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
            }

            /**
             * An enum containing [TransactionStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
                /**
                 * An enum member indicating that [TransactionStatus] was instantiated with an
                 * unknown value.
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
                    PENDING -> Value.PENDING
                    SETTLED -> Value.SETTLED
                    DECLINED -> Value.DECLINED
                    REVERSED -> Value.REVERSED
                    CANCELED -> Value.CANCELED
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
                    PENDING -> Known.PENDING
                    SETTLED -> Known.SETTLED
                    DECLINED -> Known.DECLINED
                    REVERSED -> Known.REVERSED
                    CANCELED -> Known.CANCELED
                    else -> throw LithicInvalidDataException("Unknown TransactionStatus: $value")
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

            fun validate(): TransactionStatus = apply {
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

                return other is TransactionStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FinancialTransaction &&
                token == other.token &&
                category == other.category &&
                created == other.created &&
                currency == other.currency &&
                descriptor == other.descriptor &&
                events == other.events &&
                family == other.family &&
                financialAccountToken == other.financialAccountToken &&
                pendingAmount == other.pendingAmount &&
                result == other.result &&
                settledAmount == other.settledAmount &&
                status == other.status &&
                updated == other.updated &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                category,
                created,
                currency,
                descriptor,
                events,
                family,
                financialAccountToken,
                pendingAmount,
                result,
                settledAmount,
                status,
                updated,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FinancialTransaction{token=$token, category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, family=$family, financialAccountToken=$financialAccountToken, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, updated=$updated, additionalProperties=$additionalProperties}"
    }

    /** Book transfer transaction */
    class BookTransferTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val category: JsonField<BookTransferCategory>,
        private val created: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val events: JsonField<List<BookTransferEvent>>,
        private val family: JsonField<TransactionFamilyTypes>,
        private val fromFinancialAccountToken: JsonField<String>,
        private val pendingAmount: JsonField<Long>,
        private val result: JsonField<TransactionResult>,
        private val settledAmount: JsonField<Long>,
        private val status: JsonField<TransactionStatus>,
        private val toFinancialAccountToken: JsonField<String>,
        private val updated: JsonField<OffsetDateTime>,
        private val externalId: JsonField<String>,
        private val externalResource: JsonField<ExternalResource>,
        private val transactionSeries: JsonField<TransactionSeries>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<BookTransferCategory> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<BookTransferEvent>> = JsonMissing.of(),
            @JsonProperty("family")
            @ExcludeMissing
            family: JsonField<TransactionFamilyTypes> = JsonMissing.of(),
            @JsonProperty("from_financial_account_token")
            @ExcludeMissing
            fromFinancialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pending_amount")
            @ExcludeMissing
            pendingAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<TransactionResult> = JsonMissing.of(),
            @JsonProperty("settled_amount")
            @ExcludeMissing
            settledAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<TransactionStatus> = JsonMissing.of(),
            @JsonProperty("to_financial_account_token")
            @ExcludeMissing
            toFinancialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated")
            @ExcludeMissing
            updated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_resource")
            @ExcludeMissing
            externalResource: JsonField<ExternalResource> = JsonMissing.of(),
            @JsonProperty("transaction_series")
            @ExcludeMissing
            transactionSeries: JsonField<TransactionSeries> = JsonMissing.of(),
        ) : this(
            token,
            category,
            created,
            currency,
            events,
            family,
            fromFinancialAccountToken,
            pendingAmount,
            result,
            settledAmount,
            status,
            toFinancialAccountToken,
            updated,
            externalId,
            externalResource,
            transactionSeries,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): BookTransferCategory = category.getRequired("category")

        /**
         * ISO 8601 timestamp of when the transaction was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * Currency of the transaction in ISO 4217 format
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * List of events associated with this book transfer
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun events(): List<BookTransferEvent> = events.getRequired("events")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun family(): TransactionFamilyTypes = family.getRequired("family")

        /**
         * Source account token
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fromFinancialAccountToken(): String =
            fromFinancialAccountToken.getRequired("from_financial_account_token")

        /**
         * The pending amount of the transaction in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): TransactionResult = result.getRequired("result")

        /**
         * The settled amount of the transaction in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

        /**
         * The status of the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): TransactionStatus = status.getRequired("status")

        /**
         * Destination account token
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun toFinancialAccountToken(): String =
            toFinancialAccountToken.getRequired("to_financial_account_token")

        /**
         * ISO 8601 timestamp of when the transaction was last updated
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /**
         * External identifier for the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("external_id")

        /**
         * External resource associated with the management operation
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalResource(): Optional<ExternalResource> =
            externalResource.getOptional("external_resource")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transactionSeries(): Optional<TransactionSeries> =
            transactionSeries.getOptional("transaction_series")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<BookTransferCategory> = category

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events")
        @ExcludeMissing
        fun _events(): JsonField<List<BookTransferEvent>> = events

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family")
        @ExcludeMissing
        fun _family(): JsonField<TransactionFamilyTypes> = family

        /**
         * Returns the raw JSON value of [fromFinancialAccountToken].
         *
         * Unlike [fromFinancialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("from_financial_account_token")
        @ExcludeMissing
        fun _fromFinancialAccountToken(): JsonField<String> = fromFinancialAccountToken

        /**
         * Returns the raw JSON value of [pendingAmount].
         *
         * Unlike [pendingAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun _pendingAmount(): JsonField<Long> = pendingAmount

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

        /**
         * Returns the raw JSON value of [settledAmount].
         *
         * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun _settledAmount(): JsonField<Long> = settledAmount

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TransactionStatus> = status

        /**
         * Returns the raw JSON value of [toFinancialAccountToken].
         *
         * Unlike [toFinancialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("to_financial_account_token")
        @ExcludeMissing
        fun _toFinancialAccountToken(): JsonField<String> = toFinancialAccountToken

        /**
         * Returns the raw JSON value of [updated].
         *
         * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [externalResource].
         *
         * Unlike [externalResource], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_resource")
        @ExcludeMissing
        fun _externalResource(): JsonField<ExternalResource> = externalResource

        /**
         * Returns the raw JSON value of [transactionSeries].
         *
         * Unlike [transactionSeries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_series")
        @ExcludeMissing
        fun _transactionSeries(): JsonField<TransactionSeries> = transactionSeries

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
             * Returns a mutable builder for constructing an instance of [BookTransferTransaction].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .category()
             * .created()
             * .currency()
             * .events()
             * .family()
             * .fromFinancialAccountToken()
             * .pendingAmount()
             * .result()
             * .settledAmount()
             * .status()
             * .toFinancialAccountToken()
             * .updated()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BookTransferTransaction]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var category: JsonField<BookTransferCategory>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<String>? = null
            private var events: JsonField<MutableList<BookTransferEvent>>? = null
            private var family: JsonField<TransactionFamilyTypes>? = null
            private var fromFinancialAccountToken: JsonField<String>? = null
            private var pendingAmount: JsonField<Long>? = null
            private var result: JsonField<TransactionResult>? = null
            private var settledAmount: JsonField<Long>? = null
            private var status: JsonField<TransactionStatus>? = null
            private var toFinancialAccountToken: JsonField<String>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var externalResource: JsonField<ExternalResource> = JsonMissing.of()
            private var transactionSeries: JsonField<TransactionSeries> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookTransferTransaction: BookTransferTransaction) = apply {
                token = bookTransferTransaction.token
                category = bookTransferTransaction.category
                created = bookTransferTransaction.created
                currency = bookTransferTransaction.currency
                events = bookTransferTransaction.events.map { it.toMutableList() }
                family = bookTransferTransaction.family
                fromFinancialAccountToken = bookTransferTransaction.fromFinancialAccountToken
                pendingAmount = bookTransferTransaction.pendingAmount
                result = bookTransferTransaction.result
                settledAmount = bookTransferTransaction.settledAmount
                status = bookTransferTransaction.status
                toFinancialAccountToken = bookTransferTransaction.toFinancialAccountToken
                updated = bookTransferTransaction.updated
                externalId = bookTransferTransaction.externalId
                externalResource = bookTransferTransaction.externalResource
                transactionSeries = bookTransferTransaction.transactionSeries
                additionalProperties = bookTransferTransaction.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the transaction */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun category(category: BookTransferCategory) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [BookTransferCategory]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun category(category: JsonField<BookTransferCategory>) = apply {
                this.category = category
            }

            /** ISO 8601 timestamp of when the transaction was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Currency of the transaction in ISO 4217 format */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** List of events associated with this book transfer */
            fun events(events: List<BookTransferEvent>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<BookTransferEvent>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun events(events: JsonField<List<BookTransferEvent>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [BookTransferEvent] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: BookTransferEvent) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            fun family(family: TransactionFamilyTypes) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [TransactionFamilyTypes]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun family(family: JsonField<TransactionFamilyTypes>) = apply { this.family = family }

            /** Source account token */
            fun fromFinancialAccountToken(fromFinancialAccountToken: String) =
                fromFinancialAccountToken(JsonField.of(fromFinancialAccountToken))

            /**
             * Sets [Builder.fromFinancialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromFinancialAccountToken] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun fromFinancialAccountToken(fromFinancialAccountToken: JsonField<String>) = apply {
                this.fromFinancialAccountToken = fromFinancialAccountToken
            }

            /** The pending amount of the transaction in cents */
            fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

            /**
             * Sets [Builder.pendingAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
                this.pendingAmount = pendingAmount
            }

            fun result(result: TransactionResult) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [TransactionResult] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

            /** The settled amount of the transaction in cents */
            fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

            /**
             * Sets [Builder.settledAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settledAmount(settledAmount: JsonField<Long>) = apply {
                this.settledAmount = settledAmount
            }

            /** The status of the transaction */
            fun status(status: TransactionStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [TransactionStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<TransactionStatus>) = apply { this.status = status }

            /** Destination account token */
            fun toFinancialAccountToken(toFinancialAccountToken: String) =
                toFinancialAccountToken(JsonField.of(toFinancialAccountToken))

            /**
             * Sets [Builder.toFinancialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toFinancialAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun toFinancialAccountToken(toFinancialAccountToken: JsonField<String>) = apply {
                this.toFinancialAccountToken = toFinancialAccountToken
            }

            /** ISO 8601 timestamp of when the transaction was last updated */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /**
             * Sets [Builder.updated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

            /** External identifier for the transaction */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** External resource associated with the management operation */
            fun externalResource(externalResource: ExternalResource?) =
                externalResource(JsonField.ofNullable(externalResource))

            /**
             * Alias for calling [Builder.externalResource] with `externalResource.orElse(null)`.
             */
            fun externalResource(externalResource: Optional<ExternalResource>) =
                externalResource(externalResource.getOrNull())

            /**
             * Sets [Builder.externalResource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalResource] with a well-typed
             * [ExternalResource] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun externalResource(externalResource: JsonField<ExternalResource>) = apply {
                this.externalResource = externalResource
            }

            fun transactionSeries(transactionSeries: TransactionSeries?) =
                transactionSeries(JsonField.ofNullable(transactionSeries))

            /**
             * Alias for calling [Builder.transactionSeries] with `transactionSeries.orElse(null)`.
             */
            fun transactionSeries(transactionSeries: Optional<TransactionSeries>) =
                transactionSeries(transactionSeries.getOrNull())

            /**
             * Sets [Builder.transactionSeries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionSeries] with a well-typed
             * [TransactionSeries] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun transactionSeries(transactionSeries: JsonField<TransactionSeries>) = apply {
                this.transactionSeries = transactionSeries
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
             * Returns an immutable instance of [BookTransferTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .category()
             * .created()
             * .currency()
             * .events()
             * .family()
             * .fromFinancialAccountToken()
             * .pendingAmount()
             * .result()
             * .settledAmount()
             * .status()
             * .toFinancialAccountToken()
             * .updated()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BookTransferTransaction =
                BookTransferTransaction(
                    checkRequired("token", token),
                    checkRequired("category", category),
                    checkRequired("created", created),
                    checkRequired("currency", currency),
                    checkRequired("events", events).map { it.toImmutable() },
                    checkRequired("family", family),
                    checkRequired("fromFinancialAccountToken", fromFinancialAccountToken),
                    checkRequired("pendingAmount", pendingAmount),
                    checkRequired("result", result),
                    checkRequired("settledAmount", settledAmount),
                    checkRequired("status", status),
                    checkRequired("toFinancialAccountToken", toFinancialAccountToken),
                    checkRequired("updated", updated),
                    externalId,
                    externalResource,
                    transactionSeries,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BookTransferTransaction = apply {
            if (validated) {
                return@apply
            }

            token()
            category().validate()
            created()
            currency()
            events().forEach { it.validate() }
            family().validate()
            fromFinancialAccountToken()
            pendingAmount()
            result().validate()
            settledAmount()
            status().validate()
            toFinancialAccountToken()
            updated()
            externalId()
            externalResource().ifPresent { it.validate() }
            transactionSeries().ifPresent { it.validate() }
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (family.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fromFinancialAccountToken.asKnown().isPresent) 1 else 0) +
                (if (pendingAmount.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (settledAmount.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (toFinancialAccountToken.asKnown().isPresent) 1 else 0) +
                (if (updated.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (externalResource.asKnown().getOrNull()?.validity() ?: 0) +
                (transactionSeries.asKnown().getOrNull()?.validity() ?: 0)

        class BookTransferCategory
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

                @JvmField val ADJUSTMENT = of("ADJUSTMENT")

                @JvmField val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

                @JvmField val DERECOGNITION = of("DERECOGNITION")

                @JvmField val DISPUTE = of("DISPUTE")

                @JvmField val FEE = of("FEE")

                @JvmField val INTERNAL = of("INTERNAL")

                @JvmField val REWARD = of("REWARD")

                @JvmField val PROGRAM_FUNDING = of("PROGRAM_FUNDING")

                @JvmField val TRANSFER = of("TRANSFER")

                @JvmStatic fun of(value: String) = BookTransferCategory(JsonField.of(value))
            }

            /** An enum containing [BookTransferCategory]'s known values. */
            enum class Known {
                ADJUSTMENT,
                BALANCE_OR_FUNDING,
                DERECOGNITION,
                DISPUTE,
                FEE,
                INTERNAL,
                REWARD,
                PROGRAM_FUNDING,
                TRANSFER,
            }

            /**
             * An enum containing [BookTransferCategory]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BookTransferCategory] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADJUSTMENT,
                BALANCE_OR_FUNDING,
                DERECOGNITION,
                DISPUTE,
                FEE,
                INTERNAL,
                REWARD,
                PROGRAM_FUNDING,
                TRANSFER,
                /**
                 * An enum member indicating that [BookTransferCategory] was instantiated with an
                 * unknown value.
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
                    ADJUSTMENT -> Value.ADJUSTMENT
                    BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                    DERECOGNITION -> Value.DERECOGNITION
                    DISPUTE -> Value.DISPUTE
                    FEE -> Value.FEE
                    INTERNAL -> Value.INTERNAL
                    REWARD -> Value.REWARD
                    PROGRAM_FUNDING -> Value.PROGRAM_FUNDING
                    TRANSFER -> Value.TRANSFER
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
                    ADJUSTMENT -> Known.ADJUSTMENT
                    BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                    DERECOGNITION -> Known.DERECOGNITION
                    DISPUTE -> Known.DISPUTE
                    FEE -> Known.FEE
                    INTERNAL -> Known.INTERNAL
                    REWARD -> Known.REWARD
                    PROGRAM_FUNDING -> Known.PROGRAM_FUNDING
                    TRANSFER -> Known.TRANSFER
                    else -> throw LithicInvalidDataException("Unknown BookTransferCategory: $value")
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

            fun validate(): BookTransferCategory = apply {
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

                return other is BookTransferCategory && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Book transfer Event */
        class BookTransferEvent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val token: JsonField<String>,
            private val amount: JsonField<Long>,
            private val created: JsonField<OffsetDateTime>,
            private val detailedResults: JsonField<BookTransferDetailedResults>,
            private val memo: JsonField<String>,
            private val result: JsonField<Result>,
            private val subtype: JsonField<String>,
            private val type: JsonField<BookTransferType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("created")
                @ExcludeMissing
                created: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("detailed_results")
                @ExcludeMissing
                detailedResults: JsonField<BookTransferDetailedResults> = JsonMissing.of(),
                @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("result")
                @ExcludeMissing
                result: JsonField<Result> = JsonMissing.of(),
                @JsonProperty("subtype")
                @ExcludeMissing
                subtype: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<BookTransferType> = JsonMissing.of(),
            ) : this(
                token,
                amount,
                created,
                detailedResults,
                memo,
                result,
                subtype,
                type,
                mutableMapOf(),
            )

            /**
             * Globally unique identifier.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun token(): String = token.getRequired("token")

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * Date and time when the financial event occurred. UTC time zone.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun created(): OffsetDateTime = created.getRequired("created")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun detailedResults(): BookTransferDetailedResults =
                detailedResults.getRequired("detailed_results")

            /**
             * Memo for the transfer.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun memo(): String = memo.getRequired("memo")

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun result(): Result = result.getRequired("result")

            /**
             * The program specific subtype code for the specified category/type.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subtype(): String = subtype.getRequired("subtype")

            /**
             * Type of the book transfer
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): BookTransferType = type.getRequired("type")

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [created].
             *
             * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("created")
            @ExcludeMissing
            fun _created(): JsonField<OffsetDateTime> = created

            /**
             * Returns the raw JSON value of [detailedResults].
             *
             * Unlike [detailedResults], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("detailed_results")
            @ExcludeMissing
            fun _detailedResults(): JsonField<BookTransferDetailedResults> = detailedResults

            /**
             * Returns the raw JSON value of [memo].
             *
             * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

            /**
             * Returns the raw JSON value of [result].
             *
             * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

            /**
             * Returns the raw JSON value of [subtype].
             *
             * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BookTransferType> = type

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
                 * Returns a mutable builder for constructing an instance of [BookTransferEvent].
                 *
                 * The following fields are required:
                 * ```java
                 * .token()
                 * .amount()
                 * .created()
                 * .detailedResults()
                 * .memo()
                 * .result()
                 * .subtype()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BookTransferEvent]. */
            class Builder internal constructor() {

                private var token: JsonField<String>? = null
                private var amount: JsonField<Long>? = null
                private var created: JsonField<OffsetDateTime>? = null
                private var detailedResults: JsonField<BookTransferDetailedResults>? = null
                private var memo: JsonField<String>? = null
                private var result: JsonField<Result>? = null
                private var subtype: JsonField<String>? = null
                private var type: JsonField<BookTransferType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bookTransferEvent: BookTransferEvent) = apply {
                    token = bookTransferEvent.token
                    amount = bookTransferEvent.amount
                    created = bookTransferEvent.created
                    detailedResults = bookTransferEvent.detailedResults
                    memo = bookTransferEvent.memo
                    result = bookTransferEvent.result
                    subtype = bookTransferEvent.subtype
                    type = bookTransferEvent.type
                    additionalProperties = bookTransferEvent.additionalProperties.toMutableMap()
                }

                /** Globally unique identifier. */
                fun token(token: String) = token(JsonField.of(token))

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                /**
                 * Amount of the financial event that has been settled in the currency's smallest
                 * unit (e.g., cents).
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** Date and time when the financial event occurred. UTC time zone. */
                fun created(created: OffsetDateTime) = created(JsonField.of(created))

                /**
                 * Sets [Builder.created] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.created] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

                fun detailedResults(detailedResults: BookTransferDetailedResults) =
                    detailedResults(JsonField.of(detailedResults))

                /**
                 * Sets [Builder.detailedResults] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detailedResults] with a well-typed
                 * [BookTransferDetailedResults] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun detailedResults(detailedResults: JsonField<BookTransferDetailedResults>) =
                    apply {
                        this.detailedResults = detailedResults
                    }

                /** Memo for the transfer. */
                fun memo(memo: String) = memo(JsonField.of(memo))

                /**
                 * Sets [Builder.memo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memo] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun memo(memo: JsonField<String>) = apply { this.memo = memo }

                /**
                 * APPROVED financial events were successful while DECLINED financial events were
                 * declined by user, Lithic, or the network.
                 */
                fun result(result: Result) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed [Result] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun result(result: JsonField<Result>) = apply { this.result = result }

                /** The program specific subtype code for the specified category/type. */
                fun subtype(subtype: String) = subtype(JsonField.of(subtype))

                /**
                 * Sets [Builder.subtype] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtype] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

                /** Type of the book transfer */
                fun type(type: BookTransferType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [BookTransferType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<BookTransferType>) = apply { this.type = type }

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
                 * Returns an immutable instance of [BookTransferEvent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .token()
                 * .amount()
                 * .created()
                 * .detailedResults()
                 * .memo()
                 * .result()
                 * .subtype()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BookTransferEvent =
                    BookTransferEvent(
                        checkRequired("token", token),
                        checkRequired("amount", amount),
                        checkRequired("created", created),
                        checkRequired("detailedResults", detailedResults),
                        checkRequired("memo", memo),
                        checkRequired("result", result),
                        checkRequired("subtype", subtype),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BookTransferEvent = apply {
                if (validated) {
                    return@apply
                }

                token()
                amount()
                created()
                detailedResults().validate()
                memo()
                result().validate()
                subtype()
                type().validate()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (created.asKnown().isPresent) 1 else 0) +
                    (detailedResults.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (memo.asKnown().isPresent) 1 else 0) +
                    (result.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (subtype.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class BookTransferDetailedResults
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

                    @JvmField val APPROVED = of("APPROVED")

                    @JvmField val FUNDS_INSUFFICIENT = of("FUNDS_INSUFFICIENT")

                    @JvmStatic
                    fun of(value: String) = BookTransferDetailedResults(JsonField.of(value))
                }

                /** An enum containing [BookTransferDetailedResults]'s known values. */
                enum class Known {
                    APPROVED,
                    FUNDS_INSUFFICIENT,
                }

                /**
                 * An enum containing [BookTransferDetailedResults]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [BookTransferDetailedResults] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPROVED,
                    FUNDS_INSUFFICIENT,
                    /**
                     * An enum member indicating that [BookTransferDetailedResults] was instantiated
                     * with an unknown value.
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
                        FUNDS_INSUFFICIENT -> Value.FUNDS_INSUFFICIENT
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
                        FUNDS_INSUFFICIENT -> Known.FUNDS_INSUFFICIENT
                        else ->
                            throw LithicInvalidDataException(
                                "Unknown BookTransferDetailedResults: $value"
                            )
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

                fun validate(): BookTransferDetailedResults = apply {
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

                    return other is BookTransferDetailedResults && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
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

            /** Type of the book transfer */
            class BookTransferType
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

                    @JvmField val ATM_BALANCE_INQUIRY = of("ATM_BALANCE_INQUIRY")

                    @JvmField val ATM_WITHDRAWAL = of("ATM_WITHDRAWAL")

                    @JvmField val ATM_DECLINE = of("ATM_DECLINE")

                    @JvmField val INTERNATIONAL_ATM_WITHDRAWAL = of("INTERNATIONAL_ATM_WITHDRAWAL")

                    @JvmField val INACTIVITY = of("INACTIVITY")

                    @JvmField val STATEMENT = of("STATEMENT")

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val QUARTERLY = of("QUARTERLY")

                    @JvmField val ANNUAL = of("ANNUAL")

                    @JvmField val CUSTOMER_SERVICE = of("CUSTOMER_SERVICE")

                    @JvmField val ACCOUNT_MAINTENANCE = of("ACCOUNT_MAINTENANCE")

                    @JvmField val ACCOUNT_ACTIVATION = of("ACCOUNT_ACTIVATION")

                    @JvmField val ACCOUNT_CLOSURE = of("ACCOUNT_CLOSURE")

                    @JvmField val CARD_REPLACEMENT = of("CARD_REPLACEMENT")

                    @JvmField val CARD_DELIVERY = of("CARD_DELIVERY")

                    @JvmField val CARD_CREATE = of("CARD_CREATE")

                    @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

                    @JvmField val INTEREST = of("INTEREST")

                    @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

                    @JvmField val BILL_PAYMENT = of("BILL_PAYMENT")

                    @JvmField val CASH_BACK = of("CASH_BACK")

                    @JvmField val ACCOUNT_TO_ACCOUNT = of("ACCOUNT_TO_ACCOUNT")

                    @JvmField val CARD_TO_CARD = of("CARD_TO_CARD")

                    @JvmField val DISBURSE = of("DISBURSE")

                    @JvmField val BILLING_ERROR = of("BILLING_ERROR")

                    @JvmField val LOSS_WRITE_OFF = of("LOSS_WRITE_OFF")

                    @JvmField val EXPIRED_CARD = of("EXPIRED_CARD")

                    @JvmField val EARLY_DERECOGNITION = of("EARLY_DERECOGNITION")

                    @JvmField val ESCHEATMENT = of("ESCHEATMENT")

                    @JvmField val INACTIVITY_FEE_DOWN = of("INACTIVITY_FEE_DOWN")

                    @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

                    @JvmField val DISPUTE_WON = of("DISPUTE_WON")

                    @JvmField val SERVICE = of("SERVICE")

                    @JvmField val TRANSFER = of("TRANSFER")

                    @JvmField val COLLECTION = of("COLLECTION")

                    @JvmStatic fun of(value: String) = BookTransferType(JsonField.of(value))
                }

                /** An enum containing [BookTransferType]'s known values. */
                enum class Known {
                    ATM_BALANCE_INQUIRY,
                    ATM_WITHDRAWAL,
                    ATM_DECLINE,
                    INTERNATIONAL_ATM_WITHDRAWAL,
                    INACTIVITY,
                    STATEMENT,
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    CUSTOMER_SERVICE,
                    ACCOUNT_MAINTENANCE,
                    ACCOUNT_ACTIVATION,
                    ACCOUNT_CLOSURE,
                    CARD_REPLACEMENT,
                    CARD_DELIVERY,
                    CARD_CREATE,
                    CURRENCY_CONVERSION,
                    INTEREST,
                    LATE_PAYMENT,
                    BILL_PAYMENT,
                    CASH_BACK,
                    ACCOUNT_TO_ACCOUNT,
                    CARD_TO_CARD,
                    DISBURSE,
                    BILLING_ERROR,
                    LOSS_WRITE_OFF,
                    EXPIRED_CARD,
                    EARLY_DERECOGNITION,
                    ESCHEATMENT,
                    INACTIVITY_FEE_DOWN,
                    PROVISIONAL_CREDIT,
                    DISPUTE_WON,
                    SERVICE,
                    TRANSFER,
                    COLLECTION,
                }

                /**
                 * An enum containing [BookTransferType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BookTransferType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ATM_BALANCE_INQUIRY,
                    ATM_WITHDRAWAL,
                    ATM_DECLINE,
                    INTERNATIONAL_ATM_WITHDRAWAL,
                    INACTIVITY,
                    STATEMENT,
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    CUSTOMER_SERVICE,
                    ACCOUNT_MAINTENANCE,
                    ACCOUNT_ACTIVATION,
                    ACCOUNT_CLOSURE,
                    CARD_REPLACEMENT,
                    CARD_DELIVERY,
                    CARD_CREATE,
                    CURRENCY_CONVERSION,
                    INTEREST,
                    LATE_PAYMENT,
                    BILL_PAYMENT,
                    CASH_BACK,
                    ACCOUNT_TO_ACCOUNT,
                    CARD_TO_CARD,
                    DISBURSE,
                    BILLING_ERROR,
                    LOSS_WRITE_OFF,
                    EXPIRED_CARD,
                    EARLY_DERECOGNITION,
                    ESCHEATMENT,
                    INACTIVITY_FEE_DOWN,
                    PROVISIONAL_CREDIT,
                    DISPUTE_WON,
                    SERVICE,
                    TRANSFER,
                    COLLECTION,
                    /**
                     * An enum member indicating that [BookTransferType] was instantiated with an
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
                        ATM_BALANCE_INQUIRY -> Value.ATM_BALANCE_INQUIRY
                        ATM_WITHDRAWAL -> Value.ATM_WITHDRAWAL
                        ATM_DECLINE -> Value.ATM_DECLINE
                        INTERNATIONAL_ATM_WITHDRAWAL -> Value.INTERNATIONAL_ATM_WITHDRAWAL
                        INACTIVITY -> Value.INACTIVITY
                        STATEMENT -> Value.STATEMENT
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ANNUAL -> Value.ANNUAL
                        CUSTOMER_SERVICE -> Value.CUSTOMER_SERVICE
                        ACCOUNT_MAINTENANCE -> Value.ACCOUNT_MAINTENANCE
                        ACCOUNT_ACTIVATION -> Value.ACCOUNT_ACTIVATION
                        ACCOUNT_CLOSURE -> Value.ACCOUNT_CLOSURE
                        CARD_REPLACEMENT -> Value.CARD_REPLACEMENT
                        CARD_DELIVERY -> Value.CARD_DELIVERY
                        CARD_CREATE -> Value.CARD_CREATE
                        CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                        INTEREST -> Value.INTEREST
                        LATE_PAYMENT -> Value.LATE_PAYMENT
                        BILL_PAYMENT -> Value.BILL_PAYMENT
                        CASH_BACK -> Value.CASH_BACK
                        ACCOUNT_TO_ACCOUNT -> Value.ACCOUNT_TO_ACCOUNT
                        CARD_TO_CARD -> Value.CARD_TO_CARD
                        DISBURSE -> Value.DISBURSE
                        BILLING_ERROR -> Value.BILLING_ERROR
                        LOSS_WRITE_OFF -> Value.LOSS_WRITE_OFF
                        EXPIRED_CARD -> Value.EXPIRED_CARD
                        EARLY_DERECOGNITION -> Value.EARLY_DERECOGNITION
                        ESCHEATMENT -> Value.ESCHEATMENT
                        INACTIVITY_FEE_DOWN -> Value.INACTIVITY_FEE_DOWN
                        PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                        DISPUTE_WON -> Value.DISPUTE_WON
                        SERVICE -> Value.SERVICE
                        TRANSFER -> Value.TRANSFER
                        COLLECTION -> Value.COLLECTION
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
                        ATM_BALANCE_INQUIRY -> Known.ATM_BALANCE_INQUIRY
                        ATM_WITHDRAWAL -> Known.ATM_WITHDRAWAL
                        ATM_DECLINE -> Known.ATM_DECLINE
                        INTERNATIONAL_ATM_WITHDRAWAL -> Known.INTERNATIONAL_ATM_WITHDRAWAL
                        INACTIVITY -> Known.INACTIVITY
                        STATEMENT -> Known.STATEMENT
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ANNUAL -> Known.ANNUAL
                        CUSTOMER_SERVICE -> Known.CUSTOMER_SERVICE
                        ACCOUNT_MAINTENANCE -> Known.ACCOUNT_MAINTENANCE
                        ACCOUNT_ACTIVATION -> Known.ACCOUNT_ACTIVATION
                        ACCOUNT_CLOSURE -> Known.ACCOUNT_CLOSURE
                        CARD_REPLACEMENT -> Known.CARD_REPLACEMENT
                        CARD_DELIVERY -> Known.CARD_DELIVERY
                        CARD_CREATE -> Known.CARD_CREATE
                        CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                        INTEREST -> Known.INTEREST
                        LATE_PAYMENT -> Known.LATE_PAYMENT
                        BILL_PAYMENT -> Known.BILL_PAYMENT
                        CASH_BACK -> Known.CASH_BACK
                        ACCOUNT_TO_ACCOUNT -> Known.ACCOUNT_TO_ACCOUNT
                        CARD_TO_CARD -> Known.CARD_TO_CARD
                        DISBURSE -> Known.DISBURSE
                        BILLING_ERROR -> Known.BILLING_ERROR
                        LOSS_WRITE_OFF -> Known.LOSS_WRITE_OFF
                        EXPIRED_CARD -> Known.EXPIRED_CARD
                        EARLY_DERECOGNITION -> Known.EARLY_DERECOGNITION
                        ESCHEATMENT -> Known.ESCHEATMENT
                        INACTIVITY_FEE_DOWN -> Known.INACTIVITY_FEE_DOWN
                        PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                        DISPUTE_WON -> Known.DISPUTE_WON
                        SERVICE -> Known.SERVICE
                        TRANSFER -> Known.TRANSFER
                        COLLECTION -> Known.COLLECTION
                        else -> throw LithicInvalidDataException("Unknown BookTransferType: $value")
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

                fun validate(): BookTransferType = apply {
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

                    return other is BookTransferType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BookTransferEvent &&
                    token == other.token &&
                    amount == other.amount &&
                    created == other.created &&
                    detailedResults == other.detailedResults &&
                    memo == other.memo &&
                    result == other.result &&
                    subtype == other.subtype &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    token,
                    amount,
                    created,
                    detailedResults,
                    memo,
                    result,
                    subtype,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BookTransferEvent{token=$token, amount=$amount, created=$created, detailedResults=$detailedResults, memo=$memo, result=$result, subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
        }

        class TransactionFamilyTypes
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

                @JvmField val CARD = of("CARD")

                @JvmField val PAYMENT = of("PAYMENT")

                @JvmField val TRANSFER = of("TRANSFER")

                @JvmField val INTERNAL = of("INTERNAL")

                @JvmField val EXTERNAL_PAYMENT = of("EXTERNAL_PAYMENT")

                @JvmField val MANAGEMENT_OPERATION = of("MANAGEMENT_OPERATION")

                @JvmStatic fun of(value: String) = TransactionFamilyTypes(JsonField.of(value))
            }

            /** An enum containing [TransactionFamilyTypes]'s known values. */
            enum class Known {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
            }

            /**
             * An enum containing [TransactionFamilyTypes]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionFamilyTypes] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
                /**
                 * An enum member indicating that [TransactionFamilyTypes] was instantiated with an
                 * unknown value.
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
                    PAYMENT -> Value.PAYMENT
                    TRANSFER -> Value.TRANSFER
                    INTERNAL -> Value.INTERNAL
                    EXTERNAL_PAYMENT -> Value.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Value.MANAGEMENT_OPERATION
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
                    PAYMENT -> Known.PAYMENT
                    TRANSFER -> Known.TRANSFER
                    INTERNAL -> Known.INTERNAL
                    EXTERNAL_PAYMENT -> Known.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Known.MANAGEMENT_OPERATION
                    else ->
                        throw LithicInvalidDataException("Unknown TransactionFamilyTypes: $value")
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

            fun validate(): TransactionFamilyTypes = apply {
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

                return other is TransactionFamilyTypes && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TransactionResult
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

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
            }

            /** An enum containing [TransactionResult]'s known values. */
            enum class Known {
                APPROVED,
                DECLINED,
            }

            /**
             * An enum containing [TransactionResult]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionResult] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                DECLINED,
                /**
                 * An enum member indicating that [TransactionResult] was instantiated with an
                 * unknown value.
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
                    else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
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

            fun validate(): TransactionResult = apply {
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

                return other is TransactionResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of the transaction */
        class TransactionStatus
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

                @JvmField val PENDING = of("PENDING")

                @JvmField val SETTLED = of("SETTLED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val REVERSED = of("REVERSED")

                @JvmField val CANCELED = of("CANCELED")

                @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
            }

            /** An enum containing [TransactionStatus]'s known values. */
            enum class Known {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
            }

            /**
             * An enum containing [TransactionStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
                /**
                 * An enum member indicating that [TransactionStatus] was instantiated with an
                 * unknown value.
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
                    PENDING -> Value.PENDING
                    SETTLED -> Value.SETTLED
                    DECLINED -> Value.DECLINED
                    REVERSED -> Value.REVERSED
                    CANCELED -> Value.CANCELED
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
                    PENDING -> Known.PENDING
                    SETTLED -> Known.SETTLED
                    DECLINED -> Known.DECLINED
                    REVERSED -> Known.REVERSED
                    CANCELED -> Known.CANCELED
                    else -> throw LithicInvalidDataException("Unknown TransactionStatus: $value")
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

            fun validate(): TransactionStatus = apply {
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

                return other is TransactionStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TransactionSeries
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val relatedTransactionEventToken: JsonField<String>,
            private val relatedTransactionToken: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("related_transaction_event_token")
                @ExcludeMissing
                relatedTransactionEventToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("related_transaction_token")
                @ExcludeMissing
                relatedTransactionToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(relatedTransactionEventToken, relatedTransactionToken, type, mutableMapOf())

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun relatedTransactionEventToken(): Optional<String> =
                relatedTransactionEventToken.getOptional("related_transaction_event_token")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun relatedTransactionToken(): Optional<String> =
                relatedTransactionToken.getOptional("related_transaction_token")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * Returns the raw JSON value of [relatedTransactionEventToken].
             *
             * Unlike [relatedTransactionEventToken], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("related_transaction_event_token")
            @ExcludeMissing
            fun _relatedTransactionEventToken(): JsonField<String> = relatedTransactionEventToken

            /**
             * Returns the raw JSON value of [relatedTransactionToken].
             *
             * Unlike [relatedTransactionToken], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("related_transaction_token")
            @ExcludeMissing
            fun _relatedTransactionToken(): JsonField<String> = relatedTransactionToken

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                 * Returns a mutable builder for constructing an instance of [TransactionSeries].
                 *
                 * The following fields are required:
                 * ```java
                 * .relatedTransactionEventToken()
                 * .relatedTransactionToken()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TransactionSeries]. */
            class Builder internal constructor() {

                private var relatedTransactionEventToken: JsonField<String>? = null
                private var relatedTransactionToken: JsonField<String>? = null
                private var type: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transactionSeries: TransactionSeries) = apply {
                    relatedTransactionEventToken = transactionSeries.relatedTransactionEventToken
                    relatedTransactionToken = transactionSeries.relatedTransactionToken
                    type = transactionSeries.type
                    additionalProperties = transactionSeries.additionalProperties.toMutableMap()
                }

                fun relatedTransactionEventToken(relatedTransactionEventToken: String?) =
                    relatedTransactionEventToken(JsonField.ofNullable(relatedTransactionEventToken))

                /**
                 * Alias for calling [Builder.relatedTransactionEventToken] with
                 * `relatedTransactionEventToken.orElse(null)`.
                 */
                fun relatedTransactionEventToken(relatedTransactionEventToken: Optional<String>) =
                    relatedTransactionEventToken(relatedTransactionEventToken.getOrNull())

                /**
                 * Sets [Builder.relatedTransactionEventToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.relatedTransactionEventToken] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun relatedTransactionEventToken(relatedTransactionEventToken: JsonField<String>) =
                    apply {
                        this.relatedTransactionEventToken = relatedTransactionEventToken
                    }

                fun relatedTransactionToken(relatedTransactionToken: String?) =
                    relatedTransactionToken(JsonField.ofNullable(relatedTransactionToken))

                /**
                 * Alias for calling [Builder.relatedTransactionToken] with
                 * `relatedTransactionToken.orElse(null)`.
                 */
                fun relatedTransactionToken(relatedTransactionToken: Optional<String>) =
                    relatedTransactionToken(relatedTransactionToken.getOrNull())

                /**
                 * Sets [Builder.relatedTransactionToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.relatedTransactionToken] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun relatedTransactionToken(relatedTransactionToken: JsonField<String>) = apply {
                    this.relatedTransactionToken = relatedTransactionToken
                }

                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [TransactionSeries].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .relatedTransactionEventToken()
                 * .relatedTransactionToken()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TransactionSeries =
                    TransactionSeries(
                        checkRequired("relatedTransactionEventToken", relatedTransactionEventToken),
                        checkRequired("relatedTransactionToken", relatedTransactionToken),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TransactionSeries = apply {
                if (validated) {
                    return@apply
                }

                relatedTransactionEventToken()
                relatedTransactionToken()
                type()
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
                (if (relatedTransactionEventToken.asKnown().isPresent) 1 else 0) +
                    (if (relatedTransactionToken.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TransactionSeries &&
                    relatedTransactionEventToken == other.relatedTransactionEventToken &&
                    relatedTransactionToken == other.relatedTransactionToken &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    relatedTransactionEventToken,
                    relatedTransactionToken,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionSeries{relatedTransactionEventToken=$relatedTransactionEventToken, relatedTransactionToken=$relatedTransactionToken, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BookTransferTransaction &&
                token == other.token &&
                category == other.category &&
                created == other.created &&
                currency == other.currency &&
                events == other.events &&
                family == other.family &&
                fromFinancialAccountToken == other.fromFinancialAccountToken &&
                pendingAmount == other.pendingAmount &&
                result == other.result &&
                settledAmount == other.settledAmount &&
                status == other.status &&
                toFinancialAccountToken == other.toFinancialAccountToken &&
                updated == other.updated &&
                externalId == other.externalId &&
                externalResource == other.externalResource &&
                transactionSeries == other.transactionSeries &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                category,
                created,
                currency,
                events,
                family,
                fromFinancialAccountToken,
                pendingAmount,
                result,
                settledAmount,
                status,
                toFinancialAccountToken,
                updated,
                externalId,
                externalResource,
                transactionSeries,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookTransferTransaction{token=$token, category=$category, created=$created, currency=$currency, events=$events, family=$family, fromFinancialAccountToken=$fromFinancialAccountToken, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, toFinancialAccountToken=$toFinancialAccountToken, updated=$updated, externalId=$externalId, externalResource=$externalResource, transactionSeries=$transactionSeries, additionalProperties=$additionalProperties}"
    }

    /** Base class for all transaction types in the ledger service */
    class CardTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val accountToken: JsonField<String>,
        private val acquirerFee: JsonField<Long>,
        private val acquirerReferenceNumber: JsonField<String>,
        private val amount: JsonField<Long>,
        private val amounts: JsonField<Transaction.TransactionAmounts>,
        private val authorizationAmount: JsonField<Long>,
        private val authorizationCode: JsonField<String>,
        private val avs: JsonField<Transaction.Avs>,
        private val cardToken: JsonField<String>,
        private val cardholderAuthentication: JsonField<Transaction.CardholderAuthentication>,
        private val created: JsonField<OffsetDateTime>,
        private val financialAccountToken: JsonField<String>,
        private val merchant: JsonField<Transaction.Merchant>,
        private val merchantAmount: JsonField<Long>,
        private val merchantAuthorizationAmount: JsonField<Long>,
        private val merchantCurrency: JsonField<String>,
        private val network: JsonField<Transaction.Network>,
        private val networkRiskScore: JsonField<Long>,
        private val pos: JsonField<Transaction.Pos>,
        private val result: JsonField<Transaction.DeclineResult>,
        private val settledAmount: JsonField<Long>,
        private val status: JsonField<Transaction.Status>,
        private val tokenInfo: JsonField<Transaction.TokenInfo>,
        private val updated: JsonField<OffsetDateTime>,
        private val events: JsonField<List<Transaction.TransactionEvent>>,
        private val family: JsonField<TransactionFamilyTypes>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_token")
            @ExcludeMissing
            accountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("acquirer_fee")
            @ExcludeMissing
            acquirerFee: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("acquirer_reference_number")
            @ExcludeMissing
            acquirerReferenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amounts")
            @ExcludeMissing
            amounts: JsonField<Transaction.TransactionAmounts> = JsonMissing.of(),
            @JsonProperty("authorization_amount")
            @ExcludeMissing
            authorizationAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("authorization_code")
            @ExcludeMissing
            authorizationCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avs") @ExcludeMissing avs: JsonField<Transaction.Avs> = JsonMissing.of(),
            @JsonProperty("card_token")
            @ExcludeMissing
            cardToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cardholder_authentication")
            @ExcludeMissing
            cardholderAuthentication: JsonField<Transaction.CardholderAuthentication> =
                JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            financialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant")
            @ExcludeMissing
            merchant: JsonField<Transaction.Merchant> = JsonMissing.of(),
            @JsonProperty("merchant_amount")
            @ExcludeMissing
            merchantAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("merchant_authorization_amount")
            @ExcludeMissing
            merchantAuthorizationAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("merchant_currency")
            @ExcludeMissing
            merchantCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("network")
            @ExcludeMissing
            network: JsonField<Transaction.Network> = JsonMissing.of(),
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            networkRiskScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pos") @ExcludeMissing pos: JsonField<Transaction.Pos> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<Transaction.DeclineResult> = JsonMissing.of(),
            @JsonProperty("settled_amount")
            @ExcludeMissing
            settledAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<Transaction.Status> = JsonMissing.of(),
            @JsonProperty("token_info")
            @ExcludeMissing
            tokenInfo: JsonField<Transaction.TokenInfo> = JsonMissing.of(),
            @JsonProperty("updated")
            @ExcludeMissing
            updated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<Transaction.TransactionEvent>> = JsonMissing.of(),
            @JsonProperty("family")
            @ExcludeMissing
            family: JsonField<TransactionFamilyTypes> = JsonMissing.of(),
        ) : this(
            token,
            accountToken,
            acquirerFee,
            acquirerReferenceNumber,
            amount,
            amounts,
            authorizationAmount,
            authorizationCode,
            avs,
            cardToken,
            cardholderAuthentication,
            created,
            financialAccountToken,
            merchant,
            merchantAmount,
            merchantAuthorizationAmount,
            merchantCurrency,
            network,
            networkRiskScore,
            pos,
            result,
            settledAmount,
            status,
            tokenInfo,
            updated,
            events,
            family,
            mutableMapOf(),
        )

        fun toTransaction(): Transaction =
            Transaction.builder()
                .token(token)
                .accountToken(accountToken)
                .acquirerFee(acquirerFee)
                .acquirerReferenceNumber(acquirerReferenceNumber)
                .amount(amount)
                .amounts(amounts)
                .authorizationAmount(authorizationAmount)
                .authorizationCode(authorizationCode)
                .avs(avs)
                .cardToken(cardToken)
                .cardholderAuthentication(cardholderAuthentication)
                .created(created)
                .financialAccountToken(financialAccountToken)
                .merchant(merchant)
                .merchantAmount(merchantAmount)
                .merchantAuthorizationAmount(merchantAuthorizationAmount)
                .merchantCurrency(merchantCurrency)
                .network(network)
                .networkRiskScore(networkRiskScore)
                .pos(pos)
                .result(result)
                .settledAmount(settledAmount)
                .status(status)
                .tokenInfo(tokenInfo)
                .updated(updated)
                .events(events)
                .build()

        /**
         * Globally unique identifier.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * The token for the account associated with this transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountToken(): String = accountToken.getRequired("account_token")

        /**
         * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
         * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative
         * value to indicate credited fees.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acquirerFee(): Optional<Long> = acquirerFee.getOptional("acquirer_fee")

        /**
         * Unique identifier assigned to a transaction by the acquirer that can be used in dispute
         * and chargeback filing. This field has been deprecated in favor of the
         * `acquirer_reference_number` that resides in the event-level `network_info`.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun acquirerReferenceNumber(): Optional<String> =
            acquirerReferenceNumber.getOptional("acquirer_reference_number")

        /**
         * When the transaction is pending, this represents the authorization amount of the
         * transaction in the anticipated settlement currency. Once the transaction has settled,
         * this field represents the settled amount in the settlement currency.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun amount(): Long = amount.getRequired("amount")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amounts(): Transaction.TransactionAmounts = amounts.getRequired("amounts")

        /**
         * The authorization amount of the transaction in the anticipated settlement currency.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun authorizationAmount(): Optional<Long> =
            authorizationAmount.getOptional("authorization_amount")

        /**
         * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
         * networks.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authorizationCode(): Optional<String> =
            authorizationCode.getOptional("authorization_code")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun avs(): Optional<Transaction.Avs> = avs.getOptional("avs")

        /**
         * Token for the card used in this transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardToken(): String = cardToken.getRequired("card_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cardholderAuthentication(): Optional<Transaction.CardholderAuthentication> =
            cardholderAuthentication.getOptional("cardholder_authentication")

        /**
         * Date and time when the transaction first occurred. UTC time zone.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun financialAccountToken(): Optional<String> =
            financialAccountToken.getOptional("financial_account_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchant(): Transaction.Merchant = merchant.getRequired("merchant")

        /**
         * Analogous to the 'amount', but in the merchant currency.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun merchantAmount(): Optional<Long> = merchantAmount.getOptional("merchant_amount")

        /**
         * Analogous to the 'authorization_amount', but in the merchant currency.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun merchantAuthorizationAmount(): Optional<Long> =
            merchantAuthorizationAmount.getOptional("merchant_authorization_amount")

        /**
         * 3-character alphabetic ISO 4217 code for the local currency of the transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun merchantCurrency(): String = merchantCurrency.getRequired("merchant_currency")

        /**
         * Card network of the authorization. Value is `UNKNOWN` when Lithic cannot determine the
         * network code from the upstream provider.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun network(): Optional<Transaction.Network> = network.getOptional("network")

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun networkRiskScore(): Optional<Long> = networkRiskScore.getOptional("network_risk_score")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pos(): Transaction.Pos = pos.getRequired("pos")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Transaction.DeclineResult = result.getRequired("result")

        /**
         * The settled amount of the transaction in the settlement currency.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

        /**
         * Status of the transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Transaction.Status = status.getRequired("status")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenInfo(): Optional<Transaction.TokenInfo> = tokenInfo.getOptional("token_info")

        /**
         * Date and time when the transaction last updated. UTC time zone.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun events(): Optional<List<Transaction.TransactionEvent>> = events.getOptional("events")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun family(): TransactionFamilyTypes = family.getRequired("family")

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
         * Returns the raw JSON value of [acquirerFee].
         *
         * Unlike [acquirerFee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("acquirer_fee")
        @ExcludeMissing
        fun _acquirerFee(): JsonField<Long> = acquirerFee

        /**
         * Returns the raw JSON value of [acquirerReferenceNumber].
         *
         * Unlike [acquirerReferenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("acquirer_reference_number")
        @ExcludeMissing
        fun _acquirerReferenceNumber(): JsonField<String> = acquirerReferenceNumber

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [amounts].
         *
         * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amounts")
        @ExcludeMissing
        fun _amounts(): JsonField<Transaction.TransactionAmounts> = amounts

        /**
         * Returns the raw JSON value of [authorizationAmount].
         *
         * Unlike [authorizationAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("authorization_amount")
        @ExcludeMissing
        fun _authorizationAmount(): JsonField<Long> = authorizationAmount

        /**
         * Returns the raw JSON value of [authorizationCode].
         *
         * Unlike [authorizationCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorization_code")
        @ExcludeMissing
        fun _authorizationCode(): JsonField<String> = authorizationCode

        /**
         * Returns the raw JSON value of [avs].
         *
         * Unlike [avs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avs") @ExcludeMissing fun _avs(): JsonField<Transaction.Avs> = avs

        /**
         * Returns the raw JSON value of [cardToken].
         *
         * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

        /**
         * Returns the raw JSON value of [cardholderAuthentication].
         *
         * Unlike [cardholderAuthentication], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_authentication")
        @ExcludeMissing
        fun _cardholderAuthentication(): JsonField<Transaction.CardholderAuthentication> =
            cardholderAuthentication

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

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
         * Returns the raw JSON value of [merchant].
         *
         * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("merchant")
        @ExcludeMissing
        fun _merchant(): JsonField<Transaction.Merchant> = merchant

        /**
         * Returns the raw JSON value of [merchantAmount].
         *
         * Unlike [merchantAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        fun _merchantAmount(): JsonField<Long> = merchantAmount

        /**
         * Returns the raw JSON value of [merchantAuthorizationAmount].
         *
         * Unlike [merchantAuthorizationAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("merchant_authorization_amount")
        @ExcludeMissing
        fun _merchantAuthorizationAmount(): JsonField<Long> = merchantAuthorizationAmount

        /**
         * Returns the raw JSON value of [merchantCurrency].
         *
         * Unlike [merchantCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        fun _merchantCurrency(): JsonField<String> = merchantCurrency

        /**
         * Returns the raw JSON value of [network].
         *
         * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("network")
        @ExcludeMissing
        fun _network(): JsonField<Transaction.Network> = network

        /**
         * Returns the raw JSON value of [networkRiskScore].
         *
         * Unlike [networkRiskScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        fun _networkRiskScore(): JsonField<Long> = networkRiskScore

        /**
         * Returns the raw JSON value of [pos].
         *
         * Unlike [pos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pos") @ExcludeMissing fun _pos(): JsonField<Transaction.Pos> = pos

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result")
        @ExcludeMissing
        fun _result(): JsonField<Transaction.DeclineResult> = result

        /**
         * Returns the raw JSON value of [settledAmount].
         *
         * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun _settledAmount(): JsonField<Long> = settledAmount

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<Transaction.Status> = status

        /**
         * Returns the raw JSON value of [tokenInfo].
         *
         * Unlike [tokenInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token_info")
        @ExcludeMissing
        fun _tokenInfo(): JsonField<Transaction.TokenInfo> = tokenInfo

        /**
         * Returns the raw JSON value of [updated].
         *
         * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events")
        @ExcludeMissing
        fun _events(): JsonField<List<Transaction.TransactionEvent>> = events

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family")
        @ExcludeMissing
        fun _family(): JsonField<TransactionFamilyTypes> = family

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
             * Returns a mutable builder for constructing an instance of [CardTransaction].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .accountToken()
             * .acquirerFee()
             * .acquirerReferenceNumber()
             * .amount()
             * .amounts()
             * .authorizationAmount()
             * .authorizationCode()
             * .avs()
             * .cardToken()
             * .cardholderAuthentication()
             * .created()
             * .financialAccountToken()
             * .merchant()
             * .merchantAmount()
             * .merchantAuthorizationAmount()
             * .merchantCurrency()
             * .network()
             * .networkRiskScore()
             * .pos()
             * .result()
             * .settledAmount()
             * .status()
             * .tokenInfo()
             * .updated()
             * .family()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardTransaction]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var accountToken: JsonField<String>? = null
            private var acquirerFee: JsonField<Long>? = null
            private var acquirerReferenceNumber: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var amounts: JsonField<Transaction.TransactionAmounts>? = null
            private var authorizationAmount: JsonField<Long>? = null
            private var authorizationCode: JsonField<String>? = null
            private var avs: JsonField<Transaction.Avs>? = null
            private var cardToken: JsonField<String>? = null
            private var cardholderAuthentication: JsonField<Transaction.CardholderAuthentication>? =
                null
            private var created: JsonField<OffsetDateTime>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var merchant: JsonField<Transaction.Merchant>? = null
            private var merchantAmount: JsonField<Long>? = null
            private var merchantAuthorizationAmount: JsonField<Long>? = null
            private var merchantCurrency: JsonField<String>? = null
            private var network: JsonField<Transaction.Network>? = null
            private var networkRiskScore: JsonField<Long>? = null
            private var pos: JsonField<Transaction.Pos>? = null
            private var result: JsonField<Transaction.DeclineResult>? = null
            private var settledAmount: JsonField<Long>? = null
            private var status: JsonField<Transaction.Status>? = null
            private var tokenInfo: JsonField<Transaction.TokenInfo>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var events: JsonField<MutableList<Transaction.TransactionEvent>>? = null
            private var family: JsonField<TransactionFamilyTypes>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardTransaction: CardTransaction) = apply {
                token = cardTransaction.token
                accountToken = cardTransaction.accountToken
                acquirerFee = cardTransaction.acquirerFee
                acquirerReferenceNumber = cardTransaction.acquirerReferenceNumber
                amount = cardTransaction.amount
                amounts = cardTransaction.amounts
                authorizationAmount = cardTransaction.authorizationAmount
                authorizationCode = cardTransaction.authorizationCode
                avs = cardTransaction.avs
                cardToken = cardTransaction.cardToken
                cardholderAuthentication = cardTransaction.cardholderAuthentication
                created = cardTransaction.created
                financialAccountToken = cardTransaction.financialAccountToken
                merchant = cardTransaction.merchant
                merchantAmount = cardTransaction.merchantAmount
                merchantAuthorizationAmount = cardTransaction.merchantAuthorizationAmount
                merchantCurrency = cardTransaction.merchantCurrency
                network = cardTransaction.network
                networkRiskScore = cardTransaction.networkRiskScore
                pos = cardTransaction.pos
                result = cardTransaction.result
                settledAmount = cardTransaction.settledAmount
                status = cardTransaction.status
                tokenInfo = cardTransaction.tokenInfo
                updated = cardTransaction.updated
                events = cardTransaction.events.map { it.toMutableList() }
                family = cardTransaction.family
                additionalProperties = cardTransaction.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** The token for the account associated with this transaction. */
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

            /**
             * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of
             * the currency. Will be zero if no fee is assessed. Rebates may be transmitted as a
             * negative value to indicate credited fees.
             */
            fun acquirerFee(acquirerFee: Long?) = acquirerFee(JsonField.ofNullable(acquirerFee))

            /**
             * Alias for [Builder.acquirerFee].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun acquirerFee(acquirerFee: Long) = acquirerFee(acquirerFee as Long?)

            /** Alias for calling [Builder.acquirerFee] with `acquirerFee.orElse(null)`. */
            fun acquirerFee(acquirerFee: Optional<Long>) = acquirerFee(acquirerFee.getOrNull())

            /**
             * Sets [Builder.acquirerFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acquirerFee] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acquirerFee(acquirerFee: JsonField<Long>) = apply { this.acquirerFee = acquirerFee }

            /**
             * Unique identifier assigned to a transaction by the acquirer that can be used in
             * dispute and chargeback filing. This field has been deprecated in favor of the
             * `acquirer_reference_number` that resides in the event-level `network_info`.
             */
            @Deprecated("deprecated")
            fun acquirerReferenceNumber(acquirerReferenceNumber: String?) =
                acquirerReferenceNumber(JsonField.ofNullable(acquirerReferenceNumber))

            /**
             * Alias for calling [Builder.acquirerReferenceNumber] with
             * `acquirerReferenceNumber.orElse(null)`.
             */
            @Deprecated("deprecated")
            fun acquirerReferenceNumber(acquirerReferenceNumber: Optional<String>) =
                acquirerReferenceNumber(acquirerReferenceNumber.getOrNull())

            /**
             * Sets [Builder.acquirerReferenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acquirerReferenceNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) = apply {
                this.acquirerReferenceNumber = acquirerReferenceNumber
            }

            /**
             * When the transaction is pending, this represents the authorization amount of the
             * transaction in the anticipated settlement currency. Once the transaction has settled,
             * this field represents the settled amount in the settlement currency.
             */
            @Deprecated("deprecated") fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            @Deprecated("deprecated")
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun amounts(amounts: Transaction.TransactionAmounts) = amounts(JsonField.of(amounts))

            /**
             * Sets [Builder.amounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amounts] with a well-typed
             * [Transaction.TransactionAmounts] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun amounts(amounts: JsonField<Transaction.TransactionAmounts>) = apply {
                this.amounts = amounts
            }

            /**
             * The authorization amount of the transaction in the anticipated settlement currency.
             */
            @Deprecated("deprecated")
            fun authorizationAmount(authorizationAmount: Long?) =
                authorizationAmount(JsonField.ofNullable(authorizationAmount))

            /**
             * Alias for [Builder.authorizationAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun authorizationAmount(authorizationAmount: Long) =
                authorizationAmount(authorizationAmount as Long?)

            /**
             * Alias for calling [Builder.authorizationAmount] with
             * `authorizationAmount.orElse(null)`.
             */
            @Deprecated("deprecated")
            fun authorizationAmount(authorizationAmount: Optional<Long>) =
                authorizationAmount(authorizationAmount.getOrNull())

            /**
             * Sets [Builder.authorizationAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizationAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun authorizationAmount(authorizationAmount: JsonField<Long>) = apply {
                this.authorizationAmount = authorizationAmount
            }

            /**
             * A fixed-width 6-digit numeric identifier that can be used to identify a transaction
             * with networks.
             */
            fun authorizationCode(authorizationCode: String?) =
                authorizationCode(JsonField.ofNullable(authorizationCode))

            /**
             * Alias for calling [Builder.authorizationCode] with `authorizationCode.orElse(null)`.
             */
            fun authorizationCode(authorizationCode: Optional<String>) =
                authorizationCode(authorizationCode.getOrNull())

            /**
             * Sets [Builder.authorizationCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizationCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorizationCode(authorizationCode: JsonField<String>) = apply {
                this.authorizationCode = authorizationCode
            }

            fun avs(avs: Transaction.Avs?) = avs(JsonField.ofNullable(avs))

            /** Alias for calling [Builder.avs] with `avs.orElse(null)`. */
            fun avs(avs: Optional<Transaction.Avs>) = avs(avs.getOrNull())

            /**
             * Sets [Builder.avs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avs] with a well-typed [Transaction.Avs] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avs(avs: JsonField<Transaction.Avs>) = apply { this.avs = avs }

            /** Token for the card used in this transaction. */
            fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

            /**
             * Sets [Builder.cardToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

            fun cardholderAuthentication(
                cardholderAuthentication: Transaction.CardholderAuthentication?
            ) = cardholderAuthentication(JsonField.ofNullable(cardholderAuthentication))

            /**
             * Alias for calling [Builder.cardholderAuthentication] with
             * `cardholderAuthentication.orElse(null)`.
             */
            fun cardholderAuthentication(
                cardholderAuthentication: Optional<Transaction.CardholderAuthentication>
            ) = cardholderAuthentication(cardholderAuthentication.getOrNull())

            /**
             * Sets [Builder.cardholderAuthentication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderAuthentication] with a well-typed
             * [Transaction.CardholderAuthentication] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun cardholderAuthentication(
                cardholderAuthentication: JsonField<Transaction.CardholderAuthentication>
            ) = apply { this.cardholderAuthentication = cardholderAuthentication }

            /** Date and time when the transaction first occurred. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            fun financialAccountToken(financialAccountToken: String?) =
                financialAccountToken(JsonField.ofNullable(financialAccountToken))

            /**
             * Alias for calling [Builder.financialAccountToken] with
             * `financialAccountToken.orElse(null)`.
             */
            fun financialAccountToken(financialAccountToken: Optional<String>) =
                financialAccountToken(financialAccountToken.getOrNull())

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

            fun merchant(merchant: Transaction.Merchant) = merchant(JsonField.of(merchant))

            /**
             * Sets [Builder.merchant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchant] with a well-typed [Transaction.Merchant]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun merchant(merchant: JsonField<Transaction.Merchant>) = apply {
                this.merchant = merchant
            }

            /** Analogous to the 'amount', but in the merchant currency. */
            @Deprecated("deprecated")
            fun merchantAmount(merchantAmount: Long?) =
                merchantAmount(JsonField.ofNullable(merchantAmount))

            /**
             * Alias for [Builder.merchantAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun merchantAmount(merchantAmount: Long) = merchantAmount(merchantAmount as Long?)

            /** Alias for calling [Builder.merchantAmount] with `merchantAmount.orElse(null)`. */
            @Deprecated("deprecated")
            fun merchantAmount(merchantAmount: Optional<Long>) =
                merchantAmount(merchantAmount.getOrNull())

            /**
             * Sets [Builder.merchantAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
                this.merchantAmount = merchantAmount
            }

            /** Analogous to the 'authorization_amount', but in the merchant currency. */
            @Deprecated("deprecated")
            fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long?) =
                merchantAuthorizationAmount(JsonField.ofNullable(merchantAuthorizationAmount))

            /**
             * Alias for [Builder.merchantAuthorizationAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long) =
                merchantAuthorizationAmount(merchantAuthorizationAmount as Long?)

            /**
             * Alias for calling [Builder.merchantAuthorizationAmount] with
             * `merchantAuthorizationAmount.orElse(null)`.
             */
            @Deprecated("deprecated")
            fun merchantAuthorizationAmount(merchantAuthorizationAmount: Optional<Long>) =
                merchantAuthorizationAmount(merchantAuthorizationAmount.getOrNull())

            /**
             * Sets [Builder.merchantAuthorizationAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantAuthorizationAmount] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun merchantAuthorizationAmount(merchantAuthorizationAmount: JsonField<Long>) = apply {
                this.merchantAuthorizationAmount = merchantAuthorizationAmount
            }

            /** 3-character alphabetic ISO 4217 code for the local currency of the transaction. */
            @Deprecated("deprecated")
            fun merchantCurrency(merchantCurrency: String) =
                merchantCurrency(JsonField.of(merchantCurrency))

            /**
             * Sets [Builder.merchantCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun merchantCurrency(merchantCurrency: JsonField<String>) = apply {
                this.merchantCurrency = merchantCurrency
            }

            /**
             * Card network of the authorization. Value is `UNKNOWN` when Lithic cannot determine
             * the network code from the upstream provider.
             */
            fun network(network: Transaction.Network?) = network(JsonField.ofNullable(network))

            /** Alias for calling [Builder.network] with `network.orElse(null)`. */
            fun network(network: Optional<Transaction.Network>) = network(network.getOrNull())

            /**
             * Sets [Builder.network] to an arbitrary JSON value.
             *
             * You should usually call [Builder.network] with a well-typed [Transaction.Network]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun network(network: JsonField<Transaction.Network>) = apply { this.network = network }

            /**
             * Network-provided score assessing risk level associated with a given authorization.
             * Scores are on a range of 0-999, with 0 representing the lowest risk and 999
             * representing the highest risk. For Visa transactions, where the raw score has a range
             * of 0-99, Lithic will normalize the score by multiplying the raw score by 10x.
             */
            fun networkRiskScore(networkRiskScore: Long?) =
                networkRiskScore(JsonField.ofNullable(networkRiskScore))

            /**
             * Alias for [Builder.networkRiskScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun networkRiskScore(networkRiskScore: Long) =
                networkRiskScore(networkRiskScore as Long?)

            /**
             * Alias for calling [Builder.networkRiskScore] with `networkRiskScore.orElse(null)`.
             */
            fun networkRiskScore(networkRiskScore: Optional<Long>) =
                networkRiskScore(networkRiskScore.getOrNull())

            /**
             * Sets [Builder.networkRiskScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkRiskScore] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                this.networkRiskScore = networkRiskScore
            }

            fun pos(pos: Transaction.Pos) = pos(JsonField.of(pos))

            /**
             * Sets [Builder.pos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pos] with a well-typed [Transaction.Pos] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pos(pos: JsonField<Transaction.Pos>) = apply { this.pos = pos }

            fun result(result: Transaction.DeclineResult) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed
             * [Transaction.DeclineResult] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun result(result: JsonField<Transaction.DeclineResult>) = apply {
                this.result = result
            }

            /** The settled amount of the transaction in the settlement currency. */
            @Deprecated("deprecated")
            fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

            /**
             * Sets [Builder.settledAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun settledAmount(settledAmount: JsonField<Long>) = apply {
                this.settledAmount = settledAmount
            }

            /** Status of the transaction. */
            fun status(status: Transaction.Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Transaction.Status] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Transaction.Status>) = apply { this.status = status }

            fun tokenInfo(tokenInfo: Transaction.TokenInfo?) =
                tokenInfo(JsonField.ofNullable(tokenInfo))

            /** Alias for calling [Builder.tokenInfo] with `tokenInfo.orElse(null)`. */
            fun tokenInfo(tokenInfo: Optional<Transaction.TokenInfo>) =
                tokenInfo(tokenInfo.getOrNull())

            /**
             * Sets [Builder.tokenInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenInfo] with a well-typed [Transaction.TokenInfo]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tokenInfo(tokenInfo: JsonField<Transaction.TokenInfo>) = apply {
                this.tokenInfo = tokenInfo
            }

            /** Date and time when the transaction last updated. UTC time zone. */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /**
             * Sets [Builder.updated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

            fun events(events: List<Transaction.TransactionEvent>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed
             * `List<Transaction.TransactionEvent>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun events(events: JsonField<List<Transaction.TransactionEvent>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [Transaction.TransactionEvent] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: Transaction.TransactionEvent) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            fun family(family: TransactionFamilyTypes) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [TransactionFamilyTypes]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun family(family: JsonField<TransactionFamilyTypes>) = apply { this.family = family }

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
             * Returns an immutable instance of [CardTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .accountToken()
             * .acquirerFee()
             * .acquirerReferenceNumber()
             * .amount()
             * .amounts()
             * .authorizationAmount()
             * .authorizationCode()
             * .avs()
             * .cardToken()
             * .cardholderAuthentication()
             * .created()
             * .financialAccountToken()
             * .merchant()
             * .merchantAmount()
             * .merchantAuthorizationAmount()
             * .merchantCurrency()
             * .network()
             * .networkRiskScore()
             * .pos()
             * .result()
             * .settledAmount()
             * .status()
             * .tokenInfo()
             * .updated()
             * .family()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardTransaction =
                CardTransaction(
                    checkRequired("token", token),
                    checkRequired("accountToken", accountToken),
                    checkRequired("acquirerFee", acquirerFee),
                    checkRequired("acquirerReferenceNumber", acquirerReferenceNumber),
                    checkRequired("amount", amount),
                    checkRequired("amounts", amounts),
                    checkRequired("authorizationAmount", authorizationAmount),
                    checkRequired("authorizationCode", authorizationCode),
                    checkRequired("avs", avs),
                    checkRequired("cardToken", cardToken),
                    checkRequired("cardholderAuthentication", cardholderAuthentication),
                    checkRequired("created", created),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("merchant", merchant),
                    checkRequired("merchantAmount", merchantAmount),
                    checkRequired("merchantAuthorizationAmount", merchantAuthorizationAmount),
                    checkRequired("merchantCurrency", merchantCurrency),
                    checkRequired("network", network),
                    checkRequired("networkRiskScore", networkRiskScore),
                    checkRequired("pos", pos),
                    checkRequired("result", result),
                    checkRequired("settledAmount", settledAmount),
                    checkRequired("status", status),
                    checkRequired("tokenInfo", tokenInfo),
                    checkRequired("updated", updated),
                    (events ?: JsonMissing.of()).map { it.toImmutable() },
                    checkRequired("family", family),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CardTransaction = apply {
            if (validated) {
                return@apply
            }

            token()
            accountToken()
            acquirerFee()
            acquirerReferenceNumber()
            amount()
            amounts().validate()
            authorizationAmount()
            authorizationCode()
            avs().ifPresent { it.validate() }
            cardToken()
            cardholderAuthentication().ifPresent { it.validate() }
            created()
            financialAccountToken()
            merchant().validate()
            merchantAmount()
            merchantAuthorizationAmount()
            merchantCurrency()
            network().ifPresent { it.validate() }
            networkRiskScore()
            pos().validate()
            result().validate()
            settledAmount()
            status().validate()
            tokenInfo().ifPresent { it.validate() }
            updated()
            events().ifPresent { it.forEach { it.validate() } }
            family().validate()
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
                (if (acquirerFee.asKnown().isPresent) 1 else 0) +
                (if (acquirerReferenceNumber.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (amounts.asKnown().getOrNull()?.validity() ?: 0) +
                (if (authorizationAmount.asKnown().isPresent) 1 else 0) +
                (if (authorizationCode.asKnown().isPresent) 1 else 0) +
                (avs.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cardToken.asKnown().isPresent) 1 else 0) +
                (cardholderAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
                (merchant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (merchantAmount.asKnown().isPresent) 1 else 0) +
                (if (merchantAuthorizationAmount.asKnown().isPresent) 1 else 0) +
                (if (merchantCurrency.asKnown().isPresent) 1 else 0) +
                (network.asKnown().getOrNull()?.validity() ?: 0) +
                (if (networkRiskScore.asKnown().isPresent) 1 else 0) +
                (pos.asKnown().getOrNull()?.validity() ?: 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (settledAmount.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (tokenInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updated.asKnown().isPresent) 1 else 0) +
                (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (family.asKnown().getOrNull()?.validity() ?: 0)

        class TransactionFamilyTypes
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

                @JvmField val CARD = of("CARD")

                @JvmField val PAYMENT = of("PAYMENT")

                @JvmField val TRANSFER = of("TRANSFER")

                @JvmField val INTERNAL = of("INTERNAL")

                @JvmField val EXTERNAL_PAYMENT = of("EXTERNAL_PAYMENT")

                @JvmField val MANAGEMENT_OPERATION = of("MANAGEMENT_OPERATION")

                @JvmStatic fun of(value: String) = TransactionFamilyTypes(JsonField.of(value))
            }

            /** An enum containing [TransactionFamilyTypes]'s known values. */
            enum class Known {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
            }

            /**
             * An enum containing [TransactionFamilyTypes]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionFamilyTypes] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
                /**
                 * An enum member indicating that [TransactionFamilyTypes] was instantiated with an
                 * unknown value.
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
                    PAYMENT -> Value.PAYMENT
                    TRANSFER -> Value.TRANSFER
                    INTERNAL -> Value.INTERNAL
                    EXTERNAL_PAYMENT -> Value.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Value.MANAGEMENT_OPERATION
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
                    PAYMENT -> Known.PAYMENT
                    TRANSFER -> Known.TRANSFER
                    INTERNAL -> Known.INTERNAL
                    EXTERNAL_PAYMENT -> Known.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Known.MANAGEMENT_OPERATION
                    else ->
                        throw LithicInvalidDataException("Unknown TransactionFamilyTypes: $value")
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

            fun validate(): TransactionFamilyTypes = apply {
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

                return other is TransactionFamilyTypes && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of the transaction */
        class TransactionStatus
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

                @JvmField val PENDING = of("PENDING")

                @JvmField val SETTLED = of("SETTLED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val REVERSED = of("REVERSED")

                @JvmField val CANCELED = of("CANCELED")

                @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
            }

            /** An enum containing [TransactionStatus]'s known values. */
            enum class Known {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
            }

            /**
             * An enum containing [TransactionStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
                /**
                 * An enum member indicating that [TransactionStatus] was instantiated with an
                 * unknown value.
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
                    PENDING -> Value.PENDING
                    SETTLED -> Value.SETTLED
                    DECLINED -> Value.DECLINED
                    REVERSED -> Value.REVERSED
                    CANCELED -> Value.CANCELED
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
                    PENDING -> Known.PENDING
                    SETTLED -> Known.SETTLED
                    DECLINED -> Known.DECLINED
                    REVERSED -> Known.REVERSED
                    CANCELED -> Known.CANCELED
                    else -> throw LithicInvalidDataException("Unknown TransactionStatus: $value")
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

            fun validate(): TransactionStatus = apply {
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

                return other is TransactionStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardTransaction &&
                token == other.token &&
                accountToken == other.accountToken &&
                acquirerFee == other.acquirerFee &&
                acquirerReferenceNumber == other.acquirerReferenceNumber &&
                amount == other.amount &&
                amounts == other.amounts &&
                authorizationAmount == other.authorizationAmount &&
                authorizationCode == other.authorizationCode &&
                avs == other.avs &&
                cardToken == other.cardToken &&
                cardholderAuthentication == other.cardholderAuthentication &&
                created == other.created &&
                financialAccountToken == other.financialAccountToken &&
                merchant == other.merchant &&
                merchantAmount == other.merchantAmount &&
                merchantAuthorizationAmount == other.merchantAuthorizationAmount &&
                merchantCurrency == other.merchantCurrency &&
                network == other.network &&
                networkRiskScore == other.networkRiskScore &&
                pos == other.pos &&
                result == other.result &&
                settledAmount == other.settledAmount &&
                status == other.status &&
                tokenInfo == other.tokenInfo &&
                updated == other.updated &&
                events == other.events &&
                family == other.family &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                accountToken,
                acquirerFee,
                acquirerReferenceNumber,
                amount,
                amounts,
                authorizationAmount,
                authorizationCode,
                avs,
                cardToken,
                cardholderAuthentication,
                created,
                financialAccountToken,
                merchant,
                merchantAmount,
                merchantAuthorizationAmount,
                merchantCurrency,
                network,
                networkRiskScore,
                pos,
                result,
                settledAmount,
                status,
                tokenInfo,
                updated,
                events,
                family,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardTransaction{token=$token, accountToken=$accountToken, acquirerFee=$acquirerFee, acquirerReferenceNumber=$acquirerReferenceNumber, amount=$amount, amounts=$amounts, authorizationAmount=$authorizationAmount, authorizationCode=$authorizationCode, avs=$avs, cardToken=$cardToken, cardholderAuthentication=$cardholderAuthentication, created=$created, financialAccountToken=$financialAccountToken, merchant=$merchant, merchantAmount=$merchantAmount, merchantAuthorizationAmount=$merchantAuthorizationAmount, merchantCurrency=$merchantCurrency, network=$network, networkRiskScore=$networkRiskScore, pos=$pos, result=$result, settledAmount=$settledAmount, status=$status, tokenInfo=$tokenInfo, updated=$updated, events=$events, family=$family, additionalProperties=$additionalProperties}"
    }

    /** Payment transaction */
    class PaymentTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val category: JsonField<TransactionCategory>,
        private val created: JsonField<OffsetDateTime>,
        private val descriptor: JsonField<String>,
        private val direction: JsonField<Direction>,
        private val events: JsonField<List<PaymentEvent>>,
        private val family: JsonField<TransactionFamilyTypes>,
        private val financialAccountToken: JsonField<String>,
        private val method: JsonField<Method>,
        private val methodAttributes: JsonField<MethodAttributes>,
        private val pendingAmount: JsonField<Long>,
        private val relatedAccountTokens: JsonField<RelatedAccountTokens>,
        private val result: JsonField<TransactionResult>,
        private val settledAmount: JsonField<Long>,
        private val source: JsonField<Source>,
        private val status: JsonField<TransactionStatus>,
        private val updated: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val expectedReleaseDate: JsonField<LocalDate>,
        private val externalBankAccountToken: JsonField<String>,
        private val type: JsonField<TransferType>,
        private val userDefinedId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<TransactionCategory> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("descriptor")
            @ExcludeMissing
            descriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<PaymentEvent>> = JsonMissing.of(),
            @JsonProperty("family")
            @ExcludeMissing
            family: JsonField<TransactionFamilyTypes> = JsonMissing.of(),
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            financialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("method_attributes")
            @ExcludeMissing
            methodAttributes: JsonField<MethodAttributes> = JsonMissing.of(),
            @JsonProperty("pending_amount")
            @ExcludeMissing
            pendingAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("related_account_tokens")
            @ExcludeMissing
            relatedAccountTokens: JsonField<RelatedAccountTokens> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<TransactionResult> = JsonMissing.of(),
            @JsonProperty("settled_amount")
            @ExcludeMissing
            settledAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<TransactionStatus> = JsonMissing.of(),
            @JsonProperty("updated")
            @ExcludeMissing
            updated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expected_release_date")
            @ExcludeMissing
            expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("external_bank_account_token")
            @ExcludeMissing
            externalBankAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<TransferType> = JsonMissing.of(),
            @JsonProperty("user_defined_id")
            @ExcludeMissing
            userDefinedId: JsonField<String> = JsonMissing.of(),
        ) : this(
            token,
            category,
            created,
            descriptor,
            direction,
            events,
            family,
            financialAccountToken,
            method,
            methodAttributes,
            pendingAmount,
            relatedAccountTokens,
            result,
            settledAmount,
            source,
            status,
            updated,
            currency,
            expectedReleaseDate,
            externalBankAccountToken,
            type,
            userDefinedId,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Transaction category
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): TransactionCategory = category.getRequired("category")

        /**
         * ISO 8601 timestamp of when the transaction was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * Transaction descriptor
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun descriptor(): String = descriptor.getRequired("descriptor")

        /**
         * Transfer direction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): Direction = direction.getRequired("direction")

        /**
         * List of transaction events
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun events(): List<PaymentEvent> = events.getRequired("events")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun family(): TransactionFamilyTypes = family.getRequired("family")

        /**
         * Financial account token
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /**
         * Transfer method
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun method(): Method = method.getRequired("method")

        /**
         * Method-specific attributes
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun methodAttributes(): MethodAttributes = methodAttributes.getRequired("method_attributes")

        /**
         * Pending amount in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

        /**
         * Related account tokens for the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun relatedAccountTokens(): RelatedAccountTokens =
            relatedAccountTokens.getRequired("related_account_tokens")

        /**
         * Transaction result
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): TransactionResult = result.getRequired("result")

        /**
         * Settled amount in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

        /**
         * Transaction source
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): Source = source.getRequired("source")

        /**
         * The status of the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): TransactionStatus = status.getRequired("status")

        /**
         * ISO 8601 timestamp of when the transaction was last updated
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /**
         * Currency of the transaction in ISO 4217 format
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Expected release date for the transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expectedReleaseDate(): Optional<LocalDate> =
            expectedReleaseDate.getOptional("expected_release_date")

        /**
         * External bank account token
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalBankAccountToken(): Optional<String> =
            externalBankAccountToken.getOptional("external_bank_account_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<TransferType> = type.getOptional("type")

        /**
         * User-defined identifier
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<TransactionCategory> = category

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [descriptor].
         *
         * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events")
        @ExcludeMissing
        fun _events(): JsonField<List<PaymentEvent>> = events

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family")
        @ExcludeMissing
        fun _family(): JsonField<TransactionFamilyTypes> = family

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
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

        /**
         * Returns the raw JSON value of [methodAttributes].
         *
         * Unlike [methodAttributes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("method_attributes")
        @ExcludeMissing
        fun _methodAttributes(): JsonField<MethodAttributes> = methodAttributes

        /**
         * Returns the raw JSON value of [pendingAmount].
         *
         * Unlike [pendingAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun _pendingAmount(): JsonField<Long> = pendingAmount

        /**
         * Returns the raw JSON value of [relatedAccountTokens].
         *
         * Unlike [relatedAccountTokens], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("related_account_tokens")
        @ExcludeMissing
        fun _relatedAccountTokens(): JsonField<RelatedAccountTokens> = relatedAccountTokens

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

        /**
         * Returns the raw JSON value of [settledAmount].
         *
         * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun _settledAmount(): JsonField<Long> = settledAmount

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TransactionStatus> = status

        /**
         * Returns the raw JSON value of [updated].
         *
         * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [expectedReleaseDate].
         *
         * Unlike [expectedReleaseDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("expected_release_date")
        @ExcludeMissing
        fun _expectedReleaseDate(): JsonField<LocalDate> = expectedReleaseDate

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<TransferType> = type

        /**
         * Returns the raw JSON value of [userDefinedId].
         *
         * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

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
             * Returns a mutable builder for constructing an instance of [PaymentTransaction].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .category()
             * .created()
             * .descriptor()
             * .direction()
             * .events()
             * .family()
             * .financialAccountToken()
             * .method()
             * .methodAttributes()
             * .pendingAmount()
             * .relatedAccountTokens()
             * .result()
             * .settledAmount()
             * .source()
             * .status()
             * .updated()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentTransaction]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var category: JsonField<TransactionCategory>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var descriptor: JsonField<String>? = null
            private var direction: JsonField<Direction>? = null
            private var events: JsonField<MutableList<PaymentEvent>>? = null
            private var family: JsonField<TransactionFamilyTypes>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var method: JsonField<Method>? = null
            private var methodAttributes: JsonField<MethodAttributes>? = null
            private var pendingAmount: JsonField<Long>? = null
            private var relatedAccountTokens: JsonField<RelatedAccountTokens>? = null
            private var result: JsonField<TransactionResult>? = null
            private var settledAmount: JsonField<Long>? = null
            private var source: JsonField<Source>? = null
            private var status: JsonField<TransactionStatus>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var expectedReleaseDate: JsonField<LocalDate> = JsonMissing.of()
            private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
            private var type: JsonField<TransferType> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentTransaction: PaymentTransaction) = apply {
                token = paymentTransaction.token
                category = paymentTransaction.category
                created = paymentTransaction.created
                descriptor = paymentTransaction.descriptor
                direction = paymentTransaction.direction
                events = paymentTransaction.events.map { it.toMutableList() }
                family = paymentTransaction.family
                financialAccountToken = paymentTransaction.financialAccountToken
                method = paymentTransaction.method
                methodAttributes = paymentTransaction.methodAttributes
                pendingAmount = paymentTransaction.pendingAmount
                relatedAccountTokens = paymentTransaction.relatedAccountTokens
                result = paymentTransaction.result
                settledAmount = paymentTransaction.settledAmount
                source = paymentTransaction.source
                status = paymentTransaction.status
                updated = paymentTransaction.updated
                currency = paymentTransaction.currency
                expectedReleaseDate = paymentTransaction.expectedReleaseDate
                externalBankAccountToken = paymentTransaction.externalBankAccountToken
                type = paymentTransaction.type
                userDefinedId = paymentTransaction.userDefinedId
                additionalProperties = paymentTransaction.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the transaction */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Transaction category */
            fun category(category: TransactionCategory) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [TransactionCategory]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun category(category: JsonField<TransactionCategory>) = apply {
                this.category = category
            }

            /** ISO 8601 timestamp of when the transaction was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Transaction descriptor */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /**
             * Sets [Builder.descriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.descriptor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /** Transfer direction */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** List of transaction events */
            fun events(events: List<PaymentEvent>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<PaymentEvent>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun events(events: JsonField<List<PaymentEvent>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [PaymentEvent] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: PaymentEvent) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            fun family(family: TransactionFamilyTypes) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [TransactionFamilyTypes]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun family(family: JsonField<TransactionFamilyTypes>) = apply { this.family = family }

            /** Financial account token */
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

            /** Transfer method */
            fun method(method: Method) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [Method] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<Method>) = apply { this.method = method }

            /** Method-specific attributes */
            fun methodAttributes(methodAttributes: MethodAttributes) =
                methodAttributes(JsonField.of(methodAttributes))

            /**
             * Sets [Builder.methodAttributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.methodAttributes] with a well-typed
             * [MethodAttributes] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun methodAttributes(methodAttributes: JsonField<MethodAttributes>) = apply {
                this.methodAttributes = methodAttributes
            }

            /** Alias for calling [methodAttributes] with `MethodAttributes.ofAch(ach)`. */
            fun methodAttributes(ach: MethodAttributes.AchMethodAttributes) =
                methodAttributes(MethodAttributes.ofAch(ach))

            /** Alias for calling [methodAttributes] with `MethodAttributes.ofWire(wire)`. */
            fun methodAttributes(wire: MethodAttributes.WireMethodAttributes) =
                methodAttributes(MethodAttributes.ofWire(wire))

            /** Pending amount in cents */
            fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

            /**
             * Sets [Builder.pendingAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
                this.pendingAmount = pendingAmount
            }

            /** Related account tokens for the transaction */
            fun relatedAccountTokens(relatedAccountTokens: RelatedAccountTokens) =
                relatedAccountTokens(JsonField.of(relatedAccountTokens))

            /**
             * Sets [Builder.relatedAccountTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relatedAccountTokens] with a well-typed
             * [RelatedAccountTokens] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun relatedAccountTokens(relatedAccountTokens: JsonField<RelatedAccountTokens>) =
                apply {
                    this.relatedAccountTokens = relatedAccountTokens
                }

            /** Transaction result */
            fun result(result: TransactionResult) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [TransactionResult] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

            /** Settled amount in cents */
            fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

            /**
             * Sets [Builder.settledAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settledAmount(settledAmount: JsonField<Long>) = apply {
                this.settledAmount = settledAmount
            }

            /** Transaction source */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** The status of the transaction */
            fun status(status: TransactionStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [TransactionStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<TransactionStatus>) = apply { this.status = status }

            /** ISO 8601 timestamp of when the transaction was last updated */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /**
             * Sets [Builder.updated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

            /** Currency of the transaction in ISO 4217 format */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Expected release date for the transaction */
            fun expectedReleaseDate(expectedReleaseDate: LocalDate?) =
                expectedReleaseDate(JsonField.ofNullable(expectedReleaseDate))

            /**
             * Alias for calling [Builder.expectedReleaseDate] with
             * `expectedReleaseDate.orElse(null)`.
             */
            fun expectedReleaseDate(expectedReleaseDate: Optional<LocalDate>) =
                expectedReleaseDate(expectedReleaseDate.getOrNull())

            /**
             * Sets [Builder.expectedReleaseDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedReleaseDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun expectedReleaseDate(expectedReleaseDate: JsonField<LocalDate>) = apply {
                this.expectedReleaseDate = expectedReleaseDate
            }

            /** External bank account token */
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            fun type(type: TransferType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [TransferType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<TransferType>) = apply { this.type = type }

            /** User-defined identifier */
            fun userDefinedId(userDefinedId: String?) =
                userDefinedId(JsonField.ofNullable(userDefinedId))

            /** Alias for calling [Builder.userDefinedId] with `userDefinedId.orElse(null)`. */
            fun userDefinedId(userDefinedId: Optional<String>) =
                userDefinedId(userDefinedId.getOrNull())

            /**
             * Sets [Builder.userDefinedId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userDefinedId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
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
             * Returns an immutable instance of [PaymentTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .category()
             * .created()
             * .descriptor()
             * .direction()
             * .events()
             * .family()
             * .financialAccountToken()
             * .method()
             * .methodAttributes()
             * .pendingAmount()
             * .relatedAccountTokens()
             * .result()
             * .settledAmount()
             * .source()
             * .status()
             * .updated()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentTransaction =
                PaymentTransaction(
                    checkRequired("token", token),
                    checkRequired("category", category),
                    checkRequired("created", created),
                    checkRequired("descriptor", descriptor),
                    checkRequired("direction", direction),
                    checkRequired("events", events).map { it.toImmutable() },
                    checkRequired("family", family),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("method", method),
                    checkRequired("methodAttributes", methodAttributes),
                    checkRequired("pendingAmount", pendingAmount),
                    checkRequired("relatedAccountTokens", relatedAccountTokens),
                    checkRequired("result", result),
                    checkRequired("settledAmount", settledAmount),
                    checkRequired("source", source),
                    checkRequired("status", status),
                    checkRequired("updated", updated),
                    currency,
                    expectedReleaseDate,
                    externalBankAccountToken,
                    type,
                    userDefinedId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentTransaction = apply {
            if (validated) {
                return@apply
            }

            token()
            category().validate()
            created()
            descriptor()
            direction().validate()
            events().forEach { it.validate() }
            family().validate()
            financialAccountToken()
            method().validate()
            methodAttributes().validate()
            pendingAmount()
            relatedAccountTokens().validate()
            result().validate()
            settledAmount()
            source().validate()
            status().validate()
            updated()
            currency()
            expectedReleaseDate()
            externalBankAccountToken()
            type().ifPresent { it.validate() }
            userDefinedId()
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (descriptor.asKnown().isPresent) 1 else 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (family.asKnown().getOrNull()?.validity() ?: 0) +
                (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
                (method.asKnown().getOrNull()?.validity() ?: 0) +
                (methodAttributes.asKnown().getOrNull()?.validity() ?: 0) +
                (if (pendingAmount.asKnown().isPresent) 1 else 0) +
                (relatedAccountTokens.asKnown().getOrNull()?.validity() ?: 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (settledAmount.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updated.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (expectedReleaseDate.asKnown().isPresent) 1 else 0) +
                (if (externalBankAccountToken.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userDefinedId.asKnown().isPresent) 1 else 0)

        /** Transaction category */
        class TransactionCategory
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

                @JvmField val ACH = of("ACH")

                @JvmField val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

                @JvmField val FEE = of("FEE")

                @JvmField val REWARD = of("REWARD")

                @JvmField val ADJUSTMENT = of("ADJUSTMENT")

                @JvmField val DERECOGNITION = of("DERECOGNITION")

                @JvmField val DISPUTE = of("DISPUTE")

                @JvmField val CARD = of("CARD")

                @JvmField val EXTERNAL_ACH = of("EXTERNAL_ACH")

                @JvmField val EXTERNAL_CHECK = of("EXTERNAL_CHECK")

                @JvmField val EXTERNAL_TRANSFER = of("EXTERNAL_TRANSFER")

                @JvmField val EXTERNAL_WIRE = of("EXTERNAL_WIRE")

                @JvmField val MANAGEMENT_ADJUSTMENT = of("MANAGEMENT_ADJUSTMENT")

                @JvmField val MANAGEMENT_DISPUTE = of("MANAGEMENT_DISPUTE")

                @JvmField val MANAGEMENT_FEE = of("MANAGEMENT_FEE")

                @JvmField val MANAGEMENT_REWARD = of("MANAGEMENT_REWARD")

                @JvmField val MANAGEMENT_DISBURSEMENT = of("MANAGEMENT_DISBURSEMENT")

                @JvmField val PROGRAM_FUNDING = of("PROGRAM_FUNDING")

                @JvmStatic fun of(value: String) = TransactionCategory(JsonField.of(value))
            }

            /** An enum containing [TransactionCategory]'s known values. */
            enum class Known {
                ACH,
                BALANCE_OR_FUNDING,
                FEE,
                REWARD,
                ADJUSTMENT,
                DERECOGNITION,
                DISPUTE,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
                MANAGEMENT_DISBURSEMENT,
                PROGRAM_FUNDING,
            }

            /**
             * An enum containing [TransactionCategory]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionCategory] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH,
                BALANCE_OR_FUNDING,
                FEE,
                REWARD,
                ADJUSTMENT,
                DERECOGNITION,
                DISPUTE,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
                MANAGEMENT_DISBURSEMENT,
                PROGRAM_FUNDING,
                /**
                 * An enum member indicating that [TransactionCategory] was instantiated with an
                 * unknown value.
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
                    ACH -> Value.ACH
                    BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                    FEE -> Value.FEE
                    REWARD -> Value.REWARD
                    ADJUSTMENT -> Value.ADJUSTMENT
                    DERECOGNITION -> Value.DERECOGNITION
                    DISPUTE -> Value.DISPUTE
                    CARD -> Value.CARD
                    EXTERNAL_ACH -> Value.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                    MANAGEMENT_DISBURSEMENT -> Value.MANAGEMENT_DISBURSEMENT
                    PROGRAM_FUNDING -> Value.PROGRAM_FUNDING
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
                    ACH -> Known.ACH
                    BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                    FEE -> Known.FEE
                    REWARD -> Known.REWARD
                    ADJUSTMENT -> Known.ADJUSTMENT
                    DERECOGNITION -> Known.DERECOGNITION
                    DISPUTE -> Known.DISPUTE
                    CARD -> Known.CARD
                    EXTERNAL_ACH -> Known.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                    MANAGEMENT_DISBURSEMENT -> Known.MANAGEMENT_DISBURSEMENT
                    PROGRAM_FUNDING -> Known.PROGRAM_FUNDING
                    else -> throw LithicInvalidDataException("Unknown TransactionCategory: $value")
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

            fun validate(): TransactionCategory = apply {
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

                return other is TransactionCategory && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Transfer direction */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CREDIT = of("CREDIT")

                @JvmField val DEBIT = of("DEBIT")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                CREDIT,
                DEBIT,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREDIT,
                DEBIT,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
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
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CREDIT -> Known.CREDIT
                    DEBIT -> Known.DEBIT
                    else -> throw LithicInvalidDataException("Unknown Direction: $value")
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

            fun validate(): Direction = apply {
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

                return other is Direction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Payment Event */
        class PaymentEvent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val token: JsonField<String>,
            private val amount: JsonField<Long>,
            private val created: JsonField<OffsetDateTime>,
            private val result: JsonField<Result>,
            private val type: JsonField<Type>,
            private val detailedResults: JsonField<List<DetailedResult>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("created")
                @ExcludeMissing
                created: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("result")
                @ExcludeMissing
                result: JsonField<Result> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("detailed_results")
                @ExcludeMissing
                detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
            ) : this(token, amount, created, result, type, detailedResults, mutableMapOf())

            /**
             * Globally unique identifier.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun token(): String = token.getRequired("token")

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * Date and time when the financial event occurred. UTC time zone.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun created(): OffsetDateTime = created.getRequired("created")

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun result(): Result = result.getRequired("result")

            /**
             * Event types:
             * * `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * * `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * * `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * * `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   Federal Reserve.
             * * `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * * `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * * `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * * `ACH_RETURN_SETTLED` - ACH receipt return settled by the Receiving Depository
             *   Financial Institution.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * More detailed reasons for the event
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detailedResults(): Optional<List<DetailedResult>> =
                detailedResults.getOptional("detailed_results")

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [created].
             *
             * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("created")
            @ExcludeMissing
            fun _created(): JsonField<OffsetDateTime> = created

            /**
             * Returns the raw JSON value of [result].
             *
             * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [detailedResults].
             *
             * Unlike [detailedResults], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("detailed_results")
            @ExcludeMissing
            fun _detailedResults(): JsonField<List<DetailedResult>> = detailedResults

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
                 * Returns a mutable builder for constructing an instance of [PaymentEvent].
                 *
                 * The following fields are required:
                 * ```java
                 * .token()
                 * .amount()
                 * .created()
                 * .result()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PaymentEvent]. */
            class Builder internal constructor() {

                private var token: JsonField<String>? = null
                private var amount: JsonField<Long>? = null
                private var created: JsonField<OffsetDateTime>? = null
                private var result: JsonField<Result>? = null
                private var type: JsonField<Type>? = null
                private var detailedResults: JsonField<MutableList<DetailedResult>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentEvent: PaymentEvent) = apply {
                    token = paymentEvent.token
                    amount = paymentEvent.amount
                    created = paymentEvent.created
                    result = paymentEvent.result
                    type = paymentEvent.type
                    detailedResults = paymentEvent.detailedResults.map { it.toMutableList() }
                    additionalProperties = paymentEvent.additionalProperties.toMutableMap()
                }

                /** Globally unique identifier. */
                fun token(token: String) = token(JsonField.of(token))

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                /**
                 * Amount of the financial event that has been settled in the currency's smallest
                 * unit (e.g., cents).
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** Date and time when the financial event occurred. UTC time zone. */
                fun created(created: OffsetDateTime) = created(JsonField.of(created))

                /**
                 * Sets [Builder.created] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.created] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

                /**
                 * APPROVED financial events were successful while DECLINED financial events were
                 * declined by user, Lithic, or the network.
                 */
                fun result(result: Result) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed [Result] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun result(result: JsonField<Result>) = apply { this.result = result }

                /**
                 * Event types:
                 * * `ACH_ORIGINATION_INITIATED` - ACH origination received and pending
                 *   approval/release from an ACH hold.
                 * * `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
                 * * `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
                 * * `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to
                 *   the Federal Reserve.
                 * * `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
                 * * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
                 *   balance.
                 * * `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
                 *   Financial Institution.
                 * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
                 * * `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
                 * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
                 * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available
                 *   balance.
                 * * `ACH_RETURN_SETTLED` - ACH receipt return settled by the Receiving Depository
                 *   Financial Institution.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** More detailed reasons for the event */
                fun detailedResults(detailedResults: List<DetailedResult>) =
                    detailedResults(JsonField.of(detailedResults))

                /**
                 * Sets [Builder.detailedResults] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detailedResults] with a well-typed
                 * `List<DetailedResult>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                    this.detailedResults = detailedResults.map { it.toMutableList() }
                }

                /**
                 * Adds a single [DetailedResult] to [detailedResults].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDetailedResult(detailedResult: DetailedResult) = apply {
                    detailedResults =
                        (detailedResults ?: JsonField.of(mutableListOf())).also {
                            checkKnown("detailedResults", it).add(detailedResult)
                        }
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
                 * Returns an immutable instance of [PaymentEvent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .token()
                 * .amount()
                 * .created()
                 * .result()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PaymentEvent =
                    PaymentEvent(
                        checkRequired("token", token),
                        checkRequired("amount", amount),
                        checkRequired("created", created),
                        checkRequired("result", result),
                        checkRequired("type", type),
                        (detailedResults ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentEvent = apply {
                if (validated) {
                    return@apply
                }

                token()
                amount()
                created()
                result().validate()
                type().validate()
                detailedResults().ifPresent { it.forEach { it.validate() } }
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (created.asKnown().isPresent) 1 else 0) +
                    (result.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (detailedResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
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

            /**
             * Event types:
             * * `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * * `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * * `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * * `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   Federal Reserve.
             * * `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * * `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * * `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * * `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * * `ACH_RETURN_SETTLED` - ACH receipt return settled by the Receiving Depository
             *   Financial Institution.
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val ACH_ORIGINATION_CANCELLED = of("ACH_ORIGINATION_CANCELLED")

                    @JvmField val ACH_ORIGINATION_INITIATED = of("ACH_ORIGINATION_INITIATED")

                    @JvmField val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

                    @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                    @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                    @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                    @JvmField val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                    @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                    @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                    @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

                    @JvmField val ACH_RETURN_SETTLED = of("ACH_RETURN_SETTLED")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ACH_ORIGINATION_CANCELLED,
                    ACH_ORIGINATION_INITIATED,
                    ACH_ORIGINATION_PROCESSED,
                    ACH_ORIGINATION_SETTLED,
                    ACH_ORIGINATION_RELEASED,
                    ACH_ORIGINATION_REVIEWED,
                    ACH_RECEIPT_PROCESSED,
                    ACH_RECEIPT_SETTLED,
                    ACH_RETURN_INITIATED,
                    ACH_RETURN_PROCESSED,
                    ACH_RETURN_SETTLED,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH_ORIGINATION_CANCELLED,
                    ACH_ORIGINATION_INITIATED,
                    ACH_ORIGINATION_PROCESSED,
                    ACH_ORIGINATION_SETTLED,
                    ACH_ORIGINATION_RELEASED,
                    ACH_ORIGINATION_REVIEWED,
                    ACH_RECEIPT_PROCESSED,
                    ACH_RECEIPT_SETTLED,
                    ACH_RETURN_INITIATED,
                    ACH_RETURN_PROCESSED,
                    ACH_RETURN_SETTLED,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                        ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                        ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                        ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                        ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                        ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                        ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                        ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                        ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                        ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                        ACH_RETURN_SETTLED -> Value.ACH_RETURN_SETTLED
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
                        ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                        ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                        ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                        ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                        ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                        ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                        ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                        ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                        ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                        ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                        ACH_RETURN_SETTLED -> Known.ACH_RETURN_SETTLED
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            class DetailedResult
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

                    @JvmField val APPROVED = of("APPROVED")

                    @JvmField val FUNDS_INSUFFICIENT = of("FUNDS_INSUFFICIENT")

                    @JvmField val ACCOUNT_INVALID = of("ACCOUNT_INVALID")

                    @JvmField
                    val PROGRAM_TRANSACTION_LIMIT_EXCEEDED =
                        of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED")

                    @JvmField val PROGRAM_DAILY_LIMIT_EXCEEDED = of("PROGRAM_DAILY_LIMIT_EXCEEDED")

                    @JvmField
                    val PROGRAM_MONTHLY_LIMIT_EXCEEDED = of("PROGRAM_MONTHLY_LIMIT_EXCEEDED")

                    @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
                }

                /** An enum containing [DetailedResult]'s known values. */
                enum class Known {
                    APPROVED,
                    FUNDS_INSUFFICIENT,
                    ACCOUNT_INVALID,
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                    PROGRAM_DAILY_LIMIT_EXCEEDED,
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED,
                }

                /**
                 * An enum containing [DetailedResult]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DetailedResult] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPROVED,
                    FUNDS_INSUFFICIENT,
                    ACCOUNT_INVALID,
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                    PROGRAM_DAILY_LIMIT_EXCEEDED,
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED,
                    /**
                     * An enum member indicating that [DetailedResult] was instantiated with an
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
                        APPROVED -> Value.APPROVED
                        FUNDS_INSUFFICIENT -> Value.FUNDS_INSUFFICIENT
                        ACCOUNT_INVALID -> Value.ACCOUNT_INVALID
                        PROGRAM_TRANSACTION_LIMIT_EXCEEDED ->
                            Value.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                        PROGRAM_DAILY_LIMIT_EXCEEDED -> Value.PROGRAM_DAILY_LIMIT_EXCEEDED
                        PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMIT_EXCEEDED
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
                        FUNDS_INSUFFICIENT -> Known.FUNDS_INSUFFICIENT
                        ACCOUNT_INVALID -> Known.ACCOUNT_INVALID
                        PROGRAM_TRANSACTION_LIMIT_EXCEEDED ->
                            Known.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                        PROGRAM_DAILY_LIMIT_EXCEEDED -> Known.PROGRAM_DAILY_LIMIT_EXCEEDED
                        PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                        else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
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

                fun validate(): DetailedResult = apply {
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

                    return other is DetailedResult && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentEvent &&
                    token == other.token &&
                    amount == other.amount &&
                    created == other.created &&
                    result == other.result &&
                    type == other.type &&
                    detailedResults == other.detailedResults &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    token,
                    amount,
                    created,
                    result,
                    type,
                    detailedResults,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentEvent{token=$token, amount=$amount, created=$created, result=$result, type=$type, detailedResults=$detailedResults, additionalProperties=$additionalProperties}"
        }

        class TransactionFamilyTypes
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

                @JvmField val CARD = of("CARD")

                @JvmField val PAYMENT = of("PAYMENT")

                @JvmField val TRANSFER = of("TRANSFER")

                @JvmField val INTERNAL = of("INTERNAL")

                @JvmField val EXTERNAL_PAYMENT = of("EXTERNAL_PAYMENT")

                @JvmField val MANAGEMENT_OPERATION = of("MANAGEMENT_OPERATION")

                @JvmStatic fun of(value: String) = TransactionFamilyTypes(JsonField.of(value))
            }

            /** An enum containing [TransactionFamilyTypes]'s known values. */
            enum class Known {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
            }

            /**
             * An enum containing [TransactionFamilyTypes]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionFamilyTypes] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                PAYMENT,
                TRANSFER,
                INTERNAL,
                EXTERNAL_PAYMENT,
                MANAGEMENT_OPERATION,
                /**
                 * An enum member indicating that [TransactionFamilyTypes] was instantiated with an
                 * unknown value.
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
                    PAYMENT -> Value.PAYMENT
                    TRANSFER -> Value.TRANSFER
                    INTERNAL -> Value.INTERNAL
                    EXTERNAL_PAYMENT -> Value.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Value.MANAGEMENT_OPERATION
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
                    PAYMENT -> Known.PAYMENT
                    TRANSFER -> Known.TRANSFER
                    INTERNAL -> Known.INTERNAL
                    EXTERNAL_PAYMENT -> Known.EXTERNAL_PAYMENT
                    MANAGEMENT_OPERATION -> Known.MANAGEMENT_OPERATION
                    else ->
                        throw LithicInvalidDataException("Unknown TransactionFamilyTypes: $value")
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

            fun validate(): TransactionFamilyTypes = apply {
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

                return other is TransactionFamilyTypes && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Transfer method */
        class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACH_NEXT_DAY = of("ACH_NEXT_DAY")

                @JvmField val ACH_SAME_DAY = of("ACH_SAME_DAY")

                @JvmField val WIRE = of("WIRE")

                @JvmStatic fun of(value: String) = Method(JsonField.of(value))
            }

            /** An enum containing [Method]'s known values. */
            enum class Known {
                ACH_NEXT_DAY,
                ACH_SAME_DAY,
                WIRE,
            }

            /**
             * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Method] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH_NEXT_DAY,
                ACH_SAME_DAY,
                WIRE,
                /**
                 * An enum member indicating that [Method] was instantiated with an unknown value.
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
                    ACH_NEXT_DAY -> Value.ACH_NEXT_DAY
                    ACH_SAME_DAY -> Value.ACH_SAME_DAY
                    WIRE -> Value.WIRE
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
                    ACH_NEXT_DAY -> Known.ACH_NEXT_DAY
                    ACH_SAME_DAY -> Known.ACH_SAME_DAY
                    WIRE -> Known.WIRE
                    else -> throw LithicInvalidDataException("Unknown Method: $value")
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

            fun validate(): Method = apply {
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

                return other is Method && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Method-specific attributes */
        @JsonDeserialize(using = MethodAttributes.Deserializer::class)
        @JsonSerialize(using = MethodAttributes.Serializer::class)
        class MethodAttributes
        private constructor(
            private val ach: AchMethodAttributes? = null,
            private val wire: WireMethodAttributes? = null,
            private val _json: JsonValue? = null,
        ) {

            fun ach(): Optional<AchMethodAttributes> = Optional.ofNullable(ach)

            fun wire(): Optional<WireMethodAttributes> = Optional.ofNullable(wire)

            fun isAch(): Boolean = ach != null

            fun isWire(): Boolean = wire != null

            fun asAch(): AchMethodAttributes = ach.getOrThrow("ach")

            fun asWire(): WireMethodAttributes = wire.getOrThrow("wire")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    ach != null -> visitor.visitAch(ach)
                    wire != null -> visitor.visitWire(wire)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): MethodAttributes = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitAch(ach: AchMethodAttributes) {
                            ach.validate()
                        }

                        override fun visitWire(wire: WireMethodAttributes) {
                            wire.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitAch(ach: AchMethodAttributes) = ach.validity()

                        override fun visitWire(wire: WireMethodAttributes) = wire.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MethodAttributes && ach == other.ach && wire == other.wire
            }

            override fun hashCode(): Int = Objects.hash(ach, wire)

            override fun toString(): String =
                when {
                    ach != null -> "MethodAttributes{ach=$ach}"
                    wire != null -> "MethodAttributes{wire=$wire}"
                    _json != null -> "MethodAttributes{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid MethodAttributes")
                }

            companion object {

                @JvmStatic fun ofAch(ach: AchMethodAttributes) = MethodAttributes(ach = ach)

                @JvmStatic fun ofWire(wire: WireMethodAttributes) = MethodAttributes(wire = wire)
            }

            /**
             * An interface that defines how to map each variant of [MethodAttributes] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitAch(ach: AchMethodAttributes): T

                fun visitWire(wire: WireMethodAttributes): T

                /**
                 * Maps an unknown variant of [MethodAttributes] to a value of type [T].
                 *
                 * An instance of [MethodAttributes] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LithicInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown MethodAttributes: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<MethodAttributes>(MethodAttributes::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): MethodAttributes {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<AchMethodAttributes>())?.let {
                                    MethodAttributes(ach = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<WireMethodAttributes>())?.let {
                                    MethodAttributes(wire = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> MethodAttributes(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<MethodAttributes>(MethodAttributes::class) {

                override fun serialize(
                    value: MethodAttributes,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.ach != null -> generator.writeObject(value.ach)
                        value.wire != null -> generator.writeObject(value.wire)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid MethodAttributes")
                    }
                }
            }

            class AchMethodAttributes
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val secCode: JsonField<SecCode>,
                private val addenda: JsonField<String>,
                private val companyId: JsonField<String>,
                private val receiptRoutingNumber: JsonField<String>,
                private val retries: JsonField<Long>,
                private val returnReasonCode: JsonField<String>,
                private val traceNumbers: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("sec_code")
                    @ExcludeMissing
                    secCode: JsonField<SecCode> = JsonMissing.of(),
                    @JsonProperty("addenda")
                    @ExcludeMissing
                    addenda: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("company_id")
                    @ExcludeMissing
                    companyId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("receipt_routing_number")
                    @ExcludeMissing
                    receiptRoutingNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("retries")
                    @ExcludeMissing
                    retries: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("return_reason_code")
                    @ExcludeMissing
                    returnReasonCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("trace_numbers")
                    @ExcludeMissing
                    traceNumbers: JsonField<List<String>> = JsonMissing.of(),
                ) : this(
                    secCode,
                    addenda,
                    companyId,
                    receiptRoutingNumber,
                    retries,
                    returnReasonCode,
                    traceNumbers,
                    mutableMapOf(),
                )

                /**
                 * SEC code for ACH transaction
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun secCode(): SecCode = secCode.getRequired("sec_code")

                /**
                 * Addenda information
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun addenda(): Optional<String> = addenda.getOptional("addenda")

                /**
                 * Company ID for the ACH transaction
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun companyId(): Optional<String> = companyId.getOptional("company_id")

                /**
                 * Receipt routing number
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun receiptRoutingNumber(): Optional<String> =
                    receiptRoutingNumber.getOptional("receipt_routing_number")

                /**
                 * Number of retries attempted
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun retries(): Optional<Long> = retries.getOptional("retries")

                /**
                 * Return reason code if the transaction was returned
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun returnReasonCode(): Optional<String> =
                    returnReasonCode.getOptional("return_reason_code")

                /**
                 * Trace numbers for the ACH transaction
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun traceNumbers(): Optional<List<String>> =
                    traceNumbers.getOptional("trace_numbers")

                /**
                 * Returns the raw JSON value of [secCode].
                 *
                 * Unlike [secCode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sec_code")
                @ExcludeMissing
                fun _secCode(): JsonField<SecCode> = secCode

                /**
                 * Returns the raw JSON value of [addenda].
                 *
                 * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<String> = addenda

                /**
                 * Returns the raw JSON value of [companyId].
                 *
                 * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("company_id")
                @ExcludeMissing
                fun _companyId(): JsonField<String> = companyId

                /**
                 * Returns the raw JSON value of [receiptRoutingNumber].
                 *
                 * Unlike [receiptRoutingNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("receipt_routing_number")
                @ExcludeMissing
                fun _receiptRoutingNumber(): JsonField<String> = receiptRoutingNumber

                /**
                 * Returns the raw JSON value of [retries].
                 *
                 * Unlike [retries], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("retries") @ExcludeMissing fun _retries(): JsonField<Long> = retries

                /**
                 * Returns the raw JSON value of [returnReasonCode].
                 *
                 * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("return_reason_code")
                @ExcludeMissing
                fun _returnReasonCode(): JsonField<String> = returnReasonCode

                /**
                 * Returns the raw JSON value of [traceNumbers].
                 *
                 * Unlike [traceNumbers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("trace_numbers")
                @ExcludeMissing
                fun _traceNumbers(): JsonField<List<String>> = traceNumbers

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
                     * [AchMethodAttributes].
                     *
                     * The following fields are required:
                     * ```java
                     * .secCode()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AchMethodAttributes]. */
                class Builder internal constructor() {

                    private var secCode: JsonField<SecCode>? = null
                    private var addenda: JsonField<String> = JsonMissing.of()
                    private var companyId: JsonField<String> = JsonMissing.of()
                    private var receiptRoutingNumber: JsonField<String> = JsonMissing.of()
                    private var retries: JsonField<Long> = JsonMissing.of()
                    private var returnReasonCode: JsonField<String> = JsonMissing.of()
                    private var traceNumbers: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(achMethodAttributes: AchMethodAttributes) = apply {
                        secCode = achMethodAttributes.secCode
                        addenda = achMethodAttributes.addenda
                        companyId = achMethodAttributes.companyId
                        receiptRoutingNumber = achMethodAttributes.receiptRoutingNumber
                        retries = achMethodAttributes.retries
                        returnReasonCode = achMethodAttributes.returnReasonCode
                        traceNumbers = achMethodAttributes.traceNumbers.map { it.toMutableList() }
                        additionalProperties =
                            achMethodAttributes.additionalProperties.toMutableMap()
                    }

                    /** SEC code for ACH transaction */
                    fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

                    /**
                     * Sets [Builder.secCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secCode] with a well-typed [SecCode] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

                    /** Addenda information */
                    fun addenda(addenda: String?) = addenda(JsonField.ofNullable(addenda))

                    /** Alias for calling [Builder.addenda] with `addenda.orElse(null)`. */
                    fun addenda(addenda: Optional<String>) = addenda(addenda.getOrNull())

                    /**
                     * Sets [Builder.addenda] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.addenda] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun addenda(addenda: JsonField<String>) = apply { this.addenda = addenda }

                    /** Company ID for the ACH transaction */
                    fun companyId(companyId: String?) = companyId(JsonField.ofNullable(companyId))

                    /** Alias for calling [Builder.companyId] with `companyId.orElse(null)`. */
                    fun companyId(companyId: Optional<String>) = companyId(companyId.getOrNull())

                    /**
                     * Sets [Builder.companyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.companyId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun companyId(companyId: JsonField<String>) = apply {
                        this.companyId = companyId
                    }

                    /** Receipt routing number */
                    fun receiptRoutingNumber(receiptRoutingNumber: String?) =
                        receiptRoutingNumber(JsonField.ofNullable(receiptRoutingNumber))

                    /**
                     * Alias for calling [Builder.receiptRoutingNumber] with
                     * `receiptRoutingNumber.orElse(null)`.
                     */
                    fun receiptRoutingNumber(receiptRoutingNumber: Optional<String>) =
                        receiptRoutingNumber(receiptRoutingNumber.getOrNull())

                    /**
                     * Sets [Builder.receiptRoutingNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.receiptRoutingNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun receiptRoutingNumber(receiptRoutingNumber: JsonField<String>) = apply {
                        this.receiptRoutingNumber = receiptRoutingNumber
                    }

                    /** Number of retries attempted */
                    fun retries(retries: Long?) = retries(JsonField.ofNullable(retries))

                    /**
                     * Alias for [Builder.retries].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun retries(retries: Long) = retries(retries as Long?)

                    /** Alias for calling [Builder.retries] with `retries.orElse(null)`. */
                    fun retries(retries: Optional<Long>) = retries(retries.getOrNull())

                    /**
                     * Sets [Builder.retries] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.retries] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun retries(retries: JsonField<Long>) = apply { this.retries = retries }

                    /** Return reason code if the transaction was returned */
                    fun returnReasonCode(returnReasonCode: String?) =
                        returnReasonCode(JsonField.ofNullable(returnReasonCode))

                    /**
                     * Alias for calling [Builder.returnReasonCode] with
                     * `returnReasonCode.orElse(null)`.
                     */
                    fun returnReasonCode(returnReasonCode: Optional<String>) =
                        returnReasonCode(returnReasonCode.getOrNull())

                    /**
                     * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.returnReasonCode] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                        this.returnReasonCode = returnReasonCode
                    }

                    /** Trace numbers for the ACH transaction */
                    fun traceNumbers(traceNumbers: List<String>) =
                        traceNumbers(JsonField.of(traceNumbers))

                    /**
                     * Sets [Builder.traceNumbers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.traceNumbers] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun traceNumbers(traceNumbers: JsonField<List<String>>) = apply {
                        this.traceNumbers = traceNumbers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [traceNumbers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTraceNumber(traceNumber: String) = apply {
                        traceNumbers =
                            (traceNumbers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("traceNumbers", it).add(traceNumber)
                            }
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
                     * Returns an immutable instance of [AchMethodAttributes].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .secCode()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AchMethodAttributes =
                        AchMethodAttributes(
                            checkRequired("secCode", secCode),
                            addenda,
                            companyId,
                            receiptRoutingNumber,
                            retries,
                            returnReasonCode,
                            (traceNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AchMethodAttributes = apply {
                    if (validated) {
                        return@apply
                    }

                    secCode().validate()
                    addenda()
                    companyId()
                    receiptRoutingNumber()
                    retries()
                    returnReasonCode()
                    traceNumbers()
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
                    (secCode.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (addenda.asKnown().isPresent) 1 else 0) +
                        (if (companyId.asKnown().isPresent) 1 else 0) +
                        (if (receiptRoutingNumber.asKnown().isPresent) 1 else 0) +
                        (if (retries.asKnown().isPresent) 1 else 0) +
                        (if (returnReasonCode.asKnown().isPresent) 1 else 0) +
                        (traceNumbers.asKnown().getOrNull()?.size ?: 0)

                /** SEC code for ACH transaction */
                class SecCode
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CCD = of("CCD")

                        @JvmField val PPD = of("PPD")

                        @JvmField val WEB = of("WEB")

                        @JvmField val TEL = of("TEL")

                        @JvmField val CIE = of("CIE")

                        @JvmField val CTX = of("CTX")

                        @JvmStatic fun of(value: String) = SecCode(JsonField.of(value))
                    }

                    /** An enum containing [SecCode]'s known values. */
                    enum class Known {
                        CCD,
                        PPD,
                        WEB,
                        TEL,
                        CIE,
                        CTX,
                    }

                    /**
                     * An enum containing [SecCode]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [SecCode] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CCD,
                        PPD,
                        WEB,
                        TEL,
                        CIE,
                        CTX,
                        /**
                         * An enum member indicating that [SecCode] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CCD -> Value.CCD
                            PPD -> Value.PPD
                            WEB -> Value.WEB
                            TEL -> Value.TEL
                            CIE -> Value.CIE
                            CTX -> Value.CTX
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CCD -> Known.CCD
                            PPD -> Known.PPD
                            WEB -> Known.WEB
                            TEL -> Known.TEL
                            CIE -> Known.CIE
                            CTX -> Known.CTX
                            else -> throw LithicInvalidDataException("Unknown SecCode: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): SecCode = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SecCode && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AchMethodAttributes &&
                        secCode == other.secCode &&
                        addenda == other.addenda &&
                        companyId == other.companyId &&
                        receiptRoutingNumber == other.receiptRoutingNumber &&
                        retries == other.retries &&
                        returnReasonCode == other.returnReasonCode &&
                        traceNumbers == other.traceNumbers &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        secCode,
                        addenda,
                        companyId,
                        receiptRoutingNumber,
                        retries,
                        returnReasonCode,
                        traceNumbers,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AchMethodAttributes{secCode=$secCode, addenda=$addenda, companyId=$companyId, receiptRoutingNumber=$receiptRoutingNumber, retries=$retries, returnReasonCode=$returnReasonCode, traceNumbers=$traceNumbers, additionalProperties=$additionalProperties}"
            }

            class WireMethodAttributes
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val wireNetwork: JsonField<WireNetwork>,
                private val creditor: JsonField<WirePartyDetails>,
                private val debtor: JsonField<WirePartyDetails>,
                private val messageId: JsonField<String>,
                private val remittanceInformation: JsonField<String>,
                private val wireMessageType: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("wire_network")
                    @ExcludeMissing
                    wireNetwork: JsonField<WireNetwork> = JsonMissing.of(),
                    @JsonProperty("creditor")
                    @ExcludeMissing
                    creditor: JsonField<WirePartyDetails> = JsonMissing.of(),
                    @JsonProperty("debtor")
                    @ExcludeMissing
                    debtor: JsonField<WirePartyDetails> = JsonMissing.of(),
                    @JsonProperty("message_id")
                    @ExcludeMissing
                    messageId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("remittance_information")
                    @ExcludeMissing
                    remittanceInformation: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("wire_message_type")
                    @ExcludeMissing
                    wireMessageType: JsonField<String> = JsonMissing.of(),
                ) : this(
                    wireNetwork,
                    creditor,
                    debtor,
                    messageId,
                    remittanceInformation,
                    wireMessageType,
                    mutableMapOf(),
                )

                /**
                 * Type of wire transfer
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun wireNetwork(): WireNetwork = wireNetwork.getRequired("wire_network")

                /**
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun creditor(): Optional<WirePartyDetails> = creditor.getOptional("creditor")

                /**
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun debtor(): Optional<WirePartyDetails> = debtor.getOptional("debtor")

                /**
                 * Point to point reference identifier, as assigned by the instructing party, used
                 * for tracking the message through the Fedwire system
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun messageId(): Optional<String> = messageId.getOptional("message_id")

                /**
                 * Payment details or invoice reference
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun remittanceInformation(): Optional<String> =
                    remittanceInformation.getOptional("remittance_information")

                /**
                 * Type of wire message
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun wireMessageType(): Optional<String> =
                    wireMessageType.getOptional("wire_message_type")

                /**
                 * Returns the raw JSON value of [wireNetwork].
                 *
                 * Unlike [wireNetwork], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("wire_network")
                @ExcludeMissing
                fun _wireNetwork(): JsonField<WireNetwork> = wireNetwork

                /**
                 * Returns the raw JSON value of [creditor].
                 *
                 * Unlike [creditor], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("creditor")
                @ExcludeMissing
                fun _creditor(): JsonField<WirePartyDetails> = creditor

                /**
                 * Returns the raw JSON value of [debtor].
                 *
                 * Unlike [debtor], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("debtor")
                @ExcludeMissing
                fun _debtor(): JsonField<WirePartyDetails> = debtor

                /**
                 * Returns the raw JSON value of [messageId].
                 *
                 * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("message_id")
                @ExcludeMissing
                fun _messageId(): JsonField<String> = messageId

                /**
                 * Returns the raw JSON value of [remittanceInformation].
                 *
                 * Unlike [remittanceInformation], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun _remittanceInformation(): JsonField<String> = remittanceInformation

                /**
                 * Returns the raw JSON value of [wireMessageType].
                 *
                 * Unlike [wireMessageType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("wire_message_type")
                @ExcludeMissing
                fun _wireMessageType(): JsonField<String> = wireMessageType

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
                     * [WireMethodAttributes].
                     *
                     * The following fields are required:
                     * ```java
                     * .wireNetwork()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WireMethodAttributes]. */
                class Builder internal constructor() {

                    private var wireNetwork: JsonField<WireNetwork>? = null
                    private var creditor: JsonField<WirePartyDetails> = JsonMissing.of()
                    private var debtor: JsonField<WirePartyDetails> = JsonMissing.of()
                    private var messageId: JsonField<String> = JsonMissing.of()
                    private var remittanceInformation: JsonField<String> = JsonMissing.of()
                    private var wireMessageType: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(wireMethodAttributes: WireMethodAttributes) = apply {
                        wireNetwork = wireMethodAttributes.wireNetwork
                        creditor = wireMethodAttributes.creditor
                        debtor = wireMethodAttributes.debtor
                        messageId = wireMethodAttributes.messageId
                        remittanceInformation = wireMethodAttributes.remittanceInformation
                        wireMessageType = wireMethodAttributes.wireMessageType
                        additionalProperties =
                            wireMethodAttributes.additionalProperties.toMutableMap()
                    }

                    /** Type of wire transfer */
                    fun wireNetwork(wireNetwork: WireNetwork) =
                        wireNetwork(JsonField.of(wireNetwork))

                    /**
                     * Sets [Builder.wireNetwork] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.wireNetwork] with a well-typed [WireNetwork]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun wireNetwork(wireNetwork: JsonField<WireNetwork>) = apply {
                        this.wireNetwork = wireNetwork
                    }

                    fun creditor(creditor: WirePartyDetails) = creditor(JsonField.of(creditor))

                    /**
                     * Sets [Builder.creditor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.creditor] with a well-typed
                     * [WirePartyDetails] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun creditor(creditor: JsonField<WirePartyDetails>) = apply {
                        this.creditor = creditor
                    }

                    fun debtor(debtor: WirePartyDetails) = debtor(JsonField.of(debtor))

                    /**
                     * Sets [Builder.debtor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.debtor] with a well-typed [WirePartyDetails]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun debtor(debtor: JsonField<WirePartyDetails>) = apply { this.debtor = debtor }

                    /**
                     * Point to point reference identifier, as assigned by the instructing party,
                     * used for tracking the message through the Fedwire system
                     */
                    fun messageId(messageId: String?) = messageId(JsonField.ofNullable(messageId))

                    /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
                    fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

                    /**
                     * Sets [Builder.messageId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.messageId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun messageId(messageId: JsonField<String>) = apply {
                        this.messageId = messageId
                    }

                    /** Payment details or invoice reference */
                    fun remittanceInformation(remittanceInformation: String?) =
                        remittanceInformation(JsonField.ofNullable(remittanceInformation))

                    /**
                     * Alias for calling [Builder.remittanceInformation] with
                     * `remittanceInformation.orElse(null)`.
                     */
                    fun remittanceInformation(remittanceInformation: Optional<String>) =
                        remittanceInformation(remittanceInformation.getOrNull())

                    /**
                     * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.remittanceInformation] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                        this.remittanceInformation = remittanceInformation
                    }

                    /** Type of wire message */
                    fun wireMessageType(wireMessageType: String) =
                        wireMessageType(JsonField.of(wireMessageType))

                    /**
                     * Sets [Builder.wireMessageType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.wireMessageType] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun wireMessageType(wireMessageType: JsonField<String>) = apply {
                        this.wireMessageType = wireMessageType
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
                     * Returns an immutable instance of [WireMethodAttributes].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .wireNetwork()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): WireMethodAttributes =
                        WireMethodAttributes(
                            checkRequired("wireNetwork", wireNetwork),
                            creditor,
                            debtor,
                            messageId,
                            remittanceInformation,
                            wireMessageType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WireMethodAttributes = apply {
                    if (validated) {
                        return@apply
                    }

                    wireNetwork().validate()
                    creditor().ifPresent { it.validate() }
                    debtor().ifPresent { it.validate() }
                    messageId()
                    remittanceInformation()
                    wireMessageType()
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
                    (wireNetwork.asKnown().getOrNull()?.validity() ?: 0) +
                        (creditor.asKnown().getOrNull()?.validity() ?: 0) +
                        (debtor.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (messageId.asKnown().isPresent) 1 else 0) +
                        (if (remittanceInformation.asKnown().isPresent) 1 else 0) +
                        (if (wireMessageType.asKnown().isPresent) 1 else 0)

                /** Type of wire transfer */
                class WireNetwork
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val FEDWIRE = of("FEDWIRE")

                        @JvmField val SWIFT = of("SWIFT")

                        @JvmStatic fun of(value: String) = WireNetwork(JsonField.of(value))
                    }

                    /** An enum containing [WireNetwork]'s known values. */
                    enum class Known {
                        FEDWIRE,
                        SWIFT,
                    }

                    /**
                     * An enum containing [WireNetwork]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [WireNetwork] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        FEDWIRE,
                        SWIFT,
                        /**
                         * An enum member indicating that [WireNetwork] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            FEDWIRE -> Value.FEDWIRE
                            SWIFT -> Value.SWIFT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            FEDWIRE -> Known.FEDWIRE
                            SWIFT -> Known.SWIFT
                            else -> throw LithicInvalidDataException("Unknown WireNetwork: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LithicInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): WireNetwork = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is WireNetwork && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WireMethodAttributes &&
                        wireNetwork == other.wireNetwork &&
                        creditor == other.creditor &&
                        debtor == other.debtor &&
                        messageId == other.messageId &&
                        remittanceInformation == other.remittanceInformation &&
                        wireMessageType == other.wireMessageType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        wireNetwork,
                        creditor,
                        debtor,
                        messageId,
                        remittanceInformation,
                        wireMessageType,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WireMethodAttributes{wireNetwork=$wireNetwork, creditor=$creditor, debtor=$debtor, messageId=$messageId, remittanceInformation=$remittanceInformation, wireMessageType=$wireMessageType, additionalProperties=$additionalProperties}"
            }
        }

        /** Related account tokens for the transaction */
        class RelatedAccountTokens
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountToken: JsonField<String>,
            private val businessAccountToken: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_token")
                @ExcludeMissing
                accountToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("business_account_token")
                @ExcludeMissing
                businessAccountToken: JsonField<String> = JsonMissing.of(),
            ) : this(accountToken, businessAccountToken, mutableMapOf())

            /**
             * Globally unique identifier for the account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

            /**
             * Globally unique identifier for the business account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun businessAccountToken(): Optional<String> =
                businessAccountToken.getOptional("business_account_token")

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
             * Returns the raw JSON value of [businessAccountToken].
             *
             * Unlike [businessAccountToken], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("business_account_token")
            @ExcludeMissing
            fun _businessAccountToken(): JsonField<String> = businessAccountToken

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
                 * Returns a mutable builder for constructing an instance of [RelatedAccountTokens].
                 *
                 * The following fields are required:
                 * ```java
                 * .accountToken()
                 * .businessAccountToken()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RelatedAccountTokens]. */
            class Builder internal constructor() {

                private var accountToken: JsonField<String>? = null
                private var businessAccountToken: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(relatedAccountTokens: RelatedAccountTokens) = apply {
                    accountToken = relatedAccountTokens.accountToken
                    businessAccountToken = relatedAccountTokens.businessAccountToken
                    additionalProperties = relatedAccountTokens.additionalProperties.toMutableMap()
                }

                /** Globally unique identifier for the account */
                fun accountToken(accountToken: String?) =
                    accountToken(JsonField.ofNullable(accountToken))

                /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
                fun accountToken(accountToken: Optional<String>) =
                    accountToken(accountToken.getOrNull())

                /**
                 * Sets [Builder.accountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountToken(accountToken: JsonField<String>) = apply {
                    this.accountToken = accountToken
                }

                /** Globally unique identifier for the business account */
                fun businessAccountToken(businessAccountToken: String?) =
                    businessAccountToken(JsonField.ofNullable(businessAccountToken))

                /**
                 * Alias for calling [Builder.businessAccountToken] with
                 * `businessAccountToken.orElse(null)`.
                 */
                fun businessAccountToken(businessAccountToken: Optional<String>) =
                    businessAccountToken(businessAccountToken.getOrNull())

                /**
                 * Sets [Builder.businessAccountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessAccountToken] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
                    this.businessAccountToken = businessAccountToken
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
                 * Returns an immutable instance of [RelatedAccountTokens].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accountToken()
                 * .businessAccountToken()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RelatedAccountTokens =
                    RelatedAccountTokens(
                        checkRequired("accountToken", accountToken),
                        checkRequired("businessAccountToken", businessAccountToken),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RelatedAccountTokens = apply {
                if (validated) {
                    return@apply
                }

                accountToken()
                businessAccountToken()
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
                (if (accountToken.asKnown().isPresent) 1 else 0) +
                    (if (businessAccountToken.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RelatedAccountTokens &&
                    accountToken == other.accountToken &&
                    businessAccountToken == other.businessAccountToken &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountToken, businessAccountToken, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RelatedAccountTokens{accountToken=$accountToken, businessAccountToken=$businessAccountToken, additionalProperties=$additionalProperties}"
        }

        /** Transaction result */
        class TransactionResult
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

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
            }

            /** An enum containing [TransactionResult]'s known values. */
            enum class Known {
                APPROVED,
                DECLINED,
            }

            /**
             * An enum containing [TransactionResult]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionResult] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                DECLINED,
                /**
                 * An enum member indicating that [TransactionResult] was instantiated with an
                 * unknown value.
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
                    else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
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

            fun validate(): TransactionResult = apply {
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

                return other is TransactionResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Transaction source */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val LITHIC = of("LITHIC")

                @JvmField val EXTERNAL = of("EXTERNAL")

                @JvmField val CUSTOMER = of("CUSTOMER")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                LITHIC,
                EXTERNAL,
                CUSTOMER,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LITHIC,
                EXTERNAL,
                CUSTOMER,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
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
                    LITHIC -> Value.LITHIC
                    EXTERNAL -> Value.EXTERNAL
                    CUSTOMER -> Value.CUSTOMER
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
                    LITHIC -> Known.LITHIC
                    EXTERNAL -> Known.EXTERNAL
                    CUSTOMER -> Known.CUSTOMER
                    else -> throw LithicInvalidDataException("Unknown Source: $value")
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

            fun validate(): Source = apply {
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

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of the transaction */
        class TransactionStatus
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

                @JvmField val PENDING = of("PENDING")

                @JvmField val SETTLED = of("SETTLED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val REVERSED = of("REVERSED")

                @JvmField val CANCELED = of("CANCELED")

                @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
            }

            /** An enum containing [TransactionStatus]'s known values. */
            enum class Known {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
            }

            /**
             * An enum containing [TransactionStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
                /**
                 * An enum member indicating that [TransactionStatus] was instantiated with an
                 * unknown value.
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
                    PENDING -> Value.PENDING
                    SETTLED -> Value.SETTLED
                    DECLINED -> Value.DECLINED
                    REVERSED -> Value.REVERSED
                    CANCELED -> Value.CANCELED
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
                    PENDING -> Known.PENDING
                    SETTLED -> Known.SETTLED
                    DECLINED -> Known.DECLINED
                    REVERSED -> Known.REVERSED
                    CANCELED -> Known.CANCELED
                    else -> throw LithicInvalidDataException("Unknown TransactionStatus: $value")
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

            fun validate(): TransactionStatus = apply {
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

                return other is TransactionStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TransferType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val ORIGINATION_CREDIT = of("ORIGINATION_CREDIT")

                @JvmField val ORIGINATION_DEBIT = of("ORIGINATION_DEBIT")

                @JvmField val RECEIPT_CREDIT = of("RECEIPT_CREDIT")

                @JvmField val RECEIPT_DEBIT = of("RECEIPT_DEBIT")

                @JvmField val WIRE_INBOUND_PAYMENT = of("WIRE_INBOUND_PAYMENT")

                @JvmField val WIRE_INBOUND_ADMIN = of("WIRE_INBOUND_ADMIN")

                @JvmField val WIRE_OUTBOUND_PAYMENT = of("WIRE_OUTBOUND_PAYMENT")

                @JvmField val WIRE_OUTBOUND_ADMIN = of("WIRE_OUTBOUND_ADMIN")

                @JvmStatic fun of(value: String) = TransferType(JsonField.of(value))
            }

            /** An enum containing [TransferType]'s known values. */
            enum class Known {
                ORIGINATION_CREDIT,
                ORIGINATION_DEBIT,
                RECEIPT_CREDIT,
                RECEIPT_DEBIT,
                WIRE_INBOUND_PAYMENT,
                WIRE_INBOUND_ADMIN,
                WIRE_OUTBOUND_PAYMENT,
                WIRE_OUTBOUND_ADMIN,
            }

            /**
             * An enum containing [TransferType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TransferType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ORIGINATION_CREDIT,
                ORIGINATION_DEBIT,
                RECEIPT_CREDIT,
                RECEIPT_DEBIT,
                WIRE_INBOUND_PAYMENT,
                WIRE_INBOUND_ADMIN,
                WIRE_OUTBOUND_PAYMENT,
                WIRE_OUTBOUND_ADMIN,
                /**
                 * An enum member indicating that [TransferType] was instantiated with an unknown
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
                    ORIGINATION_CREDIT -> Value.ORIGINATION_CREDIT
                    ORIGINATION_DEBIT -> Value.ORIGINATION_DEBIT
                    RECEIPT_CREDIT -> Value.RECEIPT_CREDIT
                    RECEIPT_DEBIT -> Value.RECEIPT_DEBIT
                    WIRE_INBOUND_PAYMENT -> Value.WIRE_INBOUND_PAYMENT
                    WIRE_INBOUND_ADMIN -> Value.WIRE_INBOUND_ADMIN
                    WIRE_OUTBOUND_PAYMENT -> Value.WIRE_OUTBOUND_PAYMENT
                    WIRE_OUTBOUND_ADMIN -> Value.WIRE_OUTBOUND_ADMIN
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
                    ORIGINATION_CREDIT -> Known.ORIGINATION_CREDIT
                    ORIGINATION_DEBIT -> Known.ORIGINATION_DEBIT
                    RECEIPT_CREDIT -> Known.RECEIPT_CREDIT
                    RECEIPT_DEBIT -> Known.RECEIPT_DEBIT
                    WIRE_INBOUND_PAYMENT -> Known.WIRE_INBOUND_PAYMENT
                    WIRE_INBOUND_ADMIN -> Known.WIRE_INBOUND_ADMIN
                    WIRE_OUTBOUND_PAYMENT -> Known.WIRE_OUTBOUND_PAYMENT
                    WIRE_OUTBOUND_ADMIN -> Known.WIRE_OUTBOUND_ADMIN
                    else -> throw LithicInvalidDataException("Unknown TransferType: $value")
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

            fun validate(): TransferType = apply {
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

                return other is TransferType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentTransaction &&
                token == other.token &&
                category == other.category &&
                created == other.created &&
                descriptor == other.descriptor &&
                direction == other.direction &&
                events == other.events &&
                family == other.family &&
                financialAccountToken == other.financialAccountToken &&
                method == other.method &&
                methodAttributes == other.methodAttributes &&
                pendingAmount == other.pendingAmount &&
                relatedAccountTokens == other.relatedAccountTokens &&
                result == other.result &&
                settledAmount == other.settledAmount &&
                source == other.source &&
                status == other.status &&
                updated == other.updated &&
                currency == other.currency &&
                expectedReleaseDate == other.expectedReleaseDate &&
                externalBankAccountToken == other.externalBankAccountToken &&
                type == other.type &&
                userDefinedId == other.userDefinedId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                category,
                created,
                descriptor,
                direction,
                events,
                family,
                financialAccountToken,
                method,
                methodAttributes,
                pendingAmount,
                relatedAccountTokens,
                result,
                settledAmount,
                source,
                status,
                updated,
                currency,
                expectedReleaseDate,
                externalBankAccountToken,
                type,
                userDefinedId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentTransaction{token=$token, category=$category, created=$created, descriptor=$descriptor, direction=$direction, events=$events, family=$family, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, pendingAmount=$pendingAmount, relatedAccountTokens=$relatedAccountTokens, result=$result, settledAmount=$settledAmount, source=$source, status=$status, updated=$updated, currency=$currency, expectedReleaseDate=$expectedReleaseDate, externalBankAccountToken=$externalBankAccountToken, type=$type, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }
}
