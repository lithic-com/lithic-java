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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TransferLimitsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<TransferLimitItem>>,
    private val hasMore: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<TransferLimitItem>> = JsonMissing.of(),
        @JsonProperty("has_more") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
    ) : this(data, hasMore, mutableMapOf())

    /**
     * List of transfer limits
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<TransferLimitItem> = data.getRequired("data")

    /**
     * Whether there are more transfer limits
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<TransferLimitItem>> = data

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

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
         * Returns a mutable builder for constructing an instance of [TransferLimitsResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransferLimitsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<TransferLimitItem>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transferLimitsResponse: TransferLimitsResponse) = apply {
            data = transferLimitsResponse.data.map { it.toMutableList() }
            hasMore = transferLimitsResponse.hasMore
            additionalProperties = transferLimitsResponse.additionalProperties.toMutableMap()
        }

        /** List of transfer limits */
        fun data(data: List<TransferLimitItem>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<TransferLimitItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun data(data: JsonField<List<TransferLimitItem>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [TransferLimitItem] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: TransferLimitItem) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Whether there are more transfer limits */
        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

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
         * Returns an immutable instance of [TransferLimitsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferLimitsResponse =
            TransferLimitsResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TransferLimitsResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        hasMore()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasMore.asKnown().isPresent) 1 else 0)

    class TransferLimitItem
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val companyId: JsonField<String>,
        private val dailyLimit: JsonField<DirectionalLimits>,
        private val date: JsonField<LocalDate>,
        private val isFbo: JsonField<Boolean>,
        private val monthlyLimit: JsonField<DirectionalLimits>,
        private val programLimitPerTransaction: JsonField<DirectionalLimits>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("company_id")
            @ExcludeMissing
            companyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("daily_limit")
            @ExcludeMissing
            dailyLimit: JsonField<DirectionalLimits> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("is_fbo") @ExcludeMissing isFbo: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("monthly_limit")
            @ExcludeMissing
            monthlyLimit: JsonField<DirectionalLimits> = JsonMissing.of(),
            @JsonProperty("program_limit_per_transaction")
            @ExcludeMissing
            programLimitPerTransaction: JsonField<DirectionalLimits> = JsonMissing.of(),
        ) : this(
            companyId,
            dailyLimit,
            date,
            isFbo,
            monthlyLimit,
            programLimitPerTransaction,
            mutableMapOf(),
        )

        /**
         * Company ID
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun companyId(): String = companyId.getRequired("company_id")

        /**
         * Daily limits with progress
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dailyLimit(): DirectionalLimits = dailyLimit.getRequired("daily_limit")

        /**
         * The date for the limit view (ISO format)
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun date(): LocalDate = date.getRequired("date")

        /**
         * Whether the company is a FBO; based on the company ID prefix
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isFbo(): Boolean = isFbo.getRequired("is_fbo")

        /**
         * Monthly limits with progress
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monthlyLimit(): DirectionalLimits = monthlyLimit.getRequired("monthly_limit")

        /**
         * Program transaction limits
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun programLimitPerTransaction(): DirectionalLimits =
            programLimitPerTransaction.getRequired("program_limit_per_transaction")

        /**
         * Returns the raw JSON value of [companyId].
         *
         * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /**
         * Returns the raw JSON value of [dailyLimit].
         *
         * Unlike [dailyLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("daily_limit")
        @ExcludeMissing
        fun _dailyLimit(): JsonField<DirectionalLimits> = dailyLimit

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

        /**
         * Returns the raw JSON value of [isFbo].
         *
         * Unlike [isFbo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_fbo") @ExcludeMissing fun _isFbo(): JsonField<Boolean> = isFbo

        /**
         * Returns the raw JSON value of [monthlyLimit].
         *
         * Unlike [monthlyLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthly_limit")
        @ExcludeMissing
        fun _monthlyLimit(): JsonField<DirectionalLimits> = monthlyLimit

        /**
         * Returns the raw JSON value of [programLimitPerTransaction].
         *
         * Unlike [programLimitPerTransaction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("program_limit_per_transaction")
        @ExcludeMissing
        fun _programLimitPerTransaction(): JsonField<DirectionalLimits> = programLimitPerTransaction

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
             * Returns a mutable builder for constructing an instance of [TransferLimitItem].
             *
             * The following fields are required:
             * ```java
             * .companyId()
             * .dailyLimit()
             * .date()
             * .isFbo()
             * .monthlyLimit()
             * .programLimitPerTransaction()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransferLimitItem]. */
        class Builder internal constructor() {

            private var companyId: JsonField<String>? = null
            private var dailyLimit: JsonField<DirectionalLimits>? = null
            private var date: JsonField<LocalDate>? = null
            private var isFbo: JsonField<Boolean>? = null
            private var monthlyLimit: JsonField<DirectionalLimits>? = null
            private var programLimitPerTransaction: JsonField<DirectionalLimits>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transferLimitItem: TransferLimitItem) = apply {
                companyId = transferLimitItem.companyId
                dailyLimit = transferLimitItem.dailyLimit
                date = transferLimitItem.date
                isFbo = transferLimitItem.isFbo
                monthlyLimit = transferLimitItem.monthlyLimit
                programLimitPerTransaction = transferLimitItem.programLimitPerTransaction
                additionalProperties = transferLimitItem.additionalProperties.toMutableMap()
            }

            /** Company ID */
            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            /**
             * Sets [Builder.companyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /** Daily limits with progress */
            fun dailyLimit(dailyLimit: DirectionalLimits) = dailyLimit(JsonField.of(dailyLimit))

            /**
             * Sets [Builder.dailyLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyLimit] with a well-typed [DirectionalLimits]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dailyLimit(dailyLimit: JsonField<DirectionalLimits>) = apply {
                this.dailyLimit = dailyLimit
            }

            /** The date for the limit view (ISO format) */
            fun date(date: LocalDate) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [LocalDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            /** Whether the company is a FBO; based on the company ID prefix */
            fun isFbo(isFbo: Boolean) = isFbo(JsonField.of(isFbo))

            /**
             * Sets [Builder.isFbo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isFbo] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isFbo(isFbo: JsonField<Boolean>) = apply { this.isFbo = isFbo }

            /** Monthly limits with progress */
            fun monthlyLimit(monthlyLimit: DirectionalLimits) =
                monthlyLimit(JsonField.of(monthlyLimit))

            /**
             * Sets [Builder.monthlyLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyLimit] with a well-typed [DirectionalLimits]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun monthlyLimit(monthlyLimit: JsonField<DirectionalLimits>) = apply {
                this.monthlyLimit = monthlyLimit
            }

            /** Program transaction limits */
            fun programLimitPerTransaction(programLimitPerTransaction: DirectionalLimits) =
                programLimitPerTransaction(JsonField.of(programLimitPerTransaction))

            /**
             * Sets [Builder.programLimitPerTransaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.programLimitPerTransaction] with a well-typed
             * [DirectionalLimits] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun programLimitPerTransaction(
                programLimitPerTransaction: JsonField<DirectionalLimits>
            ) = apply { this.programLimitPerTransaction = programLimitPerTransaction }

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
             * Returns an immutable instance of [TransferLimitItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .companyId()
             * .dailyLimit()
             * .date()
             * .isFbo()
             * .monthlyLimit()
             * .programLimitPerTransaction()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransferLimitItem =
                TransferLimitItem(
                    checkRequired("companyId", companyId),
                    checkRequired("dailyLimit", dailyLimit),
                    checkRequired("date", date),
                    checkRequired("isFbo", isFbo),
                    checkRequired("monthlyLimit", monthlyLimit),
                    checkRequired("programLimitPerTransaction", programLimitPerTransaction),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TransferLimitItem = apply {
            if (validated) {
                return@apply
            }

            companyId()
            dailyLimit().validate()
            date()
            isFbo()
            monthlyLimit().validate()
            programLimitPerTransaction().validate()
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
            (if (companyId.asKnown().isPresent) 1 else 0) +
                (dailyLimit.asKnown().getOrNull()?.validity() ?: 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (if (isFbo.asKnown().isPresent) 1 else 0) +
                (monthlyLimit.asKnown().getOrNull()?.validity() ?: 0) +
                (programLimitPerTransaction.asKnown().getOrNull()?.validity() ?: 0)

        /** Daily limits with progress */
        class DirectionalLimits
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val credit: JsonField<LimitWithProgress>,
            private val debit: JsonField<LimitWithProgress>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit")
                @ExcludeMissing
                credit: JsonField<LimitWithProgress> = JsonMissing.of(),
                @JsonProperty("debit")
                @ExcludeMissing
                debit: JsonField<LimitWithProgress> = JsonMissing.of(),
            ) : this(credit, debit, mutableMapOf())

            /**
             * Credit limits
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun credit(): LimitWithProgress = credit.getRequired("credit")

            /**
             * Debit limits
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun debit(): LimitWithProgress = debit.getRequired("debit")

            /**
             * Returns the raw JSON value of [credit].
             *
             * Unlike [credit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("credit")
            @ExcludeMissing
            fun _credit(): JsonField<LimitWithProgress> = credit

            /**
             * Returns the raw JSON value of [debit].
             *
             * Unlike [debit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("debit")
            @ExcludeMissing
            fun _debit(): JsonField<LimitWithProgress> = debit

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
                 * Returns a mutable builder for constructing an instance of [DirectionalLimits].
                 *
                 * The following fields are required:
                 * ```java
                 * .credit()
                 * .debit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DirectionalLimits]. */
            class Builder internal constructor() {

                private var credit: JsonField<LimitWithProgress>? = null
                private var debit: JsonField<LimitWithProgress>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(directionalLimits: DirectionalLimits) = apply {
                    credit = directionalLimits.credit
                    debit = directionalLimits.debit
                    additionalProperties = directionalLimits.additionalProperties.toMutableMap()
                }

                /** Credit limits */
                fun credit(credit: LimitWithProgress) = credit(JsonField.of(credit))

                /**
                 * Sets [Builder.credit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.credit] with a well-typed [LimitWithProgress]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun credit(credit: JsonField<LimitWithProgress>) = apply { this.credit = credit }

                /** Debit limits */
                fun debit(debit: LimitWithProgress) = debit(JsonField.of(debit))

                /**
                 * Sets [Builder.debit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.debit] with a well-typed [LimitWithProgress]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun debit(debit: JsonField<LimitWithProgress>) = apply { this.debit = debit }

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
                 * Returns an immutable instance of [DirectionalLimits].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .credit()
                 * .debit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DirectionalLimits =
                    DirectionalLimits(
                        checkRequired("credit", credit),
                        checkRequired("debit", debit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DirectionalLimits = apply {
                if (validated) {
                    return@apply
                }

                credit().validate()
                debit().validate()
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
                (credit.asKnown().getOrNull()?.validity() ?: 0) +
                    (debit.asKnown().getOrNull()?.validity() ?: 0)

            /** Credit limits */
            class LimitWithProgress
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val limit: JsonField<Long>,
                private val amountOriginated: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("limit")
                    @ExcludeMissing
                    limit: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("amount_originated")
                    @ExcludeMissing
                    amountOriginated: JsonField<Long> = JsonMissing.of(),
                ) : this(limit, amountOriginated, mutableMapOf())

                /**
                 * The limit amount
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun limit(): Long = limit.getRequired("limit")

                /**
                 * Amount originated towards limit
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amountOriginated(): Optional<Long> =
                    amountOriginated.getOptional("amount_originated")

                /**
                 * Returns the raw JSON value of [limit].
                 *
                 * Unlike [limit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

                /**
                 * Returns the raw JSON value of [amountOriginated].
                 *
                 * Unlike [amountOriginated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_originated")
                @ExcludeMissing
                fun _amountOriginated(): JsonField<Long> = amountOriginated

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
                     * [LimitWithProgress].
                     *
                     * The following fields are required:
                     * ```java
                     * .limit()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LimitWithProgress]. */
                class Builder internal constructor() {

                    private var limit: JsonField<Long>? = null
                    private var amountOriginated: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(limitWithProgress: LimitWithProgress) = apply {
                        limit = limitWithProgress.limit
                        amountOriginated = limitWithProgress.amountOriginated
                        additionalProperties = limitWithProgress.additionalProperties.toMutableMap()
                    }

                    /** The limit amount */
                    fun limit(limit: Long) = limit(JsonField.of(limit))

                    /**
                     * Sets [Builder.limit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.limit] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

                    /** Amount originated towards limit */
                    fun amountOriginated(amountOriginated: Long) =
                        amountOriginated(JsonField.of(amountOriginated))

                    /**
                     * Sets [Builder.amountOriginated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountOriginated] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun amountOriginated(amountOriginated: JsonField<Long>) = apply {
                        this.amountOriginated = amountOriginated
                    }

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
                     * Returns an immutable instance of [LimitWithProgress].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .limit()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LimitWithProgress =
                        LimitWithProgress(
                            checkRequired("limit", limit),
                            amountOriginated,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LimitWithProgress = apply {
                    if (validated) {
                        return@apply
                    }

                    limit()
                    amountOriginated()
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
                    (if (limit.asKnown().isPresent) 1 else 0) +
                        (if (amountOriginated.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LimitWithProgress &&
                        limit == other.limit &&
                        amountOriginated == other.amountOriginated &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(limit, amountOriginated, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LimitWithProgress{limit=$limit, amountOriginated=$amountOriginated, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DirectionalLimits &&
                    credit == other.credit &&
                    debit == other.debit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(credit, debit, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DirectionalLimits{credit=$credit, debit=$debit, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransferLimitItem &&
                companyId == other.companyId &&
                dailyLimit == other.dailyLimit &&
                date == other.date &&
                isFbo == other.isFbo &&
                monthlyLimit == other.monthlyLimit &&
                programLimitPerTransaction == other.programLimitPerTransaction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                companyId,
                dailyLimit,
                date,
                isFbo,
                monthlyLimit,
                programLimitPerTransaction,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransferLimitItem{companyId=$companyId, dailyLimit=$dailyLimit, date=$date, isFbo=$isFbo, monthlyLimit=$monthlyLimit, programLimitPerTransaction=$programLimitPerTransaction, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferLimitsResponse &&
            data == other.data &&
            hasMore == other.hasMore &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, hasMore, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferLimitsResponse{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"
}
