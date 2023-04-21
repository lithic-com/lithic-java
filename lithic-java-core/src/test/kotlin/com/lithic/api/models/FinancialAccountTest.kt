package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountTest {

    @Test
    fun createFinancialAccount() {
        val financialAccount =
            FinancialAccount.builder()
                .accountNumber("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .routingNumber("string")
                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(financialAccount).isNotNull
        assertThat(financialAccount.accountNumber()).contains("string")
        assertThat(financialAccount.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccount.routingNumber()).contains("string")
        assertThat(financialAccount.token()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(financialAccount.type()).isEqualTo(FinancialAccount.Type.ISSUING)
        assertThat(financialAccount.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
