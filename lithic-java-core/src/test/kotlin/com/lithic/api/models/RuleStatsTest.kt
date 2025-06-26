// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleStatsTest {

    @Test
    fun create() {
        val ruleStats =
            RuleStats.builder()
                .approved(0L)
                .challenged(0L)
                .declined(0L)
                .addExample(
                    RuleStats.Example.builder()
                        .approved(true)
                        .decision(RuleStats.Example.Decision.APPROVED)
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .version(0L)
                .build()

        assertThat(ruleStats.approved()).contains(0L)
        assertThat(ruleStats.challenged()).contains(0L)
        assertThat(ruleStats.declined()).contains(0L)
        assertThat(ruleStats.examples().getOrNull())
            .containsExactly(
                RuleStats.Example.builder()
                    .approved(true)
                    .decision(RuleStats.Example.Decision.APPROVED)
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(ruleStats.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleStats =
            RuleStats.builder()
                .approved(0L)
                .challenged(0L)
                .declined(0L)
                .addExample(
                    RuleStats.Example.builder()
                        .approved(true)
                        .decision(RuleStats.Example.Decision.APPROVED)
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .version(0L)
                .build()

        val roundtrippedRuleStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleStats),
                jacksonTypeRef<RuleStats>(),
            )

        assertThat(roundtrippedRuleStats).isEqualTo(ruleStats)
    }
}
