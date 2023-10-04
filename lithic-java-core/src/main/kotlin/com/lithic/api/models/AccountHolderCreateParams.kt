// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AccountHolderCreateParams
constructor(
    private val kyb: Kyb?,
    private val kyc: Kyc?,
    private val kycExempt: KycExempt?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun kyb(): Optional<Kyb> = Optional.ofNullable(kyb)

    fun kyc(): Optional<Kyc> = Optional.ofNullable(kyc)

    fun kycExempt(): Optional<KycExempt> = Optional.ofNullable(kycExempt)

    @JvmSynthetic
    internal fun getBody(): AccountHolderCreateBody {
        return AccountHolderCreateBody(
            kyb,
            kyc,
            kycExempt,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(using = AccountHolderCreateBody.Deserializer::class)
    @JsonSerialize(using = AccountHolderCreateBody.Serializer::class)
    class AccountHolderCreateBody
    internal constructor(
        private val kyb: Kyb? = null,
        private val kyc: Kyc? = null,
        private val kycExempt: KycExempt? = null,
        private val _json: JsonValue? = null,
    ) {

        fun kyb(): Optional<Kyb> = Optional.ofNullable(kyb)
        fun kyc(): Optional<Kyc> = Optional.ofNullable(kyc)
        fun kycExempt(): Optional<KycExempt> = Optional.ofNullable(kycExempt)

        fun isKyb(): Boolean = kyb != null
        fun isKyc(): Boolean = kyc != null
        fun isKycExempt(): Boolean = kycExempt != null

        fun asKyb(): Kyb = kyb.getOrThrow("kyb")
        fun asKyc(): Kyc = kyc.getOrThrow("kyc")
        fun asKycExempt(): KycExempt = kycExempt.getOrThrow("kycExempt")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                kyb != null -> visitor.visitKyb(kyb)
                kyc != null -> visitor.visitKyc(kyc)
                kycExempt != null -> visitor.visitKycExempt(kycExempt)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolderCreateBody &&
                this.kyb == other.kyb &&
                this.kyc == other.kyc &&
                this.kycExempt == other.kycExempt
        }

        override fun hashCode(): Int {
            return Objects.hash(
                kyb,
                kyc,
                kycExempt,
            )
        }

        override fun toString(): String {
            return when {
                kyb != null -> "AccountHolderCreateBody{kyb=$kyb}"
                kyc != null -> "AccountHolderCreateBody{kyc=$kyc}"
                kycExempt != null -> "AccountHolderCreateBody{kycExempt=$kycExempt}"
                _json != null -> "AccountHolderCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountHolderCreateBody")
            }
        }

        companion object {

            @JvmStatic fun ofKyb(kyb: Kyb) = AccountHolderCreateBody(kyb = kyb)

            @JvmStatic fun ofKyc(kyc: Kyc) = AccountHolderCreateBody(kyc = kyc)

            @JvmStatic
            fun ofKycExempt(kycExempt: KycExempt) = AccountHolderCreateBody(kycExempt = kycExempt)
        }

        interface Visitor<out T> {

            fun visitKyb(kyb: Kyb): T

            fun visitKyc(kyc: Kyc): T

            fun visitKycExempt(kycExempt: KycExempt): T

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown AccountHolderCreateBody: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<AccountHolderCreateBody>(AccountHolderCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AccountHolderCreateBody {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<Kyb>())?.let {
                    return AccountHolderCreateBody(kyb = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Kyc>())?.let {
                    return AccountHolderCreateBody(kyc = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<KycExempt>())?.let {
                    return AccountHolderCreateBody(kycExempt = it, _json = json)
                }

                return AccountHolderCreateBody(_json = json)
            }
        }

        class Serializer : BaseSerializer<AccountHolderCreateBody>(AccountHolderCreateBody::class) {

            override fun serialize(
                value: AccountHolderCreateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.kyb != null -> generator.writeObject(value.kyb)
                    value.kyc != null -> generator.writeObject(value.kyc)
                    value.kycExempt != null -> generator.writeObject(value.kycExempt)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AccountHolderCreateBody")
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

        return other is AccountHolderCreateParams &&
            this.kyb == other.kyb &&
            this.kyc == other.kyc &&
            this.kycExempt == other.kycExempt &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            kyb,
            kyc,
            kycExempt,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AccountHolderCreateParams{kyb=$kyb, kyc=$kyc, kycExempt=$kycExempt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var kyb: Kyb? = null
        private var kyc: Kyc? = null
        private var kycExempt: KycExempt? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderCreateParams: AccountHolderCreateParams) = apply {
            this.kyb = accountHolderCreateParams.kyb
            this.kyc = accountHolderCreateParams.kyc
            this.kycExempt = accountHolderCreateParams.kycExempt
            additionalQueryParams(accountHolderCreateParams.additionalQueryParams)
            additionalHeaders(accountHolderCreateParams.additionalHeaders)
        }

        fun forKyb(kyb: Kyb) = apply {
            this.kyb = kyb
            this.kyc = null
            this.kycExempt = null
        }
        fun forKyc(kyc: Kyc) = apply {
            this.kyb = null
            this.kyc = kyc
            this.kycExempt = null
        }
        fun forKycExempt(kycExempt: KycExempt) = apply {
            this.kyb = null
            this.kyc = null
            this.kycExempt = kycExempt
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

        fun build(): AccountHolderCreateParams =
            AccountHolderCreateParams(
                kyb,
                kyc,
                kycExempt,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
