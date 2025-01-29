// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeDSDecisioningSimulateChallengeParamsTest {

    @Test
    fun createThreeDSDecisioningSimulateChallengeParams() {
        ThreeDSDecisioningSimulateChallengeParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreeDSDecisioningSimulateChallengeParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.token()).contains("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ThreeDSDecisioningSimulateChallengeParams.builder().build()
        val body = params._body()
        assertThat(body).isNotNull
    }
}
