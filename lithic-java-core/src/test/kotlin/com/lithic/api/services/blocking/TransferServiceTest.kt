package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import java.time.OffsetDateTime
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
                    .from(
                        FinancialAccount.builder()
                            .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .type(FinancialAccount.Type.ISSUING)
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .accountNumber("string")
                            .routingNumber("string")
                            .build()
                    )
                    .to(
                        FinancialAccount.builder()
                            .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .type(FinancialAccount.Type.ISSUING)
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .accountNumber("string")
                            .routingNumber("string")
                            .build()
                    )
                    .memo("string")
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(transferCreateResponse)
        transferCreateResponse.validate()
    }
}
