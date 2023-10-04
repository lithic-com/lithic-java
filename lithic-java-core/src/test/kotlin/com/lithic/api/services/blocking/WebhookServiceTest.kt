// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.common.collect.ImmutableListMultimap
import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.errors.LithicException
import com.lithic.api.models.*
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset
import org.assertj.core.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WebhookServiceTest {

    @Test
    fun unwrap() {
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")
                .clock(Clock.fixed(Instant.ofEpochSecond(1676312382), ZoneOffset.UTC))
                .build()

        val payload =
            "{\"card_token\":\"sit Lorem ipsum, accusantium repellendus possimus\",\"created_at\":\"elit. placeat libero architecto molestias, sit\",\"account_token\":\"elit.\",\"issuer_decision\":\"magnam, libero esse Lorem ipsum magnam, magnam,\",\"tokenization_attempt_id\":\"illum dolor repellendus libero esse accusantium\",\"wallet_decisioning_info\":{\"device_score\":\"placeat architecto\"},\"digital_wallet_token_metadata\":{\"status\":\"reprehenderit dolor\",\"token_requestor_id\":\"possimus\",\"payment_account_info\":{\"account_holder_data\":{\"phone_number\":\"libero\",\"email_address\":\"nobis molestias, veniam culpa! quas elit. quas libero esse architecto placeat\"},\"pan_unique_reference\":\"adipisicing odit magnam, odit\"}}}"
        val headers =
            ImmutableListMultimap.of(
                "webhook-id",
                "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj",
                "webhook-timestamp",
                "1676312382",
                "webhook-signature",
                "v1,Dwa0AHInLL3XFo2sxcHamOQDrJNi7F654S3L6skMAOI="
            )

        val event = client.webhooks().unwrap(payload, headers, null)

        assertThat(event).isNotNull()
    }

    @Test
    fun verifySignature() {
        val client =
            LithicOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")
                .clock(Clock.fixed(Instant.ofEpochSecond(1676312382), ZoneOffset.UTC))
                .build()

        val payload =
            "{\"card_token\":\"sit Lorem ipsum, accusantium repellendus possimus\",\"created_at\":\"elit. placeat libero architecto molestias, sit\",\"account_token\":\"elit.\",\"issuer_decision\":\"magnam, libero esse Lorem ipsum magnam, magnam,\",\"tokenization_attempt_id\":\"illum dolor repellendus libero esse accusantium\",\"wallet_decisioning_info\":{\"device_score\":\"placeat architecto\"},\"digital_wallet_token_metadata\":{\"status\":\"reprehenderit dolor\",\"token_requestor_id\":\"possimus\",\"payment_account_info\":{\"account_holder_data\":{\"phone_number\":\"libero\",\"email_address\":\"nobis molestias, veniam culpa! quas elit. quas libero esse architecto placeat\"},\"pan_unique_reference\":\"adipisicing odit magnam, odit\"}}}"
        val webhookId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val webhookTimestamp = "1676312382"
        val webhookSignature = "Dwa0AHInLL3XFo2sxcHamOQDrJNi7F654S3L6skMAOI="
        val headers =
            ImmutableListMultimap.of(
                "webhook-id",
                webhookId,
                "webhook-timestamp",
                webhookTimestamp,
                "webhook-signature",
                "v1,$webhookSignature"
            )

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "webhook-id",
                            webhookId,
                            "webhook-timestamp",
                            "1676312022",
                            "webhook-signature",
                            "v1,$webhookSignature"
                        ),
                        null
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("Webhook timestamp too old")

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "webhook-id",
                            webhookId,
                            "webhook-timestamp",
                            "1676312742",
                            "webhook-signature",
                            "v1,$webhookSignature"
                        ),
                        null
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("Webhook timestamp too new")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "invalid-secret") }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("Invalid webhook secret")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "Zm9v") }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "webhook-id",
                            webhookId,
                            "webhook-timestamp",
                            webhookTimestamp,
                            "webhook-signature",
                            "v1,$webhookSignature v1,Zm9v",
                        ),
                        null
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "webhook-id",
                            webhookId,
                            "webhook-timestamp",
                            webhookTimestamp,
                            "webhook-signature",
                            "v2,$webhookSignature",
                        ),
                        null
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "webhook-id",
                            webhookId,
                            "webhook-timestamp",
                            webhookTimestamp,
                            "webhook-signature",
                            "v1,$webhookSignature v2,$webhookSignature",
                        ),
                        null
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "webhook-id",
                            webhookId,
                            "webhook-timestamp",
                            webhookTimestamp,
                            "webhook-signature",
                            webhookSignature,
                        ),
                        null
                    )
            }
            .isInstanceOf(LithicException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")
    }
}
