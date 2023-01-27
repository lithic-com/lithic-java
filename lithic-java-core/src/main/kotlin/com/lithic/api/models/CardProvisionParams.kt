package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class CardProvisionParams
constructor(
    private val cardToken: String,
    private val digitalWallet: DigitalWallet?,
    private val nonce: String?,
    private val nonceSignature: String?,
    private val certificate: String?,
    private val accountToken: String?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {
    fun cardToken(): String = cardToken

    fun digitalWallet(): Optional<DigitalWallet> = Optional.ofNullable(digitalWallet)

    fun nonce(): Optional<String> = Optional.ofNullable(nonce)

    fun nonceSignature(): Optional<String> = Optional.ofNullable(nonceSignature)

    fun certificate(): Optional<String> = Optional.ofNullable(certificate)

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    @JvmSynthetic
    internal fun toBody(): CardProvisionBody =
        CardProvisionBody(
            digitalWallet,
            nonce,
            nonceSignature,
            certificate,
            accountToken,
            additionalBodyProperties
        )

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @NoAutoDetect
    class CardProvisionBody
    internal constructor(
        private val digitalWallet: DigitalWallet?,
        private val nonce: String?,
        private val nonceSignature: String?,
        private val certificate: String?,
        private val accountToken: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {
        private var hashCode: Int = 0

        /** Name of digital wallet provider. */
        @JsonProperty("digital_wallet") fun digitalWallet(): DigitalWallet? = digitalWallet

        /** Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's wallet. */
        @JsonProperty("nonce") fun nonce(): String? = nonce

        /** Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's wallet. */
        @JsonProperty("nonce_signature") fun nonceSignature(): String? = nonceSignature

        /**
         * Required for `APPLE_PAY`. Apple's public leaf certificate. Base64 encoded in PEM format
         * with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the
         * device's wallet.
         */
        @JsonProperty("certificate") fun certificate(): String? = certificate

        /**
         * Only required for multi-account users. Token identifying the account the card will be
         * associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardProvisionBody &&
                digitalWallet == other.digitalWallet &&
                nonce == other.nonce &&
                nonceSignature == other.nonceSignature &&
                certificate == other.certificate &&
                accountToken == other.accountToken &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        digitalWallet,
                        nonce,
                        nonceSignature,
                        certificate,
                        accountToken,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardProvisionBody{digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, certificate=$certificate, accountToken=$accountToken, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var digitalWallet: DigitalWallet? = null
            private var nonce: String? = null
            private var nonceSignature: String? = null
            private var certificate: String? = null
            private var accountToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardProvisionBody: CardProvisionBody) = apply {
                this.digitalWallet = cardProvisionBody.digitalWallet
                this.nonce = cardProvisionBody.nonce
                this.nonceSignature = cardProvisionBody.nonceSignature
                this.certificate = cardProvisionBody.certificate
                this.accountToken = cardProvisionBody.accountToken
                additionalProperties(cardProvisionBody.additionalProperties)
            }

            /** Name of digital wallet provider. */
            @JsonProperty("digital_wallet")
            fun digitalWallet(digitalWallet: DigitalWallet) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's wallet.
             */
            @JsonProperty("nonce") fun nonce(nonce: String) = apply { this.nonce = nonce }

            /**
             * Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's wallet.
             */
            @JsonProperty("nonce_signature")
            fun nonceSignature(nonceSignature: String) = apply {
                this.nonceSignature = nonceSignature
            }

            /**
             * Required for `APPLE_PAY`. Apple's public leaf certificate. Base64 encoded in PEM
             * format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by
             * the device's wallet.
             */
            @JsonProperty("certificate")
            fun certificate(certificate: String) = apply { this.certificate = certificate }

            /**
             * Only required for multi-account users. Token identifying the account the card will be
             * associated with. Only applicable if using account holder enrollment. See
             * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
             * information.
             */
            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

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
                    digitalWallet,
                    nonce,
                    nonceSignature,
                    certificate,
                    accountToken,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardProvisionParams &&
            cardToken == other.cardToken &&
            digitalWallet == other.digitalWallet &&
            nonce == other.nonce &&
            nonceSignature == other.nonceSignature &&
            certificate == other.certificate &&
            accountToken == other.accountToken &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardToken,
            digitalWallet,
            nonce,
            nonceSignature,
            certificate,
            accountToken,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardProvisionParams{cardToken=$cardToken, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, certificate=$certificate, accountToken=$accountToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var cardToken: String? = null
        private var digitalWallet: DigitalWallet? = null
        private var nonce: String? = null
        private var nonceSignature: String? = null
        private var certificate: String? = null
        private var accountToken: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProvisionParams: CardProvisionParams) = apply {
            this.cardToken = cardProvisionParams.cardToken
            this.digitalWallet = cardProvisionParams.digitalWallet
            this.nonce = cardProvisionParams.nonce
            this.nonceSignature = cardProvisionParams.nonceSignature
            this.certificate = cardProvisionParams.certificate
            this.accountToken = cardProvisionParams.accountToken
            additionalQueryParams(cardProvisionParams.additionalQueryParams)
            additionalHeaders(cardProvisionParams.additionalHeaders)
            additionalBodyProperties(cardProvisionParams.additionalBodyProperties)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            this.digitalWallet = digitalWallet
        }

        /** Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's wallet. */
        fun nonce(nonce: String) = apply { this.nonce = nonce }

        /** Required for `APPLE_PAY`. Base64 cryptographic nonce provided by the device's wallet. */
        fun nonceSignature(nonceSignature: String) = apply { this.nonceSignature = nonceSignature }

        /**
         * Required for `APPLE_PAY`. Apple's public leaf certificate. Base64 encoded in PEM format
         * with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the
         * device's wallet.
         */
        fun certificate(certificate: String) = apply { this.certificate = certificate }

        /**
         * Only required for multi-account users. Token identifying the account the card will be
         * associated with. Only applicable if using account holder enrollment. See
         * [Managing Your Program](https://docs.lithic.com/docs/managing-your-program) for more
         * information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperties(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CardProvisionParams =
            CardProvisionParams(
                cardToken!!,
                digitalWallet,
                nonce,
                nonceSignature,
                certificate,
                accountToken,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class DigitalWallet @JsonCreator private constructor(private val value: JsonField<String>) {
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWallet && value == other.value
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
                else ->
                    throw LithicInvalidDataException(
                        "Unknown CardProvisionBody.DigitalWallet: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
