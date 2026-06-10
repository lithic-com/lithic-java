// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringCaseCommentUpdateParamsTest {

    @Test
    fun create() {
        TransactionMonitoringCaseCommentUpdateParams.builder()
            .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .actorToken("actor_token")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TransactionMonitoringCaseCommentUpdateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TransactionMonitoringCaseCommentUpdateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
            TransactionMonitoringCaseCommentUpdateParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .build()

        val body = params._body()

        assertThat(body.comment()).isEqualTo("comment")
    }
}
