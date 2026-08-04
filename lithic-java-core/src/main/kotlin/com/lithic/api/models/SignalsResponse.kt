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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Behavioral feature state for a card or account derived from its transaction history.
 *
 * Derived statistical features (averages, standard deviations, z-scores) are computed using
 * Welford's online algorithm over approved transactions. Average fields are null when fewer than 5
 * approved transactions have been recorded. Standard deviation fields are null when fewer than 30
 * approved transactions have been recorded.
 *
 * 3DS fields (`three_ds_success_rate`, `three_ds_success_count`, `three_ds_total_count`) are
 * card-scoped and will be null for account responses.
 *
 * Raw fields (`seen_countries`, `seen_mccs`, `approved_txn_amount_m2`, etc.) are included so
 * clients can compute their own transaction-specific derivations, such as checking whether a new
 * transaction's country is in `seen_countries` to determine `is_new_country`, or computing a
 * z-score using the raw mean and M2 values.
 */
class SignalsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val approvedTxnAmountM2: JsonField<Double>,
    private val approvedTxnAmountM2_30d: JsonField<Double>,
    private val approvedTxnAmountM2_7d: JsonField<Double>,
    private val approvedTxnAmountM2_90d: JsonField<Double>,
    private val approvedTxnCount: JsonField<Long>,
    private val approvedTxnCount30d: JsonField<Long>,
    private val approvedTxnCount7d: JsonField<Long>,
    private val approvedTxnCount90d: JsonField<Long>,
    private val avgTransactionAmount: JsonField<Double>,
    private val avgTransactionAmount30d: JsonField<Double>,
    private val avgTransactionAmount7d: JsonField<Double>,
    private val avgTransactionAmount90d: JsonField<Double>,
    private val distinctCountryCount: JsonField<Long>,
    private val distinctMccCount: JsonField<Long>,
    private val firstTxnAt: JsonField<OffsetDateTime>,
    private val isFirstTransaction: JsonField<Boolean>,
    private val lastCpCountry: JsonField<String>,
    private val lastCpPostalCode: JsonField<String>,
    private val lastCpTimestamp: JsonField<OffsetDateTime>,
    private val lastTxnApprovedAt: JsonField<OffsetDateTime>,
    private val seenCountries: JsonField<List<String>>,
    private val seenMccs: JsonField<List<String>>,
    private val seenMerchants: JsonField<List<String>>,
    private val stdevTransactionAmount: JsonField<Double>,
    private val stdevTransactionAmount30d: JsonField<Double>,
    private val stdevTransactionAmount7d: JsonField<Double>,
    private val stdevTransactionAmount90d: JsonField<Double>,
    private val threeDSSuccessCount: JsonField<Long>,
    private val threeDSSuccessRate: JsonField<Double>,
    private val threeDSTotalCount: JsonField<Long>,
    private val timeSinceLastTransactionDays: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("approved_txn_amount_m2")
        @ExcludeMissing
        approvedTxnAmountM2: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("approved_txn_amount_m2_30d")
        @ExcludeMissing
        approvedTxnAmountM2_30d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("approved_txn_amount_m2_7d")
        @ExcludeMissing
        approvedTxnAmountM2_7d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("approved_txn_amount_m2_90d")
        @ExcludeMissing
        approvedTxnAmountM2_90d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("approved_txn_count")
        @ExcludeMissing
        approvedTxnCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("approved_txn_count_30d")
        @ExcludeMissing
        approvedTxnCount30d: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("approved_txn_count_7d")
        @ExcludeMissing
        approvedTxnCount7d: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("approved_txn_count_90d")
        @ExcludeMissing
        approvedTxnCount90d: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("avg_transaction_amount")
        @ExcludeMissing
        avgTransactionAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avg_transaction_amount_30d")
        @ExcludeMissing
        avgTransactionAmount30d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avg_transaction_amount_7d")
        @ExcludeMissing
        avgTransactionAmount7d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("avg_transaction_amount_90d")
        @ExcludeMissing
        avgTransactionAmount90d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("distinct_country_count")
        @ExcludeMissing
        distinctCountryCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("distinct_mcc_count")
        @ExcludeMissing
        distinctMccCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("first_txn_at")
        @ExcludeMissing
        firstTxnAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_first_transaction")
        @ExcludeMissing
        isFirstTransaction: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_cp_country")
        @ExcludeMissing
        lastCpCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_cp_postal_code")
        @ExcludeMissing
        lastCpPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_cp_timestamp")
        @ExcludeMissing
        lastCpTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_txn_approved_at")
        @ExcludeMissing
        lastTxnApprovedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("seen_countries")
        @ExcludeMissing
        seenCountries: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("seen_mccs")
        @ExcludeMissing
        seenMccs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("seen_merchants")
        @ExcludeMissing
        seenMerchants: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("stdev_transaction_amount")
        @ExcludeMissing
        stdevTransactionAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stdev_transaction_amount_30d")
        @ExcludeMissing
        stdevTransactionAmount30d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stdev_transaction_amount_7d")
        @ExcludeMissing
        stdevTransactionAmount7d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stdev_transaction_amount_90d")
        @ExcludeMissing
        stdevTransactionAmount90d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("three_ds_success_count")
        @ExcludeMissing
        threeDSSuccessCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("three_ds_success_rate")
        @ExcludeMissing
        threeDSSuccessRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("three_ds_total_count")
        @ExcludeMissing
        threeDSTotalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("time_since_last_transaction_days")
        @ExcludeMissing
        timeSinceLastTransactionDays: JsonField<Double> = JsonMissing.of(),
    ) : this(
        approvedTxnAmountM2,
        approvedTxnAmountM2_30d,
        approvedTxnAmountM2_7d,
        approvedTxnAmountM2_90d,
        approvedTxnCount,
        approvedTxnCount30d,
        approvedTxnCount7d,
        approvedTxnCount90d,
        avgTransactionAmount,
        avgTransactionAmount30d,
        avgTransactionAmount7d,
        avgTransactionAmount90d,
        distinctCountryCount,
        distinctMccCount,
        firstTxnAt,
        isFirstTransaction,
        lastCpCountry,
        lastCpPostalCode,
        lastCpTimestamp,
        lastTxnApprovedAt,
        seenCountries,
        seenMccs,
        seenMerchants,
        stdevTransactionAmount,
        stdevTransactionAmount30d,
        stdevTransactionAmount7d,
        stdevTransactionAmount90d,
        threeDSSuccessCount,
        threeDSSuccessRate,
        threeDSTotalCount,
        timeSinceLastTransactionDays,
        mutableMapOf(),
    )

    /**
     * The Welford M2 accumulator for lifetime approved transaction amounts. Used together with
     * `avg_transaction_amount` and `approved_txn_count` to compute the z-score of a new transaction
     * amount (variance = M2 / (count - 1)).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnAmountM2(): Optional<Double> =
        approvedTxnAmountM2.getOptional("approved_txn_amount_m2")

    /**
     * The Welford M2 accumulator for approved transaction amounts over the last 30 days.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnAmountM2_30d(): Optional<Double> =
        approvedTxnAmountM2_30d.getOptional("approved_txn_amount_m2_30d")

    /**
     * The Welford M2 accumulator for approved transaction amounts over the last 7 days.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnAmountM2_7d(): Optional<Double> =
        approvedTxnAmountM2_7d.getOptional("approved_txn_amount_m2_7d")

    /**
     * The Welford M2 accumulator for approved transaction amounts over the last 90 days.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnAmountM2_90d(): Optional<Double> =
        approvedTxnAmountM2_90d.getOptional("approved_txn_amount_m2_90d")

    /**
     * The total number of approved transactions over the entity's lifetime.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnCount(): Optional<Long> = approvedTxnCount.getOptional("approved_txn_count")

    /**
     * The number of approved transactions in the last 30 days.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnCount30d(): Optional<Long> =
        approvedTxnCount30d.getOptional("approved_txn_count_30d")

    /**
     * The number of approved transactions in the last 7 days.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnCount7d(): Optional<Long> =
        approvedTxnCount7d.getOptional("approved_txn_count_7d")

    /**
     * The number of approved transactions in the last 90 days.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedTxnCount90d(): Optional<Long> =
        approvedTxnCount90d.getOptional("approved_txn_count_90d")

    /**
     * The average approved transaction amount over the entity's lifetime, in cents. Null if fewer
     * than 5 approved transactions have been recorded.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avgTransactionAmount(): Optional<Double> =
        avgTransactionAmount.getOptional("avg_transaction_amount")

    /**
     * The average approved transaction amount over the last 30 days, in cents. Null if fewer than 5
     * approved transactions in window.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avgTransactionAmount30d(): Optional<Double> =
        avgTransactionAmount30d.getOptional("avg_transaction_amount_30d")

    /**
     * The average approved transaction amount over the last 7 days, in cents. Null if fewer than 5
     * approved transactions in window.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avgTransactionAmount7d(): Optional<Double> =
        avgTransactionAmount7d.getOptional("avg_transaction_amount_7d")

    /**
     * The average approved transaction amount over the last 90 days, in cents. Null if fewer than 5
     * approved transactions in window.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avgTransactionAmount90d(): Optional<Double> =
        avgTransactionAmount90d.getOptional("avg_transaction_amount_90d")

    /**
     * The number of distinct merchant countries seen in the entity's transaction history.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun distinctCountryCount(): Optional<Long> =
        distinctCountryCount.getOptional("distinct_country_count")

    /**
     * The number of distinct MCCs seen in the entity's transaction history.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun distinctMccCount(): Optional<Long> = distinctMccCount.getOptional("distinct_mcc_count")

    /**
     * The timestamp of the first approved transaction for the entity, in ISO 8601 format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTxnAt(): Optional<OffsetDateTime> = firstTxnAt.getOptional("first_txn_at")

    /**
     * Whether the entity has no prior transaction history. Returns true if no history is found.
     * Null if transaction history exists but a first transaction timestamp is unavailable.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFirstTransaction(): Optional<Boolean> =
        isFirstTransaction.getOptional("is_first_transaction")

    /**
     * The merchant country of the last card-present transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastCpCountry(): Optional<String> = lastCpCountry.getOptional("last_cp_country")

    /**
     * The merchant postal code of the last card-present transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastCpPostalCode(): Optional<String> = lastCpPostalCode.getOptional("last_cp_postal_code")

    /**
     * The timestamp of the last card-present transaction, in ISO 8601 format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastCpTimestamp(): Optional<OffsetDateTime> =
        lastCpTimestamp.getOptional("last_cp_timestamp")

    /**
     * The timestamp of the most recent approved transaction for the entity, in ISO 8601 format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastTxnApprovedAt(): Optional<OffsetDateTime> =
        lastTxnApprovedAt.getOptional("last_txn_approved_at")

    /**
     * The set of merchant countries seen in the entity's transaction history. Clients can use this
     * to determine whether a new transaction's country is novel (i.e. compute `is_new_country`).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seenCountries(): Optional<List<String>> = seenCountries.getOptional("seen_countries")

    /**
     * The set of MCCs seen in the entity's transaction history. Clients can use this to determine
     * whether a new transaction's MCC is novel (i.e. compute `is_new_mcc`).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seenMccs(): Optional<List<String>> = seenMccs.getOptional("seen_mccs")

    /**
     * The set of card acceptor IDs seen in the card's approved transaction history, capped at the
     * 1000 most recently seen. Null for account responses. Clients can use this to determine
     * whether a new transaction's merchant is novel (i.e. compute `is_new_merchant`).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seenMerchants(): Optional<List<String>> = seenMerchants.getOptional("seen_merchants")

    /**
     * The standard deviation of approved transaction amounts over the entity's lifetime, in cents.
     * Null if fewer than 30 approved transactions have been recorded.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdevTransactionAmount(): Optional<Double> =
        stdevTransactionAmount.getOptional("stdev_transaction_amount")

    /**
     * The standard deviation of approved transaction amounts over the last 30 days, in cents. Null
     * if fewer than 30 approved transactions in window.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdevTransactionAmount30d(): Optional<Double> =
        stdevTransactionAmount30d.getOptional("stdev_transaction_amount_30d")

    /**
     * The standard deviation of approved transaction amounts over the last 7 days, in cents. Null
     * if fewer than 30 approved transactions in window.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdevTransactionAmount7d(): Optional<Double> =
        stdevTransactionAmount7d.getOptional("stdev_transaction_amount_7d")

    /**
     * The standard deviation of approved transaction amounts over the last 90 days, in cents. Null
     * if fewer than 30 approved transactions in window.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdevTransactionAmount90d(): Optional<Double> =
        stdevTransactionAmount90d.getOptional("stdev_transaction_amount_90d")

    /**
     * The number of successful 3DS authentications for the card. Null for account responses.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeDSSuccessCount(): Optional<Long> =
        threeDSSuccessCount.getOptional("three_ds_success_count")

    /**
     * The 3DS authentication success rate for the card, as a percentage from 0.0 to 100.0. Null for
     * account responses.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeDSSuccessRate(): Optional<Double> =
        threeDSSuccessRate.getOptional("three_ds_success_rate")

    /**
     * The total number of 3DS authentication attempts for the card. Null for account responses.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeDSTotalCount(): Optional<Long> = threeDSTotalCount.getOptional("three_ds_total_count")

    /**
     * The number of days since the last approved transaction on the entity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeSinceLastTransactionDays(): Optional<Double> =
        timeSinceLastTransactionDays.getOptional("time_since_last_transaction_days")

    /**
     * Returns the raw JSON value of [approvedTxnAmountM2].
     *
     * Unlike [approvedTxnAmountM2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approved_txn_amount_m2")
    @ExcludeMissing
    fun _approvedTxnAmountM2(): JsonField<Double> = approvedTxnAmountM2

    /**
     * Returns the raw JSON value of [approvedTxnAmountM2_30d].
     *
     * Unlike [approvedTxnAmountM2_30d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("approved_txn_amount_m2_30d")
    @ExcludeMissing
    fun _approvedTxnAmountM2_30d(): JsonField<Double> = approvedTxnAmountM2_30d

    /**
     * Returns the raw JSON value of [approvedTxnAmountM2_7d].
     *
     * Unlike [approvedTxnAmountM2_7d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("approved_txn_amount_m2_7d")
    @ExcludeMissing
    fun _approvedTxnAmountM2_7d(): JsonField<Double> = approvedTxnAmountM2_7d

    /**
     * Returns the raw JSON value of [approvedTxnAmountM2_90d].
     *
     * Unlike [approvedTxnAmountM2_90d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("approved_txn_amount_m2_90d")
    @ExcludeMissing
    fun _approvedTxnAmountM2_90d(): JsonField<Double> = approvedTxnAmountM2_90d

    /**
     * Returns the raw JSON value of [approvedTxnCount].
     *
     * Unlike [approvedTxnCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approved_txn_count")
    @ExcludeMissing
    fun _approvedTxnCount(): JsonField<Long> = approvedTxnCount

    /**
     * Returns the raw JSON value of [approvedTxnCount30d].
     *
     * Unlike [approvedTxnCount30d], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approved_txn_count_30d")
    @ExcludeMissing
    fun _approvedTxnCount30d(): JsonField<Long> = approvedTxnCount30d

    /**
     * Returns the raw JSON value of [approvedTxnCount7d].
     *
     * Unlike [approvedTxnCount7d], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approved_txn_count_7d")
    @ExcludeMissing
    fun _approvedTxnCount7d(): JsonField<Long> = approvedTxnCount7d

    /**
     * Returns the raw JSON value of [approvedTxnCount90d].
     *
     * Unlike [approvedTxnCount90d], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("approved_txn_count_90d")
    @ExcludeMissing
    fun _approvedTxnCount90d(): JsonField<Long> = approvedTxnCount90d

    /**
     * Returns the raw JSON value of [avgTransactionAmount].
     *
     * Unlike [avgTransactionAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("avg_transaction_amount")
    @ExcludeMissing
    fun _avgTransactionAmount(): JsonField<Double> = avgTransactionAmount

    /**
     * Returns the raw JSON value of [avgTransactionAmount30d].
     *
     * Unlike [avgTransactionAmount30d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("avg_transaction_amount_30d")
    @ExcludeMissing
    fun _avgTransactionAmount30d(): JsonField<Double> = avgTransactionAmount30d

    /**
     * Returns the raw JSON value of [avgTransactionAmount7d].
     *
     * Unlike [avgTransactionAmount7d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("avg_transaction_amount_7d")
    @ExcludeMissing
    fun _avgTransactionAmount7d(): JsonField<Double> = avgTransactionAmount7d

    /**
     * Returns the raw JSON value of [avgTransactionAmount90d].
     *
     * Unlike [avgTransactionAmount90d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("avg_transaction_amount_90d")
    @ExcludeMissing
    fun _avgTransactionAmount90d(): JsonField<Double> = avgTransactionAmount90d

    /**
     * Returns the raw JSON value of [distinctCountryCount].
     *
     * Unlike [distinctCountryCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("distinct_country_count")
    @ExcludeMissing
    fun _distinctCountryCount(): JsonField<Long> = distinctCountryCount

    /**
     * Returns the raw JSON value of [distinctMccCount].
     *
     * Unlike [distinctMccCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("distinct_mcc_count")
    @ExcludeMissing
    fun _distinctMccCount(): JsonField<Long> = distinctMccCount

    /**
     * Returns the raw JSON value of [firstTxnAt].
     *
     * Unlike [firstTxnAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_txn_at")
    @ExcludeMissing
    fun _firstTxnAt(): JsonField<OffsetDateTime> = firstTxnAt

    /**
     * Returns the raw JSON value of [isFirstTransaction].
     *
     * Unlike [isFirstTransaction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_first_transaction")
    @ExcludeMissing
    fun _isFirstTransaction(): JsonField<Boolean> = isFirstTransaction

    /**
     * Returns the raw JSON value of [lastCpCountry].
     *
     * Unlike [lastCpCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_cp_country")
    @ExcludeMissing
    fun _lastCpCountry(): JsonField<String> = lastCpCountry

    /**
     * Returns the raw JSON value of [lastCpPostalCode].
     *
     * Unlike [lastCpPostalCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_cp_postal_code")
    @ExcludeMissing
    fun _lastCpPostalCode(): JsonField<String> = lastCpPostalCode

    /**
     * Returns the raw JSON value of [lastCpTimestamp].
     *
     * Unlike [lastCpTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_cp_timestamp")
    @ExcludeMissing
    fun _lastCpTimestamp(): JsonField<OffsetDateTime> = lastCpTimestamp

    /**
     * Returns the raw JSON value of [lastTxnApprovedAt].
     *
     * Unlike [lastTxnApprovedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_txn_approved_at")
    @ExcludeMissing
    fun _lastTxnApprovedAt(): JsonField<OffsetDateTime> = lastTxnApprovedAt

    /**
     * Returns the raw JSON value of [seenCountries].
     *
     * Unlike [seenCountries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seen_countries")
    @ExcludeMissing
    fun _seenCountries(): JsonField<List<String>> = seenCountries

    /**
     * Returns the raw JSON value of [seenMccs].
     *
     * Unlike [seenMccs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seen_mccs") @ExcludeMissing fun _seenMccs(): JsonField<List<String>> = seenMccs

    /**
     * Returns the raw JSON value of [seenMerchants].
     *
     * Unlike [seenMerchants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seen_merchants")
    @ExcludeMissing
    fun _seenMerchants(): JsonField<List<String>> = seenMerchants

    /**
     * Returns the raw JSON value of [stdevTransactionAmount].
     *
     * Unlike [stdevTransactionAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("stdev_transaction_amount")
    @ExcludeMissing
    fun _stdevTransactionAmount(): JsonField<Double> = stdevTransactionAmount

    /**
     * Returns the raw JSON value of [stdevTransactionAmount30d].
     *
     * Unlike [stdevTransactionAmount30d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("stdev_transaction_amount_30d")
    @ExcludeMissing
    fun _stdevTransactionAmount30d(): JsonField<Double> = stdevTransactionAmount30d

    /**
     * Returns the raw JSON value of [stdevTransactionAmount7d].
     *
     * Unlike [stdevTransactionAmount7d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("stdev_transaction_amount_7d")
    @ExcludeMissing
    fun _stdevTransactionAmount7d(): JsonField<Double> = stdevTransactionAmount7d

    /**
     * Returns the raw JSON value of [stdevTransactionAmount90d].
     *
     * Unlike [stdevTransactionAmount90d], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("stdev_transaction_amount_90d")
    @ExcludeMissing
    fun _stdevTransactionAmount90d(): JsonField<Double> = stdevTransactionAmount90d

    /**
     * Returns the raw JSON value of [threeDSSuccessCount].
     *
     * Unlike [threeDSSuccessCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_ds_success_count")
    @ExcludeMissing
    fun _threeDSSuccessCount(): JsonField<Long> = threeDSSuccessCount

    /**
     * Returns the raw JSON value of [threeDSSuccessRate].
     *
     * Unlike [threeDSSuccessRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_ds_success_rate")
    @ExcludeMissing
    fun _threeDSSuccessRate(): JsonField<Double> = threeDSSuccessRate

    /**
     * Returns the raw JSON value of [threeDSTotalCount].
     *
     * Unlike [threeDSTotalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_ds_total_count")
    @ExcludeMissing
    fun _threeDSTotalCount(): JsonField<Long> = threeDSTotalCount

    /**
     * Returns the raw JSON value of [timeSinceLastTransactionDays].
     *
     * Unlike [timeSinceLastTransactionDays], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("time_since_last_transaction_days")
    @ExcludeMissing
    fun _timeSinceLastTransactionDays(): JsonField<Double> = timeSinceLastTransactionDays

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
         * Returns a mutable builder for constructing an instance of [SignalsResponse].
         *
         * The following fields are required:
         * ```java
         * .approvedTxnAmountM2()
         * .approvedTxnAmountM2_30d()
         * .approvedTxnAmountM2_7d()
         * .approvedTxnAmountM2_90d()
         * .approvedTxnCount()
         * .approvedTxnCount30d()
         * .approvedTxnCount7d()
         * .approvedTxnCount90d()
         * .avgTransactionAmount()
         * .avgTransactionAmount30d()
         * .avgTransactionAmount7d()
         * .avgTransactionAmount90d()
         * .distinctCountryCount()
         * .distinctMccCount()
         * .firstTxnAt()
         * .isFirstTransaction()
         * .lastCpCountry()
         * .lastCpPostalCode()
         * .lastCpTimestamp()
         * .lastTxnApprovedAt()
         * .seenCountries()
         * .seenMccs()
         * .seenMerchants()
         * .stdevTransactionAmount()
         * .stdevTransactionAmount30d()
         * .stdevTransactionAmount7d()
         * .stdevTransactionAmount90d()
         * .threeDSSuccessCount()
         * .threeDSSuccessRate()
         * .threeDSTotalCount()
         * .timeSinceLastTransactionDays()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SignalsResponse]. */
    class Builder internal constructor() {

        private var approvedTxnAmountM2: JsonField<Double>? = null
        private var approvedTxnAmountM2_30d: JsonField<Double>? = null
        private var approvedTxnAmountM2_7d: JsonField<Double>? = null
        private var approvedTxnAmountM2_90d: JsonField<Double>? = null
        private var approvedTxnCount: JsonField<Long>? = null
        private var approvedTxnCount30d: JsonField<Long>? = null
        private var approvedTxnCount7d: JsonField<Long>? = null
        private var approvedTxnCount90d: JsonField<Long>? = null
        private var avgTransactionAmount: JsonField<Double>? = null
        private var avgTransactionAmount30d: JsonField<Double>? = null
        private var avgTransactionAmount7d: JsonField<Double>? = null
        private var avgTransactionAmount90d: JsonField<Double>? = null
        private var distinctCountryCount: JsonField<Long>? = null
        private var distinctMccCount: JsonField<Long>? = null
        private var firstTxnAt: JsonField<OffsetDateTime>? = null
        private var isFirstTransaction: JsonField<Boolean>? = null
        private var lastCpCountry: JsonField<String>? = null
        private var lastCpPostalCode: JsonField<String>? = null
        private var lastCpTimestamp: JsonField<OffsetDateTime>? = null
        private var lastTxnApprovedAt: JsonField<OffsetDateTime>? = null
        private var seenCountries: JsonField<MutableList<String>>? = null
        private var seenMccs: JsonField<MutableList<String>>? = null
        private var seenMerchants: JsonField<MutableList<String>>? = null
        private var stdevTransactionAmount: JsonField<Double>? = null
        private var stdevTransactionAmount30d: JsonField<Double>? = null
        private var stdevTransactionAmount7d: JsonField<Double>? = null
        private var stdevTransactionAmount90d: JsonField<Double>? = null
        private var threeDSSuccessCount: JsonField<Long>? = null
        private var threeDSSuccessRate: JsonField<Double>? = null
        private var threeDSTotalCount: JsonField<Long>? = null
        private var timeSinceLastTransactionDays: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(signalsResponse: SignalsResponse) = apply {
            approvedTxnAmountM2 = signalsResponse.approvedTxnAmountM2
            approvedTxnAmountM2_30d = signalsResponse.approvedTxnAmountM2_30d
            approvedTxnAmountM2_7d = signalsResponse.approvedTxnAmountM2_7d
            approvedTxnAmountM2_90d = signalsResponse.approvedTxnAmountM2_90d
            approvedTxnCount = signalsResponse.approvedTxnCount
            approvedTxnCount30d = signalsResponse.approvedTxnCount30d
            approvedTxnCount7d = signalsResponse.approvedTxnCount7d
            approvedTxnCount90d = signalsResponse.approvedTxnCount90d
            avgTransactionAmount = signalsResponse.avgTransactionAmount
            avgTransactionAmount30d = signalsResponse.avgTransactionAmount30d
            avgTransactionAmount7d = signalsResponse.avgTransactionAmount7d
            avgTransactionAmount90d = signalsResponse.avgTransactionAmount90d
            distinctCountryCount = signalsResponse.distinctCountryCount
            distinctMccCount = signalsResponse.distinctMccCount
            firstTxnAt = signalsResponse.firstTxnAt
            isFirstTransaction = signalsResponse.isFirstTransaction
            lastCpCountry = signalsResponse.lastCpCountry
            lastCpPostalCode = signalsResponse.lastCpPostalCode
            lastCpTimestamp = signalsResponse.lastCpTimestamp
            lastTxnApprovedAt = signalsResponse.lastTxnApprovedAt
            seenCountries = signalsResponse.seenCountries.map { it.toMutableList() }
            seenMccs = signalsResponse.seenMccs.map { it.toMutableList() }
            seenMerchants = signalsResponse.seenMerchants.map { it.toMutableList() }
            stdevTransactionAmount = signalsResponse.stdevTransactionAmount
            stdevTransactionAmount30d = signalsResponse.stdevTransactionAmount30d
            stdevTransactionAmount7d = signalsResponse.stdevTransactionAmount7d
            stdevTransactionAmount90d = signalsResponse.stdevTransactionAmount90d
            threeDSSuccessCount = signalsResponse.threeDSSuccessCount
            threeDSSuccessRate = signalsResponse.threeDSSuccessRate
            threeDSTotalCount = signalsResponse.threeDSTotalCount
            timeSinceLastTransactionDays = signalsResponse.timeSinceLastTransactionDays
            additionalProperties = signalsResponse.additionalProperties.toMutableMap()
        }

        /**
         * The Welford M2 accumulator for lifetime approved transaction amounts. Used together with
         * `avg_transaction_amount` and `approved_txn_count` to compute the z-score of a new
         * transaction amount (variance = M2 / (count - 1)).
         */
        fun approvedTxnAmountM2(approvedTxnAmountM2: Double?) =
            approvedTxnAmountM2(JsonField.ofNullable(approvedTxnAmountM2))

        /**
         * Alias for [Builder.approvedTxnAmountM2].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnAmountM2(approvedTxnAmountM2: Double) =
            approvedTxnAmountM2(approvedTxnAmountM2 as Double?)

        /**
         * Alias for calling [Builder.approvedTxnAmountM2] with `approvedTxnAmountM2.orElse(null)`.
         */
        fun approvedTxnAmountM2(approvedTxnAmountM2: Optional<Double>) =
            approvedTxnAmountM2(approvedTxnAmountM2.getOrNull())

        /**
         * Sets [Builder.approvedTxnAmountM2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnAmountM2] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedTxnAmountM2(approvedTxnAmountM2: JsonField<Double>) = apply {
            this.approvedTxnAmountM2 = approvedTxnAmountM2
        }

        /** The Welford M2 accumulator for approved transaction amounts over the last 30 days. */
        fun approvedTxnAmountM2_30d(approvedTxnAmountM2_30d: Double?) =
            approvedTxnAmountM2_30d(JsonField.ofNullable(approvedTxnAmountM2_30d))

        /**
         * Alias for [Builder.approvedTxnAmountM2_30d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnAmountM2_30d(approvedTxnAmountM2_30d: Double) =
            approvedTxnAmountM2_30d(approvedTxnAmountM2_30d as Double?)

        /**
         * Alias for calling [Builder.approvedTxnAmountM2_30d] with
         * `approvedTxnAmountM2_30d.orElse(null)`.
         */
        fun approvedTxnAmountM2_30d(approvedTxnAmountM2_30d: Optional<Double>) =
            approvedTxnAmountM2_30d(approvedTxnAmountM2_30d.getOrNull())

        /**
         * Sets [Builder.approvedTxnAmountM2_30d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnAmountM2_30d] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun approvedTxnAmountM2_30d(approvedTxnAmountM2_30d: JsonField<Double>) = apply {
            this.approvedTxnAmountM2_30d = approvedTxnAmountM2_30d
        }

        /** The Welford M2 accumulator for approved transaction amounts over the last 7 days. */
        fun approvedTxnAmountM2_7d(approvedTxnAmountM2_7d: Double?) =
            approvedTxnAmountM2_7d(JsonField.ofNullable(approvedTxnAmountM2_7d))

        /**
         * Alias for [Builder.approvedTxnAmountM2_7d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnAmountM2_7d(approvedTxnAmountM2_7d: Double) =
            approvedTxnAmountM2_7d(approvedTxnAmountM2_7d as Double?)

        /**
         * Alias for calling [Builder.approvedTxnAmountM2_7d] with
         * `approvedTxnAmountM2_7d.orElse(null)`.
         */
        fun approvedTxnAmountM2_7d(approvedTxnAmountM2_7d: Optional<Double>) =
            approvedTxnAmountM2_7d(approvedTxnAmountM2_7d.getOrNull())

        /**
         * Sets [Builder.approvedTxnAmountM2_7d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnAmountM2_7d] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedTxnAmountM2_7d(approvedTxnAmountM2_7d: JsonField<Double>) = apply {
            this.approvedTxnAmountM2_7d = approvedTxnAmountM2_7d
        }

        /** The Welford M2 accumulator for approved transaction amounts over the last 90 days. */
        fun approvedTxnAmountM2_90d(approvedTxnAmountM2_90d: Double?) =
            approvedTxnAmountM2_90d(JsonField.ofNullable(approvedTxnAmountM2_90d))

        /**
         * Alias for [Builder.approvedTxnAmountM2_90d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnAmountM2_90d(approvedTxnAmountM2_90d: Double) =
            approvedTxnAmountM2_90d(approvedTxnAmountM2_90d as Double?)

        /**
         * Alias for calling [Builder.approvedTxnAmountM2_90d] with
         * `approvedTxnAmountM2_90d.orElse(null)`.
         */
        fun approvedTxnAmountM2_90d(approvedTxnAmountM2_90d: Optional<Double>) =
            approvedTxnAmountM2_90d(approvedTxnAmountM2_90d.getOrNull())

        /**
         * Sets [Builder.approvedTxnAmountM2_90d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnAmountM2_90d] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun approvedTxnAmountM2_90d(approvedTxnAmountM2_90d: JsonField<Double>) = apply {
            this.approvedTxnAmountM2_90d = approvedTxnAmountM2_90d
        }

        /** The total number of approved transactions over the entity's lifetime. */
        fun approvedTxnCount(approvedTxnCount: Long?) =
            approvedTxnCount(JsonField.ofNullable(approvedTxnCount))

        /**
         * Alias for [Builder.approvedTxnCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnCount(approvedTxnCount: Long) = approvedTxnCount(approvedTxnCount as Long?)

        /** Alias for calling [Builder.approvedTxnCount] with `approvedTxnCount.orElse(null)`. */
        fun approvedTxnCount(approvedTxnCount: Optional<Long>) =
            approvedTxnCount(approvedTxnCount.getOrNull())

        /**
         * Sets [Builder.approvedTxnCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedTxnCount(approvedTxnCount: JsonField<Long>) = apply {
            this.approvedTxnCount = approvedTxnCount
        }

        /** The number of approved transactions in the last 30 days. */
        fun approvedTxnCount30d(approvedTxnCount30d: Long?) =
            approvedTxnCount30d(JsonField.ofNullable(approvedTxnCount30d))

        /**
         * Alias for [Builder.approvedTxnCount30d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnCount30d(approvedTxnCount30d: Long) =
            approvedTxnCount30d(approvedTxnCount30d as Long?)

        /**
         * Alias for calling [Builder.approvedTxnCount30d] with `approvedTxnCount30d.orElse(null)`.
         */
        fun approvedTxnCount30d(approvedTxnCount30d: Optional<Long>) =
            approvedTxnCount30d(approvedTxnCount30d.getOrNull())

        /**
         * Sets [Builder.approvedTxnCount30d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnCount30d] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedTxnCount30d(approvedTxnCount30d: JsonField<Long>) = apply {
            this.approvedTxnCount30d = approvedTxnCount30d
        }

        /** The number of approved transactions in the last 7 days. */
        fun approvedTxnCount7d(approvedTxnCount7d: Long?) =
            approvedTxnCount7d(JsonField.ofNullable(approvedTxnCount7d))

        /**
         * Alias for [Builder.approvedTxnCount7d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnCount7d(approvedTxnCount7d: Long) =
            approvedTxnCount7d(approvedTxnCount7d as Long?)

        /**
         * Alias for calling [Builder.approvedTxnCount7d] with `approvedTxnCount7d.orElse(null)`.
         */
        fun approvedTxnCount7d(approvedTxnCount7d: Optional<Long>) =
            approvedTxnCount7d(approvedTxnCount7d.getOrNull())

        /**
         * Sets [Builder.approvedTxnCount7d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnCount7d] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedTxnCount7d(approvedTxnCount7d: JsonField<Long>) = apply {
            this.approvedTxnCount7d = approvedTxnCount7d
        }

        /** The number of approved transactions in the last 90 days. */
        fun approvedTxnCount90d(approvedTxnCount90d: Long?) =
            approvedTxnCount90d(JsonField.ofNullable(approvedTxnCount90d))

        /**
         * Alias for [Builder.approvedTxnCount90d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun approvedTxnCount90d(approvedTxnCount90d: Long) =
            approvedTxnCount90d(approvedTxnCount90d as Long?)

        /**
         * Alias for calling [Builder.approvedTxnCount90d] with `approvedTxnCount90d.orElse(null)`.
         */
        fun approvedTxnCount90d(approvedTxnCount90d: Optional<Long>) =
            approvedTxnCount90d(approvedTxnCount90d.getOrNull())

        /**
         * Sets [Builder.approvedTxnCount90d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedTxnCount90d] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedTxnCount90d(approvedTxnCount90d: JsonField<Long>) = apply {
            this.approvedTxnCount90d = approvedTxnCount90d
        }

        /**
         * The average approved transaction amount over the entity's lifetime, in cents. Null if
         * fewer than 5 approved transactions have been recorded.
         */
        fun avgTransactionAmount(avgTransactionAmount: Double?) =
            avgTransactionAmount(JsonField.ofNullable(avgTransactionAmount))

        /**
         * Alias for [Builder.avgTransactionAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun avgTransactionAmount(avgTransactionAmount: Double) =
            avgTransactionAmount(avgTransactionAmount as Double?)

        /**
         * Alias for calling [Builder.avgTransactionAmount] with
         * `avgTransactionAmount.orElse(null)`.
         */
        fun avgTransactionAmount(avgTransactionAmount: Optional<Double>) =
            avgTransactionAmount(avgTransactionAmount.getOrNull())

        /**
         * Sets [Builder.avgTransactionAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgTransactionAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avgTransactionAmount(avgTransactionAmount: JsonField<Double>) = apply {
            this.avgTransactionAmount = avgTransactionAmount
        }

        /**
         * The average approved transaction amount over the last 30 days, in cents. Null if fewer
         * than 5 approved transactions in window.
         */
        fun avgTransactionAmount30d(avgTransactionAmount30d: Double?) =
            avgTransactionAmount30d(JsonField.ofNullable(avgTransactionAmount30d))

        /**
         * Alias for [Builder.avgTransactionAmount30d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun avgTransactionAmount30d(avgTransactionAmount30d: Double) =
            avgTransactionAmount30d(avgTransactionAmount30d as Double?)

        /**
         * Alias for calling [Builder.avgTransactionAmount30d] with
         * `avgTransactionAmount30d.orElse(null)`.
         */
        fun avgTransactionAmount30d(avgTransactionAmount30d: Optional<Double>) =
            avgTransactionAmount30d(avgTransactionAmount30d.getOrNull())

        /**
         * Sets [Builder.avgTransactionAmount30d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgTransactionAmount30d] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun avgTransactionAmount30d(avgTransactionAmount30d: JsonField<Double>) = apply {
            this.avgTransactionAmount30d = avgTransactionAmount30d
        }

        /**
         * The average approved transaction amount over the last 7 days, in cents. Null if fewer
         * than 5 approved transactions in window.
         */
        fun avgTransactionAmount7d(avgTransactionAmount7d: Double?) =
            avgTransactionAmount7d(JsonField.ofNullable(avgTransactionAmount7d))

        /**
         * Alias for [Builder.avgTransactionAmount7d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun avgTransactionAmount7d(avgTransactionAmount7d: Double) =
            avgTransactionAmount7d(avgTransactionAmount7d as Double?)

        /**
         * Alias for calling [Builder.avgTransactionAmount7d] with
         * `avgTransactionAmount7d.orElse(null)`.
         */
        fun avgTransactionAmount7d(avgTransactionAmount7d: Optional<Double>) =
            avgTransactionAmount7d(avgTransactionAmount7d.getOrNull())

        /**
         * Sets [Builder.avgTransactionAmount7d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgTransactionAmount7d] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avgTransactionAmount7d(avgTransactionAmount7d: JsonField<Double>) = apply {
            this.avgTransactionAmount7d = avgTransactionAmount7d
        }

        /**
         * The average approved transaction amount over the last 90 days, in cents. Null if fewer
         * than 5 approved transactions in window.
         */
        fun avgTransactionAmount90d(avgTransactionAmount90d: Double?) =
            avgTransactionAmount90d(JsonField.ofNullable(avgTransactionAmount90d))

        /**
         * Alias for [Builder.avgTransactionAmount90d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun avgTransactionAmount90d(avgTransactionAmount90d: Double) =
            avgTransactionAmount90d(avgTransactionAmount90d as Double?)

        /**
         * Alias for calling [Builder.avgTransactionAmount90d] with
         * `avgTransactionAmount90d.orElse(null)`.
         */
        fun avgTransactionAmount90d(avgTransactionAmount90d: Optional<Double>) =
            avgTransactionAmount90d(avgTransactionAmount90d.getOrNull())

        /**
         * Sets [Builder.avgTransactionAmount90d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgTransactionAmount90d] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun avgTransactionAmount90d(avgTransactionAmount90d: JsonField<Double>) = apply {
            this.avgTransactionAmount90d = avgTransactionAmount90d
        }

        /** The number of distinct merchant countries seen in the entity's transaction history. */
        fun distinctCountryCount(distinctCountryCount: Long?) =
            distinctCountryCount(JsonField.ofNullable(distinctCountryCount))

        /**
         * Alias for [Builder.distinctCountryCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun distinctCountryCount(distinctCountryCount: Long) =
            distinctCountryCount(distinctCountryCount as Long?)

        /**
         * Alias for calling [Builder.distinctCountryCount] with
         * `distinctCountryCount.orElse(null)`.
         */
        fun distinctCountryCount(distinctCountryCount: Optional<Long>) =
            distinctCountryCount(distinctCountryCount.getOrNull())

        /**
         * Sets [Builder.distinctCountryCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distinctCountryCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distinctCountryCount(distinctCountryCount: JsonField<Long>) = apply {
            this.distinctCountryCount = distinctCountryCount
        }

        /** The number of distinct MCCs seen in the entity's transaction history. */
        fun distinctMccCount(distinctMccCount: Long?) =
            distinctMccCount(JsonField.ofNullable(distinctMccCount))

        /**
         * Alias for [Builder.distinctMccCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun distinctMccCount(distinctMccCount: Long) = distinctMccCount(distinctMccCount as Long?)

        /** Alias for calling [Builder.distinctMccCount] with `distinctMccCount.orElse(null)`. */
        fun distinctMccCount(distinctMccCount: Optional<Long>) =
            distinctMccCount(distinctMccCount.getOrNull())

        /**
         * Sets [Builder.distinctMccCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distinctMccCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distinctMccCount(distinctMccCount: JsonField<Long>) = apply {
            this.distinctMccCount = distinctMccCount
        }

        /** The timestamp of the first approved transaction for the entity, in ISO 8601 format. */
        fun firstTxnAt(firstTxnAt: OffsetDateTime?) = firstTxnAt(JsonField.ofNullable(firstTxnAt))

        /** Alias for calling [Builder.firstTxnAt] with `firstTxnAt.orElse(null)`. */
        fun firstTxnAt(firstTxnAt: Optional<OffsetDateTime>) = firstTxnAt(firstTxnAt.getOrNull())

        /**
         * Sets [Builder.firstTxnAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTxnAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstTxnAt(firstTxnAt: JsonField<OffsetDateTime>) = apply {
            this.firstTxnAt = firstTxnAt
        }

        /**
         * Whether the entity has no prior transaction history. Returns true if no history is found.
         * Null if transaction history exists but a first transaction timestamp is unavailable.
         */
        fun isFirstTransaction(isFirstTransaction: Boolean?) =
            isFirstTransaction(JsonField.ofNullable(isFirstTransaction))

        /**
         * Alias for [Builder.isFirstTransaction].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isFirstTransaction(isFirstTransaction: Boolean) =
            isFirstTransaction(isFirstTransaction as Boolean?)

        /**
         * Alias for calling [Builder.isFirstTransaction] with `isFirstTransaction.orElse(null)`.
         */
        fun isFirstTransaction(isFirstTransaction: Optional<Boolean>) =
            isFirstTransaction(isFirstTransaction.getOrNull())

        /**
         * Sets [Builder.isFirstTransaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFirstTransaction] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isFirstTransaction(isFirstTransaction: JsonField<Boolean>) = apply {
            this.isFirstTransaction = isFirstTransaction
        }

        /** The merchant country of the last card-present transaction. */
        fun lastCpCountry(lastCpCountry: String?) =
            lastCpCountry(JsonField.ofNullable(lastCpCountry))

        /** Alias for calling [Builder.lastCpCountry] with `lastCpCountry.orElse(null)`. */
        fun lastCpCountry(lastCpCountry: Optional<String>) =
            lastCpCountry(lastCpCountry.getOrNull())

        /**
         * Sets [Builder.lastCpCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastCpCountry] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastCpCountry(lastCpCountry: JsonField<String>) = apply {
            this.lastCpCountry = lastCpCountry
        }

        /** The merchant postal code of the last card-present transaction. */
        fun lastCpPostalCode(lastCpPostalCode: String?) =
            lastCpPostalCode(JsonField.ofNullable(lastCpPostalCode))

        /** Alias for calling [Builder.lastCpPostalCode] with `lastCpPostalCode.orElse(null)`. */
        fun lastCpPostalCode(lastCpPostalCode: Optional<String>) =
            lastCpPostalCode(lastCpPostalCode.getOrNull())

        /**
         * Sets [Builder.lastCpPostalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastCpPostalCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastCpPostalCode(lastCpPostalCode: JsonField<String>) = apply {
            this.lastCpPostalCode = lastCpPostalCode
        }

        /** The timestamp of the last card-present transaction, in ISO 8601 format. */
        fun lastCpTimestamp(lastCpTimestamp: OffsetDateTime?) =
            lastCpTimestamp(JsonField.ofNullable(lastCpTimestamp))

        /** Alias for calling [Builder.lastCpTimestamp] with `lastCpTimestamp.orElse(null)`. */
        fun lastCpTimestamp(lastCpTimestamp: Optional<OffsetDateTime>) =
            lastCpTimestamp(lastCpTimestamp.getOrNull())

        /**
         * Sets [Builder.lastCpTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastCpTimestamp] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastCpTimestamp(lastCpTimestamp: JsonField<OffsetDateTime>) = apply {
            this.lastCpTimestamp = lastCpTimestamp
        }

        /**
         * The timestamp of the most recent approved transaction for the entity, in ISO 8601 format.
         */
        fun lastTxnApprovedAt(lastTxnApprovedAt: OffsetDateTime?) =
            lastTxnApprovedAt(JsonField.ofNullable(lastTxnApprovedAt))

        /** Alias for calling [Builder.lastTxnApprovedAt] with `lastTxnApprovedAt.orElse(null)`. */
        fun lastTxnApprovedAt(lastTxnApprovedAt: Optional<OffsetDateTime>) =
            lastTxnApprovedAt(lastTxnApprovedAt.getOrNull())

        /**
         * Sets [Builder.lastTxnApprovedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastTxnApprovedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastTxnApprovedAt(lastTxnApprovedAt: JsonField<OffsetDateTime>) = apply {
            this.lastTxnApprovedAt = lastTxnApprovedAt
        }

        /**
         * The set of merchant countries seen in the entity's transaction history. Clients can use
         * this to determine whether a new transaction's country is novel (i.e. compute
         * `is_new_country`).
         */
        fun seenCountries(seenCountries: List<String>?) =
            seenCountries(JsonField.ofNullable(seenCountries))

        /** Alias for calling [Builder.seenCountries] with `seenCountries.orElse(null)`. */
        fun seenCountries(seenCountries: Optional<List<String>>) =
            seenCountries(seenCountries.getOrNull())

        /**
         * Sets [Builder.seenCountries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seenCountries] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seenCountries(seenCountries: JsonField<List<String>>) = apply {
            this.seenCountries = seenCountries.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [seenCountries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeenCountry(seenCountry: String) = apply {
            seenCountries =
                (seenCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seenCountries", it).add(seenCountry)
                }
        }

        /**
         * The set of MCCs seen in the entity's transaction history. Clients can use this to
         * determine whether a new transaction's MCC is novel (i.e. compute `is_new_mcc`).
         */
        fun seenMccs(seenMccs: List<String>?) = seenMccs(JsonField.ofNullable(seenMccs))

        /** Alias for calling [Builder.seenMccs] with `seenMccs.orElse(null)`. */
        fun seenMccs(seenMccs: Optional<List<String>>) = seenMccs(seenMccs.getOrNull())

        /**
         * Sets [Builder.seenMccs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seenMccs] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seenMccs(seenMccs: JsonField<List<String>>) = apply {
            this.seenMccs = seenMccs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [seenMccs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeenMcc(seenMcc: String) = apply {
            seenMccs =
                (seenMccs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seenMccs", it).add(seenMcc)
                }
        }

        /**
         * The set of card acceptor IDs seen in the card's approved transaction history, capped at
         * the 1000 most recently seen. Null for account responses. Clients can use this to
         * determine whether a new transaction's merchant is novel (i.e. compute `is_new_merchant`).
         */
        fun seenMerchants(seenMerchants: List<String>?) =
            seenMerchants(JsonField.ofNullable(seenMerchants))

        /** Alias for calling [Builder.seenMerchants] with `seenMerchants.orElse(null)`. */
        fun seenMerchants(seenMerchants: Optional<List<String>>) =
            seenMerchants(seenMerchants.getOrNull())

        /**
         * Sets [Builder.seenMerchants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seenMerchants] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seenMerchants(seenMerchants: JsonField<List<String>>) = apply {
            this.seenMerchants = seenMerchants.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [seenMerchants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeenMerchant(seenMerchant: String) = apply {
            seenMerchants =
                (seenMerchants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("seenMerchants", it).add(seenMerchant)
                }
        }

        /**
         * The standard deviation of approved transaction amounts over the entity's lifetime, in
         * cents. Null if fewer than 30 approved transactions have been recorded.
         */
        fun stdevTransactionAmount(stdevTransactionAmount: Double?) =
            stdevTransactionAmount(JsonField.ofNullable(stdevTransactionAmount))

        /**
         * Alias for [Builder.stdevTransactionAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stdevTransactionAmount(stdevTransactionAmount: Double) =
            stdevTransactionAmount(stdevTransactionAmount as Double?)

        /**
         * Alias for calling [Builder.stdevTransactionAmount] with
         * `stdevTransactionAmount.orElse(null)`.
         */
        fun stdevTransactionAmount(stdevTransactionAmount: Optional<Double>) =
            stdevTransactionAmount(stdevTransactionAmount.getOrNull())

        /**
         * Sets [Builder.stdevTransactionAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdevTransactionAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stdevTransactionAmount(stdevTransactionAmount: JsonField<Double>) = apply {
            this.stdevTransactionAmount = stdevTransactionAmount
        }

        /**
         * The standard deviation of approved transaction amounts over the last 30 days, in cents.
         * Null if fewer than 30 approved transactions in window.
         */
        fun stdevTransactionAmount30d(stdevTransactionAmount30d: Double?) =
            stdevTransactionAmount30d(JsonField.ofNullable(stdevTransactionAmount30d))

        /**
         * Alias for [Builder.stdevTransactionAmount30d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stdevTransactionAmount30d(stdevTransactionAmount30d: Double) =
            stdevTransactionAmount30d(stdevTransactionAmount30d as Double?)

        /**
         * Alias for calling [Builder.stdevTransactionAmount30d] with
         * `stdevTransactionAmount30d.orElse(null)`.
         */
        fun stdevTransactionAmount30d(stdevTransactionAmount30d: Optional<Double>) =
            stdevTransactionAmount30d(stdevTransactionAmount30d.getOrNull())

        /**
         * Sets [Builder.stdevTransactionAmount30d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdevTransactionAmount30d] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stdevTransactionAmount30d(stdevTransactionAmount30d: JsonField<Double>) = apply {
            this.stdevTransactionAmount30d = stdevTransactionAmount30d
        }

        /**
         * The standard deviation of approved transaction amounts over the last 7 days, in cents.
         * Null if fewer than 30 approved transactions in window.
         */
        fun stdevTransactionAmount7d(stdevTransactionAmount7d: Double?) =
            stdevTransactionAmount7d(JsonField.ofNullable(stdevTransactionAmount7d))

        /**
         * Alias for [Builder.stdevTransactionAmount7d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stdevTransactionAmount7d(stdevTransactionAmount7d: Double) =
            stdevTransactionAmount7d(stdevTransactionAmount7d as Double?)

        /**
         * Alias for calling [Builder.stdevTransactionAmount7d] with
         * `stdevTransactionAmount7d.orElse(null)`.
         */
        fun stdevTransactionAmount7d(stdevTransactionAmount7d: Optional<Double>) =
            stdevTransactionAmount7d(stdevTransactionAmount7d.getOrNull())

        /**
         * Sets [Builder.stdevTransactionAmount7d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdevTransactionAmount7d] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stdevTransactionAmount7d(stdevTransactionAmount7d: JsonField<Double>) = apply {
            this.stdevTransactionAmount7d = stdevTransactionAmount7d
        }

        /**
         * The standard deviation of approved transaction amounts over the last 90 days, in cents.
         * Null if fewer than 30 approved transactions in window.
         */
        fun stdevTransactionAmount90d(stdevTransactionAmount90d: Double?) =
            stdevTransactionAmount90d(JsonField.ofNullable(stdevTransactionAmount90d))

        /**
         * Alias for [Builder.stdevTransactionAmount90d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stdevTransactionAmount90d(stdevTransactionAmount90d: Double) =
            stdevTransactionAmount90d(stdevTransactionAmount90d as Double?)

        /**
         * Alias for calling [Builder.stdevTransactionAmount90d] with
         * `stdevTransactionAmount90d.orElse(null)`.
         */
        fun stdevTransactionAmount90d(stdevTransactionAmount90d: Optional<Double>) =
            stdevTransactionAmount90d(stdevTransactionAmount90d.getOrNull())

        /**
         * Sets [Builder.stdevTransactionAmount90d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdevTransactionAmount90d] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stdevTransactionAmount90d(stdevTransactionAmount90d: JsonField<Double>) = apply {
            this.stdevTransactionAmount90d = stdevTransactionAmount90d
        }

        /**
         * The number of successful 3DS authentications for the card. Null for account responses.
         */
        fun threeDSSuccessCount(threeDSSuccessCount: Long?) =
            threeDSSuccessCount(JsonField.ofNullable(threeDSSuccessCount))

        /**
         * Alias for [Builder.threeDSSuccessCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun threeDSSuccessCount(threeDSSuccessCount: Long) =
            threeDSSuccessCount(threeDSSuccessCount as Long?)

        /**
         * Alias for calling [Builder.threeDSSuccessCount] with `threeDSSuccessCount.orElse(null)`.
         */
        fun threeDSSuccessCount(threeDSSuccessCount: Optional<Long>) =
            threeDSSuccessCount(threeDSSuccessCount.getOrNull())

        /**
         * Sets [Builder.threeDSSuccessCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeDSSuccessCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threeDSSuccessCount(threeDSSuccessCount: JsonField<Long>) = apply {
            this.threeDSSuccessCount = threeDSSuccessCount
        }

        /**
         * The 3DS authentication success rate for the card, as a percentage from 0.0 to 100.0. Null
         * for account responses.
         */
        fun threeDSSuccessRate(threeDSSuccessRate: Double?) =
            threeDSSuccessRate(JsonField.ofNullable(threeDSSuccessRate))

        /**
         * Alias for [Builder.threeDSSuccessRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun threeDSSuccessRate(threeDSSuccessRate: Double) =
            threeDSSuccessRate(threeDSSuccessRate as Double?)

        /**
         * Alias for calling [Builder.threeDSSuccessRate] with `threeDSSuccessRate.orElse(null)`.
         */
        fun threeDSSuccessRate(threeDSSuccessRate: Optional<Double>) =
            threeDSSuccessRate(threeDSSuccessRate.getOrNull())

        /**
         * Sets [Builder.threeDSSuccessRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeDSSuccessRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threeDSSuccessRate(threeDSSuccessRate: JsonField<Double>) = apply {
            this.threeDSSuccessRate = threeDSSuccessRate
        }

        /**
         * The total number of 3DS authentication attempts for the card. Null for account responses.
         */
        fun threeDSTotalCount(threeDSTotalCount: Long?) =
            threeDSTotalCount(JsonField.ofNullable(threeDSTotalCount))

        /**
         * Alias for [Builder.threeDSTotalCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun threeDSTotalCount(threeDSTotalCount: Long) =
            threeDSTotalCount(threeDSTotalCount as Long?)

        /** Alias for calling [Builder.threeDSTotalCount] with `threeDSTotalCount.orElse(null)`. */
        fun threeDSTotalCount(threeDSTotalCount: Optional<Long>) =
            threeDSTotalCount(threeDSTotalCount.getOrNull())

        /**
         * Sets [Builder.threeDSTotalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeDSTotalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threeDSTotalCount(threeDSTotalCount: JsonField<Long>) = apply {
            this.threeDSTotalCount = threeDSTotalCount
        }

        /** The number of days since the last approved transaction on the entity. */
        fun timeSinceLastTransactionDays(timeSinceLastTransactionDays: Double?) =
            timeSinceLastTransactionDays(JsonField.ofNullable(timeSinceLastTransactionDays))

        /**
         * Alias for [Builder.timeSinceLastTransactionDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeSinceLastTransactionDays(timeSinceLastTransactionDays: Double) =
            timeSinceLastTransactionDays(timeSinceLastTransactionDays as Double?)

        /**
         * Alias for calling [Builder.timeSinceLastTransactionDays] with
         * `timeSinceLastTransactionDays.orElse(null)`.
         */
        fun timeSinceLastTransactionDays(timeSinceLastTransactionDays: Optional<Double>) =
            timeSinceLastTransactionDays(timeSinceLastTransactionDays.getOrNull())

        /**
         * Sets [Builder.timeSinceLastTransactionDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeSinceLastTransactionDays] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun timeSinceLastTransactionDays(timeSinceLastTransactionDays: JsonField<Double>) = apply {
            this.timeSinceLastTransactionDays = timeSinceLastTransactionDays
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
         * Returns an immutable instance of [SignalsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .approvedTxnAmountM2()
         * .approvedTxnAmountM2_30d()
         * .approvedTxnAmountM2_7d()
         * .approvedTxnAmountM2_90d()
         * .approvedTxnCount()
         * .approvedTxnCount30d()
         * .approvedTxnCount7d()
         * .approvedTxnCount90d()
         * .avgTransactionAmount()
         * .avgTransactionAmount30d()
         * .avgTransactionAmount7d()
         * .avgTransactionAmount90d()
         * .distinctCountryCount()
         * .distinctMccCount()
         * .firstTxnAt()
         * .isFirstTransaction()
         * .lastCpCountry()
         * .lastCpPostalCode()
         * .lastCpTimestamp()
         * .lastTxnApprovedAt()
         * .seenCountries()
         * .seenMccs()
         * .seenMerchants()
         * .stdevTransactionAmount()
         * .stdevTransactionAmount30d()
         * .stdevTransactionAmount7d()
         * .stdevTransactionAmount90d()
         * .threeDSSuccessCount()
         * .threeDSSuccessRate()
         * .threeDSTotalCount()
         * .timeSinceLastTransactionDays()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SignalsResponse =
            SignalsResponse(
                checkRequired("approvedTxnAmountM2", approvedTxnAmountM2),
                checkRequired("approvedTxnAmountM2_30d", approvedTxnAmountM2_30d),
                checkRequired("approvedTxnAmountM2_7d", approvedTxnAmountM2_7d),
                checkRequired("approvedTxnAmountM2_90d", approvedTxnAmountM2_90d),
                checkRequired("approvedTxnCount", approvedTxnCount),
                checkRequired("approvedTxnCount30d", approvedTxnCount30d),
                checkRequired("approvedTxnCount7d", approvedTxnCount7d),
                checkRequired("approvedTxnCount90d", approvedTxnCount90d),
                checkRequired("avgTransactionAmount", avgTransactionAmount),
                checkRequired("avgTransactionAmount30d", avgTransactionAmount30d),
                checkRequired("avgTransactionAmount7d", avgTransactionAmount7d),
                checkRequired("avgTransactionAmount90d", avgTransactionAmount90d),
                checkRequired("distinctCountryCount", distinctCountryCount),
                checkRequired("distinctMccCount", distinctMccCount),
                checkRequired("firstTxnAt", firstTxnAt),
                checkRequired("isFirstTransaction", isFirstTransaction),
                checkRequired("lastCpCountry", lastCpCountry),
                checkRequired("lastCpPostalCode", lastCpPostalCode),
                checkRequired("lastCpTimestamp", lastCpTimestamp),
                checkRequired("lastTxnApprovedAt", lastTxnApprovedAt),
                checkRequired("seenCountries", seenCountries).map { it.toImmutable() },
                checkRequired("seenMccs", seenMccs).map { it.toImmutable() },
                checkRequired("seenMerchants", seenMerchants).map { it.toImmutable() },
                checkRequired("stdevTransactionAmount", stdevTransactionAmount),
                checkRequired("stdevTransactionAmount30d", stdevTransactionAmount30d),
                checkRequired("stdevTransactionAmount7d", stdevTransactionAmount7d),
                checkRequired("stdevTransactionAmount90d", stdevTransactionAmount90d),
                checkRequired("threeDSSuccessCount", threeDSSuccessCount),
                checkRequired("threeDSSuccessRate", threeDSSuccessRate),
                checkRequired("threeDSTotalCount", threeDSTotalCount),
                checkRequired("timeSinceLastTransactionDays", timeSinceLastTransactionDays),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SignalsResponse = apply {
        if (validated) {
            return@apply
        }

        approvedTxnAmountM2()
        approvedTxnAmountM2_30d()
        approvedTxnAmountM2_7d()
        approvedTxnAmountM2_90d()
        approvedTxnCount()
        approvedTxnCount30d()
        approvedTxnCount7d()
        approvedTxnCount90d()
        avgTransactionAmount()
        avgTransactionAmount30d()
        avgTransactionAmount7d()
        avgTransactionAmount90d()
        distinctCountryCount()
        distinctMccCount()
        firstTxnAt()
        isFirstTransaction()
        lastCpCountry()
        lastCpPostalCode()
        lastCpTimestamp()
        lastTxnApprovedAt()
        seenCountries()
        seenMccs()
        seenMerchants()
        stdevTransactionAmount()
        stdevTransactionAmount30d()
        stdevTransactionAmount7d()
        stdevTransactionAmount90d()
        threeDSSuccessCount()
        threeDSSuccessRate()
        threeDSTotalCount()
        timeSinceLastTransactionDays()
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
        (if (approvedTxnAmountM2.asKnown().isPresent) 1 else 0) +
            (if (approvedTxnAmountM2_30d.asKnown().isPresent) 1 else 0) +
            (if (approvedTxnAmountM2_7d.asKnown().isPresent) 1 else 0) +
            (if (approvedTxnAmountM2_90d.asKnown().isPresent) 1 else 0) +
            (if (approvedTxnCount.asKnown().isPresent) 1 else 0) +
            (if (approvedTxnCount30d.asKnown().isPresent) 1 else 0) +
            (if (approvedTxnCount7d.asKnown().isPresent) 1 else 0) +
            (if (approvedTxnCount90d.asKnown().isPresent) 1 else 0) +
            (if (avgTransactionAmount.asKnown().isPresent) 1 else 0) +
            (if (avgTransactionAmount30d.asKnown().isPresent) 1 else 0) +
            (if (avgTransactionAmount7d.asKnown().isPresent) 1 else 0) +
            (if (avgTransactionAmount90d.asKnown().isPresent) 1 else 0) +
            (if (distinctCountryCount.asKnown().isPresent) 1 else 0) +
            (if (distinctMccCount.asKnown().isPresent) 1 else 0) +
            (if (firstTxnAt.asKnown().isPresent) 1 else 0) +
            (if (isFirstTransaction.asKnown().isPresent) 1 else 0) +
            (if (lastCpCountry.asKnown().isPresent) 1 else 0) +
            (if (lastCpPostalCode.asKnown().isPresent) 1 else 0) +
            (if (lastCpTimestamp.asKnown().isPresent) 1 else 0) +
            (if (lastTxnApprovedAt.asKnown().isPresent) 1 else 0) +
            (seenCountries.asKnown().getOrNull()?.size ?: 0) +
            (seenMccs.asKnown().getOrNull()?.size ?: 0) +
            (seenMerchants.asKnown().getOrNull()?.size ?: 0) +
            (if (stdevTransactionAmount.asKnown().isPresent) 1 else 0) +
            (if (stdevTransactionAmount30d.asKnown().isPresent) 1 else 0) +
            (if (stdevTransactionAmount7d.asKnown().isPresent) 1 else 0) +
            (if (stdevTransactionAmount90d.asKnown().isPresent) 1 else 0) +
            (if (threeDSSuccessCount.asKnown().isPresent) 1 else 0) +
            (if (threeDSSuccessRate.asKnown().isPresent) 1 else 0) +
            (if (threeDSTotalCount.asKnown().isPresent) 1 else 0) +
            (if (timeSinceLastTransactionDays.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignalsResponse &&
            approvedTxnAmountM2 == other.approvedTxnAmountM2 &&
            approvedTxnAmountM2_30d == other.approvedTxnAmountM2_30d &&
            approvedTxnAmountM2_7d == other.approvedTxnAmountM2_7d &&
            approvedTxnAmountM2_90d == other.approvedTxnAmountM2_90d &&
            approvedTxnCount == other.approvedTxnCount &&
            approvedTxnCount30d == other.approvedTxnCount30d &&
            approvedTxnCount7d == other.approvedTxnCount7d &&
            approvedTxnCount90d == other.approvedTxnCount90d &&
            avgTransactionAmount == other.avgTransactionAmount &&
            avgTransactionAmount30d == other.avgTransactionAmount30d &&
            avgTransactionAmount7d == other.avgTransactionAmount7d &&
            avgTransactionAmount90d == other.avgTransactionAmount90d &&
            distinctCountryCount == other.distinctCountryCount &&
            distinctMccCount == other.distinctMccCount &&
            firstTxnAt == other.firstTxnAt &&
            isFirstTransaction == other.isFirstTransaction &&
            lastCpCountry == other.lastCpCountry &&
            lastCpPostalCode == other.lastCpPostalCode &&
            lastCpTimestamp == other.lastCpTimestamp &&
            lastTxnApprovedAt == other.lastTxnApprovedAt &&
            seenCountries == other.seenCountries &&
            seenMccs == other.seenMccs &&
            seenMerchants == other.seenMerchants &&
            stdevTransactionAmount == other.stdevTransactionAmount &&
            stdevTransactionAmount30d == other.stdevTransactionAmount30d &&
            stdevTransactionAmount7d == other.stdevTransactionAmount7d &&
            stdevTransactionAmount90d == other.stdevTransactionAmount90d &&
            threeDSSuccessCount == other.threeDSSuccessCount &&
            threeDSSuccessRate == other.threeDSSuccessRate &&
            threeDSTotalCount == other.threeDSTotalCount &&
            timeSinceLastTransactionDays == other.timeSinceLastTransactionDays &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            approvedTxnAmountM2,
            approvedTxnAmountM2_30d,
            approvedTxnAmountM2_7d,
            approvedTxnAmountM2_90d,
            approvedTxnCount,
            approvedTxnCount30d,
            approvedTxnCount7d,
            approvedTxnCount90d,
            avgTransactionAmount,
            avgTransactionAmount30d,
            avgTransactionAmount7d,
            avgTransactionAmount90d,
            distinctCountryCount,
            distinctMccCount,
            firstTxnAt,
            isFirstTransaction,
            lastCpCountry,
            lastCpPostalCode,
            lastCpTimestamp,
            lastTxnApprovedAt,
            seenCountries,
            seenMccs,
            seenMerchants,
            stdevTransactionAmount,
            stdevTransactionAmount30d,
            stdevTransactionAmount7d,
            stdevTransactionAmount90d,
            threeDSSuccessCount,
            threeDSSuccessRate,
            threeDSTotalCount,
            timeSinceLastTransactionDays,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SignalsResponse{approvedTxnAmountM2=$approvedTxnAmountM2, approvedTxnAmountM2_30d=$approvedTxnAmountM2_30d, approvedTxnAmountM2_7d=$approvedTxnAmountM2_7d, approvedTxnAmountM2_90d=$approvedTxnAmountM2_90d, approvedTxnCount=$approvedTxnCount, approvedTxnCount30d=$approvedTxnCount30d, approvedTxnCount7d=$approvedTxnCount7d, approvedTxnCount90d=$approvedTxnCount90d, avgTransactionAmount=$avgTransactionAmount, avgTransactionAmount30d=$avgTransactionAmount30d, avgTransactionAmount7d=$avgTransactionAmount7d, avgTransactionAmount90d=$avgTransactionAmount90d, distinctCountryCount=$distinctCountryCount, distinctMccCount=$distinctMccCount, firstTxnAt=$firstTxnAt, isFirstTransaction=$isFirstTransaction, lastCpCountry=$lastCpCountry, lastCpPostalCode=$lastCpPostalCode, lastCpTimestamp=$lastCpTimestamp, lastTxnApprovedAt=$lastTxnApprovedAt, seenCountries=$seenCountries, seenMccs=$seenMccs, seenMerchants=$seenMerchants, stdevTransactionAmount=$stdevTransactionAmount, stdevTransactionAmount30d=$stdevTransactionAmount30d, stdevTransactionAmount7d=$stdevTransactionAmount7d, stdevTransactionAmount90d=$stdevTransactionAmount90d, threeDSSuccessCount=$threeDSSuccessCount, threeDSSuccessRate=$threeDSSuccessRate, threeDSTotalCount=$threeDSTotalCount, timeSinceLastTransactionDays=$timeSinceLastTransactionDays, additionalProperties=$additionalProperties}"
}
