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
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import java.util.Objects
import java.util.Optional
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.JsonField
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*

class AccountHolderCreateWebhookParams constructor(private val url: String,private val additionalQueryParams: ListMultimap<String, String>,private val additionalHeaders: ListMultimap<String, String>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun url(): String = url

    @JvmSynthetic
    internal fun toBody(): AccountHolderCreateWebhookBody = AccountHolderCreateWebhookBody(
        url,
        additionalBodyProperties
    )

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic
    internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    @NoAutoDetect
    class AccountHolderCreateWebhookBody internal constructor(private val url: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** URL to receive webhook requests. Must be a valid HTTPS address. */
        @JsonProperty("url")
        fun url(): String? = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AccountHolderCreateWebhookBody &&
              url == other.url &&
              additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(url, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "AccountHolderCreateWebhookBody{url=$url, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var url: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderCreateWebhookBody: AccountHolderCreateWebhookBody) = apply {
                this.url = accountHolderCreateWebhookBody.url
                additionalProperties(accountHolderCreateWebhookBody.additionalProperties)
            }

            /** URL to receive webhook requests. Must be a valid HTTPS address. */
            @JsonProperty("url")
            fun url(url: String) = apply {
                this.url = url
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

            fun build(): AccountHolderCreateWebhookBody = AccountHolderCreateWebhookBody(checkNotNull(url) { "Property `url` is required but was not set" }, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AccountHolderCreateWebhookParams &&
          url == other.url &&
          additionalQueryParams == other.additionalQueryParams &&
          additionalHeaders == other.additionalHeaders &&
          additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          url,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "AccountHolderCreateWebhookParams{url=$url, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var url: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderCreateWebhookParams: AccountHolderCreateWebhookParams) = apply {
            this.url = accountHolderCreateWebhookParams.url
            additionalQueryParams(accountHolderCreateWebhookParams.additionalQueryParams)
            additionalHeaders(accountHolderCreateWebhookParams.additionalHeaders)
            additionalBodyProperties(accountHolderCreateWebhookParams.additionalBodyProperties)
        }

        /** URL to receive webhook requests. Must be a valid HTTPS address. */
        fun url(url: String) = apply { this.url = url }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply { this.additionalQueryParams.put(key, value) }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply { this.additionalHeaders.put(key, value) }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply { this.additionalBodyProperties.put(key, value) }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): AccountHolderCreateWebhookParams = AccountHolderCreateWebhookParams(
            checkNotNull(url) { "Property `url` is required but was not set" },
            additionalQueryParams.toUnmodifiable(),
            additionalHeaders.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
