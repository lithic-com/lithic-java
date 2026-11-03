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
import kotlin.jvm.optionals.getOrNull

class TokenizationCreatePaymentCredentialsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val agentToken: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val credentials: JsonField<PaymentCredentials>,
    private val mandate: JsonField<PaymentCredentialsMandateResponse>,
    private val status: JsonField<Status>,
    private val tokenizationToken: JsonField<String>,
    private val type: JsonField<PaymentCredentialsType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_token")
        @ExcludeMissing
        agentToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credentials")
        @ExcludeMissing
        credentials: JsonField<PaymentCredentials> = JsonMissing.of(),
        @JsonProperty("mandate")
        @ExcludeMissing
        mandate: JsonField<PaymentCredentialsMandateResponse> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tokenization_token")
        @ExcludeMissing
        tokenizationToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<PaymentCredentialsType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        token,
        agentToken,
        createdAt,
        credentials,
        mandate,
        status,
        tokenizationToken,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the payment credential resource
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Globally unique identifier for the associated agent
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentToken(): String = agentToken.getRequired("agent_token")

    /**
     * Date and time when the payment credential resource was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Payment credential and dynamic security code for the purchase
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentials(): PaymentCredentials = credentials.getRequired("credentials")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mandate(): PaymentCredentialsMandateResponse = mandate.getRequired("mandate")

    /**
     * Status of the payment credential resource. New credentials have status ACTIVE
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Globally unique identifier for the associated tokenization
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizationToken(): String = tokenizationToken.getRequired("tokenization_token")

    /**
     * Type of purchase for which payment credentials are requested
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): PaymentCredentialsType = type.getRequired("type")

    /**
     * Date and time when the payment credential resource was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [agentToken].
     *
     * Unlike [agentToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_token") @ExcludeMissing fun _agentToken(): JsonField<String> = agentToken

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [credentials].
     *
     * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credentials")
    @ExcludeMissing
    fun _credentials(): JsonField<PaymentCredentials> = credentials

    /**
     * Returns the raw JSON value of [mandate].
     *
     * Unlike [mandate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mandate")
    @ExcludeMissing
    fun _mandate(): JsonField<PaymentCredentialsMandateResponse> = mandate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tokenizationToken].
     *
     * Unlike [tokenizationToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tokenization_token")
    @ExcludeMissing
    fun _tokenizationToken(): JsonField<String> = tokenizationToken

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentCredentialsType> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * [TokenizationCreatePaymentCredentialsResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .agentToken()
         * .createdAt()
         * .credentials()
         * .mandate()
         * .status()
         * .tokenizationToken()
         * .type()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenizationCreatePaymentCredentialsResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var agentToken: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var credentials: JsonField<PaymentCredentials>? = null
        private var mandate: JsonField<PaymentCredentialsMandateResponse>? = null
        private var status: JsonField<Status>? = null
        private var tokenizationToken: JsonField<String>? = null
        private var type: JsonField<PaymentCredentialsType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            tokenizationCreatePaymentCredentialsResponse:
                TokenizationCreatePaymentCredentialsResponse
        ) = apply {
            token = tokenizationCreatePaymentCredentialsResponse.token
            agentToken = tokenizationCreatePaymentCredentialsResponse.agentToken
            createdAt = tokenizationCreatePaymentCredentialsResponse.createdAt
            credentials = tokenizationCreatePaymentCredentialsResponse.credentials
            mandate = tokenizationCreatePaymentCredentialsResponse.mandate
            status = tokenizationCreatePaymentCredentialsResponse.status
            tokenizationToken = tokenizationCreatePaymentCredentialsResponse.tokenizationToken
            type = tokenizationCreatePaymentCredentialsResponse.type
            updatedAt = tokenizationCreatePaymentCredentialsResponse.updatedAt
            additionalProperties =
                tokenizationCreatePaymentCredentialsResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the payment credential resource */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the associated agent */
        fun agentToken(agentToken: String) = agentToken(JsonField.of(agentToken))

        /**
         * Sets [Builder.agentToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentToken(agentToken: JsonField<String>) = apply { this.agentToken = agentToken }

        /** Date and time when the payment credential resource was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Payment credential and dynamic security code for the purchase */
        fun credentials(credentials: PaymentCredentials) = credentials(JsonField.of(credentials))

        /**
         * Sets [Builder.credentials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentials] with a well-typed [PaymentCredentials]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun credentials(credentials: JsonField<PaymentCredentials>) = apply {
            this.credentials = credentials
        }

        fun mandate(mandate: PaymentCredentialsMandateResponse) = mandate(JsonField.of(mandate))

        /**
         * Sets [Builder.mandate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mandate] with a well-typed
         * [PaymentCredentialsMandateResponse] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun mandate(mandate: JsonField<PaymentCredentialsMandateResponse>) = apply {
            this.mandate = mandate
        }

        /** Status of the payment credential resource. New credentials have status ACTIVE */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier for the associated tokenization */
        fun tokenizationToken(tokenizationToken: String) =
            tokenizationToken(JsonField.of(tokenizationToken))

        /**
         * Sets [Builder.tokenizationToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizationToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenizationToken(tokenizationToken: JsonField<String>) = apply {
            this.tokenizationToken = tokenizationToken
        }

        /** Type of purchase for which payment credentials are requested */
        fun type(type: PaymentCredentialsType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [PaymentCredentialsType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<PaymentCredentialsType>) = apply { this.type = type }

        /** Date and time when the payment credential resource was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TokenizationCreatePaymentCredentialsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .agentToken()
         * .createdAt()
         * .credentials()
         * .mandate()
         * .status()
         * .tokenizationToken()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenizationCreatePaymentCredentialsResponse =
            TokenizationCreatePaymentCredentialsResponse(
                checkRequired("token", token),
                checkRequired("agentToken", agentToken),
                checkRequired("createdAt", createdAt),
                checkRequired("credentials", credentials),
                checkRequired("mandate", mandate),
                checkRequired("status", status),
                checkRequired("tokenizationToken", tokenizationToken),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): TokenizationCreatePaymentCredentialsResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        agentToken()
        createdAt()
        credentials().validate()
        mandate().validate()
        status().validate()
        tokenizationToken()
        type().validate()
        updatedAt()
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
            (if (agentToken.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (credentials.asKnown().getOrNull()?.validity() ?: 0) +
            (mandate.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tokenizationToken.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Payment credential and dynamic security code for the purchase */
    class PaymentCredentials
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cvv: JsonField<String>,
        private val expirationMonth: JsonField<String>,
        private val expirationYear: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cvv") @ExcludeMissing cvv: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_month")
            @ExcludeMissing
            expirationMonth: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_year")
            @ExcludeMissing
            expirationYear: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(cvv, expirationMonth, expirationYear, expiresAt, value, mutableMapOf())

        /**
         * Dynamic card security code for the purchase
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cvv(): String = cvv.getRequired("cvv")

        /**
         * Expiration month of the payment credential
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expirationMonth(): String = expirationMonth.getRequired("expiration_month")

        /**
         * Expiration year of the payment credential
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expirationYear(): String = expirationYear.getRequired("expiration_year")

        /**
         * Date and time when the dynamic security code expires
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * Payment credential to use as the card number for the purchase
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [cvv].
         *
         * Unlike [cvv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cvv") @ExcludeMissing fun _cvv(): JsonField<String> = cvv

        /**
         * Returns the raw JSON value of [expirationMonth].
         *
         * Unlike [expirationMonth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration_month")
        @ExcludeMissing
        fun _expirationMonth(): JsonField<String> = expirationMonth

        /**
         * Returns the raw JSON value of [expirationYear].
         *
         * Unlike [expirationYear], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration_year")
        @ExcludeMissing
        fun _expirationYear(): JsonField<String> = expirationYear

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [PaymentCredentials].
             *
             * The following fields are required:
             * ```java
             * .cvv()
             * .expirationMonth()
             * .expirationYear()
             * .expiresAt()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentCredentials]. */
        class Builder internal constructor() {

            private var cvv: JsonField<String>? = null
            private var expirationMonth: JsonField<String>? = null
            private var expirationYear: JsonField<String>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentCredentials: PaymentCredentials) = apply {
                cvv = paymentCredentials.cvv
                expirationMonth = paymentCredentials.expirationMonth
                expirationYear = paymentCredentials.expirationYear
                expiresAt = paymentCredentials.expiresAt
                value = paymentCredentials.value
                additionalProperties = paymentCredentials.additionalProperties.toMutableMap()
            }

            /** Dynamic card security code for the purchase */
            fun cvv(cvv: String) = cvv(JsonField.of(cvv))

            /**
             * Sets [Builder.cvv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cvv] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cvv(cvv: JsonField<String>) = apply { this.cvv = cvv }

            /** Expiration month of the payment credential */
            fun expirationMonth(expirationMonth: String) =
                expirationMonth(JsonField.of(expirationMonth))

            /**
             * Sets [Builder.expirationMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationMonth] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationMonth(expirationMonth: JsonField<String>) = apply {
                this.expirationMonth = expirationMonth
            }

            /** Expiration year of the payment credential */
            fun expirationYear(expirationYear: String) =
                expirationYear(JsonField.of(expirationYear))

            /**
             * Sets [Builder.expirationYear] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationYear] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationYear(expirationYear: JsonField<String>) = apply {
                this.expirationYear = expirationYear
            }

            /** Date and time when the dynamic security code expires */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** Payment credential to use as the card number for the purchase */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [PaymentCredentials].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cvv()
             * .expirationMonth()
             * .expirationYear()
             * .expiresAt()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentCredentials =
                PaymentCredentials(
                    checkRequired("cvv", cvv),
                    checkRequired("expirationMonth", expirationMonth),
                    checkRequired("expirationYear", expirationYear),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("value", value),
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
        fun validate(): PaymentCredentials = apply {
            if (validated) {
                return@apply
            }

            cvv()
            expirationMonth()
            expirationYear()
            expiresAt()
            value()
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
            (if (cvv.asKnown().isPresent) 1 else 0) +
                (if (expirationMonth.asKnown().isPresent) 1 else 0) +
                (if (expirationYear.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCredentials &&
                cvv == other.cvv &&
                expirationMonth == other.expirationMonth &&
                expirationYear == other.expirationYear &&
                expiresAt == other.expiresAt &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cvv,
                expirationMonth,
                expirationYear,
                expiresAt,
                value,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentCredentials{cvv=$cvv, expirationMonth=$expirationMonth, expirationYear=$expirationYear, expiresAt=$expiresAt, value=$value, additionalProperties=$additionalProperties}"
    }

    class PaymentCredentialsMandateResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val amount: JsonField<Long>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val frequency: JsonField<Frequency>,
        private val merchant: JsonField<Merchant>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("frequency")
            @ExcludeMissing
            frequency: JsonField<Frequency> = JsonMissing.of(),
            @JsonProperty("merchant")
            @ExcludeMissing
            merchant: JsonField<Merchant> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(token, amount, expiresAt, frequency, merchant, status, mutableMapOf())

        /**
         * Globally unique identifier for the mandate
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Purchase amount and mandate limit in USD cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Date and time when the mandate expires, independent of the payment credentials'
         * expiration
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * Purchase frequency. RECURRING purchases require WEEKLY, MONTHLY, or YEARLY
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frequency(): Frequency = frequency.getRequired("frequency")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchant(): Merchant = merchant.getRequired("merchant")

        /**
         * Status of the mandate. New mandates have status PENDING
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<Frequency> = frequency

        /**
         * Returns the raw JSON value of [merchant].
         *
         * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * [PaymentCredentialsMandateResponse].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .expiresAt()
             * .frequency()
             * .merchant()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentCredentialsMandateResponse]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var frequency: JsonField<Frequency>? = null
            private var merchant: JsonField<Merchant>? = null
            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                paymentCredentialsMandateResponse: PaymentCredentialsMandateResponse
            ) = apply {
                token = paymentCredentialsMandateResponse.token
                amount = paymentCredentialsMandateResponse.amount
                expiresAt = paymentCredentialsMandateResponse.expiresAt
                frequency = paymentCredentialsMandateResponse.frequency
                merchant = paymentCredentialsMandateResponse.merchant
                status = paymentCredentialsMandateResponse.status
                additionalProperties =
                    paymentCredentialsMandateResponse.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the mandate */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Purchase amount and mandate limit in USD cents */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * Date and time when the mandate expires, independent of the payment credentials'
             * expiration
             */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** Purchase frequency. RECURRING purchases require WEEKLY, MONTHLY, or YEARLY */
            fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

            /**
             * Sets [Builder.frequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequency] with a well-typed [Frequency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

            fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

            /**
             * Sets [Builder.merchant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchant] with a well-typed [Merchant] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

            /** Status of the mandate. New mandates have status PENDING */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [PaymentCredentialsMandateResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .expiresAt()
             * .frequency()
             * .merchant()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentCredentialsMandateResponse =
                PaymentCredentialsMandateResponse(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("frequency", frequency),
                    checkRequired("merchant", merchant),
                    checkRequired("status", status),
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
        fun validate(): PaymentCredentialsMandateResponse = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            expiresAt()
            frequency().validate()
            merchant().validate()
            status().validate()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                (merchant.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /** Purchase frequency. RECURRING purchases require WEEKLY, MONTHLY, or YEARLY */
        class Frequency @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ONE_TIME = of("ONE_TIME")

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val YEARLY = of("YEARLY")

                @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
            }

            /** An enum containing [Frequency]'s known values. */
            enum class Known {
                ONE_TIME,
                WEEKLY,
                MONTHLY,
                YEARLY,
            }

            /**
             * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Frequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ONE_TIME,
                WEEKLY,
                MONTHLY,
                YEARLY,
                /**
                 * An enum member indicating that [Frequency] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    WEEKLY -> Value.WEEKLY
                    MONTHLY -> Value.MONTHLY
                    YEARLY -> Value.YEARLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    WEEKLY -> Known.WEEKLY
                    MONTHLY -> Known.MONTHLY
                    YEARLY -> Known.YEARLY
                    else -> throw LithicInvalidDataException("Unknown Frequency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
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
            fun validate(): Frequency = apply {
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

                return other is Frequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Merchant
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(name, url, mutableMapOf())

            /**
             * Merchant name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Merchant website URL
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
                 * Returns a mutable builder for constructing an instance of [Merchant].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Merchant]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var url: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(merchant: Merchant) = apply {
                    name = merchant.name
                    url = merchant.url
                    additionalProperties = merchant.additionalProperties.toMutableMap()
                }

                /** Merchant name */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Merchant website URL */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Merchant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Merchant =
                    Merchant(
                        checkRequired("name", name),
                        checkRequired("url", url),
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
            fun validate(): Merchant = apply {
                if (validated) {
                    return@apply
                }

                name()
                url()
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
                (if (name.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Merchant &&
                    name == other.name &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Merchant{name=$name, url=$url, additionalProperties=$additionalProperties}"
        }

        /** Status of the mandate. New mandates have status PENDING */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("PENDING")

                @JvmField val COMPLETED = of("COMPLETED")

                @JvmField val CANCELLED = of("CANCELLED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                COMPLETED,
                CANCELLED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                COMPLETED,
                CANCELLED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    COMPLETED -> Value.COMPLETED
                    CANCELLED -> Value.CANCELLED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    COMPLETED -> Known.COMPLETED
                    CANCELLED -> Known.CANCELLED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
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
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCredentialsMandateResponse &&
                token == other.token &&
                amount == other.amount &&
                expiresAt == other.expiresAt &&
                frequency == other.frequency &&
                merchant == other.merchant &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                amount,
                expiresAt,
                frequency,
                merchant,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentCredentialsMandateResponse{token=$token, amount=$amount, expiresAt=$expiresAt, frequency=$frequency, merchant=$merchant, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Status of the payment credential resource. New credentials have status ACTIVE */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val DEACTIVATED = of("DEACTIVATED")

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            DEACTIVATED,
            COMPLETED,
            CANCELLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            DEACTIVATED,
            COMPLETED,
            CANCELLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                DEACTIVATED -> Value.DEACTIVATED
                COMPLETED -> Value.COMPLETED
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
                ACTIVE -> Known.ACTIVE
                DEACTIVATED -> Known.DEACTIVATED
                COMPLETED -> Known.COMPLETED
                CANCELLED -> Known.CANCELLED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of purchase for which payment credentials are requested */
    class PaymentCredentialsType
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

            @JvmField val AUTONOMOUS = of("AUTONOMOUS")

            @JvmField val HUMAN_IN_THE_LOOP = of("HUMAN_IN_THE_LOOP")

            @JvmField val RECURRING = of("RECURRING")

            @JvmStatic fun of(value: String) = PaymentCredentialsType(JsonField.of(value))
        }

        /** An enum containing [PaymentCredentialsType]'s known values. */
        enum class Known {
            AUTONOMOUS,
            HUMAN_IN_THE_LOOP,
            RECURRING,
        }

        /**
         * An enum containing [PaymentCredentialsType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PaymentCredentialsType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTONOMOUS,
            HUMAN_IN_THE_LOOP,
            RECURRING,
            /**
             * An enum member indicating that [PaymentCredentialsType] was instantiated with an
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
                AUTONOMOUS -> Value.AUTONOMOUS
                HUMAN_IN_THE_LOOP -> Value.HUMAN_IN_THE_LOOP
                RECURRING -> Value.RECURRING
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
                AUTONOMOUS -> Known.AUTONOMOUS
                HUMAN_IN_THE_LOOP -> Known.HUMAN_IN_THE_LOOP
                RECURRING -> Known.RECURRING
                else -> throw LithicInvalidDataException("Unknown PaymentCredentialsType: $value")
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
        fun validate(): PaymentCredentialsType = apply {
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

            return other is PaymentCredentialsType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationCreatePaymentCredentialsResponse &&
            token == other.token &&
            agentToken == other.agentToken &&
            createdAt == other.createdAt &&
            credentials == other.credentials &&
            mandate == other.mandate &&
            status == other.status &&
            tokenizationToken == other.tokenizationToken &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            agentToken,
            createdAt,
            credentials,
            mandate,
            status,
            tokenizationToken,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenizationCreatePaymentCredentialsResponse{token=$token, agentToken=$agentToken, createdAt=$createdAt, credentials=$credentials, mandate=$mandate, status=$status, tokenizationToken=$tokenizationToken, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
