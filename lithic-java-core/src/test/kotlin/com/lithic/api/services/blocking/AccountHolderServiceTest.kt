// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.AccountHolderListParams
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
                            .natureOfBusiness(
                                "Software company selling solutions to the restaurant industry"
                            )
                            .tosTimestamp("2018-05-29T21:16:05Z")
                            .workflow(Kyb.Workflow.KYB_BASIC)
                            .externalId("string")
                            .kybPassedTimestamp("2018-05-29T21:16:05Z")
                            .websiteUrl("www.mybusiness.com")
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
                    .businessAccountToken("string")
                    .email("string")
                    .phoneNumber("string")
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
    fun callResubmit() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolder =
            accountHolderService.resubmit(
                AccountHolderResubmitParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .individual(
                        AccountHolderResubmitParams.Individual.builder()
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
                    .tosTimestamp("2018-05-29T21:16:05Z")
                    .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                    .build()
            )
        println(accountHolder)
        accountHolder.validate()
    }

    @Test
    fun callRetrieveDocument() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderDocument =
            accountHolderService.retrieveDocument(
                AccountHolderRetrieveDocumentParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(accountHolderDocument)
        accountHolderDocument.validate()
    }

    @Test
    fun callUploadDocument() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderDocument =
            accountHolderService.uploadDocument(
                AccountHolderUploadDocumentParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentType(AccountHolderUploadDocumentParams.DocumentType.COMMERCIAL_LICENSE)
                    .build()
            )
        println(accountHolderDocument)
        accountHolderDocument.validate()
    }
}
