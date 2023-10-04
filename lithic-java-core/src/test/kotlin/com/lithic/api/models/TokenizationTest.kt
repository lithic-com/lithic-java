// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenizationTest {

    @Test
    fun createTokenization() {
        val tokenization =
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
        assertThat(tokenization).isNotNull
        assertThat(tokenization.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenization.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenization.cardToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenization.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenization.status()).isEqualTo(Tokenization.Status.APPROVED)
        assertThat(tokenization.tokenRequestorName())
            .isEqualTo(Tokenization.TokenRequestorName.APPLE_PAY)
        assertThat(tokenization.tokenUniqueReference()).isEqualTo("string")
        assertThat(tokenization.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
