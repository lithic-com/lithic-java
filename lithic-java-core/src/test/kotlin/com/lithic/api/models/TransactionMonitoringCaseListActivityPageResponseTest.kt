// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseListActivityPageResponseTest {

    @Test
    fun create() {
        val transactionMonitoringCaseListActivityPageResponse =
            TransactionMonitoringCaseListActivityPageResponse.builder()
                .addData(
                    CaseActivityEntry.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .actorToken("actor_token")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entryType(CaseActivityType.STATUS)
                        .newValue("new_value")
                        .previousValue("previous_value")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(transactionMonitoringCaseListActivityPageResponse.data())
            .containsExactly(
                CaseActivityEntry.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .actorToken("actor_token")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entryType(CaseActivityType.STATUS)
                    .newValue("new_value")
                    .previousValue("previous_value")
                    .build()
            )
        assertThat(transactionMonitoringCaseListActivityPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionMonitoringCaseListActivityPageResponse =
            TransactionMonitoringCaseListActivityPageResponse.builder()
                .addData(
                    CaseActivityEntry.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .actorToken("actor_token")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entryType(CaseActivityType.STATUS)
                        .newValue("new_value")
                        .previousValue("previous_value")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedTransactionMonitoringCaseListActivityPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionMonitoringCaseListActivityPageResponse),
                jacksonTypeRef<TransactionMonitoringCaseListActivityPageResponse>(),
            )

        assertThat(roundtrippedTransactionMonitoringCaseListActivityPageResponse)
            .isEqualTo(transactionMonitoringCaseListActivityPageResponse)
    }
}
