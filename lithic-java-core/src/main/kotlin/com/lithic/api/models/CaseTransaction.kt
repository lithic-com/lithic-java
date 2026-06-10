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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** A single transaction associated with a case */
class CaseTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val addedAt: JsonField<OffsetDateTime>,
    private val cardToken: JsonField<String>,
    private val transactionCreatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_created_at")
        @ExcludeMissing
        transactionCreatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(token, accountToken, addedAt, cardToken, transactionCreatedAt, mutableMapOf())

    /**
     * Globally unique identifier for the transaction
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Token of the account the transaction belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Date and time at which the transaction was added to the case
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addedAt(): OffsetDateTime = addedAt.getRequired("added_at")

    /**
     * Token of the card the transaction was made on
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Date and time at which the transaction was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionCreatedAt(): OffsetDateTime =
        transactionCreatedAt.getRequired("transaction_created_at")

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
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [transactionCreatedAt].
     *
     * Unlike [transactionCreatedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_created_at")
    @ExcludeMissing
    fun _transactionCreatedAt(): JsonField<OffsetDateTime> = transactionCreatedAt

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
         * Returns a mutable builder for constructing an instance of [CaseTransaction].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .addedAt()
         * .cardToken()
         * .transactionCreatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CaseTransaction]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var addedAt: JsonField<OffsetDateTime>? = null
        private var cardToken: JsonField<String>? = null
        private var transactionCreatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(caseTransaction: CaseTransaction) = apply {
            token = caseTransaction.token
            accountToken = caseTransaction.accountToken
            addedAt = caseTransaction.addedAt
            cardToken = caseTransaction.cardToken
            transactionCreatedAt = caseTransaction.transactionCreatedAt
            additionalProperties = caseTransaction.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the transaction */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Token of the account the transaction belongs to */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

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

        /** Date and time at which the transaction was added to the case */
        fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

        /**
         * Sets [Builder.addedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

        /** Token of the card the transaction was made on */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Date and time at which the transaction was created */
        fun transactionCreatedAt(transactionCreatedAt: OffsetDateTime) =
            transactionCreatedAt(JsonField.of(transactionCreatedAt))

        /**
         * Sets [Builder.transactionCreatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionCreatedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionCreatedAt(transactionCreatedAt: JsonField<OffsetDateTime>) = apply {
            this.transactionCreatedAt = transactionCreatedAt
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
         * Returns an immutable instance of [CaseTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .addedAt()
         * .cardToken()
         * .transactionCreatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CaseTransaction =
            CaseTransaction(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("addedAt", addedAt),
                checkRequired("cardToken", cardToken),
                checkRequired("transactionCreatedAt", transactionCreatedAt),
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
    fun validate(): CaseTransaction = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        addedAt()
        cardToken()
        transactionCreatedAt()
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
            (if (addedAt.asKnown().isPresent) 1 else 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (if (transactionCreatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CaseTransaction &&
            token == other.token &&
            accountToken == other.accountToken &&
            addedAt == other.addedAt &&
            cardToken == other.cardToken &&
            transactionCreatedAt == other.transactionCreatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountToken,
            addedAt,
            cardToken,
            transactionCreatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CaseTransaction{token=$token, accountToken=$accountToken, addedAt=$addedAt, cardToken=$cardToken, transactionCreatedAt=$transactionCreatedAt, additionalProperties=$additionalProperties}"
}
