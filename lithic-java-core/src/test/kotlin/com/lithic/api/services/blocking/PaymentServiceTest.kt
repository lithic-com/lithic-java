// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentReturnParams
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReturnParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val payment =
            paymentService.create(
                PaymentCreateParams.builder()
                    .amount(1L)
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                    .methodAttributes(
                        PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                            .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                            .addenda("addenda")
                            .build()
                    )
                    .type(PaymentCreateParams.Type.COLLECTION)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .userDefinedId("user_defined_id")
                    .build()
            )

        payment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val payment = paymentService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        payment.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val page = paymentService.list()

        page.response().validate()
    }

    @Test
    fun retry() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val response = paymentService.retry("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Test
    fun return_() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val payment =
            paymentService.return_(
                PaymentReturnParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnReasonCode("R01")
                    .addenda("addenda")
                    .dateOfDeath(LocalDate.parse("2025-01-15"))
                    .memo("memo")
                    .build()
            )

        payment.validate()
    }

    @Test
    fun simulateAction() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val response =
            paymentService.simulateAction(
                PaymentSimulateActionParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType(
                        PaymentSimulateActionParams.SupportedSimulationTypes
                            .ACH_ORIGINATION_REVIEWED
                    )
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .declineReason(
                        PaymentSimulateActionParams.SupportedSimulationDeclineReasons
                            .PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    )
                    .returnAddenda("return_addenda")
                    .returnReasonCode("return_reason_code")
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateReceipt() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val response =
            paymentService.simulateReceipt(
                PaymentSimulateReceiptParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
                    .memo("memo")
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateRelease() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val response =
            paymentService.simulateRelease(
                PaymentSimulateReleaseParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Test
    fun simulateReturn() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentService = client.payments()

        val response =
            paymentService.simulateReturn(
                PaymentSimulateReturnParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnReasonCode("R12")
                    .build()
            )

        response.validate()
    }
}
