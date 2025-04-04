// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderTest {

    @Test
    fun create() {
        val accountHolder =
            AccountHolder.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerEntity(
                    AccountHolder.AccountHolderBusinessResponse.builder()
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
                        .dbaBusinessName("dba_business_name")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .parentCompany("parent_company")
                        .build()
                )
                .addBeneficialOwnerIndividual(
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
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    AccountHolder.AccountHolderBusinessResponse.builder()
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
                        .dbaBusinessName("dba_business_name")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
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
                        .phoneNumber("+15555555555")
                        .build()
                )
                .email("+15555555555")
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
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("+15555555555")
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolder.Status.ACCEPTED)
                .addStatusReason(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
                .userType(AccountHolder.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolder.AccountHolderVerificationApplication.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(AccountHolder.AccountHolderVerificationApplication.Status.ACCEPTED)
                        .addStatusReason(
                            AccountHolder.AccountHolderVerificationApplication.StatusReason
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()

        assertThat(accountHolder.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolder.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.beneficialOwnerEntities().getOrNull())
            .containsExactly(
                AccountHolder.AccountHolderBusinessResponse.builder()
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
                    .dbaBusinessName("dba_business_name")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolder.beneficialOwnerIndividuals().getOrNull())
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
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolder.businessAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.businessEntity())
            .contains(
                AccountHolder.AccountHolderBusinessResponse.builder()
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
                    .dbaBusinessName("dba_business_name")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
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
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolder.email()).contains("+15555555555")
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
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolder.natureOfBusiness()).contains("nature_of_business")
        assertThat(accountHolder.phoneNumber()).contains("+15555555555")
        assertThat(accountHolder.requiredDocuments().getOrNull())
            .containsExactly(
                RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addStatusReason("string")
                    .addValidDocument("string")
                    .build()
            )
        assertThat(accountHolder.status()).contains(AccountHolder.Status.ACCEPTED)
        assertThat(accountHolder.statusReasons().getOrNull())
            .containsExactly(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
        assertThat(accountHolder.userType()).contains(AccountHolder.UserType.BUSINESS)
        assertThat(accountHolder.verificationApplication())
            .contains(
                AccountHolder.AccountHolderVerificationApplication.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(AccountHolder.AccountHolderVerificationApplication.Status.ACCEPTED)
                    .addStatusReason(
                        AccountHolder.AccountHolderVerificationApplication.StatusReason
                            .ADDRESS_VERIFICATION_FAILURE
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountHolder.websiteUrl()).contains("website_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolder =
            AccountHolder.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerEntity(
                    AccountHolder.AccountHolderBusinessResponse.builder()
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
                        .dbaBusinessName("dba_business_name")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .parentCompany("parent_company")
                        .build()
                )
                .addBeneficialOwnerIndividual(
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
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    AccountHolder.AccountHolderBusinessResponse.builder()
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
                        .dbaBusinessName("dba_business_name")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
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
                        .phoneNumber("+15555555555")
                        .build()
                )
                .email("+15555555555")
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
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("+15555555555")
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolder.Status.ACCEPTED)
                .addStatusReason(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
                .userType(AccountHolder.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolder.AccountHolderVerificationApplication.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(AccountHolder.AccountHolderVerificationApplication.Status.ACCEPTED)
                        .addStatusReason(
                            AccountHolder.AccountHolderVerificationApplication.StatusReason
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()

        val roundtrippedAccountHolder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolder),
                jacksonTypeRef<AccountHolder>(),
            )

        assertThat(roundtrippedAccountHolder).isEqualTo(accountHolder)
    }
}
