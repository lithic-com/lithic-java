// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of individual or business account holders and their KYC or KYB evaluation status. */
class AccountHolderListParams
private constructor(
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Date string in RFC 3339 format. Only entries created after the specified time will be
     * included. UTC time zone.
     */
    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

    /** Email address of the account holder. The query must be an exact match, case insensitive. */
    fun email(): Optional<String> = Optional.ofNullable(email)

    /**
     * Date string in RFC 3339 format. Only entries created before the specified time will be
     * included. UTC time zone.
     */
    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    /**
     * A cursor representing an item's token before which a page of results should end. Used to
     * retrieve the previous page of results before this item.
     */
    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /** If applicable, represents the external_id associated with the account_holder. */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId)

    /**
     * (Individual Account Holders only) The first name of the account holder. The query is case
     * insensitive and supports partial matches.
     */
    fun firstName(): Optional<String> = Optional.ofNullable(firstName)

    /**
     * (Individual Account Holders only) The last name of the account holder. The query is case
     * insensitive and supports partial matches.
     */
    fun lastName(): Optional<String> = Optional.ofNullable(lastName)

    /**
     * (Business Account Holders only) The legal business name of the account holder. The query is
     * case insensitive and supports partial matches.
     */
    fun legalBusinessName(): Optional<String> = Optional.ofNullable(legalBusinessName)

    /** The number of account_holders to limit the response to. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Phone number of the account holder. The query must be an exact match. */
    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountHolderListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AccountHolderListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderListParams]. */
    class Builder internal constructor() {

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountHolderListParams: AccountHolderListParams) = apply {
            begin = accountHolderListParams.begin
            email = accountHolderListParams.email
            end = accountHolderListParams.end
            endingBefore = accountHolderListParams.endingBefore
            externalId = accountHolderListParams.externalId
            firstName = accountHolderListParams.firstName
            lastName = accountHolderListParams.lastName
            legalBusinessName = accountHolderListParams.legalBusinessName
            limit = accountHolderListParams.limit
            phoneNumber = accountHolderListParams.phoneNumber
            startingAfter = accountHolderListParams.startingAfter
            additionalHeaders = accountHolderListParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountHolderListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /** Alias for calling [Builder.begin] with `begin.orElse(null)`. */
        fun begin(begin: Optional<OffsetDateTime>) = begin(begin.getOrNull())

        /**
         * Email address of the account holder. The query must be an exact match, case insensitive.
         */
        fun email(email: String?) = apply { this.email = email }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
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

        /** If applicable, represents the external_id associated with the account_holder. */
        fun externalId(externalId: String?) = apply { this.externalId = externalId }

        /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

        /**
         * (Individual Account Holders only) The first name of the account holder. The query is case
         * insensitive and supports partial matches.
         */
        fun firstName(firstName: String?) = apply { this.firstName = firstName }

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * (Individual Account Holders only) The last name of the account holder. The query is case
         * insensitive and supports partial matches.
         */
        fun lastName(lastName: String?) = apply { this.lastName = lastName }

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * (Business Account Holders only) The legal business name of the account holder. The query
         * is case insensitive and supports partial matches.
         */
        fun legalBusinessName(legalBusinessName: String?) = apply {
            this.legalBusinessName = legalBusinessName
        }

        /** Alias for calling [Builder.legalBusinessName] with `legalBusinessName.orElse(null)`. */
        fun legalBusinessName(legalBusinessName: Optional<String>) =
            legalBusinessName(legalBusinessName.getOrNull())

        /** The number of account_holders to limit the response to. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Phone number of the account holder. The query must be an exact match. */
        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

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
         * Returns an immutable instance of [AccountHolderListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                begin?.let { put("begin", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                email?.let { put("email", it) }
                end?.let { put("end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                endingBefore?.let { put("ending_before", it) }
                externalId?.let { put("external_id", it) }
                firstName?.let { put("first_name", it) }
                lastName?.let { put("last_name", it) }
                legalBusinessName?.let { put("legal_business_name", it) }
                limit?.let { put("limit", it.toString()) }
                phoneNumber?.let { put("phone_number", it) }
                startingAfter?.let { put("starting_after", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderListParams && begin == other.begin && email == other.email && end == other.end && endingBefore == other.endingBefore && externalId == other.externalId && firstName == other.firstName && lastName == other.lastName && legalBusinessName == other.legalBusinessName && limit == other.limit && phoneNumber == other.phoneNumber && startingAfter == other.startingAfter && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(begin, email, end, endingBefore, externalId, firstName, lastName, legalBusinessName, limit, phoneNumber, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountHolderListParams{begin=$begin, email=$email, end=$end, endingBefore=$endingBefore, externalId=$externalId, firstName=$firstName, lastName=$lastName, legalBusinessName=$legalBusinessName, limit=$limit, phoneNumber=$phoneNumber, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
