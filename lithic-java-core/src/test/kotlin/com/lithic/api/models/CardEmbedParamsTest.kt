// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardEmbedParamsTest {

    @Test
    fun create() {
        CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
    }

    @Test
    fun queryParams() {
        val params = CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("embed_request", "embed_request")
                    .put("hmac", "hmac")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("embed_request", "embed_request")
                    .put("hmac", "hmac")
                    .build()
            )
    }
}
