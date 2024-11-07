// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ExternalBankAccountUpdateParams
constructor(
    private val externalBankAccountToken: String,
    private val address: ExternalBankAccountAddress?,
    private val companyId: String?,
    private val dob: LocalDate?,
    private val doingBusinessAs: String?,
    private val name: String?,
    private val owner: String?,
    private val ownerType: OwnerType?,
    private val userDefinedId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalBankAccountToken(): String = externalBankAccountToken

    fun address(): Optional<ExternalBankAccountAddress> = Optional.ofNullable(address)

    fun companyId(): Optional<String> = Optional.ofNullable(companyId)

    fun dob(): Optional<LocalDate> = Optional.ofNullable(dob)

    fun doingBusinessAs(): Optional<String> = Optional.ofNullable(doingBusinessAs)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun owner(): Optional<String> = Optional.ofNullable(owner)

    fun ownerType(): Optional<OwnerType> = Optional.ofNullable(ownerType)

    fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

    @JvmSynthetic
    internal fun getBody(): ExternalBankAccountUpdateBody {
        return ExternalBankAccountUpdateBody(
            address,
            companyId,
            dob,
            doingBusinessAs,
            name,
            owner,
            ownerType,
            userDefinedId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
        private val address: ExternalBankAccountAddress?,
        private val companyId: String?,
        private val dob: LocalDate?,
        private val doingBusinessAs: String?,
        private val name: String?,
        private val owner: String?,
        private val ownerType: OwnerType?,
        private val userDefinedId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Address */
        @JsonProperty("address") fun address(): ExternalBankAccountAddress? = address

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id") fun companyId(): String? = companyId

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): LocalDate? = dob

        /** Doing Business As */
        @JsonProperty("doing_business_as") fun doingBusinessAs(): String? = doingBusinessAs

        /** The nickname for this External Bank Account */
        @JsonProperty("name") fun name(): String? = name

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") fun owner(): String? = owner

        /** Owner Type */
        @JsonProperty("owner_type") fun ownerType(): OwnerType? = ownerType

        /** User Defined ID */
        @JsonProperty("user_defined_id") fun userDefinedId(): String? = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: ExternalBankAccountAddress? = null
            private var companyId: String? = null
            private var dob: LocalDate? = null
            private var doingBusinessAs: String? = null
            private var name: String? = null
            private var owner: String? = null
            private var ownerType: OwnerType? = null
            private var userDefinedId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalBankAccountUpdateBody: ExternalBankAccountUpdateBody) =
                apply {
                    this.address = externalBankAccountUpdateBody.address
                    this.companyId = externalBankAccountUpdateBody.companyId
                    this.dob = externalBankAccountUpdateBody.dob
                    this.doingBusinessAs = externalBankAccountUpdateBody.doingBusinessAs
                    this.name = externalBankAccountUpdateBody.name
                    this.owner = externalBankAccountUpdateBody.owner
                    this.ownerType = externalBankAccountUpdateBody.ownerType
                    this.userDefinedId = externalBankAccountUpdateBody.userDefinedId
                    additionalProperties(externalBankAccountUpdateBody.additionalProperties)
                }

            /** Address */
            @JsonProperty("address")
            fun address(address: ExternalBankAccountAddress) = apply { this.address = address }

            /** Optional field that helps identify bank accounts in receipts */
            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** Date of Birth of the Individual that owns the external bank account */
            @JsonProperty("dob") fun dob(dob: LocalDate) = apply { this.dob = dob }

            /** Doing Business As */
            @JsonProperty("doing_business_as")
            fun doingBusinessAs(doingBusinessAs: String) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** The nickname for this External Bank Account */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            @JsonProperty("owner") fun owner(owner: String) = apply { this.owner = owner }

            /** Owner Type */
            @JsonProperty("owner_type")
            fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

            /** User Defined ID */
            @JsonProperty("user_defined_id")
            fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

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
                    address,
                    companyId,
                    dob,
                    doingBusinessAs,
                    name,
                    owner,
                    ownerType,
                    userDefinedId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalBankAccountUpdateBody && this.address == other.address && this.companyId == other.companyId && this.dob == other.dob && this.doingBusinessAs == other.doingBusinessAs && this.name == other.name && this.owner == other.owner && this.ownerType == other.ownerType && this.userDefinedId == other.userDefinedId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, companyId, dob, doingBusinessAs, name, owner, ownerType, userDefinedId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalBankAccountUpdateBody{address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, owner=$owner, ownerType=$ownerType, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountUpdateParams && this.externalBankAccountToken == other.externalBankAccountToken && this.address == other.address && this.companyId == other.companyId && this.dob == other.dob && this.doingBusinessAs == other.doingBusinessAs && this.name == other.name && this.owner == other.owner && this.ownerType == other.ownerType && this.userDefinedId == other.userDefinedId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalBankAccountToken, address, companyId, dob, doingBusinessAs, name, owner, ownerType, userDefinedId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExternalBankAccountUpdateParams{externalBankAccountToken=$externalBankAccountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, owner=$owner, ownerType=$ownerType, userDefinedId=$userDefinedId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalBankAccountToken: String? = null
        private var address: ExternalBankAccountAddress? = null
        private var companyId: String? = null
        private var dob: LocalDate? = null
        private var doingBusinessAs: String? = null
        private var name: String? = null
        private var owner: String? = null
        private var ownerType: OwnerType? = null
        private var userDefinedId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalBankAccountUpdateParams: ExternalBankAccountUpdateParams) =
            apply {
                this.externalBankAccountToken =
                    externalBankAccountUpdateParams.externalBankAccountToken
                this.address = externalBankAccountUpdateParams.address
                this.companyId = externalBankAccountUpdateParams.companyId
                this.dob = externalBankAccountUpdateParams.dob
                this.doingBusinessAs = externalBankAccountUpdateParams.doingBusinessAs
                this.name = externalBankAccountUpdateParams.name
                this.owner = externalBankAccountUpdateParams.owner
                this.ownerType = externalBankAccountUpdateParams.ownerType
                this.userDefinedId = externalBankAccountUpdateParams.userDefinedId
                additionalHeaders(externalBankAccountUpdateParams.additionalHeaders)
                additionalQueryParams(externalBankAccountUpdateParams.additionalQueryParams)
                additionalBodyProperties(externalBankAccountUpdateParams.additionalBodyProperties)
            }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Address */
        fun address(address: ExternalBankAccountAddress) = apply { this.address = address }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String) = apply { this.companyId = companyId }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = apply { this.dob = dob }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: String) = apply {
            this.doingBusinessAs = doingBusinessAs
        }

        /** The nickname for this External Bank Account */
        fun name(name: String) = apply { this.name = name }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String) = apply { this.owner = owner }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = apply { this.ownerType = ownerType }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

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
                address,
                companyId,
                dob,
                doingBusinessAs,
                name,
                owner,
                ownerType,
                userDefinedId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
