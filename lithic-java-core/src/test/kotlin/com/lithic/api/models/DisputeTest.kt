// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeTest {

    @Test
    fun create() {
        val dispute =
            Dispute.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .caseId("case_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .disposition(Dispute.Disposition.WON)
                .addEvent(
                    Dispute.Event.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .data(
                            Dispute.Event.Data.WorkflowEventData.builder()
                                .action(Dispute.Event.Data.WorkflowEventData.Action.OPENED)
                                .amount(0L)
                                .disposition(Dispute.Event.Data.WorkflowEventData.Disposition.WON)
                                .reason("reason")
                                .stage(Dispute.Event.Data.WorkflowEventData.Stage.CLAIM)
                                .build()
                        )
                        .type(Dispute.Event.Type.WORKFLOW)
                        .build()
                )
                .liabilityAllocation(
                    Dispute.LiabilityAllocation.builder()
                        .deniedAmount(0L)
                        .originalAmount(0L)
                        .recoveredAmount(0L)
                        .remainingAmount(0L)
                        .writtenOffAmount(0L)
                        .build()
                )
                .merchant(
                    Dispute.Merchant.builder()
                        .acceptorId("333301802529120")
                        .acquiringInstitutionId("191231")
                        .city("NEW YORK")
                        .country("USA")
                        .descriptor("COFFEE SHOP")
                        .mcc("5812")
                        .state("NY")
                        .build()
                )
                .network(Dispute.Network.VISA)
                .status(Dispute.Status.OPEN)
                .transactionSeries(
                    Dispute.TransactionSeries.builder()
                        .relatedTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .relatedTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(Dispute.TransactionSeries.Type.DISPUTE)
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(dispute.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dispute.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dispute.cardToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dispute.caseId()).contains("case_id")
        assertThat(dispute.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.currency()).isEqualTo("USD")
        assertThat(dispute.disposition()).contains(Dispute.Disposition.WON)
        assertThat(dispute.events())
            .containsExactly(
                Dispute.Event.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .data(
                        Dispute.Event.Data.WorkflowEventData.builder()
                            .action(Dispute.Event.Data.WorkflowEventData.Action.OPENED)
                            .amount(0L)
                            .disposition(Dispute.Event.Data.WorkflowEventData.Disposition.WON)
                            .reason("reason")
                            .stage(Dispute.Event.Data.WorkflowEventData.Stage.CLAIM)
                            .build()
                    )
                    .type(Dispute.Event.Type.WORKFLOW)
                    .build()
            )
        assertThat(dispute.liabilityAllocation())
            .isEqualTo(
                Dispute.LiabilityAllocation.builder()
                    .deniedAmount(0L)
                    .originalAmount(0L)
                    .recoveredAmount(0L)
                    .remainingAmount(0L)
                    .writtenOffAmount(0L)
                    .build()
            )
        assertThat(dispute.merchant())
            .isEqualTo(
                Dispute.Merchant.builder()
                    .acceptorId("333301802529120")
                    .acquiringInstitutionId("191231")
                    .city("NEW YORK")
                    .country("USA")
                    .descriptor("COFFEE SHOP")
                    .mcc("5812")
                    .state("NY")
                    .build()
            )
        assertThat(dispute.network()).isEqualTo(Dispute.Network.VISA)
        assertThat(dispute.status()).contains(Dispute.Status.OPEN)
        assertThat(dispute.transactionSeries())
            .contains(
                Dispute.TransactionSeries.builder()
                    .relatedTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .relatedTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(Dispute.TransactionSeries.Type.DISPUTE)
                    .build()
            )
        assertThat(dispute.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dispute =
            Dispute.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .caseId("case_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .disposition(Dispute.Disposition.WON)
                .addEvent(
                    Dispute.Event.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .data(
                            Dispute.Event.Data.WorkflowEventData.builder()
                                .action(Dispute.Event.Data.WorkflowEventData.Action.OPENED)
                                .amount(0L)
                                .disposition(Dispute.Event.Data.WorkflowEventData.Disposition.WON)
                                .reason("reason")
                                .stage(Dispute.Event.Data.WorkflowEventData.Stage.CLAIM)
                                .build()
                        )
                        .type(Dispute.Event.Type.WORKFLOW)
                        .build()
                )
                .liabilityAllocation(
                    Dispute.LiabilityAllocation.builder()
                        .deniedAmount(0L)
                        .originalAmount(0L)
                        .recoveredAmount(0L)
                        .remainingAmount(0L)
                        .writtenOffAmount(0L)
                        .build()
                )
                .merchant(
                    Dispute.Merchant.builder()
                        .acceptorId("333301802529120")
                        .acquiringInstitutionId("191231")
                        .city("NEW YORK")
                        .country("USA")
                        .descriptor("COFFEE SHOP")
                        .mcc("5812")
                        .state("NY")
                        .build()
                )
                .network(Dispute.Network.VISA)
                .status(Dispute.Status.OPEN)
                .transactionSeries(
                    Dispute.TransactionSeries.builder()
                        .relatedTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .relatedTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(Dispute.TransactionSeries.Type.DISPUTE)
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDispute =
            jsonMapper.readValue(jsonMapper.writeValueAsString(dispute), jacksonTypeRef<Dispute>())

        assertThat(roundtrippedDispute).isEqualTo(dispute)
    }
}
