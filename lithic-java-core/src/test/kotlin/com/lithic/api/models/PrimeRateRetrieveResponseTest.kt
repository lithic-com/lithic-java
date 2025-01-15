// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PrimeRateRetrieveResponseTest {

    @Test
    fun createPrimeRateRetrieveResponse() {
        val primeRateRetrieveResponse =
            PrimeRateRetrieveResponse.builder()
                .addData(
                    PrimeRateRetrieveResponse.InterestRate.builder()
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .rate("rate")
                        .build()
                )
                .hasMore(true)
                .build()
        assertThat(primeRateRetrieveResponse).isNotNull
        assertThat(primeRateRetrieveResponse.data())
            .containsExactly(
                PrimeRateRetrieveResponse.InterestRate.builder()
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .rate("rate")
                    .build()
            )
        assertThat(primeRateRetrieveResponse.hasMore()).isEqualTo(true)
    }
}
