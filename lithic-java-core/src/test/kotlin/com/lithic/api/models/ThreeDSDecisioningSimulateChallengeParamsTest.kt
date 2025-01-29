// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeDSDecisioningSimulateChallengeParamsTest {

    @Test
    fun createThreeDSDecisioningSimulateChallengeParams() {
        ThreeDSDecisioningSimulateChallengeParams.builder()
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreeDSDecisioningSimulateChallengeParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ThreeDSDecisioningSimulateChallengeParams.builder().build()
        val body = params._body()
        assertThat(body).isNotNull
    }
}
