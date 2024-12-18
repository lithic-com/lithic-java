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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

class AuthRuleV2DraftParams
constructor(
    private val authRuleToken: String,
    private val parameters: Parameters?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun authRuleToken(): String = authRuleToken

    fun parameters(): Optional<Parameters> = Optional.ofNullable(parameters)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): AuthRuleV2DraftBody {
        return AuthRuleV2DraftBody(parameters, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
        private val parameters: Parameters?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") fun parameters(): Parameters? = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var parameters: Parameters? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleV2DraftBody: AuthRuleV2DraftBody) = apply {
                this.parameters = authRuleV2DraftBody.parameters
                additionalProperties(authRuleV2DraftBody.additionalProperties)
            }

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

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
                AuthRuleV2DraftBody(parameters, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2DraftBody && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthRuleV2DraftBody{parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var parameters: Parameters? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleV2DraftParams: AuthRuleV2DraftParams) = apply {
            authRuleToken = authRuleV2DraftParams.authRuleToken
            parameters = authRuleV2DraftParams.parameters
            additionalHeaders = authRuleV2DraftParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2DraftParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = authRuleV2DraftParams.additionalBodyProperties.toMutableMap()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /** Parameters for the current version of the Auth Rule */
        fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

        /** Parameters for the current version of the Auth Rule */
        fun parameters(conditionalBlockParameters: Parameters.ConditionalBlockParameters) = apply {
            this.parameters = Parameters.ofConditionalBlockParameters(conditionalBlockParameters)
        }

        /** Parameters for the current version of the Auth Rule */
        fun parameters(velocityLimitParams: VelocityLimitParams) = apply {
            this.parameters = Parameters.ofVelocityLimitParams(velocityLimitParams)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AuthRuleV2DraftParams =
            AuthRuleV2DraftParams(
                checkNotNull(authRuleToken) { "`authRuleToken` is required but was not set" },
                parameters,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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
                velocityLimitParams != null -> visitor.visitVelocityLimitParams(velocityLimitParams)
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

                tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) { it.validate() }
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
                 * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a
                 *   business by the types of goods or services it provides.
                 * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO
                 *   3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands
                 *   Antilles.
                 * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of the
                 *   transaction.
                 * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                 *   (merchant).
                 * - `DESCRIPTOR`: Short description of card acceptor.
                 * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer
                 *   applies to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
                 *   `TOKEN_AUTHENTICATED`.
                 * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number
                 *   (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`,
                 *   `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`,
                 *   `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`,
                 *   `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                 * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer
                 *   fee field in the settlement/cardholder billing currency. This is the amount the
                 *   issuer should authorize against unless the issuer is paying the acquirer fee on
                 *   behalf of the cardholder.
                 * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                 *   given authorization. Scores are on a range of 0-999, with 0 representing the
                 *   lowest risk and 999 representing the highest risk. For Visa transactions, where
                 *   the raw score has a range of 0-99, Lithic will normalize the score by
                 *   multiplying the raw score by 10x.
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
                 * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a
                 *   business by the types of goods or services it provides.
                 * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO
                 *   3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands
                 *   Antilles.
                 * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of the
                 *   transaction.
                 * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                 *   (merchant).
                 * - `DESCRIPTOR`: Short description of card acceptor.
                 * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer
                 *   applies to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
                 *   `TOKEN_AUTHENTICATED`.
                 * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number
                 *   (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`,
                 *   `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`,
                 *   `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`,
                 *   `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                 * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer
                 *   fee field in the settlement/cardholder billing currency. This is the amount the
                 *   issuer should authorize against unless the issuer is paying the acquirer fee on
                 *   behalf of the cardholder.
                 * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                 *   given authorization. Scores are on a range of 0-999, with 0 representing the
                 *   lowest risk and 999 representing the highest risk. For Visa transactions, where
                 *   the raw score has a range of 0-99, Lithic will normalize the score by
                 *   multiplying the raw score by 10x.
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                    fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

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
                            else -> throw LithicInvalidDataException("Unknown Operation: $value")
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

                        @JvmStatic fun ofStrings(strings: List<String>) = Value(strings = strings)
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

        return /* spotless:off */ other is AuthRuleV2DraftParams && authRuleToken == other.authRuleToken && parameters == other.parameters && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, parameters, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AuthRuleV2DraftParams{authRuleToken=$authRuleToken, parameters=$parameters, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
