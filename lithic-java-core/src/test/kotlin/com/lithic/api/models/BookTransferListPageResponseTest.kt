// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTransferListPageResponseTest {

    @Test
    fun create() {
        val bookTransferListPageResponse =
            BookTransferListPageResponse.builder()
                .addData(
                    BookTransferResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(BookTransferResponse.Category.ADJUSTMENT)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .addEvent(
                            BookTransferResponse.BookTransferEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addDetailedResult(
                                    BookTransferResponse.BookTransferEvent.DetailedResult.APPROVED
                                )
                                .memo("memo")
                                .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                                .subtype("subtype")
                                .type("type")
                                .build()
                        )
                        .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .result(BookTransferResponse.Result.APPROVED)
                        .settledAmount(0L)
                        .status(BookTransferResponse.Status.DECLINED)
                        .toFinancialAccountToken(JsonValue.from(mapOf<String, Any>()))
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(bookTransferListPageResponse.data())
            .containsExactly(
                BookTransferResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(BookTransferResponse.Category.ADJUSTMENT)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .addEvent(
                        BookTransferResponse.BookTransferEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addDetailedResult(
                                BookTransferResponse.BookTransferEvent.DetailedResult.APPROVED
                            )
                            .memo("memo")
                            .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                            .subtype("subtype")
                            .type("type")
                            .build()
                    )
                    .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .result(BookTransferResponse.Result.APPROVED)
                    .settledAmount(0L)
                    .status(BookTransferResponse.Status.DECLINED)
                    .toFinancialAccountToken(JsonValue.from(mapOf<String, Any>()))
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(bookTransferListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookTransferListPageResponse =
            BookTransferListPageResponse.builder()
                .addData(
                    BookTransferResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(BookTransferResponse.Category.ADJUSTMENT)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .addEvent(
                            BookTransferResponse.BookTransferEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(0L)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addDetailedResult(
                                    BookTransferResponse.BookTransferEvent.DetailedResult.APPROVED
                                )
                                .memo("memo")
                                .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                                .subtype("subtype")
                                .type("type")
                                .build()
                        )
                        .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .result(BookTransferResponse.Result.APPROVED)
                        .settledAmount(0L)
                        .status(BookTransferResponse.Status.DECLINED)
                        .toFinancialAccountToken(JsonValue.from(mapOf<String, Any>()))
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedBookTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookTransferListPageResponse),
                jacksonTypeRef<BookTransferListPageResponse>(),
            )

        assertThat(roundtrippedBookTransferListPageResponse).isEqualTo(bookTransferListPageResponse)
    }
}
