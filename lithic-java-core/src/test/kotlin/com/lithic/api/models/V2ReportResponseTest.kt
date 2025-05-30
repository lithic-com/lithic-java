// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2ReportResponseTest {

    @Test
    fun create() {
        val v2ReportResponse =
            V2ReportResponse.builder().reportToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(v2ReportResponse.reportToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2ReportResponse =
            V2ReportResponse.builder().reportToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val roundtrippedV2ReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ReportResponse),
                jacksonTypeRef<V2ReportResponse>(),
            )

        assertThat(roundtrippedV2ReportResponse).isEqualTo(v2ReportResponse)
    }
}
