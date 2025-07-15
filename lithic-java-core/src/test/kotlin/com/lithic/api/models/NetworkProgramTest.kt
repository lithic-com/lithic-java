// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkProgramTest {

    @Test
    fun create() {
        val networkProgram =
            NetworkProgram.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultProductCode("default_product_code")
                .name("name")
                .registeredProgramIdentificationNumber("registered_program_identification_number")
                .build()

        assertThat(networkProgram.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(networkProgram.defaultProductCode()).isEqualTo("default_product_code")
        assertThat(networkProgram.name()).isEqualTo("name")
        assertThat(networkProgram.registeredProgramIdentificationNumber())
            .isEqualTo("registered_program_identification_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkProgram =
            NetworkProgram.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultProductCode("default_product_code")
                .name("name")
                .registeredProgramIdentificationNumber("registered_program_identification_number")
                .build()

        val roundtrippedNetworkProgram =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkProgram),
                jacksonTypeRef<NetworkProgram>(),
            )

        assertThat(roundtrippedNetworkProgram).isEqualTo(networkProgram)
    }
}
