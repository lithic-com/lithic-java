// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.disputes.DisputeCreateParams
import com.lithic.api.models.disputes.DisputeDeleteEvidenceParams
import com.lithic.api.models.disputes.DisputeDeleteParams
import com.lithic.api.models.disputes.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.disputes.DisputeListEvidencesParams
import com.lithic.api.models.disputes.DisputeRetrieveEvidenceParams
import com.lithic.api.models.disputes.DisputeRetrieveParams
import com.lithic.api.models.disputes.DisputeUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DisputeServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeFuture =
            disputeServiceAsync.create(
                DisputeCreateParams.builder()
                    .amount(10000L)
                    .reason(DisputeCreateParams.Reason.ATM_CASH_MISDISPENSE)
                    .transactionToken("12345624-aa69-4cbc-a946-30d90181b621")
                    .customerFiledDate(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                    .customerNote("customer_note")
                    .build()
            )

        val dispute = disputeFuture.get()
        dispute.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeFuture =
            disputeServiceAsync.retrieve(
                DisputeRetrieveParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val dispute = disputeFuture.get()
        dispute.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeFuture =
            disputeServiceAsync.update(
                DisputeUpdateParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerNote("customer_note")
                    .reason(DisputeUpdateParams.Reason.ATM_CASH_MISDISPENSE)
                    .build()
            )

        val dispute = disputeFuture.get()
        dispute.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val pageFuture = disputeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeFuture =
            disputeServiceAsync.delete(
                DisputeDeleteParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val dispute = disputeFuture.get()
        dispute.validate()
    }

    @Test
    fun deleteEvidence() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeEvidenceFuture =
            disputeServiceAsync.deleteEvidence(
                DisputeDeleteEvidenceParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val disputeEvidence = disputeEvidenceFuture.get()
        disputeEvidence.validate()
    }

    @Test
    fun initiateEvidenceUpload() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeEvidenceFuture =
            disputeServiceAsync.initiateEvidenceUpload(
                DisputeInitiateEvidenceUploadParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filename("filename")
                    .build()
            )

        val disputeEvidence = disputeEvidenceFuture.get()
        disputeEvidence.validate()
    }

    @Test
    fun listEvidences() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val pageFuture =
            disputeServiceAsync.listEvidences(
                DisputeListEvidencesParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun retrieveEvidence() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeEvidenceFuture =
            disputeServiceAsync.retrieveEvidence(
                DisputeRetrieveEvidenceParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val disputeEvidence = disputeEvidenceFuture.get()
        disputeEvidence.validate()
    }
}
