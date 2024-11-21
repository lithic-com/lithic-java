// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class CardProvisionParams
constructor(
    private val cardToken: String,
    private val certificate: String?,
    private val clientDeviceId: String?,
    private val clientWalletAccountId: String?,
    private val digitalWallet: DigitalWallet?,
    private val nonce: String?,
    private val nonceSignature: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardToken(): String = cardToken

    fun certificate(): Optional<String> = Optional.ofNullable(certificate)

    fun clientDeviceId(): Optional<String> = Optional.ofNullable(clientDeviceId)

    fun clientWalletAccountId(): Optional<String> = Optional.ofNullable(clientWalletAccountId)

    fun digitalWallet(): Optional<DigitalWallet> = Optional.ofNullable(digitalWallet)

    fun nonce(): Optional<String> = Optional.ofNullable(nonce)

    fun nonceSignature(): Optional<String> = Optional.ofNullable(nonceSignature)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): CardProvisionBody {
        return CardProvisionBody(
            certificate,
            clientDeviceId,
            clientWalletAccountId,
            digitalWallet,
            nonce,
            nonceSignature,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = CardProvisionBody.Builder::class)
    @NoAutoDetect
    class CardProvisionBody
    internal constructor(
        private val certificate: String?,
        private val clientDeviceId: String?,
        private val clientWalletAccountId: String?,
        private val digitalWallet: DigitalWallet?,
        private val nonce: String?,
        private val nonceSignature: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        @JsonProperty("certificate") fun certificate(): String? = certificate

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        @JsonProperty("client_device_id") fun clientDeviceId(): String? = clientDeviceId

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        @JsonProperty("client_wallet_account_id")
        fun clientWalletAccountId(): String? = clientWalletAccountId

        /** Name of digital wallet provider. */
        @JsonProperty("digital_wallet") fun digitalWallet(): DigitalWallet? = digitalWallet

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce") fun nonce(): String? = nonce

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce_signature") fun nonceSignature(): String? = nonceSignature

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var certificate: String? = null
            private var clientDeviceId: String? = null
            private var clientWalletAccountId: String? = null
            private var digitalWallet: DigitalWallet? = null
            private var nonce: String? = null
            private var nonceSignature: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardProvisionBody: CardProvisionBody) = apply {
                this.certificate = cardProvisionBody.certificate
                this.clientDeviceId = cardProvisionBody.clientDeviceId
                this.clientWalletAccountId = cardProvisionBody.clientWalletAccountId
                this.digitalWallet = cardProvisionBody.digitalWallet
                this.nonce = cardProvisionBody.nonce
                this.nonceSignature = cardProvisionBody.nonceSignature
                additionalProperties(cardProvisionBody.additionalProperties)
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Apple's public leaf certificate. Base64 encoded in
             * PEM format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
             * Provided by the device's wallet.
             */
            @JsonProperty("certificate")
            fun certificate(certificate: String) = apply { this.certificate = certificate }

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Stable device identification set by the wallet provider.
             */
            @JsonProperty("client_device_id")
            fun clientDeviceId(clientDeviceId: String) = apply {
                this.clientDeviceId = clientDeviceId
            }

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Consumer ID that identifies the wallet account holder entity.
             */
            @JsonProperty("client_wallet_account_id")
            fun clientWalletAccountId(clientWalletAccountId: String) = apply {
                this.clientWalletAccountId = clientWalletAccountId
            }

            /** Name of digital wallet provider. */
            @JsonProperty("digital_wallet")
            fun digitalWallet(digitalWallet: DigitalWallet) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            @JsonProperty("nonce") fun nonce(nonce: String) = apply { this.nonce = nonce }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            @JsonProperty("nonce_signature")
            fun nonceSignature(nonceSignature: String) = apply {
                this.nonceSignature = nonceSignature
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

            fun build(): CardProvisionBody =
                CardProvisionBody(
                    certificate,
                    clientDeviceId,
                    clientWalletAccountId,
                    digitalWallet,
                    nonce,
                    nonceSignature,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardProvisionBody && certificate == other.certificate && clientDeviceId == other.clientDeviceId && clientWalletAccountId == other.clientWalletAccountId && digitalWallet == other.digitalWallet && nonce == other.nonce && nonceSignature == other.nonceSignature && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(certificate, clientDeviceId, clientWalletAccountId, digitalWallet, nonce, nonceSignature, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardProvisionBody{certificate=$certificate, clientDeviceId=$clientDeviceId, clientWalletAccountId=$clientWalletAccountId, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var certificate: String? = null
        private var clientDeviceId: String? = null
        private var clientWalletAccountId: String? = null
        private var digitalWallet: DigitalWallet? = null
        private var nonce: String? = null
        private var nonceSignature: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProvisionParams: CardProvisionParams) = apply {
            cardToken = cardProvisionParams.cardToken
            certificate = cardProvisionParams.certificate
            clientDeviceId = cardProvisionParams.clientDeviceId
            clientWalletAccountId = cardProvisionParams.clientWalletAccountId
            digitalWallet = cardProvisionParams.digitalWallet
            nonce = cardProvisionParams.nonce
            nonceSignature = cardProvisionParams.nonceSignature
            additionalHeaders = cardProvisionParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardProvisionParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = cardProvisionParams.additionalBodyProperties.toMutableMap()
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(certificate: String) = apply { this.certificate = certificate }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(clientDeviceId: String) = apply { this.clientDeviceId = clientDeviceId }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        fun clientWalletAccountId(clientWalletAccountId: String) = apply {
            this.clientWalletAccountId = clientWalletAccountId
        }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            this.digitalWallet = digitalWallet
        }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(nonce: String) = apply { this.nonce = nonce }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(nonceSignature: String) = apply { this.nonceSignature = nonceSignature }

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
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CardProvisionParams =
            CardProvisionParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                certificate,
                clientDeviceId,
                clientWalletAccountId,
                digitalWallet,
                nonce,
                nonceSignature,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class DigitalWallet
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWallet && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPLE_PAY = DigitalWallet(JsonField.of("APPLE_PAY"))

            @JvmField val GOOGLE_PAY = DigitalWallet(JsonField.of("GOOGLE_PAY"))

            @JvmField val SAMSUNG_PAY = DigitalWallet(JsonField.of("SAMSUNG_PAY"))

            @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
        }

        enum class Known {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
        }

        enum class Value {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE_PAY -> Value.GOOGLE_PAY
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE_PAY -> Known.GOOGLE_PAY
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                else -> throw LithicInvalidDataException("Unknown DigitalWallet: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProvisionParams && cardToken == other.cardToken && certificate == other.certificate && clientDeviceId == other.clientDeviceId && clientWalletAccountId == other.clientWalletAccountId && digitalWallet == other.digitalWallet && nonce == other.nonce && nonceSignature == other.nonceSignature && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, certificate, clientDeviceId, clientWalletAccountId, digitalWallet, nonce, nonceSignature, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CardProvisionParams{cardToken=$cardToken, certificate=$certificate, clientDeviceId=$clientDeviceId, clientWalletAccountId=$clientWalletAccountId, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
