package com.lithic.api.services.blocking.events

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.lithic.api.TestServerExtension
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.services.blocking.events.SubscriptionService
import com.lithic.api.models.EventsSubscriptionListPage
import com.lithic.api.models.EventsSubscriptionListParams
import com.lithic.api.models.*

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceTest {

    @Test
    fun callCreate() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      val eventSubscription = subscriptionService.create(EventsSubscriptionCreateParams.builder()
          .description("string")
          .disabled(true)
          .eventTypes(listOf(EventsSubscriptionCreateParams.EventType.DISPUTE_UPDATED))
          .url("https://example.com")
          .build())
      println(eventSubscription)
      eventSubscription.validate()
    }

    @Test
    fun callRetrieve() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      val eventSubscription = subscriptionService.retrieve(EventsSubscriptionRetrieveParams.builder()
          .eventSubscriptionToken("string")
          .build())
      println(eventSubscription)
      eventSubscription.validate()
    }

    @Test
    fun callUpdate() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      val eventSubscription = subscriptionService.update(EventsSubscriptionUpdateParams.builder()
          .eventSubscriptionToken("string")
          .description("string")
          .disabled(true)
          .eventTypes(listOf(EventsSubscriptionUpdateParams.EventType.DISPUTE_UPDATED))
          .url("https://example.com")
          .build())
      println(eventSubscription)
      eventSubscription.validate()
    }

    @Test
    fun callList() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      val response = subscriptionService.list(EventsSubscriptionListParams.builder().build())
      println(response)
      response.data().forEach {
          it.validate()
      }
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callDelete() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      subscriptionService.delete(EventsSubscriptionDeleteParams.builder()
          .eventSubscriptionToken("string")
          .build())
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callRecover() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      subscriptionService.recover(EventsSubscriptionRecoverParams.builder()
          .eventSubscriptionToken("string")
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callReplayMissing() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      subscriptionService.replayMissing(EventsSubscriptionReplayMissingParams.builder()
          .eventSubscriptionToken("string")
          .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
    }

    @Test
    fun callRetrieveSecret() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      val subscriptionRetrieveSecretResponse = subscriptionService.retrieveSecret(EventsSubscriptionRetrieveSecretParams.builder()
          .eventSubscriptionToken("string")
          .build())
      println(subscriptionRetrieveSecretResponse)
      subscriptionRetrieveSecretResponse.validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    fun callRotateSecret() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val subscriptionService = client.events().subscriptions()
      subscriptionService.rotateSecret(EventsSubscriptionRotateSecretParams.builder()
          .eventSubscriptionToken("string")
          .build())
    }
}
