// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProgramTest {

    @Test
    fun createCardProgram() {
        val cardProgram =
            CardProgram.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("My Prepaid Program")
                .panRangeEnd("52304803")
                .panRangeStart("52304803")
                .cardholderCurrency("USD")
                .settlementCurrencies(listOf("string"))
                .build()
        assertThat(cardProgram).isNotNull
        assertThat(cardProgram.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(cardProgram.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cardProgram.name()).isEqualTo("My Prepaid Program")
        assertThat(cardProgram.panRangeEnd()).isEqualTo("52304803")
        assertThat(cardProgram.panRangeStart()).isEqualTo("52304803")
        assertThat(cardProgram.cardholderCurrency()).contains("USD")
        assertThat(cardProgram.settlementCurrencies().get()).containsExactly("string")
    }
}
