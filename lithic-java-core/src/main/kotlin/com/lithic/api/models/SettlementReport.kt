// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = SettlementReport.Builder::class)
@NoAutoDetect
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
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
     * future version of the API.)
     */
    fun currency(): String = currency.getRequired("currency")

    fun details(): List<SettlementSummaryDetails> = details.getRequired("details")

    /**
     * The total gross amount of disputes settlements. (This field is deprecated and will be removed
     * in a future version of the API. To compute total amounts, Lithic recommends that customers
     * sum the relevant settlement amounts found within `details`.)
     */
    fun disputesGrossAmount(): Long = disputesGrossAmount.getRequired("disputes_gross_amount")

    /**
     * The total amount of interchange. (This field is deprecated and will be removed in a future
     * version of the API. To compute total amounts, Lithic recommends that customers sum the
     * relevant settlement amounts found within `details`.)
     */
    fun interchangeGrossAmount(): Long =
        interchangeGrossAmount.getRequired("interchange_gross_amount")

    /** Indicates that all data expected on the given report date is available. */
    fun isComplete(): Boolean = isComplete.getRequired("is_complete")

    /**
     * Total amount of gross other fees outside of interchange. (This field is deprecated and will
     * be removed in a future version of the API. To compute total amounts, Lithic recommends that
     * customers sum the relevant settlement amounts found within `details`.)
     */
    fun otherFeesGrossAmount(): Long = otherFeesGrossAmount.getRequired("other_fees_gross_amount")

    /** Date of when the report was first generated. */
    fun reportDate(): String = reportDate.getRequired("report_date")

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     * (This field is deprecated and will be removed in a future version of the API. To compute
     * total amounts, Lithic recommends that customers sum the relevant settlement amounts found
     * within `details`.)
     */
    fun settledNetAmount(): Long = settledNetAmount.getRequired("settled_net_amount")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes). (This field is deprecated and will be removed in a future version of the API. To
     * compute total amounts, Lithic recommends that customers sum the relevant settlement amounts
     * found within `details`.)
     */
    fun transactionsGrossAmount(): Long =
        transactionsGrossAmount.getRequired("transactions_gross_amount")

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
     * future version of the API.)
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    @JsonProperty("details") @ExcludeMissing fun _details() = details

    /**
     * The total gross amount of disputes settlements. (This field is deprecated and will be removed
     * in a future version of the API. To compute total amounts, Lithic recommends that customers
     * sum the relevant settlement amounts found within `details`.)
     */
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount() = disputesGrossAmount

    /**
     * The total amount of interchange. (This field is deprecated and will be removed in a future
     * version of the API. To compute total amounts, Lithic recommends that customers sum the
     * relevant settlement amounts found within `details`.)
     */
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount() = interchangeGrossAmount

    /** Indicates that all data expected on the given report date is available. */
    @JsonProperty("is_complete") @ExcludeMissing fun _isComplete() = isComplete

    /**
     * Total amount of gross other fees outside of interchange. (This field is deprecated and will
     * be removed in a future version of the API. To compute total amounts, Lithic recommends that
     * customers sum the relevant settlement amounts found within `details`.)
     */
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount() = otherFeesGrossAmount

    /** Date of when the report was first generated. */
    @JsonProperty("report_date") @ExcludeMissing fun _reportDate() = reportDate

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     * (This field is deprecated and will be removed in a future version of the API. To compute
     * total amounts, Lithic recommends that customers sum the relevant settlement amounts found
     * within `details`.)
     */
    @JsonProperty("settled_net_amount") @ExcludeMissing fun _settledNetAmount() = settledNetAmount

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes). (This field is deprecated and will be removed in a future version of the API. To
     * compute total amounts, Lithic recommends that customers sum the relevant settlement amounts
     * found within `details`.)
     */
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount() = transactionsGrossAmount

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SettlementReport = apply {
        if (!validated) {
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
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var details: JsonField<List<SettlementSummaryDetails>> = JsonMissing.of()
        private var disputesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var interchangeGrossAmount: JsonField<Long> = JsonMissing.of()
        private var isComplete: JsonField<Boolean> = JsonMissing.of()
        private var otherFeesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var reportDate: JsonField<String> = JsonMissing.of()
        private var settledNetAmount: JsonField<Long> = JsonMissing.of()
        private var transactionsGrossAmount: JsonField<Long> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settlementReport: SettlementReport) = apply {
            this.created = settlementReport.created
            this.currency = settlementReport.currency
            this.details = settlementReport.details
            this.disputesGrossAmount = settlementReport.disputesGrossAmount
            this.interchangeGrossAmount = settlementReport.interchangeGrossAmount
            this.isComplete = settlementReport.isComplete
            this.otherFeesGrossAmount = settlementReport.otherFeesGrossAmount
            this.reportDate = settlementReport.reportDate
            this.settledNetAmount = settlementReport.settledNetAmount
            this.transactionsGrossAmount = settlementReport.transactionsGrossAmount
            this.updated = settlementReport.updated
            additionalProperties(settlementReport.additionalProperties)
        }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transaction first occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
         * future version of the API.)
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Three-digit alphabetic ISO 4217 code. (This field is deprecated and will be removed in a
         * future version of the API.)
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun details(details: List<SettlementSummaryDetails>) = details(JsonField.of(details))

        @JsonProperty("details")
        @ExcludeMissing
        fun details(details: JsonField<List<SettlementSummaryDetails>>) = apply {
            this.details = details
        }

        /**
         * The total gross amount of disputes settlements. (This field is deprecated and will be
         * removed in a future version of the API. To compute total amounts, Lithic recommends that
         * customers sum the relevant settlement amounts found within `details`.)
         */
        fun disputesGrossAmount(disputesGrossAmount: Long) =
            disputesGrossAmount(JsonField.of(disputesGrossAmount))

        /**
         * The total gross amount of disputes settlements. (This field is deprecated and will be
         * removed in a future version of the API. To compute total amounts, Lithic recommends that
         * customers sum the relevant settlement amounts found within `details`.)
         */
        @JsonProperty("disputes_gross_amount")
        @ExcludeMissing
        fun disputesGrossAmount(disputesGrossAmount: JsonField<Long>) = apply {
            this.disputesGrossAmount = disputesGrossAmount
        }

        /**
         * The total amount of interchange. (This field is deprecated and will be removed in a
         * future version of the API. To compute total amounts, Lithic recommends that customers sum
         * the relevant settlement amounts found within `details`.)
         */
        fun interchangeGrossAmount(interchangeGrossAmount: Long) =
            interchangeGrossAmount(JsonField.of(interchangeGrossAmount))

        /**
         * The total amount of interchange. (This field is deprecated and will be removed in a
         * future version of the API. To compute total amounts, Lithic recommends that customers sum
         * the relevant settlement amounts found within `details`.)
         */
        @JsonProperty("interchange_gross_amount")
        @ExcludeMissing
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** Indicates that all data expected on the given report date is available. */
        fun isComplete(isComplete: Boolean) = isComplete(JsonField.of(isComplete))

        /** Indicates that all data expected on the given report date is available. */
        @JsonProperty("is_complete")
        @ExcludeMissing
        fun isComplete(isComplete: JsonField<Boolean>) = apply { this.isComplete = isComplete }

        /**
         * Total amount of gross other fees outside of interchange. (This field is deprecated and
         * will be removed in a future version of the API. To compute total amounts, Lithic
         * recommends that customers sum the relevant settlement amounts found within `details`.)
         */
        fun otherFeesGrossAmount(otherFeesGrossAmount: Long) =
            otherFeesGrossAmount(JsonField.of(otherFeesGrossAmount))

        /**
         * Total amount of gross other fees outside of interchange. (This field is deprecated and
         * will be removed in a future version of the API. To compute total amounts, Lithic
         * recommends that customers sum the relevant settlement amounts found within `details`.)
         */
        @JsonProperty("other_fees_gross_amount")
        @ExcludeMissing
        fun otherFeesGrossAmount(otherFeesGrossAmount: JsonField<Long>) = apply {
            this.otherFeesGrossAmount = otherFeesGrossAmount
        }

        /** Date of when the report was first generated. */
        fun reportDate(reportDate: String) = reportDate(JsonField.of(reportDate))

        /** Date of when the report was first generated. */
        @JsonProperty("report_date")
        @ExcludeMissing
        fun reportDate(reportDate: JsonField<String>) = apply { this.reportDate = reportDate }

        /**
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees). (This field is deprecated and will be removed in a future version of the API. To
         * compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
         */
        fun settledNetAmount(settledNetAmount: Long) =
            settledNetAmount(JsonField.of(settledNetAmount))

        /**
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees). (This field is deprecated and will be removed in a future version of the API. To
         * compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
         */
        @JsonProperty("settled_net_amount")
        @ExcludeMissing
        fun settledNetAmount(settledNetAmount: JsonField<Long>) = apply {
            this.settledNetAmount = settledNetAmount
        }

        /**
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes). (This field is deprecated and will be removed in a future version of the API.
         * To compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
         */
        fun transactionsGrossAmount(transactionsGrossAmount: Long) =
            transactionsGrossAmount(JsonField.of(transactionsGrossAmount))

        /**
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes). (This field is deprecated and will be removed in a future version of the API.
         * To compute total amounts, Lithic recommends that customers sum the relevant settlement
         * amounts found within `details`.)
         */
        @JsonProperty("transactions_gross_amount")
        @ExcludeMissing
        fun transactionsGrossAmount(transactionsGrossAmount: JsonField<Long>) = apply {
            this.transactionsGrossAmount = transactionsGrossAmount
        }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the transaction first occurred. UTC time zone. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): SettlementReport =
            SettlementReport(
                created,
                currency,
                details.map { it.toImmutable() },
                disputesGrossAmount,
                interchangeGrossAmount,
                isComplete,
                otherFeesGrossAmount,
                reportDate,
                settledNetAmount,
                transactionsGrossAmount,
                updated,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SettlementReport && this.created == other.created && this.currency == other.currency && this.details == other.details && this.disputesGrossAmount == other.disputesGrossAmount && this.interchangeGrossAmount == other.interchangeGrossAmount && this.isComplete == other.isComplete && this.otherFeesGrossAmount == other.otherFeesGrossAmount && this.reportDate == other.reportDate && this.settledNetAmount == other.settledNetAmount && this.transactionsGrossAmount == other.transactionsGrossAmount && this.updated == other.updated && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(created, currency, details, disputesGrossAmount, interchangeGrossAmount, isComplete, otherFeesGrossAmount, reportDate, settledNetAmount, transactionsGrossAmount, updated, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SettlementReport{created=$created, currency=$currency, details=$details, disputesGrossAmount=$disputesGrossAmount, interchangeGrossAmount=$interchangeGrossAmount, isComplete=$isComplete, otherFeesGrossAmount=$otherFeesGrossAmount, reportDate=$reportDate, settledNetAmount=$settledNetAmount, transactionsGrossAmount=$transactionsGrossAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
