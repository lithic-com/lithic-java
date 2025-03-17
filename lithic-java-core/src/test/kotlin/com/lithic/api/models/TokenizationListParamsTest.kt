// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationListParamsTest {

    @Test
    fun create() {
        TokenizationListParams.builder()
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(LocalDate.parse("2019-12-27"))
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .end(LocalDate.parse("2019-12-27"))
            .endingBefore("ending_before")
            .pageSize(1L)
            .startingAfter("starting_after")
            .tokenizationChannel(TokenizationListParams.TokenizationChannel.DIGITAL_WALLET)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TokenizationListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .end(LocalDate.parse("2019-12-27"))
                .endingBefore("ending_before")
                .pageSize(1L)
                .startingAfter("starting_after")
                .tokenizationChannel(TokenizationListParams.TokenizationChannel.DIGITAL_WALLET)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("begin", "2019-12-27")
                    .put("card_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("end", "2019-12-27")
                    .put("ending_before", "ending_before")
                    .put("page_size", "1")
                    .put("starting_after", "starting_after")
                    .put("tokenization_channel", "DIGITAL_WALLET")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TokenizationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
