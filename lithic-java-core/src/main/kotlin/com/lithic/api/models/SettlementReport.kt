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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class SettlementReport
@JsonCreator
private constructor(
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("details")
    @ExcludeMissing
    private val details: JsonField<List<SettlementSummaryDetails>> = JsonMissing.of(),
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    private val disputesGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    private val interchangeGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("is_complete")
    @ExcludeMissing
    private val isComplete: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    private val otherFeesGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("report_date")
    @ExcludeMissing
    private val reportDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("settled_net_amount")
    @ExcludeMissing
    private val settledNetAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    private val transactionsGrossAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
     * future version of the API.)
     */
    @Deprecated("deprecated") fun currency(): String = currency.getRequired("currency")

    fun details(): List<SettlementSummaryDetails> = details.getRequired("details")

    /**
     * The total gross amount of disputes settlements. (This field is deprecated and will be removed
     * in a future version of the API. To compute total amounts, Lithic recommends that customers
     * sum the relevant settlement amounts found within `details`.)
     */
    @Deprecated("deprecated")
    fun disputesGrossAmount(): Long = disputesGrossAmount.getRequired("disputes_gross_amount")

    /**
     * The total amount of interchange. (This field is deprecated and will be removed in a future
     * version of the API. To compute total amounts, Lithic recommends that customers sum the
     * relevant settlement amounts found within `details`.)
     */
    @Deprecated("deprecated")
    fun interchangeGrossAmount(): Long =
        interchangeGrossAmount.getRequired("interchange_gross_amount")

    /** Indicates that all data expected on the given report date is available. */
    fun isComplete(): Boolean = isComplete.getRequired("is_complete")

    /**
     * Total amount of gross other fees outside of interchange. (This field is deprecated and will
     * be removed in a future version of the API. To compute total amounts, Lithic recommends that
     * customers sum the relevant settlement amounts found within `details`.)
     */
    @Deprecated("deprecated")
    fun otherFeesGrossAmount(): Long = otherFeesGrossAmount.getRequired("other_fees_gross_amount")

    /** Date of when the report was first generated. */
    fun reportDate(): String = reportDate.getRequired("report_date")

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     * (This field is deprecated and will be removed in a future version of the API. To compute
     * total amounts, Lithic recommends that customers sum the relevant settlement amounts found
     * within `details`.)
     */
    @Deprecated("deprecated")
    fun settledNetAmount(): Long = settledNetAmount.getRequired("settled_net_amount")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes). (This field is deprecated and will be removed in a future version of the API. To
     * compute total amounts, Lithic recommends that customers sum the relevant settlement amounts
     * found within `details`.)
     */
    @Deprecated("deprecated")
    fun transactionsGrossAmount(): Long =
        transactionsGrossAmount.getRequired("transactions_gross_amount")

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
     * future version of the API.)
     */
    @Deprecated("deprecated")
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency(): JsonField<String> = currency

    @JsonProperty("details")
    @ExcludeMissing
    fun _details(): JsonField<List<SettlementSummaryDetails>> = details

    /**
     * The total gross amount of disputes settlements. (This field is deprecated and will be removed
     * in a future version of the API. To compute total amounts, Lithic recommends that customers
     * sum the relevant settlement amounts found within `details`.)
     */
    @Deprecated("deprecated")
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount(): JsonField<Long> = disputesGrossAmount

    /**
     * The total amount of interchange. (This field is deprecated and will be removed in a future
     * version of the API. To compute total amounts, Lithic recommends that customers sum the
     * relevant settlement amounts found within `details`.)
     */
    @Deprecated("deprecated")
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount(): JsonField<Long> = interchangeGrossAmount

    /** Indicates that all data expected on the given report date is available. */
    @JsonProperty("is_complete") @ExcludeMissing fun _isComplete(): JsonField<Boolean> = isComplete

    /**
     * Total amount of gross other fees outside of interchange. (This field is deprecated and will
     * be removed in a future version of the API. To compute total amounts, Lithic recommends that
     * customers sum the relevant settlement amounts found within `details`.)
     */
    @Deprecated("deprecated")
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount(): JsonField<Long> = otherFeesGrossAmount

    /** Date of when the report was first generated. */
    @JsonProperty("report_date") @ExcludeMissing fun _reportDate(): JsonField<String> = reportDate

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     * (This field is deprecated and will be removed in a future version of the API. To compute
     * total amounts, Lithic recommends that customers sum the relevant settlement amounts found
     * within `details`.)
     */
    @Deprecated("deprecated")
    @JsonProperty("settled_net_amount")
    @ExcludeMissing
    fun _settledNetAmount(): JsonField<Long> = settledNetAmount

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes). (This field is deprecated and will be removed in a future version of the API. To
     * compute total amounts, Lithic recommends that customers sum the relevant settlement amounts
     * found within `details`.)
     */
    @Deprecated("deprecated")
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount(): JsonField<Long> = transactionsGrossAmount

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
         * future version of the API.)
         */
        @Deprecated("deprecated") fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
         * future version of the API.)
         */
        @Deprecated("deprecated")
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun details(details: List<SettlementSummaryDetails>) = details(JsonField.of(details))

        fun details(details: JsonField<List<SettlementSummaryDetails>>) = apply {
            this.details = details.map { it.toMutableList() }
        }

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
         * The total gross amount of disputes settlements. (This field is deprecated and will be
         * removed in a future version of the API. To compute total amounts, Lithic recommends that
         * customers sum the relevant settlement amounts found within `details`.)
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
         * The total amount of interchange. (This field is deprecated and will be removed in a
         * future version of the API. To compute total amounts, Lithic recommends that customers sum
         * the relevant settlement amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** Indicates that all data expected on the given report date is available. */
        fun isComplete(isComplete: Boolean) = isComplete(JsonField.of(isComplete))

        /** Indicates that all data expected on the given report date is available. */
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
         * Total amount of gross other fees outside of interchange. (This field is deprecated and
         * will be removed in a future version of the API. To compute total amounts, Lithic
         * recommends that customers sum the relevant settlement amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun otherFeesGrossAmount(otherFeesGrossAmount: JsonField<Long>) = apply {
            this.otherFeesGrossAmount = otherFeesGrossAmount
        }

        /** Date of when the report was first generated. */
        fun reportDate(reportDate: String) = reportDate(JsonField.of(reportDate))

        /** Date of when the report was first generated. */
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
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees). (This field is deprecated and will be removed in a future version of the API. To
         * compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
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
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes). (This field is deprecated and will be removed in a future version of the API.
         * To compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
         */
        @Deprecated("deprecated")
        fun transactionsGrossAmount(transactionsGrossAmount: JsonField<Long>) = apply {
            this.transactionsGrossAmount = transactionsGrossAmount
        }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the transaction first occurred. UTC time zone. */
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
                additionalProperties.toImmutable(),
            )
    }

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
