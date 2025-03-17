// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditProductPrimeRateCreateParamsTest {

    @Test
    fun create() {
        CreditProductPrimeRateCreateParams.builder()
            .creditProductToken("credit_product_token")
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .rate("rate")
            .build()
    }

    @Test
    fun body() {
        val params =
            CreditProductPrimeRateCreateParams.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .rate("rate")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.rate()).isEqualTo("rate")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CreditProductPrimeRateCreateParams.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .rate("rate")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.rate()).isEqualTo("rate")
    }

    @Test
    fun getPathParam() {
        val params =
            CreditProductPrimeRateCreateParams.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .rate("rate")
                .build()
        assertThat(params).isNotNull
        // path param "creditProductToken"
        assertThat(params.getPathParam(0)).isEqualTo("credit_product_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
