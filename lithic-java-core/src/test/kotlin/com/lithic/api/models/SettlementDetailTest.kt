// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SettlementDetailTest {

    @Test
    fun createSettlementDetail() {
        val settlementDetail =
            SettlementDetail.builder()
                .token("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .accountToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .cardProgramToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .cardToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .created(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .currency("840")
                .disputesGrossAmount(123L)
                .eventTokens(listOf(JsonValue.from(mapOf<String, Any>())))
                .institution("00001")
                .interchangeGrossAmount(123L)
                .network(SettlementDetail.Network.MASTERCARD)
                .otherFeesDetails(
                    SettlementDetail.OtherFeesDetails.builder()
                        .title(JsonValue.from(mapOf<String, Any>()))
                        .type(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .otherFeesGrossAmount(123L)
                .reportDate("2023-06-01")
                .settlementDate("2023-06-01")
                .transactionToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .transactionsGrossAmount(123L)
                .updated(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                .build()
        assertThat(settlementDetail).isNotNull
        assertThat(settlementDetail.token()).isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.accountToken())
            .isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.cardProgramToken())
            .isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.cardToken()).isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.created())
            .isEqualTo(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
        assertThat(settlementDetail.currency()).isEqualTo("840")
        assertThat(settlementDetail.disputesGrossAmount()).isEqualTo(123L)
        assertThat(settlementDetail.eventTokens())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(settlementDetail.institution()).isEqualTo("00001")
        assertThat(settlementDetail.interchangeGrossAmount()).isEqualTo(123L)
        assertThat(settlementDetail.network()).isEqualTo(SettlementDetail.Network.MASTERCARD)
        assertThat(settlementDetail.otherFeesDetails())
            .isEqualTo(
                SettlementDetail.OtherFeesDetails.builder()
                    .title(JsonValue.from(mapOf<String, Any>()))
                    .type(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(settlementDetail.otherFeesGrossAmount()).isEqualTo(123L)
        assertThat(settlementDetail.reportDate()).isEqualTo("2023-06-01")
        assertThat(settlementDetail.settlementDate()).isEqualTo("2023-06-01")
        assertThat(settlementDetail.transactionToken())
            .isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.transactionsGrossAmount()).isEqualTo(123L)
        assertThat(settlementDetail.updated())
            .isEqualTo(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
    }
}
