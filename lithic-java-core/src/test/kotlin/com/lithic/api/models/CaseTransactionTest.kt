// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseTransactionTest {

    @Test
    fun create() {
        val caseTransaction =
            CaseTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(caseTransaction.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseTransaction.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseTransaction.addedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(caseTransaction.cardToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseTransaction.transactionCreatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val caseTransaction =
            CaseTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCaseTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseTransaction),
                jacksonTypeRef<CaseTransaction>(),
            )

        assertThat(roundtrippedCaseTransaction).isEqualTo(caseTransaction)
    }
}
