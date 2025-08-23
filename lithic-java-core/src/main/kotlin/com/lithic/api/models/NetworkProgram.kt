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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects

class NetworkProgram
private constructor(
    private val token: JsonField<String>,
    private val defaultProductCode: JsonField<String>,
    private val name: JsonField<String>,
    private val registeredProgramIdentificationNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_product_code")
        @ExcludeMissing
        defaultProductCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registered_program_identification_number")
        @ExcludeMissing
        registeredProgramIdentificationNumber: JsonField<String> = JsonMissing.of(),
    ) : this(token, defaultProductCode, name, registeredProgramIdentificationNumber, mutableMapOf())

    /**
     * Lithic-generated unique identifier for the program
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Network product ID associated with this program.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultProductCode(): String = defaultProductCode.getRequired("default_product_code")

    /**
     * The name of the network program.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * RPIN value assigned by the network.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun registeredProgramIdentificationNumber(): String =
        registeredProgramIdentificationNumber.getRequired(
            "registered_program_identification_number"
        )

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [defaultProductCode].
     *
     * Unlike [defaultProductCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_product_code")
    @ExcludeMissing
    fun _defaultProductCode(): JsonField<String> = defaultProductCode

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [registeredProgramIdentificationNumber].
     *
     * Unlike [registeredProgramIdentificationNumber], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("registered_program_identification_number")
    @ExcludeMissing
    fun _registeredProgramIdentificationNumber(): JsonField<String> =
        registeredProgramIdentificationNumber

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
         * Returns a mutable builder for constructing an instance of [NetworkProgram].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .defaultProductCode()
         * .name()
         * .registeredProgramIdentificationNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkProgram]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var defaultProductCode: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var registeredProgramIdentificationNumber: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(networkProgram: NetworkProgram) = apply {
            token = networkProgram.token
            defaultProductCode = networkProgram.defaultProductCode
            name = networkProgram.name
            registeredProgramIdentificationNumber =
                networkProgram.registeredProgramIdentificationNumber
            additionalProperties = networkProgram.additionalProperties.toMutableMap()
        }

        /** Lithic-generated unique identifier for the program */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Network product ID associated with this program. */
        fun defaultProductCode(defaultProductCode: String) =
            defaultProductCode(JsonField.of(defaultProductCode))

        /**
         * Sets [Builder.defaultProductCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultProductCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultProductCode(defaultProductCode: JsonField<String>) = apply {
            this.defaultProductCode = defaultProductCode
        }

        /** The name of the network program. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** RPIN value assigned by the network. */
        fun registeredProgramIdentificationNumber(registeredProgramIdentificationNumber: String) =
            registeredProgramIdentificationNumber(
                JsonField.of(registeredProgramIdentificationNumber)
            )

        /**
         * Sets [Builder.registeredProgramIdentificationNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registeredProgramIdentificationNumber] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun registeredProgramIdentificationNumber(
            registeredProgramIdentificationNumber: JsonField<String>
        ) = apply {
            this.registeredProgramIdentificationNumber = registeredProgramIdentificationNumber
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
         * Returns an immutable instance of [NetworkProgram].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .defaultProductCode()
         * .name()
         * .registeredProgramIdentificationNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NetworkProgram =
            NetworkProgram(
                checkRequired("token", token),
                checkRequired("defaultProductCode", defaultProductCode),
                checkRequired("name", name),
                checkRequired(
                    "registeredProgramIdentificationNumber",
                    registeredProgramIdentificationNumber,
                ),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NetworkProgram = apply {
        if (validated) {
            return@apply
        }

        token()
        defaultProductCode()
        name()
        registeredProgramIdentificationNumber()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (defaultProductCode.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (registeredProgramIdentificationNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkProgram &&
            token == other.token &&
            defaultProductCode == other.defaultProductCode &&
            name == other.name &&
            registeredProgramIdentificationNumber == other.registeredProgramIdentificationNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            defaultProductCode,
            name,
            registeredProgramIdentificationNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NetworkProgram{token=$token, defaultProductCode=$defaultProductCode, name=$name, registeredProgramIdentificationNumber=$registeredProgramIdentificationNumber, additionalProperties=$additionalProperties}"
}
