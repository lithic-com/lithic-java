// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountUpdateParamsTest {

    @Test
    fun createAccountUpdateParams() {
        AccountUpdateParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dailySpendLimit(123L)
            .lifetimeSpendLimit(123L)
            .monthlySpendLimit(123L)
            .state(AccountUpdateParams.State.ACTIVE)
            .verificationAddress(
                AccountUpdateParams.VerificationAddress.builder()
                    .address1("string")
                    .address2("string")
                    .city("string")
                    .country("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dailySpendLimit(123L)
                .lifetimeSpendLimit(123L)
                .monthlySpendLimit(123L)
                .state(AccountUpdateParams.State.ACTIVE)
                .verificationAddress(
                    AccountUpdateParams.VerificationAddress.builder()
                        .address1("string")
                        .address2("string")
                        .city("string")
                        .country("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dailySpendLimit()).isEqualTo(123L)
        assertThat(body.lifetimeSpendLimit()).isEqualTo(123L)
        assertThat(body.monthlySpendLimit()).isEqualTo(123L)
        assertThat(body.state()).isEqualTo(AccountUpdateParams.State.ACTIVE)
        assertThat(body.verificationAddress())
            .isEqualTo(
                AccountUpdateParams.VerificationAddress.builder()
                    .address1("string")
                    .address2("string")
                    .city("string")
                    .country("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "accountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
