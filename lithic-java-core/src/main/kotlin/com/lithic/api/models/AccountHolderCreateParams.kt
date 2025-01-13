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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Create an account holder and initiate the appropriate onboarding workflow. Account holders and
 * accounts have a 1:1 relationship. When an account holder is successfully created an associated
 * account is also created. All calls to this endpoint will return an immediate response - though in
 * some cases, the response may indicate the enrollment is under review or further action will be
 * needed to complete the account enrollment process. This endpoint can only be used on accounts
 * that are part of the program that the calling API key manages.
 */
class AccountHolderCreateParams
constructor(
    private val body: AccountHolderCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun kyb(): Optional<Kyb> = body.kyb()

    fun kyc(): Optional<Kyc> = body.kyc()

    fun kycExempt(): Optional<KycExempt> = body.kycExempt()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AccountHolderCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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

            return /* spotless:off */ other is AccountHolderCreateBody && kyb == other.kyb && kyc == other.kyc && kycExempt == other.kycExempt /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(kyb, kyc, kycExempt) /* spotless:on */

        override fun toString(): String =
            when {
                kyb != null -> "AccountHolderCreateBody{kyb=$kyb}"
                kyc != null -> "AccountHolderCreateBody{kyc=$kyc}"
                kycExempt != null -> "AccountHolderCreateBody{kycExempt=$kycExempt}"
                _json != null -> "AccountHolderCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountHolderCreateBody")
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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: AccountHolderCreateBody? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountHolderCreateParams: AccountHolderCreateParams) = apply {
            body = accountHolderCreateParams.body
            additionalHeaders = accountHolderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountHolderCreateParams.additionalQueryParams.toBuilder()
        }

        fun forKyb(kyb: Kyb) = apply { body = AccountHolderCreateBody.ofKyb(kyb) }

        fun forKyc(kyc: Kyc) = apply { body = AccountHolderCreateBody.ofKyc(kyc) }

        fun forKycExempt(kycExempt: KycExempt) = apply {
            body = AccountHolderCreateBody.ofKycExempt(kycExempt)
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

        fun build(): AccountHolderCreateParams =
            AccountHolderCreateParams(
                body ?: AccountHolderCreateBody(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountHolderCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
