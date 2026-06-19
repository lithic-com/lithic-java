// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class AchPaymentUpdateActionTest {

    @Test
    fun ofTag() {
        val tag =
            AchPaymentUpdateAction.TagAction.builder()
                .key("key")
                .type(AchPaymentUpdateAction.TagAction.Type.TAG)
                .value("value")
                .build()

        val achPaymentUpdateAction = AchPaymentUpdateAction.ofTag(tag)

        assertThat(achPaymentUpdateAction.tag()).contains(tag)
        assertThat(achPaymentUpdateAction.createCase()).isEmpty
    }

    @Test
    fun ofTagRoundtrip() {
        val jsonMapper = jsonMapper()
        val achPaymentUpdateAction =
            AchPaymentUpdateAction.ofTag(
                AchPaymentUpdateAction.TagAction.builder()
                    .key("key")
                    .type(AchPaymentUpdateAction.TagAction.Type.TAG)
                    .value("value")
                    .build()
            )

        val roundtrippedAchPaymentUpdateAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(achPaymentUpdateAction),
                jacksonTypeRef<AchPaymentUpdateAction>(),
            )

        assertThat(roundtrippedAchPaymentUpdateAction).isEqualTo(achPaymentUpdateAction)
    }

    @Test
    fun ofCreateCase() {
        val createCase =
            AchPaymentUpdateAction.CreateCaseAction.builder()
                .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scope(AchPaymentUpdateAction.CreateCaseAction.Scope.FINANCIAL_ACCOUNT)
                .type(AchPaymentUpdateAction.CreateCaseAction.Type.CREATE_CASE)
                .build()

        val achPaymentUpdateAction = AchPaymentUpdateAction.ofCreateCase(createCase)

        assertThat(achPaymentUpdateAction.tag()).isEmpty
        assertThat(achPaymentUpdateAction.createCase()).contains(createCase)
    }

    @Test
    fun ofCreateCaseRoundtrip() {
        val jsonMapper = jsonMapper()
        val achPaymentUpdateAction =
            AchPaymentUpdateAction.ofCreateCase(
                AchPaymentUpdateAction.CreateCaseAction.builder()
                    .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scope(AchPaymentUpdateAction.CreateCaseAction.Scope.FINANCIAL_ACCOUNT)
                    .type(AchPaymentUpdateAction.CreateCaseAction.Type.CREATE_CASE)
                    .build()
            )

        val roundtrippedAchPaymentUpdateAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(achPaymentUpdateAction),
                jacksonTypeRef<AchPaymentUpdateAction>(),
            )

        assertThat(roundtrippedAchPaymentUpdateAction).isEqualTo(achPaymentUpdateAction)
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
        val achPaymentUpdateAction =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<AchPaymentUpdateAction>())

        val e = assertThrows<LithicInvalidDataException> { achPaymentUpdateAction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
