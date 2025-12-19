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

/** Retry a book transfer that has been declined */
class BookTransferRetryParams
private constructor(
    private val bookTransferToken: String?,
    private val body: RetryBookTransferRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun bookTransferToken(): Optional<String> = Optional.ofNullable(bookTransferToken)

    /**
     * Globally unique identifier for the retry.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retryToken(): String = body.retryToken()

    /**
     * Returns the raw JSON value of [retryToken].
     *
     * Unlike [retryToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _retryToken(): JsonField<String> = body._retryToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookTransferRetryParams].
         *
         * The following fields are required:
         * ```java
         * .retryToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookTransferRetryParams]. */
    class Builder internal constructor() {

        private var bookTransferToken: String? = null
        private var body: RetryBookTransferRequest.Builder = RetryBookTransferRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookTransferRetryParams: BookTransferRetryParams) = apply {
            bookTransferToken = bookTransferRetryParams.bookTransferToken
            body = bookTransferRetryParams.body.toBuilder()
            additionalHeaders = bookTransferRetryParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookTransferRetryParams.additionalQueryParams.toBuilder()
        }

        fun bookTransferToken(bookTransferToken: String?) = apply {
            this.bookTransferToken = bookTransferToken
        }

        /** Alias for calling [Builder.bookTransferToken] with `bookTransferToken.orElse(null)`. */
        fun bookTransferToken(bookTransferToken: Optional<String>) =
            bookTransferToken(bookTransferToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [retryToken]
         */
        fun body(body: RetryBookTransferRequest) = apply { this.body = body.toBuilder() }

        /** Globally unique identifier for the retry. */
        fun retryToken(retryToken: String) = apply { body.retryToken(retryToken) }

        /**
         * Sets [Builder.retryToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryToken(retryToken: JsonField<String>) = apply { body.retryToken(retryToken) }

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
         * Returns an immutable instance of [BookTransferRetryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .retryToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BookTransferRetryParams =
            BookTransferRetryParams(
                bookTransferToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): RetryBookTransferRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> bookTransferToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class RetryBookTransferRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val retryToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("retry_token")
            @ExcludeMissing
            retryToken: JsonField<String> = JsonMissing.of()
        ) : this(retryToken, mutableMapOf())

        /**
         * Globally unique identifier for the retry.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retryToken(): String = retryToken.getRequired("retry_token")

        /**
         * Returns the raw JSON value of [retryToken].
         *
         * Unlike [retryToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retry_token")
        @ExcludeMissing
        fun _retryToken(): JsonField<String> = retryToken

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
             * Returns a mutable builder for constructing an instance of [RetryBookTransferRequest].
             *
             * The following fields are required:
             * ```java
             * .retryToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RetryBookTransferRequest]. */
        class Builder internal constructor() {

            private var retryToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(retryBookTransferRequest: RetryBookTransferRequest) = apply {
                retryToken = retryBookTransferRequest.retryToken
                additionalProperties = retryBookTransferRequest.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the retry. */
            fun retryToken(retryToken: String) = retryToken(JsonField.of(retryToken))

            /**
             * Sets [Builder.retryToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryToken(retryToken: JsonField<String>) = apply { this.retryToken = retryToken }

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
             * Returns an immutable instance of [RetryBookTransferRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .retryToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RetryBookTransferRequest =
                RetryBookTransferRequest(
                    checkRequired("retryToken", retryToken),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RetryBookTransferRequest = apply {
            if (validated) {
                return@apply
            }

            retryToken()
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
        @JvmSynthetic internal fun validity(): Int = (if (retryToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RetryBookTransferRequest &&
                retryToken == other.retryToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(retryToken, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RetryBookTransferRequest{retryToken=$retryToken, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookTransferRetryParams &&
            bookTransferToken == other.bookTransferToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(bookTransferToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BookTransferRetryParams{bookTransferToken=$bookTransferToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
