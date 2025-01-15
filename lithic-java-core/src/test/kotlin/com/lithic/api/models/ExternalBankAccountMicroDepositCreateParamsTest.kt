// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountMicroDepositCreateParamsTest {

    @Test
    fun createExternalBankAccountMicroDepositCreateParams() {
        ExternalBankAccountMicroDepositCreateParams.builder()
            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addMicroDeposit(0L)
            .addMicroDeposit(0L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalBankAccountMicroDepositCreateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMicroDeposit(0L)
                .addMicroDeposit(0L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.microDeposits()).isEqualTo(listOf(0L, 0L))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalBankAccountMicroDepositCreateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMicroDeposit(0L)
                .addMicroDeposit(0L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.microDeposits()).isEqualTo(listOf(0L, 0L))
    }

    @Test
    fun getPathParam() {
        val params =
            ExternalBankAccountMicroDepositCreateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMicroDeposit(0L)
                .addMicroDeposit(0L)
                .build()
        assertThat(params).isNotNull
        // path param "externalBankAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
