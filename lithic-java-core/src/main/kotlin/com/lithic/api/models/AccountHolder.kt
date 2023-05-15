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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AccountHolder.Builder::class)
@NoAutoDetect
class AccountHolder
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val businessAccountToken: JsonField<String>,
    private val status: JsonField<Status>,
    private val statusReasons: JsonField<List<StatusReason>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for the account holder. */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /** Globally unique identifier for the account. */
    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): Optional<String> =
        Optional.ofNullable(businessAccountToken.getNullable("business_account_token"))

    /**
     * KYC and KYB evaluation states.
     *
     * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
     * workflow.
     */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /** Reason for the evaluation status. */
    fun statusReasons(): Optional<List<StatusReason>> =
        Optional.ofNullable(statusReasons.getNullable("status_reasons"))

    /** Globally unique identifier for the account holder. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier for the account. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken() = businessAccountToken

    /**
     * KYC and KYB evaluation states.
     *
     * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
     * workflow.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Reason for the evaluation status. */
    @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountHolder = apply {
        if (!validated) {
            token()
            accountToken()
            businessAccountToken()
            status()
            statusReasons()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolder &&
            this.token == other.token &&
            this.accountToken == other.accountToken &&
            this.businessAccountToken == other.businessAccountToken &&
            this.status == other.status &&
            this.statusReasons == other.statusReasons &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    accountToken,
                    businessAccountToken,
                    status,
                    statusReasons,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountHolder{token=$token, accountToken=$accountToken, businessAccountToken=$businessAccountToken, status=$status, statusReasons=$statusReasons, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolder: AccountHolder) = apply {
            this.token = accountHolder.token
            this.accountToken = accountHolder.accountToken
            this.businessAccountToken = accountHolder.businessAccountToken
            this.status = accountHolder.status
            this.statusReasons = accountHolder.statusReasons
            additionalProperties(accountHolder.additionalProperties)
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account holder. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account. */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: String) =
            businessAccountToken(JsonField.of(businessAccountToken))

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /**
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Reason for the evaluation status. */
        fun statusReasons(statusReasons: List<StatusReason>) =
            statusReasons(JsonField.of(statusReasons))

        /** Reason for the evaluation status. */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
            this.statusReasons = statusReasons
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

        fun build(): AccountHolder =
            AccountHolder(
                token,
                accountToken,
                businessAccountToken,
                status,
                statusReasons.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCEPTED = Status(JsonField.of("ACCEPTED"))

            @JvmField val REJECTED = Status(JsonField.of("REJECTED"))

            @JvmField val PENDING_RESUBMIT = Status(JsonField.of("PENDING_RESUBMIT"))

            @JvmField val PENDING_DOCUMENT = Status(JsonField.of("PENDING_DOCUMENT"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            REJECTED,
            PENDING_RESUBMIT,
            PENDING_DOCUMENT,
        }

        enum class Value {
            ACCEPTED,
            REJECTED,
            PENDING_RESUBMIT,
            PENDING_DOCUMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StatusReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StatusReason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val ADDRESS_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("ADDRESS_VERIFICATION_FAILURE"))

            @JvmField
            val AGE_THRESHOLD_FAILURE = StatusReason(JsonField.of("AGE_THRESHOLD_FAILURE"))

            @JvmField
            val COMPLETE_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("COMPLETE_VERIFICATION_FAILURE"))

            @JvmField
            val DOB_VERIFICATION_FAILURE = StatusReason(JsonField.of("DOB_VERIFICATION_FAILURE"))

            @JvmField
            val ID_VERIFICATION_FAILURE = StatusReason(JsonField.of("ID_VERIFICATION_FAILURE"))

            @JvmField
            val MAX_DOCUMENT_ATTEMPTS = StatusReason(JsonField.of("MAX_DOCUMENT_ATTEMPTS"))

            @JvmField
            val MAX_RESUBMISSION_ATTEMPTS = StatusReason(JsonField.of("MAX_RESUBMISSION_ATTEMPTS"))

            @JvmField
            val NAME_VERIFICATION_FAILURE = StatusReason(JsonField.of("NAME_VERIFICATION_FAILURE"))

            @JvmField
            val OTHER_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("OTHER_VERIFICATION_FAILURE"))

            @JvmField
            val RISK_THRESHOLD_FAILURE = StatusReason(JsonField.of("RISK_THRESHOLD_FAILURE"))

            @JvmField
            val WATCHLIST_ALERT_FAILURE = StatusReason(JsonField.of("WATCHLIST_ALERT_FAILURE"))

            @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
        }

        enum class Known {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
        }

        enum class Value {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ADDRESS_VERIFICATION_FAILURE -> Value.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Value.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Value.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Value.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Value.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Value.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Value.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Value.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Value.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Value.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Value.WATCHLIST_ALERT_FAILURE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ADDRESS_VERIFICATION_FAILURE -> Known.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Known.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Known.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Known.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Known.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Known.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Known.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Known.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Known.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Known.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Known.WATCHLIST_ALERT_FAILURE
                else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
