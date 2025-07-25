// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all events. */
class EventListParams
private constructor(
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val eventTypes: List<EventType>?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val withContent: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Date string in RFC 3339 format. Only entries created after the specified time will be
     * included. UTC time zone.
     */
    fun begin(): Optional<OffsetDateTime> = Optional.ofNullable(begin)

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

    /** Event types to filter events by. */
    fun eventTypes(): Optional<List<EventType>> = Optional.ofNullable(eventTypes)

    /** Page size (for pagination). */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    /** Whether to include the event payload content in the response. */
    fun withContent(): Optional<Boolean> = Optional.ofNullable(withContent)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListParams]. */
    class Builder internal constructor() {

        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var eventTypes: MutableList<EventType>? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var withContent: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            begin = eventListParams.begin
            end = eventListParams.end
            endingBefore = eventListParams.endingBefore
            eventTypes = eventListParams.eventTypes?.toMutableList()
            pageSize = eventListParams.pageSize
            startingAfter = eventListParams.startingAfter
            withContent = eventListParams.withContent
            additionalHeaders = eventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /** Alias for calling [Builder.begin] with `begin.orElse(null)`. */
        fun begin(begin: Optional<OffsetDateTime>) = begin(begin.getOrNull())

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

        /** Event types to filter events by. */
        fun eventTypes(eventTypes: List<EventType>?) = apply {
            this.eventTypes = eventTypes?.toMutableList()
        }

        /** Alias for calling [Builder.eventTypes] with `eventTypes.orElse(null)`. */
        fun eventTypes(eventTypes: Optional<List<EventType>>) = eventTypes(eventTypes.getOrNull())

        /**
         * Adds a single [EventType] to [eventTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventType(eventType: EventType) = apply {
            eventTypes = (eventTypes ?: mutableListOf()).apply { add(eventType) }
        }

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

        /** Whether to include the event payload content in the response. */
        fun withContent(withContent: Boolean?) = apply { this.withContent = withContent }

        /**
         * Alias for [Builder.withContent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun withContent(withContent: Boolean) = withContent(withContent as Boolean?)

        /** Alias for calling [Builder.withContent] with `withContent.orElse(null)`. */
        fun withContent(withContent: Optional<Boolean>) = withContent(withContent.getOrNull())

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
         * Returns an immutable instance of [EventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventListParams =
            EventListParams(
                begin,
                end,
                endingBefore,
                eventTypes?.toImmutable(),
                pageSize,
                startingAfter,
                withContent,
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
                eventTypes?.let { put("event_types", it.joinToString(",") { it.toString() }) }
                pageSize?.let { put("page_size", it.toString()) }
                startingAfter?.let { put("starting_after", it) }
                withContent?.let { put("with_content", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCOUNT_HOLDER_CREATED = of("account_holder.created")

            @JvmField val ACCOUNT_HOLDER_UPDATED = of("account_holder.updated")

            @JvmField val ACCOUNT_HOLDER_VERIFICATION = of("account_holder.verification")

            @JvmField
            val AUTH_RULES_PERFORMANCE_REPORT_CREATED = of("auth_rules.performance_report.created")

            @JvmField val BALANCE_UPDATED = of("balance.updated")

            @JvmField
            val BOOK_TRANSFER_TRANSACTION_CREATED = of("book_transfer_transaction.created")

            @JvmField val CARD_CREATED = of("card.created")

            @JvmField val CARD_RENEWED = of("card.renewed")

            @JvmField val CARD_REISSUED = of("card.reissued")

            @JvmField val CARD_CONVERTED = of("card.converted")

            @JvmField val CARD_SHIPPED = of("card.shipped")

            @JvmField val CARD_TRANSACTION_UPDATED = of("card_transaction.updated")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                of("digital_wallet.tokenization_approval_request")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_RESULT = of("digital_wallet.tokenization_result")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                of("digital_wallet.tokenization_two_factor_authentication_code")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                of("digital_wallet.tokenization_two_factor_authentication_code_sent")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_UPDATED = of("digital_wallet.tokenization_updated")

            @JvmField val DISPUTE_UPDATED = of("dispute.updated")

            @JvmField val DISPUTE_EVIDENCE_UPLOAD_FAILED = of("dispute_evidence.upload_failed")

            @JvmField val EXTERNAL_BANK_ACCOUNT_CREATED = of("external_bank_account.created")

            @JvmField val EXTERNAL_BANK_ACCOUNT_UPDATED = of("external_bank_account.updated")

            @JvmField val EXTERNAL_PAYMENT_CREATED = of("external_payment.created")

            @JvmField val EXTERNAL_PAYMENT_UPDATED = of("external_payment.updated")

            @JvmField val FINANCIAL_ACCOUNT_CREATED = of("financial_account.created")

            @JvmField val FINANCIAL_ACCOUNT_UPDATED = of("financial_account.updated")

            @JvmField val FUNDING_EVENT_CREATED = of("funding_event.created")

            @JvmField val LOAN_TAPE_CREATED = of("loan_tape.created")

            @JvmField val LOAN_TAPE_UPDATED = of("loan_tape.updated")

            @JvmField val MANAGEMENT_OPERATION_CREATED = of("management_operation.created")

            @JvmField val MANAGEMENT_OPERATION_UPDATED = of("management_operation.updated")

            @JvmField val NETWORK_TOTAL_CREATED = of("network_total.created")

            @JvmField val NETWORK_TOTAL_UPDATED = of("network_total.updated")

            @JvmField val PAYMENT_TRANSACTION_CREATED = of("payment_transaction.created")

            @JvmField val PAYMENT_TRANSACTION_UPDATED = of("payment_transaction.updated")

            @JvmField val INTERNAL_TRANSACTION_CREATED = of("internal_transaction.created")

            @JvmField val INTERNAL_TRANSACTION_UPDATED = of("internal_transaction.updated")

            @JvmField val SETTLEMENT_REPORT_UPDATED = of("settlement_report.updated")

            @JvmField val STATEMENTS_CREATED = of("statements.created")

            @JvmField val THREE_DS_AUTHENTICATION_CREATED = of("three_ds_authentication.created")

            @JvmField val THREE_DS_AUTHENTICATION_UPDATED = of("three_ds_authentication.updated")

            @JvmField val TOKENIZATION_APPROVAL_REQUEST = of("tokenization.approval_request")

            @JvmField val TOKENIZATION_RESULT = of("tokenization.result")

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                of("tokenization.two_factor_authentication_code")

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                of("tokenization.two_factor_authentication_code_sent")

            @JvmField val TOKENIZATION_UPDATED = of("tokenization.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_PERFORMANCE_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_REISSUED,
            CARD_CONVERTED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            FUNDING_EVENT_CREATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            NETWORK_TOTAL_CREATED,
            NETWORK_TOTAL_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            INTERNAL_TRANSACTION_CREATED,
            INTERNAL_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            THREE_DS_AUTHENTICATION_UPDATED,
            TOKENIZATION_APPROVAL_REQUEST,
            TOKENIZATION_RESULT,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            TOKENIZATION_UPDATED,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_PERFORMANCE_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_REISSUED,
            CARD_CONVERTED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            FUNDING_EVENT_CREATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            NETWORK_TOTAL_CREATED,
            NETWORK_TOTAL_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            INTERNAL_TRANSACTION_CREATED,
            INTERNAL_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            THREE_DS_AUTHENTICATION_UPDATED,
            TOKENIZATION_APPROVAL_REQUEST,
            TOKENIZATION_RESULT,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            TOKENIZATION_UPDATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Value.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_PERFORMANCE_REPORT_CREATED -> Value.AUTH_RULES_PERFORMANCE_REPORT_CREATED
                BALANCE_UPDATED -> Value.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Value.BOOK_TRANSFER_TRANSACTION_CREATED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_RENEWED -> Value.CARD_RENEWED
                CARD_REISSUED -> Value.CARD_REISSUED
                CARD_CONVERTED -> Value.CARD_CONVERTED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Value.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Value.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Value.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Value.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Value.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Value.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Value.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Value.FINANCIAL_ACCOUNT_UPDATED
                FUNDING_EVENT_CREATED -> Value.FUNDING_EVENT_CREATED
                LOAN_TAPE_CREATED -> Value.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Value.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Value.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Value.MANAGEMENT_OPERATION_UPDATED
                NETWORK_TOTAL_CREATED -> Value.NETWORK_TOTAL_CREATED
                NETWORK_TOTAL_UPDATED -> Value.NETWORK_TOTAL_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                INTERNAL_TRANSACTION_CREATED -> Value.INTERNAL_TRANSACTION_CREATED
                INTERNAL_TRANSACTION_UPDATED -> Value.INTERNAL_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Value.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Value.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Value.THREE_DS_AUTHENTICATION_CREATED
                THREE_DS_AUTHENTICATION_UPDATED -> Value.THREE_DS_AUTHENTICATION_UPDATED
                TOKENIZATION_APPROVAL_REQUEST -> Value.TOKENIZATION_APPROVAL_REQUEST
                TOKENIZATION_RESULT -> Value.TOKENIZATION_RESULT
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                TOKENIZATION_UPDATED -> Value.TOKENIZATION_UPDATED
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
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Known.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_PERFORMANCE_REPORT_CREATED -> Known.AUTH_RULES_PERFORMANCE_REPORT_CREATED
                BALANCE_UPDATED -> Known.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Known.BOOK_TRANSFER_TRANSACTION_CREATED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_RENEWED -> Known.CARD_RENEWED
                CARD_REISSUED -> Known.CARD_REISSUED
                CARD_CONVERTED -> Known.CARD_CONVERTED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Known.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Known.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Known.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Known.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Known.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Known.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Known.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Known.FINANCIAL_ACCOUNT_UPDATED
                FUNDING_EVENT_CREATED -> Known.FUNDING_EVENT_CREATED
                LOAN_TAPE_CREATED -> Known.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Known.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Known.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Known.MANAGEMENT_OPERATION_UPDATED
                NETWORK_TOTAL_CREATED -> Known.NETWORK_TOTAL_CREATED
                NETWORK_TOTAL_UPDATED -> Known.NETWORK_TOTAL_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                INTERNAL_TRANSACTION_CREATED -> Known.INTERNAL_TRANSACTION_CREATED
                INTERNAL_TRANSACTION_UPDATED -> Known.INTERNAL_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Known.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Known.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Known.THREE_DS_AUTHENTICATION_CREATED
                THREE_DS_AUTHENTICATION_UPDATED -> Known.THREE_DS_AUTHENTICATION_UPDATED
                TOKENIZATION_APPROVAL_REQUEST -> Known.TOKENIZATION_APPROVAL_REQUEST
                TOKENIZATION_RESULT -> Known.TOKENIZATION_RESULT
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                TOKENIZATION_UPDATED -> Known.TOKENIZATION_UPDATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListParams && begin == other.begin && end == other.end && endingBefore == other.endingBefore && eventTypes == other.eventTypes && pageSize == other.pageSize && startingAfter == other.startingAfter && withContent == other.withContent && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(begin, end, endingBefore, eventTypes, pageSize, startingAfter, withContent, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventListParams{begin=$begin, end=$end, endingBefore=$endingBefore, eventTypes=$eventTypes, pageSize=$pageSize, startingAfter=$startingAfter, withContent=$withContent, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
