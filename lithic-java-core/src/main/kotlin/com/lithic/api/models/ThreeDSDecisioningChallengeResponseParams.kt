// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects

/**
 * Card program's response to a 3DS Challenge Request. Challenge Request is emitted as a webhook
 * [three_ds_authentication.challenge](https://docs.lithic.com/reference/post_three-ds-authentication-challenge)
 * and your Card Program needs to be configured with Out of Band (OOB) Challenges in order to
 * receive it (see https://docs.lithic.com/docs/3ds-challenge-flow for more information).
 */
class ThreeDSDecisioningChallengeResponseParams
private constructor(
    private val challengeResponse: ChallengeResponse,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Response from Card Program to a 3DS Authentication challenge */
    fun challengeResponse(): ChallengeResponse = challengeResponse

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        challengeResponse._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ThreeDSDecisioningChallengeResponseParams].
         *
         * The following fields are required:
         * ```java
         * .challengeResponse()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreeDSDecisioningChallengeResponseParams]. */
    class Builder internal constructor() {

        private var challengeResponse: ChallengeResponse? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            threeDSDecisioningChallengeResponseParams: ThreeDSDecisioningChallengeResponseParams
        ) = apply {
            challengeResponse = threeDSDecisioningChallengeResponseParams.challengeResponse
            additionalHeaders =
                threeDSDecisioningChallengeResponseParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                threeDSDecisioningChallengeResponseParams.additionalQueryParams.toBuilder()
        }

        /** Response from Card Program to a 3DS Authentication challenge */
        fun challengeResponse(challengeResponse: ChallengeResponse) = apply {
            this.challengeResponse = challengeResponse
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
         * Returns an immutable instance of [ThreeDSDecisioningChallengeResponseParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .challengeResponse()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreeDSDecisioningChallengeResponseParams =
            ThreeDSDecisioningChallengeResponseParams(
                checkRequired("challengeResponse", challengeResponse),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ChallengeResponse = challengeResponse

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ThreeDSDecisioningChallengeResponseParams && challengeResponse == other.challengeResponse && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(challengeResponse, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ThreeDSDecisioningChallengeResponseParams{challengeResponse=$challengeResponse, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
