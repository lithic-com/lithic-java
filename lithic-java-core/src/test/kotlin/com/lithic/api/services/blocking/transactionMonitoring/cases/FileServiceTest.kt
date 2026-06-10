// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring.cases

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TransactionMonitoringCaseFileCreateParams
import com.lithic.api.models.TransactionMonitoringCaseFileDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseFileRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileService = client.transactionMonitoring().cases().files()

        val caseFile =
            fileService.create(
                TransactionMonitoringCaseFileCreateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        caseFile.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileService = client.transactionMonitoring().cases().files()

        val caseFile =
            fileService.retrieve(
                TransactionMonitoringCaseFileRetrieveParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        caseFile.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileService = client.transactionMonitoring().cases().files()

        val page = fileService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileService = client.transactionMonitoring().cases().files()

        fileService.delete(
            TransactionMonitoringCaseFileDeleteParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
