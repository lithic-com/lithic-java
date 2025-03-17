// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalPaymentListParamsTest {

    @Test
    fun create() {
        ExternalPaymentListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .category(ExternalPaymentListParams.ExternalPaymentCategory.EXTERNAL_WIRE)
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .result(ExternalPaymentListParams.TransactionResult.APPROVED)
            .startingAfter("starting_after")
            .status(ExternalPaymentListParams.TransactionStatus.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalPaymentListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ExternalPaymentListParams.ExternalPaymentCategory.EXTERNAL_WIRE)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .result(ExternalPaymentListParams.TransactionResult.APPROVED)
                .startingAfter("starting_after")
                .status(ExternalPaymentListParams.TransactionStatus.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("begin", "2019-12-27T18:11:19.117Z")
                    .put("business_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("category", "EXTERNAL_WIRE")
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("ending_before", "ending_before")
                    .put("financial_account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "1")
                    .put("result", "APPROVED")
                    .put("starting_after", "starting_after")
                    .put("status", "PENDING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalPaymentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
