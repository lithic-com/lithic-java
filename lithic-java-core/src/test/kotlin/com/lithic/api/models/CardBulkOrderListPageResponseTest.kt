// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardBulkOrderListPageResponseTest {

    @Test
    fun create() {
        val cardBulkOrderListPageResponse =
            CardBulkOrderListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        assertThat(cardBulkOrderListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(cardBulkOrderListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardBulkOrderListPageResponse =
            CardBulkOrderListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        val roundtrippedCardBulkOrderListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardBulkOrderListPageResponse),
                jacksonTypeRef<CardBulkOrderListPageResponse>(),
            )

        assertThat(roundtrippedCardBulkOrderListPageResponse)
            .isEqualTo(cardBulkOrderListPageResponse)
    }
}
