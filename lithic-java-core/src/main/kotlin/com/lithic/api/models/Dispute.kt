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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Dispute. */
@NoAutoDetect
class Dispute
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("arbitration_date")
    @ExcludeMissing
    private val arbitrationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_filed_date")
    @ExcludeMissing
    private val customerFiledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_note")
    @ExcludeMissing
    private val customerNote: JsonField<String> = JsonMissing.of(),
    @JsonProperty("network_claim_ids")
    @ExcludeMissing
    private val networkClaimIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("network_filed_date")
    @ExcludeMissing
    private val networkFiledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("network_reason_code")
    @ExcludeMissing
    private val networkReasonCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("prearbitration_date")
    @ExcludeMissing
    private val prearbitrationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("primary_claim_id")
    @ExcludeMissing
    private val primaryClaimId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<Reason> = JsonMissing.of(),
    @JsonProperty("representment_date")
    @ExcludeMissing
    private val representmentDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("resolution_amount")
    @ExcludeMissing
    private val resolutionAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("resolution_date")
    @ExcludeMissing
    private val resolutionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("resolution_note")
    @ExcludeMissing
    private val resolutionNote: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resolution_reason")
    @ExcludeMissing
    private val resolutionReason: JsonField<ResolutionReason> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_token")
    @ExcludeMissing
    private val transactionToken: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Amount under dispute. May be different from the original transaction amount. */
    fun amount(): Long = amount.getRequired("amount")

    /** Date dispute entered arbitration. */
    fun arbitrationDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(arbitrationDate.getNullable("arbitration_date"))

    /** Timestamp of when first Dispute was reported. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Date that the dispute was filed by the customer making the dispute. */
    fun customerFiledDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(customerFiledDate.getNullable("customer_filed_date"))

    /** End customer description of the reason for the dispute. */
    fun customerNote(): Optional<String> =
        Optional.ofNullable(customerNote.getNullable("customer_note"))

    /** Unique identifiers for the dispute from the network. */
    fun networkClaimIds(): Optional<List<String>> =
        Optional.ofNullable(networkClaimIds.getNullable("network_claim_ids"))

    /** Date that the dispute was submitted to the network. */
    fun networkFiledDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(networkFiledDate.getNullable("network_filed_date"))

    /** Network reason code used to file the dispute. */
    fun networkReasonCode(): Optional<String> =
        Optional.ofNullable(networkReasonCode.getNullable("network_reason_code"))

    /** Date dispute entered pre-arbitration. */
    fun prearbitrationDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(prearbitrationDate.getNullable("prearbitration_date"))

    /**
     * Unique identifier for the dispute from the network. If there are multiple, this will be the
     * first claim id set by the network
     */
    fun primaryClaimId(): Optional<String> =
        Optional.ofNullable(primaryClaimId.getNullable("primary_claim_id"))

    /**
     * Dispute reason:
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
    fun representmentDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(representmentDate.getNullable("representment_date"))

    /** Resolution amount net of network fees. */
    fun resolutionAmount(): Optional<Long> =
        Optional.ofNullable(resolutionAmount.getNullable("resolution_amount"))

    /** Date that the dispute was resolved. */
    fun resolutionDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(resolutionDate.getNullable("resolution_date"))

    /** Note by Dispute team on the case resolution. */
    fun resolutionNote(): Optional<String> =
        Optional.ofNullable(resolutionNote.getNullable("resolution_note"))

    /**
     * Reason for the dispute resolution:
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
    fun resolutionReason(): Optional<ResolutionReason> =
        Optional.ofNullable(resolutionReason.getNullable("resolution_reason"))

    /**
     * Status types:
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

    /**
     * The transaction that is being disputed. A transaction can only be disputed once but may have
     * multiple dispute cases.
     */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Amount under dispute. May be different from the original transaction amount. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** Date dispute entered arbitration. */
    @JsonProperty("arbitration_date")
    @ExcludeMissing
    fun _arbitrationDate(): JsonField<OffsetDateTime> = arbitrationDate

    /** Timestamp of when first Dispute was reported. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date that the dispute was filed by the customer making the dispute. */
    @JsonProperty("customer_filed_date")
    @ExcludeMissing
    fun _customerFiledDate(): JsonField<OffsetDateTime> = customerFiledDate

    /** End customer description of the reason for the dispute. */
    @JsonProperty("customer_note")
    @ExcludeMissing
    fun _customerNote(): JsonField<String> = customerNote

    /** Unique identifiers for the dispute from the network. */
    @JsonProperty("network_claim_ids")
    @ExcludeMissing
    fun _networkClaimIds(): JsonField<List<String>> = networkClaimIds

    /** Date that the dispute was submitted to the network. */
    @JsonProperty("network_filed_date")
    @ExcludeMissing
    fun _networkFiledDate(): JsonField<OffsetDateTime> = networkFiledDate

    /** Network reason code used to file the dispute. */
    @JsonProperty("network_reason_code")
    @ExcludeMissing
    fun _networkReasonCode(): JsonField<String> = networkReasonCode

    /** Date dispute entered pre-arbitration. */
    @JsonProperty("prearbitration_date")
    @ExcludeMissing
    fun _prearbitrationDate(): JsonField<OffsetDateTime> = prearbitrationDate

    /**
     * Unique identifier for the dispute from the network. If there are multiple, this will be the
     * first claim id set by the network
     */
    @JsonProperty("primary_claim_id")
    @ExcludeMissing
    fun _primaryClaimId(): JsonField<String> = primaryClaimId

    /**
     * Dispute reason:
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
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

    /** Date the representment was received. */
    @JsonProperty("representment_date")
    @ExcludeMissing
    fun _representmentDate(): JsonField<OffsetDateTime> = representmentDate

    /** Resolution amount net of network fees. */
    @JsonProperty("resolution_amount")
    @ExcludeMissing
    fun _resolutionAmount(): JsonField<Long> = resolutionAmount

    /** Date that the dispute was resolved. */
    @JsonProperty("resolution_date")
    @ExcludeMissing
    fun _resolutionDate(): JsonField<OffsetDateTime> = resolutionDate

    /** Note by Dispute team on the case resolution. */
    @JsonProperty("resolution_note")
    @ExcludeMissing
    fun _resolutionNote(): JsonField<String> = resolutionNote

    /**
     * Reason for the dispute resolution:
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
    fun _resolutionReason(): JsonField<ResolutionReason> = resolutionReason

    /**
     * Status types:
     * - `NEW` - New dispute case is opened.
     * - `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
     * - `SUBMITTED` - Dispute is submitted to the card network.
     * - `REPRESENTMENT` - Case has entered second presentment.
     * - `PREARBITRATION` - Case has entered prearbitration.
     * - `ARBITRATION` - Case has entered arbitration.
     * - `CASE_WON` - Case was won and credit will be issued.
     * - `CASE_CLOSED` - Case was lost or withdrawn.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * The transaction that is being disputed. A transaction can only be disputed once but may have
     * multiple dispute cases.
     */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Dispute = apply {
        if (validated) {
            return@apply
        }

        token()
        amount()
        arbitrationDate()
        created()
        customerFiledDate()
        customerNote()
        networkClaimIds()
        networkFiledDate()
        networkReasonCode()
        prearbitrationDate()
        primaryClaimId()
        reason()
        representmentDate()
        resolutionAmount()
        resolutionDate()
        resolutionNote()
        resolutionReason()
        status()
        transactionToken()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Dispute].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .amount()
         * .arbitrationDate()
         * .created()
         * .customerFiledDate()
         * .customerNote()
         * .networkClaimIds()
         * .networkFiledDate()
         * .networkReasonCode()
         * .prearbitrationDate()
         * .primaryClaimId()
         * .reason()
         * .representmentDate()
         * .resolutionAmount()
         * .resolutionDate()
         * .resolutionNote()
         * .resolutionReason()
         * .status()
         * .transactionToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Dispute]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var arbitrationDate: JsonField<OffsetDateTime>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var customerFiledDate: JsonField<OffsetDateTime>? = null
        private var customerNote: JsonField<String>? = null
        private var networkClaimIds: JsonField<MutableList<String>>? = null
        private var networkFiledDate: JsonField<OffsetDateTime>? = null
        private var networkReasonCode: JsonField<String>? = null
        private var prearbitrationDate: JsonField<OffsetDateTime>? = null
        private var primaryClaimId: JsonField<String>? = null
        private var reason: JsonField<Reason>? = null
        private var representmentDate: JsonField<OffsetDateTime>? = null
        private var resolutionAmount: JsonField<Long>? = null
        private var resolutionDate: JsonField<OffsetDateTime>? = null
        private var resolutionNote: JsonField<String>? = null
        private var resolutionReason: JsonField<ResolutionReason>? = null
        private var status: JsonField<Status>? = null
        private var transactionToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dispute: Dispute) = apply {
            token = dispute.token
            amount = dispute.amount
            arbitrationDate = dispute.arbitrationDate
            created = dispute.created
            customerFiledDate = dispute.customerFiledDate
            customerNote = dispute.customerNote
            networkClaimIds = dispute.networkClaimIds.map { it.toMutableList() }
            networkFiledDate = dispute.networkFiledDate
            networkReasonCode = dispute.networkReasonCode
            prearbitrationDate = dispute.prearbitrationDate
            primaryClaimId = dispute.primaryClaimId
            reason = dispute.reason
            representmentDate = dispute.representmentDate
            resolutionAmount = dispute.resolutionAmount
            resolutionDate = dispute.resolutionDate
            resolutionNote = dispute.resolutionNote
            resolutionReason = dispute.resolutionReason
            status = dispute.status
            transactionToken = dispute.transactionToken
            additionalProperties = dispute.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Amount under dispute. May be different from the original transaction amount. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Amount under dispute. May be different from the original transaction amount. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** Date dispute entered arbitration. */
        fun arbitrationDate(arbitrationDate: OffsetDateTime?) =
            arbitrationDate(JsonField.ofNullable(arbitrationDate))

        /** Date dispute entered arbitration. */
        fun arbitrationDate(arbitrationDate: Optional<OffsetDateTime>) =
            arbitrationDate(arbitrationDate.orElse(null))

        /** Date dispute entered arbitration. */
        fun arbitrationDate(arbitrationDate: JsonField<OffsetDateTime>) = apply {
            this.arbitrationDate = arbitrationDate
        }

        /** Timestamp of when first Dispute was reported. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when first Dispute was reported. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date that the dispute was filed by the customer making the dispute. */
        fun customerFiledDate(customerFiledDate: OffsetDateTime?) =
            customerFiledDate(JsonField.ofNullable(customerFiledDate))

        /** Date that the dispute was filed by the customer making the dispute. */
        fun customerFiledDate(customerFiledDate: Optional<OffsetDateTime>) =
            customerFiledDate(customerFiledDate.orElse(null))

        /** Date that the dispute was filed by the customer making the dispute. */
        fun customerFiledDate(customerFiledDate: JsonField<OffsetDateTime>) = apply {
            this.customerFiledDate = customerFiledDate
        }

        /** End customer description of the reason for the dispute. */
        fun customerNote(customerNote: String?) = customerNote(JsonField.ofNullable(customerNote))

        /** End customer description of the reason for the dispute. */
        fun customerNote(customerNote: Optional<String>) = customerNote(customerNote.orElse(null))

        /** End customer description of the reason for the dispute. */
        fun customerNote(customerNote: JsonField<String>) = apply {
            this.customerNote = customerNote
        }

        /** Unique identifiers for the dispute from the network. */
        fun networkClaimIds(networkClaimIds: List<String>?) =
            networkClaimIds(JsonField.ofNullable(networkClaimIds))

        /** Unique identifiers for the dispute from the network. */
        fun networkClaimIds(networkClaimIds: Optional<List<String>>) =
            networkClaimIds(networkClaimIds.orElse(null))

        /** Unique identifiers for the dispute from the network. */
        fun networkClaimIds(networkClaimIds: JsonField<List<String>>) = apply {
            this.networkClaimIds = networkClaimIds.map { it.toMutableList() }
        }

        /** Unique identifiers for the dispute from the network. */
        fun addNetworkClaimId(networkClaimId: String) = apply {
            networkClaimIds =
                (networkClaimIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("networkClaimIds", it).add(networkClaimId)
                }
        }

        /** Date that the dispute was submitted to the network. */
        fun networkFiledDate(networkFiledDate: OffsetDateTime?) =
            networkFiledDate(JsonField.ofNullable(networkFiledDate))

        /** Date that the dispute was submitted to the network. */
        fun networkFiledDate(networkFiledDate: Optional<OffsetDateTime>) =
            networkFiledDate(networkFiledDate.orElse(null))

        /** Date that the dispute was submitted to the network. */
        fun networkFiledDate(networkFiledDate: JsonField<OffsetDateTime>) = apply {
            this.networkFiledDate = networkFiledDate
        }

        /** Network reason code used to file the dispute. */
        fun networkReasonCode(networkReasonCode: String?) =
            networkReasonCode(JsonField.ofNullable(networkReasonCode))

        /** Network reason code used to file the dispute. */
        fun networkReasonCode(networkReasonCode: Optional<String>) =
            networkReasonCode(networkReasonCode.orElse(null))

        /** Network reason code used to file the dispute. */
        fun networkReasonCode(networkReasonCode: JsonField<String>) = apply {
            this.networkReasonCode = networkReasonCode
        }

        /** Date dispute entered pre-arbitration. */
        fun prearbitrationDate(prearbitrationDate: OffsetDateTime?) =
            prearbitrationDate(JsonField.ofNullable(prearbitrationDate))

        /** Date dispute entered pre-arbitration. */
        fun prearbitrationDate(prearbitrationDate: Optional<OffsetDateTime>) =
            prearbitrationDate(prearbitrationDate.orElse(null))

        /** Date dispute entered pre-arbitration. */
        fun prearbitrationDate(prearbitrationDate: JsonField<OffsetDateTime>) = apply {
            this.prearbitrationDate = prearbitrationDate
        }

        /**
         * Unique identifier for the dispute from the network. If there are multiple, this will be
         * the first claim id set by the network
         */
        fun primaryClaimId(primaryClaimId: String?) =
            primaryClaimId(JsonField.ofNullable(primaryClaimId))

        /**
         * Unique identifier for the dispute from the network. If there are multiple, this will be
         * the first claim id set by the network
         */
        fun primaryClaimId(primaryClaimId: Optional<String>) =
            primaryClaimId(primaryClaimId.orElse(null))

        /**
         * Unique identifier for the dispute from the network. If there are multiple, this will be
         * the first claim id set by the network
         */
        fun primaryClaimId(primaryClaimId: JsonField<String>) = apply {
            this.primaryClaimId = primaryClaimId
        }

        /**
         * Dispute reason:
         * - `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
         * - `CANCELLED`: Transaction was cancelled by the customer.
         * - `DUPLICATED`: The transaction was a duplicate.
         * - `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
         * - `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
         * - `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant
         *   activity.
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
         * - `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
         * - `CANCELLED`: Transaction was cancelled by the customer.
         * - `DUPLICATED`: The transaction was a duplicate.
         * - `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
         * - `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
         * - `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant
         *   activity.
         * - `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
         * - `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
         * - `INCORRECT_AMOUNT`: The transaction amount was incorrect.
         * - `MISSING_AUTH`: The transaction was missing authorization.
         * - `OTHER`: Other reason.
         * - `PROCESSING_ERROR`: Processing error.
         * - `REFUND_NOT_PROCESSED`: The refund was not processed.
         * - `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
         */
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        /** Date the representment was received. */
        fun representmentDate(representmentDate: OffsetDateTime?) =
            representmentDate(JsonField.ofNullable(representmentDate))

        /** Date the representment was received. */
        fun representmentDate(representmentDate: Optional<OffsetDateTime>) =
            representmentDate(representmentDate.orElse(null))

        /** Date the representment was received. */
        fun representmentDate(representmentDate: JsonField<OffsetDateTime>) = apply {
            this.representmentDate = representmentDate
        }

        /** Resolution amount net of network fees. */
        fun resolutionAmount(resolutionAmount: Long?) =
            resolutionAmount(JsonField.ofNullable(resolutionAmount))

        /** Resolution amount net of network fees. */
        fun resolutionAmount(resolutionAmount: Long) = resolutionAmount(resolutionAmount as Long?)

        /** Resolution amount net of network fees. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun resolutionAmount(resolutionAmount: Optional<Long>) =
            resolutionAmount(resolutionAmount.orElse(null) as Long?)

        /** Resolution amount net of network fees. */
        fun resolutionAmount(resolutionAmount: JsonField<Long>) = apply {
            this.resolutionAmount = resolutionAmount
        }

        /** Date that the dispute was resolved. */
        fun resolutionDate(resolutionDate: OffsetDateTime?) =
            resolutionDate(JsonField.ofNullable(resolutionDate))

        /** Date that the dispute was resolved. */
        fun resolutionDate(resolutionDate: Optional<OffsetDateTime>) =
            resolutionDate(resolutionDate.orElse(null))

        /** Date that the dispute was resolved. */
        fun resolutionDate(resolutionDate: JsonField<OffsetDateTime>) = apply {
            this.resolutionDate = resolutionDate
        }

        /** Note by Dispute team on the case resolution. */
        fun resolutionNote(resolutionNote: String?) =
            resolutionNote(JsonField.ofNullable(resolutionNote))

        /** Note by Dispute team on the case resolution. */
        fun resolutionNote(resolutionNote: Optional<String>) =
            resolutionNote(resolutionNote.orElse(null))

        /** Note by Dispute team on the case resolution. */
        fun resolutionNote(resolutionNote: JsonField<String>) = apply {
            this.resolutionNote = resolutionNote
        }

        /**
         * Reason for the dispute resolution:
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
        fun resolutionReason(resolutionReason: ResolutionReason?) =
            resolutionReason(JsonField.ofNullable(resolutionReason))

        /**
         * Reason for the dispute resolution:
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
        fun resolutionReason(resolutionReason: Optional<ResolutionReason>) =
            resolutionReason(resolutionReason.orElse(null))

        /**
         * Reason for the dispute resolution:
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
        fun resolutionReason(resolutionReason: JsonField<ResolutionReason>) = apply {
            this.resolutionReason = resolutionReason
        }

        /**
         * Status types:
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
         * - `NEW` - New dispute case is opened.
         * - `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
         * - `SUBMITTED` - Dispute is submitted to the card network.
         * - `REPRESENTMENT` - Case has entered second presentment.
         * - `PREARBITRATION` - Case has entered prearbitration.
         * - `ARBITRATION` - Case has entered arbitration.
         * - `CASE_WON` - Case was won and credit will be issued.
         * - `CASE_CLOSED` - Case was lost or withdrawn.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
        }

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

        fun build(): Dispute =
            Dispute(
                checkRequired("token", token),
                checkRequired("amount", amount),
                checkRequired("arbitrationDate", arbitrationDate),
                checkRequired("created", created),
                checkRequired("customerFiledDate", customerFiledDate),
                checkRequired("customerNote", customerNote),
                checkRequired("networkClaimIds", networkClaimIds).map { it.toImmutable() },
                checkRequired("networkFiledDate", networkFiledDate),
                checkRequired("networkReasonCode", networkReasonCode),
                checkRequired("prearbitrationDate", prearbitrationDate),
                checkRequired("primaryClaimId", primaryClaimId),
                checkRequired("reason", reason),
                checkRequired("representmentDate", representmentDate),
                checkRequired("resolutionAmount", resolutionAmount),
                checkRequired("resolutionDate", resolutionDate),
                checkRequired("resolutionNote", resolutionNote),
                checkRequired("resolutionReason", resolutionReason),
                checkRequired("status", status),
                checkRequired("transactionToken", transactionToken),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Dispute reason:
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
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ATM_CASH_MISDISPENSE = of("ATM_CASH_MISDISPENSE")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmField val DUPLICATED = of("DUPLICATED")

            @JvmField val FRAUD_CARD_NOT_PRESENT = of("FRAUD_CARD_NOT_PRESENT")

            @JvmField val FRAUD_CARD_PRESENT = of("FRAUD_CARD_PRESENT")

            @JvmField val FRAUD_OTHER = of("FRAUD_OTHER")

            @JvmField val GOODS_SERVICES_NOT_AS_DESCRIBED = of("GOODS_SERVICES_NOT_AS_DESCRIBED")

            @JvmField val GOODS_SERVICES_NOT_RECEIVED = of("GOODS_SERVICES_NOT_RECEIVED")

            @JvmField val INCORRECT_AMOUNT = of("INCORRECT_AMOUNT")

            @JvmField val MISSING_AUTH = of("MISSING_AUTH")

            @JvmField val OTHER = of("OTHER")

            @JvmField val PROCESSING_ERROR = of("PROCESSING_ERROR")

            @JvmField
            val RECURRING_TRANSACTION_NOT_CANCELLED = of("RECURRING_TRANSACTION_NOT_CANCELLED")

            @JvmField val REFUND_NOT_PROCESSED = of("REFUND_NOT_PROCESSED")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
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
            RECURRING_TRANSACTION_NOT_CANCELLED,
            REFUND_NOT_PROCESSED,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            RECURRING_TRANSACTION_NOT_CANCELLED,
            REFUND_NOT_PROCESSED,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
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
                RECURRING_TRANSACTION_NOT_CANCELLED -> Value.RECURRING_TRANSACTION_NOT_CANCELLED
                REFUND_NOT_PROCESSED -> Value.REFUND_NOT_PROCESSED
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
                RECURRING_TRANSACTION_NOT_CANCELLED -> Known.RECURRING_TRANSACTION_NOT_CANCELLED
                REFUND_NOT_PROCESSED -> Known.REFUND_NOT_PROCESSED
                else -> throw LithicInvalidDataException("Unknown Reason: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Reason for the dispute resolution:
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
    class ResolutionReason @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CASE_LOST = of("CASE_LOST")

            @JvmField val NETWORK_REJECTED = of("NETWORK_REJECTED")

            @JvmField val NO_DISPUTE_RIGHTS_3DS = of("NO_DISPUTE_RIGHTS_3DS")

            @JvmField
            val NO_DISPUTE_RIGHTS_BELOW_THRESHOLD = of("NO_DISPUTE_RIGHTS_BELOW_THRESHOLD")

            @JvmField val NO_DISPUTE_RIGHTS_CONTACTLESS = of("NO_DISPUTE_RIGHTS_CONTACTLESS")

            @JvmField val NO_DISPUTE_RIGHTS_HYBRID = of("NO_DISPUTE_RIGHTS_HYBRID")

            @JvmField
            val NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS = of("NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS")

            @JvmField val NO_DISPUTE_RIGHTS_OTHER = of("NO_DISPUTE_RIGHTS_OTHER")

            @JvmField val PAST_FILING_DATE = of("PAST_FILING_DATE")

            @JvmField val PREARBITRATION_REJECTED = of("PREARBITRATION_REJECTED")

            @JvmField val PROCESSOR_REJECTED_OTHER = of("PROCESSOR_REJECTED_OTHER")

            @JvmField val REFUNDED = of("REFUNDED")

            @JvmField val REFUNDED_AFTER_CHARGEBACK = of("REFUNDED_AFTER_CHARGEBACK")

            @JvmField val WITHDRAWN = of("WITHDRAWN")

            @JvmField val WON_ARBITRATION = of("WON_ARBITRATION")

            @JvmField val WON_FIRST_CHARGEBACK = of("WON_FIRST_CHARGEBACK")

            @JvmField val WON_PREARBITRATION = of("WON_PREARBITRATION")

            @JvmStatic fun of(value: String) = ResolutionReason(JsonField.of(value))
        }

        /** An enum containing [ResolutionReason]'s known values. */
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

        /**
         * An enum containing [ResolutionReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResolutionReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [ResolutionReason] was instantiated with an unknown
             * value.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResolutionReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Status types:
     * - `NEW` - New dispute case is opened.
     * - `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
     * - `SUBMITTED` - Dispute is submitted to the card network.
     * - `REPRESENTMENT` - Case has entered second presentment.
     * - `PREARBITRATION` - Case has entered prearbitration.
     * - `ARBITRATION` - Case has entered arbitration.
     * - `CASE_WON` - Case was won and credit will be issued.
     * - `CASE_CLOSED` - Case was lost or withdrawn.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ARBITRATION = of("ARBITRATION")

            @JvmField val CASE_CLOSED = of("CASE_CLOSED")

            @JvmField val CASE_WON = of("CASE_WON")

            @JvmField val NEW = of("NEW")

            @JvmField val PENDING_CUSTOMER = of("PENDING_CUSTOMER")

            @JvmField val PREARBITRATION = of("PREARBITRATION")

            @JvmField val REPRESENTMENT = of("REPRESENTMENT")

            @JvmField val SUBMITTED = of("SUBMITTED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ARBITRATION,
            CASE_CLOSED,
            CASE_WON,
            NEW,
            PENDING_CUSTOMER,
            PREARBITRATION,
            REPRESENTMENT,
            SUBMITTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ARBITRATION,
            CASE_CLOSED,
            CASE_WON,
            NEW,
            PENDING_CUSTOMER,
            PREARBITRATION,
            REPRESENTMENT,
            SUBMITTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ARBITRATION -> Value.ARBITRATION
                CASE_CLOSED -> Value.CASE_CLOSED
                CASE_WON -> Value.CASE_WON
                NEW -> Value.NEW
                PENDING_CUSTOMER -> Value.PENDING_CUSTOMER
                PREARBITRATION -> Value.PREARBITRATION
                REPRESENTMENT -> Value.REPRESENTMENT
                SUBMITTED -> Value.SUBMITTED
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
                ARBITRATION -> Known.ARBITRATION
                CASE_CLOSED -> Known.CASE_CLOSED
                CASE_WON -> Known.CASE_WON
                NEW -> Known.NEW
                PENDING_CUSTOMER -> Known.PENDING_CUSTOMER
                PREARBITRATION -> Known.PREARBITRATION
                REPRESENTMENT -> Known.REPRESENTMENT
                SUBMITTED -> Known.SUBMITTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Dispute && token == other.token && amount == other.amount && arbitrationDate == other.arbitrationDate && created == other.created && customerFiledDate == other.customerFiledDate && customerNote == other.customerNote && networkClaimIds == other.networkClaimIds && networkFiledDate == other.networkFiledDate && networkReasonCode == other.networkReasonCode && prearbitrationDate == other.prearbitrationDate && primaryClaimId == other.primaryClaimId && reason == other.reason && representmentDate == other.representmentDate && resolutionAmount == other.resolutionAmount && resolutionDate == other.resolutionDate && resolutionNote == other.resolutionNote && resolutionReason == other.resolutionReason && status == other.status && transactionToken == other.transactionToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, amount, arbitrationDate, created, customerFiledDate, customerNote, networkClaimIds, networkFiledDate, networkReasonCode, prearbitrationDate, primaryClaimId, reason, representmentDate, resolutionAmount, resolutionDate, resolutionNote, resolutionReason, status, transactionToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Dispute{token=$token, amount=$amount, arbitrationDate=$arbitrationDate, created=$created, customerFiledDate=$customerFiledDate, customerNote=$customerNote, networkClaimIds=$networkClaimIds, networkFiledDate=$networkFiledDate, networkReasonCode=$networkReasonCode, prearbitrationDate=$prearbitrationDate, primaryClaimId=$primaryClaimId, reason=$reason, representmentDate=$representmentDate, resolutionAmount=$resolutionAmount, resolutionDate=$resolutionDate, resolutionNote=$resolutionNote, resolutionReason=$resolutionReason, status=$status, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"
}
