package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AccountHolderCreateWebhookResponse

class AccountHolderCreateWebhookResponseTest {

    @Test
    fun createAccountHolderCreateWebhookResponse() {
      val accountHolderCreateWebhookResponse = AccountHolderCreateWebhookResponse.builder()
          .data(AccountHolderCreateWebhookResponse.Data.builder()
              .hmacToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .build())
          .build()
      assertThat(accountHolderCreateWebhookResponse).isNotNull
      assertThat(accountHolderCreateWebhookResponse.data()).contains(AccountHolderCreateWebhookResponse.Data.builder()
          .hmacToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
    }
}
