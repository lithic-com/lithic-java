// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirePartyDetailsTest {

    @Test
    fun create() {
        val wirePartyDetails =
            WirePartyDetails.builder()
                .accountNumber("account_number")
                .agentId("agent_id")
                .agentName("agent_name")
                .name("name")
                .build()

        assertThat(wirePartyDetails.accountNumber()).contains("account_number")
        assertThat(wirePartyDetails.agentId()).contains("agent_id")
        assertThat(wirePartyDetails.agentName()).contains("agent_name")
        assertThat(wirePartyDetails.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirePartyDetails =
            WirePartyDetails.builder()
                .accountNumber("account_number")
                .agentId("agent_id")
                .agentName("agent_name")
                .name("name")
                .build()

        val roundtrippedWirePartyDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirePartyDetails),
                jacksonTypeRef<WirePartyDetails>(),
            )

        assertThat(roundtrippedWirePartyDetails).isEqualTo(wirePartyDetails)
    }
}
