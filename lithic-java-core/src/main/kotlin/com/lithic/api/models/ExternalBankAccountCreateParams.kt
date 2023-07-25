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
    private val plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest?,
    private val bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
        Optional.ofNullable(plaidCreateBankAccountApiRequest)

    fun bankVerifiedCreateBankAccountApiRequest():
        Optional<BankVerifiedCreateBankAccountApiRequest> =
        Optional.ofNullable(bankVerifiedCreateBankAccountApiRequest)

    @JvmSynthetic
    internal fun getBody(): ExternalBankAccountCreateBody {
        return ExternalBankAccountCreateBody(
            plaidCreateBankAccountApiRequest,
            bankVerifiedCreateBankAccountApiRequest
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(using = ExternalBankAccountCreateBody.Deserializer::class)
    @JsonSerialize(using = ExternalBankAccountCreateBody.Serializer::class)
    class ExternalBankAccountCreateBody
    internal constructor(
        private val plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest? = null,
        private val bankVerifiedCreateBankAccountApiRequest:
            BankVerifiedCreateBankAccountApiRequest? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
            Optional.ofNullable(plaidCreateBankAccountApiRequest)
        fun bankVerifiedCreateBankAccountApiRequest():
            Optional<BankVerifiedCreateBankAccountApiRequest> =
            Optional.ofNullable(bankVerifiedCreateBankAccountApiRequest)

        fun isPlaidCreateBankAccountApiRequest(): Boolean = plaidCreateBankAccountApiRequest != null
        fun isBankVerifiedCreateBankAccountApiRequest(): Boolean =
            bankVerifiedCreateBankAccountApiRequest != null

        fun asPlaidCreateBankAccountApiRequest(): PlaidCreateBankAccountApiRequest =
            plaidCreateBankAccountApiRequest.getOrThrow("plaidCreateBankAccountApiRequest")
        fun asBankVerifiedCreateBankAccountApiRequest(): BankVerifiedCreateBankAccountApiRequest =
            bankVerifiedCreateBankAccountApiRequest.getOrThrow(
                "bankVerifiedCreateBankAccountApiRequest"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                plaidCreateBankAccountApiRequest != null ->
                    visitor.visitPlaidCreateBankAccountApiRequest(plaidCreateBankAccountApiRequest)
                bankVerifiedCreateBankAccountApiRequest != null ->
                    visitor.visitBankVerifiedCreateBankAccountApiRequest(
                        bankVerifiedCreateBankAccountApiRequest
                    )
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalBankAccountCreateBody &&
                this.plaidCreateBankAccountApiRequest == other.plaidCreateBankAccountApiRequest &&
                this.bankVerifiedCreateBankAccountApiRequest ==
                    other.bankVerifiedCreateBankAccountApiRequest
        }

        override fun hashCode(): Int {
            return Objects.hash(
                plaidCreateBankAccountApiRequest,
                bankVerifiedCreateBankAccountApiRequest
            )
        }

        override fun toString(): String {
            return when {
                plaidCreateBankAccountApiRequest != null ->
                    "ExternalBankAccountCreateBody{plaidCreateBankAccountApiRequest=$plaidCreateBankAccountApiRequest}"
                bankVerifiedCreateBankAccountApiRequest != null ->
                    "ExternalBankAccountCreateBody{bankVerifiedCreateBankAccountApiRequest=$bankVerifiedCreateBankAccountApiRequest}"
                _json != null -> "ExternalBankAccountCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ExternalBankAccountCreateBody")
            }
        }

        companion object {

            @JvmStatic
            fun ofPlaidCreateBankAccountApiRequest(
                plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
            ) =
                ExternalBankAccountCreateBody(
                    plaidCreateBankAccountApiRequest = plaidCreateBankAccountApiRequest
                )

            @JvmStatic
            fun ofBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ) =
                ExternalBankAccountCreateBody(
                    bankVerifiedCreateBankAccountApiRequest =
                        bankVerifiedCreateBankAccountApiRequest
                )
        }

        interface Visitor<out T> {

            fun visitPlaidCreateBankAccountApiRequest(
                plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
            ): T

            fun visitBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ): T

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown ExternalBankAccountCreateBody: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<ExternalBankAccountCreateBody>(ExternalBankAccountCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ExternalBankAccountCreateBody {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<PlaidCreateBankAccountApiRequest>())?.let {
                    return ExternalBankAccountCreateBody(
                        plaidCreateBankAccountApiRequest = it,
                        _json = json
                    )
                }
                tryDeserialize(node, jacksonTypeRef<BankVerifiedCreateBankAccountApiRequest>())
                    ?.let {
                        return ExternalBankAccountCreateBody(
                            bankVerifiedCreateBankAccountApiRequest = it,
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
                    value.plaidCreateBankAccountApiRequest != null ->
                        generator.writeObject(value.plaidCreateBankAccountApiRequest)
                    value.bankVerifiedCreateBankAccountApiRequest != null ->
                        generator.writeObject(value.bankVerifiedCreateBankAccountApiRequest)
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
            this.plaidCreateBankAccountApiRequest == other.plaidCreateBankAccountApiRequest &&
            this.bankVerifiedCreateBankAccountApiRequest ==
                other.bankVerifiedCreateBankAccountApiRequest &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            plaidCreateBankAccountApiRequest,
            bankVerifiedCreateBankAccountApiRequest,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ExternalBankAccountCreateParams{plaidCreateBankAccountApiRequest=$plaidCreateBankAccountApiRequest, bankVerifiedCreateBankAccountApiRequest=$bankVerifiedCreateBankAccountApiRequest, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest? = null
        private var bankVerifiedCreateBankAccountApiRequest:
            BankVerifiedCreateBankAccountApiRequest? =
            null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountCreateParams: ExternalBankAccountCreateParams) =
            apply {
                this.plaidCreateBankAccountApiRequest =
                    externalBankAccountCreateParams.plaidCreateBankAccountApiRequest
                this.bankVerifiedCreateBankAccountApiRequest =
                    externalBankAccountCreateParams.bankVerifiedCreateBankAccountApiRequest
                additionalQueryParams(externalBankAccountCreateParams.additionalQueryParams)
                additionalHeaders(externalBankAccountCreateParams.additionalHeaders)
            }

        fun forPlaidCreateBankAccountApiRequest(
            plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
        ) = apply {
            this.plaidCreateBankAccountApiRequest = plaidCreateBankAccountApiRequest
            this.bankVerifiedCreateBankAccountApiRequest = null
        }
        fun forBankVerifiedCreateBankAccountApiRequest(
            bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
        ) = apply {
            this.plaidCreateBankAccountApiRequest = null
            this.bankVerifiedCreateBankAccountApiRequest = bankVerifiedCreateBankAccountApiRequest
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
                plaidCreateBankAccountApiRequest,
                bankVerifiedCreateBankAccountApiRequest,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = PlaidCreateBankAccountApiRequest.Builder::class)
    @NoAutoDetect
    class PlaidCreateBankAccountApiRequest
    private constructor(
        private val verificationMethod: VerificationMethod?,
        private val ownerType: OwnerType?,
        private val owner: String?,
        private val accountToken: String?,
        private val companyId: String?,
        private val processorToken: String?,
        private val dob: LocalDate?,
        private val doingBusinessAs: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("verification_method")
        fun verificationMethod(): VerificationMethod? = verificationMethod

        @JsonProperty("owner_type") fun ownerType(): OwnerType? = ownerType

        @JsonProperty("owner") fun owner(): String? = owner

        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        @JsonProperty("company_id") fun companyId(): String? = companyId

        @JsonProperty("processor_token") fun processorToken(): String? = processorToken

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): LocalDate? = dob

        @JsonProperty("doing_business_as") fun doingBusinessAs(): String? = doingBusinessAs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlaidCreateBankAccountApiRequest &&
                this.verificationMethod == other.verificationMethod &&
                this.ownerType == other.ownerType &&
                this.owner == other.owner &&
                this.accountToken == other.accountToken &&
                this.companyId == other.companyId &&
                this.processorToken == other.processorToken &&
                this.dob == other.dob &&
                this.doingBusinessAs == other.doingBusinessAs &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        verificationMethod,
                        ownerType,
                        owner,
                        accountToken,
                        companyId,
                        processorToken,
                        dob,
                        doingBusinessAs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PlaidCreateBankAccountApiRequest{verificationMethod=$verificationMethod, ownerType=$ownerType, owner=$owner, accountToken=$accountToken, companyId=$companyId, processorToken=$processorToken, dob=$dob, doingBusinessAs=$doingBusinessAs, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var verificationMethod: VerificationMethod? = null
            private var ownerType: OwnerType? = null
            private var owner: String? = null
            private var accountToken: String? = null
            private var companyId: String? = null
            private var processorToken: String? = null
            private var dob: LocalDate? = null
            private var doingBusinessAs: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest) =
                apply {
                    this.verificationMethod = plaidCreateBankAccountApiRequest.verificationMethod
                    this.ownerType = plaidCreateBankAccountApiRequest.ownerType
                    this.owner = plaidCreateBankAccountApiRequest.owner
                    this.accountToken = plaidCreateBankAccountApiRequest.accountToken
                    this.companyId = plaidCreateBankAccountApiRequest.companyId
                    this.processorToken = plaidCreateBankAccountApiRequest.processorToken
                    this.dob = plaidCreateBankAccountApiRequest.dob
                    this.doingBusinessAs = plaidCreateBankAccountApiRequest.doingBusinessAs
                    additionalProperties(plaidCreateBankAccountApiRequest.additionalProperties)
                }

            @JsonProperty("verification_method")
            fun verificationMethod(verificationMethod: VerificationMethod) = apply {
                this.verificationMethod = verificationMethod
            }

            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            @JsonProperty("processor_token")
            fun processorToken(processorToken: String) = apply {
                this.processorToken = processorToken
            }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
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
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    accountToken,
                    companyId,
                    checkNotNull(processorToken) { "`processorToken` is required but was not set" },
                    dob,
                    doingBusinessAs,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = BankVerifiedCreateBankAccountApiRequest.Builder::class)
    @NoAutoDetect
    class BankVerifiedCreateBankAccountApiRequest
    private constructor(
        private val verificationMethod: VerificationMethod?,
        private val ownerType: OwnerType?,
        private val owner: String?,
        private val accountToken: String?,
        private val companyId: String?,
        private val type: AccountType?,
        private val routingNumber: String?,
        private val accountNumber: String?,
        private val name: String?,
        private val country: String?,
        private val currency: String?,
        private val verificationEnforcement: Boolean?,
        private val address: ExternalBankAccountAddress?,
        private val dob: LocalDate?,
        private val doingBusinessAs: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("verification_method")
        fun verificationMethod(): VerificationMethod? = verificationMethod

        @JsonProperty("owner_type") fun ownerType(): OwnerType? = ownerType

        @JsonProperty("owner") fun owner(): String? = owner

        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        @JsonProperty("company_id") fun companyId(): String? = companyId

        @JsonProperty("type") fun type(): AccountType? = type

        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("country") fun country(): String? = country

        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Indicates whether verification was enforced for a given association record. For
         * MICRO_DEPOSIT, option to disable verification if the external bank account has already
         * been verified before. By default, verification will be required unless users pass in a
         * value of false
         */
        @JsonProperty("verification_enforcement")
        fun verificationEnforcement(): Boolean? = verificationEnforcement

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        @JsonProperty("address") fun address(): ExternalBankAccountAddress? = address

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): LocalDate? = dob

        @JsonProperty("doing_business_as") fun doingBusinessAs(): String? = doingBusinessAs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BankVerifiedCreateBankAccountApiRequest &&
                this.verificationMethod == other.verificationMethod &&
                this.ownerType == other.ownerType &&
                this.owner == other.owner &&
                this.accountToken == other.accountToken &&
                this.companyId == other.companyId &&
                this.type == other.type &&
                this.routingNumber == other.routingNumber &&
                this.accountNumber == other.accountNumber &&
                this.name == other.name &&
                this.country == other.country &&
                this.currency == other.currency &&
                this.verificationEnforcement == other.verificationEnforcement &&
                this.address == other.address &&
                this.dob == other.dob &&
                this.doingBusinessAs == other.doingBusinessAs &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        verificationMethod,
                        ownerType,
                        owner,
                        accountToken,
                        companyId,
                        type,
                        routingNumber,
                        accountNumber,
                        name,
                        country,
                        currency,
                        verificationEnforcement,
                        address,
                        dob,
                        doingBusinessAs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BankVerifiedCreateBankAccountApiRequest{verificationMethod=$verificationMethod, ownerType=$ownerType, owner=$owner, accountToken=$accountToken, companyId=$companyId, type=$type, routingNumber=$routingNumber, accountNumber=$accountNumber, name=$name, country=$country, currency=$currency, verificationEnforcement=$verificationEnforcement, address=$address, dob=$dob, doingBusinessAs=$doingBusinessAs, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var verificationMethod: VerificationMethod? = null
            private var ownerType: OwnerType? = null
            private var owner: String? = null
            private var accountToken: String? = null
            private var companyId: String? = null
            private var type: AccountType? = null
            private var routingNumber: String? = null
            private var accountNumber: String? = null
            private var name: String? = null
            private var country: String? = null
            private var currency: String? = null
            private var verificationEnforcement: Boolean? = null
            private var address: ExternalBankAccountAddress? = null
            private var dob: LocalDate? = null
            private var doingBusinessAs: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ) = apply {
                this.verificationMethod = bankVerifiedCreateBankAccountApiRequest.verificationMethod
                this.ownerType = bankVerifiedCreateBankAccountApiRequest.ownerType
                this.owner = bankVerifiedCreateBankAccountApiRequest.owner
                this.accountToken = bankVerifiedCreateBankAccountApiRequest.accountToken
                this.companyId = bankVerifiedCreateBankAccountApiRequest.companyId
                this.type = bankVerifiedCreateBankAccountApiRequest.type
                this.routingNumber = bankVerifiedCreateBankAccountApiRequest.routingNumber
                this.accountNumber = bankVerifiedCreateBankAccountApiRequest.accountNumber
                this.name = bankVerifiedCreateBankAccountApiRequest.name
                this.country = bankVerifiedCreateBankAccountApiRequest.country
                this.currency = bankVerifiedCreateBankAccountApiRequest.currency
                this.verificationEnforcement =
                    bankVerifiedCreateBankAccountApiRequest.verificationEnforcement
                this.address = bankVerifiedCreateBankAccountApiRequest.address
                this.dob = bankVerifiedCreateBankAccountApiRequest.dob
                this.doingBusinessAs = bankVerifiedCreateBankAccountApiRequest.doingBusinessAs
                additionalProperties(bankVerifiedCreateBankAccountApiRequest.additionalProperties)
            }

            @JsonProperty("verification_method")
            fun verificationMethod(verificationMethod: VerificationMethod) = apply {
                this.verificationMethod = verificationMethod
            }

            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            @JsonProperty("type") fun type(type: AccountType) = apply { this.type = type }

            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

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

            /**
             * Address used during Address Verification Service (AVS) checks during transactions if
             * enabled via Auth Rules.
             */
            @JsonProperty("address")
            fun address(address: ExternalBankAccountAddress) = apply { this.address = address }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
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
                    checkNotNull(verificationMethod) {
                        "`verificationMethod` is required but was not set"
                    },
                    checkNotNull(ownerType) { "`ownerType` is required but was not set" },
                    checkNotNull(owner) { "`owner` is required but was not set" },
                    accountToken,
                    companyId,
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    name,
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    verificationEnforcement,
                    address,
                    dob,
                    doingBusinessAs,
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
}
