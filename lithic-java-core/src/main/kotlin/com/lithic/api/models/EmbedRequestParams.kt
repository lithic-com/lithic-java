package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = EmbedRequestParams.Builder::class)
@NoAutoDetect
class EmbedRequestParams
private constructor(
    private val accountToken: JsonField<String>,
    private val css: JsonField<String>,
    private val expiration: JsonField<String>,
    private val token: JsonField<String>,
    private val targetOrigin: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {
    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Only needs to be included if one or more end-users have been enrolled. */
    fun accountToken(): Optional<String> =
        Optional.ofNullable(accountToken.getNullable("account_token"))

    /**
     * A publicly available URI, so the white-labeled card element can be styled with the client's
     * branding.
     */
    fun css(): Optional<String> = Optional.ofNullable(css.getNullable("css"))

    /**
     * An ISO 8601 timestamp for when the request should expire. UTC time zone.
     *
     * If no timezone is specified, UTC will be used. If payload does not contain an expiration, the
     * request will never expire.
     *
     * Using an `expiration` reduces the risk of a
     * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
     * `expiration`, in the event that a malicious user gets a copy of your request in transit, they
     * will be able to obtain the response data indefinitely.
     */
    fun expiration(): Optional<String> = Optional.ofNullable(expiration.getNullable("expiration"))

    /** Globally unique identifier for the card to be displayed. */
    fun token(): String = token.getRequired("token")

    /**
     * Required if you want to post the element clicked to the parent iframe.
     *
     * If you supply this param, you can also capture click events in the parent iframe by adding an
     * event listener.
     */
    fun targetOrigin(): Optional<String> =
        Optional.ofNullable(targetOrigin.getNullable("target_origin"))

    /** Only needs to be included if one or more end-users have been enrolled. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /**
     * A publicly available URI, so the white-labeled card element can be styled with the client's
     * branding.
     */
    @JsonProperty("css") @ExcludeMissing fun _css() = css

    /**
     * An ISO 8601 timestamp for when the request should expire. UTC time zone.
     *
     * If no timezone is specified, UTC will be used. If payload does not contain an expiration, the
     * request will never expire.
     *
     * Using an `expiration` reduces the risk of a
     * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
     * `expiration`, in the event that a malicious user gets a copy of your request in transit, they
     * will be able to obtain the response data indefinitely.
     */
    @JsonProperty("expiration") @ExcludeMissing fun _expiration() = expiration

    /** Globally unique identifier for the card to be displayed. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * Required if you want to post the element clicked to the parent iframe.
     *
     * If you supply this param, you can also capture click events in the parent iframe by adding an
     * event listener.
     */
    @JsonProperty("target_origin") @ExcludeMissing fun _targetOrigin() = targetOrigin

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            accountToken()
            css()
            expiration()
            token()
            targetOrigin()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmbedRequestParams &&
            accountToken == other.accountToken &&
            css == other.css &&
            expiration == other.expiration &&
            token == other.token &&
            targetOrigin == other.targetOrigin &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountToken,
                    css,
                    expiration,
                    token,
                    targetOrigin,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EmbedRequestParams{accountToken=$accountToken, css=$css, expiration=$expiration, token=$token, targetOrigin=$targetOrigin, additionalProperties=$additionalProperties}"

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var css: JsonField<String> = JsonMissing.of()
        private var expiration: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var targetOrigin: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(embedRequestParams: EmbedRequestParams) = apply {
            this.accountToken = embedRequestParams.accountToken
            this.css = embedRequestParams.css
            this.expiration = embedRequestParams.expiration
            this.token = embedRequestParams.token
            this.targetOrigin = embedRequestParams.targetOrigin
            additionalProperties(embedRequestParams.additionalProperties)
        }

        /** Only needs to be included if one or more end-users have been enrolled. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Only needs to be included if one or more end-users have been enrolled. */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * A publicly available URI, so the white-labeled card element can be styled with the
         * client's branding.
         */
        fun css(css: String) = css(JsonField.of(css))

        /**
         * A publicly available URI, so the white-labeled card element can be styled with the
         * client's branding.
         */
        @JsonProperty("css")
        @ExcludeMissing
        fun css(css: JsonField<String>) = apply { this.css = css }

        /**
         * An ISO 8601 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an expiration,
         * the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
         * `expiration`, in the event that a malicious user gets a copy of your request in transit,
         * they will be able to obtain the response data indefinitely.
         */
        fun expiration(expiration: String) = expiration(JsonField.of(expiration))

        /**
         * An ISO 8601 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an expiration,
         * the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
         * `expiration`, in the event that a malicious user gets a copy of your request in transit,
         * they will be able to obtain the response data indefinitely.
         */
        @JsonProperty("expiration")
        @ExcludeMissing
        fun expiration(expiration: JsonField<String>) = apply { this.expiration = expiration }

        /** Globally unique identifier for the card to be displayed. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the card to be displayed. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe by
         * adding an event listener.
         */
        fun targetOrigin(targetOrigin: String) = targetOrigin(JsonField.of(targetOrigin))

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe by
         * adding an event listener.
         */
        @JsonProperty("target_origin")
        @ExcludeMissing
        fun targetOrigin(targetOrigin: JsonField<String>) = apply {
            this.targetOrigin = targetOrigin
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

        fun build(): EmbedRequestParams =
            EmbedRequestParams(
                accountToken,
                css,
                expiration,
                token,
                targetOrigin,
                additionalProperties.toUnmodifiable(),
            )
    }
}
