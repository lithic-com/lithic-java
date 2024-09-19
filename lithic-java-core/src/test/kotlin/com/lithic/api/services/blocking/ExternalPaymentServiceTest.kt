// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.ExternalPaymentListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalPaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()
        val externalPayment =
            externalPaymentService.create(
                ExternalPaymentCreateParams.builder()
                    .amount(123L)
                    .category(ExternalPaymentCreateParams.ExternalPaymentCategory.EXTERNAL_WIRE)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(ExternalPaymentCreateParams.ExternalPaymentDirection.DEPOSIT)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .progressTo(ExternalPaymentCreateParams.ExternalPaymentProgressTo.SETTLED)
                    .userDefinedId("user_defined_id")
                    .build()
            )
        println(externalPayment)
        externalPayment.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()
        val externalPayment =
            externalPaymentService.retrieve(
                ExternalPaymentRetrieveParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(externalPayment)
        externalPayment.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()
        val externalPaymentsResponse =
            externalPaymentService.list(ExternalPaymentListParams.builder().build())
        println(externalPaymentsResponse)
        externalPaymentsResponse.data().forEach { it.validate() }
    }

    @Test
    fun callCancel() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()
        val externalPayment =
            externalPaymentService.cancel(
                ExternalPaymentCancelParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )
        println(externalPayment)
        externalPayment.validate()
    }

    @Test
    fun callRelease() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()
        val externalPayment =
            externalPaymentService.release(
                ExternalPaymentReleaseParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )
        println(externalPayment)
        externalPayment.validate()
    }

    @Test
    fun callReverse() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()
        val externalPayment =
            externalPaymentService.reverse(
                ExternalPaymentReverseParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )
        println(externalPayment)
        externalPayment.validate()
    }

    @Test
    fun callSettle() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()
        val externalPayment =
            externalPaymentService.settle(
                ExternalPaymentSettleParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .progressTo(ExternalPaymentSettleParams.ExternalPaymentProgressTo.SETTLED)
                    .build()
            )
        println(externalPayment)
        externalPayment.validate()
    }
}
