package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Dispute. */
@JsonDeserialize(builder = Dispute.Builder::class)
@NoAutoDetect
class Dispute
private constructor(
    private val amount: JsonField<Long>,
    private val arbitrationDate: JsonField<OffsetDateTime>,
    private val created: JsonField<OffsetDateTime>,
    private val customerFiledDate: JsonField<OffsetDateTime>,
    private val customerNote: JsonField<String>,
    private val networkClaimIds: JsonField<List<String>>,
    private val primaryClaimId: JsonField<String>,
    private val networkFiledDate: JsonField<OffsetDateTime>,
    private val networkReasonCode: JsonField<String>,
    private val prearbitrationDate: JsonField<OffsetDateTime>,
    private val reason: JsonField<Reason>,
    private val representmentDate: JsonField<OffsetDateTime>,
    private val resolutionAmount: JsonField<Long>,
    private val resolutionDate: JsonField<OffsetDateTime>,
    private val resolutionNote: JsonField<String>,
    private val resolutionReason: JsonField<ResolutionReason>,
    private val status: JsonField<Status>,
    private val token: JsonField<String>,
    private val transactionToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Amount under dispute. May be different from the original transaction amount. */
    fun amount(): Long = amount.getRequired("amount")

    /** Date dispute entered arbitration. */
    fun arbitrationDate(): OffsetDateTime = arbitrationDate.getRequired("arbitration_date")

    /** Timestamp of when first Dispute was reported. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Date that the dispute was filed by the customer making the dispute. */
    fun customerFiledDate(): OffsetDateTime = customerFiledDate.getRequired("customer_filed_date")

    /** End customer description of the reason for the dispute. */
    fun customerNote(): String = customerNote.getRequired("customer_note")

    /** Unique identifiers for the dispute from the network. */
    fun networkClaimIds(): List<String> = networkClaimIds.getRequired("network_claim_ids")

    /**
     * Unique identifier for the dispute from the network. If there are multiple, this will be the
     * first claim id set by the network
     */
    fun primaryClaimId(): String = primaryClaimId.getRequired("primary_claim_id")

    /** Date that the dispute was submitted to the network. */
    fun networkFiledDate(): OffsetDateTime = networkFiledDate.getRequired("network_filed_date")

    /** Network reason code used to file the dispute. */
    fun networkReasonCode(): String = networkReasonCode.getRequired("network_reason_code")

    /** Date dispute entered pre-arbitration. */
    fun prearbitrationDate(): OffsetDateTime = prearbitrationDate.getRequired("prearbitration_date")

    /**
     * Dispute reason:
     *
     * - `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
     * - `CANCELLED`: Transaction was cancelled by the customer.
     * - `DUPLICATED`: The transaction was a duplicate.
     * - `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
     * - `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
     * - `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant activity.
     * - `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
     * - `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
     * - `INCORRECT_AMOUNT`: The transaction amount was incorrect.
     * - `MISSING_AUTH`: The transaction was missing authorization.
     * - `OTHER`: Other reason.
     * - `PROCESSING_ERROR`: Processing error.
     * - `REFUND_NOT_PROCESSED`: The refund was not processed.
     * - `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
     */
    fun reason(): Reason = reason.getRequired("reason")

    /** Date the representment was received. */
    fun representmentDate(): OffsetDateTime = representmentDate.getRequired("representment_date")

    /** Resolution amount net of network fees. */
    fun resolutionAmount(): Long = resolutionAmount.getRequired("resolution_amount")

    /** Date that the dispute was resolved. */
    fun resolutionDate(): OffsetDateTime = resolutionDate.getRequired("resolution_date")

    /** Note by Dispute team on the case resolution. */
    fun resolutionNote(): String = resolutionNote.getRequired("resolution_note")

    /**
     * Reason for the dispute resolution:
     *
     * - `CASE_LOST`: This case was lost at final arbitration.
     * - `NETWORK_REJECTED`: Network rejected.
     * - `NO_DISPUTE_RIGHTS_3DS`: No dispute rights, 3DS.
     * - `NO_DISPUTE_RIGHTS_BELOW_THRESHOLD`: No dispute rights, below threshold.
     * - `NO_DISPUTE_RIGHTS_CONTACTLESS`: No dispute rights, contactless.
     * - `NO_DISPUTE_RIGHTS_HYBRID`: No dispute rights, hybrid.
     * - `NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS`: No dispute rights, max chargebacks.
     * - `NO_DISPUTE_RIGHTS_OTHER`: No dispute rights, other.
     * - `PAST_FILING_DATE`: Past filing date.
     * - `PREARBITRATION_REJECTED`: Prearbitration rejected.
     * - `PROCESSOR_REJECTED_OTHER`: Processor rejected, other.
     * - `REFUNDED`: Refunded.
     * - `REFUNDED_AFTER_CHARGEBACK`: Refunded after chargeback.
     * - `WITHDRAWN`: Withdrawn.
     * - `WON_ARBITRATION`: Won arbitration.
     * - `WON_FIRST_CHARGEBACK`: Won first chargeback.
     * - `WON_PREARBITRATION`: Won prearbitration.
     */
    fun resolutionReason(): ResolutionReason = resolutionReason.getRequired("resolution_reason")

    /**
     * Status types:
     *
     * - `NEW` - New dispute case is opened.
     * - `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
     * - `SUBMITTED` - Dispute is submitted to the card network.
     * - `REPRESENTMENT` - Case has entered second presentment.
     * - `PREARBITRATION` - Case has entered prearbitration.
     * - `ARBITRATION` - Case has entered arbitration.
     * - `CASE_WON` - Case was won and credit will be issued.
     * - `CASE_CLOSED` - Case was lost or withdrawn.
     */
    fun status(): Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * The transaction that is being disputed. A transaction can only be disputed once but may have
     * multiple dispute cases.
     */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /** Amount under dispute. May be different from the original transaction amount. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** Date dispute entered arbitration. */
    @JsonProperty("arbitration_date") @ExcludeMissing fun _arbitrationDate() = arbitrationDate

    /** Timestamp of when first Dispute was reported. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Date that the dispute was filed by the customer making the dispute. */
    @JsonProperty("customer_filed_date")
    @ExcludeMissing
    fun _customerFiledDate() = customerFiledDate

    /** End customer description of the reason for the dispute. */
    @JsonProperty("customer_note") @ExcludeMissing fun _customerNote() = customerNote

    /** Unique identifiers for the dispute from the network. */
    @JsonProperty("network_claim_ids") @ExcludeMissing fun _networkClaimIds() = networkClaimIds

    /**
     * Unique identifier for the dispute from the network. If there are multiple, this will be the
     * first claim id set by the network
     */
    @JsonProperty("primary_claim_id") @ExcludeMissing fun _primaryClaimId() = primaryClaimId

    /** Date that the dispute was submitted to the network. */
    @JsonProperty("network_filed_date") @ExcludeMissing fun _networkFiledDate() = networkFiledDate

    /** Network reason code used to file the dispute. */
    @JsonProperty("network_reason_code")
    @ExcludeMissing
    fun _networkReasonCode() = networkReasonCode

    /** Date dispute entered pre-arbitration. */
    @JsonProperty("prearbitration_date")
    @ExcludeMissing
    fun _prearbitrationDate() = prearbitrationDate

    /**
     * Dispute reason:
     *
     * - `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
     * - `CANCELLED`: Transaction was cancelled by the customer.
     * - `DUPLICATED`: The transaction was a duplicate.
     * - `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
     * - `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
     * - `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant activity.
     * - `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
     * - `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
     * - `INCORRECT_AMOUNT`: The transaction amount was incorrect.
     * - `MISSING_AUTH`: The transaction was missing authorization.
     * - `OTHER`: Other reason.
     * - `PROCESSING_ERROR`: Processing error.
     * - `REFUND_NOT_PROCESSED`: The refund was not processed.
     * - `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /** Date the representment was received. */
    @JsonProperty("representment_date") @ExcludeMissing fun _representmentDate() = representmentDate

    /** Resolution amount net of network fees. */
    @JsonProperty("resolution_amount") @ExcludeMissing fun _resolutionAmount() = resolutionAmount

    /** Date that the dispute was resolved. */
    @JsonProperty("resolution_date") @ExcludeMissing fun _resolutionDate() = resolutionDate

    /** Note by Dispute team on the case resolution. */
    @JsonProperty("resolution_note") @ExcludeMissing fun _resolutionNote() = resolutionNote

    /**
     * Reason for the dispute resolution:
     *
     * - `CASE_LOST`: This case was lost at final arbitration.
     * - `NETWORK_REJECTED`: Network rejected.
     * - `NO_DISPUTE_RIGHTS_3DS`: No dispute rights, 3DS.
     * - `NO_DISPUTE_RIGHTS_BELOW_THRESHOLD`: No dispute rights, below threshold.
     * - `NO_DISPUTE_RIGHTS_CONTACTLESS`: No dispute rights, contactless.
     * - `NO_DISPUTE_RIGHTS_HYBRID`: No dispute rights, hybrid.
     * - `NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS`: No dispute rights, max chargebacks.
     * - `NO_DISPUTE_RIGHTS_OTHER`: No dispute rights, other.
     * - `PAST_FILING_DATE`: Past filing date.
     * - `PREARBITRATION_REJECTED`: Prearbitration rejected.
     * - `PROCESSOR_REJECTED_OTHER`: Processor rejected, other.
     * - `REFUNDED`: Refunded.
     * - `REFUNDED_AFTER_CHARGEBACK`: Refunded after chargeback.
     * - `WITHDRAWN`: Withdrawn.
     * - `WON_ARBITRATION`: Won arbitration.
     * - `WON_FIRST_CHARGEBACK`: Won first chargeback.
     * - `WON_PREARBITRATION`: Won prearbitration.
     */
    @JsonProperty("resolution_reason") @ExcludeMissing fun _resolutionReason() = resolutionReason

    /**
     * Status types:
     *
     * - `NEW` - New dispute case is opened.
     * - `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
     * - `SUBMITTED` - Dispute is submitted to the card network.
     * - `REPRESENTMENT` - Case has entered second presentment.
     * - `PREARBITRATION` - Case has entered prearbitration.
     * - `ARBITRATION` - Case has entered arbitration.
     * - `CASE_WON` - Case was won and credit will be issued.
     * - `CASE_CLOSED` - Case was lost or withdrawn.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * The transaction that is being disputed. A transaction can only be disputed once but may have
     * multiple dispute cases.
     */
    @JsonProperty("transaction_token") @ExcludeMissing fun _transactionToken() = transactionToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            amount()
            arbitrationDate()
            created()
            customerFiledDate()
            customerNote()
            networkClaimIds()
            primaryClaimId()
            networkFiledDate()
            networkReasonCode()
            prearbitrationDate()
            reason()
            representmentDate()
            resolutionAmount()
            resolutionDate()
            resolutionNote()
            resolutionReason()
            status()
            token()
            transactionToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Dispute &&
            this.amount == other.amount &&
            this.arbitrationDate == other.arbitrationDate &&
            this.created == other.created &&
            this.customerFiledDate == other.customerFiledDate &&
            this.customerNote == other.customerNote &&
            this.networkClaimIds == other.networkClaimIds &&
            this.primaryClaimId == other.primaryClaimId &&
            this.networkFiledDate == other.networkFiledDate &&
            this.networkReasonCode == other.networkReasonCode &&
            this.prearbitrationDate == other.prearbitrationDate &&
            this.reason == other.reason &&
            this.representmentDate == other.representmentDate &&
            this.resolutionAmount == other.resolutionAmount &&
            this.resolutionDate == other.resolutionDate &&
            this.resolutionNote == other.resolutionNote &&
            this.resolutionReason == other.resolutionReason &&
            this.status == other.status &&
            this.token == other.token &&
            this.transactionToken == other.transactionToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    amount,
                    arbitrationDate,
                    created,
                    customerFiledDate,
                    customerNote,
                    networkClaimIds,
                    primaryClaimId,
                    networkFiledDate,
                    networkReasonCode,
                    prearbitrationDate,
                    reason,
                    representmentDate,
                    resolutionAmount,
                    resolutionDate,
                    resolutionNote,
                    resolutionReason,
                    status,
                    token,
                    transactionToken,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Dispute{amount=$amount, arbitrationDate=$arbitrationDate, created=$created, customerFiledDate=$customerFiledDate, customerNote=$customerNote, networkClaimIds=$networkClaimIds, primaryClaimId=$primaryClaimId, networkFiledDate=$networkFiledDate, networkReasonCode=$networkReasonCode, prearbitrationDate=$prearbitrationDate, reason=$reason, representmentDate=$representmentDate, resolutionAmount=$resolutionAmount, resolutionDate=$resolutionDate, resolutionNote=$resolutionNote, resolutionReason=$resolutionReason, status=$status, token=$token, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var arbitrationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerFiledDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerNote: JsonField<String> = JsonMissing.of()
        private var networkClaimIds: JsonField<List<String>> = JsonMissing.of()
        private var primaryClaimId: JsonField<String> = JsonMissing.of()
        private var networkFiledDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var networkReasonCode: JsonField<String> = JsonMissing.of()
        private var prearbitrationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var reason: JsonField<Reason> = JsonMissing.of()
        private var representmentDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var resolutionAmount: JsonField<Long> = JsonMissing.of()
        private var resolutionDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var resolutionNote: JsonField<String> = JsonMissing.of()
        private var resolutionReason: JsonField<ResolutionReason> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var transactionToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dispute: Dispute) = apply {
            this.amount = dispute.amount
            this.arbitrationDate = dispute.arbitrationDate
            this.created = dispute.created
            this.customerFiledDate = dispute.customerFiledDate
            this.customerNote = dispute.customerNote
            this.networkClaimIds = dispute.networkClaimIds
            this.primaryClaimId = dispute.primaryClaimId
            this.networkFiledDate = dispute.networkFiledDate
            this.networkReasonCode = dispute.networkReasonCode
            this.prearbitrationDate = dispute.prearbitrationDate
            this.reason = dispute.reason
            this.representmentDate = dispute.representmentDate
            this.resolutionAmount = dispute.resolutionAmount
            this.resolutionDate = dispute.resolutionDate
            this.resolutionNote = dispute.resolutionNote
            this.resolutionReason = dispute.resolutionReason
            this.status = dispute.status
            this.token = dispute.token
            this.transactionToken = dispute.transactionToken
            additionalProperties(dispute.additionalProperties)
        }

        /** Amount under dispute. May be different from the original transaction amount. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Amount under dispute. May be different from the original transaction amount. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** Date dispute entered arbitration. */
        fun arbitrationDate(arbitrationDate: OffsetDateTime) =
            arbitrationDate(JsonField.of(arbitrationDate))

        /** Date dispute entered arbitration. */
        @JsonProperty("arbitration_date")
        @ExcludeMissing
        fun arbitrationDate(arbitrationDate: JsonField<OffsetDateTime>) = apply {
            this.arbitrationDate = arbitrationDate
        }

        /** Timestamp of when first Dispute was reported. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when first Dispute was reported. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date that the dispute was filed by the customer making the dispute. */
        fun customerFiledDate(customerFiledDate: OffsetDateTime) =
            customerFiledDate(JsonField.of(customerFiledDate))

        /** Date that the dispute was filed by the customer making the dispute. */
        @JsonProperty("customer_filed_date")
        @ExcludeMissing
        fun customerFiledDate(customerFiledDate: JsonField<OffsetDateTime>) = apply {
            this.customerFiledDate = customerFiledDate
        }

        /** End customer description of the reason for the dispute. */
        fun customerNote(customerNote: String) = customerNote(JsonField.of(customerNote))

        /** End customer description of the reason for the dispute. */
        @JsonProperty("customer_note")
        @ExcludeMissing
        fun customerNote(customerNote: JsonField<String>) = apply {
            this.customerNote = customerNote
        }

        /** Unique identifiers for the dispute from the network. */
        fun networkClaimIds(networkClaimIds: List<String>) =
            networkClaimIds(JsonField.of(networkClaimIds))

        /** Unique identifiers for the dispute from the network. */
        @JsonProperty("network_claim_ids")
        @ExcludeMissing
        fun networkClaimIds(networkClaimIds: JsonField<List<String>>) = apply {
            this.networkClaimIds = networkClaimIds
        }

        /**
         * Unique identifier for the dispute from the network. If there are multiple, this will be
         * the first claim id set by the network
         */
        fun primaryClaimId(primaryClaimId: String) = primaryClaimId(JsonField.of(primaryClaimId))

        /**
         * Unique identifier for the dispute from the network. If there are multiple, this will be
         * the first claim id set by the network
         */
        @JsonProperty("primary_claim_id")
        @ExcludeMissing
        fun primaryClaimId(primaryClaimId: JsonField<String>) = apply {
            this.primaryClaimId = primaryClaimId
        }

        /** Date that the dispute was submitted to the network. */
        fun networkFiledDate(networkFiledDate: OffsetDateTime) =
            networkFiledDate(JsonField.of(networkFiledDate))

        /** Date that the dispute was submitted to the network. */
        @JsonProperty("network_filed_date")
        @ExcludeMissing
        fun networkFiledDate(networkFiledDate: JsonField<OffsetDateTime>) = apply {
            this.networkFiledDate = networkFiledDate
        }

        /** Network reason code used to file the dispute. */
        fun networkReasonCode(networkReasonCode: String) =
            networkReasonCode(JsonField.of(networkReasonCode))

        /** Network reason code used to file the dispute. */
        @JsonProperty("network_reason_code")
        @ExcludeMissing
        fun networkReasonCode(networkReasonCode: JsonField<String>) = apply {
            this.networkReasonCode = networkReasonCode
        }

        /** Date dispute entered pre-arbitration. */
        fun prearbitrationDate(prearbitrationDate: OffsetDateTime) =
            prearbitrationDate(JsonField.of(prearbitrationDate))

        /** Date dispute entered pre-arbitration. */
        @JsonProperty("prearbitration_date")
        @ExcludeMissing
        fun prearbitrationDate(prearbitrationDate: JsonField<OffsetDateTime>) = apply {
            this.prearbitrationDate = prearbitrationDate
        }

        /**
         * Dispute reason:
         *
         * - `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
         * - `CANCELLED`: Transaction was cancelled by the customer.
         * - `DUPLICATED`: The transaction was a duplicate.
         * - `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
         * - `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
         * - `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant
         * activity.
         * - `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
         * - `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
         * - `INCORRECT_AMOUNT`: The transaction amount was incorrect.
         * - `MISSING_AUTH`: The transaction was missing authorization.
         * - `OTHER`: Other reason.
         * - `PROCESSING_ERROR`: Processing error.
         * - `REFUND_NOT_PROCESSED`: The refund was not processed.
         * - `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
         */
        fun reason(reason: Reason) = reason(JsonField.of(reason))

        /**
         * Dispute reason:
         *
         * - `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
         * - `CANCELLED`: Transaction was cancelled by the customer.
         * - `DUPLICATED`: The transaction was a duplicate.
         * - `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
         * - `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
         * - `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant
         * activity.
         * - `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
         * - `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
         * - `INCORRECT_AMOUNT`: The transaction amount was incorrect.
         * - `MISSING_AUTH`: The transaction was missing authorization.
         * - `OTHER`: Other reason.
         * - `PROCESSING_ERROR`: Processing error.
         * - `REFUND_NOT_PROCESSED`: The refund was not processed.
         * - `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
         */
        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        /** Date the representment was received. */
        fun representmentDate(representmentDate: OffsetDateTime) =
            representmentDate(JsonField.of(representmentDate))

        /** Date the representment was received. */
        @JsonProperty("representment_date")
        @ExcludeMissing
        fun representmentDate(representmentDate: JsonField<OffsetDateTime>) = apply {
            this.representmentDate = representmentDate
        }

        /** Resolution amount net of network fees. */
        fun resolutionAmount(resolutionAmount: Long) =
            resolutionAmount(JsonField.of(resolutionAmount))

        /** Resolution amount net of network fees. */
        @JsonProperty("resolution_amount")
        @ExcludeMissing
        fun resolutionAmount(resolutionAmount: JsonField<Long>) = apply {
            this.resolutionAmount = resolutionAmount
        }

        /** Date that the dispute was resolved. */
        fun resolutionDate(resolutionDate: OffsetDateTime) =
            resolutionDate(JsonField.of(resolutionDate))

        /** Date that the dispute was resolved. */
        @JsonProperty("resolution_date")
        @ExcludeMissing
        fun resolutionDate(resolutionDate: JsonField<OffsetDateTime>) = apply {
            this.resolutionDate = resolutionDate
        }

        /** Note by Dispute team on the case resolution. */
        fun resolutionNote(resolutionNote: String) = resolutionNote(JsonField.of(resolutionNote))

        /** Note by Dispute team on the case resolution. */
        @JsonProperty("resolution_note")
        @ExcludeMissing
        fun resolutionNote(resolutionNote: JsonField<String>) = apply {
            this.resolutionNote = resolutionNote
        }

        /**
         * Reason for the dispute resolution:
         *
         * - `CASE_LOST`: This case was lost at final arbitration.
         * - `NETWORK_REJECTED`: Network rejected.
         * - `NO_DISPUTE_RIGHTS_3DS`: No dispute rights, 3DS.
         * - `NO_DISPUTE_RIGHTS_BELOW_THRESHOLD`: No dispute rights, below threshold.
         * - `NO_DISPUTE_RIGHTS_CONTACTLESS`: No dispute rights, contactless.
         * - `NO_DISPUTE_RIGHTS_HYBRID`: No dispute rights, hybrid.
         * - `NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS`: No dispute rights, max chargebacks.
         * - `NO_DISPUTE_RIGHTS_OTHER`: No dispute rights, other.
         * - `PAST_FILING_DATE`: Past filing date.
         * - `PREARBITRATION_REJECTED`: Prearbitration rejected.
         * - `PROCESSOR_REJECTED_OTHER`: Processor rejected, other.
         * - `REFUNDED`: Refunded.
         * - `REFUNDED_AFTER_CHARGEBACK`: Refunded after chargeback.
         * - `WITHDRAWN`: Withdrawn.
         * - `WON_ARBITRATION`: Won arbitration.
         * - `WON_FIRST_CHARGEBACK`: Won first chargeback.
         * - `WON_PREARBITRATION`: Won prearbitration.
         */
        fun resolutionReason(resolutionReason: ResolutionReason) =
            resolutionReason(JsonField.of(resolutionReason))

        /**
         * Reason for the dispute resolution:
         *
         * - `CASE_LOST`: This case was lost at final arbitration.
         * - `NETWORK_REJECTED`: Network rejected.
         * - `NO_DISPUTE_RIGHTS_3DS`: No dispute rights, 3DS.
         * - `NO_DISPUTE_RIGHTS_BELOW_THRESHOLD`: No dispute rights, below threshold.
         * - `NO_DISPUTE_RIGHTS_CONTACTLESS`: No dispute rights, contactless.
         * - `NO_DISPUTE_RIGHTS_HYBRID`: No dispute rights, hybrid.
         * - `NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS`: No dispute rights, max chargebacks.
         * - `NO_DISPUTE_RIGHTS_OTHER`: No dispute rights, other.
         * - `PAST_FILING_DATE`: Past filing date.
         * - `PREARBITRATION_REJECTED`: Prearbitration rejected.
         * - `PROCESSOR_REJECTED_OTHER`: Processor rejected, other.
         * - `REFUNDED`: Refunded.
         * - `REFUNDED_AFTER_CHARGEBACK`: Refunded after chargeback.
         * - `WITHDRAWN`: Withdrawn.
         * - `WON_ARBITRATION`: Won arbitration.
         * - `WON_FIRST_CHARGEBACK`: Won first chargeback.
         * - `WON_PREARBITRATION`: Won prearbitration.
         */
        @JsonProperty("resolution_reason")
        @ExcludeMissing
        fun resolutionReason(resolutionReason: JsonField<ResolutionReason>) = apply {
            this.resolutionReason = resolutionReason
        }

        /**
         * Status types:
         *
         * - `NEW` - New dispute case is opened.
         * - `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
         * - `SUBMITTED` - Dispute is submitted to the card network.
         * - `REPRESENTMENT` - Case has entered second presentment.
         * - `PREARBITRATION` - Case has entered prearbitration.
         * - `ARBITRATION` - Case has entered arbitration.
         * - `CASE_WON` - Case was won and credit will be issued.
         * - `CASE_CLOSED` - Case was lost or withdrawn.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         *
         * - `NEW` - New dispute case is opened.
         * - `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
         * - `SUBMITTED` - Dispute is submitted to the card network.
         * - `REPRESENTMENT` - Case has entered second presentment.
         * - `PREARBITRATION` - Case has entered prearbitration.
         * - `ARBITRATION` - Case has entered arbitration.
         * - `CASE_WON` - Case was won and credit will be issued.
         * - `CASE_CLOSED` - Case was lost or withdrawn.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * The transaction that is being disputed. A transaction can only be disputed once but may
         * have multiple dispute cases.
         */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /**
         * The transaction that is being disputed. A transaction can only be disputed once but may
         * have multiple dispute cases.
         */
        @JsonProperty("transaction_token")
        @ExcludeMissing
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
        }

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

        fun build(): Dispute =
            Dispute(
                amount,
                arbitrationDate,
                created,
                customerFiledDate,
                customerNote,
                networkClaimIds.map { it.toUnmodifiable() },
                primaryClaimId,
                networkFiledDate,
                networkReasonCode,
                prearbitrationDate,
                reason,
                representmentDate,
                resolutionAmount,
                resolutionDate,
                resolutionNote,
                resolutionReason,
                status,
                token,
                transactionToken,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ATM_CASH_MISDISPENSE = Reason(JsonField.of("ATM_CASH_MISDISPENSE"))

            @JvmField val CANCELLED = Reason(JsonField.of("CANCELLED"))

            @JvmField val DUPLICATED = Reason(JsonField.of("DUPLICATED"))

            @JvmField val FRAUD_CARD_NOT_PRESENT = Reason(JsonField.of("FRAUD_CARD_NOT_PRESENT"))

            @JvmField val FRAUD_CARD_PRESENT = Reason(JsonField.of("FRAUD_CARD_PRESENT"))

            @JvmField val FRAUD_OTHER = Reason(JsonField.of("FRAUD_OTHER"))

            @JvmField
            val GOODS_SERVICES_NOT_AS_DESCRIBED =
                Reason(JsonField.of("GOODS_SERVICES_NOT_AS_DESCRIBED"))

            @JvmField
            val GOODS_SERVICES_NOT_RECEIVED = Reason(JsonField.of("GOODS_SERVICES_NOT_RECEIVED"))

            @JvmField val INCORRECT_AMOUNT = Reason(JsonField.of("INCORRECT_AMOUNT"))

            @JvmField val MISSING_AUTH = Reason(JsonField.of("MISSING_AUTH"))

            @JvmField val OTHER = Reason(JsonField.of("OTHER"))

            @JvmField val PROCESSING_ERROR = Reason(JsonField.of("PROCESSING_ERROR"))

            @JvmField val REFUND_NOT_PROCESSED = Reason(JsonField.of("REFUND_NOT_PROCESSED"))

            @JvmField
            val RECURRING_TRANSACTION_NOT_CANCELLED =
                Reason(JsonField.of("RECURRING_TRANSACTION_NOT_CANCELLED"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            ATM_CASH_MISDISPENSE,
            CANCELLED,
            DUPLICATED,
            FRAUD_CARD_NOT_PRESENT,
            FRAUD_CARD_PRESENT,
            FRAUD_OTHER,
            GOODS_SERVICES_NOT_AS_DESCRIBED,
            GOODS_SERVICES_NOT_RECEIVED,
            INCORRECT_AMOUNT,
            MISSING_AUTH,
            OTHER,
            PROCESSING_ERROR,
            REFUND_NOT_PROCESSED,
            RECURRING_TRANSACTION_NOT_CANCELLED,
        }

        enum class Value {
            ATM_CASH_MISDISPENSE,
            CANCELLED,
            DUPLICATED,
            FRAUD_CARD_NOT_PRESENT,
            FRAUD_CARD_PRESENT,
            FRAUD_OTHER,
            GOODS_SERVICES_NOT_AS_DESCRIBED,
            GOODS_SERVICES_NOT_RECEIVED,
            INCORRECT_AMOUNT,
            MISSING_AUTH,
            OTHER,
            PROCESSING_ERROR,
            REFUND_NOT_PROCESSED,
            RECURRING_TRANSACTION_NOT_CANCELLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ATM_CASH_MISDISPENSE -> Value.ATM_CASH_MISDISPENSE
                CANCELLED -> Value.CANCELLED
                DUPLICATED -> Value.DUPLICATED
                FRAUD_CARD_NOT_PRESENT -> Value.FRAUD_CARD_NOT_PRESENT
                FRAUD_CARD_PRESENT -> Value.FRAUD_CARD_PRESENT
                FRAUD_OTHER -> Value.FRAUD_OTHER
                GOODS_SERVICES_NOT_AS_DESCRIBED -> Value.GOODS_SERVICES_NOT_AS_DESCRIBED
                GOODS_SERVICES_NOT_RECEIVED -> Value.GOODS_SERVICES_NOT_RECEIVED
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                MISSING_AUTH -> Value.MISSING_AUTH
                OTHER -> Value.OTHER
                PROCESSING_ERROR -> Value.PROCESSING_ERROR
                REFUND_NOT_PROCESSED -> Value.REFUND_NOT_PROCESSED
                RECURRING_TRANSACTION_NOT_CANCELLED -> Value.RECURRING_TRANSACTION_NOT_CANCELLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ATM_CASH_MISDISPENSE -> Known.ATM_CASH_MISDISPENSE
                CANCELLED -> Known.CANCELLED
                DUPLICATED -> Known.DUPLICATED
                FRAUD_CARD_NOT_PRESENT -> Known.FRAUD_CARD_NOT_PRESENT
                FRAUD_CARD_PRESENT -> Known.FRAUD_CARD_PRESENT
                FRAUD_OTHER -> Known.FRAUD_OTHER
                GOODS_SERVICES_NOT_AS_DESCRIBED -> Known.GOODS_SERVICES_NOT_AS_DESCRIBED
                GOODS_SERVICES_NOT_RECEIVED -> Known.GOODS_SERVICES_NOT_RECEIVED
                INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                MISSING_AUTH -> Known.MISSING_AUTH
                OTHER -> Known.OTHER
                PROCESSING_ERROR -> Known.PROCESSING_ERROR
                REFUND_NOT_PROCESSED -> Known.REFUND_NOT_PROCESSED
                RECURRING_TRANSACTION_NOT_CANCELLED -> Known.RECURRING_TRANSACTION_NOT_CANCELLED
                else -> throw LithicInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ResolutionReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResolutionReason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CASE_LOST = ResolutionReason(JsonField.of("CASE_LOST"))

            @JvmField val NETWORK_REJECTED = ResolutionReason(JsonField.of("NETWORK_REJECTED"))

            @JvmField
            val NO_DISPUTE_RIGHTS_3DS = ResolutionReason(JsonField.of("NO_DISPUTE_RIGHTS_3DS"))

            @JvmField
            val NO_DISPUTE_RIGHTS_BELOW_THRESHOLD =
                ResolutionReason(JsonField.of("NO_DISPUTE_RIGHTS_BELOW_THRESHOLD"))

            @JvmField
            val NO_DISPUTE_RIGHTS_CONTACTLESS =
                ResolutionReason(JsonField.of("NO_DISPUTE_RIGHTS_CONTACTLESS"))

            @JvmField
            val NO_DISPUTE_RIGHTS_HYBRID =
                ResolutionReason(JsonField.of("NO_DISPUTE_RIGHTS_HYBRID"))

            @JvmField
            val NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS =
                ResolutionReason(JsonField.of("NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS"))

            @JvmField
            val NO_DISPUTE_RIGHTS_OTHER = ResolutionReason(JsonField.of("NO_DISPUTE_RIGHTS_OTHER"))

            @JvmField val PAST_FILING_DATE = ResolutionReason(JsonField.of("PAST_FILING_DATE"))

            @JvmField
            val PREARBITRATION_REJECTED = ResolutionReason(JsonField.of("PREARBITRATION_REJECTED"))

            @JvmField
            val PROCESSOR_REJECTED_OTHER =
                ResolutionReason(JsonField.of("PROCESSOR_REJECTED_OTHER"))

            @JvmField val REFUNDED = ResolutionReason(JsonField.of("REFUNDED"))

            @JvmField
            val REFUNDED_AFTER_CHARGEBACK =
                ResolutionReason(JsonField.of("REFUNDED_AFTER_CHARGEBACK"))

            @JvmField val WITHDRAWN = ResolutionReason(JsonField.of("WITHDRAWN"))

            @JvmField val WON_ARBITRATION = ResolutionReason(JsonField.of("WON_ARBITRATION"))

            @JvmField
            val WON_FIRST_CHARGEBACK = ResolutionReason(JsonField.of("WON_FIRST_CHARGEBACK"))

            @JvmField val WON_PREARBITRATION = ResolutionReason(JsonField.of("WON_PREARBITRATION"))

            @JvmStatic fun of(value: String) = ResolutionReason(JsonField.of(value))
        }

        enum class Known {
            CASE_LOST,
            NETWORK_REJECTED,
            NO_DISPUTE_RIGHTS_3DS,
            NO_DISPUTE_RIGHTS_BELOW_THRESHOLD,
            NO_DISPUTE_RIGHTS_CONTACTLESS,
            NO_DISPUTE_RIGHTS_HYBRID,
            NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS,
            NO_DISPUTE_RIGHTS_OTHER,
            PAST_FILING_DATE,
            PREARBITRATION_REJECTED,
            PROCESSOR_REJECTED_OTHER,
            REFUNDED,
            REFUNDED_AFTER_CHARGEBACK,
            WITHDRAWN,
            WON_ARBITRATION,
            WON_FIRST_CHARGEBACK,
            WON_PREARBITRATION,
        }

        enum class Value {
            CASE_LOST,
            NETWORK_REJECTED,
            NO_DISPUTE_RIGHTS_3DS,
            NO_DISPUTE_RIGHTS_BELOW_THRESHOLD,
            NO_DISPUTE_RIGHTS_CONTACTLESS,
            NO_DISPUTE_RIGHTS_HYBRID,
            NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS,
            NO_DISPUTE_RIGHTS_OTHER,
            PAST_FILING_DATE,
            PREARBITRATION_REJECTED,
            PROCESSOR_REJECTED_OTHER,
            REFUNDED,
            REFUNDED_AFTER_CHARGEBACK,
            WITHDRAWN,
            WON_ARBITRATION,
            WON_FIRST_CHARGEBACK,
            WON_PREARBITRATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CASE_LOST -> Value.CASE_LOST
                NETWORK_REJECTED -> Value.NETWORK_REJECTED
                NO_DISPUTE_RIGHTS_3DS -> Value.NO_DISPUTE_RIGHTS_3DS
                NO_DISPUTE_RIGHTS_BELOW_THRESHOLD -> Value.NO_DISPUTE_RIGHTS_BELOW_THRESHOLD
                NO_DISPUTE_RIGHTS_CONTACTLESS -> Value.NO_DISPUTE_RIGHTS_CONTACTLESS
                NO_DISPUTE_RIGHTS_HYBRID -> Value.NO_DISPUTE_RIGHTS_HYBRID
                NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS -> Value.NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS
                NO_DISPUTE_RIGHTS_OTHER -> Value.NO_DISPUTE_RIGHTS_OTHER
                PAST_FILING_DATE -> Value.PAST_FILING_DATE
                PREARBITRATION_REJECTED -> Value.PREARBITRATION_REJECTED
                PROCESSOR_REJECTED_OTHER -> Value.PROCESSOR_REJECTED_OTHER
                REFUNDED -> Value.REFUNDED
                REFUNDED_AFTER_CHARGEBACK -> Value.REFUNDED_AFTER_CHARGEBACK
                WITHDRAWN -> Value.WITHDRAWN
                WON_ARBITRATION -> Value.WON_ARBITRATION
                WON_FIRST_CHARGEBACK -> Value.WON_FIRST_CHARGEBACK
                WON_PREARBITRATION -> Value.WON_PREARBITRATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CASE_LOST -> Known.CASE_LOST
                NETWORK_REJECTED -> Known.NETWORK_REJECTED
                NO_DISPUTE_RIGHTS_3DS -> Known.NO_DISPUTE_RIGHTS_3DS
                NO_DISPUTE_RIGHTS_BELOW_THRESHOLD -> Known.NO_DISPUTE_RIGHTS_BELOW_THRESHOLD
                NO_DISPUTE_RIGHTS_CONTACTLESS -> Known.NO_DISPUTE_RIGHTS_CONTACTLESS
                NO_DISPUTE_RIGHTS_HYBRID -> Known.NO_DISPUTE_RIGHTS_HYBRID
                NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS -> Known.NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS
                NO_DISPUTE_RIGHTS_OTHER -> Known.NO_DISPUTE_RIGHTS_OTHER
                PAST_FILING_DATE -> Known.PAST_FILING_DATE
                PREARBITRATION_REJECTED -> Known.PREARBITRATION_REJECTED
                PROCESSOR_REJECTED_OTHER -> Known.PROCESSOR_REJECTED_OTHER
                REFUNDED -> Known.REFUNDED
                REFUNDED_AFTER_CHARGEBACK -> Known.REFUNDED_AFTER_CHARGEBACK
                WITHDRAWN -> Known.WITHDRAWN
                WON_ARBITRATION -> Known.WON_ARBITRATION
                WON_FIRST_CHARGEBACK -> Known.WON_FIRST_CHARGEBACK
                WON_PREARBITRATION -> Known.WON_PREARBITRATION
                else -> throw LithicInvalidDataException("Unknown ResolutionReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val NEW = Status(JsonField.of("NEW"))

            @JvmField val PENDING_CUSTOMER = Status(JsonField.of("PENDING_CUSTOMER"))

            @JvmField val SUBMITTED = Status(JsonField.of("SUBMITTED"))

            @JvmField val REPRESENTMENT = Status(JsonField.of("REPRESENTMENT"))

            @JvmField val PREARBITRATION = Status(JsonField.of("PREARBITRATION"))

            @JvmField val ARBITRATION = Status(JsonField.of("ARBITRATION"))

            @JvmField val CASE_WON = Status(JsonField.of("CASE_WON"))

            @JvmField val CASE_CLOSED = Status(JsonField.of("CASE_CLOSED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            NEW,
            PENDING_CUSTOMER,
            SUBMITTED,
            REPRESENTMENT,
            PREARBITRATION,
            ARBITRATION,
            CASE_WON,
            CASE_CLOSED,
        }

        enum class Value {
            NEW,
            PENDING_CUSTOMER,
            SUBMITTED,
            REPRESENTMENT,
            PREARBITRATION,
            ARBITRATION,
            CASE_WON,
            CASE_CLOSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NEW -> Value.NEW
                PENDING_CUSTOMER -> Value.PENDING_CUSTOMER
                SUBMITTED -> Value.SUBMITTED
                REPRESENTMENT -> Value.REPRESENTMENT
                PREARBITRATION -> Value.PREARBITRATION
                ARBITRATION -> Value.ARBITRATION
                CASE_WON -> Value.CASE_WON
                CASE_CLOSED -> Value.CASE_CLOSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NEW -> Known.NEW
                PENDING_CUSTOMER -> Known.PENDING_CUSTOMER
                SUBMITTED -> Known.SUBMITTED
                REPRESENTMENT -> Known.REPRESENTMENT
                PREARBITRATION -> Known.PREARBITRATION
                ARBITRATION -> Known.ARBITRATION
                CASE_WON -> Known.CASE_WON
                CASE_CLOSED -> Known.CASE_CLOSED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
