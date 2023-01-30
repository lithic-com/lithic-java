package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class FundingSourceCreateParams
constructor(
    private val bank: Bank?,
    private val plaid: Plaid?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun bank(): Optional<Bank> = Optional.ofNullable(bank)

    fun plaid(): Optional<Plaid> = Optional.ofNullable(plaid)

    @JvmSynthetic
    internal fun toBody(): FundingSourceCreateBody =
        FundingSourceCreateBody(bank, plaid, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    @JsonSerialize(using = FundingSourceCreateBody.Serializer::class)
    class FundingSourceCreateBody
    internal constructor(
        private val bank: Bank?,
        private val plaid: Plaid?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        class Serializer : BaseSerializer<FundingSourceCreateBody>(FundingSourceCreateBody::class) {

            override fun serialize(
                value: FundingSourceCreateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                generator.writeStartObject()
                when {
                    value.bank != null -> {
                        generator.writeObjectField(
                            "validation_method",
                            value.bank.validationMethod()
                        )
                        generator.writeObjectField("account_name", value.bank.accountName())
                        generator.writeObjectField("account_number", value.bank.accountNumber())
                        generator.writeObjectField("account_token", value.bank.accountToken())
                        generator.writeObjectField("routing_number", value.bank.routingNumber())
                    }
                    value.plaid != null -> {
                        generator.writeObjectField(
                            "validation_method",
                            value.plaid.validationMethod()
                        )
                        generator.writeObjectField("account_token", value.plaid.accountToken())
                        generator.writeObjectField("processor_token", value.plaid.processorToken())
                    }
                    else -> throw IllegalStateException("Invalid FundingSourceCreateBody")
                }
                for (entry in value.additionalProperties.entries) {
                    generator.writeObjectField(entry.key, entry.value)
                }
                generator.writeEndObject()
            }
        }

        fun bank(): Bank? = bank

        fun plaid(): Plaid? = plaid

        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FundingSourceCreateBody &&
                bank == other.bank &&
                plaid == other.plaid &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        bank,
                        plaid,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FundingSourceCreateBody{bank=$bank, plaid=$plaid, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var bank: Bank? = null
            private var plaid: Plaid? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingSourceCreateBody: FundingSourceCreateBody) = apply {
                this.bank = fundingSourceCreateBody.bank
                this.plaid = fundingSourceCreateBody.plaid
                additionalProperties(fundingSourceCreateBody.additionalProperties)
            }

            fun bank(bank: Bank) = apply { this.bank = bank }

            fun plaid(plaid: Plaid) = apply { this.plaid = plaid }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FundingSourceCreateBody =
                FundingSourceCreateBody(
                    bank,
                    plaid,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FundingSourceCreateParams &&
            bank == other.bank &&
            plaid == other.plaid &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            bank,
            plaid,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FundingSourceCreateParams{bank=$bank, plaid=$plaid, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bank: Bank? = null
        private var plaid: Plaid? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fundingSourceCreateParams: FundingSourceCreateParams) = apply {
            this.bank = fundingSourceCreateParams.bank
            this.plaid = fundingSourceCreateParams.plaid
            additionalQueryParams(fundingSourceCreateParams.additionalQueryParams)
            additionalHeaders(fundingSourceCreateParams.additionalHeaders)
            additionalBodyProperties(fundingSourceCreateParams.additionalBodyProperties)
        }

        fun isBank(): Boolean = bank != null
        fun isPlaid(): Boolean = plaid != null

        fun asBank(): Bank? = bank.getOrThrow("bank")
        fun asPlaid(): Plaid? = plaid.getOrThrow("plaid")

        fun forBank(bank: Bank) = apply {
            if (isPlaid()) {
                throw IllegalArgumentException(
                    "Params already set to another variant. FundingSourceCreateBody: ${this}"
                )
            }
            this.bank = bank
        }
        fun forPlaid(plaid: Plaid) = apply {
            if (isBank()) {
                throw IllegalArgumentException(
                    "Params already set to another variant. FundingSourceCreateBody: ${this}"
                )
            }
            this.plaid = plaid
        }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): FundingSourceCreateParams =
            FundingSourceCreateParams(
                bank,
                plaid,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @NoAutoDetect
    class Bank
    private constructor(
        private val validationMethod: ValidationMethod?,
        private val accountName: String?,
        private val accountNumber: String?,
        private val accountToken: String?,
        private val routingNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("validation_method")
        fun validationMethod(): ValidationMethod? = validationMethod

        /**
         * The name associated with the bank account. This property is only for identification
         * purposes, and has no bearing on the external properties of the bank.
         */
        @JsonProperty("account_name") fun accountName(): String? = accountName

        /** The account number of the bank account. */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        /**
         * Only required for multi-account users. Token identifying the account that the bank
         * account will be associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        /** The routing number of the bank account. */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Bank &&
                validationMethod == other.validationMethod &&
                accountName == other.accountName &&
                accountNumber == other.accountNumber &&
                accountToken == other.accountToken &&
                routingNumber == other.routingNumber &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        validationMethod,
                        accountName,
                        accountNumber,
                        accountToken,
                        routingNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Bank{validationMethod=$validationMethod, accountName=$accountName, accountNumber=$accountNumber, accountToken=$accountToken, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var validationMethod: ValidationMethod? = null
            private var accountName: String? = null
            private var accountNumber: String? = null
            private var accountToken: String? = null
            private var routingNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bank: Bank) = apply {
                this.validationMethod = bank.validationMethod
                this.accountName = bank.accountName
                this.accountNumber = bank.accountNumber
                this.accountToken = bank.accountToken
                this.routingNumber = bank.routingNumber
                additionalProperties(bank.additionalProperties)
            }

            @JsonProperty("validation_method")
            fun validationMethod(validationMethod: ValidationMethod) = apply {
                this.validationMethod = validationMethod
            }

            /**
             * The name associated with the bank account. This property is only for identification
             * purposes, and has no bearing on the external properties of the bank.
             */
            @JsonProperty("account_name")
            fun accountName(accountName: String) = apply { this.accountName = accountName }

            /** The account number of the bank account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * Only required for multi-account users. Token identifying the account that the bank
             * account will be associated with. Only applicable if using account holder enrollment.
             * See [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for
             * more information.
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** The routing number of the bank account. */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

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

            fun build(): Bank =
                Bank(
                    checkNotNull(validationMethod) {
                        "Property `validationMethod` is required but was not set"
                    },
                    accountName,
                    checkNotNull(accountNumber) {
                        "Property `accountNumber` is required but was not set"
                    },
                    accountToken,
                    checkNotNull(routingNumber) {
                        "Property `routingNumber` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ValidationMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ValidationMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val BANK = ValidationMethod(JsonField.of("BANK"))

                @JvmStatic fun of(value: String) = ValidationMethod(JsonField.of(value))
            }

            enum class Known {
                BANK,
            }

            enum class Value {
                BANK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BANK -> Value.BANK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BANK -> Known.BANK
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown FundingSourceCreateBody.Bank.ValidationMethod: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @NoAutoDetect
    class Plaid
    private constructor(
        private val validationMethod: ValidationMethod?,
        private val accountToken: String?,
        private val processorToken: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("validation_method")
        fun validationMethod(): ValidationMethod? = validationMethod

        /**
         * Only required for multi-account users. Token identifying the account associated with the
         * bank account. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        /** The processor token associated with the bank account. */
        @JsonProperty("processor_token") fun processorToken(): String? = processorToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Plaid &&
                validationMethod == other.validationMethod &&
                accountToken == other.accountToken &&
                processorToken == other.processorToken &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        validationMethod,
                        accountToken,
                        processorToken,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Plaid{validationMethod=$validationMethod, accountToken=$accountToken, processorToken=$processorToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var validationMethod: ValidationMethod? = null
            private var accountToken: String? = null
            private var processorToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plaid: Plaid) = apply {
                this.validationMethod = plaid.validationMethod
                this.accountToken = plaid.accountToken
                this.processorToken = plaid.processorToken
                additionalProperties(plaid.additionalProperties)
            }

            @JsonProperty("validation_method")
            fun validationMethod(validationMethod: ValidationMethod) = apply {
                this.validationMethod = validationMethod
            }

            /**
             * Only required for multi-account users. Token identifying the account associated with
             * the bank account. Only applicable if using account holder enrollment. See
             * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
             * information.
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** The processor token associated with the bank account. */
            @JsonProperty("processor_token")
            fun processorToken(processorToken: String) = apply {
                this.processorToken = processorToken
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

            fun build(): Plaid =
                Plaid(
                    checkNotNull(validationMethod) {
                        "Property `validationMethod` is required but was not set"
                    },
                    accountToken,
                    checkNotNull(processorToken) {
                        "Property `processorToken` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ValidationMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ValidationMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PLAID = ValidationMethod(JsonField.of("PLAID"))

                @JvmStatic fun of(value: String) = ValidationMethod(JsonField.of(value))
            }

            enum class Known {
                PLAID,
            }

            enum class Value {
                PLAID,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PLAID -> Value.PLAID
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PLAID -> Known.PLAID
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown FundingSourceCreateBody.Plaid.ValidationMethod: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
