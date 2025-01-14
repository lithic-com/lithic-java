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
constructor(
    private val accountHolderToken: String,
    private val body: AccountHolderUploadDocumentBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun accountHolderToken(): String = accountHolderToken

    /** The type of document to upload */
    fun documentType(): DocumentType = body.documentType()

    /** Globally unique identifier for the entity. */
    fun entityToken(): String = body.entityToken()

    /** The type of document to upload */
    fun _documentType(): JsonField<DocumentType> = body._documentType()

    /** Globally unique identifier for the entity. */
    fun _entityToken(): JsonField<String> = body._entityToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AccountHolderUploadDocumentBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AccountHolderUploadDocumentBody
    @JsonCreator
    internal constructor(
        @JsonProperty("document_type")
        @ExcludeMissing
        private val documentType: JsonField<DocumentType> = JsonMissing.of(),
        @JsonProperty("entity_token")
        @ExcludeMissing
        private val entityToken: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of document to upload */
        fun documentType(): DocumentType = documentType.getRequired("document_type")

        /** Globally unique identifier for the entity. */
        fun entityToken(): String = entityToken.getRequired("entity_token")

        /** The type of document to upload */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): JsonField<DocumentType> = documentType

        /** Globally unique identifier for the entity. */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun _entityToken(): JsonField<String> = entityToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountHolderUploadDocumentBody = apply {
            if (validated) {
                return@apply
            }

            documentType()
            entityToken()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var documentType: JsonField<DocumentType>? = null
            private var entityToken: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderUploadDocumentBody: AccountHolderUploadDocumentBody) =
                apply {
                    documentType = accountHolderUploadDocumentBody.documentType
                    entityToken = accountHolderUploadDocumentBody.entityToken
                    additionalProperties =
                        accountHolderUploadDocumentBody.additionalProperties.toMutableMap()
                }

            /** The type of document to upload */
            fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

            /** The type of document to upload */
            fun documentType(documentType: JsonField<DocumentType>) = apply {
                this.documentType = documentType
            }

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

            /** Globally unique identifier for the entity. */
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

            fun build(): AccountHolderUploadDocumentBody =
                AccountHolderUploadDocumentBody(
                    checkRequired("documentType", documentType),
                    checkRequired("entityToken", entityToken),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderUploadDocumentBody && documentType == other.documentType && entityToken == other.entityToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(documentType, entityToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderUploadDocumentBody{documentType=$documentType, entityToken=$entityToken, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var body: AccountHolderUploadDocumentBody.Builder =
            AccountHolderUploadDocumentBody.builder()
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

        /** The type of document to upload */
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            body.documentType(documentType)
        }

        /** Globally unique identifier for the entity. */
        fun entityToken(entityToken: String) = apply { body.entityToken(entityToken) }

        /** Globally unique identifier for the entity. */
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

        fun build(): AccountHolderUploadDocumentParams =
            AccountHolderUploadDocumentParams(
                checkRequired("accountHolderToken", accountHolderToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class DocumentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()

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
