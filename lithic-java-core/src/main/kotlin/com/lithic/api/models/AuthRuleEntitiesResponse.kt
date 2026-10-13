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

/**
 * The entities the Auth Rule applies to (`include`) and does not apply to (`exclude`). An exclusion
 * overrides an inclusion.
 */
class AuthRuleEntitiesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val exclude: JsonField<List<AuthRuleEntity>>,
    private val include: JsonField<List<AuthRuleEntity>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("exclude")
        @ExcludeMissing
        exclude: JsonField<List<AuthRuleEntity>> = JsonMissing.of(),
        @JsonProperty("include")
        @ExcludeMissing
        include: JsonField<List<AuthRuleEntity>> = JsonMissing.of(),
    ) : this(exclude, include, mutableMapOf())

    /**
     * Entities the Auth Rule does not apply to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exclude(): List<AuthRuleEntity> = exclude.getRequired("exclude")

    /**
     * Entities the Auth Rule applies to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun include(): List<AuthRuleEntity> = include.getRequired("include")

    /**
     * Returns the raw JSON value of [exclude].
     *
     * Unlike [exclude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exclude")
    @ExcludeMissing
    fun _exclude(): JsonField<List<AuthRuleEntity>> = exclude

    /**
     * Returns the raw JSON value of [include].
     *
     * Unlike [include], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("include")
    @ExcludeMissing
    fun _include(): JsonField<List<AuthRuleEntity>> = include

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
         * Returns a mutable builder for constructing an instance of [AuthRuleEntitiesResponse].
         *
         * The following fields are required:
         * ```java
         * .exclude()
         * .include()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleEntitiesResponse]. */
    class Builder internal constructor() {

        private var exclude: JsonField<MutableList<AuthRuleEntity>>? = null
        private var include: JsonField<MutableList<AuthRuleEntity>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleEntitiesResponse: AuthRuleEntitiesResponse) = apply {
            exclude = authRuleEntitiesResponse.exclude.map { it.toMutableList() }
            include = authRuleEntitiesResponse.include.map { it.toMutableList() }
            additionalProperties = authRuleEntitiesResponse.additionalProperties.toMutableMap()
        }

        /** Entities the Auth Rule does not apply to */
        fun exclude(exclude: List<AuthRuleEntity>) = exclude(JsonField.of(exclude))

        /**
         * Sets [Builder.exclude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exclude] with a well-typed `List<AuthRuleEntity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exclude(exclude: JsonField<List<AuthRuleEntity>>) = apply {
            this.exclude = exclude.map { it.toMutableList() }
        }

        /**
         * Adds a single [AuthRuleEntity] to [Builder.exclude].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExclude(exclude: AuthRuleEntity) = apply {
            this.exclude =
                (this.exclude ?: JsonField.of(mutableListOf())).also {
                    checkKnown("exclude", it).add(exclude)
                }
        }

        /** Alias for calling [addExclude] with `AuthRuleEntity.ofProgram(program)`. */
        fun addExclude(program: AuthRuleEntity.AuthRuleProgramEntity) =
            addExclude(AuthRuleEntity.ofProgram(program))

        /** Alias for calling [addExclude] with `AuthRuleEntity.ofCard(card)`. */
        fun addExclude(card: AuthRuleEntity.AuthRuleCardEntity) =
            addExclude(AuthRuleEntity.ofCard(card))

        /**
         * Alias for calling [addExclude] with the following:
         * ```java
         * AuthRuleEntity.AuthRuleCardEntity.builder()
         *     .type(AuthRuleEntity.AuthRuleCardEntity.Type.CARD)
         *     .token(token)
         *     .build()
         * ```
         */
        fun addCardExclude(token: String) =
            addExclude(
                AuthRuleEntity.AuthRuleCardEntity.builder()
                    .type(AuthRuleEntity.AuthRuleCardEntity.Type.CARD)
                    .token(token)
                    .build()
            )

        /** Alias for calling [addExclude] with `AuthRuleEntity.ofAccount(account)`. */
        fun addExclude(account: AuthRuleEntity.AuthRuleAccountEntity) =
            addExclude(AuthRuleEntity.ofAccount(account))

        /**
         * Alias for calling [addExclude] with the following:
         * ```java
         * AuthRuleEntity.AuthRuleAccountEntity.builder()
         *     .type(AuthRuleEntity.AuthRuleAccountEntity.Type.ACCOUNT)
         *     .token(token)
         *     .build()
         * ```
         */
        fun addAccountExclude(token: String) =
            addExclude(
                AuthRuleEntity.AuthRuleAccountEntity.builder()
                    .type(AuthRuleEntity.AuthRuleAccountEntity.Type.ACCOUNT)
                    .token(token)
                    .build()
            )

        /**
         * Alias for calling [addExclude] with `AuthRuleEntity.ofBusinessAccount(businessAccount)`.
         */
        fun addExclude(businessAccount: AuthRuleEntity.AuthRuleBusinessAccountEntity) =
            addExclude(AuthRuleEntity.ofBusinessAccount(businessAccount))

        /**
         * Alias for calling [addExclude] with the following:
         * ```java
         * AuthRuleEntity.AuthRuleBusinessAccountEntity.builder()
         *     .type(AuthRuleEntity.AuthRuleBusinessAccountEntity.Type.BUSINESS_ACCOUNT)
         *     .token(token)
         *     .build()
         * ```
         */
        fun addBusinessAccountExclude(token: String) =
            addExclude(
                AuthRuleEntity.AuthRuleBusinessAccountEntity.builder()
                    .type(AuthRuleEntity.AuthRuleBusinessAccountEntity.Type.BUSINESS_ACCOUNT)
                    .token(token)
                    .build()
            )

        /** Alias for calling [addExclude] with `AuthRuleEntity.ofCardTag(cardTag)`. */
        fun addExclude(cardTag: AuthRuleEntity.AuthRuleCardTagEntity) =
            addExclude(AuthRuleEntity.ofCardTag(cardTag))

        /** Entities the Auth Rule applies to */
        fun include(include: List<AuthRuleEntity>) = include(JsonField.of(include))

        /**
         * Sets [Builder.include] to an arbitrary JSON value.
         *
         * You should usually call [Builder.include] with a well-typed `List<AuthRuleEntity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun include(include: JsonField<List<AuthRuleEntity>>) = apply {
            this.include = include.map { it.toMutableList() }
        }

        /**
         * Adds a single [AuthRuleEntity] to [Builder.include].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInclude(include: AuthRuleEntity) = apply {
            this.include =
                (this.include ?: JsonField.of(mutableListOf())).also {
                    checkKnown("include", it).add(include)
                }
        }

        /** Alias for calling [addInclude] with `AuthRuleEntity.ofProgram(program)`. */
        fun addInclude(program: AuthRuleEntity.AuthRuleProgramEntity) =
            addInclude(AuthRuleEntity.ofProgram(program))

        /** Alias for calling [addInclude] with `AuthRuleEntity.ofCard(card)`. */
        fun addInclude(card: AuthRuleEntity.AuthRuleCardEntity) =
            addInclude(AuthRuleEntity.ofCard(card))

        /**
         * Alias for calling [addInclude] with the following:
         * ```java
         * AuthRuleEntity.AuthRuleCardEntity.builder()
         *     .type(AuthRuleEntity.AuthRuleCardEntity.Type.CARD)
         *     .token(token)
         *     .build()
         * ```
         */
        fun addCardInclude(token: String) =
            addInclude(
                AuthRuleEntity.AuthRuleCardEntity.builder()
                    .type(AuthRuleEntity.AuthRuleCardEntity.Type.CARD)
                    .token(token)
                    .build()
            )

        /** Alias for calling [addInclude] with `AuthRuleEntity.ofAccount(account)`. */
        fun addInclude(account: AuthRuleEntity.AuthRuleAccountEntity) =
            addInclude(AuthRuleEntity.ofAccount(account))

        /**
         * Alias for calling [addInclude] with the following:
         * ```java
         * AuthRuleEntity.AuthRuleAccountEntity.builder()
         *     .type(AuthRuleEntity.AuthRuleAccountEntity.Type.ACCOUNT)
         *     .token(token)
         *     .build()
         * ```
         */
        fun addAccountInclude(token: String) =
            addInclude(
                AuthRuleEntity.AuthRuleAccountEntity.builder()
                    .type(AuthRuleEntity.AuthRuleAccountEntity.Type.ACCOUNT)
                    .token(token)
                    .build()
            )

        /**
         * Alias for calling [addInclude] with `AuthRuleEntity.ofBusinessAccount(businessAccount)`.
         */
        fun addInclude(businessAccount: AuthRuleEntity.AuthRuleBusinessAccountEntity) =
            addInclude(AuthRuleEntity.ofBusinessAccount(businessAccount))

        /**
         * Alias for calling [addInclude] with the following:
         * ```java
         * AuthRuleEntity.AuthRuleBusinessAccountEntity.builder()
         *     .type(AuthRuleEntity.AuthRuleBusinessAccountEntity.Type.BUSINESS_ACCOUNT)
         *     .token(token)
         *     .build()
         * ```
         */
        fun addBusinessAccountInclude(token: String) =
            addInclude(
                AuthRuleEntity.AuthRuleBusinessAccountEntity.builder()
                    .type(AuthRuleEntity.AuthRuleBusinessAccountEntity.Type.BUSINESS_ACCOUNT)
                    .token(token)
                    .build()
            )

        /** Alias for calling [addInclude] with `AuthRuleEntity.ofCardTag(cardTag)`. */
        fun addInclude(cardTag: AuthRuleEntity.AuthRuleCardTagEntity) =
            addInclude(AuthRuleEntity.ofCardTag(cardTag))

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
         * Returns an immutable instance of [AuthRuleEntitiesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .exclude()
         * .include()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleEntitiesResponse =
            AuthRuleEntitiesResponse(
                checkRequired("exclude", exclude).map { it.toImmutable() },
                checkRequired("include", include).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AuthRuleEntitiesResponse = apply {
        if (validated) {
            return@apply
        }

        exclude().forEach { it.validate() }
        include().forEach { it.validate() }
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
        (exclude.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (include.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleEntitiesResponse &&
            exclude == other.exclude &&
            include == other.include &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(exclude, include, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRuleEntitiesResponse{exclude=$exclude, include=$include, additionalProperties=$additionalProperties}"
}
