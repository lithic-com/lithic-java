package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderCreateWebhookResponseTest {
    @Test
    fun createAccountHolderCreateWebhookResponse() {
        val accountHolderCreateWebhookResponse =
            AccountHolderCreateWebhookResponse.builder()
                .data(
                    AccountHolderCreateWebhookResponse.Data.builder()
                        .hmacToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(accountHolderCreateWebhookResponse).isNotNull
        assertThat(accountHolderCreateWebhookResponse.data())
            .contains(
                AccountHolderCreateWebhookResponse.Data.builder()
                    .hmacToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
