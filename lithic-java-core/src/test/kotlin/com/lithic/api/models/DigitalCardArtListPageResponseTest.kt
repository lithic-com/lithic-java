// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalCardArtListPageResponseTest {

    @Test
    fun create() {
        val digitalCardArtListPageResponse =
            DigitalCardArtListPageResponse.builder()
                .addData(
                    DigitalCardArt.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .isEnabled(true)
                        .network(DigitalCardArt.Network.MASTERCARD)
                        .isCardProgramDefault(true)
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(digitalCardArtListPageResponse.data())
            .containsExactly(
                DigitalCardArt.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .isEnabled(true)
                    .network(DigitalCardArt.Network.MASTERCARD)
                    .isCardProgramDefault(true)
                    .build()
            )
        assertThat(digitalCardArtListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalCardArtListPageResponse =
            DigitalCardArtListPageResponse.builder()
                .addData(
                    DigitalCardArt.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .isEnabled(true)
                        .network(DigitalCardArt.Network.MASTERCARD)
                        .isCardProgramDefault(true)
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedDigitalCardArtListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalCardArtListPageResponse),
                jacksonTypeRef<DigitalCardArtListPageResponse>(),
            )

        assertThat(roundtrippedDigitalCardArtListPageResponse)
            .isEqualTo(digitalCardArtListPageResponse)
    }
}
