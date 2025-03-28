// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationSimulateParamsTest {

    @Test
    fun create() {
        TokenizationSimulateParams.builder()
            .cvv("776")
            .expirationDate("08/29")
            .pan("4111111289144142")
            .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
            .accountScore(5L)
            .deviceScore(5L)
            .entity("entity")
            .walletRecommendedDecision(
                TokenizationSimulateParams.WalletRecommendedDecision.APPROVED
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TokenizationSimulateParams.builder()
                .cvv("776")
                .expirationDate("08/29")
                .pan("4111111289144142")
                .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
                .accountScore(5L)
                .deviceScore(5L)
                .entity("entity")
                .walletRecommendedDecision(
                    TokenizationSimulateParams.WalletRecommendedDecision.APPROVED
                )
                .build()

        val body = params._body()

        assertThat(body.cvv()).isEqualTo("776")
        assertThat(body.expirationDate()).isEqualTo("08/29")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.tokenizationSource())
            .isEqualTo(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
        assertThat(body.accountScore()).contains(5L)
        assertThat(body.deviceScore()).contains(5L)
        assertThat(body.entity()).contains("entity")
        assertThat(body.walletRecommendedDecision())
            .contains(TokenizationSimulateParams.WalletRecommendedDecision.APPROVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenizationSimulateParams.builder()
                .cvv("776")
                .expirationDate("08/29")
                .pan("4111111289144142")
                .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
                .build()

        val body = params._body()

        assertThat(body.cvv()).isEqualTo("776")
        assertThat(body.expirationDate()).isEqualTo("08/29")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.tokenizationSource())
            .isEqualTo(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
    }
}
