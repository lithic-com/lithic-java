// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
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
internal class ExternalPaymentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPaymentFuture =
            externalPaymentServiceAsync.create(
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

        val externalPayment = externalPaymentFuture.get()
        externalPayment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPaymentFuture =
            externalPaymentServiceAsync.retrieve(
                ExternalPaymentRetrieveParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val externalPayment = externalPaymentFuture.get()
        externalPayment.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val pageFuture = externalPaymentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPaymentFuture =
            externalPaymentServiceAsync.cancel(
                ExternalPaymentCancelParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )

        val externalPayment = externalPaymentFuture.get()
        externalPayment.validate()
    }

    @Test
    fun release() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPaymentFuture =
            externalPaymentServiceAsync.release(
                ExternalPaymentReleaseParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )

        val externalPayment = externalPaymentFuture.get()
        externalPayment.validate()
    }

    @Test
    fun reverse() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPaymentFuture =
            externalPaymentServiceAsync.reverse(
                ExternalPaymentReverseParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )

        val externalPayment = externalPaymentFuture.get()
        externalPayment.validate()
    }

    @Test
    fun settle() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPaymentFuture =
            externalPaymentServiceAsync.settle(
                ExternalPaymentSettleParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .progressTo(ExternalPaymentSettleParams.ExternalPaymentProgressTo.SETTLED)
                    .build()
            )

        val externalPayment = externalPaymentFuture.get()
        externalPayment.validate()
    }
}
