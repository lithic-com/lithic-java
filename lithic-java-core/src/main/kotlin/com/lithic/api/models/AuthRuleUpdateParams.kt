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

class AuthRuleUpdateParams constructor(private val authRuleToken: String,private val allowedMcc: List<String>?,private val blockedMcc: List<String>?,private val allowedCountries: List<String>?,private val blockedCountries: List<String>?,private val avsType: AvsType?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun authRuleToken(): String = authRuleToken

    fun allowedMcc(): Optional<List<String>> = Optional.ofNullable(allowedMcc)

    fun blockedMcc(): Optional<List<String>> = Optional.ofNullable(blockedMcc)

    fun allowedCountries(): Optional<List<String>> = Optional.ofNullable(allowedCountries)

    fun blockedCountries(): Optional<List<String>> = Optional.ofNullable(blockedCountries)

    fun avsType(): Optional<AvsType> = Optional.ofNullable(avsType)

    @JvmSynthetic
    internal fun getBody(): AuthRuleUpdateBody {
      return AuthRuleUpdateBody(
          allowedMcc,
          blockedMcc,
          allowedCountries,
          blockedCountries,
          avsType,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> authRuleToken
          else -> ""
      }
    }

    @JsonDeserialize(builder = AuthRuleUpdateBody.Builder::class)
    @NoAutoDetect
    class AuthRuleUpdateBody internal constructor(private val allowedMcc: List<String>?,private val blockedMcc: List<String>?,private val allowedCountries: List<String>?,private val blockedCountries: List<String>?,private val avsType: AvsType?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Array of merchant category codes for which the Auth Rule will permit
         * transactions. Note that only this field or `blocked_mcc` can be used for a given
         * Auth Rule.
         */
        @JsonProperty("allowed_mcc")
        fun allowedMcc(): List<String>? = allowedMcc

        /**
         * Array of merchant category codes for which the Auth Rule will automatically
         * decline transactions. Note that only this field or `allowed_mcc` can be used for
         * a given Auth Rule.
         */
        @JsonProperty("blocked_mcc")
        fun blockedMcc(): List<String>? = blockedMcc

        /**
         * Array of country codes for which the Auth Rule will permit transactions. Note
         * that only this field or `blocked_countries` can be used for a given Auth Rule.
         */
        @JsonProperty("allowed_countries")
        fun allowedCountries(): List<String>? = allowedCountries

        /**
         * Array of country codes for which the Auth Rule will automatically decline
         * transactions. Note that only this field or `allowed_countries` can be used for a
         * given Auth Rule.
         */
        @JsonProperty("blocked_countries")
        fun blockedCountries(): List<String>? = blockedCountries

        /**
         * Address verification to confirm that postal code entered at point of transaction
         * (if applicable) matches the postal code on file for a given card.
         */
        @JsonProperty("avs_type")
        fun avsType(): AvsType? = avsType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AuthRuleUpdateBody &&
              this.allowedMcc == other.allowedMcc &&
              this.blockedMcc == other.blockedMcc &&
              this.allowedCountries == other.allowedCountries &&
              this.blockedCountries == other.blockedCountries &&
              this.avsType == other.avsType &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                allowedMcc,
                blockedMcc,
                allowedCountries,
                blockedCountries,
                avsType,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "AuthRuleUpdateBody{allowedMcc=$allowedMcc, blockedMcc=$blockedMcc, allowedCountries=$allowedCountries, blockedCountries=$blockedCountries, avsType=$avsType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var allowedMcc: List<String>? = null
            private var blockedMcc: List<String>? = null
            private var allowedCountries: List<String>? = null
            private var blockedCountries: List<String>? = null
            private var avsType: AvsType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleUpdateBody: AuthRuleUpdateBody) = apply {
                this.allowedMcc = authRuleUpdateBody.allowedMcc
                this.blockedMcc = authRuleUpdateBody.blockedMcc
                this.allowedCountries = authRuleUpdateBody.allowedCountries
                this.blockedCountries = authRuleUpdateBody.blockedCountries
                this.avsType = authRuleUpdateBody.avsType
                additionalProperties(authRuleUpdateBody.additionalProperties)
            }

            /**
             * Array of merchant category codes for which the Auth Rule will permit
             * transactions. Note that only this field or `blocked_mcc` can be used for a given
             * Auth Rule.
             */
            @JsonProperty("allowed_mcc")
            fun allowedMcc(allowedMcc: List<String>) = apply {
                this.allowedMcc = allowedMcc
            }

            /**
             * Array of merchant category codes for which the Auth Rule will automatically
             * decline transactions. Note that only this field or `allowed_mcc` can be used for
             * a given Auth Rule.
             */
            @JsonProperty("blocked_mcc")
            fun blockedMcc(blockedMcc: List<String>) = apply {
                this.blockedMcc = blockedMcc
            }

            /**
             * Array of country codes for which the Auth Rule will permit transactions. Note
             * that only this field or `blocked_countries` can be used for a given Auth Rule.
             */
            @JsonProperty("allowed_countries")
            fun allowedCountries(allowedCountries: List<String>) = apply {
                this.allowedCountries = allowedCountries
            }

            /**
             * Array of country codes for which the Auth Rule will automatically decline
             * transactions. Note that only this field or `allowed_countries` can be used for a
             * given Auth Rule.
             */
            @JsonProperty("blocked_countries")
            fun blockedCountries(blockedCountries: List<String>) = apply {
                this.blockedCountries = blockedCountries
            }

            /**
             * Address verification to confirm that postal code entered at point of transaction
             * (if applicable) matches the postal code on file for a given card.
             */
            @JsonProperty("avs_type")
            fun avsType(avsType: AvsType) = apply {
                this.avsType = avsType
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

            fun build(): AuthRuleUpdateBody = AuthRuleUpdateBody(
                allowedMcc?.toUnmodifiable(),
                blockedMcc?.toUnmodifiable(),
                allowedCountries?.toUnmodifiable(),
                blockedCountries?.toUnmodifiable(),
                avsType,
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

      return other is AuthRuleUpdateParams &&
          this.authRuleToken == other.authRuleToken &&
          this.allowedMcc == other.allowedMcc &&
          this.blockedMcc == other.blockedMcc &&
          this.allowedCountries == other.allowedCountries &&
          this.blockedCountries == other.blockedCountries &&
          this.avsType == other.avsType &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          authRuleToken,
          allowedMcc,
          blockedMcc,
          allowedCountries,
          blockedCountries,
          avsType,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "AuthRuleUpdateParams{authRuleToken=$authRuleToken, allowedMcc=$allowedMcc, blockedMcc=$blockedMcc, allowedCountries=$allowedCountries, blockedCountries=$blockedCountries, avsType=$avsType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var allowedMcc: List<String>? = null
        private var blockedMcc: List<String>? = null
        private var allowedCountries: List<String>? = null
        private var blockedCountries: List<String>? = null
        private var avsType: AvsType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleUpdateParams: AuthRuleUpdateParams) = apply {
            this.authRuleToken = authRuleUpdateParams.authRuleToken
            this.allowedMcc = authRuleUpdateParams.allowedMcc
            this.blockedMcc = authRuleUpdateParams.blockedMcc
            this.allowedCountries = authRuleUpdateParams.allowedCountries
            this.blockedCountries = authRuleUpdateParams.blockedCountries
            this.avsType = authRuleUpdateParams.avsType
            additionalQueryParams(authRuleUpdateParams.additionalQueryParams)
            additionalHeaders(authRuleUpdateParams.additionalHeaders)
            additionalBodyProperties(authRuleUpdateParams.additionalBodyProperties)
        }

        fun authRuleToken(authRuleToken: String) = apply {
            this.authRuleToken = authRuleToken
        }

        /**
         * Array of merchant category codes for which the Auth Rule will permit
         * transactions. Note that only this field or `blocked_mcc` can be used for a given
         * Auth Rule.
         */
        fun allowedMcc(allowedMcc: List<String>) = apply {
            this.allowedMcc = allowedMcc
        }

        /**
         * Array of merchant category codes for which the Auth Rule will automatically
         * decline transactions. Note that only this field or `allowed_mcc` can be used for
         * a given Auth Rule.
         */
        fun blockedMcc(blockedMcc: List<String>) = apply {
            this.blockedMcc = blockedMcc
        }

        /**
         * Array of country codes for which the Auth Rule will permit transactions. Note
         * that only this field or `blocked_countries` can be used for a given Auth Rule.
         */
        fun allowedCountries(allowedCountries: List<String>) = apply {
            this.allowedCountries = allowedCountries
        }

        /**
         * Array of country codes for which the Auth Rule will automatically decline
         * transactions. Note that only this field or `allowed_countries` can be used for a
         * given Auth Rule.
         */
        fun blockedCountries(blockedCountries: List<String>) = apply {
            this.blockedCountries = blockedCountries
        }

        /**
         * Address verification to confirm that postal code entered at point of transaction
         * (if applicable) matches the postal code on file for a given card.
         */
        fun avsType(avsType: AvsType) = apply {
            this.avsType = avsType
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

        fun build(): AuthRuleUpdateParams = AuthRuleUpdateParams(
            checkNotNull(authRuleToken) {
                "`authRuleToken` is required but was not set"
            },
            allowedMcc?.toUnmodifiable(),
            blockedMcc?.toUnmodifiable(),
            allowedCountries?.toUnmodifiable(),
            blockedCountries?.toUnmodifiable(),
            avsType,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class AvsType @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AvsType &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ZIP_ONLY = AvsType(JsonField.of("ZIP_ONLY"))

            @JvmStatic fun of(value: String) = AvsType(JsonField.of(value))
        }

        enum class Known {
            ZIP_ONLY,
        }

        enum class Value {
            ZIP_ONLY,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ZIP_ONLY -> Value.ZIP_ONLY
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ZIP_ONLY -> Known.ZIP_ONLY
            else -> throw LithicInvalidDataException("Unknown AvsType: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
