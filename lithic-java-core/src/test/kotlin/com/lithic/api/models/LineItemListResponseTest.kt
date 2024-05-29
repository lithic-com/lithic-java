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
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .category(LineItemListResponse.Category.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .eventType(LineItemListResponse.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .settledDate(LocalDate.parse("2019-12-27"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .descriptor("string")
                .build()
        assertThat(lineItemListResponse).isNotNull
        assertThat(lineItemListResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.amount()).isEqualTo(123L)
        assertThat(lineItemListResponse.category()).isEqualTo(LineItemListResponse.Category.ACH)
        assertThat(lineItemListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lineItemListResponse.currency()).isEqualTo("string")
        assertThat(lineItemListResponse.eventType())
            .isEqualTo(LineItemListResponse.FinancialEventType.ACH_ORIGINATION_CANCELLED)
        assertThat(lineItemListResponse.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.financialTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.settledDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(lineItemListResponse.cardToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(lineItemListResponse.descriptor()).contains("string")
    }
}
