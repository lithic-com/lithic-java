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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Dispute. */
class DisputeDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val amount: JsonField<Long>,
    private val arbitrationDate: JsonField<OffsetDateTime>,
    private val created: JsonField<OffsetDateTime>,
    private val customerFiledDate: JsonField<OffsetDateTime>,
    private val customerNote: JsonField<String>,
    private val networkClaimIds: JsonField<List<String>>,
    private val networkFiledDate: JsonField<OffsetDateTime>,
    private val networkReasonCode: JsonField<String>,
    private val prearbitrationDate: JsonField<OffsetDateTime>,
    private val primaryClaimId: JsonField<String>,
    private val reason: JsonField<Reason>,
    private val representmentDate: JsonField<OffsetDateTime>,
    private val resolutionDate: JsonField<OffsetDateTime>,
    private val resolutionNote: JsonField<String>,
    private val resolutionReason: JsonField<ResolutionReason>,
    private val status: JsonField<Status>,
    private val transactionToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("arbitration_date")
        @ExcludeMissing
        arbitrationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_filed_date")
        @ExcludeMissing
        customerFiledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_note")
        @ExcludeMissing
        customerNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_claim_ids")
        @ExcludeMissing
        networkClaimIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("network_filed_date")
        @ExcludeMissing
        networkFiledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("network_reason_code")
        @ExcludeMissing
        networkReasonCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prearbitration_date")
        @ExcludeMissing
        prearbitrationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("primary_claim_id")
        @ExcludeMissing
        primaryClaimId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("representment_date")
        @ExcludeMissing
        representmentDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("resolution_date")
        @ExcludeMissing
        resolutionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("resolution_note")
        @ExcludeMissing
        resolutionNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resolution_reason")
        @ExcludeMissing
        resolutionReason: JsonField<ResolutionReason> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_token")
        @ExcludeMissing
        transactionToken: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        amount,
        arbitrationDate,
        created,
        customerFiledDate,
        customerNote,
        networkClaimIds,
        networkFiledDate,
        networkReasonCode,
        prearbitrationDate,
        primaryClaimId,
        reason,
        representmentDate,
        resolutionDate,
        resolutionNote,
        resolutionReason,
        status,
        transactionToken,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Amount under dispute. May be different from the original transaction amount.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * Date dispute entered arbitration.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun arbitrationDate(): Optional<OffsetDateTime> =
        arbitrationDate.getOptional("arbitration_date")

    /**
     * Timestamp of when first Dispute was reported.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Date that the dispute was filed by the customer making the dispute.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerFiledDate(): Optional<OffsetDateTime> =
        customerFiledDate.getOptional("customer_filed_date")

    /**
     * End customer description of the reason for the dispute.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerNote(): Optional<String> = customerNote.getOptional("customer_note")

    /**
     * Unique identifiers for the dispute from the network.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkClaimIds(): Optional<List<String>> = networkClaimIds.getOptional("network_claim_ids")

    /**
     * Date that the dispute was submitted to the network.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkFiledDate(): Optional<OffsetDateTime> =
        networkFiledDate.getOptional("network_filed_date")

    /**
     * Network reason code used to file the dispute.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkReasonCode(): Optional<String> = networkReasonCode.getOptional("network_reason_code")

    /**
     * Date dispute entered pre-arbitration.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prearbitrationDate(): Optional<OffsetDateTime> =
        prearbitrationDate.getOptional("prearbitration_date")

    /**
     * Unique identifier for the dispute from the network. If there are multiple, this will be the
     * first claim id set by the network
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryClaimId(): Optional<String> = primaryClaimId.getOptional("primary_claim_id")

    /**
     * Dispute reason:
     * * `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
     * * `CANCELLED`: Transaction was cancelled by the customer.
     * * `DUPLICATED`: The transaction was a duplicate.
     * * `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
     * * `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
     * * `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant activity.
     * * `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
     * * `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
     * * `INCORRECT_AMOUNT`: The transaction amount was incorrect.
     * * `MISSING_AUTH`: The transaction was missing authorization.
     * * `OTHER`: Other reason.
     * * `PROCESSING_ERROR`: Processing error.
     * * `REFUND_NOT_PROCESSED`: The refund was not processed.
     * * `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): Reason = reason.getRequired("reason")

    /**
     * Date the representment was received.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun representmentDate(): Optional<OffsetDateTime> =
        representmentDate.getOptional("representment_date")

    /**
     * Date that the dispute was resolved.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolutionDate(): Optional<OffsetDateTime> = resolutionDate.getOptional("resolution_date")

    /**
     * Note by Dispute team on the case resolution.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolutionNote(): Optional<String> = resolutionNote.getOptional("resolution_note")

    /**
     * Reason for the dispute resolution:
     * * `CASE_LOST`: This case was lost at final arbitration.
     * * `NETWORK_REJECTED`: Network rejected.
     * * `NO_DISPUTE_RIGHTS_3DS`: No dispute rights, 3DS.
     * * `NO_DISPUTE_RIGHTS_BELOW_THRESHOLD`: No dispute rights, below threshold.
     * * `NO_DISPUTE_RIGHTS_CONTACTLESS`: No dispute rights, contactless.
     * * `NO_DISPUTE_RIGHTS_HYBRID`: No dispute rights, hybrid.
     * * `NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS`: No dispute rights, max chargebacks.
     * * `NO_DISPUTE_RIGHTS_OTHER`: No dispute rights, other.
     * * `PAST_FILING_DATE`: Past filing date.
     * * `PREARBITRATION_REJECTED`: Prearbitration rejected.
     * * `PROCESSOR_REJECTED_OTHER`: Processor rejected, other.
     * * `REFUNDED`: Refunded.
     * * `REFUNDED_AFTER_CHARGEBACK`: Refunded after chargeback.
     * * `WITHDRAWN`: Withdrawn.
     * * `WON_ARBITRATION`: Won arbitration.
     * * `WON_FIRST_CHARGEBACK`: Won first chargeback.
     * * `WON_PREARBITRATION`: Won prearbitration.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolutionReason(): Optional<ResolutionReason> =
        resolutionReason.getOptional("resolution_reason")

    /**
     * Status types:
     * * `NEW` - New dispute case is opened.
     * * `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
     * * `SUBMITTED` - Dispute is submitted to the card network.
     * * `REPRESENTMENT` - Case has entered second presentment.
     * * `PREARBITRATION` - Case has entered prearbitration.
     * * `ARBITRATION` - Case has entered arbitration.
     * * `CASE_WON` - Case was won and credit will be issued.
     * * `CASE_CLOSED` - Case was lost or withdrawn.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The transaction that is being disputed. A transaction can only be disputed once but may have
     * multiple dispute cases.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [arbitrationDate].
     *
     * Unlike [arbitrationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arbitration_date")
    @ExcludeMissing
    fun _arbitrationDate(): JsonField<OffsetDateTime> = arbitrationDate

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [customerFiledDate].
     *
     * Unlike [customerFiledDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customer_filed_date")
    @ExcludeMissing
    fun _customerFiledDate(): JsonField<OffsetDateTime> = customerFiledDate

    /**
     * Returns the raw JSON value of [customerNote].
     *
     * Unlike [customerNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_note")
    @ExcludeMissing
    fun _customerNote(): JsonField<String> = customerNote

    /**
     * Returns the raw JSON value of [networkClaimIds].
     *
     * Unlike [networkClaimIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network_claim_ids")
    @ExcludeMissing
    fun _networkClaimIds(): JsonField<List<String>> = networkClaimIds

    /**
     * Returns the raw JSON value of [networkFiledDate].
     *
     * Unlike [networkFiledDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("network_filed_date")
    @ExcludeMissing
    fun _networkFiledDate(): JsonField<OffsetDateTime> = networkFiledDate

    /**
     * Returns the raw JSON value of [networkReasonCode].
     *
     * Unlike [networkReasonCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("network_reason_code")
    @ExcludeMissing
    fun _networkReasonCode(): JsonField<String> = networkReasonCode

    /**
     * Returns the raw JSON value of [prearbitrationDate].
     *
     * Unlike [prearbitrationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prearbitration_date")
    @ExcludeMissing
    fun _prearbitrationDate(): JsonField<OffsetDateTime> = prearbitrationDate

    /**
     * Returns the raw JSON value of [primaryClaimId].
     *
     * Unlike [primaryClaimId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_claim_id")
    @ExcludeMissing
    fun _primaryClaimId(): JsonField<String> = primaryClaimId

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

    /**
     * Returns the raw JSON value of [representmentDate].
     *
     * Unlike [representmentDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("representment_date")
    @ExcludeMissing
    fun _representmentDate(): JsonField<OffsetDateTime> = representmentDate

    /**
     * Returns the raw JSON value of [resolutionDate].
     *
     * Unlike [resolutionDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolution_date")
    @ExcludeMissing
    fun _resolutionDate(): JsonField<OffsetDateTime> = resolutionDate

    /**
     * Returns the raw JSON value of [resolutionNote].
     *
     * Unlike [resolutionNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolution_note")
    @ExcludeMissing
    fun _resolutionNote(): JsonField<String> = resolutionNote

    /**
     * Returns the raw JSON value of [resolutionReason].
     *
     * Unlike [resolutionReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("resolution_reason")
    @ExcludeMissing
    fun _resolutionReason(): JsonField<ResolutionReason> = resolutionReason

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transactionToken].
     *
     * Unlike [transactionToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_token")
    @ExcludeMissing
    fun _transactionToken(): JsonField<String> = transactionToken

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
         * Returns a mutable builder for constructing an instance of [DisputeDeleteResponse].
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
         * .resolutionDate()
         * .resolutionNote()
         * .resolutionReason()
         * .status()
         * .transactionToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DisputeDeleteResponse]. */
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
        private var resolutionDate: JsonField<OffsetDateTime>? = null
        private var resolutionNote: JsonField<String>? = null
        private var resolutionReason: JsonField<ResolutionReason>? = null
        private var status: JsonField<Status>? = null
        private var transactionToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(disputeDeleteResponse: DisputeDeleteResponse) = apply {
            token = disputeDeleteResponse.token
            amount = disputeDeleteResponse.amount
            arbitrationDate = disputeDeleteResponse.arbitrationDate
            created = disputeDeleteResponse.created
            customerFiledDate = disputeDeleteResponse.customerFiledDate
            customerNote = disputeDeleteResponse.customerNote
            networkClaimIds = disputeDeleteResponse.networkClaimIds.map { it.toMutableList() }
            networkFiledDate = disputeDeleteResponse.networkFiledDate
            networkReasonCode = disputeDeleteResponse.networkReasonCode
            prearbitrationDate = disputeDeleteResponse.prearbitrationDate
            primaryClaimId = disputeDeleteResponse.primaryClaimId
            reason = disputeDeleteResponse.reason
            representmentDate = disputeDeleteResponse.representmentDate
            resolutionDate = disputeDeleteResponse.resolutionDate
            resolutionNote = disputeDeleteResponse.resolutionNote
            resolutionReason = disputeDeleteResponse.resolutionReason
            status = disputeDeleteResponse.status
            transactionToken = disputeDeleteResponse.transactionToken
            additionalProperties = disputeDeleteResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Amount under dispute. May be different from the original transaction amount. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** Date dispute entered arbitration. */
        fun arbitrationDate(arbitrationDate: OffsetDateTime?) =
            arbitrationDate(JsonField.ofNullable(arbitrationDate))

        /** Alias for calling [Builder.arbitrationDate] with `arbitrationDate.orElse(null)`. */
        fun arbitrationDate(arbitrationDate: Optional<OffsetDateTime>) =
            arbitrationDate(arbitrationDate.getOrNull())

        /**
         * Sets [Builder.arbitrationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arbitrationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun arbitrationDate(arbitrationDate: JsonField<OffsetDateTime>) = apply {
            this.arbitrationDate = arbitrationDate
        }

        /** Timestamp of when first Dispute was reported. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date that the dispute was filed by the customer making the dispute. */
        fun customerFiledDate(customerFiledDate: OffsetDateTime?) =
            customerFiledDate(JsonField.ofNullable(customerFiledDate))

        /** Alias for calling [Builder.customerFiledDate] with `customerFiledDate.orElse(null)`. */
        fun customerFiledDate(customerFiledDate: Optional<OffsetDateTime>) =
            customerFiledDate(customerFiledDate.getOrNull())

        /**
         * Sets [Builder.customerFiledDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerFiledDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customerFiledDate(customerFiledDate: JsonField<OffsetDateTime>) = apply {
            this.customerFiledDate = customerFiledDate
        }

        /** End customer description of the reason for the dispute. */
        fun customerNote(customerNote: String?) = customerNote(JsonField.ofNullable(customerNote))

        /** Alias for calling [Builder.customerNote] with `customerNote.orElse(null)`. */
        fun customerNote(customerNote: Optional<String>) = customerNote(customerNote.getOrNull())

        /**
         * Sets [Builder.customerNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerNote] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerNote(customerNote: JsonField<String>) = apply {
            this.customerNote = customerNote
        }

        /** Unique identifiers for the dispute from the network. */
        fun networkClaimIds(networkClaimIds: List<String>?) =
            networkClaimIds(JsonField.ofNullable(networkClaimIds))

        /** Alias for calling [Builder.networkClaimIds] with `networkClaimIds.orElse(null)`. */
        fun networkClaimIds(networkClaimIds: Optional<List<String>>) =
            networkClaimIds(networkClaimIds.getOrNull())

        /**
         * Sets [Builder.networkClaimIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkClaimIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun networkClaimIds(networkClaimIds: JsonField<List<String>>) = apply {
            this.networkClaimIds = networkClaimIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [networkClaimIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNetworkClaimId(networkClaimId: String) = apply {
            networkClaimIds =
                (networkClaimIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("networkClaimIds", it).add(networkClaimId)
                }
        }

        /** Date that the dispute was submitted to the network. */
        fun networkFiledDate(networkFiledDate: OffsetDateTime?) =
            networkFiledDate(JsonField.ofNullable(networkFiledDate))

        /** Alias for calling [Builder.networkFiledDate] with `networkFiledDate.orElse(null)`. */
        fun networkFiledDate(networkFiledDate: Optional<OffsetDateTime>) =
            networkFiledDate(networkFiledDate.getOrNull())

        /**
         * Sets [Builder.networkFiledDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkFiledDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun networkFiledDate(networkFiledDate: JsonField<OffsetDateTime>) = apply {
            this.networkFiledDate = networkFiledDate
        }

        /** Network reason code used to file the dispute. */
        fun networkReasonCode(networkReasonCode: String?) =
            networkReasonCode(JsonField.ofNullable(networkReasonCode))

        /** Alias for calling [Builder.networkReasonCode] with `networkReasonCode.orElse(null)`. */
        fun networkReasonCode(networkReasonCode: Optional<String>) =
            networkReasonCode(networkReasonCode.getOrNull())

        /**
         * Sets [Builder.networkReasonCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkReasonCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun networkReasonCode(networkReasonCode: JsonField<String>) = apply {
            this.networkReasonCode = networkReasonCode
        }

        /** Date dispute entered pre-arbitration. */
        fun prearbitrationDate(prearbitrationDate: OffsetDateTime?) =
            prearbitrationDate(JsonField.ofNullable(prearbitrationDate))

        /**
         * Alias for calling [Builder.prearbitrationDate] with `prearbitrationDate.orElse(null)`.
         */
        fun prearbitrationDate(prearbitrationDate: Optional<OffsetDateTime>) =
            prearbitrationDate(prearbitrationDate.getOrNull())

        /**
         * Sets [Builder.prearbitrationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prearbitrationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun prearbitrationDate(prearbitrationDate: JsonField<OffsetDateTime>) = apply {
            this.prearbitrationDate = prearbitrationDate
        }

        /**
         * Unique identifier for the dispute from the network. If there are multiple, this will be
         * the first claim id set by the network
         */
        fun primaryClaimId(primaryClaimId: String?) =
            primaryClaimId(JsonField.ofNullable(primaryClaimId))

        /** Alias for calling [Builder.primaryClaimId] with `primaryClaimId.orElse(null)`. */
        fun primaryClaimId(primaryClaimId: Optional<String>) =
            primaryClaimId(primaryClaimId.getOrNull())

        /**
         * Sets [Builder.primaryClaimId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryClaimId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryClaimId(primaryClaimId: JsonField<String>) = apply {
            this.primaryClaimId = primaryClaimId
        }

        /**
         * Dispute reason:
         * * `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
         * * `CANCELLED`: Transaction was cancelled by the customer.
         * * `DUPLICATED`: The transaction was a duplicate.
         * * `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
         * * `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
         * * `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant
         *   activity.
         * * `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
         * * `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
         * * `INCORRECT_AMOUNT`: The transaction amount was incorrect.
         * * `MISSING_AUTH`: The transaction was missing authorization.
         * * `OTHER`: Other reason.
         * * `PROCESSING_ERROR`: Processing error.
         * * `REFUND_NOT_PROCESSED`: The refund was not processed.
         * * `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
         */
        fun reason(reason: Reason) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [Reason] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        /** Date the representment was received. */
        fun representmentDate(representmentDate: OffsetDateTime?) =
            representmentDate(JsonField.ofNullable(representmentDate))

        /** Alias for calling [Builder.representmentDate] with `representmentDate.orElse(null)`. */
        fun representmentDate(representmentDate: Optional<OffsetDateTime>) =
            representmentDate(representmentDate.getOrNull())

        /**
         * Sets [Builder.representmentDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.representmentDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun representmentDate(representmentDate: JsonField<OffsetDateTime>) = apply {
            this.representmentDate = representmentDate
        }

        /** Date that the dispute was resolved. */
        fun resolutionDate(resolutionDate: OffsetDateTime?) =
            resolutionDate(JsonField.ofNullable(resolutionDate))

        /** Alias for calling [Builder.resolutionDate] with `resolutionDate.orElse(null)`. */
        fun resolutionDate(resolutionDate: Optional<OffsetDateTime>) =
            resolutionDate(resolutionDate.getOrNull())

        /**
         * Sets [Builder.resolutionDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolutionDate(resolutionDate: JsonField<OffsetDateTime>) = apply {
            this.resolutionDate = resolutionDate
        }

        /** Note by Dispute team on the case resolution. */
        fun resolutionNote(resolutionNote: String?) =
            resolutionNote(JsonField.ofNullable(resolutionNote))

        /** Alias for calling [Builder.resolutionNote] with `resolutionNote.orElse(null)`. */
        fun resolutionNote(resolutionNote: Optional<String>) =
            resolutionNote(resolutionNote.getOrNull())

        /**
         * Sets [Builder.resolutionNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionNote] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolutionNote(resolutionNote: JsonField<String>) = apply {
            this.resolutionNote = resolutionNote
        }

        /**
         * Reason for the dispute resolution:
         * * `CASE_LOST`: This case was lost at final arbitration.
         * * `NETWORK_REJECTED`: Network rejected.
         * * `NO_DISPUTE_RIGHTS_3DS`: No dispute rights, 3DS.
         * * `NO_DISPUTE_RIGHTS_BELOW_THRESHOLD`: No dispute rights, below threshold.
         * * `NO_DISPUTE_RIGHTS_CONTACTLESS`: No dispute rights, contactless.
         * * `NO_DISPUTE_RIGHTS_HYBRID`: No dispute rights, hybrid.
         * * `NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS`: No dispute rights, max chargebacks.
         * * `NO_DISPUTE_RIGHTS_OTHER`: No dispute rights, other.
         * * `PAST_FILING_DATE`: Past filing date.
         * * `PREARBITRATION_REJECTED`: Prearbitration rejected.
         * * `PROCESSOR_REJECTED_OTHER`: Processor rejected, other.
         * * `REFUNDED`: Refunded.
         * * `REFUNDED_AFTER_CHARGEBACK`: Refunded after chargeback.
         * * `WITHDRAWN`: Withdrawn.
         * * `WON_ARBITRATION`: Won arbitration.
         * * `WON_FIRST_CHARGEBACK`: Won first chargeback.
         * * `WON_PREARBITRATION`: Won prearbitration.
         */
        fun resolutionReason(resolutionReason: ResolutionReason?) =
            resolutionReason(JsonField.ofNullable(resolutionReason))

        /** Alias for calling [Builder.resolutionReason] with `resolutionReason.orElse(null)`. */
        fun resolutionReason(resolutionReason: Optional<ResolutionReason>) =
            resolutionReason(resolutionReason.getOrNull())

        /**
         * Sets [Builder.resolutionReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolutionReason] with a well-typed [ResolutionReason]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun resolutionReason(resolutionReason: JsonField<ResolutionReason>) = apply {
            this.resolutionReason = resolutionReason
        }

        /**
         * Status types:
         * * `NEW` - New dispute case is opened.
         * * `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
         * * `SUBMITTED` - Dispute is submitted to the card network.
         * * `REPRESENTMENT` - Case has entered second presentment.
         * * `PREARBITRATION` - Case has entered prearbitration.
         * * `ARBITRATION` - Case has entered arbitration.
         * * `CASE_WON` - Case was won and credit will be issued.
         * * `CASE_CLOSED` - Case was lost or withdrawn.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The transaction that is being disputed. A transaction can only be disputed once but may
         * have multiple dispute cases.
         */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /**
         * Sets [Builder.transactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [DisputeDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         * .resolutionDate()
         * .resolutionNote()
         * .resolutionReason()
         * .status()
         * .transactionToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DisputeDeleteResponse =
            DisputeDeleteResponse(
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
                checkRequired("resolutionDate", resolutionDate),
                checkRequired("resolutionNote", resolutionNote),
                checkRequired("resolutionReason", resolutionReason),
                checkRequired("status", status),
                checkRequired("transactionToken", transactionToken),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DisputeDeleteResponse = apply {
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
        reason().validate()
        representmentDate()
        resolutionDate()
        resolutionNote()
        resolutionReason().ifPresent { it.validate() }
        status().validate()
        transactionToken()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (arbitrationDate.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (customerFiledDate.asKnown().isPresent) 1 else 0) +
            (if (customerNote.asKnown().isPresent) 1 else 0) +
            (networkClaimIds.asKnown().getOrNull()?.size ?: 0) +
            (if (networkFiledDate.asKnown().isPresent) 1 else 0) +
            (if (networkReasonCode.asKnown().isPresent) 1 else 0) +
            (if (prearbitrationDate.asKnown().isPresent) 1 else 0) +
            (if (primaryClaimId.asKnown().isPresent) 1 else 0) +
            (reason.asKnown().getOrNull()?.validity() ?: 0) +
            (if (representmentDate.asKnown().isPresent) 1 else 0) +
            (if (resolutionDate.asKnown().isPresent) 1 else 0) +
            (if (resolutionNote.asKnown().isPresent) 1 else 0) +
            (resolutionReason.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionToken.asKnown().isPresent) 1 else 0)

    /**
     * Dispute reason:
     * * `ATM_CASH_MISDISPENSE`: ATM cash misdispense.
     * * `CANCELLED`: Transaction was cancelled by the customer.
     * * `DUPLICATED`: The transaction was a duplicate.
     * * `FRAUD_CARD_NOT_PRESENT`: Fraudulent transaction, card not present.
     * * `FRAUD_CARD_PRESENT`: Fraudulent transaction, card present.
     * * `FRAUD_OTHER`: Fraudulent transaction, other types such as questionable merchant activity.
     * * `GOODS_SERVICES_NOT_AS_DESCRIBED`: The goods or services were not as described.
     * * `GOODS_SERVICES_NOT_RECEIVED`: The goods or services were not received.
     * * `INCORRECT_AMOUNT`: The transaction amount was incorrect.
     * * `MISSING_AUTH`: The transaction was missing authorization.
     * * `OTHER`: Other reason.
     * * `PROCESSING_ERROR`: Processing error.
     * * `REFUND_NOT_PROCESSED`: The refund was not processed.
     * * `RECURRING_TRANSACTION_NOT_CANCELLED`: The recurring transaction was not cancelled.
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

        private var validated: Boolean = false

        fun validate(): Reason = apply {
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

            return other is Reason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Reason for the dispute resolution:
     * * `CASE_LOST`: This case was lost at final arbitration.
     * * `NETWORK_REJECTED`: Network rejected.
     * * `NO_DISPUTE_RIGHTS_3DS`: No dispute rights, 3DS.
     * * `NO_DISPUTE_RIGHTS_BELOW_THRESHOLD`: No dispute rights, below threshold.
     * * `NO_DISPUTE_RIGHTS_CONTACTLESS`: No dispute rights, contactless.
     * * `NO_DISPUTE_RIGHTS_HYBRID`: No dispute rights, hybrid.
     * * `NO_DISPUTE_RIGHTS_MAX_CHARGEBACKS`: No dispute rights, max chargebacks.
     * * `NO_DISPUTE_RIGHTS_OTHER`: No dispute rights, other.
     * * `PAST_FILING_DATE`: Past filing date.
     * * `PREARBITRATION_REJECTED`: Prearbitration rejected.
     * * `PROCESSOR_REJECTED_OTHER`: Processor rejected, other.
     * * `REFUNDED`: Refunded.
     * * `REFUNDED_AFTER_CHARGEBACK`: Refunded after chargeback.
     * * `WITHDRAWN`: Withdrawn.
     * * `WON_ARBITRATION`: Won arbitration.
     * * `WON_FIRST_CHARGEBACK`: Won first chargeback.
     * * `WON_PREARBITRATION`: Won prearbitration.
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

        private var validated: Boolean = false

        fun validate(): ResolutionReason = apply {
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

            return other is ResolutionReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Status types:
     * * `NEW` - New dispute case is opened.
     * * `PENDING_CUSTOMER` - Lithic is waiting for customer to provide more information.
     * * `SUBMITTED` - Dispute is submitted to the card network.
     * * `REPRESENTMENT` - Case has entered second presentment.
     * * `PREARBITRATION` - Case has entered prearbitration.
     * * `ARBITRATION` - Case has entered arbitration.
     * * `CASE_WON` - Case was won and credit will be issued.
     * * `CASE_CLOSED` - Case was lost or withdrawn.
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputeDeleteResponse &&
            token == other.token &&
            amount == other.amount &&
            arbitrationDate == other.arbitrationDate &&
            created == other.created &&
            customerFiledDate == other.customerFiledDate &&
            customerNote == other.customerNote &&
            networkClaimIds == other.networkClaimIds &&
            networkFiledDate == other.networkFiledDate &&
            networkReasonCode == other.networkReasonCode &&
            prearbitrationDate == other.prearbitrationDate &&
            primaryClaimId == other.primaryClaimId &&
            reason == other.reason &&
            representmentDate == other.representmentDate &&
            resolutionDate == other.resolutionDate &&
            resolutionNote == other.resolutionNote &&
            resolutionReason == other.resolutionReason &&
            status == other.status &&
            transactionToken == other.transactionToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            amount,
            arbitrationDate,
            created,
            customerFiledDate,
            customerNote,
            networkClaimIds,
            networkFiledDate,
            networkReasonCode,
            prearbitrationDate,
            primaryClaimId,
            reason,
            representmentDate,
            resolutionDate,
            resolutionNote,
            resolutionReason,
            status,
            transactionToken,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DisputeDeleteResponse{token=$token, amount=$amount, arbitrationDate=$arbitrationDate, created=$created, customerFiledDate=$customerFiledDate, customerNote=$customerNote, networkClaimIds=$networkClaimIds, networkFiledDate=$networkFiledDate, networkReasonCode=$networkReasonCode, prearbitrationDate=$prearbitrationDate, primaryClaimId=$primaryClaimId, reason=$reason, representmentDate=$representmentDate, resolutionDate=$resolutionDate, resolutionNote=$resolutionNote, resolutionReason=$resolutionReason, status=$status, transactionToken=$transactionToken, additionalProperties=$additionalProperties}"
}
