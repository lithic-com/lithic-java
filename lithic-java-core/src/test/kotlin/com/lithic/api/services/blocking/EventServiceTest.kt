// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.JsonString
import com.lithic.api.models.*
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EventServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val eventService = client.events()
        val event =
            eventService.retrieve(EventRetrieveParams.builder().eventToken("string").build())
        println(event)
        event.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val eventService = client.events()
        val response = eventService.list(EventListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callListAttempts() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val eventService = client.events()
        val response =
            eventService.listAttempts(
                EventListAttemptsParams.builder().eventToken("string").build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callResend() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val eventService = client.events()
        eventService.resend("eventToken", "eventSubscriptionToken", JsonString.of("body"))
    }
}
