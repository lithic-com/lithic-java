package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenizationSimulateResponseTest {

    @Test
    fun createTokenizationSimulateResponse() {
        val tokenizationSimulateResponse =
            TokenizationSimulateResponse.builder()
                .data(
                    listOf(
                        Tokenization.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(Tokenization.Status.APPROVED)
                            .tokenRequestorName(Tokenization.TokenRequestorName.APPLE_PAY)
                            .tokenUniqueReference("string")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .build()
        assertThat(tokenizationSimulateResponse).isNotNull
        assertThat(tokenizationSimulateResponse.data().get())
            .containsExactly(
                Tokenization.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Tokenization.Status.APPROVED)
                    .tokenRequestorName(Tokenization.TokenRequestorName.APPLE_PAY)
                    .tokenUniqueReference("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}