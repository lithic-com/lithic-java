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
                .currency("currency")
                .addEvent(
                    BookTransferResponse.BookTransferEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .detailedResults(
                            BookTransferResponse.BookTransferEvent.BookTransferDetailedResults
                                .APPROVED
                        )
                        .memo("memo")
                        .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                        .subtype("subtype")
                        .type(
                            BookTransferResponse.BookTransferEvent.BookTransferType.ATM_WITHDRAWAL
                        )
                        .build()
                )
                .externalId("external_id")
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .result(BookTransferResponse.TransactionResult.APPROVED)
                .settledAmount(0L)
                .status(BookTransferResponse.Status.DECLINED)
                .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionSeries(
                    BookTransferResponse.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(bookTransferResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.category())
            .isEqualTo(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
        assertThat(bookTransferResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookTransferResponse.currency()).isEqualTo("currency")
        assertThat(bookTransferResponse.events())
            .containsExactly(
                BookTransferResponse.BookTransferEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .detailedResults(
                        BookTransferResponse.BookTransferEvent.BookTransferDetailedResults.APPROVED
                    )
                    .memo("memo")
                    .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                    .subtype("subtype")
                    .type(BookTransferResponse.BookTransferEvent.BookTransferType.ATM_WITHDRAWAL)
                    .build()
            )
        assertThat(bookTransferResponse.externalId()).contains("external_id")
        assertThat(bookTransferResponse.externalResource())
            .contains(
                ExternalResource.builder()
                    .externalResourceToken("external_resource_token")
                    .externalResourceType(ExternalResourceType.STATEMENT)
                    .externalResourceSubToken("external_resource_sub_token")
                    .build()
            )
        assertThat(bookTransferResponse.fromFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.pendingAmount()).isEqualTo(0L)
        assertThat(bookTransferResponse.result())
            .isEqualTo(BookTransferResponse.TransactionResult.APPROVED)
        assertThat(bookTransferResponse.settledAmount()).isEqualTo(0L)
        assertThat(bookTransferResponse.status()).isEqualTo(BookTransferResponse.Status.DECLINED)
        assertThat(bookTransferResponse.toFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.transactionSeries())
            .contains(
                BookTransferResponse.TransactionSeries.builder()
                    .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                    .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                    .type("FEE")
                    .build()
            )
        assertThat(bookTransferResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookTransferResponse =
            BookTransferResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .addEvent(
                    BookTransferResponse.BookTransferEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .detailedResults(
                            BookTransferResponse.BookTransferEvent.BookTransferDetailedResults
                                .APPROVED
                        )
                        .memo("memo")
                        .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                        .subtype("subtype")
                        .type(
                            BookTransferResponse.BookTransferEvent.BookTransferType.ATM_WITHDRAWAL
                        )
                        .build()
                )
                .externalId("external_id")
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .result(BookTransferResponse.TransactionResult.APPROVED)
                .settledAmount(0L)
                .status(BookTransferResponse.Status.DECLINED)
                .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionSeries(
                    BookTransferResponse.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBookTransferResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookTransferResponse),
                jacksonTypeRef<BookTransferResponse>(),
            )

        assertThat(roundtrippedBookTransferResponse).isEqualTo(bookTransferResponse)
    }
}
