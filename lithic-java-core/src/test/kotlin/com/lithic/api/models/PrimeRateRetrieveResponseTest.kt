// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrimeRateRetrieveResponseTest {

    @Test
    fun create() {
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

        assertThat(primeRateRetrieveResponse.data())
            .containsExactly(
                PrimeRateRetrieveResponse.InterestRate.builder()
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .rate("rate")
                    .build()
            )
        assertThat(primeRateRetrieveResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedPrimeRateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(primeRateRetrieveResponse),
                jacksonTypeRef<PrimeRateRetrieveResponse>(),
            )

        assertThat(roundtrippedPrimeRateRetrieveResponse).isEqualTo(primeRateRetrieveResponse)
    }
}
