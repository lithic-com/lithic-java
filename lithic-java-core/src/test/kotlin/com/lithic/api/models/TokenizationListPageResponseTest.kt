// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationListPageResponseTest {

    @Test
    fun create() {
        val tokenizationListPageResponse =
            TokenizationListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        assertThat(tokenizationListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(tokenizationListPageResponse.hasMore()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenizationListPageResponse =
            TokenizationListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .build()

        val roundtrippedTokenizationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenizationListPageResponse),
                jacksonTypeRef<TokenizationListPageResponse>(),
            )

        assertThat(roundtrippedTokenizationListPageResponse).isEqualTo(tokenizationListPageResponse)
    }
}
