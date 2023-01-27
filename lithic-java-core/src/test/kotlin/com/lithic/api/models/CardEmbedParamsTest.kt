package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardEmbedParamsTest {

    @Test
    fun createCardEmbedParams() {
        CardEmbedParams.builder().embedRequest("string").hmac("string").build()
    }

    @Test
    fun toQueryParams() {
        val params = CardEmbedParams.builder().embedRequest("string").hmac("string").build()
        val expected = ArrayListMultimap.create<String, String>()
        expected.put("embed_request", "string")
        expected.put("hmac", "string")
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }

    @Test
    fun toQueryParamsWithoutOptionalFields() {
        val params = CardEmbedParams.builder().build()
        val expected = ArrayListMultimap.create<String, String>()
        assertThat(params.toQueryParams()).isEqualTo(expected)
    }
}
