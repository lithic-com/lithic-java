// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TransactionMonitoringCaseFileCreateParams
import com.lithic.api.models.TransactionMonitoringCaseFileDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseFileRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        val caseFileFuture =
            fileServiceAsync.create(
                TransactionMonitoringCaseFileCreateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        val caseFile = caseFileFuture.get()
        caseFile.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        val caseFileFuture =
            fileServiceAsync.retrieve(
                TransactionMonitoringCaseFileRetrieveParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val caseFile = caseFileFuture.get()
        caseFile.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        val pageFuture = fileServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        val future =
            fileServiceAsync.delete(
                TransactionMonitoringCaseFileDeleteParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
