package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardUpdateParamsTest {

    @Test
    fun createCardUpdateParams() {
        CardUpdateParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fundingToken("ecbd1d58-0299-48b3-84da-6ed7f5bf9ec1")
            .memo("New Card")
            .spendLimit(123L)
            .spendLimitDuration(CardUpdateParams.SpendLimitDuration.ANNUALLY)
            .authRuleToken("string")
            .state(CardUpdateParams.State.CLOSED)
            .pin("string")
            .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
            .build()
    }

    @Test
    fun toBody() {
        val params =
            CardUpdateParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fundingToken("ecbd1d58-0299-48b3-84da-6ed7f5bf9ec1")
                .memo("New Card")
                .spendLimit(123L)
                .spendLimitDuration(CardUpdateParams.SpendLimitDuration.ANNUALLY)
                .authRuleToken("string")
                .state(CardUpdateParams.State.CLOSED)
                .pin("string")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.fundingToken()).isEqualTo("ecbd1d58-0299-48b3-84da-6ed7f5bf9ec1")
        assertThat(body.memo()).isEqualTo("New Card")
        assertThat(body.spendLimit()).isEqualTo(123L)
        assertThat(body.spendLimitDuration())
            .isEqualTo(CardUpdateParams.SpendLimitDuration.ANNUALLY)
        assertThat(body.authRuleToken()).isEqualTo("string")
        assertThat(body.state()).isEqualTo(CardUpdateParams.State.CLOSED)
        assertThat(body.pin()).isEqualTo("string")
        assertThat(body.digitalCardArtToken()).isEqualTo("00000000-0000-0000-1000-000000000000")
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.toBody()
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
