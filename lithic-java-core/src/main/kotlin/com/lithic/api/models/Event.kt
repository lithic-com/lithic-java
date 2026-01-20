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
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A single event that affects the transaction state and lifecycle. */
class Event
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val payload: JsonField<Payload>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
    ) : this(token, created, eventType, payload, mutableMapOf())

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The type of event that occurred. Possible values:
     * - account_holder_document.updated: Occurs when an account holder's document upload status has
     *   been updated
     * - account_holder.created: Occurs when a new account_holder is created.
     * - account_holder.updated: Occurs when an account_holder is updated.
     * - account_holder.verification: Occurs when an asynchronous account_holder's verification is
     *   completed.
     * - auth_rules.backtest_report.created: Auth Rules backtest report created.
     * - balance.updated: Financial Account Balance Update
     * - book_transfer_transaction.created: Occurs when a book transfer transaction is created.
     * - book_transfer_transaction.updated: Occurs when a book transfer transaction is updated.
     * - card_transaction.enhanced_data.created: Occurs when L2/L3 enhanced commercial data is
     *   processed for a transaction event.
     * - card_transaction.enhanced_data.updated: Occurs when L2/L3 enhanced commercial data is
     *   reprocessed for a transaction event.
     * - card_transaction.updated: Occurs when a card transaction happens.
     * - card.converted: Occurs when a card is converted from virtual to physical cards.
     * - card.created: Occurs when a new card is created.
     * - card.reissued: Occurs when a card is reissued.
     * - card.renewed: Occurs when a card is renewed.
     * - card.shipped: Occurs when a card is shipped.
     * - card.updated: Occurs when a card is updated.
     * - digital_wallet.tokenization_approval_request: Occurs when a tokenization approval request
     *   is made. This event will be deprecated in the future. We recommend using
     *   `tokenization.approval_request` instead.
     * - digital_wallet.tokenization_result: Occurs when a tokenization request succeeded or failed.
     *
     * This event will be deprecated in the future. We recommend using `tokenization.result`
     * instead.
     * - digital_wallet.tokenization_two_factor_authentication_code: Occurs when a tokenization
     *   request 2FA code is sent to the Lithic customer for self serve delivery.
     *
     * This event will be deprecated in the future. We recommend using
     * `tokenization.two_factor_authentication_code` instead.
     * - digital_wallet.tokenization_two_factor_authentication_code_sent: Occurs when a tokenization
     *   request 2FA code is sent to our downstream messaging providers for delivery.
     *
     * This event will be deprecated in the future. We recommend using
     * `tokenization.two_factor_authentication_code_sent` instead.
     * - digital_wallet.tokenization_updated: Occurs when a tokenization's status has changed.
     *
     * This event will be deprecated in the future. We recommend using `tokenization.updated`
     * instead.
     * - dispute_evidence.upload_failed: Occurs when a dispute evidence upload fails.
     * - dispute_transaction.created: Occurs when a new dispute transaction is created
     * - dispute_transaction.updated: Occurs when a dispute transaction is updated
     * - dispute.updated: Occurs when a dispute is updated.
     * - external_bank_account.created: Occurs when an external bank account is created.
     * - external_bank_account.updated: Occurs when an external bank account is updated.
     * - external_payment.created: Occurs when an external payment is created.
     * - external_payment.updated: Occurs when an external payment is updated.
     * - financial_account.created: Occurs when a financial account is created.
     * - financial_account.updated: Occurs when a financial account is updated.
     * - funding_event.created: Occurs when a funding event is created.
     * - internal_transaction.created: Occurs when an internal adjustment is created.
     * - internal_transaction.updated: Occurs when an internal adjustment is updated.
     * - loan_tape.created: Occurs when a loan tape is created.
     * - loan_tape.updated: Occurs when a loan tape is updated.
     * - management_operation.created: Occurs when an management operation is created.
     * - management_operation.updated: Occurs when an management operation is updated.
     * - network_total.created: Occurs when a network total is created.
     * - network_total.updated: Occurs when a network total is updated.
     * - payment_transaction.created: Occurs when a payment transaction is created.
     * - payment_transaction.updated: Occurs when a payment transaction is updated.
     * - settlement_report.updated: Occurs when a settlement report is created or updated.
     * - statements.created: Occurs when a statement has been created
     * - three_ds_authentication.challenge: The `three_ds_authentication.challenge` event. Upon
     *   receiving this request, the Card Program should issue its own challenge to the cardholder.
     *   After a cardholder challenge is successfully completed, the Card Program needs to respond
     *   back to Lithic by call to
     *   [/v1/three_ds_decisioning/challenge_response](https://docs.lithic.com/reference/post_v1-three-ds-decisioning-challenge-response).
     *   Then the cardholder must navigate back to the merchant checkout flow to complete the
     *   transaction. Some merchants will include an `app_requestor_url` for app-based purchases;
     *   Lithic recommends triggering a redirect to that URL after the cardholder completes an
     *   app-based challenge.
     * - three_ds_authentication.created: Occurs when a 3DS authentication is created.
     * - three_ds_authentication.updated: Occurs when a 3DS authentication is updated (eg. challenge
     *   is completed).
     * - tokenization.approval_request: Occurs when a tokenization approval request is made.
     * - tokenization.result: Occurs when a tokenization request succeeded or failed.
     * - tokenization.two_factor_authentication_code: Occurs when a tokenization request 2FA code is
     *   sent to the Lithic customer for self serve delivery.
     * - tokenization.two_factor_authentication_code_sent: Occurs when a tokenization request 2FA
     *   code is sent to our downstream messaging providers for delivery.
     * - tokenization.updated: Occurs when a tokenization's status has changed.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payload(): Payload = payload.getRequired("payload")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

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
         * Returns a mutable builder for constructing an instance of [Event].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .eventType()
         * .payload()
         * ```
         */
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

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * An RFC 3339 timestamp for when the event was created. UTC time zone.
         *
         * If no timezone is specified, UTC will be used.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * The type of event that occurred. Possible values:
         * - account_holder_document.updated: Occurs when an account holder's document upload status
         *   has been updated
         * - account_holder.created: Occurs when a new account_holder is created.
         * - account_holder.updated: Occurs when an account_holder is updated.
         * - account_holder.verification: Occurs when an asynchronous account_holder's verification
         *   is completed.
         * - auth_rules.backtest_report.created: Auth Rules backtest report created.
         * - balance.updated: Financial Account Balance Update
         * - book_transfer_transaction.created: Occurs when a book transfer transaction is created.
         * - book_transfer_transaction.updated: Occurs when a book transfer transaction is updated.
         * - card_transaction.enhanced_data.created: Occurs when L2/L3 enhanced commercial data is
         *   processed for a transaction event.
         * - card_transaction.enhanced_data.updated: Occurs when L2/L3 enhanced commercial data is
         *   reprocessed for a transaction event.
         * - card_transaction.updated: Occurs when a card transaction happens.
         * - card.converted: Occurs when a card is converted from virtual to physical cards.
         * - card.created: Occurs when a new card is created.
         * - card.reissued: Occurs when a card is reissued.
         * - card.renewed: Occurs when a card is renewed.
         * - card.shipped: Occurs when a card is shipped.
         * - card.updated: Occurs when a card is updated.
         * - digital_wallet.tokenization_approval_request: Occurs when a tokenization approval
         *   request is made. This event will be deprecated in the future. We recommend using
         *   `tokenization.approval_request` instead.
         * - digital_wallet.tokenization_result: Occurs when a tokenization request succeeded or
         *   failed.
         *
         * This event will be deprecated in the future. We recommend using `tokenization.result`
         * instead.
         * - digital_wallet.tokenization_two_factor_authentication_code: Occurs when a tokenization
         *   request 2FA code is sent to the Lithic customer for self serve delivery.
         *
         * This event will be deprecated in the future. We recommend using
         * `tokenization.two_factor_authentication_code` instead.
         * - digital_wallet.tokenization_two_factor_authentication_code_sent: Occurs when a
         *   tokenization request 2FA code is sent to our downstream messaging providers for
         *   delivery.
         *
         * This event will be deprecated in the future. We recommend using
         * `tokenization.two_factor_authentication_code_sent` instead.
         * - digital_wallet.tokenization_updated: Occurs when a tokenization's status has changed.
         *
         * This event will be deprecated in the future. We recommend using `tokenization.updated`
         * instead.
         * - dispute_evidence.upload_failed: Occurs when a dispute evidence upload fails.
         * - dispute_transaction.created: Occurs when a new dispute transaction is created
         * - dispute_transaction.updated: Occurs when a dispute transaction is updated
         * - dispute.updated: Occurs when a dispute is updated.
         * - external_bank_account.created: Occurs when an external bank account is created.
         * - external_bank_account.updated: Occurs when an external bank account is updated.
         * - external_payment.created: Occurs when an external payment is created.
         * - external_payment.updated: Occurs when an external payment is updated.
         * - financial_account.created: Occurs when a financial account is created.
         * - financial_account.updated: Occurs when a financial account is updated.
         * - funding_event.created: Occurs when a funding event is created.
         * - internal_transaction.created: Occurs when an internal adjustment is created.
         * - internal_transaction.updated: Occurs when an internal adjustment is updated.
         * - loan_tape.created: Occurs when a loan tape is created.
         * - loan_tape.updated: Occurs when a loan tape is updated.
         * - management_operation.created: Occurs when an management operation is created.
         * - management_operation.updated: Occurs when an management operation is updated.
         * - network_total.created: Occurs when a network total is created.
         * - network_total.updated: Occurs when a network total is updated.
         * - payment_transaction.created: Occurs when a payment transaction is created.
         * - payment_transaction.updated: Occurs when a payment transaction is updated.
         * - settlement_report.updated: Occurs when a settlement report is created or updated.
         * - statements.created: Occurs when a statement has been created
         * - three_ds_authentication.challenge: The `three_ds_authentication.challenge` event. Upon
         *   receiving this request, the Card Program should issue its own challenge to the
         *   cardholder. After a cardholder challenge is successfully completed, the Card Program
         *   needs to respond back to Lithic by call to
         *   [/v1/three_ds_decisioning/challenge_response](https://docs.lithic.com/reference/post_v1-three-ds-decisioning-challenge-response).
         *   Then the cardholder must navigate back to the merchant checkout flow to complete the
         *   transaction. Some merchants will include an `app_requestor_url` for app-based
         *   purchases; Lithic recommends triggering a redirect to that URL after the cardholder
         *   completes an app-based challenge.
         * - three_ds_authentication.created: Occurs when a 3DS authentication is created.
         * - three_ds_authentication.updated: Occurs when a 3DS authentication is updated (eg.
         *   challenge is completed).
         * - tokenization.approval_request: Occurs when a tokenization approval request is made.
         * - tokenization.result: Occurs when a tokenization request succeeded or failed.
         * - tokenization.two_factor_authentication_code: Occurs when a tokenization request 2FA
         *   code is sent to the Lithic customer for self serve delivery.
         * - tokenization.two_factor_authentication_code_sent: Occurs when a tokenization request
         *   2FA code is sent to our downstream messaging providers for delivery.
         * - tokenization.updated: Occurs when a tokenization's status has changed.
         */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun payload(payload: Payload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [Event].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .created()
         * .eventType()
         * .payload()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Event =
            Event(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("eventType", eventType),
                checkRequired("payload", payload),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Event = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        eventType().validate()
        payload().validate()
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
            (if (created.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (payload.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The type of event that occurred. Possible values:
     * - account_holder_document.updated: Occurs when an account holder's document upload status has
     *   been updated
     * - account_holder.created: Occurs when a new account_holder is created.
     * - account_holder.updated: Occurs when an account_holder is updated.
     * - account_holder.verification: Occurs when an asynchronous account_holder's verification is
     *   completed.
     * - auth_rules.backtest_report.created: Auth Rules backtest report created.
     * - balance.updated: Financial Account Balance Update
     * - book_transfer_transaction.created: Occurs when a book transfer transaction is created.
     * - book_transfer_transaction.updated: Occurs when a book transfer transaction is updated.
     * - card_transaction.enhanced_data.created: Occurs when L2/L3 enhanced commercial data is
     *   processed for a transaction event.
     * - card_transaction.enhanced_data.updated: Occurs when L2/L3 enhanced commercial data is
     *   reprocessed for a transaction event.
     * - card_transaction.updated: Occurs when a card transaction happens.
     * - card.converted: Occurs when a card is converted from virtual to physical cards.
     * - card.created: Occurs when a new card is created.
     * - card.reissued: Occurs when a card is reissued.
     * - card.renewed: Occurs when a card is renewed.
     * - card.shipped: Occurs when a card is shipped.
     * - card.updated: Occurs when a card is updated.
     * - digital_wallet.tokenization_approval_request: Occurs when a tokenization approval request
     *   is made. This event will be deprecated in the future. We recommend using
     *   `tokenization.approval_request` instead.
     * - digital_wallet.tokenization_result: Occurs when a tokenization request succeeded or failed.
     *
     * This event will be deprecated in the future. We recommend using `tokenization.result`
     * instead.
     * - digital_wallet.tokenization_two_factor_authentication_code: Occurs when a tokenization
     *   request 2FA code is sent to the Lithic customer for self serve delivery.
     *
     * This event will be deprecated in the future. We recommend using
     * `tokenization.two_factor_authentication_code` instead.
     * - digital_wallet.tokenization_two_factor_authentication_code_sent: Occurs when a tokenization
     *   request 2FA code is sent to our downstream messaging providers for delivery.
     *
     * This event will be deprecated in the future. We recommend using
     * `tokenization.two_factor_authentication_code_sent` instead.
     * - digital_wallet.tokenization_updated: Occurs when a tokenization's status has changed.
     *
     * This event will be deprecated in the future. We recommend using `tokenization.updated`
     * instead.
     * - dispute_evidence.upload_failed: Occurs when a dispute evidence upload fails.
     * - dispute_transaction.created: Occurs when a new dispute transaction is created
     * - dispute_transaction.updated: Occurs when a dispute transaction is updated
     * - dispute.updated: Occurs when a dispute is updated.
     * - external_bank_account.created: Occurs when an external bank account is created.
     * - external_bank_account.updated: Occurs when an external bank account is updated.
     * - external_payment.created: Occurs when an external payment is created.
     * - external_payment.updated: Occurs when an external payment is updated.
     * - financial_account.created: Occurs when a financial account is created.
     * - financial_account.updated: Occurs when a financial account is updated.
     * - funding_event.created: Occurs when a funding event is created.
     * - internal_transaction.created: Occurs when an internal adjustment is created.
     * - internal_transaction.updated: Occurs when an internal adjustment is updated.
     * - loan_tape.created: Occurs when a loan tape is created.
     * - loan_tape.updated: Occurs when a loan tape is updated.
     * - management_operation.created: Occurs when an management operation is created.
     * - management_operation.updated: Occurs when an management operation is updated.
     * - network_total.created: Occurs when a network total is created.
     * - network_total.updated: Occurs when a network total is updated.
     * - payment_transaction.created: Occurs when a payment transaction is created.
     * - payment_transaction.updated: Occurs when a payment transaction is updated.
     * - settlement_report.updated: Occurs when a settlement report is created or updated.
     * - statements.created: Occurs when a statement has been created
     * - three_ds_authentication.challenge: The `three_ds_authentication.challenge` event. Upon
     *   receiving this request, the Card Program should issue its own challenge to the cardholder.
     *   After a cardholder challenge is successfully completed, the Card Program needs to respond
     *   back to Lithic by call to
     *   [/v1/three_ds_decisioning/challenge_response](https://docs.lithic.com/reference/post_v1-three-ds-decisioning-challenge-response).
     *   Then the cardholder must navigate back to the merchant checkout flow to complete the
     *   transaction. Some merchants will include an `app_requestor_url` for app-based purchases;
     *   Lithic recommends triggering a redirect to that URL after the cardholder completes an
     *   app-based challenge.
     * - three_ds_authentication.created: Occurs when a 3DS authentication is created.
     * - three_ds_authentication.updated: Occurs when a 3DS authentication is updated (eg. challenge
     *   is completed).
     * - tokenization.approval_request: Occurs when a tokenization approval request is made.
     * - tokenization.result: Occurs when a tokenization request succeeded or failed.
     * - tokenization.two_factor_authentication_code: Occurs when a tokenization request 2FA code is
     *   sent to the Lithic customer for self serve delivery.
     * - tokenization.two_factor_authentication_code_sent: Occurs when a tokenization request 2FA
     *   code is sent to our downstream messaging providers for delivery.
     * - tokenization.updated: Occurs when a tokenization's status has changed.
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

            @JvmField val ACCOUNT_HOLDER_DOCUMENT_UPDATED = of("account_holder_document.updated")

            @JvmField val ACCOUNT_HOLDER_CREATED = of("account_holder.created")

            @JvmField val ACCOUNT_HOLDER_UPDATED = of("account_holder.updated")

            @JvmField val ACCOUNT_HOLDER_VERIFICATION = of("account_holder.verification")

            @JvmField
            val AUTH_RULES_BACKTEST_REPORT_CREATED = of("auth_rules.backtest_report.created")

            @JvmField val BALANCE_UPDATED = of("balance.updated")

            @JvmField
            val BOOK_TRANSFER_TRANSACTION_CREATED = of("book_transfer_transaction.created")

            @JvmField
            val BOOK_TRANSFER_TRANSACTION_UPDATED = of("book_transfer_transaction.updated")

            @JvmField
            val CARD_TRANSACTION_ENHANCED_DATA_CREATED =
                of("card_transaction.enhanced_data.created")

            @JvmField
            val CARD_TRANSACTION_ENHANCED_DATA_UPDATED =
                of("card_transaction.enhanced_data.updated")

            @JvmField val CARD_TRANSACTION_UPDATED = of("card_transaction.updated")

            @JvmField val CARD_CONVERTED = of("card.converted")

            @JvmField val CARD_CREATED = of("card.created")

            @JvmField val CARD_REISSUED = of("card.reissued")

            @JvmField val CARD_RENEWED = of("card.renewed")

            @JvmField val CARD_SHIPPED = of("card.shipped")

            @JvmField val CARD_UPDATED = of("card.updated")

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

            @JvmField val DISPUTE_EVIDENCE_UPLOAD_FAILED = of("dispute_evidence.upload_failed")

            @JvmField val DISPUTE_TRANSACTION_CREATED = of("dispute_transaction.created")

            @JvmField val DISPUTE_TRANSACTION_UPDATED = of("dispute_transaction.updated")

            @JvmField val DISPUTE_UPDATED = of("dispute.updated")

            @JvmField val EXTERNAL_BANK_ACCOUNT_CREATED = of("external_bank_account.created")

            @JvmField val EXTERNAL_BANK_ACCOUNT_UPDATED = of("external_bank_account.updated")

            @JvmField val EXTERNAL_PAYMENT_CREATED = of("external_payment.created")

            @JvmField val EXTERNAL_PAYMENT_UPDATED = of("external_payment.updated")

            @JvmField val FINANCIAL_ACCOUNT_CREATED = of("financial_account.created")

            @JvmField val FINANCIAL_ACCOUNT_UPDATED = of("financial_account.updated")

            @JvmField val FUNDING_EVENT_CREATED = of("funding_event.created")

            @JvmField val INTERNAL_TRANSACTION_CREATED = of("internal_transaction.created")

            @JvmField val INTERNAL_TRANSACTION_UPDATED = of("internal_transaction.updated")

            @JvmField val LOAN_TAPE_CREATED = of("loan_tape.created")

            @JvmField val LOAN_TAPE_UPDATED = of("loan_tape.updated")

            @JvmField val MANAGEMENT_OPERATION_CREATED = of("management_operation.created")

            @JvmField val MANAGEMENT_OPERATION_UPDATED = of("management_operation.updated")

            @JvmField val NETWORK_TOTAL_CREATED = of("network_total.created")

            @JvmField val NETWORK_TOTAL_UPDATED = of("network_total.updated")

            @JvmField val PAYMENT_TRANSACTION_CREATED = of("payment_transaction.created")

            @JvmField val PAYMENT_TRANSACTION_UPDATED = of("payment_transaction.updated")

            @JvmField val SETTLEMENT_REPORT_UPDATED = of("settlement_report.updated")

            @JvmField val STATEMENTS_CREATED = of("statements.created")

            @JvmField
            val THREE_DS_AUTHENTICATION_CHALLENGE = of("three_ds_authentication.challenge")

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
            ACCOUNT_HOLDER_DOCUMENT_UPDATED,
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_BACKTEST_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            BOOK_TRANSFER_TRANSACTION_UPDATED,
            CARD_TRANSACTION_ENHANCED_DATA_CREATED,
            CARD_TRANSACTION_ENHANCED_DATA_UPDATED,
            CARD_TRANSACTION_UPDATED,
            CARD_CONVERTED,
            CARD_CREATED,
            CARD_REISSUED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            DISPUTE_TRANSACTION_CREATED,
            DISPUTE_TRANSACTION_UPDATED,
            DISPUTE_UPDATED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            FUNDING_EVENT_CREATED,
            INTERNAL_TRANSACTION_CREATED,
            INTERNAL_TRANSACTION_UPDATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            NETWORK_TOTAL_CREATED,
            NETWORK_TOTAL_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CHALLENGE,
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
            ACCOUNT_HOLDER_DOCUMENT_UPDATED,
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            AUTH_RULES_BACKTEST_REPORT_CREATED,
            BALANCE_UPDATED,
            BOOK_TRANSFER_TRANSACTION_CREATED,
            BOOK_TRANSFER_TRANSACTION_UPDATED,
            CARD_TRANSACTION_ENHANCED_DATA_CREATED,
            CARD_TRANSACTION_ENHANCED_DATA_UPDATED,
            CARD_TRANSACTION_UPDATED,
            CARD_CONVERTED,
            CARD_CREATED,
            CARD_REISSUED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            DISPUTE_TRANSACTION_CREATED,
            DISPUTE_TRANSACTION_UPDATED,
            DISPUTE_UPDATED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            EXTERNAL_PAYMENT_CREATED,
            EXTERNAL_PAYMENT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            FINANCIAL_ACCOUNT_UPDATED,
            FUNDING_EVENT_CREATED,
            INTERNAL_TRANSACTION_CREATED,
            INTERNAL_TRANSACTION_UPDATED,
            LOAN_TAPE_CREATED,
            LOAN_TAPE_UPDATED,
            MANAGEMENT_OPERATION_CREATED,
            MANAGEMENT_OPERATION_UPDATED,
            NETWORK_TOTAL_CREATED,
            NETWORK_TOTAL_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CHALLENGE,
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
                ACCOUNT_HOLDER_DOCUMENT_UPDATED -> Value.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Value.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_BACKTEST_REPORT_CREATED -> Value.AUTH_RULES_BACKTEST_REPORT_CREATED
                BALANCE_UPDATED -> Value.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Value.BOOK_TRANSFER_TRANSACTION_CREATED
                BOOK_TRANSFER_TRANSACTION_UPDATED -> Value.BOOK_TRANSFER_TRANSACTION_UPDATED
                CARD_TRANSACTION_ENHANCED_DATA_CREATED ->
                    Value.CARD_TRANSACTION_ENHANCED_DATA_CREATED
                CARD_TRANSACTION_ENHANCED_DATA_UPDATED ->
                    Value.CARD_TRANSACTION_ENHANCED_DATA_UPDATED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                CARD_CONVERTED -> Value.CARD_CONVERTED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_REISSUED -> Value.CARD_REISSUED
                CARD_RENEWED -> Value.CARD_RENEWED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_UPDATED -> Value.CARD_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Value.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Value.DISPUTE_EVIDENCE_UPLOAD_FAILED
                DISPUTE_TRANSACTION_CREATED -> Value.DISPUTE_TRANSACTION_CREATED
                DISPUTE_TRANSACTION_UPDATED -> Value.DISPUTE_TRANSACTION_UPDATED
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Value.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Value.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Value.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Value.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Value.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Value.FINANCIAL_ACCOUNT_UPDATED
                FUNDING_EVENT_CREATED -> Value.FUNDING_EVENT_CREATED
                INTERNAL_TRANSACTION_CREATED -> Value.INTERNAL_TRANSACTION_CREATED
                INTERNAL_TRANSACTION_UPDATED -> Value.INTERNAL_TRANSACTION_UPDATED
                LOAN_TAPE_CREATED -> Value.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Value.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Value.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Value.MANAGEMENT_OPERATION_UPDATED
                NETWORK_TOTAL_CREATED -> Value.NETWORK_TOTAL_CREATED
                NETWORK_TOTAL_UPDATED -> Value.NETWORK_TOTAL_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Value.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Value.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CHALLENGE -> Value.THREE_DS_AUTHENTICATION_CHALLENGE
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
                ACCOUNT_HOLDER_DOCUMENT_UPDATED -> Known.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Known.ACCOUNT_HOLDER_VERIFICATION
                AUTH_RULES_BACKTEST_REPORT_CREATED -> Known.AUTH_RULES_BACKTEST_REPORT_CREATED
                BALANCE_UPDATED -> Known.BALANCE_UPDATED
                BOOK_TRANSFER_TRANSACTION_CREATED -> Known.BOOK_TRANSFER_TRANSACTION_CREATED
                BOOK_TRANSFER_TRANSACTION_UPDATED -> Known.BOOK_TRANSFER_TRANSACTION_UPDATED
                CARD_TRANSACTION_ENHANCED_DATA_CREATED ->
                    Known.CARD_TRANSACTION_ENHANCED_DATA_CREATED
                CARD_TRANSACTION_ENHANCED_DATA_UPDATED ->
                    Known.CARD_TRANSACTION_ENHANCED_DATA_UPDATED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                CARD_CONVERTED -> Known.CARD_CONVERTED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_REISSUED -> Known.CARD_REISSUED
                CARD_RENEWED -> Known.CARD_RENEWED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_UPDATED -> Known.CARD_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Known.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Known.DISPUTE_EVIDENCE_UPLOAD_FAILED
                DISPUTE_TRANSACTION_CREATED -> Known.DISPUTE_TRANSACTION_CREATED
                DISPUTE_TRANSACTION_UPDATED -> Known.DISPUTE_TRANSACTION_UPDATED
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Known.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Known.EXTERNAL_BANK_ACCOUNT_UPDATED
                EXTERNAL_PAYMENT_CREATED -> Known.EXTERNAL_PAYMENT_CREATED
                EXTERNAL_PAYMENT_UPDATED -> Known.EXTERNAL_PAYMENT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Known.FINANCIAL_ACCOUNT_CREATED
                FINANCIAL_ACCOUNT_UPDATED -> Known.FINANCIAL_ACCOUNT_UPDATED
                FUNDING_EVENT_CREATED -> Known.FUNDING_EVENT_CREATED
                INTERNAL_TRANSACTION_CREATED -> Known.INTERNAL_TRANSACTION_CREATED
                INTERNAL_TRANSACTION_UPDATED -> Known.INTERNAL_TRANSACTION_UPDATED
                LOAN_TAPE_CREATED -> Known.LOAN_TAPE_CREATED
                LOAN_TAPE_UPDATED -> Known.LOAN_TAPE_UPDATED
                MANAGEMENT_OPERATION_CREATED -> Known.MANAGEMENT_OPERATION_CREATED
                MANAGEMENT_OPERATION_UPDATED -> Known.MANAGEMENT_OPERATION_UPDATED
                NETWORK_TOTAL_CREATED -> Known.NETWORK_TOTAL_CREATED
                NETWORK_TOTAL_UPDATED -> Known.NETWORK_TOTAL_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Known.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Known.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CHALLENGE -> Known.THREE_DS_AUTHENTICATION_CHALLENGE
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

    class Payload
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Payload]. */
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

            /**
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Payload = Payload(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Payload{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Event &&
            token == other.token &&
            created == other.created &&
            eventType == other.eventType &&
            payload == other.payload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(token, created, eventType, payload, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Event{token=$token, created=$created, eventType=$eventType, payload=$payload, additionalProperties=$additionalProperties}"
}
