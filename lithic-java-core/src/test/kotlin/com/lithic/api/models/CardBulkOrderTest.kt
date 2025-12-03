// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardBulkOrderTest {

    @Test
    fun create() {
        val cardBulkOrder =
            CardBulkOrder.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .customerProductId("custom-card-design-123")
                .shippingAddress(JsonValue.from(mapOf<String, Any>()))
                .shippingMethod(CardBulkOrder.ShippingMethod.BULK_EXPEDITED)
                .status(CardBulkOrder.Status.OPEN)
                .updated(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .build()

        assertThat(cardBulkOrder.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardBulkOrder.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(cardBulkOrder.created()).isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardBulkOrder.customerProductId()).contains("custom-card-design-123")
        assertThat(cardBulkOrder._shippingAddress()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(cardBulkOrder.shippingMethod())
            .isEqualTo(CardBulkOrder.ShippingMethod.BULK_EXPEDITED)
        assertThat(cardBulkOrder.status()).isEqualTo(CardBulkOrder.Status.OPEN)
        assertThat(cardBulkOrder.updated()).isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardBulkOrder =
            CardBulkOrder.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .customerProductId("custom-card-design-123")
                .shippingAddress(JsonValue.from(mapOf<String, Any>()))
                .shippingMethod(CardBulkOrder.ShippingMethod.BULK_EXPEDITED)
                .status(CardBulkOrder.Status.OPEN)
                .updated(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .build()

        val roundtrippedCardBulkOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardBulkOrder),
                jacksonTypeRef<CardBulkOrder>(),
            )

        assertThat(roundtrippedCardBulkOrder).isEqualTo(cardBulkOrder)
    }
}
