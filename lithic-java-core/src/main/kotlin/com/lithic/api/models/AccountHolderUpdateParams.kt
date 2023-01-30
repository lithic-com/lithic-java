package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AccountHolderUpdateParams
constructor(
    private val accountHolderToken: String,
    private val email: String?,
    private val phoneNumber: String?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountHolderToken(): String = accountHolderToken

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    @JvmSynthetic
    internal fun toBody(): AccountHolderUpdateBody =
        AccountHolderUpdateBody(email, phoneNumber, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AccountHolderUpdateBody
    internal constructor(
        private val email: String?,
        private val phoneNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Account holder's email address. The primary purpose of this field is for cardholder
         * identification and verification during the digital wallet tokenization process.
         */
        @JsonProperty("email") fun email(): String? = email

        /**
         * Account holder's phone number, entered in E.164 format. The primary purpose of this field
         * is for cardholder identification and verification during the digital wallet tokenization
         * process.
         */
        @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolderUpdateBody &&
                email == other.email &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        email,
                        phoneNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderUpdateBody{email=$email, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var email: String? = null
            private var phoneNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderUpdateBody: AccountHolderUpdateBody) = apply {
                this.email = accountHolderUpdateBody.email
                this.phoneNumber = accountHolderUpdateBody.phoneNumber
                additionalProperties(accountHolderUpdateBody.additionalProperties)
            }

            /**
             * Account holder's email address. The primary purpose of this field is for cardholder
             * identification and verification during the digital wallet tokenization process.
             */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /**
             * Account holder's phone number, entered in E.164 format. The primary purpose of this
             * field is for cardholder identification and verification during the digital wallet
             * tokenization process.
             */
            @JsonProperty("phone_number")
            fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

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

            fun build(): AccountHolderUpdateBody =
                AccountHolderUpdateBody(
                    email,
                    phoneNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderUpdateParams &&
            accountHolderToken == other.accountHolderToken &&
            email == other.email &&
            phoneNumber == other.phoneNumber &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountHolderToken,
            email,
            phoneNumber,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountHolderUpdateParams{accountHolderToken=$accountHolderToken, email=$email, phoneNumber=$phoneNumber, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var email: String? = null
        private var phoneNumber: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUpdateParams: AccountHolderUpdateParams) = apply {
            this.accountHolderToken = accountHolderUpdateParams.accountHolderToken
            this.email = accountHolderUpdateParams.email
            this.phoneNumber = accountHolderUpdateParams.phoneNumber
            additionalQueryParams(accountHolderUpdateParams.additionalQueryParams)
            additionalHeaders(accountHolderUpdateParams.additionalHeaders)
            additionalBodyProperties(accountHolderUpdateParams.additionalBodyProperties)
        }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /**
         * Account holder's email address. The primary purpose of this field is for cardholder
         * identification and verification during the digital wallet tokenization process.
         */
        fun email(email: String) = apply { this.email = email }

        /**
         * Account holder's phone number, entered in E.164 format. The primary purpose of this field
         * is for cardholder identification and verification during the digital wallet tokenization
         * process.
         */
        fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountHolderUpdateParams =
            AccountHolderUpdateParams(
                checkNotNull(accountHolderToken) {
                    "Property `accountHolderToken` is required but was not set"
                },
                email,
                phoneNumber,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
