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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Settle external payment */
class ExternalPaymentSettleParams
private constructor(
    private val externalPaymentToken: String?,
    private val body: ExternalPaymentActionWithProgressToRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalPaymentToken(): Optional<String> = Optional.ofNullable(externalPaymentToken)

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = body.effectiveDate()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progressTo(): Optional<ExternalPaymentProgressTo> = body.progressTo()

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memo(): JsonField<String> = body._memo()

    /**
     * Returns the raw JSON value of [progressTo].
     *
     * Unlike [progressTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _progressTo(): JsonField<ExternalPaymentProgressTo> = body._progressTo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalPaymentSettleParams].
         *
         * The following fields are required:
         * ```java
         * .effectiveDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalPaymentSettleParams]. */
    class Builder internal constructor() {

        private var externalPaymentToken: String? = null
        private var body: ExternalPaymentActionWithProgressToRequest.Builder =
            ExternalPaymentActionWithProgressToRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalPaymentSettleParams: ExternalPaymentSettleParams) = apply {
            externalPaymentToken = externalPaymentSettleParams.externalPaymentToken
            body = externalPaymentSettleParams.body.toBuilder()
            additionalHeaders = externalPaymentSettleParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalPaymentSettleParams.additionalQueryParams.toBuilder()
        }

        fun externalPaymentToken(externalPaymentToken: String?) = apply {
            this.externalPaymentToken = externalPaymentToken
        }

        /**
         * Alias for calling [Builder.externalPaymentToken] with
         * `externalPaymentToken.orElse(null)`.
         */
        fun externalPaymentToken(externalPaymentToken: Optional<String>) =
            externalPaymentToken(externalPaymentToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [effectiveDate]
         * - [memo]
         * - [progressTo]
         */
        fun body(body: ExternalPaymentActionWithProgressToRequest) = apply {
            this.body = body.toBuilder()
        }

        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        fun memo(memo: String) = apply { body.memo(memo) }

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        fun progressTo(progressTo: ExternalPaymentProgressTo) = apply {
            body.progressTo(progressTo)
        }

        /**
         * Sets [Builder.progressTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressTo] with a well-typed
         * [ExternalPaymentProgressTo] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun progressTo(progressTo: JsonField<ExternalPaymentProgressTo>) = apply {
            body.progressTo(progressTo)
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
         * Returns an immutable instance of [ExternalPaymentSettleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .effectiveDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalPaymentSettleParams =
            ExternalPaymentSettleParams(
                externalPaymentToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ExternalPaymentActionWithProgressToRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalPaymentToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class ExternalPaymentActionWithProgressToRequest
    private constructor(
        private val effectiveDate: JsonField<LocalDate>,
        private val memo: JsonField<String>,
        private val progressTo: JsonField<ExternalPaymentProgressTo>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("progress_to")
            @ExcludeMissing
            progressTo: JsonField<ExternalPaymentProgressTo> = JsonMissing.of(),
        ) : this(effectiveDate, memo, progressTo, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = memo.getOptional("memo")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun progressTo(): Optional<ExternalPaymentProgressTo> =
            progressTo.getOptional("progress_to")

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [progressTo].
         *
         * Unlike [progressTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("progress_to")
        @ExcludeMissing
        fun _progressTo(): JsonField<ExternalPaymentProgressTo> = progressTo

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
             * [ExternalPaymentActionWithProgressToRequest].
             *
             * The following fields are required:
             * ```java
             * .effectiveDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalPaymentActionWithProgressToRequest]. */
        class Builder internal constructor() {

            private var effectiveDate: JsonField<LocalDate>? = null
            private var memo: JsonField<String> = JsonMissing.of()
            private var progressTo: JsonField<ExternalPaymentProgressTo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                externalPaymentActionWithProgressToRequest:
                    ExternalPaymentActionWithProgressToRequest
            ) = apply {
                effectiveDate = externalPaymentActionWithProgressToRequest.effectiveDate
                memo = externalPaymentActionWithProgressToRequest.memo
                progressTo = externalPaymentActionWithProgressToRequest.progressTo
                additionalProperties =
                    externalPaymentActionWithProgressToRequest.additionalProperties.toMutableMap()
            }

            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun progressTo(progressTo: ExternalPaymentProgressTo) =
                progressTo(JsonField.of(progressTo))

            /**
             * Sets [Builder.progressTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.progressTo] with a well-typed
             * [ExternalPaymentProgressTo] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun progressTo(progressTo: JsonField<ExternalPaymentProgressTo>) = apply {
                this.progressTo = progressTo
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
             * Returns an immutable instance of [ExternalPaymentActionWithProgressToRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .effectiveDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExternalPaymentActionWithProgressToRequest =
                ExternalPaymentActionWithProgressToRequest(
                    checkRequired("effectiveDate", effectiveDate),
                    memo,
                    progressTo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExternalPaymentActionWithProgressToRequest = apply {
            if (validated) {
                return@apply
            }

            effectiveDate()
            memo()
            progressTo().ifPresent { it.validate() }
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
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (progressTo.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentActionWithProgressToRequest && effectiveDate == other.effectiveDate && memo == other.memo && progressTo == other.progressTo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveDate, memo, progressTo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalPaymentActionWithProgressToRequest{effectiveDate=$effectiveDate, memo=$memo, progressTo=$progressTo, additionalProperties=$additionalProperties}"
    }

    class ExternalPaymentProgressTo
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

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val RELEASED = of("RELEASED")

            @JvmStatic fun of(value: String) = ExternalPaymentProgressTo(JsonField.of(value))
        }

        /** An enum containing [ExternalPaymentProgressTo]'s known values. */
        enum class Known {
            SETTLED,
            RELEASED,
        }

        /**
         * An enum containing [ExternalPaymentProgressTo]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalPaymentProgressTo] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SETTLED,
            RELEASED,
            /**
             * An enum member indicating that [ExternalPaymentProgressTo] was instantiated with an
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
                SETTLED -> Value.SETTLED
                RELEASED -> Value.RELEASED
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
                SETTLED -> Known.SETTLED
                RELEASED -> Known.RELEASED
                else ->
                    throw LithicInvalidDataException("Unknown ExternalPaymentProgressTo: $value")
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

        fun validate(): ExternalPaymentProgressTo = apply {
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

            return /* spotless:off */ other is ExternalPaymentProgressTo && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentSettleParams && externalPaymentToken == other.externalPaymentToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalPaymentToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalPaymentSettleParams{externalPaymentToken=$externalPaymentToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
