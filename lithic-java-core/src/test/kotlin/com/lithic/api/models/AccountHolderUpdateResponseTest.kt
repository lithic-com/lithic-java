package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AccountHolderUpdateResponse

class AccountHolderUpdateResponseTest {

    @Test
    fun createAccountHolderUpdateResponse() {
      val accountHolderUpdateResponse = AccountHolderUpdateResponse.builder()
          .token("string")
          .email("string")
          .phoneNumber("string")
          .build()
      assertThat(accountHolderUpdateResponse).isNotNull
      assertThat(accountHolderUpdateResponse.token()).contains("string")
      assertThat(accountHolderUpdateResponse.email()).contains("string")
      assertThat(accountHolderUpdateResponse.phoneNumber()).contains("string")
    }
}
