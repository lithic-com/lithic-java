package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmbedRequestParamsTest {

    @Test
    fun createEmbedRequestParams() {
        val embedRequestParams =
            EmbedRequestParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .css("string")
                .expiration(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .targetOrigin("string")
                .build()
        assertThat(embedRequestParams).isNotNull
        assertThat(embedRequestParams.css()).contains("string")
        assertThat(embedRequestParams.expiration())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(embedRequestParams.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(embedRequestParams.targetOrigin()).contains("string")
    }
}
