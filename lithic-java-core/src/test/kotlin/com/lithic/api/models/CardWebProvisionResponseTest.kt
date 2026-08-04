// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CardWebProvisionResponseTest {

    @Test
    fun ofAppleWebPushProvisioning() {
        val appleWebPushProvisioning =
            CardWebProvisionResponse.AppleWebPushProvisioningResponse.builder()
                .jws(
                    CardWebProvisionResponse.AppleWebPushProvisioningResponse
                        .WebPushProvisioningResponseJws
                        .builder()
                        .header(
                            CardWebProvisionResponse.AppleWebPushProvisioningResponse
                                .WebPushProvisioningResponseJws
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

        val cardWebProvisionResponse =
            CardWebProvisionResponse.ofAppleWebPushProvisioning(appleWebPushProvisioning)

        assertThat(cardWebProvisionResponse.appleWebPushProvisioning())
            .contains(appleWebPushProvisioning)
        assertThat(cardWebProvisionResponse.googleWebPushProvisioning()).isEmpty
    }

    @Test
    fun ofAppleWebPushProvisioningRoundtrip() {
        val jsonMapper = jsonMapper()
        val cardWebProvisionResponse =
            CardWebProvisionResponse.ofAppleWebPushProvisioning(
                CardWebProvisionResponse.AppleWebPushProvisioningResponse.builder()
                    .jws(
                        CardWebProvisionResponse.AppleWebPushProvisioningResponse
                            .WebPushProvisioningResponseJws
                            .builder()
                            .header(
                                CardWebProvisionResponse.AppleWebPushProvisioningResponse
                                    .WebPushProvisioningResponseJws
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
            )

        val roundtrippedCardWebProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardWebProvisionResponse),
                jacksonTypeRef<CardWebProvisionResponse>(),
            )

        assertThat(roundtrippedCardWebProvisionResponse).isEqualTo(cardWebProvisionResponse)
    }

    @Test
    fun ofGoogleWebPushProvisioning() {
        val googleWebPushProvisioning =
            CardWebProvisionResponse.GoogleWebPushProvisioningResponse.builder()
                .googleOpc("WW91ciBTdHJpbmcgSGVyZQ==")
                .tspOpc("WW91ciBTdHJpbmcgSGVyZQ==")
                .build()

        val cardWebProvisionResponse =
            CardWebProvisionResponse.ofGoogleWebPushProvisioning(googleWebPushProvisioning)

        assertThat(cardWebProvisionResponse.appleWebPushProvisioning()).isEmpty
        assertThat(cardWebProvisionResponse.googleWebPushProvisioning())
            .contains(googleWebPushProvisioning)
    }

    @Test
    fun ofGoogleWebPushProvisioningRoundtrip() {
        val jsonMapper = jsonMapper()
        val cardWebProvisionResponse =
            CardWebProvisionResponse.ofGoogleWebPushProvisioning(
                CardWebProvisionResponse.GoogleWebPushProvisioningResponse.builder()
                    .googleOpc("WW91ciBTdHJpbmcgSGVyZQ==")
                    .tspOpc("WW91ciBTdHJpbmcgSGVyZQ==")
                    .build()
            )

        val roundtrippedCardWebProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardWebProvisionResponse),
                jacksonTypeRef<CardWebProvisionResponse>(),
            )

        assertThat(roundtrippedCardWebProvisionResponse).isEqualTo(cardWebProvisionResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val cardWebProvisionResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CardWebProvisionResponse>())

        val e = assertThrows<LithicInvalidDataException> { cardWebProvisionResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
