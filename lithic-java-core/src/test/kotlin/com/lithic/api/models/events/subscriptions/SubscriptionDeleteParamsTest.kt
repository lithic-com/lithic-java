// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.events.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionDeleteParamsTest {

    @Test
    fun create() {
        SubscriptionDeleteParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionDeleteParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("event_subscription_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
