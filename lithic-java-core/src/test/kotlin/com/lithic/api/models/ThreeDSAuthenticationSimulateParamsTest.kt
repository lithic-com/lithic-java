// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreeDSAuthenticationSimulateParamsTest {

    @Test
    fun create() {
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
                    .amount(100L)
                    .currency("USD")
                    .build()
            )
            .cardExpiryCheck(ThreeDSAuthenticationSimulateParams.CardExpiryCheck.MATCH)
            .build()
    }

    @Test
    fun body() {
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
                        .amount(100L)
                        .currency("USD")
                        .build()
                )
                .cardExpiryCheck(ThreeDSAuthenticationSimulateParams.CardExpiryCheck.MATCH)
                .build()

        val body = params._body()

        assertNotNull(body)
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
                    .amount(100L)
                    .currency("USD")
                    .build()
            )
        assertThat(body.cardExpiryCheck())
            .contains(ThreeDSAuthenticationSimulateParams.CardExpiryCheck.MATCH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
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
                        .amount(100L)
                        .currency("USD")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
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
                    .amount(100L)
                    .currency("USD")
                    .build()
            )
    }
}
