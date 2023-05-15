package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/** A subscription to specific event types. */
@JsonDeserialize(builder = EventSubscription.Builder::class)
@NoAutoDetect
class EventSubscription
private constructor(
    private val description: JsonField<String>,
    private val disabled: JsonField<Boolean>,
    private val eventTypes: JsonField<List<EventType>>,
    private val url: JsonField<String>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A description of the subscription. */
    fun description(): String = description.getRequired("description")

    /** Whether the subscription is disabled. */
    fun disabled(): Boolean = disabled.getRequired("disabled")

    fun eventTypes(): Optional<List<EventType>> =
        Optional.ofNullable(eventTypes.getNullable("event_types"))

    fun url(): String = url.getRequired("url")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** A description of the subscription. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Whether the subscription is disabled. */
    @JsonProperty("disabled") @ExcludeMissing fun _disabled() = disabled

    @JsonProperty("event_types") @ExcludeMissing fun _eventTypes() = eventTypes

    @JsonProperty("url") @ExcludeMissing fun _url() = url

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventSubscription = apply {
        if (!validated) {
            description()
            disabled()
            eventTypes()
            url()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventSubscription &&
            this.description == other.description &&
            this.disabled == other.disabled &&
            this.eventTypes == other.eventTypes &&
            this.url == other.url &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    description,
                    disabled,
                    eventTypes,
                    url,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EventSubscription{description=$description, disabled=$disabled, eventTypes=$eventTypes, url=$url, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var description: JsonField<String> = JsonMissing.of()
        private var disabled: JsonField<Boolean> = JsonMissing.of()
        private var eventTypes: JsonField<List<EventType>> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventSubscription: EventSubscription) = apply {
            this.description = eventSubscription.description
            this.disabled = eventSubscription.disabled
            this.eventTypes = eventSubscription.eventTypes
            this.url = eventSubscription.url
            this.token = eventSubscription.token
            additionalProperties(eventSubscription.additionalProperties)
        }

        /** A description of the subscription. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description of the subscription. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether the subscription is disabled. */
        fun disabled(disabled: Boolean) = disabled(JsonField.of(disabled))

        /** Whether the subscription is disabled. */
        @JsonProperty("disabled")
        @ExcludeMissing
        fun disabled(disabled: JsonField<Boolean>) = apply { this.disabled = disabled }

        fun eventTypes(eventTypes: List<EventType>) = eventTypes(JsonField.of(eventTypes))

        @JsonProperty("event_types")
        @ExcludeMissing
        fun eventTypes(eventTypes: JsonField<List<EventType>>) = apply {
            this.eventTypes = eventTypes
        }

        fun url(url: String) = url(JsonField.of(url))

        @JsonProperty("url")
        @ExcludeMissing
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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

        fun build(): EventSubscription =
            EventSubscription(
                description,
                disabled,
                eventTypes.map { it.toUnmodifiable() },
                url,
                token,
                additionalProperties.toUnmodifiable(),
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

            @JvmField val CARD_CREATED = EventType(JsonField.of("card.created"))

            @JvmField val CARD_SHIPPED = EventType(JsonField.of("card.shipped"))

            @JvmField
            val CARD_TRANSACTION_UPDATED = EventType(JsonField.of("card_transaction.updated"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("digital_wallet.tokenization_approval_request"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code")
                )

            @JvmField val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            CARD_CREATED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
        }

        enum class Value {
            CARD_CREATED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_CREATED -> Value.CARD_CREATED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_CREATED -> Known.CARD_CREATED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
