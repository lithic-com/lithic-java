// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationTest {

    @Test
    fun create() {
        val tokenization =
            Tokenization.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deviceId("device_id")
                .dpan("dpan")
                .status(Tokenization.Status.ACTIVE)
                .tokenRequestorName(Tokenization.TokenRequestorName.AMAZON_ONE)
                .tokenUniqueReference("token_unique_reference")
                .tokenizationChannel(Tokenization.TokenizationChannel.DIGITAL_WALLET)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(
                    Tokenization.TokenizationEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Tokenization.TokenizationEvent.Result.APPROVED)
                        .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                        .build()
                )
                .paymentAccountReferenceId("payment_account_reference_id")
                .build()

        assertThat(tokenization.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenization.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenization.cardToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenization.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenization.deviceId()).contains("device_id")
        assertThat(tokenization.dpan()).contains("dpan")
        assertThat(tokenization.status()).isEqualTo(Tokenization.Status.ACTIVE)
        assertThat(tokenization.tokenRequestorName())
            .isEqualTo(Tokenization.TokenRequestorName.AMAZON_ONE)
        assertThat(tokenization.tokenUniqueReference()).isEqualTo("token_unique_reference")
        assertThat(tokenization.tokenizationChannel())
            .isEqualTo(Tokenization.TokenizationChannel.DIGITAL_WALLET)
        assertThat(tokenization.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenization.digitalCardArtToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenization.events().getOrNull())
            .containsExactly(
                Tokenization.TokenizationEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(Tokenization.TokenizationEvent.Result.APPROVED)
                    .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                    .build()
            )
        assertThat(tokenization.paymentAccountReferenceId())
            .contains("payment_account_reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenization =
            Tokenization.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deviceId("device_id")
                .dpan("dpan")
                .status(Tokenization.Status.ACTIVE)
                .tokenRequestorName(Tokenization.TokenRequestorName.AMAZON_ONE)
                .tokenUniqueReference("token_unique_reference")
                .tokenizationChannel(Tokenization.TokenizationChannel.DIGITAL_WALLET)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(
                    Tokenization.TokenizationEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Tokenization.TokenizationEvent.Result.APPROVED)
                        .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                        .build()
                )
                .paymentAccountReferenceId("payment_account_reference_id")
                .build()

        val roundtrippedTokenization =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenization),
                jacksonTypeRef<Tokenization>(),
            )

        assertThat(roundtrippedTokenization).isEqualTo(tokenization)
    }
}
