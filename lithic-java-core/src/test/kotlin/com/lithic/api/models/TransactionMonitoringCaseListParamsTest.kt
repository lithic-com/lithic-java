// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseListParamsTest {

    @Test
    fun create() {
        TransactionMonitoringCaseListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .assignee("assignee")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ruleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sortBy(CaseSortOrder.CREATED_ASC)
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(CaseStatus.OPEN)
            .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransactionMonitoringCaseListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .assignee("assignee")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ruleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sortBy(CaseSortOrder.CREATED_ASC)
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(CaseStatus.OPEN)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("assignee", "assignee")
                    .put("begin", "2019-12-27T18:11:19.117Z")
                    .put("card_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("entity_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "1")
                    .put("queue_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("rule_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("sort_by", "CREATED_ASC")
                    .put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "OPEN")
                    .put("transaction_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionMonitoringCaseListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
