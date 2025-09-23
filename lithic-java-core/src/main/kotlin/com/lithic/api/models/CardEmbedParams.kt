// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects

/**
 * Handling full card PANs and CVV codes requires that you comply with the Payment Card Industry
 * Data Security Standards (PCI DSS). Some clients choose to reduce their compliance obligations by
 * leveraging our embedded card UI solution documented below.
 *
 * In this setup, PANs and CVV codes are presented to the end-user via a card UI that we provide,
 * optionally styled in the customer's branding using a specified css stylesheet. A user's browser
 * makes the request directly to api.lithic.com, so card PANs and CVVs never touch the API
 * customer's servers while full card data is displayed to their end-users. The response contains an
 * HTML document (see Embedded Card UI or Changelog for upcoming changes in January). This means
 * that the url for the request can be inserted straight into the `src` attribute of an iframe.
 *
 * ```html
 * <iframe id="card-iframe"
 *         src="https://sandbox.lithic.com/v1/embed/card?embed_request=eyJjc3MiO...;hmac=r8tx1..."
 *         allow="clipboard-write" class="content"></iframe>
 * ```
 *
 * You should compute the request payload on the server side. You can render it (or the whole
 * iframe) on the server or make an ajax call from your front end code, but **do not ever embed your
 * API key into front end code, as doing so introduces a serious security vulnerability**.
 */
class CardEmbedParams
private constructor(
    private val embedRequest: String,
    private val hmac: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A base64 encoded JSON string of an EmbedRequest to specify which card to load. */
    fun embedRequest(): String = embedRequest

    /** SHA256 HMAC of the embed_request JSON string with base64 digest. */
    fun hmac(): String = hmac

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardEmbedParams].
         *
         * The following fields are required:
         * ```java
         * .embedRequest()
         * .hmac()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardEmbedParams]. */
    class Builder internal constructor() {

        private var embedRequest: String? = null
        private var hmac: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardEmbedParams: CardEmbedParams) = apply {
            embedRequest = cardEmbedParams.embedRequest
            hmac = cardEmbedParams.hmac
            additionalHeaders = cardEmbedParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardEmbedParams.additionalQueryParams.toBuilder()
        }

        /** A base64 encoded JSON string of an EmbedRequest to specify which card to load. */
        fun embedRequest(embedRequest: String) = apply { this.embedRequest = embedRequest }

        /** SHA256 HMAC of the embed_request JSON string with base64 digest. */
        fun hmac(hmac: String) = apply { this.hmac = hmac }

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

        /**
         * Returns an immutable instance of [CardEmbedParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .embedRequest()
         * .hmac()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardEmbedParams =
            CardEmbedParams(
                checkRequired("embedRequest", embedRequest),
                checkRequired("hmac", hmac),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("embed_request", embedRequest)
                put("hmac", hmac)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardEmbedParams &&
            embedRequest == other.embedRequest &&
            hmac == other.hmac &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(embedRequest, hmac, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardEmbedParams{embedRequest=$embedRequest, hmac=$hmac, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
