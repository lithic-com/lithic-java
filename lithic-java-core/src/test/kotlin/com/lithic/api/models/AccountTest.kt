package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
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
          .verificationAddress(Account.VerificationAddress.builder()
              .address1("124 Old Forest Way")
              .address2("Apt 21")
              .city("Seattle")
              .state("WA")
              .postalCode("98109")
              .country("USA")
              .build())
          .accountHolder(Account.AccountHolder.builder()
              .token("95e5f1b7-cfd5-4520-aa3c-2451bab8608d")
              .phoneNumber("+12124007676")
              .email("jack@lithic.com")
              .businessAccountToken("e87db14a-4abf-4901-adad-5d5c9f46aff2")
              .build())
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
      assertThat(account.verificationAddress()).contains(Account.VerificationAddress.builder()
          .address1("124 Old Forest Way")
          .address2("Apt 21")
          .city("Seattle")
          .state("WA")
          .postalCode("98109")
          .country("USA")
          .build())
      assertThat(account.accountHolder()).contains(Account.AccountHolder.builder()
          .token("95e5f1b7-cfd5-4520-aa3c-2451bab8608d")
          .phoneNumber("+12124007676")
          .email("jack@lithic.com")
          .businessAccountToken("e87db14a-4abf-4901-adad-5d5c9f46aff2")
          .build())
    }
}
