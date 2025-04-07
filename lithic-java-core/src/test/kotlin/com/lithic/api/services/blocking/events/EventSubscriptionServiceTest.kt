// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.EventEventSubscriptionResendParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventSubscriptionServiceTest {

    @Test
    fun resend() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventSubscriptionService = client.events().eventSubscriptions()

        eventSubscriptionService.resend(
            EventEventSubscriptionResendParams.builder()
                .eventToken("event_token")
                .eventSubscriptionToken("event_subscription_token")
                .build()
        )
    }
}
