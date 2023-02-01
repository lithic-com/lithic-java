package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.EmbedRequestParams

class EmbedRequestParamsTest {

    @Test
    fun createEmbedRequestParams() {
      val embedRequestParams = EmbedRequestParams.builder()
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .css("string")
          .expiration("2019-12-27T18:11:19.117Z")
          .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .targetOrigin("string")
          .build()
      assertThat(embedRequestParams).isNotNull
      assertThat(embedRequestParams.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(embedRequestParams.css()).contains("string")
      assertThat(embedRequestParams.expiration()).contains("2019-12-27T18:11:19.117Z")
      assertThat(embedRequestParams.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(embedRequestParams.targetOrigin()).contains("string")
    }
}
