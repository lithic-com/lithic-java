// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChallengeResponseTest {

    @Test
    fun create() {
        val challengeResponse =
            ChallengeResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .challengeResponse(ChallengeResult.APPROVE)
                .build()

        assertThat(challengeResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(challengeResponse.challengeResponse()).isEqualTo(ChallengeResult.APPROVE)
    }
}
