// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AccountHolderCreateParams
constructor(
    private val kyb: Kyb?,
    private val kyc: Kyc?,
    private val kycExempt: KycExempt?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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

            return /* spotless:off */ other is AccountHolderCreateBody && this.kyb == other.kyb && this.kyc == other.kyc && this.kycExempt == other.kycExempt /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(kyb, kyc, kycExempt) /* spotless:on */
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

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderCreateParams && this.kyb == other.kyb && this.kyc == other.kyc && this.kycExempt == other.kycExempt && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(kyb, kyc, kycExempt, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "AccountHolderCreateParams{kyb=$kyb, kyc=$kyc, kycExempt=$kycExempt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var kyb: Kyb? = null
        private var kyc: Kyc? = null
        private var kycExempt: KycExempt? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(accountHolderCreateParams: AccountHolderCreateParams) = apply {
            this.kyb = accountHolderCreateParams.kyb
            this.kyc = accountHolderCreateParams.kyc
            this.kycExempt = accountHolderCreateParams.kycExempt
            additionalHeaders(accountHolderCreateParams.additionalHeaders)
            additionalQueryParams(accountHolderCreateParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): AccountHolderCreateParams =
            AccountHolderCreateParams(
                kyb,
                kyc,
                kycExempt,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
