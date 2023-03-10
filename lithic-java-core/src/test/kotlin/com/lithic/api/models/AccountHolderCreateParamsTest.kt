package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderCreateParamsTest {

    @Test
    fun createAccountHolderCreateParams() {
        AccountHolderCreateParams.builder()
            .forKyb(
                AccountHolderCreateParams.Kyb.builder()
                    .businessEntity(
                        AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                            .address(
                                Address.builder()
                                    .address1("123 Old Forest Way")
                                    .address2("string")
                                    .city("Omaha")
                                    .country("USA")
                                    .postalCode("68022")
                                    .state("NE")
                                    .build()
                            )
                            .dbaBusinessName("string")
                            .governmentId("114-123-1513")
                            .legalBusinessName("Acme, Inc.")
                            .parentCompany("string")
                            .phoneNumbers(listOf("+12124007676"))
                            .build()
                    )
                    .beneficialOwnerEntities(
                        listOf(
                            AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("string")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dbaBusinessName("string")
                                .governmentId("114-123-1513")
                                .legalBusinessName("Acme, Inc.")
                                .parentCompany("string")
                                .phoneNumbers(listOf("+12124007676"))
                                .build()
                        )
                    )
                    .beneficialOwnerIndividuals(
                        listOf(
                            AccountHolderCreateParams.Kyb.Individual.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("string")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
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
                    .controlPerson(
                        AccountHolderCreateParams.Kyb.Individual.builder()
                            .address(
                                Address.builder()
                                    .address1("123 Old Forest Way")
                                    .address2("string")
                                    .city("Omaha")
                                    .country("USA")
                                    .postalCode("68022")
                                    .state("NE")
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
                    .kybPassedTimestamp("2018-05-29T21:16:05Z")
                    .natureOfBusiness(
                        "Software company selling solutions to the restaurant industry"
                    )
                    .tosTimestamp("2018-05-29T21:16:05Z")
                    .websiteUrl("www.mybusiness.com")
                    .workflow(AccountHolderCreateParams.Kyb.Workflow.KYB_BASIC)
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountHolderCreateParams.builder()
                .forKyb(
                    AccountHolderCreateParams.Kyb.builder()
                        .businessEntity(
                            AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("string")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dbaBusinessName("string")
                                .governmentId("114-123-1513")
                                .legalBusinessName("Acme, Inc.")
                                .parentCompany("string")
                                .phoneNumbers(listOf("+12124007676"))
                                .build()
                        )
                        .beneficialOwnerEntities(
                            listOf(
                                AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                                    .address(
                                        Address.builder()
                                            .address1("123 Old Forest Way")
                                            .address2("string")
                                            .city("Omaha")
                                            .country("USA")
                                            .postalCode("68022")
                                            .state("NE")
                                            .build()
                                    )
                                    .dbaBusinessName("string")
                                    .governmentId("114-123-1513")
                                    .legalBusinessName("Acme, Inc.")
                                    .parentCompany("string")
                                    .phoneNumbers(listOf("+12124007676"))
                                    .build()
                            )
                        )
                        .beneficialOwnerIndividuals(
                            listOf(
                                AccountHolderCreateParams.Kyb.Individual.builder()
                                    .address(
                                        Address.builder()
                                            .address1("123 Old Forest Way")
                                            .address2("string")
                                            .city("Omaha")
                                            .country("USA")
                                            .postalCode("68022")
                                            .state("NE")
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
                        .controlPerson(
                            AccountHolderCreateParams.Kyb.Individual.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("string")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
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
                        .kybPassedTimestamp("2018-05-29T21:16:05Z")
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .tosTimestamp("2018-05-29T21:16:05Z")
                        .websiteUrl("www.mybusiness.com")
                        .workflow(AccountHolderCreateParams.Kyb.Workflow.KYB_BASIC)
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
