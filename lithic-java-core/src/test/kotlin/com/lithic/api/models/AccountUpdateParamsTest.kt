// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateParamsTest {

    @Test
    fun create() {
        AccountUpdateParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .dailySpendLimit(1000L)
            .lifetimeSpendLimit(0L)
            .monthlySpendLimit(0L)
            .state(AccountUpdateParams.State.ACTIVE)
            .substatus(AccountUpdateParams.Substatus.FRAUD_IDENTIFIED)
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
    fun pathParams() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .dailySpendLimit(1000L)
                .lifetimeSpendLimit(0L)
                .monthlySpendLimit(0L)
                .state(AccountUpdateParams.State.ACTIVE)
                .substatus(AccountUpdateParams.Substatus.FRAUD_IDENTIFIED)
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

        val body = params._body()

        assertThat(body.comment()).contains("comment")
        assertThat(body.dailySpendLimit()).contains(1000L)
        assertThat(body.lifetimeSpendLimit()).contains(0L)
        assertThat(body.monthlySpendLimit()).contains(0L)
        assertThat(body.state()).contains(AccountUpdateParams.State.ACTIVE)
        assertThat(body.substatus()).contains(AccountUpdateParams.Substatus.FRAUD_IDENTIFIED)
        assertThat(body.verificationAddress())
            .contains(
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
    fun bodyWithoutOptionalFields() {
        val params =
            AccountUpdateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
