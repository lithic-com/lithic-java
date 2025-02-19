// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.AccountHolderCreateParams
import com.lithic.api.models.AccountHolderListDocumentsParams
import com.lithic.api.models.AccountHolderListParams
import com.lithic.api.models.AccountHolderRetrieveDocumentParams
import com.lithic.api.models.AccountHolderRetrieveParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentDocumentReviewParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentReviewParams
import com.lithic.api.models.AccountHolderUpdateParams
import com.lithic.api.models.AccountHolderUploadDocumentParams
import com.lithic.api.models.Address
import com.lithic.api.models.Kyb
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountHolderServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderCreateResponse =
            accountHolderService.create(
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
            )
        println(accountHolderCreateResponse)
        accountHolderCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolder =
            accountHolderService.retrieve(
                AccountHolderRetrieveParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(accountHolder)
        accountHolder.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderUpdateResponse =
            accountHolderService.update(
                AccountHolderUpdateParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .businessAccountToken("business_account_token")
                    .email("email")
                    .phoneNumber("phone_number")
                    .build()
            )
        println(accountHolderUpdateResponse)
        accountHolderUpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val response = accountHolderService.list(AccountHolderListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callListDocuments() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderListDocumentsResponse =
            accountHolderService.listDocuments(
                AccountHolderListDocumentsParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(accountHolderListDocumentsResponse)
        accountHolderListDocumentsResponse.validate()
    }

    @Test
    fun callRetrieveDocument() {
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
        println(document)
        document.validate()
    }

    @Test
    fun callSimulateEnrollmentDocumentReview() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val document =
            accountHolderService.simulateEnrollmentDocumentReview(
                AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
                    .documentUploadToken("document_upload_token")
                    .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
                    .addAcceptedEntityStatusReason("string")
                    .statusReason(
                        AccountHolderSimulateEnrollmentDocumentReviewParams
                            .DocumentUploadStatusReasons
                            .DOCUMENT_MISSING_REQUIRED_DATA
                    )
                    .build()
            )
        println(document)
        document.validate()
    }

    @Test
    fun callSimulateEnrollmentReview() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderSimulateEnrollmentReviewResponse =
            accountHolderService.simulateEnrollmentReview(
                AccountHolderSimulateEnrollmentReviewParams.builder()
                    .accountHolderToken("account_holder_token")
                    .status(AccountHolderSimulateEnrollmentReviewParams.Status.ACCEPTED)
                    .addStatusReason(
                        AccountHolderSimulateEnrollmentReviewParams.StatusReason
                            .PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                    )
                    .build()
            )
        println(accountHolderSimulateEnrollmentReviewResponse)
        accountHolderSimulateEnrollmentReviewResponse.validate()
    }

    @Test
    fun callUploadDocument() {
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
        println(document)
        document.validate()
    }
}
