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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AuthRuleV2DraftParams
constructor(
    private val authRuleToken: String,
    private val parameters: AuthRuleParameters?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun authRuleToken(): String = authRuleToken

    fun parameters(): Optional<AuthRuleParameters> = Optional.ofNullable(parameters)

    @JvmSynthetic
    internal fun getBody(): AuthRuleV2DraftBody {
        return AuthRuleV2DraftBody(parameters, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AuthRuleV2DraftBody.Builder::class)
    @NoAutoDetect
    class AuthRuleV2DraftBody
    internal constructor(
        private val parameters: AuthRuleParameters?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") fun parameters(): AuthRuleParameters? = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var parameters: AuthRuleParameters? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleV2DraftBody: AuthRuleV2DraftBody) = apply {
                this.parameters = authRuleV2DraftBody.parameters
                additionalProperties(authRuleV2DraftBody.additionalProperties)
            }

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            fun parameters(parameters: AuthRuleParameters) = apply { this.parameters = parameters }

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

            fun build(): AuthRuleV2DraftBody =
                AuthRuleV2DraftBody(parameters, additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2DraftBody && this.parameters == other.parameters && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(parameters, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AuthRuleV2DraftBody{parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2DraftParams && this.authRuleToken == other.authRuleToken && this.parameters == other.parameters && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(authRuleToken, parameters, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AuthRuleV2DraftParams{authRuleToken=$authRuleToken, parameters=$parameters, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var parameters: AuthRuleParameters? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleV2DraftParams: AuthRuleV2DraftParams) = apply {
            this.authRuleToken = authRuleV2DraftParams.authRuleToken
            this.parameters = authRuleV2DraftParams.parameters
            additionalQueryParams(authRuleV2DraftParams.additionalQueryParams)
            additionalHeaders(authRuleV2DraftParams.additionalHeaders)
            additionalBodyProperties(authRuleV2DraftParams.additionalBodyProperties)
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /** Parameters for the current version of the Auth Rule */
        fun parameters(parameters: AuthRuleParameters) = apply { this.parameters = parameters }

        /** Parameters for the current version of the Auth Rule */
        fun parameters(conditionalBlockParameters: AuthRuleParameters.ConditionalBlockParameters) =
            apply {
                this.parameters =
                    AuthRuleParameters.ofConditionalBlockParameters(conditionalBlockParameters)
            }

        /** Parameters for the current version of the Auth Rule */
        fun parameters(velocityLimitParams: VelocityLimitParams) = apply {
            this.parameters = AuthRuleParameters.ofVelocityLimitParams(velocityLimitParams)
        }

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

        fun build(): AuthRuleV2DraftParams =
            AuthRuleV2DraftParams(
                checkNotNull(authRuleToken) { "`authRuleToken` is required but was not set" },
                parameters,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = AuthRuleParameters.Deserializer::class)
    @JsonSerialize(using = AuthRuleParameters.Serializer::class)
    class AuthRuleParameters
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
                velocityLimitParams != null -> visitor.visitVelocityLimitParams(velocityLimitParams)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): AuthRuleParameters = apply {
            if (!validated) {
                if (conditionalBlockParameters == null && velocityLimitParams == null) {
                    throw LithicInvalidDataException("Unknown AuthRuleParameters: $_json")
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

            return /* spotless:off */ other is AuthRuleParameters && this.conditionalBlockParameters == other.conditionalBlockParameters && this.velocityLimitParams == other.velocityLimitParams /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                conditionalBlockParameters != null ->
                    "AuthRuleParameters{conditionalBlockParameters=$conditionalBlockParameters}"
                velocityLimitParams != null ->
                    "AuthRuleParameters{velocityLimitParams=$velocityLimitParams}"
                _json != null -> "AuthRuleParameters{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AuthRuleParameters")
            }
        }

        companion object {

            @JvmStatic
            fun ofConditionalBlockParameters(
                conditionalBlockParameters: ConditionalBlockParameters
            ) = AuthRuleParameters(conditionalBlockParameters = conditionalBlockParameters)

            @JvmStatic
            fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                AuthRuleParameters(velocityLimitParams = velocityLimitParams)
        }

        interface Visitor<out T> {

            fun visitConditionalBlockParameters(
                conditionalBlockParameters: ConditionalBlockParameters
            ): T

            fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown AuthRuleParameters: $json")
            }
        }

        class Deserializer : BaseDeserializer<AuthRuleParameters>(AuthRuleParameters::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AuthRuleParameters {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) { it.validate() }
                    ?.let {
                        return AuthRuleParameters(conditionalBlockParameters = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                    ?.let {
                        return AuthRuleParameters(velocityLimitParams = it, _json = json)
                    }

                return AuthRuleParameters(_json = json)
            }
        }

        class Serializer : BaseSerializer<AuthRuleParameters>(AuthRuleParameters::class) {

            override fun serialize(
                value: AuthRuleParameters,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.conditionalBlockParameters != null ->
                        generator.writeObject(value.conditionalBlockParameters)
                    value.velocityLimitParams != null ->
                        generator.writeObject(value.velocityLimitParams)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AuthRuleParameters")
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
                internal fun from(conditionalBlockParameters: ConditionalBlockParameters) = apply {
                    this.conditions = conditionalBlockParameters.conditions
                    additionalProperties(conditionalBlockParameters.additionalProperties)
                }

                fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

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
                        conditions.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable()
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

                /** The attribute to target */
                fun attribute(): Optional<Attribute> =
                    Optional.ofNullable(attribute.getNullable("attribute"))

                /** The operation to apply to the attribute */
                fun operation(): Optional<Operation> =
                    Optional.ofNullable(operation.getNullable("operation"))

                fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

                /** The attribute to target */
                @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                /** The operation to apply to the attribute */
                @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(condition: Condition) = apply {
                        this.attribute = condition.attribute
                        this.operation = condition.operation
                        this.value = condition.value
                        additionalProperties(condition.additionalProperties)
                    }

                    /** The attribute to target */
                    fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                    /** The attribute to target */
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

                    fun value(value: Value) = value(JsonField.of(value))

                    @JsonProperty("value")
                    @ExcludeMissing
                    fun value(value: JsonField<Value>) = apply { this.value = value }

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

                    fun build(): Condition =
                        Condition(
                            attribute,
                            operation,
                            value,
                            additionalProperties.toUnmodifiable(),
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

                        @JvmField val LIABILITY_SHIFT = Attribute(JsonField.of("LIABILITY_SHIFT"))

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
                            else -> throw LithicInvalidDataException("Unknown Attribute: $value")
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

                        @JvmField val IS_GREATER_THAN = Operation(JsonField.of("IS_GREATER_THAN"))

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
                            else -> throw LithicInvalidDataException("Unknown Operation: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(using = Value.Deserializer::class)
                @JsonSerialize(using = Value.Serializer::class)
                class Value
                private constructor(
                    private val string: String? = null,
                    private val double_: Double? = null,
                    private val strings: List<String>? = null,
                    private val _json: JsonValue? = null,
                ) {

                    private var validated: Boolean = false

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    fun string(): Optional<String> = Optional.ofNullable(string)
                    /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                    fun double_(): Optional<Double> = Optional.ofNullable(double_)
                    /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                    fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                    fun isString(): Boolean = string != null

                    fun isDouble(): Boolean = double_ != null

                    fun isStrings(): Boolean = strings != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asDouble(): Double = double_.getOrThrow("double_")

                    fun asStrings(): List<String> = strings.getOrThrow("strings")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            string != null -> visitor.visitString(string)
                            double_ != null -> visitor.visitDouble(double_)
                            strings != null -> visitor.visitStrings(strings)
                            else -> visitor.unknown(_json)
                        }
                    }

                    fun validate(): Value = apply {
                        if (!validated) {
                            if (string == null && double_ == null && strings == null) {
                                throw LithicInvalidDataException("Unknown Value: $_json")
                            }
                            validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Value && this.string == other.string && this.double_ == other.double_ && this.strings == other.strings /* spotless:on */
                    }

                    override fun hashCode(): Int {
                        return /* spotless:off */ Objects.hash(string, double_, strings) /* spotless:on */
                    }

                    override fun toString(): String {
                        return when {
                            string != null -> "Value{string=$string}"
                            double_ != null -> "Value{double_=$double_}"
                            strings != null -> "Value{strings=$strings}"
                            _json != null -> "Value{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }

                    companion object {

                        @JvmStatic fun ofString(string: String) = Value(string = string)

                        @JvmStatic fun ofDouble(double_: Double) = Value(double_ = double_)

                        @JvmStatic fun ofStrings(strings: List<String>) = Value(strings = strings)
                    }

                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitDouble(double_: Double): T

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
                                return Value(double_ = it, _json = json)
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
                                value.double_ != null -> generator.writeObject(value.double_)
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
}
