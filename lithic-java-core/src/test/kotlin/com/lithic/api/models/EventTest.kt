package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventTest {

    @Test
    fun createEvent() {
        val event =
            Event.builder()
                .token("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .eventType(Event.EventType.DISPUTE_UPDATED)
                .payload(Event.Payload.builder().build())
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(event).isNotNull
        assertThat(event.token()).isEqualTo("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
        assertThat(event.eventType()).isEqualTo(Event.EventType.DISPUTE_UPDATED)
        assertThat(event.payload()).isEqualTo(Event.Payload.builder().build())
        assertThat(event.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
