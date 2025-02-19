// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderCreateParamsTest {

    @Test
    fun create() {
        AccountHolderCreateParams.builder()
            .body(
                Kyb.builder()
                    .addBeneficialOwnerEntity(
                        Kyb.BusinessEntity.builder()
                            .address(
                                Address.builder()
                                    .address1("300 Normal Forest Way")
                                    .city("Portland")
                                    .country("USA")
                                    .postalCode("90210")
                                    .state("OR")
                                    .address2("address2")
                                    .build()
                            )
                            .governmentId("98-7654321")
                            .legalBusinessName("Majority Holdings LLC")
                            .addPhoneNumber("+15555555555")
                            .dbaBusinessName("dba_business_name")
                            .parentCompany("parent_company")
                            .build()
                    )
                    .addBeneficialOwnerIndividual(
                        Kyb.KybIndividual.builder()
                            .address(
                                Address.builder()
                                    .address1("300 Normal Forest Way")
                                    .city("Portland")
                                    .country("USA")
                                    .postalCode("90210")
                                    .state("OR")
                                    .address2("address2")
                                    .build()
                            )
                            .dob("1991-03-08T08:00:00Z")
                            .email("tim@left-earth.com")
                            .firstName("Timmy")
                            .governmentId("211-23-1412")
                            .lastName("Turner")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .businessEntity(
                        Kyb.BusinessEntity.builder()
                            .address(
                                Address.builder()
                                    .address1("123 Old Forest Way")
                                    .city("Omaha")
                                    .country("USA")
                                    .postalCode("61022")
                                    .state("NE")
                                    .address2("address2")
                                    .build()
                            )
                            .governmentId("12-3456789")
                            .legalBusinessName("Busy Business, Inc.")
                            .addPhoneNumber("+15555555555")
                            .dbaBusinessName("dba_business_name")
                            .parentCompany("parent_company")
                            .build()
                    )
                    .controlPerson(
                        Kyb.KybIndividual.builder()
                            .address(
                                Address.builder()
                                    .address1("451 New Forest Way")
                                    .city("Springfield")
                                    .country("USA")
                                    .postalCode("68022")
                                    .state("IL")
                                    .address2("address2")
                                    .build()
                            )
                            .dob("1991-03-08T08:00:00Z")
                            .email("tom@middle-pluto.com")
                            .firstName("Tom")
                            .governmentId("111-23-1412")
                            .lastName("Timothy")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .natureOfBusiness(
                        "Software company selling solutions to the restaurant industry"
                    )
                    .tosTimestamp("2022-03-08T08:00:00Z")
                    .workflow(Kyb.Workflow.KYB_BASIC)
                    .externalId("external_id")
                    .kybPassedTimestamp("2022-03-08T08:00:00Z")
                    .websiteUrl("https://www.mybusiness.com")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountHolderCreateParams.builder()
                .body(
                    Kyb.builder()
                        .addBeneficialOwnerEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .address2("address2")
                                        .build()
                                )
                                .governmentId("98-7654321")
                                .legalBusinessName("Majority Holdings LLC")
                                .addPhoneNumber("+15555555555")
                                .dbaBusinessName("dba_business_name")
                                .parentCompany("parent_company")
                                .build()
                        )
                        .addBeneficialOwnerIndividual(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .address2("address2")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tim@left-earth.com")
                                .firstName("Timmy")
                                .governmentId("211-23-1412")
                                .lastName("Turner")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .businessEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("61022")
                                        .state("NE")
                                        .address2("address2")
                                        .build()
                                )
                                .governmentId("12-3456789")
                                .legalBusinessName("Busy Business, Inc.")
                                .addPhoneNumber("+15555555555")
                                .dbaBusinessName("dba_business_name")
                                .parentCompany("parent_company")
                                .build()
                        )
                        .controlPerson(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("451 New Forest Way")
                                        .city("Springfield")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("IL")
                                        .address2("address2")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tom@middle-pluto.com")
                                .firstName("Tom")
                                .governmentId("111-23-1412")
                                .lastName("Timothy")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .tosTimestamp("2022-03-08T08:00:00Z")
                        .workflow(Kyb.Workflow.KYB_BASIC)
                        .externalId("external_id")
                        .kybPassedTimestamp("2022-03-08T08:00:00Z")
                        .websiteUrl("https://www.mybusiness.com")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                AccountHolderCreateParams.Body.ofKyb(
                    Kyb.builder()
                        .addBeneficialOwnerEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .address2("address2")
                                        .build()
                                )
                                .governmentId("98-7654321")
                                .legalBusinessName("Majority Holdings LLC")
                                .addPhoneNumber("+15555555555")
                                .dbaBusinessName("dba_business_name")
                                .parentCompany("parent_company")
                                .build()
                        )
                        .addBeneficialOwnerIndividual(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .address2("address2")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tim@left-earth.com")
                                .firstName("Timmy")
                                .governmentId("211-23-1412")
                                .lastName("Turner")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .businessEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("61022")
                                        .state("NE")
                                        .address2("address2")
                                        .build()
                                )
                                .governmentId("12-3456789")
                                .legalBusinessName("Busy Business, Inc.")
                                .addPhoneNumber("+15555555555")
                                .dbaBusinessName("dba_business_name")
                                .parentCompany("parent_company")
                                .build()
                        )
                        .controlPerson(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("451 New Forest Way")
                                        .city("Springfield")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("IL")
                                        .address2("address2")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tom@middle-pluto.com")
                                .firstName("Tom")
                                .governmentId("111-23-1412")
                                .lastName("Timothy")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .tosTimestamp("2022-03-08T08:00:00Z")
                        .workflow(Kyb.Workflow.KYB_BASIC)
                        .externalId("external_id")
                        .kybPassedTimestamp("2022-03-08T08:00:00Z")
                        .websiteUrl("https://www.mybusiness.com")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountHolderCreateParams.builder()
                .body(
                    Kyb.builder()
                        .addBeneficialOwnerEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .build()
                                )
                                .governmentId("98-7654321")
                                .legalBusinessName("Majority Holdings LLC")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .addBeneficialOwnerIndividual(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tim@left-earth.com")
                                .firstName("Timmy")
                                .governmentId("211-23-1412")
                                .lastName("Turner")
                                .build()
                        )
                        .businessEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("61022")
                                        .state("NE")
                                        .build()
                                )
                                .governmentId("12-3456789")
                                .legalBusinessName("Busy Business, Inc.")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .controlPerson(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("451 New Forest Way")
                                        .city("Springfield")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("IL")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tom@middle-pluto.com")
                                .firstName("Tom")
                                .governmentId("111-23-1412")
                                .lastName("Timothy")
                                .build()
                        )
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .tosTimestamp("2022-03-08T08:00:00Z")
                        .workflow(Kyb.Workflow.KYB_BASIC)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                AccountHolderCreateParams.Body.ofKyb(
                    Kyb.builder()
                        .addBeneficialOwnerEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .build()
                                )
                                .governmentId("98-7654321")
                                .legalBusinessName("Majority Holdings LLC")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .addBeneficialOwnerIndividual(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("300 Normal Forest Way")
                                        .city("Portland")
                                        .country("USA")
                                        .postalCode("90210")
                                        .state("OR")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tim@left-earth.com")
                                .firstName("Timmy")
                                .governmentId("211-23-1412")
                                .lastName("Turner")
                                .build()
                        )
                        .businessEntity(
                            Kyb.BusinessEntity.builder()
                                .address(
                                    Address.builder()
                                        .address1("123 Old Forest Way")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("61022")
                                        .state("NE")
                                        .build()
                                )
                                .governmentId("12-3456789")
                                .legalBusinessName("Busy Business, Inc.")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .controlPerson(
                            Kyb.KybIndividual.builder()
                                .address(
                                    Address.builder()
                                        .address1("451 New Forest Way")
                                        .city("Springfield")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("IL")
                                        .build()
                                )
                                .dob("1991-03-08T08:00:00Z")
                                .email("tom@middle-pluto.com")
                                .firstName("Tom")
                                .governmentId("111-23-1412")
                                .lastName("Timothy")
                                .build()
                        )
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .tosTimestamp("2022-03-08T08:00:00Z")
                        .workflow(Kyb.Workflow.KYB_BASIC)
                        .build()
                )
            )
    }
}
