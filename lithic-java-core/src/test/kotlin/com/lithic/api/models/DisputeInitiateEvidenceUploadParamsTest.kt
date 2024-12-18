// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeInitiateEvidenceUploadParamsTest {

    @Test
    fun createDisputeInitiateEvidenceUploadParams() {
        DisputeInitiateEvidenceUploadParams.builder()
            .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filename("filename")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DisputeInitiateEvidenceUploadParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filename("filename")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.filename()).isEqualTo("filename")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DisputeInitiateEvidenceUploadParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            DisputeInitiateEvidenceUploadParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "disputeToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
