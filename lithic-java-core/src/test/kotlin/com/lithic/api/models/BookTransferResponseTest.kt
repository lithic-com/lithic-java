// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTransferResponseTest {

    @Test
    fun create() {
        val bookTransferResponse =
            BookTransferResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .addEvent(
                    BookTransferResponse.BookTransferEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDetailedResult(
                            BookTransferResponse.BookTransferEvent.BookTransferDetailedResults
                                .APPROVED
                        )
                        .memo("memo")
                        .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                        .subtype("subtype")
                        .type(
                            BookTransferResponse.BookTransferEvent.BookTransferType
                                .ATM_BALANCE_INQUIRY
                        )
                        .build()
                )
                .family(BookTransferResponse.Family.TRANSFER)
                .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(1000L)
                .result(BookTransferResponse.TransactionResult.APPROVED)
                .settledAmount(500L)
                .status(BookTransferResponse.TransactionStatus.PENDING)
                .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .transactionSeries(
                    BookTransferResponse.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .build()

        assertThat(bookTransferResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.category())
            .isEqualTo(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
        assertThat(bookTransferResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookTransferResponse.currency()).isEqualTo("USD")
        assertThat(bookTransferResponse.events())
            .containsExactly(
                BookTransferResponse.BookTransferEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addDetailedResult(
                        BookTransferResponse.BookTransferEvent.BookTransferDetailedResults.APPROVED
                    )
                    .memo("memo")
                    .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                    .subtype("subtype")
                    .type(
                        BookTransferResponse.BookTransferEvent.BookTransferType.ATM_BALANCE_INQUIRY
                    )
                    .build()
            )
        assertThat(bookTransferResponse.family()).isEqualTo(BookTransferResponse.Family.TRANSFER)
        assertThat(bookTransferResponse.fromFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.pendingAmount()).isEqualTo(1000L)
        assertThat(bookTransferResponse.result())
            .isEqualTo(BookTransferResponse.TransactionResult.APPROVED)
        assertThat(bookTransferResponse.settledAmount()).isEqualTo(500L)
        assertThat(bookTransferResponse.status())
            .isEqualTo(BookTransferResponse.TransactionStatus.PENDING)
        assertThat(bookTransferResponse.toFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookTransferResponse.externalId()).contains("external_id")
        assertThat(bookTransferResponse.externalResource())
            .contains(
                ExternalResource.builder()
                    .externalResourceToken("external_resource_token")
                    .externalResourceType(ExternalResourceType.STATEMENT)
                    .externalResourceSubToken("external_resource_sub_token")
                    .build()
            )
        assertThat(bookTransferResponse.transactionSeries())
            .contains(
                BookTransferResponse.TransactionSeries.builder()
                    .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                    .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                    .type("FEE")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookTransferResponse =
            BookTransferResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .addEvent(
                    BookTransferResponse.BookTransferEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDetailedResult(
                            BookTransferResponse.BookTransferEvent.BookTransferDetailedResults
                                .APPROVED
                        )
                        .memo("memo")
                        .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                        .subtype("subtype")
                        .type(
                            BookTransferResponse.BookTransferEvent.BookTransferType
                                .ATM_BALANCE_INQUIRY
                        )
                        .build()
                )
                .family(BookTransferResponse.Family.TRANSFER)
                .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(1000L)
                .result(BookTransferResponse.TransactionResult.APPROVED)
                .settledAmount(500L)
                .status(BookTransferResponse.TransactionStatus.PENDING)
                .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .transactionSeries(
                    BookTransferResponse.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .build()

        val roundtrippedBookTransferResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookTransferResponse),
                jacksonTypeRef<BookTransferResponse>(),
            )

        assertThat(roundtrippedBookTransferResponse).isEqualTo(bookTransferResponse)
    }
}
