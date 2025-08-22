// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Simulate payment lifecycle event */
class PaymentSimulateActionParams
private constructor(
    private val paymentToken: String?,
    private val body: SimulateActionRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun paymentToken(): Optional<String> = Optional.ofNullable(paymentToken)

    /**
     * Event Type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): SupportedSimulationTypes = body.eventType()

    /**
     * Decline reason
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun declineReason(): Optional<SupportedSimulationDeclineReasons> = body.declineReason()

    /**
     * Return Reason Code
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun returnReasonCode(): Optional<String> = body.returnReasonCode()

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventType(): JsonField<SupportedSimulationTypes> = body._eventType()

    /**
     * Returns the raw JSON value of [declineReason].
     *
     * Unlike [declineReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _declineReason(): JsonField<SupportedSimulationDeclineReasons> = body._declineReason()

    /**
     * Returns the raw JSON value of [returnReasonCode].
     *
     * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _returnReasonCode(): JsonField<String> = body._returnReasonCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentSimulateActionParams].
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentSimulateActionParams]. */
    class Builder internal constructor() {

        private var paymentToken: String? = null
        private var body: SimulateActionRequest.Builder = SimulateActionRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentSimulateActionParams: PaymentSimulateActionParams) = apply {
            paymentToken = paymentSimulateActionParams.paymentToken
            body = paymentSimulateActionParams.body.toBuilder()
            additionalHeaders = paymentSimulateActionParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentSimulateActionParams.additionalQueryParams.toBuilder()
        }

        fun paymentToken(paymentToken: String?) = apply { this.paymentToken = paymentToken }

        /** Alias for calling [Builder.paymentToken] with `paymentToken.orElse(null)`. */
        fun paymentToken(paymentToken: Optional<String>) = paymentToken(paymentToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [eventType]
         * - [declineReason]
         * - [returnReasonCode]
         */
        fun body(body: SimulateActionRequest) = apply { this.body = body.toBuilder() }

        /** Event Type */
        fun eventType(eventType: SupportedSimulationTypes) = apply { body.eventType(eventType) }

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [SupportedSimulationTypes]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun eventType(eventType: JsonField<SupportedSimulationTypes>) = apply {
            body.eventType(eventType)
        }

        /** Decline reason */
        fun declineReason(declineReason: SupportedSimulationDeclineReasons) = apply {
            body.declineReason(declineReason)
        }

        /**
         * Sets [Builder.declineReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declineReason] with a well-typed
         * [SupportedSimulationDeclineReasons] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun declineReason(declineReason: JsonField<SupportedSimulationDeclineReasons>) = apply {
            body.declineReason(declineReason)
        }

        /** Return Reason Code */
        fun returnReasonCode(returnReasonCode: String) = apply {
            body.returnReasonCode(returnReasonCode)
        }

        /**
         * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnReasonCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
            body.returnReasonCode(returnReasonCode)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PaymentSimulateActionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentSimulateActionParams =
            PaymentSimulateActionParams(
                paymentToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SimulateActionRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> paymentToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class SimulateActionRequest
    private constructor(
        private val eventType: JsonField<SupportedSimulationTypes>,
        private val declineReason: JsonField<SupportedSimulationDeclineReasons>,
        private val returnReasonCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<SupportedSimulationTypes> = JsonMissing.of(),
            @JsonProperty("decline_reason")
            @ExcludeMissing
            declineReason: JsonField<SupportedSimulationDeclineReasons> = JsonMissing.of(),
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            returnReasonCode: JsonField<String> = JsonMissing.of(),
        ) : this(eventType, declineReason, returnReasonCode, mutableMapOf())

        /**
         * Event Type
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): SupportedSimulationTypes = eventType.getRequired("event_type")

        /**
         * Decline reason
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun declineReason(): Optional<SupportedSimulationDeclineReasons> =
            declineReason.getOptional("decline_reason")

        /**
         * Return Reason Code
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun returnReasonCode(): Optional<String> =
            returnReasonCode.getOptional("return_reason_code")

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<SupportedSimulationTypes> = eventType

        /**
         * Returns the raw JSON value of [declineReason].
         *
         * Unlike [declineReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("decline_reason")
        @ExcludeMissing
        fun _declineReason(): JsonField<SupportedSimulationDeclineReasons> = declineReason

        /**
         * Returns the raw JSON value of [returnReasonCode].
         *
         * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<String> = returnReasonCode

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [SimulateActionRequest].
             *
             * The following fields are required:
             * ```java
             * .eventType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimulateActionRequest]. */
        class Builder internal constructor() {

            private var eventType: JsonField<SupportedSimulationTypes>? = null
            private var declineReason: JsonField<SupportedSimulationDeclineReasons> =
                JsonMissing.of()
            private var returnReasonCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulateActionRequest: SimulateActionRequest) = apply {
                eventType = simulateActionRequest.eventType
                declineReason = simulateActionRequest.declineReason
                returnReasonCode = simulateActionRequest.returnReasonCode
                additionalProperties = simulateActionRequest.additionalProperties.toMutableMap()
            }

            /** Event Type */
            fun eventType(eventType: SupportedSimulationTypes) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed
             * [SupportedSimulationTypes] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun eventType(eventType: JsonField<SupportedSimulationTypes>) = apply {
                this.eventType = eventType
            }

            /** Decline reason */
            fun declineReason(declineReason: SupportedSimulationDeclineReasons) =
                declineReason(JsonField.of(declineReason))

            /**
             * Sets [Builder.declineReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declineReason] with a well-typed
             * [SupportedSimulationDeclineReasons] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun declineReason(declineReason: JsonField<SupportedSimulationDeclineReasons>) = apply {
                this.declineReason = declineReason
            }

            /** Return Reason Code */
            fun returnReasonCode(returnReasonCode: String) =
                returnReasonCode(JsonField.of(returnReasonCode))

            /**
             * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReasonCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [SimulateActionRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .eventType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SimulateActionRequest =
                SimulateActionRequest(
                    checkRequired("eventType", eventType),
                    declineReason,
                    returnReasonCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SimulateActionRequest = apply {
            if (validated) {
                return@apply
            }

            eventType().validate()
            declineReason().ifPresent { it.validate() }
            returnReasonCode()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                (declineReason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (returnReasonCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulateActionRequest &&
                eventType == other.eventType &&
                declineReason == other.declineReason &&
                returnReasonCode == other.returnReasonCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eventType, declineReason, returnReasonCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulateActionRequest{eventType=$eventType, declineReason=$declineReason, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"
    }

    /** Event Type */
    class SupportedSimulationTypes
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

            @JvmField val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

            @JvmField val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

            @JvmField val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

            @JvmField val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

            @JvmField val ACH_RECEIPT_RELEASED = of("ACH_RECEIPT_RELEASED")

            @JvmField val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

            @JvmField val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

            @JvmField val ACH_RETURN_SETTLED = of("ACH_RETURN_SETTLED")

            @JvmStatic fun of(value: String) = SupportedSimulationTypes(JsonField.of(value))
        }

        /** An enum containing [SupportedSimulationTypes]'s known values. */
        enum class Known {
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_SETTLED,
            ACH_RECEIPT_RELEASED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
            ACH_RETURN_SETTLED,
        }

        /**
         * An enum containing [SupportedSimulationTypes]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SupportedSimulationTypes] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_SETTLED,
            ACH_RECEIPT_RELEASED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
            ACH_RETURN_SETTLED,
            /**
             * An enum member indicating that [SupportedSimulationTypes] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                ACH_RECEIPT_RELEASED -> Value.ACH_RECEIPT_RELEASED
                ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                ACH_RETURN_SETTLED -> Value.ACH_RETURN_SETTLED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                ACH_RECEIPT_RELEASED -> Known.ACH_RECEIPT_RELEASED
                ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                ACH_RETURN_SETTLED -> Known.ACH_RETURN_SETTLED
                else -> throw LithicInvalidDataException("Unknown SupportedSimulationTypes: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): SupportedSimulationTypes = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupportedSimulationTypes && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Decline reason */
    class SupportedSimulationDeclineReasons
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField
            val PROGRAM_TRANSACTION_LIMIT_EXCEEDED = of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED")

            @JvmField val PROGRAM_DAILY_LIMIT_EXCEEDED = of("PROGRAM_DAILY_LIMIT_EXCEEDED")

            @JvmField val PROGRAM_MONTHLY_LIMIT_EXCEEDED = of("PROGRAM_MONTHLY_LIMIT_EXCEEDED")

            @JvmStatic
            fun of(value: String) = SupportedSimulationDeclineReasons(JsonField.of(value))
        }

        /** An enum containing [SupportedSimulationDeclineReasons]'s known values. */
        enum class Known {
            PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
            PROGRAM_DAILY_LIMIT_EXCEEDED,
            PROGRAM_MONTHLY_LIMIT_EXCEEDED,
        }

        /**
         * An enum containing [SupportedSimulationDeclineReasons]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [SupportedSimulationDeclineReasons] can contain an unknown value in a
         * couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
            PROGRAM_DAILY_LIMIT_EXCEEDED,
            PROGRAM_MONTHLY_LIMIT_EXCEEDED,
            /**
             * An enum member indicating that [SupportedSimulationDeclineReasons] was instantiated
             * with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Value.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                PROGRAM_DAILY_LIMIT_EXCEEDED -> Value.PROGRAM_DAILY_LIMIT_EXCEEDED
                PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Known.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                PROGRAM_DAILY_LIMIT_EXCEEDED -> Known.PROGRAM_DAILY_LIMIT_EXCEEDED
                PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                else ->
                    throw LithicInvalidDataException(
                        "Unknown SupportedSimulationDeclineReasons: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): SupportedSimulationDeclineReasons = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupportedSimulationDeclineReasons && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentSimulateActionParams &&
            paymentToken == other.paymentToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(paymentToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PaymentSimulateActionParams{paymentToken=$paymentToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
