// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderSimulateEnrollmentReviewResponseTest {

    @Test
    fun createAccountHolderSimulateEnrollmentReviewResponse() {
        val accountHolderSimulateEnrollmentReviewResponse =
            AccountHolderSimulateEnrollmentReviewResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
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
                .addBeneficialOwnerIndividual(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
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
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .exemptionType(
                    AccountHolderSimulateEnrollmentReviewResponse.ExemptionType.AUTHORIZED_USER
                )
                .externalId("external_id")
                .individual(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("phone_number")
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolderSimulateEnrollmentReviewResponse.Status.ACCEPTED)
                .addStatusReason(
                    AccountHolderSimulateEnrollmentReviewResponse.StatusReasons
                        .ADDRESS_VERIFICATION_FAILURE
                )
                .userType(AccountHolderSimulateEnrollmentReviewResponse.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                                .Status
                                .ACCEPTED
                        )
                        .addStatusReason(
                            AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                                .StatusReasons
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()
        assertThat(accountHolderSimulateEnrollmentReviewResponse).isNotNull
        assertThat(accountHolderSimulateEnrollmentReviewResponse.token())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerEntities().get())
            .containsExactly(
                KybBusinessEntity.builder()
                    .address(
                        KybBusinessEntity.Address.builder()
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
        assertThat(accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerIndividuals().get())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address.builder()
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
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.businessAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.businessEntity())
            .contains(
                KybBusinessEntity.builder()
                    .address(
                        KybBusinessEntity.Address.builder()
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
        assertThat(accountHolderSimulateEnrollmentReviewResponse.controlPerson())
            .contains(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address.builder()
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
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolderSimulateEnrollmentReviewResponse.email()).contains("email")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.exemptionType())
            .contains(AccountHolderSimulateEnrollmentReviewResponse.ExemptionType.AUTHORIZED_USER)
        assertThat(accountHolderSimulateEnrollmentReviewResponse.externalId())
            .contains("external_id")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.individual())
            .contains(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address.builder()
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
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.natureOfBusiness())
            .contains("nature_of_business")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.phoneNumber())
            .contains("phone_number")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.requiredDocuments().get())
            .containsExactly(
                RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addStatusReason("string")
                    .addValidDocument("string")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.status())
            .contains(AccountHolderSimulateEnrollmentReviewResponse.Status.ACCEPTED)
        assertThat(accountHolderSimulateEnrollmentReviewResponse.statusReasons().get())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewResponse.StatusReasons
                    .ADDRESS_VERIFICATION_FAILURE
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.userType())
            .contains(AccountHolderSimulateEnrollmentReviewResponse.UserType.BUSINESS)
        assertThat(accountHolderSimulateEnrollmentReviewResponse.verificationApplication())
            .contains(
                AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication.Status
                            .ACCEPTED
                    )
                    .addStatusReason(
                        AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                            .StatusReasons
                            .ADDRESS_VERIFICATION_FAILURE
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.websiteUrl())
            .contains("website_url")
    }
}
