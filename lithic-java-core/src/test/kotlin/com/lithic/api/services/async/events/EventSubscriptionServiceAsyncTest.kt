// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.EventEventSubscriptionResendParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventSubscriptionServiceAsyncTest {

    @Test
    fun resend() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventSubscriptionServiceAsync = client.events().eventSubscriptions()

        val future =
            eventSubscriptionServiceAsync.resend(
                EventEventSubscriptionResendParams.builder()
                    .eventToken("event_token")
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        val response = future.get()
    }
}
