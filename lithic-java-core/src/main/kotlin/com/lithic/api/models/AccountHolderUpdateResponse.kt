// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AccountHolderUpdateResponse.Builder::class)
@NoAutoDetect
class AccountHolderUpdateResponse
private constructor(
    private val businessAccountToken: JsonField<String>,
    private val email: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll businesses with
     * authorized users. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken() = businessAccountToken

    /** The newly updated email for the account holder */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** The newly updated phone_number for the account holder */
    @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

    /** The token for the account holder that was updated */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountHolderUpdateResponse = apply {
        if (!validated) {
            businessAccountToken()
            email()
            phoneNumber()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUpdateResponse: AccountHolderUpdateResponse) = apply {
            this.businessAccountToken = accountHolderUpdateResponse.businessAccountToken
            this.email = accountHolderUpdateResponse.email
            this.phoneNumber = accountHolderUpdateResponse.phoneNumber
            this.token = accountHolderUpdateResponse.token
            additionalProperties(accountHolderUpdateResponse.additionalProperties)
        }

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
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /** The newly updated email for the account holder */
        fun email(email: String) = email(JsonField.of(email))

        /** The newly updated email for the account holder */
        @JsonProperty("email")
        @ExcludeMissing
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The newly updated phone_number for the account holder */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /** The newly updated phone_number for the account holder */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** The token for the account holder that was updated */
        fun token(token: String) = token(JsonField.of(token))

        /** The token for the account holder that was updated */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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

        fun build(): AccountHolderUpdateResponse =
            AccountHolderUpdateResponse(
                businessAccountToken,
                email,
                phoneNumber,
                token,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderUpdateResponse && businessAccountToken == other.businessAccountToken && email == other.email && phoneNumber == other.phoneNumber && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessAccountToken, email, phoneNumber, token, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderUpdateResponse{businessAccountToken=$businessAccountToken, email=$email, phoneNumber=$phoneNumber, token=$token, additionalProperties=$additionalProperties}"
}
