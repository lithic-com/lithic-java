// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
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

@JsonDeserialize(builder = AccountHolderCreateResponse.Builder::class)
@NoAutoDetect
class AccountHolderCreateResponse
private constructor(
    private val accountToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val externalId: JsonField<String>,
    private val status: JsonField<Status>,
    private val statusReasons: JsonField<List<StatusReason>>,
    private val requiredDocuments: JsonField<List<RequiredDocument>>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for the account. */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /** Timestamp of when the account holder was created. */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /**
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
     *   workflow.
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    fun status(): Status = status.getRequired("status")

    /** Reason for the evaluation status. */
    fun statusReasons(): List<StatusReason> = statusReasons.getRequired("status_reasons")

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    fun requiredDocuments(): Optional<List<RequiredDocument>> =
        Optional.ofNullable(requiredDocuments.getNullable("required_documents"))

    /** Globally unique identifier for the account holder. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the account. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** Timestamp of when the account holder was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /**
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
     *   workflow.
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Reason for the evaluation status. */
    @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    @JsonProperty("required_documents") @ExcludeMissing fun _requiredDocuments() = requiredDocuments

    /** Globally unique identifier for the account holder. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountHolderCreateResponse = apply {
        if (!validated) {
            accountToken()
            created()
            externalId()
            status()
            statusReasons()
            requiredDocuments().map { it.forEach { it.validate() } }
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderCreateResponse &&
            this.accountToken == other.accountToken &&
            this.created == other.created &&
            this.externalId == other.externalId &&
            this.status == other.status &&
            this.statusReasons == other.statusReasons &&
            this.requiredDocuments == other.requiredDocuments &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountToken,
                    created,
                    externalId,
                    status,
                    statusReasons,
                    requiredDocuments,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountHolderCreateResponse{accountToken=$accountToken, created=$created, externalId=$externalId, status=$status, statusReasons=$statusReasons, requiredDocuments=$requiredDocuments, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
        private var requiredDocuments: JsonField<List<RequiredDocument>> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderCreateResponse: AccountHolderCreateResponse) = apply {
            this.accountToken = accountHolderCreateResponse.accountToken
            this.created = accountHolderCreateResponse.created
            this.externalId = accountHolderCreateResponse.externalId
            this.status = accountHolderCreateResponse.status
            this.statusReasons = accountHolderCreateResponse.statusReasons
            this.requiredDocuments = accountHolderCreateResponse.requiredDocuments
            this.token = accountHolderCreateResponse.token
            additionalProperties(accountHolderCreateResponse.additionalProperties)
        }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account. */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Timestamp of when the account holder was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the account holder was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
         *   workflow.
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
         *   workflow.
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
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

        /**
         * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required
         * for the account holder to be approved.
         */
        fun requiredDocuments(requiredDocuments: List<RequiredDocument>) =
            requiredDocuments(JsonField.of(requiredDocuments))

        /**
         * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required
         * for the account holder to be approved.
         */
        @JsonProperty("required_documents")
        @ExcludeMissing
        fun requiredDocuments(requiredDocuments: JsonField<List<RequiredDocument>>) = apply {
            this.requiredDocuments = requiredDocuments
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account holder. */
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

        fun build(): AccountHolderCreateResponse =
            AccountHolderCreateResponse(
                accountToken,
                created,
                externalId,
                status,
                statusReasons.map { it.toUnmodifiable() },
                requiredDocuments.map { it.toUnmodifiable() },
                token,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val PENDING_REVIEW = Status(JsonField.of("PENDING_REVIEW"))

            @JvmField val PENDING_DOCUMENT = Status(JsonField.of("PENDING_DOCUMENT"))

            @JvmField val PENDING_RESUBMIT = Status(JsonField.of("PENDING_RESUBMIT"))

            @JvmField val REJECTED = Status(JsonField.of("REJECTED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                PENDING_REVIEW -> Value.PENDING_REVIEW
                PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                PENDING_REVIEW -> Known.PENDING_REVIEW
                PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StatusReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
