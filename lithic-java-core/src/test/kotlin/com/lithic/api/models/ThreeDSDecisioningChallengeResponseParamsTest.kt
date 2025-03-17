// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreeDSDecisioningChallengeResponseParamsTest {

    @Test
    fun create() {
        ThreeDSDecisioningChallengeResponseParams.builder()
            .challengeResponse(
                ChallengeResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .challengeResponse(ChallengeResult.APPROVE)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreeDSDecisioningChallengeResponseParams.builder()
                .challengeResponse(
                    ChallengeResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .challengeResponse(ChallengeResult.APPROVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ChallengeResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .challengeResponse(ChallengeResult.APPROVE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreeDSDecisioningChallengeResponseParams.builder()
                .challengeResponse(
                    ChallengeResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .challengeResponse(ChallengeResult.APPROVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ChallengeResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .challengeResponse(ChallengeResult.APPROVE)
                    .build()
            )
    }
}
