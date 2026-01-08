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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FinancialAccountUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val creditConfiguration: JsonField<FinancialAccount.FinancialAccountCreditConfig>,
    private val isForBenefitOf: JsonField<Boolean>,
    private val nickname: JsonField<String>,
    private val status: JsonField<FinancialAccount.FinancialAccountStatus>,
    private val substatus: JsonField<FinancialAccount.FinancialAccountSubstatus>,
    private val type: JsonField<FinancialAccount.Type>,
    private val updated: JsonField<OffsetDateTime>,
    private val userDefinedStatus: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_configuration")
        @ExcludeMissing
        creditConfiguration: JsonField<FinancialAccount.FinancialAccountCreditConfig> =
            JsonMissing.of(),
        @JsonProperty("is_for_benefit_of")
        @ExcludeMissing
        isForBenefitOf: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<FinancialAccount.FinancialAccountStatus> = JsonMissing.of(),
        @JsonProperty("substatus")
        @ExcludeMissing
        substatus: JsonField<FinancialAccount.FinancialAccountSubstatus> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<FinancialAccount.Type> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_defined_status")
        @ExcludeMissing
        userDefinedStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        created,
        creditConfiguration,
        isForBenefitOf,
        nickname,
        status,
        substatus,
        type,
        updated,
        userDefinedStatus,
        accountNumber,
        routingNumber,
        eventType,
        mutableMapOf(),
    )

    fun toFinancialAccount(): FinancialAccount =
        FinancialAccount.builder()
            .token(token)
            .accountToken(accountToken)
            .created(created)
            .creditConfiguration(creditConfiguration)
            .isForBenefitOf(isForBenefitOf)
            .nickname(nickname)
            .status(status)
            .substatus(substatus)
            .type(type)
            .updated(updated)
            .userDefinedStatus(userDefinedStatus)
            .accountNumber(accountNumber)
            .routingNumber(routingNumber)
            .build()

    /**
     * Globally unique identifier for the account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditConfiguration(): Optional<FinancialAccount.FinancialAccountCreditConfig> =
        creditConfiguration.getOptional("credit_configuration")

    /**
     * Whether financial account is for the benefit of another entity
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isForBenefitOf(): Boolean = isForBenefitOf.getRequired("is_for_benefit_of")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nickname(): Optional<String> = nickname.getOptional("nickname")

    /**
     * Status of the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): FinancialAccount.FinancialAccountStatus = status.getRequired("status")

    /**
     * Substatus for the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun substatus(): Optional<FinancialAccount.FinancialAccountSubstatus> =
        substatus.getOptional("substatus")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): FinancialAccount.Type = type.getRequired("type")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * User-defined status for the financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefinedStatus(): Optional<String> = userDefinedStatus.getOptional("user_defined_status")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingNumber(): Optional<String> = routingNumber.getOptional("routing_number")

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [creditConfiguration].
     *
     * Unlike [creditConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_configuration")
    @ExcludeMissing
    fun _creditConfiguration(): JsonField<FinancialAccount.FinancialAccountCreditConfig> =
        creditConfiguration

    /**
     * Returns the raw JSON value of [isForBenefitOf].
     *
     * Unlike [isForBenefitOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_for_benefit_of")
    @ExcludeMissing
    fun _isForBenefitOf(): JsonField<Boolean> = isForBenefitOf

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<FinancialAccount.FinancialAccountStatus> = status

    /**
     * Returns the raw JSON value of [substatus].
     *
     * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("substatus")
    @ExcludeMissing
    fun _substatus(): JsonField<FinancialAccount.FinancialAccountSubstatus> = substatus

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FinancialAccount.Type> = type

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [userDefinedStatus].
     *
     * Unlike [userDefinedStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("user_defined_status")
    @ExcludeMissing
    fun _userDefinedStatus(): JsonField<String> = userDefinedStatus

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * [FinancialAccountUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .created()
         * .creditConfiguration()
         * .isForBenefitOf()
         * .nickname()
         * .status()
         * .substatus()
         * .type()
         * .updated()
         * .userDefinedStatus()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var creditConfiguration: JsonField<FinancialAccount.FinancialAccountCreditConfig>? =
            null
        private var isForBenefitOf: JsonField<Boolean>? = null
        private var nickname: JsonField<String>? = null
        private var status: JsonField<FinancialAccount.FinancialAccountStatus>? = null
        private var substatus: JsonField<FinancialAccount.FinancialAccountSubstatus>? = null
        private var type: JsonField<FinancialAccount.Type>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var userDefinedStatus: JsonField<String>? = null
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            financialAccountUpdatedWebhookEvent: FinancialAccountUpdatedWebhookEvent
        ) = apply {
            token = financialAccountUpdatedWebhookEvent.token
            accountToken = financialAccountUpdatedWebhookEvent.accountToken
            created = financialAccountUpdatedWebhookEvent.created
            creditConfiguration = financialAccountUpdatedWebhookEvent.creditConfiguration
            isForBenefitOf = financialAccountUpdatedWebhookEvent.isForBenefitOf
            nickname = financialAccountUpdatedWebhookEvent.nickname
            status = financialAccountUpdatedWebhookEvent.status
            substatus = financialAccountUpdatedWebhookEvent.substatus
            type = financialAccountUpdatedWebhookEvent.type
            updated = financialAccountUpdatedWebhookEvent.updated
            userDefinedStatus = financialAccountUpdatedWebhookEvent.userDefinedStatus
            accountNumber = financialAccountUpdatedWebhookEvent.accountNumber
            routingNumber = financialAccountUpdatedWebhookEvent.routingNumber
            eventType = financialAccountUpdatedWebhookEvent.eventType
            additionalProperties =
                financialAccountUpdatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountToken(accountToken: String?) = accountToken(JsonField.ofNullable(accountToken))

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun creditConfiguration(
            creditConfiguration: FinancialAccount.FinancialAccountCreditConfig?
        ) = creditConfiguration(JsonField.ofNullable(creditConfiguration))

        /**
         * Alias for calling [Builder.creditConfiguration] with `creditConfiguration.orElse(null)`.
         */
        fun creditConfiguration(
            creditConfiguration: Optional<FinancialAccount.FinancialAccountCreditConfig>
        ) = creditConfiguration(creditConfiguration.getOrNull())

        /**
         * Sets [Builder.creditConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditConfiguration] with a well-typed
         * [FinancialAccount.FinancialAccountCreditConfig] value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun creditConfiguration(
            creditConfiguration: JsonField<FinancialAccount.FinancialAccountCreditConfig>
        ) = apply { this.creditConfiguration = creditConfiguration }

        /** Whether financial account is for the benefit of another entity */
        fun isForBenefitOf(isForBenefitOf: Boolean) = isForBenefitOf(JsonField.of(isForBenefitOf))

        /**
         * Sets [Builder.isForBenefitOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isForBenefitOf] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isForBenefitOf(isForBenefitOf: JsonField<Boolean>) = apply {
            this.isForBenefitOf = isForBenefitOf
        }

        fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

        /** Alias for calling [Builder.nickname] with `nickname.orElse(null)`. */
        fun nickname(nickname: Optional<String>) = nickname(nickname.getOrNull())

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /** Status of the financial account */
        fun status(status: FinancialAccount.FinancialAccountStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed
         * [FinancialAccount.FinancialAccountStatus] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<FinancialAccount.FinancialAccountStatus>) = apply {
            this.status = status
        }

        /** Substatus for the financial account */
        fun substatus(substatus: FinancialAccount.FinancialAccountSubstatus?) =
            substatus(JsonField.ofNullable(substatus))

        /** Alias for calling [Builder.substatus] with `substatus.orElse(null)`. */
        fun substatus(substatus: Optional<FinancialAccount.FinancialAccountSubstatus>) =
            substatus(substatus.getOrNull())

        /**
         * Sets [Builder.substatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.substatus] with a well-typed
         * [FinancialAccount.FinancialAccountSubstatus] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun substatus(substatus: JsonField<FinancialAccount.FinancialAccountSubstatus>) = apply {
            this.substatus = substatus
        }

        fun type(type: FinancialAccount.Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [FinancialAccount.Type] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<FinancialAccount.Type>) = apply { this.type = type }

        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** User-defined status for the financial account */
        fun userDefinedStatus(userDefinedStatus: String?) =
            userDefinedStatus(JsonField.ofNullable(userDefinedStatus))

        /** Alias for calling [Builder.userDefinedStatus] with `userDefinedStatus.orElse(null)`. */
        fun userDefinedStatus(userDefinedStatus: Optional<String>) =
            userDefinedStatus(userDefinedStatus.getOrNull())

        /**
         * Sets [Builder.userDefinedStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDefinedStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userDefinedStatus(userDefinedStatus: JsonField<String>) = apply {
            this.userDefinedStatus = userDefinedStatus
        }

        fun accountNumber(accountNumber: String?) =
            accountNumber(JsonField.ofNullable(accountNumber))

        /** Alias for calling [Builder.accountNumber] with `accountNumber.orElse(null)`. */
        fun accountNumber(accountNumber: Optional<String>) =
            accountNumber(accountNumber.getOrNull())

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun routingNumber(routingNumber: String?) =
            routingNumber(JsonField.ofNullable(routingNumber))

        /** Alias for calling [Builder.routingNumber] with `routingNumber.orElse(null)`. */
        fun routingNumber(routingNumber: Optional<String>) =
            routingNumber(routingNumber.getOrNull())

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
         * Returns an immutable instance of [FinancialAccountUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .created()
         * .creditConfiguration()
         * .isForBenefitOf()
         * .nickname()
         * .status()
         * .substatus()
         * .type()
         * .updated()
         * .userDefinedStatus()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountUpdatedWebhookEvent =
            FinancialAccountUpdatedWebhookEvent(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("created", created),
                checkRequired("creditConfiguration", creditConfiguration),
                checkRequired("isForBenefitOf", isForBenefitOf),
                checkRequired("nickname", nickname),
                checkRequired("status", status),
                checkRequired("substatus", substatus),
                checkRequired("type", type),
                checkRequired("updated", updated),
                checkRequired("userDefinedStatus", userDefinedStatus),
                accountNumber,
                routingNumber,
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FinancialAccountUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        created()
        creditConfiguration().ifPresent { it.validate() }
        isForBenefitOf()
        nickname()
        status().validate()
        substatus().ifPresent { it.validate() }
        type().validate()
        updated()
        userDefinedStatus()
        accountNumber()
        routingNumber()
        eventType().validate()
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
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (creditConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isForBenefitOf.asKnown().isPresent) 1 else 0) +
            (if (nickname.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (substatus.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (userDefinedStatus.asKnown().isPresent) 1 else 0) +
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (if (routingNumber.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** The type of event that occurred. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FINANCIAL_ACCOUNT_UPDATED = of("financial_account.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            FINANCIAL_ACCOUNT_UPDATED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FINANCIAL_ACCOUNT_UPDATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                FINANCIAL_ACCOUNT_UPDATED -> Value.FINANCIAL_ACCOUNT_UPDATED
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
                FINANCIAL_ACCOUNT_UPDATED -> Known.FINANCIAL_ACCOUNT_UPDATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountUpdatedWebhookEvent &&
            token == other.token &&
            accountToken == other.accountToken &&
            created == other.created &&
            creditConfiguration == other.creditConfiguration &&
            isForBenefitOf == other.isForBenefitOf &&
            nickname == other.nickname &&
            status == other.status &&
            substatus == other.substatus &&
            type == other.type &&
            updated == other.updated &&
            userDefinedStatus == other.userDefinedStatus &&
            accountNumber == other.accountNumber &&
            routingNumber == other.routingNumber &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountToken,
            created,
            creditConfiguration,
            isForBenefitOf,
            nickname,
            status,
            substatus,
            type,
            updated,
            userDefinedStatus,
            accountNumber,
            routingNumber,
            eventType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccountUpdatedWebhookEvent{token=$token, accountToken=$accountToken, created=$created, creditConfiguration=$creditConfiguration, isForBenefitOf=$isForBenefitOf, nickname=$nickname, status=$status, substatus=$substatus, type=$type, updated=$updated, userDefinedStatus=$userDefinedStatus, accountNumber=$accountNumber, routingNumber=$routingNumber, eventType=$eventType, additionalProperties=$additionalProperties}"
}
