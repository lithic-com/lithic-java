// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.threeds.decisioning

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DecisioningSimulateChallengeResponseTest {

    @Test
    fun create() {
        val decisioningSimulateChallengeResponse =
            DecisioningSimulateChallengeResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(decisioningSimulateChallengeResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
