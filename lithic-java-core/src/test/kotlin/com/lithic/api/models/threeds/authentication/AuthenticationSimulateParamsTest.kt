// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.threeds.authentication

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationSimulateParamsTest {

    @Test
    fun create() {
        AuthenticationSimulateParams.builder()
            .merchant(
                AuthenticationSimulateParams.Merchant.builder()
                    .id("OODKZAPJVN4YS7O")
                    .country("USA")
                    .mcc("5812")
                    .name("COFFEE SHOP")
                    .build()
            )
            .pan("4111111289144142")
            .transaction(
                AuthenticationSimulateParams.Transaction.builder()
                    .amount(100L)
                    .currency("USD")
                    .build()
            )
            .cardExpiryCheck(AuthenticationSimulateParams.CardExpiryCheck.MATCH)
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthenticationSimulateParams.builder()
                .merchant(
                    AuthenticationSimulateParams.Merchant.builder()
                        .id("OODKZAPJVN4YS7O")
                        .country("USA")
                        .mcc("5812")
                        .name("COFFEE SHOP")
                        .build()
                )
                .pan("4111111289144142")
                .transaction(
                    AuthenticationSimulateParams.Transaction.builder()
                        .amount(100L)
                        .currency("USD")
                        .build()
                )
                .cardExpiryCheck(AuthenticationSimulateParams.CardExpiryCheck.MATCH)
                .build()

        val body = params._body()

        assertThat(body.merchant())
            .isEqualTo(
                AuthenticationSimulateParams.Merchant.builder()
                    .id("OODKZAPJVN4YS7O")
                    .country("USA")
                    .mcc("5812")
                    .name("COFFEE SHOP")
                    .build()
            )
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.transaction())
            .isEqualTo(
                AuthenticationSimulateParams.Transaction.builder()
                    .amount(100L)
                    .currency("USD")
                    .build()
            )
        assertThat(body.cardExpiryCheck())
            .contains(AuthenticationSimulateParams.CardExpiryCheck.MATCH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthenticationSimulateParams.builder()
                .merchant(
                    AuthenticationSimulateParams.Merchant.builder()
                        .id("OODKZAPJVN4YS7O")
                        .country("USA")
                        .mcc("5812")
                        .name("COFFEE SHOP")
                        .build()
                )
                .pan("4111111289144142")
                .transaction(
                    AuthenticationSimulateParams.Transaction.builder()
                        .amount(100L)
                        .currency("USD")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.merchant())
            .isEqualTo(
                AuthenticationSimulateParams.Merchant.builder()
                    .id("OODKZAPJVN4YS7O")
                    .country("USA")
                    .mcc("5812")
                    .name("COFFEE SHOP")
                    .build()
            )
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.transaction())
            .isEqualTo(
                AuthenticationSimulateParams.Transaction.builder()
                    .amount(100L)
                    .currency("USD")
                    .build()
            )
    }
}
