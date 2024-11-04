// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AuthRuleUpdateParams
constructor(
    private val authRuleToken: String,
    private val allowedCountries: List<String>?,
    private val allowedMcc: List<String>?,
    private val blockedCountries: List<String>?,
    private val blockedMcc: List<String>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun authRuleToken(): String = authRuleToken

    fun allowedCountries(): Optional<List<String>> = Optional.ofNullable(allowedCountries)

    fun allowedMcc(): Optional<List<String>> = Optional.ofNullable(allowedMcc)

    fun blockedCountries(): Optional<List<String>> = Optional.ofNullable(blockedCountries)

    fun blockedMcc(): Optional<List<String>> = Optional.ofNullable(blockedMcc)

    @JvmSynthetic
    internal fun getBody(): AuthRuleUpdateBody {
        return AuthRuleUpdateBody(
            allowedCountries,
            allowedMcc,
            blockedCountries,
            blockedMcc,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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
        private val allowedCountries: List<String>?,
        private val allowedMcc: List<String>?,
        private val blockedCountries: List<String>?,
        private val blockedMcc: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Array of country codes for which the Auth Rule will permit transactions. Note that only
         * this field or `blocked_countries` can be used for a given Auth Rule.
         */
        @JsonProperty("allowed_countries") fun allowedCountries(): List<String>? = allowedCountries

        /**
         * Array of merchant category codes for which the Auth Rule will permit transactions. Note
         * that only this field or `blocked_mcc` can be used for a given Auth Rule.
         */
        @JsonProperty("allowed_mcc") fun allowedMcc(): List<String>? = allowedMcc

        /**
         * Array of country codes for which the Auth Rule will automatically decline transactions.
         * Note that only this field or `allowed_countries` can be used for a given Auth Rule.
         */
        @JsonProperty("blocked_countries") fun blockedCountries(): List<String>? = blockedCountries

        /**
         * Array of merchant category codes for which the Auth Rule will automatically decline
         * transactions. Note that only this field or `allowed_mcc` can be used for a given Auth
         * Rule.
         */
        @JsonProperty("blocked_mcc") fun blockedMcc(): List<String>? = blockedMcc

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var allowedCountries: List<String>? = null
            private var allowedMcc: List<String>? = null
            private var blockedCountries: List<String>? = null
            private var blockedMcc: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRuleUpdateBody: AuthRuleUpdateBody) = apply {
                this.allowedCountries = authRuleUpdateBody.allowedCountries
                this.allowedMcc = authRuleUpdateBody.allowedMcc
                this.blockedCountries = authRuleUpdateBody.blockedCountries
                this.blockedMcc = authRuleUpdateBody.blockedMcc
                additionalProperties(authRuleUpdateBody.additionalProperties)
            }

            /**
             * Array of country codes for which the Auth Rule will permit transactions. Note that
             * only this field or `blocked_countries` can be used for a given Auth Rule.
             */
            @JsonProperty("allowed_countries")
            fun allowedCountries(allowedCountries: List<String>) = apply {
                this.allowedCountries = allowedCountries
            }

            /**
             * Array of merchant category codes for which the Auth Rule will permit transactions.
             * Note that only this field or `blocked_mcc` can be used for a given Auth Rule.
             */
            @JsonProperty("allowed_mcc")
            fun allowedMcc(allowedMcc: List<String>) = apply { this.allowedMcc = allowedMcc }

            /**
             * Array of country codes for which the Auth Rule will automatically decline
             * transactions. Note that only this field or `allowed_countries` can be used for a
             * given Auth Rule.
             */
            @JsonProperty("blocked_countries")
            fun blockedCountries(blockedCountries: List<String>) = apply {
                this.blockedCountries = blockedCountries
            }

            /**
             * Array of merchant category codes for which the Auth Rule will automatically decline
             * transactions. Note that only this field or `allowed_mcc` can be used for a given Auth
             * Rule.
             */
            @JsonProperty("blocked_mcc")
            fun blockedMcc(blockedMcc: List<String>) = apply { this.blockedMcc = blockedMcc }

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
                    allowedCountries?.toImmutable(),
                    allowedMcc?.toImmutable(),
                    blockedCountries?.toImmutable(),
                    blockedMcc?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleUpdateBody && this.allowedCountries == other.allowedCountries && this.allowedMcc == other.allowedMcc && this.blockedCountries == other.blockedCountries && this.blockedMcc == other.blockedMcc && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(allowedCountries, allowedMcc, blockedCountries, blockedMcc, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AuthRuleUpdateBody{allowedCountries=$allowedCountries, allowedMcc=$allowedMcc, blockedCountries=$blockedCountries, blockedMcc=$blockedMcc, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleUpdateParams && this.authRuleToken == other.authRuleToken && this.allowedCountries == other.allowedCountries && this.allowedMcc == other.allowedMcc && this.blockedCountries == other.blockedCountries && this.blockedMcc == other.blockedMcc && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(authRuleToken, allowedCountries, allowedMcc, blockedCountries, blockedMcc, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AuthRuleUpdateParams{authRuleToken=$authRuleToken, allowedCountries=$allowedCountries, allowedMcc=$allowedMcc, blockedCountries=$blockedCountries, blockedMcc=$blockedMcc, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var allowedCountries: MutableList<String> = mutableListOf()
        private var allowedMcc: MutableList<String> = mutableListOf()
        private var blockedCountries: MutableList<String> = mutableListOf()
        private var blockedMcc: MutableList<String> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleUpdateParams: AuthRuleUpdateParams) = apply {
            this.authRuleToken = authRuleUpdateParams.authRuleToken
            this.allowedCountries(authRuleUpdateParams.allowedCountries ?: listOf())
            this.allowedMcc(authRuleUpdateParams.allowedMcc ?: listOf())
            this.blockedCountries(authRuleUpdateParams.blockedCountries ?: listOf())
            this.blockedMcc(authRuleUpdateParams.blockedMcc ?: listOf())
            additionalHeaders(authRuleUpdateParams.additionalHeaders)
            additionalQueryParams(authRuleUpdateParams.additionalQueryParams)
            additionalBodyProperties(authRuleUpdateParams.additionalBodyProperties)
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        /**
         * Array of country codes for which the Auth Rule will permit transactions. Note that only
         * this field or `blocked_countries` can be used for a given Auth Rule.
         */
        fun allowedCountries(allowedCountries: List<String>) = apply {
            this.allowedCountries.clear()
            this.allowedCountries.addAll(allowedCountries)
        }

        /**
         * Array of country codes for which the Auth Rule will permit transactions. Note that only
         * this field or `blocked_countries` can be used for a given Auth Rule.
         */
        fun addAllowedCountry(allowedCountry: String) = apply {
            this.allowedCountries.add(allowedCountry)
        }

        /**
         * Array of merchant category codes for which the Auth Rule will permit transactions. Note
         * that only this field or `blocked_mcc` can be used for a given Auth Rule.
         */
        fun allowedMcc(allowedMcc: List<String>) = apply {
            this.allowedMcc.clear()
            this.allowedMcc.addAll(allowedMcc)
        }

        /**
         * Array of merchant category codes for which the Auth Rule will permit transactions. Note
         * that only this field or `blocked_mcc` can be used for a given Auth Rule.
         */
        fun addAllowedMcc(allowedMcc: String) = apply { this.allowedMcc.add(allowedMcc) }

        /**
         * Array of country codes for which the Auth Rule will automatically decline transactions.
         * Note that only this field or `allowed_countries` can be used for a given Auth Rule.
         */
        fun blockedCountries(blockedCountries: List<String>) = apply {
            this.blockedCountries.clear()
            this.blockedCountries.addAll(blockedCountries)
        }

        /**
         * Array of country codes for which the Auth Rule will automatically decline transactions.
         * Note that only this field or `allowed_countries` can be used for a given Auth Rule.
         */
        fun addBlockedCountry(blockedCountry: String) = apply {
            this.blockedCountries.add(blockedCountry)
        }

        /**
         * Array of merchant category codes for which the Auth Rule will automatically decline
         * transactions. Note that only this field or `allowed_mcc` can be used for a given Auth
         * Rule.
         */
        fun blockedMcc(blockedMcc: List<String>) = apply {
            this.blockedMcc.clear()
            this.blockedMcc.addAll(blockedMcc)
        }

        /**
         * Array of merchant category codes for which the Auth Rule will automatically decline
         * transactions. Note that only this field or `allowed_mcc` can be used for a given Auth
         * Rule.
         */
        fun addBlockedMcc(blockedMcc: String) = apply { this.blockedMcc.add(blockedMcc) }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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
                if (allowedCountries.size == 0) null else allowedCountries.toImmutable(),
                if (allowedMcc.size == 0) null else allowedMcc.toImmutable(),
                if (blockedCountries.size == 0) null else blockedCountries.toImmutable(),
                if (blockedMcc.size == 0) null else blockedMcc.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
