// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardUpdateParamsTest {

    @Test
    fun create() {
        CardUpdateParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("New Card")
            .pin("pin")
            .pinStatus(CardUpdateParams.PinStatus.OK)
            .spendLimit(0L)
            .spendLimitDuration(SpendLimitDuration.ANNUALLY)
            .state(CardUpdateParams.State.CLOSED)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardUpdateParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("New Card")
                .pin("pin")
                .pinStatus(CardUpdateParams.PinStatus.OK)
                .spendLimit(0L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardUpdateParams.State.CLOSED)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.digitalCardArtToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).contains("New Card")
        assertThat(body.pin()).contains("pin")
        assertThat(body.pinStatus()).contains(CardUpdateParams.PinStatus.OK)
        assertThat(body.spendLimit()).contains(0L)
        assertThat(body.spendLimitDuration()).contains(SpendLimitDuration.ANNUALLY)
        assertThat(body.state()).contains(CardUpdateParams.State.CLOSED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "cardToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
