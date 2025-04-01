// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class SettlementReport
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
        mutableMapOf(),
    )

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
         * Returns a mutable builder for constructing an instance of [SettlementReport].
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
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettlementReport]. */
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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settlementReport: SettlementReport) = apply {
            created = settlementReport.created
            currency = settlementReport.currency
            details = settlementReport.details.map { it.toMutableList() }
            disputesGrossAmount = settlementReport.disputesGrossAmount
            interchangeGrossAmount = settlementReport.interchangeGrossAmount
            isComplete = settlementReport.isComplete
            otherFeesGrossAmount = settlementReport.otherFeesGrossAmount
            reportDate = settlementReport.reportDate
            settledNetAmount = settlementReport.settledNetAmount
            transactionsGrossAmount = settlementReport.transactionsGrossAmount
            updated = settlementReport.updated
            additionalProperties = settlementReport.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SettlementReport].
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
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettlementReport =
            SettlementReport(
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettlementReport = apply {
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
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SettlementReport && created == other.created && currency == other.currency && details == other.details && disputesGrossAmount == other.disputesGrossAmount && interchangeGrossAmount == other.interchangeGrossAmount && isComplete == other.isComplete && otherFeesGrossAmount == other.otherFeesGrossAmount && reportDate == other.reportDate && settledNetAmount == other.settledNetAmount && transactionsGrossAmount == other.transactionsGrossAmount && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(created, currency, details, disputesGrossAmount, interchangeGrossAmount, isComplete, otherFeesGrossAmount, reportDate, settledNetAmount, transactionsGrossAmount, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettlementReport{created=$created, currency=$currency, details=$details, disputesGrossAmount=$disputesGrossAmount, interchangeGrossAmount=$interchangeGrossAmount, isComplete=$isComplete, otherFeesGrossAmount=$otherFeesGrossAmount, reportDate=$reportDate, settledNetAmount=$settledNetAmount, transactionsGrossAmount=$transactionsGrossAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
