// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeDSAuthenticationSimulateParamsTest {

    @Test
    fun createThreeDSAuthenticationSimulateParams() {
        ThreeDSAuthenticationSimulateParams.builder()
            .merchant(
                ThreeDSAuthenticationSimulateParams.Merchant.builder()
                    .id("OODKZAPJVN4YS7O")
                    .country("USA")
                    .mcc("5812")
                    .name("COFFEE SHOP")
                    .build()
            )
            .pan("4111111289144142")
            .transaction(
                ThreeDSAuthenticationSimulateParams.Transaction.builder()
                    .amount(123L)
                    .currency("GBP")
                    .build()
            )
            .cardExpiryCheck(ThreeDSAuthenticationSimulateParams.CardExpiryCheck.MATCH)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ThreeDSAuthenticationSimulateParams.builder()
                .merchant(
                    ThreeDSAuthenticationSimulateParams.Merchant.builder()
                        .id("OODKZAPJVN4YS7O")
                        .country("USA")
                        .mcc("5812")
                        .name("COFFEE SHOP")
                        .build()
                )
                .pan("4111111289144142")
                .transaction(
                    ThreeDSAuthenticationSimulateParams.Transaction.builder()
                        .amount(123L)
                        .currency("GBP")
                        .build()
                )
                .cardExpiryCheck(ThreeDSAuthenticationSimulateParams.CardExpiryCheck.MATCH)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.merchant())
            .isEqualTo(
                ThreeDSAuthenticationSimulateParams.Merchant.builder()
                    .id("OODKZAPJVN4YS7O")
                    .country("USA")
                    .mcc("5812")
                    .name("COFFEE SHOP")
                    .build()
            )
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.transaction())
            .isEqualTo(
                ThreeDSAuthenticationSimulateParams.Transaction.builder()
                    .amount(123L)
                    .currency("GBP")
                    .build()
            )
        assertThat(body.cardExpiryCheck())
            .isEqualTo(ThreeDSAuthenticationSimulateParams.CardExpiryCheck.MATCH)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ThreeDSAuthenticationSimulateParams.builder()
                .merchant(
                    ThreeDSAuthenticationSimulateParams.Merchant.builder()
                        .id("OODKZAPJVN4YS7O")
                        .country("USA")
                        .mcc("5812")
                        .name("COFFEE SHOP")
                        .build()
                )
                .pan("4111111289144142")
                .transaction(
                    ThreeDSAuthenticationSimulateParams.Transaction.builder()
                        .amount(123L)
                        .currency("GBP")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.merchant())
            .isEqualTo(
                ThreeDSAuthenticationSimulateParams.Merchant.builder()
                    .id("OODKZAPJVN4YS7O")
                    .country("USA")
                    .mcc("5812")
                    .name("COFFEE SHOP")
                    .build()
            )
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.transaction())
            .isEqualTo(
                ThreeDSAuthenticationSimulateParams.Transaction.builder()
                    .amount(123L)
                    .currency("GBP")
                    .build()
            )
    }
}
