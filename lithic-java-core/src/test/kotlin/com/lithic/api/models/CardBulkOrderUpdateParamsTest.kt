// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardBulkOrderUpdateParamsTest {

    @Test
    fun create() {
        CardBulkOrderUpdateParams.builder()
            .bulkOrderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(CardBulkOrderUpdateParams.Status.LOCKED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardBulkOrderUpdateParams.builder()
                .bulkOrderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(CardBulkOrderUpdateParams.Status.LOCKED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardBulkOrderUpdateParams.builder()
                .bulkOrderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(CardBulkOrderUpdateParams.Status.LOCKED)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(CardBulkOrderUpdateParams.Status.LOCKED)
    }
}
