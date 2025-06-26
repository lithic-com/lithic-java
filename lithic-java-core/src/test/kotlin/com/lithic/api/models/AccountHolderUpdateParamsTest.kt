// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderUpdateParamsTest {

    @Test
    fun create() {
        AccountHolderUpdateParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                AccountHolderUpdateParams.Body.KybPatchRequest.builder()
                    .externalId("external_id")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AccountHolderUpdateParams.Body.KybPatchRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AccountHolderUpdateParams.Body.KybPatchRequest.builder()
                        .externalId("external_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AccountHolderUpdateParams.Body.ofKybPatchRequest(
                    AccountHolderUpdateParams.Body.KybPatchRequest.builder()
                        .externalId("external_id")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AccountHolderUpdateParams.Body.KybPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AccountHolderUpdateParams.Body.ofKybPatchRequest(
                    AccountHolderUpdateParams.Body.KybPatchRequest.builder().build()
                )
            )
    }
}
