// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportSettlementListDetailsPageResponseTest {

    @Test
    fun create() {
        val reportSettlementListDetailsPageResponse =
            ReportSettlementListDetailsPageResponse.builder()
                .addData(
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
                        .otherFeesDetails(
                            SettlementDetail.OtherFeesDetails.builder().isa(0L).build()
                        )
                        .otherFeesGrossAmount(0L)
                        .reportDate("2023-06-01")
                        .settlementDate("2023-06-01")
                        .transactionToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                        .transactionsGrossAmount(1900L)
                        .type(SettlementDetail.Type.CLEARING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feeDescription("INTERCHANGE COMPLIANCE ADJUSTMENT FOR : 11/12/24")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(reportSettlementListDetailsPageResponse.data())
            .containsExactly(
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
            )
        assertThat(reportSettlementListDetailsPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportSettlementListDetailsPageResponse =
            ReportSettlementListDetailsPageResponse.builder()
                .addData(
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
                        .otherFeesDetails(
                            SettlementDetail.OtherFeesDetails.builder().isa(0L).build()
                        )
                        .otherFeesGrossAmount(0L)
                        .reportDate("2023-06-01")
                        .settlementDate("2023-06-01")
                        .transactionToken("e34a817f-119d-4976-9fb3-8b020b8bbec3")
                        .transactionsGrossAmount(1900L)
                        .type(SettlementDetail.Type.CLEARING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feeDescription("INTERCHANGE COMPLIANCE ADJUSTMENT FOR : 11/12/24")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedReportSettlementListDetailsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportSettlementListDetailsPageResponse),
                jacksonTypeRef<ReportSettlementListDetailsPageResponse>(),
            )

        assertThat(roundtrippedReportSettlementListDetailsPageResponse)
            .isEqualTo(reportSettlementListDetailsPageResponse)
    }
}
