// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionRetrieveResponseTest {

    @Test
    fun create() {
        val transactionRetrieveResponse =
            TransactionRetrieveResponse.builder()
                .fraudStatus(TransactionRetrieveResponse.FraudStatus.SUSPECTED_FRAUD)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fraudType(TransactionRetrieveResponse.FraudType.FIRST_PARTY_FRAUD)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(transactionRetrieveResponse.fraudStatus())
            .isEqualTo(TransactionRetrieveResponse.FraudStatus.SUSPECTED_FRAUD)
        assertThat(transactionRetrieveResponse.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionRetrieveResponse.comment()).contains("comment")
        assertThat(transactionRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionRetrieveResponse.fraudType())
            .contains(TransactionRetrieveResponse.FraudType.FIRST_PARTY_FRAUD)
        assertThat(transactionRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionRetrieveResponse =
            TransactionRetrieveResponse.builder()
                .fraudStatus(TransactionRetrieveResponse.FraudStatus.SUSPECTED_FRAUD)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fraudType(TransactionRetrieveResponse.FraudType.FIRST_PARTY_FRAUD)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTransactionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionRetrieveResponse),
                jacksonTypeRef<TransactionRetrieveResponse>(),
            )

        assertThat(roundtrippedTransactionRetrieveResponse).isEqualTo(transactionRetrieveResponse)
    }
}
