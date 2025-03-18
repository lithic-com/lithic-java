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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

/**
 * Use this endpoint to identify which type of supported government-issued documentation you will
 * upload for further verification. It will return two URLs to upload your document images to - one
 * for the front image and one for the back image.
 *
 * This endpoint is only valid for evaluations in a `PENDING_DOCUMENT` state.
 *
 * Uploaded images must either be a `jpg` or `png` file, and each must be less than 15 MiB. Once
 * both required uploads have been successfully completed, your document will be run through KYC
 * verification.
 *
 * If you have registered a webhook, you will receive evaluation updates for any document submission
 * evaluations, as well as for any failed document uploads.
 *
 * Two document submission attempts are permitted via this endpoint before a `REJECTED` status is
 * returned and the account creation process is ended. Currently only one type of account holder
 * document is supported per KYC verification.
 */
class AccountHolderUploadDocumentParams
private constructor(
    private val accountHolderToken: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountHolderToken(): String = accountHolderToken

    /**
     * The type of document to upload
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): DocumentType = body.documentType()

    /**
     * Globally unique identifier for the entity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityToken(): String = body.entityToken()

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documentType(): JsonField<DocumentType> = body._documentType()

    /**
     * Returns the raw JSON value of [entityToken].
     *
     * Unlike [entityToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityToken(): JsonField<String> = body._entityToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountHolderToken
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("document_type")
        @ExcludeMissing
        private val documentType: JsonField<DocumentType> = JsonMissing.of(),
        @JsonProperty("entity_token")
        @ExcludeMissing
        private val entityToken: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The type of document to upload
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.getRequired("document_type")

        /**
         * Globally unique identifier for the entity.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entityToken(): String = entityToken.getRequired("entity_token")

        /**
         * Returns the raw JSON value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): JsonField<DocumentType> = documentType

        /**
         * Returns the raw JSON value of [entityToken].
         *
         * Unlike [entityToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun _entityToken(): JsonField<String> = entityToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            documentType()
            entityToken()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .documentType()
             * .entityToken()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var documentType: JsonField<DocumentType>? = null
            private var entityToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                documentType = body.documentType
                entityToken = body.entityToken
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The type of document to upload */
            fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: JsonField<DocumentType>) = apply {
                this.documentType = documentType
            }

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

            /**
             * Sets [Builder.entityToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityToken(entityToken: JsonField<String>) = apply {
                this.entityToken = entityToken
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .documentType()
             * .entityToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("documentType", documentType),
                    checkRequired("entityToken", entityToken),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && documentType == other.documentType && entityToken == other.entityToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(documentType, entityToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{documentType=$documentType, entityToken=$entityToken, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountHolderUploadDocumentParams].
         *
         * The following fields are required:
         * ```java
         * .accountHolderToken()
         * .documentType()
         * .entityToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderUploadDocumentParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var accountHolderToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountHolderUploadDocumentParams: AccountHolderUploadDocumentParams) =
            apply {
                accountHolderToken = accountHolderUploadDocumentParams.accountHolderToken
                body = accountHolderUploadDocumentParams.body.toBuilder()
                additionalHeaders = accountHolderUploadDocumentParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    accountHolderUploadDocumentParams.additionalQueryParams.toBuilder()
            }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** The type of document to upload */
        fun documentType(documentType: DocumentType) = apply { body.documentType(documentType) }

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            body.documentType(documentType)
        }

        /** Globally unique identifier for the entity. */
        fun entityToken(entityToken: String) = apply { body.entityToken(entityToken) }

        /**
         * Sets [Builder.entityToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityToken(entityToken: JsonField<String>) = apply { body.entityToken(entityToken) }

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
         * Returns an immutable instance of [AccountHolderUploadDocumentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountHolderToken()
         * .documentType()
         * .entityToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderUploadDocumentParams =
            AccountHolderUploadDocumentParams(
                checkRequired("accountHolderToken", accountHolderToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The type of document to upload */
    class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val EIN_LETTER = of("EIN_LETTER")

            @JvmField val TAX_RETURN = of("TAX_RETURN")

            @JvmField val OPERATING_AGREEMENT = of("OPERATING_AGREEMENT")

            @JvmField val CERTIFICATE_OF_FORMATION = of("CERTIFICATE_OF_FORMATION")

            @JvmField val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

            @JvmField val PASSPORT = of("PASSPORT")

            @JvmField val PASSPORT_CARD = of("PASSPORT_CARD")

            @JvmField val CERTIFICATE_OF_GOOD_STANDING = of("CERTIFICATE_OF_GOOD_STANDING")

            @JvmField val ARTICLES_OF_INCORPORATION = of("ARTICLES_OF_INCORPORATION")

            @JvmField val ARTICLES_OF_ORGANIZATION = of("ARTICLES_OF_ORGANIZATION")

            @JvmField val BYLAWS = of("BYLAWS")

            @JvmField val GOVERNMENT_BUSINESS_LICENSE = of("GOVERNMENT_BUSINESS_LICENSE")

            @JvmField val PARTNERSHIP_AGREEMENT = of("PARTNERSHIP_AGREEMENT")

            @JvmField val SS4_FORM = of("SS4_FORM")

            @JvmField val BANK_STATEMENT = of("BANK_STATEMENT")

            @JvmField val UTILITY_BILL_STATEMENT = of("UTILITY_BILL_STATEMENT")

            @JvmField val SSN_CARD = of("SSN_CARD")

            @JvmField val ITIN_LETTER = of("ITIN_LETTER")

            @JvmField val FINCEN_BOI_REPORT = of("FINCEN_BOI_REPORT")

            @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
        }

        /** An enum containing [DocumentType]'s known values. */
        enum class Known {
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
            FINCEN_BOI_REPORT,
        }

        /**
         * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
            FINCEN_BOI_REPORT,
            /**
             * An enum member indicating that [DocumentType] was instantiated with an unknown value.
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
                EIN_LETTER -> Value.EIN_LETTER
                TAX_RETURN -> Value.TAX_RETURN
                OPERATING_AGREEMENT -> Value.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Value.CERTIFICATE_OF_FORMATION
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                PASSPORT -> Value.PASSPORT
                PASSPORT_CARD -> Value.PASSPORT_CARD
                CERTIFICATE_OF_GOOD_STANDING -> Value.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Value.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Value.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Value.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Value.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Value.SS4_FORM
                BANK_STATEMENT -> Value.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Value.UTILITY_BILL_STATEMENT
                SSN_CARD -> Value.SSN_CARD
                ITIN_LETTER -> Value.ITIN_LETTER
                FINCEN_BOI_REPORT -> Value.FINCEN_BOI_REPORT
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
                EIN_LETTER -> Known.EIN_LETTER
                TAX_RETURN -> Known.TAX_RETURN
                OPERATING_AGREEMENT -> Known.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Known.CERTIFICATE_OF_FORMATION
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                PASSPORT -> Known.PASSPORT
                PASSPORT_CARD -> Known.PASSPORT_CARD
                CERTIFICATE_OF_GOOD_STANDING -> Known.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Known.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Known.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Known.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Known.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Known.SS4_FORM
                BANK_STATEMENT -> Known.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Known.UTILITY_BILL_STATEMENT
                SSN_CARD -> Known.SSN_CARD
                ITIN_LETTER -> Known.ITIN_LETTER
                FINCEN_BOI_REPORT -> Known.FINCEN_BOI_REPORT
                else -> throw LithicInvalidDataException("Unknown DocumentType: $value")
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

            return /* spotless:off */ other is DocumentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderUploadDocumentParams && accountHolderToken == other.accountHolderToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountHolderToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountHolderUploadDocumentParams{accountHolderToken=$accountHolderToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
