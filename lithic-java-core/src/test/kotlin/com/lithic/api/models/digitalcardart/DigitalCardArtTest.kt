// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.digitalcardart

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalCardArtTest {

    @Test
    fun create() {
        val digitalCardArt =
            DigitalCardArt.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .isEnabled(true)
                .network(DigitalCardArt.Network.MASTERCARD)
                .isCardProgramDefault(true)
                .build()

        assertThat(digitalCardArt.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(digitalCardArt.cardProgramToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(digitalCardArt.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(digitalCardArt.description()).isEqualTo("description")
        assertThat(digitalCardArt.isEnabled()).isEqualTo(true)
        assertThat(digitalCardArt.network()).isEqualTo(DigitalCardArt.Network.MASTERCARD)
        assertThat(digitalCardArt.isCardProgramDefault()).contains(true)
    }
}
