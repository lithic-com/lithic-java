package com.lithic.api.services.blocking.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.EventSubscriptionListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        val eventSubscription =
            subscriptionService.create(
                EventSubscriptionCreateParams.builder()
                    .description("string")
                    .disabled(true)
                    .eventTypes(listOf(EventSubscriptionCreateParams.EventType.DISPUTE_UPDATED))
                    .url("https://example.com")
                    .build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        val eventSubscription =
            subscriptionService.retrieve(
                EventSubscriptionRetrieveParams.builder().eventSubscriptionToken("string").build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        val eventSubscription =
            subscriptionService.update(
                EventSubscriptionUpdateParams.builder()
                    .eventSubscriptionToken("string")
                    .description("string")
                    .disabled(true)
                    .eventTypes(listOf(EventSubscriptionUpdateParams.EventType.DISPUTE_UPDATED))
                    .url("https://example.com")
                    .build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        val response = subscriptionService.list(EventSubscriptionListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callDelete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        subscriptionService.delete(
            EventSubscriptionDeleteParams.builder().eventSubscriptionToken("string").build()
        )
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callRecover() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        subscriptionService.recover(
            EventSubscriptionRecoverParams.builder()
                .eventSubscriptionToken("string")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callReplayMissing() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        subscriptionService.replayMissing(
            EventSubscriptionReplayMissingParams.builder()
                .eventSubscriptionToken("string")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Test
    fun callRetrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        val subscriptionRetrieveSecretResponse =
            subscriptionService.retrieveSecret(
                EventSubscriptionRetrieveSecretParams.builder()
                    .eventSubscriptionToken("string")
                    .build()
            )
        println(subscriptionRetrieveSecretResponse)
        subscriptionRetrieveSecretResponse.validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callRotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val subscriptionService = client.events().subscriptions()
        subscriptionService.rotateSecret(
            EventSubscriptionRotateSecretParams.builder().eventSubscriptionToken("string").build()
        )
    }
}
