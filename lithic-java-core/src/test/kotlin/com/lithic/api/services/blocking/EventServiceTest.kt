// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventService = client.events()

        val event =
            eventService.retrieve(EventRetrieveParams.builder().eventToken("event_token").build())

        event.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventService = client.events()

        val page = eventService.list()

        page.response().validate()
    }

    @Test
    fun listAttempts() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventService = client.events()

        val page =
            eventService.listAttempts(
                EventListAttemptsParams.builder().eventToken("event_token").build()
            )

        page.response().validate()
    }
}
