package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val transferService = client.transfers()
        val transferCreateResponse =
            transferService.create(
                TransferCreateParams.builder()
                    .amount(123L)
                    .from("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .to("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("string")
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(transferCreateResponse)
        transferCreateResponse.validate()
    }
}
