// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
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
                .required(JsonValue.from(mapOf<String, Any>()))
                .build()
        assertThat(cardSpendLimits).isNotNull
        assertThat(cardSpendLimits.availableSpendLimit())
            .contains(
                CardSpendLimits.AvailableSpendLimit.builder()
                    .annually(123L)
                    .forever(123L)
                    .monthly(123L)
                    .build()
            )
        assertThat(cardSpendLimits._required()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
