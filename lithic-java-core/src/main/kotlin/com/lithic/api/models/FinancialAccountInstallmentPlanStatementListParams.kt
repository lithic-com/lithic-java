// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List the statement snapshots for a given installment plan. */
class FinancialAccountInstallmentPlanStatementListParams
private constructor(
    private val financialAccountToken: String,
    private val installmentPlanToken: String?,
    private val begin: LocalDate?,
    private val end: LocalDate?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val state: InstallmentPlanState?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Globally unique identifier for financial account. */
    fun financialAccountToken(): String = financialAccountToken

    /** Globally unique identifier for installment plan. */
    fun installmentPlanToken(): Optional<String> = Optional.ofNullable(installmentPlanToken)

    /**
     * Date string in RFC 3339 format. Only entries created after the specified date will be
     * included.
     */
    fun begin(): Optional<LocalDate> = Optional.ofNullable(begin)

    /**
     * Date string in RFC 3339 format. Only entries created before the specified date will be
     * included.
     */
    fun end(): Optional<LocalDate> = Optional.ofNullable(end)

    /**
     * A cursor representing an item's token before which a page of results should end. Used to
     * retrieve the previous page of results before this item.
     */
    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /** Page size (for pagination). */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    /** Only snapshots in which the plan was in this state will be included. */
    fun state(): Optional<InstallmentPlanState> = Optional.ofNullable(state)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInstallmentPlanStatementListParams].
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountInstallmentPlanStatementListParams]. */
    class Builder internal constructor() {

        private var financialAccountToken: String? = null
        private var installmentPlanToken: String? = null
        private var begin: LocalDate? = null
        private var end: LocalDate? = null
        private var endingBefore: String? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var state: InstallmentPlanState? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            financialAccountInstallmentPlanStatementListParams:
                FinancialAccountInstallmentPlanStatementListParams
        ) = apply {
            financialAccountToken =
                financialAccountInstallmentPlanStatementListParams.financialAccountToken
            installmentPlanToken =
                financialAccountInstallmentPlanStatementListParams.installmentPlanToken
            begin = financialAccountInstallmentPlanStatementListParams.begin
            end = financialAccountInstallmentPlanStatementListParams.end
            endingBefore = financialAccountInstallmentPlanStatementListParams.endingBefore
            pageSize = financialAccountInstallmentPlanStatementListParams.pageSize
            startingAfter = financialAccountInstallmentPlanStatementListParams.startingAfter
            state = financialAccountInstallmentPlanStatementListParams.state
            additionalHeaders =
                financialAccountInstallmentPlanStatementListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                financialAccountInstallmentPlanStatementListParams.additionalQueryParams.toBuilder()
        }

        /** Globally unique identifier for financial account. */
        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Globally unique identifier for installment plan. */
        fun installmentPlanToken(installmentPlanToken: String?) = apply {
            this.installmentPlanToken = installmentPlanToken
        }

        /**
         * Alias for calling [Builder.installmentPlanToken] with
         * `installmentPlanToken.orElse(null)`.
         */
        fun installmentPlanToken(installmentPlanToken: Optional<String>) =
            installmentPlanToken(installmentPlanToken.getOrNull())

        /**
         * Date string in RFC 3339 format. Only entries created after the specified date will be
         * included.
         */
        fun begin(begin: LocalDate?) = apply { this.begin = begin }

        /** Alias for calling [Builder.begin] with `begin.orElse(null)`. */
        fun begin(begin: Optional<LocalDate>) = begin(begin.getOrNull())

        /**
         * Date string in RFC 3339 format. Only entries created before the specified date will be
         * included.
         */
        fun end(end: LocalDate?) = apply { this.end = end }

        /** Alias for calling [Builder.end] with `end.orElse(null)`. */
        fun end(end: Optional<LocalDate>) = end(end.getOrNull())

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

        /** Only snapshots in which the plan was in this state will be included. */
        fun state(state: InstallmentPlanState?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<InstallmentPlanState>) = state(state.getOrNull())

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
         * Returns an immutable instance of [FinancialAccountInstallmentPlanStatementListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .financialAccountToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountInstallmentPlanStatementListParams =
            FinancialAccountInstallmentPlanStatementListParams(
                checkRequired("financialAccountToken", financialAccountToken),
                installmentPlanToken,
                begin,
                end,
                endingBefore,
                pageSize,
                startingAfter,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> financialAccountToken
            1 -> installmentPlanToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                begin?.let { put("begin", it.toString()) }
                end?.let { put("end", it.toString()) }
                endingBefore?.let { put("ending_before", it) }
                pageSize?.let { put("page_size", it.toString()) }
                startingAfter?.let { put("starting_after", it) }
                state?.let { put("state", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Only snapshots in which the plan was in this state will be included. */
    class InstallmentPlanState
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val REBUILD_IN_PROGRESS = of("REBUILD_IN_PROGRESS")

            @JvmField val FULLY_PAID = of("FULLY_PAID")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmStatic fun of(value: String) = InstallmentPlanState(JsonField.of(value))
        }

        /** An enum containing [InstallmentPlanState]'s known values. */
        enum class Known {
            PENDING,
            ACTIVE,
            REBUILD_IN_PROGRESS,
            FULLY_PAID,
            CANCELLED,
        }

        /**
         * An enum containing [InstallmentPlanState]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [InstallmentPlanState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ACTIVE,
            REBUILD_IN_PROGRESS,
            FULLY_PAID,
            CANCELLED,
            /**
             * An enum member indicating that [InstallmentPlanState] was instantiated with an
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
                PENDING -> Value.PENDING
                ACTIVE -> Value.ACTIVE
                REBUILD_IN_PROGRESS -> Value.REBUILD_IN_PROGRESS
                FULLY_PAID -> Value.FULLY_PAID
                CANCELLED -> Value.CANCELLED
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
                PENDING -> Known.PENDING
                ACTIVE -> Known.ACTIVE
                REBUILD_IN_PROGRESS -> Known.REBUILD_IN_PROGRESS
                FULLY_PAID -> Known.FULLY_PAID
                CANCELLED -> Known.CANCELLED
                else -> throw LithicInvalidDataException("Unknown InstallmentPlanState: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InstallmentPlanState = apply {
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

            return other is InstallmentPlanState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInstallmentPlanStatementListParams &&
            financialAccountToken == other.financialAccountToken &&
            installmentPlanToken == other.installmentPlanToken &&
            begin == other.begin &&
            end == other.end &&
            endingBefore == other.endingBefore &&
            pageSize == other.pageSize &&
            startingAfter == other.startingAfter &&
            state == other.state &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            financialAccountToken,
            installmentPlanToken,
            begin,
            end,
            endingBefore,
            pageSize,
            startingAfter,
            state,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FinancialAccountInstallmentPlanStatementListParams{financialAccountToken=$financialAccountToken, installmentPlanToken=$installmentPlanToken, begin=$begin, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
