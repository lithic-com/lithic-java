package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountHolderServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolder =
            accountHolderService.create(
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
                            .kybPassedTimestamp("2022-03-08 08:00:00")
                            .natureOfBusiness(
                                "Software company selling solutions to the restaurant industry"
                            )
                            .tosTimestamp("2022-03-08 08:00:00")
                            .websiteUrl("www.mybusiness.com")
                            .workflow(AccountHolderCreateParams.Kyb.Workflow.KYB_BASIC)
                            .build()
                    )
                    .build()
            )
        println(accountHolder)
        accountHolder.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderUpdateResponse =
            accountHolderService.update(
                AccountHolderUpdateParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("string")
                    .phoneNumber("string")
                    .build()
            )
        println(accountHolderUpdateResponse)
        accountHolderUpdateResponse.validate()
    }

    @Test
    fun callCreateWebhook() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolderCreateWebhookResponse =
            accountHolderService.createWebhook(
                AccountHolderCreateWebhookParams.builder().url("string").build()
            )
        println(accountHolderCreateWebhookResponse)
        accountHolderCreateWebhookResponse.validate()
    }

    @Test
    fun callListDocuments() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
                .build()
        val accountHolderService = client.accountHolders()
        val accountHolder =
            accountHolderService.resubmit(
                AccountHolderResubmitParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                    .tosTimestamp("2022-03-08 08:00:00")
                    .individual(
                        AccountHolderResubmitParams.Individual.builder()
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
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
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
