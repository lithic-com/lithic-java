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

/** Adds a comment to a case. */
class TransactionMonitoringCaseCommentCreateParams
private constructor(
    private val caseToken: String?,
    private val body: AddCommentRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun caseToken(): Optional<String> = Optional.ofNullable(caseToken)

    /**
     * Text of the comment
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun comment(): String = body.comment()

    /**
     * Optional client-provided identifier for the actor performing this action, recorded on the
     * resulting activity entry. This value is supplied by the client (for example, your own
     * internal user ID) and is not authenticated by Lithic
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorToken(): Optional<String> = body.actorToken()

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _comment(): JsonField<String> = body._comment()

    /**
     * Returns the raw JSON value of [actorToken].
     *
     * Unlike [actorToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actorToken(): JsonField<String> = body._actorToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseCommentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .comment()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionMonitoringCaseCommentCreateParams]. */
    class Builder internal constructor() {

        private var caseToken: String? = null
        private var body: AddCommentRequest.Builder = AddCommentRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseCommentCreateParams:
                TransactionMonitoringCaseCommentCreateParams
        ) = apply {
            caseToken = transactionMonitoringCaseCommentCreateParams.caseToken
            body = transactionMonitoringCaseCommentCreateParams.body.toBuilder()
            additionalHeaders =
                transactionMonitoringCaseCommentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transactionMonitoringCaseCommentCreateParams.additionalQueryParams.toBuilder()
        }

        fun caseToken(caseToken: String?) = apply { this.caseToken = caseToken }

        /** Alias for calling [Builder.caseToken] with `caseToken.orElse(null)`. */
        fun caseToken(caseToken: Optional<String>) = caseToken(caseToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [comment]
         * - [actorToken]
         */
        fun body(body: AddCommentRequest) = apply { this.body = body.toBuilder() }

        /** Text of the comment */
        fun comment(comment: String) = apply { body.comment(comment) }

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { body.comment(comment) }

        /**
         * Optional client-provided identifier for the actor performing this action, recorded on the
         * resulting activity entry. This value is supplied by the client (for example, your own
         * internal user ID) and is not authenticated by Lithic
         */
        fun actorToken(actorToken: String) = apply { body.actorToken(actorToken) }

        /**
         * Sets [Builder.actorToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorToken(actorToken: JsonField<String>) = apply { body.actorToken(actorToken) }

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
         * Returns an immutable instance of [TransactionMonitoringCaseCommentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .comment()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionMonitoringCaseCommentCreateParams =
            TransactionMonitoringCaseCommentCreateParams(
                caseToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AddCommentRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> caseToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Parameters for adding a comment to a case */
    class AddCommentRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val comment: JsonField<String>,
        private val actorToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("actor_token")
            @ExcludeMissing
            actorToken: JsonField<String> = JsonMissing.of(),
        ) : this(comment, actorToken, mutableMapOf())

        /**
         * Text of the comment
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun comment(): String = comment.getRequired("comment")

        /**
         * Optional client-provided identifier for the actor performing this action, recorded on the
         * resulting activity entry. This value is supplied by the client (for example, your own
         * internal user ID) and is not authenticated by Lithic
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actorToken(): Optional<String> = actorToken.getOptional("actor_token")

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

        /**
         * Returns the raw JSON value of [actorToken].
         *
         * Unlike [actorToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actor_token")
        @ExcludeMissing
        fun _actorToken(): JsonField<String> = actorToken

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
             * Returns a mutable builder for constructing an instance of [AddCommentRequest].
             *
             * The following fields are required:
             * ```java
             * .comment()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddCommentRequest]. */
        class Builder internal constructor() {

            private var comment: JsonField<String>? = null
            private var actorToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addCommentRequest: AddCommentRequest) = apply {
                comment = addCommentRequest.comment
                actorToken = addCommentRequest.actorToken
                additionalProperties = addCommentRequest.additionalProperties.toMutableMap()
            }

            /** Text of the comment */
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
             * Optional client-provided identifier for the actor performing this action, recorded on
             * the resulting activity entry. This value is supplied by the client (for example, your
             * own internal user ID) and is not authenticated by Lithic
             */
            fun actorToken(actorToken: String) = actorToken(JsonField.of(actorToken))

            /**
             * Sets [Builder.actorToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actorToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actorToken(actorToken: JsonField<String>) = apply { this.actorToken = actorToken }

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
             * Returns an immutable instance of [AddCommentRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .comment()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AddCommentRequest =
                AddCommentRequest(
                    checkRequired("comment", comment),
                    actorToken,
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
        fun validate(): AddCommentRequest = apply {
            if (validated) {
                return@apply
            }

            comment()
            actorToken()
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
            (if (comment.asKnown().isPresent) 1 else 0) +
                (if (actorToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AddCommentRequest &&
                comment == other.comment &&
                actorToken == other.actorToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(comment, actorToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddCommentRequest{comment=$comment, actorToken=$actorToken, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseCommentCreateParams &&
            caseToken == other.caseToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(caseToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionMonitoringCaseCommentCreateParams{caseToken=$caseToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
