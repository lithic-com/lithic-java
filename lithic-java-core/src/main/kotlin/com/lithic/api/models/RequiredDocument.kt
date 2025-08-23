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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class RequiredDocument
private constructor(
    private val entityToken: JsonField<String>,
    private val statusReasons: JsonField<List<String>>,
    private val validDocuments: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("entity_token")
        @ExcludeMissing
        entityToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_reasons")
        @ExcludeMissing
        statusReasons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("valid_documents")
        @ExcludeMissing
        validDocuments: JsonField<List<String>> = JsonMissing.of(),
    ) : this(entityToken, statusReasons, validDocuments, mutableMapOf())

    /**
     * Globally unique identifier for an entity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityToken(): String = entityToken.getRequired("entity_token")

    /**
     * Provides the status reasons that will be satisfied by providing one of the valid documents.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusReasons(): List<String> = statusReasons.getRequired("status_reasons")

    /**
     * A list of valid documents that will satisfy the KYC requirements for the specified entity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun validDocuments(): List<String> = validDocuments.getRequired("valid_documents")

    /**
     * Returns the raw JSON value of [entityToken].
     *
     * Unlike [entityToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_token")
    @ExcludeMissing
    fun _entityToken(): JsonField<String> = entityToken

    /**
     * Returns the raw JSON value of [statusReasons].
     *
     * Unlike [statusReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_reasons")
    @ExcludeMissing
    fun _statusReasons(): JsonField<List<String>> = statusReasons

    /**
     * Returns the raw JSON value of [validDocuments].
     *
     * Unlike [validDocuments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid_documents")
    @ExcludeMissing
    fun _validDocuments(): JsonField<List<String>> = validDocuments

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
         * Returns a mutable builder for constructing an instance of [RequiredDocument].
         *
         * The following fields are required:
         * ```java
         * .entityToken()
         * .statusReasons()
         * .validDocuments()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequiredDocument]. */
    class Builder internal constructor() {

        private var entityToken: JsonField<String>? = null
        private var statusReasons: JsonField<MutableList<String>>? = null
        private var validDocuments: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requiredDocument: RequiredDocument) = apply {
            entityToken = requiredDocument.entityToken
            statusReasons = requiredDocument.statusReasons.map { it.toMutableList() }
            validDocuments = requiredDocument.validDocuments.map { it.toMutableList() }
            additionalProperties = requiredDocument.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /**
         * Sets [Builder.entityToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        /**
         * Provides the status reasons that will be satisfied by providing one of the valid
         * documents.
         */
        fun statusReasons(statusReasons: List<String>) = statusReasons(JsonField.of(statusReasons))

        /**
         * Sets [Builder.statusReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusReasons] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusReasons(statusReasons: JsonField<List<String>>) = apply {
            this.statusReasons = statusReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [statusReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatusReason(statusReason: String) = apply {
            statusReasons =
                (statusReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("statusReasons", it).add(statusReason)
                }
        }

        /**
         * A list of valid documents that will satisfy the KYC requirements for the specified
         * entity.
         */
        fun validDocuments(validDocuments: List<String>) =
            validDocuments(JsonField.of(validDocuments))

        /**
         * Sets [Builder.validDocuments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validDocuments] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validDocuments(validDocuments: JsonField<List<String>>) = apply {
            this.validDocuments = validDocuments.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [validDocuments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValidDocument(validDocument: String) = apply {
            validDocuments =
                (validDocuments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("validDocuments", it).add(validDocument)
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
         * Returns an immutable instance of [RequiredDocument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .entityToken()
         * .statusReasons()
         * .validDocuments()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequiredDocument =
            RequiredDocument(
                checkRequired("entityToken", entityToken),
                checkRequired("statusReasons", statusReasons).map { it.toImmutable() },
                checkRequired("validDocuments", validDocuments).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RequiredDocument = apply {
        if (validated) {
            return@apply
        }

        entityToken()
        statusReasons()
        validDocuments()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (entityToken.asKnown().isPresent) 1 else 0) +
            (statusReasons.asKnown().getOrNull()?.size ?: 0) +
            (validDocuments.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequiredDocument &&
            entityToken == other.entityToken &&
            statusReasons == other.statusReasons &&
            validDocuments == other.validDocuments &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(entityToken, statusReasons, validDocuments, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequiredDocument{entityToken=$entityToken, statusReasons=$statusReasons, validDocuments=$validDocuments, additionalProperties=$additionalProperties}"
}
