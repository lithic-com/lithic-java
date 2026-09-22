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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An immutable snapshot of an installment plan as of the statement it is attached to. Lithic cuts
 * one per open plan when a statement is generated and never reissues it
 */
class InstallmentPlanStatement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val feeAmount: JsonField<Long>,
    private val installmentPlanToken: JsonField<String>,
    private val installmentPlanTotal: JsonField<Long>,
    private val installments: JsonField<List<InstallmentPlanStatementInstallment>>,
    private val installmentsOutstanding: JsonField<Long>,
    private val installmentsPaid: JsonField<Long>,
    private val numInstallments: JsonField<Long>,
    private val principalAmount: JsonField<Long>,
    private val sourceType: JsonField<InstallmentPlanSource>,
    private val startDate: JsonField<LocalDate>,
    private val state: JsonField<InstallmentPlanState>,
    private val totalPaid: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fee_amount") @ExcludeMissing feeAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("installment_plan_token")
        @ExcludeMissing
        installmentPlanToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("installment_plan_total")
        @ExcludeMissing
        installmentPlanTotal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("installments")
        @ExcludeMissing
        installments: JsonField<List<InstallmentPlanStatementInstallment>> = JsonMissing.of(),
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
    ) : this(
        token,
        feeAmount,
        installmentPlanToken,
        installmentPlanTotal,
        installments,
        installmentsOutstanding,
        installmentsPaid,
        numInstallments,
        principalAmount,
        sourceType,
        startDate,
        state,
        totalPaid,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for this snapshot, which is the token of the statement it is
     * attached to. A plan is snapshotted at most once per statement, so the statement identifies
     * the snapshot within the plan. Pass it as a pagination cursor
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Enrollment fee charged when the plan was created in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feeAmount(): Long = feeAmount.getRequired("fee_amount")

    /**
     * Globally unique identifier for the installment plan this snapshot is of
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installmentPlanToken(): String = installmentPlanToken.getRequired("installment_plan_token")

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
    fun installments(): List<InstallmentPlanStatementInstallment> =
        installments.getRequired("installments")

    /**
     * Number of installments that still carried a balance as of this statement
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installmentsOutstanding(): Long =
        installmentsOutstanding.getRequired("installments_outstanding")

    /**
     * Number of installments that had been paid off as of this statement
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
     * Amount paid towards the plan as of this statement in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPaid(): Long = totalPaid.getRequired("total_paid")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [feeAmount].
     *
     * Unlike [feeAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee_amount") @ExcludeMissing fun _feeAmount(): JsonField<Long> = feeAmount

    /**
     * Returns the raw JSON value of [installmentPlanToken].
     *
     * Unlike [installmentPlanToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("installment_plan_token")
    @ExcludeMissing
    fun _installmentPlanToken(): JsonField<String> = installmentPlanToken

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
    fun _installments(): JsonField<List<InstallmentPlanStatementInstallment>> = installments

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
         * Returns a mutable builder for constructing an instance of [InstallmentPlanStatement].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .feeAmount()
         * .installmentPlanToken()
         * .installmentPlanTotal()
         * .installments()
         * .installmentsOutstanding()
         * .installmentsPaid()
         * .numInstallments()
         * .principalAmount()
         * .sourceType()
         * .startDate()
         * .state()
         * .totalPaid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstallmentPlanStatement]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var feeAmount: JsonField<Long>? = null
        private var installmentPlanToken: JsonField<String>? = null
        private var installmentPlanTotal: JsonField<Long>? = null
        private var installments: JsonField<MutableList<InstallmentPlanStatementInstallment>>? =
            null
        private var installmentsOutstanding: JsonField<Long>? = null
        private var installmentsPaid: JsonField<Long>? = null
        private var numInstallments: JsonField<Long>? = null
        private var principalAmount: JsonField<Long>? = null
        private var sourceType: JsonField<InstallmentPlanSource>? = null
        private var startDate: JsonField<LocalDate>? = null
        private var state: JsonField<InstallmentPlanState>? = null
        private var totalPaid: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(installmentPlanStatement: InstallmentPlanStatement) = apply {
            token = installmentPlanStatement.token
            feeAmount = installmentPlanStatement.feeAmount
            installmentPlanToken = installmentPlanStatement.installmentPlanToken
            installmentPlanTotal = installmentPlanStatement.installmentPlanTotal
            installments = installmentPlanStatement.installments.map { it.toMutableList() }
            installmentsOutstanding = installmentPlanStatement.installmentsOutstanding
            installmentsPaid = installmentPlanStatement.installmentsPaid
            numInstallments = installmentPlanStatement.numInstallments
            principalAmount = installmentPlanStatement.principalAmount
            sourceType = installmentPlanStatement.sourceType
            startDate = installmentPlanStatement.startDate
            state = installmentPlanStatement.state
            totalPaid = installmentPlanStatement.totalPaid
            additionalProperties = installmentPlanStatement.additionalProperties.toMutableMap()
        }

        /**
         * Globally unique identifier for this snapshot, which is the token of the statement it is
         * attached to. A plan is snapshotted at most once per statement, so the statement
         * identifies the snapshot within the plan. Pass it as a pagination cursor
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Enrollment fee charged when the plan was created in cents */
        fun feeAmount(feeAmount: Long) = feeAmount(JsonField.of(feeAmount))

        /**
         * Sets [Builder.feeAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feeAmount(feeAmount: JsonField<Long>) = apply { this.feeAmount = feeAmount }

        /** Globally unique identifier for the installment plan this snapshot is of */
        fun installmentPlanToken(installmentPlanToken: String) =
            installmentPlanToken(JsonField.of(installmentPlanToken))

        /**
         * Sets [Builder.installmentPlanToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installmentPlanToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun installmentPlanToken(installmentPlanToken: JsonField<String>) = apply {
            this.installmentPlanToken = installmentPlanToken
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
        fun installments(installments: List<InstallmentPlanStatementInstallment>) =
            installments(JsonField.of(installments))

        /**
         * Sets [Builder.installments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installments] with a well-typed
         * `List<InstallmentPlanStatementInstallment>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun installments(installments: JsonField<List<InstallmentPlanStatementInstallment>>) =
            apply {
                this.installments = installments.map { it.toMutableList() }
            }

        /**
         * Adds a single [InstallmentPlanStatementInstallment] to [installments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstallment(installment: InstallmentPlanStatementInstallment) = apply {
            installments =
                (installments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("installments", it).add(installment)
                }
        }

        /** Number of installments that still carried a balance as of this statement */
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

        /** Number of installments that had been paid off as of this statement */
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

        /** Amount paid towards the plan as of this statement in cents */
        fun totalPaid(totalPaid: Long) = totalPaid(JsonField.of(totalPaid))

        /**
         * Sets [Builder.totalPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPaid] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPaid(totalPaid: JsonField<Long>) = apply { this.totalPaid = totalPaid }

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
         * Returns an immutable instance of [InstallmentPlanStatement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .feeAmount()
         * .installmentPlanToken()
         * .installmentPlanTotal()
         * .installments()
         * .installmentsOutstanding()
         * .installmentsPaid()
         * .numInstallments()
         * .principalAmount()
         * .sourceType()
         * .startDate()
         * .state()
         * .totalPaid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstallmentPlanStatement =
            InstallmentPlanStatement(
                checkRequired("token", token),
                checkRequired("feeAmount", feeAmount),
                checkRequired("installmentPlanToken", installmentPlanToken),
                checkRequired("installmentPlanTotal", installmentPlanTotal),
                checkRequired("installments", installments).map { it.toImmutable() },
                checkRequired("installmentsOutstanding", installmentsOutstanding),
                checkRequired("installmentsPaid", installmentsPaid),
                checkRequired("numInstallments", numInstallments),
                checkRequired("principalAmount", principalAmount),
                checkRequired("sourceType", sourceType),
                checkRequired("startDate", startDate),
                checkRequired("state", state),
                checkRequired("totalPaid", totalPaid),
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
    fun validate(): InstallmentPlanStatement = apply {
        if (validated) {
            return@apply
        }

        token()
        feeAmount()
        installmentPlanToken()
        installmentPlanTotal()
        installments().forEach { it.validate() }
        installmentsOutstanding()
        installmentsPaid()
        numInstallments()
        principalAmount()
        sourceType().validate()
        startDate()
        state().validate()
        totalPaid()
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
            (if (feeAmount.asKnown().isPresent) 1 else 0) +
            (if (installmentPlanToken.asKnown().isPresent) 1 else 0) +
            (if (installmentPlanTotal.asKnown().isPresent) 1 else 0) +
            (installments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (installmentsOutstanding.asKnown().isPresent) 1 else 0) +
            (if (installmentsPaid.asKnown().isPresent) 1 else 0) +
            (if (numInstallments.asKnown().isPresent) 1 else 0) +
            (if (principalAmount.asKnown().isPresent) 1 else 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalPaid.asKnown().isPresent) 1 else 0)

    /**
     * One installment of a plan as of the statement. Amounts are totalled across transaction
     * categories rather than broken out by them, which the installment plan endpoint does
     */
    class InstallmentPlanStatementInstallment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amountDue: JsonField<Long>,
        private val amountDueDetails: JsonField<CategoryBalances>,
        private val amountOutstanding: JsonField<Long>,
        private val amountOutstandingDetails: JsonField<CategoryBalances>,
        private val amountPaid: JsonField<Long>,
        private val amountPaidDetails: JsonField<CategoryBalances>,
        private val dateAssessed: JsonField<LocalDate>,
        private val dueDate: JsonField<LocalDate>,
        private val installmentNum: JsonField<Long>,
        private val paymentDueDate: JsonField<LocalDate>,
        private val payments: JsonField<List<InstallmentPlanStatementPayment>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount_due")
            @ExcludeMissing
            amountDue: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_due_details")
            @ExcludeMissing
            amountDueDetails: JsonField<CategoryBalances> = JsonMissing.of(),
            @JsonProperty("amount_outstanding")
            @ExcludeMissing
            amountOutstanding: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_outstanding_details")
            @ExcludeMissing
            amountOutstandingDetails: JsonField<CategoryBalances> = JsonMissing.of(),
            @JsonProperty("amount_paid")
            @ExcludeMissing
            amountPaid: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_paid_details")
            @ExcludeMissing
            amountPaidDetails: JsonField<CategoryBalances> = JsonMissing.of(),
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
            payments: JsonField<List<InstallmentPlanStatementPayment>> = JsonMissing.of(),
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
        fun amountDueDetails(): CategoryBalances =
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
        fun amountOutstandingDetails(): CategoryBalances =
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
        fun amountPaidDetails(): CategoryBalances =
            amountPaidDetails.getRequired("amount_paid_details")

        /**
         * Date the installment was actually assessed onto the account, or null if it had not been
         * assessed as of this statement
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
        fun payments(): List<InstallmentPlanStatementPayment> = payments.getRequired("payments")

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
        fun _amountDueDetails(): JsonField<CategoryBalances> = amountDueDetails

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
        fun _amountOutstandingDetails(): JsonField<CategoryBalances> = amountOutstandingDetails

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
        fun _amountPaidDetails(): JsonField<CategoryBalances> = amountPaidDetails

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
        fun _payments(): JsonField<List<InstallmentPlanStatementPayment>> = payments

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
             * [InstallmentPlanStatementInstallment].
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

        /** A builder for [InstallmentPlanStatementInstallment]. */
        class Builder internal constructor() {

            private var amountDue: JsonField<Long>? = null
            private var amountDueDetails: JsonField<CategoryBalances>? = null
            private var amountOutstanding: JsonField<Long>? = null
            private var amountOutstandingDetails: JsonField<CategoryBalances>? = null
            private var amountPaid: JsonField<Long>? = null
            private var amountPaidDetails: JsonField<CategoryBalances>? = null
            private var dateAssessed: JsonField<LocalDate>? = null
            private var dueDate: JsonField<LocalDate>? = null
            private var installmentNum: JsonField<Long>? = null
            private var paymentDueDate: JsonField<LocalDate>? = null
            private var payments: JsonField<MutableList<InstallmentPlanStatementPayment>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                installmentPlanStatementInstallment: InstallmentPlanStatementInstallment
            ) = apply {
                amountDue = installmentPlanStatementInstallment.amountDue
                amountDueDetails = installmentPlanStatementInstallment.amountDueDetails
                amountOutstanding = installmentPlanStatementInstallment.amountOutstanding
                amountOutstandingDetails =
                    installmentPlanStatementInstallment.amountOutstandingDetails
                amountPaid = installmentPlanStatementInstallment.amountPaid
                amountPaidDetails = installmentPlanStatementInstallment.amountPaidDetails
                dateAssessed = installmentPlanStatementInstallment.dateAssessed
                dueDate = installmentPlanStatementInstallment.dueDate
                installmentNum = installmentPlanStatementInstallment.installmentNum
                paymentDueDate = installmentPlanStatementInstallment.paymentDueDate
                payments = installmentPlanStatementInstallment.payments.map { it.toMutableList() }
                additionalProperties =
                    installmentPlanStatementInstallment.additionalProperties.toMutableMap()
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

            fun amountDueDetails(amountDueDetails: CategoryBalances) =
                amountDueDetails(JsonField.of(amountDueDetails))

            /**
             * Sets [Builder.amountDueDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountDueDetails] with a well-typed
             * [CategoryBalances] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun amountDueDetails(amountDueDetails: JsonField<CategoryBalances>) = apply {
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

            fun amountOutstandingDetails(amountOutstandingDetails: CategoryBalances) =
                amountOutstandingDetails(JsonField.of(amountOutstandingDetails))

            /**
             * Sets [Builder.amountOutstandingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountOutstandingDetails] with a well-typed
             * [CategoryBalances] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun amountOutstandingDetails(amountOutstandingDetails: JsonField<CategoryBalances>) =
                apply {
                    this.amountOutstandingDetails = amountOutstandingDetails
                }

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

            fun amountPaidDetails(amountPaidDetails: CategoryBalances) =
                amountPaidDetails(JsonField.of(amountPaidDetails))

            /**
             * Sets [Builder.amountPaidDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountPaidDetails] with a well-typed
             * [CategoryBalances] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun amountPaidDetails(amountPaidDetails: JsonField<CategoryBalances>) = apply {
                this.amountPaidDetails = amountPaidDetails
            }

            /**
             * Date the installment was actually assessed onto the account, or null if it had not
             * been assessed as of this statement
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
            fun payments(payments: List<InstallmentPlanStatementPayment>) =
                payments(JsonField.of(payments))

            /**
             * Sets [Builder.payments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payments] with a well-typed
             * `List<InstallmentPlanStatementPayment>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun payments(payments: JsonField<List<InstallmentPlanStatementPayment>>) = apply {
                this.payments = payments.map { it.toMutableList() }
            }

            /**
             * Adds a single [InstallmentPlanStatementPayment] to [payments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayment(payment: InstallmentPlanStatementPayment) = apply {
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
             * Returns an immutable instance of [InstallmentPlanStatementInstallment].
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
            fun build(): InstallmentPlanStatementInstallment =
                InstallmentPlanStatementInstallment(
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
        fun validate(): InstallmentPlanStatementInstallment = apply {
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

        class InstallmentPlanStatementPayment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val date: JsonField<LocalDate>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            ) : this(amount, date, mutableMapOf())

            /**
             * Amount applied to the installment in cents
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

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
                 * Returns a mutable builder for constructing an instance of
                 * [InstallmentPlanStatementPayment].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .date()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InstallmentPlanStatementPayment]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var date: JsonField<LocalDate>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    installmentPlanStatementPayment: InstallmentPlanStatementPayment
                ) = apply {
                    amount = installmentPlanStatementPayment.amount
                    date = installmentPlanStatementPayment.date
                    additionalProperties =
                        installmentPlanStatementPayment.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [InstallmentPlanStatementPayment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .date()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InstallmentPlanStatementPayment =
                    InstallmentPlanStatementPayment(
                        checkRequired("amount", amount),
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
            fun validate(): InstallmentPlanStatementPayment = apply {
                if (validated) {
                    return@apply
                }

                amount()
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
                    (if (date.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InstallmentPlanStatementPayment &&
                    amount == other.amount &&
                    date == other.date &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(amount, date, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InstallmentPlanStatementPayment{amount=$amount, date=$date, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InstallmentPlanStatementInstallment &&
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
            "InstallmentPlanStatementInstallment{amountDue=$amountDue, amountDueDetails=$amountDueDetails, amountOutstanding=$amountOutstanding, amountOutstandingDetails=$amountOutstandingDetails, amountPaid=$amountPaid, amountPaidDetails=$amountPaidDetails, dateAssessed=$dateAssessed, dueDate=$dueDate, installmentNum=$installmentNum, paymentDueDate=$paymentDueDate, payments=$payments, additionalProperties=$additionalProperties}"
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

        return other is InstallmentPlanStatement &&
            token == other.token &&
            feeAmount == other.feeAmount &&
            installmentPlanToken == other.installmentPlanToken &&
            installmentPlanTotal == other.installmentPlanTotal &&
            installments == other.installments &&
            installmentsOutstanding == other.installmentsOutstanding &&
            installmentsPaid == other.installmentsPaid &&
            numInstallments == other.numInstallments &&
            principalAmount == other.principalAmount &&
            sourceType == other.sourceType &&
            startDate == other.startDate &&
            state == other.state &&
            totalPaid == other.totalPaid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            feeAmount,
            installmentPlanToken,
            installmentPlanTotal,
            installments,
            installmentsOutstanding,
            installmentsPaid,
            numInstallments,
            principalAmount,
            sourceType,
            startDate,
            state,
            totalPaid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstallmentPlanStatement{token=$token, feeAmount=$feeAmount, installmentPlanToken=$installmentPlanToken, installmentPlanTotal=$installmentPlanTotal, installments=$installments, installmentsOutstanding=$installmentsOutstanding, installmentsPaid=$installmentsPaid, numInstallments=$numInstallments, principalAmount=$principalAmount, sourceType=$sourceType, startDate=$startDate, state=$state, totalPaid=$totalPaid, additionalProperties=$additionalProperties}"
}
