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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Report fraud for a specific transaction token by providing details such as fraud type, fraud
 * status, and any additional comments.
 */
class FraudTransactionReportParams
private constructor(
    private val transactionToken: String?,
    private val body: FraudReportRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun transactionToken(): Optional<String> = Optional.ofNullable(transactionToken)

    /**
     * The fraud status of the transaction, string (enum) supporting the following values:
     * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t been
     *   confirmed.
     * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may immediately
     *   be moved into this state, or be graduated into this state from the `SUSPECTED_FRAUD` state.
     * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A transaction
     *   may immediately be moved into this state, or be graduated into this state from the
     *   `SUSPECTED_FRAUD` state.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fraudStatus(): FraudStatus = body.fraudStatus()

    /**
     * Optional field providing additional information or context about why the transaction is
     * considered fraudulent.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = body.comment()

    /**
     * Specifies the type or category of fraud that the transaction is suspected or confirmed to
     * involve, string (enum) supporting the following values:
     * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or cardholder
     *   intentionally misuses financial services for personal gain. This includes actions such as
     *   disputing legitimate transactions to obtain a refund, abusing return policies, or
     *   defaulting on credit obligations without intent to repay.
     * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains unauthorized
     *   access to an existing account, modifies account settings, and carries out fraudulent
     *   transactions.
     * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to card
     *   details without taking over the account, such as through physical card theft, cloning, or
     *   online data breaches.
     * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
     *   information, such as Social Security numbers or addresses, to open accounts, apply for
     *   loans, or conduct financial transactions in someone's name.
     * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates or
     *   coerces a legitimate cardholder into unauthorized transactions, often through social
     *   engineering tactics.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fraudType(): Optional<FraudType> = body.fraudType()

    /**
     * Returns the raw JSON value of [fraudStatus].
     *
     * Unlike [fraudStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fraudStatus(): JsonField<FraudStatus> = body._fraudStatus()

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _comment(): JsonField<String> = body._comment()

    /**
     * Returns the raw JSON value of [fraudType].
     *
     * Unlike [fraudType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fraudType(): JsonField<FraudType> = body._fraudType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FraudTransactionReportParams].
         *
         * The following fields are required:
         * ```java
         * .fraudStatus()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FraudTransactionReportParams]. */
    class Builder internal constructor() {

        private var transactionToken: String? = null
        private var body: FraudReportRequest.Builder = FraudReportRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fraudTransactionReportParams: FraudTransactionReportParams) = apply {
            transactionToken = fraudTransactionReportParams.transactionToken
            body = fraudTransactionReportParams.body.toBuilder()
            additionalHeaders = fraudTransactionReportParams.additionalHeaders.toBuilder()
            additionalQueryParams = fraudTransactionReportParams.additionalQueryParams.toBuilder()
        }

        fun transactionToken(transactionToken: String?) = apply {
            this.transactionToken = transactionToken
        }

        /** Alias for calling [Builder.transactionToken] with `transactionToken.orElse(null)`. */
        fun transactionToken(transactionToken: Optional<String>) =
            transactionToken(transactionToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fraudStatus]
         * - [comment]
         * - [fraudType]
         */
        fun body(body: FraudReportRequest) = apply { this.body = body.toBuilder() }

        /**
         * The fraud status of the transaction, string (enum) supporting the following values:
         * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t been
         *   confirmed.
         * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may
         *   immediately be moved into this state, or be graduated into this state from the
         *   `SUSPECTED_FRAUD` state.
         * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A
         *   transaction may immediately be moved into this state, or be graduated into this state
         *   from the `SUSPECTED_FRAUD` state.
         */
        fun fraudStatus(fraudStatus: FraudStatus) = apply { body.fraudStatus(fraudStatus) }

        /**
         * Sets [Builder.fraudStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fraudStatus] with a well-typed [FraudStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fraudStatus(fraudStatus: JsonField<FraudStatus>) = apply {
            body.fraudStatus(fraudStatus)
        }

        /**
         * Optional field providing additional information or context about why the transaction is
         * considered fraudulent.
         */
        fun comment(comment: String) = apply { body.comment(comment) }

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { body.comment(comment) }

        /**
         * Specifies the type or category of fraud that the transaction is suspected or confirmed to
         * involve, string (enum) supporting the following values:
         * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or cardholder
         *   intentionally misuses financial services for personal gain. This includes actions such
         *   as disputing legitimate transactions to obtain a refund, abusing return policies, or
         *   defaulting on credit obligations without intent to repay.
         * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains unauthorized
         *   access to an existing account, modifies account settings, and carries out fraudulent
         *   transactions.
         * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to card
         *   details without taking over the account, such as through physical card theft, cloning,
         *   or online data breaches.
         * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
         *   information, such as Social Security numbers or addresses, to open accounts, apply for
         *   loans, or conduct financial transactions in someone's name.
         * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates or
         *   coerces a legitimate cardholder into unauthorized transactions, often through social
         *   engineering tactics.
         */
        fun fraudType(fraudType: FraudType) = apply { body.fraudType(fraudType) }

        /**
         * Sets [Builder.fraudType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fraudType] with a well-typed [FraudType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fraudType(fraudType: JsonField<FraudType>) = apply { body.fraudType(fraudType) }

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

        /**
         * Returns an immutable instance of [FraudTransactionReportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fraudStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FraudTransactionReportParams =
            FraudTransactionReportParams(
                transactionToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): FraudReportRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> transactionToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class FraudReportRequest
    private constructor(
        private val fraudStatus: JsonField<FraudStatus>,
        private val comment: JsonField<String>,
        private val fraudType: JsonField<FraudType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fraud_status")
            @ExcludeMissing
            fraudStatus: JsonField<FraudStatus> = JsonMissing.of(),
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fraud_type")
            @ExcludeMissing
            fraudType: JsonField<FraudType> = JsonMissing.of(),
        ) : this(fraudStatus, comment, fraudType, mutableMapOf())

        /**
         * The fraud status of the transaction, string (enum) supporting the following values:
         * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t been
         *   confirmed.
         * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may
         *   immediately be moved into this state, or be graduated into this state from the
         *   `SUSPECTED_FRAUD` state.
         * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A
         *   transaction may immediately be moved into this state, or be graduated into this state
         *   from the `SUSPECTED_FRAUD` state.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fraudStatus(): FraudStatus = fraudStatus.getRequired("fraud_status")

        /**
         * Optional field providing additional information or context about why the transaction is
         * considered fraudulent.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun comment(): Optional<String> = comment.getOptional("comment")

        /**
         * Specifies the type or category of fraud that the transaction is suspected or confirmed to
         * involve, string (enum) supporting the following values:
         * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or cardholder
         *   intentionally misuses financial services for personal gain. This includes actions such
         *   as disputing legitimate transactions to obtain a refund, abusing return policies, or
         *   defaulting on credit obligations without intent to repay.
         * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains unauthorized
         *   access to an existing account, modifies account settings, and carries out fraudulent
         *   transactions.
         * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to card
         *   details without taking over the account, such as through physical card theft, cloning,
         *   or online data breaches.
         * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
         *   information, such as Social Security numbers or addresses, to open accounts, apply for
         *   loans, or conduct financial transactions in someone's name.
         * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates or
         *   coerces a legitimate cardholder into unauthorized transactions, often through social
         *   engineering tactics.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fraudType(): Optional<FraudType> = fraudType.getOptional("fraud_type")

        /**
         * Returns the raw JSON value of [fraudStatus].
         *
         * Unlike [fraudStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fraud_status")
        @ExcludeMissing
        fun _fraudStatus(): JsonField<FraudStatus> = fraudStatus

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

        /**
         * Returns the raw JSON value of [fraudType].
         *
         * Unlike [fraudType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fraud_type")
        @ExcludeMissing
        fun _fraudType(): JsonField<FraudType> = fraudType

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
             * Returns a mutable builder for constructing an instance of [FraudReportRequest].
             *
             * The following fields are required:
             * ```java
             * .fraudStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FraudReportRequest]. */
        class Builder internal constructor() {

            private var fraudStatus: JsonField<FraudStatus>? = null
            private var comment: JsonField<String> = JsonMissing.of()
            private var fraudType: JsonField<FraudType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fraudReportRequest: FraudReportRequest) = apply {
                fraudStatus = fraudReportRequest.fraudStatus
                comment = fraudReportRequest.comment
                fraudType = fraudReportRequest.fraudType
                additionalProperties = fraudReportRequest.additionalProperties.toMutableMap()
            }

            /**
             * The fraud status of the transaction, string (enum) supporting the following values:
             * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t
             *   been confirmed.
             * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may
             *   immediately be moved into this state, or be graduated into this state from the
             *   `SUSPECTED_FRAUD` state.
             * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A
             *   transaction may immediately be moved into this state, or be graduated into this
             *   state from the `SUSPECTED_FRAUD` state.
             */
            fun fraudStatus(fraudStatus: FraudStatus) = fraudStatus(JsonField.of(fraudStatus))

            /**
             * Sets [Builder.fraudStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraudStatus] with a well-typed [FraudStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fraudStatus(fraudStatus: JsonField<FraudStatus>) = apply {
                this.fraudStatus = fraudStatus
            }

            /**
             * Optional field providing additional information or context about why the transaction
             * is considered fraudulent.
             */
            fun comment(comment: String) = comment(JsonField.of(comment))

            /**
             * Sets [Builder.comment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comment] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comment(comment: JsonField<String>) = apply { this.comment = comment }

            /**
             * Specifies the type or category of fraud that the transaction is suspected or
             * confirmed to involve, string (enum) supporting the following values:
             * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or
             *   cardholder intentionally misuses financial services for personal gain. This
             *   includes actions such as disputing legitimate transactions to obtain a refund,
             *   abusing return policies, or defaulting on credit obligations without intent to
             *   repay.
             * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains
             *   unauthorized access to an existing account, modifies account settings, and carries
             *   out fraudulent transactions.
             * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to
             *   card details without taking over the account, such as through physical card theft,
             *   cloning, or online data breaches.
             * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
             *   information, such as Social Security numbers or addresses, to open accounts, apply
             *   for loans, or conduct financial transactions in someone's name.
             * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates
             *   or coerces a legitimate cardholder into unauthorized transactions, often through
             *   social engineering tactics.
             */
            fun fraudType(fraudType: FraudType) = fraudType(JsonField.of(fraudType))

            /**
             * Sets [Builder.fraudType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraudType] with a well-typed [FraudType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fraudType(fraudType: JsonField<FraudType>) = apply { this.fraudType = fraudType }

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
             * Returns an immutable instance of [FraudReportRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fraudStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FraudReportRequest =
                FraudReportRequest(
                    checkRequired("fraudStatus", fraudStatus),
                    comment,
                    fraudType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FraudReportRequest = apply {
            if (validated) {
                return@apply
            }

            fraudStatus().validate()
            comment()
            fraudType().ifPresent { it.validate() }
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
            (fraudStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (comment.asKnown().isPresent) 1 else 0) +
                (fraudType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FraudReportRequest && fraudStatus == other.fraudStatus && comment == other.comment && fraudType == other.fraudType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fraudStatus, comment, fraudType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FraudReportRequest{fraudStatus=$fraudStatus, comment=$comment, fraudType=$fraudType, additionalProperties=$additionalProperties}"
    }

    /**
     * The fraud status of the transaction, string (enum) supporting the following values:
     * - `SUSPECTED_FRAUD`: The transaction is suspected to be fraudulent, but this hasn’t been
     *   confirmed.
     * - `FRAUDULENT`: The transaction is confirmed to be fraudulent. A transaction may immediately
     *   be moved into this state, or be graduated into this state from the `SUSPECTED_FRAUD` state.
     * - `NOT_FRAUDULENT`: The transaction is (explicitly) marked as not fraudulent. A transaction
     *   may immediately be moved into this state, or be graduated into this state from the
     *   `SUSPECTED_FRAUD` state.
     */
    class FraudStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SUSPECTED_FRAUD = of("SUSPECTED_FRAUD")

            @JvmField val FRAUDULENT = of("FRAUDULENT")

            @JvmField val NOT_FRAUDULENT = of("NOT_FRAUDULENT")

            @JvmStatic fun of(value: String) = FraudStatus(JsonField.of(value))
        }

        /** An enum containing [FraudStatus]'s known values. */
        enum class Known {
            SUSPECTED_FRAUD,
            FRAUDULENT,
            NOT_FRAUDULENT,
        }

        /**
         * An enum containing [FraudStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FraudStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUSPECTED_FRAUD,
            FRAUDULENT,
            NOT_FRAUDULENT,
            /**
             * An enum member indicating that [FraudStatus] was instantiated with an unknown value.
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
                SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                FRAUDULENT -> Value.FRAUDULENT
                NOT_FRAUDULENT -> Value.NOT_FRAUDULENT
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
                SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                FRAUDULENT -> Known.FRAUDULENT
                NOT_FRAUDULENT -> Known.NOT_FRAUDULENT
                else -> throw LithicInvalidDataException("Unknown FraudStatus: $value")
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

        fun validate(): FraudStatus = apply {
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

            return /* spotless:off */ other is FraudStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the type or category of fraud that the transaction is suspected or confirmed to
     * involve, string (enum) supporting the following values:
     * - `FIRST_PARTY_FRAUD`: First-party fraud occurs when a legitimate account or cardholder
     *   intentionally misuses financial services for personal gain. This includes actions such as
     *   disputing legitimate transactions to obtain a refund, abusing return policies, or
     *   defaulting on credit obligations without intent to repay.
     * - `ACCOUNT_TAKEOVER`: Account takeover fraud occurs when a fraudster gains unauthorized
     *   access to an existing account, modifies account settings, and carries out fraudulent
     *   transactions.
     * - `CARD_COMPROMISED`: Card compromised fraud occurs when a fraudster gains access to card
     *   details without taking over the account, such as through physical card theft, cloning, or
     *   online data breaches.
     * - `IDENTITY_THEFT`: Identity theft fraud occurs when a fraudster uses stolen personal
     *   information, such as Social Security numbers or addresses, to open accounts, apply for
     *   loans, or conduct financial transactions in someone's name.
     * - `CARDHOLDER_MANIPULATION`: This type of fraud occurs when a fraudster manipulates or
     *   coerces a legitimate cardholder into unauthorized transactions, often through social
     *   engineering tactics.
     */
    class FraudType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FIRST_PARTY_FRAUD = of("FIRST_PARTY_FRAUD")

            @JvmField val ACCOUNT_TAKEOVER = of("ACCOUNT_TAKEOVER")

            @JvmField val CARD_COMPROMISED = of("CARD_COMPROMISED")

            @JvmField val IDENTITY_THEFT = of("IDENTITY_THEFT")

            @JvmField val CARDHOLDER_MANIPULATION = of("CARDHOLDER_MANIPULATION")

            @JvmStatic fun of(value: String) = FraudType(JsonField.of(value))
        }

        /** An enum containing [FraudType]'s known values. */
        enum class Known {
            FIRST_PARTY_FRAUD,
            ACCOUNT_TAKEOVER,
            CARD_COMPROMISED,
            IDENTITY_THEFT,
            CARDHOLDER_MANIPULATION,
        }

        /**
         * An enum containing [FraudType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FraudType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIRST_PARTY_FRAUD,
            ACCOUNT_TAKEOVER,
            CARD_COMPROMISED,
            IDENTITY_THEFT,
            CARDHOLDER_MANIPULATION,
            /**
             * An enum member indicating that [FraudType] was instantiated with an unknown value.
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
                FIRST_PARTY_FRAUD -> Value.FIRST_PARTY_FRAUD
                ACCOUNT_TAKEOVER -> Value.ACCOUNT_TAKEOVER
                CARD_COMPROMISED -> Value.CARD_COMPROMISED
                IDENTITY_THEFT -> Value.IDENTITY_THEFT
                CARDHOLDER_MANIPULATION -> Value.CARDHOLDER_MANIPULATION
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
                FIRST_PARTY_FRAUD -> Known.FIRST_PARTY_FRAUD
                ACCOUNT_TAKEOVER -> Known.ACCOUNT_TAKEOVER
                CARD_COMPROMISED -> Known.CARD_COMPROMISED
                IDENTITY_THEFT -> Known.IDENTITY_THEFT
                CARDHOLDER_MANIPULATION -> Known.CARDHOLDER_MANIPULATION
                else -> throw LithicInvalidDataException("Unknown FraudType: $value")
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

        fun validate(): FraudType = apply {
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

            return /* spotless:off */ other is FraudType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FraudTransactionReportParams && transactionToken == other.transactionToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FraudTransactionReportParams{transactionToken=$transactionToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
