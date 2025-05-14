// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundingEventRetrieveParamsTest {

    @Test
    fun create() {
        FundingEventRetrieveParams.builder().fundingEventToken("funding_event_token").build()
    }

    @Test
    fun pathParams() {
        val params =
            FundingEventRetrieveParams.builder().fundingEventToken("funding_event_token").build()

        assertThat(params._pathParam(0)).isEqualTo("funding_event_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
