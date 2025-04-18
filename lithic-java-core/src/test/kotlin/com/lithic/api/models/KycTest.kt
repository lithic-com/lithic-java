// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KycTest {

    @Test
    fun create() {
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
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .tosTimestamp("tos_timestamp")
                .workflow(Kyc.Workflow.KYC_BASIC)
                .externalId("external_id")
                .kycPassedTimestamp("kyc_passed_timestamp")
                .build()

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
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(kyc.tosTimestamp()).isEqualTo("tos_timestamp")
        assertThat(kyc.workflow()).isEqualTo(Kyc.Workflow.KYC_BASIC)
        assertThat(kyc.externalId()).contains("external_id")
        assertThat(kyc.kycPassedTimestamp()).contains("kyc_passed_timestamp")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .tosTimestamp("tos_timestamp")
                .workflow(Kyc.Workflow.KYC_BASIC)
                .externalId("external_id")
                .kycPassedTimestamp("kyc_passed_timestamp")
                .build()

        val roundtrippedKyc =
            jsonMapper.readValue(jsonMapper.writeValueAsString(kyc), jacksonTypeRef<Kyc>())

        assertThat(roundtrippedKyc).isEqualTo(kyc)
    }
}
