// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.core.JsonValue
import com.lithic.api.models.CardBulkOrderCreateParams
import com.lithic.api.models.CardBulkOrderUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardBulkOrderServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val cardBulkOrderFuture =
            cardBulkOrderServiceAsync.create(
                CardBulkOrderCreateParams.builder()
                    .customerProductId("custom-card-design-123")
                    .shippingAddress(
                        JsonValue.from(
                            mapOf(
                                "address1" to "123 Main Street",
                                "city" to "NEW YORK",
                                "country" to "USA",
                                "first_name" to "Johnny",
                                "last_name" to "Appleseed",
                                "postal_code" to "10001",
                                "state" to "NY",
                            )
                        )
                    )
                    .shippingMethod(CardBulkOrderCreateParams.ShippingMethod.BULK_EXPEDITED)
                    .build()
            )

        val cardBulkOrder = cardBulkOrderFuture.get()
        cardBulkOrder.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val cardBulkOrderFuture =
            cardBulkOrderServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val cardBulkOrder = cardBulkOrderFuture.get()
        cardBulkOrder.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val cardBulkOrderFuture =
            cardBulkOrderServiceAsync.update(
                CardBulkOrderUpdateParams.builder()
                    .bulkOrderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(CardBulkOrderUpdateParams.Status.LOCKED)
                    .build()
            )

        val cardBulkOrder = cardBulkOrderFuture.get()
        cardBulkOrder.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val pageFuture = cardBulkOrderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
