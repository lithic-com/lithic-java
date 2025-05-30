// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardProvisionParamsTest {

    @Test
    fun create() {
        CardProvisionParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .certificate("U3RhaW5sZXNzIHJvY2tz")
            .clientDeviceId("client_device_id")
            .clientWalletAccountId("client_wallet_account_id")
            .digitalWallet(CardProvisionParams.DigitalWallet.GOOGLE_PAY)
            .nonce("U3RhaW5sZXNzIHJvY2tz")
            .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardProvisionParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardProvisionParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .certificate("U3RhaW5sZXNzIHJvY2tz")
                .clientDeviceId("client_device_id")
                .clientWalletAccountId("client_wallet_account_id")
                .digitalWallet(CardProvisionParams.DigitalWallet.GOOGLE_PAY)
                .nonce("U3RhaW5sZXNzIHJvY2tz")
                .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val body = params._body()

        assertThat(body.certificate()).contains("U3RhaW5sZXNzIHJvY2tz")
        assertThat(body.clientDeviceId()).contains("client_device_id")
        assertThat(body.clientWalletAccountId()).contains("client_wallet_account_id")
        assertThat(body.digitalWallet()).contains(CardProvisionParams.DigitalWallet.GOOGLE_PAY)
        assertThat(body.nonce()).contains("U3RhaW5sZXNzIHJvY2tz")
        assertThat(body.nonceSignature()).contains("U3RhaW5sZXNzIHJvY2tz")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardProvisionParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
