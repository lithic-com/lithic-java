// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardholderAuthenticationTest {

    @Test
    fun create() {
        val cardholderAuthentication =
            CardholderAuthentication.builder()
                .authenticationMethod(CardholderAuthentication.AuthenticationMethod.FRICTIONLESS)
                .authenticationResult(CardholderAuthentication.AuthenticationResult.SUCCESS)
                .decisionMadeBy(CardholderAuthentication.DecisionMadeBy.LITHIC_RULES)
                .liabilityShift(CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED)
                .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                .build()

        assertThat(cardholderAuthentication.authenticationMethod())
            .isEqualTo(CardholderAuthentication.AuthenticationMethod.FRICTIONLESS)
        assertThat(cardholderAuthentication.authenticationResult())
            .isEqualTo(CardholderAuthentication.AuthenticationResult.SUCCESS)
        assertThat(cardholderAuthentication.decisionMadeBy())
            .isEqualTo(CardholderAuthentication.DecisionMadeBy.LITHIC_RULES)
        assertThat(cardholderAuthentication.liabilityShift())
            .isEqualTo(CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED)
        assertThat(cardholderAuthentication.threeDSAuthenticationToken())
            .contains("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardholderAuthentication =
            CardholderAuthentication.builder()
                .authenticationMethod(CardholderAuthentication.AuthenticationMethod.FRICTIONLESS)
                .authenticationResult(CardholderAuthentication.AuthenticationResult.SUCCESS)
                .decisionMadeBy(CardholderAuthentication.DecisionMadeBy.LITHIC_RULES)
                .liabilityShift(CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED)
                .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                .build()

        val roundtrippedCardholderAuthentication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardholderAuthentication),
                jacksonTypeRef<CardholderAuthentication>(),
            )

        assertThat(roundtrippedCardholderAuthentication).isEqualTo(cardholderAuthentication)
    }
}
