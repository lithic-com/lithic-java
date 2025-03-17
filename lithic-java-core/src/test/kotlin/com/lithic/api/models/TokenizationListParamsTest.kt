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
        val expected = QueryParams.builder()
        expected.put("account_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("begin", "2019-12-27")
        expected.put("card_token", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("end", "2019-12-27")
        expected.put("ending_before", "ending_before")
        expected.put("page_size", "1")
        expected.put("starting_after", "starting_after")
        expected.put(
            "tokenization_channel",
            TokenizationListParams.TokenizationChannel.DIGITAL_WALLET.toString(),
        )
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TokenizationListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
