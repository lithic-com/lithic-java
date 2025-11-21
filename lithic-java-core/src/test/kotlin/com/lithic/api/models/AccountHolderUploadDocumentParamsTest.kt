// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderUploadDocumentParamsTest {

    @Test
    fun create() {
        AccountHolderUploadDocumentParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
            .entityToken("83cf25ae-c14f-4d10-9fa2-0119f36c7286")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
                .entityToken("83cf25ae-c14f-4d10-9fa2-0119f36c7286")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
                .entityToken("83cf25ae-c14f-4d10-9fa2-0119f36c7286")
                .build()

        val body = params._body()

        assertThat(body.documentType())
            .isEqualTo(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
        assertThat(body.entityToken()).isEqualTo("83cf25ae-c14f-4d10-9fa2-0119f36c7286")
    }
}
