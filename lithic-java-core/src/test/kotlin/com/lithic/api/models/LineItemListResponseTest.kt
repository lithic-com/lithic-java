// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LineItemListResponseTest {

    @Test
    fun createLineItemListResponse() {
        val lineItemListResponse =
            LineItemListResponse.builder()
                .token("token")
                .amount(123L)
                .category(LineItemListResponse.TransactionCategory.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .eventType(LineItemListResponse.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .descriptor("descriptor")
                .build()
        assertThat(lineItemListResponse).isNotNull
        assertThat(lineItemListResponse.token()).isEqualTo("token")
        assertThat(lineItemListResponse.amount()).isEqualTo(123L)
        assertThat(lineItemListResponse.category())
            .isEqualTo(LineItemListResponse.TransactionCategory.ACH)
        assertThat(lineItemListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lineItemListResponse.currency()).isEqualTo("currency")
        assertThat(lineItemListResponse.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(lineItemListResponse.eventType())
            .isEqualTo(LineItemListResponse.FinancialEventType.ACH_ORIGINATION_CANCELLED)
        assertThat(lineItemListResponse.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.financialTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.financialTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.cardToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.descriptor()).contains("descriptor")
    }
}
