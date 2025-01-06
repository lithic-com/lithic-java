// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ExternalBankAccountUpdateParams
constructor(
    private val externalBankAccountToken: String,
    private val body: ExternalBankAccountUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun externalBankAccountToken(): String = externalBankAccountToken

    /** Address */
    fun address(): Optional<ExternalBankAccountAddress> = body.address()

    /** Optional field that helps identify bank accounts in receipts */
    fun companyId(): Optional<String> = body.companyId()

    /** Date of Birth of the Individual that owns the external bank account */
    fun dob(): Optional<LocalDate> = body.dob()

    /** Doing Business As */
    fun doingBusinessAs(): Optional<String> = body.doingBusinessAs()

    /** The nickname for this External Bank Account */
    fun name(): Optional<String> = body.name()

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun owner(): Optional<String> = body.owner()

    /** Owner Type */
    fun ownerType(): Optional<OwnerType> = body.ownerType()

    /** User Defined ID */
    fun userDefinedId(): Optional<String> = body.userDefinedId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ExternalBankAccountUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalBankAccountToken
            else -> ""
        }
    }

    @NoAutoDetect
    class ExternalBankAccountUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("address") private val address: ExternalBankAccountAddress?,
        @JsonProperty("company_id") private val companyId: String?,
        @JsonProperty("dob") private val dob: LocalDate?,
        @JsonProperty("doing_business_as") private val doingBusinessAs: String?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("owner") private val owner: String?,
        @JsonProperty("owner_type") private val ownerType: OwnerType?,
        @JsonProperty("user_defined_id") private val userDefinedId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Address */
        @JsonProperty("address")
        fun address(): Optional<ExternalBankAccountAddress> = Optional.ofNullable(address)

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id")
        fun companyId(): Optional<String> = Optional.ofNullable(companyId)

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob") fun dob(): Optional<LocalDate> = Optional.ofNullable(dob)

        /** Doing Business As */
        @JsonProperty("doing_business_as")
        fun doingBusinessAs(): Optional<String> = Optional.ofNullable(doingBusinessAs)

        /** The nickname for this External Bank Account */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") fun owner(): Optional<String> = Optional.ofNullable(owner)

        /** Owner Type */
        @JsonProperty("owner_type")
        fun ownerType(): Optional<OwnerType> = Optional.ofNullable(ownerType)

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

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
                    address = externalBankAccountUpdateBody.address
                    companyId = externalBankAccountUpdateBody.companyId
                    dob = externalBankAccountUpdateBody.dob
                    doingBusinessAs = externalBankAccountUpdateBody.doingBusinessAs
                    name = externalBankAccountUpdateBody.name
                    owner = externalBankAccountUpdateBody.owner
                    ownerType = externalBankAccountUpdateBody.ownerType
                    userDefinedId = externalBankAccountUpdateBody.userDefinedId
                    additionalProperties =
                        externalBankAccountUpdateBody.additionalProperties.toMutableMap()
                }

            /** Address */
            fun address(address: ExternalBankAccountAddress?) = apply { this.address = address }

            /** Address */
            fun address(address: Optional<ExternalBankAccountAddress>) =
                address(address.orElse(null))

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: String?) = apply { this.companyId = companyId }

            /** Optional field that helps identify bank accounts in receipts */
            fun companyId(companyId: Optional<String>) = companyId(companyId.orElse(null))

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: LocalDate?) = apply { this.dob = dob }

            /** Date of Birth of the Individual that owns the external bank account */
            fun dob(dob: Optional<LocalDate>) = dob(dob.orElse(null))

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: String?) = apply {
                this.doingBusinessAs = doingBusinessAs
            }

            /** Doing Business As */
            fun doingBusinessAs(doingBusinessAs: Optional<String>) =
                doingBusinessAs(doingBusinessAs.orElse(null))

            /** The nickname for this External Bank Account */
            fun name(name: String?) = apply { this.name = name }

            /** The nickname for this External Bank Account */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: String?) = apply { this.owner = owner }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: Optional<String>) = owner(owner.orElse(null))

            /** Owner Type */
            fun ownerType(ownerType: OwnerType?) = apply { this.ownerType = ownerType }

            /** Owner Type */
            fun ownerType(ownerType: Optional<OwnerType>) = ownerType(ownerType.orElse(null))

            /** User Defined ID */
            fun userDefinedId(userDefinedId: String?) = apply { this.userDefinedId = userDefinedId }

            /** User Defined ID */
            fun userDefinedId(userDefinedId: Optional<String>) =
                userDefinedId(userDefinedId.orElse(null))

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

            return /* spotless:off */ other is ExternalBankAccountUpdateBody && address == other.address && companyId == other.companyId && dob == other.dob && doingBusinessAs == other.doingBusinessAs && name == other.name && owner == other.owner && ownerType == other.ownerType && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, companyId, dob, doingBusinessAs, name, owner, ownerType, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalBankAccountUpdateBody{address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, owner=$owner, ownerType=$ownerType, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalBankAccountToken: String? = null
        private var body: ExternalBankAccountUpdateBody.Builder =
            ExternalBankAccountUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalBankAccountUpdateParams: ExternalBankAccountUpdateParams) =
            apply {
                externalBankAccountToken = externalBankAccountUpdateParams.externalBankAccountToken
                body = externalBankAccountUpdateParams.body.toBuilder()
                additionalHeaders = externalBankAccountUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    externalBankAccountUpdateParams.additionalQueryParams.toBuilder()
            }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Address */
        fun address(address: ExternalBankAccountAddress?) = apply { body.address(address) }

        /** Address */
        fun address(address: Optional<ExternalBankAccountAddress>) = address(address.orElse(null))

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String?) = apply { body.companyId(companyId) }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: Optional<String>) = companyId(companyId.orElse(null))

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate?) = apply { body.dob(dob) }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: Optional<LocalDate>) = dob(dob.orElse(null))

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: String?) = apply {
            body.doingBusinessAs(doingBusinessAs)
        }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: Optional<String>) =
            doingBusinessAs(doingBusinessAs.orElse(null))

        /** The nickname for this External Bank Account */
        fun name(name: String?) = apply { body.name(name) }

        /** The nickname for this External Bank Account */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String?) = apply { body.owner(owner) }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: Optional<String>) = owner(owner.orElse(null))

        /** Owner Type */
        fun ownerType(ownerType: OwnerType?) = apply { body.ownerType(ownerType) }

        /** Owner Type */
        fun ownerType(ownerType: Optional<OwnerType>) = ownerType(ownerType.orElse(null))

        /** User Defined ID */
        fun userDefinedId(userDefinedId: String?) = apply { body.userDefinedId(userDefinedId) }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: Optional<String>) =
            userDefinedId(userDefinedId.orElse(null))

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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): ExternalBankAccountUpdateParams =
            ExternalBankAccountUpdateParams(
                checkNotNull(externalBankAccountToken) {
                    "`externalBankAccountToken` is required but was not set"
                },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountUpdateParams && externalBankAccountToken == other.externalBankAccountToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalBankAccountToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountUpdateParams{externalBankAccountToken=$externalBankAccountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
