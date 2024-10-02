// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = RequiredDocument.Builder::class)
@NoAutoDetect
class RequiredDocument
private constructor(
    private val entityToken: JsonField<String>,
    private val validDocuments: JsonField<List<String>>,
    private val statusReasons: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Globally unique identifier for an entity. */
    fun entityToken(): String = entityToken.getRequired("entity_token")

    /**
     * A list of valid documents that will satisfy the KYC requirements for the specified entity.
     */
    fun validDocuments(): List<String> = validDocuments.getRequired("valid_documents")

    /**
     * rovides the status reasons that will be satisfied by providing one of the valid documents.
     */
    fun statusReasons(): List<String> = statusReasons.getRequired("status_reasons")

    /** Globally unique identifier for an entity. */
    @JsonProperty("entity_token") @ExcludeMissing fun _entityToken() = entityToken

    /**
     * A list of valid documents that will satisfy the KYC requirements for the specified entity.
     */
    @JsonProperty("valid_documents") @ExcludeMissing fun _validDocuments() = validDocuments

    /**
     * rovides the status reasons that will be satisfied by providing one of the valid documents.
     */
    @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RequiredDocument = apply {
        if (!validated) {
            entityToken()
            validDocuments()
            statusReasons()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var entityToken: JsonField<String> = JsonMissing.of()
        private var validDocuments: JsonField<List<String>> = JsonMissing.of()
        private var statusReasons: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requiredDocument: RequiredDocument) = apply {
            this.entityToken = requiredDocument.entityToken
            this.validDocuments = requiredDocument.validDocuments
            this.statusReasons = requiredDocument.statusReasons
            additionalProperties(requiredDocument.additionalProperties)
        }

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /** Globally unique identifier for an entity. */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        /**
         * A list of valid documents that will satisfy the KYC requirements for the specified
         * entity.
         */
        fun validDocuments(validDocuments: List<String>) =
            validDocuments(JsonField.of(validDocuments))

        /**
         * A list of valid documents that will satisfy the KYC requirements for the specified
         * entity.
         */
        @JsonProperty("valid_documents")
        @ExcludeMissing
        fun validDocuments(validDocuments: JsonField<List<String>>) = apply {
            this.validDocuments = validDocuments
        }

        /**
         * rovides the status reasons that will be satisfied by providing one of the valid
         * documents.
         */
        fun statusReasons(statusReasons: List<String>) = statusReasons(JsonField.of(statusReasons))

        /**
         * rovides the status reasons that will be satisfied by providing one of the valid
         * documents.
         */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun statusReasons(statusReasons: JsonField<List<String>>) = apply {
            this.statusReasons = statusReasons
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

        fun build(): RequiredDocument =
            RequiredDocument(
                entityToken,
                validDocuments.map { it.toUnmodifiable() },
                statusReasons.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequiredDocument &&
            this.entityToken == other.entityToken &&
            this.validDocuments == other.validDocuments &&
            this.statusReasons == other.statusReasons &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    entityToken,
                    validDocuments,
                    statusReasons,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RequiredDocument{entityToken=$entityToken, validDocuments=$validDocuments, statusReasons=$statusReasons, additionalProperties=$additionalProperties}"
}
