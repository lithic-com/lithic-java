// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardFinancialTransactionListParamsTest {

    @Test
    fun createCardFinancialTransactionListParams() {
        CardFinancialTransactionListParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .category(CardFinancialTransactionListParams.Category.CARD)
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .result(CardFinancialTransactionListParams.Result.APPROVED)
            .startingAfter("starting_after")
            .status(CardFinancialTransactionListParams.Status.DECLINED)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardFinancialTransactionListParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .category(CardFinancialTransactionListParams.Category.CARD)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .result(CardFinancialTransactionListParams.Result.APPROVED)
                .startingAfter("starting_after")
                .status(CardFinancialTransactionListParams.Status.DECLINED)
                .build()
        val expected = QueryParams.builder()
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("category", CardFinancialTransactionListParams.Category.CARD.toString())
        expected.put("end", "2019-12-27T18:11:19.117Z")
        expected.put("ending_before", "ending_before")
        expected.put("result", CardFinancialTransactionListParams.Result.APPROVED.toString())
        expected.put("starting_after", "starting_after")
        expected.put("status", CardFinancialTransactionListParams.Status.DECLINED.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CardFinancialTransactionListParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            CardFinancialTransactionListParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "cardToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
