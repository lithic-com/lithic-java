// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkProgramListPageResponseTest {

    @Test
    fun create() {
        val networkProgramListPageResponse =
            NetworkProgramListPageResponse.builder()
                .addData(
                    NetworkProgram.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .defaultProductCode("default_product_code")
                        .name("name")
                        .registeredProgramIdentificationNumber(
                            "registered_program_identification_number"
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(networkProgramListPageResponse.data())
            .containsExactly(
                NetworkProgram.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .defaultProductCode("default_product_code")
                    .name("name")
                    .registeredProgramIdentificationNumber(
                        "registered_program_identification_number"
                    )
                    .build()
            )
        assertThat(networkProgramListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkProgramListPageResponse =
            NetworkProgramListPageResponse.builder()
                .addData(
                    NetworkProgram.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .defaultProductCode("default_product_code")
                        .name("name")
                        .registeredProgramIdentificationNumber(
                            "registered_program_identification_number"
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedNetworkProgramListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkProgramListPageResponse),
                jacksonTypeRef<NetworkProgramListPageResponse>(),
            )

        assertThat(roundtrippedNetworkProgramListPageResponse)
            .isEqualTo(networkProgramListPageResponse)
    }
}
