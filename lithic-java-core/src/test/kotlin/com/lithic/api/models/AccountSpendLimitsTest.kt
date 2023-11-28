// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
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
                .required(JsonValue.from(mapOf<String, Any>()))
                .build()
        assertThat(accountSpendLimits).isNotNull
        assertThat(accountSpendLimits.availableSpendLimit())
            .contains(
                AccountSpendLimits.AvailableSpendLimit.builder()
                    .daily(123L)
                    .lifetime(123L)
                    .monthly(123L)
                    .build()
            )
        assertThat(accountSpendLimits._required()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
