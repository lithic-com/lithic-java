// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardEmbedParamsTest {

    @Test
    fun createCardEmbedParams() {
        CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
    }

    @Test
    fun queryParams() {
        val params = CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
        val expected = QueryParams.builder()
        expected.put("embed_request", "embed_request")
        expected.put("hmac", "hmac")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
        val expected = QueryParams.builder()
        expected.put("embed_request", "embed_request")
        expected.put("hmac", "hmac")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
