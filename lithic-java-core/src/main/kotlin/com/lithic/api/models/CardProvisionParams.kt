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

class CardProvisionParams constructor(private val cardToken: String,private val digitalWallet: DigitalWallet?,private val nonce: String?,private val nonceSignature: String?,private val certificate: String?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun cardToken(): String = cardToken

    fun digitalWallet(): Optional<DigitalWallet> = Optional.ofNullable(digitalWallet)

    fun nonce(): Optional<String> = Optional.ofNullable(nonce)

    fun nonceSignature(): Optional<String> = Optional.ofNullable(nonceSignature)

    fun certificate(): Optional<String> = Optional.ofNullable(certificate)

    @JvmSynthetic
    internal fun getBody(): CardProvisionBody {
      return CardProvisionBody(
          digitalWallet,
          nonce,
          nonceSignature,
          certificate,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> cardToken
          else -> ""
      }
    }

    @JsonDeserialize(builder = CardProvisionBody.Builder::class)
    @NoAutoDetect
    class CardProvisionBody internal constructor(private val digitalWallet: DigitalWallet?,private val nonce: String?,private val nonceSignature: String?,private val certificate: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** Name of digital wallet provider. */
        @JsonProperty("digital_wallet")
        fun digitalWallet(): DigitalWallet? = digitalWallet

        /**
         * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's
         * wallet.
         */
        @JsonProperty("nonce")
        fun nonce(): String? = nonce

        /**
         * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's
         * wallet.
         */
        @JsonProperty("nonce_signature")
        fun nonceSignature(): String? = nonceSignature

        /**
         * Required for `APPLE_PAY`. Apple's public leaf certificate. Base64 encoded in PEM
         * format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
         * Provided by the device's wallet.
         */
        @JsonProperty("certificate")
        fun certificate(): String? = certificate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CardProvisionBody &&
              this.digitalWallet == other.digitalWallet &&
              this.nonce == other.nonce &&
              this.nonceSignature == other.nonceSignature &&
              this.certificate == other.certificate &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                digitalWallet,
                nonce,
                nonceSignature,
                certificate,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CardProvisionBody{digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, certificate=$certificate, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var digitalWallet: DigitalWallet? = null
            private var nonce: String? = null
            private var nonceSignature: String? = null
            private var certificate: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardProvisionBody: CardProvisionBody) = apply {
                this.digitalWallet = cardProvisionBody.digitalWallet
                this.nonce = cardProvisionBody.nonce
                this.nonceSignature = cardProvisionBody.nonceSignature
                this.certificate = cardProvisionBody.certificate
                additionalProperties(cardProvisionBody.additionalProperties)
            }

            /** Name of digital wallet provider. */
            @JsonProperty("digital_wallet")
            fun digitalWallet(digitalWallet: DigitalWallet) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            @JsonProperty("nonce")
            fun nonce(nonce: String) = apply {
                this.nonce = nonce
            }

            /**
             * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            @JsonProperty("nonce_signature")
            fun nonceSignature(nonceSignature: String) = apply {
                this.nonceSignature = nonceSignature
            }

            /**
             * Required for `APPLE_PAY`. Apple's public leaf certificate. Base64 encoded in PEM
             * format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
             * Provided by the device's wallet.
             */
            @JsonProperty("certificate")
            fun certificate(certificate: String) = apply {
                this.certificate = certificate
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

            fun build(): CardProvisionBody = CardProvisionBody(
                digitalWallet,
                nonce,
                nonceSignature,
                certificate,
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

      return other is CardProvisionParams &&
          this.cardToken == other.cardToken &&
          this.digitalWallet == other.digitalWallet &&
          this.nonce == other.nonce &&
          this.nonceSignature == other.nonceSignature &&
          this.certificate == other.certificate &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cardToken,
          digitalWallet,
          nonce,
          nonceSignature,
          certificate,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "CardProvisionParams{cardToken=$cardToken, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, certificate=$certificate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var digitalWallet: DigitalWallet? = null
        private var nonce: String? = null
        private var nonceSignature: String? = null
        private var certificate: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProvisionParams: CardProvisionParams) = apply {
            this.cardToken = cardProvisionParams.cardToken
            this.digitalWallet = cardProvisionParams.digitalWallet
            this.nonce = cardProvisionParams.nonce
            this.nonceSignature = cardProvisionParams.nonceSignature
            this.certificate = cardProvisionParams.certificate
            additionalQueryParams(cardProvisionParams.additionalQueryParams)
            additionalHeaders(cardProvisionParams.additionalHeaders)
            additionalBodyProperties(cardProvisionParams.additionalBodyProperties)
        }

        fun cardToken(cardToken: String) = apply {
            this.cardToken = cardToken
        }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            this.digitalWallet = digitalWallet
        }

        /**
         * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's
         * wallet.
         */
        fun nonce(nonce: String) = apply {
            this.nonce = nonce
        }

        /**
         * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's
         * wallet.
         */
        fun nonceSignature(nonceSignature: String) = apply {
            this.nonceSignature = nonceSignature
        }

        /**
         * Required for `APPLE_PAY`. Apple's public leaf certificate. Base64 encoded in PEM
         * format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
         * Provided by the device's wallet.
         */
        fun certificate(certificate: String) = apply {
            this.certificate = certificate
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

        fun build(): CardProvisionParams = CardProvisionParams(
            checkNotNull(cardToken) {
                "`cardToken` is required but was not set"
            },
            digitalWallet,
            nonce,
            nonceSignature,
            certificate,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class DigitalWallet @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is DigitalWallet &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPLE_PAY = DigitalWallet(JsonField.of("APPLE_PAY"))

            @JvmField val GOOGLE_PAY = DigitalWallet(JsonField.of("GOOGLE_PAY"))

            @JvmField val SAMSUNG_PAY = DigitalWallet(JsonField.of("SAMSUNG_PAY"))

            @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
        }

        enum class Known {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
        }

        enum class Value {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            APPLE_PAY -> Value.APPLE_PAY
            GOOGLE_PAY -> Value.GOOGLE_PAY
            SAMSUNG_PAY -> Value.SAMSUNG_PAY
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            APPLE_PAY -> Known.APPLE_PAY
            GOOGLE_PAY -> Known.GOOGLE_PAY
            SAMSUNG_PAY -> Known.SAMSUNG_PAY
            else -> throw LithicInvalidDataException("Unknown DigitalWallet: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
