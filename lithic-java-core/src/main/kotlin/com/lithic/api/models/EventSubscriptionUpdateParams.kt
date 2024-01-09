// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class EventSubscriptionUpdateParams
constructor(
    private val eventSubscriptionToken: String,
    private val url: String,
    private val description: String?,
    private val disabled: Boolean?,
    private val eventTypes: List<EventType>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun eventSubscriptionToken(): String = eventSubscriptionToken

    fun url(): String = url

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun disabled(): Optional<Boolean> = Optional.ofNullable(disabled)

    fun eventTypes(): Optional<List<EventType>> = Optional.ofNullable(eventTypes)

    @JvmSynthetic
    internal fun getBody(): EventSubscriptionUpdateBody {
        return EventSubscriptionUpdateBody(
            url,
            description,
            disabled,
            eventTypes,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventSubscriptionToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = EventSubscriptionUpdateBody.Builder::class)
    @NoAutoDetect
    class EventSubscriptionUpdateBody
    internal constructor(
        private val url: String?,
        private val description: String?,
        private val disabled: Boolean?,
        private val eventTypes: List<EventType>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
        @JsonProperty("url") fun url(): String? = url

        /** Event subscription description. */
        @JsonProperty("description") fun description(): String? = description

        /** Whether the event subscription is active (false) or inactive (true). */
        @JsonProperty("disabled") fun disabled(): Boolean? = disabled

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        @JsonProperty("event_types") fun eventTypes(): List<EventType>? = eventTypes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventSubscriptionUpdateBody &&
                this.url == other.url &&
                this.description == other.description &&
                this.disabled == other.disabled &&
                this.eventTypes == other.eventTypes &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        url,
                        description,
                        disabled,
                        eventTypes,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EventSubscriptionUpdateBody{url=$url, description=$description, disabled=$disabled, eventTypes=$eventTypes, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var url: String? = null
            private var description: String? = null
            private var disabled: Boolean? = null
            private var eventTypes: List<EventType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventSubscriptionUpdateBody: EventSubscriptionUpdateBody) = apply {
                this.url = eventSubscriptionUpdateBody.url
                this.description = eventSubscriptionUpdateBody.description
                this.disabled = eventSubscriptionUpdateBody.disabled
                this.eventTypes = eventSubscriptionUpdateBody.eventTypes
                additionalProperties(eventSubscriptionUpdateBody.additionalProperties)
            }

            /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
            @JsonProperty("url") fun url(url: String) = apply { this.url = url }

            /** Event subscription description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Whether the event subscription is active (false) or inactive (true). */
            @JsonProperty("disabled")
            fun disabled(disabled: Boolean) = apply { this.disabled = disabled }

            /**
             * Indicates types of events that will be sent to this subscription. If left blank, all
             * types will be sent.
             */
            @JsonProperty("event_types")
            fun eventTypes(eventTypes: List<EventType>) = apply { this.eventTypes = eventTypes }

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

            fun build(): EventSubscriptionUpdateBody =
                EventSubscriptionUpdateBody(
                    checkNotNull(url) { "`url` is required but was not set" },
                    description,
                    disabled,
                    eventTypes?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
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

        return other is EventSubscriptionUpdateParams &&
            this.eventSubscriptionToken == other.eventSubscriptionToken &&
            this.url == other.url &&
            this.description == other.description &&
            this.disabled == other.disabled &&
            this.eventTypes == other.eventTypes &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            eventSubscriptionToken,
            url,
            description,
            disabled,
            eventTypes,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventSubscriptionUpdateParams{eventSubscriptionToken=$eventSubscriptionToken, url=$url, description=$description, disabled=$disabled, eventTypes=$eventTypes, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventSubscriptionToken: String? = null
        private var url: String? = null
        private var description: String? = null
        private var disabled: Boolean? = null
        private var eventTypes: MutableList<EventType> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventSubscriptionUpdateParams: EventSubscriptionUpdateParams) = apply {
            this.eventSubscriptionToken = eventSubscriptionUpdateParams.eventSubscriptionToken
            this.url = eventSubscriptionUpdateParams.url
            this.description = eventSubscriptionUpdateParams.description
            this.disabled = eventSubscriptionUpdateParams.disabled
            this.eventTypes(eventSubscriptionUpdateParams.eventTypes ?: listOf())
            additionalQueryParams(eventSubscriptionUpdateParams.additionalQueryParams)
            additionalHeaders(eventSubscriptionUpdateParams.additionalHeaders)
            additionalBodyProperties(eventSubscriptionUpdateParams.additionalBodyProperties)
        }

        fun eventSubscriptionToken(eventSubscriptionToken: String) = apply {
            this.eventSubscriptionToken = eventSubscriptionToken
        }

        /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
        fun url(url: String) = apply { this.url = url }

        /** Event subscription description. */
        fun description(description: String) = apply { this.description = description }

        /** Whether the event subscription is active (false) or inactive (true). */
        fun disabled(disabled: Boolean) = apply { this.disabled = disabled }

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        fun eventTypes(eventTypes: List<EventType>) = apply {
            this.eventTypes.clear()
            this.eventTypes.addAll(eventTypes)
        }

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        fun addEventType(eventType: EventType) = apply { this.eventTypes.add(eventType) }

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

        fun build(): EventSubscriptionUpdateParams =
            EventSubscriptionUpdateParams(
                checkNotNull(eventSubscriptionToken) {
                    "`eventSubscriptionToken` is required but was not set"
                },
                checkNotNull(url) { "`url` is required but was not set" },
                description,
                disabled,
                if (eventTypes.size == 0) null else eventTypes.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmField val BALANCE_UPDATED = EventType(JsonField.of("balance.updated"))

            @JvmField val CARD_CREATED = EventType(JsonField.of("card.created"))

            @JvmField val CARD_RENEWED = EventType(JsonField.of("card.renewed"))

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

            @JvmField val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            @JvmField
            val DISPUTE_EVIDENCE_UPLOAD_FAILED =
                EventType(JsonField.of("dispute_evidence.upload_failed"))

            @JvmField
            val PAYMENT_TRANSACTION_CREATED = EventType(JsonField.of("payment_transaction.created"))

            @JvmField
            val PAYMENT_TRANSACTION_UPDATED = EventType(JsonField.of("payment_transaction.updated"))

            @JvmField
            val THREE_DS_AUTHENTICATION_CREATED =
                EventType(JsonField.of("three_ds_authentication.created"))

            @JvmField
            val TRANSFER_TRANSACTION_CREATED =
                EventType(JsonField.of("transfer_transaction.created"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            BALANCE_UPDATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
        }

        enum class Value {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            BALANCE_UPDATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Value.ACCOUNT_HOLDER_VERIFICATION
                BALANCE_UPDATED -> Value.BALANCE_UPDATED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_RENEWED -> Value.CARD_RENEWED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Value.DISPUTE_EVIDENCE_UPLOAD_FAILED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                THREE_DS_AUTHENTICATION_CREATED -> Value.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Value.TRANSFER_TRANSACTION_CREATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Known.ACCOUNT_HOLDER_VERIFICATION
                BALANCE_UPDATED -> Known.BALANCE_UPDATED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_RENEWED -> Known.CARD_RENEWED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Known.DISPUTE_EVIDENCE_UPLOAD_FAILED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                THREE_DS_AUTHENTICATION_CREATED -> Known.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Known.TRANSFER_TRANSACTION_CREATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
