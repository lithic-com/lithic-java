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
class ExternalPayment
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("category")
    @ExcludeMissing
    private val category: JsonField<ExternalPaymentCategory> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<ExternalPaymentEvent>> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_type")
    @ExcludeMissing
    private val paymentType: JsonField<ExternalPaymentDirection> = JsonMissing.of(),
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

    fun category(): ExternalPaymentCategory = category.getRequired("category")

    fun created(): OffsetDateTime = created.getRequired("created")

    fun currency(): String = currency.getRequired("currency")

    fun events(): List<ExternalPaymentEvent> = events.getRequired("events")

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun paymentType(): ExternalPaymentDirection = paymentType.getRequired("payment_type")

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
    fun _category(): JsonField<ExternalPaymentCategory> = category

    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<ExternalPaymentEvent>> = events

    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    @JsonProperty("payment_type")
    @ExcludeMissing
    fun _paymentType(): JsonField<ExternalPaymentDirection> = paymentType

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

    fun validate(): ExternalPayment = apply {
        if (validated) {
            return@apply
        }

        token()
        category()
        created()
        currency()
        events().forEach { it.validate() }
        financialAccountToken()
        paymentType()
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

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalPayment]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var category: JsonField<ExternalPaymentCategory>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var events: JsonField<MutableList<ExternalPaymentEvent>>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var paymentType: JsonField<ExternalPaymentDirection>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var result: JsonField<TransactionResult>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<TransactionStatus>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalPayment: ExternalPayment) = apply {
            token = externalPayment.token
            category = externalPayment.category
            created = externalPayment.created
            currency = externalPayment.currency
            events = externalPayment.events.map { it.toMutableList() }
            financialAccountToken = externalPayment.financialAccountToken
            paymentType = externalPayment.paymentType
            pendingAmount = externalPayment.pendingAmount
            result = externalPayment.result
            settledAmount = externalPayment.settledAmount
            status = externalPayment.status
            updated = externalPayment.updated
            userDefinedId = externalPayment.userDefinedId
            additionalProperties = externalPayment.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        fun token(token: JsonField<String>) = apply { this.token = token }

        fun category(category: ExternalPaymentCategory) = category(JsonField.of(category))

        fun category(category: JsonField<ExternalPaymentCategory>) = apply {
            this.category = category
        }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun currency(currency: String) = currency(JsonField.of(currency))

        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun events(events: List<ExternalPaymentEvent>) = events(JsonField.of(events))

        fun events(events: JsonField<List<ExternalPaymentEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        fun addEvent(event: ExternalPaymentEvent) = apply {
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

        fun paymentType(paymentType: ExternalPaymentDirection) =
            paymentType(JsonField.of(paymentType))

        fun paymentType(paymentType: JsonField<ExternalPaymentDirection>) = apply {
            this.paymentType = paymentType
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

        fun build(): ExternalPayment =
            ExternalPayment(
                checkRequired("token", token),
                checkRequired("category", category),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("paymentType", paymentType),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("result", result),
                checkRequired("settledAmount", settledAmount),
                checkRequired("status", status),
                checkRequired("updated", updated),
                userDefinedId,
                additionalProperties.toImmutable(),
            )
    }

    class ExternalPaymentCategory
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

            @JvmField val EXTERNAL_WIRE = of("EXTERNAL_WIRE")

            @JvmField val EXTERNAL_ACH = of("EXTERNAL_ACH")

            @JvmField val EXTERNAL_CHECK = of("EXTERNAL_CHECK")

            @JvmField val EXTERNAL_TRANSFER = of("EXTERNAL_TRANSFER")

            @JvmStatic fun of(value: String) = ExternalPaymentCategory(JsonField.of(value))
        }

        /** An enum containing [ExternalPaymentCategory]'s known values. */
        enum class Known {
            EXTERNAL_WIRE,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_TRANSFER,
        }

        /**
         * An enum containing [ExternalPaymentCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalPaymentCategory] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXTERNAL_WIRE,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_TRANSFER,
            /**
             * An enum member indicating that [ExternalPaymentCategory] was instantiated with an
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
                EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                EXTERNAL_ACH -> Value.EXTERNAL_ACH
                EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
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
                EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                EXTERNAL_ACH -> Known.EXTERNAL_ACH
                EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                else -> throw LithicInvalidDataException("Unknown ExternalPaymentCategory: $value")
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

            return /* spotless:off */ other is ExternalPaymentCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class ExternalPaymentEvent
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
        private val type: JsonField<ExternalPaymentEventType> = JsonMissing.of(),
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

        fun type(): ExternalPaymentEventType = type.getRequired("type")

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
        fun _type(): JsonField<ExternalPaymentEventType> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalPaymentEvent = apply {
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
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalPaymentEvent]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var detailedResults: JsonField<MutableList<DetailedResults>>? = null
            private var effectiveDate: JsonField<LocalDate>? = null
            private var memo: JsonField<String>? = null
            private var result: JsonField<TransactionResult>? = null
            private var type: JsonField<ExternalPaymentEventType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalPaymentEvent: ExternalPaymentEvent) = apply {
                token = externalPaymentEvent.token
                amount = externalPaymentEvent.amount
                created = externalPaymentEvent.created
                detailedResults = externalPaymentEvent.detailedResults.map { it.toMutableList() }
                effectiveDate = externalPaymentEvent.effectiveDate
                memo = externalPaymentEvent.memo
                result = externalPaymentEvent.result
                type = externalPaymentEvent.type
                additionalProperties = externalPaymentEvent.additionalProperties.toMutableMap()
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

            fun type(type: ExternalPaymentEventType) = type(JsonField.of(type))

            fun type(type: JsonField<ExternalPaymentEventType>) = apply { this.type = type }

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

            fun build(): ExternalPaymentEvent =
                ExternalPaymentEvent(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("created", created),
                    checkRequired("detailedResults", detailedResults).map { it.toImmutable() },
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("memo", memo),
                    checkRequired("result", result),
                    checkRequired("type", type),
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

        class ExternalPaymentEventType
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

                @JvmField val EXTERNAL_WIRE_INITIATED = of("EXTERNAL_WIRE_INITIATED")

                @JvmField val EXTERNAL_WIRE_CANCELED = of("EXTERNAL_WIRE_CANCELED")

                @JvmField val EXTERNAL_WIRE_SETTLED = of("EXTERNAL_WIRE_SETTLED")

                @JvmField val EXTERNAL_WIRE_REVERSED = of("EXTERNAL_WIRE_REVERSED")

                @JvmField val EXTERNAL_WIRE_RELEASED = of("EXTERNAL_WIRE_RELEASED")

                @JvmField val EXTERNAL_ACH_INITIATED = of("EXTERNAL_ACH_INITIATED")

                @JvmField val EXTERNAL_ACH_CANCELED = of("EXTERNAL_ACH_CANCELED")

                @JvmField val EXTERNAL_ACH_SETTLED = of("EXTERNAL_ACH_SETTLED")

                @JvmField val EXTERNAL_ACH_REVERSED = of("EXTERNAL_ACH_REVERSED")

                @JvmField val EXTERNAL_ACH_RELEASED = of("EXTERNAL_ACH_RELEASED")

                @JvmField val EXTERNAL_TRANSFER_INITIATED = of("EXTERNAL_TRANSFER_INITIATED")

                @JvmField val EXTERNAL_TRANSFER_CANCELED = of("EXTERNAL_TRANSFER_CANCELED")

                @JvmField val EXTERNAL_TRANSFER_SETTLED = of("EXTERNAL_TRANSFER_SETTLED")

                @JvmField val EXTERNAL_TRANSFER_REVERSED = of("EXTERNAL_TRANSFER_REVERSED")

                @JvmField val EXTERNAL_TRANSFER_RELEASED = of("EXTERNAL_TRANSFER_RELEASED")

                @JvmField val EXTERNAL_CHECK_INITIATED = of("EXTERNAL_CHECK_INITIATED")

                @JvmField val EXTERNAL_CHECK_CANCELED = of("EXTERNAL_CHECK_CANCELED")

                @JvmField val EXTERNAL_CHECK_SETTLED = of("EXTERNAL_CHECK_SETTLED")

                @JvmField val EXTERNAL_CHECK_REVERSED = of("EXTERNAL_CHECK_REVERSED")

                @JvmField val EXTERNAL_CHECK_RELEASED = of("EXTERNAL_CHECK_RELEASED")

                @JvmStatic fun of(value: String) = ExternalPaymentEventType(JsonField.of(value))
            }

            /** An enum containing [ExternalPaymentEventType]'s known values. */
            enum class Known {
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_SETTLED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_RELEASED,
            }

            /**
             * An enum containing [ExternalPaymentEventType]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [ExternalPaymentEventType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_SETTLED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_RELEASED,
                /**
                 * An enum member indicating that [ExternalPaymentEventType] was instantiated with
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
                    EXTERNAL_WIRE_INITIATED -> Value.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_CANCELED -> Value.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_SETTLED -> Value.EXTERNAL_WIRE_SETTLED
                    EXTERNAL_WIRE_REVERSED -> Value.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_RELEASED -> Value.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_ACH_INITIATED -> Value.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_CANCELED -> Value.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_SETTLED -> Value.EXTERNAL_ACH_SETTLED
                    EXTERNAL_ACH_REVERSED -> Value.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_RELEASED -> Value.EXTERNAL_ACH_RELEASED
                    EXTERNAL_TRANSFER_INITIATED -> Value.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_CANCELED -> Value.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_SETTLED -> Value.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_TRANSFER_REVERSED -> Value.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_RELEASED -> Value.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_CHECK_INITIATED -> Value.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_CANCELED -> Value.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_SETTLED -> Value.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_CHECK_REVERSED -> Value.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_RELEASED -> Value.EXTERNAL_CHECK_RELEASED
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
                    EXTERNAL_WIRE_INITIATED -> Known.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_CANCELED -> Known.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_SETTLED -> Known.EXTERNAL_WIRE_SETTLED
                    EXTERNAL_WIRE_REVERSED -> Known.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_RELEASED -> Known.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_ACH_INITIATED -> Known.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_CANCELED -> Known.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_SETTLED -> Known.EXTERNAL_ACH_SETTLED
                    EXTERNAL_ACH_REVERSED -> Known.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_RELEASED -> Known.EXTERNAL_ACH_RELEASED
                    EXTERNAL_TRANSFER_INITIATED -> Known.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_CANCELED -> Known.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_SETTLED -> Known.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_TRANSFER_REVERSED -> Known.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_RELEASED -> Known.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_CHECK_INITIATED -> Known.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_CANCELED -> Known.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_SETTLED -> Known.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_CHECK_REVERSED -> Known.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_RELEASED -> Known.EXTERNAL_CHECK_RELEASED
                    else ->
                        throw LithicInvalidDataException("Unknown ExternalPaymentEventType: $value")
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

                return /* spotless:off */ other is ExternalPaymentEventType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentEvent && token == other.token && amount == other.amount && created == other.created && detailedResults == other.detailedResults && effectiveDate == other.effectiveDate && memo == other.memo && result == other.result && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, created, detailedResults, effectiveDate, memo, result, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalPaymentEvent{token=$token, amount=$amount, created=$created, detailedResults=$detailedResults, effectiveDate=$effectiveDate, memo=$memo, result=$result, type=$type, additionalProperties=$additionalProperties}"
    }

    class ExternalPaymentDirection
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

            @JvmField val DEPOSIT = of("DEPOSIT")

            @JvmField val WITHDRAWAL = of("WITHDRAWAL")

            @JvmStatic fun of(value: String) = ExternalPaymentDirection(JsonField.of(value))
        }

        /** An enum containing [ExternalPaymentDirection]'s known values. */
        enum class Known {
            DEPOSIT,
            WITHDRAWAL,
        }

        /**
         * An enum containing [ExternalPaymentDirection]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalPaymentDirection] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEPOSIT,
            WITHDRAWAL,
            /**
             * An enum member indicating that [ExternalPaymentDirection] was instantiated with an
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
                DEPOSIT -> Value.DEPOSIT
                WITHDRAWAL -> Value.WITHDRAWAL
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
                DEPOSIT -> Known.DEPOSIT
                WITHDRAWAL -> Known.WITHDRAWAL
                else -> throw LithicInvalidDataException("Unknown ExternalPaymentDirection: $value")
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

            return /* spotless:off */ other is ExternalPaymentDirection && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return /* spotless:off */ other is ExternalPayment && token == other.token && category == other.category && created == other.created && currency == other.currency && events == other.events && financialAccountToken == other.financialAccountToken && paymentType == other.paymentType && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && status == other.status && updated == other.updated && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, category, created, currency, events, financialAccountToken, paymentType, pendingAmount, result, settledAmount, status, updated, userDefinedId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalPayment{token=$token, category=$category, created=$created, currency=$currency, events=$events, financialAccountToken=$financialAccountToken, paymentType=$paymentType, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, updated=$updated, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
}
