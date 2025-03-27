// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.tokenizations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationResendActivationCodeParamsTest {

    @Test
    fun create() {
        TokenizationResendActivationCodeParams.builder()
            .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .activationMethodType(
                TokenizationResendActivationCodeParams.ActivationMethodType
                    .EMAIL_TO_CARDHOLDER_ADDRESS
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activationMethodType(
                    TokenizationResendActivationCodeParams.ActivationMethodType
                        .EMAIL_TO_CARDHOLDER_ADDRESS
                )
                .build()

        val body = params._body()

        assertThat(body.activationMethodType())
            .contains(
                TokenizationResendActivationCodeParams.ActivationMethodType
                    .EMAIL_TO_CARDHOLDER_ADDRESS
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
