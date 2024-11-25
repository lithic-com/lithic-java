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
            .dailySpendLimit(0L)
            .lifetimeSpendLimit(0L)
            .monthlySpendLimit(0L)
            .state(AccountUpdateParams.State.ACTIVE)
            .verificationAddress(
                AccountUpdateParams.VerificationAddress.builder()
                    .address1("address1")
                    .address2("address2")
                    .city("city")
                    .country("country")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dailySpendLimit(0L)
                .lifetimeSpendLimit(0L)
                .monthlySpendLimit(0L)
                .state(AccountUpdateParams.State.ACTIVE)
                .verificationAddress(
                    AccountUpdateParams.VerificationAddress.builder()
                        .address1("address1")
                        .address2("address2")
                        .city("city")
                        .country("country")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dailySpendLimit()).isEqualTo(0L)
        assertThat(body.lifetimeSpendLimit()).isEqualTo(0L)
        assertThat(body.monthlySpendLimit()).isEqualTo(0L)
        assertThat(body.state()).isEqualTo(AccountUpdateParams.State.ACTIVE)
        assertThat(body.verificationAddress())
            .isEqualTo(
                AccountUpdateParams.VerificationAddress.builder()
                    .address1("address1")
                    .address2("address2")
                    .city("city")
                    .country("country")
                    .postalCode("postal_code")
                    .state("state")
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
