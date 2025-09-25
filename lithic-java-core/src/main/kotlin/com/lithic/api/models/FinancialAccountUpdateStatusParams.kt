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

/** Update financial account status */
class FinancialAccountUpdateStatusParams
private constructor(
    private val financialAccountToken: String?,
    private val body: UpdateFinancialAccountStatusRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun financialAccountToken(): Optional<String> = Optional.ofNullable(financialAccountToken)

    /**
     * Status of the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): FinancialAccountStatus = body.status()

    /**
     * Substatus for the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun substatus(): Optional<UpdateFinancialAccountSubstatus> = body.substatus()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<FinancialAccountStatus> = body._status()

    /**
     * Returns the raw JSON value of [substatus].
     *
     * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _substatus(): JsonField<UpdateFinancialAccountSubstatus> = body._substatus()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountUpdateStatusParams].
         *
         * The following fields are required:
         * ```java
         * .status()
         * .substatus()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountUpdateStatusParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var body: UpdateFinancialAccountStatusRequest.Builder =
            UpdateFinancialAccountStatusRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(financialAccountUpdateStatusParams: FinancialAccountUpdateStatusParams) =
            apply {
                financialAccountToken = financialAccountUpdateStatusParams.financialAccountToken
                body = financialAccountUpdateStatusParams.body.toBuilder()
                additionalHeaders = financialAccountUpdateStatusParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    financialAccountUpdateStatusParams.additionalQueryParams.toBuilder()
            }

        fun financialAccountToken(financialAccountToken: String?) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /**
         * Alias for calling [Builder.financialAccountToken] with
         * `financialAccountToken.orElse(null)`.
         */
        fun financialAccountToken(financialAccountToken: Optional<String>) =
            financialAccountToken(financialAccountToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [status]
         * - [substatus]
         */
        fun body(body: UpdateFinancialAccountStatusRequest) = apply { this.body = body.toBuilder() }

        /** Status of the financial account */
        fun status(status: FinancialAccountStatus) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [FinancialAccountStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<FinancialAccountStatus>) = apply { body.status(status) }

        /** Substatus for the financial account */
        fun substatus(substatus: UpdateFinancialAccountSubstatus?) = apply {
            body.substatus(substatus)
        }

        /** Alias for calling [Builder.substatus] with `substatus.orElse(null)`. */
        fun substatus(substatus: Optional<UpdateFinancialAccountSubstatus>) =
            substatus(substatus.getOrNull())

        /**
         * Sets [Builder.substatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.substatus] with a well-typed
         * [UpdateFinancialAccountSubstatus] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun substatus(substatus: JsonField<UpdateFinancialAccountSubstatus>) = apply {
            body.substatus(substatus)
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

        /**
         * Returns an immutable instance of [FinancialAccountUpdateStatusParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * .substatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountUpdateStatusParams =
            FinancialAccountUpdateStatusParams(
                financialAccountToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UpdateFinancialAccountStatusRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class UpdateFinancialAccountStatusRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val status: JsonField<FinancialAccountStatus>,
        private val substatus: JsonField<UpdateFinancialAccountSubstatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<FinancialAccountStatus> = JsonMissing.of(),
            @JsonProperty("substatus")
            @ExcludeMissing
            substatus: JsonField<UpdateFinancialAccountSubstatus> = JsonMissing.of(),
        ) : this(status, substatus, mutableMapOf())

        /**
         * Status of the financial account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): FinancialAccountStatus = status.getRequired("status")

        /**
         * Substatus for the financial account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun substatus(): Optional<UpdateFinancialAccountSubstatus> =
            substatus.getOptional("substatus")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<FinancialAccountStatus> = status

        /**
         * Returns the raw JSON value of [substatus].
         *
         * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("substatus")
        @ExcludeMissing
        fun _substatus(): JsonField<UpdateFinancialAccountSubstatus> = substatus

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
             * Returns a mutable builder for constructing an instance of
             * [UpdateFinancialAccountStatusRequest].
             *
             * The following fields are required:
             * ```java
             * .status()
             * .substatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdateFinancialAccountStatusRequest]. */
        class Builder internal constructor() {

            private var status: JsonField<FinancialAccountStatus>? = null
            private var substatus: JsonField<UpdateFinancialAccountSubstatus>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                updateFinancialAccountStatusRequest: UpdateFinancialAccountStatusRequest
            ) = apply {
                status = updateFinancialAccountStatusRequest.status
                substatus = updateFinancialAccountStatusRequest.substatus
                additionalProperties =
                    updateFinancialAccountStatusRequest.additionalProperties.toMutableMap()
            }

            /** Status of the financial account */
            fun status(status: FinancialAccountStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [FinancialAccountStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<FinancialAccountStatus>) = apply { this.status = status }

            /** Substatus for the financial account */
            fun substatus(substatus: UpdateFinancialAccountSubstatus?) =
                substatus(JsonField.ofNullable(substatus))

            /** Alias for calling [Builder.substatus] with `substatus.orElse(null)`. */
            fun substatus(substatus: Optional<UpdateFinancialAccountSubstatus>) =
                substatus(substatus.getOrNull())

            /**
             * Sets [Builder.substatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.substatus] with a well-typed
             * [UpdateFinancialAccountSubstatus] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun substatus(substatus: JsonField<UpdateFinancialAccountSubstatus>) = apply {
                this.substatus = substatus
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

            /**
             * Returns an immutable instance of [UpdateFinancialAccountStatusRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .status()
             * .substatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UpdateFinancialAccountStatusRequest =
                UpdateFinancialAccountStatusRequest(
                    checkRequired("status", status),
                    checkRequired("substatus", substatus),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UpdateFinancialAccountStatusRequest = apply {
            if (validated) {
                return@apply
            }

            status().validate()
            substatus().ifPresent { it.validate() }
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
            (status.asKnown().getOrNull()?.validity() ?: 0) +
                (substatus.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdateFinancialAccountStatusRequest &&
                status == other.status &&
                substatus == other.substatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(status, substatus, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdateFinancialAccountStatusRequest{status=$status, substatus=$substatus, additionalProperties=$additionalProperties}"
    }

    /** Status of the financial account */
    class FinancialAccountStatus
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

            @JvmField val OPEN = of("OPEN")

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val SUSPENDED = of("SUSPENDED")

            @JvmField val PENDING = of("PENDING")

            @JvmStatic fun of(value: String) = FinancialAccountStatus(JsonField.of(value))
        }

        /** An enum containing [FinancialAccountStatus]'s known values. */
        enum class Known {
            OPEN,
            CLOSED,
            SUSPENDED,
            PENDING,
        }

        /**
         * An enum containing [FinancialAccountStatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FinancialAccountStatus] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            CLOSED,
            SUSPENDED,
            PENDING,
            /**
             * An enum member indicating that [FinancialAccountStatus] was instantiated with an
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
                OPEN -> Value.OPEN
                CLOSED -> Value.CLOSED
                SUSPENDED -> Value.SUSPENDED
                PENDING -> Value.PENDING
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
                OPEN -> Known.OPEN
                CLOSED -> Known.CLOSED
                SUSPENDED -> Known.SUSPENDED
                PENDING -> Known.PENDING
                else -> throw LithicInvalidDataException("Unknown FinancialAccountStatus: $value")
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

        fun validate(): FinancialAccountStatus = apply {
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

            return other is FinancialAccountStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Substatus for the financial account */
    class UpdateFinancialAccountSubstatus
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

            @JvmField val CHARGED_OFF_FRAUD = of("CHARGED_OFF_FRAUD")

            @JvmField val END_USER_REQUEST = of("END_USER_REQUEST")

            @JvmField val BANK_REQUEST = of("BANK_REQUEST")

            @JvmField val CHARGED_OFF_DELINQUENT = of("CHARGED_OFF_DELINQUENT")

            @JvmStatic fun of(value: String) = UpdateFinancialAccountSubstatus(JsonField.of(value))
        }

        /** An enum containing [UpdateFinancialAccountSubstatus]'s known values. */
        enum class Known {
            CHARGED_OFF_FRAUD,
            END_USER_REQUEST,
            BANK_REQUEST,
            CHARGED_OFF_DELINQUENT,
        }

        /**
         * An enum containing [UpdateFinancialAccountSubstatus]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [UpdateFinancialAccountSubstatus] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHARGED_OFF_FRAUD,
            END_USER_REQUEST,
            BANK_REQUEST,
            CHARGED_OFF_DELINQUENT,
            /**
             * An enum member indicating that [UpdateFinancialAccountSubstatus] was instantiated
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
                CHARGED_OFF_FRAUD -> Value.CHARGED_OFF_FRAUD
                END_USER_REQUEST -> Value.END_USER_REQUEST
                BANK_REQUEST -> Value.BANK_REQUEST
                CHARGED_OFF_DELINQUENT -> Value.CHARGED_OFF_DELINQUENT
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
                CHARGED_OFF_FRAUD -> Known.CHARGED_OFF_FRAUD
                END_USER_REQUEST -> Known.END_USER_REQUEST
                BANK_REQUEST -> Known.BANK_REQUEST
                CHARGED_OFF_DELINQUENT -> Known.CHARGED_OFF_DELINQUENT
                else ->
                    throw LithicInvalidDataException(
                        "Unknown UpdateFinancialAccountSubstatus: $value"
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

        fun validate(): UpdateFinancialAccountSubstatus = apply {
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

            return other is UpdateFinancialAccountSubstatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountUpdateStatusParams &&
            financialAccountToken == other.financialAccountToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(financialAccountToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FinancialAccountUpdateStatusParams{financialAccountToken=$financialAccountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
