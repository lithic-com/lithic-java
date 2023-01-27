package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUploadDocumentParamsTest {

    @Test
    fun createAccountHolderUploadDocumentParams() {
        AccountHolderUploadDocumentParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .documentType(AccountHolderUploadDocumentParams.DocumentType.COMMERCIAL_LICENSE)
            .build()
    }

    @Test
    fun toBody() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.COMMERCIAL_LICENSE)
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.documentType())
            .isEqualTo(AccountHolderUploadDocumentParams.DocumentType.COMMERCIAL_LICENSE)
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.COMMERCIAL_LICENSE)
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.documentType())
            .isEqualTo(AccountHolderUploadDocumentParams.DocumentType.COMMERCIAL_LICENSE)
    }

    @Test
    fun getPathParam() {
        val params =
            AccountHolderUploadDocumentParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderUploadDocumentParams.DocumentType.COMMERCIAL_LICENSE)
                .build()
        assertThat(params).isNotNull
        // path param "accountHolderToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
