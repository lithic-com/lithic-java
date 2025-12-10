// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTransferTransactionCreatedWebhookEventTest {

    @Test
    fun create() {
        val bookTransferTransactionCreatedWebhookEvent =
            BookTransferTransactionCreatedWebhookEvent.builder()
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
                .eventType(
                    BookTransferTransactionCreatedWebhookEvent.EventType
                        .BOOK_TRANSFER_TRANSACTION_CREATED
                )
                .build()

        assertThat(bookTransferTransactionCreatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferTransactionCreatedWebhookEvent.category())
            .isEqualTo(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
        assertThat(bookTransferTransactionCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookTransferTransactionCreatedWebhookEvent.currency()).isEqualTo("USD")
        assertThat(bookTransferTransactionCreatedWebhookEvent.events())
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
        assertThat(bookTransferTransactionCreatedWebhookEvent.family())
            .isEqualTo(BookTransferResponse.Family.TRANSFER)
        assertThat(bookTransferTransactionCreatedWebhookEvent.fromFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferTransactionCreatedWebhookEvent.pendingAmount()).isEqualTo(1000L)
        assertThat(bookTransferTransactionCreatedWebhookEvent.result())
            .isEqualTo(BookTransferResponse.TransactionResult.APPROVED)
        assertThat(bookTransferTransactionCreatedWebhookEvent.settledAmount()).isEqualTo(500L)
        assertThat(bookTransferTransactionCreatedWebhookEvent.status())
            .isEqualTo(BookTransferResponse.TransactionStatus.PENDING)
        assertThat(bookTransferTransactionCreatedWebhookEvent.toFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferTransactionCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookTransferTransactionCreatedWebhookEvent.externalId()).contains("external_id")
        assertThat(bookTransferTransactionCreatedWebhookEvent.externalResource())
            .contains(
                ExternalResource.builder()
                    .externalResourceToken("external_resource_token")
                    .externalResourceType(ExternalResourceType.STATEMENT)
                    .externalResourceSubToken("external_resource_sub_token")
                    .build()
            )
        assertThat(bookTransferTransactionCreatedWebhookEvent.transactionSeries())
            .contains(
                BookTransferResponse.TransactionSeries.builder()
                    .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                    .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                    .type("FEE")
                    .build()
            )
        assertThat(bookTransferTransactionCreatedWebhookEvent.eventType())
            .isEqualTo(
                BookTransferTransactionCreatedWebhookEvent.EventType
                    .BOOK_TRANSFER_TRANSACTION_CREATED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookTransferTransactionCreatedWebhookEvent =
            BookTransferTransactionCreatedWebhookEvent.builder()
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
                .eventType(
                    BookTransferTransactionCreatedWebhookEvent.EventType
                        .BOOK_TRANSFER_TRANSACTION_CREATED
                )
                .build()

        val roundtrippedBookTransferTransactionCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookTransferTransactionCreatedWebhookEvent),
                jacksonTypeRef<BookTransferTransactionCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedBookTransferTransactionCreatedWebhookEvent)
            .isEqualTo(bookTransferTransactionCreatedWebhookEvent)
    }
}
