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
 * Reassigns a card to another account. The card must be in an `OPEN` or `PAUSED` state, and the
 * destination account must be in an `ACTIVE` state.
 *
 * Clients must contact their Lithic account manager for access to this endpoint.
 */
class CardReassignAccountParams
private constructor(
    private val cardToken: String?,
    private val body: ReassignAccountRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    /**
     * Globally unique identifier for the account to associate with the card
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun newAccountToken(): String = body.newAccountToken()

    /**
     * Returns the raw JSON value of [newAccountToken].
     *
     * Unlike [newAccountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _newAccountToken(): JsonField<String> = body._newAccountToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardReassignAccountParams].
         *
         * The following fields are required:
         * ```java
         * .newAccountToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardReassignAccountParams]. */
    class Builder internal constructor() {

        private var cardToken: String? = null
        private var body: ReassignAccountRequest.Builder = ReassignAccountRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardReassignAccountParams: CardReassignAccountParams) = apply {
            cardToken = cardReassignAccountParams.cardToken
            body = cardReassignAccountParams.body.toBuilder()
            additionalHeaders = cardReassignAccountParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardReassignAccountParams.additionalQueryParams.toBuilder()
        }

        fun cardToken(cardToken: String?) = apply { this.cardToken = cardToken }

        /** Alias for calling [Builder.cardToken] with `cardToken.orElse(null)`. */
        fun cardToken(cardToken: Optional<String>) = cardToken(cardToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [newAccountToken]
         */
        fun body(body: ReassignAccountRequest) = apply { this.body = body.toBuilder() }

        /** Globally unique identifier for the account to associate with the card */
        fun newAccountToken(newAccountToken: String) = apply {
            body.newAccountToken(newAccountToken)
        }

        /**
         * Sets [Builder.newAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun newAccountToken(newAccountToken: JsonField<String>) = apply {
            body.newAccountToken(newAccountToken)
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

        /**
         * Returns an immutable instance of [CardReassignAccountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .newAccountToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardReassignAccountParams =
            CardReassignAccountParams(
                cardToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ReassignAccountRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Parameters for reassigning a card to another account. */
    class ReassignAccountRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val newAccountToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("new_account_token")
            @ExcludeMissing
            newAccountToken: JsonField<String> = JsonMissing.of()
        ) : this(newAccountToken, mutableMapOf())

        /**
         * Globally unique identifier for the account to associate with the card
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun newAccountToken(): String = newAccountToken.getRequired("new_account_token")

        /**
         * Returns the raw JSON value of [newAccountToken].
         *
         * Unlike [newAccountToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("new_account_token")
        @ExcludeMissing
        fun _newAccountToken(): JsonField<String> = newAccountToken

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
             * Returns a mutable builder for constructing an instance of [ReassignAccountRequest].
             *
             * The following fields are required:
             * ```java
             * .newAccountToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReassignAccountRequest]. */
        class Builder internal constructor() {

            private var newAccountToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reassignAccountRequest: ReassignAccountRequest) = apply {
                newAccountToken = reassignAccountRequest.newAccountToken
                additionalProperties = reassignAccountRequest.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the account to associate with the card */
            fun newAccountToken(newAccountToken: String) =
                newAccountToken(JsonField.of(newAccountToken))

            /**
             * Sets [Builder.newAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.newAccountToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun newAccountToken(newAccountToken: JsonField<String>) = apply {
                this.newAccountToken = newAccountToken
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
             * Returns an immutable instance of [ReassignAccountRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .newAccountToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReassignAccountRequest =
                ReassignAccountRequest(
                    checkRequired("newAccountToken", newAccountToken),
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
        fun validate(): ReassignAccountRequest = apply {
            if (validated) {
                return@apply
            }

            newAccountToken()
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
        internal fun validity(): Int = (if (newAccountToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReassignAccountRequest &&
                newAccountToken == other.newAccountToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(newAccountToken, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReassignAccountRequest{newAccountToken=$newAccountToken, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardReassignAccountParams &&
            cardToken == other.cardToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cardToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardReassignAccountParams{cardToken=$cardToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
