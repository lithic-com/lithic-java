package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FundingSourceVerifyParamsTest {

    @Test
    fun createFundingSourceVerifyParams() {
        FundingSourceVerifyParams.builder()
            .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .microDeposits(listOf(123L))
            .build()
    }

    @Test
    fun toBody() {
        val params =
            FundingSourceVerifyParams.builder()
                .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .microDeposits(listOf(123L))
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.microDeposits()).isEqualTo(listOf(123L))
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            FundingSourceVerifyParams.builder()
                .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .microDeposits(listOf(123L))
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.microDeposits()).isEqualTo(listOf(123L))
    }

    @Test
    fun getPathParam() {
        val params =
            FundingSourceVerifyParams.builder()
                .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .microDeposits(listOf(123L))
                .build()
        assertThat(params).isNotNull
        // path param "fundingSourceToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
