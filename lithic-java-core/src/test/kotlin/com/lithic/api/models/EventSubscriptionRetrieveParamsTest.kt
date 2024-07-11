// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionRetrieveParamsTest {

    @Test
    fun createEventSubscriptionRetrieveParams() {
        EventSubscriptionRetrieveParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionRetrieveParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("event_subscription_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
