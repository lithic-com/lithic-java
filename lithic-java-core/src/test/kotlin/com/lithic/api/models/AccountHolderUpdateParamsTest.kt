// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUpdateParamsTest {

    @Test
    fun create() {
        AccountHolderUpdateParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .businessAccountToken("business_account_token")
            .email("email")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessAccountToken("business_account_token")
                .email("email")
                .phoneNumber("phone_number")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.businessAccountToken()).contains("business_account_token")
        assertThat(body.email()).contains("email")
        assertThat(body.phoneNumber()).contains("phone_number")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "accountHolderToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
