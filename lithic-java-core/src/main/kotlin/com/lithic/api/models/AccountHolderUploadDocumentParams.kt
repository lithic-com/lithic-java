package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
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
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountHolderToken(): String = accountHolderToken

    fun documentType(): DocumentType = documentType

    @JvmSynthetic
    internal fun toBody(): AccountHolderUploadDocumentBody =
        AccountHolderUploadDocumentBody(documentType, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountHolderToken
            else -> ""
        }
    }

    @NoAutoDetect
    class AccountHolderUploadDocumentBody
    internal constructor(
        private val documentType: DocumentType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Type of the document to upload. */
        @JsonProperty("document_type") fun documentType(): DocumentType? = documentType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolderUploadDocumentBody &&
                documentType == other.documentType &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(documentType, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderUploadDocumentBody{documentType=$documentType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var documentType: DocumentType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountHolderUploadDocumentBody: AccountHolderUploadDocumentBody) =
                apply {
                    this.documentType = accountHolderUploadDocumentBody.documentType
                    additionalProperties(accountHolderUploadDocumentBody.additionalProperties)
                }

            /** Type of the document to upload. */
            @JsonProperty("document_type")
            fun documentType(documentType: DocumentType) = apply {
                this.documentType = documentType
            }

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
                    checkNotNull(documentType) {
                        "Property `documentType` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderUploadDocumentParams &&
            accountHolderToken == other.accountHolderToken &&
            documentType == other.documentType &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountHolderToken,
            documentType,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountHolderUploadDocumentParams{accountHolderToken=$accountHolderToken, documentType=$documentType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var documentType: DocumentType? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderUploadDocumentParams: AccountHolderUploadDocumentParams) =
            apply {
                this.accountHolderToken = accountHolderUploadDocumentParams.accountHolderToken
                this.documentType = accountHolderUploadDocumentParams.documentType
                additionalQueryParams(accountHolderUploadDocumentParams.additionalQueryParams)
                additionalHeaders(accountHolderUploadDocumentParams.additionalHeaders)
                additionalBodyProperties(accountHolderUploadDocumentParams.additionalBodyProperties)
            }

        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Type of the document to upload. */
        fun documentType(documentType: DocumentType) = apply { this.documentType = documentType }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AccountHolderUploadDocumentParams =
            AccountHolderUploadDocumentParams(
                checkNotNull(accountHolderToken) {
                    "Property `accountHolderToken` is required but was not set"
                },
                checkNotNull(documentType) {
                    "Property `documentType` is required but was not set"
                },
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class DocumentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COMMERCIAL_LICENSE = DocumentType(JsonField.of("commercial_license"))

            @JvmField val DRIVERS_LICENSE = DocumentType(JsonField.of("drivers_license"))

            @JvmField val PASSPORT = DocumentType(JsonField.of("passport"))

            @JvmField val PASSPORT_CARD = DocumentType(JsonField.of("passport_card"))

            @JvmField val VISA = DocumentType(JsonField.of("visa"))

            @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
        }

        enum class Known {
            COMMERCIAL_LICENSE,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            VISA,
        }

        enum class Value {
            COMMERCIAL_LICENSE,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            VISA,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMERCIAL_LICENSE -> Value.COMMERCIAL_LICENSE
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                PASSPORT -> Value.PASSPORT
                PASSPORT_CARD -> Value.PASSPORT_CARD
                VISA -> Value.VISA
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMMERCIAL_LICENSE -> Known.COMMERCIAL_LICENSE
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                PASSPORT -> Known.PASSPORT
                PASSPORT_CARD -> Known.PASSPORT_CARD
                VISA -> Known.VISA
                else ->
                    throw LithicInvalidDataException(
                        "Unknown AccountHolderUploadDocumentBody.DocumentType: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
