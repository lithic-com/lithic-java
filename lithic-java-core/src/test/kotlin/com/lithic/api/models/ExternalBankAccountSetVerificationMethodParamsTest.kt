// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountSetVerificationMethodParamsTest {

    @Test
    fun create() {
        ExternalBankAccountSetVerificationMethodParams.builder()
            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .verificationMethod(
                ExternalBankAccountSetVerificationMethodParams
                    .SetVerificationMethodAllowedVerificationMethods
                    .MICRO_DEPOSIT
            )
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalBankAccountSetVerificationMethodParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .verificationMethod(
                    ExternalBankAccountSetVerificationMethodParams
                        .SetVerificationMethodAllowedVerificationMethods
                        .MICRO_DEPOSIT
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalBankAccountSetVerificationMethodParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .verificationMethod(
                    ExternalBankAccountSetVerificationMethodParams
                        .SetVerificationMethodAllowedVerificationMethods
                        .MICRO_DEPOSIT
                )
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.verificationMethod())
            .isEqualTo(
                ExternalBankAccountSetVerificationMethodParams
                    .SetVerificationMethodAllowedVerificationMethods
                    .MICRO_DEPOSIT
            )
        assertThat(body.financialAccountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalBankAccountSetVerificationMethodParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .verificationMethod(
                    ExternalBankAccountSetVerificationMethodParams
                        .SetVerificationMethodAllowedVerificationMethods
                        .MICRO_DEPOSIT
                )
                .build()

        val body = params._body()

        assertThat(body.verificationMethod())
            .isEqualTo(
                ExternalBankAccountSetVerificationMethodParams
                    .SetVerificationMethodAllowedVerificationMethods
                    .MICRO_DEPOSIT
            )
    }
}
