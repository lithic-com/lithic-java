package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DescisioningRetrieveSecretResponseTest {

    @Test
    fun createDescisioningRetrieveSecretResponse() {
        val descisioningRetrieveSecretResponse =
            DescisioningRetrieveSecretResponse.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()
        assertThat(descisioningRetrieveSecretResponse).isNotNull
        assertThat(descisioningRetrieveSecretResponse.secret())
            .contains("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
