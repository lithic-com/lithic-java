// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class AccountHolderUploadDocumentParams
constructor(
    private val accountHolderToken: String,
    private val documentType: DocumentType,
    private val entityToken: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountHolderToken(): String = accountHolderToken

    fun documentType(): DocumentType = documentType

    fun entityToken(): String = entityToken

    @JvmSynthetic
    internal fun getBody(): AccountHolderUploadDocumentBody {
        return AccountHolderUploadDocumentBody(
            documentType,
            entityToken,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountHolderUploadDocumentBody.Builder::class)
    @NoAutoDetect
    class AccountHolderUploadDocumentBody
    internal constructor(
        private val documentType: DocumentType?,
        private val entityToken: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of document to upload */
        @JsonProperty("document_type") fun documentType(): DocumentType? = documentType

        /** Globally unique identifier for the entity. */
        @JsonProperty("entity_token") fun entityToken(): String? = entityToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var documentType: DocumentType? = null
            private var entityToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderUploadDocumentBody: AccountHolderUploadDocumentBody) =
                apply {
                    this.documentType = accountHolderUploadDocumentBody.documentType
                    this.entityToken = accountHolderUploadDocumentBody.entityToken
                    additionalProperties(accountHolderUploadDocumentBody.additionalProperties)
                }

            /** The type of document to upload */
            @JsonProperty("document_type")
            fun documentType(documentType: DocumentType) = apply {
                this.documentType = documentType
            }

            /** Globally unique identifier for the entity. */
            @JsonProperty("entity_token")
            fun entityToken(entityToken: String) = apply { this.entityToken = entityToken }

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

            fun build(): AccountHolderUploadDocumentBody =
                AccountHolderUploadDocumentBody(
                    checkNotNull(documentType) { "`documentType` is required but was not set" },
                    checkNotNull(entityToken) { "`entityToken` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderUploadDocumentBody && this.documentType == other.documentType && this.entityToken == other.entityToken && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(documentType, entityToken, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderUploadDocumentBody{documentType=$documentType, entityToken=$entityToken, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderUploadDocumentParams && this.accountHolderToken == other.accountHolderToken && this.documentType == other.documentType && this.entityToken == other.entityToken && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountHolderToken, documentType, entityToken, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountHolderUploadDocumentParams{accountHolderToken=$accountHolderToken, documentType=$documentType, entityToken=$entityToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var documentType: DocumentType? = null
        private var entityToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUploadDocumentParams: AccountHolderUploadDocumentParams) =
            apply {
                this.accountHolderToken = accountHolderUploadDocumentParams.accountHolderToken
                this.documentType = accountHolderUploadDocumentParams.documentType
                this.entityToken = accountHolderUploadDocumentParams.entityToken
                additionalQueryParams(accountHolderUploadDocumentParams.additionalQueryParams)
                additionalHeaders(accountHolderUploadDocumentParams.additionalHeaders)
                additionalBodyProperties(accountHolderUploadDocumentParams.additionalBodyProperties)
            }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** The type of document to upload */
        fun documentType(documentType: DocumentType) = apply { this.documentType = documentType }

        /** Globally unique identifier for the entity. */
        fun entityToken(entityToken: String) = apply { this.entityToken = entityToken }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountHolderUploadDocumentParams =
            AccountHolderUploadDocumentParams(
                checkNotNull(accountHolderToken) {
                    "`accountHolderToken` is required but was not set"
                },
                checkNotNull(documentType) { "`documentType` is required but was not set" },
                checkNotNull(entityToken) { "`entityToken` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class DocumentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val EIN_LETTER = DocumentType(JsonField.of("EIN_LETTER"))

            @JvmField val TAX_RETURN = DocumentType(JsonField.of("TAX_RETURN"))

            @JvmField val OPERATING_AGREEMENT = DocumentType(JsonField.of("OPERATING_AGREEMENT"))

            @JvmField
            val CERTIFICATE_OF_FORMATION = DocumentType(JsonField.of("CERTIFICATE_OF_FORMATION"))

            @JvmField val DRIVERS_LICENSE = DocumentType(JsonField.of("DRIVERS_LICENSE"))

            @JvmField val PASSPORT = DocumentType(JsonField.of("PASSPORT"))

            @JvmField val PASSPORT_CARD = DocumentType(JsonField.of("PASSPORT_CARD"))

            @JvmField
            val CERTIFICATE_OF_GOOD_STANDING =
                DocumentType(JsonField.of("CERTIFICATE_OF_GOOD_STANDING"))

            @JvmField
            val ARTICLES_OF_INCORPORATION = DocumentType(JsonField.of("ARTICLES_OF_INCORPORATION"))

            @JvmField
            val ARTICLES_OF_ORGANIZATION = DocumentType(JsonField.of("ARTICLES_OF_ORGANIZATION"))

            @JvmField val BYLAWS = DocumentType(JsonField.of("BYLAWS"))

            @JvmField
            val GOVERNMENT_BUSINESS_LICENSE =
                DocumentType(JsonField.of("GOVERNMENT_BUSINESS_LICENSE"))

            @JvmField
            val PARTNERSHIP_AGREEMENT = DocumentType(JsonField.of("PARTNERSHIP_AGREEMENT"))

            @JvmField val SS4_FORM = DocumentType(JsonField.of("SS4_FORM"))

            @JvmField val BANK_STATEMENT = DocumentType(JsonField.of("BANK_STATEMENT"))

            @JvmField
            val UTILITY_BILL_STATEMENT = DocumentType(JsonField.of("UTILITY_BILL_STATEMENT"))

            @JvmField val SSN_CARD = DocumentType(JsonField.of("SSN_CARD"))

            @JvmField val ITIN_LETTER = DocumentType(JsonField.of("ITIN_LETTER"))

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
                else -> throw LithicInvalidDataException("Unknown DocumentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
