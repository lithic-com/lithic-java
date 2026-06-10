// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class QueueServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val queueFuture =
            queueServiceAsync.create(
                TransactionMonitoringQueueCreateParams.builder()
                    .name("name")
                    .description("description")
                    .build()
            )

        val queue = queueFuture.get()
        queue.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val queueFuture = queueServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val queue = queueFuture.get()
        queue.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val queueFuture =
            queueServiceAsync.update(
                TransactionMonitoringQueueUpdateParams.builder()
                    .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .build()
            )

        val queue = queueFuture.get()
        queue.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val pageFuture = queueServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val future = queueServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
