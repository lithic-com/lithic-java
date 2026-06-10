// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            TransactionMonitoringCaseUpdateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.actorToken()).contains("actor_token")
        assertThat(body.assignee()).contains("assignee")
        assertThat(body.priority()).contains(CasePriority.LOW)
        assertThat(body.resolution()).contains(ResolutionOutcome.CONFIRMED_FRAUD)
        assertThat(body.resolutionNotes()).contains("resolution_notes")
        assertThat(body.slaDeadline()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.status()).contains(CaseStatus.OPEN)
        assertThat(body.tags())
            .contains(
                TransactionMonitoringCaseUpdateParams.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionMonitoringCaseUpdateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
