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
import com.lithic.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AccountHolderUpdateResponse.Builder::class)
@NoAutoDetect
class AccountHolderUpdateResponse
private constructor(
    private val token: JsonField<String>,
    private val email: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The token for the account holder that was updated */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /** The newly updated email for the account holder */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /** The newly updated phone_number for the account holder */
    fun phoneNumber(): Optional<String> =
        Optional.ofNullable(phoneNumber.getNullable("phone_number"))

    /** The token for the account holder that was updated */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The newly updated email for the account holder */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** The newly updated phone_number for the account holder */
    @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            token()
            email()
            phoneNumber()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderUpdateResponse &&
            token == other.token &&
            email == other.email &&
            phoneNumber == other.phoneNumber &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    email,
                    phoneNumber,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountHolderUpdateResponse{token=$token, email=$email, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUpdateResponse: AccountHolderUpdateResponse) = apply {
            this.token = accountHolderUpdateResponse.token
            this.email = accountHolderUpdateResponse.email
            this.phoneNumber = accountHolderUpdateResponse.phoneNumber
            additionalProperties(accountHolderUpdateResponse.additionalProperties)
        }

        /** The token for the account holder that was updated */
        fun token(token: String) = token(JsonField.of(token))

        /** The token for the account holder that was updated */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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
                token,
                email,
                phoneNumber,
                additionalProperties.toUnmodifiable(),
            )
    }
}
