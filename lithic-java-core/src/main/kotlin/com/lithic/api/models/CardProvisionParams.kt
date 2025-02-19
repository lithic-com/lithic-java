// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
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
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Allow your cardholders to directly add payment cards to the device's digital wallet (e.g. Apple
 * Pay) with one touch from your app.
 *
 * This requires some additional setup and configuration. Please
 * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
 * information.
 */
class CardProvisionParams
private constructor(
    private val cardToken: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun cardToken(): String = cardToken

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Apple's public leaf certificate. Base64 encoded in PEM format with headers
     * `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's wallet.
     */
    fun certificate(): Optional<String> = body.certificate()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Stable device identification set by the wallet provider.
     */
    fun clientDeviceId(): Optional<String> = body.clientDeviceId()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Consumer ID that identifies the wallet account holder entity.
     */
    fun clientWalletAccountId(): Optional<String> = body.clientWalletAccountId()

    /** Name of digital wallet provider. */
    fun digitalWallet(): Optional<DigitalWallet> = body.digitalWallet()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun nonce(): Optional<String> = body.nonce()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun nonceSignature(): Optional<String> = body.nonceSignature()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Apple's public leaf certificate. Base64 encoded in PEM format with headers
     * `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's wallet.
     */
    fun _certificate(): JsonField<String> = body._certificate()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Stable device identification set by the wallet provider.
     */
    fun _clientDeviceId(): JsonField<String> = body._clientDeviceId()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Consumer ID that identifies the wallet account holder entity.
     */
    fun _clientWalletAccountId(): JsonField<String> = body._clientWalletAccountId()

    /** Name of digital wallet provider. */
    fun _digitalWallet(): JsonField<DigitalWallet> = body._digitalWallet()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun _nonce(): JsonField<String> = body._nonce()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun _nonceSignature(): JsonField<String> = body._nonceSignature()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("certificate")
        @ExcludeMissing
        private val certificate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_device_id")
        @ExcludeMissing
        private val clientDeviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_wallet_account_id")
        @ExcludeMissing
        private val clientWalletAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        private val digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
        @JsonProperty("nonce")
        @ExcludeMissing
        private val nonce: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nonce_signature")
        @ExcludeMissing
        private val nonceSignature: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(): Optional<String> =
            Optional.ofNullable(certificate.getNullable("certificate"))

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(): Optional<String> =
            Optional.ofNullable(clientDeviceId.getNullable("client_device_id"))

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        fun clientWalletAccountId(): Optional<String> =
            Optional.ofNullable(clientWalletAccountId.getNullable("client_wallet_account_id"))

        /** Name of digital wallet provider. */
        fun digitalWallet(): Optional<DigitalWallet> =
            Optional.ofNullable(digitalWallet.getNullable("digital_wallet"))

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(): Optional<String> = Optional.ofNullable(nonce.getNullable("nonce"))

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(): Optional<String> =
            Optional.ofNullable(nonceSignature.getNullable("nonce_signature"))

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        @JsonProperty("certificate")
        @ExcludeMissing
        fun _certificate(): JsonField<String> = certificate

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        @JsonProperty("client_device_id")
        @ExcludeMissing
        fun _clientDeviceId(): JsonField<String> = clientDeviceId

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        @JsonProperty("client_wallet_account_id")
        @ExcludeMissing
        fun _clientWalletAccountId(): JsonField<String> = clientWalletAccountId

        /** Name of digital wallet provider. */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce") @ExcludeMissing fun _nonce(): JsonField<String> = nonce

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce_signature")
        @ExcludeMissing
        fun _nonceSignature(): JsonField<String> = nonceSignature

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            certificate()
            clientDeviceId()
            clientWalletAccountId()
            digitalWallet()
            nonce()
            nonceSignature()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var certificate: JsonField<String> = JsonMissing.of()
            private var clientDeviceId: JsonField<String> = JsonMissing.of()
            private var clientWalletAccountId: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var nonce: JsonField<String> = JsonMissing.of()
            private var nonceSignature: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                certificate = body.certificate
                clientDeviceId = body.clientDeviceId
                clientWalletAccountId = body.clientWalletAccountId
                digitalWallet = body.digitalWallet
                nonce = body.nonce
                nonceSignature = body.nonceSignature
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Apple's public leaf certificate. Base64 encoded in
             * PEM format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
             * Provided by the device's wallet.
             */
            fun certificate(certificate: String) = certificate(JsonField.of(certificate))

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Apple's public leaf certificate. Base64 encoded in
             * PEM format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
             * Provided by the device's wallet.
             */
            fun certificate(certificate: JsonField<String>) = apply {
                this.certificate = certificate
            }

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Stable device identification set by the wallet provider.
             */
            fun clientDeviceId(clientDeviceId: String) =
                clientDeviceId(JsonField.of(clientDeviceId))

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Stable device identification set by the wallet provider.
             */
            fun clientDeviceId(clientDeviceId: JsonField<String>) = apply {
                this.clientDeviceId = clientDeviceId
            }

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Consumer ID that identifies the wallet account holder entity.
             */
            fun clientWalletAccountId(clientWalletAccountId: String) =
                clientWalletAccountId(JsonField.of(clientWalletAccountId))

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Consumer ID that identifies the wallet account holder entity.
             */
            fun clientWalletAccountId(clientWalletAccountId: JsonField<String>) = apply {
                this.clientWalletAccountId = clientWalletAccountId
            }

            /** Name of digital wallet provider. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** Name of digital wallet provider. */
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonce(nonce: String) = nonce(JsonField.of(nonce))

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonce(nonce: JsonField<String>) = apply { this.nonce = nonce }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonceSignature(nonceSignature: String) =
                nonceSignature(JsonField.of(nonceSignature))

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonceSignature(nonceSignature: JsonField<String>) = apply {
                this.nonceSignature = nonceSignature
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

            fun build(): Body =
                Body(
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

            return /* spotless:off */ other is Body && certificate == other.certificate && clientDeviceId == other.clientDeviceId && clientWalletAccountId == other.clientWalletAccountId && digitalWallet == other.digitalWallet && nonce == other.nonce && nonceSignature == other.nonceSignature && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(certificate, clientDeviceId, clientWalletAccountId, digitalWallet, nonce, nonceSignature, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{certificate=$certificate, clientDeviceId=$clientDeviceId, clientWalletAccountId=$clientWalletAccountId, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardProvisionParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var cardToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardProvisionParams: CardProvisionParams) = apply {
            cardToken = cardProvisionParams.cardToken
            body = cardProvisionParams.body.toBuilder()
            additionalHeaders = cardProvisionParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardProvisionParams.additionalQueryParams.toBuilder()
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(certificate: String) = apply { body.certificate(certificate) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(certificate: JsonField<String>) = apply { body.certificate(certificate) }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(clientDeviceId: String) = apply { body.clientDeviceId(clientDeviceId) }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(clientDeviceId: JsonField<String>) = apply {
            body.clientDeviceId(clientDeviceId)
        }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        fun clientWalletAccountId(clientWalletAccountId: String) = apply {
            body.clientWalletAccountId(clientWalletAccountId)
        }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        fun clientWalletAccountId(clientWalletAccountId: JsonField<String>) = apply {
            body.clientWalletAccountId(clientWalletAccountId)
        }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            body.digitalWallet(digitalWallet)
        }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(nonce: String) = apply { body.nonce(nonce) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(nonce: JsonField<String>) = apply { body.nonce(nonce) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(nonceSignature: String) = apply { body.nonceSignature(nonceSignature) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(nonceSignature: JsonField<String>) = apply {
            body.nonceSignature(nonceSignature)
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

        fun build(): CardProvisionParams =
            CardProvisionParams(
                checkRequired("cardToken", cardToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Name of digital wallet provider. */
    class DigitalWallet @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APPLE_PAY = of("APPLE_PAY")

            @JvmField val GOOGLE_PAY = of("GOOGLE_PAY")

            @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

            @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
        }

        /** An enum containing [DigitalWallet]'s known values. */
        enum class Known {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
        }

        /**
         * An enum containing [DigitalWallet]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DigitalWallet] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
            /**
             * An enum member indicating that [DigitalWallet] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE_PAY -> Value.GOOGLE_PAY
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE_PAY -> Known.GOOGLE_PAY
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                else -> throw LithicInvalidDataException("Unknown DigitalWallet: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWallet && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProvisionParams && cardToken == other.cardToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardProvisionParams{cardToken=$cardToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
