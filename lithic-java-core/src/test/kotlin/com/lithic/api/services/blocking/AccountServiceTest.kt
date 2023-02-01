package com.lithic.api.services.blocking

import java.util.Optional
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.services.blocking.AccountService
import com.lithic.api.models.AccountListPage
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.*

class AccountServiceTest {

    @Test
    fun callRetrieve() {
      val client = LithicOkHttpClient.builder()
          .baseUrl("http://127.0.0.1:4010")
          .apiKey("test-api-key")
          .build()
      val accountService = client.accounts()
      val account = accountService.retrieve(AccountRetrieveParams.builder()
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
      println(account)
      account.validate()
    }

    @Disabled("Prism returns invalid data")
    @Test
    fun callUpdate() {
      val client = LithicOkHttpClient.builder()
          .baseUrl("http://127.0.0.1:4010")
          .apiKey("test-api-key")
          .build()
      val accountService = client.accounts()
      val account = accountService.update(AccountUpdateParams.builder()
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .dailySpendLimit(123L)
          .lifetimeSpendLimit(123L)
          .monthlySpendLimit(123L)
          .verificationAddress(AccountUpdateParams.VerificationAddress.builder()
              .address1("string")
              .address2("string")
              .city("string")
              .state("string")
              .postalCode("string")
              .country("string")
              .build())
          .state(AccountUpdateParams.State.ACTIVE)
          .build())
      println(account)
      account.validate()
    }

    @Test
    fun callList() {
      val client = LithicOkHttpClient.builder()
          .baseUrl("http://127.0.0.1:4010")
          .apiKey("test-api-key")
          .build()
      val accountService = client.accounts()
      val response = accountService.list(AccountListParams.builder().build())
      println(response)
      response.data().forEach {
          it.validate()
      }
    }
}
