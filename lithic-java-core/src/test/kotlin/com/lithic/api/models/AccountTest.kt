package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.Account

class AccountTest {

    @Test
    fun createAccount() {
      val account = Account.builder()
          .spendLimit(Account.SpendLimit.builder()
              .daily(123L)
              .monthly(123L)
              .lifetime(123L)
              .build())
          .state(Account.State.ACTIVE)
          .token("b68b7424-aa69-4cbc-a946-30d90181b621")
          .authRuleTokens(listOf("string"))
          .build()
      assertThat(account).isNotNull
      assertThat(account.spendLimit()).isEqualTo(Account.SpendLimit.builder()
          .daily(123L)
          .monthly(123L)
          .lifetime(123L)
          .build())
      assertThat(account.state()).isEqualTo(Account.State.ACTIVE)
      assertThat(account.token()).isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
      assertThat(account.authRuleTokens().get()).containsExactly("string")
    }
}
