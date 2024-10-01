// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class EventSubscriptionSendSimulatedExampleParams
constructor(
    private val eventSubscriptionToken: String,
    private val eventType: EventType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun eventSubscriptionToken(): String = eventSubscriptionToken

    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType)

    @JvmSynthetic
    internal fun getBody(): EventSubscriptionSendSimulatedExampleBody {
        return EventSubscriptionSendSimulatedExampleBody(eventType, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventSubscriptionToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = EventSubscriptionSendSimulatedExampleBody.Builder::class)
    @NoAutoDetect
    class EventSubscriptionSendSimulatedExampleBody
    internal constructor(
        private val eventType: EventType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Event type to send example message for. */
        @JsonProperty("event_type") fun eventType(): EventType? = eventType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventSubscriptionSendSimulatedExampleBody &&
                this.eventType == other.eventType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(eventType, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "EventSubscriptionSendSimulatedExampleBody{eventType=$eventType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var eventType: EventType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                eventSubscriptionSendSimulatedExampleBody: EventSubscriptionSendSimulatedExampleBody
            ) = apply {
                this.eventType = eventSubscriptionSendSimulatedExampleBody.eventType
                additionalProperties(eventSubscriptionSendSimulatedExampleBody.additionalProperties)
            }

            /** Event type to send example message for. */
            @JsonProperty("event_type")
            fun eventType(eventType: EventType) = apply { this.eventType = eventType }

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

            fun build(): EventSubscriptionSendSimulatedExampleBody =
                EventSubscriptionSendSimulatedExampleBody(
                    eventType,
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventSubscriptionSendSimulatedExampleParams &&
            this.eventSubscriptionToken == other.eventSubscriptionToken &&
            this.eventType == other.eventType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            eventSubscriptionToken,
            eventType,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventSubscriptionSendSimulatedExampleParams{eventSubscriptionToken=$eventSubscriptionToken, eventType=$eventType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventSubscriptionToken: String? = null
        private var eventType: EventType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            eventSubscriptionSendSimulatedExampleParams: EventSubscriptionSendSimulatedExampleParams
        ) = apply {
            this.eventSubscriptionToken =
                eventSubscriptionSendSimulatedExampleParams.eventSubscriptionToken
            this.eventType = eventSubscriptionSendSimulatedExampleParams.eventType
            additionalQueryParams(eventSubscriptionSendSimulatedExampleParams.additionalQueryParams)
            additionalHeaders(eventSubscriptionSendSimulatedExampleParams.additionalHeaders)
            additionalBodyProperties(
                eventSubscriptionSendSimulatedExampleParams.additionalBodyProperties
            )
        }

        fun eventSubscriptionToken(eventSubscriptionToken: String) = apply {
            this.eventSubscriptionToken = eventSubscriptionToken
        }

        /** Event type to send example message for. */
        fun eventType(eventType: EventType) = apply { this.eventType = eventType }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): EventSubscriptionSendSimulatedExampleParams =
            EventSubscriptionSendSimulatedExampleParams(
                checkNotNull(eventSubscriptionToken) {
                    "`eventSubscriptionToken` is required but was not set"
                },
                eventType,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCOUNT_HOLDER_CREATED = EventType(JsonField.of("account_holder.created"))

            @JvmField val ACCOUNT_HOLDER_UPDATED = EventType(JsonField.of("account_holder.updated"))

            @JvmField
            val ACCOUNT_HOLDER_VERIFICATION = EventType(JsonField.of("account_holder.verification"))

            @JvmField
            val AUTH_RULES_PERFORMANCE_REPORT_CREATED =
                EventType(JsonField.of("auth_rules.performance_report.created"))

            @JvmField val BALANCE_UPDATED = EventType(JsonField.of("balance.updated"))

            @JvmField
            val BOOK_TRANSFER_TRANSACTION_CREATED =
                EventType(JsonField.of("book_transfer_transaction.created"))

            @JvmField val CARD_CREATED = EventType(JsonField.of("card.created"))

            @JvmField val CARD_RENEWED = EventType(JsonField.of("card.renewed"))

            @JvmField val CARD_REISSUED = EventType(JsonField.of("card.reissued"))

            @JvmField val CARD_SHIPPED = EventType(JsonField.of("card.shipped"))

            @JvmField
            val CARD_TRANSACTION_UPDATED = EventType(JsonField.of("card_transaction.updated"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("digital_wallet.tokenization_approval_request"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_RESULT =
                EventType(JsonField.of("digital_wallet.tokenization_result"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code")
                )

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code_sent")
                )

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_UPDATED =
                EventType(JsonField.of("digital_wallet.tokenization_updated"))

            @JvmField val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            @JvmField
            val DISPUTE_EVIDENCE_UPLOAD_FAILED =
                EventType(JsonField.of("dispute_evidence.upload_failed"))

            @JvmField
            val EXTERNAL_BANK_ACCOUNT_CREATED =
                EventType(JsonField.of("external_bank_account.created"))

            @JvmField
            val EXTERNAL_BANK_ACCOUNT_UPDATED =
                EventType(JsonField.of("external_bank_account.updated"))

            @JvmField
            val EXTERNAL_PAYMENT_CREATED = EventType(JsonField.of("external_payment.created"))

            @JvmField
            val EXTERNAL_PAYMENT_UPDATED = EventType(JsonField.of("external_payment.updated"))

            @JvmField
            val FINANCIAL_ACCOUNT_CREATED = EventType(JsonField.of("financial_account.created"))

            @JvmField
            val FINANCIAL_ACCOUNT_UPDATED = EventType(JsonField.of("financial_account.updated"))

            @JvmField val LOAN_TAPE_CREATED = EventType(JsonField.of("loan_tape.created"))

            @JvmField val LOAN_TAPE_UPDATED = EventType(JsonField.of("loan_tape.updated"))

            @JvmField
            val MANAGEMENT_OPERATION_CREATED =
                EventType(JsonField.of("management_operation.created"))

            @JvmField
            val MANAGEMENT_OPERATION_UPDATED =
                EventType(JsonField.of("management_operation.updated"))

            @JvmField
            val PAYMENT_TRANSACTION_CREATED = EventType(JsonField.of("payment_transaction.created"))

            @JvmField
            val PAYMENT_TRANSACTION_UPDATED = EventType(JsonField.of("payment_transaction.updated"))

            @JvmField
            val SETTLEMENT_REPORT_UPDATED = EventType(JsonField.of("settlement_report.updated"))

            @JvmField val STATEMENTS_CREATED = EventType(JsonField.of("statements.created"))

            @JvmField
            val THREE_DS_AUTHENTICATION_CREATED =
                EventType(JsonField.of("three_ds_authentication.created"))

            @JvmField
            val TRANSFER_TRANSACTION_CREATED =
                EventType(JsonField.of("transfer_transaction.created"))

            @JvmField
            val TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("tokenization.approval_request"))

            @JvmField val TOKENIZATION_RESULT = EventType(JsonField.of("tokenization.result"))

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                EventType(JsonField.of("tokenization.two_factor_authentication_code"))

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                EventType(JsonField.of("tokenization.two_factor_authentication_code_sent"))

            @JvmField val TOKENIZATION_UPDATED = EventType(JsonField.of("tokenization.updated"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_PERFORMANCE_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_REISSUED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
            TOKENIZATION_APPROVAL_REQUEST,
            TOKENIZATION_RESULT,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            TOKENIZATION_UPDATED,
        }

        enum class Value {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_PERFORMANCE_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_REISSUED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
            TOKENIZATION_APPROVAL_REQUEST,
            TOKENIZATION_RESULT,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            TOKENIZATION_UPDATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Value.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_PERFORMANCE_REPORT_CREATED -> Value.AUTH_RULES_PERFORMANCE_REPORT_CREATED
                BALANCE_UPDATED -> Value.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Value.BOOK_TRANSFER_TRANSACTION_CREATED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_RENEWED -> Value.CARD_RENEWED
                CARD_REISSUED -> Value.CARD_REISSUED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Value.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Value.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Value.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Value.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Value.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Value.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Value.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Value.FINANCIAL_ACCOUNT_UPDATED
                LOAN_TAPE_CREATED -> Value.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Value.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Value.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Value.MANAGEMENT_OPERATION_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Value.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Value.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Value.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Value.TRANSFER_TRANSACTION_CREATED
                TOKENIZATION_APPROVAL_REQUEST -> Value.TOKENIZATION_APPROVAL_REQUEST
                TOKENIZATION_RESULT -> Value.TOKENIZATION_RESULT
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                TOKENIZATION_UPDATED -> Value.TOKENIZATION_UPDATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Known.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_PERFORMANCE_REPORT_CREATED -> Known.AUTH_RULES_PERFORMANCE_REPORT_CREATED
                BALANCE_UPDATED -> Known.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Known.BOOK_TRANSFER_TRANSACTION_CREATED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_RENEWED -> Known.CARD_RENEWED
                CARD_REISSUED -> Known.CARD_REISSUED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Known.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Known.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Known.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Known.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Known.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Known.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Known.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Known.FINANCIAL_ACCOUNT_UPDATED
                LOAN_TAPE_CREATED -> Known.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Known.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Known.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Known.MANAGEMENT_OPERATION_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Known.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Known.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Known.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Known.TRANSFER_TRANSACTION_CREATED
                TOKENIZATION_APPROVAL_REQUEST -> Known.TOKENIZATION_APPROVAL_REQUEST
                TOKENIZATION_RESULT -> Known.TOKENIZATION_RESULT
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                TOKENIZATION_UPDATED -> Known.TOKENIZATION_UPDATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
