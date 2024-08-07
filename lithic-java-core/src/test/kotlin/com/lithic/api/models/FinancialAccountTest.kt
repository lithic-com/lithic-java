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
                .isForBenefitOf(true)
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountNumber("account_number")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .nickname("nickname")
                .routingNumber("routing_number")
                .build()
        assertThat(financialAccount).isNotNull
        assertThat(financialAccount.token()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(financialAccount.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccount.isForBenefitOf()).isEqualTo(true)
        assertThat(financialAccount.type()).isEqualTo(FinancialAccount.Type.ISSUING)
        assertThat(financialAccount.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccount.accountNumber()).contains("account_number")
        assertThat(financialAccount.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialAccount.nickname()).contains("nickname")
        assertThat(financialAccount.routingNumber()).contains("routing_number")
    }
}
