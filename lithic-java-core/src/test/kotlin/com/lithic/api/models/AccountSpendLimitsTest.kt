// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountSpendLimitsTest {

    @Test
    fun createAccountSpendLimits() {
        val accountSpendLimits =
            AccountSpendLimits.builder()
                .availableSpendLimit(
                    AccountSpendLimits.AvailableSpendLimit.builder()
                        .daily(123L)
                        .lifetime(123L)
                        .monthly(123L)
                        .build()
                )
                .build()
        assertThat(accountSpendLimits).isNotNull
        assertThat(accountSpendLimits.availableSpendLimit())
            .isEqualTo(
                AccountSpendLimits.AvailableSpendLimit.builder()
                    .daily(123L)
                    .lifetime(123L)
                    .monthly(123L)
                    .build()
            )
    }
}
