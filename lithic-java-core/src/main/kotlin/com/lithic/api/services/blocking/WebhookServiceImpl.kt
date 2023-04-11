package com.lithic.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.fasterxml.jackson.core.JsonProcessingException
import com.google.common.collect.ListMultimap
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicException
import java.security.MessageDigest
import java.time.Instant
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler

class WebhookServiceImpl constructor(private val clientOptions: ClientOptions,) : WebhookService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    override fun unwrap(payload: String, headers: ListMultimap<String, String>, secret: String?): JsonValue {
      verifySignature(payload, headers, secret)
      return try {
          clientOptions.jsonMapper.readValue(payload, JsonValue::class.java)
      } catch (e: JsonProcessingException) {
          throw LithicException("Invalid event payload", e)
      }
    }

    override fun verifySignature(payload: String, headers: ListMultimap<String, String>, secret: String?) {
      val webhookSecret = secret
          ?: clientOptions.webhookSecret
          ?: throw LithicException("The webhook secret must either be set using the env var, LITHIC_WEBHOOK_SECRET, on the client class, or passed to this method")

      val whsecret = try {
          Base64.getDecoder().decode(webhookSecret.removePrefix("whsec_"))
      } catch (e: RuntimeException) {
          throw LithicException("Invalid webhook secret")
      }

      val msgId = headers.get("webhook-id").getOrNull(0)
          ?: throw LithicException("Could not find webhook-id header")
      val msgSignture = headers.get("webhook-signature").getOrNull(0)
          ?: throw LithicException("Could not find webhook-signature header")
      val msgTimestamp = headers.get("webhook-timestamp").getOrNull(0)
          ?: throw LithicException("Could not find webhook-timestamp header")

      val timestamp = try {
          Instant.ofEpochSecond(msgTimestamp.toLong())
      } catch (e: RuntimeException) {
          throw LithicException("Invalid signature headers", e)
      }
      val now = Instant.now(clientOptions.clock)

      if (timestamp.isBefore(now.minus(Duration.ofMinutes(5)))) {
          throw LithicException("Webhook timestamp too old")
      }
      if (timestamp.isAfter(now.plus(Duration.ofMinutes(5)))) {
          throw LithicException("Webhook timestamp too new")
      }

      val mac = Mac.getInstance("HmacSHA256")
      mac.init(SecretKeySpec(whsecret, "HmacSHA256"))
      val expectedSignature = mac.doFinal("$msgId.${timestamp.epochSecond}.$payload".toByteArray())

      msgSignture.splitToSequence(" ").forEach {
          val parts = it.split(",")
          if (parts.size != 2) {
              return@forEach
          }

          if (parts[0] != "v1") {
              return@forEach
          }

          if (MessageDigest.isEqual(Base64.getDecoder().decode(parts[1]), expectedSignature)) {
              return
          }
      }

      throw LithicException("None of the given webhook signatures match the expected signature")
    }
}
