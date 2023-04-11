package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*

class CardGetEmbedHtmlParams constructor(private val css: String?,private val expiration: OffsetDateTime?,private val token: String,private val targetOrigin: String?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun css(): Optional<String> = Optional.ofNullable(css)

    fun expiration(): Optional<OffsetDateTime> = Optional.ofNullable(expiration)

    fun token(): String = token

    fun targetOrigin(): Optional<String> = Optional.ofNullable(targetOrigin)

    @JvmSynthetic
    internal fun getBody(): CardGetEmbedHtmlBody {
      return CardGetEmbedHtmlBody(
          css,
          expiration,
          token,
          targetOrigin,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CardGetEmbedHtmlBody.Builder::class)
    @NoAutoDetect
    class CardGetEmbedHtmlBody internal constructor(private val css: String?,private val expiration: OffsetDateTime?,private val token: String?,private val targetOrigin: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * A publicly available URI, so the white-labeled card element can be styled with
         * the client's branding.
         */
        @JsonProperty("css")
        fun css(): String? = css

        /**
         * An RFC 3339 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an
         * expiration, the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying
         * the `expiration`, in the event that a malicious user gets a copy of your request
         * in transit, they will be able to obtain the response data indefinitely.
         */
        @JsonProperty("expiration")
        fun expiration(): OffsetDateTime? = expiration

        /** Globally unique identifier for the card to be displayed. */
        @JsonProperty("token")
        fun token(): String? = token

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe
         * by adding an event listener.
         */
        @JsonProperty("target_origin")
        fun targetOrigin(): String? = targetOrigin

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CardGetEmbedHtmlBody &&
              this.css == other.css &&
              this.expiration == other.expiration &&
              this.token == other.token &&
              this.targetOrigin == other.targetOrigin &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                css,
                expiration,
                token,
                targetOrigin,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CardGetEmbedHtmlBody{css=$css, expiration=$expiration, token=$token, targetOrigin=$targetOrigin, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var css: String? = null
            private var expiration: OffsetDateTime? = null
            private var token: String? = null
            private var targetOrigin: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardGetEmbedHtmlBody: CardGetEmbedHtmlBody) = apply {
                this.css = cardGetEmbedHtmlBody.css
                this.expiration = cardGetEmbedHtmlBody.expiration
                this.token = cardGetEmbedHtmlBody.token
                this.targetOrigin = cardGetEmbedHtmlBody.targetOrigin
                additionalProperties(cardGetEmbedHtmlBody.additionalProperties)
            }

            /**
             * A publicly available URI, so the white-labeled card element can be styled with
             * the client's branding.
             */
            @JsonProperty("css")
            fun css(css: String) = apply {
                this.css = css
            }

            /**
             * An RFC 3339 timestamp for when the request should expire. UTC time zone.
             *
             * If no timezone is specified, UTC will be used. If payload does not contain an
             * expiration, the request will never expire.
             *
             * Using an `expiration` reduces the risk of a
             * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying
             * the `expiration`, in the event that a malicious user gets a copy of your request
             * in transit, they will be able to obtain the response data indefinitely.
             */
            @JsonProperty("expiration")
            fun expiration(expiration: OffsetDateTime) = apply {
                this.expiration = expiration
            }

            /** Globally unique identifier for the card to be displayed. */
            @JsonProperty("token")
            fun token(token: String) = apply {
                this.token = token
            }

            /**
             * Required if you want to post the element clicked to the parent iframe.
             *
             * If you supply this param, you can also capture click events in the parent iframe
             * by adding an event listener.
             */
            @JsonProperty("target_origin")
            fun targetOrigin(targetOrigin: String) = apply {
                this.targetOrigin = targetOrigin
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

            fun build(): CardGetEmbedHtmlBody = CardGetEmbedHtmlBody(
                css,
                expiration,
                checkNotNull(token) {
                    "`token` is required but was not set"
                },
                targetOrigin,
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

      return other is CardGetEmbedHtmlParams &&
          this.css == other.css &&
          this.expiration == other.expiration &&
          this.token == other.token &&
          this.targetOrigin == other.targetOrigin &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          css,
          expiration,
          token,
          targetOrigin,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "CardGetEmbedHtmlParams{css=$css, expiration=$expiration, token=$token, targetOrigin=$targetOrigin, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var css: String? = null
        private var expiration: OffsetDateTime? = null
        private var token: String? = null
        private var targetOrigin: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardGetEmbedHtmlParams: CardGetEmbedHtmlParams) = apply {
            this.css = cardGetEmbedHtmlParams.css
            this.expiration = cardGetEmbedHtmlParams.expiration
            this.token = cardGetEmbedHtmlParams.token
            this.targetOrigin = cardGetEmbedHtmlParams.targetOrigin
            additionalQueryParams(cardGetEmbedHtmlParams.additionalQueryParams)
            additionalHeaders(cardGetEmbedHtmlParams.additionalHeaders)
            additionalBodyProperties(cardGetEmbedHtmlParams.additionalBodyProperties)
        }

        /**
         * A publicly available URI, so the white-labeled card element can be styled with
         * the client's branding.
         */
        fun css(css: String) = apply {
            this.css = css
        }

        /**
         * An RFC 3339 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an
         * expiration, the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying
         * the `expiration`, in the event that a malicious user gets a copy of your request
         * in transit, they will be able to obtain the response data indefinitely.
         */
        fun expiration(expiration: OffsetDateTime) = apply {
            this.expiration = expiration
        }

        /** Globally unique identifier for the card to be displayed. */
        fun token(token: String) = apply {
            this.token = token
        }

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe
         * by adding an event listener.
         */
        fun targetOrigin(targetOrigin: String) = apply {
            this.targetOrigin = targetOrigin
        }

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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): CardGetEmbedHtmlParams = CardGetEmbedHtmlParams(
            css,
            expiration,
            checkNotNull(token) {
                "`token` is required but was not set"
            },
            targetOrigin,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
