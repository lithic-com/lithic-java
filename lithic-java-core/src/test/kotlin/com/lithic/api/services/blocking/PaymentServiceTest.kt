// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val paymentCreateResponse =
            paymentService.create(
                PaymentCreateParams.builder()
                    .amount(1L)
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                    .methodAttributes(
                        PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                            .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                            .build()
                    )
                    .type(PaymentCreateParams.Type.COLLECTION)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .userDefinedId("user_defined_id")
                    .build()
            )
        println(paymentCreateResponse)
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val payment =
            paymentService.retrieve(
                PaymentRetrieveParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(payment)
        payment.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val response = paymentService.list(PaymentListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callRetry() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val paymentRetryResponse =
            paymentService.retry(
                PaymentRetryParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(paymentRetryResponse)
    }

    @Test
    fun callSimulateAction() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val paymentSimulateActionResponse =
            paymentService.simulateAction(
                PaymentSimulateActionParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType(
                        PaymentSimulateActionParams.SupportedSimulationTypes
                            .ACH_ORIGINATION_REVIEWED
                    )
                    .declineReason(
                        PaymentSimulateActionParams.SupportedSimulationDeclineReasons
                            .PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    )
                    .returnReasonCode("return_reason_code")
                    .build()
            )
        println(paymentSimulateActionResponse)
        paymentSimulateActionResponse.validate()
    }

    @Test
    fun callSimulateReceipt() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val paymentSimulateReceiptResponse =
            paymentService.simulateReceipt(
                PaymentSimulateReceiptParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
                    .memo("memo")
                    .build()
            )
        println(paymentSimulateReceiptResponse)
        paymentSimulateReceiptResponse.validate()
    }

    @Test
    fun callSimulateRelease() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val paymentSimulateReleaseResponse =
            paymentService.simulateRelease(
                PaymentSimulateReleaseParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(paymentSimulateReleaseResponse)
        paymentSimulateReleaseResponse.validate()
    }

    @Test
    fun callSimulateReturn() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()
        val paymentSimulateReturnResponse =
            paymentService.simulateReturn(
                PaymentSimulateReturnParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnReasonCode("R12")
                    .build()
            )
        println(paymentSimulateReturnResponse)
        paymentSimulateReturnResponse.validate()
    }
}
