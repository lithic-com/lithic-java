// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Financial Account */
@JsonDeserialize(builder = FinancialAccount.Builder::class)
@NoAutoDetect
class FinancialAccount
private constructor(
    private val accountNumber: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val nickname: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val token: JsonField<String>,
    private val type: JsonField<Type>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Account number for your Lithic-assigned bank account number, if applicable. */
    fun accountNumber(): Optional<String> =
        Optional.ofNullable(accountNumber.getNullable("account_number"))

    /** Date and time for when the financial account was first created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** User-defined nickname for the financial account. */
    fun nickname(): Optional<String> = Optional.ofNullable(nickname.getNullable("nickname"))

    /** Routing number for your Lithic-assigned bank account number, if applicable. */
    fun routingNumber(): Optional<String> =
        Optional.ofNullable(routingNumber.getNullable("routing_number"))

    /** Globally unique identifier for the financial account. */
    fun token(): String = token.getRequired("token")

    /** Type of financial account */
    fun type(): Type = type.getRequired("type")

    /** Date and time for when the financial account was last updated. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Account number for your Lithic-assigned bank account number, if applicable. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** Date and time for when the financial account was first created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** User-defined nickname for the financial account. */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname() = nickname

    /** Routing number for your Lithic-assigned bank account number, if applicable. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** Globally unique identifier for the financial account. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Type of financial account */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** Date and time for when the financial account was last updated. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FinancialAccount = apply {
        if (!validated) {
            accountNumber()
            created()
            nickname()
            routingNumber()
            token()
            type()
            updated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccount &&
            this.accountNumber == other.accountNumber &&
            this.created == other.created &&
            this.nickname == other.nickname &&
            this.routingNumber == other.routingNumber &&
            this.token == other.token &&
            this.type == other.type &&
            this.updated == other.updated &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountNumber,
                    created,
                    nickname,
                    routingNumber,
                    token,
                    type,
                    updated,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "FinancialAccount{accountNumber=$accountNumber, created=$created, nickname=$nickname, routingNumber=$routingNumber, token=$token, type=$type, updated=$updated, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var nickname: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccount: FinancialAccount) = apply {
            this.accountNumber = financialAccount.accountNumber
            this.created = financialAccount.created
            this.nickname = financialAccount.nickname
            this.routingNumber = financialAccount.routingNumber
            this.token = financialAccount.token
            this.type = financialAccount.type
            this.updated = financialAccount.updated
            additionalProperties(financialAccount.additionalProperties)
        }

        /** Account number for your Lithic-assigned bank account number, if applicable. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** Account number for your Lithic-assigned bank account number, if applicable. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** Date and time for when the financial account was first created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time for when the financial account was first created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** User-defined nickname for the financial account. */
        fun nickname(nickname: String) = nickname(JsonField.of(nickname))

        /** User-defined nickname for the financial account. */
        @JsonProperty("nickname")
        @ExcludeMissing
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /** Routing number for your Lithic-assigned bank account number, if applicable. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** Routing number for your Lithic-assigned bank account number, if applicable. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** Globally unique identifier for the financial account. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the financial account. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Type of financial account */
        fun type(type: Type) = type(JsonField.of(type))

        /** Type of financial account */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Date and time for when the financial account was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time for when the financial account was last updated. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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

        fun build(): FinancialAccount =
            FinancialAccount(
                accountNumber,
                created,
                nickname,
                routingNumber,
                token,
                type,
                updated,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ISSUING = Type(JsonField.of("ISSUING"))

            @JvmField val OPERATING = Type(JsonField.of("OPERATING"))

            @JvmField val RESERVE = Type(JsonField.of("RESERVE"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ISSUING,
            OPERATING,
            RESERVE,
        }

        enum class Value {
            ISSUING,
            OPERATING,
            RESERVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ISSUING -> Value.ISSUING
                OPERATING -> Value.OPERATING
                RESERVE -> Value.RESERVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ISSUING -> Known.ISSUING
                OPERATING -> Known.OPERATING
                RESERVE -> Known.RESERVE
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
