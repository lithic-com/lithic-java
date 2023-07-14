package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun createAccount() {
        val account =
            Account.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .spendLimit(
                    Account.SpendLimit.builder().daily(123L).lifetime(123L).monthly(123L).build()
                )
                .state(Account.State.ACTIVE)
                .accountHolder(
                    Account.AccountHolder.builder()
                        .token("95e5f1b7-cfd5-4520-aa3c-2451bab8608d")
                        .businessAccountToken("e87db14a-4abf-4901-adad-5d5c9f46aff2")
                        .email("jack@lithic.com")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .authRuleTokens(listOf("string"))
                .verificationAddress(
                    Account.VerificationAddress.builder()
                        .address1("124 Old Forest Way")
                        .city("Seattle")
                        .country("USA")
                        .postalCode("98109")
                        .state("WA")
                        .address2("Apt 21")
                        .build()
                )
                .build()
        assertThat(account).isNotNull
        assertThat(account.spendLimit())
            .isEqualTo(
                Account.SpendLimit.builder().daily(123L).lifetime(123L).monthly(123L).build()
            )
        assertThat(account.state()).isEqualTo(Account.State.ACTIVE)
        assertThat(account.token()).isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(account.authRuleTokens().get()).containsExactly("string")
        assertThat(account.verificationAddress())
            .contains(
                Account.VerificationAddress.builder()
                    .address1("124 Old Forest Way")
                    .city("Seattle")
                    .country("USA")
                    .postalCode("98109")
                    .state("WA")
                    .address2("Apt 21")
                    .build()
            )
        assertThat(account.accountHolder())
            .contains(
                Account.AccountHolder.builder()
                    .token("95e5f1b7-cfd5-4520-aa3c-2451bab8608d")
                    .businessAccountToken("e87db14a-4abf-4901-adad-5d5c9f46aff2")
                    .email("jack@lithic.com")
                    .phoneNumber("+12124007676")
                    .build()
            )
    }
}
