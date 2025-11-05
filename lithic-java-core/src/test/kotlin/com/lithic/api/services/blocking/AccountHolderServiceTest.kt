// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.AccountHolderCreateParams
import com.lithic.api.models.AccountHolderRetrieveDocumentParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentDocumentReviewParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentReviewParams
import com.lithic.api.models.AccountHolderUpdateParams
import com.lithic.api.models.AccountHolderUploadDocumentParams
import com.lithic.api.models.Address
import com.lithic.api.models.AddressUpdate
import com.lithic.api.models.Kyb
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountHolderServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val accountHolder =
            accountHolderService.create(
                AccountHolderCreateParams.builder()
                    .body(
                        Kyb.builder()
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
                            .externalId("external_id")
                            .kybPassedTimestamp("2022-03-08T08:00:00Z")
                            .websiteUrl("https://www.mybusiness.com")
                            .build()
                    )
                    .build()
            )

        accountHolder.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val accountHolder = accountHolderService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        accountHolder.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val accountHolder =
            accountHolderService.update(
                AccountHolderUpdateParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(
                        AccountHolderUpdateParams.Body.KybPatchRequest.builder()
                            .addBeneficialOwnerEntity(
                                AccountHolderUpdateParams.Body.KybPatchRequest
                                    .KybBusinessEntityPatch
                                    .builder()
                                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .address(
                                        AddressUpdate.builder()
                                            .address1("123 Old Forest Way")
                                            .address2("address2")
                                            .city("Omaha")
                                            .country("USA")
                                            .postalCode("68022")
                                            .state("NE")
                                            .build()
                                    )
                                    .dbaBusinessName("dba_business_name")
                                    .governmentId("114-123-1513")
                                    .legalBusinessName("Acme, Inc.")
                                    .parentCompany("parent_company")
                                    .addPhoneNumber("+15555555555")
                                    .build()
                            )
                            .addBeneficialOwnerIndividual(
                                AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch
                                    .builder()
                                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .address(
                                        AddressUpdate.builder()
                                            .address1("123 Old Forest Way")
                                            .address2("address2")
                                            .city("Omaha")
                                            .country("USA")
                                            .postalCode("68022")
                                            .state("NE")
                                            .build()
                                    )
                                    .dob("1991-03-08 08:00:00")
                                    .email("tom@middle-earth.com")
                                    .firstName("Tom")
                                    .lastName("Bombadil")
                                    .phoneNumber("+15555555555")
                                    .build()
                            )
                            .businessEntity(
                                AccountHolderUpdateParams.Body.KybPatchRequest
                                    .KybBusinessEntityPatch
                                    .builder()
                                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .address(
                                        AddressUpdate.builder()
                                            .address1("123 Old Forest Way")
                                            .address2("address2")
                                            .city("Omaha")
                                            .country("USA")
                                            .postalCode("68022")
                                            .state("NE")
                                            .build()
                                    )
                                    .dbaBusinessName("dba_business_name")
                                    .governmentId("114-123-1513")
                                    .legalBusinessName("Acme, Inc.")
                                    .parentCompany("parent_company")
                                    .addPhoneNumber("+15555555555")
                                    .build()
                            )
                            .controlPerson(
                                AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch
                                    .builder()
                                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .address(
                                        AddressUpdate.builder()
                                            .address1("123 Old Forest Way")
                                            .address2("address2")
                                            .city("Omaha")
                                            .country("USA")
                                            .postalCode("68022")
                                            .state("NE")
                                            .build()
                                    )
                                    .dob("1991-03-08 08:00:00")
                                    .email("tom@middle-earth.com")
                                    .firstName("Tom")
                                    .lastName("Bombadil")
                                    .phoneNumber("+15555555555")
                                    .build()
                            )
                            .externalId("external_id")
                            .natureOfBusiness(
                                "Software company selling solutions to the restaurant industry"
                            )
                            .websiteUrl("www.mybusiness.com")
                            .build()
                    )
                    .build()
            )

        accountHolder.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val page = accountHolderService.list()

        page.response().validate()
    }

    @Test
    fun listDocuments() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val response = accountHolderService.listDocuments("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Test
    fun retrieveDocument() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val document =
            accountHolderService.retrieveDocument(
                AccountHolderRetrieveDocumentParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        document.validate()
    }

    @Test
    fun simulateEnrollmentDocumentReview() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val document =
            accountHolderService.simulateEnrollmentDocumentReview(
                AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
                    .documentUploadToken("b11cd67b-0a52-4180-8365-314f3def5426")
                    .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
                    .addAcceptedEntityStatusReason("string")
                    .statusReason(
                        AccountHolderSimulateEnrollmentDocumentReviewParams
                            .DocumentUploadStatusReasons
                            .DOCUMENT_MISSING_REQUIRED_DATA
                    )
                    .build()
            )

        document.validate()
    }

    @Test
    fun simulateEnrollmentReview() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val response =
            accountHolderService.simulateEnrollmentReview(
                AccountHolderSimulateEnrollmentReviewParams.builder()
                    .accountHolderToken("1415964d-4400-4d79-9fb3-eee0faaee4e4")
                    .status(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
                    .addStatusReason(
                        AccountHolderSimulateEnrollmentReviewParams.StatusReason
                            .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun uploadDocument() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()

        val document =
            accountHolderService.uploadDocument(
                AccountHolderUploadDocumentParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        document.validate()
    }
}
