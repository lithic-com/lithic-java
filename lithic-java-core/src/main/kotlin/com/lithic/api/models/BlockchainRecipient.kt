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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BlockchainRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val addressTag: JsonField<String>,
    private val chain: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val externalId: JsonField<String>,
    private val name: JsonField<String>,
    private val owner: JsonField<String>,
    private val ownerType: JsonField<OwnerType>,
    private val programId: JsonField<String>,
    private val state: JsonField<State>,
    private val updated: JsonField<OffsetDateTime>,
    private val verificationState: JsonField<VerificationState>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address_tag")
        @ExcludeMissing
        addressTag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chain") @ExcludeMissing chain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner_type")
        @ExcludeMissing
        ownerType: JsonField<OwnerType> = JsonMissing.of(),
        @JsonProperty("program_id") @ExcludeMissing programId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("verification_state")
        @ExcludeMissing
        verificationState: JsonField<VerificationState> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        addressTag,
        chain,
        created,
        externalId,
        name,
        owner,
        ownerType,
        programId,
        state,
        updated,
        verificationState,
        mutableMapOf(),
    )

    /**
     * A globally unique identifier for this blockchain recipient
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * The financial account the blockchain recipient belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * An optional tag or memo used by some chains to identify the destination of a transfer within
     * a shared address
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressTag(): Optional<String> = addressTag.getOptional("address_tag")

    /**
     * The blockchain network that the address belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chain(): String = chain.getRequired("chain")

    /**
     * An ISO 8601 string representing when this blockchain recipient was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * The identifier the recipient is registered under with the payment provider
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("external_id")

    /**
     * The nickname for this blockchain recipient
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Legal name of the business or individual who owns the blockchain address
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun owner(): String = owner.getRequired("owner")

    /**
     * Owner Type
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

    /**
     * Globally unique identifier for the program the blockchain recipient is associated with
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun programId(): String = programId.getRequired("program_id")

    /**
     * Account State
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * An ISO 8601 string representing when this blockchain recipient was last updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Verification State
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationState(): VerificationState = verificationState.getRequired("verification_state")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [addressTag].
     *
     * Unlike [addressTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address_tag") @ExcludeMissing fun _addressTag(): JsonField<String> = addressTag

    /**
     * Returns the raw JSON value of [chain].
     *
     * Unlike [chain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chain") @ExcludeMissing fun _chain(): JsonField<String> = chain

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /**
     * Returns the raw JSON value of [ownerType].
     *
     * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner_type") @ExcludeMissing fun _ownerType(): JsonField<OwnerType> = ownerType

    /**
     * Returns the raw JSON value of [programId].
     *
     * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [verificationState].
     *
     * Unlike [verificationState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_state")
    @ExcludeMissing
    fun _verificationState(): JsonField<VerificationState> = verificationState

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
         * Returns a mutable builder for constructing an instance of [BlockchainRecipient].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .addressTag()
         * .chain()
         * .created()
         * .externalId()
         * .name()
         * .owner()
         * .ownerType()
         * .programId()
         * .state()
         * .updated()
         * .verificationState()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BlockchainRecipient]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var addressTag: JsonField<String>? = null
        private var chain: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var externalId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var owner: JsonField<String>? = null
        private var ownerType: JsonField<OwnerType>? = null
        private var programId: JsonField<String>? = null
        private var state: JsonField<State>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var verificationState: JsonField<VerificationState>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(blockchainRecipient: BlockchainRecipient) = apply {
            token = blockchainRecipient.token
            accountToken = blockchainRecipient.accountToken
            addressTag = blockchainRecipient.addressTag
            chain = blockchainRecipient.chain
            created = blockchainRecipient.created
            externalId = blockchainRecipient.externalId
            name = blockchainRecipient.name
            owner = blockchainRecipient.owner
            ownerType = blockchainRecipient.ownerType
            programId = blockchainRecipient.programId
            state = blockchainRecipient.state
            updated = blockchainRecipient.updated
            verificationState = blockchainRecipient.verificationState
            additionalProperties = blockchainRecipient.additionalProperties.toMutableMap()
        }

        /** A globally unique identifier for this blockchain recipient */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The financial account the blockchain recipient belongs to */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * An optional tag or memo used by some chains to identify the destination of a transfer
         * within a shared address
         */
        fun addressTag(addressTag: String?) = addressTag(JsonField.ofNullable(addressTag))

        /** Alias for calling [Builder.addressTag] with `addressTag.orElse(null)`. */
        fun addressTag(addressTag: Optional<String>) = addressTag(addressTag.getOrNull())

        /**
         * Sets [Builder.addressTag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressTag] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressTag(addressTag: JsonField<String>) = apply { this.addressTag = addressTag }

        /** The blockchain network that the address belongs to */
        fun chain(chain: String) = chain(JsonField.of(chain))

        /**
         * Sets [Builder.chain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chain(chain: JsonField<String>) = apply { this.chain = chain }

        /** An ISO 8601 string representing when this blockchain recipient was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The identifier the recipient is registered under with the payment provider */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The nickname for this blockchain recipient */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Legal name of the business or individual who owns the blockchain address */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

        /**
         * Sets [Builder.ownerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

        /**
         * Globally unique identifier for the program the blockchain recipient is associated with
         */
        fun programId(programId: String) = programId(JsonField.of(programId))

        /**
         * Sets [Builder.programId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programId(programId: JsonField<String>) = apply { this.programId = programId }

        /** Account State */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** An ISO 8601 string representing when this blockchain recipient was last updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** Verification State */
        fun verificationState(verificationState: VerificationState) =
            verificationState(JsonField.of(verificationState))

        /**
         * Sets [Builder.verificationState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationState] with a well-typed [VerificationState]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun verificationState(verificationState: JsonField<VerificationState>) = apply {
            this.verificationState = verificationState
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
         * Returns an immutable instance of [BlockchainRecipient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .addressTag()
         * .chain()
         * .created()
         * .externalId()
         * .name()
         * .owner()
         * .ownerType()
         * .programId()
         * .state()
         * .updated()
         * .verificationState()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BlockchainRecipient =
            BlockchainRecipient(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("addressTag", addressTag),
                checkRequired("chain", chain),
                checkRequired("created", created),
                checkRequired("externalId", externalId),
                checkRequired("name", name),
                checkRequired("owner", owner),
                checkRequired("ownerType", ownerType),
                checkRequired("programId", programId),
                checkRequired("state", state),
                checkRequired("updated", updated),
                checkRequired("verificationState", verificationState),
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
    fun validate(): BlockchainRecipient = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        addressTag()
        chain()
        created()
        externalId()
        name()
        owner()
        ownerType().validate()
        programId()
        state().validate()
        updated()
        verificationState().validate()
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
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (addressTag.asKnown().isPresent) 1 else 0) +
            (if (chain.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (owner.asKnown().isPresent) 1 else 0) +
            (ownerType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (programId.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (verificationState.asKnown().getOrNull()?.validity() ?: 0)

    /** Account State */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val CLOSED = of("CLOSED")

            @JvmField val PAUSED = of("PAUSED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ENABLED,
            CLOSED,
            PAUSED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            CLOSED,
            PAUSED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                ENABLED -> Value.ENABLED
                CLOSED -> Value.CLOSED
                PAUSED -> Value.PAUSED
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
                ENABLED -> Known.ENABLED
                CLOSED -> Known.CLOSED
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown State: $value")
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): State = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Verification State */
    class VerificationState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val FAILED_VERIFICATION = of("FAILED_VERIFICATION")

            @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            @JvmStatic fun of(value: String) = VerificationState(JsonField.of(value))
        }

        /** An enum containing [VerificationState]'s known values. */
        enum class Known {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
        }

        /**
         * An enum containing [VerificationState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            /**
             * An enum member indicating that [VerificationState] was instantiated with an unknown
             * value.
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
                PENDING -> Value.PENDING
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
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
                PENDING -> Known.PENDING
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): VerificationState = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BlockchainRecipient &&
            token == other.token &&
            accountToken == other.accountToken &&
            addressTag == other.addressTag &&
            chain == other.chain &&
            created == other.created &&
            externalId == other.externalId &&
            name == other.name &&
            owner == other.owner &&
            ownerType == other.ownerType &&
            programId == other.programId &&
            state == other.state &&
            updated == other.updated &&
            verificationState == other.verificationState &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountToken,
            addressTag,
            chain,
            created,
            externalId,
            name,
            owner,
            ownerType,
            programId,
            state,
            updated,
            verificationState,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BlockchainRecipient{token=$token, accountToken=$accountToken, addressTag=$addressTag, chain=$chain, created=$created, externalId=$externalId, name=$name, owner=$owner, ownerType=$ownerType, programId=$programId, state=$state, updated=$updated, verificationState=$verificationState, additionalProperties=$additionalProperties}"
}
