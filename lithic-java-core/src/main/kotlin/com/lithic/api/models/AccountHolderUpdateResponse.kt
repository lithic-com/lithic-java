// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AccountHolderUpdateResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("business_account_token")
    @ExcludeMissing
    private val businessAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_number")
    @ExcludeMissing
    private val phoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The token for the account holder that was updated */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll businesses with
     * authorized users. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): Optional<String> =
        Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

    /** The newly updated email for the account holder */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /** The newly updated phone_number for the account holder */
    fun phoneNumber(): Optional<String> =
        Optional.ofNullable(phoneNumber.getNullable("phone_number"))

    /** The token for the account holder that was updated */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll businesses with
     * authorized users. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken(): JsonField<String> = businessAccountToken

    /** The newly updated email for the account holder */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** The newly updated phone_number for the account holder */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountHolderUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        businessAccountToken()
        email()
        phoneNumber()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderUpdateResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUpdateResponse: AccountHolderUpdateResponse) = apply {
            token = accountHolderUpdateResponse.token
            businessAccountToken = accountHolderUpdateResponse.businessAccountToken
            email = accountHolderUpdateResponse.email
            phoneNumber = accountHolderUpdateResponse.phoneNumber
            additionalProperties = accountHolderUpdateResponse.additionalProperties.toMutableMap()
        }

        /** The token for the account holder that was updated */
        fun token(token: String) = token(JsonField.of(token))

        /** The token for the account holder that was updated */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll businesses with
         * authorized users. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: String) =
            businessAccountToken(JsonField.of(businessAccountToken))

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll businesses with
         * authorized users. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /** The newly updated email for the account holder */
        fun email(email: String) = email(JsonField.of(email))

        /** The newly updated email for the account holder */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The newly updated phone_number for the account holder */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /** The newly updated phone_number for the account holder */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): AccountHolderUpdateResponse =
            AccountHolderUpdateResponse(
                token,
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

        return /* spotless:off */ other is AccountHolderUpdateResponse && token == other.token && businessAccountToken == other.businessAccountToken && email == other.email && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, businessAccountToken, email, phoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderUpdateResponse{token=$token, businessAccountToken=$businessAccountToken, email=$email, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
