// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditProductPrimeRateRetrieveParamsTest {

    @Test
    fun create() {
        CreditProductPrimeRateRetrieveParams.builder()
            .creditProductToken("credit_product_token")
            .endingBefore(LocalDate.parse("2019-12-27"))
            .startingAfter(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CreditProductPrimeRateRetrieveParams.builder()
                .creditProductToken("credit_product_token")
                .endingBefore(LocalDate.parse("2019-12-27"))
                .startingAfter(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "2019-12-27")
                    .put("starting_after", "2019-12-27")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CreditProductPrimeRateRetrieveParams.builder()
                .creditProductToken("credit_product_token")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            CreditProductPrimeRateRetrieveParams.builder()
                .creditProductToken("credit_product_token")
                .build()
        assertThat(params).isNotNull
        // path param "creditProductToken"
        assertThat(params.getPathParam(0)).isEqualTo("credit_product_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
