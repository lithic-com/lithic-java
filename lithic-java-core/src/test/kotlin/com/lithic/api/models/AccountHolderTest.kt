// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderTest {

    @Test
    fun createAccountHolder() {
        val accountHolder =
            AccountHolder.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .beneficialOwnerEntities(
                    listOf(
                        AccountHolder.BusinessEntity.builder()
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
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .governmentId("114-123-1513")
                            .legalBusinessName("Acme, Inc.")
                            .phoneNumbers(listOf("+12124007676"))
                            .dbaBusinessName("dba_business_name")
                            .parentCompany("parent_company")
                            .build()
                    )
                )
                .beneficialOwnerIndividuals(
                    listOf(
                        AccountHolder.AccountHolderIndividualResponse.builder()
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
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .firstName("Tom")
                            .lastName("Bombadil")
                            .phoneNumber("+12124007676")
                            .build()
                    )
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    AccountHolder.BusinessEntity.builder()
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
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .phoneNumbers(listOf("+12124007676"))
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    AccountHolder.AccountHolderIndividualResponse.builder()
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
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .email("+12124007676")
                .exemptionType(AccountHolder.ExemptionType.AUTHORIZED_USER)
                .externalId("external_id")
                .individual(
                    AccountHolder.AccountHolderIndividualResponse.builder()
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
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("+12124007676")
                .requiredDocuments(
                    listOf(
                        AccountHolder.RequiredDocument.builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .statusReasons(listOf("string"))
                            .validDocuments(listOf("string"))
                            .build()
                    )
                )
                .status(AccountHolder.Status.ACCEPTED)
                .statusReasons(listOf(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE))
                .userType(AccountHolder.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolder.AccountHolderVerificationApplication.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(AccountHolder.AccountHolderVerificationApplication.Status.ACCEPTED)
                        .statusReasons(
                            listOf(
                                AccountHolder.AccountHolderVerificationApplication.StatusReason
                                    .ADDRESS_VERIFICATION_FAILURE
                            )
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()
        assertThat(accountHolder).isNotNull
        assertThat(accountHolder.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolder.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.beneficialOwnerEntities().get())
            .containsExactly(
                AccountHolder.BusinessEntity.builder()
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
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolder.beneficialOwnerIndividuals().get())
            .containsExactly(
                AccountHolder.AccountHolderIndividualResponse.builder()
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
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(accountHolder.businessAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.businessEntity())
            .contains(
                AccountHolder.BusinessEntity.builder()
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
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolder.controlPerson())
            .contains(
                AccountHolder.AccountHolderIndividualResponse.builder()
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
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(accountHolder.email()).contains("+12124007676")
        assertThat(accountHolder.exemptionType())
            .contains(AccountHolder.ExemptionType.AUTHORIZED_USER)
        assertThat(accountHolder.externalId()).contains("external_id")
        assertThat(accountHolder.individual())
            .contains(
                AccountHolder.AccountHolderIndividualResponse.builder()
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
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(accountHolder.natureOfBusiness()).contains("nature_of_business")
        assertThat(accountHolder.phoneNumber()).contains("+12124007676")
        assertThat(accountHolder.requiredDocuments().get())
            .containsExactly(
                AccountHolder.RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .statusReasons(listOf("string"))
                    .validDocuments(listOf("string"))
                    .build()
            )
        assertThat(accountHolder.status()).contains(AccountHolder.Status.ACCEPTED)
        assertThat(accountHolder.statusReasons().get())
            .containsExactly(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
        assertThat(accountHolder.userType()).contains(AccountHolder.UserType.BUSINESS)
        assertThat(accountHolder.verificationApplication())
            .contains(
                AccountHolder.AccountHolderVerificationApplication.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(AccountHolder.AccountHolderVerificationApplication.Status.ACCEPTED)
                    .statusReasons(
                        listOf(
                            AccountHolder.AccountHolderVerificationApplication.StatusReason
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountHolder.websiteUrl()).contains("website_url")
    }
}
