// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.BlockchainRecipientCreateParams
import com.lithic.api.models.OwnerType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BlockchainRecipientServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val blockchainRecipientServiceAsync = client.blockchainRecipients()

        val blockchainRecipientFuture =
            blockchainRecipientServiceAsync.create(
                BlockchainRecipientCreateParams.builder()
                    .accountToken("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
                    .address("0x45bfcf1a6289a0b77b4d3f7d12005a05949fd8c3")
                    .chain("ETHEREUM")
                    .owner("John Doe")
                    .ownerType(OwnerType.INDIVIDUAL)
                    .addressTag("address_tag")
                    .name("Cold wallet")
                    .build()
            )

        val blockchainRecipient = blockchainRecipientFuture.get()
        blockchainRecipient.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val blockchainRecipientServiceAsync = client.blockchainRecipients()

        val blockchainRecipientFuture =
            blockchainRecipientServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val blockchainRecipient = blockchainRecipientFuture.get()
        blockchainRecipient.validate()
    }
}
