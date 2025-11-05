// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.EventSubscriptionCreateParams
import com.lithic.api.models.EventSubscriptionRecoverParams
import com.lithic.api.models.EventSubscriptionReplayMissingParams
import com.lithic.api.models.EventSubscriptionSendSimulatedExampleParams
import com.lithic.api.models.EventSubscriptionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        val eventSubscription =
            subscriptionService.create(
                EventSubscriptionCreateParams.builder()
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(
                        EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                    )
                    .build()
            )

        eventSubscription.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        val eventSubscription = subscriptionService.retrieve("event_subscription_token")

        eventSubscription.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        val eventSubscription =
            subscriptionService.update(
                EventSubscriptionUpdateParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(
                        EventSubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                    )
                    .build()
            )

        eventSubscription.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        val page = subscriptionService.list()

        page.response().validate()
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.delete("event_subscription_token")
    }

    @Test
    fun listAttempts() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        val page = subscriptionService.listAttempts("event_subscription_token")

        page.response().validate()
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun recover() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.recover(
            EventSubscriptionRecoverParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun replayMissing() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.replayMissing(
            EventSubscriptionReplayMissingParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Test
    fun retrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        val response = subscriptionService.retrieveSecret("event_subscription_token")

        response.validate()
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.rotateSecret("event_subscription_token")
    }

    @Test
    fun sendSimulatedExample() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.sendSimulatedExample(
            EventSubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .eventType(
                    EventSubscriptionSendSimulatedExampleParams.EventType
                        .ACCOUNT_HOLDER_DOCUMENT_UPDATED
                )
                .build()
        )
    }
}
