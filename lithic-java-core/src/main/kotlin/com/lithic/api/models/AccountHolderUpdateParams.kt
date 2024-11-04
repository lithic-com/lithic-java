// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AccountHolderUpdateParams
constructor(
    private val accountHolderToken: String,
    private val businessAccountToken: String?,
    private val email: String?,
    private val phoneNumber: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountHolderToken(): String = accountHolderToken

    fun businessAccountToken(): Optional<String> = Optional.ofNullable(businessAccountToken)

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    @JvmSynthetic
    internal fun getBody(): AccountHolderUpdateBody {
        return AccountHolderUpdateBody(
            businessAccountToken,
            email,
            phoneNumber,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountHolderUpdateBody.Builder::class)
    @NoAutoDetect
    class AccountHolderUpdateBody
    internal constructor(
        private val businessAccountToken: String?,
        private val email: String?,
        private val phoneNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        @JsonProperty("business_account_token")
        fun businessAccountToken(): String? = businessAccountToken

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

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var businessAccountToken: String? = null
            private var email: String? = null
            private var phoneNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderUpdateBody: AccountHolderUpdateBody) = apply {
                this.businessAccountToken = accountHolderUpdateBody.businessAccountToken
                this.email = accountHolderUpdateBody.email
                this.phoneNumber = accountHolderUpdateBody.phoneNumber
                additionalProperties(accountHolderUpdateBody.additionalProperties)
            }

            /**
             * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
             * users of businesses. Pass the account_token of the enrolled business associated with
             * the AUTHORIZED_USER in this field.
             */
            @JsonProperty("business_account_token")
            fun businessAccountToken(businessAccountToken: String) = apply {
                this.businessAccountToken = businessAccountToken
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
                    businessAccountToken,
                    email,
                    phoneNumber,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderUpdateBody && this.businessAccountToken == other.businessAccountToken && this.email == other.email && this.phoneNumber == other.phoneNumber && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(businessAccountToken, email, phoneNumber, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderUpdateBody{businessAccountToken=$businessAccountToken, email=$email, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderUpdateParams && this.accountHolderToken == other.accountHolderToken && this.businessAccountToken == other.businessAccountToken && this.email == other.email && this.phoneNumber == other.phoneNumber && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountHolderToken, businessAccountToken, email, phoneNumber, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountHolderUpdateParams{accountHolderToken=$accountHolderToken, businessAccountToken=$businessAccountToken, email=$email, phoneNumber=$phoneNumber, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var businessAccountToken: String? = null
        private var email: String? = null
        private var phoneNumber: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUpdateParams: AccountHolderUpdateParams) = apply {
            this.accountHolderToken = accountHolderUpdateParams.accountHolderToken
            this.businessAccountToken = accountHolderUpdateParams.businessAccountToken
            this.email = accountHolderUpdateParams.email
            this.phoneNumber = accountHolderUpdateParams.phoneNumber
            additionalHeaders(accountHolderUpdateParams.additionalHeaders)
            additionalQueryParams(accountHolderUpdateParams.additionalQueryParams)
            additionalBodyProperties(accountHolderUpdateParams.additionalBodyProperties)
        }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: String) = apply {
            this.businessAccountToken = businessAccountToken
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): AccountHolderUpdateParams =
            AccountHolderUpdateParams(
                checkNotNull(accountHolderToken) {
                    "`accountHolderToken` is required but was not set"
                },
                businessAccountToken,
                email,
                phoneNumber,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
