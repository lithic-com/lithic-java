package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderCreateParamsTest {

    @Test
    fun createAccountHolderCreateParams() {
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
                            Kyb.Individual.builder()
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
                        Kyb.Individual.builder()
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
                    .natureOfBusiness(
                        "Software company selling solutions to the restaurant industry"
                    )
                    .tosTimestamp("2018-05-29T21:16:05Z")
                    .workflow(Kyb.Workflow.KYB_BASIC)
                    .kybPassedTimestamp("2018-05-29T21:16:05Z")
                    .websiteUrl("www.mybusiness.com")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                                Kyb.Individual.builder()
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
                            Kyb.Individual.builder()
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
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .tosTimestamp("2018-05-29T21:16:05Z")
                        .workflow(Kyb.Workflow.KYB_BASIC)
                        .kybPassedTimestamp("2018-05-29T21:16:05Z")
                        .websiteUrl("www.mybusiness.com")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AccountHolderCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
