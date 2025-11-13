// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementTotalsTest {

    @Test
    fun create() {
        val statementTotals =
            StatementTotals.builder()
                .balanceTransfers(0L)
                .cashAdvances(0L)
                .credits(0L)
                .debits(0L)
                .fees(0L)
                .interest(0L)
                .payments(0L)
                .purchases(0L)
                .creditDetails(JsonValue.from(mapOf<String, Any>()))
                .debitDetails(JsonValue.from(mapOf<String, Any>()))
                .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(statementTotals.balanceTransfers()).isEqualTo(0L)
        assertThat(statementTotals.cashAdvances()).isEqualTo(0L)
        assertThat(statementTotals.credits()).isEqualTo(0L)
        assertThat(statementTotals.debits()).isEqualTo(0L)
        assertThat(statementTotals.fees()).isEqualTo(0L)
        assertThat(statementTotals.interest()).isEqualTo(0L)
        assertThat(statementTotals.payments()).isEqualTo(0L)
        assertThat(statementTotals.purchases()).isEqualTo(0L)
        assertThat(statementTotals._creditDetails()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(statementTotals._debitDetails()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(statementTotals._paymentDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementTotals =
            StatementTotals.builder()
                .balanceTransfers(0L)
                .cashAdvances(0L)
                .credits(0L)
                .debits(0L)
                .fees(0L)
                .interest(0L)
                .payments(0L)
                .purchases(0L)
                .creditDetails(JsonValue.from(mapOf<String, Any>()))
                .debitDetails(JsonValue.from(mapOf<String, Any>()))
                .paymentDetails(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedStatementTotals =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementTotals),
                jacksonTypeRef<StatementTotals>(),
            )

        assertThat(roundtrippedStatementTotals).isEqualTo(statementTotals)
    }
}
