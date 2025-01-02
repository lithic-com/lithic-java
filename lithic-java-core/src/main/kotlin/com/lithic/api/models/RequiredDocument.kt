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
import com.lithic.api.core.toImmutable
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

    private var validated: Boolean = false

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
            entityToken = requiredDocument.entityToken
            validDocuments = requiredDocument.validDocuments
            statusReasons = requiredDocument.statusReasons
            additionalProperties = requiredDocument.additionalProperties.toMutableMap()
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
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): RequiredDocument =
            RequiredDocument(
                entityToken,
                validDocuments.map { it.toImmutable() },
                statusReasons.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RequiredDocument && entityToken == other.entityToken && validDocuments == other.validDocuments && statusReasons == other.statusReasons && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(entityToken, validDocuments, statusReasons, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequiredDocument{entityToken=$entityToken, validDocuments=$validDocuments, statusReasons=$statusReasons, additionalProperties=$additionalProperties}"
}
