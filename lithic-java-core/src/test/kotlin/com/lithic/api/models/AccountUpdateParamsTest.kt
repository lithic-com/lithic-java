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
            .verificationAddress(
                AccountUpdateParams.VerificationAddress.builder()
                    .address1("string")
                    .address2("string")
                    .city("string")
                    .state("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
            .state(AccountUpdateParams.State.ACTIVE)
            .build()
    }

    @Test
    fun toBody() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dailySpendLimit(123L)
                .lifetimeSpendLimit(123L)
                .monthlySpendLimit(123L)
                .verificationAddress(
                    AccountUpdateParams.VerificationAddress.builder()
                        .address1("string")
                        .address2("string")
                        .city("string")
                        .state("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .state(AccountUpdateParams.State.ACTIVE)
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.dailySpendLimit()).isEqualTo(123L)
        assertThat(body.lifetimeSpendLimit()).isEqualTo(123L)
        assertThat(body.monthlySpendLimit()).isEqualTo(123L)
        assertThat(body.verificationAddress())
            .isEqualTo(
                AccountUpdateParams.VerificationAddress.builder()
                    .address1("string")
                    .address2("string")
                    .city("string")
                    .state("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
        assertThat(body.state()).isEqualTo(AccountUpdateParams.State.ACTIVE)
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.toBody()
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
