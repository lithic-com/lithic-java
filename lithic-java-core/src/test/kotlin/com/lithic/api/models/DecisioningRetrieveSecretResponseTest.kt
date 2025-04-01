// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DecisioningRetrieveSecretResponseTest {

    @Test
    fun create() {
        val decisioningRetrieveSecretResponse =
            DecisioningRetrieveSecretResponse.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        assertThat(decisioningRetrieveSecretResponse.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val decisioningRetrieveSecretResponse =
            DecisioningRetrieveSecretResponse.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()

        val roundtrippedDecisioningRetrieveSecretResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(decisioningRetrieveSecretResponse),
                jacksonTypeRef<DecisioningRetrieveSecretResponse>(),
            )

        assertThat(roundtrippedDecisioningRetrieveSecretResponse)
            .isEqualTo(decisioningRetrieveSecretResponse)
    }
}
