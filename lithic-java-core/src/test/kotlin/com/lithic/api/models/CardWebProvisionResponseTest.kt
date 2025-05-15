// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardWebProvisionResponseTest {

    @Test
    fun create() {
        val cardWebProvisionResponse =
            CardWebProvisionResponse.builder()
                .jws(
                    CardWebProvisionResponse.WebPushProvisioningResponseJws.builder()
                        .header(
                            CardWebProvisionResponse.WebPushProvisioningResponseJws
                                .WebPushProvisioningResponseHeader
                                .builder()
                                .kid("8dc7aed4-29e3-41e4-9cdb-673a05e6615c")
                                .build()
                        )
                        .payload("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                        .protected_("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                        .signature("SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
                        .build()
                )
                .state("3cc4c292-727b-4ca8-b9a8-f96c15485f4e")
                .build()

        assertThat(cardWebProvisionResponse.jws())
            .contains(
                CardWebProvisionResponse.WebPushProvisioningResponseJws.builder()
                    .header(
                        CardWebProvisionResponse.WebPushProvisioningResponseJws
                            .WebPushProvisioningResponseHeader
                            .builder()
                            .kid("8dc7aed4-29e3-41e4-9cdb-673a05e6615c")
                            .build()
                    )
                    .payload("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                    .protected_("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                    .signature("SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
                    .build()
            )
        assertThat(cardWebProvisionResponse.state())
            .contains("3cc4c292-727b-4ca8-b9a8-f96c15485f4e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardWebProvisionResponse =
            CardWebProvisionResponse.builder()
                .jws(
                    CardWebProvisionResponse.WebPushProvisioningResponseJws.builder()
                        .header(
                            CardWebProvisionResponse.WebPushProvisioningResponseJws
                                .WebPushProvisioningResponseHeader
                                .builder()
                                .kid("8dc7aed4-29e3-41e4-9cdb-673a05e6615c")
                                .build()
                        )
                        .payload("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                        .protected_("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                        .signature("SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
                        .build()
                )
                .state("3cc4c292-727b-4ca8-b9a8-f96c15485f4e")
                .build()

        val roundtrippedCardWebProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardWebProvisionResponse),
                jacksonTypeRef<CardWebProvisionResponse>(),
            )

        assertThat(roundtrippedCardWebProvisionResponse).isEqualTo(cardWebProvisionResponse)
    }
}
