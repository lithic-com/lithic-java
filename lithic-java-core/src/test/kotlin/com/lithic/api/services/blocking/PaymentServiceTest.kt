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
                .build()
        val paymentService = client.payments()
        val paymentCreateResponse =
            paymentService.create(
                PaymentCreateParams.builder()
                    .amount(123L)
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                    .methodAttributes(
                        PaymentCreateParams.PaymentMethodAttributes.builder()
                            .secCode(PaymentCreateParams.PaymentMethodAttributes.SecCode.PPD)
                            .build()
                    )
                    .type(PaymentCreateParams.Type.PAYMENT)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("string")
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
