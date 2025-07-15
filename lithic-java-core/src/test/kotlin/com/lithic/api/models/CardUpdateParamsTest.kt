// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateParamsTest {

    @Test
    fun create() {
        CardUpdateParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("Updated Name")
            .networkProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pin("pin")
            .pinStatus(CardUpdateParams.PinStatus.OK)
            .spendLimit(100L)
            .spendLimitDuration(SpendLimitDuration.FOREVER)
            .state(CardUpdateParams.State.OPEN)
            .substatus(CardUpdateParams.Substatus.LOST)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardUpdateParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("Updated Name")
                .networkProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pin("pin")
                .pinStatus(CardUpdateParams.PinStatus.OK)
                .spendLimit(100L)
                .spendLimitDuration(SpendLimitDuration.FOREVER)
                .state(CardUpdateParams.State.OPEN)
                .substatus(CardUpdateParams.Substatus.LOST)
                .build()

        val body = params._body()

        assertThat(body.comment()).contains("comment")
        assertThat(body.digitalCardArtToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).contains("Updated Name")
        assertThat(body.networkProgramToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.pin()).contains("pin")
        assertThat(body.pinStatus()).contains(CardUpdateParams.PinStatus.OK)
        assertThat(body.spendLimit()).contains(100L)
        assertThat(body.spendLimitDuration()).contains(SpendLimitDuration.FOREVER)
        assertThat(body.state()).contains(CardUpdateParams.State.OPEN)
        assertThat(body.substatus()).contains(CardUpdateParams.Substatus.LOST)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
