// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeTransactionUpdatedWebhookEventTest {

    @Test
    fun create() {
        val disputeTransactionUpdatedWebhookEvent =
            DisputeTransactionUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .caseId("case_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .disposition(DisputeV2.Disposition.WON)
                .addEvent(
                    DisputeV2.Event.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .data(
                            DisputeV2.Event.Data.WorkflowEventData.builder()
                                .action(DisputeV2.Event.Data.WorkflowEventData.Action.OPENED)
                                .amount(0L)
                                .disposition(DisputeV2.Event.Data.WorkflowEventData.Disposition.WON)
                                .reason("reason")
                                .stage(DisputeV2.Event.Data.WorkflowEventData.Stage.CLAIM)
                                .type(DisputeV2.Event.Data.WorkflowEventData.Type.WORKFLOW)
                                .build()
                        )
                        .type(DisputeV2.Event.Type.WORKFLOW)
                        .build()
                )
                .liabilityAllocation(
                    DisputeV2.LiabilityAllocation.builder()
                        .deniedAmount(0L)
                        .originalAmount(0L)
                        .recoveredAmount(0L)
                        .remainingAmount(0L)
                        .writtenOffAmount(0L)
                        .build()
                )
                .merchant(
                    Merchant.builder()
                        .acceptorId("333301802529120")
                        .acquiringInstitutionId("191231")
                        .city("NEW YORK")
                        .country("USA")
                        .descriptor("COFFEE SHOP")
                        .mcc("5812")
                        .state("NY")
                        .build()
                )
                .network(DisputeV2.Network.VISA)
                .status(DisputeV2.Status.OPEN)
                .transactionSeries(
                    DisputeV2.TransactionSeries.builder()
                        .relatedTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .relatedTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(DisputeV2.TransactionSeries.Type.DISPUTE)
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(
                    DisputeTransactionUpdatedWebhookEvent.EventType.DISPUTE_TRANSACTION_UPDATED
                )
                .build()

        assertThat(disputeTransactionUpdatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeTransactionUpdatedWebhookEvent.accountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeTransactionUpdatedWebhookEvent.cardToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeTransactionUpdatedWebhookEvent.caseId()).contains("case_id")
        assertThat(disputeTransactionUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeTransactionUpdatedWebhookEvent.currency()).isEqualTo("USD")
        assertThat(disputeTransactionUpdatedWebhookEvent.disposition())
            .contains(DisputeV2.Disposition.WON)
        assertThat(disputeTransactionUpdatedWebhookEvent.events())
            .containsExactly(
                DisputeV2.Event.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .data(
                        DisputeV2.Event.Data.WorkflowEventData.builder()
                            .action(DisputeV2.Event.Data.WorkflowEventData.Action.OPENED)
                            .amount(0L)
                            .disposition(DisputeV2.Event.Data.WorkflowEventData.Disposition.WON)
                            .reason("reason")
                            .stage(DisputeV2.Event.Data.WorkflowEventData.Stage.CLAIM)
                            .type(DisputeV2.Event.Data.WorkflowEventData.Type.WORKFLOW)
                            .build()
                    )
                    .type(DisputeV2.Event.Type.WORKFLOW)
                    .build()
            )
        assertThat(disputeTransactionUpdatedWebhookEvent.liabilityAllocation())
            .isEqualTo(
                DisputeV2.LiabilityAllocation.builder()
                    .deniedAmount(0L)
                    .originalAmount(0L)
                    .recoveredAmount(0L)
                    .remainingAmount(0L)
                    .writtenOffAmount(0L)
                    .build()
            )
        assertThat(disputeTransactionUpdatedWebhookEvent.merchant())
            .isEqualTo(
                Merchant.builder()
                    .acceptorId("333301802529120")
                    .acquiringInstitutionId("191231")
                    .city("NEW YORK")
                    .country("USA")
                    .descriptor("COFFEE SHOP")
                    .mcc("5812")
                    .state("NY")
                    .build()
            )
        assertThat(disputeTransactionUpdatedWebhookEvent.network())
            .isEqualTo(DisputeV2.Network.VISA)
        assertThat(disputeTransactionUpdatedWebhookEvent.status()).contains(DisputeV2.Status.OPEN)
        assertThat(disputeTransactionUpdatedWebhookEvent.transactionSeries())
            .contains(
                DisputeV2.TransactionSeries.builder()
                    .relatedTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .relatedTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(DisputeV2.TransactionSeries.Type.DISPUTE)
                    .build()
            )
        assertThat(disputeTransactionUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeTransactionUpdatedWebhookEvent.eventType())
            .isEqualTo(DisputeTransactionUpdatedWebhookEvent.EventType.DISPUTE_TRANSACTION_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeTransactionUpdatedWebhookEvent =
            DisputeTransactionUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .caseId("case_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .disposition(DisputeV2.Disposition.WON)
                .addEvent(
                    DisputeV2.Event.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .data(
                            DisputeV2.Event.Data.WorkflowEventData.builder()
                                .action(DisputeV2.Event.Data.WorkflowEventData.Action.OPENED)
                                .amount(0L)
                                .disposition(DisputeV2.Event.Data.WorkflowEventData.Disposition.WON)
                                .reason("reason")
                                .stage(DisputeV2.Event.Data.WorkflowEventData.Stage.CLAIM)
                                .type(DisputeV2.Event.Data.WorkflowEventData.Type.WORKFLOW)
                                .build()
                        )
                        .type(DisputeV2.Event.Type.WORKFLOW)
                        .build()
                )
                .liabilityAllocation(
                    DisputeV2.LiabilityAllocation.builder()
                        .deniedAmount(0L)
                        .originalAmount(0L)
                        .recoveredAmount(0L)
                        .remainingAmount(0L)
                        .writtenOffAmount(0L)
                        .build()
                )
                .merchant(
                    Merchant.builder()
                        .acceptorId("333301802529120")
                        .acquiringInstitutionId("191231")
                        .city("NEW YORK")
                        .country("USA")
                        .descriptor("COFFEE SHOP")
                        .mcc("5812")
                        .state("NY")
                        .build()
                )
                .network(DisputeV2.Network.VISA)
                .status(DisputeV2.Status.OPEN)
                .transactionSeries(
                    DisputeV2.TransactionSeries.builder()
                        .relatedTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .relatedTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(DisputeV2.TransactionSeries.Type.DISPUTE)
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(
                    DisputeTransactionUpdatedWebhookEvent.EventType.DISPUTE_TRANSACTION_UPDATED
                )
                .build()

        val roundtrippedDisputeTransactionUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeTransactionUpdatedWebhookEvent),
                jacksonTypeRef<DisputeTransactionUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeTransactionUpdatedWebhookEvent)
            .isEqualTo(disputeTransactionUpdatedWebhookEvent)
    }
}
