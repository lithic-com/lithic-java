// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
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
internal class SubscriptionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val eventSubscriptionFuture =
            subscriptionServiceAsync.create(
                EventSubscriptionCreateParams.builder()
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(
                        EventSubscriptionCreateParams.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                    )
                    .build()
            )

        val eventSubscription = eventSubscriptionFuture.get()
        eventSubscription.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val eventSubscriptionFuture = subscriptionServiceAsync.retrieve("event_subscription_token")

        val eventSubscription = eventSubscriptionFuture.get()
        eventSubscription.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val eventSubscriptionFuture =
            subscriptionServiceAsync.update(
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

        val eventSubscription = eventSubscriptionFuture.get()
        eventSubscription.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val pageFuture = subscriptionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val future = subscriptionServiceAsync.delete("event_subscription_token")

        val response = future.get()
    }

    @Test
    fun listAttempts() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val pageFuture = subscriptionServiceAsync.listAttempts("event_subscription_token")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun recover() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val future =
            subscriptionServiceAsync.recover(
                EventSubscriptionRecoverParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun replayMissing() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val future =
            subscriptionServiceAsync.replayMissing(
                EventSubscriptionReplayMissingParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieveSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val responseFuture = subscriptionServiceAsync.retrieveSecret("event_subscription_token")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism Mock server doesn't want Accept header, but server requires it.")
    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val future = subscriptionServiceAsync.rotateSecret("event_subscription_token")

        val response = future.get()
    }

    @Test
    fun sendSimulatedExample() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val future =
            subscriptionServiceAsync.sendSimulatedExample(
                EventSubscriptionSendSimulatedExampleParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .eventType(
                        EventSubscriptionSendSimulatedExampleParams.EventType
                            .ACCOUNT_HOLDER_DOCUMENT_UPDATED
                    )
                    .build()
            )

        val response = future.get()
    }
}
