package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class CardEmbedParams
constructor(
    private val embedRequest: String?,
    private val hmac: String?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
) {
    fun embedRequest(): Optional<String> = Optional.ofNullable(embedRequest)

    fun hmac(): Optional<String> = Optional.ofNullable(hmac)

    @JvmSynthetic
    internal fun toQueryParams(): ListMultimap<String, String> =
        CardEmbedQueryParams(embedRequest, hmac, additionalQueryParams).toQueryParams()

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    class CardEmbedQueryParams
    internal constructor(
        private val embedRequest: String?,
        private val hmac: String?,
        private val additionalProperties: ListMultimap<String, String>,
    ) {
        private var hashCode: Int = 0

        /** A base64 encoded JSON string of an EmbedRequest to specify which card to load. */
        fun embedRequest(): String? = embedRequest

        /** SHA2 HMAC of the embed_request JSON string with base64 digest. */
        fun hmac(): String? = hmac

        fun _additionalProperties(): ListMultimap<String, String> = additionalProperties

        fun toQueryParams(): ListMultimap<String, String> {
            val params = ArrayListMultimap.create<String, String>()
            this.embedRequest()?.let { params.put("embed_request", it.toString()) }
            this.hmac()?.let { params.put("hmac", it.toString()) }
            params.putAll(additionalProperties)
            return Multimaps.unmodifiableListMultimap(params)
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardEmbedQueryParams &&
                embedRequest == other.embedRequest &&
                hmac == other.hmac &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        embedRequest,
                        hmac,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardEmbedQueryParams{embedRequest=$embedRequest, hmac=$hmac, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var embedRequest: String? = null
            private var hmac: String? = null
            private var additionalProperties: ArrayListMultimap<String, String> =
                ArrayListMultimap.create()

            @JvmSynthetic
            internal fun from(cardEmbedQueryParams: CardEmbedQueryParams) = apply {
                this.embedRequest = cardEmbedQueryParams.embedRequest
                this.hmac = cardEmbedQueryParams.hmac
                additionalProperties(cardEmbedQueryParams.additionalProperties)
            }

            /** A base64 encoded JSON string of an EmbedRequest to specify which card to load. */
            fun embedRequest(embedRequest: String) = apply { this.embedRequest = embedRequest }

            /** SHA2 HMAC of the embed_request JSON string with base64 digest. */
            fun hmac(hmac: String) = apply { this.hmac = hmac }

            fun additionalProperties(additionalProperties: ListMultimap<String, String>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperties(key: String, value: String) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: ListMultimap<String, String>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): CardEmbedQueryParams =
                CardEmbedQueryParams(
                    embedRequest,
                    hmac,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardEmbedParams &&
            embedRequest == other.embedRequest &&
            hmac == other.hmac &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            embedRequest,
            hmac,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "CardEmbedParams{embedRequest=$embedRequest, hmac=$hmac, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var embedRequest: String? = null
        private var hmac: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(cardEmbedParams: CardEmbedParams) = apply {
            this.embedRequest = cardEmbedParams.embedRequest
            this.hmac = cardEmbedParams.hmac
            additionalQueryParams(cardEmbedParams.additionalQueryParams)
            additionalHeaders(cardEmbedParams.additionalHeaders)
        }

        /** A base64 encoded JSON string of an EmbedRequest to specify which card to load. */
        fun embedRequest(embedRequest: String) = apply { this.embedRequest = embedRequest }

        /** SHA2 HMAC of the embed_request JSON string with base64 digest. */
        fun hmac(hmac: String) = apply { this.hmac = hmac }

        fun additionalQueryParams(additionalQueryParams: ListMultimap<String, String>) = apply {
            this.additionalQueryParams.clear()
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAdditionalQueryParams(key: String, value: String) = apply {
            this.additionalQueryParams.put(key, value)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: ListMultimap<String, String>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun additionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.clear()
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAdditionalHeaders(key: String, value: String) = apply {
            this.additionalHeaders.put(key, value)
        }

        fun putAllAdditionalHeaders(additionalHeaders: ListMultimap<String, String>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun build(): CardEmbedParams =
            CardEmbedParams(
                embedRequest,
                hmac,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
            )
    }
}
