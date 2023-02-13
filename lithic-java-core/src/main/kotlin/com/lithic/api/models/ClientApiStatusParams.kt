package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects

class ClientApiStatusParams
constructor(
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClientApiStatusParams &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(additionalQueryParams, additionalHeaders)
    }

    override fun toString() =
        "ClientApiStatusParams{additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clientApiStatusParams: ClientApiStatusParams) = apply {
            additionalQueryParams(clientApiStatusParams.additionalQueryParams)
            additionalHeaders(clientApiStatusParams.additionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putQueryParam(key: String, value: List<String>) = apply {
            this.additionalQueryParams.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParam)
        }

        fun removeQueryParam(key: String) = apply {
            this.additionalQueryParams.put(key, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(key: String, value: String) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.add(value)
        }

        fun putHeader(key: String, value: List<String>) = apply {
            this.additionalHeaders.getOrPut(key) { mutableListOf() }.addAll(value)
        }

        fun putAllHeaders(additionalHeaders: Map<String, List<String>>) = apply {
            additionalHeaders.forEach(this::putHeader)
        }

        fun removeHeader(key: String) = apply { this.additionalHeaders.put(key, mutableListOf()) }

        fun build(): ClientApiStatusParams =
            ClientApiStatusParams(
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable()
            )
    }
}
