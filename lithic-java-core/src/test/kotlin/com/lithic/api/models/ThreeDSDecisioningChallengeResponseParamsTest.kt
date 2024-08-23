// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeDSDecisioningChallengeResponseParamsTest {

    @Test
    fun createThreeDSDecisioningChallengeResponseParams() {
        ThreeDSDecisioningChallengeResponseParams.builder()
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .challengeResponse(ThreeDSDecisioningChallengeResponseParams.ChallengeResponse.APPROVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ThreeDSDecisioningChallengeResponseParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .challengeResponse(
                    ThreeDSDecisioningChallengeResponseParams.ChallengeResponse.APPROVE
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.challengeResponse())
            .isEqualTo(ThreeDSDecisioningChallengeResponseParams.ChallengeResponse.APPROVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ThreeDSDecisioningChallengeResponseParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .challengeResponse(
                    ThreeDSDecisioningChallengeResponseParams.ChallengeResponse.APPROVE
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.challengeResponse())
            .isEqualTo(ThreeDSDecisioningChallengeResponseParams.ChallengeResponse.APPROVE)
    }
}
