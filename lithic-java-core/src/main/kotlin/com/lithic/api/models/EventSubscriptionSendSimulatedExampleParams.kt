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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/** Send an example message for event. */
class EventSubscriptionSendSimulatedExampleParams
constructor(
    private val eventSubscriptionToken: String,
    private val body: EventSubscriptionSendSimulatedExampleBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun eventSubscriptionToken(): String = eventSubscriptionToken

    /** Event type to send example message for. */
    fun eventType(): Optional<EventType> = body.eventType()

    /** Event type to send example message for. */
    fun _eventType(): JsonField<EventType> = body._eventType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): EventSubscriptionSendSimulatedExampleBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventSubscriptionToken
            else -> ""
        }
    }

    @NoAutoDetect
    class EventSubscriptionSendSimulatedExampleBody
    @JsonCreator
    internal constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Event type to send example message for. */
        fun eventType(): Optional<EventType> =
            Optional.ofNullable(eventType.getNullable("event_type"))

        /** Event type to send example message for. */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EventSubscriptionSendSimulatedExampleBody = apply {
            if (validated) {
                return@apply
            }

            eventType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                eventSubscriptionSendSimulatedExampleBody: EventSubscriptionSendSimulatedExampleBody
            ) = apply {
                eventType = eventSubscriptionSendSimulatedExampleBody.eventType
                additionalProperties =
                    eventSubscriptionSendSimulatedExampleBody.additionalProperties.toMutableMap()
            }

            /** Event type to send example message for. */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /** Event type to send example message for. */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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

            fun build(): EventSubscriptionSendSimulatedExampleBody =
                EventSubscriptionSendSimulatedExampleBody(
                    eventType,
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventSubscriptionSendSimulatedExampleBody && eventType == other.eventType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EventSubscriptionSendSimulatedExampleBody{eventType=$eventType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventSubscriptionToken: String? = null
        private var body: EventSubscriptionSendSimulatedExampleBody.Builder =
            EventSubscriptionSendSimulatedExampleBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            eventSubscriptionSendSimulatedExampleParams: EventSubscriptionSendSimulatedExampleParams
        ) = apply {
            eventSubscriptionToken =
                eventSubscriptionSendSimulatedExampleParams.eventSubscriptionToken
            body = eventSubscriptionSendSimulatedExampleParams.body.toBuilder()
            additionalHeaders =
                eventSubscriptionSendSimulatedExampleParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                eventSubscriptionSendSimulatedExampleParams.additionalQueryParams.toBuilder()
        }

        fun eventSubscriptionToken(eventSubscriptionToken: String) = apply {
            this.eventSubscriptionToken = eventSubscriptionToken
        }

        /** Event type to send example message for. */
        fun eventType(eventType: EventType) = apply { body.eventType(eventType) }

        /** Event type to send example message for. */
        fun eventType(eventType: JsonField<EventType>) = apply { body.eventType(eventType) }

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

        fun build(): EventSubscriptionSendSimulatedExampleParams =
            EventSubscriptionSendSimulatedExampleParams(
                checkRequired("eventSubscriptionToken", eventSubscriptionToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNT_HOLDER_CREATED = of("account_holder.created")

            @JvmField val ACCOUNT_HOLDER_UPDATED = of("account_holder.updated")

            @JvmField val ACCOUNT_HOLDER_VERIFICATION = of("account_holder.verification")

            @JvmField
            val AUTH_RULES_PERFORMANCE_REPORT_CREATED = of("auth_rules.performance_report.created")

            @JvmField val BALANCE_UPDATED = of("balance.updated")

            @JvmField
            val BOOK_TRANSFER_TRANSACTION_CREATED = of("book_transfer_transaction.created")

            @JvmField val CARD_CREATED = of("card.created")

            @JvmField val CARD_RENEWED = of("card.renewed")

            @JvmField val CARD_REISSUED = of("card.reissued")

            @JvmField val CARD_CONVERTED = of("card.converted")

            @JvmField val CARD_SHIPPED = of("card.shipped")

            @JvmField val CARD_TRANSACTION_UPDATED = of("card_transaction.updated")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                of("digital_wallet.tokenization_approval_request")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_RESULT = of("digital_wallet.tokenization_result")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                of("digital_wallet.tokenization_two_factor_authentication_code")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                of("digital_wallet.tokenization_two_factor_authentication_code_sent")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_UPDATED = of("digital_wallet.tokenization_updated")

            @JvmField val DISPUTE_UPDATED = of("dispute.updated")

            @JvmField val DISPUTE_EVIDENCE_UPLOAD_FAILED = of("dispute_evidence.upload_failed")

            @JvmField val EXTERNAL_BANK_ACCOUNT_CREATED = of("external_bank_account.created")

            @JvmField val EXTERNAL_BANK_ACCOUNT_UPDATED = of("external_bank_account.updated")

            @JvmField val EXTERNAL_PAYMENT_CREATED = of("external_payment.created")

            @JvmField val EXTERNAL_PAYMENT_UPDATED = of("external_payment.updated")

            @JvmField val FINANCIAL_ACCOUNT_CREATED = of("financial_account.created")

            @JvmField val FINANCIAL_ACCOUNT_UPDATED = of("financial_account.updated")

            @JvmField val LOAN_TAPE_CREATED = of("loan_tape.created")

            @JvmField val LOAN_TAPE_UPDATED = of("loan_tape.updated")

            @JvmField val MANAGEMENT_OPERATION_CREATED = of("management_operation.created")

            @JvmField val MANAGEMENT_OPERATION_UPDATED = of("management_operation.updated")

            @JvmField val PAYMENT_TRANSACTION_CREATED = of("payment_transaction.created")

            @JvmField val PAYMENT_TRANSACTION_UPDATED = of("payment_transaction.updated")

            @JvmField val SETTLEMENT_REPORT_UPDATED = of("settlement_report.updated")

            @JvmField val STATEMENTS_CREATED = of("statements.created")

            @JvmField val THREE_DS_AUTHENTICATION_CREATED = of("three_ds_authentication.created")

            @JvmField val TOKENIZATION_APPROVAL_REQUEST = of("tokenization.approval_request")

            @JvmField val TOKENIZATION_RESULT = of("tokenization.result")

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                of("tokenization.two_factor_authentication_code")

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                of("tokenization.two_factor_authentication_code_sent")

            @JvmField val TOKENIZATION_UPDATED = of("tokenization.updated")

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
            CARD_CONVERTED,
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
            CARD_CONVERTED,
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
                CARD_CONVERTED -> Value.CARD_CONVERTED
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
                CARD_CONVERTED -> Known.CARD_CONVERTED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionSendSimulatedExampleParams && eventSubscriptionToken == other.eventSubscriptionToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventSubscriptionToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventSubscriptionSendSimulatedExampleParams{eventSubscriptionToken=$eventSubscriptionToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
