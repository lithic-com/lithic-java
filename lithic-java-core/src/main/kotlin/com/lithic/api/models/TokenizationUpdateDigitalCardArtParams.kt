// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * This endpoint is used update the digital card art for a digital wallet tokenization. A successful
 * response indicates that the card network has updated the tokenization's art, and the
 * tokenization's `digital_cart_art_token` field was updated. The endpoint may not be used on
 * tokenizations with status `DEACTIVATED`. Note that this updates the art for one specific
 * tokenization, not all tokenizations for a card. New tokenizations for a card will be created with
 * the art referenced in the card object's `digital_card_art_token` field. Reach out at
 * [lithic.com/contact](https://lithic.com/contact) for more information.
 */
class TokenizationUpdateDigitalCardArtParams
private constructor(
    private val tokenizationToken: String,
    private val body: TokenizationUpdateDigitalCardArtBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tokenizationToken(): String = tokenizationToken

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet for a
     * tokenization. This artwork must be approved by the network and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    fun digitalCardArtToken(): Optional<String> = body.digitalCardArtToken()

    /**
     * Specifies the digital card art to be displayed in the user’s digital wallet for a
     * tokenization. This artwork must be approved by the network and configured by Lithic to use.
     * See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    fun _digitalCardArtToken(): JsonField<String> = body._digitalCardArtToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): TokenizationUpdateDigitalCardArtBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> tokenizationToken
            else -> ""
        }
    }

    @NoAutoDetect
    class TokenizationUpdateDigitalCardArtBody
    @JsonCreator
    internal constructor(
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        private val digitalCardArtToken: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet for a
         * tokenization. This artwork must be approved by the network and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(): Optional<String> =
            Optional.ofNullable(digitalCardArtToken.getNullable("digital_card_art_token"))

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet for a
         * tokenization. This artwork must be approved by the network and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        @JsonProperty("digital_card_art_token")
        @ExcludeMissing
        fun _digitalCardArtToken(): JsonField<String> = digitalCardArtToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TokenizationUpdateDigitalCardArtBody = apply {
            if (validated) {
                return@apply
            }

            digitalCardArtToken()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TokenizationUpdateDigitalCardArtBody]. */
        class Builder internal constructor() {

            private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                tokenizationUpdateDigitalCardArtBody: TokenizationUpdateDigitalCardArtBody
            ) = apply {
                digitalCardArtToken = tokenizationUpdateDigitalCardArtBody.digitalCardArtToken
                additionalProperties =
                    tokenizationUpdateDigitalCardArtBody.additionalProperties.toMutableMap()
            }

            /**
             * Specifies the digital card art to be displayed in the user’s digital wallet for a
             * tokenization. This artwork must be approved by the network and configured by Lithic
             * to use. See
             * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
             */
            fun digitalCardArtToken(digitalCardArtToken: String) =
                digitalCardArtToken(JsonField.of(digitalCardArtToken))

            /**
             * Specifies the digital card art to be displayed in the user’s digital wallet for a
             * tokenization. This artwork must be approved by the network and configured by Lithic
             * to use. See
             * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
             */
            fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
                this.digitalCardArtToken = digitalCardArtToken
            }

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

            fun build(): TokenizationUpdateDigitalCardArtBody =
                TokenizationUpdateDigitalCardArtBody(
                    digitalCardArtToken,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationUpdateDigitalCardArtBody && digitalCardArtToken == other.digitalCardArtToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(digitalCardArtToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationUpdateDigitalCardArtBody{digitalCardArtToken=$digitalCardArtToken, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenizationUpdateDigitalCardArtParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var tokenizationToken: String? = null
        private var body: TokenizationUpdateDigitalCardArtBody.Builder =
            TokenizationUpdateDigitalCardArtBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            tokenizationUpdateDigitalCardArtParams: TokenizationUpdateDigitalCardArtParams
        ) = apply {
            tokenizationToken = tokenizationUpdateDigitalCardArtParams.tokenizationToken
            body = tokenizationUpdateDigitalCardArtParams.body.toBuilder()
            additionalHeaders = tokenizationUpdateDigitalCardArtParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                tokenizationUpdateDigitalCardArtParams.additionalQueryParams.toBuilder()
        }

        fun tokenizationToken(tokenizationToken: String) = apply {
            this.tokenizationToken = tokenizationToken
        }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet for a
         * tokenization. This artwork must be approved by the network and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) = apply {
            body.digitalCardArtToken(digitalCardArtToken)
        }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet for a
         * tokenization. This artwork must be approved by the network and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            body.digitalCardArtToken(digitalCardArtToken)
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

        fun build(): TokenizationUpdateDigitalCardArtParams =
            TokenizationUpdateDigitalCardArtParams(
                checkRequired("tokenizationToken", tokenizationToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationUpdateDigitalCardArtParams && tokenizationToken == other.tokenizationToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tokenizationToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TokenizationUpdateDigitalCardArtParams{tokenizationToken=$tokenizationToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
