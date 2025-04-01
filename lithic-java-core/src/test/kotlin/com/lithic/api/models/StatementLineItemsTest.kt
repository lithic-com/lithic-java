// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementLineItemsTest {

    @Test
    fun create() {
        val statementLineItems =
            StatementLineItems.builder()
                .addData(
                    StatementLineItems.StatementLineItemResponse.builder()
                        .token("token")
                        .amount(0L)
                        .category(
                            StatementLineItems.StatementLineItemResponse.TransactionCategory.ACH
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .eventType(
                            StatementLineItems.StatementLineItemResponse.FinancialEventType
                                .ACH_ORIGINATION_CANCELLED
                        )
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .financialTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .descriptor("descriptor")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(statementLineItems.data())
            .containsExactly(
                StatementLineItems.StatementLineItemResponse.builder()
                    .token("token")
                    .amount(0L)
                    .category(StatementLineItems.StatementLineItemResponse.TransactionCategory.ACH)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .eventType(
                        StatementLineItems.StatementLineItemResponse.FinancialEventType
                            .ACH_ORIGINATION_CANCELLED
                    )
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .descriptor("descriptor")
                    .build()
            )
        assertThat(statementLineItems.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementLineItems =
            StatementLineItems.builder()
                .addData(
                    StatementLineItems.StatementLineItemResponse.builder()
                        .token("token")
                        .amount(0L)
                        .category(
                            StatementLineItems.StatementLineItemResponse.TransactionCategory.ACH
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .eventType(
                            StatementLineItems.StatementLineItemResponse.FinancialEventType
                                .ACH_ORIGINATION_CANCELLED
                        )
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .financialTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .descriptor("descriptor")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedStatementLineItems =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementLineItems),
                jacksonTypeRef<StatementLineItems>(),
            )

        assertThat(roundtrippedStatementLineItems).isEqualTo(statementLineItems)
    }
}
