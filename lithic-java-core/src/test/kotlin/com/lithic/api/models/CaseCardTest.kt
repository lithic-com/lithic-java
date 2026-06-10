// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseCardTest {

    @Test
    fun create() {
        val caseCard =
            CaseCard.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionCount(0L)
                .build()

        assertThat(caseCard.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseCard.cardToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseCard.transactionCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val caseCard =
            CaseCard.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionCount(0L)
                .build()

        val roundtrippedCaseCard =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseCard),
                jacksonTypeRef<CaseCard>(),
            )

        assertThat(roundtrippedCaseCard).isEqualTo(caseCard)
    }
}
