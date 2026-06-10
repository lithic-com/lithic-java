// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring.cases

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TransactionMonitoringCaseCommentCreateParams
import com.lithic.api.models.TransactionMonitoringCaseCommentDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseCommentUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommentServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val commentService = client.transactionMonitoring().cases().comments()

        val caseActivityEntry =
            commentService.create(
                TransactionMonitoringCaseCommentCreateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .actorToken("actor_token")
                    .build()
            )

        caseActivityEntry.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val commentService = client.transactionMonitoring().cases().comments()

        val caseActivityEntry =
            commentService.update(
                TransactionMonitoringCaseCommentUpdateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .actorToken("actor_token")
                    .build()
            )

        caseActivityEntry.validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val commentService = client.transactionMonitoring().cases().comments()

        commentService.delete(
            TransactionMonitoringCaseCommentDeleteParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
