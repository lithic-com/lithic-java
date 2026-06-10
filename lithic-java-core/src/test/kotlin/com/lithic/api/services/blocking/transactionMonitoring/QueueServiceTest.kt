// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class QueueServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueService = client.transactionMonitoring().queues()

        val queue =
            queueService.create(
                TransactionMonitoringQueueCreateParams.builder()
                    .name("name")
                    .description("description")
                    .build()
            )

        queue.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueService = client.transactionMonitoring().queues()

        val queue = queueService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        queue.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueService = client.transactionMonitoring().queues()

        val queue =
            queueService.update(
                TransactionMonitoringQueueUpdateParams.builder()
                    .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .build()
            )

        queue.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueService = client.transactionMonitoring().queues()

        val page = queueService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueService = client.transactionMonitoring().queues()

        queueService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
