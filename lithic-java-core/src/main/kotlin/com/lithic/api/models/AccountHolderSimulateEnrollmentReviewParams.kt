// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

class AccountHolderSimulateEnrollmentReviewParams
constructor(
    private val body: AccountHolderSimulateEnrollmentReviewBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The account holder which to perform the simulation upon. */
    fun accountHolderToken(): Optional<String> = body.accountHolderToken()

    /** An account holder's status for use within the simulation. */
    fun status(): Optional<Status> = body.status()

    /**
     * Status reason that will be associated with the simulated account holder status. Only required
     * for a `REJECTED` status.
     */
    fun statusReasons(): Optional<List<StatusReason>> = body.statusReasons()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): AccountHolderSimulateEnrollmentReviewBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AccountHolderSimulateEnrollmentReviewBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_holder_token") private val accountHolderToken: String?,
        @JsonProperty("status") private val status: Status?,
        @JsonProperty("status_reasons") private val statusReasons: List<StatusReason>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The account holder which to perform the simulation upon. */
        @JsonProperty("account_holder_token")
        fun accountHolderToken(): Optional<String> = Optional.ofNullable(accountHolderToken)

        /** An account holder's status for use within the simulation. */
        @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        @JsonProperty("status_reasons")
        fun statusReasons(): Optional<List<StatusReason>> = Optional.ofNullable(statusReasons)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountHolderToken: String? = null
            private var status: Status? = null
            private var statusReasons: MutableList<StatusReason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                accountHolderSimulateEnrollmentReviewBody: AccountHolderSimulateEnrollmentReviewBody
            ) = apply {
                accountHolderToken = accountHolderSimulateEnrollmentReviewBody.accountHolderToken
                status = accountHolderSimulateEnrollmentReviewBody.status
                statusReasons =
                    accountHolderSimulateEnrollmentReviewBody.statusReasons?.toMutableList()
                additionalProperties =
                    accountHolderSimulateEnrollmentReviewBody.additionalProperties.toMutableMap()
            }

            /** The account holder which to perform the simulation upon. */
            fun accountHolderToken(accountHolderToken: String?) = apply {
                this.accountHolderToken = accountHolderToken
            }

            /** The account holder which to perform the simulation upon. */
            fun accountHolderToken(accountHolderToken: Optional<String>) =
                accountHolderToken(accountHolderToken.orElse(null))

            /** An account holder's status for use within the simulation. */
            fun status(status: Status?) = apply { this.status = status }

            /** An account holder's status for use within the simulation. */
            fun status(status: Optional<Status>) = status(status.orElse(null))

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status.
             */
            fun statusReasons(statusReasons: List<StatusReason>?) = apply {
                this.statusReasons = statusReasons?.toMutableList()
            }

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status.
             */
            fun statusReasons(statusReasons: Optional<List<StatusReason>>) =
                statusReasons(statusReasons.orElse(null))

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status.
             */
            fun addStatusReason(statusReason: StatusReason) = apply {
                statusReasons = (statusReasons ?: mutableListOf()).apply { add(statusReason) }
            }

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

            fun build(): AccountHolderSimulateEnrollmentReviewBody =
                AccountHolderSimulateEnrollmentReviewBody(
                    accountHolderToken,
                    status,
                    statusReasons?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderSimulateEnrollmentReviewBody && accountHolderToken == other.accountHolderToken && status == other.status && statusReasons == other.statusReasons && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountHolderToken, status, statusReasons, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderSimulateEnrollmentReviewBody{accountHolderToken=$accountHolderToken, status=$status, statusReasons=$statusReasons, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: AccountHolderSimulateEnrollmentReviewBody.Builder =
            AccountHolderSimulateEnrollmentReviewBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            accountHolderSimulateEnrollmentReviewParams: AccountHolderSimulateEnrollmentReviewParams
        ) = apply {
            body = accountHolderSimulateEnrollmentReviewParams.body.toBuilder()
            additionalHeaders =
                accountHolderSimulateEnrollmentReviewParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                accountHolderSimulateEnrollmentReviewParams.additionalQueryParams.toBuilder()
        }

        /** The account holder which to perform the simulation upon. */
        fun accountHolderToken(accountHolderToken: String?) = apply {
            body.accountHolderToken(accountHolderToken)
        }

        /** The account holder which to perform the simulation upon. */
        fun accountHolderToken(accountHolderToken: Optional<String>) =
            accountHolderToken(accountHolderToken.orElse(null))

        /** An account holder's status for use within the simulation. */
        fun status(status: Status?) = apply { body.status(status) }

        /** An account holder's status for use within the simulation. */
        fun status(status: Optional<Status>) = status(status.orElse(null))

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        fun statusReasons(statusReasons: List<StatusReason>?) = apply {
            body.statusReasons(statusReasons)
        }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        fun statusReasons(statusReasons: Optional<List<StatusReason>>) =
            statusReasons(statusReasons.orElse(null))

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        fun addStatusReason(statusReason: StatusReason) = apply {
            body.addStatusReason(statusReason)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): AccountHolderSimulateEnrollmentReviewParams =
            AccountHolderSimulateEnrollmentReviewParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val REJECTED = of("REJECTED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class StatusReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE = of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE")

            @JvmField
            val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE")

            @JvmField
            val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE")

            @JvmField
            val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_ID_VERIFICATION_FAILURE")

            @JvmField
            val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE")

            @JvmField
            val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE")

            @JvmField
            val BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE =
                of("BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE")

            @JvmField
            val BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE =
                of("BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE")

            @JvmField
            val BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE =
                of("BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE")

            @JvmField
            val BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE =
                of("BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE")

            @JvmStatic fun of(value: String) = StatusReason(JsonField.of(value))
        }

        enum class Known {
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE,
        }

        enum class Value {
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Value.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Value.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Known.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Known.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE
                else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentReviewParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountHolderSimulateEnrollmentReviewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
