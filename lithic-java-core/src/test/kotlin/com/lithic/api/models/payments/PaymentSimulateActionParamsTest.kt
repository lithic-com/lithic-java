// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentSimulateActionParamsTest {

    @Test
    fun create() {
        PaymentSimulateActionParams.builder()
            .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .eventType(
                PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
            )
            .declineReason(
                PaymentSimulateActionParams.SupportedSimulationDeclineReasons
                    .PROGRAM_TRANSACTION_LIMIT_EXCEEDED
            )
            .returnReasonCode("return_reason_code")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentSimulateActionParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(
                    PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PaymentSimulateActionParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(
                    PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
                )
                .declineReason(
                    PaymentSimulateActionParams.SupportedSimulationDeclineReasons
                        .PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                )
                .returnReasonCode("return_reason_code")
                .build()

        val body = params._body()

        assertThat(body.eventType())
            .isEqualTo(
                PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
            )
        assertThat(body.declineReason())
            .contains(
                PaymentSimulateActionParams.SupportedSimulationDeclineReasons
                    .PROGRAM_TRANSACTION_LIMIT_EXCEEDED
            )
        assertThat(body.returnReasonCode()).contains("return_reason_code")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentSimulateActionParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(
                    PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
                )
                .build()

        val body = params._body()

        assertThat(body.eventType())
            .isEqualTo(
                PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
            )
    }
}
