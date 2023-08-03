package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.PaymentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val paymentService = client.payments()
        val paymentCreateResponse =
            paymentService.create(
                PaymentCreateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(PaymentCreateParams.Type.PAYMENT)
                    .amount(123L)
                    .memo("string")
                    .methodAttributes(
                        PaymentCreateParams.PaymentMethodAttributes.builder()
                            .secCode(PaymentCreateParams.PaymentMethodAttributes.SecCode.PPD)
                            .build()
                    )
                    .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userDefinedId("string")
                    .build()
            )
        println(paymentCreateResponse)
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val paymentService = client.payments()
        val payment =
            paymentService.retrieve(
                PaymentRetrieveParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(payment)
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val paymentService = client.payments()
        val response = paymentService.list(PaymentListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callSimulateRelease() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
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
}
