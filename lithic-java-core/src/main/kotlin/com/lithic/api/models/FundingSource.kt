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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = FundingSource.Builder::class)
@NoAutoDetect
class FundingSource
private constructor(
    private val accountName: JsonField<String>,
    private val created: JsonField<String>,
    private val lastFour: JsonField<String>,
    private val nickname: JsonField<String>,
    private val state: JsonField<State>,
    private val token: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {
    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Account name identifying the funding source. This may be `null`. */
    fun accountName(): Optional<String> =
        Optional.ofNullable(accountName.getNullable("account_name"))

    /**
     * An ISO 8601 string representing when this funding source was added to the Lithic account.
     * This may be `null`. UTC time zone.
     */
    fun created(): String = created.getRequired("created")

    /**
     * The last 4 digits of the account (e.g. bank account, debit card) associated with this
     * FundingAccount. This may be null.
     */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
    fun nickname(): Optional<String> = Optional.ofNullable(nickname.getNullable("nickname"))

    /**
     * State of funding source.
     *
     * Funding source states:
     *
     * - `ENABLED` - The funding account is available to use for card creation and transactions.
     * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
     * verification.
     * - `DELETED` - The founding account has been deleted.
     */
    fun state(): State = state.getRequired("state")

    /** A globally unique identifier for this FundingAccount. */
    fun token(): String = token.getRequired("token")

    /**
     * Types of funding source:
     *
     * - `DEPOSITORY_CHECKING` - Bank checking account.
     * - `DEPOSITORY_SAVINGS` - Bank savings account.
     */
    fun type(): Type = type.getRequired("type")

    /** Account name identifying the funding source. This may be `null`. */
    @JsonProperty("account_name") @ExcludeMissing fun _accountName() = accountName

    /**
     * An ISO 8601 string representing when this funding source was added to the Lithic account.
     * This may be `null`. UTC time zone.
     */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * The last 4 digits of the account (e.g. bank account, debit card) associated with this
     * FundingAccount. This may be null.
     */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour() = lastFour

    /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname() = nickname

    /**
     * State of funding source.
     *
     * Funding source states:
     *
     * - `ENABLED` - The funding account is available to use for card creation and transactions.
     * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
     * verification.
     * - `DELETED` - The founding account has been deleted.
     */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** A globally unique identifier for this FundingAccount. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * Types of funding source:
     *
     * - `DEPOSITORY_CHECKING` - Bank checking account.
     * - `DEPOSITORY_SAVINGS` - Bank savings account.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            accountName()
            created()
            lastFour()
            nickname()
            state()
            token()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FundingSource &&
            accountName == other.accountName &&
            created == other.created &&
            lastFour == other.lastFour &&
            nickname == other.nickname &&
            state == other.state &&
            token == other.token &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountName,
                    created,
                    lastFour,
                    nickname,
                    state,
                    token,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "FundingSource{accountName=$accountName, created=$created, lastFour=$lastFour, nickname=$nickname, state=$state, token=$token, type=$type, additionalProperties=$additionalProperties}"

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {
        private var accountName: JsonField<String> = JsonMissing.of()
        private var created: JsonField<String> = JsonMissing.of()
        private var lastFour: JsonField<String> = JsonMissing.of()
        private var nickname: JsonField<String> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fundingSource: FundingSource) = apply {
            this.accountName = fundingSource.accountName
            this.created = fundingSource.created
            this.lastFour = fundingSource.lastFour
            this.nickname = fundingSource.nickname
            this.state = fundingSource.state
            this.token = fundingSource.token
            this.type = fundingSource.type
            additionalProperties(fundingSource.additionalProperties)
        }

        /** Account name identifying the funding source. This may be `null`. */
        fun accountName(accountName: String) = accountName(JsonField.of(accountName))

        /** Account name identifying the funding source. This may be `null`. */
        @JsonProperty("account_name")
        @ExcludeMissing
        fun accountName(accountName: JsonField<String>) = apply { this.accountName = accountName }

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         * This may be `null`. UTC time zone.
         */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         * This may be `null`. UTC time zone.
         */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<String>) = apply { this.created = created }

        /**
         * The last 4 digits of the account (e.g. bank account, debit card) associated with this
         * FundingAccount. This may be null.
         */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /**
         * The last 4 digits of the account (e.g. bank account, debit card) associated with this
         * FundingAccount. This may be null.
         */
        @JsonProperty("last_four")
        @ExcludeMissing
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
        fun nickname(nickname: String) = nickname(JsonField.of(nickname))

        /** The nickname given to the `FundingAccount` or `null` if it has no nickname. */
        @JsonProperty("nickname")
        @ExcludeMissing
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /**
         * State of funding source.
         *
         * Funding source states:
         *
         * - `ENABLED` - The funding account is available to use for card creation and transactions.
         * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
         * verification.
         * - `DELETED` - The founding account has been deleted.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * State of funding source.
         *
         * Funding source states:
         *
         * - `ENABLED` - The funding account is available to use for card creation and transactions.
         * - `PENDING` - The funding account is still being verified e.g. bank micro-deposits
         * verification.
         * - `DELETED` - The founding account has been deleted.
         */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** A globally unique identifier for this FundingAccount. */
        fun token(token: String) = token(JsonField.of(token))

        /** A globally unique identifier for this FundingAccount. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Types of funding source:
         *
         * - `DEPOSITORY_CHECKING` - Bank checking account.
         * - `DEPOSITORY_SAVINGS` - Bank savings account.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Types of funding source:
         *
         * - `DEPOSITORY_CHECKING` - Bank checking account.
         * - `DEPOSITORY_SAVINGS` - Bank savings account.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperties(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): FundingSource =
            FundingSource(
                accountName,
                created,
                lastFour,
                nickname,
                state,
                token,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class State @JsonCreator private constructor(private val value: JsonField<String>) {
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {
            @JvmField val ENABLED = State(JsonField.of("ENABLED"))

            @JvmField val PENDING = State(JsonField.of("PENDING"))

            @JvmField val DELETED = State(JsonField.of("DELETED"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            ENABLED,
            PENDING,
            DELETED,
        }

        enum class Value {
            ENABLED,
            PENDING,
            DELETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENABLED -> Value.ENABLED
                PENDING -> Value.PENDING
                DELETED -> Value.DELETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENABLED -> Known.ENABLED
                PENDING -> Known.PENDING
                DELETED -> Known.DELETED
                else -> throw IllegalArgumentException("Unknown FundingSource.State: $value")
            }
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) {
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {
            @JvmField val DEPOSITORY_CHECKING = Type(JsonField.of("DEPOSITORY_CHECKING"))

            @JvmField val DEPOSITORY_SAVINGS = Type(JsonField.of("DEPOSITORY_SAVINGS"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DEPOSITORY_CHECKING,
            DEPOSITORY_SAVINGS,
        }

        enum class Value {
            DEPOSITORY_CHECKING,
            DEPOSITORY_SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DEPOSITORY_CHECKING -> Value.DEPOSITORY_CHECKING
                DEPOSITORY_SAVINGS -> Value.DEPOSITORY_SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DEPOSITORY_CHECKING -> Known.DEPOSITORY_CHECKING
                DEPOSITORY_SAVINGS -> Known.DEPOSITORY_SAVINGS
                else -> throw IllegalArgumentException("Unknown FundingSource.Type: $value")
            }
    }
}
