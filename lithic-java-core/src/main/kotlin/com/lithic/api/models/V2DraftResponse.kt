// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = V2DraftResponse.Builder::class)
@NoAutoDetect
class V2DraftResponse
private constructor(
    private val token: JsonField<String>,
    private val state: JsonField<AuthRuleState>,
    private val programLevel: JsonField<Boolean>,
    private val cardTokens: JsonField<List<String>>,
    private val excludedCardTokens: JsonField<List<String>>,
    private val accountTokens: JsonField<List<String>>,
    private val type: JsonField<AuthRuleType>,
    private val currentVersion: JsonField<CurrentVersion>,
    private val draftVersion: JsonField<DraftVersion>,
    private val name: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** Auth Rule Token */
    fun token(): String = token.getRequired("token")

    /** The state of the Auth Rule */
    fun state(): AuthRuleState = state.getRequired("state")

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    fun programLevel(): Boolean = programLevel.getRequired("program_level")

    /** Card tokens to which the Auth Rule applies. */
    fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

    /** Card tokens to which the Auth Rule does not apply. */
    fun excludedCardTokens(): Optional<List<String>> =
        Optional.ofNullable(excludedCardTokens.getNullable("excluded_card_tokens"))

    /** Account tokens to which the Auth Rule applies. */
    fun accountTokens(): List<String> = accountTokens.getRequired("account_tokens")

    /** The type of Auth Rule */
    fun type(): AuthRuleType = type.getRequired("type")

    fun currentVersion(): Optional<CurrentVersion> =
        Optional.ofNullable(currentVersion.getNullable("current_version"))

    fun draftVersion(): Optional<DraftVersion> =
        Optional.ofNullable(draftVersion.getNullable("draft_version"))

    /** Auth Rule Name */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Auth Rule Token */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The state of the Auth Rule */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    @JsonProperty("program_level") @ExcludeMissing fun _programLevel() = programLevel

    /** Card tokens to which the Auth Rule applies. */
    @JsonProperty("card_tokens") @ExcludeMissing fun _cardTokens() = cardTokens

    /** Card tokens to which the Auth Rule does not apply. */
    @JsonProperty("excluded_card_tokens")
    @ExcludeMissing
    fun _excludedCardTokens() = excludedCardTokens

    /** Account tokens to which the Auth Rule applies. */
    @JsonProperty("account_tokens") @ExcludeMissing fun _accountTokens() = accountTokens

    /** The type of Auth Rule */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("current_version") @ExcludeMissing fun _currentVersion() = currentVersion

    @JsonProperty("draft_version") @ExcludeMissing fun _draftVersion() = draftVersion

    /** Auth Rule Name */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): V2DraftResponse = apply {
        if (!validated) {
            token()
            state()
            programLevel()
            cardTokens()
            excludedCardTokens()
            accountTokens()
            type()
            currentVersion().map { it.validate() }
            draftVersion().map { it.validate() }
            name()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var state: JsonField<AuthRuleState> = JsonMissing.of()
        private var programLevel: JsonField<Boolean> = JsonMissing.of()
        private var cardTokens: JsonField<List<String>> = JsonMissing.of()
        private var excludedCardTokens: JsonField<List<String>> = JsonMissing.of()
        private var accountTokens: JsonField<List<String>> = JsonMissing.of()
        private var type: JsonField<AuthRuleType> = JsonMissing.of()
        private var currentVersion: JsonField<CurrentVersion> = JsonMissing.of()
        private var draftVersion: JsonField<DraftVersion> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2DraftResponse: V2DraftResponse) = apply {
            token = v2DraftResponse.token
            state = v2DraftResponse.state
            programLevel = v2DraftResponse.programLevel
            cardTokens = v2DraftResponse.cardTokens
            excludedCardTokens = v2DraftResponse.excludedCardTokens
            accountTokens = v2DraftResponse.accountTokens
            type = v2DraftResponse.type
            currentVersion = v2DraftResponse.currentVersion
            draftVersion = v2DraftResponse.draftVersion
            name = v2DraftResponse.name
            additionalProperties = v2DraftResponse.additionalProperties.toMutableMap()
        }

        /** Auth Rule Token */
        fun token(token: String) = token(JsonField.of(token))

        /** Auth Rule Token */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The state of the Auth Rule */
        fun state(state: AuthRuleState) = state(JsonField.of(state))

        /** The state of the Auth Rule */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<AuthRuleState>) = apply { this.state = state }

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        @JsonProperty("program_level")
        @ExcludeMissing
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
        }

        /** Card tokens to which the Auth Rule applies. */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /** Card tokens to which the Auth Rule applies. */
        @JsonProperty("card_tokens")
        @ExcludeMissing
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply { this.cardTokens = cardTokens }

        /** Card tokens to which the Auth Rule does not apply. */
        fun excludedCardTokens(excludedCardTokens: List<String>) =
            excludedCardTokens(JsonField.of(excludedCardTokens))

        /** Card tokens to which the Auth Rule does not apply. */
        @JsonProperty("excluded_card_tokens")
        @ExcludeMissing
        fun excludedCardTokens(excludedCardTokens: JsonField<List<String>>) = apply {
            this.excludedCardTokens = excludedCardTokens
        }

        /** Account tokens to which the Auth Rule applies. */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /** Account tokens to which the Auth Rule applies. */
        @JsonProperty("account_tokens")
        @ExcludeMissing
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens
        }

        /** The type of Auth Rule */
        fun type(type: AuthRuleType) = type(JsonField.of(type))

        /** The type of Auth Rule */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

        fun currentVersion(currentVersion: CurrentVersion) =
            currentVersion(JsonField.of(currentVersion))

        @JsonProperty("current_version")
        @ExcludeMissing
        fun currentVersion(currentVersion: JsonField<CurrentVersion>) = apply {
            this.currentVersion = currentVersion
        }

        fun draftVersion(draftVersion: DraftVersion) = draftVersion(JsonField.of(draftVersion))

        @JsonProperty("draft_version")
        @ExcludeMissing
        fun draftVersion(draftVersion: JsonField<DraftVersion>) = apply {
            this.draftVersion = draftVersion
        }

        /** Auth Rule Name */
        fun name(name: String) = name(JsonField.of(name))

        /** Auth Rule Name */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): V2DraftResponse =
            V2DraftResponse(
                token,
                state,
                programLevel,
                cardTokens.map { it.toImmutable() },
                excludedCardTokens.map { it.toImmutable() },
                accountTokens.map { it.toImmutable() },
                type,
                currentVersion,
                draftVersion,
                name,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = CurrentVersion.Builder::class)
    @NoAutoDetect
    class CurrentVersion
    private constructor(
        private val parameters: JsonField<Parameters>,
        private val version: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Parameters for the current version of the Auth Rule */
        fun parameters(): Parameters = parameters.getRequired("parameters")

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        fun version(): Long = version.getRequired("version")

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") @ExcludeMissing fun _parameters() = parameters

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        @JsonProperty("version") @ExcludeMissing fun _version() = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CurrentVersion = apply {
            if (!validated) {
                parameters()
                version()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(currentVersion: CurrentVersion) = apply {
                parameters = currentVersion.parameters
                version = currentVersion.version
                additionalProperties = currentVersion.additionalProperties.toMutableMap()
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            @JsonProperty("version")
            @ExcludeMissing
            fun version(version: JsonField<Long>) = apply { this.version = version }

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

            fun build(): CurrentVersion =
                CurrentVersion(
                    parameters,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
        private constructor(
            private val conditionalBlockParameters: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun conditionalBlockParameters(): Optional<ConditionalBlockParameters> =
                Optional.ofNullable(conditionalBlockParameters)

            fun velocityLimitParams(): Optional<VelocityLimitParams> =
                Optional.ofNullable(velocityLimitParams)

            fun isConditionalBlockParameters(): Boolean = conditionalBlockParameters != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun asConditionalBlockParameters(): ConditionalBlockParameters =
                conditionalBlockParameters.getOrThrow("conditionalBlockParameters")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    conditionalBlockParameters != null ->
                        visitor.visitConditionalBlockParameters(conditionalBlockParameters)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Parameters = apply {
                if (!validated) {
                    if (conditionalBlockParameters == null && velocityLimitParams == null) {
                        throw LithicInvalidDataException("Unknown Parameters: $_json")
                    }
                    conditionalBlockParameters?.validate()
                    velocityLimitParams?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && conditionalBlockParameters == other.conditionalBlockParameters && velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */

            override fun toString(): String =
                when {
                    conditionalBlockParameters != null ->
                        "Parameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }

            companion object {

                @JvmStatic
                fun ofConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ) = Parameters(conditionalBlockParameters = conditionalBlockParameters)

                @JvmStatic
                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    Parameters(velocityLimitParams = velocityLimitParams)
            }

            interface Visitor<out T> {

                fun visitConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Parameters: $json")
                }
            }

            class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                            it.validate()
                        }
                        ?.let {
                            return Parameters(conditionalBlockParameters = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                        ?.let {
                            return Parameters(velocityLimitParams = it, _json = json)
                        }

                    return Parameters(_json = json)
                }
            }

            class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                override fun serialize(
                    value: Parameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.conditionalBlockParameters != null ->
                            generator.writeObject(value.conditionalBlockParameters)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
                    }
                }
            }

            @JsonDeserialize(builder = ConditionalBlockParameters.Builder::class)
            @NoAutoDetect
            class ConditionalBlockParameters
            private constructor(
                private val conditions: JsonField<List<Condition>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ConditionalBlockParameters = apply {
                    if (!validated) {
                        conditions().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var conditions: JsonField<List<Condition>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(conditionalBlockParameters: ConditionalBlockParameters) =
                        apply {
                            conditions = conditionalBlockParameters.conditions
                            additionalProperties =
                                conditionalBlockParameters.additionalProperties.toMutableMap()
                        }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    @JsonProperty("conditions")
                    @ExcludeMissing
                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ConditionalBlockParameters =
                        ConditionalBlockParameters(
                            conditions.map { it.toImmutable() },
                            additionalProperties.toImmutable()
                        )
                }

                @JsonDeserialize(builder = Condition.Builder::class)
                @NoAutoDetect
                class Condition
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val operation: JsonField<Operation>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     */
                    fun attribute(): Optional<Attribute> =
                        Optional.ofNullable(attribute.getNullable("attribute"))

                    /** The operation to apply to the attribute */
                    fun operation(): Optional<Operation> =
                        Optional.ofNullable(operation.getNullable("operation"))

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Condition = apply {
                        if (!validated) {
                            attribute()
                            operation()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var attribute: JsonField<Attribute> = JsonMissing.of()
                        private var operation: JsonField<Operation> = JsonMissing.of()
                        private var value: JsonField<Value> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(condition: Condition) = apply {
                            attribute = condition.attribute
                            operation = condition.operation
                            value = condition.value
                            additionalProperties = condition.additionalProperties.toMutableMap()
                        }

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         */
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /** The operation to apply to the attribute */
                        @JsonProperty("operation")
                        @ExcludeMissing
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Condition =
                            Condition(
                                attribute,
                                operation,
                                value,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Attribute
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val MCC = of("MCC")

                            @JvmField val COUNTRY = of("COUNTRY")

                            @JvmField val CURRENCY = of("CURRENCY")

                            @JvmField val MERCHANT_ID = of("MERCHANT_ID")

                            @JvmField val DESCRIPTOR = of("DESCRIPTOR")

                            @JvmField val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                            @JvmField val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                            @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                            @JvmField val RISK_SCORE = of("RISK_SCORE")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

                            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        enum class Known {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                        }

                        enum class Value {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MCC -> Value.MCC
                                COUNTRY -> Value.COUNTRY
                                CURRENCY -> Value.CURRENCY
                                MERCHANT_ID -> Value.MERCHANT_ID
                                DESCRIPTOR -> Value.DESCRIPTOR
                                LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                                RISK_SCORE -> Value.RISK_SCORE
                                CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MCC -> Known.MCC
                                COUNTRY -> Known.COUNTRY
                                CURRENCY -> Known.CURRENCY
                                MERCHANT_ID -> Known.MERCHANT_ID
                                DESCRIPTOR -> Known.DESCRIPTOR
                                LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                                RISK_SCORE -> Known.RISK_SCORE
                                CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val IS_ONE_OF = of("IS_ONE_OF")

                            @JvmField val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

                            @JvmField val MATCHES = of("MATCHES")

                            @JvmField val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

                            @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

                            @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

                            @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
                        }

                        enum class Known {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                        }

                        enum class Value {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                IS_ONE_OF -> Value.IS_ONE_OF
                                IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                                MATCHES -> Value.MATCHES
                                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                                IS_LESS_THAN -> Value.IS_LESS_THAN
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                IS_ONE_OF -> Known.IS_ONE_OF
                                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                MATCHES -> Known.MATCHES
                                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                IS_LESS_THAN -> Known.IS_LESS_THAN
                                else ->
                                    throw LithicInvalidDataException("Unknown Operation: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val integer: Long? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): Optional<String> = Optional.ofNullable(string)
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun integer(): Optional<Long> = Optional.ofNullable(integer)
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                        fun isString(): Boolean = string != null

                        fun isInteger(): Boolean = integer != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asInteger(): Long = integer.getOrThrow("integer")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                integer != null -> visitor.visitInteger(integer)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && integer == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && string == other.string && integer == other.integer && strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, integer, strings) /* spotless:on */

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                integer != null -> "Value{integer=$integer}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            @JvmStatic fun ofString(string: String) = Value(string = string)

                            @JvmStatic fun ofInteger(integer: Long) = Value(integer = integer)

                            @JvmStatic
                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitInteger(integer: Long): T

                            fun visitStrings(strings: List<String>): T

                            fun unknown(json: JsonValue?): T {
                                throw LithicInvalidDataException("Unknown Value: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Value>(Value::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                val json = JsonValue.fromJsonNode(node)

                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    return Value(string = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    return Value(integer = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    return Value(strings = it, _json = json)
                                }

                                return Value(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<Value>(Value::class) {

                            override fun serialize(
                                value: Value,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.string != null -> generator.writeObject(value.string)
                                    value.integer != null -> generator.writeObject(value.integer)
                                    value.strings != null -> generator.writeObject(value.strings)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Value")
                                }
                            }
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Condition && attribute == other.attribute && operation == other.operation && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(attribute, operation, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionalBlockParameters && conditions == other.conditions && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(conditions, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentVersion && parameters == other.parameters && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = DraftVersion.Builder::class)
    @NoAutoDetect
    class DraftVersion
    private constructor(
        private val parameters: JsonField<Parameters>,
        private val version: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Parameters for the current version of the Auth Rule */
        fun parameters(): Parameters = parameters.getRequired("parameters")

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        fun version(): Long = version.getRequired("version")

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") @ExcludeMissing fun _parameters() = parameters

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        @JsonProperty("version") @ExcludeMissing fun _version() = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DraftVersion = apply {
            if (!validated) {
                parameters()
                version()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(draftVersion: DraftVersion) = apply {
                parameters = draftVersion.parameters
                version = draftVersion.version
                additionalProperties = draftVersion.additionalProperties.toMutableMap()
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            @JsonProperty("version")
            @ExcludeMissing
            fun version(version: JsonField<Long>) = apply { this.version = version }

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

            fun build(): DraftVersion =
                DraftVersion(
                    parameters,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
        private constructor(
            private val conditionalBlockParameters: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun conditionalBlockParameters(): Optional<ConditionalBlockParameters> =
                Optional.ofNullable(conditionalBlockParameters)

            fun velocityLimitParams(): Optional<VelocityLimitParams> =
                Optional.ofNullable(velocityLimitParams)

            fun isConditionalBlockParameters(): Boolean = conditionalBlockParameters != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun asConditionalBlockParameters(): ConditionalBlockParameters =
                conditionalBlockParameters.getOrThrow("conditionalBlockParameters")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    conditionalBlockParameters != null ->
                        visitor.visitConditionalBlockParameters(conditionalBlockParameters)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Parameters = apply {
                if (!validated) {
                    if (conditionalBlockParameters == null && velocityLimitParams == null) {
                        throw LithicInvalidDataException("Unknown Parameters: $_json")
                    }
                    conditionalBlockParameters?.validate()
                    velocityLimitParams?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && conditionalBlockParameters == other.conditionalBlockParameters && velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */

            override fun toString(): String =
                when {
                    conditionalBlockParameters != null ->
                        "Parameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }

            companion object {

                @JvmStatic
                fun ofConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ) = Parameters(conditionalBlockParameters = conditionalBlockParameters)

                @JvmStatic
                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    Parameters(velocityLimitParams = velocityLimitParams)
            }

            interface Visitor<out T> {

                fun visitConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Parameters: $json")
                }
            }

            class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                            it.validate()
                        }
                        ?.let {
                            return Parameters(conditionalBlockParameters = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                        ?.let {
                            return Parameters(velocityLimitParams = it, _json = json)
                        }

                    return Parameters(_json = json)
                }
            }

            class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                override fun serialize(
                    value: Parameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.conditionalBlockParameters != null ->
                            generator.writeObject(value.conditionalBlockParameters)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
                    }
                }
            }

            @JsonDeserialize(builder = ConditionalBlockParameters.Builder::class)
            @NoAutoDetect
            class ConditionalBlockParameters
            private constructor(
                private val conditions: JsonField<List<Condition>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ConditionalBlockParameters = apply {
                    if (!validated) {
                        conditions().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var conditions: JsonField<List<Condition>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(conditionalBlockParameters: ConditionalBlockParameters) =
                        apply {
                            conditions = conditionalBlockParameters.conditions
                            additionalProperties =
                                conditionalBlockParameters.additionalProperties.toMutableMap()
                        }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    @JsonProperty("conditions")
                    @ExcludeMissing
                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ConditionalBlockParameters =
                        ConditionalBlockParameters(
                            conditions.map { it.toImmutable() },
                            additionalProperties.toImmutable()
                        )
                }

                @JsonDeserialize(builder = Condition.Builder::class)
                @NoAutoDetect
                class Condition
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val operation: JsonField<Operation>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     */
                    fun attribute(): Optional<Attribute> =
                        Optional.ofNullable(attribute.getNullable("attribute"))

                    /** The operation to apply to the attribute */
                    fun operation(): Optional<Operation> =
                        Optional.ofNullable(operation.getNullable("operation"))

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Condition = apply {
                        if (!validated) {
                            attribute()
                            operation()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var attribute: JsonField<Attribute> = JsonMissing.of()
                        private var operation: JsonField<Operation> = JsonMissing.of()
                        private var value: JsonField<Value> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(condition: Condition) = apply {
                            attribute = condition.attribute
                            operation = condition.operation
                            value = condition.value
                            additionalProperties = condition.additionalProperties.toMutableMap()
                        }

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         */
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /** The operation to apply to the attribute */
                        @JsonProperty("operation")
                        @ExcludeMissing
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Condition =
                            Condition(
                                attribute,
                                operation,
                                value,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Attribute
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val MCC = of("MCC")

                            @JvmField val COUNTRY = of("COUNTRY")

                            @JvmField val CURRENCY = of("CURRENCY")

                            @JvmField val MERCHANT_ID = of("MERCHANT_ID")

                            @JvmField val DESCRIPTOR = of("DESCRIPTOR")

                            @JvmField val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                            @JvmField val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                            @JvmField val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                            @JvmField val RISK_SCORE = of("RISK_SCORE")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

                            @JvmField
                            val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

                            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        enum class Known {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                        }

                        enum class Value {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MCC -> Value.MCC
                                COUNTRY -> Value.COUNTRY
                                CURRENCY -> Value.CURRENCY
                                MERCHANT_ID -> Value.MERCHANT_ID
                                DESCRIPTOR -> Value.DESCRIPTOR
                                LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                                RISK_SCORE -> Value.RISK_SCORE
                                CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MCC -> Known.MCC
                                COUNTRY -> Known.COUNTRY
                                CURRENCY -> Known.CURRENCY
                                MERCHANT_ID -> Known.MERCHANT_ID
                                DESCRIPTOR -> Known.DESCRIPTOR
                                LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                                RISK_SCORE -> Known.RISK_SCORE
                                CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val IS_ONE_OF = of("IS_ONE_OF")

                            @JvmField val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

                            @JvmField val MATCHES = of("MATCHES")

                            @JvmField val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

                            @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

                            @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

                            @JvmStatic fun of(value: String) = Operation(JsonField.of(value))
                        }

                        enum class Known {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                        }

                        enum class Value {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                IS_ONE_OF -> Value.IS_ONE_OF
                                IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                                MATCHES -> Value.MATCHES
                                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                                IS_LESS_THAN -> Value.IS_LESS_THAN
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                IS_ONE_OF -> Known.IS_ONE_OF
                                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                MATCHES -> Known.MATCHES
                                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                IS_LESS_THAN -> Known.IS_LESS_THAN
                                else ->
                                    throw LithicInvalidDataException("Unknown Operation: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val integer: Long? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): Optional<String> = Optional.ofNullable(string)
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun integer(): Optional<Long> = Optional.ofNullable(integer)
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                        fun isString(): Boolean = string != null

                        fun isInteger(): Boolean = integer != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asInteger(): Long = integer.getOrThrow("integer")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                integer != null -> visitor.visitInteger(integer)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && integer == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && string == other.string && integer == other.integer && strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, integer, strings) /* spotless:on */

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                integer != null -> "Value{integer=$integer}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            @JvmStatic fun ofString(string: String) = Value(string = string)

                            @JvmStatic fun ofInteger(integer: Long) = Value(integer = integer)

                            @JvmStatic
                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitInteger(integer: Long): T

                            fun visitStrings(strings: List<String>): T

                            fun unknown(json: JsonValue?): T {
                                throw LithicInvalidDataException("Unknown Value: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Value>(Value::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                val json = JsonValue.fromJsonNode(node)

                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    return Value(string = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    return Value(integer = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    return Value(strings = it, _json = json)
                                }

                                return Value(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<Value>(Value::class) {

                            override fun serialize(
                                value: Value,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.string != null -> generator.writeObject(value.string)
                                    value.integer != null -> generator.writeObject(value.integer)
                                    value.strings != null -> generator.writeObject(value.strings)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Value")
                                }
                            }
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Condition && attribute == other.attribute && operation == other.operation && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(attribute, operation, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionalBlockParameters && conditions == other.conditions && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(conditions, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DraftVersion && parameters == other.parameters && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DraftVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    class AuthRuleState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmStatic fun of(value: String) = AuthRuleState(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown AuthRuleState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AuthRuleType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

            @JvmField val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

            @JvmStatic fun of(value: String) = AuthRuleType(JsonField.of(value))
        }

        enum class Known {
            CONDITIONAL_BLOCK,
            VELOCITY_LIMIT,
        }

        enum class Value {
            CONDITIONAL_BLOCK,
            VELOCITY_LIMIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2DraftResponse && token == other.token && state == other.state && programLevel == other.programLevel && cardTokens == other.cardTokens && excludedCardTokens == other.excludedCardTokens && accountTokens == other.accountTokens && type == other.type && currentVersion == other.currentVersion && draftVersion == other.draftVersion && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, state, programLevel, cardTokens, excludedCardTokens, accountTokens, type, currentVersion, draftVersion, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2DraftResponse{token=$token, state=$state, programLevel=$programLevel, cardTokens=$cardTokens, excludedCardTokens=$excludedCardTokens, accountTokens=$accountTokens, type=$type, currentVersion=$currentVersion, draftVersion=$draftVersion, name=$name, additionalProperties=$additionalProperties}"
}
