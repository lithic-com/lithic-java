// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CardGetEmbedUrlParams
constructor(
    private val token: String,
    private val css: String?,
    private val expiration: OffsetDateTime?,
    private val targetOrigin: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun token(): String = token

    fun css(): Optional<String> = Optional.ofNullable(css)

    fun expiration(): Optional<OffsetDateTime> = Optional.ofNullable(expiration)

    fun targetOrigin(): Optional<String> = Optional.ofNullable(targetOrigin)

    @JvmSynthetic
    internal fun getBody(): CardGetEmbedUrlBody {
        return CardGetEmbedUrlBody(token, css, expiration, targetOrigin, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CardGetEmbedUrlBody.Builder::class)
    @NoAutoDetect
    class CardGetEmbedUrlBody
    internal constructor(
        private val token: String?,
        private val css: String?,
        private val expiration: OffsetDateTime?,
        private val targetOrigin: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Globally unique identifier for the card to be displayed. */
        @JsonProperty("token") fun token(): String? = token

        /**
         * A publicly available URI, so the white-labeled card element can be styled with the
         * client's branding.
         */
        @JsonProperty("css") fun css(): String? = css

        /**
         * An RFC 3339 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an expiration,
         * the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
         * `expiration`, in the event that a malicious user gets a copy of your request in transit,
         * they will be able to obtain the response data indefinitely.
         */
        @JsonProperty("expiration") fun expiration(): OffsetDateTime? = expiration

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe by
         * adding an event listener.
         */
        @JsonProperty("target_origin") fun targetOrigin(): String? = targetOrigin

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardGetEmbedUrlBody &&
                this.token == other.token &&
                this.css == other.css &&
                this.expiration == other.expiration &&
                this.targetOrigin == other.targetOrigin &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(token, css, expiration, targetOrigin, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "CardGetEmbedUrlBody{token=$token, css=$css, expiration=$expiration, targetOrigin=$targetOrigin, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: String? = null
            private var css: String? = null
            private var expiration: OffsetDateTime? = null
            private var targetOrigin: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardGetEmbedUrlBody: CardGetEmbedUrlBody) = apply {
                this.token = cardGetEmbedUrlBody.token
                this.css = cardGetEmbedUrlBody.css
                this.expiration = cardGetEmbedUrlBody.expiration
                this.targetOrigin = cardGetEmbedUrlBody.targetOrigin
                additionalProperties(cardGetEmbedUrlBody.additionalProperties)
            }

            /** Globally unique identifier for the card to be displayed. */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            /**
             * A publicly available URI, so the white-labeled card element can be styled with the
             * client's branding.
             */
            @JsonProperty("css") fun css(css: String) = apply { this.css = css }

            /**
             * An RFC 3339 timestamp for when the request should expire. UTC time zone.
             *
             * If no timezone is specified, UTC will be used. If payload does not contain an
             * expiration, the request will never expire.
             *
             * Using an `expiration` reduces the risk of a
             * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
             * `expiration`, in the event that a malicious user gets a copy of your request in
             * transit, they will be able to obtain the response data indefinitely.
             */
            @JsonProperty("expiration")
            fun expiration(expiration: OffsetDateTime) = apply { this.expiration = expiration }

            /**
             * Required if you want to post the element clicked to the parent iframe.
             *
             * If you supply this param, you can also capture click events in the parent iframe by
             * adding an event listener.
             */
            @JsonProperty("target_origin")
            fun targetOrigin(targetOrigin: String) = apply { this.targetOrigin = targetOrigin }

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

            fun build(): CardGetEmbedUrlBody =
                CardGetEmbedUrlBody(
                    checkNotNull(token) { "`token` is required but was not set" },
                    css,
                    expiration,
                    targetOrigin,
                    additionalProperties.toImmutable(),
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

        return other is CardGetEmbedUrlParams &&
            this.token == other.token &&
            this.css == other.css &&
            this.expiration == other.expiration &&
            this.targetOrigin == other.targetOrigin &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            token,
            css,
            expiration,
            targetOrigin,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardGetEmbedUrlParams{token=$token, css=$css, expiration=$expiration, targetOrigin=$targetOrigin, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var token: String? = null
        private var css: String? = null
        private var expiration: OffsetDateTime? = null
        private var targetOrigin: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardGetEmbedUrlParams: CardGetEmbedUrlParams) = apply {
            this.token = cardGetEmbedUrlParams.token
            this.css = cardGetEmbedUrlParams.css
            this.expiration = cardGetEmbedUrlParams.expiration
            this.targetOrigin = cardGetEmbedUrlParams.targetOrigin
            additionalQueryParams(cardGetEmbedUrlParams.additionalQueryParams)
            additionalHeaders(cardGetEmbedUrlParams.additionalHeaders)
            additionalBodyProperties(cardGetEmbedUrlParams.additionalBodyProperties)
        }

        /** Globally unique identifier for the card to be displayed. */
        fun token(token: String) = apply { this.token = token }

        /**
         * A publicly available URI, so the white-labeled card element can be styled with the
         * client's branding.
         */
        fun css(css: String) = apply { this.css = css }

        /**
         * An RFC 3339 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an expiration,
         * the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
         * `expiration`, in the event that a malicious user gets a copy of your request in transit,
         * they will be able to obtain the response data indefinitely.
         */
        fun expiration(expiration: OffsetDateTime) = apply { this.expiration = expiration }

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe by
         * adding an event listener.
         */
        fun targetOrigin(targetOrigin: String) = apply { this.targetOrigin = targetOrigin }

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

        fun build(): CardGetEmbedUrlParams =
            CardGetEmbedUrlParams(
                checkNotNull(token) { "`token` is required but was not set" },
                css,
                expiration,
                targetOrigin,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
