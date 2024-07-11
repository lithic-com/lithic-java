// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventRetrieveParamsTest {

    @Test
    fun createEventRetrieveParams() {
        EventRetrieveParams.builder().eventToken("event_token").build()
    }

    @Test
    fun getPathParam() {
        val params = EventRetrieveParams.builder().eventToken("event_token").build()
        assertThat(params).isNotNull
        // path param "eventToken"
        assertThat(params.getPathParam(0)).isEqualTo("event_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
