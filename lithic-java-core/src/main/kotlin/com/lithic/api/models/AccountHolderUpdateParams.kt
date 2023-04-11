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

class AccountHolderUpdateParams constructor(private val accountHolderToken: String,private val email: String?,private val phoneNumber: String?,private val businessAccountToken: String?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun accountHolderToken(): String = accountHolderToken

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    fun businessAccountToken(): Optional<String> = Optional.ofNullable(businessAccountToken)

    @JvmSynthetic
    internal fun getBody(): AccountHolderUpdateBody {
      return AccountHolderUpdateBody(
          email,
          phoneNumber,
          businessAccountToken,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> accountHolderToken
          else -> ""
      }
    }

    @JsonDeserialize(builder = AccountHolderUpdateBody.Builder::class)
    @NoAutoDetect
    class AccountHolderUpdateBody internal constructor(private val email: String?,private val phoneNumber: String?,private val businessAccountToken: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * Account holder's email address. The primary purpose of this field is for
         * cardholder identification and verification during the digital wallet
         * tokenization process.
         */
        @JsonProperty("email")
        fun email(): String? = email

        /**
         * Account holder's phone number, entered in E.164 format. The primary purpose of
         * this field is for cardholder identification and verification during the digital
         * wallet tokenization process.
         */
        @JsonProperty("phone_number")
        fun phoneNumber(): String? = phoneNumber

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
         * users of businesses. Pass the account_token of the enrolled business associated
         * with the AUTHORIZED_USER in this field.
         */
        @JsonProperty("business_account_token")
        fun businessAccountToken(): String? = businessAccountToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AccountHolderUpdateBody &&
              this.email == other.email &&
              this.phoneNumber == other.phoneNumber &&
              this.businessAccountToken == other.businessAccountToken &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                email,
                phoneNumber,
                businessAccountToken,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "AccountHolderUpdateBody{email=$email, phoneNumber=$phoneNumber, businessAccountToken=$businessAccountToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var email: String? = null
            private var phoneNumber: String? = null
            private var businessAccountToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderUpdateBody: AccountHolderUpdateBody) = apply {
                this.email = accountHolderUpdateBody.email
                this.phoneNumber = accountHolderUpdateBody.phoneNumber
                this.businessAccountToken = accountHolderUpdateBody.businessAccountToken
                additionalProperties(accountHolderUpdateBody.additionalProperties)
            }

            /**
             * Account holder's email address. The primary purpose of this field is for
             * cardholder identification and verification during the digital wallet
             * tokenization process.
             */
            @JsonProperty("email")
            fun email(email: String) = apply {
                this.email = email
            }

            /**
             * Account holder's phone number, entered in E.164 format. The primary purpose of
             * this field is for cardholder identification and verification during the digital
             * wallet tokenization process.
             */
            @JsonProperty("phone_number")
            fun phoneNumber(phoneNumber: String) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
             * users of businesses. Pass the account_token of the enrolled business associated
             * with the AUTHORIZED_USER in this field.
             */
            @JsonProperty("business_account_token")
            fun businessAccountToken(businessAccountToken: String) = apply {
                this.businessAccountToken = businessAccountToken
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

            fun build(): AccountHolderUpdateBody = AccountHolderUpdateBody(
                email,
                phoneNumber,
                businessAccountToken,
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

      return other is AccountHolderUpdateParams &&
          this.accountHolderToken == other.accountHolderToken &&
          this.email == other.email &&
          this.phoneNumber == other.phoneNumber &&
          this.businessAccountToken == other.businessAccountToken &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          accountHolderToken,
          email,
          phoneNumber,
          businessAccountToken,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "AccountHolderUpdateParams{accountHolderToken=$accountHolderToken, email=$email, phoneNumber=$phoneNumber, businessAccountToken=$businessAccountToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var email: String? = null
        private var phoneNumber: String? = null
        private var businessAccountToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUpdateParams: AccountHolderUpdateParams) = apply {
            this.accountHolderToken = accountHolderUpdateParams.accountHolderToken
            this.email = accountHolderUpdateParams.email
            this.phoneNumber = accountHolderUpdateParams.phoneNumber
            this.businessAccountToken = accountHolderUpdateParams.businessAccountToken
            additionalQueryParams(accountHolderUpdateParams.additionalQueryParams)
            additionalHeaders(accountHolderUpdateParams.additionalHeaders)
            additionalBodyProperties(accountHolderUpdateParams.additionalBodyProperties)
        }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /**
         * Account holder's email address. The primary purpose of this field is for
         * cardholder identification and verification during the digital wallet
         * tokenization process.
         */
        fun email(email: String) = apply {
            this.email = email
        }

        /**
         * Account holder's phone number, entered in E.164 format. The primary purpose of
         * this field is for cardholder identification and verification during the digital
         * wallet tokenization process.
         */
        fun phoneNumber(phoneNumber: String) = apply {
            this.phoneNumber = phoneNumber
        }

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
         * users of businesses. Pass the account_token of the enrolled business associated
         * with the AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: String) = apply {
            this.businessAccountToken = businessAccountToken
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

        fun build(): AccountHolderUpdateParams = AccountHolderUpdateParams(
            checkNotNull(accountHolderToken) {
                "`accountHolderToken` is required but was not set"
            },
            email,
            phoneNumber,
            businessAccountToken,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
