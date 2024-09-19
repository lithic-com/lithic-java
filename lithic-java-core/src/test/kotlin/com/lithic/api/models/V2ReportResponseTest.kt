// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2ReportResponseTest {

    @Test
    fun createV2ReportResponse() {
        val v2ReportResponse =
            V2ReportResponse.builder().reportToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(v2ReportResponse).isNotNull
        assertThat(v2ReportResponse.reportToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
