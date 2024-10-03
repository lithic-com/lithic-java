// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class AccountHolderListParams
constructor(
    private val begin: OffsetDateTime?,
    private val email: String?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val externalId: String?,
    private val firstName: String?,
    private val lastName: String?,
    private val legalBusinessName: String?,
    private val limit: Long?,
    private val phoneNumber: String?,
    private val startingAfter: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun externalId(): Optional<String> = Optional.ofNullable(externalId)

    fun firstName(): Optional<String> = Optional.ofNullable(firstName)

    fun lastName(): Optional<String> = Optional.ofNullable(lastName)

    fun legalBusinessName(): Optional<String> = Optional.ofNullable(legalBusinessName)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let {
            params.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.email?.let { params.put("email", listOf(it.toString())) }
        this.end?.let {
            params.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.externalId?.let { params.put("external_id", listOf(it.toString())) }
        this.firstName?.let { params.put("first_name", listOf(it.toString())) }
        this.lastName?.let { params.put("last_name", listOf(it.toString())) }
        this.legalBusinessName?.let { params.put("legal_business_name", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.phoneNumber?.let { params.put("phone_number", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderListParams && this.begin == other.begin && this.email == other.email && this.end == other.end && this.endingBefore == other.endingBefore && this.externalId == other.externalId && this.firstName == other.firstName && this.lastName == other.lastName && this.legalBusinessName == other.legalBusinessName && this.limit == other.limit && this.phoneNumber == other.phoneNumber && this.startingAfter == other.startingAfter && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(begin, email, end, endingBefore, externalId, firstName, lastName, legalBusinessName, limit, phoneNumber, startingAfter, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "AccountHolderListParams{begin=$begin, email=$email, end=$end, endingBefore=$endingBefore, externalId=$externalId, firstName=$firstName, lastName=$lastName, legalBusinessName=$legalBusinessName, limit=$limit, phoneNumber=$phoneNumber, startingAfter=$startingAfter, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var begin: OffsetDateTime? = null
        private var email: String? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var externalId: String? = null
        private var firstName: String? = null
        private var lastName: String? = null
        private var legalBusinessName: String? = null
        private var limit: Long? = null
        private var phoneNumber: String? = null
        private var startingAfter: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderListParams: AccountHolderListParams) = apply {
            this.begin = accountHolderListParams.begin
            this.email = accountHolderListParams.email
            this.end = accountHolderListParams.end
            this.endingBefore = accountHolderListParams.endingBefore
            this.externalId = accountHolderListParams.externalId
            this.firstName = accountHolderListParams.firstName
            this.lastName = accountHolderListParams.lastName
            this.legalBusinessName = accountHolderListParams.legalBusinessName
            this.limit = accountHolderListParams.limit
            this.phoneNumber = accountHolderListParams.phoneNumber
            this.startingAfter = accountHolderListParams.startingAfter
            additionalQueryParams(accountHolderListParams.additionalQueryParams)
            additionalHeaders(accountHolderListParams.additionalHeaders)
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime) = apply { this.begin = begin }

        /**
         * Email address of the account holder. The query must be an exact match, case insensitive.
         */
        fun email(email: String) = apply { this.email = email }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime) = apply { this.end = end }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** If applicable, represents the external_id associated with the account_holder. */
        fun externalId(externalId: String) = apply { this.externalId = externalId }

        /**
         * (Individual Account Holders only) The first name of the account holder. The query is case
         * insensitive and supports partial matches.
         */
        fun firstName(firstName: String) = apply { this.firstName = firstName }

        /**
         * (Individual Account Holders only) The last name of the account holder. The query is case
         * insensitive and supports partial matches.
         */
        fun lastName(lastName: String) = apply { this.lastName = lastName }

        /**
         * (Business Account Holders only) The legal business name of the account holder. The query
         * is case insensitive and supports partial matches.
         */
        fun legalBusinessName(legalBusinessName: String) = apply {
            this.legalBusinessName = legalBusinessName
        }

        /** The number of account_holders to limit the response to. */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Phone number of the account holder. The query must be an exact match. */
        fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): AccountHolderListParams =
            AccountHolderListParams(
                begin,
                email,
                end,
                endingBefore,
                externalId,
                firstName,
                lastName,
                legalBusinessName,
                limit,
                phoneNumber,
                startingAfter,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
