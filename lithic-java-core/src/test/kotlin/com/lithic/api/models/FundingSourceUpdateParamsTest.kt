package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FundingSourceUpdateParamsTest {

    @Test
    fun createFundingSourceUpdateParams() {
        FundingSourceUpdateParams.builder()
            .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .state(FundingSourceUpdateParams.State.DELETED)
            .build()
    }

    @Test
    fun toBody() {
        val params =
            FundingSourceUpdateParams.builder()
                .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .state(FundingSourceUpdateParams.State.DELETED)
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.state()).isEqualTo(FundingSourceUpdateParams.State.DELETED)
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            FundingSourceUpdateParams.builder()
                .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            FundingSourceUpdateParams.builder()
                .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "fundingSourceToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
