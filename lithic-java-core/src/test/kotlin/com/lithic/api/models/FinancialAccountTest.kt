// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountTest {

    @Test
    fun createFinancialAccount() {
        val financialAccount =
            FinancialAccount.builder()
                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountNumber("string")
                .nickname("string")
                .routingNumber("string")
                .build()
        assertThat(financialAccount).isNotNull
        assertThat(financialAccount.token()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(financialAccount.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccount.type()).isEqualTo(FinancialAccount.Type.ISSUING)
        assertThat(financialAccount.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccount.accountNumber()).contains("string")
        assertThat(financialAccount.nickname()).contains("string")
        assertThat(financialAccount.routingNumber()).contains("string")
    }
}
