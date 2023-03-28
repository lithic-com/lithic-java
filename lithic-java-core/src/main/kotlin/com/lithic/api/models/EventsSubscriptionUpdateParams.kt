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

class EventsSubscriptionUpdateParams
constructor(
    private val eventSubscriptionToken: String,
    private val description: String?,
    private val disabled: Boolean?,
    private val eventTypes: List<EventType>?,
    private val url: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun eventSubscriptionToken(): String = eventSubscriptionToken

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun disabled(): Optional<Boolean> = Optional.ofNullable(disabled)

    fun eventTypes(): Optional<List<EventType>> = Optional.ofNullable(eventTypes)

    fun url(): String = url

    @JvmSynthetic
    internal fun getBody(): EventsSubscriptionUpdateBody {
        return EventsSubscriptionUpdateBody(
            description,
            disabled,
            eventTypes,
            url,
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

    @JsonDeserialize(builder = EventsSubscriptionUpdateBody.Builder::class)
    @NoAutoDetect
    class EventsSubscriptionUpdateBody
    internal constructor(
        private val description: String?,
        private val disabled: Boolean?,
        private val eventTypes: List<EventType>?,
        private val url: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Event subscription description. */
        @JsonProperty("description") fun description(): String? = description

        /** Whether the event subscription is active (false) or inactive (true). */
        @JsonProperty("disabled") fun disabled(): Boolean? = disabled

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        @JsonProperty("event_types") fun eventTypes(): List<EventType>? = eventTypes

        /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
        @JsonProperty("url") fun url(): String? = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventsSubscriptionUpdateBody &&
                this.description == other.description &&
                this.disabled == other.disabled &&
                this.eventTypes == other.eventTypes &&
                this.url == other.url &&
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
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EventsSubscriptionUpdateBody{description=$description, disabled=$disabled, eventTypes=$eventTypes, url=$url, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var disabled: Boolean? = null
            private var eventTypes: List<EventType>? = null
            private var url: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventsSubscriptionUpdateBody: EventsSubscriptionUpdateBody) = apply {
                this.description = eventsSubscriptionUpdateBody.description
                this.disabled = eventsSubscriptionUpdateBody.disabled
                this.eventTypes = eventsSubscriptionUpdateBody.eventTypes
                this.url = eventsSubscriptionUpdateBody.url
                additionalProperties(eventsSubscriptionUpdateBody.additionalProperties)
            }

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

            /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
            @JsonProperty("url") fun url(url: String) = apply { this.url = url }

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

            fun build(): EventsSubscriptionUpdateBody =
                EventsSubscriptionUpdateBody(
                    description,
                    disabled,
                    eventTypes?.toUnmodifiable(),
                    checkNotNull(url) { "`url` is required but was not set" },
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

        return other is EventsSubscriptionUpdateParams &&
            this.eventSubscriptionToken == other.eventSubscriptionToken &&
            this.description == other.description &&
            this.disabled == other.disabled &&
            this.eventTypes == other.eventTypes &&
            this.url == other.url &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            eventSubscriptionToken,
            description,
            disabled,
            eventTypes,
            url,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventsSubscriptionUpdateParams{eventSubscriptionToken=$eventSubscriptionToken, description=$description, disabled=$disabled, eventTypes=$eventTypes, url=$url, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventSubscriptionToken: String? = null
        private var description: String? = null
        private var disabled: Boolean? = null
        private var eventTypes: List<EventType>? = null
        private var url: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventsSubscriptionUpdateParams: EventsSubscriptionUpdateParams) = apply {
            this.eventSubscriptionToken = eventsSubscriptionUpdateParams.eventSubscriptionToken
            this.description = eventsSubscriptionUpdateParams.description
            this.disabled = eventsSubscriptionUpdateParams.disabled
            this.eventTypes = eventsSubscriptionUpdateParams.eventTypes
            this.url = eventsSubscriptionUpdateParams.url
            additionalQueryParams(eventsSubscriptionUpdateParams.additionalQueryParams)
            additionalHeaders(eventsSubscriptionUpdateParams.additionalHeaders)
            additionalBodyProperties(eventsSubscriptionUpdateParams.additionalBodyProperties)
        }

        fun eventSubscriptionToken(eventSubscriptionToken: String) = apply {
            this.eventSubscriptionToken = eventSubscriptionToken
        }

        /** Event subscription description. */
        fun description(description: String) = apply { this.description = description }

        /** Whether the event subscription is active (false) or inactive (true). */
        fun disabled(disabled: Boolean) = apply { this.disabled = disabled }

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        fun eventTypes(eventTypes: List<EventType>) = apply { this.eventTypes = eventTypes }

        /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
        fun url(url: String) = apply { this.url = url }

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

        fun build(): EventsSubscriptionUpdateParams =
            EventsSubscriptionUpdateParams(
                checkNotNull(eventSubscriptionToken) {
                    "`eventSubscriptionToken` is required but was not set"
                },
                description,
                disabled,
                eventTypes?.toUnmodifiable(),
                checkNotNull(url) { "`url` is required but was not set" },
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

            @JvmField val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("digital_wallet.tokenization_approval_request"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            DISPUTE_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
        }

        enum class Value {
            DISPUTE_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
