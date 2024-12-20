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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalBankAccountCreateParams
constructor(
    private val bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest?,
    private val plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest?,
    private val externallyVerifiedCreateBankAccountApiRequest:
        ExternallyVerifiedCreateBankAccountApiRequest?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun bankVerifiedCreateBankAccountApiRequest():
        Optional<BankVerifiedCreateBankAccountApiRequest> =
        Optional.ofNullable(bankVerifiedCreateBankAccountApiRequest)

    fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
        Optional.ofNullable(plaidCreateBankAccountApiRequest)

    fun externallyVerifiedCreateBankAccountApiRequest():
        Optional<ExternallyVerifiedCreateBankAccountApiRequest> =
        Optional.ofNullable(externallyVerifiedCreateBankAccountApiRequest)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun getBody(): ExternalBankAccountCreateBody {
        return ExternalBankAccountCreateBody(
            bankVerifiedCreateBankAccountApiRequest,
            plaidCreateBankAccountApiRequest,
            externallyVerifiedCreateBankAccountApiRequest,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = ExternalBankAccountCreateBody.Deserializer::class)
    @JsonSerialize(using = ExternalBankAccountCreateBody.Serializer::class)
    class ExternalBankAccountCreateBody
    internal constructor(
        private val bankVerifiedCreateBankAccountApiRequest:
            BankVerifiedCreateBankAccountApiRequest? =
            null,
        private val plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest? = null,
        private val externallyVerifiedCreateBankAccountApiRequest:
            ExternallyVerifiedCreateBankAccountApiRequest? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun bankVerifiedCreateBankAccountApiRequest():
            Optional<BankVerifiedCreateBankAccountApiRequest> =
            Optional.ofNullable(bankVerifiedCreateBankAccountApiRequest)

        fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
            Optional.ofNullable(plaidCreateBankAccountApiRequest)

        fun externallyVerifiedCreateBankAccountApiRequest():
            Optional<ExternallyVerifiedCreateBankAccountApiRequest> =
            Optional.ofNullable(externallyVerifiedCreateBankAccountApiRequest)

        fun isBankVerifiedCreateBankAccountApiRequest(): Boolean =
            bankVerifiedCreateBankAccountApiRequest != null

        fun isPlaidCreateBankAccountApiRequest(): Boolean = plaidCreateBankAccountApiRequest != null

        fun isExternallyVerifiedCreateBankAccountApiRequest(): Boolean =
            externallyVerifiedCreateBankAccountApiRequest != null

        fun asBankVerifiedCreateBankAccountApiRequest(): BankVerifiedCreateBankAccountApiRequest =
            bankVerifiedCreateBankAccountApiRequest.getOrThrow(
                "bankVerifiedCreateBankAccountApiRequest"
            )

        fun asPlaidCreateBankAccountApiRequest(): PlaidCreateBankAccountApiRequest =
            plaidCreateBankAccountApiRequest.getOrThrow("plaidCreateBankAccountApiRequest")

        fun asExternallyVerifiedCreateBankAccountApiRequest():
            ExternallyVerifiedCreateBankAccountApiRequest =
            externallyVerifiedCreateBankAccountApiRequest.getOrThrow(
                "externallyVerifiedCreateBankAccountApiRequest"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                bankVerifiedCreateBankAccountApiRequest != null ->
                    visitor.visitBankVerifiedCreateBankAccountApiRequest(
                        bankVerifiedCreateBankAccountApiRequest
                    )
                plaidCreateBankAccountApiRequest != null ->
                    visitor.visitPlaidCreateBankAccountApiRequest(plaidCreateBankAccountApiRequest)
                externallyVerifiedCreateBankAccountApiRequest != null ->
                    visitor.visitExternallyVerifiedCreateBankAccountApiRequest(
                        externallyVerifiedCreateBankAccountApiRequest
                    )
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalBankAccountCreateBody && bankVerifiedCreateBankAccountApiRequest == other.bankVerifiedCreateBankAccountApiRequest && plaidCreateBankAccountApiRequest == other.plaidCreateBankAccountApiRequest && externallyVerifiedCreateBankAccountApiRequest == other.externallyVerifiedCreateBankAccountApiRequest /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(bankVerifiedCreateBankAccountApiRequest, plaidCreateBankAccountApiRequest, externallyVerifiedCreateBankAccountApiRequest) /* spotless:on */

        override fun toString(): String =
            when {
                bankVerifiedCreateBankAccountApiRequest != null ->
                    "ExternalBankAccountCreateBody{bankVerifiedCreateBankAccountApiRequest=$bankVerifiedCreateBankAccountApiRequest}"
                plaidCreateBankAccountApiRequest != null ->
                    "ExternalBankAccountCreateBody{plaidCreateBankAccountApiRequest=$plaidCreateBankAccountApiRequest}"
                externallyVerifiedCreateBankAccountApiRequest != null ->
                    "ExternalBankAccountCreateBody{externallyVerifiedCreateBankAccountApiRequest=$externallyVerifiedCreateBankAccountApiRequest}"
                _json != null -> "ExternalBankAccountCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ExternalBankAccountCreateBody")
            }

        companion object {

            @JvmStatic
            fun ofBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ) =
                ExternalBankAccountCreateBody(
                    bankVerifiedCreateBankAccountApiRequest =
                        bankVerifiedCreateBankAccountApiRequest
                )

            @JvmStatic
            fun ofPlaidCreateBankAccountApiRequest(
                plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
            ) =
                ExternalBankAccountCreateBody(
                    plaidCreateBankAccountApiRequest = plaidCreateBankAccountApiRequest
                )

            @JvmStatic
            fun ofExternallyVerifiedCreateBankAccountApiRequest(
                externallyVerifiedCreateBankAccountApiRequest:
                    ExternallyVerifiedCreateBankAccountApiRequest
            ) =
                ExternalBankAccountCreateBody(
                    externallyVerifiedCreateBankAccountApiRequest =
                        externallyVerifiedCreateBankAccountApiRequest
                )
        }

        interface Visitor<out T> {

            fun visitBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ): T

            fun visitPlaidCreateBankAccountApiRequest(
                plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
            ): T

            fun visitExternallyVerifiedCreateBankAccountApiRequest(
                externallyVerifiedCreateBankAccountApiRequest:
                    ExternallyVerifiedCreateBankAccountApiRequest
            ): T

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown ExternalBankAccountCreateBody: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<ExternalBankAccountCreateBody>(ExternalBankAccountCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ExternalBankAccountCreateBody {
                val json = JsonValue.fromJsonNode(node)
                val verificationMethod =
                    json.asObject().getOrNull()?.get("verification_method")?.asString()?.getOrNull()

                if (verificationMethod == "EXTERNALLY_VERIFIED") {
                    tryDeserialize(
                            node,
                            jacksonTypeRef<ExternallyVerifiedCreateBankAccountApiRequest>()
                        )
                        ?.let {
                            return ExternalBankAccountCreateBody(
                                externallyVerifiedCreateBankAccountApiRequest = it,
                                _json = json
                            )
                        }
                }

                tryDeserialize(node, jacksonTypeRef<BankVerifiedCreateBankAccountApiRequest>())
                    ?.let {
                        return ExternalBankAccountCreateBody(
                            bankVerifiedCreateBankAccountApiRequest = it,
                            _json = json
                        )
                    }
                tryDeserialize(node, jacksonTypeRef<PlaidCreateBankAccountApiRequest>())?.let {
                    return ExternalBankAccountCreateBody(
                        plaidCreateBankAccountApiRequest = it,
                        _json = json
                    )
                }

                return ExternalBankAccountCreateBody(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<ExternalBankAccountCreateBody>(ExternalBankAccountCreateBody::class) {

            override fun serialize(
                value: ExternalBankAccountCreateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.bankVerifiedCreateBankAccountApiRequest != null ->
                        generator.writeObject(value.bankVerifiedCreateBankAccountApiRequest)
                    value.plaidCreateBankAccountApiRequest != null ->
                        generator.writeObject(value.plaidCreateBankAccountApiRequest)
                    value.externallyVerifiedCreateBankAccountApiRequest != null ->
                        generator.writeObject(value.externallyVerifiedCreateBankAccountApiRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ExternalBankAccountCreateBody")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bankVerifiedCreateBankAccountApiRequest:
            BankVerifiedCreateBankAccountApiRequest? =
            null
        private var plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest? = null
        private var externallyVerifiedCreateBankAccountApiRequest:
            ExternallyVerifiedCreateBankAccountApiRequest? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalBankAccountCreateParams: ExternalBankAccountCreateParams) =
            apply {
                bankVerifiedCreateBankAccountApiRequest =
                    externalBankAccountCreateParams.bankVerifiedCreateBankAccountApiRequest
                plaidCreateBankAccountApiRequest =
                    externalBankAccountCreateParams.plaidCreateBankAccountApiRequest
                externallyVerifiedCreateBankAccountApiRequest =
                    externalBankAccountCreateParams.externallyVerifiedCreateBankAccountApiRequest
                additionalHeaders = externalBankAccountCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    externalBankAccountCreateParams.additionalQueryParams.toBuilder()
            }

        fun forBankVerifiedCreateBankAccountApiRequest(
            bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
        ) = apply {
            this.bankVerifiedCreateBankAccountApiRequest = bankVerifiedCreateBankAccountApiRequest
            this.plaidCreateBankAccountApiRequest = null
            this.externallyVerifiedCreateBankAccountApiRequest = null
        }

        fun forPlaidCreateBankAccountApiRequest(
            plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
        ) = apply {
            this.bankVerifiedCreateBankAccountApiRequest = null
            this.plaidCreateBankAccountApiRequest = plaidCreateBankAccountApiRequest
            this.externallyVerifiedCreateBankAccountApiRequest = null
        }

        fun forExternallyVerifiedCreateBankAccountApiRequest(
            externallyVerifiedCreateBankAccountApiRequest:
                ExternallyVerifiedCreateBankAccountApiRequest
        ) = apply {
            this.bankVerifiedCreateBankAccountApiRequest = null
            this.plaidCreateBankAccountApiRequest = null
            this.externallyVerifiedCreateBankAccountApiRequest =
                externallyVerifiedCreateBankAccountApiRequest
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

        fun build(): ExternalBankAccountCreateParams =
            ExternalBankAccountCreateParams(
                bankVerifiedCreateBankAccountApiRequest,
                plaidCreateBankAccountApiRequest,
                externallyVerifiedCreateBankAccountApiRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(builder = BankVerifiedCreateBankAccountApiRequest.Builder::class)
    @NoAutoDetect
    class BankVerifiedCreateBankAccountApiRequest
    private constructor(
        private val verificationMethod: VerificationMethod,
        private val ownerType: OwnerType,
        private val owner: String,
        private val accountToken: String?,
        private val companyId: String?,
        private val doingBusinessAs: String?,
        private val dob: LocalDate?,
        private val userDefinedId: String?,
        private val type: AccountType,
        private val routingNumber: String,
        private val accountNumber: String,
        private val name: String?,
        private val country: String,
        private val currency: String,
        private val verificationEnforcement: Boolean?,
        private val address: ExternalBankAccountAddress?,
        private val financialAccountToken: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Verification Method */
        @JsonProperty("verification_method")
        fun verificationMethod(): VerificationMethod = verificationMethod

        /** Owner Type */
        @JsonProperty("owner_type") fun ownerType(): OwnerType = ownerType

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") fun owner(): String = owner

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id")
        fun companyId(): Optional<String> = Optional.ofNullable(companyId)

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        fun doingBusinessAs(): Optional<String> = Optional.ofNullable(doingBusinessAs)

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): Optional<LocalDate> = Optional.ofNullable(dob)

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

        /** Account Type */
        @JsonProperty("type") fun type(): AccountType = type

        /** Routing Number */
        @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

        /** Account Number */
        @JsonProperty("account_number") fun accountNumber(): String = accountNumber

        /** The nickname for this External Bank Account */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        @JsonProperty("country") fun country(): String = country

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonProperty("verification_enforcement")
        fun verificationEnforcement(): Optional<Boolean> =
            Optional.ofNullable(verificationEnforcement)

        /** Address */
        @JsonProperty("address")
        fun address(): Optional<ExternalBankAccountAddress> = Optional.ofNullable(address)

        /** The financial account token of the operating account to fund the micro deposits */
        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String = financialAccountToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var verificationMethod: VerificationMethod? = null
            private var ownerType: OwnerType? = null
            private var owner: String? = null
            private var accountToken: String? = null
            private var companyId: String? = null
            private var doingBusinessAs: String? = null
            private var dob: LocalDate? = null
            private var userDefinedId: String? = null
            private var type: AccountType? = null
            private var routingNumber: String? = null
            private var accountNumber: String? = null
            private var name: String? = null
            private var country: String? = null
            private var currency: String? = null
            private var verificationEnforcement: Boolean? = null
            private var address: ExternalBankAccountAddress? = null
            private var financialAccountToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ) = apply {
                verificationMethod = bankVerifiedCreateBankAccountApiRequest.verificationMethod
                ownerType = bankVerifiedCreateBankAccountApiRequest.ownerType
                owner = bankVerifiedCreateBankAccountApiRequest.owner
                accountToken = bankVerifiedCreateBankAccountApiRequest.accountToken
                companyId = bankVerifiedCreateBankAccountApiRequest.companyId
                doingBusinessAs = bankVerifiedCreateBankAccountApiRequest.doingBusinessAs
                dob = bankVerifiedCreateBankAccountApiRequest.dob
                userDefinedId = bankVerifiedCreateBankAccountApiRequest.userDefinedId
                type = bankVerifiedCreateBankAccountApiRequest.type
                routingNumber = bankVerifiedCreateBankAccountApiRequest.routingNumber
                accountNumber = bankVerifiedCreateBankAccountApiRequest.accountNumber
                name = bankVerifiedCreateBankAccountApiRequest.name
                country = bankVerifiedCreateBankAccountApiRequest.country
                currency = bankVerifiedCreateBankAccountApiRequest.currency
                verificationEnforcement =
                    bankVerifiedCreateBankAccountApiRequest.verificationEnforcement
                address = bankVerifiedCreateBankAccountApiRequest.address
                financialAccountToken =
                    bankVerifiedCreateBankAccountApiRequest.financialAccountToken
                additionalProperties =
                    bankVerifiedCreateBankAccountApiRequest.additionalProperties.toMutableMap()
            }

            /** Verification Method */
            @JsonProperty("verification_method")
            fun verificationMethod(verificationMethod: VerificationMethod) = apply {
                this.verificationMethod = verificationMethod
            }

            /** Owner Type */
            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** Optional field that helps identify bank accounts in receipts */
            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** Doing Business As */
            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            /** User Defined ID */
            @JsonProperty("user_defined_id")
            fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

            /** Account Type */
            @JsonProperty("type") fun type(type: AccountType) = apply { this.type = type }

            /** Routing Number */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** Account Number */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /** The nickname for this External Bank Account */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

            /** currency of the external account 3-digit alphabetic ISO 4217 code */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            @JsonProperty("verification_enforcement")
            fun verificationEnforcement(verificationEnforcement: Boolean) = apply {
                this.verificationEnforcement = verificationEnforcement
            }

            /** Address */
            @JsonProperty("address")
            fun address(address: ExternalBankAccountAddress) = apply { this.address = address }

            /** The financial account token of the operating account to fund the micro deposits */
            @JsonProperty("financial_account_token")
            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
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

            fun build(): BankVerifiedCreateBankAccountApiRequest =
                BankVerifiedCreateBankAccountApiRequest(
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    accountToken,
                    companyId,
                    doingBusinessAs,
                    dob,
                    userDefinedId,
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    name,
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    verificationEnforcement,
                    address,
                    checkNotNull(financialAccountToken) {
                        "`financialAccountToken` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        class AccountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHECKING = of("CHECKING")

                @JvmField val SAVINGS = of("SAVINGS")

                @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
            }

            enum class Known {
                CHECKING,
                SAVINGS,
            }

            enum class Value {
                CHECKING,
                SAVINGS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECKING -> Value.CHECKING
                    SAVINGS -> Value.SAVINGS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else -> throw LithicInvalidDataException("Unknown AccountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BankVerifiedCreateBankAccountApiRequest && verificationMethod == other.verificationMethod && ownerType == other.ownerType && owner == other.owner && accountToken == other.accountToken && companyId == other.companyId && doingBusinessAs == other.doingBusinessAs && dob == other.dob && userDefinedId == other.userDefinedId && type == other.type && routingNumber == other.routingNumber && accountNumber == other.accountNumber && name == other.name && country == other.country && currency == other.currency && verificationEnforcement == other.verificationEnforcement && address == other.address && financialAccountToken == other.financialAccountToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(verificationMethod, ownerType, owner, accountToken, companyId, doingBusinessAs, dob, userDefinedId, type, routingNumber, accountNumber, name, country, currency, verificationEnforcement, address, financialAccountToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BankVerifiedCreateBankAccountApiRequest{verificationMethod=$verificationMethod, ownerType=$ownerType, owner=$owner, accountToken=$accountToken, companyId=$companyId, doingBusinessAs=$doingBusinessAs, dob=$dob, userDefinedId=$userDefinedId, type=$type, routingNumber=$routingNumber, accountNumber=$accountNumber, name=$name, country=$country, currency=$currency, verificationEnforcement=$verificationEnforcement, address=$address, financialAccountToken=$financialAccountToken, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = PlaidCreateBankAccountApiRequest.Builder::class)
    @NoAutoDetect
    class PlaidCreateBankAccountApiRequest
    private constructor(
        private val verificationMethod: VerificationMethod,
        private val ownerType: OwnerType,
        private val owner: String,
        private val accountToken: String?,
        private val companyId: String?,
        private val doingBusinessAs: String?,
        private val dob: LocalDate?,
        private val userDefinedId: String?,
        private val processorToken: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Verification Method */
        @JsonProperty("verification_method")
        fun verificationMethod(): VerificationMethod = verificationMethod

        /** Owner Type */
        @JsonProperty("owner_type") fun ownerType(): OwnerType = ownerType

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") fun owner(): String = owner

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id")
        fun companyId(): Optional<String> = Optional.ofNullable(companyId)

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        fun doingBusinessAs(): Optional<String> = Optional.ofNullable(doingBusinessAs)

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): Optional<LocalDate> = Optional.ofNullable(dob)

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

        @JsonProperty("processor_token") fun processorToken(): String = processorToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var verificationMethod: VerificationMethod? = null
            private var ownerType: OwnerType? = null
            private var owner: String? = null
            private var accountToken: String? = null
            private var companyId: String? = null
            private var doingBusinessAs: String? = null
            private var dob: LocalDate? = null
            private var userDefinedId: String? = null
            private var processorToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest) =
                apply {
                    verificationMethod = plaidCreateBankAccountApiRequest.verificationMethod
                    ownerType = plaidCreateBankAccountApiRequest.ownerType
                    owner = plaidCreateBankAccountApiRequest.owner
                    accountToken = plaidCreateBankAccountApiRequest.accountToken
                    companyId = plaidCreateBankAccountApiRequest.companyId
                    doingBusinessAs = plaidCreateBankAccountApiRequest.doingBusinessAs
                    dob = plaidCreateBankAccountApiRequest.dob
                    userDefinedId = plaidCreateBankAccountApiRequest.userDefinedId
                    processorToken = plaidCreateBankAccountApiRequest.processorToken
                    additionalProperties =
                        plaidCreateBankAccountApiRequest.additionalProperties.toMutableMap()
                }

            /** Verification Method */
            @JsonProperty("verification_method")
            fun verificationMethod(verificationMethod: VerificationMethod) = apply {
                this.verificationMethod = verificationMethod
            }

            /** Owner Type */
            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** Optional field that helps identify bank accounts in receipts */
            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** Doing Business As */
            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            /** User Defined ID */
            @JsonProperty("user_defined_id")
            fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

            @JsonProperty("processor_token")
            fun processorToken(processorToken: String) = apply {
                this.processorToken = processorToken
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

            fun build(): PlaidCreateBankAccountApiRequest =
                PlaidCreateBankAccountApiRequest(
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    accountToken,
                    companyId,
                    doingBusinessAs,
                    dob,
                    userDefinedId,
                    checkNotNull(processorToken) { "`processorToken` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlaidCreateBankAccountApiRequest && verificationMethod == other.verificationMethod && ownerType == other.ownerType && owner == other.owner && accountToken == other.accountToken && companyId == other.companyId && doingBusinessAs == other.doingBusinessAs && dob == other.dob && userDefinedId == other.userDefinedId && processorToken == other.processorToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(verificationMethod, ownerType, owner, accountToken, companyId, doingBusinessAs, dob, userDefinedId, processorToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlaidCreateBankAccountApiRequest{verificationMethod=$verificationMethod, ownerType=$ownerType, owner=$owner, accountToken=$accountToken, companyId=$companyId, doingBusinessAs=$doingBusinessAs, dob=$dob, userDefinedId=$userDefinedId, processorToken=$processorToken, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ExternallyVerifiedCreateBankAccountApiRequest.Builder::class)
    @NoAutoDetect
    class ExternallyVerifiedCreateBankAccountApiRequest
    private constructor(
        private val verificationMethod: ExternallyVerifiedVerificationMethod,
        private val ownerType: OwnerType,
        private val owner: String,
        private val accountToken: String?,
        private val companyId: String?,
        private val doingBusinessAs: String?,
        private val dob: LocalDate?,
        private val userDefinedId: String?,
        private val type: Type,
        private val routingNumber: String,
        private val accountNumber: String,
        private val name: String?,
        private val country: String,
        private val currency: String,
        private val address: ExternalBankAccountAddress?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Verification Method */
        @JsonProperty("verification_method")
        fun verificationMethod(): ExternallyVerifiedVerificationMethod = verificationMethod

        /** Owner Type */
        @JsonProperty("owner_type") fun ownerType(): OwnerType = ownerType

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") fun owner(): String = owner

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id")
        fun companyId(): Optional<String> = Optional.ofNullable(companyId)

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        fun doingBusinessAs(): Optional<String> = Optional.ofNullable(doingBusinessAs)

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): Optional<LocalDate> = Optional.ofNullable(dob)

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

        /** Account Type */
        @JsonProperty("type") fun type(): Type = type

        /** Routing Number */
        @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

        /** Account Number */
        @JsonProperty("account_number") fun accountNumber(): String = accountNumber

        /** The nickname for this External Bank Account */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        @JsonProperty("country") fun country(): String = country

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        @JsonProperty("currency") fun currency(): String = currency

        /** Address */
        @JsonProperty("address")
        fun address(): Optional<ExternalBankAccountAddress> = Optional.ofNullable(address)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var verificationMethod: ExternallyVerifiedVerificationMethod? = null
            private var ownerType: OwnerType? = null
            private var owner: String? = null
            private var accountToken: String? = null
            private var companyId: String? = null
            private var doingBusinessAs: String? = null
            private var dob: LocalDate? = null
            private var userDefinedId: String? = null
            private var type: Type? = null
            private var routingNumber: String? = null
            private var accountNumber: String? = null
            private var name: String? = null
            private var country: String? = null
            private var currency: String? = null
            private var address: ExternalBankAccountAddress? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                externallyVerifiedCreateBankAccountApiRequest:
                    ExternallyVerifiedCreateBankAccountApiRequest
            ) = apply {
                verificationMethod =
                    externallyVerifiedCreateBankAccountApiRequest.verificationMethod
                ownerType = externallyVerifiedCreateBankAccountApiRequest.ownerType
                owner = externallyVerifiedCreateBankAccountApiRequest.owner
                accountToken = externallyVerifiedCreateBankAccountApiRequest.accountToken
                companyId = externallyVerifiedCreateBankAccountApiRequest.companyId
                doingBusinessAs = externallyVerifiedCreateBankAccountApiRequest.doingBusinessAs
                dob = externallyVerifiedCreateBankAccountApiRequest.dob
                userDefinedId = externallyVerifiedCreateBankAccountApiRequest.userDefinedId
                type = externallyVerifiedCreateBankAccountApiRequest.type
                routingNumber = externallyVerifiedCreateBankAccountApiRequest.routingNumber
                accountNumber = externallyVerifiedCreateBankAccountApiRequest.accountNumber
                name = externallyVerifiedCreateBankAccountApiRequest.name
                country = externallyVerifiedCreateBankAccountApiRequest.country
                currency = externallyVerifiedCreateBankAccountApiRequest.currency
                address = externallyVerifiedCreateBankAccountApiRequest.address
                additionalProperties =
                    externallyVerifiedCreateBankAccountApiRequest.additionalProperties
                        .toMutableMap()
            }

            /** Verification Method */
            @JsonProperty("verification_method")
            fun verificationMethod(verificationMethod: ExternallyVerifiedVerificationMethod) =
                apply {
                    this.verificationMethod = verificationMethod
                }

            /** Owner Type */
            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /** Optional field that helps identify bank accounts in receipts */
            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** Doing Business As */
            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            /** User Defined ID */
            @JsonProperty("user_defined_id")
            fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

            /** Account Type */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** Routing Number */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** Account Number */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /** The nickname for this External Bank Account */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

            /** currency of the external account 3-digit alphabetic ISO 4217 code */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** Address */
            @JsonProperty("address")
            fun address(address: ExternalBankAccountAddress) = apply { this.address = address }

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

            fun build(): ExternallyVerifiedCreateBankAccountApiRequest =
                ExternallyVerifiedCreateBankAccountApiRequest(
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    accountToken,
                    companyId,
                    doingBusinessAs,
                    dob,
                    userDefinedId,
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    name,
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    address,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHECKING = of("CHECKING")

                @JvmField val SAVINGS = of("SAVINGS")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CHECKING,
                SAVINGS,
            }

            enum class Value {
                CHECKING,
                SAVINGS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECKING -> Value.CHECKING
                    SAVINGS -> Value.SAVINGS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ExternallyVerifiedVerificationMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EXTERNALLY_VERIFIED = of("EXTERNALLY_VERIFIED")

                @JvmStatic
                fun of(value: String) = ExternallyVerifiedVerificationMethod(JsonField.of(value))
            }

            enum class Known {
                EXTERNALLY_VERIFIED,
            }

            enum class Value {
                EXTERNALLY_VERIFIED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EXTERNALLY_VERIFIED -> Value.EXTERNALLY_VERIFIED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EXTERNALLY_VERIFIED -> Known.EXTERNALLY_VERIFIED
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown ExternallyVerifiedVerificationMethod: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternallyVerifiedVerificationMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternallyVerifiedCreateBankAccountApiRequest && verificationMethod == other.verificationMethod && ownerType == other.ownerType && owner == other.owner && accountToken == other.accountToken && companyId == other.companyId && doingBusinessAs == other.doingBusinessAs && dob == other.dob && userDefinedId == other.userDefinedId && type == other.type && routingNumber == other.routingNumber && accountNumber == other.accountNumber && name == other.name && country == other.country && currency == other.currency && address == other.address && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(verificationMethod, ownerType, owner, accountToken, companyId, doingBusinessAs, dob, userDefinedId, type, routingNumber, accountNumber, name, country, currency, address, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternallyVerifiedCreateBankAccountApiRequest{verificationMethod=$verificationMethod, ownerType=$ownerType, owner=$owner, accountToken=$accountToken, companyId=$companyId, doingBusinessAs=$doingBusinessAs, dob=$dob, userDefinedId=$userDefinedId, type=$type, routingNumber=$routingNumber, accountNumber=$accountNumber, name=$name, country=$country, currency=$currency, address=$address, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountCreateParams && bankVerifiedCreateBankAccountApiRequest == other.bankVerifiedCreateBankAccountApiRequest && plaidCreateBankAccountApiRequest == other.plaidCreateBankAccountApiRequest && externallyVerifiedCreateBankAccountApiRequest == other.externallyVerifiedCreateBankAccountApiRequest && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bankVerifiedCreateBankAccountApiRequest, plaidCreateBankAccountApiRequest, externallyVerifiedCreateBankAccountApiRequest, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountCreateParams{bankVerifiedCreateBankAccountApiRequest=$bankVerifiedCreateBankAccountApiRequest, plaidCreateBankAccountApiRequest=$plaidCreateBankAccountApiRequest, externallyVerifiedCreateBankAccountApiRequest=$externallyVerifiedCreateBankAccountApiRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
