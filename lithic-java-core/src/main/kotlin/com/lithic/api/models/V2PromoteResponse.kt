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

@JsonDeserialize(builder = V2PromoteResponse.Builder::class)
@NoAutoDetect
class V2PromoteResponse
private constructor(
    private val token: JsonField<String>,
    private val state: JsonField<AuthRuleState>,
    private val programLevel: JsonField<Boolean>,
    private val cardTokens: JsonField<List<String>>,
    private val accountTokens: JsonField<List<String>>,
    private val type: JsonField<AuthRuleType>,
    private val currentVersion: JsonField<CurrentVersion>,
    private val draftVersion: JsonField<DraftVersion>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun token(): String = token.getRequired("token")

    /** The state of the Auth Rule */
    fun state(): AuthRuleState = state.getRequired("state")

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    fun programLevel(): Boolean = programLevel.getRequired("program_level")

    /** Card tokens to which the Auth Rule applies. */
    fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

    /** Account tokens to which the Auth Rule applies. */
    fun accountTokens(): List<String> = accountTokens.getRequired("account_tokens")

    /** The type of Auth Rule */
    fun type(): AuthRuleType = type.getRequired("type")

    fun currentVersion(): Optional<CurrentVersion> =
        Optional.ofNullable(currentVersion.getNullable("current_version"))

    fun draftVersion(): Optional<DraftVersion> =
        Optional.ofNullable(draftVersion.getNullable("draft_version"))

    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The state of the Auth Rule */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    @JsonProperty("program_level") @ExcludeMissing fun _programLevel() = programLevel

    /** Card tokens to which the Auth Rule applies. */
    @JsonProperty("card_tokens") @ExcludeMissing fun _cardTokens() = cardTokens

    /** Account tokens to which the Auth Rule applies. */
    @JsonProperty("account_tokens") @ExcludeMissing fun _accountTokens() = accountTokens

    /** The type of Auth Rule */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("current_version") @ExcludeMissing fun _currentVersion() = currentVersion

    @JsonProperty("draft_version") @ExcludeMissing fun _draftVersion() = draftVersion

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): V2PromoteResponse = apply {
        if (!validated) {
            token()
            state()
            programLevel()
            cardTokens()
            accountTokens()
            type()
            currentVersion().map { it.validate() }
            draftVersion().map { it.validate() }
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
        private var accountTokens: JsonField<List<String>> = JsonMissing.of()
        private var type: JsonField<AuthRuleType> = JsonMissing.of()
        private var currentVersion: JsonField<CurrentVersion> = JsonMissing.of()
        private var draftVersion: JsonField<DraftVersion> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2PromoteResponse: V2PromoteResponse) = apply {
            this.token = v2PromoteResponse.token
            this.state = v2PromoteResponse.state
            this.programLevel = v2PromoteResponse.programLevel
            this.cardTokens = v2PromoteResponse.cardTokens
            this.accountTokens = v2PromoteResponse.accountTokens
            this.type = v2PromoteResponse.type
            this.currentVersion = v2PromoteResponse.currentVersion
            this.draftVersion = v2PromoteResponse.draftVersion
            additionalProperties(v2PromoteResponse.additionalProperties)
        }

        fun token(token: String) = token(JsonField.of(token))

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

        fun build(): V2PromoteResponse =
            V2PromoteResponse(
                token,
                state,
                programLevel,
                cardTokens.map { it.toImmutable() },
                accountTokens.map { it.toImmutable() },
                type,
                currentVersion,
                draftVersion,
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

        private var validated: Boolean = false

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
                this.parameters = currentVersion.parameters
                this.version = currentVersion.version
                additionalProperties(currentVersion.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

                return /* spotless:off */ other is Parameters && this.conditionalBlockParameters == other.conditionalBlockParameters && this.velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */
            }

            override fun toString(): String {
                return when {
                    conditionalBlockParameters != null ->
                        "Parameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }
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

                private var validated: Boolean = false

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                            this.conditions = conditionalBlockParameters.conditions
                            additionalProperties(conditionalBlockParameters.additionalProperties)
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
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
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

                    private var validated: Boolean = false

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
                     */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                            this.attribute = condition.attribute
                            this.operation = condition.operation
                            this.value = condition.value
                            additionalProperties(condition.additionalProperties)
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
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val MCC = Attribute(JsonField.of("MCC"))

                            @JvmField val COUNTRY = Attribute(JsonField.of("COUNTRY"))

                            @JvmField val CURRENCY = Attribute(JsonField.of("CURRENCY"))

                            @JvmField val MERCHANT_ID = Attribute(JsonField.of("MERCHANT_ID"))

                            @JvmField val DESCRIPTOR = Attribute(JsonField.of("DESCRIPTOR"))

                            @JvmField
                            val LIABILITY_SHIFT = Attribute(JsonField.of("LIABILITY_SHIFT"))

                            @JvmField val PAN_ENTRY_MODE = Attribute(JsonField.of("PAN_ENTRY_MODE"))

                            @JvmField
                            val TRANSACTION_AMOUNT = Attribute(JsonField.of("TRANSACTION_AMOUNT"))

                            @JvmField val RISK_SCORE = Attribute(JsonField.of("RISK_SCORE"))

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
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val IS_ONE_OF = Operation(JsonField.of("IS_ONE_OF"))

                            @JvmField val IS_NOT_ONE_OF = Operation(JsonField.of("IS_NOT_ONE_OF"))

                            @JvmField val MATCHES = Operation(JsonField.of("MATCHES"))

                            @JvmField val DOES_NOT_MATCH = Operation(JsonField.of("DOES_NOT_MATCH"))

                            @JvmField
                            val IS_GREATER_THAN = Operation(JsonField.of("IS_GREATER_THAN"))

                            @JvmField val IS_LESS_THAN = Operation(JsonField.of("IS_LESS_THAN"))

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
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val number: Double? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): Optional<String> = Optional.ofNullable(string)
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun number(): Optional<Double> = Optional.ofNullable(number)
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                        fun isString(): Boolean = string != null

                        fun isNumber(): Boolean = number != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asNumber(): Double = number.getOrThrow("number")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                number != null -> visitor.visitNumber(number)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && number == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && this.string == other.string && this.number == other.number && this.strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int {
                            return /* spotless:off */ Objects.hash(string, number, strings) /* spotless:on */
                        }

                        override fun toString(): String {
                            return when {
                                string != null -> "Value{string=$string}"
                                number != null -> "Value{number=$number}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }
                        }

                        companion object {

                            @JvmStatic fun ofString(string: String) = Value(string = string)

                            @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                            @JvmStatic
                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitNumber(number: Double): T

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
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    return Value(number = it, _json = json)
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
                                    value.number != null -> generator.writeObject(value.number)
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

                        return /* spotless:off */ other is Condition && this.attribute == other.attribute && this.operation == other.operation && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(attribute, operation, value, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionalBlockParameters && this.conditions == other.conditions && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(conditions, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentVersion && this.parameters == other.parameters && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(parameters, version, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

        private var validated: Boolean = false

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
                this.parameters = draftVersion.parameters
                this.version = draftVersion.version
                additionalProperties(draftVersion.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

                return /* spotless:off */ other is Parameters && this.conditionalBlockParameters == other.conditionalBlockParameters && this.velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */
            }

            override fun toString(): String {
                return when {
                    conditionalBlockParameters != null ->
                        "Parameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }
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

                private var validated: Boolean = false

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                            this.conditions = conditionalBlockParameters.conditions
                            additionalProperties(conditionalBlockParameters.additionalProperties)
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
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
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

                    private var validated: Boolean = false

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
                     */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                            this.attribute = condition.attribute
                            this.operation = condition.operation
                            this.value = condition.value
                            additionalProperties(condition.additionalProperties)
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
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val MCC = Attribute(JsonField.of("MCC"))

                            @JvmField val COUNTRY = Attribute(JsonField.of("COUNTRY"))

                            @JvmField val CURRENCY = Attribute(JsonField.of("CURRENCY"))

                            @JvmField val MERCHANT_ID = Attribute(JsonField.of("MERCHANT_ID"))

                            @JvmField val DESCRIPTOR = Attribute(JsonField.of("DESCRIPTOR"))

                            @JvmField
                            val LIABILITY_SHIFT = Attribute(JsonField.of("LIABILITY_SHIFT"))

                            @JvmField val PAN_ENTRY_MODE = Attribute(JsonField.of("PAN_ENTRY_MODE"))

                            @JvmField
                            val TRANSACTION_AMOUNT = Attribute(JsonField.of("TRANSACTION_AMOUNT"))

                            @JvmField val RISK_SCORE = Attribute(JsonField.of("RISK_SCORE"))

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
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val IS_ONE_OF = Operation(JsonField.of("IS_ONE_OF"))

                            @JvmField val IS_NOT_ONE_OF = Operation(JsonField.of("IS_NOT_ONE_OF"))

                            @JvmField val MATCHES = Operation(JsonField.of("MATCHES"))

                            @JvmField val DOES_NOT_MATCH = Operation(JsonField.of("DOES_NOT_MATCH"))

                            @JvmField
                            val IS_GREATER_THAN = Operation(JsonField.of("IS_GREATER_THAN"))

                            @JvmField val IS_LESS_THAN = Operation(JsonField.of("IS_LESS_THAN"))

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
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val number: Double? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): Optional<String> = Optional.ofNullable(string)
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun number(): Optional<Double> = Optional.ofNullable(number)
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                        fun isString(): Boolean = string != null

                        fun isNumber(): Boolean = number != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asNumber(): Double = number.getOrThrow("number")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                number != null -> visitor.visitNumber(number)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && number == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && this.string == other.string && this.number == other.number && this.strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int {
                            return /* spotless:off */ Objects.hash(string, number, strings) /* spotless:on */
                        }

                        override fun toString(): String {
                            return when {
                                string != null -> "Value{string=$string}"
                                number != null -> "Value{number=$number}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }
                        }

                        companion object {

                            @JvmStatic fun ofString(string: String) = Value(string = string)

                            @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                            @JvmStatic
                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitNumber(number: Double): T

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
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    return Value(number = it, _json = json)
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
                                    value.number != null -> generator.writeObject(value.number)
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

                        return /* spotless:off */ other is Condition && this.attribute == other.attribute && this.operation == other.operation && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(attribute, operation, value, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionalBlockParameters && this.conditions == other.conditions && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(conditions, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DraftVersion && this.parameters == other.parameters && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(parameters, version, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DraftVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    class AuthRuleState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleState && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = AuthRuleState(JsonField.of("ACTIVE"))

            @JvmField val INACTIVE = AuthRuleState(JsonField.of("INACTIVE"))

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
    }

    class AuthRuleType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CONDITIONAL_BLOCK = AuthRuleType(JsonField.of("CONDITIONAL_BLOCK"))

            @JvmField val VELOCITY_LIMIT = AuthRuleType(JsonField.of("VELOCITY_LIMIT"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2PromoteResponse && this.token == other.token && this.state == other.state && this.programLevel == other.programLevel && this.cardTokens == other.cardTokens && this.accountTokens == other.accountTokens && this.type == other.type && this.currentVersion == other.currentVersion && this.draftVersion == other.draftVersion && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, state, programLevel, cardTokens, accountTokens, type, currentVersion, draftVersion, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "V2PromoteResponse{token=$token, state=$state, programLevel=$programLevel, cardTokens=$cardTokens, accountTokens=$accountTokens, type=$type, currentVersion=$currentVersion, draftVersion=$draftVersion, additionalProperties=$additionalProperties}"
}
