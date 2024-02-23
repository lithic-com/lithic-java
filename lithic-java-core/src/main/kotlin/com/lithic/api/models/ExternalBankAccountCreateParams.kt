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
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ExternalBankAccountCreateParams
constructor(
    private val bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest?,
    private val plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun bankVerifiedCreateBankAccountApiRequest():
        Optional<BankVerifiedCreateBankAccountApiRequest> =
        Optional.ofNullable(bankVerifiedCreateBankAccountApiRequest)

    fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
        Optional.ofNullable(plaidCreateBankAccountApiRequest)

    @JvmSynthetic
    internal fun getBody(): ExternalBankAccountCreateBody {
        return ExternalBankAccountCreateBody(
            bankVerifiedCreateBankAccountApiRequest,
            plaidCreateBankAccountApiRequest
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(using = ExternalBankAccountCreateBody.Deserializer::class)
    @JsonSerialize(using = ExternalBankAccountCreateBody.Serializer::class)
    class ExternalBankAccountCreateBody
    internal constructor(
        private val bankVerifiedCreateBankAccountApiRequest:
            BankVerifiedCreateBankAccountApiRequest? =
            null,
        private val plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bankVerifiedCreateBankAccountApiRequest():
            Optional<BankVerifiedCreateBankAccountApiRequest> =
            Optional.ofNullable(bankVerifiedCreateBankAccountApiRequest)

        fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
            Optional.ofNullable(plaidCreateBankAccountApiRequest)

        fun isBankVerifiedCreateBankAccountApiRequest(): Boolean =
            bankVerifiedCreateBankAccountApiRequest != null

        fun isPlaidCreateBankAccountApiRequest(): Boolean = plaidCreateBankAccountApiRequest != null

        fun asBankVerifiedCreateBankAccountApiRequest(): BankVerifiedCreateBankAccountApiRequest =
            bankVerifiedCreateBankAccountApiRequest.getOrThrow(
                "bankVerifiedCreateBankAccountApiRequest"
            )

        fun asPlaidCreateBankAccountApiRequest(): PlaidCreateBankAccountApiRequest =
            plaidCreateBankAccountApiRequest.getOrThrow("plaidCreateBankAccountApiRequest")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                bankVerifiedCreateBankAccountApiRequest != null ->
                    visitor.visitBankVerifiedCreateBankAccountApiRequest(
                        bankVerifiedCreateBankAccountApiRequest
                    )
                plaidCreateBankAccountApiRequest != null ->
                    visitor.visitPlaidCreateBankAccountApiRequest(plaidCreateBankAccountApiRequest)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalBankAccountCreateBody &&
                this.bankVerifiedCreateBankAccountApiRequest ==
                    other.bankVerifiedCreateBankAccountApiRequest &&
                this.plaidCreateBankAccountApiRequest == other.plaidCreateBankAccountApiRequest
        }

        override fun hashCode(): Int {
            return Objects.hash(
                bankVerifiedCreateBankAccountApiRequest,
                plaidCreateBankAccountApiRequest
            )
        }

        override fun toString(): String {
            return when {
                bankVerifiedCreateBankAccountApiRequest != null ->
                    "ExternalBankAccountCreateBody{bankVerifiedCreateBankAccountApiRequest=$bankVerifiedCreateBankAccountApiRequest}"
                plaidCreateBankAccountApiRequest != null ->
                    "ExternalBankAccountCreateBody{plaidCreateBankAccountApiRequest=$plaidCreateBankAccountApiRequest}"
                _json != null -> "ExternalBankAccountCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ExternalBankAccountCreateBody")
            }
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
        }

        interface Visitor<out T> {

            fun visitBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ): T

            fun visitPlaidCreateBankAccountApiRequest(
                plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
            ): T

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown ExternalBankAccountCreateBody: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<ExternalBankAccountCreateBody>(ExternalBankAccountCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ExternalBankAccountCreateBody {
                val json = JsonValue.fromJsonNode(node)
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
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ExternalBankAccountCreateBody")
                }
            }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountCreateParams &&
            this.bankVerifiedCreateBankAccountApiRequest ==
                other.bankVerifiedCreateBankAccountApiRequest &&
            this.plaidCreateBankAccountApiRequest == other.plaidCreateBankAccountApiRequest &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            bankVerifiedCreateBankAccountApiRequest,
            plaidCreateBankAccountApiRequest,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ExternalBankAccountCreateParams{bankVerifiedCreateBankAccountApiRequest=$bankVerifiedCreateBankAccountApiRequest, plaidCreateBankAccountApiRequest=$plaidCreateBankAccountApiRequest, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountCreateParams: ExternalBankAccountCreateParams) =
            apply {
                this.bankVerifiedCreateBankAccountApiRequest =
                    externalBankAccountCreateParams.bankVerifiedCreateBankAccountApiRequest
                this.plaidCreateBankAccountApiRequest =
                    externalBankAccountCreateParams.plaidCreateBankAccountApiRequest
                additionalQueryParams(externalBankAccountCreateParams.additionalQueryParams)
                additionalHeaders(externalBankAccountCreateParams.additionalHeaders)
            }

        fun forBankVerifiedCreateBankAccountApiRequest(
            bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
        ) = apply {
            this.bankVerifiedCreateBankAccountApiRequest = bankVerifiedCreateBankAccountApiRequest
            this.plaidCreateBankAccountApiRequest = null
        }

        fun forPlaidCreateBankAccountApiRequest(
            plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
        ) = apply {
            this.bankVerifiedCreateBankAccountApiRequest = null
            this.plaidCreateBankAccountApiRequest = plaidCreateBankAccountApiRequest
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

        fun build(): ExternalBankAccountCreateParams =
            ExternalBankAccountCreateParams(
                bankVerifiedCreateBankAccountApiRequest,
                plaidCreateBankAccountApiRequest,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = BankVerifiedCreateBankAccountApiRequest.Builder::class)
    @NoAutoDetect
    class BankVerifiedCreateBankAccountApiRequest
    private constructor(
        private val accountNumber: String?,
        private val accountToken: String?,
        private val address: ExternalBankAccountAddress?,
        private val companyId: String?,
        private val country: String?,
        private val currency: String?,
        private val dob: LocalDate?,
        private val doingBusinessAs: String?,
        private val name: String?,
        private val owner: String?,
        private val ownerType: OwnerType?,
        private val routingNumber: String?,
        private val type: AccountType?,
        private val userDefinedId: String?,
        private val verificationEnforcement: Boolean?,
        private val verificationMethod: VerificationMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        @JsonProperty("address") fun address(): ExternalBankAccountAddress? = address

        @JsonProperty("company_id") fun companyId(): String? = companyId

        @JsonProperty("country") fun country(): String? = country

        @JsonProperty("currency") fun currency(): String? = currency

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): LocalDate? = dob

        @JsonProperty("doing_business_as") fun doingBusinessAs(): String? = doingBusinessAs

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("owner") fun owner(): String? = owner

        @JsonProperty("owner_type") fun ownerType(): OwnerType? = ownerType

        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        @JsonProperty("type") fun type(): AccountType? = type

        @JsonProperty("user_defined_id") fun userDefinedId(): String? = userDefinedId

        /**
         * Indicates whether verification was enforced for a given association record. For
         * MICRO_DEPOSIT, option to disable verification if the external bank account has already
         * been verified before. By default, verification will be required unless users pass in a
         * value of false
         */
        @JsonProperty("verification_enforcement")
        fun verificationEnforcement(): Boolean? = verificationEnforcement

        @JsonProperty("verification_method")
        fun verificationMethod(): VerificationMethod? = verificationMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BankVerifiedCreateBankAccountApiRequest &&
                this.accountNumber == other.accountNumber &&
                this.accountToken == other.accountToken &&
                this.address == other.address &&
                this.companyId == other.companyId &&
                this.country == other.country &&
                this.currency == other.currency &&
                this.dob == other.dob &&
                this.doingBusinessAs == other.doingBusinessAs &&
                this.name == other.name &&
                this.owner == other.owner &&
                this.ownerType == other.ownerType &&
                this.routingNumber == other.routingNumber &&
                this.type == other.type &&
                this.userDefinedId == other.userDefinedId &&
                this.verificationEnforcement == other.verificationEnforcement &&
                this.verificationMethod == other.verificationMethod &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumber,
                        accountToken,
                        address,
                        companyId,
                        country,
                        currency,
                        dob,
                        doingBusinessAs,
                        name,
                        owner,
                        ownerType,
                        routingNumber,
                        type,
                        userDefinedId,
                        verificationEnforcement,
                        verificationMethod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BankVerifiedCreateBankAccountApiRequest{accountNumber=$accountNumber, accountToken=$accountToken, address=$address, companyId=$companyId, country=$country, currency=$currency, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, type=$type, userDefinedId=$userDefinedId, verificationEnforcement=$verificationEnforcement, verificationMethod=$verificationMethod, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumber: String? = null
            private var accountToken: String? = null
            private var address: ExternalBankAccountAddress? = null
            private var companyId: String? = null
            private var country: String? = null
            private var currency: String? = null
            private var dob: LocalDate? = null
            private var doingBusinessAs: String? = null
            private var name: String? = null
            private var owner: String? = null
            private var ownerType: OwnerType? = null
            private var routingNumber: String? = null
            private var type: AccountType? = null
            private var userDefinedId: String? = null
            private var verificationEnforcement: Boolean? = null
            private var verificationMethod: VerificationMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ) = apply {
                this.accountNumber = bankVerifiedCreateBankAccountApiRequest.accountNumber
                this.accountToken = bankVerifiedCreateBankAccountApiRequest.accountToken
                this.address = bankVerifiedCreateBankAccountApiRequest.address
                this.companyId = bankVerifiedCreateBankAccountApiRequest.companyId
                this.country = bankVerifiedCreateBankAccountApiRequest.country
                this.currency = bankVerifiedCreateBankAccountApiRequest.currency
                this.dob = bankVerifiedCreateBankAccountApiRequest.dob
                this.doingBusinessAs = bankVerifiedCreateBankAccountApiRequest.doingBusinessAs
                this.name = bankVerifiedCreateBankAccountApiRequest.name
                this.owner = bankVerifiedCreateBankAccountApiRequest.owner
                this.ownerType = bankVerifiedCreateBankAccountApiRequest.ownerType
                this.routingNumber = bankVerifiedCreateBankAccountApiRequest.routingNumber
                this.type = bankVerifiedCreateBankAccountApiRequest.type
                this.userDefinedId = bankVerifiedCreateBankAccountApiRequest.userDefinedId
                this.verificationEnforcement =
                    bankVerifiedCreateBankAccountApiRequest.verificationEnforcement
                this.verificationMethod = bankVerifiedCreateBankAccountApiRequest.verificationMethod
                additionalProperties(bankVerifiedCreateBankAccountApiRequest.additionalProperties)
            }

            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules.
             */
            @JsonProperty("address")
            fun address(address: ExternalBankAccountAddress) = apply { this.address = address }

            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            @JsonProperty("type") fun type(type: AccountType) = apply { this.type = type }

            @JsonProperty("user_defined_id")
            fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

            /**
             * Indicates whether verification was enforced for a given association record. For
             * MICRO_DEPOSIT, option to disable verification if the external bank account has
             * already been verified before. By default, verification will be required unless users
             * pass in a value of false
             */
            @JsonProperty("verification_enforcement")
            fun verificationEnforcement(verificationEnforcement: Boolean) = apply {
                this.verificationEnforcement = verificationEnforcement
            }

            @JsonProperty("verification_method")
            fun verificationMethod(verificationMethod: VerificationMethod) = apply {
                this.verificationMethod = verificationMethod
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

            fun build(): BankVerifiedCreateBankAccountApiRequest =
                BankVerifiedCreateBankAccountApiRequest(
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    accountToken,
                    address,
                    companyId,
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    dob,
                    doingBusinessAs,
                    name,
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    userDefinedId,
                    verificationEnforcement,
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class AccountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CHECKING = AccountType(JsonField.of("CHECKING"))

                @JvmField val SAVINGS = AccountType(JsonField.of("SAVINGS"))

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
        }
    }

    @JsonDeserialize(builder = PlaidCreateBankAccountApiRequest.Builder::class)
    @NoAutoDetect
    class PlaidCreateBankAccountApiRequest
    private constructor(
        private val accountToken: String?,
        private val companyId: String?,
        private val dob: LocalDate?,
        private val doingBusinessAs: String?,
        private val owner: String?,
        private val ownerType: OwnerType?,
        private val processorToken: String?,
        private val userDefinedId: String?,
        private val verificationMethod: VerificationMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        @JsonProperty("company_id") fun companyId(): String? = companyId

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): LocalDate? = dob

        @JsonProperty("doing_business_as") fun doingBusinessAs(): String? = doingBusinessAs

        @JsonProperty("owner") fun owner(): String? = owner

        @JsonProperty("owner_type") fun ownerType(): OwnerType? = ownerType

        @JsonProperty("processor_token") fun processorToken(): String? = processorToken

        @JsonProperty("user_defined_id") fun userDefinedId(): String? = userDefinedId

        @JsonProperty("verification_method")
        fun verificationMethod(): VerificationMethod? = verificationMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlaidCreateBankAccountApiRequest &&
                this.accountToken == other.accountToken &&
                this.companyId == other.companyId &&
                this.dob == other.dob &&
                this.doingBusinessAs == other.doingBusinessAs &&
                this.owner == other.owner &&
                this.ownerType == other.ownerType &&
                this.processorToken == other.processorToken &&
                this.userDefinedId == other.userDefinedId &&
                this.verificationMethod == other.verificationMethod &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountToken,
                        companyId,
                        dob,
                        doingBusinessAs,
                        owner,
                        ownerType,
                        processorToken,
                        userDefinedId,
                        verificationMethod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PlaidCreateBankAccountApiRequest{accountToken=$accountToken, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, owner=$owner, ownerType=$ownerType, processorToken=$processorToken, userDefinedId=$userDefinedId, verificationMethod=$verificationMethod, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountToken: String? = null
            private var companyId: String? = null
            private var dob: LocalDate? = null
            private var doingBusinessAs: String? = null
            private var owner: String? = null
            private var ownerType: OwnerType? = null
            private var processorToken: String? = null
            private var userDefinedId: String? = null
            private var verificationMethod: VerificationMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest) =
                apply {
                    this.accountToken = plaidCreateBankAccountApiRequest.accountToken
                    this.companyId = plaidCreateBankAccountApiRequest.companyId
                    this.dob = plaidCreateBankAccountApiRequest.dob
                    this.doingBusinessAs = plaidCreateBankAccountApiRequest.doingBusinessAs
                    this.owner = plaidCreateBankAccountApiRequest.owner
                    this.ownerType = plaidCreateBankAccountApiRequest.ownerType
                    this.processorToken = plaidCreateBankAccountApiRequest.processorToken
                    this.userDefinedId = plaidCreateBankAccountApiRequest.userDefinedId
                    this.verificationMethod = plaidCreateBankAccountApiRequest.verificationMethod
                    additionalProperties(plaidCreateBankAccountApiRequest.additionalProperties)
                }

            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            @JsonProperty("processor_token")
            fun processorToken(processorToken: String) = apply {
                this.processorToken = processorToken
            }

            @JsonProperty("user_defined_id")
            fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

            @JsonProperty("verification_method")
            fun verificationMethod(verificationMethod: VerificationMethod) = apply {
                this.verificationMethod = verificationMethod
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

            fun build(): PlaidCreateBankAccountApiRequest =
                PlaidCreateBankAccountApiRequest(
                    accountToken,
                    companyId,
                    dob,
                    doingBusinessAs,
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(processorToken) { "`processorToken` is required but was not set" },
                    userDefinedId,
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
