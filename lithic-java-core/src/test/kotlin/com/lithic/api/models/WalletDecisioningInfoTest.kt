// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletDecisioningInfoTest {

    @Test
    fun create() {
        val walletDecisioningInfo =
            WalletDecisioningInfo.builder()
                .accountScore("100")
                .deviceScore("100")
                .recommendedDecision("Decision1")
                .addRecommendationReason("string")
                .build()

        assertThat(walletDecisioningInfo.accountScore()).contains("100")
        assertThat(walletDecisioningInfo.deviceScore()).contains("100")
        assertThat(walletDecisioningInfo.recommendedDecision()).contains("Decision1")
        assertThat(walletDecisioningInfo.recommendationReasons().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val walletDecisioningInfo =
            WalletDecisioningInfo.builder()
                .accountScore("100")
                .deviceScore("100")
                .recommendedDecision("Decision1")
                .addRecommendationReason("string")
                .build()

        val roundtrippedWalletDecisioningInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletDecisioningInfo),
                jacksonTypeRef<WalletDecisioningInfo>(),
            )

        assertThat(roundtrippedWalletDecisioningInfo).isEqualTo(walletDecisioningInfo)
    }
}
