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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SettlementReportUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val details: JsonField<List<SettlementSummaryDetails>>,
    private val disputesGrossAmount: JsonField<Long>,
    private val interchangeGrossAmount: JsonField<Long>,
    private val isComplete: JsonField<Boolean>,
    private val otherFeesGrossAmount: JsonField<Long>,
    private val reportDate: JsonField<String>,
    private val settledNetAmount: JsonField<Long>,
    private val transactionsGrossAmount: JsonField<Long>,
    private val updated: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("details")
        @ExcludeMissing
        details: JsonField<List<SettlementSummaryDetails>> = JsonMissing.of(),
        @JsonProperty("disputes_gross_amount")
        @ExcludeMissing
        disputesGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interchange_gross_amount")
        @ExcludeMissing
        interchangeGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("is_complete")
        @ExcludeMissing
        isComplete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("other_fees_gross_amount")
        @ExcludeMissing
        otherFeesGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("report_date")
        @ExcludeMissing
        reportDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settled_net_amount")
        @ExcludeMissing
        settledNetAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transactions_gross_amount")
        @ExcludeMissing
        transactionsGrossAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        created,
        currency,
        details,
        disputesGrossAmount,
        interchangeGrossAmount,
        isComplete,
        otherFeesGrossAmount,
        reportDate,
        settledNetAmount,
        transactionsGrossAmount,
        updated,
        eventType,
        mutableMapOf(),
    )

    fun toSettlementReport(): SettlementReport =
        SettlementReport.builder()
            .created(created)
            .currency(currency)
            .details(details)
            .disputesGrossAmount(disputesGrossAmount)
            .interchangeGrossAmount(interchangeGrossAmount)
            .isComplete(isComplete)
            .otherFeesGrossAmount(otherFeesGrossAmount)
            .reportDate(reportDate)
            .settledNetAmount(settledNetAmount)
            .transactionsGrossAmount(transactionsGrossAmount)
            .updated(updated)
            .build()

    /**
     * Date and time when the transaction first occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
     * future version of the API.)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun currency(): String = currency.getRequired("currency")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun details(): List<SettlementSummaryDetails> = details.getRequired("details")

    /**
     * The total gross amount of disputes settlements. (This field is deprecated and will be removed
     * in a future version of the API. To compute total amounts, Lithic recommends that customers
     * sum the relevant settlement amounts found within `details`.)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun disputesGrossAmount(): Long = disputesGrossAmount.getRequired("disputes_gross_amount")

    /**
     * The total amount of interchange. (This field is deprecated and will be removed in a future
     * version of the API. To compute total amounts, Lithic recommends that customers sum the
     * relevant settlement amounts found within `details`.)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun interchangeGrossAmount(): Long =
        interchangeGrossAmount.getRequired("interchange_gross_amount")

    /**
     * Indicates that all data expected on the given report date is available.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isComplete(): Boolean = isComplete.getRequired("is_complete")

    /**
     * Total amount of gross other fees outside of interchange. (This field is deprecated and will
     * be removed in a future version of the API. To compute total amounts, Lithic recommends that
     * customers sum the relevant settlement amounts found within `details`.)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun otherFeesGrossAmount(): Long = otherFeesGrossAmount.getRequired("other_fees_gross_amount")

    /**
     * Date of when the report was first generated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportDate(): String = reportDate.getRequired("report_date")

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     * (This field is deprecated and will be removed in a future version of the API. To compute
     * total amounts, Lithic recommends that customers sum the relevant settlement amounts found
     * within `details`.)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun settledNetAmount(): Long = settledNetAmount.getRequired("settled_net_amount")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes). (This field is deprecated and will be removed in a future version of the API. To
     * compute total amounts, Lithic recommends that customers sum the relevant settlement amounts
     * found within `details`.)
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun transactionsGrossAmount(): Long =
        transactionsGrossAmount.getRequired("transactions_gross_amount")

    /**
     * Date and time when the transaction first occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [details].
     *
     * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("details")
    @ExcludeMissing
    fun _details(): JsonField<List<SettlementSummaryDetails>> = details

    /**
     * Returns the raw JSON value of [disputesGrossAmount].
     *
     * Unlike [disputesGrossAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount(): JsonField<Long> = disputesGrossAmount

    /**
     * Returns the raw JSON value of [interchangeGrossAmount].
     *
     * Unlike [interchangeGrossAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount(): JsonField<Long> = interchangeGrossAmount

    /**
     * Returns the raw JSON value of [isComplete].
     *
     * Unlike [isComplete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_complete") @ExcludeMissing fun _isComplete(): JsonField<Boolean> = isComplete

    /**
     * Returns the raw JSON value of [otherFeesGrossAmount].
     *
     * Unlike [otherFeesGrossAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount(): JsonField<Long> = otherFeesGrossAmount

    /**
     * Returns the raw JSON value of [reportDate].
     *
     * Unlike [reportDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_date") @ExcludeMissing fun _reportDate(): JsonField<String> = reportDate

    /**
     * Returns the raw JSON value of [settledNetAmount].
     *
     * Unlike [settledNetAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("settled_net_amount")
    @ExcludeMissing
    fun _settledNetAmount(): JsonField<Long> = settledNetAmount

    /**
     * Returns the raw JSON value of [transactionsGrossAmount].
     *
     * Unlike [transactionsGrossAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount(): JsonField<Long> = transactionsGrossAmount

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * [SettlementReportUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .created()
         * .currency()
         * .details()
         * .disputesGrossAmount()
         * .interchangeGrossAmount()
         * .isComplete()
         * .otherFeesGrossAmount()
         * .reportDate()
         * .settledNetAmount()
         * .transactionsGrossAmount()
         * .updated()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettlementReportUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var details: JsonField<MutableList<SettlementSummaryDetails>>? = null
        private var disputesGrossAmount: JsonField<Long>? = null
        private var interchangeGrossAmount: JsonField<Long>? = null
        private var isComplete: JsonField<Boolean>? = null
        private var otherFeesGrossAmount: JsonField<Long>? = null
        private var reportDate: JsonField<String>? = null
        private var settledNetAmount: JsonField<Long>? = null
        private var transactionsGrossAmount: JsonField<Long>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            settlementReportUpdatedWebhookEvent: SettlementReportUpdatedWebhookEvent
        ) = apply {
            created = settlementReportUpdatedWebhookEvent.created
            currency = settlementReportUpdatedWebhookEvent.currency
            details = settlementReportUpdatedWebhookEvent.details.map { it.toMutableList() }
            disputesGrossAmount = settlementReportUpdatedWebhookEvent.disputesGrossAmount
            interchangeGrossAmount = settlementReportUpdatedWebhookEvent.interchangeGrossAmount
            isComplete = settlementReportUpdatedWebhookEvent.isComplete
            otherFeesGrossAmount = settlementReportUpdatedWebhookEvent.otherFeesGrossAmount
            reportDate = settlementReportUpdatedWebhookEvent.reportDate
            settledNetAmount = settlementReportUpdatedWebhookEvent.settledNetAmount
            transactionsGrossAmount = settlementReportUpdatedWebhookEvent.transactionsGrossAmount
            updated = settlementReportUpdatedWebhookEvent.updated
            eventType = settlementReportUpdatedWebhookEvent.eventType
            additionalProperties =
                settlementReportUpdatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * 3-character alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
         * future version of the API.)
         */
        @Deprecated("deprecated") fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun details(details: List<SettlementSummaryDetails>) = details(JsonField.of(details))

        /**
         * Sets [Builder.details] to an arbitrary JSON value.
         *
         * You should usually call [Builder.details] with a well-typed
         * `List<SettlementSummaryDetails>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun details(details: JsonField<List<SettlementSummaryDetails>>) = apply {
            this.details = details.map { it.toMutableList() }
        }

        /**
         * Adds a single [SettlementSummaryDetails] to [details].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDetail(detail: SettlementSummaryDetails) = apply {
            details =
                (details ?: JsonField.of(mutableListOf())).also {
                    checkKnown("details", it).add(detail)
                }
        }

        /**
         * The total gross amount of disputes settlements. (This field is deprecated and will be
         * removed in a future version of the API. To compute total amounts, Lithic recommends that
         * customers sum the relevant settlement amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun disputesGrossAmount(disputesGrossAmount: Long) =
            disputesGrossAmount(JsonField.of(disputesGrossAmount))

        /**
         * Sets [Builder.disputesGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputesGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun disputesGrossAmount(disputesGrossAmount: JsonField<Long>) = apply {
            this.disputesGrossAmount = disputesGrossAmount
        }

        /**
         * The total amount of interchange. (This field is deprecated and will be removed in a
         * future version of the API. To compute total amounts, Lithic recommends that customers sum
         * the relevant settlement amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun interchangeGrossAmount(interchangeGrossAmount: Long) =
            interchangeGrossAmount(JsonField.of(interchangeGrossAmount))

        /**
         * Sets [Builder.interchangeGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interchangeGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** Indicates that all data expected on the given report date is available. */
        fun isComplete(isComplete: Boolean) = isComplete(JsonField.of(isComplete))

        /**
         * Sets [Builder.isComplete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isComplete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isComplete(isComplete: JsonField<Boolean>) = apply { this.isComplete = isComplete }

        /**
         * Total amount of gross other fees outside of interchange. (This field is deprecated and
         * will be removed in a future version of the API. To compute total amounts, Lithic
         * recommends that customers sum the relevant settlement amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun otherFeesGrossAmount(otherFeesGrossAmount: Long) =
            otherFeesGrossAmount(JsonField.of(otherFeesGrossAmount))

        /**
         * Sets [Builder.otherFeesGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherFeesGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun otherFeesGrossAmount(otherFeesGrossAmount: JsonField<Long>) = apply {
            this.otherFeesGrossAmount = otherFeesGrossAmount
        }

        /** Date of when the report was first generated. */
        fun reportDate(reportDate: String) = reportDate(JsonField.of(reportDate))

        /**
         * Sets [Builder.reportDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportDate(reportDate: JsonField<String>) = apply { this.reportDate = reportDate }

        /**
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees). (This field is deprecated and will be removed in a future version of the API. To
         * compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun settledNetAmount(settledNetAmount: Long) =
            settledNetAmount(JsonField.of(settledNetAmount))

        /**
         * Sets [Builder.settledNetAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledNetAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun settledNetAmount(settledNetAmount: JsonField<Long>) = apply {
            this.settledNetAmount = settledNetAmount
        }

        /**
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes). (This field is deprecated and will be removed in a future version of the API.
         * To compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun transactionsGrossAmount(transactionsGrossAmount: Long) =
            transactionsGrossAmount(JsonField.of(transactionsGrossAmount))

        /**
         * Sets [Builder.transactionsGrossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionsGrossAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun transactionsGrossAmount(transactionsGrossAmount: JsonField<Long>) = apply {
            this.transactionsGrossAmount = transactionsGrossAmount
        }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
         * Returns an immutable instance of [SettlementReportUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .created()
         * .currency()
         * .details()
         * .disputesGrossAmount()
         * .interchangeGrossAmount()
         * .isComplete()
         * .otherFeesGrossAmount()
         * .reportDate()
         * .settledNetAmount()
         * .transactionsGrossAmount()
         * .updated()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettlementReportUpdatedWebhookEvent =
            SettlementReportUpdatedWebhookEvent(
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("details", details).map { it.toImmutable() },
                checkRequired("disputesGrossAmount", disputesGrossAmount),
                checkRequired("interchangeGrossAmount", interchangeGrossAmount),
                checkRequired("isComplete", isComplete),
                checkRequired("otherFeesGrossAmount", otherFeesGrossAmount),
                checkRequired("reportDate", reportDate),
                checkRequired("settledNetAmount", settledNetAmount),
                checkRequired("transactionsGrossAmount", transactionsGrossAmount),
                checkRequired("updated", updated),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettlementReportUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        created()
        currency()
        details().forEach { it.validate() }
        disputesGrossAmount()
        interchangeGrossAmount()
        isComplete()
        otherFeesGrossAmount()
        reportDate()
        settledNetAmount()
        transactionsGrossAmount()
        updated()
        eventType().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (details.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (disputesGrossAmount.asKnown().isPresent) 1 else 0) +
            (if (interchangeGrossAmount.asKnown().isPresent) 1 else 0) +
            (if (isComplete.asKnown().isPresent) 1 else 0) +
            (if (otherFeesGrossAmount.asKnown().isPresent) 1 else 0) +
            (if (reportDate.asKnown().isPresent) 1 else 0) +
            (if (settledNetAmount.asKnown().isPresent) 1 else 0) +
            (if (transactionsGrossAmount.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** The type of event that occurred. */
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

            @JvmField val SETTLEMENT_REPORT_UPDATED = of("settlement_report.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            SETTLEMENT_REPORT_UPDATED
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
            SETTLEMENT_REPORT_UPDATED,
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
                SETTLEMENT_REPORT_UPDATED -> Value.SETTLEMENT_REPORT_UPDATED
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
                SETTLEMENT_REPORT_UPDATED -> Known.SETTLEMENT_REPORT_UPDATED
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettlementReportUpdatedWebhookEvent &&
            created == other.created &&
            currency == other.currency &&
            details == other.details &&
            disputesGrossAmount == other.disputesGrossAmount &&
            interchangeGrossAmount == other.interchangeGrossAmount &&
            isComplete == other.isComplete &&
            otherFeesGrossAmount == other.otherFeesGrossAmount &&
            reportDate == other.reportDate &&
            settledNetAmount == other.settledNetAmount &&
            transactionsGrossAmount == other.transactionsGrossAmount &&
            updated == other.updated &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            created,
            currency,
            details,
            disputesGrossAmount,
            interchangeGrossAmount,
            isComplete,
            otherFeesGrossAmount,
            reportDate,
            settledNetAmount,
            transactionsGrossAmount,
            updated,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettlementReportUpdatedWebhookEvent{created=$created, currency=$currency, details=$details, disputesGrossAmount=$disputesGrossAmount, interchangeGrossAmount=$interchangeGrossAmount, isComplete=$isComplete, otherFeesGrossAmount=$otherFeesGrossAmount, reportDate=$reportDate, settledNetAmount=$settledNetAmount, transactionsGrossAmount=$transactionsGrossAmount, updated=$updated, eventType=$eventType, additionalProperties=$additionalProperties}"
}
