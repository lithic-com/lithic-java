// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthorizationChallengeResponseParamsTest {

    @Test
    fun create() {
        CardAuthorizationChallengeResponseParams.builder()
            .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .response(CardAuthorizationChallengeResponseParams.Response.APPROVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardAuthorizationChallengeResponseParams.builder()
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .response(CardAuthorizationChallengeResponseParams.Response.APPROVE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardAuthorizationChallengeResponseParams.builder()
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .response(CardAuthorizationChallengeResponseParams.Response.APPROVE)
                .build()

        val body = params._body()

        assertThat(body.response())
            .isEqualTo(CardAuthorizationChallengeResponseParams.Response.APPROVE)
    }
}
