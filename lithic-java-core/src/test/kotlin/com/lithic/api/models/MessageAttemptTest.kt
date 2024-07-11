// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MessageAttemptTest {

    @Test
    fun createMessageAttempt() {
        val messageAttempt =
            MessageAttempt.builder()
                .token("atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventSubscriptionToken("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .eventToken("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .response("response")
                .responseStatusCode(123L)
                .status(MessageAttempt.Status.FAILED)
                .url("https://example.com")
                .build()
        assertThat(messageAttempt).isNotNull
        assertThat(messageAttempt.token()).isEqualTo("atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2")
        assertThat(messageAttempt.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(messageAttempt.eventSubscriptionToken())
            .isEqualTo("ep_1srOrx2ZWZBpBUvZwXKQmoEYga1")
        assertThat(messageAttempt.eventToken()).isEqualTo("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
        assertThat(messageAttempt.response()).isEqualTo("response")
        assertThat(messageAttempt.responseStatusCode()).isEqualTo(123L)
        assertThat(messageAttempt.status()).isEqualTo(MessageAttempt.Status.FAILED)
        assertThat(messageAttempt.url()).isEqualTo("https://example.com")
    }
}
