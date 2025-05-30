// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransferServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transferService = client.transfers()

        val transfer =
            transferService.create(
                TransferCreateParams.builder()
                    .amount(0L)
                    .from("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .to("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        transfer.validate()
    }
}
