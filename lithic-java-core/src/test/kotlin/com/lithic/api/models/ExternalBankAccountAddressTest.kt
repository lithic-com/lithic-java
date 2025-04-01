// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountAddressTest {

    @Test
    fun create() {
        val externalBankAccountAddress =
            ExternalBankAccountAddress.builder()
                .address1("x")
                .city("x")
                .country("USD")
                .postalCode("11201")
                .state("xx")
                .address2("x")
                .build()

        assertThat(externalBankAccountAddress.address1()).isEqualTo("x")
        assertThat(externalBankAccountAddress.city()).isEqualTo("x")
        assertThat(externalBankAccountAddress.country()).isEqualTo("USD")
        assertThat(externalBankAccountAddress.postalCode()).isEqualTo("11201")
        assertThat(externalBankAccountAddress.state()).isEqualTo("xx")
        assertThat(externalBankAccountAddress.address2()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountAddress =
            ExternalBankAccountAddress.builder()
                .address1("x")
                .city("x")
                .country("USD")
                .postalCode("11201")
                .state("xx")
                .address2("x")
                .build()

        val roundtrippedExternalBankAccountAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountAddress),
                jacksonTypeRef<ExternalBankAccountAddress>(),
            )

        assertThat(roundtrippedExternalBankAccountAddress).isEqualTo(externalBankAccountAddress)
    }
}
