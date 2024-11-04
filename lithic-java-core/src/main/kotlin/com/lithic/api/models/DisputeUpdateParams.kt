// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class DisputeUpdateParams
constructor(
    private val disputeToken: String,
    private val amount: Long?,
    private val customerFiledDate: OffsetDateTime?,
    private val customerNote: String?,
    private val reason: Reason?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun disputeToken(): String = disputeToken

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    fun customerFiledDate(): Optional<OffsetDateTime> = Optional.ofNullable(customerFiledDate)

    fun customerNote(): Optional<String> = Optional.ofNullable(customerNote)

    fun reason(): Optional<Reason> = Optional.ofNullable(reason)

    @JvmSynthetic
    internal fun getBody(): DisputeUpdateBody {
        return DisputeUpdateBody(
            amount,
            customerFiledDate,
            customerNote,
            reason,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> disputeToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = DisputeUpdateBody.Builder::class)
    @NoAutoDetect
    class DisputeUpdateBody
    internal constructor(
        private val amount: Long?,
        private val customerFiledDate: OffsetDateTime?,
        private val customerNote: String?,
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Amount to dispute */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Date the customer filed the dispute */
        @JsonProperty("customer_filed_date")
        fun customerFiledDate(): OffsetDateTime? = customerFiledDate

        /** Customer description of dispute */
        @JsonProperty("customer_note") fun customerNote(): String? = customerNote

        /** Reason for dispute */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var customerFiledDate: OffsetDateTime? = null
            private var customerNote: String? = null
            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(disputeUpdateBody: DisputeUpdateBody) = apply {
                this.amount = disputeUpdateBody.amount
                this.customerFiledDate = disputeUpdateBody.customerFiledDate
                this.customerNote = disputeUpdateBody.customerNote
                this.reason = disputeUpdateBody.reason
                additionalProperties(disputeUpdateBody.additionalProperties)
            }

            /** Amount to dispute */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Date the customer filed the dispute */
            @JsonProperty("customer_filed_date")
            fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
                this.customerFiledDate = customerFiledDate
            }

            /** Customer description of dispute */
            @JsonProperty("customer_note")
            fun customerNote(customerNote: String) = apply { this.customerNote = customerNote }

            /** Reason for dispute */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): DisputeUpdateBody =
                DisputeUpdateBody(
                    amount,
                    customerFiledDate,
                    customerNote,
                    reason,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DisputeUpdateBody && this.amount == other.amount && this.customerFiledDate == other.customerFiledDate && this.customerNote == other.customerNote && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, customerFiledDate, customerNote, reason, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DisputeUpdateBody{amount=$amount, customerFiledDate=$customerFiledDate, customerNote=$customerNote, reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeUpdateParams && this.disputeToken == other.disputeToken && this.amount == other.amount && this.customerFiledDate == other.customerFiledDate && this.customerNote == other.customerNote && this.reason == other.reason && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(disputeToken, amount, customerFiledDate, customerNote, reason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "DisputeUpdateParams{disputeToken=$disputeToken, amount=$amount, customerFiledDate=$customerFiledDate, customerNote=$customerNote, reason=$reason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var disputeToken: String? = null
        private var amount: Long? = null
        private var customerFiledDate: OffsetDateTime? = null
        private var customerNote: String? = null
        private var reason: Reason? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(disputeUpdateParams: DisputeUpdateParams) = apply {
            this.disputeToken = disputeUpdateParams.disputeToken
            this.amount = disputeUpdateParams.amount
            this.customerFiledDate = disputeUpdateParams.customerFiledDate
            this.customerNote = disputeUpdateParams.customerNote
            this.reason = disputeUpdateParams.reason
            additionalHeaders(disputeUpdateParams.additionalHeaders)
            additionalQueryParams(disputeUpdateParams.additionalQueryParams)
            additionalBodyProperties(disputeUpdateParams.additionalBodyProperties)
        }

        fun disputeToken(disputeToken: String) = apply { this.disputeToken = disputeToken }

        /** Amount to dispute */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
            this.customerFiledDate = customerFiledDate
        }

        /** Customer description of dispute */
        fun customerNote(customerNote: String) = apply { this.customerNote = customerNote }

        /** Reason for dispute */
        fun reason(reason: Reason) = apply { this.reason = reason }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DisputeUpdateParams =
            DisputeUpdateParams(
                checkNotNull(disputeToken) { "`disputeToken` is required but was not set" },
                amount,
                customerFiledDate,
                customerNote,
                reason,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ATM_CASH_MISDISPENSE = Reason(JsonField.of("ATM_CASH_MISDISPENSE"))

            @JvmField val CANCELLED = Reason(JsonField.of("CANCELLED"))

            @JvmField val DUPLICATED = Reason(JsonField.of("DUPLICATED"))

            @JvmField val FRAUD_CARD_NOT_PRESENT = Reason(JsonField.of("FRAUD_CARD_NOT_PRESENT"))

            @JvmField val FRAUD_CARD_PRESENT = Reason(JsonField.of("FRAUD_CARD_PRESENT"))

            @JvmField val FRAUD_OTHER = Reason(JsonField.of("FRAUD_OTHER"))

            @JvmField
            val GOODS_SERVICES_NOT_AS_DESCRIBED =
                Reason(JsonField.of("GOODS_SERVICES_NOT_AS_DESCRIBED"))

            @JvmField
            val GOODS_SERVICES_NOT_RECEIVED = Reason(JsonField.of("GOODS_SERVICES_NOT_RECEIVED"))

            @JvmField val INCORRECT_AMOUNT = Reason(JsonField.of("INCORRECT_AMOUNT"))

            @JvmField val MISSING_AUTH = Reason(JsonField.of("MISSING_AUTH"))

            @JvmField val OTHER = Reason(JsonField.of("OTHER"))

            @JvmField val PROCESSING_ERROR = Reason(JsonField.of("PROCESSING_ERROR"))

            @JvmField
            val RECURRING_TRANSACTION_NOT_CANCELLED =
                Reason(JsonField.of("RECURRING_TRANSACTION_NOT_CANCELLED"))

            @JvmField val REFUND_NOT_PROCESSED = Reason(JsonField.of("REFUND_NOT_PROCESSED"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            ATM_CASH_MISDISPENSE,
            CANCELLED,
            DUPLICATED,
            FRAUD_CARD_NOT_PRESENT,
            FRAUD_CARD_PRESENT,
            FRAUD_OTHER,
            GOODS_SERVICES_NOT_AS_DESCRIBED,
            GOODS_SERVICES_NOT_RECEIVED,
            INCORRECT_AMOUNT,
            MISSING_AUTH,
            OTHER,
            PROCESSING_ERROR,
            RECURRING_TRANSACTION_NOT_CANCELLED,
            REFUND_NOT_PROCESSED,
        }

        enum class Value {
            ATM_CASH_MISDISPENSE,
            CANCELLED,
            DUPLICATED,
            FRAUD_CARD_NOT_PRESENT,
            FRAUD_CARD_PRESENT,
            FRAUD_OTHER,
            GOODS_SERVICES_NOT_AS_DESCRIBED,
            GOODS_SERVICES_NOT_RECEIVED,
            INCORRECT_AMOUNT,
            MISSING_AUTH,
            OTHER,
            PROCESSING_ERROR,
            RECURRING_TRANSACTION_NOT_CANCELLED,
            REFUND_NOT_PROCESSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ATM_CASH_MISDISPENSE -> Value.ATM_CASH_MISDISPENSE
                CANCELLED -> Value.CANCELLED
                DUPLICATED -> Value.DUPLICATED
                FRAUD_CARD_NOT_PRESENT -> Value.FRAUD_CARD_NOT_PRESENT
                FRAUD_CARD_PRESENT -> Value.FRAUD_CARD_PRESENT
                FRAUD_OTHER -> Value.FRAUD_OTHER
                GOODS_SERVICES_NOT_AS_DESCRIBED -> Value.GOODS_SERVICES_NOT_AS_DESCRIBED
                GOODS_SERVICES_NOT_RECEIVED -> Value.GOODS_SERVICES_NOT_RECEIVED
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                MISSING_AUTH -> Value.MISSING_AUTH
                OTHER -> Value.OTHER
                PROCESSING_ERROR -> Value.PROCESSING_ERROR
                RECURRING_TRANSACTION_NOT_CANCELLED -> Value.RECURRING_TRANSACTION_NOT_CANCELLED
                REFUND_NOT_PROCESSED -> Value.REFUND_NOT_PROCESSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ATM_CASH_MISDISPENSE -> Known.ATM_CASH_MISDISPENSE
                CANCELLED -> Known.CANCELLED
                DUPLICATED -> Known.DUPLICATED
                FRAUD_CARD_NOT_PRESENT -> Known.FRAUD_CARD_NOT_PRESENT
                FRAUD_CARD_PRESENT -> Known.FRAUD_CARD_PRESENT
                FRAUD_OTHER -> Known.FRAUD_OTHER
                GOODS_SERVICES_NOT_AS_DESCRIBED -> Known.GOODS_SERVICES_NOT_AS_DESCRIBED
                GOODS_SERVICES_NOT_RECEIVED -> Known.GOODS_SERVICES_NOT_RECEIVED
                INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                MISSING_AUTH -> Known.MISSING_AUTH
                OTHER -> Known.OTHER
                PROCESSING_ERROR -> Known.PROCESSING_ERROR
                RECURRING_TRANSACTION_NOT_CANCELLED -> Known.RECURRING_TRANSACTION_NOT_CANCELLED
                REFUND_NOT_PROCESSED -> Known.REFUND_NOT_PROCESSED
                else -> throw LithicInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
