package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountAddressTest {

    @Test
    fun createExternalBankAccountAddress() {
        val externalBankAccountAddress =
            ExternalBankAccountAddress.builder()
                .address1("x")
                .city("x")
                .country("US")
                .postalCode("11201")
                .state("xx")
                .address2("x")
                .build()
        assertThat(externalBankAccountAddress).isNotNull
        assertThat(externalBankAccountAddress.address1()).isEqualTo("x")
        assertThat(externalBankAccountAddress.city()).isEqualTo("x")
        assertThat(externalBankAccountAddress.country()).isEqualTo("US")
        assertThat(externalBankAccountAddress.postalCode()).isEqualTo("11201")
        assertThat(externalBankAccountAddress.state()).isEqualTo("xx")
        assertThat(externalBankAccountAddress.address2()).contains("x")
    }
}
