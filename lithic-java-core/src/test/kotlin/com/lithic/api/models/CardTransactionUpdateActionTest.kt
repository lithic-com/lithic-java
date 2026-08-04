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

internal class CardTransactionUpdateActionTest {

    @Test
    fun ofTag() {
        val tag =
            CardTransactionUpdateAction.TagAction.builder()
                .key("key")
                .type(CardTransactionUpdateAction.TagAction.Type.TAG)
                .value("value")
                .build()

        val cardTransactionUpdateAction = CardTransactionUpdateAction.ofTag(tag)

        assertThat(cardTransactionUpdateAction.tag()).contains(tag)
        assertThat(cardTransactionUpdateAction.createCase()).isEmpty
    }

    @Test
    fun ofTagRoundtrip() {
        val jsonMapper = jsonMapper()
        val cardTransactionUpdateAction =
            CardTransactionUpdateAction.ofTag(
                CardTransactionUpdateAction.TagAction.builder()
                    .key("key")
                    .type(CardTransactionUpdateAction.TagAction.Type.TAG)
                    .value("value")
                    .build()
            )

        val roundtrippedCardTransactionUpdateAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardTransactionUpdateAction),
                jacksonTypeRef<CardTransactionUpdateAction>(),
            )

        assertThat(roundtrippedCardTransactionUpdateAction).isEqualTo(cardTransactionUpdateAction)
    }

    @Test
    fun ofCreateCase() {
        val createCase =
            CardTransactionUpdateAction.CreateCaseAction.builder()
                .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scope(CardTransactionUpdateAction.CreateCaseAction.Scope.CARD)
                .type(CardTransactionUpdateAction.CreateCaseAction.Type.CREATE_CASE)
                .build()

        val cardTransactionUpdateAction = CardTransactionUpdateAction.ofCreateCase(createCase)

        assertThat(cardTransactionUpdateAction.tag()).isEmpty
        assertThat(cardTransactionUpdateAction.createCase()).contains(createCase)
    }

    @Test
    fun ofCreateCaseRoundtrip() {
        val jsonMapper = jsonMapper()
        val cardTransactionUpdateAction =
            CardTransactionUpdateAction.ofCreateCase(
                CardTransactionUpdateAction.CreateCaseAction.builder()
                    .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scope(CardTransactionUpdateAction.CreateCaseAction.Scope.CARD)
                    .type(CardTransactionUpdateAction.CreateCaseAction.Type.CREATE_CASE)
                    .build()
            )

        val roundtrippedCardTransactionUpdateAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardTransactionUpdateAction),
                jacksonTypeRef<CardTransactionUpdateAction>(),
            )

        assertThat(roundtrippedCardTransactionUpdateAction).isEqualTo(cardTransactionUpdateAction)
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
        val cardTransactionUpdateAction =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CardTransactionUpdateAction>())

        val e = assertThrows<LithicInvalidDataException> { cardTransactionUpdateAction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
