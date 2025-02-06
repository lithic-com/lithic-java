// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUploadDocumentParamsTest {

    @Test
    fun create() {
        AccountHolderUploadDocumentParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.documentType())
            .isEqualTo(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
        assertThat(body.entityToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.documentType())
            .isEqualTo(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
        assertThat(body.entityToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getPathParam() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.EIN_LETTER)
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "accountHolderToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
