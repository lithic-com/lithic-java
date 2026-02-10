// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2ListResultsPageResponseTest {

    @Test
    fun create() {
        val authRuleV2ListResultsPageResponse =
            AuthRuleV2ListResultsPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        assertThat(authRuleV2ListResultsPageResponse.data())
            .containsExactly(
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
            )
        assertThat(authRuleV2ListResultsPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleV2ListResultsPageResponse =
            AuthRuleV2ListResultsPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        val roundtrippedAuthRuleV2ListResultsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleV2ListResultsPageResponse),
                jacksonTypeRef<AuthRuleV2ListResultsPageResponse>(),
            )

        assertThat(roundtrippedAuthRuleV2ListResultsPageResponse)
            .isEqualTo(authRuleV2ListResultsPageResponse)
    }
}
