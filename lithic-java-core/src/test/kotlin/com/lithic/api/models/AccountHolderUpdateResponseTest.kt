// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUpdateResponseTest {

    @Test
    fun createAccountHolderUpdateResponse() {
        val accountHolderUpdateResponse =
            AccountHolderUpdateResponse.builder()
                .token("token")
                .businessAccountToken("business_account_token")
                .email("email")
                .phoneNumber("phone_number")
                .build()
        assertThat(accountHolderUpdateResponse).isNotNull
        assertThat(accountHolderUpdateResponse.token()).contains("token")
        assertThat(accountHolderUpdateResponse.businessAccountToken())
            .contains("business_account_token")
        assertThat(accountHolderUpdateResponse.email()).contains("email")
        assertThat(accountHolderUpdateResponse.phoneNumber()).contains("phone_number")
    }
}
