// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.accountholders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderUpdateResponseTest {

    @Test
    fun create() {
        val accountHolderUpdateResponse =
            AccountHolderUpdateResponse.builder()
                .token("token")
                .businessAccountToken("business_account_token")
                .email("email")
                .phoneNumber("phone_number")
                .build()

        assertThat(accountHolderUpdateResponse.token()).contains("token")
        assertThat(accountHolderUpdateResponse.businessAccountToken())
            .contains("business_account_token")
        assertThat(accountHolderUpdateResponse.email()).contains("email")
        assertThat(accountHolderUpdateResponse.phoneNumber()).contains("phone_number")
    }
}
