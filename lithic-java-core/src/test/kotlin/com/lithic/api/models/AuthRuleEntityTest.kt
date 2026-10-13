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

internal class AuthRuleEntityTest {

    @Test
    fun ofProgram() {
        val program =
            AuthRuleEntity.AuthRuleProgramEntity.builder()
                .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                .build()

        val authRuleEntity = AuthRuleEntity.ofProgram(program)

        assertThat(authRuleEntity.program()).contains(program)
        assertThat(authRuleEntity.card()).isEmpty
        assertThat(authRuleEntity.account()).isEmpty
        assertThat(authRuleEntity.businessAccount()).isEmpty
        assertThat(authRuleEntity.cardTag()).isEmpty
    }

    @Test
    fun ofProgramRoundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleEntity =
            AuthRuleEntity.ofProgram(
                AuthRuleEntity.AuthRuleProgramEntity.builder()
                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                    .build()
            )

        val roundtrippedAuthRuleEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleEntity),
                jacksonTypeRef<AuthRuleEntity>(),
            )

        assertThat(roundtrippedAuthRuleEntity).isEqualTo(authRuleEntity)
    }

    @Test
    fun ofCard() {
        val card =
            AuthRuleEntity.AuthRuleCardEntity.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(AuthRuleEntity.AuthRuleCardEntity.Type.CARD)
                .build()

        val authRuleEntity = AuthRuleEntity.ofCard(card)

        assertThat(authRuleEntity.program()).isEmpty
        assertThat(authRuleEntity.card()).contains(card)
        assertThat(authRuleEntity.account()).isEmpty
        assertThat(authRuleEntity.businessAccount()).isEmpty
        assertThat(authRuleEntity.cardTag()).isEmpty
    }

    @Test
    fun ofCardRoundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleEntity =
            AuthRuleEntity.ofCard(
                AuthRuleEntity.AuthRuleCardEntity.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(AuthRuleEntity.AuthRuleCardEntity.Type.CARD)
                    .build()
            )

        val roundtrippedAuthRuleEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleEntity),
                jacksonTypeRef<AuthRuleEntity>(),
            )

        assertThat(roundtrippedAuthRuleEntity).isEqualTo(authRuleEntity)
    }

    @Test
    fun ofAccount() {
        val account =
            AuthRuleEntity.AuthRuleAccountEntity.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(AuthRuleEntity.AuthRuleAccountEntity.Type.ACCOUNT)
                .build()

        val authRuleEntity = AuthRuleEntity.ofAccount(account)

        assertThat(authRuleEntity.program()).isEmpty
        assertThat(authRuleEntity.card()).isEmpty
        assertThat(authRuleEntity.account()).contains(account)
        assertThat(authRuleEntity.businessAccount()).isEmpty
        assertThat(authRuleEntity.cardTag()).isEmpty
    }

    @Test
    fun ofAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleEntity =
            AuthRuleEntity.ofAccount(
                AuthRuleEntity.AuthRuleAccountEntity.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(AuthRuleEntity.AuthRuleAccountEntity.Type.ACCOUNT)
                    .build()
            )

        val roundtrippedAuthRuleEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleEntity),
                jacksonTypeRef<AuthRuleEntity>(),
            )

        assertThat(roundtrippedAuthRuleEntity).isEqualTo(authRuleEntity)
    }

    @Test
    fun ofBusinessAccount() {
        val businessAccount =
            AuthRuleEntity.AuthRuleBusinessAccountEntity.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(AuthRuleEntity.AuthRuleBusinessAccountEntity.Type.BUSINESS_ACCOUNT)
                .build()

        val authRuleEntity = AuthRuleEntity.ofBusinessAccount(businessAccount)

        assertThat(authRuleEntity.program()).isEmpty
        assertThat(authRuleEntity.card()).isEmpty
        assertThat(authRuleEntity.account()).isEmpty
        assertThat(authRuleEntity.businessAccount()).contains(businessAccount)
        assertThat(authRuleEntity.cardTag()).isEmpty
    }

    @Test
    fun ofBusinessAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleEntity =
            AuthRuleEntity.ofBusinessAccount(
                AuthRuleEntity.AuthRuleBusinessAccountEntity.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(AuthRuleEntity.AuthRuleBusinessAccountEntity.Type.BUSINESS_ACCOUNT)
                    .build()
            )

        val roundtrippedAuthRuleEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleEntity),
                jacksonTypeRef<AuthRuleEntity>(),
            )

        assertThat(roundtrippedAuthRuleEntity).isEqualTo(authRuleEntity)
    }

    @Test
    fun ofCardTag() {
        val cardTag =
            AuthRuleEntity.AuthRuleCardTagEntity.builder()
                .key("x")
                .type(AuthRuleEntity.AuthRuleCardTagEntity.Type.CARD_TAG)
                .value("x")
                .build()

        val authRuleEntity = AuthRuleEntity.ofCardTag(cardTag)

        assertThat(authRuleEntity.program()).isEmpty
        assertThat(authRuleEntity.card()).isEmpty
        assertThat(authRuleEntity.account()).isEmpty
        assertThat(authRuleEntity.businessAccount()).isEmpty
        assertThat(authRuleEntity.cardTag()).contains(cardTag)
    }

    @Test
    fun ofCardTagRoundtrip() {
        val jsonMapper = jsonMapper()
        val authRuleEntity =
            AuthRuleEntity.ofCardTag(
                AuthRuleEntity.AuthRuleCardTagEntity.builder()
                    .key("x")
                    .type(AuthRuleEntity.AuthRuleCardTagEntity.Type.CARD_TAG)
                    .value("x")
                    .build()
            )

        val roundtrippedAuthRuleEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRuleEntity),
                jacksonTypeRef<AuthRuleEntity>(),
            )

        assertThat(roundtrippedAuthRuleEntity).isEqualTo(authRuleEntity)
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
        val authRuleEntity =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<AuthRuleEntity>())

        val e = assertThrows<LithicInvalidDataException> { authRuleEntity.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
