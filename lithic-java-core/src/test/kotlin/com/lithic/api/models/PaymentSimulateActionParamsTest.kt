// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentSimulateActionParamsTest {

    @Test
    fun createPaymentSimulateActionParams() {
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
    fun getBody() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventType())
            .isEqualTo(
                PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
            )
        assertThat(body.declineReason())
            .isEqualTo(
                PaymentSimulateActionParams.SupportedSimulationDeclineReasons
                    .PROGRAM_TRANSACTION_LIMIT_EXCEEDED
            )
        assertThat(body.returnReasonCode()).isEqualTo("return_reason_code")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentSimulateActionParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(
                    PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventType())
            .isEqualTo(
                PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
            )
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentSimulateActionParams.builder()
                .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(
                    PaymentSimulateActionParams.SupportedSimulationTypes.ACH_ORIGINATION_REVIEWED
                )
                .build()
        assertThat(params).isNotNull
        // path param "paymentToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
