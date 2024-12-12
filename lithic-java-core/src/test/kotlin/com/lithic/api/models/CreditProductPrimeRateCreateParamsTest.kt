// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditProductPrimeRateCreateParamsTest {

    @Test
    fun createCreditProductPrimeRateCreateParams() {
        CreditProductPrimeRateCreateParams.builder()
            .creditProductToken("credit_product_token")
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .rate("rate")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CreditProductPrimeRateCreateParams.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .rate("rate")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.rate()).isEqualTo("rate")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CreditProductPrimeRateCreateParams.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .rate("rate")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
