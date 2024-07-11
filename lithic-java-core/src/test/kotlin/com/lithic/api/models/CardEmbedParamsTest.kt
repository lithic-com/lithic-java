// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardEmbedParamsTest {

    @Test
    fun createCardEmbedParams() {
        CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
    }

    @Test
    fun getQueryParams() {
        val params = CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("embed_request", listOf("embed_request"))
        expected.put("hmac", listOf("hmac"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("embed_request", listOf("embed_request"))
        expected.put("hmac", listOf("hmac"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
