// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.core.JsonValue
import com.lithic.api.models.CasePriority
import com.lithic.api.models.CaseStatus
import com.lithic.api.models.ResolutionOutcome
import com.lithic.api.models.TransactionMonitoringCaseUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CaseServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseServiceAsync = client.transactionMonitoring().cases()

        val monitoringCaseFuture = caseServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val monitoringCase = monitoringCaseFuture.get()
        monitoringCase.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseServiceAsync = client.transactionMonitoring().cases()

        val monitoringCaseFuture =
            caseServiceAsync.update(
                TransactionMonitoringCaseUpdateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .actorToken("actor_token")
                    .assignee("assignee")
                    .priority(CasePriority.LOW)
                    .resolution(ResolutionOutcome.CONFIRMED_FRAUD)
                    .resolutionNotes("resolution_notes")
                    .slaDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(CaseStatus.OPEN)
                    .tags(
                        TransactionMonitoringCaseUpdateParams.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .title("title")
                    .build()
            )

        val monitoringCase = monitoringCaseFuture.get()
        monitoringCase.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseServiceAsync = client.transactionMonitoring().cases()

        val pageFuture = caseServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun listActivity() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseServiceAsync = client.transactionMonitoring().cases()

        val pageFuture = caseServiceAsync.listActivity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun listTransactions() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseServiceAsync = client.transactionMonitoring().cases()

        val pageFuture = caseServiceAsync.listTransactions("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun retrieveCards() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseServiceAsync = client.transactionMonitoring().cases()

        val caseCardsFuture = caseServiceAsync.retrieveCards("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val caseCards = caseCardsFuture.get()
        caseCards.forEach { it.validate() }
    }
}
