package com.lithic.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.lithic.api.TestServerExtension
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.services.blocking.DisputeService
import com.lithic.api.models.DisputeListPage
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeListEvidencesPage
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.*

@ExtendWith(TestServerExtension::class)
class DisputeServiceTest {

    @Test
    fun callCreate() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val dispute = disputeService.create(DisputeCreateParams.builder()
          .amount(123L)
          .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
          .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .customerNote("string")
          .build())
      println(dispute)
      dispute.validate()
    }

    @Test
    fun callRetrieve() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val dispute = disputeService.retrieve(DisputeRetrieveParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
      println(dispute)
      dispute.validate()
    }

    @Test
    fun callUpdate() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val dispute = disputeService.update(DisputeUpdateParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .amount(123L)
          .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerNote("string")
          .reason(DisputeUpdateParams.Reason.ATM_CASH_MISDISPENSE)
          .build())
      println(dispute)
      dispute.validate()
    }

    @Test
    fun callList() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val response = disputeService.list(DisputeListParams.builder().build())
      println(response)
      response.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callDelete() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val dispute = disputeService.delete(DisputeDeleteParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
      println(dispute)
      dispute.validate()
    }

    @Test
    fun callDeleteEvidence() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val disputeEvidence = disputeService.deleteEvidence(DisputeDeleteEvidenceParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
      println(disputeEvidence)
      disputeEvidence.validate()
    }

    @Test
    fun callInitiateEvidenceUpload() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val disputeInitiateEvidenceUploadResponse = disputeService.initiateEvidenceUpload(DisputeInitiateEvidenceUploadParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
      println(disputeInitiateEvidenceUploadResponse)
      disputeInitiateEvidenceUploadResponse.validate()
    }

    @Test
    fun callListEvidences() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val response = disputeService.listEvidences(DisputeListEvidencesParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
      println(response)
      response.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callRetrieveEvidence() {
      val client = LithicOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .webhookSecret("string")
          .build()
      val disputeService = client.disputes()
      val disputeEvidence = disputeService.retrieveEvidence(DisputeRetrieveEvidenceParams.builder()
          .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
      println(disputeEvidence)
      disputeEvidence.validate()
    }
}
