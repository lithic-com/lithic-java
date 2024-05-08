// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardGetEmbedHtmlParamsTest {

    @Test
    fun createCardGetEmbedHtmlParams() {
        CardGetEmbedHtmlParams.builder()
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .css("string")
            .expiration(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .targetOrigin("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardGetEmbedHtmlParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .css("string")
                .expiration(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .targetOrigin("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.css()).isEqualTo("string")
        assertThat(body.expiration()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.targetOrigin()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CardGetEmbedHtmlParams.builder().token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
