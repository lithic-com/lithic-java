package com.lithic.api.services.blocking

import java.util.Optional
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.services.blocking.FundingSourceService
import com.lithic.api.models.FundingSourceListPage
import com.lithic.api.models.FundingSourceListParams
import com.lithic.api.models.*

class FundingSourceServiceTest {

    @Test
    fun callCreate() {
      val client = LithicOkHttpClient.builder()
          .baseUrl("http://127.0.0.1:4010")
          .apiKey("test-api-key")
          .build()
      val fundingSourceService = client.fundingSources()
      val fundingSource = fundingSourceService.create(FundingSourceCreateParams.builder()
          .forBank(FundingSourceCreateParams.Bank.builder()
              .validationMethod(FundingSourceCreateParams.Bank.ValidationMethod.BANK)
              .accountName("Sandbox")
              .accountNumber("13719713158835300")
              .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .routingNumber("011103093")
              .build())
          .build())
      println(fundingSource)
      fundingSource.validate()
    }

    @Test
    fun callUpdate() {
      val client = LithicOkHttpClient.builder()
          .baseUrl("http://127.0.0.1:4010")
          .apiKey("test-api-key")
          .build()
      val fundingSourceService = client.fundingSources()
      val fundingSource = fundingSourceService.update(FundingSourceUpdateParams.builder()
          .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .state(FundingSourceUpdateParams.State.DELETED)
          .build())
      println(fundingSource)
      fundingSource.validate()
    }

    @Test
    fun callList() {
      val client = LithicOkHttpClient.builder()
          .baseUrl("http://127.0.0.1:4010")
          .apiKey("test-api-key")
          .build()
      val fundingSourceService = client.fundingSources()
      val response = fundingSourceService.list(FundingSourceListParams.builder().build())
      println(response)
      response.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callVerify() {
      val client = LithicOkHttpClient.builder()
          .baseUrl("http://127.0.0.1:4010")
          .apiKey("test-api-key")
          .build()
      val fundingSourceService = client.fundingSources()
      val fundingSource = fundingSourceService.verify(FundingSourceVerifyParams.builder()
          .fundingSourceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .microDeposits(listOf(123L))
          .build())
      println(fundingSource)
      fundingSource.validate()
    }
}
