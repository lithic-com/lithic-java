// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2ListResultsResponseTest {

    @Test
    fun create() {
        val v2ListResultsResponse =
            V2ListResultsResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAction(
                    V2ListResultsResponse.Action.AuthorizationAction.builder()
                        .explanation("explanation")
                        .build()
                )
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventStream(EventStream.AUTHORIZATION)
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mode(V2ListResultsResponse.AuthRuleState.ACTIVE)
                .ruleVersion(0L)
                .build()

        assertThat(v2ListResultsResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2ListResultsResponse.actions())
            .containsExactly(
                V2ListResultsResponse.Action.ofAuthorization(
                    V2ListResultsResponse.Action.AuthorizationAction.builder()
                        .explanation("explanation")
                        .build()
                )
            )
        assertThat(v2ListResultsResponse.authRuleToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2ListResultsResponse.evaluationTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v2ListResultsResponse.eventStream()).isEqualTo(EventStream.AUTHORIZATION)
        assertThat(v2ListResultsResponse.eventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2ListResultsResponse.mode())
            .isEqualTo(V2ListResultsResponse.AuthRuleState.ACTIVE)
        assertThat(v2ListResultsResponse.ruleVersion()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2ListResultsResponse =
            V2ListResultsResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAction(
                    V2ListResultsResponse.Action.AuthorizationAction.builder()
                        .explanation("explanation")
                        .build()
                )
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventStream(EventStream.AUTHORIZATION)
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mode(V2ListResultsResponse.AuthRuleState.ACTIVE)
                .ruleVersion(0L)
                .build()

        val roundtrippedV2ListResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ListResultsResponse),
                jacksonTypeRef<V2ListResultsResponse>(),
            )

        assertThat(roundtrippedV2ListResultsResponse).isEqualTo(v2ListResultsResponse)
    }
}
