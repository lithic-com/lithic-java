package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceTest {

    @Test
    fun createBalance() {
        val balance =
            Balance.builder()
                .availableAmount(123L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(123L)
                .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .totalAmount(123L)
                .type(Balance.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(balance).isNotNull
        assertThat(balance.availableAmount()).isEqualTo(123L)
        assertThat(balance.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balance.currency()).isEqualTo("string")
        assertThat(balance.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balance.lastTransactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(balance.pendingAmount()).isEqualTo(123L)
        assertThat(balance.token()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(balance.totalAmount()).isEqualTo(123L)
        assertThat(balance.type()).isEqualTo(Balance.Type.ISSUING)
        assertThat(balance.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
