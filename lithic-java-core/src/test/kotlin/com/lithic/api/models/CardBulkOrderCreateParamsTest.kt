// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardBulkOrderCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.customerProductId()).isEqualTo("custom-card-design-123")
        assertThat(body._shippingAddress())
            .isEqualTo(
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
        assertThat(body.shippingMethod())
            .isEqualTo(CardBulkOrderCreateParams.ShippingMethod.BULK_EXPEDITED)
    }
}
