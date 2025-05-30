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
import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
    private val cardToken: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken)

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Apple's public leaf certificate. Base64 encoded in PEM format with headers
     * `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's wallet.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certificate(): Optional<String> = body.certificate()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Stable device identification set by the wallet provider.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientDeviceId(): Optional<String> = body.clientDeviceId()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Consumer ID that identifies the wallet account holder entity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientWalletAccountId(): Optional<String> = body.clientWalletAccountId()

    /**
     * Name of digital wallet provider.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalWallet(): Optional<DigitalWallet> = body.digitalWallet()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nonce(): Optional<String> = body.nonce()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nonceSignature(): Optional<String> = body.nonceSignature()

    /**
     * Returns the raw JSON value of [certificate].
     *
     * Unlike [certificate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _certificate(): JsonField<String> = body._certificate()

    /**
     * Returns the raw JSON value of [clientDeviceId].
     *
     * Unlike [clientDeviceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientDeviceId(): JsonField<String> = body._clientDeviceId()

    /**
     * Returns the raw JSON value of [clientWalletAccountId].
     *
     * Unlike [clientWalletAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _clientWalletAccountId(): JsonField<String> = body._clientWalletAccountId()

    /**
     * Returns the raw JSON value of [digitalWallet].
     *
     * Unlike [digitalWallet], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _digitalWallet(): JsonField<DigitalWallet> = body._digitalWallet()

    /**
     * Returns the raw JSON value of [nonce].
     *
     * Unlike [nonce], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nonce(): JsonField<String> = body._nonce()

    /**
     * Returns the raw JSON value of [nonceSignature].
     *
     * Unlike [nonceSignature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nonceSignature(): JsonField<String> = body._nonceSignature()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CardProvisionParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CardProvisionParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardProvisionParams]. */
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

        fun cardToken(cardToken: String?) = apply { this.cardToken = cardToken }

        /** Alias for calling [Builder.cardToken] with `cardToken.orElse(null)`. */
        fun cardToken(cardToken: Optional<String>) = cardToken(cardToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [certificate]
         * - [clientDeviceId]
         * - [clientWalletAccountId]
         * - [digitalWallet]
         * - [nonce]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(certificate: String) = apply { body.certificate(certificate) }

        /**
         * Sets [Builder.certificate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certificate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun certificate(certificate: JsonField<String>) = apply { body.certificate(certificate) }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(clientDeviceId: String) = apply { body.clientDeviceId(clientDeviceId) }

        /**
         * Sets [Builder.clientDeviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientDeviceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.clientWalletAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientWalletAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientWalletAccountId(clientWalletAccountId: JsonField<String>) = apply {
            body.clientWalletAccountId(clientWalletAccountId)
        }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * Sets [Builder.digitalWallet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalWallet] with a well-typed [DigitalWallet] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(nonce: String) = apply { body.nonce(nonce) }

        /**
         * Sets [Builder.nonce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonce] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nonce(nonce: JsonField<String>) = apply { body.nonce(nonce) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(nonceSignature: String) = apply { body.nonceSignature(nonceSignature) }

        /**
         * Sets [Builder.nonceSignature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonceSignature] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [CardProvisionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardProvisionParams =
            CardProvisionParams(
                cardToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val certificate: JsonField<String>,
        private val clientDeviceId: JsonField<String>,
        private val clientWalletAccountId: JsonField<String>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val nonce: JsonField<String>,
        private val nonceSignature: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("certificate")
            @ExcludeMissing
            certificate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_device_id")
            @ExcludeMissing
            clientDeviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_wallet_account_id")
            @ExcludeMissing
            clientWalletAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
            @JsonProperty("nonce") @ExcludeMissing nonce: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nonce_signature")
            @ExcludeMissing
            nonceSignature: JsonField<String> = JsonMissing.of(),
        ) : this(
            certificate,
            clientDeviceId,
            clientWalletAccountId,
            digitalWallet,
            nonce,
            nonceSignature,
            mutableMapOf(),
        )

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun certificate(): Optional<String> = certificate.getOptional("certificate")

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientDeviceId(): Optional<String> = clientDeviceId.getOptional("client_device_id")

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientWalletAccountId(): Optional<String> =
            clientWalletAccountId.getOptional("client_wallet_account_id")

        /**
         * Name of digital wallet provider.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun digitalWallet(): Optional<DigitalWallet> = digitalWallet.getOptional("digital_wallet")

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nonce(): Optional<String> = nonce.getOptional("nonce")

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nonceSignature(): Optional<String> = nonceSignature.getOptional("nonce_signature")

        /**
         * Returns the raw JSON value of [certificate].
         *
         * Unlike [certificate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("certificate")
        @ExcludeMissing
        fun _certificate(): JsonField<String> = certificate

        /**
         * Returns the raw JSON value of [clientDeviceId].
         *
         * Unlike [clientDeviceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("client_device_id")
        @ExcludeMissing
        fun _clientDeviceId(): JsonField<String> = clientDeviceId

        /**
         * Returns the raw JSON value of [clientWalletAccountId].
         *
         * Unlike [clientWalletAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("client_wallet_account_id")
        @ExcludeMissing
        fun _clientWalletAccountId(): JsonField<String> = clientWalletAccountId

        /**
         * Returns the raw JSON value of [digitalWallet].
         *
         * Unlike [digitalWallet], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

        /**
         * Returns the raw JSON value of [nonce].
         *
         * Unlike [nonce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nonce") @ExcludeMissing fun _nonce(): JsonField<String> = nonce

        /**
         * Returns the raw JSON value of [nonceSignature].
         *
         * Unlike [nonceSignature], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nonce_signature")
        @ExcludeMissing
        fun _nonceSignature(): JsonField<String> = nonceSignature

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
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
             * Sets [Builder.certificate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certificate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.clientDeviceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientDeviceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.clientWalletAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientWalletAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun clientWalletAccountId(clientWalletAccountId: JsonField<String>) = apply {
                this.clientWalletAccountId = clientWalletAccountId
            }

            /** Name of digital wallet provider. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /**
             * Sets [Builder.digitalWallet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalWallet] with a well-typed [DigitalWallet]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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
             * Sets [Builder.nonce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nonce] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.nonceSignature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nonceSignature] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    certificate,
                    clientDeviceId,
                    clientWalletAccountId,
                    digitalWallet,
                    nonce,
                    nonceSignature,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            certificate()
            clientDeviceId()
            clientWalletAccountId()
            digitalWallet().ifPresent { it.validate() }
            nonce()
            nonceSignature()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (certificate.asKnown().isPresent) 1 else 0) +
                (if (clientDeviceId.asKnown().isPresent) 1 else 0) +
                (if (clientWalletAccountId.asKnown().isPresent) 1 else 0) +
                (digitalWallet.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nonce.asKnown().isPresent) 1 else 0) +
                (if (nonceSignature.asKnown().isPresent) 1 else 0)

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

        private var validated: Boolean = false

        fun validate(): DigitalWallet = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
