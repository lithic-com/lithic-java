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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response containing multiple transaction types. The `family` field determines which transaction
 * type is returned: INTERNAL returns FinancialTransaction, TRANSFER returns
 * BookTransferTransaction, CARD returns CardTransaction, PAYMENT returns PaymentTransaction,
 * EXTERNAL_PAYMENT returns ExternalPaymentResponse, and MANAGEMENT_OPERATION returns
 * ManagementOperationTransaction
 */
@JsonDeserialize(using = AccountActivityListResponse.Deserializer::class)
@JsonSerialize(using = AccountActivityListResponse.Serializer::class)
class AccountActivityListResponse
private constructor(
    private val internal_: FinancialTransaction? = null,
    private val transfer: BookTransferResponse? = null,
    private val card: CardTransaction? = null,
    private val payment: Payment? = null,
    private val externalPayment: ExternalPayment? = null,
    private val managementOperation: ManagementOperationTransaction? = null,
    private val _json: JsonValue? = null,
) {

    /** Financial transaction with inheritance from unified base transaction */
    fun internal_(): Optional<FinancialTransaction> = Optional.ofNullable(internal_)

    /** Book transfer transaction */
    fun transfer(): Optional<BookTransferResponse> = Optional.ofNullable(transfer)

    /** Card transaction with ledger base properties */
    fun card(): Optional<CardTransaction> = Optional.ofNullable(card)

    /** Payment transaction */
    fun payment(): Optional<Payment> = Optional.ofNullable(payment)

    fun externalPayment(): Optional<ExternalPayment> = Optional.ofNullable(externalPayment)

    fun managementOperation(): Optional<ManagementOperationTransaction> =
        Optional.ofNullable(managementOperation)

    fun isInternal(): Boolean = internal_ != null

    fun isTransfer(): Boolean = transfer != null

    fun isCard(): Boolean = card != null

    fun isPayment(): Boolean = payment != null

    fun isExternalPayment(): Boolean = externalPayment != null

    fun isManagementOperation(): Boolean = managementOperation != null

    /** Financial transaction with inheritance from unified base transaction */
    fun asInternal(): FinancialTransaction = internal_.getOrThrow("internal_")

    /** Book transfer transaction */
    fun asTransfer(): BookTransferResponse = transfer.getOrThrow("transfer")

    /** Card transaction with ledger base properties */
    fun asCard(): CardTransaction = card.getOrThrow("card")

    /** Payment transaction */
    fun asPayment(): Payment = payment.getOrThrow("payment")

    fun asExternalPayment(): ExternalPayment = externalPayment.getOrThrow("externalPayment")

    fun asManagementOperation(): ManagementOperationTransaction =
        managementOperation.getOrThrow("managementOperation")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            internal_ != null -> visitor.visitInternal(internal_)
            transfer != null -> visitor.visitTransfer(transfer)
            card != null -> visitor.visitCard(card)
            payment != null -> visitor.visitPayment(payment)
            externalPayment != null -> visitor.visitExternalPayment(externalPayment)
            managementOperation != null -> visitor.visitManagementOperation(managementOperation)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): AccountActivityListResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitInternal(internal_: FinancialTransaction) {
                    internal_.validate()
                }

                override fun visitTransfer(transfer: BookTransferResponse) {
                    transfer.validate()
                }

                override fun visitCard(card: CardTransaction) {
                    card.validate()
                }

                override fun visitPayment(payment: Payment) {
                    payment.validate()
                }

                override fun visitExternalPayment(externalPayment: ExternalPayment) {
                    externalPayment.validate()
                }

                override fun visitManagementOperation(
                    managementOperation: ManagementOperationTransaction
                ) {
                    managementOperation.validate()
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
                override fun visitInternal(internal_: FinancialTransaction) = internal_.validity()

                override fun visitTransfer(transfer: BookTransferResponse) = transfer.validity()

                override fun visitCard(card: CardTransaction) = card.validity()

                override fun visitPayment(payment: Payment) = payment.validity()

                override fun visitExternalPayment(externalPayment: ExternalPayment) =
                    externalPayment.validity()

                override fun visitManagementOperation(
                    managementOperation: ManagementOperationTransaction
                ) = managementOperation.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountActivityListResponse &&
            internal_ == other.internal_ &&
            transfer == other.transfer &&
            card == other.card &&
            payment == other.payment &&
            externalPayment == other.externalPayment &&
            managementOperation == other.managementOperation
    }

    override fun hashCode(): Int =
        Objects.hash(internal_, transfer, card, payment, externalPayment, managementOperation)

    override fun toString(): String =
        when {
            internal_ != null -> "AccountActivityListResponse{internal_=$internal_}"
            transfer != null -> "AccountActivityListResponse{transfer=$transfer}"
            card != null -> "AccountActivityListResponse{card=$card}"
            payment != null -> "AccountActivityListResponse{payment=$payment}"
            externalPayment != null ->
                "AccountActivityListResponse{externalPayment=$externalPayment}"
            managementOperation != null ->
                "AccountActivityListResponse{managementOperation=$managementOperation}"
            _json != null -> "AccountActivityListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AccountActivityListResponse")
        }

    companion object {

        /** Financial transaction with inheritance from unified base transaction */
        @JvmStatic
        fun ofInternal(internal_: FinancialTransaction) =
            AccountActivityListResponse(internal_ = internal_)

        /** Book transfer transaction */
        @JvmStatic
        fun ofTransfer(transfer: BookTransferResponse) =
            AccountActivityListResponse(transfer = transfer)

        /** Card transaction with ledger base properties */
        @JvmStatic fun ofCard(card: CardTransaction) = AccountActivityListResponse(card = card)

        /** Payment transaction */
        @JvmStatic fun ofPayment(payment: Payment) = AccountActivityListResponse(payment = payment)

        @JvmStatic
        fun ofExternalPayment(externalPayment: ExternalPayment) =
            AccountActivityListResponse(externalPayment = externalPayment)

        @JvmStatic
        fun ofManagementOperation(managementOperation: ManagementOperationTransaction) =
            AccountActivityListResponse(managementOperation = managementOperation)
    }

    /**
     * An interface that defines how to map each variant of [AccountActivityListResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /** Financial transaction with inheritance from unified base transaction */
        fun visitInternal(internal_: FinancialTransaction): T

        /** Book transfer transaction */
        fun visitTransfer(transfer: BookTransferResponse): T

        /** Card transaction with ledger base properties */
        fun visitCard(card: CardTransaction): T

        /** Payment transaction */
        fun visitPayment(payment: Payment): T

        fun visitExternalPayment(externalPayment: ExternalPayment): T

        fun visitManagementOperation(managementOperation: ManagementOperationTransaction): T

        /**
         * Maps an unknown variant of [AccountActivityListResponse] to a value of type [T].
         *
         * An instance of [AccountActivityListResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException("Unknown AccountActivityListResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<AccountActivityListResponse>(AccountActivityListResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): AccountActivityListResponse {
            val json = JsonValue.fromJsonNode(node)
            val family = json.asObject().getOrNull()?.get("family")?.asString()?.getOrNull()

            when (family) {
                "INTERNAL" -> {
                    return tryDeserialize(node, jacksonTypeRef<FinancialTransaction>())?.let {
                        AccountActivityListResponse(internal_ = it, _json = json)
                    } ?: AccountActivityListResponse(_json = json)
                }
                "TRANSFER" -> {
                    return tryDeserialize(node, jacksonTypeRef<BookTransferResponse>())?.let {
                        AccountActivityListResponse(transfer = it, _json = json)
                    } ?: AccountActivityListResponse(_json = json)
                }
                "CARD" -> {
                    return tryDeserialize(node, jacksonTypeRef<CardTransaction>())?.let {
                        AccountActivityListResponse(card = it, _json = json)
                    } ?: AccountActivityListResponse(_json = json)
                }
                "PAYMENT" -> {
                    return tryDeserialize(node, jacksonTypeRef<Payment>())?.let {
                        AccountActivityListResponse(payment = it, _json = json)
                    } ?: AccountActivityListResponse(_json = json)
                }
                "EXTERNAL_PAYMENT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ExternalPayment>())?.let {
                        AccountActivityListResponse(externalPayment = it, _json = json)
                    } ?: AccountActivityListResponse(_json = json)
                }
                "MANAGEMENT_OPERATION" -> {
                    return tryDeserialize(node, jacksonTypeRef<ManagementOperationTransaction>())
                        ?.let {
                            AccountActivityListResponse(managementOperation = it, _json = json)
                        } ?: AccountActivityListResponse(_json = json)
                }
            }

            return AccountActivityListResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<AccountActivityListResponse>(AccountActivityListResponse::class) {

        override fun serialize(
            value: AccountActivityListResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.internal_ != null -> generator.writeObject(value.internal_)
                value.transfer != null -> generator.writeObject(value.transfer)
                value.card != null -> generator.writeObject(value.card)
                value.payment != null -> generator.writeObject(value.payment)
                value.externalPayment != null -> generator.writeObject(value.externalPayment)
                value.managementOperation != null ->
                    generator.writeObject(value.managementOperation)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AccountActivityListResponse")
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
        private val family: JsonField<Family>,
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
            @JsonProperty("family") @ExcludeMissing family: JsonField<Family> = JsonMissing.of(),
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
         * INTERNAL - Financial Transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun family(): Family = family.getRequired("family")

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
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Family> = family

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
            private var family: JsonField<Family>? = null
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

            /** INTERNAL - Financial Transaction */
            fun family(family: Family) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [Family] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<Family>) = apply { this.family = family }

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

                @JvmField val EXTERNAL_FEDNOW = of("EXTERNAL_FEDNOW")

                @JvmField val EXTERNAL_RTP = of("EXTERNAL_RTP")

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
                EXTERNAL_FEDNOW,
                EXTERNAL_RTP,
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
                EXTERNAL_FEDNOW,
                EXTERNAL_RTP,
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
                    EXTERNAL_FEDNOW -> Value.EXTERNAL_FEDNOW
                    EXTERNAL_RTP -> Value.EXTERNAL_RTP
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
                    EXTERNAL_FEDNOW -> Known.EXTERNAL_FEDNOW
                    EXTERNAL_RTP -> Known.EXTERNAL_RTP
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

        /** INTERNAL - Financial Transaction */
        class Family @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val INTERNAL = of("INTERNAL")

                @JvmStatic fun of(value: String) = Family(JsonField.of(value))
            }

            /** An enum containing [Family]'s known values. */
            enum class Known {
                INTERNAL
            }

            /**
             * An enum containing [Family]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Family] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INTERNAL,
                /**
                 * An enum member indicating that [Family] was instantiated with an unknown value.
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
                    INTERNAL -> Value.INTERNAL
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
                    INTERNAL -> Known.INTERNAL
                    else -> throw LithicInvalidDataException("Unknown Family: $value")
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

            fun validate(): Family = apply {
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

                return other is Family && value == other.value
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

                @JvmField val RETURNED = of("RETURNED")

                @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
            }

            /** An enum containing [TransactionStatus]'s known values. */
            enum class Known {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
                RETURNED,
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
                RETURNED,
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
                    RETURNED -> Value.RETURNED
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
                    RETURNED -> Known.RETURNED
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

    /** Card transaction with ledger base properties */
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
        private val cardholderAuthentication: JsonField<CardholderAuthentication>,
        private val created: JsonField<OffsetDateTime>,
        private val financialAccountToken: JsonField<String>,
        private val merchant: JsonField<Merchant>,
        private val merchantAmount: JsonField<Long>,
        private val merchantAuthorizationAmount: JsonField<Long>,
        private val merchantCurrency: JsonField<String>,
        private val network: JsonField<Transaction.Network>,
        private val networkRiskScore: JsonField<Long>,
        private val pos: JsonField<Transaction.Pos>,
        private val result: JsonField<Transaction.DeclineResult>,
        private val settledAmount: JsonField<Long>,
        private val status: JsonField<Transaction.Status>,
        private val tokenInfo: JsonField<TokenInfo>,
        private val updated: JsonField<OffsetDateTime>,
        private val events: JsonField<List<Transaction.TransactionEvent>>,
        private val family: JsonField<Family>,
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
            cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            financialAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant")
            @ExcludeMissing
            merchant: JsonField<Merchant> = JsonMissing.of(),
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
            tokenInfo: JsonField<TokenInfo> = JsonMissing.of(),
            @JsonProperty("updated")
            @ExcludeMissing
            updated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<Transaction.TransactionEvent>> = JsonMissing.of(),
            @JsonProperty("family") @ExcludeMissing family: JsonField<Family> = JsonMissing.of(),
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
        fun cardholderAuthentication(): Optional<CardholderAuthentication> =
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
        fun merchant(): Merchant = merchant.getRequired("merchant")

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
        fun tokenInfo(): Optional<TokenInfo> = tokenInfo.getOptional("token_info")

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
         * CARD - Card Transaction
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun family(): Family = family.getRequired("family")

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
        fun _cardholderAuthentication(): JsonField<CardholderAuthentication> =
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
        @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

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
        fun _tokenInfo(): JsonField<TokenInfo> = tokenInfo

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
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Family> = family

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
            private var cardholderAuthentication: JsonField<CardholderAuthentication>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var merchant: JsonField<Merchant>? = null
            private var merchantAmount: JsonField<Long>? = null
            private var merchantAuthorizationAmount: JsonField<Long>? = null
            private var merchantCurrency: JsonField<String>? = null
            private var network: JsonField<Transaction.Network>? = null
            private var networkRiskScore: JsonField<Long>? = null
            private var pos: JsonField<Transaction.Pos>? = null
            private var result: JsonField<Transaction.DeclineResult>? = null
            private var settledAmount: JsonField<Long>? = null
            private var status: JsonField<Transaction.Status>? = null
            private var tokenInfo: JsonField<TokenInfo>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var events: JsonField<MutableList<Transaction.TransactionEvent>>? = null
            private var family: JsonField<Family>? = null
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

            fun cardholderAuthentication(cardholderAuthentication: CardholderAuthentication?) =
                cardholderAuthentication(JsonField.ofNullable(cardholderAuthentication))

            /**
             * Alias for calling [Builder.cardholderAuthentication] with
             * `cardholderAuthentication.orElse(null)`.
             */
            fun cardholderAuthentication(
                cardholderAuthentication: Optional<CardholderAuthentication>
            ) = cardholderAuthentication(cardholderAuthentication.getOrNull())

            /**
             * Sets [Builder.cardholderAuthentication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderAuthentication] with a well-typed
             * [CardholderAuthentication] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun cardholderAuthentication(
                cardholderAuthentication: JsonField<CardholderAuthentication>
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

            fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

            /**
             * Sets [Builder.merchant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchant] with a well-typed [Merchant] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

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

            fun tokenInfo(tokenInfo: TokenInfo?) = tokenInfo(JsonField.ofNullable(tokenInfo))

            /** Alias for calling [Builder.tokenInfo] with `tokenInfo.orElse(null)`. */
            fun tokenInfo(tokenInfo: Optional<TokenInfo>) = tokenInfo(tokenInfo.getOrNull())

            /**
             * Sets [Builder.tokenInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenInfo] with a well-typed [TokenInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenInfo(tokenInfo: JsonField<TokenInfo>) = apply { this.tokenInfo = tokenInfo }

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

            /** CARD - Card Transaction */
            fun family(family: Family) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [Family] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<Family>) = apply { this.family = family }

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

        /** CARD - Card Transaction */
        class Family @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmStatic fun of(value: String) = Family(JsonField.of(value))
            }

            /** An enum containing [Family]'s known values. */
            enum class Known {
                CARD
            }

            /**
             * An enum containing [Family]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Family] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                /**
                 * An enum member indicating that [Family] was instantiated with an unknown value.
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
                    else -> throw LithicInvalidDataException("Unknown Family: $value")
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

            fun validate(): Family = apply {
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

                return other is Family && value == other.value
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

                @JvmField val RETURNED = of("RETURNED")

                @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
            }

            /** An enum containing [TransactionStatus]'s known values. */
            enum class Known {
                PENDING,
                SETTLED,
                DECLINED,
                REVERSED,
                CANCELED,
                RETURNED,
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
                RETURNED,
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
                    RETURNED -> Value.RETURNED
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
                    RETURNED -> Known.RETURNED
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
}
