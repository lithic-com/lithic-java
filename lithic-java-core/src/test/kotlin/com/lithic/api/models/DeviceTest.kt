// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceTest {

    @Test
    fun create() {
        val device =
            Device.builder()
                .imei("123456789012345")
                .ipAddress("1.1.1.1")
                .location("37.3860517/-122.0838511")
                .build()

        assertThat(device.imei()).contains("123456789012345")
        assertThat(device.ipAddress()).contains("1.1.1.1")
        assertThat(device.location()).contains("37.3860517/-122.0838511")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val device =
            Device.builder()
                .imei("123456789012345")
                .ipAddress("1.1.1.1")
                .location("37.3860517/-122.0838511")
                .build()

        val roundtrippedDevice =
            jsonMapper.readValue(jsonMapper.writeValueAsString(device), jacksonTypeRef<Device>())

        assertThat(roundtrippedDevice).isEqualTo(device)
    }
}
