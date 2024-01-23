// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KycTest {

    @Test
    fun createKyc() {
        val kyc =
            Kyc.builder()
                .individual(
                    Kyc.Individual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("string")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .tosTimestamp("string")
                .workflow(Kyc.Workflow.KYC_ADVANCED)
                .externalId("string")
                .kycPassedTimestamp("string")
                .build()
        assertThat(kyc).isNotNull
        assertThat(kyc.individual())
            .isEqualTo(
                Kyc.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("string")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(kyc.tosTimestamp()).isEqualTo("string")
        assertThat(kyc.workflow()).isEqualTo(Kyc.Workflow.KYC_ADVANCED)
        assertThat(kyc.externalId()).contains("string")
        assertThat(kyc.kycPassedTimestamp()).contains("string")
    }
}
