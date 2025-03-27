// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
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
                SubscriptionCreateParams.builder()
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(SubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
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

        val eventSubscription =
            subscriptionService.retrieve(
                SubscriptionRetrieveParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

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
                SubscriptionUpdateParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(SubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_CREATED)
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

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.delete(
            SubscriptionDeleteParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        )
    }

    @Test
    fun listAttempts() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        val page =
            subscriptionService.listAttempts(
                SubscriptionListAttemptsParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun recover() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.recover(
            SubscriptionRecoverParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun replayMissing() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.replayMissing(
            SubscriptionReplayMissingParams.builder()
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

        val response =
            subscriptionService.retrieveSecret(
                SubscriptionRetrieveSecretParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun rotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionService = client.events().subscriptions()

        subscriptionService.rotateSecret(
            SubscriptionRotateSecretParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        )
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
            SubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .eventType(SubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
                .build()
        )
    }
}
