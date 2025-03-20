// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeInitiateEvidenceUploadParamsTest {

    @Test
    fun create() {
        DisputeInitiateEvidenceUploadParams.builder()
            .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filename("filename")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DisputeInitiateEvidenceUploadParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DisputeInitiateEvidenceUploadParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filename("filename")
                .build()

        val body = params._body()

        assertThat(body.filename()).contains("filename")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DisputeInitiateEvidenceUploadParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
