// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalPaymentServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()

        val externalPayment =
            externalPaymentService.create(
                ExternalPaymentCreateParams.builder()
                    .amount(0L)
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

        externalPayment.validate()
    }

    @Test
    fun retrieve() {
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

        externalPayment.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentService = client.externalPayments()

        val page = externalPaymentService.list()

        page.response().validate()
    }

    @Test
    fun cancel() {
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

        externalPayment.validate()
    }

    @Test
    fun release() {
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

        externalPayment.validate()
    }

    @Test
    fun reverse() {
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

        externalPayment.validate()
    }

    @Test
    fun settle() {
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

        externalPayment.validate()
    }
}
