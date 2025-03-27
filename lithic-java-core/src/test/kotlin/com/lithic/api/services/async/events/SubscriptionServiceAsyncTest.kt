// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.events.subscriptions.SubscriptionCreateParams
import com.lithic.api.models.events.subscriptions.SubscriptionDeleteParams
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsParams
import com.lithic.api.models.events.subscriptions.SubscriptionRecoverParams
import com.lithic.api.models.events.subscriptions.SubscriptionReplayMissingParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionRotateSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionSendSimulatedExampleParams
import com.lithic.api.models.events.subscriptions.SubscriptionUpdateParams
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
                SubscriptionCreateParams.builder()
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(SubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
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

        val eventSubscriptionFuture =
            subscriptionServiceAsync.retrieve(
                SubscriptionRetrieveParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

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
                SubscriptionUpdateParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(SubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_CREATED)
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

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val future =
            subscriptionServiceAsync.delete(
                SubscriptionDeleteParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

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

        val pageFuture =
            subscriptionServiceAsync.listAttempts(
                SubscriptionListAttemptsParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
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
                SubscriptionRecoverParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
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
                SubscriptionReplayMissingParams.builder()
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

        val responseFuture =
            subscriptionServiceAsync.retrieveSecret(
                SubscriptionRetrieveSecretParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val future =
            subscriptionServiceAsync.rotateSecret(
                SubscriptionRotateSecretParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

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
                SubscriptionSendSimulatedExampleParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .eventType(
                        SubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED
                    )
                    .build()
            )

        val response = future.get()
    }
}
