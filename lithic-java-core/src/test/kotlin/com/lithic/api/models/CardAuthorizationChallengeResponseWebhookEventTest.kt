// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthorizationChallengeResponseWebhookEventTest {

    @Test
    fun create() {
        val cardAuthorizationChallengeResponseWebhookEvent =
            CardAuthorizationChallengeResponseWebhookEvent.builder()
                .cardToken("00000000-0000-0000-0000-000000000003")
                .challengeMethod(CardAuthorizationChallengeResponseWebhookEvent.ChallengeMethod.SMS)
                .completed(OffsetDateTime.parse("2025-07-17T07:08:15Z"))
                .created(OffsetDateTime.parse("2025-07-17T07:07:29Z"))
                .eventToken("00000000-0000-0000-0000-000000000001")
                .eventType(
                    CardAuthorizationChallengeResponseWebhookEvent.EventType
                        .CARD_AUTHORIZATION_CHALLENGE_RESPONSE
                )
                .response(CardAuthorizationChallengeResponseWebhookEvent.Response.APPROVE)
                .transactionToken("00000000-0000-0000-0000-000000000002")
                .build()

        assertThat(cardAuthorizationChallengeResponseWebhookEvent.cardToken())
            .contains("00000000-0000-0000-0000-000000000003")
        assertThat(cardAuthorizationChallengeResponseWebhookEvent.challengeMethod())
            .isEqualTo(CardAuthorizationChallengeResponseWebhookEvent.ChallengeMethod.SMS)
        assertThat(cardAuthorizationChallengeResponseWebhookEvent.completed())
            .contains(OffsetDateTime.parse("2025-07-17T07:08:15Z"))
        assertThat(cardAuthorizationChallengeResponseWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2025-07-17T07:07:29Z"))
        assertThat(cardAuthorizationChallengeResponseWebhookEvent.eventToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(cardAuthorizationChallengeResponseWebhookEvent.eventType())
            .isEqualTo(
                CardAuthorizationChallengeResponseWebhookEvent.EventType
                    .CARD_AUTHORIZATION_CHALLENGE_RESPONSE
            )
        assertThat(cardAuthorizationChallengeResponseWebhookEvent.response())
            .isEqualTo(CardAuthorizationChallengeResponseWebhookEvent.Response.APPROVE)
        assertThat(cardAuthorizationChallengeResponseWebhookEvent.transactionToken())
            .contains("00000000-0000-0000-0000-000000000002")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardAuthorizationChallengeResponseWebhookEvent =
            CardAuthorizationChallengeResponseWebhookEvent.builder()
                .cardToken("00000000-0000-0000-0000-000000000003")
                .challengeMethod(CardAuthorizationChallengeResponseWebhookEvent.ChallengeMethod.SMS)
                .completed(OffsetDateTime.parse("2025-07-17T07:08:15Z"))
                .created(OffsetDateTime.parse("2025-07-17T07:07:29Z"))
                .eventToken("00000000-0000-0000-0000-000000000001")
                .eventType(
                    CardAuthorizationChallengeResponseWebhookEvent.EventType
                        .CARD_AUTHORIZATION_CHALLENGE_RESPONSE
                )
                .response(CardAuthorizationChallengeResponseWebhookEvent.Response.APPROVE)
                .transactionToken("00000000-0000-0000-0000-000000000002")
                .build()

        val roundtrippedCardAuthorizationChallengeResponseWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardAuthorizationChallengeResponseWebhookEvent),
                jacksonTypeRef<CardAuthorizationChallengeResponseWebhookEvent>(),
            )

        assertThat(roundtrippedCardAuthorizationChallengeResponseWebhookEvent)
            .isEqualTo(cardAuthorizationChallengeResponseWebhookEvent)
    }
}
