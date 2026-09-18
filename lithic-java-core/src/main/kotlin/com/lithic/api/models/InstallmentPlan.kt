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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InstallmentPlan
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val closedAt: JsonField<LocalDate>,
    private val created: JsonField<OffsetDateTime>,
    private val feeAmount: JsonField<Long>,
    private val financialAccountToken: JsonField<String>,
    private val installmentPlanTotal: JsonField<Long>,
    private val installments: JsonField<List<Installment>>,
    private val installmentsOutstanding: JsonField<Long>,
    private val installmentsPaid: JsonField<Long>,
    private val numInstallments: JsonField<Long>,
    private val principalAmount: JsonField<Long>,
    private val sourceAmounts: JsonField<TransactionCategoryBalances>,
    private val sourceId: JsonField<String>,
    private val sourceType: JsonField<InstallmentPlanSource>,
    private val startDate: JsonField<LocalDate>,
    private val state: JsonField<InstallmentPlanState>,
    private val totalPaid: JsonField<Long>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("closed_at")
        @ExcludeMissing
        closedAt: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fee_amount") @ExcludeMissing feeAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("installment_plan_total")
        @ExcludeMissing
        installmentPlanTotal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("installments")
        @ExcludeMissing
        installments: JsonField<List<Installment>> = JsonMissing.of(),
        @JsonProperty("installments_outstanding")
        @ExcludeMissing
        installmentsOutstanding: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("installments_paid")
        @ExcludeMissing
        installmentsPaid: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_installments")
        @ExcludeMissing
        numInstallments: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("principal_amount")
        @ExcludeMissing
        principalAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source_amounts")
        @ExcludeMissing
        sourceAmounts: JsonField<TransactionCategoryBalances> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_type")
        @ExcludeMissing
        sourceType: JsonField<InstallmentPlanSource> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        state: JsonField<InstallmentPlanState> = JsonMissing.of(),
        @JsonProperty("total_paid") @ExcludeMissing totalPaid: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        closedAt,
        created,
        feeAmount,
        financialAccountToken,
        installmentPlanTotal,
        installments,
        installmentsOutstanding,
        installmentsPaid,
        numInstallments,
        principalAmount,
        sourceAmounts,
        sourceId,
        sourceType,
        startDate,
        state,
        totalPaid,
        updated,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for an installment plan
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Date the plan was paid off or cancelled, or null while it is still open
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closedAt(): Optional<LocalDate> = closedAt.getOptional("closed_at")

    /**
     * Timestamp of when the installment plan was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Enrollment fee charged when the plan was created in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feeAmount(): Long = feeAmount.getRequired("fee_amount")

    /**
     * Globally unique identifier for a financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /**
     * Total owed on the plan in cents, the principal amount plus the enrollment fee
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installmentPlanTotal(): Long = installmentPlanTotal.getRequired("installment_plan_total")

    /**
     * Installments that make up the plan, oldest first
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installments(): List<Installment> = installments.getRequired("installments")

    /**
     * Number of installments that still carry a balance
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installmentsOutstanding(): Long =
        installmentsOutstanding.getRequired("installments_outstanding")

    /**
     * Number of installments that have been paid off
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installmentsPaid(): Long = installmentsPaid.getRequired("installments_paid")

    /**
     * Number of installments the plan is broken into
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numInstallments(): Long = numInstallments.getRequired("num_installments")

    /**
     * Balance the plan was opened on in cents, excluding the enrollment fee
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun principalAmount(): Long = principalAmount.getRequired("principal_amount")

    /**
     * Balance the plan was opened on, broken out by category, or null if it was not recorded
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceAmounts(): Optional<TransactionCategoryBalances> =
        sourceAmounts.getOptional("source_amounts")

    /**
     * Identifier of the record the plan was opened from, such as the closing statement for an
     * unpaid balance
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceId(): String = sourceId.getRequired("source_id")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): InstallmentPlanSource = sourceType.getRequired("source_type")

    /**
     * Date the plan was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): LocalDate = startDate.getRequired("start_date")

    /**
     * State of the installment plan. A plan is REBUILD_IN_PROGRESS while its loan tapes are being
     * rebuilt, during which its payment totals are being recomputed and should not be treated as
     * final
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): InstallmentPlanState = state.getRequired("state")

    /**
     * Amount paid towards the plan to date in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPaid(): Long = totalPaid.getRequired("total_paid")

    /**
     * Timestamp of when the installment plan was updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [closedAt].
     *
     * Unlike [closedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closed_at") @ExcludeMissing fun _closedAt(): JsonField<LocalDate> = closedAt

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [feeAmount].
     *
     * Unlike [feeAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee_amount") @ExcludeMissing fun _feeAmount(): JsonField<Long> = feeAmount

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /**
     * Returns the raw JSON value of [installmentPlanTotal].
     *
     * Unlike [installmentPlanTotal], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("installment_plan_total")
    @ExcludeMissing
    fun _installmentPlanTotal(): JsonField<Long> = installmentPlanTotal

    /**
     * Returns the raw JSON value of [installments].
     *
     * Unlike [installments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("installments")
    @ExcludeMissing
    fun _installments(): JsonField<List<Installment>> = installments

    /**
     * Returns the raw JSON value of [installmentsOutstanding].
     *
     * Unlike [installmentsOutstanding], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("installments_outstanding")
    @ExcludeMissing
    fun _installmentsOutstanding(): JsonField<Long> = installmentsOutstanding

    /**
     * Returns the raw JSON value of [installmentsPaid].
     *
     * Unlike [installmentsPaid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("installments_paid")
    @ExcludeMissing
    fun _installmentsPaid(): JsonField<Long> = installmentsPaid

    /**
     * Returns the raw JSON value of [numInstallments].
     *
     * Unlike [numInstallments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_installments")
    @ExcludeMissing
    fun _numInstallments(): JsonField<Long> = numInstallments

    /**
     * Returns the raw JSON value of [principalAmount].
     *
     * Unlike [principalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("principal_amount")
    @ExcludeMissing
    fun _principalAmount(): JsonField<Long> = principalAmount

    /**
     * Returns the raw JSON value of [sourceAmounts].
     *
     * Unlike [sourceAmounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_amounts")
    @ExcludeMissing
    fun _sourceAmounts(): JsonField<TransactionCategoryBalances> = sourceAmounts

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_type")
    @ExcludeMissing
    fun _sourceType(): JsonField<InstallmentPlanSource> = sourceType

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<InstallmentPlanState> = state

    /**
     * Returns the raw JSON value of [totalPaid].
     *
     * Unlike [totalPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_paid") @ExcludeMissing fun _totalPaid(): JsonField<Long> = totalPaid

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
         * Returns a mutable builder for constructing an instance of [InstallmentPlan].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .closedAt()
         * .created()
         * .feeAmount()
         * .financialAccountToken()
         * .installmentPlanTotal()
         * .installments()
         * .installmentsOutstanding()
         * .installmentsPaid()
         * .numInstallments()
         * .principalAmount()
         * .sourceAmounts()
         * .sourceId()
         * .sourceType()
         * .startDate()
         * .state()
         * .totalPaid()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstallmentPlan]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var closedAt: JsonField<LocalDate>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var feeAmount: JsonField<Long>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var installmentPlanTotal: JsonField<Long>? = null
        private var installments: JsonField<MutableList<Installment>>? = null
        private var installmentsOutstanding: JsonField<Long>? = null
        private var installmentsPaid: JsonField<Long>? = null
        private var numInstallments: JsonField<Long>? = null
        private var principalAmount: JsonField<Long>? = null
        private var sourceAmounts: JsonField<TransactionCategoryBalances>? = null
        private var sourceId: JsonField<String>? = null
        private var sourceType: JsonField<InstallmentPlanSource>? = null
        private var startDate: JsonField<LocalDate>? = null
        private var state: JsonField<InstallmentPlanState>? = null
        private var totalPaid: JsonField<Long>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(installmentPlan: InstallmentPlan) = apply {
            token = installmentPlan.token
            closedAt = installmentPlan.closedAt
            created = installmentPlan.created
            feeAmount = installmentPlan.feeAmount
            financialAccountToken = installmentPlan.financialAccountToken
            installmentPlanTotal = installmentPlan.installmentPlanTotal
            installments = installmentPlan.installments.map { it.toMutableList() }
            installmentsOutstanding = installmentPlan.installmentsOutstanding
            installmentsPaid = installmentPlan.installmentsPaid
            numInstallments = installmentPlan.numInstallments
            principalAmount = installmentPlan.principalAmount
            sourceAmounts = installmentPlan.sourceAmounts
            sourceId = installmentPlan.sourceId
            sourceType = installmentPlan.sourceType
            startDate = installmentPlan.startDate
            state = installmentPlan.state
            totalPaid = installmentPlan.totalPaid
            updated = installmentPlan.updated
            additionalProperties = installmentPlan.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for an installment plan */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Date the plan was paid off or cancelled, or null while it is still open */
        fun closedAt(closedAt: LocalDate?) = closedAt(JsonField.ofNullable(closedAt))

        /** Alias for calling [Builder.closedAt] with `closedAt.orElse(null)`. */
        fun closedAt(closedAt: Optional<LocalDate>) = closedAt(closedAt.getOrNull())

        /**
         * Sets [Builder.closedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closedAt] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun closedAt(closedAt: JsonField<LocalDate>) = apply { this.closedAt = closedAt }

        /** Timestamp of when the installment plan was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Enrollment fee charged when the plan was created in cents */
        fun feeAmount(feeAmount: Long) = feeAmount(JsonField.of(feeAmount))

        /**
         * Sets [Builder.feeAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feeAmount(feeAmount: JsonField<Long>) = apply { this.feeAmount = feeAmount }

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Total owed on the plan in cents, the principal amount plus the enrollment fee */
        fun installmentPlanTotal(installmentPlanTotal: Long) =
            installmentPlanTotal(JsonField.of(installmentPlanTotal))

        /**
         * Sets [Builder.installmentPlanTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installmentPlanTotal] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun installmentPlanTotal(installmentPlanTotal: JsonField<Long>) = apply {
            this.installmentPlanTotal = installmentPlanTotal
        }

        /** Installments that make up the plan, oldest first */
        fun installments(installments: List<Installment>) = installments(JsonField.of(installments))

        /**
         * Sets [Builder.installments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installments] with a well-typed `List<Installment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun installments(installments: JsonField<List<Installment>>) = apply {
            this.installments = installments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Installment] to [installments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstallment(installment: Installment) = apply {
            installments =
                (installments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("installments", it).add(installment)
                }
        }

        /** Number of installments that still carry a balance */
        fun installmentsOutstanding(installmentsOutstanding: Long) =
            installmentsOutstanding(JsonField.of(installmentsOutstanding))

        /**
         * Sets [Builder.installmentsOutstanding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installmentsOutstanding] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun installmentsOutstanding(installmentsOutstanding: JsonField<Long>) = apply {
            this.installmentsOutstanding = installmentsOutstanding
        }

        /** Number of installments that have been paid off */
        fun installmentsPaid(installmentsPaid: Long) =
            installmentsPaid(JsonField.of(installmentsPaid))

        /**
         * Sets [Builder.installmentsPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installmentsPaid] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun installmentsPaid(installmentsPaid: JsonField<Long>) = apply {
            this.installmentsPaid = installmentsPaid
        }

        /** Number of installments the plan is broken into */
        fun numInstallments(numInstallments: Long) = numInstallments(JsonField.of(numInstallments))

        /**
         * Sets [Builder.numInstallments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numInstallments] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numInstallments(numInstallments: JsonField<Long>) = apply {
            this.numInstallments = numInstallments
        }

        /** Balance the plan was opened on in cents, excluding the enrollment fee */
        fun principalAmount(principalAmount: Long) = principalAmount(JsonField.of(principalAmount))

        /**
         * Sets [Builder.principalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.principalAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun principalAmount(principalAmount: JsonField<Long>) = apply {
            this.principalAmount = principalAmount
        }

        /**
         * Balance the plan was opened on, broken out by category, or null if it was not recorded
         */
        fun sourceAmounts(sourceAmounts: TransactionCategoryBalances?) =
            sourceAmounts(JsonField.ofNullable(sourceAmounts))

        /** Alias for calling [Builder.sourceAmounts] with `sourceAmounts.orElse(null)`. */
        fun sourceAmounts(sourceAmounts: Optional<TransactionCategoryBalances>) =
            sourceAmounts(sourceAmounts.getOrNull())

        /**
         * Sets [Builder.sourceAmounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceAmounts] with a well-typed
         * [TransactionCategoryBalances] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun sourceAmounts(sourceAmounts: JsonField<TransactionCategoryBalances>) = apply {
            this.sourceAmounts = sourceAmounts
        }

        /**
         * Identifier of the record the plan was opened from, such as the closing statement for an
         * unpaid balance
         */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        fun sourceType(sourceType: InstallmentPlanSource) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [InstallmentPlanSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sourceType(sourceType: JsonField<InstallmentPlanSource>) = apply {
            this.sourceType = sourceType
        }

        /** Date the plan was created */
        fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

        /**
         * State of the installment plan. A plan is REBUILD_IN_PROGRESS while its loan tapes are
         * being rebuilt, during which its payment totals are being recomputed and should not be
         * treated as final
         */
        fun state(state: InstallmentPlanState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [InstallmentPlanState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun state(state: JsonField<InstallmentPlanState>) = apply { this.state = state }

        /** Amount paid towards the plan to date in cents */
        fun totalPaid(totalPaid: Long) = totalPaid(JsonField.of(totalPaid))

        /**
         * Sets [Builder.totalPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPaid] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPaid(totalPaid: JsonField<Long>) = apply { this.totalPaid = totalPaid }

        /** Timestamp of when the installment plan was updated */
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
         * Returns an immutable instance of [InstallmentPlan].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .closedAt()
         * .created()
         * .feeAmount()
         * .financialAccountToken()
         * .installmentPlanTotal()
         * .installments()
         * .installmentsOutstanding()
         * .installmentsPaid()
         * .numInstallments()
         * .principalAmount()
         * .sourceAmounts()
         * .sourceId()
         * .sourceType()
         * .startDate()
         * .state()
         * .totalPaid()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstallmentPlan =
            InstallmentPlan(
                checkRequired("token", token),
                checkRequired("closedAt", closedAt),
                checkRequired("created", created),
                checkRequired("feeAmount", feeAmount),
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("installmentPlanTotal", installmentPlanTotal),
                checkRequired("installments", installments).map { it.toImmutable() },
                checkRequired("installmentsOutstanding", installmentsOutstanding),
                checkRequired("installmentsPaid", installmentsPaid),
                checkRequired("numInstallments", numInstallments),
                checkRequired("principalAmount", principalAmount),
                checkRequired("sourceAmounts", sourceAmounts),
                checkRequired("sourceId", sourceId),
                checkRequired("sourceType", sourceType),
                checkRequired("startDate", startDate),
                checkRequired("state", state),
                checkRequired("totalPaid", totalPaid),
                checkRequired("updated", updated),
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
    fun validate(): InstallmentPlan = apply {
        if (validated) {
            return@apply
        }

        token()
        closedAt()
        created()
        feeAmount()
        financialAccountToken()
        installmentPlanTotal()
        installments().forEach { it.validate() }
        installmentsOutstanding()
        installmentsPaid()
        numInstallments()
        principalAmount()
        sourceAmounts().ifPresent { it.validate() }
        sourceId()
        sourceType().validate()
        startDate()
        state().validate()
        totalPaid()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (closedAt.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (feeAmount.asKnown().isPresent) 1 else 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (if (installmentPlanTotal.asKnown().isPresent) 1 else 0) +
            (installments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (installmentsOutstanding.asKnown().isPresent) 1 else 0) +
            (if (installmentsPaid.asKnown().isPresent) 1 else 0) +
            (if (numInstallments.asKnown().isPresent) 1 else 0) +
            (if (principalAmount.asKnown().isPresent) 1 else 0) +
            (sourceAmounts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalPaid.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    class Installment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amountDue: JsonField<Long>,
        private val amountDueDetails: JsonField<TransactionCategoryBalances>,
        private val amountOutstanding: JsonField<Long>,
        private val amountOutstandingDetails: JsonField<TransactionCategoryBalances>,
        private val amountPaid: JsonField<Long>,
        private val amountPaidDetails: JsonField<TransactionCategoryBalances>,
        private val dateAssessed: JsonField<LocalDate>,
        private val dueDate: JsonField<LocalDate>,
        private val installmentNum: JsonField<Long>,
        private val paymentDueDate: JsonField<LocalDate>,
        private val payments: JsonField<List<InstallmentPayment>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount_due")
            @ExcludeMissing
            amountDue: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_due_details")
            @ExcludeMissing
            amountDueDetails: JsonField<TransactionCategoryBalances> = JsonMissing.of(),
            @JsonProperty("amount_outstanding")
            @ExcludeMissing
            amountOutstanding: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_outstanding_details")
            @ExcludeMissing
            amountOutstandingDetails: JsonField<TransactionCategoryBalances> = JsonMissing.of(),
            @JsonProperty("amount_paid")
            @ExcludeMissing
            amountPaid: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_paid_details")
            @ExcludeMissing
            amountPaidDetails: JsonField<TransactionCategoryBalances> = JsonMissing.of(),
            @JsonProperty("date_assessed")
            @ExcludeMissing
            dateAssessed: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("due_date")
            @ExcludeMissing
            dueDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("installment_num")
            @ExcludeMissing
            installmentNum: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("payment_due_date")
            @ExcludeMissing
            paymentDueDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("payments")
            @ExcludeMissing
            payments: JsonField<List<InstallmentPayment>> = JsonMissing.of(),
        ) : this(
            amountDue,
            amountDueDetails,
            amountOutstanding,
            amountOutstandingDetails,
            amountPaid,
            amountPaidDetails,
            dateAssessed,
            dueDate,
            installmentNum,
            paymentDueDate,
            payments,
            mutableMapOf(),
        )

        /**
         * Amount the installment was opened for in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountDue(): Long = amountDue.getRequired("amount_due")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountDueDetails(): TransactionCategoryBalances =
            amountDueDetails.getRequired("amount_due_details")

        /**
         * Amount still owed on the installment in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountOutstanding(): Long = amountOutstanding.getRequired("amount_outstanding")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountOutstandingDetails(): TransactionCategoryBalances =
            amountOutstandingDetails.getRequired("amount_outstanding_details")

        /**
         * Amount paid towards the installment in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountPaid(): Long = amountPaid.getRequired("amount_paid")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountPaidDetails(): TransactionCategoryBalances =
            amountPaidDetails.getRequired("amount_paid_details")

        /**
         * Date the installment was actually assessed onto the account, or null if it has not been
         * assessed yet
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateAssessed(): Optional<LocalDate> = dateAssessed.getOptional("date_assessed")

        /**
         * Date the installment is scheduled to be assessed onto the account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dueDate(): LocalDate = dueDate.getRequired("due_date")

        /**
         * Position of this installment within the plan, starting at 0
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun installmentNum(): Long = installmentNum.getRequired("installment_num")

        /**
         * Date the installment must be paid by before it is considered past due
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentDueDate(): LocalDate = paymentDueDate.getRequired("payment_due_date")

        /**
         * Payments applied to this installment, oldest first
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payments(): List<InstallmentPayment> = payments.getRequired("payments")

        /**
         * Returns the raw JSON value of [amountDue].
         *
         * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<Long> = amountDue

        /**
         * Returns the raw JSON value of [amountDueDetails].
         *
         * Unlike [amountDueDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_due_details")
        @ExcludeMissing
        fun _amountDueDetails(): JsonField<TransactionCategoryBalances> = amountDueDetails

        /**
         * Returns the raw JSON value of [amountOutstanding].
         *
         * Unlike [amountOutstanding], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_outstanding")
        @ExcludeMissing
        fun _amountOutstanding(): JsonField<Long> = amountOutstanding

        /**
         * Returns the raw JSON value of [amountOutstandingDetails].
         *
         * Unlike [amountOutstandingDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amount_outstanding_details")
        @ExcludeMissing
        fun _amountOutstandingDetails(): JsonField<TransactionCategoryBalances> =
            amountOutstandingDetails

        /**
         * Returns the raw JSON value of [amountPaid].
         *
         * Unlike [amountPaid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_paid") @ExcludeMissing fun _amountPaid(): JsonField<Long> = amountPaid

        /**
         * Returns the raw JSON value of [amountPaidDetails].
         *
         * Unlike [amountPaidDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_paid_details")
        @ExcludeMissing
        fun _amountPaidDetails(): JsonField<TransactionCategoryBalances> = amountPaidDetails

        /**
         * Returns the raw JSON value of [dateAssessed].
         *
         * Unlike [dateAssessed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("date_assessed")
        @ExcludeMissing
        fun _dateAssessed(): JsonField<LocalDate> = dateAssessed

        /**
         * Returns the raw JSON value of [dueDate].
         *
         * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

        /**
         * Returns the raw JSON value of [installmentNum].
         *
         * Unlike [installmentNum], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("installment_num")
        @ExcludeMissing
        fun _installmentNum(): JsonField<Long> = installmentNum

        /**
         * Returns the raw JSON value of [paymentDueDate].
         *
         * Unlike [paymentDueDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_due_date")
        @ExcludeMissing
        fun _paymentDueDate(): JsonField<LocalDate> = paymentDueDate

        /**
         * Returns the raw JSON value of [payments].
         *
         * Unlike [payments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payments")
        @ExcludeMissing
        fun _payments(): JsonField<List<InstallmentPayment>> = payments

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
             * Returns a mutable builder for constructing an instance of [Installment].
             *
             * The following fields are required:
             * ```java
             * .amountDue()
             * .amountDueDetails()
             * .amountOutstanding()
             * .amountOutstandingDetails()
             * .amountPaid()
             * .amountPaidDetails()
             * .dateAssessed()
             * .dueDate()
             * .installmentNum()
             * .paymentDueDate()
             * .payments()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Installment]. */
        class Builder internal constructor() {

            private var amountDue: JsonField<Long>? = null
            private var amountDueDetails: JsonField<TransactionCategoryBalances>? = null
            private var amountOutstanding: JsonField<Long>? = null
            private var amountOutstandingDetails: JsonField<TransactionCategoryBalances>? = null
            private var amountPaid: JsonField<Long>? = null
            private var amountPaidDetails: JsonField<TransactionCategoryBalances>? = null
            private var dateAssessed: JsonField<LocalDate>? = null
            private var dueDate: JsonField<LocalDate>? = null
            private var installmentNum: JsonField<Long>? = null
            private var paymentDueDate: JsonField<LocalDate>? = null
            private var payments: JsonField<MutableList<InstallmentPayment>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(installment: Installment) = apply {
                amountDue = installment.amountDue
                amountDueDetails = installment.amountDueDetails
                amountOutstanding = installment.amountOutstanding
                amountOutstandingDetails = installment.amountOutstandingDetails
                amountPaid = installment.amountPaid
                amountPaidDetails = installment.amountPaidDetails
                dateAssessed = installment.dateAssessed
                dueDate = installment.dueDate
                installmentNum = installment.installmentNum
                paymentDueDate = installment.paymentDueDate
                payments = installment.payments.map { it.toMutableList() }
                additionalProperties = installment.additionalProperties.toMutableMap()
            }

            /** Amount the installment was opened for in cents */
            fun amountDue(amountDue: Long) = amountDue(JsonField.of(amountDue))

            /**
             * Sets [Builder.amountDue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountDue] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountDue(amountDue: JsonField<Long>) = apply { this.amountDue = amountDue }

            fun amountDueDetails(amountDueDetails: TransactionCategoryBalances) =
                amountDueDetails(JsonField.of(amountDueDetails))

            /**
             * Sets [Builder.amountDueDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountDueDetails] with a well-typed
             * [TransactionCategoryBalances] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun amountDueDetails(amountDueDetails: JsonField<TransactionCategoryBalances>) = apply {
                this.amountDueDetails = amountDueDetails
            }

            /** Amount still owed on the installment in cents */
            fun amountOutstanding(amountOutstanding: Long) =
                amountOutstanding(JsonField.of(amountOutstanding))

            /**
             * Sets [Builder.amountOutstanding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountOutstanding] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountOutstanding(amountOutstanding: JsonField<Long>) = apply {
                this.amountOutstanding = amountOutstanding
            }

            fun amountOutstandingDetails(amountOutstandingDetails: TransactionCategoryBalances) =
                amountOutstandingDetails(JsonField.of(amountOutstandingDetails))

            /**
             * Sets [Builder.amountOutstandingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountOutstandingDetails] with a well-typed
             * [TransactionCategoryBalances] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun amountOutstandingDetails(
                amountOutstandingDetails: JsonField<TransactionCategoryBalances>
            ) = apply { this.amountOutstandingDetails = amountOutstandingDetails }

            /** Amount paid towards the installment in cents */
            fun amountPaid(amountPaid: Long) = amountPaid(JsonField.of(amountPaid))

            /**
             * Sets [Builder.amountPaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountPaid] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountPaid(amountPaid: JsonField<Long>) = apply { this.amountPaid = amountPaid }

            fun amountPaidDetails(amountPaidDetails: TransactionCategoryBalances) =
                amountPaidDetails(JsonField.of(amountPaidDetails))

            /**
             * Sets [Builder.amountPaidDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountPaidDetails] with a well-typed
             * [TransactionCategoryBalances] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun amountPaidDetails(amountPaidDetails: JsonField<TransactionCategoryBalances>) =
                apply {
                    this.amountPaidDetails = amountPaidDetails
                }

            /**
             * Date the installment was actually assessed onto the account, or null if it has not
             * been assessed yet
             */
            fun dateAssessed(dateAssessed: LocalDate?) =
                dateAssessed(JsonField.ofNullable(dateAssessed))

            /** Alias for calling [Builder.dateAssessed] with `dateAssessed.orElse(null)`. */
            fun dateAssessed(dateAssessed: Optional<LocalDate>) =
                dateAssessed(dateAssessed.getOrNull())

            /**
             * Sets [Builder.dateAssessed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateAssessed] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateAssessed(dateAssessed: JsonField<LocalDate>) = apply {
                this.dateAssessed = dateAssessed
            }

            /** Date the installment is scheduled to be assessed onto the account */
            fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

            /**
             * Sets [Builder.dueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

            /** Position of this installment within the plan, starting at 0 */
            fun installmentNum(installmentNum: Long) = installmentNum(JsonField.of(installmentNum))

            /**
             * Sets [Builder.installmentNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.installmentNum] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun installmentNum(installmentNum: JsonField<Long>) = apply {
                this.installmentNum = installmentNum
            }

            /** Date the installment must be paid by before it is considered past due */
            fun paymentDueDate(paymentDueDate: LocalDate) =
                paymentDueDate(JsonField.of(paymentDueDate))

            /**
             * Sets [Builder.paymentDueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentDueDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentDueDate(paymentDueDate: JsonField<LocalDate>) = apply {
                this.paymentDueDate = paymentDueDate
            }

            /** Payments applied to this installment, oldest first */
            fun payments(payments: List<InstallmentPayment>) = payments(JsonField.of(payments))

            /**
             * Sets [Builder.payments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payments] with a well-typed
             * `List<InstallmentPayment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun payments(payments: JsonField<List<InstallmentPayment>>) = apply {
                this.payments = payments.map { it.toMutableList() }
            }

            /**
             * Adds a single [InstallmentPayment] to [payments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayment(payment: InstallmentPayment) = apply {
                payments =
                    (payments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payments", it).add(payment)
                    }
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
             * Returns an immutable instance of [Installment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amountDue()
             * .amountDueDetails()
             * .amountOutstanding()
             * .amountOutstandingDetails()
             * .amountPaid()
             * .amountPaidDetails()
             * .dateAssessed()
             * .dueDate()
             * .installmentNum()
             * .paymentDueDate()
             * .payments()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Installment =
                Installment(
                    checkRequired("amountDue", amountDue),
                    checkRequired("amountDueDetails", amountDueDetails),
                    checkRequired("amountOutstanding", amountOutstanding),
                    checkRequired("amountOutstandingDetails", amountOutstandingDetails),
                    checkRequired("amountPaid", amountPaid),
                    checkRequired("amountPaidDetails", amountPaidDetails),
                    checkRequired("dateAssessed", dateAssessed),
                    checkRequired("dueDate", dueDate),
                    checkRequired("installmentNum", installmentNum),
                    checkRequired("paymentDueDate", paymentDueDate),
                    checkRequired("payments", payments).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Installment = apply {
            if (validated) {
                return@apply
            }

            amountDue()
            amountDueDetails().validate()
            amountOutstanding()
            amountOutstandingDetails().validate()
            amountPaid()
            amountPaidDetails().validate()
            dateAssessed()
            dueDate()
            installmentNum()
            paymentDueDate()
            payments().forEach { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amountDue.asKnown().isPresent) 1 else 0) +
                (amountDueDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amountOutstanding.asKnown().isPresent) 1 else 0) +
                (amountOutstandingDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amountPaid.asKnown().isPresent) 1 else 0) +
                (amountPaidDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dateAssessed.asKnown().isPresent) 1 else 0) +
                (if (dueDate.asKnown().isPresent) 1 else 0) +
                (if (installmentNum.asKnown().isPresent) 1 else 0) +
                (if (paymentDueDate.asKnown().isPresent) 1 else 0) +
                (payments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class InstallmentPayment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val amountDetails: JsonField<TransactionCategoryBalances>,
            private val date: JsonField<LocalDate>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("amount_details")
                @ExcludeMissing
                amountDetails: JsonField<TransactionCategoryBalances> = JsonMissing.of(),
                @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            ) : this(amount, amountDetails, date, mutableMapOf())

            /**
             * Amount applied to the installment in cents
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountDetails(): TransactionCategoryBalances =
                amountDetails.getRequired("amount_details")

            /**
             * Date the payment was applied to the installment
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun date(): LocalDate = date.getRequired("date")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [amountDetails].
             *
             * Unlike [amountDetails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("amount_details")
            @ExcludeMissing
            fun _amountDetails(): JsonField<TransactionCategoryBalances> = amountDetails

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

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
                 * Returns a mutable builder for constructing an instance of [InstallmentPayment].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .amountDetails()
                 * .date()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InstallmentPayment]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var amountDetails: JsonField<TransactionCategoryBalances>? = null
                private var date: JsonField<LocalDate>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(installmentPayment: InstallmentPayment) = apply {
                    amount = installmentPayment.amount
                    amountDetails = installmentPayment.amountDetails
                    date = installmentPayment.date
                    additionalProperties = installmentPayment.additionalProperties.toMutableMap()
                }

                /** Amount applied to the installment in cents */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun amountDetails(amountDetails: TransactionCategoryBalances) =
                    amountDetails(JsonField.of(amountDetails))

                /**
                 * Sets [Builder.amountDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDetails] with a well-typed
                 * [TransactionCategoryBalances] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun amountDetails(amountDetails: JsonField<TransactionCategoryBalances>) = apply {
                    this.amountDetails = amountDetails
                }

                /** Date the payment was applied to the installment */
                fun date(date: LocalDate) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun date(date: JsonField<LocalDate>) = apply { this.date = date }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [InstallmentPayment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .amountDetails()
                 * .date()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InstallmentPayment =
                    InstallmentPayment(
                        checkRequired("amount", amount),
                        checkRequired("amountDetails", amountDetails),
                        checkRequired("date", date),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): InstallmentPayment = apply {
                if (validated) {
                    return@apply
                }

                amount()
                amountDetails().validate()
                date()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (amountDetails.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (date.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InstallmentPayment &&
                    amount == other.amount &&
                    amountDetails == other.amountDetails &&
                    date == other.date &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, amountDetails, date, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InstallmentPayment{amount=$amount, amountDetails=$amountDetails, date=$date, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Installment &&
                amountDue == other.amountDue &&
                amountDueDetails == other.amountDueDetails &&
                amountOutstanding == other.amountOutstanding &&
                amountOutstandingDetails == other.amountOutstandingDetails &&
                amountPaid == other.amountPaid &&
                amountPaidDetails == other.amountPaidDetails &&
                dateAssessed == other.dateAssessed &&
                dueDate == other.dueDate &&
                installmentNum == other.installmentNum &&
                paymentDueDate == other.paymentDueDate &&
                payments == other.payments &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amountDue,
                amountDueDetails,
                amountOutstanding,
                amountOutstandingDetails,
                amountPaid,
                amountPaidDetails,
                dateAssessed,
                dueDate,
                installmentNum,
                paymentDueDate,
                payments,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Installment{amountDue=$amountDue, amountDueDetails=$amountDueDetails, amountOutstanding=$amountOutstanding, amountOutstandingDetails=$amountOutstandingDetails, amountPaid=$amountPaid, amountPaidDetails=$amountPaidDetails, dateAssessed=$dateAssessed, dueDate=$dueDate, installmentNum=$installmentNum, paymentDueDate=$paymentDueDate, payments=$payments, additionalProperties=$additionalProperties}"
    }

    class InstallmentPlanSource
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UNPAID_BALANCE = of("UNPAID_BALANCE")

            @JvmField val TRANSACTION = of("TRANSACTION")

            @JvmStatic fun of(value: String) = InstallmentPlanSource(JsonField.of(value))
        }

        /** An enum containing [InstallmentPlanSource]'s known values. */
        enum class Known {
            UNPAID_BALANCE,
            TRANSACTION,
        }

        /**
         * An enum containing [InstallmentPlanSource]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [InstallmentPlanSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNPAID_BALANCE,
            TRANSACTION,
            /**
             * An enum member indicating that [InstallmentPlanSource] was instantiated with an
             * unknown value.
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
                UNPAID_BALANCE -> Value.UNPAID_BALANCE
                TRANSACTION -> Value.TRANSACTION
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
                UNPAID_BALANCE -> Known.UNPAID_BALANCE
                TRANSACTION -> Known.TRANSACTION
                else -> throw LithicInvalidDataException("Unknown InstallmentPlanSource: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InstallmentPlanSource = apply {
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

            return other is InstallmentPlanSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * State of the installment plan. A plan is REBUILD_IN_PROGRESS while its loan tapes are being
     * rebuilt, during which its payment totals are being recomputed and should not be treated as
     * final
     */
    class InstallmentPlanState
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val REBUILD_IN_PROGRESS = of("REBUILD_IN_PROGRESS")

            @JvmField val FULLY_PAID = of("FULLY_PAID")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmStatic fun of(value: String) = InstallmentPlanState(JsonField.of(value))
        }

        /** An enum containing [InstallmentPlanState]'s known values. */
        enum class Known {
            PENDING,
            ACTIVE,
            REBUILD_IN_PROGRESS,
            FULLY_PAID,
            CANCELLED,
        }

        /**
         * An enum containing [InstallmentPlanState]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [InstallmentPlanState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ACTIVE,
            REBUILD_IN_PROGRESS,
            FULLY_PAID,
            CANCELLED,
            /**
             * An enum member indicating that [InstallmentPlanState] was instantiated with an
             * unknown value.
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
                PENDING -> Value.PENDING
                ACTIVE -> Value.ACTIVE
                REBUILD_IN_PROGRESS -> Value.REBUILD_IN_PROGRESS
                FULLY_PAID -> Value.FULLY_PAID
                CANCELLED -> Value.CANCELLED
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
                PENDING -> Known.PENDING
                ACTIVE -> Known.ACTIVE
                REBUILD_IN_PROGRESS -> Known.REBUILD_IN_PROGRESS
                FULLY_PAID -> Known.FULLY_PAID
                CANCELLED -> Known.CANCELLED
                else -> throw LithicInvalidDataException("Unknown InstallmentPlanState: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InstallmentPlanState = apply {
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

            return other is InstallmentPlanState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstallmentPlan &&
            token == other.token &&
            closedAt == other.closedAt &&
            created == other.created &&
            feeAmount == other.feeAmount &&
            financialAccountToken == other.financialAccountToken &&
            installmentPlanTotal == other.installmentPlanTotal &&
            installments == other.installments &&
            installmentsOutstanding == other.installmentsOutstanding &&
            installmentsPaid == other.installmentsPaid &&
            numInstallments == other.numInstallments &&
            principalAmount == other.principalAmount &&
            sourceAmounts == other.sourceAmounts &&
            sourceId == other.sourceId &&
            sourceType == other.sourceType &&
            startDate == other.startDate &&
            state == other.state &&
            totalPaid == other.totalPaid &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            closedAt,
            created,
            feeAmount,
            financialAccountToken,
            installmentPlanTotal,
            installments,
            installmentsOutstanding,
            installmentsPaid,
            numInstallments,
            principalAmount,
            sourceAmounts,
            sourceId,
            sourceType,
            startDate,
            state,
            totalPaid,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstallmentPlan{token=$token, closedAt=$closedAt, created=$created, feeAmount=$feeAmount, financialAccountToken=$financialAccountToken, installmentPlanTotal=$installmentPlanTotal, installments=$installments, installmentsOutstanding=$installmentsOutstanding, installmentsPaid=$installmentsPaid, numInstallments=$numInstallments, principalAmount=$principalAmount, sourceAmounts=$sourceAmounts, sourceId=$sourceId, sourceType=$sourceType, startDate=$startDate, state=$state, totalPaid=$totalPaid, updated=$updated, additionalProperties=$additionalProperties}"
}
