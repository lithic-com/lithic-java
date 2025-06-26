// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettlementDetailTest {

    @Test
    fun create() {
        val settlementDetail =
            SettlementDetail.builder()
                .token("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .accountToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .cardProgramToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .cardToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .disputesGrossAmount(0L)
                .addEventToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .institution("00001")
                .interchangeFeeExtendedPrecision(-70000L)
                .interchangeGrossAmount(-7L)
                .network(SettlementDetail.Network.MASTERCARD)
                .otherFeesDetails(SettlementDetail.OtherFeesDetails.builder().isa(0L).build())
                .otherFeesGrossAmount(0L)
                .reportDate("2023-06-01")
                .settlementDate("2023-06-01")
                .transactionToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .transactionsGrossAmount(1900L)
                .type(SettlementDetail.Type.CLEARING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feeDescription("INTERCHANGE COMPLIANCE ADJUSTMENT FOR : 11/12/24")
                .build()

        assertThat(settlementDetail.token()).isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.accountToken())
            .isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.cardProgramToken())
            .isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.cardToken()).isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settlementDetail.currency()).isEqualTo("USD")
        assertThat(settlementDetail.disputesGrossAmount()).isEqualTo(0L)
        assertThat(settlementDetail.eventTokens())
            .containsExactly("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.institution()).isEqualTo("00001")
        assertThat(settlementDetail.interchangeFeeExtendedPrecision()).isEqualTo(-70000L)
        assertThat(settlementDetail.interchangeGrossAmount()).isEqualTo(-7L)
        assertThat(settlementDetail.network()).isEqualTo(SettlementDetail.Network.MASTERCARD)
        assertThat(settlementDetail.otherFeesDetails())
            .isEqualTo(SettlementDetail.OtherFeesDetails.builder().isa(0L).build())
        assertThat(settlementDetail.otherFeesGrossAmount()).isEqualTo(0L)
        assertThat(settlementDetail.reportDate()).isEqualTo("2023-06-01")
        assertThat(settlementDetail.settlementDate()).isEqualTo("2023-06-01")
        assertThat(settlementDetail.transactionToken())
            .isEqualTo("e34a817f-119d-4976-9fb3-8b020b8bbec3")
        assertThat(settlementDetail.transactionsGrossAmount()).isEqualTo(1900L)
        assertThat(settlementDetail.type()).isEqualTo(SettlementDetail.Type.CLEARING)
        assertThat(settlementDetail.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settlementDetail.feeDescription())
            .contains("INTERCHANGE COMPLIANCE ADJUSTMENT FOR : 11/12/24")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settlementDetail =
            SettlementDetail.builder()
                .token("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .accountToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .cardProgramToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .cardToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .disputesGrossAmount(0L)
                .addEventToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .institution("00001")
                .interchangeFeeExtendedPrecision(-70000L)
                .interchangeGrossAmount(-7L)
                .network(SettlementDetail.Network.MASTERCARD)
                .otherFeesDetails(SettlementDetail.OtherFeesDetails.builder().isa(0L).build())
                .otherFeesGrossAmount(0L)
                .reportDate("2023-06-01")
                .settlementDate("2023-06-01")
                .transactionToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                .transactionsGrossAmount(1900L)
                .type(SettlementDetail.Type.CLEARING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feeDescription("INTERCHANGE COMPLIANCE ADJUSTMENT FOR : 11/12/24")
                .build()

        val roundtrippedSettlementDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settlementDetail),
                jacksonTypeRef<SettlementDetail>(),
            )

        assertThat(roundtrippedSettlementDetail).isEqualTo(settlementDetail)
    }
}
