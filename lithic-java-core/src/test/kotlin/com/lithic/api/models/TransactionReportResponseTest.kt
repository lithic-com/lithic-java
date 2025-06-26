// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionReportResponseTest {

    @Test
    fun create() {
        val transactionReportResponse =
            TransactionReportResponse.builder()
                .fraudStatus(TransactionReportResponse.FraudStatus.SUSPECTED_FRAUD)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fraudType(TransactionReportResponse.FraudType.FIRST_PARTY_FRAUD)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(transactionReportResponse.fraudStatus())
            .isEqualTo(TransactionReportResponse.FraudStatus.SUSPECTED_FRAUD)
        assertThat(transactionReportResponse.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionReportResponse.comment()).contains("comment")
        assertThat(transactionReportResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionReportResponse.fraudType())
            .contains(TransactionReportResponse.FraudType.FIRST_PARTY_FRAUD)
        assertThat(transactionReportResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionReportResponse =
            TransactionReportResponse.builder()
                .fraudStatus(TransactionReportResponse.FraudStatus.SUSPECTED_FRAUD)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fraudType(TransactionReportResponse.FraudType.FIRST_PARTY_FRAUD)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTransactionReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionReportResponse),
                jacksonTypeRef<TransactionReportResponse>(),
            )

        assertThat(roundtrippedTransactionReportResponse).isEqualTo(transactionReportResponse)
    }
}
