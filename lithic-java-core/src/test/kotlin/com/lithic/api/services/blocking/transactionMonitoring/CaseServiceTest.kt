// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.JsonValue
import com.lithic.api.models.CasePriority
import com.lithic.api.models.CaseStatus
import com.lithic.api.models.ResolutionOutcome
import com.lithic.api.models.TransactionMonitoringCaseUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CaseServiceTest {

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseService = client.transactionMonitoring().cases()

        val monitoringCase = caseService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        monitoringCase.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseService = client.transactionMonitoring().cases()

        val monitoringCase =
            caseService.update(
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

        monitoringCase.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseService = client.transactionMonitoring().cases()

        val page = caseService.list()

        page.response().validate()
    }

    @Test
    fun listActivity() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseService = client.transactionMonitoring().cases()

        val page = caseService.listActivity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Test
    fun listTransactions() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseService = client.transactionMonitoring().cases()

        val page = caseService.listTransactions("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Test
    fun retrieveCards() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val caseService = client.transactionMonitoring().cases()

        val caseCards = caseService.retrieveCards("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        caseCards.forEach { it.validate() }
    }
}
