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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Create management operation */
class ManagementOperationCreateParams
private constructor(
    private val body: CreateManagementOperationRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): ManagementOperationCategory = body.category()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): ManagementOperationDirection = body.direction()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = body.effectiveDate()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): ManagementOperationEventType = body.eventType()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String = body.financialAccountToken()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = body.token()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memo(): Optional<String> = body.memo()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subtype(): Optional<String> = body.subtype()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedId(): Optional<String> = body.userDefinedId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<ManagementOperationCategory> = body._category()

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _direction(): JsonField<ManagementOperationDirection> = body._direction()

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventType(): JsonField<ManagementOperationEventType> = body._eventType()

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _financialAccountToken(): JsonField<String> = body._financialAccountToken()

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _token(): JsonField<String> = body._token()

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memo(): JsonField<String> = body._memo()

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subtype(): JsonField<String> = body._subtype()

    /**
     * Returns the raw JSON value of [userDefinedId].
     *
     * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userDefinedId(): JsonField<String> = body._userDefinedId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): CreateManagementOperationRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CreateManagementOperationRequest
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<ManagementOperationCategory> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<ManagementOperationDirection> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonField<ManagementOperationEventType> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        private val financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subtype")
        @ExcludeMissing
        private val subtype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        private val userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): ManagementOperationCategory = category.getRequired("category")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): ManagementOperationDirection = direction.getRequired("direction")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): ManagementOperationEventType = eventType.getRequired("event_type")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subtype(): Optional<String> = Optional.ofNullable(subtype.getNullable("subtype"))

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userDefinedId(): Optional<String> =
            Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<ManagementOperationCategory> = category

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<ManagementOperationDirection> = direction

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<ManagementOperationEventType> = eventType

        /**
         * Returns the raw JSON value of [financialAccountToken].
         *
         * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

        /**
         * Returns the raw JSON value of [userDefinedId].
         *
         * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreateManagementOperationRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            category()
            direction()
            effectiveDate()
            eventType()
            financialAccountToken()
            token()
            memo()
            subtype()
            userDefinedId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [CreateManagementOperationRequest].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .category()
             * .direction()
             * .effectiveDate()
             * .eventType()
             * .financialAccountToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreateManagementOperationRequest]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var category: JsonField<ManagementOperationCategory>? = null
            private var direction: JsonField<ManagementOperationDirection>? = null
            private var effectiveDate: JsonField<LocalDate>? = null
            private var eventType: JsonField<ManagementOperationEventType>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var token: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var subtype: JsonField<String> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createManagementOperationRequest: CreateManagementOperationRequest) =
                apply {
                    amount = createManagementOperationRequest.amount
                    category = createManagementOperationRequest.category
                    direction = createManagementOperationRequest.direction
                    effectiveDate = createManagementOperationRequest.effectiveDate
                    eventType = createManagementOperationRequest.eventType
                    financialAccountToken = createManagementOperationRequest.financialAccountToken
                    token = createManagementOperationRequest.token
                    memo = createManagementOperationRequest.memo
                    subtype = createManagementOperationRequest.subtype
                    userDefinedId = createManagementOperationRequest.userDefinedId
                    additionalProperties =
                        createManagementOperationRequest.additionalProperties.toMutableMap()
                }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun category(category: ManagementOperationCategory) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed
             * [ManagementOperationCategory] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun category(category: JsonField<ManagementOperationCategory>) = apply {
                this.category = category
            }

            fun direction(direction: ManagementOperationDirection) =
                direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed
             * [ManagementOperationDirection] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun direction(direction: JsonField<ManagementOperationDirection>) = apply {
                this.direction = direction
            }

            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun eventType(eventType: ManagementOperationEventType) =
                eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed
             * [ManagementOperationEventType] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun eventType(eventType: JsonField<ManagementOperationEventType>) = apply {
                this.eventType = eventType
            }

            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /**
             * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun subtype(subtype: String) = subtype(JsonField.of(subtype))

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            /**
             * Sets [Builder.userDefinedId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userDefinedId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
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

            fun build(): CreateManagementOperationRequest =
                CreateManagementOperationRequest(
                    checkRequired("amount", amount),
                    checkRequired("category", category),
                    checkRequired("direction", direction),
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("eventType", eventType),
                    checkRequired("financialAccountToken", financialAccountToken),
                    token,
                    memo,
                    subtype,
                    userDefinedId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreateManagementOperationRequest && amount == other.amount && category == other.category && direction == other.direction && effectiveDate == other.effectiveDate && eventType == other.eventType && financialAccountToken == other.financialAccountToken && token == other.token && memo == other.memo && subtype == other.subtype && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, category, direction, effectiveDate, eventType, financialAccountToken, token, memo, subtype, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateManagementOperationRequest{amount=$amount, category=$category, direction=$direction, effectiveDate=$effectiveDate, eventType=$eventType, financialAccountToken=$financialAccountToken, token=$token, memo=$memo, subtype=$subtype, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ManagementOperationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .category()
         * .direction()
         * .effectiveDate()
         * .eventType()
         * .financialAccountToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManagementOperationCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: CreateManagementOperationRequest.Builder =
            CreateManagementOperationRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(managementOperationCreateParams: ManagementOperationCreateParams) =
            apply {
                body = managementOperationCreateParams.body.toBuilder()
                additionalHeaders = managementOperationCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    managementOperationCreateParams.additionalQueryParams.toBuilder()
            }

        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        fun category(category: ManagementOperationCategory) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed
         * [ManagementOperationCategory] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<ManagementOperationCategory>) = apply {
            body.category(category)
        }

        fun direction(direction: ManagementOperationDirection) = apply { body.direction(direction) }

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed
         * [ManagementOperationDirection] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun direction(direction: JsonField<ManagementOperationDirection>) = apply {
            body.direction(direction)
        }

        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        fun eventType(eventType: ManagementOperationEventType) = apply { body.eventType(eventType) }

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed
         * [ManagementOperationEventType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun eventType(eventType: JsonField<ManagementOperationEventType>) = apply {
            body.eventType(eventType)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun token(token: String) = apply { body.token(token) }

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        fun memo(memo: String) = apply { body.memo(memo) }

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        fun subtype(subtype: String) = apply { body.subtype(subtype) }

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtype(subtype: JsonField<String>) = apply { body.subtype(subtype) }

        fun userDefinedId(userDefinedId: String) = apply { body.userDefinedId(userDefinedId) }

        /**
         * Sets [Builder.userDefinedId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDefinedId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            body.userDefinedId(userDefinedId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): ManagementOperationCreateParams =
            ManagementOperationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ManagementOperationCategory
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

            @JvmField val MANAGEMENT_FEE = of("MANAGEMENT_FEE")

            @JvmField val MANAGEMENT_DISPUTE = of("MANAGEMENT_DISPUTE")

            @JvmField val MANAGEMENT_REWARD = of("MANAGEMENT_REWARD")

            @JvmField val MANAGEMENT_ADJUSTMENT = of("MANAGEMENT_ADJUSTMENT")

            @JvmStatic fun of(value: String) = ManagementOperationCategory(JsonField.of(value))
        }

        /** An enum containing [ManagementOperationCategory]'s known values. */
        enum class Known {
            MANAGEMENT_FEE,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_REWARD,
            MANAGEMENT_ADJUSTMENT,
        }

        /**
         * An enum containing [ManagementOperationCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ManagementOperationCategory] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MANAGEMENT_FEE,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_REWARD,
            MANAGEMENT_ADJUSTMENT,
            /**
             * An enum member indicating that [ManagementOperationCategory] was instantiated with an
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
                MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
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
                MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationCategory: $value")
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

            return /* spotless:off */ other is ManagementOperationCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ManagementOperationDirection
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

            @JvmField val CREDIT = of("CREDIT")

            @JvmField val DEBIT = of("DEBIT")

            @JvmStatic fun of(value: String) = ManagementOperationDirection(JsonField.of(value))
        }

        /** An enum containing [ManagementOperationDirection]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [ManagementOperationDirection]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ManagementOperationDirection] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [ManagementOperationDirection] was instantiated with
             * an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationDirection: $value")
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

            return /* spotless:off */ other is ManagementOperationDirection && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ManagementOperationEventType
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

            @JvmField val CASH_BACK = of("CASH_BACK")

            @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

            @JvmField val INTEREST = of("INTEREST")

            @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

            @JvmField val BILLING_ERROR = of("BILLING_ERROR")

            @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

            @JvmField val CASH_BACK_REVERSAL = of("CASH_BACK_REVERSAL")

            @JvmField val CURRENCY_CONVERSION_REVERSAL = of("CURRENCY_CONVERSION_REVERSAL")

            @JvmField val INTEREST_REVERSAL = of("INTEREST_REVERSAL")

            @JvmField val LATE_PAYMENT_REVERSAL = of("LATE_PAYMENT_REVERSAL")

            @JvmField val BILLING_ERROR_REVERSAL = of("BILLING_ERROR_REVERSAL")

            @JvmField val PROVISIONAL_CREDIT_REVERSAL = of("PROVISIONAL_CREDIT_REVERSAL")

            @JvmField val RETURNED_PAYMENT = of("RETURNED_PAYMENT")

            @JvmField val RETURNED_PAYMENT_REVERSAL = of("RETURNED_PAYMENT_REVERSAL")

            @JvmStatic fun of(value: String) = ManagementOperationEventType(JsonField.of(value))
        }

        /** An enum containing [ManagementOperationEventType]'s known values. */
        enum class Known {
            CASH_BACK,
            CURRENCY_CONVERSION,
            INTEREST,
            LATE_PAYMENT,
            BILLING_ERROR,
            PROVISIONAL_CREDIT,
            CASH_BACK_REVERSAL,
            CURRENCY_CONVERSION_REVERSAL,
            INTEREST_REVERSAL,
            LATE_PAYMENT_REVERSAL,
            BILLING_ERROR_REVERSAL,
            PROVISIONAL_CREDIT_REVERSAL,
            RETURNED_PAYMENT,
            RETURNED_PAYMENT_REVERSAL,
        }

        /**
         * An enum containing [ManagementOperationEventType]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ManagementOperationEventType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CASH_BACK,
            CURRENCY_CONVERSION,
            INTEREST,
            LATE_PAYMENT,
            BILLING_ERROR,
            PROVISIONAL_CREDIT,
            CASH_BACK_REVERSAL,
            CURRENCY_CONVERSION_REVERSAL,
            INTEREST_REVERSAL,
            LATE_PAYMENT_REVERSAL,
            BILLING_ERROR_REVERSAL,
            PROVISIONAL_CREDIT_REVERSAL,
            RETURNED_PAYMENT,
            RETURNED_PAYMENT_REVERSAL,
            /**
             * An enum member indicating that [ManagementOperationEventType] was instantiated with
             * an unknown value.
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
                CASH_BACK -> Value.CASH_BACK
                CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                INTEREST -> Value.INTEREST
                LATE_PAYMENT -> Value.LATE_PAYMENT
                BILLING_ERROR -> Value.BILLING_ERROR
                PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                CASH_BACK_REVERSAL -> Value.CASH_BACK_REVERSAL
                CURRENCY_CONVERSION_REVERSAL -> Value.CURRENCY_CONVERSION_REVERSAL
                INTEREST_REVERSAL -> Value.INTEREST_REVERSAL
                LATE_PAYMENT_REVERSAL -> Value.LATE_PAYMENT_REVERSAL
                BILLING_ERROR_REVERSAL -> Value.BILLING_ERROR_REVERSAL
                PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                RETURNED_PAYMENT -> Value.RETURNED_PAYMENT
                RETURNED_PAYMENT_REVERSAL -> Value.RETURNED_PAYMENT_REVERSAL
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
                CASH_BACK -> Known.CASH_BACK
                CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                INTEREST -> Known.INTEREST
                LATE_PAYMENT -> Known.LATE_PAYMENT
                BILLING_ERROR -> Known.BILLING_ERROR
                PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                CASH_BACK_REVERSAL -> Known.CASH_BACK_REVERSAL
                CURRENCY_CONVERSION_REVERSAL -> Known.CURRENCY_CONVERSION_REVERSAL
                INTEREST_REVERSAL -> Known.INTEREST_REVERSAL
                LATE_PAYMENT_REVERSAL -> Known.LATE_PAYMENT_REVERSAL
                BILLING_ERROR_REVERSAL -> Known.BILLING_ERROR_REVERSAL
                PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                RETURNED_PAYMENT -> Known.RETURNED_PAYMENT
                RETURNED_PAYMENT_REVERSAL -> Known.RETURNED_PAYMENT_REVERSAL
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationEventType: $value")
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

            return /* spotless:off */ other is ManagementOperationEventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ManagementOperationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
