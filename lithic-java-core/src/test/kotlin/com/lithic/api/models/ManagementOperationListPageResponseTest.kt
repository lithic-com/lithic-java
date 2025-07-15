// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagementOperationListPageResponseTest {

    @Test
    fun create() {
        val managementOperationListPageResponse =
            ManagementOperationListPageResponse.builder()
                .addData(
                    ManagementOperationTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            ManagementOperationTransaction.ManagementOperationCategory
                                .MANAGEMENT_FEE
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .direction(
                            ManagementOperationTransaction.ManagementOperationDirection.CREDIT
                        )
                        .addEvent(
                            ManagementOperationTransaction.ManagementOperationEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addDetailedResult(
                                    ManagementOperationTransaction.ManagementOperationEvent
                                        .DetailedResults
                                        .APPROVED
                                )
                                .effectiveDate(LocalDate.parse("2019-12-27"))
                                .memo("memo")
                                .result(
                                    ManagementOperationTransaction.ManagementOperationEvent
                                        .TransactionResult
                                        .APPROVED
                                )
                                .type(
                                    ManagementOperationTransaction.ManagementOperationEvent
                                        .ManagementOperationEventType
                                        .LOSS_WRITE_OFF
                                )
                                .subtype("subtype")
                                .build()
                        )
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .result(ManagementOperationTransaction.TransactionResult.APPROVED)
                        .settledAmount(0L)
                        .status(ManagementOperationTransaction.TransactionStatus.PENDING)
                        .transactionSeries(
                            ManagementOperationTransaction.TransactionSeries.builder()
                                .relatedTransactionEventToken(
                                    "123e4567-e89b-12d3-a456-426614174000"
                                )
                                .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                                .type("FEE")
                                .build()
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalResource(
                            ExternalResource.builder()
                                .externalResourceToken("external_resource_token")
                                .externalResourceType(ExternalResourceType.STATEMENT)
                                .externalResourceSubToken("external_resource_sub_token")
                                .build()
                        )
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(managementOperationListPageResponse.data())
            .containsExactly(
                ManagementOperationTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(
                        ManagementOperationTransaction.ManagementOperationCategory.MANAGEMENT_FEE
                    )
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .direction(ManagementOperationTransaction.ManagementOperationDirection.CREDIT)
                    .addEvent(
                        ManagementOperationTransaction.ManagementOperationEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addDetailedResult(
                                ManagementOperationTransaction.ManagementOperationEvent
                                    .DetailedResults
                                    .APPROVED
                            )
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .memo("memo")
                            .result(
                                ManagementOperationTransaction.ManagementOperationEvent
                                    .TransactionResult
                                    .APPROVED
                            )
                            .type(
                                ManagementOperationTransaction.ManagementOperationEvent
                                    .ManagementOperationEventType
                                    .LOSS_WRITE_OFF
                            )
                            .subtype("subtype")
                            .build()
                    )
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .result(ManagementOperationTransaction.TransactionResult.APPROVED)
                    .settledAmount(0L)
                    .status(ManagementOperationTransaction.TransactionStatus.PENDING)
                    .transactionSeries(
                        ManagementOperationTransaction.TransactionSeries.builder()
                            .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                            .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                            .type("FEE")
                            .build()
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalResource(
                        ExternalResource.builder()
                            .externalResourceToken("external_resource_token")
                            .externalResourceType(ExternalResourceType.STATEMENT)
                            .externalResourceSubToken("external_resource_sub_token")
                            .build()
                    )
                    .userDefinedId("user_defined_id")
                    .build()
            )
        assertThat(managementOperationListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managementOperationListPageResponse =
            ManagementOperationListPageResponse.builder()
                .addData(
                    ManagementOperationTransaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            ManagementOperationTransaction.ManagementOperationCategory
                                .MANAGEMENT_FEE
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .direction(
                            ManagementOperationTransaction.ManagementOperationDirection.CREDIT
                        )
                        .addEvent(
                            ManagementOperationTransaction.ManagementOperationEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addDetailedResult(
                                    ManagementOperationTransaction.ManagementOperationEvent
                                        .DetailedResults
                                        .APPROVED
                                )
                                .effectiveDate(LocalDate.parse("2019-12-27"))
                                .memo("memo")
                                .result(
                                    ManagementOperationTransaction.ManagementOperationEvent
                                        .TransactionResult
                                        .APPROVED
                                )
                                .type(
                                    ManagementOperationTransaction.ManagementOperationEvent
                                        .ManagementOperationEventType
                                        .LOSS_WRITE_OFF
                                )
                                .subtype("subtype")
                                .build()
                        )
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .result(ManagementOperationTransaction.TransactionResult.APPROVED)
                        .settledAmount(0L)
                        .status(ManagementOperationTransaction.TransactionStatus.PENDING)
                        .transactionSeries(
                            ManagementOperationTransaction.TransactionSeries.builder()
                                .relatedTransactionEventToken(
                                    "123e4567-e89b-12d3-a456-426614174000"
                                )
                                .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                                .type("FEE")
                                .build()
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalResource(
                            ExternalResource.builder()
                                .externalResourceToken("external_resource_token")
                                .externalResourceType(ExternalResourceType.STATEMENT)
                                .externalResourceSubToken("external_resource_sub_token")
                                .build()
                        )
                        .userDefinedId("user_defined_id")
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedManagementOperationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managementOperationListPageResponse),
                jacksonTypeRef<ManagementOperationListPageResponse>(),
            )

        assertThat(roundtrippedManagementOperationListPageResponse)
            .isEqualTo(managementOperationListPageResponse)
    }
}
