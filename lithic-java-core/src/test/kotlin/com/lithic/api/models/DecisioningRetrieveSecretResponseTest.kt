// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DecisioningRetrieveSecretResponseTest {

    @Test
    fun createDecisioningRetrieveSecretResponse() {
        val decisioningRetrieveSecretResponse =
            DecisioningRetrieveSecretResponse.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()
        assertThat(decisioningRetrieveSecretResponse).isNotNull
        assertThat(decisioningRetrieveSecretResponse.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
