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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ManagementOperationTransaction
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("category")
    @ExcludeMissing
    private val category: JsonField<ManagementOperationCategory> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<ManagementOperationDirection> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<ManagementOperationEvent>> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pending_amount")
    @ExcludeMissing
    private val pendingAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<TransactionResult> = JsonMissing.of(),
    @JsonProperty("settled_amount")
    @ExcludeMissing
    private val settledAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<TransactionStatus> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    private val userDefinedId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun token(): String = token.getRequired("token")

    fun category(): ManagementOperationCategory = category.getRequired("category")

    fun created(): OffsetDateTime = created.getRequired("created")

    fun currency(): String = currency.getRequired("currency")

    fun direction(): ManagementOperationDirection = direction.getRequired("direction")

    fun events(): List<ManagementOperationEvent> = events.getRequired("events")

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    fun result(): TransactionResult = result.getRequired("result")

    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    fun status(): TransactionStatus = status.getRequired("status")

    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    @JsonProperty("category")
    @ExcludeMissing
    fun _category(): JsonField<ManagementOperationCategory> = category

    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction(): JsonField<ManagementOperationDirection> = direction

    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<ManagementOperationEvent>> = events

    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    @JsonProperty("pending_amount")
    @ExcludeMissing
    fun _pendingAmount(): JsonField<Long> = pendingAmount

    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<TransactionStatus> = status

    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ManagementOperationTransaction = apply {
        if (validated) {
            return@apply
        }

        token()
        category()
        created()
        currency()
        direction()
        events().forEach { it.validate() }
        financialAccountToken()
        pendingAmount()
        result()
        settledAmount()
        status()
        updated()
        userDefinedId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ManagementOperationTransaction].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .category()
         * .created()
         * .currency()
         * .direction()
         * .events()
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

    /** A builder for [ManagementOperationTransaction]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<ManagementOperationCategory>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var direction: JsonField<ManagementOperationDirection>? = null
        private var events: JsonField<MutableList<ManagementOperationEvent>>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var result: JsonField<TransactionResult>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<TransactionStatus>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(managementOperationTransaction: ManagementOperationTransaction) = apply {
            token = managementOperationTransaction.token
            category = managementOperationTransaction.category
            created = managementOperationTransaction.created
            currency = managementOperationTransaction.currency
            direction = managementOperationTransaction.direction
            events = managementOperationTransaction.events.map { it.toMutableList() }
            financialAccountToken = managementOperationTransaction.financialAccountToken
            pendingAmount = managementOperationTransaction.pendingAmount
            result = managementOperationTransaction.result
            settledAmount = managementOperationTransaction.settledAmount
            status = managementOperationTransaction.status
            updated = managementOperationTransaction.updated
            userDefinedId = managementOperationTransaction.userDefinedId
            additionalProperties =
                managementOperationTransaction.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        fun token(token: JsonField<String>) = apply { this.token = token }

        fun category(category: ManagementOperationCategory) = category(JsonField.of(category))

        fun category(category: JsonField<ManagementOperationCategory>) = apply {
            this.category = category
        }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun currency(currency: String) = currency(JsonField.of(currency))

        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun direction(direction: ManagementOperationDirection) = direction(JsonField.of(direction))

        fun direction(direction: JsonField<ManagementOperationDirection>) = apply {
            this.direction = direction
        }

        fun events(events: List<ManagementOperationEvent>) = events(JsonField.of(events))

        fun events(events: JsonField<List<ManagementOperationEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        fun addEvent(event: ManagementOperationEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        fun result(result: TransactionResult) = result(JsonField.of(result))

        fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        fun status(status: TransactionStatus) = status(JsonField.of(status))

        fun status(status: JsonField<TransactionStatus>) = apply { this.status = status }

        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

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

        fun build(): ManagementOperationTransaction =
            ManagementOperationTransaction(
                checkRequired("token", token),
                checkRequired("category", category),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("direction", direction),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("result", result),
                checkRequired("settledAmount", settledAmount),
                checkRequired("status", status),
                checkRequired("updated", updated),
                userDefinedId,
                additionalProperties.toImmutable(),
            )
    }

    class ManagementOperationCategory
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

            @JvmField val MANAGEMENT_FEE = of("MANAGEMENT_FEE")

            @JvmField val MANAGEMENT_DISPUTE = of("MANAGEMENT_DISPUTE")

            @JvmField val MANAGEMENT_REWARD = of("MANAGEMENT_REWARD")

            @JvmField val MANAGEMENT_ADJUSTMENT = of("MANAGEMENT_ADJUSTMENT")

            @JvmStatic fun of(value: String) = ManagementOperationCategory(JsonField.of(value))
        }

        /** An enum containing [ManagementOperationCategory]'s known values. */
        enum class Known {
            MANAGEMENT_FEE,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_REWARD,
            MANAGEMENT_ADJUSTMENT,
        }

        /**
         * An enum containing [ManagementOperationCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ManagementOperationCategory] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MANAGEMENT_FEE,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_REWARD,
            MANAGEMENT_ADJUSTMENT,
            /**
             * An enum member indicating that [ManagementOperationCategory] was instantiated with an
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
                MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
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
                MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationCategory: $value")
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

            return /* spotless:off */ other is ManagementOperationCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ManagementOperationDirection
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

            @JvmField val CREDIT = of("CREDIT")

            @JvmField val DEBIT = of("DEBIT")

            @JvmStatic fun of(value: String) = ManagementOperationDirection(JsonField.of(value))
        }

        /** An enum containing [ManagementOperationDirection]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [ManagementOperationDirection]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ManagementOperationDirection] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [ManagementOperationDirection] was instantiated with
             * an unknown value.
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
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationDirection: $value")
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

            return /* spotless:off */ other is ManagementOperationDirection && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class ManagementOperationEvent
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detailed_results")
        @ExcludeMissing
        private val detailedResults: JsonField<List<DetailedResults>> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<TransactionResult> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<ManagementOperationEventType> = JsonMissing.of(),
        @JsonProperty("subtype")
        @ExcludeMissing
        private val subtype: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun token(): String = token.getRequired("token")

        fun amount(): Long = amount.getRequired("amount")

        fun created(): OffsetDateTime = created.getRequired("created")

        fun detailedResults(): List<DetailedResults> =
            detailedResults.getRequired("detailed_results")

        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        fun memo(): String = memo.getRequired("memo")

        fun result(): TransactionResult = result.getRequired("result")

        fun type(): ManagementOperationEventType = type.getRequired("type")

        fun subtype(): Optional<String> = Optional.ofNullable(subtype.getNullable("subtype"))

        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        @JsonProperty("detailed_results")
        @ExcludeMissing
        fun _detailedResults(): JsonField<List<DetailedResults>> = detailedResults

        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<TransactionResult> = result

        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<ManagementOperationEventType> = type

        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ManagementOperationEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            created()
            detailedResults()
            effectiveDate()
            memo()
            result()
            type()
            subtype()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ManagementOperationEvent].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .created()
             * .detailedResults()
             * .effectiveDate()
             * .memo()
             * .result()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ManagementOperationEvent]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var detailedResults: JsonField<MutableList<DetailedResults>>? = null
            private var effectiveDate: JsonField<LocalDate>? = null
            private var memo: JsonField<String>? = null
            private var result: JsonField<TransactionResult>? = null
            private var type: JsonField<ManagementOperationEventType>? = null
            private var subtype: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(managementOperationEvent: ManagementOperationEvent) = apply {
                token = managementOperationEvent.token
                amount = managementOperationEvent.amount
                created = managementOperationEvent.created
                detailedResults =
                    managementOperationEvent.detailedResults.map { it.toMutableList() }
                effectiveDate = managementOperationEvent.effectiveDate
                memo = managementOperationEvent.memo
                result = managementOperationEvent.result
                type = managementOperationEvent.type
                subtype = managementOperationEvent.subtype
                additionalProperties = managementOperationEvent.additionalProperties.toMutableMap()
            }

            fun token(token: String) = token(JsonField.of(token))

            fun token(token: JsonField<String>) = apply { this.token = token }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            fun detailedResults(detailedResults: List<DetailedResults>) =
                detailedResults(JsonField.of(detailedResults))

            fun detailedResults(detailedResults: JsonField<List<DetailedResults>>) = apply {
                this.detailedResults = detailedResults.map { it.toMutableList() }
            }

            fun addDetailedResult(detailedResult: DetailedResults) = apply {
                detailedResults =
                    (detailedResults ?: JsonField.of(mutableListOf())).also {
                        checkKnown("detailedResults", it).add(detailedResult)
                    }
            }

            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun memo(memo: String) = memo(JsonField.of(memo))

            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun result(result: TransactionResult) = result(JsonField.of(result))

            fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

            fun type(type: ManagementOperationEventType) = type(JsonField.of(type))

            fun type(type: JsonField<ManagementOperationEventType>) = apply { this.type = type }

            fun subtype(subtype: String) = subtype(JsonField.of(subtype))

            fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

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

            fun build(): ManagementOperationEvent =
                ManagementOperationEvent(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("created", created),
                    checkRequired("detailedResults", detailedResults).map { it.toImmutable() },
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("memo", memo),
                    checkRequired("result", result),
                    checkRequired("type", type),
                    subtype,
                    additionalProperties.toImmutable(),
                )
        }

        class DetailedResults
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

                @JvmStatic fun of(value: String) = DetailedResults(JsonField.of(value))
            }

            /** An enum containing [DetailedResults]'s known values. */
            enum class Known {
                APPROVED
            }

            /**
             * An enum containing [DetailedResults]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DetailedResults] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                /**
                 * An enum member indicating that [DetailedResults] was instantiated with an unknown
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
                    APPROVED -> Value.APPROVED
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
                    else -> throw LithicInvalidDataException("Unknown DetailedResults: $value")
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

                return /* spotless:off */ other is DetailedResults && value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ManagementOperationEventType
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

                @JvmField val CASH_BACK = of("CASH_BACK")

                @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

                @JvmField val INTEREST = of("INTEREST")

                @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

                @JvmField val BILLING_ERROR = of("BILLING_ERROR")

                @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

                @JvmField val CASH_BACK_REVERSAL = of("CASH_BACK_REVERSAL")

                @JvmField val CURRENCY_CONVERSION_REVERSAL = of("CURRENCY_CONVERSION_REVERSAL")

                @JvmField val INTEREST_REVERSAL = of("INTEREST_REVERSAL")

                @JvmField val LATE_PAYMENT_REVERSAL = of("LATE_PAYMENT_REVERSAL")

                @JvmField val BILLING_ERROR_REVERSAL = of("BILLING_ERROR_REVERSAL")

                @JvmField val PROVISIONAL_CREDIT_REVERSAL = of("PROVISIONAL_CREDIT_REVERSAL")

                @JvmField val RETURNED_PAYMENT = of("RETURNED_PAYMENT")

                @JvmField val RETURNED_PAYMENT_REVERSAL = of("RETURNED_PAYMENT_REVERSAL")

                @JvmStatic fun of(value: String) = ManagementOperationEventType(JsonField.of(value))
            }

            /** An enum containing [ManagementOperationEventType]'s known values. */
            enum class Known {
                CASH_BACK,
                CURRENCY_CONVERSION,
                INTEREST,
                LATE_PAYMENT,
                BILLING_ERROR,
                PROVISIONAL_CREDIT,
                CASH_BACK_REVERSAL,
                CURRENCY_CONVERSION_REVERSAL,
                INTEREST_REVERSAL,
                LATE_PAYMENT_REVERSAL,
                BILLING_ERROR_REVERSAL,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURNED_PAYMENT,
                RETURNED_PAYMENT_REVERSAL,
            }

            /**
             * An enum containing [ManagementOperationEventType]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [ManagementOperationEventType] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CASH_BACK,
                CURRENCY_CONVERSION,
                INTEREST,
                LATE_PAYMENT,
                BILLING_ERROR,
                PROVISIONAL_CREDIT,
                CASH_BACK_REVERSAL,
                CURRENCY_CONVERSION_REVERSAL,
                INTEREST_REVERSAL,
                LATE_PAYMENT_REVERSAL,
                BILLING_ERROR_REVERSAL,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURNED_PAYMENT,
                RETURNED_PAYMENT_REVERSAL,
                /**
                 * An enum member indicating that [ManagementOperationEventType] was instantiated
                 * with an unknown value.
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
                    CASH_BACK -> Value.CASH_BACK
                    CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                    INTEREST -> Value.INTEREST
                    LATE_PAYMENT -> Value.LATE_PAYMENT
                    BILLING_ERROR -> Value.BILLING_ERROR
                    PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                    CASH_BACK_REVERSAL -> Value.CASH_BACK_REVERSAL
                    CURRENCY_CONVERSION_REVERSAL -> Value.CURRENCY_CONVERSION_REVERSAL
                    INTEREST_REVERSAL -> Value.INTEREST_REVERSAL
                    LATE_PAYMENT_REVERSAL -> Value.LATE_PAYMENT_REVERSAL
                    BILLING_ERROR_REVERSAL -> Value.BILLING_ERROR_REVERSAL
                    PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                    RETURNED_PAYMENT -> Value.RETURNED_PAYMENT
                    RETURNED_PAYMENT_REVERSAL -> Value.RETURNED_PAYMENT_REVERSAL
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
                    CASH_BACK -> Known.CASH_BACK
                    CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                    INTEREST -> Known.INTEREST
                    LATE_PAYMENT -> Known.LATE_PAYMENT
                    BILLING_ERROR -> Known.BILLING_ERROR
                    PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                    CASH_BACK_REVERSAL -> Known.CASH_BACK_REVERSAL
                    CURRENCY_CONVERSION_REVERSAL -> Known.CURRENCY_CONVERSION_REVERSAL
                    INTEREST_REVERSAL -> Known.INTEREST_REVERSAL
                    LATE_PAYMENT_REVERSAL -> Known.LATE_PAYMENT_REVERSAL
                    BILLING_ERROR_REVERSAL -> Known.BILLING_ERROR_REVERSAL
                    PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                    RETURNED_PAYMENT -> Known.RETURNED_PAYMENT
                    RETURNED_PAYMENT_REVERSAL -> Known.RETURNED_PAYMENT_REVERSAL
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown ManagementOperationEventType: $value"
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ManagementOperationEventType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationEvent && token == other.token && amount == other.amount && created == other.created && detailedResults == other.detailedResults && effectiveDate == other.effectiveDate && memo == other.memo && result == other.result && type == other.type && subtype == other.subtype && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, created, detailedResults, effectiveDate, memo, result, type, subtype, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ManagementOperationEvent{token=$token, amount=$amount, created=$created, detailedResults=$detailedResults, effectiveDate=$effectiveDate, memo=$memo, result=$result, type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"
    }

    class TransactionResult @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
        }

        /** An enum containing [TransactionResult]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
        }

        /**
         * An enum containing [TransactionResult]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            /**
             * An enum member indicating that [TransactionResult] was instantiated with an unknown
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
                DECLINED -> Value.DECLINED
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
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
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

            return /* spotless:off */ other is TransactionResult && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TransactionStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * An enum containing [TransactionStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            SETTLED,
            DECLINED,
            REVERSED,
            CANCELED,
            /**
             * An enum member indicating that [TransactionStatus] was instantiated with an unknown
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

            return /* spotless:off */ other is TransactionStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationTransaction && token == other.token && category == other.category && created == other.created && currency == other.currency && direction == other.direction && events == other.events && financialAccountToken == other.financialAccountToken && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && status == other.status && updated == other.updated && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, category, created, currency, direction, events, financialAccountToken, pendingAmount, result, settledAmount, status, updated, userDefinedId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ManagementOperationTransaction{token=$token, category=$category, created=$created, currency=$currency, direction=$direction, events=$events, financialAccountToken=$financialAccountToken, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, updated=$updated, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
}
