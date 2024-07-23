// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StatementLineItemsTest {

    @Test
    fun createStatementLineItems() {
        val statementLineItems =
            StatementLineItems.builder()
                .data(
                    listOf(
                        StatementLineItems.StatementLineItemResponse.builder()
                            .token("token")
                            .amount(123L)
                            .category(StatementLineItems.StatementLineItemResponse.Category.ACH)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .eventType(
                                StatementLineItems.StatementLineItemResponse.FinancialEventType
                                    .ACH_ORIGINATION_CANCELLED
                            )
                            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .settledDate(LocalDate.parse("2019-12-27"))
                            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .descriptor("descriptor")
                            .build()
                    )
                )
                .hasMore(true)
                .build()
        assertThat(statementLineItems).isNotNull
        assertThat(statementLineItems.data())
            .containsExactly(
                StatementLineItems.StatementLineItemResponse.builder()
                    .token("token")
                    .amount(123L)
                    .category(StatementLineItems.StatementLineItemResponse.Category.ACH)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .eventType(
                        StatementLineItems.StatementLineItemResponse.FinancialEventType
                            .ACH_ORIGINATION_CANCELLED
                    )
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .settledDate(LocalDate.parse("2019-12-27"))
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .descriptor("descriptor")
                    .build()
            )
        assertThat(statementLineItems.hasMore()).isEqualTo(true)
    }
}
