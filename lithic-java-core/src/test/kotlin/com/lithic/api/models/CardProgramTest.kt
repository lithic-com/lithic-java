// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardProgramTest {

    @Test
    fun create() {
        val cardProgram =
            CardProgram.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("My Prepaid Program")
                .panRangeEnd("52304803")
                .panRangeStart("52304803")
                .accountLevelManagementEnabled(true)
                .cardholderCurrency("USD")
                .addSettlementCurrency("USD")
                .addSettlementCurrency("CAD")
                .build()

        assertThat(cardProgram.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(cardProgram.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cardProgram.name()).isEqualTo("My Prepaid Program")
        assertThat(cardProgram.panRangeEnd()).isEqualTo("52304803")
        assertThat(cardProgram.panRangeStart()).isEqualTo("52304803")
        assertThat(cardProgram.accountLevelManagementEnabled()).contains(true)
        assertThat(cardProgram.cardholderCurrency()).contains("USD")
        assertThat(cardProgram.settlementCurrencies().getOrNull()).containsExactly("USD", "CAD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardProgram =
            CardProgram.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("My Prepaid Program")
                .panRangeEnd("52304803")
                .panRangeStart("52304803")
                .accountLevelManagementEnabled(true)
                .cardholderCurrency("USD")
                .addSettlementCurrency("USD")
                .addSettlementCurrency("CAD")
                .build()

        val roundtrippedCardProgram =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardProgram),
                jacksonTypeRef<CardProgram>(),
            )

        assertThat(roundtrippedCardProgram).isEqualTo(cardProgram)
    }
}
