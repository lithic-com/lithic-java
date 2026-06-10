// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseCommentCreateParamsTest {

    @Test
    fun create() {
        TransactionMonitoringCaseCommentCreateParams.builder()
            .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .actorToken("actor_token")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TransactionMonitoringCaseCommentCreateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TransactionMonitoringCaseCommentCreateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .actorToken("actor_token")
                .build()

        val body = params._body()

        assertThat(body.comment()).isEqualTo("comment")
        assertThat(body.actorToken()).contains("actor_token")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionMonitoringCaseCommentCreateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .build()

        val body = params._body()

        assertThat(body.comment()).isEqualTo("comment")
    }
}
