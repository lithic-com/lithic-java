// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseEntityTest {

    @Test
    fun create() {
        val caseEntity =
            CaseEntity.builder()
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .entityType(CaseEntity.EntityType2.CARD)
                .build()

        assertThat(caseEntity.entityToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseEntity.entityType()).isEqualTo(CaseEntity.EntityType2.CARD)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val caseEntity =
            CaseEntity.builder()
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .entityType(CaseEntity.EntityType2.CARD)
                .build()

        val roundtrippedCaseEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseEntity),
                jacksonTypeRef<CaseEntity>(),
            )

        assertThat(roundtrippedCaseEntity).isEqualTo(caseEntity)
    }
}
