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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A single event that affects the transaction state and lifecycle. */
@NoAutoDetect
class Event
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("event_type")
    @ExcludeMissing
    private val eventType: JsonField<EventType> = JsonMissing.of(),
    @JsonProperty("payload")
    @ExcludeMissing
    private val payload: JsonField<Payload> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Event types:
     * - `account_holder.created` - Notification that a new account holder has been created and was
     *   not rejected.
     * - `account_holder.updated` - Notification that an account holder was updated.
     * - `account_holder.verification` - Notification than an account holder's identity verification
     *   is complete.
     * - `card.created` - Notification that a card has been created.
     * - `card.renewed` - Notification that a card has been renewed.
     * - `card.reissued` - Notification that a card has been reissued.
     * - `card.shipped` - Physical card shipment notification. See
     *   https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
     * - `card.converted` - Notification that a virtual card has been converted to a physical card.
     * - `card_transaction.updated` - Transaction Lifecycle webhook. See
     *   https://docs.lithic.com/docs/transaction-webhooks.
     * - `dispute.updated` - A dispute has been updated.
     * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
     *   activate a digital wallet token.
     * - `digital_wallet.tokenization_result` - Notification of the end result of a tokenization,
     *   whether successful or failed.
     * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to an
     *   end user to complete digital wallet authentication. See
     *   https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
     * - `digital_wallet.tokenization_two_factor_authentication_code_sent` - Notification that a two
     *   factor authentication code for activating a digital wallet has been sent to the end user.
     * - `digital_wallet.tokenization_updated` - Notification that a digital wallet tokenization's
     *   status has changed.
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    fun payload(): Payload = payload.getRequired("payload")

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Event types:
     * - `account_holder.created` - Notification that a new account holder has been created and was
     *   not rejected.
     * - `account_holder.updated` - Notification that an account holder was updated.
     * - `account_holder.verification` - Notification than an account holder's identity verification
     *   is complete.
     * - `card.created` - Notification that a card has been created.
     * - `card.renewed` - Notification that a card has been renewed.
     * - `card.reissued` - Notification that a card has been reissued.
     * - `card.shipped` - Physical card shipment notification. See
     *   https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
     * - `card.converted` - Notification that a virtual card has been converted to a physical card.
     * - `card_transaction.updated` - Transaction Lifecycle webhook. See
     *   https://docs.lithic.com/docs/transaction-webhooks.
     * - `dispute.updated` - A dispute has been updated.
     * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
     *   activate a digital wallet token.
     * - `digital_wallet.tokenization_result` - Notification of the end result of a tokenization,
     *   whether successful or failed.
     * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to an
     *   end user to complete digital wallet authentication. See
     *   https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
     * - `digital_wallet.tokenization_two_factor_authentication_code_sent` - Notification that a two
     *   factor authentication code for activating a digital wallet has been sent to the end user.
     * - `digital_wallet.tokenization_updated` - Notification that a digital wallet tokenization's
     *   status has changed.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Event = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        eventType()
        payload().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Event]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var eventType: JsonField<EventType>? = null
        private var payload: JsonField<Payload>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(event: Event) = apply {
            token = event.token
            created = event.created
            eventType = event.eventType
            payload = event.payload
            additionalProperties = event.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * An RFC 3339 timestamp for when the event was created. UTC time zone.
         *
         * If no timezone is specified, UTC will be used.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * An RFC 3339 timestamp for when the event was created. UTC time zone.
         *
         * If no timezone is specified, UTC will be used.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Event types:
         * - `account_holder.created` - Notification that a new account holder has been created and
         *   was not rejected.
         * - `account_holder.updated` - Notification that an account holder was updated.
         * - `account_holder.verification` - Notification than an account holder's identity
         *   verification is complete.
         * - `card.created` - Notification that a card has been created.
         * - `card.renewed` - Notification that a card has been renewed.
         * - `card.reissued` - Notification that a card has been reissued.
         * - `card.shipped` - Physical card shipment notification. See
         *   https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
         * - `card.converted` - Notification that a virtual card has been converted to a physical
         *   card.
         * - `card_transaction.updated` - Transaction Lifecycle webhook. See
         *   https://docs.lithic.com/docs/transaction-webhooks.
         * - `dispute.updated` - A dispute has been updated.
         * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
         *   activate a digital wallet token.
         * - `digital_wallet.tokenization_result` - Notification of the end result of a
         *   tokenization, whether successful or failed.
         * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to
         *   an end user to complete digital wallet authentication. See
         *   https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
         * - `digital_wallet.tokenization_two_factor_authentication_code_sent` - Notification that a
         *   two factor authentication code for activating a digital wallet has been sent to the end
         *   user.
         * - `digital_wallet.tokenization_updated` - Notification that a digital wallet
         *   tokenization's status has changed.
         */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Event types:
         * - `account_holder.created` - Notification that a new account holder has been created and
         *   was not rejected.
         * - `account_holder.updated` - Notification that an account holder was updated.
         * - `account_holder.verification` - Notification than an account holder's identity
         *   verification is complete.
         * - `card.created` - Notification that a card has been created.
         * - `card.renewed` - Notification that a card has been renewed.
         * - `card.reissued` - Notification that a card has been reissued.
         * - `card.shipped` - Physical card shipment notification. See
         *   https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
         * - `card.converted` - Notification that a virtual card has been converted to a physical
         *   card.
         * - `card_transaction.updated` - Transaction Lifecycle webhook. See
         *   https://docs.lithic.com/docs/transaction-webhooks.
         * - `dispute.updated` - A dispute has been updated.
         * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
         *   activate a digital wallet token.
         * - `digital_wallet.tokenization_result` - Notification of the end result of a
         *   tokenization, whether successful or failed.
         * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to
         *   an end user to complete digital wallet authentication. See
         *   https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
         * - `digital_wallet.tokenization_two_factor_authentication_code_sent` - Notification that a
         *   two factor authentication code for activating a digital wallet has been sent to the end
         *   user.
         * - `digital_wallet.tokenization_updated` - Notification that a digital wallet
         *   tokenization's status has changed.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun payload(payload: Payload) = payload(JsonField.of(payload))

        fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

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

        fun build(): Event =
            Event(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("eventType", eventType),
                checkRequired("payload", payload),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Event types:
     * - `account_holder.created` - Notification that a new account holder has been created and was
     *   not rejected.
     * - `account_holder.updated` - Notification that an account holder was updated.
     * - `account_holder.verification` - Notification than an account holder's identity verification
     *   is complete.
     * - `card.created` - Notification that a card has been created.
     * - `card.renewed` - Notification that a card has been renewed.
     * - `card.reissued` - Notification that a card has been reissued.
     * - `card.shipped` - Physical card shipment notification. See
     *   https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
     * - `card.converted` - Notification that a virtual card has been converted to a physical card.
     * - `card_transaction.updated` - Transaction Lifecycle webhook. See
     *   https://docs.lithic.com/docs/transaction-webhooks.
     * - `dispute.updated` - A dispute has been updated.
     * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
     *   activate a digital wallet token.
     * - `digital_wallet.tokenization_result` - Notification of the end result of a tokenization,
     *   whether successful or failed.
     * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to an
     *   end user to complete digital wallet authentication. See
     *   https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
     * - `digital_wallet.tokenization_two_factor_authentication_code_sent` - Notification that a two
     *   factor authentication code for activating a digital wallet has been sent to the end user.
     * - `digital_wallet.tokenization_updated` - Notification that a digital wallet tokenization's
     *   status has changed.
     */
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

            @JvmField val ACCOUNT_HOLDER_CREATED = of("account_holder.created")

            @JvmField val ACCOUNT_HOLDER_UPDATED = of("account_holder.updated")

            @JvmField val ACCOUNT_HOLDER_VERIFICATION = of("account_holder.verification")

            @JvmField
            val AUTH_RULES_PERFORMANCE_REPORT_CREATED = of("auth_rules.performance_report.created")

            @JvmField val BALANCE_UPDATED = of("balance.updated")

            @JvmField
            val BOOK_TRANSFER_TRANSACTION_CREATED = of("book_transfer_transaction.created")

            @JvmField val CARD_CREATED = of("card.created")

            @JvmField val CARD_RENEWED = of("card.renewed")

            @JvmField val CARD_REISSUED = of("card.reissued")

            @JvmField val CARD_CONVERTED = of("card.converted")

            @JvmField val CARD_SHIPPED = of("card.shipped")

            @JvmField val CARD_TRANSACTION_UPDATED = of("card_transaction.updated")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                of("digital_wallet.tokenization_approval_request")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_RESULT = of("digital_wallet.tokenization_result")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                of("digital_wallet.tokenization_two_factor_authentication_code")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                of("digital_wallet.tokenization_two_factor_authentication_code_sent")

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_UPDATED = of("digital_wallet.tokenization_updated")

            @JvmField val DISPUTE_UPDATED = of("dispute.updated")

            @JvmField val DISPUTE_EVIDENCE_UPLOAD_FAILED = of("dispute_evidence.upload_failed")

            @JvmField val EXTERNAL_BANK_ACCOUNT_CREATED = of("external_bank_account.created")

            @JvmField val EXTERNAL_BANK_ACCOUNT_UPDATED = of("external_bank_account.updated")

            @JvmField val EXTERNAL_PAYMENT_CREATED = of("external_payment.created")

            @JvmField val EXTERNAL_PAYMENT_UPDATED = of("external_payment.updated")

            @JvmField val FINANCIAL_ACCOUNT_CREATED = of("financial_account.created")

            @JvmField val FINANCIAL_ACCOUNT_UPDATED = of("financial_account.updated")

            @JvmField val LOAN_TAPE_CREATED = of("loan_tape.created")

            @JvmField val LOAN_TAPE_UPDATED = of("loan_tape.updated")

            @JvmField val MANAGEMENT_OPERATION_CREATED = of("management_operation.created")

            @JvmField val MANAGEMENT_OPERATION_UPDATED = of("management_operation.updated")

            @JvmField val PAYMENT_TRANSACTION_CREATED = of("payment_transaction.created")

            @JvmField val PAYMENT_TRANSACTION_UPDATED = of("payment_transaction.updated")

            @JvmField val SETTLEMENT_REPORT_UPDATED = of("settlement_report.updated")

            @JvmField val STATEMENTS_CREATED = of("statements.created")

            @JvmField val THREE_DS_AUTHENTICATION_CREATED = of("three_ds_authentication.created")

            @JvmField val THREE_DS_AUTHENTICATION_UPDATED = of("three_ds_authentication.updated")

            @JvmField val TOKENIZATION_APPROVAL_REQUEST = of("tokenization.approval_request")

            @JvmField val TOKENIZATION_RESULT = of("tokenization.result")

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                of("tokenization.two_factor_authentication_code")

            @JvmField
            val TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                of("tokenization.two_factor_authentication_code_sent")

            @JvmField val TOKENIZATION_UPDATED = of("tokenization.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_PERFORMANCE_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_REISSUED,
            CARD_CONVERTED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            THREE_DS_AUTHENTICATION_UPDATED,
            TOKENIZATION_APPROVAL_REQUEST,
            TOKENIZATION_RESULT,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            TOKENIZATION_UPDATED,
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
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_PERFORMANCE_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_REISSUED,
            CARD_CONVERTED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            THREE_DS_AUTHENTICATION_UPDATED,
            TOKENIZATION_APPROVAL_REQUEST,
            TOKENIZATION_RESULT,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            TOKENIZATION_UPDATED,
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
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Value.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_PERFORMANCE_REPORT_CREATED -> Value.AUTH_RULES_PERFORMANCE_REPORT_CREATED
                BALANCE_UPDATED -> Value.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Value.BOOK_TRANSFER_TRANSACTION_CREATED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_RENEWED -> Value.CARD_RENEWED
                CARD_REISSUED -> Value.CARD_REISSUED
                CARD_CONVERTED -> Value.CARD_CONVERTED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Value.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Value.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Value.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Value.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Value.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Value.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Value.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Value.FINANCIAL_ACCOUNT_UPDATED
                LOAN_TAPE_CREATED -> Value.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Value.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Value.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Value.MANAGEMENT_OPERATION_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Value.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Value.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Value.THREE_DS_AUTHENTICATION_CREATED
                THREE_DS_AUTHENTICATION_UPDATED -> Value.THREE_DS_AUTHENTICATION_UPDATED
                TOKENIZATION_APPROVAL_REQUEST -> Value.TOKENIZATION_APPROVAL_REQUEST
                TOKENIZATION_RESULT -> Value.TOKENIZATION_RESULT
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                TOKENIZATION_UPDATED -> Value.TOKENIZATION_UPDATED
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
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Known.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_PERFORMANCE_REPORT_CREATED -> Known.AUTH_RULES_PERFORMANCE_REPORT_CREATED
                BALANCE_UPDATED -> Known.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Known.BOOK_TRANSFER_TRANSACTION_CREATED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_RENEWED -> Known.CARD_RENEWED
                CARD_REISSUED -> Known.CARD_REISSUED
                CARD_CONVERTED -> Known.CARD_CONVERTED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Known.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Known.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Known.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Known.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Known.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Known.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Known.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Known.FINANCIAL_ACCOUNT_UPDATED
                LOAN_TAPE_CREATED -> Known.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Known.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Known.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Known.MANAGEMENT_OPERATION_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Known.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Known.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Known.THREE_DS_AUTHENTICATION_CREATED
                THREE_DS_AUTHENTICATION_UPDATED -> Known.THREE_DS_AUTHENTICATION_UPDATED
                TOKENIZATION_APPROVAL_REQUEST -> Known.TOKENIZATION_APPROVAL_REQUEST
                TOKENIZATION_RESULT -> Known.TOKENIZATION_RESULT
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                TOKENIZATION_UPDATED -> Known.TOKENIZATION_UPDATED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Payload
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payload]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                additionalProperties = payload.additionalProperties.toMutableMap()
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

            fun build(): Payload = Payload(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Payload && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Payload{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Event && token == other.token && created == other.created && eventType == other.eventType && payload == other.payload && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, eventType, payload, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Event{token=$token, created=$created, eventType=$eventType, payload=$payload, additionalProperties=$additionalProperties}"
}
