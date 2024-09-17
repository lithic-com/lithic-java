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
                                .country("CAN")
                                .postalCode("M5V 1S8")
                                .state("ON")
                                .address2("address2")
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
                .tosTimestamp("tos_timestamp")
                .workflow(Kyc.Workflow.KYC_ADVANCED)
                .externalId("external_id")
                .kycPassedTimestamp("kyc_passed_timestamp")
                .build()
        assertThat(kyc).isNotNull
        assertThat(kyc.individual())
            .isEqualTo(
                Kyc.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("CAN")
                            .postalCode("M5V 1S8")
                            .state("ON")
                            .address2("address2")
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
        assertThat(kyc.tosTimestamp()).isEqualTo("tos_timestamp")
        assertThat(kyc.workflow()).isEqualTo(Kyc.Workflow.KYC_ADVANCED)
        assertThat(kyc.externalId()).contains("external_id")
        assertThat(kyc.kycPassedTimestamp()).contains("kyc_passed_timestamp")
    }
}
