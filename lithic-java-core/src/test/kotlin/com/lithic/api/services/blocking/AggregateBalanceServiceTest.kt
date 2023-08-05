package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.AggregateBalanceListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AggregateBalanceServiceTest {

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val aggregateBalanceService = client.aggregateBalances()
        val response = aggregateBalanceService.list(AggregateBalanceListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }
}
