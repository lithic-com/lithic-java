package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AuthRuleUpdateParams
constructor(
    private val authRuleToken: String,
    private val allowedMcc: List<String>?,
    private val blockedMcc: List<String>?,
    private val allowedCountries: List<String>?,
    private val blockedCountries: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun authRuleToken(): String = authRuleToken

    fun allowedMcc(): Optional<List<String>> = Optional.ofNullable(allowedMcc)

    fun blockedMcc(): Optional<List<String>> = Optional.ofNullable(blockedMcc)

    fun allowedCountries(): Optional<List<String>> = Optional.ofNullable(allowedCountries)

    fun blockedCountries(): Optional<List<String>> = Optional.ofNullable(blockedCountries)

    @JvmSynthetic
    internal fun getBody(): AuthRuleUpdateBody {
        return AuthRuleUpdateBody(
            allowedMcc,
            blockedMcc,
            allowedCountries,
            blockedCountries,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = AuthRuleUpdateBody.Builder::class)
    @NoAutoDetect
    class AuthRuleUpdateBody
    internal constructor(
        private val allowedMcc: List<String>?,
        private val blockedMcc: List<String>?,
        private val allowedCountries: List<String>?,
        private val blockedCountries: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Array of merchant category codes for which the Auth Rule will permit transactions. Note
         * that only this field or `blocked_mcc` can be used for a given Auth Rule.
         */
        @JsonProperty("allowed_mcc") fun allowedMcc(): List<String>? = allowedMcc

        /**
         * Array of merchant category codes for which the Auth Rule will automatically decline
         * transactions. Note that only this field or `allowed_mcc` can be used for a given Auth
         * Rule.
         */
        @JsonProperty("blocked_mcc") fun blockedMcc(): List<String>? = blockedMcc

        /**
         * Array of country codes for which the Auth Rule will permit transactions. Note that only
         * this field or `blocked_countries` can be used for a given Auth Rule.
         */
        @JsonProperty("allowed_countries") fun allowedCountries(): List<String>? = allowedCountries

        /**
         * Array of country codes for which the Auth Rule will automatically decline transactions.
         * Note that only this field or `allowed_countries` can be used for a given Auth Rule.
         */
        @JsonProperty("blocked_countries") fun blockedCountries(): List<String>? = blockedCountries

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthRuleUpdateBody &&
                this.allowedMcc == other.allowedMcc &&
                this.blockedMcc == other.blockedMcc &&
                this.allowedCountries == other.allowedCountries &&
                this.blockedCountries == other.blockedCountries &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        allowedMcc,
                        blockedMcc,
                        allowedCountries,
                        blockedCountries,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AuthRuleUpdateBody{allowedMcc=$allowedMcc, blockedMcc=$blockedMcc, allowedCountries=$allowedCountries, blockedCountries=$blockedCountries, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var allowedMcc: List<String>? = null
            private var blockedMcc: List<String>? = null
            private var allowedCountries: List<String>? = null
            private var blockedCountries: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleUpdateBody: AuthRuleUpdateBody) = apply {
                this.allowedMcc = authRuleUpdateBody.allowedMcc
                this.blockedMcc = authRuleUpdateBody.blockedMcc
                this.allowedCountries = authRuleUpdateBody.allowedCountries
                this.blockedCountries = authRuleUpdateBody.blockedCountries
                additionalProperties(authRuleUpdateBody.additionalProperties)
            }

            /**
             * Array of merchant category codes for which the Auth Rule will permit transactions.
             * Note that only this field or `blocked_mcc` can be used for a given Auth Rule.
             */
            @JsonProperty("allowed_mcc")
            fun allowedMcc(allowedMcc: List<String>) = apply { this.allowedMcc = allowedMcc }

            /**
             * Array of merchant category codes for which the Auth Rule will automatically decline
             * transactions. Note that only this field or `allowed_mcc` can be used for a given Auth
             * Rule.
             */
            @JsonProperty("blocked_mcc")
            fun blockedMcc(blockedMcc: List<String>) = apply { this.blockedMcc = blockedMcc }

            /**
             * Array of country codes for which the Auth Rule will permit transactions. Note that
             * only this field or `blocked_countries` can be used for a given Auth Rule.
             */
            @JsonProperty("allowed_countries")
            fun allowedCountries(allowedCountries: List<String>) = apply {
                this.allowedCountries = allowedCountries
            }

            /**
             * Array of country codes for which the Auth Rule will automatically decline
             * transactions. Note that only this field or `allowed_countries` can be used for a
             * given Auth Rule.
             */
            @JsonProperty("blocked_countries")
            fun blockedCountries(blockedCountries: List<String>) = apply {
                this.blockedCountries = blockedCountries
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

            fun build(): AuthRuleUpdateBody =
                AuthRuleUpdateBody(
                    allowedMcc?.toUnmodifiable(),
                    blockedMcc?.toUnmodifiable(),
                    allowedCountries?.toUnmodifiable(),
                    blockedCountries?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleUpdateParams &&
            this.authRuleToken == other.authRuleToken &&
            this.allowedMcc == other.allowedMcc &&
            this.blockedMcc == other.blockedMcc &&
            this.allowedCountries == other.allowedCountries &&
            this.blockedCountries == other.blockedCountries &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            authRuleToken,
            allowedMcc,
            blockedMcc,
            allowedCountries,
            blockedCountries,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AuthRuleUpdateParams{authRuleToken=$authRuleToken, allowedMcc=$allowedMcc, blockedMcc=$blockedMcc, allowedCountries=$allowedCountries, blockedCountries=$blockedCountries, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var allowedMcc: List<String>? = null
        private var blockedMcc: List<String>? = null
        private var allowedCountries: List<String>? = null
        private var blockedCountries: List<String>? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleUpdateParams: AuthRuleUpdateParams) = apply {
            this.authRuleToken = authRuleUpdateParams.authRuleToken
            this.allowedMcc = authRuleUpdateParams.allowedMcc
            this.blockedMcc = authRuleUpdateParams.blockedMcc
            this.allowedCountries = authRuleUpdateParams.allowedCountries
            this.blockedCountries = authRuleUpdateParams.blockedCountries
            additionalQueryParams(authRuleUpdateParams.additionalQueryParams)
            additionalHeaders(authRuleUpdateParams.additionalHeaders)
            additionalBodyProperties(authRuleUpdateParams.additionalBodyProperties)
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /**
         * Array of merchant category codes for which the Auth Rule will permit transactions. Note
         * that only this field or `blocked_mcc` can be used for a given Auth Rule.
         */
        fun allowedMcc(allowedMcc: List<String>) = apply { this.allowedMcc = allowedMcc }

        /**
         * Array of merchant category codes for which the Auth Rule will automatically decline
         * transactions. Note that only this field or `allowed_mcc` can be used for a given Auth
         * Rule.
         */
        fun blockedMcc(blockedMcc: List<String>) = apply { this.blockedMcc = blockedMcc }

        /**
         * Array of country codes for which the Auth Rule will permit transactions. Note that only
         * this field or `blocked_countries` can be used for a given Auth Rule.
         */
        fun allowedCountries(allowedCountries: List<String>) = apply {
            this.allowedCountries = allowedCountries
        }

        /**
         * Array of country codes for which the Auth Rule will automatically decline transactions.
         * Note that only this field or `allowed_countries` can be used for a given Auth Rule.
         */
        fun blockedCountries(blockedCountries: List<String>) = apply {
            this.blockedCountries = blockedCountries
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AuthRuleUpdateParams =
            AuthRuleUpdateParams(
                checkNotNull(authRuleToken) { "`authRuleToken` is required but was not set" },
                allowedMcc?.toUnmodifiable(),
                blockedMcc?.toUnmodifiable(),
                allowedCountries?.toUnmodifiable(),
                blockedCountries?.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
