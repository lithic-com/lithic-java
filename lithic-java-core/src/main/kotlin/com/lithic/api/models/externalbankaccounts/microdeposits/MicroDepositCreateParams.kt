// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.externalbankaccounts.microdeposits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects

/** Verify the external bank account by providing the micro deposit amounts. */
class MicroDepositCreateParams
private constructor(
    private val externalBankAccountToken: String,
    private val body: MicroDepositVerificationRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalBankAccountToken(): String = externalBankAccountToken

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun microDeposits(): List<Long> = body.microDeposits()

    /**
     * Returns the raw JSON value of [microDeposits].
     *
     * Unlike [microDeposits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _microDeposits(): JsonField<List<Long>> = body._microDeposits()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MicroDepositCreateParams].
         *
         * The following fields are required:
         * ```java
         * .externalBankAccountToken()
         * .microDeposits()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MicroDepositCreateParams]. */
    class Builder internal constructor() {

        private var externalBankAccountToken: String? = null
        private var body: MicroDepositVerificationRequest.Builder =
            MicroDepositVerificationRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(microDepositCreateParams: MicroDepositCreateParams) = apply {
            externalBankAccountToken = microDepositCreateParams.externalBankAccountToken
            body = microDepositCreateParams.body.toBuilder()
            additionalHeaders = microDepositCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = microDepositCreateParams.additionalQueryParams.toBuilder()
        }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun microDeposits(microDeposits: List<Long>) = apply { body.microDeposits(microDeposits) }

        /**
         * Sets [Builder.microDeposits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.microDeposits] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun microDeposits(microDeposits: JsonField<List<Long>>) = apply {
            body.microDeposits(microDeposits)
        }

        /**
         * Adds a single [Long] to [microDeposits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMicroDeposit(microDeposit: Long) = apply { body.addMicroDeposit(microDeposit) }

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
         * Returns an immutable instance of [MicroDepositCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalBankAccountToken()
         * .microDeposits()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MicroDepositCreateParams =
            MicroDepositCreateParams(
                checkRequired("externalBankAccountToken", externalBankAccountToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): MicroDepositVerificationRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalBankAccountToken
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class MicroDepositVerificationRequest
    private constructor(
        private val microDeposits: JsonField<List<Long>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("micro_deposits")
            @ExcludeMissing
            microDeposits: JsonField<List<Long>> = JsonMissing.of()
        ) : this(microDeposits, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun microDeposits(): List<Long> = microDeposits.getRequired("micro_deposits")

        /**
         * Returns the raw JSON value of [microDeposits].
         *
         * Unlike [microDeposits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("micro_deposits")
        @ExcludeMissing
        fun _microDeposits(): JsonField<List<Long>> = microDeposits

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
             * [MicroDepositVerificationRequest].
             *
             * The following fields are required:
             * ```java
             * .microDeposits()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MicroDepositVerificationRequest]. */
        class Builder internal constructor() {

            private var microDeposits: JsonField<MutableList<Long>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(microDepositVerificationRequest: MicroDepositVerificationRequest) =
                apply {
                    microDeposits =
                        microDepositVerificationRequest.microDeposits.map { it.toMutableList() }
                    additionalProperties =
                        microDepositVerificationRequest.additionalProperties.toMutableMap()
                }

            fun microDeposits(microDeposits: List<Long>) =
                microDeposits(JsonField.of(microDeposits))

            /**
             * Sets [Builder.microDeposits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.microDeposits] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun microDeposits(microDeposits: JsonField<List<Long>>) = apply {
                this.microDeposits = microDeposits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [microDeposits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMicroDeposit(microDeposit: Long) = apply {
                microDeposits =
                    (microDeposits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("microDeposits", it).add(microDeposit)
                    }
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
             * Returns an immutable instance of [MicroDepositVerificationRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .microDeposits()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MicroDepositVerificationRequest =
                MicroDepositVerificationRequest(
                    checkRequired("microDeposits", microDeposits).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MicroDepositVerificationRequest = apply {
            if (validated) {
                return@apply
            }

            microDeposits()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MicroDepositVerificationRequest && microDeposits == other.microDeposits && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(microDeposits, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MicroDepositVerificationRequest{microDeposits=$microDeposits, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MicroDepositCreateParams && externalBankAccountToken == other.externalBankAccountToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalBankAccountToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "MicroDepositCreateParams{externalBankAccountToken=$externalBankAccountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
