// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionDeleteParamsTest {

    @Test
    fun createEventSubscriptionDeleteParams() {
        EventSubscriptionDeleteParams.builder().eventSubscriptionToken("string").build()
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionDeleteParams.builder().eventSubscriptionToken("string").build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
