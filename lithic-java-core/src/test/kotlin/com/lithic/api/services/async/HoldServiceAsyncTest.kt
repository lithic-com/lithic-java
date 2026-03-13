// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.HoldCreateParams
import com.lithic.api.models.HoldVoidParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HoldServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val holdFuture =
            holdServiceAsync.create(
                HoldCreateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(1L)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expirationDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .memo("memo")
                    .userDefinedId("user_defined_id")
                    .build()
            )

        val hold = holdFuture.get()
        hold.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val holdFuture = holdServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val hold = holdFuture.get()
        hold.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val pageFuture = holdServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun void_() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val holdFuture =
            holdServiceAsync.void_(
                HoldVoidParams.builder()
                    .holdToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        val hold = holdFuture.get()
        hold.validate()
    }
}
