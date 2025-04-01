// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List network total records with optional filters. Not available in sandbox. */
class ReportSettlementNetworkTotalListParams
private constructor(
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val institutionId: String?,
    private val network: Network?,
    private val pageSize: Long?,
    private val reportDate: LocalDate?,
    private val reportDateBegin: LocalDate?,
    private val reportDateEnd: LocalDate?,
    private val settlementInstitutionId: String?,
    private val startingAfter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Datetime in RFC 3339 format. Only entries created after the specified time will be included.
     * UTC time zone.
     */
    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    /**
     * Datetime in RFC 3339 format. Only entries created before the specified time will be included.
     * UTC time zone.
     */
    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    /**
     * A cursor representing an item's token before which a page of results should end. Used to
     * retrieve the previous page of results before this item.
     */
    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /** Institution ID to filter on. */
    fun institutionId(): Optional<String> = Optional.ofNullable(institutionId)

    /** Network to filter on. */
    fun network(): Optional<Network> = Optional.ofNullable(network)

    /** Number of records per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Singular report date to filter on (YYYY-MM-DD). Cannot be populated in conjunction with
     * report_date_begin or report_date_end.
     */
    fun reportDate(): Optional<LocalDate> = Optional.ofNullable(reportDate)

    /** Earliest report date to filter on, inclusive (YYYY-MM-DD). */
    fun reportDateBegin(): Optional<LocalDate> = Optional.ofNullable(reportDateBegin)

    /** Latest report date to filter on, inclusive (YYYY-MM-DD). */
    fun reportDateEnd(): Optional<LocalDate> = Optional.ofNullable(reportDateEnd)

    /** Settlement institution ID to filter on. */
    fun settlementInstitutionId(): Optional<String> = Optional.ofNullable(settlementInstitutionId)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReportSettlementNetworkTotalListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportSettlementNetworkTotalListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportSettlementNetworkTotalListParams]. */
    class Builder internal constructor() {

        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var institutionId: String? = null
        private var network: Network? = null
        private var pageSize: Long? = null
        private var reportDate: LocalDate? = null
        private var reportDateBegin: LocalDate? = null
        private var reportDateEnd: LocalDate? = null
        private var settlementInstitutionId: String? = null
        private var startingAfter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            reportSettlementNetworkTotalListParams: ReportSettlementNetworkTotalListParams
        ) = apply {
            begin = reportSettlementNetworkTotalListParams.begin
            end = reportSettlementNetworkTotalListParams.end
            endingBefore = reportSettlementNetworkTotalListParams.endingBefore
            institutionId = reportSettlementNetworkTotalListParams.institutionId
            network = reportSettlementNetworkTotalListParams.network
            pageSize = reportSettlementNetworkTotalListParams.pageSize
            reportDate = reportSettlementNetworkTotalListParams.reportDate
            reportDateBegin = reportSettlementNetworkTotalListParams.reportDateBegin
            reportDateEnd = reportSettlementNetworkTotalListParams.reportDateEnd
            settlementInstitutionId = reportSettlementNetworkTotalListParams.settlementInstitutionId
            startingAfter = reportSettlementNetworkTotalListParams.startingAfter
            additionalHeaders = reportSettlementNetworkTotalListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                reportSettlementNetworkTotalListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Datetime in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /** Alias for calling [Builder.begin] with `begin.orElse(null)`. */
        fun begin(begin: Optional<OffsetDateTime>) = begin(begin.getOrNull())

        /**
         * Datetime in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /** Alias for calling [Builder.end] with `end.orElse(null)`. */
        fun end(end: Optional<OffsetDateTime>) = end(end.getOrNull())

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        /** Institution ID to filter on. */
        fun institutionId(institutionId: String?) = apply { this.institutionId = institutionId }

        /** Alias for calling [Builder.institutionId] with `institutionId.orElse(null)`. */
        fun institutionId(institutionId: Optional<String>) =
            institutionId(institutionId.getOrNull())

        /** Network to filter on. */
        fun network(network: Network?) = apply { this.network = network }

        /** Alias for calling [Builder.network] with `network.orElse(null)`. */
        fun network(network: Optional<Network>) = network(network.getOrNull())

        /** Number of records per page. */
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
         * Singular report date to filter on (YYYY-MM-DD). Cannot be populated in conjunction with
         * report_date_begin or report_date_end.
         */
        fun reportDate(reportDate: LocalDate?) = apply { this.reportDate = reportDate }

        /** Alias for calling [Builder.reportDate] with `reportDate.orElse(null)`. */
        fun reportDate(reportDate: Optional<LocalDate>) = reportDate(reportDate.getOrNull())

        /** Earliest report date to filter on, inclusive (YYYY-MM-DD). */
        fun reportDateBegin(reportDateBegin: LocalDate?) = apply {
            this.reportDateBegin = reportDateBegin
        }

        /** Alias for calling [Builder.reportDateBegin] with `reportDateBegin.orElse(null)`. */
        fun reportDateBegin(reportDateBegin: Optional<LocalDate>) =
            reportDateBegin(reportDateBegin.getOrNull())

        /** Latest report date to filter on, inclusive (YYYY-MM-DD). */
        fun reportDateEnd(reportDateEnd: LocalDate?) = apply { this.reportDateEnd = reportDateEnd }

        /** Alias for calling [Builder.reportDateEnd] with `reportDateEnd.orElse(null)`. */
        fun reportDateEnd(reportDateEnd: Optional<LocalDate>) =
            reportDateEnd(reportDateEnd.getOrNull())

        /** Settlement institution ID to filter on. */
        fun settlementInstitutionId(settlementInstitutionId: String?) = apply {
            this.settlementInstitutionId = settlementInstitutionId
        }

        /**
         * Alias for calling [Builder.settlementInstitutionId] with
         * `settlementInstitutionId.orElse(null)`.
         */
        fun settlementInstitutionId(settlementInstitutionId: Optional<String>) =
            settlementInstitutionId(settlementInstitutionId.getOrNull())

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

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
         * Returns an immutable instance of [ReportSettlementNetworkTotalListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams(
                begin,
                end,
                endingBefore,
                institutionId,
                network,
                pageSize,
                reportDate,
                reportDateBegin,
                reportDateEnd,
                settlementInstitutionId,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                begin?.let { put("begin", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                end?.let { put("end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                endingBefore?.let { put("ending_before", it) }
                institutionId?.let { put("institution_id", it) }
                network?.let { put("network", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                reportDate?.let { put("report_date", it.toString()) }
                reportDateBegin?.let { put("report_date_begin", it.toString()) }
                reportDateEnd?.let { put("report_date_end", it.toString()) }
                settlementInstitutionId?.let { put("settlement_institution_id", it) }
                startingAfter?.let { put("starting_after", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Network to filter on. */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VISA = of("VISA")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            VISA,
            MASTERCARD,
            MAESTRO,
            INTERLINK,
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VISA,
            MASTERCARD,
            MAESTRO,
            INTERLINK,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                VISA -> Value.VISA
                MASTERCARD -> Value.MASTERCARD
                MAESTRO -> Value.MAESTRO
                INTERLINK -> Value.INTERLINK
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
                VISA -> Known.VISA
                MASTERCARD -> Known.MASTERCARD
                MAESTRO -> Known.MAESTRO
                INTERLINK -> Known.INTERLINK
                else -> throw LithicInvalidDataException("Unknown Network: $value")
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

        fun validate(): Network = apply {
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

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementNetworkTotalListParams && begin == other.begin && end == other.end && endingBefore == other.endingBefore && institutionId == other.institutionId && network == other.network && pageSize == other.pageSize && reportDate == other.reportDate && reportDateBegin == other.reportDateBegin && reportDateEnd == other.reportDateEnd && settlementInstitutionId == other.settlementInstitutionId && startingAfter == other.startingAfter && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(begin, end, endingBefore, institutionId, network, pageSize, reportDate, reportDateBegin, reportDateEnd, settlementInstitutionId, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ReportSettlementNetworkTotalListParams{begin=$begin, end=$end, endingBefore=$endingBefore, institutionId=$institutionId, network=$network, pageSize=$pageSize, reportDate=$reportDate, reportDateBegin=$reportDateBegin, reportDateEnd=$reportDateEnd, settlementInstitutionId=$settlementInstitutionId, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
