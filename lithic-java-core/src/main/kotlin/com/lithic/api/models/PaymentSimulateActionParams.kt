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
import java.util.Objects
import java.util.Optional

class PaymentSimulateActionParams
constructor(
    private val paymentToken: String,
    private val eventType: SupportedSimulationTypes,
    private val declineReason: SupportedSimulationDeclineReasons?,
    private val returnReasonCode: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun paymentToken(): String = paymentToken

    fun eventType(): SupportedSimulationTypes = eventType

    fun declineReason(): Optional<SupportedSimulationDeclineReasons> =
        Optional.ofNullable(declineReason)

    fun returnReasonCode(): Optional<String> = Optional.ofNullable(returnReasonCode)

    @JvmSynthetic
    internal fun getBody(): PaymentSimulateActionBody {
        return PaymentSimulateActionBody(
            eventType,
            declineReason,
            returnReasonCode,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> paymentToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = PaymentSimulateActionBody.Builder::class)
    @NoAutoDetect
    class PaymentSimulateActionBody
    internal constructor(
        private val eventType: SupportedSimulationTypes?,
        private val declineReason: SupportedSimulationDeclineReasons?,
        private val returnReasonCode: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Event Type */
        @JsonProperty("event_type") fun eventType(): SupportedSimulationTypes? = eventType

        /** Decline reason */
        @JsonProperty("decline_reason")
        fun declineReason(): SupportedSimulationDeclineReasons? = declineReason

        /** Return Reason Code */
        @JsonProperty("return_reason_code") fun returnReasonCode(): String? = returnReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var eventType: SupportedSimulationTypes? = null
            private var declineReason: SupportedSimulationDeclineReasons? = null
            private var returnReasonCode: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentSimulateActionBody: PaymentSimulateActionBody) = apply {
                this.eventType = paymentSimulateActionBody.eventType
                this.declineReason = paymentSimulateActionBody.declineReason
                this.returnReasonCode = paymentSimulateActionBody.returnReasonCode
                additionalProperties(paymentSimulateActionBody.additionalProperties)
            }

            /** Event Type */
            @JsonProperty("event_type")
            fun eventType(eventType: SupportedSimulationTypes) = apply {
                this.eventType = eventType
            }

            /** Decline reason */
            @JsonProperty("decline_reason")
            fun declineReason(declineReason: SupportedSimulationDeclineReasons) = apply {
                this.declineReason = declineReason
            }

            /** Return Reason Code */
            @JsonProperty("return_reason_code")
            fun returnReasonCode(returnReasonCode: String) = apply {
                this.returnReasonCode = returnReasonCode
            }

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

            fun build(): PaymentSimulateActionBody =
                PaymentSimulateActionBody(
                    checkNotNull(eventType) { "`eventType` is required but was not set" },
                    declineReason,
                    returnReasonCode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentSimulateActionBody && this.eventType == other.eventType && this.declineReason == other.declineReason && this.returnReasonCode == other.returnReasonCode && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(eventType, declineReason, returnReasonCode, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PaymentSimulateActionBody{eventType=$eventType, declineReason=$declineReason, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentSimulateActionParams && this.paymentToken == other.paymentToken && this.eventType == other.eventType && this.declineReason == other.declineReason && this.returnReasonCode == other.returnReasonCode && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(paymentToken, eventType, declineReason, returnReasonCode, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "PaymentSimulateActionParams{paymentToken=$paymentToken, eventType=$eventType, declineReason=$declineReason, returnReasonCode=$returnReasonCode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var paymentToken: String? = null
        private var eventType: SupportedSimulationTypes? = null
        private var declineReason: SupportedSimulationDeclineReasons? = null
        private var returnReasonCode: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentSimulateActionParams: PaymentSimulateActionParams) = apply {
            this.paymentToken = paymentSimulateActionParams.paymentToken
            this.eventType = paymentSimulateActionParams.eventType
            this.declineReason = paymentSimulateActionParams.declineReason
            this.returnReasonCode = paymentSimulateActionParams.returnReasonCode
            additionalHeaders(paymentSimulateActionParams.additionalHeaders)
            additionalQueryParams(paymentSimulateActionParams.additionalQueryParams)
            additionalBodyProperties(paymentSimulateActionParams.additionalBodyProperties)
        }

        fun paymentToken(paymentToken: String) = apply { this.paymentToken = paymentToken }

        /** Event Type */
        fun eventType(eventType: SupportedSimulationTypes) = apply { this.eventType = eventType }

        /** Decline reason */
        fun declineReason(declineReason: SupportedSimulationDeclineReasons) = apply {
            this.declineReason = declineReason
        }

        /** Return Reason Code */
        fun returnReasonCode(returnReasonCode: String) = apply {
            this.returnReasonCode = returnReasonCode
        }

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

        fun build(): PaymentSimulateActionParams =
            PaymentSimulateActionParams(
                checkNotNull(paymentToken) { "`paymentToken` is required but was not set" },
                checkNotNull(eventType) { "`eventType` is required but was not set" },
                declineReason,
                returnReasonCode,
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

    class SupportedSimulationTypes
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SupportedSimulationTypes && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val ACH_ORIGINATION_REVIEWED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_REVIEWED"))

            @JvmField
            val ACH_ORIGINATION_RELEASED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_RELEASED"))

            @JvmField
            val ACH_ORIGINATION_PROCESSED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_PROCESSED"))

            @JvmField
            val ACH_ORIGINATION_SETTLED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_SETTLED"))

            @JvmField
            val ACH_RECEIPT_SETTLED = SupportedSimulationTypes(JsonField.of("ACH_RECEIPT_SETTLED"))

            @JvmField
            val ACH_RETURN_INITIATED =
                SupportedSimulationTypes(JsonField.of("ACH_RETURN_INITIATED"))

            @JvmField
            val ACH_RETURN_PROCESSED =
                SupportedSimulationTypes(JsonField.of("ACH_RETURN_PROCESSED"))

            @JvmStatic fun of(value: String) = SupportedSimulationTypes(JsonField.of(value))
        }

        enum class Known {
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_SETTLED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
        }

        enum class Value {
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_SETTLED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                else -> throw LithicInvalidDataException("Unknown SupportedSimulationTypes: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class SupportedSimulationDeclineReasons
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SupportedSimulationDeclineReasons && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val PROGRAM_TRANSACTION_LIMIT_EXCEEDED =
                SupportedSimulationDeclineReasons(
                    JsonField.of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED")
                )

            @JvmField
            val PROGRAM_DAILY_LIMIT_EXCEEDED =
                SupportedSimulationDeclineReasons(JsonField.of("PROGRAM_DAILY_LIMIT_EXCEEDED"))

            @JvmField
            val PROGRAM_MONTHLY_LIMIT_EXCEEDED =
                SupportedSimulationDeclineReasons(JsonField.of("PROGRAM_MONTHLY_LIMIT_EXCEEDED"))

            @JvmStatic
            fun of(value: String) = SupportedSimulationDeclineReasons(JsonField.of(value))
        }

        enum class Known {
            PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
            PROGRAM_DAILY_LIMIT_EXCEEDED,
            PROGRAM_MONTHLY_LIMIT_EXCEEDED,
        }

        enum class Value {
            PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
            PROGRAM_DAILY_LIMIT_EXCEEDED,
            PROGRAM_MONTHLY_LIMIT_EXCEEDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Value.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                PROGRAM_DAILY_LIMIT_EXCEEDED -> Value.PROGRAM_DAILY_LIMIT_EXCEEDED
                PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Known.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                PROGRAM_DAILY_LIMIT_EXCEEDED -> Known.PROGRAM_DAILY_LIMIT_EXCEEDED
                PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                else ->
                    throw LithicInvalidDataException(
                        "Unknown SupportedSimulationDeclineReasons: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
