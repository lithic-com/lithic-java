package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ExternalBankAccountUpdateParams
constructor(
    private val externalBankAccountToken: String,
    private val owner: String?,
    private val ownerType: OwnerType?,
    private val name: String?,
    private val companyId: String?,
    private val address: ExternalBankAccountAddress?,
    private val dob: LocalDate?,
    private val doingBusinessAs: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalBankAccountToken(): String = externalBankAccountToken

    fun owner(): Optional<String> = Optional.ofNullable(owner)

    fun ownerType(): Optional<OwnerType> = Optional.ofNullable(ownerType)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun companyId(): Optional<String> = Optional.ofNullable(companyId)

    fun address(): Optional<ExternalBankAccountAddress> = Optional.ofNullable(address)

    fun dob(): Optional<LocalDate> = Optional.ofNullable(dob)

    fun doingBusinessAs(): Optional<String> = Optional.ofNullable(doingBusinessAs)

    @JvmSynthetic
    internal fun getBody(): ExternalBankAccountUpdateBody {
        return ExternalBankAccountUpdateBody(
            owner,
            ownerType,
            name,
            companyId,
            address,
            dob,
            doingBusinessAs,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalBankAccountToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalBankAccountUpdateBody.Builder::class)
    @NoAutoDetect
    class ExternalBankAccountUpdateBody
    internal constructor(
        private val owner: String?,
        private val ownerType: OwnerType?,
        private val name: String?,
        private val companyId: String?,
        private val address: ExternalBankAccountAddress?,
        private val dob: LocalDate?,
        private val doingBusinessAs: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("owner") fun owner(): String? = owner

        @JsonProperty("owner_type") fun ownerType(): OwnerType? = ownerType

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("company_id") fun companyId(): String? = companyId

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

            return other is ExternalBankAccountUpdateBody &&
                this.owner == other.owner &&
                this.ownerType == other.ownerType &&
                this.name == other.name &&
                this.companyId == other.companyId &&
                this.address == other.address &&
                this.dob == other.dob &&
                this.doingBusinessAs == other.doingBusinessAs &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        owner,
                        ownerType,
                        name,
                        companyId,
                        address,
                        dob,
                        doingBusinessAs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExternalBankAccountUpdateBody{owner=$owner, ownerType=$ownerType, name=$name, companyId=$companyId, address=$address, dob=$dob, doingBusinessAs=$doingBusinessAs, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var owner: String? = null
            private var ownerType: OwnerType? = null
            private var name: String? = null
            private var companyId: String? = null
            private var address: ExternalBankAccountAddress? = null
            private var dob: LocalDate? = null
            private var doingBusinessAs: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalBankAccountUpdateBody: ExternalBankAccountUpdateBody) =
                apply {
                    this.owner = externalBankAccountUpdateBody.owner
                    this.ownerType = externalBankAccountUpdateBody.ownerType
                    this.name = externalBankAccountUpdateBody.name
                    this.companyId = externalBankAccountUpdateBody.companyId
                    this.address = externalBankAccountUpdateBody.address
                    this.dob = externalBankAccountUpdateBody.dob
                    this.doingBusinessAs = externalBankAccountUpdateBody.doingBusinessAs
                    additionalProperties(externalBankAccountUpdateBody.additionalProperties)
                }

            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

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

            fun build(): ExternalBankAccountUpdateBody =
                ExternalBankAccountUpdateBody(
                    owner,
                    ownerType,
                    name,
                    companyId,
                    address,
                    dob,
                    doingBusinessAs,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountUpdateParams &&
            this.externalBankAccountToken == other.externalBankAccountToken &&
            this.owner == other.owner &&
            this.ownerType == other.ownerType &&
            this.name == other.name &&
            this.companyId == other.companyId &&
            this.address == other.address &&
            this.dob == other.dob &&
            this.doingBusinessAs == other.doingBusinessAs &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            externalBankAccountToken,
            owner,
            ownerType,
            name,
            companyId,
            address,
            dob,
            doingBusinessAs,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExternalBankAccountUpdateParams{externalBankAccountToken=$externalBankAccountToken, owner=$owner, ownerType=$ownerType, name=$name, companyId=$companyId, address=$address, dob=$dob, doingBusinessAs=$doingBusinessAs, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalBankAccountToken: String? = null
        private var owner: String? = null
        private var ownerType: OwnerType? = null
        private var name: String? = null
        private var companyId: String? = null
        private var address: ExternalBankAccountAddress? = null
        private var dob: LocalDate? = null
        private var doingBusinessAs: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountUpdateParams: ExternalBankAccountUpdateParams) =
            apply {
                this.externalBankAccountToken =
                    externalBankAccountUpdateParams.externalBankAccountToken
                this.owner = externalBankAccountUpdateParams.owner
                this.ownerType = externalBankAccountUpdateParams.ownerType
                this.name = externalBankAccountUpdateParams.name
                this.companyId = externalBankAccountUpdateParams.companyId
                this.address = externalBankAccountUpdateParams.address
                this.dob = externalBankAccountUpdateParams.dob
                this.doingBusinessAs = externalBankAccountUpdateParams.doingBusinessAs
                additionalQueryParams(externalBankAccountUpdateParams.additionalQueryParams)
                additionalHeaders(externalBankAccountUpdateParams.additionalHeaders)
                additionalBodyProperties(externalBankAccountUpdateParams.additionalBodyProperties)
            }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun owner(owner: String) = apply { this.owner = owner }

        fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

        fun name(name: String) = apply { this.name = name }

        fun companyId(companyId: String) = apply { this.companyId = companyId }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        fun address(address: ExternalBankAccountAddress) = apply { this.address = address }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = apply { this.dob = dob }

        fun doingBusinessAs(doingBusinessAs: String) = apply {
            this.doingBusinessAs = doingBusinessAs
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

        fun build(): ExternalBankAccountUpdateParams =
            ExternalBankAccountUpdateParams(
                checkNotNull(externalBankAccountToken) {
                    "`externalBankAccountToken` is required but was not set"
                },
                owner,
                ownerType,
                name,
                companyId,
                address,
                dob,
                doingBusinessAs,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
