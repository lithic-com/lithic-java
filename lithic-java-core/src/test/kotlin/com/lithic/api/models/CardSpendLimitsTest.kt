// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardSpendLimitsTest {

    @Test
    fun createCardSpendLimits() {
        val cardSpendLimits =
            CardSpendLimits.builder()
                .availableSpendLimit(
                    CardSpendLimits.AvailableSpendLimit.builder()
                        .annually(123L)
                        .forever(123L)
                        .monthly(123L)
                        .build()
                )
                .spendLimit(
                    CardSpendLimits.SpendLimit.builder()
                        .annually(123L)
                        .forever(123L)
                        .monthly(123L)
                        .build()
                )
                .spendVelocity(
                    CardSpendLimits.SpendVelocity.builder()
                        .annually(123L)
                        .forever(123L)
                        .monthly(123L)
                        .build()
                )
                .build()
        assertThat(cardSpendLimits).isNotNull
        assertThat(cardSpendLimits.availableSpendLimit())
            .isEqualTo(
                CardSpendLimits.AvailableSpendLimit.builder()
                    .annually(123L)
                    .forever(123L)
                    .monthly(123L)
                    .build()
            )
        assertThat(cardSpendLimits.spendLimit())
            .contains(
                CardSpendLimits.SpendLimit.builder()
                    .annually(123L)
                    .forever(123L)
                    .monthly(123L)
                    .build()
            )
        assertThat(cardSpendLimits.spendVelocity())
            .contains(
                CardSpendLimits.SpendVelocity.builder()
                    .annually(123L)
                    .forever(123L)
                    .monthly(123L)
                    .build()
            )
    }
}
