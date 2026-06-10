// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseActivityEntryTest {

    @Test
    fun create() {
        val caseActivityEntry =
            CaseActivityEntry.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actorToken("actor_token")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entryType(CaseActivityType.STATUS)
                .newValue("new_value")
                .previousValue("previous_value")
                .build()

        assertThat(caseActivityEntry.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(caseActivityEntry.actorToken()).contains("actor_token")
        assertThat(caseActivityEntry.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(caseActivityEntry.entryType()).isEqualTo(CaseActivityType.STATUS)
        assertThat(caseActivityEntry.newValue()).contains("new_value")
        assertThat(caseActivityEntry.previousValue()).contains("previous_value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val caseActivityEntry =
            CaseActivityEntry.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actorToken("actor_token")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entryType(CaseActivityType.STATUS)
                .newValue("new_value")
                .previousValue("previous_value")
                .build()

        val roundtrippedCaseActivityEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseActivityEntry),
                jacksonTypeRef<CaseActivityEntry>(),
            )

        assertThat(roundtrippedCaseActivityEntry).isEqualTo(caseActivityEntry)
    }
}
