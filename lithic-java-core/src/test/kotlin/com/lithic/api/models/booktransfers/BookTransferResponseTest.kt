// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.booktransfers

import com.lithic.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTransferResponseTest {

    @Test
    fun create() {
        val bookTransferResponse =
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

        assertThat(bookTransferResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.category())
            .isEqualTo(BookTransferResponse.Category.ADJUSTMENT)
        assertThat(bookTransferResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookTransferResponse.currency()).isEqualTo("currency")
        assertThat(bookTransferResponse.events())
            .containsExactly(
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
        assertThat(bookTransferResponse.fromFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(bookTransferResponse.pendingAmount()).isEqualTo(0L)
        assertThat(bookTransferResponse.result()).isEqualTo(BookTransferResponse.Result.APPROVED)
        assertThat(bookTransferResponse.settledAmount()).isEqualTo(0L)
        assertThat(bookTransferResponse.status()).isEqualTo(BookTransferResponse.Status.DECLINED)
        assertThat(bookTransferResponse._toFinancialAccountToken())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(bookTransferResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
