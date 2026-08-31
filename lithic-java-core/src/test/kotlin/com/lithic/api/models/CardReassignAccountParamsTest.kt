// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardReassignAccountParamsTest {

    @Test
    fun create() {
        CardReassignAccountParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .newAccountToken("82d7c408-2bbb-4f63-889a-8a2a2b1601af")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardReassignAccountParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .newAccountToken("82d7c408-2bbb-4f63-889a-8a2a2b1601af")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardReassignAccountParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .newAccountToken("82d7c408-2bbb-4f63-889a-8a2a2b1601af")
                .build()

        val body = params._body()

        assertThat(body.newAccountToken()).isEqualTo("82d7c408-2bbb-4f63-889a-8a2a2b1601af")
    }
}
