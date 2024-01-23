// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KybTest {

    @Test
    fun createKyb() {
        val kyb =
            Kyb.builder()
                .beneficialOwnerEntities(
                    listOf(
                        Kyb.BusinessEntity.builder()
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
                            .governmentId("114-123-1513")
                            .legalBusinessName("Acme, Inc.")
                            .phoneNumbers(listOf("+12124007676"))
                            .dbaBusinessName("string")
                            .parentCompany("string")
                            .build()
                    )
                )
                .beneficialOwnerIndividuals(
                    listOf(
                        Kyb.KybIndividual.builder()
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
                )
                .businessEntity(
                    Kyb.BusinessEntity.builder()
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
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .phoneNumbers(listOf("+12124007676"))
                        .dbaBusinessName("string")
                        .parentCompany("string")
                        .build()
                )
                .controlPerson(
                    Kyb.KybIndividual.builder()
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
                .natureOfBusiness("Software company selling solutions to the restaurant industry")
                .tosTimestamp("2018-05-29T21:16:05Z")
                .workflow(Kyb.Workflow.KYB_BASIC)
                .externalId("string")
                .kybPassedTimestamp("2018-05-29T21:16:05Z")
                .websiteUrl("www.mybusiness.com")
                .build()
        assertThat(kyb).isNotNull
        assertThat(kyb.beneficialOwnerEntities())
            .containsExactly(
                Kyb.BusinessEntity.builder()
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
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("string")
                    .parentCompany("string")
                    .build()
            )
        assertThat(kyb.beneficialOwnerIndividuals())
            .containsExactly(
                Kyb.KybIndividual.builder()
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
        assertThat(kyb.businessEntity())
            .isEqualTo(
                Kyb.BusinessEntity.builder()
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
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("string")
                    .parentCompany("string")
                    .build()
            )
        assertThat(kyb.controlPerson())
            .isEqualTo(
                Kyb.KybIndividual.builder()
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
        assertThat(kyb.natureOfBusiness())
            .isEqualTo("Software company selling solutions to the restaurant industry")
        assertThat(kyb.tosTimestamp()).isEqualTo("2018-05-29T21:16:05Z")
        assertThat(kyb.workflow()).isEqualTo(Kyb.Workflow.KYB_BASIC)
        assertThat(kyb.externalId()).contains("string")
        assertThat(kyb.kybPassedTimestamp()).contains("2018-05-29T21:16:05Z")
        assertThat(kyb.websiteUrl()).contains("www.mybusiness.com")
    }
}
