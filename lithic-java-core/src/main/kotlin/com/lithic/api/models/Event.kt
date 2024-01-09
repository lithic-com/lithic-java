// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A single event that affects the transaction state and lifecycle. */
@JsonDeserialize(builder = Event.Builder::class)
@NoAutoDetect
class Event
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val payload: JsonField<Payload>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Event types:
     *
     * - `account_holder.created` - Notification that a new account holder has been created and was
     * not rejected.
     * - `account_holder.updated` - Notification that an account holder was updated.
     * - `account_holder.verification` - Notification than an account holder's identity verification
     * is complete.
     * - `card.created` - Notification that a card has been created.
     * - `card.renewed` - Notification that a card has been renewed.
     * - `card.shipped` - Physical card shipment notification. See
     * https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
     * - `card_transaction.updated` - Transaction Lifecycle webhook. See
     * https://docs.lithic.com/docs/transaction-webhooks.
     * - `dispute.updated` - A dispute has been updated.
     * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
     * activate a digital wallet token.
     * - `digital_wallet.tokenization_result` - Notification of the end result of a tokenization,
     * whether successful or failed.
     * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to an
     * end user to complete digital wallet authentication. See
     * https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    fun payload(): Payload = payload.getRequired("payload")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * Event types:
     *
     * - `account_holder.created` - Notification that a new account holder has been created and was
     * not rejected.
     * - `account_holder.updated` - Notification that an account holder was updated.
     * - `account_holder.verification` - Notification than an account holder's identity verification
     * is complete.
     * - `card.created` - Notification that a card has been created.
     * - `card.renewed` - Notification that a card has been renewed.
     * - `card.shipped` - Physical card shipment notification. See
     * https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
     * - `card_transaction.updated` - Transaction Lifecycle webhook. See
     * https://docs.lithic.com/docs/transaction-webhooks.
     * - `dispute.updated` - A dispute has been updated.
     * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
     * activate a digital wallet token.
     * - `digital_wallet.tokenization_result` - Notification of the end result of a tokenization,
     * whether successful or failed.
     * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to an
     * end user to complete digital wallet authentication. See
     * https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    @JsonProperty("payload") @ExcludeMissing fun _payload() = payload

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Event = apply {
        if (!validated) {
            created()
            eventType()
            payload().validate()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Event &&
            this.created == other.created &&
            this.eventType == other.eventType &&
            this.payload == other.payload &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    created,
                    eventType,
                    payload,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Event{created=$created, eventType=$eventType, payload=$payload, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var payload: JsonField<Payload> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(event: Event) = apply {
            this.created = event.created
            this.eventType = event.eventType
            this.payload = event.payload
            this.token = event.token
            additionalProperties(event.additionalProperties)
        }

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
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Event types:
         *
         * - `account_holder.created` - Notification that a new account holder has been created and
         * was not rejected.
         * - `account_holder.updated` - Notification that an account holder was updated.
         * - `account_holder.verification` - Notification than an account holder's identity
         * verification is complete.
         * - `card.created` - Notification that a card has been created.
         * - `card.renewed` - Notification that a card has been renewed.
         * - `card.shipped` - Physical card shipment notification. See
         * https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
         * - `card_transaction.updated` - Transaction Lifecycle webhook. See
         * https://docs.lithic.com/docs/transaction-webhooks.
         * - `dispute.updated` - A dispute has been updated.
         * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
         * activate a digital wallet token.
         * - `digital_wallet.tokenization_result` - Notification of the end result of a
         * tokenization, whether successful or failed.
         * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to
         * an end user to complete digital wallet authentication. See
         * https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
         */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Event types:
         *
         * - `account_holder.created` - Notification that a new account holder has been created and
         * was not rejected.
         * - `account_holder.updated` - Notification that an account holder was updated.
         * - `account_holder.verification` - Notification than an account holder's identity
         * verification is complete.
         * - `card.created` - Notification that a card has been created.
         * - `card.renewed` - Notification that a card has been renewed.
         * - `card.shipped` - Physical card shipment notification. See
         * https://docs.lithic.com/docs/cards#physical-card-shipped-webhook.
         * - `card_transaction.updated` - Transaction Lifecycle webhook. See
         * https://docs.lithic.com/docs/transaction-webhooks.
         * - `dispute.updated` - A dispute has been updated.
         * - `digital_wallet.tokenization_approval_request` - Card network's request to Lithic to
         * activate a digital wallet token.
         * - `digital_wallet.tokenization_result` - Notification of the end result of a
         * tokenization, whether successful or failed.
         * - `digital_wallet.tokenization_two_factor_authentication_code` - A code to be passed to
         * an end user to complete digital wallet authentication. See
         * https://docs.lithic.com/docs/tokenization-control#digital-wallet-tokenization-auth-code.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun payload(payload: Payload) = payload(JsonField.of(payload))

        @JsonProperty("payload")
        @ExcludeMissing
        fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Event =
            Event(
                created,
                eventType,
                payload,
                token,
                additionalProperties.toUnmodifiable(),
            )
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCOUNT_HOLDER_CREATED = EventType(JsonField.of("account_holder.created"))

            @JvmField val ACCOUNT_HOLDER_UPDATED = EventType(JsonField.of("account_holder.updated"))

            @JvmField
            val ACCOUNT_HOLDER_VERIFICATION = EventType(JsonField.of("account_holder.verification"))

            @JvmField val BALANCE_UPDATED = EventType(JsonField.of("balance.updated"))

            @JvmField val CARD_CREATED = EventType(JsonField.of("card.created"))

            @JvmField val CARD_RENEWED = EventType(JsonField.of("card.renewed"))

            @JvmField val CARD_SHIPPED = EventType(JsonField.of("card.shipped"))

            @JvmField
            val CARD_TRANSACTION_UPDATED = EventType(JsonField.of("card_transaction.updated"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("digital_wallet.tokenization_approval_request"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_RESULT =
                EventType(JsonField.of("digital_wallet.tokenization_result"))

            @JvmField
            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code")
                )

            @JvmField val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            @JvmField
            val DISPUTE_EVIDENCE_UPLOAD_FAILED =
                EventType(JsonField.of("dispute_evidence.upload_failed"))

            @JvmField
            val PAYMENT_TRANSACTION_CREATED = EventType(JsonField.of("payment_transaction.created"))

            @JvmField
            val PAYMENT_TRANSACTION_UPDATED = EventType(JsonField.of("payment_transaction.updated"))

            @JvmField
            val THREE_DS_AUTHENTICATION_CREATED =
                EventType(JsonField.of("three_ds_authentication.created"))

            @JvmField
            val TRANSFER_TRANSACTION_CREATED =
                EventType(JsonField.of("transfer_transaction.created"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            BALANCE_UPDATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
        }

        enum class Value {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            BALANCE_UPDATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Value.ACCOUNT_HOLDER_VERIFICATION
                BALANCE_UPDATED -> Value.BALANCE_UPDATED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_RENEWED -> Value.CARD_RENEWED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Value.DISPUTE_EVIDENCE_UPLOAD_FAILED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                THREE_DS_AUTHENTICATION_CREATED -> Value.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Value.TRANSFER_TRANSACTION_CREATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Known.ACCOUNT_HOLDER_VERIFICATION
                BALANCE_UPDATED -> Known.BALANCE_UPDATED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_RENEWED -> Known.CARD_RENEWED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Known.DISPUTE_EVIDENCE_UPLOAD_FAILED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                THREE_DS_AUTHENTICATION_CREATED -> Known.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Known.TRANSFER_TRANSACTION_CREATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Payload.Builder::class)
    @NoAutoDetect
    class Payload
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Payload = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Payload{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                additionalProperties(payload.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Payload = Payload(additionalProperties.toUnmodifiable())
        }
    }
}
