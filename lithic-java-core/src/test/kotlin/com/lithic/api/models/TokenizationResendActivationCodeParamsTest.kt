// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenizationResendActivationCodeParamsTest {

    @Test
    fun createTokenizationResendActivationCodeParams() {
        TokenizationResendActivationCodeParams.builder()
            .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .activationMethodType(
                TokenizationResendActivationCodeParams.ActivationMethodType
                    .EMAIL_TO_CARDHOLDER_ADDRESS
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activationMethodType(
                    TokenizationResendActivationCodeParams.ActivationMethodType
                        .EMAIL_TO_CARDHOLDER_ADDRESS
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.activationMethodType())
            .isEqualTo(
                TokenizationResendActivationCodeParams.ActivationMethodType
                    .EMAIL_TO_CARDHOLDER_ADDRESS
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "tokenizationToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
