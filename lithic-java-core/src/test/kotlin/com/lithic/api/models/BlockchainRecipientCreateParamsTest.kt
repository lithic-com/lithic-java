// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockchainRecipientCreateParamsTest {

    @Test
    fun create() {
        BlockchainRecipientCreateParams.builder()
            .accountToken("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
            .address("0x45bfcf1a6289a0b77b4d3f7d12005a05949fd8c3")
            .chain("ETHEREUM")
            .owner("John Doe")
            .ownerType(OwnerType.INDIVIDUAL)
            .addressTag("address_tag")
            .name("Cold wallet")
            .build()
    }

    @Test
    fun body() {
        val params =
            BlockchainRecipientCreateParams.builder()
                .accountToken("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
                .address("0x45bfcf1a6289a0b77b4d3f7d12005a05949fd8c3")
                .chain("ETHEREUM")
                .owner("John Doe")
                .ownerType(OwnerType.INDIVIDUAL)
                .addressTag("address_tag")
                .name("Cold wallet")
                .build()

        val body = params._body()

        assertThat(body.accountToken()).isEqualTo("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
        assertThat(body.address()).isEqualTo("0x45bfcf1a6289a0b77b4d3f7d12005a05949fd8c3")
        assertThat(body.chain()).isEqualTo("ETHEREUM")
        assertThat(body.owner()).isEqualTo("John Doe")
        assertThat(body.ownerType()).isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(body.addressTag()).contains("address_tag")
        assertThat(body.name()).contains("Cold wallet")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BlockchainRecipientCreateParams.builder()
                .accountToken("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
                .address("0x45bfcf1a6289a0b77b4d3f7d12005a05949fd8c3")
                .chain("ETHEREUM")
                .owner("John Doe")
                .ownerType(OwnerType.INDIVIDUAL)
                .build()

        val body = params._body()

        assertThat(body.accountToken()).isEqualTo("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
        assertThat(body.address()).isEqualTo("0x45bfcf1a6289a0b77b4d3f7d12005a05949fd8c3")
        assertThat(body.chain()).isEqualTo("ETHEREUM")
        assertThat(body.owner()).isEqualTo("John Doe")
        assertThat(body.ownerType()).isEqualTo(OwnerType.INDIVIDUAL)
    }
}
