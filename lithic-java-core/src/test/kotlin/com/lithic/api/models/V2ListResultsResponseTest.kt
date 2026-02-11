// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class V2ListResultsResponseTest {

    @Test
    fun ofAuthorizationResult() {
        val authorizationResult =
            V2ListResultsResponse.AuthorizationResult.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAction(
                    V2ListResultsResponse.AuthorizationResult.Action.builder()
                        .type(
                            V2ListResultsResponse.AuthorizationResult.Action.AuthorizationAction
                                .DECLINE
                        )
                        .explanation("explanation")
                        .build()
                )
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventStream(V2ListResultsResponse.AuthorizationResult.EventStream.AUTHORIZATION)
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mode(V2ListResultsResponse.AuthorizationResult.AuthRuleState.ACTIVE)
                .ruleVersion(0L)
                .build()

        val v2ListResultsResponse = V2ListResultsResponse.ofAuthorizationResult(authorizationResult)

        assertThat(v2ListResultsResponse.authorizationResult()).contains(authorizationResult)
        assertThat(v2ListResultsResponse.authentication3dsResult()).isEmpty
        assertThat(v2ListResultsResponse.tokenizationResult()).isEmpty
        assertThat(v2ListResultsResponse.achResult()).isEmpty
    }

    @Test
    fun ofAuthorizationResultRoundtrip() {
        val jsonMapper = jsonMapper()
        val v2ListResultsResponse =
            V2ListResultsResponse.ofAuthorizationResult(
                V2ListResultsResponse.AuthorizationResult.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAction(
                        V2ListResultsResponse.AuthorizationResult.Action.builder()
                            .type(
                                V2ListResultsResponse.AuthorizationResult.Action.AuthorizationAction
                                    .DECLINE
                            )
                            .explanation("explanation")
                            .build()
                    )
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventStream(
                        V2ListResultsResponse.AuthorizationResult.EventStream.AUTHORIZATION
                    )
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .mode(V2ListResultsResponse.AuthorizationResult.AuthRuleState.ACTIVE)
                    .ruleVersion(0L)
                    .build()
            )

        val roundtrippedV2ListResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ListResultsResponse),
                jacksonTypeRef<V2ListResultsResponse>(),
            )

        assertThat(roundtrippedV2ListResultsResponse).isEqualTo(v2ListResultsResponse)
    }

    @Test
    fun ofAuthentication3dsResult() {
        val authentication3dsResult =
            V2ListResultsResponse.Authentication3dsResult.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAction(
                    V2ListResultsResponse.Authentication3dsResult.Action.builder()
                        .type(
                            V2ListResultsResponse.Authentication3dsResult.Action
                                .Authentication3dsAction
                                .DECLINE
                        )
                        .explanation("explanation")
                        .build()
                )
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventStream(
                    V2ListResultsResponse.Authentication3dsResult.EventStream
                        .THREE_DS_AUTHENTICATION
                )
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mode(V2ListResultsResponse.Authentication3dsResult.AuthRuleState.ACTIVE)
                .ruleVersion(0L)
                .build()

        val v2ListResultsResponse =
            V2ListResultsResponse.ofAuthentication3dsResult(authentication3dsResult)

        assertThat(v2ListResultsResponse.authorizationResult()).isEmpty
        assertThat(v2ListResultsResponse.authentication3dsResult())
            .contains(authentication3dsResult)
        assertThat(v2ListResultsResponse.tokenizationResult()).isEmpty
        assertThat(v2ListResultsResponse.achResult()).isEmpty
    }

    @Test
    fun ofAuthentication3dsResultRoundtrip() {
        val jsonMapper = jsonMapper()
        val v2ListResultsResponse =
            V2ListResultsResponse.ofAuthentication3dsResult(
                V2ListResultsResponse.Authentication3dsResult.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAction(
                        V2ListResultsResponse.Authentication3dsResult.Action.builder()
                            .type(
                                V2ListResultsResponse.Authentication3dsResult.Action
                                    .Authentication3dsAction
                                    .DECLINE
                            )
                            .explanation("explanation")
                            .build()
                    )
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventStream(
                        V2ListResultsResponse.Authentication3dsResult.EventStream
                            .THREE_DS_AUTHENTICATION
                    )
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .mode(V2ListResultsResponse.Authentication3dsResult.AuthRuleState.ACTIVE)
                    .ruleVersion(0L)
                    .build()
            )

        val roundtrippedV2ListResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ListResultsResponse),
                jacksonTypeRef<V2ListResultsResponse>(),
            )

        assertThat(roundtrippedV2ListResultsResponse).isEqualTo(v2ListResultsResponse)
    }

    @Test
    fun ofTokenizationResult() {
        val tokenizationResult =
            V2ListResultsResponse.TokenizationResult.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAction(
                    V2ListResultsResponse.TokenizationResult.Action.DeclineAction.builder()
                        .type(
                            V2ListResultsResponse.TokenizationResult.Action.DeclineAction.Type
                                .DECLINE
                        )
                        .explanation("explanation")
                        .reason(
                            V2ListResultsResponse.TokenizationResult.Action.DeclineAction.Reason
                                .ACCOUNT_SCORE_1
                        )
                        .build()
                )
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventStream(V2ListResultsResponse.TokenizationResult.EventStream.TOKENIZATION)
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mode(V2ListResultsResponse.TokenizationResult.AuthRuleState.ACTIVE)
                .ruleVersion(0L)
                .build()

        val v2ListResultsResponse = V2ListResultsResponse.ofTokenizationResult(tokenizationResult)

        assertThat(v2ListResultsResponse.authorizationResult()).isEmpty
        assertThat(v2ListResultsResponse.authentication3dsResult()).isEmpty
        assertThat(v2ListResultsResponse.tokenizationResult()).contains(tokenizationResult)
        assertThat(v2ListResultsResponse.achResult()).isEmpty
    }

    @Test
    fun ofTokenizationResultRoundtrip() {
        val jsonMapper = jsonMapper()
        val v2ListResultsResponse =
            V2ListResultsResponse.ofTokenizationResult(
                V2ListResultsResponse.TokenizationResult.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAction(
                        V2ListResultsResponse.TokenizationResult.Action.DeclineAction.builder()
                            .type(
                                V2ListResultsResponse.TokenizationResult.Action.DeclineAction.Type
                                    .DECLINE
                            )
                            .explanation("explanation")
                            .reason(
                                V2ListResultsResponse.TokenizationResult.Action.DeclineAction.Reason
                                    .ACCOUNT_SCORE_1
                            )
                            .build()
                    )
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventStream(V2ListResultsResponse.TokenizationResult.EventStream.TOKENIZATION)
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .mode(V2ListResultsResponse.TokenizationResult.AuthRuleState.ACTIVE)
                    .ruleVersion(0L)
                    .build()
            )

        val roundtrippedV2ListResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ListResultsResponse),
                jacksonTypeRef<V2ListResultsResponse>(),
            )

        assertThat(roundtrippedV2ListResultsResponse).isEqualTo(v2ListResultsResponse)
    }

    @Test
    fun ofAchResult() {
        val achResult =
            V2ListResultsResponse.AchResult.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAction(
                    V2ListResultsResponse.AchResult.Action.ApproveAction.builder()
                        .type(V2ListResultsResponse.AchResult.Action.ApproveAction.Type.APPROVE)
                        .explanation("explanation")
                        .build()
                )
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventStream(V2ListResultsResponse.AchResult.EventStream.ACH_CREDIT_RECEIPT)
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mode(V2ListResultsResponse.AchResult.AuthRuleState.ACTIVE)
                .ruleVersion(0L)
                .build()

        val v2ListResultsResponse = V2ListResultsResponse.ofAchResult(achResult)

        assertThat(v2ListResultsResponse.authorizationResult()).isEmpty
        assertThat(v2ListResultsResponse.authentication3dsResult()).isEmpty
        assertThat(v2ListResultsResponse.tokenizationResult()).isEmpty
        assertThat(v2ListResultsResponse.achResult()).contains(achResult)
    }

    @Test
    fun ofAchResultRoundtrip() {
        val jsonMapper = jsonMapper()
        val v2ListResultsResponse =
            V2ListResultsResponse.ofAchResult(
                V2ListResultsResponse.AchResult.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAction(
                        V2ListResultsResponse.AchResult.Action.ApproveAction.builder()
                            .type(V2ListResultsResponse.AchResult.Action.ApproveAction.Type.APPROVE)
                            .explanation("explanation")
                            .build()
                    )
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evaluationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventStream(V2ListResultsResponse.AchResult.EventStream.ACH_CREDIT_RECEIPT)
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .mode(V2ListResultsResponse.AchResult.AuthRuleState.ACTIVE)
                    .ruleVersion(0L)
                    .build()
            )

        val roundtrippedV2ListResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ListResultsResponse),
                jacksonTypeRef<V2ListResultsResponse>(),
            )

        assertThat(roundtrippedV2ListResultsResponse).isEqualTo(v2ListResultsResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val v2ListResultsResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<V2ListResultsResponse>())

        val e = assertThrows<LithicInvalidDataException> { v2ListResultsResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
