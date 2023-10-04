// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardUpdateParamsTest {

    @Test
    fun createCardUpdateParams() {
        CardUpdateParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .authRuleToken("string")
            .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
            .memo("New Card")
            .pin("string")
            .spendLimit(123L)
            .spendLimitDuration(SpendLimitDuration.ANNUALLY)
            .state(CardUpdateParams.State.CLOSED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardUpdateParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authRuleToken("string")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .memo("New Card")
                .pin("string")
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardUpdateParams.State.CLOSED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.authRuleToken()).isEqualTo("string")
        assertThat(body.digitalCardArtToken()).isEqualTo("00000000-0000-0000-1000-000000000000")
        assertThat(body.memo()).isEqualTo("New Card")
        assertThat(body.pin()).isEqualTo("string")
        assertThat(body.spendLimit()).isEqualTo(123L)
        assertThat(body.spendLimitDuration()).isEqualTo(SpendLimitDuration.ANNUALLY)
        assertThat(body.state()).isEqualTo(CardUpdateParams.State.CLOSED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.getBody()
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
