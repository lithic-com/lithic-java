// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardSpendLimitsTest {

    @Test
    fun createCardSpendLimits() {
        val cardSpendLimits =
            CardSpendLimits.builder()
                .availableSpendLimit(
                    CardSpendLimits.AvailableSpendLimit.builder()
                        .annually(200000L)
                        .forever(300000L)
                        .monthly(200000L)
                        .build()
                )
                .spendLimit(
                    CardSpendLimits.SpendLimit.builder()
                        .annually(500000L)
                        .forever(500000L)
                        .monthly(500000L)
                        .build()
                )
                .spendVelocity(
                    CardSpendLimits.SpendVelocity.builder()
                        .annually(300000L)
                        .forever(200000L)
                        .monthly(300000L)
                        .build()
                )
                .build()
        assertThat(cardSpendLimits).isNotNull
        assertThat(cardSpendLimits.availableSpendLimit())
            .isEqualTo(
                CardSpendLimits.AvailableSpendLimit.builder()
                    .annually(200000L)
                    .forever(300000L)
                    .monthly(200000L)
                    .build()
            )
        assertThat(cardSpendLimits.spendLimit())
            .contains(
                CardSpendLimits.SpendLimit.builder()
                    .annually(500000L)
                    .forever(500000L)
                    .monthly(500000L)
                    .build()
            )
        assertThat(cardSpendLimits.spendVelocity())
            .contains(
                CardSpendLimits.SpendVelocity.builder()
                    .annually(300000L)
                    .forever(200000L)
                    .monthly(300000L)
                    .build()
            )
    }
}
