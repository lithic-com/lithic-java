// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.junit.jupiter.api.Test

class AccountHolderCreateParamsTest {

    @Test
    fun create() {
        AccountHolderCreateParams.builder()
            .forKyb(
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
                                        .address2("address2")
                                        .build()
                                )
                                .governmentId("114-123-1513")
                                .legalBusinessName("Acme, Inc.")
                                .addPhoneNumber("+15555555555")
                                .dbaBusinessName("dba_business_name")
                                .parentCompany("parent_company")
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
                                    .address2("address2")
                                    .build()
                            )
                            .governmentId("114-123-1513")
                            .legalBusinessName("Acme, Inc.")
                            .addPhoneNumber("+15555555555")
                            .dbaBusinessName("dba_business_name")
                            .parentCompany("parent_company")
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
                    .natureOfBusiness(
                        "Software company selling solutions to the restaurant industry"
                    )
                    .tosTimestamp("2018-05-29T21:16:05Z")
                    .workflow(Kyb.Workflow.KYB_BASIC)
                    .externalId("external_id")
                    .kybPassedTimestamp("2018-05-29T21:16:05Z")
                    .websiteUrl("www.mybusiness.com")
                    .build()
            )
            .build()
    }
}
