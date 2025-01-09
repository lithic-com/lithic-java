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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Update dispute. Can only be modified if status is `NEW`. */
class DisputeUpdateParams
constructor(
    private val disputeToken: String,
    private val body: DisputeUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun disputeToken(): String = disputeToken

    /** Amount to dispute */
    fun amount(): Optional<Long> = body.amount()

    /** Date the customer filed the dispute */
    fun customerFiledDate(): Optional<OffsetDateTime> = body.customerFiledDate()

    /** Customer description of dispute */
    fun customerNote(): Optional<String> = body.customerNote()

    /** Reason for dispute */
    fun reason(): Optional<Reason> = body.reason()

    /** Amount to dispute */
    fun _amount(): JsonField<Long> = body._amount()

    /** Date the customer filed the dispute */
    fun _customerFiledDate(): JsonField<OffsetDateTime> = body._customerFiledDate()

    /** Customer description of dispute */
    fun _customerNote(): JsonField<String> = body._customerNote()

    /** Reason for dispute */
    fun _reason(): JsonField<Reason> = body._reason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): DisputeUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> disputeToken
            else -> ""
        }
    }

    @NoAutoDetect
    class DisputeUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("customer_filed_date")
        @ExcludeMissing
        private val customerFiledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_note")
        @ExcludeMissing
        private val customerNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Amount to dispute */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** Date the customer filed the dispute */
        fun customerFiledDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(customerFiledDate.getNullable("customer_filed_date"))

        /** Customer description of dispute */
        fun customerNote(): Optional<String> =
            Optional.ofNullable(customerNote.getNullable("customer_note"))

        /** Reason for dispute */
        fun reason(): Optional<Reason> = Optional.ofNullable(reason.getNullable("reason"))

        /** Amount to dispute */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Date the customer filed the dispute */
        @JsonProperty("customer_filed_date")
        @ExcludeMissing
        fun _customerFiledDate(): JsonField<OffsetDateTime> = customerFiledDate

        /** Customer description of dispute */
        @JsonProperty("customer_note")
        @ExcludeMissing
        fun _customerNote(): JsonField<String> = customerNote

        /** Reason for dispute */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DisputeUpdateBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            customerFiledDate()
            customerNote()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var customerFiledDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerNote: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(disputeUpdateBody: DisputeUpdateBody) = apply {
                amount = disputeUpdateBody.amount
                customerFiledDate = disputeUpdateBody.customerFiledDate
                customerNote = disputeUpdateBody.customerNote
                reason = disputeUpdateBody.reason
                additionalProperties = disputeUpdateBody.additionalProperties.toMutableMap()
            }

            /** Amount to dispute */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount to dispute */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Date the customer filed the dispute */
            fun customerFiledDate(customerFiledDate: OffsetDateTime) =
                customerFiledDate(JsonField.of(customerFiledDate))

            /** Date the customer filed the dispute */
            fun customerFiledDate(customerFiledDate: JsonField<OffsetDateTime>) = apply {
                this.customerFiledDate = customerFiledDate
            }

            /** Customer description of dispute */
            fun customerNote(customerNote: String) = customerNote(JsonField.of(customerNote))

            /** Customer description of dispute */
            fun customerNote(customerNote: JsonField<String>) = apply {
                this.customerNote = customerNote
            }

            /** Reason for dispute */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Reason for dispute */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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

            return /* spotless:off */ other is DisputeUpdateBody && amount == other.amount && customerFiledDate == other.customerFiledDate && customerNote == other.customerNote && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, customerFiledDate, customerNote, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DisputeUpdateBody{amount=$amount, customerFiledDate=$customerFiledDate, customerNote=$customerNote, reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var disputeToken: String? = null
        private var body: DisputeUpdateBody.Builder = DisputeUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(disputeUpdateParams: DisputeUpdateParams) = apply {
            disputeToken = disputeUpdateParams.disputeToken
            body = disputeUpdateParams.body.toBuilder()
            additionalHeaders = disputeUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = disputeUpdateParams.additionalQueryParams.toBuilder()
        }

        fun disputeToken(disputeToken: String) = apply { this.disputeToken = disputeToken }

        /** Amount to dispute */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** Amount to dispute */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
            body.customerFiledDate(customerFiledDate)
        }

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: JsonField<OffsetDateTime>) = apply {
            body.customerFiledDate(customerFiledDate)
        }

        /** Customer description of dispute */
        fun customerNote(customerNote: String) = apply { body.customerNote(customerNote) }

        /** Customer description of dispute */
        fun customerNote(customerNote: JsonField<String>) = apply {
            body.customerNote(customerNote)
        }

        /** Reason for dispute */
        fun reason(reason: Reason) = apply { body.reason(reason) }

        /** Reason for dispute */
        fun reason(reason: JsonField<Reason>) = apply { body.reason(reason) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): DisputeUpdateParams =
            DisputeUpdateParams(
                checkNotNull(disputeToken) { "`disputeToken` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ATM_CASH_MISDISPENSE = of("ATM_CASH_MISDISPENSE")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmField val DUPLICATED = of("DUPLICATED")

            @JvmField val FRAUD_CARD_NOT_PRESENT = of("FRAUD_CARD_NOT_PRESENT")

            @JvmField val FRAUD_CARD_PRESENT = of("FRAUD_CARD_PRESENT")

            @JvmField val FRAUD_OTHER = of("FRAUD_OTHER")

            @JvmField val GOODS_SERVICES_NOT_AS_DESCRIBED = of("GOODS_SERVICES_NOT_AS_DESCRIBED")

            @JvmField val GOODS_SERVICES_NOT_RECEIVED = of("GOODS_SERVICES_NOT_RECEIVED")

            @JvmField val INCORRECT_AMOUNT = of("INCORRECT_AMOUNT")

            @JvmField val MISSING_AUTH = of("MISSING_AUTH")

            @JvmField val OTHER = of("OTHER")

            @JvmField val PROCESSING_ERROR = of("PROCESSING_ERROR")

            @JvmField
            val RECURRING_TRANSACTION_NOT_CANCELLED = of("RECURRING_TRANSACTION_NOT_CANCELLED")

            @JvmField val REFUND_NOT_PROCESSED = of("REFUND_NOT_PROCESSED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeUpdateParams && disputeToken == other.disputeToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputeToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DisputeUpdateParams{disputeToken=$disputeToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
