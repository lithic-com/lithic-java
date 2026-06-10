// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TransactionMonitoringCaseCommentCreateParams
import com.lithic.api.models.TransactionMonitoringCaseCommentDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseCommentUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val commentServiceAsync = client.transactionMonitoring().cases().comments()

        val caseActivityEntryFuture =
            commentServiceAsync.create(
                TransactionMonitoringCaseCommentCreateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .actorToken("actor_token")
                    .build()
            )

        val caseActivityEntry = caseActivityEntryFuture.get()
        caseActivityEntry.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val commentServiceAsync = client.transactionMonitoring().cases().comments()

        val caseActivityEntryFuture =
            commentServiceAsync.update(
                TransactionMonitoringCaseCommentUpdateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .actorToken("actor_token")
                    .build()
            )

        val caseActivityEntry = caseActivityEntryFuture.get()
        caseActivityEntry.validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val commentServiceAsync = client.transactionMonitoring().cases().comments()

        val future =
            commentServiceAsync.delete(
                TransactionMonitoringCaseCommentDeleteParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
