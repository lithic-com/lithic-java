package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class AuthStreamEnrollmentEnrollParams
constructor(
    private val webhookUrl: String?,
    private val additionalQueryParams: ListMultimap<String, String>,
    private val additionalHeaders: ListMultimap<String, String>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {
    fun webhookUrl(): Optional<String> = Optional.ofNullable(webhookUrl)

    @JvmSynthetic
    internal fun toBody(): AuthStreamEnrollmentEnrollBody =
        AuthStreamEnrollmentEnrollBody(webhookUrl, additionalBodyProperties)

    @JvmSynthetic internal fun toQueryParams(): ListMultimap<String, String> = additionalQueryParams

    @JvmSynthetic internal fun toHeaders(): ListMultimap<String, String> = additionalHeaders

    @NoAutoDetect
    class AuthStreamEnrollmentEnrollBody
    internal constructor(
        private val webhookUrl: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {
        private var hashCode: Int = 0

        /** A user-specified url to receive and respond to ASA request. */
        @JsonProperty("webhook_url") fun webhookUrl(): String? = webhookUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthStreamEnrollmentEnrollBody &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(webhookUrl, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "AuthStreamEnrollmentEnrollBody{webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder {
            private var webhookUrl: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authStreamEnrollmentEnrollBody: AuthStreamEnrollmentEnrollBody) =
                apply {
                    this.webhookUrl = authStreamEnrollmentEnrollBody.webhookUrl
                    additionalProperties(authStreamEnrollmentEnrollBody.additionalProperties)
                }

            /** A user-specified url to receive and respond to ASA request. */
            @JsonProperty("webhook_url")
            fun webhookUrl(webhookUrl: String) = apply { this.webhookUrl = webhookUrl }

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

            fun build(): AuthStreamEnrollmentEnrollBody =
                AuthStreamEnrollmentEnrollBody(webhookUrl, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): ListMultimap<String, String> = additionalQueryParams

    fun _additionalHeaders(): ListMultimap<String, String> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthStreamEnrollmentEnrollParams &&
            webhookUrl == other.webhookUrl &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalHeaders == other.additionalHeaders &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            webhookUrl,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AuthStreamEnrollmentEnrollParams{webhookUrl=$webhookUrl, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {
        private var webhookUrl: String? = null
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authStreamEnrollmentEnrollParams: AuthStreamEnrollmentEnrollParams) =
            apply {
                this.webhookUrl = authStreamEnrollmentEnrollParams.webhookUrl
                additionalQueryParams(authStreamEnrollmentEnrollParams.additionalQueryParams)
                additionalHeaders(authStreamEnrollmentEnrollParams.additionalHeaders)
                additionalBodyProperties(authStreamEnrollmentEnrollParams.additionalBodyProperties)
            }

        /** A user-specified url to receive and respond to ASA request. */
        fun webhookUrl(webhookUrl: String) = apply { this.webhookUrl = webhookUrl }

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

        fun build(): AuthStreamEnrollmentEnrollParams =
            AuthStreamEnrollmentEnrollParams(
                webhookUrl,
                additionalQueryParams.toUnmodifiable(),
                additionalHeaders.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
