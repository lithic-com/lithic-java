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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates an external bank account within a program or Lithic account. */
class ExternalBankAccountCreateParams
constructor(
    private val body: ExternalBankAccountCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun bankVerifiedCreateBankAccountApiRequest():
        Optional<BankVerifiedCreateBankAccountApiRequest> =
        body.bankVerifiedCreateBankAccountApiRequest()

    fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
        body.plaidCreateBankAccountApiRequest()

    fun externallyVerifiedCreateBankAccountApiRequest():
        Optional<ExternallyVerifiedCreateBankAccountApiRequest> =
        body.externallyVerifiedCreateBankAccountApiRequest()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ExternalBankAccountCreateBody = body

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

        private var body: ExternalBankAccountCreateBody? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalBankAccountCreateParams: ExternalBankAccountCreateParams) =
            apply {
                body = externalBankAccountCreateParams.body
                additionalHeaders = externalBankAccountCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    externalBankAccountCreateParams.additionalQueryParams.toBuilder()
            }

        fun forBankVerifiedCreateBankAccountApiRequest(
            bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
        ) = apply {
            body =
                ExternalBankAccountCreateBody.ofBankVerifiedCreateBankAccountApiRequest(
                    bankVerifiedCreateBankAccountApiRequest
                )
        }

        fun forPlaidCreateBankAccountApiRequest(
            plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
        ) = apply {
            body =
                ExternalBankAccountCreateBody.ofPlaidCreateBankAccountApiRequest(
                    plaidCreateBankAccountApiRequest
                )
        }

        fun forExternallyVerifiedCreateBankAccountApiRequest(
            externallyVerifiedCreateBankAccountApiRequest:
                ExternallyVerifiedCreateBankAccountApiRequest
        ) = apply {
            body =
                ExternalBankAccountCreateBody.ofExternallyVerifiedCreateBankAccountApiRequest(
                    externallyVerifiedCreateBankAccountApiRequest
                )
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
                body ?: ExternalBankAccountCreateBody(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class BankVerifiedCreateBankAccountApiRequest
    @JsonCreator
    private constructor(
        @JsonProperty("account_number")
        @ExcludeMissing
        private val accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        private val financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner")
        @ExcludeMissing
        private val owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner_type")
        @ExcludeMissing
        private val ownerType: JsonField<OwnerType> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        private val routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("verification_method")
        @ExcludeMissing
        private val verificationMethod: JsonField<VerificationMethod> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        private val accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
        @JsonProperty("company_id")
        @ExcludeMissing
        private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dob")
        @ExcludeMissing
        private val dob: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        private val doingBusinessAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        private val userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_enforcement")
        @ExcludeMissing
        private val verificationEnforcement: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Account Number */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(): String = country.getRequired("country")

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        fun currency(): String = currency.getRequired("currency")

        /** The financial account token of the operating account to fund the micro deposits */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(): String = owner.getRequired("owner")

        /** Owner Type */
        fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

        /** Routing Number */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /** Account Type */
        fun type(): AccountType = type.getRequired("type")

        /** Verification Method */
        fun verificationMethod(): VerificationMethod =
            verificationMethod.getRequired("verification_method")

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(): Optional<String> =
            Optional.ofNullable(accountToken.getNullable("account_token"))

        /** Address */
        fun address(): Optional<ExternalBankAccountAddress> =
            Optional.ofNullable(address.getNullable("address"))

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(): Optional<LocalDate> = Optional.ofNullable(dob.getNullable("dob"))

        /** Doing Business As */
        fun doingBusinessAs(): Optional<String> =
            Optional.ofNullable(doingBusinessAs.getNullable("doing_business_as"))

        /** The nickname for this External Bank Account */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** User Defined ID */
        fun userDefinedId(): Optional<String> =
            Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

        fun verificationEnforcement(): Optional<Boolean> =
            Optional.ofNullable(verificationEnforcement.getNullable("verification_enforcement"))

        /** Account Number */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** The financial account token of the operating account to fund the micro deposits */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /** Owner Type */
        @JsonProperty("owner_type")
        @ExcludeMissing
        fun _ownerType(): JsonField<OwnerType> = ownerType

        /** Routing Number */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /** Account Type */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AccountType> = type

        /** Verification Method */
        @JsonProperty("verification_method")
        @ExcludeMissing
        fun _verificationMethod(): JsonField<VerificationMethod> = verificationMethod

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        /** Address */
        @JsonProperty("address")
        @ExcludeMissing
        fun _address(): JsonField<ExternalBankAccountAddress> = address

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

        /** The nickname for this External Bank Account */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonProperty("verification_enforcement")
        @ExcludeMissing
        fun _verificationEnforcement(): JsonField<Boolean> = verificationEnforcement

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BankVerifiedCreateBankAccountApiRequest = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            country()
            currency()
            financialAccountToken()
            owner()
            ownerType()
            routingNumber()
            type()
            verificationMethod()
            accountToken()
            address().ifPresent { it.validate() }
            companyId()
            dob()
            doingBusinessAs()
            name()
            userDefinedId()
            verificationEnforcement()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumber: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var owner: JsonField<String>? = null
            private var ownerType: JsonField<OwnerType>? = null
            private var routingNumber: JsonField<String>? = null
            private var type: JsonField<AccountType>? = null
            private var verificationMethod: JsonField<VerificationMethod>? = null
            private var accountToken: JsonField<String> = JsonMissing.of()
            private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var dob: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAs: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var verificationEnforcement: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ) = apply {
                accountNumber = bankVerifiedCreateBankAccountApiRequest.accountNumber
                country = bankVerifiedCreateBankAccountApiRequest.country
                currency = bankVerifiedCreateBankAccountApiRequest.currency
                financialAccountToken =
                    bankVerifiedCreateBankAccountApiRequest.financialAccountToken
                owner = bankVerifiedCreateBankAccountApiRequest.owner
                ownerType = bankVerifiedCreateBankAccountApiRequest.ownerType
                routingNumber = bankVerifiedCreateBankAccountApiRequest.routingNumber
                type = bankVerifiedCreateBankAccountApiRequest.type
                verificationMethod = bankVerifiedCreateBankAccountApiRequest.verificationMethod
                accountToken = bankVerifiedCreateBankAccountApiRequest.accountToken
                address = bankVerifiedCreateBankAccountApiRequest.address
                companyId = bankVerifiedCreateBankAccountApiRequest.companyId
                dob = bankVerifiedCreateBankAccountApiRequest.dob
                doingBusinessAs = bankVerifiedCreateBankAccountApiRequest.doingBusinessAs
                name = bankVerifiedCreateBankAccountApiRequest.name
                userDefinedId = bankVerifiedCreateBankAccountApiRequest.userDefinedId
                verificationEnforcement =
                    bankVerifiedCreateBankAccountApiRequest.verificationEnforcement
                additionalProperties =
                    bankVerifiedCreateBankAccountApiRequest.additionalProperties.toMutableMap()
            }

            /** Account Number */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** Account Number */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** currency of the external account 3-digit alphabetic ISO 4217 code */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** currency of the external account 3-digit alphabetic ISO 4217 code */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The financial account token of the operating account to fund the micro deposits */
            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /** The financial account token of the operating account to fund the micro deposits */
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            /** Owner Type */
            fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

            /** Owner Type */
            fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

            /** Routing Number */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /** Routing Number */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** Account Type */
            fun type(type: AccountType) = type(JsonField.of(type))

            /** Account Type */
            fun type(type: JsonField<AccountType>) = apply { this.type = type }

            /** Verification Method */
            fun verificationMethod(verificationMethod: VerificationMethod) =
                verificationMethod(JsonField.of(verificationMethod))

            /** Verification Method */
            fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
                this.verificationMethod = verificationMethod
            }

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            /** Address */
            fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

            /** Address */
            fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
                this.address = address
            }

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: LocalDate) = dob(JsonField.of(dob))

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: String) =
                doingBusinessAs(JsonField.of(doingBusinessAs))

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** The nickname for this External Bank Account */
            fun name(name: String) = name(JsonField.of(name))

            /** The nickname for this External Bank Account */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** User Defined ID */
            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            /** User Defined ID */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
            }

            fun verificationEnforcement(verificationEnforcement: Boolean) =
                verificationEnforcement(JsonField.of(verificationEnforcement))

            fun verificationEnforcement(verificationEnforcement: JsonField<Boolean>) = apply {
                this.verificationEnforcement = verificationEnforcement
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

            fun build(): BankVerifiedCreateBankAccountApiRequest =
                BankVerifiedCreateBankAccountApiRequest(
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(financialAccountToken) {
                        "`financialAccountToken` is required but was not set"
                    },
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    accountToken,
                    address,
                    companyId,
                    dob,
                    doingBusinessAs,
                    name,
                    userDefinedId,
                    verificationEnforcement,
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

            return /* spotless:off */ other is BankVerifiedCreateBankAccountApiRequest && accountNumber == other.accountNumber && country == other.country && currency == other.currency && financialAccountToken == other.financialAccountToken && owner == other.owner && ownerType == other.ownerType && routingNumber == other.routingNumber && type == other.type && verificationMethod == other.verificationMethod && accountToken == other.accountToken && address == other.address && companyId == other.companyId && dob == other.dob && doingBusinessAs == other.doingBusinessAs && name == other.name && userDefinedId == other.userDefinedId && verificationEnforcement == other.verificationEnforcement && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, country, currency, financialAccountToken, owner, ownerType, routingNumber, type, verificationMethod, accountToken, address, companyId, dob, doingBusinessAs, name, userDefinedId, verificationEnforcement, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BankVerifiedCreateBankAccountApiRequest{accountNumber=$accountNumber, country=$country, currency=$currency, financialAccountToken=$financialAccountToken, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, type=$type, verificationMethod=$verificationMethod, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, userDefinedId=$userDefinedId, verificationEnforcement=$verificationEnforcement, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PlaidCreateBankAccountApiRequest
    @JsonCreator
    private constructor(
        @JsonProperty("owner")
        @ExcludeMissing
        private val owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner_type")
        @ExcludeMissing
        private val ownerType: JsonField<OwnerType> = JsonMissing.of(),
        @JsonProperty("processor_token")
        @ExcludeMissing
        private val processorToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_method")
        @ExcludeMissing
        private val verificationMethod: JsonField<VerificationMethod> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        private val accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_id")
        @ExcludeMissing
        private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dob")
        @ExcludeMissing
        private val dob: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        private val doingBusinessAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        private val userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(): String = owner.getRequired("owner")

        /** Owner Type */
        fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

        fun processorToken(): String = processorToken.getRequired("processor_token")

        /** Verification Method */
        fun verificationMethod(): VerificationMethod =
            verificationMethod.getRequired("verification_method")

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(): Optional<String> =
            Optional.ofNullable(accountToken.getNullable("account_token"))

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(): Optional<LocalDate> = Optional.ofNullable(dob.getNullable("dob"))

        /** Doing Business As */
        fun doingBusinessAs(): Optional<String> =
            Optional.ofNullable(doingBusinessAs.getNullable("doing_business_as"))

        /** User Defined ID */
        fun userDefinedId(): Optional<String> =
            Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /** Owner Type */
        @JsonProperty("owner_type")
        @ExcludeMissing
        fun _ownerType(): JsonField<OwnerType> = ownerType

        @JsonProperty("processor_token")
        @ExcludeMissing
        fun _processorToken(): JsonField<String> = processorToken

        /** Verification Method */
        @JsonProperty("verification_method")
        @ExcludeMissing
        fun _verificationMethod(): JsonField<VerificationMethod> = verificationMethod

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlaidCreateBankAccountApiRequest = apply {
            if (validated) {
                return@apply
            }

            owner()
            ownerType()
            processorToken()
            verificationMethod()
            accountToken()
            companyId()
            dob()
            doingBusinessAs()
            userDefinedId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var owner: JsonField<String>? = null
            private var ownerType: JsonField<OwnerType>? = null
            private var processorToken: JsonField<String>? = null
            private var verificationMethod: JsonField<VerificationMethod>? = null
            private var accountToken: JsonField<String> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var dob: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAs: JsonField<String> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest) =
                apply {
                    owner = plaidCreateBankAccountApiRequest.owner
                    ownerType = plaidCreateBankAccountApiRequest.ownerType
                    processorToken = plaidCreateBankAccountApiRequest.processorToken
                    verificationMethod = plaidCreateBankAccountApiRequest.verificationMethod
                    accountToken = plaidCreateBankAccountApiRequest.accountToken
                    companyId = plaidCreateBankAccountApiRequest.companyId
                    dob = plaidCreateBankAccountApiRequest.dob
                    doingBusinessAs = plaidCreateBankAccountApiRequest.doingBusinessAs
                    userDefinedId = plaidCreateBankAccountApiRequest.userDefinedId
                    additionalProperties =
                        plaidCreateBankAccountApiRequest.additionalProperties.toMutableMap()
                }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            /** Owner Type */
            fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

            /** Owner Type */
            fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

            fun processorToken(processorToken: String) =
                processorToken(JsonField.of(processorToken))

            fun processorToken(processorToken: JsonField<String>) = apply {
                this.processorToken = processorToken
            }

            /** Verification Method */
            fun verificationMethod(verificationMethod: VerificationMethod) =
                verificationMethod(JsonField.of(verificationMethod))

            /** Verification Method */
            fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
                this.verificationMethod = verificationMethod
            }

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: LocalDate) = dob(JsonField.of(dob))

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: String) =
                doingBusinessAs(JsonField.of(doingBusinessAs))

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** User Defined ID */
            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            /** User Defined ID */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
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

            fun build(): PlaidCreateBankAccountApiRequest =
                PlaidCreateBankAccountApiRequest(
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(processorToken) { "`processorToken` is required but was not set" },
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    accountToken,
                    companyId,
                    dob,
                    doingBusinessAs,
                    userDefinedId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlaidCreateBankAccountApiRequest && owner == other.owner && ownerType == other.ownerType && processorToken == other.processorToken && verificationMethod == other.verificationMethod && accountToken == other.accountToken && companyId == other.companyId && dob == other.dob && doingBusinessAs == other.doingBusinessAs && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(owner, ownerType, processorToken, verificationMethod, accountToken, companyId, dob, doingBusinessAs, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlaidCreateBankAccountApiRequest{owner=$owner, ownerType=$ownerType, processorToken=$processorToken, verificationMethod=$verificationMethod, accountToken=$accountToken, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ExternallyVerifiedCreateBankAccountApiRequest
    @JsonCreator
    private constructor(
        @JsonProperty("account_number")
        @ExcludeMissing
        private val accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner")
        @ExcludeMissing
        private val owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner_type")
        @ExcludeMissing
        private val ownerType: JsonField<OwnerType> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        private val routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("verification_method")
        @ExcludeMissing
        private val verificationMethod: JsonField<ExternallyVerifiedVerificationMethod> =
            JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        private val accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
        @JsonProperty("company_id")
        @ExcludeMissing
        private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dob")
        @ExcludeMissing
        private val dob: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        private val doingBusinessAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        private val userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Account Number */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(): String = country.getRequired("country")

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(): String = owner.getRequired("owner")

        /** Owner Type */
        fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

        /** Routing Number */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /** Account Type */
        fun type(): Type = type.getRequired("type")

        /** Verification Method */
        fun verificationMethod(): ExternallyVerifiedVerificationMethod =
            verificationMethod.getRequired("verification_method")

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(): Optional<String> =
            Optional.ofNullable(accountToken.getNullable("account_token"))

        /** Address */
        fun address(): Optional<ExternalBankAccountAddress> =
            Optional.ofNullable(address.getNullable("address"))

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(): Optional<LocalDate> = Optional.ofNullable(dob.getNullable("dob"))

        /** Doing Business As */
        fun doingBusinessAs(): Optional<String> =
            Optional.ofNullable(doingBusinessAs.getNullable("doing_business_as"))

        /** The nickname for this External Bank Account */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** User Defined ID */
        fun userDefinedId(): Optional<String> =
            Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

        /** Account Number */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /** Owner Type */
        @JsonProperty("owner_type")
        @ExcludeMissing
        fun _ownerType(): JsonField<OwnerType> = ownerType

        /** Routing Number */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /** Account Type */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /** Verification Method */
        @JsonProperty("verification_method")
        @ExcludeMissing
        fun _verificationMethod(): JsonField<ExternallyVerifiedVerificationMethod> =
            verificationMethod

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        /** Address */
        @JsonProperty("address")
        @ExcludeMissing
        fun _address(): JsonField<ExternalBankAccountAddress> = address

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

        /** The nickname for this External Bank Account */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternallyVerifiedCreateBankAccountApiRequest = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            country()
            currency()
            owner()
            ownerType()
            routingNumber()
            type()
            verificationMethod()
            accountToken()
            address().ifPresent { it.validate() }
            companyId()
            dob()
            doingBusinessAs()
            name()
            userDefinedId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumber: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var owner: JsonField<String>? = null
            private var ownerType: JsonField<OwnerType>? = null
            private var routingNumber: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var verificationMethod: JsonField<ExternallyVerifiedVerificationMethod>? = null
            private var accountToken: JsonField<String> = JsonMissing.of()
            private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var dob: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAs: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                externallyVerifiedCreateBankAccountApiRequest:
                    ExternallyVerifiedCreateBankAccountApiRequest
            ) = apply {
                accountNumber = externallyVerifiedCreateBankAccountApiRequest.accountNumber
                country = externallyVerifiedCreateBankAccountApiRequest.country
                currency = externallyVerifiedCreateBankAccountApiRequest.currency
                owner = externallyVerifiedCreateBankAccountApiRequest.owner
                ownerType = externallyVerifiedCreateBankAccountApiRequest.ownerType
                routingNumber = externallyVerifiedCreateBankAccountApiRequest.routingNumber
                type = externallyVerifiedCreateBankAccountApiRequest.type
                verificationMethod =
                    externallyVerifiedCreateBankAccountApiRequest.verificationMethod
                accountToken = externallyVerifiedCreateBankAccountApiRequest.accountToken
                address = externallyVerifiedCreateBankAccountApiRequest.address
                companyId = externallyVerifiedCreateBankAccountApiRequest.companyId
                dob = externallyVerifiedCreateBankAccountApiRequest.dob
                doingBusinessAs = externallyVerifiedCreateBankAccountApiRequest.doingBusinessAs
                name = externallyVerifiedCreateBankAccountApiRequest.name
                userDefinedId = externallyVerifiedCreateBankAccountApiRequest.userDefinedId
                additionalProperties =
                    externallyVerifiedCreateBankAccountApiRequest.additionalProperties
                        .toMutableMap()
            }

            /** Account Number */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** Account Number */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** currency of the external account 3-digit alphabetic ISO 4217 code */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** currency of the external account 3-digit alphabetic ISO 4217 code */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            /** Owner Type */
            fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

            /** Owner Type */
            fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

            /** Routing Number */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /** Routing Number */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** Account Type */
            fun type(type: Type) = type(JsonField.of(type))

            /** Account Type */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Verification Method */
            fun verificationMethod(verificationMethod: ExternallyVerifiedVerificationMethod) =
                verificationMethod(JsonField.of(verificationMethod))

            /** Verification Method */
            fun verificationMethod(
                verificationMethod: JsonField<ExternallyVerifiedVerificationMethod>
            ) = apply { this.verificationMethod = verificationMethod }

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             */
            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            /** Address */
            fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

            /** Address */
            fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
                this.address = address
            }

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: LocalDate) = dob(JsonField.of(dob))

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: String) =
                doingBusinessAs(JsonField.of(doingBusinessAs))

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** The nickname for this External Bank Account */
            fun name(name: String) = name(JsonField.of(name))

            /** The nickname for this External Bank Account */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** User Defined ID */
            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            /** User Defined ID */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
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

            fun build(): ExternallyVerifiedCreateBankAccountApiRequest =
                ExternallyVerifiedCreateBankAccountApiRequest(
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    accountToken,
                    address,
                    companyId,
                    dob,
                    doingBusinessAs,
                    name,
                    userDefinedId,
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

            return /* spotless:off */ other is ExternallyVerifiedCreateBankAccountApiRequest && accountNumber == other.accountNumber && country == other.country && currency == other.currency && owner == other.owner && ownerType == other.ownerType && routingNumber == other.routingNumber && type == other.type && verificationMethod == other.verificationMethod && accountToken == other.accountToken && address == other.address && companyId == other.companyId && dob == other.dob && doingBusinessAs == other.doingBusinessAs && name == other.name && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, country, currency, owner, ownerType, routingNumber, type, verificationMethod, accountToken, address, companyId, dob, doingBusinessAs, name, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternallyVerifiedCreateBankAccountApiRequest{accountNumber=$accountNumber, country=$country, currency=$currency, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, type=$type, verificationMethod=$verificationMethod, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
